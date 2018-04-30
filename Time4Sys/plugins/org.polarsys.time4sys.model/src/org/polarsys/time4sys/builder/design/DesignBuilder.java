/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.builder.design;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.builder.simulation.SimulationBuilder;
import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.CommunicationChannel;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.Once;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;
import org.polarsys.time4sys.marte.gqam.Reference;
import org.polarsys.time4sys.marte.gqam.SlidingWindowPattern;
import org.polarsys.time4sys.marte.gqam.SporadicPattern;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadBehavior;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.grm.CommunicationMedia;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourcePackage;
import org.polarsys.time4sys.marte.hrm.HardwareBus;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.coreelements.PackageableElement;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;
import org.polarsys.time4sys.marte.srm.Alarm;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.marte.srm.SrmFactory;
import org.polarsys.time4sys.model.time4sys.Simulation;
import org.polarsys.time4sys.model.time4sys.Time4sysFactory;

/**
 * @author loic
 *
 */
public class DesignBuilder {
	
	protected static DesignFactory df = DesignFactory.eINSTANCE;
	protected static GqamFactory gqamFactory = GqamFactory.eINSTANCE;
	protected static SrmFactory srmFactory = SrmFactory.eINSTANCE;
	protected static GrmFactory grmFactory = GrmFactory.eINSTANCE;
	protected static HrmFactory hrmFactory = HrmFactory.eINSTANCE;
	protected static NfpFactory nfpFactory = NfpFactory.eINSTANCE;
	

	public static DesignBuilder containing(EObject value) {
		value = searchDesign(value);
		return new DesignBuilder((DesignModel)value);
	}

	public static DesignModel searchDesign(EObject value) {
		while (value != null && !(value instanceof DesignModel)) {
			value = value.eContainer();
		}
		return (DesignModel)value;
	}

	private DesignModel design;
	private ProjectBuilder prjBuidler;

	/**
	 * 
	 */
	public DesignBuilder(final DesignModel model) {
		design = model;
		if (model == null) {
			design = df.createDesignModel();
			WorkloadBehavior behavior = gqamFactory.createWorkloadBehavior();
			design.setWorkloadBehavior(behavior);
			ResourcePackage resPkg = grmFactory.createResourcePackage();
			design.setResourcePackage(resPkg);
		}
	}

	public DesignBuilder(final ProjectBuilder projectBuilder, final DesignModel designModel) {
		this(designModel);
		prjBuidler = projectBuilder;
	}

	public ProcessorBuilder hasAProcessor() {
		HardwareProcessor proc = hrmFactory.createHardwareProcessor();
		design.getResourcePackage().getOwnedElement().add(proc);
		return new ProcessorBuilder(this, proc);
	}
	
	public AlarmBuilder hasAWatchdog() {
		return new AlarmBuilder(this, null).usedAsAWatchdog();
	}
	

	public CommunicationMediaBuilder hasCommunicationMedia() {
		final CommunicationMedia bus = grmFactory.createCommunicationMedia();
		design.getResourcePackage().getOwnedElement().add(bus);
		return new CommunicationMediaBuilder(this, bus);
	}
	
	public BusBuilder hasANetwork() {
		HardwareBus bus = hrmFactory.createHardwareBus();
		design.getResourcePackage().getOwnedElement().add(bus);
		return new BusBuilder(this, bus);
	}

	public WorkloadEventBuilder hasAPeriodicEvent(final String periodValue) {
		final Duration period = nfpFactory.createDurationFromString(periodValue);
		final WorkloadEvent taskActivation = gqamFactory.createWorkloadEvent();
		design.getWorkloadBehavior().getDemand().add(taskActivation);
		PeriodicPattern pattern = gqamFactory.createPeriodicPattern();
		pattern.setPeriod(period);
		taskActivation.setPattern(pattern);
		return new WorkloadEventBuilder(this, taskActivation);
	}
	
	public WorkloadEventBuilder hasASlidingWindowEvent(int nbEvents, final String windowSizeValue) {
		final Duration windowSize = nfpFactory.createDurationFromString(windowSizeValue);
		final WorkloadEvent taskActivation = gqamFactory.createWorkloadEvent();
		design.getWorkloadBehavior().getDemand().add(taskActivation);
		final SlidingWindowPattern pattern = gqamFactory.createSlidingWindowPattern();
		pattern.setWindowSize(windowSize);
		pattern.setNbEvents(nbEvents);
		taskActivation.setPattern(pattern);
		return new WorkloadEventBuilder(this, taskActivation);
	}
	
	public WorkloadEventBuilder hasSporadicEvent(final String minInterarrivalStr, final String maxInterarrivalStr) {
		final WorkloadEvent taskActivation = gqamFactory.createWorkloadEvent();
		design.getWorkloadBehavior().getDemand().add(taskActivation);
		final SporadicPattern pattern = gqamFactory.createSporadicPattern();
		if (minInterarrivalStr != null) {
			final Duration value = nfpFactory.createDurationFromString(minInterarrivalStr);
			pattern.setMinInterarrival(value);
		}
		if (maxInterarrivalStr != null) {
			final Duration value = nfpFactory.createDurationFromString(maxInterarrivalStr);
			pattern.setMaxInterarrival(value);
		}
		taskActivation.setPattern(pattern);
		return new WorkloadEventBuilder(this, taskActivation);
	}
	
	public WorkloadEventBuilder hasActivationOnce() {
		final WorkloadEvent taskActivation = gqamFactory.createWorkloadEvent();
		design.getWorkloadBehavior().getDemand().add(taskActivation);
		final Once pattern = gqamFactory.createOnce();
		taskActivation.setPattern(pattern);
		return new WorkloadEventBuilder(this, taskActivation);
	}

	public DesignModel build() {
		return design;
	}

	public int countTasks() {
		return countTasks(design);
	}
	

	private static int countTasks(final DesignModel design) {
		assert(design != null);
		assert(design.getResourcePackage() != null);
		return countTasks(design.getResourcePackage().getOwnedElement());
	}

	private static  int countTasks(final List<? extends PackageableElement> elts) {
		int t = 0;
		for(PackageableElement elt: elts) {
			if (elt instanceof SoftwareSchedulableResource) {
				t++;
			}
			if (elt instanceof Resource) {
				t += countTasks(((Resource)elt).getOwnedResource());
			}
		}
		return t;
	}

	public TaskBuilder task(final String name) {
		final SoftwareSchedulableResource task = searchTask(design.getResourcePackage().getOwnedElement(), name);
		if (task == null) {
			return null;
		}
		return new TaskBuilder(this, task);
	}
	
	public CommunicationChannelBuilder message(final String name) {
		final CommunicationChannel task = searchCommunicationChannel(design.getResourcePackage().getOwnedElement(), name);
		if (task == null) {
			return null;
		}
		return new CommunicationChannelBuilder(this, task);
	}

	private static  SoftwareSchedulableResource searchTask(final List<? extends PackageableElement> elts, final String name) {
		for(PackageableElement elt: elts) {
			if (elt instanceof SoftwareSchedulableResource) {
				if (name.equals(((SoftwareSchedulableResource)elt).getName())) {
					return (SoftwareSchedulableResource)elt;
				}
			}
			if (elt instanceof Resource) {
				final SoftwareSchedulableResource sub = searchTask(((Resource)elt).getOwnedResource(), name);
				if (sub != null) {
					return sub;
				}
			}
		}
		return null;
	}
	

	public AlarmBuilder watchdog(final String name) {
		return alarm(name);
	}
	
	public AlarmBuilder alarm(final String name) {
		final Alarm alarm = searchAlarm(design.getResourcePackage().getOwnedElement(), name);
		if (alarm == null) {
			return null;
		}
		return new AlarmBuilder(this, alarm);
	}
	
	private static  Alarm searchAlarm(final List<? extends PackageableElement> elts, final String name) {
		for(PackageableElement elt: elts) {
			if (elt instanceof Alarm) {
				if (name.equals(((Alarm)elt).getName())) {
					return (Alarm)elt;
				}
			}
			if (elt instanceof Resource) {
				final Alarm sub = searchAlarm(((Resource)elt).getOwnedResource(), name);
				if (sub != null) {
					return sub;
				}
			}
		}
		return null;
	}
	
	private static  CommunicationChannel searchCommunicationChannel(final List<? extends PackageableElement> elts, final String name) {
		for(PackageableElement elt: elts) {
			if (elt instanceof CommunicationChannel) {
				if (name.equals(((CommunicationChannel)elt).getName())) {
					return (CommunicationChannel)elt;
				}
			}
			if (elt instanceof Resource) {
				final CommunicationChannel sub = searchCommunicationChannel(((Resource)elt).getOwnedResource(), name);
				if (sub != null) {
					return sub;
				}
			}
		}
		return null;
	}

	public Collection<Step> allSteps() {
		final HashSet<Step> steps = new HashSet<>();
		for(BehaviorScenario behav: design.getWorkloadBehavior().getBehavior()) {
			if (behav instanceof Step) {
				steps.add((Step)behav);
			}
			steps.addAll(behav.getSteps());
		}
		return steps;
	}

	public int countSteps() {
		return allSteps().size();
	}

	public StepBuilder step(String name) {
		for(Step step: allSteps()) {
			if (name.equals(step.getName())) {
				return new StepBuilder(this, task(step.getConcurRes().getName()), step);
			}
		}
		throw new IllegalStateException("Step must have been already declared");
	}

	public StepBuilder aStep() {
		return new StepBuilder(this, (SchedulableResourceBuilder<?, ?>)null);
	}

	public int countPrecedenceRelations() {
		int c = 0;
		for(BehaviorScenario behav: design.getWorkloadBehavior().getBehavior()) {
			c += behav.getConnectors().size();
		}
		return c;
	}

	public PrecedenceRelationBuilder hasAPrecedenceRelation() {
		return new PrecedenceRelationBuilder(this);
	}

	public BehaviorScenario getMainScenario() {
		if (build().getWorkloadBehavior().getBehavior().isEmpty()) {
			final BehaviorScenario mainScenario = gqamFactory.createBehaviorScenario();
			mainScenario.setName("main");
			build().getWorkloadBehavior().getBehavior().add(mainScenario);
		}
		return build().getWorkloadBehavior().getBehavior().get(0);
	}

	public DesignBuilder called(String name) {
		design.setName(name);
		return this;
	}

	public List<PrecedenceRelation> allPrecedenceRelations() {
		final List<PrecedenceRelation> result = new LinkedList<>();
		for(BehaviorScenario behav: design.getWorkloadBehavior().getBehavior()) {
			result.addAll(behav.getConnectors());
		}
		return result;
	}

	public void has(final EndToEndFlowConstraintBuilder... values) {
		for(EndToEndFlowConstraintBuilder cst: values) {
			cst.build(this);
		}
	}

	public ProjectBuilder getProject() {
		if (prjBuidler != null) {
			return prjBuidler;
		}
		prjBuidler = new ProjectBuilder(this);
		return prjBuidler;
	}

	public DesignBuilder isNamed(final String name) {
		design.setName(name);
		return this;
	}

	public SimulationBuilder hasASimulation() {
		if (prjBuidler == null) {
			final Simulation simu = Time4sysFactory.eINSTANCE.createSimulation();
			return new SimulationBuilder(prjBuidler, simu).of(this);
		} else {
			final SimulationBuilder result = prjBuidler.hasASimulation().of(this);
			return result;
		}
		
	}

	public EndToEndFlowConstraintBuilder firstEndToEndFlowsConstraints() {
		final EndToEndFlow first = design.getEndToEndFlows().get(0);
		return new EndToEndFlowConstraintBuilder(first);
	}

	public ReferenceBuilder hasAReference() {
		return new ReferenceBuilder(this);
	}

	public boolean addReference(final Reference ref) {
		return design.getWorkloadBehavior().getReferences().add(ref);
	}

	/**
	 * Return the reference with given name or null.
	 * @param refname
	 * @return
	 */
	public ReferenceBuilder reference(final String refname) {
		for(Reference ref: design.getWorkloadBehavior().getReferences()) {
			if (refname.equals(ref.getReferenceName())) {
				return new ReferenceBuilder(ref);
			}
		}
		return null;
	}

}
