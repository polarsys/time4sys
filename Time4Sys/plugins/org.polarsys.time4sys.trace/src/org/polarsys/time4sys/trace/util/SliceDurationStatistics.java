/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
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

	/**
	 * Compute the total execution duration.  
	 * @param events
	 * @return
	 */
	public static Duration computeExecutionTimeDuration(final List<Event> events) {
		Duration accumulator = LongDurationImpl.ZERO;
		Duration start = null;;
		for(Event evt: events) {
			if (evt instanceof SchedulingEvent) {
				final SchedulingEvent schedEvt = (SchedulingEvent)evt;
				switch(schedEvt.getKind()) {
				case ACTIVATED: // In case the events is malformed.
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
