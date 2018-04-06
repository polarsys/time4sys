/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.transformations;

import java.util.HashMap;
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
import org.polarsys.time4sys.transformations.CopierMapper.Observer;

/**
 * Duplicate Task so that each step is in its own Task.
 * 
 * @author loic
 *
 */
public class TaskDuplicator extends IdentityDerivation implements Observer {

	public static final String COPY_TASK_ROLE = "copy-task";
	public static final String ORIGINAL_TASK_ROLE = "original-task";
	public static final String TRANS_NAME = ("One Task per Step Rule " + TaskDuplicator.class.getSimpleName()).intern();
	public static final String STEPNTASK_TRANS_NAME = ("one step to one task AND one step Rule " + TaskDuplicator.class.getSimpleName()).intern();
	public static final String TASK_TRANS_NAME = ("one duplicated task Rule " + TaskDuplicator.class.getSimpleName()).intern();

	public static Transformation transform(final Project project, final DesignModel source) {
		return new TaskDuplicator(project, source).transform();
	}

	private Context taskDuplication;
	private List<Link> stepsToBeUpdated = new LinkedList<>();
	private List<Link> tasksToBeRemoved = new LinkedList<>();
	private Map<SchedulableResource, List<SchedulableResource>> tasksToBeLinked = new HashMap<>();
	private Context stepNTaskRule;
	private Context taskDuplicationRule;

	/**
	 * @param source
	 * @param project
	 * 
	 */
	public TaskDuplicator(Project project, DesignModel source) {
		super(project, source);
	}

	public CopierMapper createCopierMapper() {
		final CopierMapper result = super.createCopierMapper();
		result.addObserver(this);
		return result;
	}

	public void createRules() {
		super.createRules();
		taskDuplication = mappingFactory.createContext(TRANS_NAME);
		stepNTaskRule = mappingFactory.createContext(STEPNTASK_TRANS_NAME);
		taskDuplicationRule = mappingFactory.createContext(TASK_TRANS_NAME);
		mapping.getRules().add(taskDuplication);
		mapping.getRules().add(stepNTaskRule);
		mapping.getRules().add(taskDuplicationRule);
	}

	public Transformation transform() {
		final Transformation result = super.transform();
		result.getMapping().setRationale(taskDuplication);
		return result;
	}

	@Override
	public void copied(final EObject source, final Link lnk, final EObject theCopy) {
		if (source instanceof Step) {
			stepsToBeUpdated.add(lnk);
		}
		if (source instanceof SoftwareSchedulableResource) {
			tasksToBeRemoved.add(lnk);
		}
	}

	protected void finalize(final DesignModel target) {
		super.finalize(target);
		final Copier copier = new Copier(true, true);
		for (Link lnk : stepsToBeUpdated) {
			final Step source = (Step) lnk.getUniqueSourceValue("original");
			final Step copy = (Step) lnk.getUniqueTargetValue("copy");
			final SchedulableResource sourceTask = source.getConcurRes();
			final SchedulableResource copyTask = copy.getConcurRes();
			
			final SchedulableResource targetTask = (SchedulableResource) copier.copy(copyTask);
			registerCopyOf(targetTask, copyTask);
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
			lnk.setRationale(stepNTaskRule);
			assert(lnk.getSources().size() == 2);
			assert(lnk.getTargets().size() == 2);
		}
		copier.copyReferences();
		for(Link lnk: tasksToBeRemoved) {
			lnk.setRationale(taskDuplicationRule);
			final SoftwareSchedulableResource copy = (SoftwareSchedulableResource) lnk.getUniqueTargetValue(IdentityDerivation.COPY_ROLE);
			// Remove all current targets (actually only one copy)
			lnk.getTargets().clear();
			// Add duplicates
			for(SchedulableResource targetDup: registeredCopiesOf(copy)) {
				lnk.getTargets().add(MappingFactory.eINSTANCE.createMappableArtefact(COPY_TASK_ROLE, targetDup));
			}
			// delete copy from model
			EcoreUtil.delete(copy, true);
		}
	}

	protected List<SchedulableResource> registeredCopiesOf(final SoftwareSchedulableResource copyTask) {
		return tasksToBeLinked.get(copyTask);
	}

	protected void registerCopyOf(final SchedulableResource targetTask, final SchedulableResource copyTask) {
		List<SchedulableResource> copies = tasksToBeLinked.get(copyTask);
		if (copies == null) {
			copies = new LinkedList<>();
			tasksToBeLinked.put(copyTask, copies);
		}
		copies.add(targetTask);
	}
}
