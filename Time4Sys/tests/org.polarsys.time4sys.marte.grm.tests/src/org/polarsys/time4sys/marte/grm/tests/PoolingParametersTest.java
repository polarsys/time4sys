/**
 */
package org.polarsys.time4sys.marte.grm.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.PoolingParameters;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pooling Parameters</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PoolingParametersTest extends FixedPriorityParametersTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PoolingParametersTest.class);
	}

	/**
	 * Constructs a new Pooling Parameters test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolingParametersTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pooling Parameters test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PoolingParameters getFixture() {
		return (PoolingParameters)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GrmFactory.eINSTANCE.createPoolingParameters());
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

} //PoolingParametersTest
