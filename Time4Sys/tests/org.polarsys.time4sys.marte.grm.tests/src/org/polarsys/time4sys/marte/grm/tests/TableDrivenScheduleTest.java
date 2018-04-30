/**
 */
package org.polarsys.time4sys.marte.grm.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.TableDrivenSchedule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Table Driven Schedule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TableDrivenScheduleTest extends ScheduleSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TableDrivenScheduleTest.class);
	}

	/**
	 * Constructs a new Table Driven Schedule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableDrivenScheduleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Table Driven Schedule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TableDrivenSchedule getFixture() {
		return (TableDrivenSchedule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GrmFactory.eINSTANCE.createTableDrivenSchedule());
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

} //TableDrivenScheduleTest
