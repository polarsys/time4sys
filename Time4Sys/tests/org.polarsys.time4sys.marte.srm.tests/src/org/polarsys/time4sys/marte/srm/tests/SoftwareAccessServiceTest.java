/**
 */
package org.polarsys.time4sys.marte.srm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.srm.SoftwareAccessService;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Software Access Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareAccessServiceTest extends TestCase {

	/**
	 * The fixture for this Software Access Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareAccessService fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SoftwareAccessServiceTest.class);
	}

	/**
	 * Constructs a new Software Access Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareAccessServiceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Software Access Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SoftwareAccessService fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Software Access Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareAccessService getFixture() {
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
		setFixture(SrmFactory.eINSTANCE.createSoftwareAccessService());
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

} //SoftwareAccessServiceTest
