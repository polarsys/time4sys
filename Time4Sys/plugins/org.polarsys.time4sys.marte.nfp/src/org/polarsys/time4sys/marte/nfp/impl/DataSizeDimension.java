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

import org.polarsys.time4sys.marte.nfp.DataSizeUnitKind;

/**
 * @author loic
 *
 */
public class DataSizeDimension extends DimensionImpl<DataSizeUnitKind> {
	
	public static final DataSizeDimension dataSizeDimension = new DataSizeDimension();
	
	protected static double[] FACTORS = {1.0 , 8.0, 1000.0, 1000.0, 1000.0};

	public DataSizeDimension() {
		super("DataSize");
	}

	@Override
	public List<DataSizeUnitKind> getValues() {
		return DataSizeUnitKind.VALUES;
	}

	@Override
	public DataSizeUnitKind getLowestUnit() {
		return DataSizeUnitKind.BIT;
	}

	@Override
	public DataSizeUnitKind get(int value) {
		return DataSizeUnitKind.get(value);
	}

	@Override
	public double[] getFactors() {
		return FACTORS;
	}

}
