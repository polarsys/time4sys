/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and code
 *******************************************************************************/
package org.polarsys.time4sys.transformations;

import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.builder.design.StepBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.model.time4sys.Project;

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
