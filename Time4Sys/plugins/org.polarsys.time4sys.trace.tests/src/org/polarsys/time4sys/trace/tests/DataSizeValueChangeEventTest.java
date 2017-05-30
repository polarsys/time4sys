/**
 */
package org.polarsys.time4sys.trace.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.trace.DataSizeValueChangeEvent;
import org.polarsys.time4sys.trace.TraceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Size Value Change Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSizeValueChangeEventTest extends ValueChangeEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataSizeValueChangeEventTest.class);
	}

	/**
	 * Constructs a new Data Size Value Change Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSizeValueChangeEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Size Value Change Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataSizeValueChangeEvent getFixture() {
		return (DataSizeValueChangeEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceFactory.eINSTANCE.createDataSizeValueChangeEvent());
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

} //DataSizeValueChangeEventTest
