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

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>grm</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrmTests extends TestSuite {

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
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new GrmTests("grm Tests");
//		suite.addTestSuite(AccessControlPolicyTest.class);
//		suite.addTestSuite(ClockResourceTest.class);
//		suite.addTestSuite(CommunicationMediaTest.class);
//		suite.addTestSuite(ComputingResourceTest.class);
//		suite.addTestSuite(ConcurrencyResourceTest.class);
//		suite.addTestSuite(DeviceResourceTest.class);
//		suite.addTestSuite(MutualExclusionProtocolTest.class);
//		suite.addTestSuite(MutualExclusionResourceTest.class);
//		suite.addTestSuite(ProtectionParameterTest.class);
//		suite.addTestSuite(ResourceBrokerTest.class);
//		suite.addTestSuite(ResourceControlPolicyTest.class);
//		suite.addTestSuite(ResourceInstanceTest.class);
//		suite.addTestSuite(ResourceInterfaceTest.class);
//		suite.addTestSuite(ResourceManagerTest.class);
//		suite.addTestSuite(ResourcePackageTest.class);
//		suite.addTestSuite(ResourcePortTest.class);
//		suite.addTestSuite(ResourceServiceTest.class);
//		suite.addTestSuite(SchedulerTest.class);
//		suite.addTestSuite(SchedulableResourceTest.class);
//		suite.addTestSuite(SchedulingParameterTest.class);
		suite.addTestSuite(SchedulingPolicyTest.class);
//		suite.addTestSuite(SecondarySchedulerTest.class);
//		suite.addTestSuite(StorageResourceTest.class);
//		suite.addTestSuite(SynchResourceTest.class);
//		suite.addTestSuite(TimerResourceTest.class);
//		suite.addTestSuite(UsageTypedAmountTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrmTests(String name) {
		super(name);
	}

} //GrmTests
