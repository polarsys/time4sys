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
package org.polarsys.time4sys.marte.grm.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.ResourceControlPolicy;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Control Policy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceControlPolicyTest extends TestCase {

	/**
	 * The fixture for this Resource Control Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceControlPolicy fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceControlPolicyTest.class);
	}

	/**
	 * Constructs a new Resource Control Policy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceControlPolicyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resource Control Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResourceControlPolicy fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resource Control Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceControlPolicy getFixture() {
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
		setFixture(GrmFactory.eINSTANCE.createResourceControlPolicy());
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

} //ResourceControlPolicyTest
