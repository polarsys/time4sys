/**
 */
package org.polarsys.time4sys.marte.gqam.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.ResourceServiceExcecution;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Service Excecution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceServiceExcecutionTest extends StepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceServiceExcecutionTest.class);
	}

	/**
	 * Constructs a new Resource Service Excecution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceServiceExcecutionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Service Excecution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceServiceExcecution getFixture() {
		return (ResourceServiceExcecution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GqamFactory.eINSTANCE.createResourceServiceExcecution());
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

} //ResourceServiceExcecutionTest
