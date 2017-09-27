/**
 */
package org.polarsys.time4sys.marte.nfp.coreelements.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsFactory;
import org.polarsys.time4sys.marte.nfp.coreelements.Dependency;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecore.EModelElement#getEAnnotation(java.lang.String) <em>Get EAnnotation</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DependencyTest extends DirectedRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DependencyTest.class);
	}

	/**
	 * Constructs a new Dependency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Dependency getFixture() {
		return (Dependency)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreElementsFactory.eINSTANCE.createDependency());
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

	/**
	 * Tests the '{@link org.eclipse.emf.ecore.EModelElement#getEAnnotation(java.lang.String) <em>Get EAnnotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EModelElement#getEAnnotation(java.lang.String)
	 * @generated
	 */
	public void testGetEAnnotation__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DependencyTest
