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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.marte.nfp.ValueWithUnit;

/**
 * @author loic
 *
 */
public abstract class AbstractRealWithUnitValueImplTest<U extends Enumerator, T extends ValueWithUnit<U> > {

	protected U unit1;
	protected double val1;
	protected AbstractRealWithUnitValueImpl<U, T> v1;
	protected AbstractRealWithUnitValueImpl<U, T> v2;
	protected AbstractRealWithUnitValueImpl<U, T> v1_plus_v2;
	protected AbstractRealWithUnitValueImpl<U, T> v1_minus_v2;
	protected AbstractRealWithUnitValueImpl<U, T> v1_mul_3;
	protected AbstractRealWithUnitValueImpl<U, T> v1_min_v2;
	protected AbstractRealWithUnitValueImpl<U, T> v1_max_v2;
	protected AbstractRealWithUnitValueImpl<U, T> v1_lcm_v2;
	protected long v1_divide_v2;
	protected double v1_div_v2;
	protected AbstractRealWithUnitValueImpl<U, T> zero;
	protected EObject obj;
	protected EClass clz;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public abstract void setUp() throws Exception;

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.impl.AbstractRealWithUnitValueImpl#getUnit()}.
	 */
	@Test
	public void testGetUnit() {
		assertEquals(unit1, v1.getUnit());
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.impl.AbstractRealWithUnitValueImpl#getValue()}.
	 */
	@Test
	public void testGetValue() {
		assertEquals(val1, v1.getValue(), 0.0001);
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.impl.AbstractRealWithUnitValueImpl#add(org.polarsys.time4sys.marte.nfp.ValueWithUnit)}.
	 */
	@Test
	public void testAdd() {
		assertEquals(v1_plus_v2, v1.add((T)v2));
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.impl.AbstractRealWithUnitValueImpl#convertToUnit(org.eclipse.emf.common.util.Enumerator)}.
	 */
	@Test
	public void testConvertToUnit() {
		assertEquals(v1, v1.convertToUnit(v1.getUnit()));
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.impl.AbstractRealWithUnitValueImpl#simplify()}.
	 */
	@Test
	public void testSimplify() {
		assertEquals(v1, v1.simplify());
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.impl.AbstractRealWithUnitValueImpl#sub(org.polarsys.time4sys.marte.nfp.ValueWithUnit)}.
	 */
	@Test
	public void testSub() {
		assertEquals(v1_minus_v2, v1.sub((T)v2));
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.impl.AbstractRealWithUnitValueImpl#compareTo(org.polarsys.time4sys.marte.nfp.ValueWithUnit)}.
	 */
	@Test
	public void testCompareTo() {
		assertEquals(0, v1.compareTo((T)v1));
		assertEquals(1, v1.compareTo((T)v2));
		assertEquals(-1, v2.compareTo((T)v1));
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.impl.AbstractRealWithUnitValueImpl#isZero()}.
	 */
	@Test
	public void testIsZero() {
		assertFalse(v1.isZero());
		assertFalse(v2.isZero());
		assertTrue(zero.isZero());
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.impl.AbstractRealWithUnitValueImpl#notZero()}.
	 */
	@Test
	public void testNotZero() {
		assertTrue(v1.notZero());
		assertTrue(v2.notZero());
		assertFalse(zero.notZero());
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.impl.AbstractRealWithUnitValueImpl#max(org.polarsys.time4sys.marte.nfp.ValueWithUnit)}.
	 */
	@Test
	public void testMax() {
		assertEquals(v1_max_v2, v1.max((T)v2));
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.impl.AbstractRealWithUnitValueImpl#min(org.polarsys.time4sys.marte.nfp.ValueWithUnit)}.
	 */
	@Test
	public void testMin() {
		assertEquals(v1_min_v2, v1.min((T)v2));
		assertEquals(v1_min_v2, v2.min((T)v1));
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.impl.AbstractRealWithUnitValueImpl#multiply(long)}.
	 */
	@Test
	public void testMultiply() {
		assertEquals(v1_mul_3, v1.multiply(3));
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.impl.AbstractRealWithUnitValueImpl#lcm(org.polarsys.time4sys.marte.nfp.ValueWithUnit)}.
	 */
	@Test
	public void testLcm() {
		assertEquals(v1_lcm_v2, v1.lcm((T)v2));
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.impl.AbstractRealWithUnitValueImpl#div(org.polarsys.time4sys.marte.nfp.ValueWithUnit)}.
	 */
	@Test
	public void testDiv() {
		assertEquals(v1_div_v2, v1.div((T)v2), 0.001);
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.impl.AbstractRealWithUnitValueImpl#divide(org.polarsys.time4sys.marte.nfp.ValueWithUnit)}.
	 */
	@Test
	public void testDivide() {
		assertEquals(v1_divide_v2, v1.divide((T)v2));
	}

	@Test
	public void testEquals() {
		assertTrue(v1.equals((T)v1));
		assertFalse(v1.equals((T)v2));
		assertTrue(zero.equals((T)zero));
		assertFalse(zero.equals((T)v1));
		assertFalse(v1.equals((T)null));
		assertFalse(v1.equals(zero));
	}
	
	@Test
	public void testEGetter() {
		for(EAttribute attr: clz.getEAllAttributes()) {
			obj.eGet(attr);
			if (obj.eIsSet(attr)) {
				obj.eSet(attr, obj.eGet(attr));
			}
			obj.eUnset(attr);
		}
		
	}
}
