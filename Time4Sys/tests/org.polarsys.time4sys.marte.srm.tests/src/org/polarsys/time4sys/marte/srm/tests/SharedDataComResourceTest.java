/**
 */
package org.polarsys.time4sys.marte.srm.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.srm.SharedDataComResource;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shared Data Com Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SharedDataComResourceTest extends SoftwareCommunicationResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SharedDataComResourceTest.class);
	}

	/**
	 * Constructs a new Shared Data Com Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedDataComResourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Shared Data Com Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SharedDataComResource getFixture() {
		return (SharedDataComResource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SrmFactory.eINSTANCE.createSharedDataComResource());
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

} //SharedDataComResourceTest
