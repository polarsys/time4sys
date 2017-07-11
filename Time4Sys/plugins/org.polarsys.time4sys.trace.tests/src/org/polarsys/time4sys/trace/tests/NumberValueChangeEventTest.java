/**
 */
package org.polarsys.time4sys.trace.tests;

import org.polarsys.time4sys.trace.NumberValueChangeEvent;
import org.polarsys.time4sys.trace.TraceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Number Value Change Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumberValueChangeEventTest extends ValueChangeEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumberValueChangeEventTest.class);
	}

	/**
	 * Constructs a new Number Value Change Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberValueChangeEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Number Value Change Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NumberValueChangeEvent getFixture() {
		return (NumberValueChangeEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceFactory.eINSTANCE.createNumberValueChangeEvent());
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

} //NumberValueChangeEventTest
