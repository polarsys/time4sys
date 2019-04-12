/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.transformations;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Context;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Transformation;

/**
 * Split Task for them to be in normal form:
 * - only receiving message (data or control-flow) at the start of the task
 * - only sending message (data or control-flow) at the end of the task
 * - at most one activation per task
 * NB: Priorities and deadlines are left untouched. For that purpose, see @org.polarsys.time4sys.transformations.ActivationPropagator
 * @author loic
 *
 */
public class TaskSplitter extends AbstractEndogenousMappedTransformation {

	public static final String COPY_TASK_ROLE = "copy-task";
	public static final String ORIGINAL_TASK_ROLE = "original-task";
	public static final String TRANS_NAME = ("Normal Form " + TaskSplitter.class.getSimpleName()).intern();
	public static final String STEPNTASK_TRANS_NAME = ("one step to one task AND one step Rule " + TaskSplitter.class.getSimpleName()).intern();
	public static final String TASK_TRANS_NAME = ("one duplicated task Rule " + TaskSplitter.class.getSimpleName()).intern();

	public static Transformation transform(final Project project, final DesignModel source) {
		return transform(defaultCfg(), project, source);
	}
	

	public static Transformation transform(TaskSplitterConfiguration cfg, Project project, DesignModel source) {
		return new TaskSplitter(cfg, project, source).transform();
	}
	
	public static TaskSplitterConfiguration defaultCfg() {
		return new TaskSplitterConfiguration();
	}
	
	public static class TaskSplitterConfiguration {
		protected boolean indexBasedName;
		
		public TaskSplitterConfiguration() {
			indexBasedName = false;
		}
		
		public TaskSplitterConfiguration(final TaskSplitterConfiguration original) {
			indexBasedName = original.indexBasedName;
		}

		public TaskSplitterConfiguration namesAreIndexBased() {
			final TaskSplitterConfiguration result = new TaskSplitterConfiguration(this);
			result.indexBasedName = true;
			return result;
		}
	}

	private Collection<Step> sourceStepsStartOfTask = new LinkedHashSet<>();
	private Collection<Link> tasksToBeCopied = new LinkedHashSet<>();
	private Map<SchedulableResource, Collection<SchedulableResource>> tasksToBeLinked = new HashMap<>();
	private Context stepNTaskRule;
	private Context taskDuplicationRule;
	private Collection<SchedulableResource> targetTasksToBeRemoved = new LinkedHashSet<>();
	protected final TaskSplitterConfiguration config;

	/**
	 * @param cfg 
	 * @param source
	 * @param project
	 * 
	 */
	public TaskSplitter(TaskSplitterConfiguration cfg, Project project, DesignModel source) {
		super(project, source, TRANS_NAME);
		config = cfg;
	}

	@Override
	public void createRules() {
		super.createRules();
		stepNTaskRule = mappingFactory.createContext(STEPNTASK_TRANS_NAME);
		taskDuplicationRule = mappingFactory.createContext(TASK_TRANS_NAME);
		mapping.getRules().add(stepNTaskRule);
		mapping.getRules().add(taskDuplicationRule);
	}

	@Override
	public void copied(final EObject source, final Link lnk, final EObject theCopy) {
		if (theCopy instanceof Step) {
			// Registering all steps that must be the start of a task.
			final Step aStep = (Step)source;
			if (aStep.getCause().isEmpty()) {
				if (aStep.getInputPin().isEmpty()) { // Orphan step
					sourceStepsStartOfTask.add(aStep); 
				}
			} else {
				sourceStepsStartOfTask.add(aStep); // Activation step
			}
			if (!aStep.getInputPin().isEmpty()) { // Join step
				for(Step sourceStep: collectPredecessorsStep(aStep)) {
					if (aStep.getConcurRes() != sourceStep.getConcurRes()) { // Incoming cross-task flow
						sourceStepsStartOfTask.add(aStep);
					}
				}
			}
			if (!aStep.getOutputPin().isEmpty()) { // Fork step 
				boolean atLeastOneOutgoingCrossFlow = false;
				for(Step targetStep: collectSuccessorsStep(aStep)) {
					if (aStep.getConcurRes() != targetStep.getConcurRes()) { // Outgoing cross-task flow
						sourceStepsStartOfTask.add(targetStep);
						atLeastOneOutgoingCrossFlow = true;
					}
				}
				if (atLeastOneOutgoingCrossFlow) {
					// Because current step must be last, then all successors must be start
					sourceStepsStartOfTask.addAll(collectSuccessorsStep(aStep));
				}
			}
		}
	}

	@Override
	protected void finalize(final DesignModel target) {
		
		final Collection<Step> targetStepstoExplore = new LinkedHashSet<>();
		// Move marked Steps to their new task destination
		// and track their successors
		final Copier copier = new Copier(true, true);
		final Collection<Step> targetStepsStartOfTask = new LinkedHashSet<>();
		for(Step aStep: sourceStepsStartOfTask) {
			final EList<Link> linksForSourceStep = mapping.getLinksForSource(aStep);
			for(Link lnk: linksForSourceStep) {
				if (lnk.getRationale() == identityRule) {
					final EObject copy = lnk.getUniqueTargetValue(COPY_ROLE);
					if (copy != null && copy instanceof Step) {
						final Step copyStep = (Step)copy;
						targetStepsStartOfTask.add(copyStep);
						targetTasksToBeRemoved.add(copyStep.getConcurRes());
						TaskDuplicator.moveStepToNewTask(tasksToBeLinked, copier, lnk, stepNTaskRule);
						targetStepstoExplore.addAll(collectSuccessorsStep(copyStep));
					}
				}
			}
		}
		targetStepstoExplore.removeAll(targetStepsStartOfTask);
		final Queue<Step> waveFront = new LinkedList<>(targetStepstoExplore);
		// Transform successors as a wave 
		while(!waveFront.isEmpty()) {
			final Step copyStep = waveFront.poll();
			final Collection<SchedulableResource> predTasks = collectPredecessorsTask(copyStep);
			final Collection<SchedulableResource> unmigratedPredTasks = new LinkedList<>(predTasks);
			unmigratedPredTasks.retainAll(targetTasksToBeRemoved);
			if (unmigratedPredTasks.isEmpty()) {
				// All predecessors has been moved to their new tasks
				if (predTasks.size() == 1) {
					// All predecessors have a unique same task
					// copyStep needs to move there too
					copyStep.setConcurRes(predTasks.iterator().next());
				} else {
					final EList<Link> linksForSourceStep = mapping.getLinksForSlice(copyStep);
					for(Link currentLnk: linksForSourceStep) {
						if (currentLnk.getRationale() == identityRule) {
							TaskDuplicator.moveStepToNewTask(tasksToBeLinked, copier, currentLnk, stepNTaskRule);
						}
					}
				}
				waveFront.addAll(collectUnmigratedSuccessorsStep(copyStep, targetTasksToBeRemoved));
			} else {
				// Not yet ready to known what to do
				waveFront.add(copyStep);
			}		
		}
		copier.copyReferences();
		tasksToBeCopied = collectLinkFor(targetTasksToBeRemoved);
		if (config.indexBasedName) {
			renameTasksWithIndex();
		}
		TaskDuplicator.deleteCopiedTasks(targetTasksToBeRemoved, tasksToBeLinked, tasksToBeCopied, taskDuplicationRule);
	}

	private void renameTasksWithIndex() {
		final Collection<Link> tasksLnk = mapping.getLinks(stepNTaskRule);
		final Map<SchedulableResource, Integer> perTaskCounter = new HashMap<>();
		for(Link lnk: tasksLnk) {
			if (lnk.getRationale() != stepNTaskRule) {
				continue;
			}
			final EObject source = lnk.getUniqueSourceValue(ORIGINAL_TASK_ROLE);
			assert(source instanceof SchedulableResource);
			final SchedulableResource sourceTask = (SchedulableResource)source;
			int counter = perTaskCounter.getOrDefault(sourceTask, 0);
			final String prefix = sourceTask.getName(); 
			for(EObject target: lnk.getTargets(COPY_TASK_ROLE)) {
				assert(target instanceof SchedulableResource);
				counter++;
				((SchedulableResource)target).setName(prefix + "_" + Integer.toString(counter));
			}
			perTaskCounter.put(sourceTask, counter);
		}
	}


	private Collection<? extends Step> collectUnmigratedSuccessorsStep(
			final Step copyStep,
			final Collection<SchedulableResource> targetTasksToBeRemoved) {
		final Collection<Step> result = new LinkedHashSet<>();
		for(Step aStep: collectSuccessorsStep(copyStep)) {
			if (targetTasksToBeRemoved.contains(aStep.getConcurRes())) {
				result.add(aStep);
			}
		}
		return result;
	}

	private Collection<Link> collectLinkFor(final Collection<SchedulableResource> targetTasks) {
		final Collection<Link> lnks = new LinkedHashSet<>();
		for(SchedulableResource res: targetTasks) {
			lnks.addAll(mapping.getLinksForSlice(res));
		}
		return lnks;
	}

	protected Collection<SchedulableResource> collectPredecessorsTask(final Step targetStep) {
		final Collection<SchedulableResource> tasks = new LinkedHashSet<>();
		for(Step predStep: collectPredecessorsStep(targetStep)) {
			tasks.add(predStep.getConcurRes());
		}
		return tasks;
	}

	protected Collection<Step> collectPredecessorsStep(final Step targetStep) {
		final Collection<Step> steps = new LinkedHashSet<>();
		for(InputPin ipin: targetStep.getInputPin()) {
			for(OutputPin opin: ipin.getPredecessors()) {
				if (opin.eContainer() instanceof Step) {
					steps.add((Step) opin.eContainer());
				}
			}
		}
		return steps;
	}
	
	protected Collection<Step> collectSuccessorsStep(final Step targetStep) {
		final Collection<Step> steps = new LinkedHashSet<>();
		for(OutputPin opin: targetStep.getOutputPin()) {
			for(InputPin ipin: opin.getSuccessors()) {
				if (ipin.eContainer() instanceof Step) {
					steps.add((Step) ipin.eContainer());
				}
			}
		}
		return steps;
	}
}
