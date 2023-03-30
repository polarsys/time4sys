/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.analysisrepository.tysco.ExecutionTime_Sustainability;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Execution Time Sustainability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionTime_SustainabilityTest extends SustainabilityTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExecutionTime_SustainabilityTest.class);
	}

	/**
	 * Constructs a new Execution Time Sustainability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionTime_SustainabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Execution Time Sustainability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExecutionTime_Sustainability getFixture() {
		return (ExecutionTime_Sustainability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyscoFactory.eINSTANCE.createExecutionTime_Sustainability());
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

} //ExecutionTime_SustainabilityTest
