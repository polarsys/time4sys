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

import org.polarsys.time4sys.marte.gqam.CommunicationChannel;
import org.polarsys.time4sys.marte.gqam.CommunicationStep;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.marte.srm.SrmFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Communication Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationStepTest extends StepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommunicationStepTest.class);
	}

	/**
	 * Constructs a new Communication Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Communication Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CommunicationStep getFixture() {
		return (CommunicationStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GqamFactory.eINSTANCE.createCommunicationStep());
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
	
	public void testConcurResRedefinition() {
		final CommunicationStep comStep = (CommunicationStep)fixture;
		final CommunicationChannel aComChan = GqamFactory.eINSTANCE.createCommunicationChannel();
		assertNull(comStep.getConcurRes());
		comStep.setConcurRes(aComChan);
		assertEquals(aComChan, comStep.getConcurRes());
		final SchedulableResource aSchedRes = SrmFactory.eINSTANCE.createSoftwareSchedulableResource();
		try {
			comStep.setConcurRes(aSchedRes);
			fail("concurRes attribute is redefined to accept only CommunicationChannel.");
		} catch (IllegalArgumentException e) {
			
		}
	}
	
	

} //CommunicationStepTest
