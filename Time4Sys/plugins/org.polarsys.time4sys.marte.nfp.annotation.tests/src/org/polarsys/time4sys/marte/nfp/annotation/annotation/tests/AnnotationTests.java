/**
 */
package org.polarsys.time4sys.marte.nfp.annotation.annotation.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>annotation</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationTests extends TestSuite {

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
		TestSuite suite = new AnnotationTests("annotation Tests");
		suite.addTestSuite(ModelingConcernTest.class);
		suite.addTestSuite(ConstraintTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationTests(String name) {
		super(name);
	}

} //AnnotationTests
