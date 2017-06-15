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
package org.polarsys.time4sys.marte.nfp.impl;

import org.eclipse.emf.ecore.EObject;
import org.junit.Before;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;

/**
 * @author loic
 *
 */
public class LongDurationImplTest extends AbstractRealWithUnitValueImplTest<TimeUnitKind, Duration> {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		zero = new LongDurationImpl(0, TimeUnitKind.PS);
		val1 = 10;
		unit1 = TimeUnitKind.PS;
		v1 = new LongDurationImpl(val1, unit1);
		v2 = new LongDurationImpl(5, TimeUnitKind.PS);
		v1_plus_v2 = new LongDurationImpl(15, TimeUnitKind.PS);
		v1_minus_v2 = v2;
		
		v1_mul_3 = new LongDurationImpl(3 * val1, unit1);
		v1_min_v2 = v2;
		v1_max_v2 = v1;
		v1_lcm_v2 = v1;
		v1_divide_v2 = 2;
		v1_div_v2 = 2.0;
		obj = (EObject)v1;
		clz = obj.eClass();
	}

}
