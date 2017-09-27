/**
 */
package org.polarsys.time4sys.marte.srm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.srm.DeviceBroker;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Device Broker</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceBrokerTest extends TestCase {

	/**
	 * The fixture for this Device Broker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceBroker fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeviceBrokerTest.class);
	}

	/**
	 * Constructs a new Device Broker test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceBrokerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Device Broker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DeviceBroker fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Device Broker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceBroker getFixture() {
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
		setFixture(SrmFactory.eINSTANCE.createDeviceBroker());
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

} //DeviceBrokerTest
