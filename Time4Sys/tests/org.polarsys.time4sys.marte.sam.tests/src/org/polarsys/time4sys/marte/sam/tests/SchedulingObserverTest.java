/**
 */
package org.polarsys.time4sys.marte.sam.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.sam.SamFactory;
import org.polarsys.time4sys.marte.sam.SchedulingObserver;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scheduling Observer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedulingObserverTest extends TestCase {

	/**
	 * The fixture for this Scheduling Observer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingObserver fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SchedulingObserverTest.class);
	}

	/**
	 * Constructs a new Scheduling Observer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingObserverTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Scheduling Observer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SchedulingObserver fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Scheduling Observer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingObserver getFixture() {
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
		setFixture(SamFactory.eINSTANCE.createSchedulingObserver());
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

} //SchedulingObserverTest
