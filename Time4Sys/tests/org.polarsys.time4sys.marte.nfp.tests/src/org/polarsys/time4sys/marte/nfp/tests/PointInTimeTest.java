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
 */
package org.polarsys.time4sys.marte.nfp.tests;

import java.math.MathContext;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;
import org.polarsys.time4sys.marte.nfp.UniformDistribution;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#add(org.polarsys.time4sys.marte.nfp.Duration) <em>Add</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#compareTo(org.polarsys.time4sys.marte.nfp.Duration) <em>Compare To</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#convertToUnit(org.polarsys.time4sys.marte.nfp.TimeUnitKind) <em>Convert To Unit</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#div(org.polarsys.time4sys.marte.nfp.Duration) <em>Div</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#div(org.polarsys.time4sys.marte.nfp.Duration, java.math.MathContext) <em>Div</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#divide(org.polarsys.time4sys.marte.nfp.Duration) <em>Divide</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#divide(long) <em>Divide</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#isZero() <em>Is Zero</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#lcm(org.polarsys.time4sys.marte.nfp.Duration) <em>Lcm</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#max(org.polarsys.time4sys.marte.nfp.Duration) <em>Max</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#min(org.polarsys.time4sys.marte.nfp.Duration) <em>Min</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#multiply(long) <em>Multiply</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#notZero() <em>Not Zero</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#simplify() <em>Simplify</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#sub(org.polarsys.time4sys.marte.nfp.Duration) <em>Sub</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PointInTimeTest extends DurationTest {

	public PointInTimeTest(String name) {
		super(name);
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfpFactory.eINSTANCE.createDuration());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#add(org.polarsys.time4sys.marte.nfp.Duration) <em>Add</em>}' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#add(org.polarsys.time4sys.marte.nfp.Duration)
	 */
	public void testPITAdd__Duration() {
		assertEquals(NfpFactory.eINSTANCE.createDurationFromString("0ps"), NfpFactory.eINSTANCE.createDurationFromString("0ms").add(NfpFactory.eINSTANCE.createDurationFromString("0ps")));
		assertEquals(NfpFactory.eINSTANCE.createDurationFromString("10ps"), NfpFactory.eINSTANCE.createDurationFromString("0ms").add(NfpFactory.eINSTANCE.createDurationFromString("10ps")));
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#convertToUnit(org.polarsys.time4sys.marte.nfp.TimeUnitKind) <em>Convert To Unit</em>}' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#convertToUnit(org.polarsys.time4sys.marte.nfp.TimeUnitKind)
	 */
	public void testPITConvertToUnit__TimeUnitKind() {
		final Duration zero = NfpFactory.eINSTANCE.createDurationFromString("0ps");
		final Duration d = zero.convertToUnit(TimeUnitKind.MS);
		assertEquals("0ms", d.toString());
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#simplify() <em>Simplify</em>}' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#simplify()
	 */
	public void testPITSimplify() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("0ps").simplify();
		assertEquals("0ps", d.toString());
		assertEquals(TimeUnitKind.PS, d.getUnit());
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#sub(org.polarsys.time4sys.marte.nfp.Duration) <em>Sub</em>}' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#sub(org.polarsys.time4sys.marte.nfp.Duration)
	 */
	public void testSub__Duration() {
		assertEquals(NfpFactory.eINSTANCE.createDurationFromString("0ps"), NfpFactory.eINSTANCE.createDurationFromString("0ms").sub(NfpFactory.eINSTANCE.createDurationFromString("0ps")));
		assertEquals(NfpFactory.eINSTANCE.createDurationFromString("990us"), NfpFactory.eINSTANCE.createDurationFromString("1ms").sub(NfpFactory.eINSTANCE.createDurationFromString("10us")));
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#compareTo(org.polarsys.time4sys.marte.nfp.Duration) <em>Compare To</em>}' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#compareTo(org.polarsys.time4sys.marte.nfp.Duration)
	 */
	public void testCompareTo__Duration() {
		super.testCompareTo__Duration();
		assertTrue(0 < NfpFactory.eINSTANCE.createDurationFromString("10ms").compareTo(NfpFactory.eINSTANCE.createDurationFromString("0ps")));
		assertTrue(0 > NfpFactory.eINSTANCE.createDurationFromString("0ms").compareTo(NfpFactory.eINSTANCE.createDurationFromString("100ps")));
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#isZero() <em>Is Zero</em>}' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#isZero()
	 */
	public void testIsZero() {
		assertTrue(NfpFactory.eINSTANCE.createDurationFromString("0ms").isZero());
		assertTrue(NfpFactory.eINSTANCE.createDurationFromString("0s").isZero());
		assertFalse(NfpFactory.eINSTANCE.createDurationFromString("10ms").isZero());
		assertFalse(NfpFactory.eINSTANCE.createDurationFromString("0.0001ms").isZero());
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#notZero() <em>Not Zero</em>}' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#notZero()
	 */
	public void testNotZero() {
		assertFalse(NfpFactory.eINSTANCE.createDurationFromString("0ms").notZero());
		assertFalse(NfpFactory.eINSTANCE.createDurationFromString("0s").notZero());
		assertTrue(NfpFactory.eINSTANCE.createDurationFromString("10ms").notZero());
		assertTrue(NfpFactory.eINSTANCE.createDurationFromString("0.0001ms").notZero());
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#max(org.polarsys.time4sys.marte.nfp.Duration) <em>Max</em>}' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#max(org.polarsys.time4sys.marte.nfp.Duration)
	 */
	public void testMax__Duration() {
		assertMaxOfEquals("3ms", "5ms", "5ms");
		assertMaxOfEquals("5ms", "3ms", "5ms");
		assertMaxOfEquals("5ms", "5ps", "5ms");
	}

	protected void assertMaxOfEquals(final String v1, final String v2, final String expected) {
		assertEquals(
				NfpFactory.eINSTANCE.createDurationFromString(expected),
				NfpFactory.eINSTANCE.createDurationFromString(v1).max(
						NfpFactory.eINSTANCE.createDurationFromString(v2)));
	}

	protected void assertMinOfEquals(final String v1, final String v2, final String expected) {
		assertEquals(
				NfpFactory.eINSTANCE.createDurationFromString(expected),
				NfpFactory.eINSTANCE.createDurationFromString(v1).min(
						NfpFactory.eINSTANCE.createDurationFromString(v2)));
	}
	
	protected void assertMultiplyOfEquals(final String v1, final long v2, final String expected) {
		assertEquals(
				NfpFactory.eINSTANCE.createDurationFromString(expected),
				NfpFactory.eINSTANCE.createDurationFromString(v1).multiply(v2));
	}
	
	protected void assertDivideOfEquals(final String v1, final long v2, final String expected) {
		Duration expectedDuration = null;
		if (expected != null) {
			expectedDuration = NfpFactory.eINSTANCE.createDurationFromString(expected);
		}
		assertEquals(
				expectedDuration,
				NfpFactory.eINSTANCE.createDurationFromString(v1).divide(v2));
	}
	
	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#min(org.polarsys.time4sys.marte.nfp.Duration) <em>Min</em>}' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#min(org.polarsys.time4sys.marte.nfp.Duration)
	 */
	public void testMin__Duration() {
		assertMinOfEquals("3ms", "5ms", "3ms");
		assertMinOfEquals("5ms", "3ms", "3ms");
		assertMinOfEquals("5ms", "5ps", "5ps");
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#multiply(long) <em>Multiply</em>}' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#multiply(long)
	 */
	public void testMultiply__long() {
		assertMultiplyOfEquals("3ms", 3, "9ms");
		assertMultiplyOfEquals("3ms", 0, "0ps");
		assertMultiplyOfEquals("0ms", 3, "0ms");
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#lcm(org.polarsys.time4sys.marte.nfp.Duration) <em>Lcm</em>}' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#lcm(org.polarsys.time4sys.marte.nfp.Duration)
	 */
	public void testLcm__Duration() {
		assertEquals(NfpFactory.eINSTANCE.createDurationFromString("32ms"), NfpFactory.eINSTANCE.createDurationFromString("32ms").lcm(NfpFactory.eINSTANCE.createDurationFromString("32ms")));
		assertEquals(NfpFactory.eINSTANCE.createDurationFromString("12ms"), NfpFactory.eINSTANCE.createDurationFromString("4ms").lcm(NfpFactory.eINSTANCE.createDurationFromString("6ms")));
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#div(org.polarsys.time4sys.marte.nfp.Duration) <em>Div</em>}' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#div(org.polarsys.time4sys.marte.nfp.Duration)
	 */
	public void testDiv__Duration() {
		assertEquals(0.032, NfpFactory.eINSTANCE.createDurationFromString("32ms").div(NfpFactory.eINSTANCE.createDurationFromString("1s")), 0.0000001);
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#div(org.polarsys.time4sys.marte.nfp.Duration, java.math.MathContext) <em>Div</em>}' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#div(org.polarsys.time4sys.marte.nfp.Duration, java.math.MathContext)
	 */
	public void testDiv__Duration_MathContext() {
		final MathContext mathContext = new MathContext(2);
		assertEquals(5.3, NfpFactory.eINSTANCE.createDurationFromString("16ms").div(NfpFactory.eINSTANCE.createDurationFromString("3ms"), mathContext), 0.0000001);
		//NB: If not using MathContext, one will get an arithmetic exception.
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#divide(org.polarsys.time4sys.marte.nfp.Duration) <em>Divide</em>}' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#divide(org.polarsys.time4sys.marte.nfp.Duration)
	 */
	public void testDivide__Duration() {
		assertEquals(1L, NfpFactory.eINSTANCE.createDurationFromString("32ms").divide(NfpFactory.eINSTANCE.createDurationFromString("32ms")));
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#divide(long) <em>Divide</em>}' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#divide(long)
	 */
	public void testDivide__long() {
		assertDivideOfEquals("9ms", 3, "3ms");
		assertDivideOfEquals("3ms", 0, null);
		assertDivideOfEquals("0ms", 3, "0ms");
		assertEquals("1ms", NfpFactory.eINSTANCE.createDurationFromString("32ms").divide(32).toString());
	}

	public void testPITConvertSimpleDuration200msStringToDuration() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("200ms");
		assertNotNull(d);
		assertEquals(TimeUnitKind.MS, d.getUnit());
		assertEquals(200.0, d.getValue());
	}
	
	public void testPITConvertSimpleDuration2_0sStringToDuration() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("2.0s");
		assertNotNull(d);
		assertEquals(TimeUnitKind.S, d.getUnit());
		assertEquals(2.0, d.getValue());
	}
	
	public void testPITConvertSimpleDuration10dStringToDuration() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("10d");
		assertNotNull(d);
		assertEquals(TimeUnitKind.D, d.getUnit());
		assertEquals(10.0, d.getValue());
	}
	
	public void testPITConvertDuration2_0sToString() {
		fixture.setUnit(TimeUnitKind.S);
		fixture.setValue(2.0);
		assertEquals("2s", NfpFactory.eINSTANCE.convertDurationToString(fixture));
	}
	
	public void testPITConvertDurationWithoutUnitToDuration() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("42");
		assertNotNull(d);
		assertEquals(TimeUnitKind.MS, d.getUnit());
		assertEquals(42.0, d.getValue());
	}
	
	public void testPITZeroEqualityWhateverTheUnit() {
		final Duration zMs = NfpFactory.eINSTANCE.createDurationFromString("0ms");
		final Duration zPs = NfpFactory.eINSTANCE.createDurationFromString("0ps");
		assertEquals(zMs, zPs);
	}
	
	public void testPITSomeEqualities() {
		final Duration v1 = NfpFactory.eINSTANCE.createDurationFromString("5ms");
		final Duration v2 = NfpFactory.eINSTANCE.createDurationFromString("5ms");
		assertEquals(v1, v2);
	}
	
	public void testPITSomeDisequalities() {
		final Duration v1 = NfpFactory.eINSTANCE.createDurationFromString("6ms");
		final Duration v2 = NfpFactory.eINSTANCE.createDurationFromString("5ms");
		assertNotSame(v1, v2);
	}
	
	public void testPIT5msEqualityWhateverTheUnit() {
		final Duration zMs = NfpFactory.eINSTANCE.createDurationFromString("5ms");
		final Duration zUs = NfpFactory.eINSTANCE.createDurationFromString("5000us");
		assertEquals(zMs, zUs);
		assertEquals(zUs, zMs);
	}
	
	public void testPITUpgradeUnitSimplification() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("5000us").simplify();
		assertEquals("5ms", d.toString());
		assertEquals(TimeUnitKind.MS, d.getUnit());
	}
	
	public void testPITDowngradeUnitSimplification() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("0.5s").simplify();
		assertEquals("500ms", d.toString());
		assertEquals(TimeUnitKind.MS, d.getUnit());
	}
	
	public void testPITConvertTo() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("1500ms").simplify();
		final Duration converted = d.convertToUnit(TimeUnitKind.S);
		assertEquals("1500ms", converted.toString());
		assertEquals(TimeUnitKind.S, converted.getUnit());
		assertEquals(1.5, converted.getValue());
	}
	
	public void testPITDowngradeUnitSimplificationGreaterThanOne() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("1025ms").simplify();
		assertEquals("1025ms", d.toString());
		assertEquals(TimeUnitKind.MS, d.getUnit());
	}
	
	public void testPITZeroSimplificationDoesNotChangeUnit() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("0us").simplify();
		assertEquals("0us", d.toString());
		assertEquals(TimeUnitKind.US, d.getUnit());
	}
	
	public void testPITAA() {
		final Duration d = NfpFactory.eINSTANCE.createDuration();
		d.setUnit(TimeUnitKind.PS);
		d.setValue(9.707734992E9);
		assertEquals("9707734992ps", d.toString());
	}
	
	public void testPITExponentInString() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("9.707734992E9ps");
		assertEquals("9707734992ps", d.toString());
	}
	
	public void testParseInfiniteVSL() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("*");
		assertEquals(Double.POSITIVE_INFINITY, d.getValue());
	}
	
	public void testParseInfiniteDouble() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString(Double.toString(Double.POSITIVE_INFINITY));
		assertEquals(Double.POSITIVE_INFINITY, d.getValue());
	}
	
} //DurationTest
