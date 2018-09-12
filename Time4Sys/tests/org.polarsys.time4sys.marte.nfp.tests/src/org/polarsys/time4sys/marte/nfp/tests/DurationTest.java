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

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;
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
 * @generated NOT
 */
public abstract class DurationTest extends TestCase {

	/**
	 * The fixture for this Duration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Duration fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DurationTest.class);
	}

	/**
	 * Constructs a new Duration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Duration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Duration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Duration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Duration getFixture() {
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
		setFixture(NfpFactory.eINSTANCE.createDuration());
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
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#add(org.polarsys.time4sys.marte.nfp.Duration) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration#add(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated NOT
	 */
	public void testAdd__Duration() {
		assertEquals(getFixture(), getFixture().add(NfpFactory.eINSTANCE.createDurationFromString("0ms")));
		getFixture().add(getFixture());
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#convertToUnit(org.polarsys.time4sys.marte.nfp.TimeUnitKind) <em>Convert To Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration#convertToUnit(org.polarsys.time4sys.marte.nfp.TimeUnitKind)
	 * @generated NOT
	 */
	public void testConvertToUnit__TimeUnitKind() {
		final Duration v = getFixture().convertToUnit(TimeUnitKind.MS);
		assertEquals(TimeUnitKind.MS, v.getUnit());
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#simplify() <em>Simplify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration#simplify()
	 * @generated NOT
	 */
	public void testSimplify() {
		getFixture().simplify();
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#sub(org.polarsys.time4sys.marte.nfp.Duration) <em>Sub</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration#sub(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated NOT
	 */
	public void testSub__Duration() {
		assertEquals(getFixture(), getFixture().sub(NfpFactory.eINSTANCE.createDurationFromString("0ms")));
		getFixture().sub(getFixture());
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#compareTo(org.polarsys.time4sys.marte.nfp.Duration) <em>Compare To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration#compareTo(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated NOT
	 */
	public void testCompareTo__Duration() {
		assertEquals(0, getFixture().compareTo(getFixture()));
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#isZero() <em>Is Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration#isZero()
	 * @generated NOT
	 */
	public abstract void testIsZero();

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#notZero() <em>Not Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration#notZero()
	 * @generated NOT
	 */
	public abstract void testNotZero();

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#max(org.polarsys.time4sys.marte.nfp.Duration) <em>Max</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration#max(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated NOT
	 */
	public void testMax__Duration() {
		assertEquals(getFixture(), getFixture().max(null));
	}

	
	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#min(org.polarsys.time4sys.marte.nfp.Duration) <em>Min</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration#min(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated NOT
	 */
	
	public void testMin__Duration() {
		assertEquals(getFixture(), getFixture().min(null));
	}
	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#multiply(long) <em>Multiply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration#multiply(long)
	 * @generated NOT
	 */
	public abstract void testMultiply__long();

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#lcm(org.polarsys.time4sys.marte.nfp.Duration) <em>Lcm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration#lcm(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated NOT
	 */
	public abstract void testLcm__Duration();

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#div(org.polarsys.time4sys.marte.nfp.Duration) <em>Div</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration#div(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated NOT
	 */
	public abstract void testDiv__Duration();

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#div(org.polarsys.time4sys.marte.nfp.Duration, java.math.MathContext) <em>Div</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration#div(org.polarsys.time4sys.marte.nfp.Duration, java.math.MathContext)
	 * @generated NOT
	 */
	public abstract void testDiv__Duration_MathContext();

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#divide(org.polarsys.time4sys.marte.nfp.Duration) <em>Divide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration#divide(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated NOT
	 */
	public abstract void testDivide__Duration();

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.nfp.Duration#divide(long) <em>Divide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration#divide(long)
	 * @generated NOT
	 */
	public abstract void testDivide__long();
	
} //DurationTest
