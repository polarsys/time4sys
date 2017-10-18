/**
 */
package org.polarsys.time4sys.trace.tests;

import org.polarsys.time4sys.trace.DurationValueChangeEvent;
import org.polarsys.time4sys.trace.TraceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Duration Value Change Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DurationValueChangeEventTest extends ValueChangeEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DurationValueChangeEventTest.class);
	}

	/**
	 * Constructs a new Duration Value Change Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationValueChangeEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Duration Value Change Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DurationValueChangeEvent getFixture() {
		return (DurationValueChangeEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceFactory.eINSTANCE.createDurationValueChangeEvent());
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

} //DurationValueChangeEventTest
