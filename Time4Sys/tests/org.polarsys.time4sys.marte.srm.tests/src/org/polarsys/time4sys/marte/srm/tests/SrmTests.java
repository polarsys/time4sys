/**
 */
package org.polarsys.time4sys.marte.srm.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>srm</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SrmTests extends TestSuite {

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
		TestSuite suite = new SrmTests("srm Tests");
		suite.addTestSuite(AlarmTest.class);
		suite.addTestSuite(DeviceBrokerTest.class);
		suite.addTestSuite(InterruptResourceTest.class);
		suite.addTestSuite(MemoryBrokerTest.class);
		suite.addTestSuite(MemoryPartitionTest.class);
		suite.addTestSuite(MessageComResourceTest.class);
		suite.addTestSuite(NotificationResourceTest.class);
		suite.addTestSuite(SharedDataComResourceTest.class);
		suite.addTestSuite(SoftwareAccessServiceTest.class);
		suite.addTestSuite(SoftwareArchitectureTest.class);
		suite.addTestSuite(SoftwareInterfaceTest.class);
		suite.addTestSuite(SoftwareInterfacePackageTest.class);
		suite.addTestSuite(SoftwareMutualExclusionResourceTest.class);
		suite.addTestSuite(SoftwarePortTest.class);
		suite.addTestSuite(SoftwareResourceTest.class);
		suite.addTestSuite(SoftwareResourcePackageTest.class);
		suite.addTestSuite(SoftwareSchedulableResourceTest.class);
		suite.addTestSuite(SoftwareSchedulerTest.class);
		suite.addTestSuite(SoftwareServiceTest.class);
		suite.addTestSuite(SoftwareTimerResourceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrmTests(String name) {
		super(name);
	}

} //SrmTests
