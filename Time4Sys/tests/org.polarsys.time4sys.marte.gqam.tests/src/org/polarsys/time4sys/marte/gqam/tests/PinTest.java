/**
 */
package org.polarsys.time4sys.marte.gqam.tests;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EcoreFactory;
import org.polarsys.time4sys.marte.gqam.Pin;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecore.EModelElement#getEAnnotation(java.lang.String) <em>Get EAnnotation</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class PinTest extends MultiplicityElementTest {

	/**
	 * Constructs a new Pin test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Pin getFixture() {
		return (Pin)fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.emf.ecore.EModelElement#getEAnnotation(java.lang.String) <em>Get EAnnotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EModelElement#getEAnnotation(java.lang.String)
	 * @generated
	 */
	public void testGetEAnnotation__String() {
		final Pin pin = getFixture();
		assertNotNull(pin.getEAnnotations());
		final EAnnotation myAnnot = EcoreFactory.eINSTANCE.createEAnnotation();
		myAnnot.setSource("test");
		pin.getEAnnotations().add(myAnnot);
		assertSame(myAnnot, pin.getEAnnotation("test"));
	}

} //PinTest
