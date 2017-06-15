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

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;

/**
 * @author loic
 *
 */
public class TimeUnitKindTest {

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
		final Iterator<TimeUnitKind> it = TimeUnitKind.VALUES.iterator();
		assertTrue(it.hasNext());
		final int curVal = it.next().getValue();
		while(it.hasNext()) {
			assertTrue(curVal < it.next().getValue());
		}
	}
	
	@Test
	public void testAllValuesAreDifferent() {
		for(TimeUnitKind u1: TimeUnitKind.VALUES) {
			for(TimeUnitKind u2: TimeUnitKind.VALUES) {
				assertTrue((u1 == u2) || (u1.getValue() != u2.getValue()));
			}
		}
	}

	@Test
	public void testClosestUnitForSameUnit() {
		for(TimeUnitKind k: TimeUnitKind.VALUES) {
			assertEquals(k, TimeUnitKind.dimension.findClosestUnitTo(k, k));
		}
	}
	
	@Test
	public void testClosestUnitForGreaterOrEqualUnit() {
		int maxValues = TimeUnitKind.D.getValue();
		for(TimeUnitKind k: TimeUnitKind.VALUES) {
			for(int i = k.getValue(); i <= maxValues; i++) {
				assertEquals(k, TimeUnitKind.dimension.findClosestUnitTo(k, TimeUnitKind.get(i)));
			}
		}
	}
	
	protected void assertXUnit1IsOneUnit2(final double v, final TimeUnitKind unit1, final TimeUnitKind unit2) {
		final double actual = TimeUnitKind.dimension.getConversionFactor(unit2, unit1);
		assertEquals(v, actual, 0.0001);
		assertEquals(1.0 / v, TimeUnitKind.dimension.getConversionFactor(unit1, unit2), 0.0001);
	}
	
	@Test
	public void testConversionFactor() {
		
		for(TimeUnitKind k: TimeUnitKind.VALUES) {
			assertEquals(1.0, TimeUnitKind.dimension.getConversionFactor(k, k), 0.0001);
		}
		
		assertXUnit1IsOneUnit2(1000.0, TimeUnitKind.PS, TimeUnitKind.NS);
		assertXUnit1IsOneUnit2(1000.0, TimeUnitKind.NS, TimeUnitKind.US);
		assertXUnit1IsOneUnit2(1000.0, TimeUnitKind.US, TimeUnitKind.MS);
		assertXUnit1IsOneUnit2(1000.0, TimeUnitKind.MS, TimeUnitKind.S);
		assertXUnit1IsOneUnit2(  60.0, TimeUnitKind.S,  TimeUnitKind.MN);
		assertXUnit1IsOneUnit2(  60.0, TimeUnitKind.MN, TimeUnitKind.H);
		assertXUnit1IsOneUnit2(  24.0, TimeUnitKind.H,  TimeUnitKind.D);
		
		assertXUnit1IsOneUnit2(1000000.0, TimeUnitKind.PS, TimeUnitKind.US);
		assertXUnit1IsOneUnit2(   3600.0, TimeUnitKind.S,  TimeUnitKind.H);
	}
	
	@Test
	public void testGetToString() {
		for(TimeUnitKind k: TimeUnitKind.VALUES) {
			assertEquals(k, TimeUnitKind.get(k.toString()));
		}
		assertNull(TimeUnitKind.get("dummy literal string"));
	}
	
	@Test
	public void testGetByName() {
		for(TimeUnitKind k: TimeUnitKind.VALUES) {
			assertEquals(k, TimeUnitKind.getByName(k.getName()));
		}
		assertNull(TimeUnitKind.getByName("dummy literal string"));
	}
	
	@Test
	public void testGet() {
		for(TimeUnitKind k: TimeUnitKind.VALUES) {
			assertEquals(k, TimeUnitKind.get(k.getValue()));
		}
		assertNull(TimeUnitKind.get(-1));
	}
}
