/**
 */
package org.polarsys.time4sys.marte.nfp.coreelements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.coreelements.Package#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.nfp.coreelements.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage#getPackage_OwnedElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageableElement> getOwnedElement();

} // Package
