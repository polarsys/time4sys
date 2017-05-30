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

import org.junit.Before;
import org.polarsys.time4sys.marte.nfp.DataSize;
import org.polarsys.time4sys.marte.nfp.DataSizeUnitKind;

/**
 * @author loic
 *
 */
public class DataSizeImplTest extends AbstractRealWithUnitValueImplTest<DataSizeUnitKind, DataSize> {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		zero = new DataSizeImpl(0, DataSizeUnitKind.BIT);
		val1 = 10;
		unit1 = DataSizeUnitKind.BIT;
		v1 = new DataSizeImpl(val1, unit1);
		v2 = new DataSizeImpl(5, DataSizeUnitKind.BIT);
		v1_plus_v2 = new DataSizeImpl(15, DataSizeUnitKind.BIT);
		v1_minus_v2 = v2;
		
		v1_mul_3 = new DataSizeImpl(3 * val1, unit1);
		v1_min_v2 = v2;
		v1_max_v2 = v1;
		v1_lcm_v2 = v1;
		v1_divide_v2 = 2;
		v1_div_v2 = 2.0;		
	}

}
