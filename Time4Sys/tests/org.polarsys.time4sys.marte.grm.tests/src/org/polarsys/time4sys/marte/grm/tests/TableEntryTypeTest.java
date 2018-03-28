/**
 */
package org.polarsys.time4sys.marte.grm.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.TableEntryType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Table Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TableEntryTypeTest extends SchedulingParameterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TableEntryTypeTest.class);
	}

	/**
	 * Constructs a new Table Entry Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableEntryTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Table Entry Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TableEntryType getFixture() {
		return (TableEntryType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GrmFactory.eINSTANCE.createTableEntryType());
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

} //TableEntryTypeTest
