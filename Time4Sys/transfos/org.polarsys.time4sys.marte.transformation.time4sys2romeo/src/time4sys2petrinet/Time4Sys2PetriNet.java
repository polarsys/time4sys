/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Thanh Dat NGUYEN - initial API and implementation
 * Aurelien DIDIER - connection to analysis repository 
 *******************************************************************************/
package time4sys2petrinet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.service.component.annotations.Component;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.common.CurrentAnalysisContext;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.AnalysisRepositoryControler;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.utils.WorkspaceUtils;
import org.polarsys.time4sys.marte.analysisrepository.tysco.util.AbstractExogenousTransformation;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.hrm.HardwareResource;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;
import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;
import org.polarsys.time4sys.marte.nfp.coreelements.PackageableElement;
import org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Time4sysPackage;

import petrinet.Connection;
import petrinet.PetriNet;
import petrinet.PetrinetFactory;
import petrinet.PetrinetPackage;
import petrinet.Place;
import petrinet.TimedInhibitorArc;
import petrinet.Transition;
import taskmodel.AbstractFragment;
import taskmodel.First_Release;
import taskmodel.Fragment;
import taskmodel.Jitter;
import taskmodel.MutualExclusionResource;
import taskmodel.Observer;
import taskmodel.Offset;
import taskmodel.Period;
import taskmodel.SharingResourceFragment;
import taskmodel.Stimulus;
import taskmodel.System;
import taskmodel.Task;
import taskmodel.TaskmodelFactory;
import taskmodel.TaskmodelPackage;

@Component
public class Time4Sys2PetriNet implements AbstractExogenousTransformation {

	private static PetrinetFactory petriNetFactory;

	private static TaskmodelFactory taskModelFactory;

	private static int placeIdGenerator = 1;
	private static int transitionIdGenerator = 1;

	public static Time4Sys2PetriNet time4sys2petrinet = new Time4Sys2PetriNet();

	/**
	 * Constructor
	 */
	public Time4Sys2PetriNet() {
		setup();
	}

	/**
	 * set up
	 */
	private static void setup() {
		PetrinetPackage.eINSTANCE.eClass();
		TaskmodelPackage.eINSTANCE.eClass();
		taskModelFactory = TaskmodelFactory.eINSTANCE;
		petriNetFactory = PetrinetFactory.eINSTANCE;
		placeIdGenerator = 1;
		transitionIdGenerator = 1;
	}

	/**
	 * Get all software schedulable resources
	 * 
	 * @param project
	 * @return
	 */
	private static List<SoftwareSchedulableResource> getAllSoftwareSchedulableResource(DesignModel design) {

		List<PackageableElement> allPackageableElements = design.getResourcePackage().getOwnedElement();
		List<HardwareResource> allHardwareResources = new ArrayList<HardwareResource>();

		for (PackageableElement packageableElement : allPackageableElements) {
			if (packageableElement instanceof HardwareResource) {
				allHardwareResources.add((HardwareResource) packageableElement);
			}
		}

		List<SoftwareSchedulableResource> allSchedulableResources = new ArrayList<SoftwareSchedulableResource>();
		List<org.polarsys.time4sys.marte.grm.Resource> allResources = new ArrayList<org.polarsys.time4sys.marte.grm.Resource>();
		for (HardwareResource hwResource : allHardwareResources) {
			allResources.addAll(hwResource.getOwnedResource());
		}

		for (org.polarsys.time4sys.marte.grm.Resource res : allResources) {
			if (res instanceof SoftwareSchedulableResource) {
				allSchedulableResources.add((SoftwareSchedulableResource) res);
			}
		}

		return allSchedulableResources;
	}

	/**
	 * Get all steps from project
	 * 
	 * @param project
	 * @return
	 */
	private static List<Step> getAllSteps(DesignModel design) {
		int size = design.getWorkloadBehavior().getBehavior().get(0).getSteps().size();

		List<Step> allSteps = new ArrayList<Step>();
		for (int i = 0; i < size; i++) {
			BehaviorScenario behaviorScenario = design.getWorkloadBehavior().getBehavior().get(0).getSteps().get(i);
			allSteps.add((Step) behaviorScenario);
		}

		return allSteps;
	}

	/**
	 * Transform from project to petri net
	 * 
	 * @param project
	 * @return
	 */
	public static System transform(DesignModel design) {

		setup();

		List<WorkloadEvent> allWorkloadEvents = getAllWorkloadEvents(design);
		System system = taskModelFactory.createSystem();

		List<SoftwareMutualExclusionResource> allMutex = getAllMutualExclusions(design);

		List<Step> allSteps = getAllSteps(design);

		// create tasks
		List<SoftwareSchedulableResource> allSchedulableResources = getAllSoftwareSchedulableResource(design);
		for (SoftwareSchedulableResource swSchedulableResource : allSchedulableResources) {
			Task task = createTask(swSchedulableResource, allWorkloadEvents, allSteps, allMutex);
			system.getOwnedTasks().add(task);
		}

		// create mutex
		for (SoftwareMutualExclusionResource mutex : allMutex) {
			MutualExclusionResource mutexResource = createMutex(mutex, system.getOwnedTasks());
			system.getOwnedMutualExclusionResources().add(mutexResource);
		}

		// create precedence relations
		for (SoftwareSchedulableResource swSchedulableResource : allSchedulableResources) {
			List<Step> allStepsOfResource = getAllStepsOfResource(swSchedulableResource, allSteps);
			for (Step step : allStepsOfResource) {
				List<Step> nextSteps = getNextSteps(step, allSteps);

				if (nextSteps != null) {
					for (Step nextStep : nextSteps) {
						if (nextStep.getConcurRes() != swSchedulableResource) {
							AbstractFragment currentAFragment = getFragmentFromStepName(system.getOwnedTasks(),
									step.getName());
							AbstractFragment nextAFragment = getFragmentFromStepName(system.getOwnedTasks(),
									nextStep.getName());
							if (currentAFragment instanceof Fragment && nextAFragment instanceof Fragment) {
								Fragment currentFragment = (Fragment) currentAFragment;
								Fragment nextFragment = (Fragment) nextAFragment;
								Transition currentTransition = currentFragment.getOwnedTransition();
								Place nextPlace = nextFragment.getOwnedPlace();
								Connection conn1 = petriNetFactory.createNormalArc();
								conn1.setSource(currentTransition);
								currentTransition.getOutputRel().add(conn1);
								conn1.setTarget(nextPlace);
								nextPlace.getInputRel().add(conn1);

								currentFragment.getConnections().add(conn1);
							} else if (currentAFragment instanceof Fragment
									&& nextAFragment instanceof SharingResourceFragment) {
								Fragment currentFragment = (Fragment) currentAFragment;
								SharingResourceFragment nextFragment = (SharingResourceFragment) nextAFragment;

								Transition currentTransition = currentFragment.getOwnedTransition();
								Place nextPlace = nextFragment.getFirstFragment().getOwnedPlace();

								Connection conn1 = petriNetFactory.createNormalArc();
								conn1.setSource(currentTransition);
								currentTransition.getOutputRel().add(conn1);
								conn1.setTarget(nextPlace);
								nextPlace.getInputRel().add(conn1);

								currentFragment.getConnections().add(conn1);
							} else if (currentAFragment instanceof SharingResourceFragment
									&& nextAFragment instanceof Fragment) {
								SharingResourceFragment currentFragment = (SharingResourceFragment) currentAFragment;
								Fragment nextFragment = (Fragment) nextAFragment;

								Transition currentTransition = currentFragment.getSecondFragment().getOwnedTransition();
								Place nextPlace = nextFragment.getOwnedPlace();

								Connection conn1 = petriNetFactory.createNormalArc();
								conn1.setSource(currentTransition);
								currentTransition.getOutputRel().add(conn1);
								conn1.setTarget(nextPlace);
								nextPlace.getInputRel().add(conn1);

								currentFragment.getConnections().add(conn1);
							} else if (currentAFragment instanceof SharingResourceFragment
									&& nextAFragment instanceof SharingResourceFragment) {
								SharingResourceFragment currentFragment = (SharingResourceFragment) currentAFragment;
								SharingResourceFragment nextFragment = (SharingResourceFragment) nextAFragment;

								Transition currentTransition = currentFragment.getSecondFragment().getOwnedTransition();
								Place nextPlace = nextFragment.getFirstFragment().getOwnedPlace();

								Connection conn1 = petriNetFactory.createNormalArc();
								conn1.setSource(currentTransition);
								currentTransition.getOutputRel().add(conn1);
								conn1.setTarget(nextPlace);
								nextPlace.getInputRel().add(conn1);

								currentFragment.getConnections().add(conn1);
							}
						}
					}
				}
			}
		}

		// create inhibitor arcs
		List<Fragment> allFragments = new ArrayList<Fragment>();
		List<SharingResourceFragment> allSharingResourceFragments = new ArrayList<SharingResourceFragment>();
		List<Task> allTasks = system.getOwnedTasks();

		for (Task task : allTasks) {
			allFragments.addAll(task.getFragments());
			allSharingResourceFragments.addAll(task.getSharingResourceFragments());
		}

		for (Fragment fragment : allFragments) {

			// find lower priority fragments
			List<Fragment> lowerPriorityFragments = new ArrayList<Fragment>();

			// java.lang.System.out.println("\nFragment:
			// "+fragment.getOwnedPlace().getName());

			for (Fragment frag : allFragments) {
				if (frag.getPriority() < fragment.getPriority() && notBelongToSameTask(fragment, frag)) {
					lowerPriorityFragments.add(frag);
				}
			}

			for (SharingResourceFragment srf : allSharingResourceFragments) {

				if (srf.getFirstFragment().getPriority() < fragment.getPriority()
						&& notBelongToSameTask(fragment, srf.getFirstFragment())) {
					lowerPriorityFragments.add(srf.getFirstFragment());
				}

				if (srf.getSecondFragment().getPriority() < fragment.getPriority()
						&& notBelongToSameTask(fragment, srf.getSecondFragment())) {
					lowerPriorityFragments.add(srf.getSecondFragment());
				}
			}

			// java.lang.System.out.println(fragment.getOwnedPlace().getName());
			// for (Fragment frag : lowerPriorityFragments) {
			// java.lang.System.out.println("lower priority fragment:
			// "+frag.getOwnedPlace().getName());
			// }

			// create inhibitor arcs
			for (Fragment frag : lowerPriorityFragments) {
				TimedInhibitorArc timedInhibitorArc = petriNetFactory.createTimedInhibitorArc();
				timedInhibitorArc.setSource(fragment.getOwnedPlace());
				fragment.getOwnedPlace().getOutputRel().add(timedInhibitorArc);
				timedInhibitorArc.setTarget(frag.getOwnedTransition());
				frag.getOwnedTransition().getInputRel().add(timedInhibitorArc);
				fragment.getConnections().add(timedInhibitorArc);

				// java.lang.System.out.println("Lower priority:
				// "+frag.getOwnedPlace().getName());
				// java.lang.System.out.println(" notBelongToSameTask:
				// "+notBelongToSameTask(fragment, frag));
				// java.lang.System.out.println(fragment.getTask());
				// java.lang.System.out.println(frag.getTask());
			}
		}

		for (SharingResourceFragment sharingResourceFragment : allSharingResourceFragments) {

			// find lower priority fragments than first fragment
			Fragment firstFragment = sharingResourceFragment.getFirstFragment();

			// java.lang.System.out.println("\nFragment:
			// "+firstFragment.getOwnedPlace().getName());

			List<Fragment> lowerPriorityThanFirstFragment = new ArrayList<Fragment>();

			for (Fragment frag : allFragments) {
				if (frag.getPriority() < firstFragment.getPriority() && notBelongToSameTask(frag, firstFragment)) {
					lowerPriorityThanFirstFragment.add(frag);
				}
			}

			for (SharingResourceFragment srf : allSharingResourceFragments) {
				if (srf != sharingResourceFragment) {

					Fragment firstFrag = srf.getFirstFragment();
					if (firstFrag.getPriority() < firstFragment.getPriority()
							&& notBelongToSameTask(firstFrag, firstFragment))
						lowerPriorityThanFirstFragment.add(firstFrag);

					Fragment secondFrag = srf.getSecondFragment();
					if (secondFrag.getPriority() < firstFragment.getPriority()
							&& notBelongToSameTask(secondFrag, firstFragment))
						lowerPriorityThanFirstFragment.add(secondFrag);

				}
			}

			// create inhibitor arcs
			for (Fragment frag : lowerPriorityThanFirstFragment) {
				TimedInhibitorArc timedInhibitorArc = petriNetFactory.createTimedInhibitorArc();
				timedInhibitorArc.setSource(firstFragment.getOwnedPlace());
				firstFragment.getOwnedPlace().getOutputRel().add(timedInhibitorArc);
				timedInhibitorArc.setTarget(frag.getOwnedTransition());
				frag.getOwnedTransition().getInputRel().add(timedInhibitorArc);
				sharingResourceFragment.getConnections().add(timedInhibitorArc);

				// java.lang.System.out.println("Lower priority:
				// "+frag.getOwnedPlace().getName());
				// java.lang.System.out.println(" notBelongToSameTask:
				// "+notBelongToSameTask(firstFragment, frag));
				// java.lang.System.out.println(firstFragment.getTask());
				// java.lang.System.out.println(frag.getTask());
			}

			// find lower priority fragments than second fragment
			Fragment secondFragment = sharingResourceFragment.getSecondFragment();

			// java.lang.System.out.println("\nFragment:
			// "+secondFragment.getOwnedPlace().getName());

			List<Fragment> lowerPriorityThanSecondFragment = new ArrayList<Fragment>();

			for (Fragment fragment : allFragments) {
				if (fragment.getPriority() < secondFragment.getPriority()
						&& notBelongToSameTask(fragment, secondFragment)) {
					lowerPriorityThanSecondFragment.add(fragment);
				}
			}

			for (SharingResourceFragment srf : allSharingResourceFragments) {
				if (srf != sharingResourceFragment) {

					Fragment firstFrag = srf.getFirstFragment();
					if (firstFrag.getPriority() < secondFragment.getPriority()
							&& notBelongToSameTask(firstFrag, secondFragment))
						lowerPriorityThanSecondFragment.add(firstFrag);

					Fragment secondFrag = srf.getSecondFragment();
					if (secondFrag.getPriority() < secondFragment.getPriority()
							&& notBelongToSameTask(secondFrag, secondFragment))
						lowerPriorityThanSecondFragment.add(secondFrag);

				}
			}

			// create inhibitor arcs
			for (Fragment frag : lowerPriorityThanSecondFragment) {
				TimedInhibitorArc timedInhibitorArc = petriNetFactory.createTimedInhibitorArc();
				timedInhibitorArc.setSource(secondFragment.getOwnedPlace());
				secondFragment.getOwnedPlace().getOutputRel().add(timedInhibitorArc);
				timedInhibitorArc.setTarget(frag.getOwnedTransition());
				frag.getOwnedTransition().getInputRel().add(timedInhibitorArc);
				sharingResourceFragment.getConnections().add(timedInhibitorArc);

				// java.lang.System.out.println("Lower priority:
				// "+frag.getOwnedPlace().getName());
				// java.lang.System.out.println(" notBelongToSameTask:
				// "+notBelongToSameTask(secondFragment, frag));
				// java.lang.System.out.println(secondFragment.getTask());
				// java.lang.System.out.println(frag.getTask());
			}
		}

		return system;
	}

	private static boolean notBelongToSameTask(Fragment fragment1, Fragment fragment2) {

		if (fragment1.getTask() != fragment2.getTask())
			return true;

		return false;
	}

	/**
	 * Create petri net mutual exclusion resource
	 * 
	 * @param mutex
	 * @param allTasks
	 * @return
	 */
	private static MutualExclusionResource createMutex(SoftwareMutualExclusionResource mutex, List<Task> allTasks) {

		MutualExclusionResource mutualExclusionResource = taskModelFactory.createMutualExclusionResource();

		Place mutexPlace = petriNetFactory.createPlace();
		String placeId = generatePlaceId();
		mutexPlace.setInitCount(1);
		mutexPlace.setName(mutex.getName() + "_place");
		mutexPlace.setId(placeId);

		mutualExclusionResource.setMutualExclusionResourcePlace(mutexPlace);

		List<ModelElement> accessingMutexElements = mutex.getAccessTokenElements();
		for (ModelElement step : accessingMutexElements) {

			SharingResourceFragment sharingResourceFragement = (SharingResourceFragment) getFragmentFromStepName(
					allTasks, ((Step) step).getName());

			// java.lang.System.out.println(sharingResourceFragement);

			Transition transition2 = sharingResourceFragement.getSecondFragment().getOwnedTransition();
			Connection conn1 = petriNetFactory.createNormalArc();
			conn1.setSource(transition2);
			transition2.getOutputRel().add(conn1);
			conn1.setTarget(mutexPlace);
			mutexPlace.getInputRel().add(conn1);

			Transition transition1 = sharingResourceFragement.getFirstFragment().getOwnedTransition();
			Connection conn2 = petriNetFactory.createNormalArc();
			conn2.setSource(mutexPlace);
			mutexPlace.getOutputRel().add(conn2);
			conn2.setTarget(transition1);
			transition1.getInputRel().add(conn2);

			mutualExclusionResource.getConnections().add(conn1);
			mutualExclusionResource.getConnections().add(conn2);

		}

		return mutualExclusionResource;
	}

	/**
	 * Get fragment from step name
	 * 
	 * @param allTasks
	 * @param stepName
	 * @return
	 */
	private static AbstractFragment getFragmentFromStepName(List<Task> allTasks, String stepName) {

		List<Fragment> allFragments = new ArrayList<Fragment>();
		List<SharingResourceFragment> allSharingResourceFragments = new ArrayList<SharingResourceFragment>();

		for (Task task : allTasks) {
			allFragments.addAll(task.getFragments());
			allSharingResourceFragments.addAll(task.getSharingResourceFragments());
		}

		return getFragmentFromStepName(allFragments, allSharingResourceFragments, stepName);
	}

	/**
	 * Get all mutual exclusions
	 * 
	 * @param project
	 * @return
	 */
	private static List<SoftwareMutualExclusionResource> getAllMutualExclusions(DesignModel design) {

		List<SoftwareMutualExclusionResource> allMutualExclusions = new ArrayList<SoftwareMutualExclusionResource>();
		List<PackageableElement> allPackageableElements = design.getResourcePackage().getOwnedElement();
		for (PackageableElement packageableElement : allPackageableElements) {
			if (packageableElement instanceof SoftwareMutualExclusionResource) {
				allMutualExclusions.add((SoftwareMutualExclusionResource) packageableElement);
			}
		}

		return allMutualExclusions;
	}

	/**
	 * Get all steps of resource
	 * 
	 * @param swSchedulableResource
	 * @param allSteps
	 * @return
	 */
	private static List<Step> getAllStepsOfResource(SoftwareSchedulableResource swSchedulableResource,
			List<Step> allSteps) {
		// Get all steps of software schedulable resource
		List<Step> stepsOfResource = new ArrayList<Step>();
		for (Step step : allSteps) {
			if (step.getConcurRes() == swSchedulableResource) {
				stepsOfResource.add(step);
			}
		}

		return stepsOfResource;
	}

	/**
	 * 
	 * @param stepsOfTask
	 * @param allWorkloadEvents
	 * @return
	 */
	private static WorkloadEvent getWorkloadEventOfTask(List<Step> stepsOfTask, List<WorkloadEvent> allWorkloadEvents) {
		WorkloadEvent workloadEvent = null;
		for (WorkloadEvent aWorkloadEvent : allWorkloadEvents) {
			for (Step step : stepsOfTask) {
				if (aWorkloadEvent.getEffect() == step) {
					workloadEvent = aWorkloadEvent;
				}
			}
		}
		return workloadEvent;
	}

	/**
	 * Create a task
	 * 
	 * @param swSchedulableResource
	 * @param allWorkloadEvents
	 * @param allSteps
	 * @param allMutex
	 * @return
	 */
	private static Task createTask(SoftwareSchedulableResource swSchedulableResource,
			List<WorkloadEvent> allWorkloadEvents, List<Step> allSteps,
			List<SoftwareMutualExclusionResource> allMutex) {

		Task task = taskModelFactory.createTask();

		// Get all steps of software schedulable resource
		List<Step> stepsOfResource = getAllStepsOfResource(swSchedulableResource, allSteps);

		// Get workload event
		WorkloadEvent workloadEvent = getWorkloadEventOfTask(stepsOfResource, allWorkloadEvents);

		if (workloadEvent == null) {

			// get step accessing shared resources from workload event
			List<Step> allStepsOfTask = stepsOfResource;
			List<Step> allStepsAccessingSharedResource = new ArrayList<Step>();
			List<Step> stepsOfWorkloadEventAccessingSharedResource = new ArrayList<Step>();
			List<Step> stepsOfWorkloadEventNonAccessingSharedResource = new ArrayList<Step>();

			for (SoftwareMutualExclusionResource mutex : allMutex) {
				List<ModelElement> accessTokenElements = mutex.getAccessTokenElements();
				for (ModelElement ModelElement : accessTokenElements) {
					allStepsAccessingSharedResource.add((Step) ModelElement);
				}
			}

			for (Step step : allStepsOfTask) {
				if (!allStepsAccessingSharedResource.contains(step))
					stepsOfWorkloadEventNonAccessingSharedResource.add(step);
				else
					stepsOfWorkloadEventAccessingSharedResource.add(step);
			}

			// create fragment for steps non accessing shared resources
			for (Step step : stepsOfWorkloadEventNonAccessingSharedResource) {
				Fragment fragment = taskModelFactory.createFragment();

				fragment.setTask(task);

				Place fragmentPlace = petriNetFactory.createPlace();
				String placeId = generatePlaceId();
				fragmentPlace.setId(placeId);
				fragmentPlace.setName(step.getName() + "_place");
				fragmentPlace.setInitCount(0);

				Transition fragmentTransition = petriNetFactory.createTransition();
				String transitionId = generateTransitionId();
				fragmentTransition.setId(transitionId);
				fragmentTransition.setName(step.getName() + "_transition");
				fragmentTransition.setLowerBound("" + new Double(step.getBestCET().getValue()).intValue());
				fragmentTransition.setUpperBound("" + new Double(step.getWorstCET().getValue()).intValue());

				Connection conn = petriNetFactory.createNormalArc();
				conn.setSource(fragmentPlace);
				fragmentPlace.getOutputRel().add(conn);
				conn.setTarget(fragmentTransition);
				fragmentTransition.getInputRel().add(conn);

				fragment.setOwnedPlace(fragmentPlace);
				fragment.setOwnedTransition(fragmentTransition);
				fragment.getConnections().add(conn);

				fragment.setPriority(step.getPriority());

				task.getFragments().add(fragment);
				// task.getAllFragments().add(fragment);
			}

			// create fragment for steps accessing shared resources
			for (Step step : stepsOfWorkloadEventAccessingSharedResource) {
				SharingResourceFragment fragment = taskModelFactory.createSharingResourceFragment();

				// fragment.setTask(task);

				Place firstPlace = petriNetFactory.createPlace();
				String firstPlaceId = generatePlaceId();
				firstPlace.setId(firstPlaceId);
				firstPlace.setName(step.getName() + "_first_place");
				firstPlace.setInitCount(0);

				Transition firstTransition = petriNetFactory.createTransition();
				String firstTransitionId = generateTransitionId();
				firstTransition.setId(firstTransitionId);
				firstTransition.setName(step.getName() + "_first_transition");
				firstTransition.setLowerBound("0");
				firstTransition.setUpperBound("0");

				Place secondPlace = petriNetFactory.createPlace();
				String secondPlaceId = generatePlaceId();
				secondPlace.setId(secondPlaceId);
				secondPlace.setName(step.getName() + "_second_place");
				secondPlace.setInitCount(0);

				Transition secondTransition = petriNetFactory.createTransition();
				String secondTransitionId = generateTransitionId();
				secondTransition.setId(secondTransitionId);
				secondTransition.setName(step.getName() + "_second_transition");
				secondTransition.setLowerBound("" + new Double(step.getBestCET().getValue()).intValue());
				secondTransition.setUpperBound("" + new Double(step.getWorstCET().getValue()).intValue());

				Connection conn1 = petriNetFactory.createNormalArc();
				conn1.setSource(firstPlace);
				firstPlace.getOutputRel().add(conn1);
				conn1.setTarget(firstTransition);
				firstTransition.getInputRel().add(conn1);

				Connection conn2 = petriNetFactory.createNormalArc();
				conn2.setSource(firstTransition);
				firstTransition.getOutputRel().add(conn2);
				conn2.setTarget(secondPlace);
				secondPlace.getInputRel().add(conn2);

				Connection conn3 = petriNetFactory.createNormalArc();
				conn3.setSource(secondPlace);
				secondPlace.getOutputRel().add(conn3);
				conn3.setTarget(secondTransition);
				secondTransition.getInputRel().add(conn3);

				Fragment firstFragment = taskModelFactory.createFragment();
				firstFragment.setOwnedPlace(firstPlace);
				firstFragment.setOwnedTransition(firstTransition);
				firstFragment.setTask(task);

				Fragment secondFragment = taskModelFactory.createFragment();
				secondFragment.setOwnedPlace(secondPlace);
				secondFragment.setOwnedTransition(secondTransition);
				secondFragment.setTask(task);

				firstFragment.setPriority(step.getPriority());
				int priorityPlafond = getPriorityPlafond(step, allMutex);
				secondFragment.setPriority(priorityPlafond);

				fragment.setFirstFragment(firstFragment);
				fragment.setSecondFragment(secondFragment);
				fragment.getConnections().add(conn1);
				fragment.getConnections().add(conn2);
				fragment.getConnections().add(conn3);

				task.getSharingResourceFragments().add(fragment);
			}

			for (Step step : allStepsOfTask) {

				List<Step> nextSteps = getNextSteps(step, allSteps);

				AbstractFragment currentAFragment = getFragmentFromStepName(task.getFragments(),
						task.getSharingResourceFragments(), step.getName());

				if (nextSteps != null) {
					for (Step st : nextSteps) {

						AbstractFragment nextAFragment = getFragmentFromStepName(task.getFragments(),
								task.getSharingResourceFragments(), st.getName());
						// if (nextAFragment!=null)
						// task.getAllFragments().add(nextAFragment);

						if (currentAFragment instanceof Fragment && nextAFragment instanceof Fragment) {
							Fragment currentFragment = (Fragment) currentAFragment;
							Fragment nextFragment = (Fragment) nextAFragment;
							Transition currentTransition = currentFragment.getOwnedTransition();
							Place nextPlace = nextFragment.getOwnedPlace();
							Connection conn1 = petriNetFactory.createNormalArc();
							conn1.setSource(currentTransition);
							currentTransition.getOutputRel().add(conn1);
							conn1.setTarget(nextPlace);
							nextPlace.getInputRel().add(conn1);

							currentFragment.getConnections().add(conn1);

							// java.lang.System.out.println(1);

						} else if (currentAFragment instanceof Fragment
								&& nextAFragment instanceof SharingResourceFragment) {
							Fragment currentFragment = (Fragment) currentAFragment;
							SharingResourceFragment nextFragment = (SharingResourceFragment) nextAFragment;

							Transition currentTransition = currentFragment.getOwnedTransition();
							Place nextPlace = nextFragment.getFirstFragment().getOwnedPlace();

							Connection conn1 = petriNetFactory.createNormalArc();
							conn1.setSource(currentTransition);
							currentTransition.getOutputRel().add(conn1);
							conn1.setTarget(nextPlace);
							nextPlace.getInputRel().add(conn1);

							currentFragment.getConnections().add(conn1);

							// java.lang.System.out.println(2);

						} else if (currentAFragment instanceof SharingResourceFragment
								&& nextAFragment instanceof Fragment) {
							SharingResourceFragment currentFragment = (SharingResourceFragment) currentAFragment;
							Fragment nextFragment = (Fragment) nextAFragment;

							Transition currentTransition = currentFragment.getSecondFragment().getOwnedTransition();
							Place nextPlace = nextFragment.getOwnedPlace();

							Connection conn1 = petriNetFactory.createNormalArc();
							conn1.setSource(currentTransition);
							currentTransition.getOutputRel().add(conn1);
							conn1.setTarget(nextPlace);
							nextPlace.getInputRel().add(conn1);

							currentFragment.getConnections().add(conn1);

							// java.lang.System.out.println(3);

						} else if (currentAFragment instanceof SharingResourceFragment
								&& nextAFragment instanceof SharingResourceFragment) {
							SharingResourceFragment currentFragment = (SharingResourceFragment) currentAFragment;
							SharingResourceFragment nextFragment = (SharingResourceFragment) nextAFragment;

							Transition currentTransition = currentFragment.getSecondFragment().getOwnedTransition();
							Place nextPlace = nextFragment.getFirstFragment().getOwnedPlace();

							Connection conn1 = petriNetFactory.createNormalArc();
							conn1.setSource(currentTransition);
							currentTransition.getOutputRel().add(conn1);
							conn1.setTarget(nextPlace);
							nextPlace.getInputRel().add(conn1);

							currentFragment.getConnections().add(conn1);

							// java.lang.System.out.println(4);

						}
					}
				}
			}
		}

		if (workloadEvent != null) {
			Stimulus stimulus = createStimulus(workloadEvent);
			task.setStimulus(stimulus);

			// get step accessing shared resources from workload event
			List<Step> allStepsOfTask = stepsOfResource;
			List<Step> allStepsAccessingSharedResource = new ArrayList<Step>();
			List<Step> stepsOfWorkloadEventAccessingSharedResource = new ArrayList<Step>();
			List<Step> stepsOfWorkloadEventNonAccessingSharedResource = new ArrayList<Step>();

			for (SoftwareMutualExclusionResource mutex : allMutex) {
				List<ModelElement> accessTokenElements = mutex.getAccessTokenElements();
				for (ModelElement ModelElement : accessTokenElements) {
					allStepsAccessingSharedResource.add((Step) ModelElement);
				}
			}

			for (Step step : allStepsOfTask) {
				if (!allStepsAccessingSharedResource.contains(step))
					stepsOfWorkloadEventNonAccessingSharedResource.add(step);
				else
					stepsOfWorkloadEventAccessingSharedResource.add(step);
			}

			// create fragment for steps non accessing shared resources
			for (Step step : stepsOfWorkloadEventNonAccessingSharedResource) {
				Fragment fragment = taskModelFactory.createFragment();

				fragment.setTask(task);

				Place fragmentPlace = petriNetFactory.createPlace();
				String placeId = generatePlaceId();
				fragmentPlace.setId(placeId);
				fragmentPlace.setName(step.getName() + "_place");
				fragmentPlace.setInitCount(0);

				Transition fragmentTransition = petriNetFactory.createTransition();
				String transitionId = generateTransitionId();
				fragmentTransition.setId(transitionId);
				fragmentTransition.setName(step.getName() + "_transition");
				fragmentTransition.setLowerBound("" + new Double(step.getBestCET().getValue()).intValue());
				fragmentTransition.setUpperBound("" + new Double(step.getWorstCET().getValue()).intValue());

				Connection conn = petriNetFactory.createNormalArc();
				conn.setSource(fragmentPlace);
				fragmentPlace.getOutputRel().add(conn);
				conn.setTarget(fragmentTransition);
				fragmentTransition.getInputRel().add(conn);

				fragment.setOwnedPlace(fragmentPlace);
				fragment.setOwnedTransition(fragmentTransition);
				fragment.getConnections().add(conn);

				fragment.setPriority(step.getPriority());

				task.getFragments().add(fragment);

			}

			for (Step step : stepsOfWorkloadEventAccessingSharedResource) {
				SharingResourceFragment fragment = taskModelFactory.createSharingResourceFragment();

				// fragment.setTask(task);

				Place firstPlace = petriNetFactory.createPlace();
				String firstPlaceId = generatePlaceId();
				firstPlace.setId(firstPlaceId);
				firstPlace.setName(step.getName() + "_first_place");
				firstPlace.setInitCount(0);

				Transition firstTransition = petriNetFactory.createTransition();
				String firstTransitionId = generateTransitionId();
				firstTransition.setId(firstTransitionId);
				firstTransition.setName(step.getName() + "_first_transition");
				firstTransition.setLowerBound("0");
				firstTransition.setUpperBound("0");

				Place secondPlace = petriNetFactory.createPlace();
				String secondPlaceId = generatePlaceId();
				secondPlace.setId(secondPlaceId);
				secondPlace.setName(step.getName() + "_second_place");
				secondPlace.setInitCount(0);

				Transition secondTransition = petriNetFactory.createTransition();
				String secondTransitionId = generateTransitionId();
				secondTransition.setId(secondTransitionId);
				secondTransition.setName(step.getName() + "_second_transition");
				secondTransition.setLowerBound("" + new Double(step.getBestCET().getValue()).intValue());
				secondTransition.setUpperBound("" + new Double(step.getWorstCET().getValue()).intValue());

				Connection conn1 = petriNetFactory.createNormalArc();
				conn1.setSource(firstPlace);
				firstPlace.getOutputRel().add(conn1);
				conn1.setTarget(firstTransition);
				firstTransition.getInputRel().add(conn1);

				Connection conn2 = petriNetFactory.createNormalArc();
				conn2.setSource(firstTransition);
				firstTransition.getOutputRel().add(conn2);
				conn2.setTarget(secondPlace);
				secondPlace.getInputRel().add(conn2);

				Connection conn3 = petriNetFactory.createNormalArc();
				conn3.setSource(secondPlace);
				secondPlace.getOutputRel().add(conn3);
				conn3.setTarget(secondTransition);
				secondTransition.getInputRel().add(conn3);

				Fragment firstFragment = taskModelFactory.createFragment();
				firstFragment.setOwnedPlace(firstPlace);
				firstFragment.setOwnedTransition(firstTransition);
				firstFragment.setTask(task);

				Fragment secondFragment = taskModelFactory.createFragment();
				secondFragment.setOwnedPlace(secondPlace);
				secondFragment.setOwnedTransition(secondTransition);
				secondFragment.setTask(task);

				firstFragment.setPriority(step.getPriority());
				int priorityPlafond = getPriorityPlafond(step, allMutex);
				secondFragment.setPriority(priorityPlafond);

				fragment.setFirstFragment(firstFragment);
				fragment.setSecondFragment(secondFragment);
				fragment.getConnections().add(conn1);
				fragment.getConnections().add(conn2);
				fragment.getConnections().add(conn3);

				task.getSharingResourceFragments().add(fragment);
			}

			Step firstStep = allStepsOfTask.get(0);
			AbstractFragment firstFragment = getFragmentFromStepName(task.getFragments(),
					task.getSharingResourceFragments(), firstStep.getName());
			if (firstFragment instanceof Fragment) {
				Fragment fragment = (Fragment) firstFragment;
				Connection conn = petriNetFactory.createNormalArc();
				conn.setSource(task.getStimulus().getJitter().getOwnedTransition());
				task.getStimulus().getJitter().getOwnedTransition().getOutputRel().add(conn);
				conn.setTarget(fragment.getOwnedPlace());
				fragment.getOwnedPlace().getInputRel().add(conn);
				fragment.getConnections().add(conn);
			} else if (firstFragment instanceof SharingResourceFragment) {
				SharingResourceFragment fragment = (SharingResourceFragment) firstFragment;
				Connection conn = petriNetFactory.createNormalArc();
				conn.setSource(task.getStimulus().getJitter().getOwnedTransition());
				task.getStimulus().getJitter().getOwnedTransition().getOutputRel().add(conn);
				conn.setTarget(fragment.getFirstFragment().getOwnedPlace());
				fragment.getFirstFragment().getOwnedPlace().getInputRel().add(conn);
				fragment.getConnections().add(conn);
			}

			for (Step step : allStepsOfTask) {

				List<Step> nextSteps = getNextSteps(step, allSteps);

				// java.lang.System.out.println("step: "+step);
				// java.lang.System.out.println("next steps: "+nextSteps+"\n");

				AbstractFragment currentAFragment = getFragmentFromStepName(task.getFragments(),
						task.getSharingResourceFragments(), step.getName());

				if (nextSteps != null) {
					for (Step st : nextSteps) {
						AbstractFragment nextAFragment = getFragmentFromStepName(task.getFragments(),
								task.getSharingResourceFragments(), st.getName());

						if (currentAFragment instanceof Fragment && nextAFragment instanceof Fragment) {
							Fragment currentFragment = (Fragment) currentAFragment;
							Fragment nextFragment = (Fragment) nextAFragment;
							Transition currentTransition = currentFragment.getOwnedTransition();
							Place nextPlace = nextFragment.getOwnedPlace();
							Connection conn1 = petriNetFactory.createNormalArc();
							conn1.setSource(currentTransition);
							currentTransition.getOutputRel().add(conn1);
							conn1.setTarget(nextPlace);
							nextPlace.getInputRel().add(conn1);

							// java.lang.System.out.println(1);

							currentFragment.getConnections().add(conn1);
						} else if (currentAFragment instanceof Fragment
								&& nextAFragment instanceof SharingResourceFragment) {
							Fragment currentFragment = (Fragment) currentAFragment;
							SharingResourceFragment nextFragment = (SharingResourceFragment) nextAFragment;

							Transition currentTransition = currentFragment.getOwnedTransition();
							Place nextPlace = nextFragment.getFirstFragment().getOwnedPlace();

							Connection conn1 = petriNetFactory.createNormalArc();
							conn1.setSource(currentTransition);
							currentTransition.getOutputRel().add(conn1);
							conn1.setTarget(nextPlace);
							nextPlace.getInputRel().add(conn1);

							currentFragment.getConnections().add(conn1);

							// java.lang.System.out.println(2);

						} else if (currentAFragment instanceof SharingResourceFragment
								&& nextAFragment instanceof Fragment) {
							SharingResourceFragment currentFragment = (SharingResourceFragment) currentAFragment;
							Fragment nextFragment = (Fragment) nextAFragment;

							Transition currentTransition = currentFragment.getSecondFragment().getOwnedTransition();
							Place nextPlace = nextFragment.getOwnedPlace();

							Connection conn1 = petriNetFactory.createNormalArc();
							conn1.setSource(currentTransition);
							currentTransition.getOutputRel().add(conn1);
							conn1.setTarget(nextPlace);
							nextPlace.getInputRel().add(conn1);

							currentFragment.getConnections().add(conn1);

							// java.lang.System.out.println(3);

						} else if (currentAFragment instanceof SharingResourceFragment
								&& nextAFragment instanceof SharingResourceFragment) {
							SharingResourceFragment currentFragment = (SharingResourceFragment) currentAFragment;
							SharingResourceFragment nextFragment = (SharingResourceFragment) nextAFragment;

							Transition currentTransition = currentFragment.getSecondFragment().getOwnedTransition();
							Place nextPlace = nextFragment.getFirstFragment().getOwnedPlace();

							Connection conn1 = petriNetFactory.createNormalArc();
							conn1.setSource(currentTransition);
							currentTransition.getOutputRel().add(conn1);
							conn1.setTarget(nextPlace);
							nextPlace.getInputRel().add(conn1);

							currentFragment.getConnections().add(conn1);

							// java.lang.System.out.println(4);

						}
					}
				}
			}
		}

		return task;
	}

	/**
	 * Get Priority Plafond
	 * 
	 * @param step
	 * @param allMutex
	 * @return
	 */
	private static int getPriorityPlafond(Step step, List<SoftwareMutualExclusionResource> allMutex) {

		SoftwareMutualExclusionResource thisMutex = null;
		for (SoftwareMutualExclusionResource mutex : allMutex) {
			List<ModelElement> accessingResourceElements = mutex.getAccessTokenElements();
			if (accessingResourceElements.contains(step)) {
				thisMutex = mutex;
			}
		}

		List<ModelElement> accessingResourceElements = thisMutex.getAccessTokenElements();
		List<Step> accessingResourceSteps = new ArrayList<Step>();
		for (ModelElement element : accessingResourceElements) {
			accessingResourceSteps.add((Step) element);
		}

		int maxPriority = 0;
		for (Step stp : accessingResourceSteps) {
			if (stp.getPriority() > maxPriority)
				maxPriority = stp.getPriority();
		}

		return maxPriority;
	}

	/**
	 * Get fragment from step name
	 * 
	 * @param allFragments
	 * @param stepName
	 * @return
	 */
	private static AbstractFragment getFragmentFromStepName(List<Fragment> allFragments,
			List<SharingResourceFragment> allSharingResourceFragments, String stepName) {

		for (Fragment fragment : allFragments) {
			if (fragment.getOwnedPlace().getName().compareTo(stepName + "_place") == 0)
				return fragment;
		}

		for (SharingResourceFragment sharingResourceFragment : allSharingResourceFragments) {

			if (sharingResourceFragment.getFirstFragment().getOwnedPlace().getName()
					.compareTo((stepName + "_first_place")) == 0) {
				// java.lang.System.out.println(stepName);
				// java.lang.System.out.println(sharingResourceFragment);
				return sharingResourceFragment;
			}
			// if
			// (sharingResourceFragment.getSecondFragment().getOwnedPlace().getName().compareTo(stepName+"_second_place")==0)
			// return sharingResourceFragment;
		}

		return null;
	}

	/**
	 * Get next steps
	 * 
	 * @param step
	 * @return
	 */
	private static List<Step> getNextSteps(Step step, List<Step> allSteps) {
		if (step.getOutputRel() != null)
			return step.getOutputRel().getSucces();
		else {
			if (step.getOutputPin() != null) {
				List<Step> nextSteps = new ArrayList<Step>();
				for (int i = 0; i < step.getOutputPin().size(); i++) {
					List<InputPin> allInputPins = step.getOutputPin().get(i).getSuccessors();
					for (InputPin inputPin : allInputPins) {
						for (Step stp : allSteps) {
							if (stp.getInputPin().contains(inputPin))
								nextSteps.add(stp);
						}
					}
				}
				return nextSteps;
			}
		}
		return null;
	}

	/**
	 * Create stimulus
	 * 
	 * @param workloadEvent
	 * @return
	 */
	private static Stimulus createStimulus(WorkloadEvent workloadEvent) {

		Stimulus stimulus = taskModelFactory.createStimulus();
		int offsetValue = getOffsetFromWorkloadEvent(workloadEvent);
		int periodValue = getPeriodFromWorkloadEvent(workloadEvent);
		int jitterValue = getJitterFromWorkloadEvent(workloadEvent);

		// offset
		Offset offset = taskModelFactory.createOffset();

		Place offsetPlace = petriNetFactory.createPlace();
		String offsetPlaceId = generatePlaceId();
		offsetPlace.setId(offsetPlaceId);
		offsetPlace.setName(offsetPlaceId);
		offsetPlace.setInitCount(1);

		Transition offsetTransition = petriNetFactory.createTransition();
		String offsetTranstionId = generateTransitionId();
		offsetTransition.setId(offsetTranstionId);
		offsetTransition.setName(offsetTranstionId);
		offsetTransition.setLowerBound("" + offsetValue);
		offsetTransition.setUpperBound("" + offsetValue);

		Connection conn1 = petriNetFactory.createNormalArc();
		conn1.setSource(offsetPlace);
		offsetPlace.getOutputRel().add(conn1);
		conn1.setTarget(offsetTransition);
		offsetTransition.getInputRel().add(conn1);

		offset.setOwnedPlace(offsetPlace);
		offset.setOwnedTransition(offsetTransition);
		offset.getConnections().add(conn1);

		stimulus.setOffset(offset);

		// period
		/// first release
		First_Release firstRelease = taskModelFactory.createFirst_Release();

		Place firstReleasePlace = petriNetFactory.createPlace();
		String firstReleasePlaceId = generatePlaceId();
		firstReleasePlace.setId(firstReleasePlaceId);
		firstReleasePlace.setName(firstReleasePlaceId);
		firstReleasePlace.setInitCount(0);

		Transition firstReleaseTransition = petriNetFactory.createTransition();
		String firstReleaseTransitionId = generateTransitionId();
		firstReleaseTransition.setId(firstReleaseTransitionId);
		firstReleaseTransition.setName(firstReleaseTransitionId);
		firstReleaseTransition.setLowerBound("0");
		firstReleaseTransition.setUpperBound("0");

		Connection conn2 = petriNetFactory.createNormalArc();
		conn2.setSource(firstReleasePlace);
		firstReleasePlace.getOutputRel().add(conn2);
		conn2.setTarget(firstReleaseTransition);
		firstReleaseTransition.getInputRel().add(conn2);

		firstRelease.setOwnedPlace(firstReleasePlace);
		firstRelease.setOwnedTransition(firstReleaseTransition);
		firstRelease.getConnections().add(conn2);

		stimulus.setFirstRelease(firstRelease);

		// periodic release
		Period periodicRelease = taskModelFactory.createPeriod();

		Place periodicReleasePlace = petriNetFactory.createPlace();
		String periodicReleasePlaceId = generatePlaceId();
		periodicReleasePlace.setId(periodicReleasePlaceId);
		periodicReleasePlace.setName(periodicReleasePlaceId);
		periodicReleasePlace.setInitCount(0);

		Transition periodicReleaseTransition = petriNetFactory.createTransition();
		String periodicReleaseTransitionId = generateTransitionId();
		periodicReleaseTransition.setId(periodicReleaseTransitionId);
		periodicReleaseTransition.setName(periodicReleaseTransitionId);
		periodicReleaseTransition.setLowerBound("" + periodValue);
		periodicReleaseTransition.setUpperBound("" + periodValue);

		Connection conn3 = petriNetFactory.createNormalArc();
		conn3.setSource(periodicReleasePlace);
		periodicReleasePlace.getOutputRel().add(conn3);
		conn3.setTarget(periodicReleaseTransition);
		periodicReleaseTransition.getInputRel().add(conn3);

		Connection conn4 = petriNetFactory.createNormalArc();
		conn4.setSource(periodicReleaseTransition);
		periodicReleaseTransition.getOutputRel().add(conn4);
		conn4.setTarget(periodicReleasePlace);
		periodicReleasePlace.getInputRel().add(conn4);

		periodicRelease.setOwnedPlace(periodicReleasePlace);
		periodicRelease.setOwnedTransition(periodicReleaseTransition);
		periodicRelease.getConnections().add(conn3);
		periodicRelease.getConnections().add(conn4);

		stimulus.setPeriod(periodicRelease);

		// jitter
		Jitter jitter = taskModelFactory.createJitter();

		Place jitterPlace = petriNetFactory.createPlace();
		String jitterPlaceId = generatePlaceId();
		jitterPlace.setId(jitterPlaceId);
		jitterPlace.setName(jitterPlaceId);
		jitterPlace.setInitCount(0);

		Transition jitterTransition = petriNetFactory.createTransition();
		String jitterTransitionId = generateTransitionId();
		jitterTransition.setId(jitterTransitionId);
		jitterTransition.setName(jitterTransitionId);
		jitterTransition.setLowerBound("" + 0);
		jitterTransition.setUpperBound("" + jitterValue);

		Connection conn5 = petriNetFactory.createNormalArc();
		conn5.setSource(jitterPlace);
		jitterPlace.getOutputRel().add(conn5);
		conn5.setTarget(jitterTransition);
		jitterTransition.getInputRel().add(conn5);

		jitter.setOwnedPlace(jitterPlace);
		jitter.setOwnedTransition(jitterTransition);
		jitter.getConnections().add(conn5);

		stimulus.setJitter(jitter);

		// Connections
		Connection conn6 = petriNetFactory.createNormalArc();
		conn6.setSource(offsetTransition);
		offsetTransition.getOutputRel().add(conn6);
		conn6.setTarget(firstReleasePlace);
		firstReleasePlace.getInputRel().add(conn6);
		offset.getConnections().add(conn6);

		Connection conn7 = petriNetFactory.createNormalArc();
		conn7.setSource(firstReleaseTransition);
		firstReleaseTransition.getOutputRel().add(conn7);
		conn7.setTarget(periodicReleasePlace);
		periodicReleasePlace.getInputRel().add(conn7);
		firstRelease.getConnections().add(conn7);

		Connection conn8 = petriNetFactory.createNormalArc();
		conn8.setSource(periodicReleaseTransition);
		periodicReleaseTransition.getOutputRel().add(conn8);
		conn8.setTarget(jitterPlace);
		jitterPlace.getInputRel().add(conn8);
		periodicRelease.getConnections().add(conn8);

		Connection conn9 = petriNetFactory.createNormalArc();
		conn9.setSource(firstReleaseTransition);
		firstReleaseTransition.getOutputRel().add(conn9);
		conn9.setTarget(jitterPlace);
		jitterPlace.getInputRel().add(conn9);
		firstRelease.getConnections().add(conn9);

		return stimulus;
	}

	/**
	 * get jitter from workload event
	 * 
	 * @param workloadEvent
	 * @return
	 */
	private static int getJitterFromWorkloadEvent(WorkloadEvent workloadEvent) {
		try {
			if (workloadEvent.getPattern().getJitter().getUnit() == TimeUnitKind.MS)
				return new Double(workloadEvent.getPattern().getJitter().getValue()).intValue();
			else if (workloadEvent.getPattern().getJitter().getUnit() == TimeUnitKind.S)
				return new Double(workloadEvent.getPattern().getJitter().getValue()).intValue() * 1000;
			else
				return 0;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * get offset from workload event
	 * 
	 * @param workloadEvent
	 * @return
	 */
	private static int getOffsetFromWorkloadEvent(WorkloadEvent workloadEvent) {
		try {
			if (workloadEvent.getPattern().getJitter().getUnit() == TimeUnitKind.MS)
				return new Double(workloadEvent.getPattern().getPhase().getValue()).intValue();
			else if (workloadEvent.getPattern().getJitter().getUnit() == TimeUnitKind.S)
				return new Double(workloadEvent.getPattern().getPhase().getValue()).intValue() * 1000;
			else
				return 0;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * 
	 * @param workloadEvent
	 * @return
	 */
	private static int getPeriodFromWorkloadEvent(WorkloadEvent workloadEvent) {
		try {
			if (((PeriodicPattern) workloadEvent.getPattern()).getPeriod().getUnit() == TimeUnitKind.MS)
				return new Double(((PeriodicPattern) workloadEvent.getPattern()).getPeriod().getValue()).intValue();
			else if (((PeriodicPattern) workloadEvent.getPattern()).getPeriod().getUnit() == TimeUnitKind.S)
				return new Double(((PeriodicPattern) workloadEvent.getPattern()).getPeriod().getValue()).intValue()
						* 1000;
			else
				return 0;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * generate name for place
	 * 
	 * @return
	 */
	public static String generatePlaceId() {
		return "P" + placeIdGenerator++;
	}

	/**
	 * generate name for transition
	 * 
	 * @return
	 */
	public static String generateTransitionId() {
		return "T" + transitionIdGenerator++;
	}

	/**
	 * Get all workload events
	 * 
	 * @param project
	 * @return
	 */
	private static List<WorkloadEvent> getAllWorkloadEvents(DesignModel design) {
		List<WorkloadEvent> allWorkloadEvents = design.getWorkloadBehavior().getDemand();
		return allWorkloadEvents;
	}

	/**
	 * save Petri net as a xmi file
	 * 
	 * @param filePath
	 * @param petriNet
	 */
	private static void saveAsXmi(String filePath, System sys) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("taskmodel", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(filePath));
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resource.getContents().add(sys);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * load petri net
	 * 
	 * @param modelPath
	 * @return
	 */
	public static Project loadModel(String modelPath) {
		Time4sysPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("time4sys", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createURI(modelPath), true);
		Project root = (Project) resource.getContents().get(0);

		return root;
	}

	public static void main(String[] args) {
		DesignModel design = CurrentAnalysisContext.getInstance().getDesignModel();
		System system = transform(design);
		saveAsXmi("model/minepump2.taskmodel", system);
		PetriNet petriNet = system.convertToPetriNet();

		String outputFilePath = "model/minepump2.xml";
		RomeoXmlSerialization.romeoXmlSerialization(petriNet, outputFilePath);

		// int taskNumber = system.getOwnedTasks().size();
		// for (int i=0;i<taskNumber;i++) {
		// System clonedSystem = system.clone();
		// Observer observer =
		// ResponseTimeObserver.generateResponseTimeObserver(clonedSystem, i,
		// 1);
		// Place checkedPlace = observer.getCheckPlaces().get(0);
		// String tctlFormula = "AG[0,inf]"+checkedPlace.getId() + "<1";
		// java.lang.System.out.println("\n\n"+tctlFormula+"\n\n");
		// petriNet = clonedSystem.convertToPetriNet();
		// RomeoXmlSerialization.romeoXmlSerialization(petriNet,"model/example_"+i+".xml");
		// }

	}

	public void transform(TestImplementation test) {
		
		IProject currentProject = WorkspaceUtils.getProject();
		IFolder folder = WorkspaceUtils.createFolder(currentProject, AnalysisRepositoryControler.getFolder(test.getTestedFile()));
		String outputFolderPath = folder.getLocation().toOSString()+File.separator+AnalysisRepositoryControler.getFileName(test.getTestedFile());
		File file = new File(outputFolderPath);
		// System.out.println("output folder path: "+outputFolderPath);

		// String outputModelPath = outputFolderPath+ "/transformed_model.txt";

		CurrentAnalysisContext context = CurrentAnalysisContext.getInstance();
		DesignModel model = context.getDesignModel();

		DesignModel design = CurrentAnalysisContext.getInstance().getDesignModel();
		System system = transform(design);
//		saveAsXmi("petri/minepump2.taskmodel", system);
		PetriNet petriNet = system.convertToPetriNet();

//		String outputFilePath = "model/minepump2.xml";
		RomeoXmlSerialization.romeoXmlSerialization(petriNet, outputFolderPath);

		//TODO: Commment or Not
//		 int taskNumber = system.getOwnedTasks().size();
//		 for (int i=0;i<taskNumber;i++) {
//		 System clonedSystem = system.clone();
//		 Observer observer =
//		 ResponseTimeObserver.generateResponseTimeObserver(clonedSystem, i,
//		 1);
//		 Place checkedPlace = observer.getCheckPlaces().get(0);
//		 String tctlFormula = "AG[0,inf]"+checkedPlace.getId() + "<1";
//		 java.lang.System.out.println("\n\n"+tctlFormula+"\n\n");
//		 petriNet = clonedSystem.convertToPetriNet();
//		 RomeoXmlSerialization.romeoXmlSerialization(petriNet,"model/example_"+i+".xml");
//		 }

	}
}
