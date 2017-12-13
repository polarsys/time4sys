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
package org.polarsys.time4sys.builder.simulation;

import org.polarsys.time4sys.builder.design.EndToEndFlowConstraintBuilder;
import org.polarsys.time4sys.builder.design.StepBuilder;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.trace.SchedulingEventKind;
import org.polarsys.time4sys.trace.Slice;
import org.polarsys.time4sys.trace.SliceKind;
import org.polarsys.time4sys.trace.Trace;
import org.polarsys.time4sys.trace.TraceFactory;
import org.polarsys.time4sys.trace.TracePackage;

/**
 * @author loic
 *
 */
public class TraceBuilder {

	private Trace trace;
	private SimulationBuilder simu;

	public TraceBuilder(final SimulationBuilder simulationBuilder, final Trace theTrace) {
		simu = simulationBuilder;
		trace = theTrace;
	}
	
	public Trace build() {
		return trace;
	}
	
	public TraceBuilder startAt(final String value) {
		final Duration pit = NfpFactory.eINSTANCE.createDurationFromString(value);
		final TimeInterval timeInt = getRange();
		timeInt.setMin(pit);
		trace.setRange(timeInt);
		return this;
	}
	
	public TraceBuilder endAt(final String value) {
		final Duration pit = NfpFactory.eINSTANCE.createDurationFromString(value);
		final TimeInterval timeInt = getRange();
		timeInt.setMax(pit);
		trace.setRange(timeInt);
		return this;
	}

	protected TimeInterval getRange() {
		final TimeInterval timeInt;
		if (trace.eIsSet(TracePackage.eINSTANCE.getTrace_Range())) {
			timeInt = trace.getRange();
		} else {
			timeInt = NfpFactory.eINSTANCE.createTimeInterval();
		}
		return timeInt;
	}

	public EventBuilder logActivationOf(final StepBuilder step) {
		final SliceBuilder aSlice = getSliceFor(step);
		return aSlice.logEvent(SchedulingEventKind.ACTIVATED);
	}

	public SliceBuilder getSliceFor(final StepBuilder step) {
		//final Step aStep = step.build();
		
		final Slice aSlice = TraceFactory.eINSTANCE.createSlice();
		aSlice.setKind(SliceKind.TASK);
		aSlice.setName(step.name());
		trace.getSlices().add(aSlice);
		final SliceBuilder slice = new SliceBuilder(this, aSlice);
		/* TODO Add slice hierarchy */
		/* Add slice mapping */
		simu.withMapping().linking(step, slice);
		return slice;
	}
	

	public SliceBuilder getSliceFor(final EndToEndFlowConstraintBuilder endToEndFlow) {
		final Slice aSlice = TraceFactory.eINSTANCE.createSlice();
		aSlice.setKind(SliceKind.TEMPORAL_CHAIN);
		aSlice.setName(endToEndFlow.toString());
		trace.getSlices().add(aSlice);
		/* TODO Add slice hierarchy */
		/* Add slice mapping */
		final SliceBuilder slice = new SliceBuilder(this, aSlice);
		simu.withMapping().linking(endToEndFlow, slice);
		return slice;
	}

	public EventBuilder logStartOf(final StepBuilder step) {
		final SliceBuilder aSlice = getSliceFor(step);
		return aSlice.logEvent(SchedulingEventKind.RUNNING);
	}

	public EventBuilder logEndOf(final StepBuilder step) {
		final SliceBuilder aSlice = getSliceFor(step);
		return aSlice.logEvent(SchedulingEventKind.TERMINATED);
	}

	public SliceBuilder logAJobOf(final StepBuilder step) {
		final SliceBuilder aStepSlice = getSliceFor(step);
		final SliceBuilder aJobSlice = aStepSlice.hasJobSlice();
		return aJobSlice;
	}

	public void hasEvent(final EventBuilder evt) {
		trace.getEvents().add(evt.build());
	}

}
