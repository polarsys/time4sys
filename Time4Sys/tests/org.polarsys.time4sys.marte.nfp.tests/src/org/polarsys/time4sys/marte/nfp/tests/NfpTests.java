/**
 */
package org.polarsys.time4sys.marte.nfp.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>nfp</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class NfpTests extends TestSuite {

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
		TestSuite suite = new NfpTests("nfp Tests");
		suite.addTestSuite(CompositeDistributionTest.class);
		suite.addTestSuite(DataSizeTest.class);
		suite.addTestSuite(DataTxRateTest.class);
		suite.addTestSuite(DiscreteDistributionTest.class);
		suite.addTestSuite(DurationTest.class);
		suite.addTestSuite(GeneralizedExtremeValueDistributionTest.class);
		suite.addTestSuite(NormalDistributionTest.class);
		suite.addTestSuite(ProbabilisticDurationTest.class);
		suite.addTestSuite(TimeIntervalTest.class);
		suite.addTestSuite(UniformDistributionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NfpTests(String name) {
		super(name);
	}

} //NfpTests
