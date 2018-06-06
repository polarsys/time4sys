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

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>hrm</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class HrmTests extends TestSuite {

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
		TestSuite suite = new HrmTests("hrm Tests");
		suite.addTestSuite(EnvConditionTest.class);
		suite.addTestSuite(FirmwareArchitectureTest.class);
		suite.addTestSuite(HardwareActuatorTest.class);
		suite.addTestSuite(HardwareArbiterTest.class);
		suite.addTestSuite(HardwareAsicTest.class);
		suite.addTestSuite(HardwareBranchPredictorTest.class);
		suite.addTestSuite(HardwareBridgeTest.class);
		suite.addTestSuite(HardwareBusTest.class);
		suite.addTestSuite(HardwareCacheTest.class);
		suite.addTestSuite(HardwareClockTest.class);
		suite.addTestSuite(HardwareCommunicationResourceTest.class);
		suite.addTestSuite(HardwareComputingResourceTest.class);
		suite.addTestSuite(HardwareConnectorTest.class);
		suite.addTestSuite(HardwareDeviceTest.class);
		suite.addTestSuite(HardwareDmaTest.class);
		suite.addTestSuite(HardwareDriveTest.class);
		suite.addTestSuite(HardwareInterfaceTest.class);
		suite.addTestSuite(HardwareInterfacePackageTest.class);
		suite.addTestSuite(HardwareIoTest.class);
		suite.addTestSuite(HardwareIpBlockTest.class);
		suite.addTestSuite(HardwareIsaTest.class);
		suite.addTestSuite(HardwareMediaTest.class);
		suite.addTestSuite(HardwareMemoryTest.class);
		suite.addTestSuite(HardwareMmuTest.class);
		suite.addTestSuite(HardwarePinTest.class);
		suite.addTestSuite(HardwarePlatformTest.class);
		suite.addTestSuite(HardwarePldTest.class);
		suite.addTestSuite(HardwarePortTest.class);
		suite.addTestSuite(HardwareProcessorTest.class);
		suite.addTestSuite(HardwareRamTest.class);
		suite.addTestSuite(HardwareResourcePackageTest.class);
		suite.addTestSuite(HardwareRomTest.class);
		suite.addTestSuite(HardwareSensorTest.class);
		suite.addTestSuite(HardwareServiceTest.class);
		suite.addTestSuite(HardwareStorageManagerTest.class);
		suite.addTestSuite(HardwareSupportTest.class);
		suite.addTestSuite(HardwareTimingResourceTest.class);
		suite.addTestSuite(HardwareTimerTest.class);
		suite.addTestSuite(HardwareWatchdogTest.class);
		suite.addTestSuite(HardwareWireTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HrmTests(String name) {
		super(name);
	}

} //HrmTests
