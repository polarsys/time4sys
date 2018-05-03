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

import org.eclipse.emf.common.util.Enumerator;
import org.polarsys.time4sys.marte.nfp.Dimension;

/**
 * @author loic
 *
 */
public abstract class DimensionImpl<U extends Enumerator> implements Dimension<U> {

	protected final String name; 
	
	public DimensionImpl(final String name) {
		this.name = name;
		assert(name != null);
	}

	/**
	 * 
	 * @param unit1
	 * @param unit2
	 * @return the smallest unit of both.
	 */
	public U findClosestUnitTo(final U unit1, final U unit2) {
		return get(Math.min(unit1.getValue(), unit2.getValue()));
	}
	
	/**
	 * Returns the factor to apply on value to convert from source unit to target unit. 
	 * @param from
	 * @param to
	 * @return factor for conversion
	 */
	public double getConversionFactor(final U source, final U target) {
		final double factors[] = getFactors();
		double f = 1.0;
		if (source == target) {
			return f;
		}
		if (source.getValue() < target.getValue()) {
			return 1.0 / getConversionFactor(target, source);
		}
		assert(source.getValue() > target.getValue());
		for(int i = source.getValue(); i > target.getValue(); i--) {
			f = f * factors[i];
		}
		return f;
	}

	public abstract double[] getFactors();

	@Override
	public String getName() {
		return name;
	}

	@Override
	public abstract U get(int value);
}
