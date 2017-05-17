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

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.TimeInterval#computeLength() <em>Compute Length</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TimeIntervalTest extends TestCase {

	/**
	 * The fixture for this Time Interval test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeInterval fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeIntervalTest.class);
	}

	/**
	 * Constructs a new Time Interval test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeIntervalTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Time Interval test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TimeInterval fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Time Interval test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeInterval getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfpFactory.eINSTANCE.createTimeInterval());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#computeLength() <em>Compute Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval#computeLength()
	 * @generated NOT
	 */
	public void testComputeLength() {
		final TimeInterval i = NfpFactory.eINSTANCE.createTimeIntervalFromString("[1ms,10ms[");
		assertEquals(NfpFactory.eINSTANCE.createDurationFromString("9ms"), i.computeLength());
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#getMin() <em>Min</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval#getMin()
	 * @generated NOT
	 */
	public void testGetMin() {
		assertNotNull(fixture.getMin());
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#setMin(org.polarsys.time4sys.marte.nfp.Duration) <em>Min</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval#setMin(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated NOT
	 */
	public void testSetMin() {
		fixture.setMin(NfpFactory.eINSTANCE.createDurationFromString("3d"));
		Duration v = fixture.getMin();
		assertEquals(3.0, v.getValue());
		assertEquals(TimeUnitKind.D, v.getUnit());
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#getMax() <em>Max</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval#getMax()
	 * @generated NOT
	 */
	public void testGetMax() {
		assertNotNull(fixture.getMax());
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#setMax(org.polarsys.time4sys.marte.nfp.Duration) <em>Max</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval#setMax(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated NOT
	 */
	public void testSetMax() {
		fixture.setMax(NfpFactory.eINSTANCE.createDurationFromString("200ms"));
		Duration v = fixture.getMax();
		assertEquals(200.0, v.getValue());
		assertEquals(TimeUnitKind.MS, v.getUnit());
	}
	
	public void testConvertStringC0C10MSToInterval() {
		final TimeInterval i = NfpFactory.eINSTANCE.createTimeIntervalFromString("[0,10ms]");
		assertNotNull(i);
		assertNotNull(i.getMin());
		assertFalse(i.isMinOpen());
		assertEquals(0.0, i.getMin().getValue());
		assertEquals(10.0, i.getMax().getValue());
		assertEquals(TimeUnitKind.MS, i.getMax().getUnit());
		assertFalse(i.isMaxOpen());
	}
	
	public void testConvertStringC5psC10MSToInterval() {
		final TimeInterval i = NfpFactory.eINSTANCE.createTimeIntervalFromString("[5ps,10ms]");
		assertNotNull(i);
		assertNotNull(i.getMin());
		assertFalse(i.isMinOpen());
		assertEquals(5.0, i.getMin().getValue());
		assertEquals(TimeUnitKind.PS, i.getMin().getUnit());
		assertEquals(10.0, i.getMax().getValue());
		assertEquals(TimeUnitKind.MS, i.getMax().getUnit());
		assertFalse(i.isMaxOpen());
	}
	
	public void testConvertStringO5psC10MSToInterval() {
		final TimeInterval i = NfpFactory.eINSTANCE.createTimeIntervalFromString("]5ps,10ms]");
		assertNotNull(i);
		assertNotNull(i.getMin());
		assertTrue(i.isMinOpen());
		assertEquals(5.0, i.getMin().getValue());
		assertEquals(TimeUnitKind.PS, i.getMin().getUnit());
		assertEquals(10.0, i.getMax().getValue());
		assertEquals(TimeUnitKind.MS, i.getMax().getUnit());
		assertFalse(i.isMaxOpen());
	}
	
	public void testConvertStringO5psO10MSToInterval() {
		final TimeInterval i = NfpFactory.eINSTANCE.createTimeIntervalFromString("]5ps,10ms[");
		assertNotNull(i);
		assertNotNull(i.getMin());
		assertTrue(i.isMinOpen());
		assertEquals(5.0, i.getMin().getValue());
		assertEquals(TimeUnitKind.PS, i.getMin().getUnit());
		assertEquals(10.0, i.getMax().getValue());
		assertEquals(TimeUnitKind.MS, i.getMax().getUnit());
		assertTrue(i.isMaxOpen());
	}
	
	public void testConvertStringC5psO10MSToInterval() {
		final TimeInterval i = NfpFactory.eINSTANCE.createTimeIntervalFromString("[5ps,10ms[");
		assertNotNull(i);
		assertNotNull(i.getMin());
		assertFalse(i.isMinOpen());
		assertEquals(5.0, i.getMin().getValue());
		assertEquals(TimeUnitKind.PS, i.getMin().getUnit());
		assertEquals(10.0, i.getMax().getValue());
		assertEquals(TimeUnitKind.MS, i.getMax().getUnit());
		assertTrue(i.isMaxOpen());
	}
	
	public void testConvertC5psO10MSIntervalToString() {
		final TimeInterval i = NfpFactory.eINSTANCE.createTimeIntervalFromString("[5ps,10ms[");
		assertEquals("[5ps,10ms[", NfpFactory.eINSTANCE.convertTimeIntervalToString(i));
	}
	
	public void testConvertLongIntervalToString() {
		final TimeInterval i = NfpFactory.eINSTANCE.createTimeIntervalFromString("[452904007590ps,469904007590ps]");
		assertEquals("[452904007590ps,469904007590ps]", NfpFactory.eINSTANCE.convertTimeIntervalToString(i));
	}
} //TimeIntervalTest
