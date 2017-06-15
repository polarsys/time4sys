/**
 */
package org.polarsys.time4sys.marte.nfp.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.nfp.DiscreteDistribution;
import org.polarsys.time4sys.marte.nfp.NfpFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Discrete Distribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscreteDistributionTest extends ProbabilisticDurationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiscreteDistributionTest.class);
	}

	/**
	 * Constructs a new Discrete Distribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteDistributionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Discrete Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DiscreteDistribution getFixture() {
		return (DiscreteDistribution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfpFactory.eINSTANCE.createDiscreteDistribution());
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

} //DiscreteDistributionTest
