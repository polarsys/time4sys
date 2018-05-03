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
package org.polarsys.time4sys.marte.nfp;

import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

public interface Dimension<U extends Enumerator> {
	
	String getName();
	
	/**
	 * 
	 * @param unit1
	 * @param unit2
	 * @return the smallest unit of both.
	 */
	U findClosestUnitTo(U unit1, U unit2);
	
	/**
	 * Returns the factor to apply on value to convert from source unit to target unit. 
	 * @param from
	 * @param to
	 * @return factor for conversion
	 */
	double getConversionFactor(U source, U target);
	
	U get(int value);
	
	List<U> getValues();

	U getLowestUnit();
	
	/**
	 * 
	 * @return factors from one unit to the next
	 */
	double[] getFactors();
}
