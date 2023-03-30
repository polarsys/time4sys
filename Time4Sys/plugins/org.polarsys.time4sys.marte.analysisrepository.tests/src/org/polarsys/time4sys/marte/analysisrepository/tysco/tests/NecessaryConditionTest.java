/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.analysisrepository.tysco.NecessaryCondition;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Necessary Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NecessaryConditionTest extends FeasibilityTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NecessaryConditionTest.class);
	}

	/**
	 * Constructs a new Necessary Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NecessaryConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Necessary Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NecessaryCondition getFixture() {
		return (NecessaryCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyscoFactory.eINSTANCE.createNecessaryCondition());
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

} //NecessaryConditionTest
