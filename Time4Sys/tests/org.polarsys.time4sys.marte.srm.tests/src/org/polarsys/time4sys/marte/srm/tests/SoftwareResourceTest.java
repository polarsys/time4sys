/**
 */
package org.polarsys.time4sys.marte.srm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.srm.SoftwareResource;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Software Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareResourceTest extends TestCase {

	/**
	 * The fixture for this Software Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareResource fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SoftwareResourceTest.class);
	}

	/**
	 * Constructs a new Software Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareResourceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Software Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SoftwareResource fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Software Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareResource getFixture() {
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
		setFixture(SrmFactory.eINSTANCE.createSoftwareResource());
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

} //SoftwareResourceTest
