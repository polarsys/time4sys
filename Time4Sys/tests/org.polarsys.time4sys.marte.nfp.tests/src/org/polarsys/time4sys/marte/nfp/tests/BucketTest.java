/**
 */
package org.polarsys.time4sys.marte.nfp.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.nfp.Bucket;
import org.polarsys.time4sys.marte.nfp.NfpFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bucket</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BucketTest extends TestCase {

	/**
	 * The fixture for this Bucket test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bucket fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BucketTest.class);
	}

	/**
	 * Constructs a new Bucket test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BucketTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Bucket test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Bucket fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Bucket test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bucket getFixture() {
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
		setFixture(NfpFactory.eINSTANCE.createBucket());
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

} //BucketTest
