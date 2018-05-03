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
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Context;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.MappableArtefact;
import org.polarsys.time4sys.mapping.MappingFactory;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Transformation;

/**
 * Duplicate Task so that each step is in its own Task.
 * 
 * @author loic
 *
 */
public class TaskDuplicator extends AbstractTransformation {

	public static final String COPY_TASK_ROLE = "copy-task";
	public static final String ORIGINAL_TASK_ROLE = "original-task";
	public static final String TRANS_NAME = ("One Task per Step Rule " + TaskDuplicator.class.getSimpleName()).intern();
	public static final String STEPNTASK_TRANS_NAME = ("one step to one task AND one step Rule " + TaskDuplicator.class.getSimpleName()).intern();
	public static final String TASK_TRANS_NAME = ("one duplicated task Rule " + TaskDuplicator.class.getSimpleName()).intern();

	public static Transformation transform(final Project project, final DesignModel source) {
		return new TaskDuplicator(project, source).transform();
	}

	private Collection<Link> stepsToBeUpdated = new LinkedHashSet<>();
	private Collection<Link> tasksToBeCopied = new LinkedHashSet<>();
	private Map<SchedulableResource, Collection<SchedulableResource>> tasksToBeLinked = new HashMap<>();
	private Context stepNTaskRule;
	private Context taskDuplicationRule;
	private Collection<SchedulableResource> tasksToBeRemoved = new LinkedHashSet<>();

	/**
	 * @param source
	 * @param project
	 * 
	 */
	public TaskDuplicator(Project project, DesignModel source) {
		super(project, source, TRANS_NAME);
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
		if (source instanceof Step) {
			stepsToBeUpdated.add(lnk);
			final SchedulableResource concurRes = ((Step)source).getConcurRes();
			if (concurRes != null) {
				tasksToBeRemoved .add(concurRes);
			}
		}
		if (source instanceof SoftwareSchedulableResource) {
			tasksToBeCopied.add(lnk);
		}
	}

	@Override
	protected void finalize(final DesignModel target) {
		final Copier copier = new Copier(true, true);
		for (Link lnk : stepsToBeUpdated) {
			moveStepToNewTask(tasksToBeLinked, copier, lnk, stepNTaskRule);
		}
		copier.copyReferences();
		deleteCopiedTasks(tasksToBeRemoved, tasksToBeLinked, tasksToBeCopied, taskDuplicationRule);
	}

	public static void deleteCopiedTasks(final Collection<SchedulableResource> sourceOrTargetTasksToBeRemoved, final Map<SchedulableResource, Collection<SchedulableResource>> tasksToBeLinked, final Collection<Link> tasksToBeCopied, final Context taskDuplicationRule) {
		for(Link lnk: tasksToBeCopied) {
			final SoftwareSchedulableResource source = (SoftwareSchedulableResource) lnk.getUniqueSourceValue(IdentityDerivation.ORIGINAL_ROLE);
			final SoftwareSchedulableResource copy = (SoftwareSchedulableResource) lnk.getUniqueTargetValue(IdentityDerivation.COPY_ROLE);
			if (!sourceOrTargetTasksToBeRemoved.contains(source) && !sourceOrTargetTasksToBeRemoved.contains(copy)) {
				continue;
			}
			lnk.setRationale(taskDuplicationRule);
			// Remove all current targets (actually only one copy)
			lnk.getTargets().clear();
			// Add duplicates
			for(SchedulableResource targetDup: registeredCopiesOf(tasksToBeLinked, copy)) {
				lnk.getTargets().add(MappingFactory.eINSTANCE.createMappableArtefact(COPY_TASK_ROLE, targetDup));
			}
			// delete copy from model
			EcoreUtil.delete(copy, true); //TODO filter which ine
		}
	}

	public static void moveStepToNewTask(final Map<SchedulableResource, Collection<SchedulableResource>> tasksToBeLinked, final Copier copier, final Link lnk, final Context rule) {
		final Step source = (Step) lnk.getUniqueSourceValue("original");
		final Step copy = (Step) lnk.getUniqueTargetValue("copy");
		final SchedulableResource sourceTask = source.getConcurRes();
		final SchedulableResource copyTask = copy.getConcurRes();
		
		final SchedulableResource targetTask = (SchedulableResource) copier.copy(copyTask);
		targetTask.setHost(copyTask.getHost());
		targetTask.setDependentScheduler(copyTask.getDependentScheduler());
		registerCopyOf(tasksToBeLinked, targetTask, copyTask);
		targetTask.setName(sourceTask.getName() + "_x_" + source.getName());
		assert(copyTask.eContainer() != null);
		((Resource)copyTask.eContainer()).getOwnedResource().add(targetTask);
		assert(targetTask.eContainer() != null);
		assert(copyTask.eContainer() == targetTask.eContainer());
		copy.setConcurRes(targetTask);
		final MappableArtefact origTaskMap = MappingFactory.eINSTANCE.createMappableArtefact(ORIGINAL_TASK_ROLE, sourceTask);
		final MappableArtefact copyTaskMap = MappingFactory.eINSTANCE.createMappableArtefact(COPY_TASK_ROLE, targetTask);
		lnk.getSources().add(origTaskMap);
		lnk.getTargets().add(copyTaskMap);
		lnk.setRationale(rule);
		/*assert(lnk.getSources().size() == 2);
		assert(lnk.getTargets().size() == 2);*/
	}

	protected static Collection<SchedulableResource> registeredCopiesOf(final Map<SchedulableResource, Collection<SchedulableResource>> tasksToBeLinked, final SoftwareSchedulableResource copyTask) {
		final Collection<SchedulableResource> result = tasksToBeLinked.get(copyTask);
		if (result == null) {
			return Collections.emptyList();
		}
		return result;
	}

	protected static void registerCopyOf(final Map<SchedulableResource, Collection<SchedulableResource>> tasksToBeLinked, final SchedulableResource targetTask, final SchedulableResource copyTask) {
		Collection<SchedulableResource> copies = tasksToBeLinked.get(copyTask);
		if (copies == null) {
			copies = new LinkedHashSet<>();
			tasksToBeLinked.put(copyTask, copies);
		}
		copies.add(targetTask);
	}
}
