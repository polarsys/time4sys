/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.analysisrepository.tysco.Period_Sustainability;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Period Sustainability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Period_SustainabilityTest extends SustainabilityTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Period_SustainabilityTest.class);
	}

	/**
	 * Constructs a new Period Sustainability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period_SustainabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Period Sustainability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Period_Sustainability getFixture() {
		return (Period_Sustainability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyscoFactory.eINSTANCE.createPeriod_Sustainability());
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

} //Period_SustainabilityTest
