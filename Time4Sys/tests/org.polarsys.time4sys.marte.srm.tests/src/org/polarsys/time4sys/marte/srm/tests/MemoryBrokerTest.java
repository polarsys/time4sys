/**
 */
package org.polarsys.time4sys.marte.srm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.srm.MemoryBroker;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Memory Broker</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MemoryBrokerTest extends TestCase {

	/**
	 * The fixture for this Memory Broker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryBroker fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MemoryBrokerTest.class);
	}

	/**
	 * Constructs a new Memory Broker test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryBrokerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Memory Broker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MemoryBroker fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Memory Broker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryBroker getFixture() {
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
		setFixture(SrmFactory.eINSTANCE.createMemoryBroker());
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

} //MemoryBrokerTest
