/**
 */
package org.polarsys.time4sys.marte.gqam.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Precedence Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrecedenceRelationTest extends TestCase {

	/**
	 * The fixture for this Precedence Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecedenceRelation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrecedenceRelationTest.class);
	}

	/**
	 * Constructs a new Precedence Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceRelationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Precedence Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PrecedenceRelation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Precedence Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecedenceRelation getFixture() {
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
		setFixture(GqamFactory.eINSTANCE.createPrecedenceRelation());
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

} //PrecedenceRelationTest
