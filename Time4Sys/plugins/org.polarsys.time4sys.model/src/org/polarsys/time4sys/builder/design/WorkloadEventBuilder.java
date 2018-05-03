/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 * 
 */
package org.polarsys.time4sys.builder.design;

import org.polarsys.time4sys.marte.gqam.ArrivalPattern;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;

/**
 * @author loic
 *
 */
public class WorkloadEventBuilder {

	private DesignBuilder design;
	private WorkloadEvent evt;

	public WorkloadEventBuilder(final DesignBuilder designBuilder, final WorkloadEvent taskActivation) {
		assert(taskActivation != null);
		this.design = designBuilder;
		this.evt = taskActivation;
	}

	public WorkloadEventBuilder forStep(final StepBuilder firstStep) {
		return forStep(firstStep.build());
	}

	public WorkloadEventBuilder forStep(Step step) {
		evt.setEffect(step);
		final String stepName = step.getName();
		if (stepName != null) {
			evt.setName(stepName + " activator");
		}
		return this;
	}
	
	public WorkloadEvent build() {
		return evt;
	}

	public void ofOffset(String value) {
		final ArrivalPattern ptrn = evt.getPattern();
		if (ptrn instanceof PeriodicPattern) {
			final PeriodicPattern p = (PeriodicPattern)ptrn;
			p.setPhase(NfpFactory.eINSTANCE.createDurationFromString(value));
		}
	}
	
	public Duration getOffset() {
		final ArrivalPattern ptrn = evt.getPattern();
		if (ptrn instanceof PeriodicPattern) {
			final PeriodicPattern p = (PeriodicPattern)ptrn;
			return p.getPhase();
		}
		throw new IllegalStateException("Pattern is not period: " + ptrn.getClass().getName());
	}

	public void ofJitter(String value) {
		final ArrivalPattern ptrn = evt.getPattern();
		if (ptrn instanceof PeriodicPattern) {
			final PeriodicPattern p = (PeriodicPattern)ptrn;
			p.setJitter(NfpFactory.eINSTANCE.createDurationFromString(value));
		}
	}
}
