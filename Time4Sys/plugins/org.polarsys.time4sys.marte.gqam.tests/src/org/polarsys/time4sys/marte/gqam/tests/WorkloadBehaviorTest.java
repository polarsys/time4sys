/**
 */
package org.polarsys.time4sys.marte.gqam.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.WorkloadBehavior;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Workload Behavior</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkloadBehaviorTest extends TestCase {

	/**
	 * The fixture for this Workload Behavior test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadBehavior fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkloadBehaviorTest.class);
	}

	/**
	 * Constructs a new Workload Behavior test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadBehaviorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Workload Behavior test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(WorkloadBehavior fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Workload Behavior test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadBehavior getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GqamFactory.eINSTANCE.createWorkloadBehavior());
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

} //WorkloadBehaviorTest
