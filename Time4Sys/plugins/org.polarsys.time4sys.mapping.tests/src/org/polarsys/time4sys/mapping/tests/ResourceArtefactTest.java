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
package org.polarsys.time4sys.mapping.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.mapping.MappingFactory;
import org.polarsys.time4sys.mapping.ResourceArtefact;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Artefact</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceArtefactTest extends MappableArtefactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceArtefactTest.class);
	}

	/**
	 * Constructs a new Resource Artefact test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceArtefactTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Artefact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceArtefact getFixture() {
		return (ResourceArtefact)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MappingFactory.eINSTANCE.createResourceArtefact());
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

} //ResourceArtefactTest
