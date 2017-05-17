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
package org.polarsys.time4sys.marte.gqam.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.gqam.BurstPattern;
import org.polarsys.time4sys.marte.gqam.GqamFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Burst Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.BurstPattern#setOuterPeriod(org.polarsys.time4sys.marte.nfp.Duration) <em>Set Outer Period</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.BurstPattern#setInnerPeriod(org.polarsys.time4sys.marte.nfp.Duration) <em>Set Inner Period</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BurstPatternTest extends ArrivalPatternTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BurstPatternTest.class);
	}

	/**
	 * Constructs a new Burst Pattern test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BurstPatternTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Burst Pattern test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BurstPattern getFixture() {
		return (BurstPattern)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GqamFactory.eINSTANCE.createBurstPattern());
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
	 * Tests the '{@link org.polarsys.time4sys.marte.gqam.BurstPattern#setOuterPeriod(org.polarsys.time4sys.marte.nfp.Duration) <em>Set Outer Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.BurstPattern#setOuterPeriod(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	public void testSetOuterPeriod__Duration() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.polarsys.time4sys.marte.gqam.BurstPattern#setInnerPeriod(org.polarsys.time4sys.marte.nfp.Duration) <em>Set Inner Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.BurstPattern#setInnerPeriod(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	public void testSetInnerPeriod__Duration() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //BurstPatternTest
