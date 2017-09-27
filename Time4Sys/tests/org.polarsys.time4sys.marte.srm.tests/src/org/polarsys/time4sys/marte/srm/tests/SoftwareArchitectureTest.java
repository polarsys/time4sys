/**
 */
package org.polarsys.time4sys.marte.srm.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.srm.SoftwareArchitecture;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Software Architecture</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareArchitectureTest extends SoftwareResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SoftwareArchitectureTest.class);
	}

	/**
	 * Constructs a new Software Architecture test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareArchitectureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Software Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SoftwareArchitecture getFixture() {
		return (SoftwareArchitecture)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SrmFactory.eINSTANCE.createSoftwareArchitecture());
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

} //SoftwareArchitectureTest
