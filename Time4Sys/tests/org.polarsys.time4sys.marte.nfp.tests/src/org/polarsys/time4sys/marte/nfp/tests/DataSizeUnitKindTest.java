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
/**
 * 
 */
package org.polarsys.time4sys.marte.nfp.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.marte.nfp.DataSizeUnitKind;

/**
 * @author loic
 *
 */
public class DataSizeUnitKindTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.TimeUnitKind#getValue()}.
	 */
	@Test
	public void testValueIsInOrderOfMagnitude() {
		final Iterator<DataSizeUnitKind> it = DataSizeUnitKind.VALUES.iterator();
		assertTrue(it.hasNext());
		final int curVal = it.next().getValue();
		while(it.hasNext()) {
			assertTrue(curVal < it.next().getValue());
		}
	}
	
	@Test
	public void testAllValuesAreDifferent() {
		for(DataSizeUnitKind u1: DataSizeUnitKind.VALUES) {
			for(DataSizeUnitKind u2: DataSizeUnitKind.VALUES) {
				assertTrue((u1 == u2) || (u1.getValue() != u2.getValue()));
			}
		}
	}

	@Test
	public void testClosestUnitForSameUnit() {
		for(DataSizeUnitKind k: DataSizeUnitKind.VALUES) {
			assertEquals(k, DataSizeUnitKind.dimension.findClosestUnitTo(k, k));
		}
	}
	
	@Test
	public void testClosestUnitForGreaterOrEqualUnit() {
		int maxValues = DataSizeUnitKind.GB.getValue();
		for(DataSizeUnitKind k: DataSizeUnitKind.VALUES) {
			for(int i = k.getValue(); i <= maxValues; i++) {
				assertEquals(k, DataSizeUnitKind.dimension.findClosestUnitTo(k, DataSizeUnitKind.get(i)));
			}
		}
	}
	
	protected void assertXUnit1IsOneUnit2(final double v, final DataSizeUnitKind unit1, final DataSizeUnitKind unit2) {
		final double actual = DataSizeUnitKind.dimension.getConversionFactor(unit2, unit1);
		assertEquals(v, actual, 0.0001);
		assertEquals(1.0 / v, DataSizeUnitKind.dimension.getConversionFactor(unit1, unit2), 0.0001);
	}
	
	@Test
	public void testConversionFactor() {
		
		for(DataSizeUnitKind k: DataSizeUnitKind.VALUES) {
			assertEquals(1.0, DataSizeUnitKind.dimension.getConversionFactor(k, k), 0.0001);
		}
		
		assertXUnit1IsOneUnit2(8.0, DataSizeUnitKind.BIT, DataSizeUnitKind.BYTE);
		assertXUnit1IsOneUnit2(1000.0, DataSizeUnitKind.BYTE, DataSizeUnitKind.KB);
		assertXUnit1IsOneUnit2(1000.0, DataSizeUnitKind.KB, DataSizeUnitKind.MB);
		assertXUnit1IsOneUnit2(1000.0, DataSizeUnitKind.MB, DataSizeUnitKind.GB);
	}
	
	@Test
	public void testGetToString() {
		for(DataSizeUnitKind k: DataSizeUnitKind.VALUES) {
			assertEquals(k, DataSizeUnitKind.get(k.toString()));
		}
		assertNull(DataSizeUnitKind.get("dummy literal string"));
	}
	
	@Test
	public void testGetByName() {
		for(DataSizeUnitKind k: DataSizeUnitKind.VALUES) {
			assertEquals(k, DataSizeUnitKind.getByName(k.getName()));
		}
		assertNull(DataSizeUnitKind.getByName("dummy literal string"));
	}
	
	@Test
	public void testGet() {
		for(DataSizeUnitKind k: DataSizeUnitKind.VALUES) {
			assertEquals(k, DataSizeUnitKind.get(k.getValue()));
		}
		assertNull(DataSizeUnitKind.get(-1));
	}
}
