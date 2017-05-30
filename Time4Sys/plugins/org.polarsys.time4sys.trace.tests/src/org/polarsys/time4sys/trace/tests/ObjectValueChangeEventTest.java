/**
 */
package org.polarsys.time4sys.trace.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.trace.ObjectValueChangeEvent;
import org.polarsys.time4sys.trace.TraceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Object Value Change Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectValueChangeEventTest extends ValueChangeEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObjectValueChangeEventTest.class);
	}

	/**
	 * Constructs a new Object Value Change Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectValueChangeEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Object Value Change Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ObjectValueChangeEvent getFixture() {
		return (ObjectValueChangeEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceFactory.eINSTANCE.createObjectValueChangeEvent());
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

} //ObjectValueChangeEventTest
