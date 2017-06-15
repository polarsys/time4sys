/**
 */
package org.polarsys.time4sys.marte.nfp.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.nfp.CompositeDistribution;
import org.polarsys.time4sys.marte.nfp.NfpFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composite Distribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeDistributionTest extends ProbabilisticDurationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositeDistributionTest.class);
	}

	/**
	 * Constructs a new Composite Distribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDistributionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Composite Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompositeDistribution getFixture() {
		return (CompositeDistribution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfpFactory.eINSTANCE.createCompositeDistribution());
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

} //CompositeDistributionTest
