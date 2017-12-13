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

import org.polarsys.time4sys.trace.SchedulingEvent;
import org.polarsys.time4sys.trace.SchedulingEventKind;
import org.polarsys.time4sys.trace.Slice;
import org.polarsys.time4sys.trace.SliceKind;
import org.polarsys.time4sys.trace.TraceFactory;

public class SliceBuilder {

	private Slice slice;
	private TraceBuilder trace;

	public SliceBuilder(final TraceBuilder traceBuilder, final Slice aSlice) {
		trace = traceBuilder;
		slice = aSlice;
	}

	public EventBuilder logEvent(final SchedulingEventKind value) {
		final SchedulingEvent evt = TraceFactory.eINSTANCE.createSchedulingEvent();
		evt.setKind(value);
		slice.getEvents().add(evt);
		final EventBuilder evtBuilder = new EventBuilder(this, evt);
		trace.hasEvent(evtBuilder);
		return evtBuilder;
	}

	public SliceBuilder hasJobSlice() {
		final Slice jobSlice = TraceFactory.eINSTANCE.createSlice();
		slice.getOwnedSubSlices().add(jobSlice);
		jobSlice.setKind(SliceKind.JOB);
		return new SliceBuilder(trace, jobSlice);
	}

	public SliceBuilder activatedAt(final String pit) {
		logEvent(SchedulingEventKind.ACTIVATED).at(pit);
		return this;
	}

	public SliceBuilder startedAt(final String pit) {
		logEvent(SchedulingEventKind.RUNNING).at(pit);
		return this;
	}

	public SliceBuilder endedAt(final String pit) {
		logEvent(SchedulingEventKind.TERMINATED).at(pit);
		return this;
	}

	public SliceBuilder called(final String name) {
		slice.setName(name);
		return this;
	}

	public SliceBuilder isConcernedBy(final SliceBuilder subSlice) {
		slice.getSubSlices().add(subSlice.build());
		return this;
	}

	public Slice build() {
		return slice;
	}

}
