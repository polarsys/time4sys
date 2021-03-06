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
package org.polarsys.time4sys.marte.hrm.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.hrm.HardwareActuator;
import org.polarsys.time4sys.marte.hrm.HrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hardware Actuator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareActuatorTest extends HardwareIoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HardwareActuatorTest.class);
	}

	/**
	 * Constructs a new Hardware Actuator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareActuatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hardware Actuator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HardwareActuator getFixture() {
		return (HardwareActuator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HrmFactory.eINSTANCE.createHardwareActuator());
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

} //HardwareActuatorTest
