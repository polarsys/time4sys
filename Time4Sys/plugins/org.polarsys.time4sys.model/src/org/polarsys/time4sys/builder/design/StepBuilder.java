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

import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;
import org.polarsys.time4sys.marte.gqam.ResourceServiceExcecution;
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
	
	public static StepBuilder aStep(final DesignBuilder designBuilder) {
		return new StepBuilder(designBuilder, null);
	}
	
	public static StepBuilder aResourceServiceExcecution(final DesignBuilder designBuilder) {
		return new StepBuilder(designBuilder, null).isResourceServiceExecution();
	}

	private SchedulableResourceBuilder<?,?> task;
	private DesignBuilder design;
	private Step step;
	private String deadline;
	private boolean isResourceServiceExecution = false;
	private AlarmBuilder reset;
	private AlarmBuilder activatedBy;
	private int reentrantBuild = 0;
	private String name;
	private Boolean isAtomic = null;

	public StepBuilder(final DesignBuilder designBuilder, final SchedulableResourceBuilder<?,?> taskBuilder) {
		assert(designBuilder != null);
		task = taskBuilder;
		design = designBuilder;
		step = null;	
	}

	public StepBuilder(DesignBuilder designBuilder, SchedulableResourceBuilder<?,?> taskBuilder, final Step raw) {
		assert(designBuilder != null);
		assert(raw != null);
		task = taskBuilder;
		design = designBuilder;
		step = raw;
	}

	public Step build() {
		if (step == null) {
			step = createRawStep();
		}
		if (name != null) {
			step.setName(name);
		}
		if (!design.getMainScenario().getSteps().contains(step)) {
			design.getMainScenario().getSteps().add(step);
		}
		if (reentrantBuild  > 2) { // Cutting potential recursive build between task and step
			return step;
		}
		reentrantBuild++;
		if (task != null) {
			step.setConcurRes(task.build(design));
		}
		if (step instanceof ResourceServiceExcecution) {
			final ResourceServiceExcecution resExec = (ResourceServiceExcecution)step;
			if (reset != null) {
				resExec.setResourceService(reset.buildResetService(design));
			}
			if (activatedBy != null) {
				resExec.setResourceService(activatedBy.buildSignalService(design));
			}
		}
		if (isAtomic != null) {
			step.setIsAtomic(isAtomic);
		}
		reentrantBuild--;
		return step;
	}

	public Step createRawStep() {
		if (isResourceServiceExecution) {
			return gqamFactory.createResourceServiceExcecution();
		} else {
			return gqamFactory.createExecutionStep();
		}
	}

	private StepBuilder isResourceServiceExecution() {
		isResourceServiceExecution = true;
		return this;
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
		return (TaskBuilder)task;
	}
	
	public CommunicationChannelBuilder getChannel() {
		return (CommunicationChannelBuilder)task;
	}
	
	public void setConcurRes(final SchedulableResourceBuilder<?, ?> task) {
		assert(task != null);
		this.task = task;
		if (step != null) {
			step.setConcurRes(task.build(design));
		}
	}
	
	public void setChannel(final CommunicationChannelBuilder task) {
		setConcurRes(task);
	}
	
	public void setTask(final TaskBuilder task) {
		setConcurRes(task);
		if (deadline != null) {
			task.ofDeadline(deadline);
		}
	}

	public StepBuilder called(final String value) {
		name = value;
		return this;
	}

	public String name() {
		if (name != null) {
			return name;
		}
		if (step != null) {
			return step.getName();
		}
		return name;
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
		if (step == null) {
			build();
		}
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
	
	public StepBuilder isSporadic(final String minInterarrival, final String maxInterarrival) {
		WorkloadEvent cause;
		if (step.getCause().isEmpty()) {
			cause = design.hasSporadicEvent(minInterarrival, maxInterarrival).forStep(step).build();
		} else {
			cause = step.getCause().get(0);
		}
		return this;
	}
	

	public StepBuilder isActivatedOnce() {
		WorkloadEvent cause;
		if (step.getCause().isEmpty()) {
			cause = design.hasActivationOnce().forStep(step).build();
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
		if (task != null && (task instanceof TaskBuilder)) {
			((TaskBuilder)task).ofDeadline(value);
		}
		return this;
	}

	public void activates(final StepBuilder... successors) {
		final Step origin = build();
		this.hasAtLeastOneOutputPin();
		for(OutputPin outputPin: origin.getOutputPin()) {
			for(StepBuilder successor: successors) {
				final InputPinBuilder inputPin = successor.hasAtLeastOneInputPin();
				outputPin.getSuccessors().add(inputPin.build());
				inputPin.withExactBound(inputPin.getSizeOfPredecessors());
			}
			final int nbSuccessors = outputPin.getSuccessors().size();
			outputPin.setLowerBound(nbSuccessors);
			outputPin.setUpperBound(nbSuccessors);
		}
	}
	
	public InputPinBuilder hasOneInputPinNamed(final String pinName) {
		build();
		InputPinBuilder r = null;
		for(InputPin ip: step.getInputPin()) {
			if (pinName.equals(ip.getName())) {
				r = new InputPinBuilder(ip);
				break;
			}
		}
		if (r == null) {
			r = new InputPinBuilder(step);
			r.called(pinName);
		}
		return r;
	}
	
	public InputPinBuilder inputPinNamed(final String pinName) {
		return hasOneInputPinNamed(pinName);
	}
	
	public OutputPinBuilder hasOneOutputPinNamed(final String pinName) {
		build();
		OutputPinBuilder r = null;
		for(OutputPin ip: step.getOutputPin()) {
			if (pinName.equals(ip.getName())) {
				r = new OutputPinBuilder(ip);
				break;
			}
		}
		if (r == null) {
			r = new OutputPinBuilder(step);
			r.called(pinName);
		}
		return r;
	}
	
	public OutputPinBuilder outputPinNamed(final String pinName) {
		return hasOneOutputPinNamed(pinName);
	}

	public InputPinBuilder hasAtLeastOneInputPin() {
		build();
		final InputPinBuilder r;
		if (step.getInputPin().isEmpty()) {
			r = new InputPinBuilder(step);
		} else {
			r = new InputPinBuilder(step.getInputPin().get(0));
		}
		return r;
	}

	public OutputPinBuilder hasAtLeastOneOutputPin() {
		build();
		final OutputPinBuilder r;
		if (step.getOutputPin().isEmpty()) {
			r = new OutputPinBuilder(step);
		} else {
			r = new OutputPinBuilder(step.getOutputPin().get(0));
		}
		return r;
	}

	public StepBuilder ofJitter(String value) {
		getWorkloadEvent().ofJitter(value);
		return this;
	}

	public StepBuilder thatResets(final AlarmBuilder watchdog) {
		isResourceServiceExecution = true;
		reset = watchdog;
		return this;
	}

	public StepBuilder activatedBy(final AlarmBuilder alarm) {
		isResourceServiceExecution = true;
		activatedBy = alarm;
		return this;
	}

	public StepBuilder isAtomic() {
		return isAtomic(true);
	}

	public StepBuilder isAtomic(boolean value) {
		isAtomic  = value;
		return this;
	}

	public AlarmBuilder activation() {
		// TODO Auto-generated method stub
		return null;
	}

	public void withReference(final ReferenceBuilder ref) {
		if (ref == null) {
			return;
		}
		if (!step.getCause().isEmpty()) {
			for(WorkloadEvent cause: step.getCause()) {
				cause.getPattern().setReference(ref.build());
			}
		}
	}

}
