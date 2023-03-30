/**
 */
package org.polarsys.time4sys.marte.gqam.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Periodic Pattern</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PeriodicPatternTest extends ArrivalPatternTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PeriodicPatternTest.class);
	}

	/**
	 * Constructs a new Periodic Pattern test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicPatternTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Periodic Pattern test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PeriodicPattern getFixture() {
		return (PeriodicPattern)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GqamFactory.eINSTANCE.createPeriodicPattern());
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

} //PeriodicPatternTest
