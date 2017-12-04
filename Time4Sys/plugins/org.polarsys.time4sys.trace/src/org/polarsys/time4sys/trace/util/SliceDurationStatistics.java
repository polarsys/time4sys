/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lo�c Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.trace.util;

import java.util.List;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.impl.LongDurationImpl;
import org.polarsys.time4sys.trace.Event;
import org.polarsys.time4sys.trace.SchedulingEvent;
import org.polarsys.time4sys.trace.Slice;

/**
 * @author Utilisateur
 *
 */
public class SliceDurationStatistics {

	/**
	 * This is an helper class
	 */
	private SliceDurationStatistics() {
	}

	public static Duration computeExecutionTimeDuration(final Slice root) {
		Duration accumulator = LongDurationImpl.ZERO;
		accumulator = computeExecutionTimeDuration(root.getEvents());
		for (Slice sub : root.getSubSlices()) {
			accumulator = accumulator.add(computeExecutionTimeDuration(sub));
		}
		for (Slice sub : root.getOwnedSubSlices()) {
			accumulator = accumulator.add(computeExecutionTimeDuration(sub));
		}
		return accumulator;
	}

	private static Duration computeExecutionTimeDuration(final List<Event> events) {
		Duration accumulator = LongDurationImpl.ZERO;
		Duration start = null;;
		for(Event evt: events) {
			if (evt instanceof SchedulingEvent) {
				final SchedulingEvent schedEvt = (SchedulingEvent)evt;
				switch(schedEvt.getKind()) {
				case RUNNING:
					start = schedEvt.getTimestamp();
					break;
				case BLOCKED:
				case SUSPENDED:
				case TERMINATED:
					final Duration end = schedEvt.getTimestamp();
					if (start != null) {
						assert(start.compareTo(end) <= 0);
						accumulator = accumulator.add(end.sub(start));
					}
					start = null;
					break;
				default:
					//Nothing to do
				}
			}
		}
		return accumulator;
	}

}
