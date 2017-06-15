/**
 */
package org.polarsys.time4sys.marte.nfp.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.UniformDistribution;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uniform Distribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniformDistributionTest extends ProbabilisticDurationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UniformDistributionTest.class);
	}

	/**
	 * Constructs a new Uniform Distribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformDistributionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Uniform Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UniformDistribution getFixture() {
		return (UniformDistribution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfpFactory.eINSTANCE.createUniformDistribution());
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

} //UniformDistributionTest
