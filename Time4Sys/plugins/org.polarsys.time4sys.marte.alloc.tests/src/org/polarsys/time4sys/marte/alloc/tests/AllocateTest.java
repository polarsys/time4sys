/**
 */
package org.polarsys.time4sys.marte.alloc.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.alloc.AllocFactory;
import org.polarsys.time4sys.marte.alloc.Allocate;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Allocate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocateTest extends AbstractionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AllocateTest.class);
	}

	/**
	 * Constructs a new Allocate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Allocate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Allocate getFixture() {
		return (Allocate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AllocFactory.eINSTANCE.createAllocate());
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

} //AllocateTest
