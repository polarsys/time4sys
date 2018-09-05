/**
 */
package org.polarsys.time4sys.marte.nfp.tests;

import junit.textui.TestRunner;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.ProbabilisticDuration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Probabilistic Duration</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public abstract class ProbabilisticDurationTest extends DurationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProbabilisticDurationTest.class);
	}

	/**
	 * Constructs a new Probabilistic Duration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilisticDurationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Probabilistic Duration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProbabilisticDuration getFixture() {
		return (ProbabilisticDuration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfpFactory.eINSTANCE.createProbabilisticDuration());
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

} //ProbabilisticDurationTest
