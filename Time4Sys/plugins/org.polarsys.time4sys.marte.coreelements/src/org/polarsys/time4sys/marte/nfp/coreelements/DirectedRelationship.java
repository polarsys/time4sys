/**
 */
package org.polarsys.time4sys.marte.nfp.coreelements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.coreelements.DirectedRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.coreelements.DirectedRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage#getDirectedRelationship()
 * @model abstract="true"
 * @generated
 */
public interface DirectedRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage#getDirectedRelationship_Source()
	 * @model
	 * @generated
	 */
	EList<EObject> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage#getDirectedRelationship_Target()
	 * @model
	 * @generated
	 */
	EList<EObject> getTarget();

} // DirectedRelationship
