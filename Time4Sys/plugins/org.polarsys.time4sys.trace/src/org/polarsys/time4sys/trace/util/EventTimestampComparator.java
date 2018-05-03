/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.trace.util;

import java.util.Comparator;

import org.polarsys.time4sys.marte.nfp.util.DurationComparator;
import org.polarsys.time4sys.trace.Event;

/**
 * @author loic
 *
 */
public class EventTimestampComparator implements Comparator<Event> {
	
	public static final EventTimestampComparator INSTANCE = new EventTimestampComparator();

	@Override
	public int compare(Event o1, Event o2) {
		return DurationComparator.INSTANCE.compare(o1.getTimestamp(), o2.getTimestamp());
	}
	
}
