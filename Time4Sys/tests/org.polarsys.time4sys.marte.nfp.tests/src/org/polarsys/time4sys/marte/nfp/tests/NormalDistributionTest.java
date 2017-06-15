/**
 */
package org.polarsys.time4sys.marte.nfp.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.NormalDistribution;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Normal Distribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NormalDistributionTest extends ProbabilisticDurationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NormalDistributionTest.class);
	}

	/**
	 * Constructs a new Normal Distribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalDistributionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Normal Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NormalDistribution getFixture() {
		return (NormalDistribution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfpFactory.eINSTANCE.createNormalDistribution());
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

} //NormalDistributionTest
