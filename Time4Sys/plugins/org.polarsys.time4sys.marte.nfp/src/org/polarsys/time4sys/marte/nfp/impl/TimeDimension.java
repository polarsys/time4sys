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
package org.polarsys.time4sys.marte.nfp.impl;

import java.util.List;

import org.polarsys.time4sys.marte.nfp.TimeUnitKind;

/**
 * @author loic
 *
 */
public class TimeDimension extends DimensionImpl<TimeUnitKind> {
	
	public static final TimeDimension timeDimension = new TimeDimension();
	
	protected static double[] FACTORS = {1.0, 1.0, 1000.0, 1000.0, 1000.0, 1000.0, 60.0, 60.0, 24.0};

	public TimeDimension() {
		super("DataSize");
	}

	@Override
	public List<TimeUnitKind> getValues() {
		return TimeUnitKind.VALUES;
	}

	@Override
	public TimeUnitKind getLowestUnit() {
		return TimeUnitKind.PS;
	}

	@Override
	public TimeUnitKind get(int value) {
		return TimeUnitKind.get(value);
	}

	@Override
	public double[] getFactors() {
		return FACTORS;
	}

}
