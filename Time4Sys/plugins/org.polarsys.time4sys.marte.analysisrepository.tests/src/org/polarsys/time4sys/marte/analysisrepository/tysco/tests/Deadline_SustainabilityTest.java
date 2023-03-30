/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.analysisrepository.tysco.Deadline_Sustainability;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Deadline Sustainability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Deadline_SustainabilityTest extends SustainabilityTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Deadline_SustainabilityTest.class);
	}

	/**
	 * Constructs a new Deadline Sustainability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deadline_SustainabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Deadline Sustainability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Deadline_Sustainability getFixture() {
		return (Deadline_Sustainability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyscoFactory.eINSTANCE.createDeadline_Sustainability());
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

} //Deadline_SustainabilityTest
