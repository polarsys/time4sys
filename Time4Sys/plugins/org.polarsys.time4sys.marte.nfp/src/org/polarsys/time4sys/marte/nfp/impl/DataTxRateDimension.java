/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Lo�c Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.marte.nfp.impl;

import java.util.List;

import org.polarsys.time4sys.marte.nfp.DataTxRateUnitKind;

/**
 * @author loic
 *
 */
public class DataTxRateDimension extends DimensionImpl<DataTxRateUnitKind> {
	
	public static final DataTxRateDimension dataTxRateDimension = new DataTxRateDimension();
	
	protected static double[] FACTORS = {1.0 , 1000.0, 1000.0};

	public DataTxRateDimension() {
		super("DataTxRate");
	}

	@Override
	public List<DataTxRateUnitKind> getValues() {
		return DataTxRateUnitKind.VALUES;
	}

	@Override
	public DataTxRateUnitKind getLowestUnit() {
		return DataTxRateUnitKind.BPER_S;
	}

	@Override
	public DataTxRateUnitKind get(int value) {
		return DataTxRateUnitKind.get(value);
	}

	@Override
	public double[] getFactors() {
		return FACTORS;
	}

}
