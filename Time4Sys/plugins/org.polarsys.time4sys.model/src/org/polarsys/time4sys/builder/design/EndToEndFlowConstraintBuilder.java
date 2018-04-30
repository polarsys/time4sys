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

import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;
import org.polarsys.time4sys.marte.sam.SamFactory;

/**
 * @author loic
 *
 */
public class EndToEndFlowConstraintBuilder {

	public static EndToEndFlowConstraintBuilder anEndToEndConstraint() {
		return new EndToEndFlowConstraintBuilder();
	}

	private StepBuilder stimuli;
	private StepBuilder response;
	private Duration deadline;
	private EndToEndFlow endToEndFlow;
	
	public EndToEndFlowConstraintBuilder() {
	}

	public EndToEndFlowConstraintBuilder(final EndToEndFlow value) {
		endToEndFlow = value;
	}

	public EndToEndFlowConstraintBuilder from(final TaskBuilder task) {
		stimuli = task.firstStep();
		return this;
	}
	
	public EndToEndFlowConstraintBuilder from(final StepBuilder step) {
		stimuli = step;
		return this;
	}

	public EndToEndFlowConstraintBuilder to(final TaskBuilder task) {
		response = task.firstStep();
		return this;
	}

	public EndToEndFlowConstraintBuilder withDeadline(final String value) {
		deadline = NfpFactory.eINSTANCE.createDurationFromString(value);
		return this;
	}

	public void build(final DesignBuilder designBuilder) {
		if (endToEndFlow == null) {
			endToEndFlow = SamFactory.eINSTANCE.createEndToEndFlow();
			designBuilder.build().getEndToEndFlows().add(endToEndFlow);
		}
		if (stimuli != null) {
			final Step initiator = stimuli.build();
			for(WorkloadEvent cause: initiator.getCause()) {
				endToEndFlow.getEndToEndStimuli().add(cause);
			}
		}
		if (response != null) {
			final Step endor = response.build();
			endToEndFlow.setEndToEndScenario(endor);
		}
		if (deadline != null) {
			endToEndFlow.setEndToEndDeadline(deadline);
		}
	}

	public EndToEndFlow build() {
		if (endToEndFlow == null) {
			throw new IllegalStateException("Illegal API order of calls.");
		}
		return endToEndFlow;
	}

}
