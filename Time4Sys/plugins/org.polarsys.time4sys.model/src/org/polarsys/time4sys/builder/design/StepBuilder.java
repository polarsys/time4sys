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
/**
 * 
 */
package org.polarsys.time4sys.builder.design;

import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.marte.gqam.ArrivalPattern;
import org.polarsys.time4sys.marte.gqam.ConnectorKind;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * @author loic
 *
 */
public class StepBuilder {
	
	protected static DesignFactory df = DesignFactory.eINSTANCE;
	protected static GqamFactory gqamFactory = GqamFactory.eINSTANCE;
	protected static SrmFactory srmFactory = SrmFactory.eINSTANCE;
	protected static GrmFactory grmFactory = GrmFactory.eINSTANCE;
	protected static HrmFactory hrmFactory = HrmFactory.eINSTANCE;
	protected static NfpFactory nfpFactory = NfpFactory.eINSTANCE;
	
	private TaskBuilder task;
	private DesignBuilder design;
	private Step step;
	private String deadline;

	public StepBuilder(final DesignBuilder designBuilder, final TaskBuilder taskBuilder) {
		assert(designBuilder != null);
		task = taskBuilder;
		design = designBuilder;
		step = null;	
	}

	public StepBuilder(DesignBuilder designBuilder, TaskBuilder taskBuilder, final Step raw) {
		assert(designBuilder != null);
		assert(raw != null);
		task = taskBuilder;
		design = designBuilder;
		step = raw;
	}

	public Step build() {
		if (step != null) {
			return step;
		}
		step = gqamFactory.createExecutionStep();
		design.getMainScenario().getSteps().add(step);
		if (task != null) {
			step.setConcurRes(task.build(design));
		}
		return step;
	}

	public StepBuilder ofWCET(final String wcet) {
		build().setWorstCET(nfpFactory.createDurationFromString(wcet));
		return this;
	}

	public StepBuilder ofBCET(final String bcet) {
		build().setBestCET(nfpFactory.createDurationFromString(bcet));
		return this;
	}

	public StepBuilder isFollowedByAStep() {
		final StepBuilder res = new StepBuilder(design, task);
		activates(res);
		return res;
	}

	private PrecedenceRelation getOutputRel() {
		PrecedenceRelation res = build().getOutputRel();
		if (res == null) {
			res = design.hasAPrecedenceRelation().build();
			step.setOutputRel(res);
		}
		return res;
	}

	public TaskBuilder getTask() {
		return task;
	}
	
	public void setTask(final TaskBuilder task) {
		assert(task != null);
		this.task = task;
		if (step != null) {
			step.setConcurRes(task.build(design));
		}
		if (deadline != null) {
			task.ofDeadline(deadline);
		}
	}

	public StepBuilder called(final String value) {
		build().setName(value);
		return this;
	}
	
	protected WorkloadEventBuilder getWorkloadEvent() {
		WorkloadEventBuilder cause;
		if (step.getCause().isEmpty()) {
			throw new IllegalArgumentException("");
		} else {
			cause = new WorkloadEventBuilder(design, step.getCause().get(0));
		}
		return cause;
	}

	public StepBuilder isPeriodic(final String period) {
		WorkloadEvent cause;
		if (step.getCause().isEmpty()) {
			cause = design.hasAPeriodicEvent(period).forStep(step).build();
		} else {
			cause = step.getCause().get(0);
		}
//		final ArrivalPattern p = cause.getPattern();
//		assert(p instanceof PeriodicPattern);
//		PeriodicPattern ptrn = (PeriodicPattern)p;
//		assert(NfpFactory.eINSTANCE.createDurationFromString(period).equals(ptrn.getPeriod()));
		return this;
	}
	
	public StepBuilder withSlidingWindow(int nbEvents, final String windowSize) {
		WorkloadEvent cause;
		if (step.getCause().isEmpty()) {
			cause = design.hasASlidingWindowEvent(nbEvents, windowSize).forStep(step).build();
		} else {
			cause = step.getCause().get(0);
		}
		return this;
	}

	public StepBuilder ofET(String value) {
		return ofWCET(value).ofBCET(value);
	}

	public StepBuilder ofPeriod(String value) {
		return isPeriodic(value);
	}

	public StepBuilder hasJitter(String jitter) {
		getWorkloadEvent().ofJitter(jitter);
		return this;
	}
	
	public StepBuilder ofOffset(String value) {
		getWorkloadEvent().ofOffset(value);
		return this;
	}
	
	public StepBuilder ofDeadline(final String value) {
		deadline = value;
		if (task != null) {
			task.ofDeadline(value);
		}
		return this;
	}

	public void activates(final StepBuilder... successors) {
		for(StepBuilder successor: successors) {
			assert(successor != null);
			final Step nextStep = successor.build();
			assert(nextStep != null);
			// for each pairs, first look if one has already an inputRel or outputRel and reuse accordingly 
			if (nextStep.getInputRel() != null) {
				nextStep.getInputRel().getPredec().add(build());
			} else {
				getOutputRel().getSucces().add(nextStep);
			}
		}
	}

	public StepBuilder ofJitter(String value) {
		getWorkloadEvent().ofJitter(value);
		return this;
	}

}
