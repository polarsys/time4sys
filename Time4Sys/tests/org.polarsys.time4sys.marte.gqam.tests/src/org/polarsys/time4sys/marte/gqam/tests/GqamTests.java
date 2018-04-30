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

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>gqam</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GqamTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Test suite() {
		TestSuite suite = new GqamTests("gqam Tests");
		//suite.addTestSuite(AcquireStepTest.class);
		//suite.addTestSuite(BehaviorScenarioTest.class);
		//TODO suite.addTestSuite(BurstPatternTest.class);
		//suite.addTestSuite(CommunicationChannelTest.class);
		suite.addTestSuite(CommunicationStepTest.class);
		//suite.addTestSuite(DelayTest.class);
		//suite.addTestSuite(ExecutionStepTest.class);
		//suite.addTestSuite(InputPinTest.class);
		//suite.addTestSuite(LatencyObserverTest.class);
		//suite.addTestSuite(OutputPinTest.class);
		//suite.addTestSuite(ReleaseStepTest.class);
		//suite.addTestSuite(RequestedServiceTest.class);
		//suite.addTestSuite(ResourceServiceExcecutionTest.class);
		//suite.addTestSuite(StepTest.class);
		//suite.addTestSuite(TimedObserverTest.class);
		//suite.addTestSuite(WorkloadBehaviorTest.class);
		//suite.addTestSuite(WorkloadEventTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GqamTests(String name) {
		super(name);
	}

} //GqamTests
