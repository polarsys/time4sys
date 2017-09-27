/**
 */
package org.polarsys.time4sys.marte.gqam.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.TimedObserver;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timed Observer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimedObserverTest extends TestCase {

	/**
	 * The fixture for this Timed Observer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedObserver fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimedObserverTest.class);
	}

	/**
	 * Constructs a new Timed Observer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedObserverTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Timed Observer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TimedObserver fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Timed Observer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedObserver getFixture() {
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
		setFixture(GqamFactory.eINSTANCE.createTimedObserver());
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

} //TimedObserverTest
