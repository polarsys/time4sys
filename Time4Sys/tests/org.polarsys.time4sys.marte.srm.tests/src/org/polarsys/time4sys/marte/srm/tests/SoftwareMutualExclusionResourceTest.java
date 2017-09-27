/**
 */
package org.polarsys.time4sys.marte.srm.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Software Mutual Exclusion Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareMutualExclusionResourceTest extends SoftwareSynchronizationResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SoftwareMutualExclusionResourceTest.class);
	}

	/**
	 * Constructs a new Software Mutual Exclusion Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareMutualExclusionResourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Software Mutual Exclusion Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SoftwareMutualExclusionResource getFixture() {
		return (SoftwareMutualExclusionResource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SrmFactory.eINSTANCE.createSoftwareMutualExclusionResource());
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

} //SoftwareMutualExclusionResourceTest
