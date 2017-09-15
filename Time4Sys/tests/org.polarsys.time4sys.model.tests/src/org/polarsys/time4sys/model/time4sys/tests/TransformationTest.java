/**
 */
package org.polarsys.time4sys.model.time4sys.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.polarsys.time4sys.model.time4sys.Time4sysFactory;
import org.polarsys.time4sys.model.time4sys.Transformation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationTest extends TestCase {

	/**
	 * The fixture for this Transformation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transformation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransformationTest.class);
	}

	/**
	 * Constructs a new Transformation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Transformation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Transformation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Transformation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transformation getFixture() {
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
		setFixture(Time4sysFactory.eINSTANCE.createTransformation());
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

} //TransformationTest
