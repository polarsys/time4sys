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
package org.polarsys.time4sys.marte.nfp.util;

import java.util.Comparator;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.impl.LongDurationImpl;

/**
 * @author loic
 *
 */
public class DurationComparator implements Comparator<Duration> {
	
	public static final DurationComparator INSTANCE = new DurationComparator();
	
	@Override
	public int compare(Duration v0, Duration v1) {
		if (v0 instanceof LongDurationImpl) {
			return ((LongDurationImpl)v0).compareTo(v1);
		}
		final Duration theMin = v0.min(v1);
		if (theMin == v0) {
			if (theMin == v1) {
				return 0;
			} else {
				return 1;
			}
		} else {
			return -1;
		}
	}

}
