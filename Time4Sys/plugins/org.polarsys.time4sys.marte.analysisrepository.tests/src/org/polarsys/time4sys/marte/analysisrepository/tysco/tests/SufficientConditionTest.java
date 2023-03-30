/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.analysisrepository.tysco.SufficientCondition;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sufficient Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SufficientConditionTest extends FeasibilityTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SufficientConditionTest.class);
	}

	/**
	 * Constructs a new Sufficient Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SufficientConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sufficient Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SufficientCondition getFixture() {
		return (SufficientCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyscoFactory.eINSTANCE.createSufficientCondition());
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

} //SufficientConditionTest
