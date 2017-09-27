/**
 */
package org.polarsys.time4sys.marte.nfp.coreelements.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>coreelements</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreElementsTests extends TestSuite {

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
		TestSuite suite = new CoreElementsTests("coreelements Tests");
		suite.addTestSuite(AbstractionTest.class);
		suite.addTestSuite(DependencyTest.class);
		suite.addTestSuite(PackageTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreElementsTests(String name) {
		super(name);
	}

} //CoreElementsTests
