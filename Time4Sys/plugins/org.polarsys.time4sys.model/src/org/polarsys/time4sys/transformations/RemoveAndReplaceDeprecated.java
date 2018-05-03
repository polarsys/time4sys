/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and code
 *******************************************************************************/
package org.polarsys.time4sys.transformations;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.builder.design.StepBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.grm.EDFParameters;
import org.polarsys.time4sys.marte.grm.FixedPriorityParameters;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourcePackage;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.model.time4sys.Project;

/**
 * In-place transformation to remove deprecated constructions.
 * @author loic
 *
 */
public class RemoveAndReplaceDeprecated {
	
	public static void removeAndReplaceDeprecated(final Project project) {
		new RemoveAndReplaceDeprecated(project).transform();
	}

	private Project project;
	private DesignBuilder designBuilder;

	public RemoveAndReplaceDeprecated(final Project project) {
		this.project = project;
	}
	
	public void transform() {
		if (project == null) {
			return;
		}
		transform(project.getDesign());
		for(DesignModel model: project.getDerivations()) {
			transform(model);
		}
	}

	protected void transform(final DesignModel design) {
		if (design == null) {
			return;
		}
		designBuilder = new DesignBuilder(design);
		for(BehaviorScenario scn: design.getWorkloadBehavior().getBehavior()) {
			transform(scn);
		}
		transform(design.getResourcePackage());
	}

	protected void transform(final ResourcePackage resourcePackage) {
		final Queue<Object> queue = new LinkedBlockingQueue<>();
		queue.addAll(resourcePackage.getOwnedElement());
		while (!queue.isEmpty()) {
			final Object current = queue.poll();
			System.out.print(current.toString());
			if (current instanceof ResourcePackage) {
				queue.addAll(((ResourcePackage)current).getOwnedElement());
			}
			if (current instanceof Resource) {
				queue.addAll(((Resource)current).getOwnedResource());
			}
			if (current instanceof SoftwareSchedulableResource) {
				transform((SoftwareSchedulableResource)current);
			}
		}
	}

	protected void transform(final SoftwareSchedulableResource current) {
		final LinkedList<SchedulingParameter> params = new LinkedList<SchedulingParameter>(current.getSchedParams());
		for(SchedulingParameter param: params) {
			if ("FixedPriority".equals(param.getName()) && !(param instanceof FixedPriorityParameters)) {
				current.getSchedParams().remove(param);
				final FixedPriorityParameters fpParam = GrmFactory.eINSTANCE.createFixedPriorityParameters();
				fpParam.setName(org.polarsys.time4sys.builder.design.TaskBuilder.FP_POLICY_NAME);
				fpParam.setPriority(Integer.parseInt(param.getValue()));
				current.getSchedParams().add(fpParam);
			}
			if ("Deadline".equals(param.getName()) && !(param instanceof EDFParameters)) {
				current.getSchedParams().remove(param);
				if (param.getValue() != null && !param.getValue().isEmpty()) {
					final EDFParameters edfParam = GrmFactory.eINSTANCE.createEDFParameters();
					edfParam.setDeadline(NfpFactory.eINSTANCE.createDurationFromString(param.getValue()));
					edfParam.setName(org.polarsys.time4sys.builder.design.TaskBuilder.EDF_POLICY_NAME);
					current.getSchedParams().add(edfParam);
				}
			}
		}
	}

	protected void transform(final BehaviorScenario scenario) {
		if (scenario == null) {
			return;
		}
		if (scenario instanceof Step) {
			transform(((Step)scenario).getChildScenario());
		}
		for(PrecedenceRelation rel: scenario.getConnectors()) {
			transform(rel);
		}
		scenario.getConnectors().clear();
	}

	protected void transform(final PrecedenceRelation rel) {
		for(Step next: rel.getSucces()) {
			final StepBuilder nextB = new StepBuilder(designBuilder, null, next);
			for(Step pred: rel.getPredec()) {
				final StepBuilder predB = new StepBuilder(designBuilder, null, pred);
				nextB.hasOneInputPinNamed("token" + pred.getName()).activatedBy(predB).build();
			}
		}
	}

}
