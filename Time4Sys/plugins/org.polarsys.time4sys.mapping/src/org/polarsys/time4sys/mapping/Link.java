/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.mapping.Link#getSubLinks <em>Sub Links</em>}</li>
 *   <li>{@link org.polarsys.time4sys.mapping.Link#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.polarsys.time4sys.mapping.Link#getSources <em>Sources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.mapping.Link#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.mapping.MappingPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.mapping.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Links</em>' containment reference list.
	 * @see org.polarsys.time4sys.mapping.MappingPackage#getLink_SubLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getSubLinks();

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' reference.
	 * @see #setRationale(Context)
	 * @see org.polarsys.time4sys.mapping.MappingPackage#getLink_Rationale()
	 * @model
	 * @generated
	 */
	Context getRationale();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.mapping.Link#getRationale <em>Rationale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' reference.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(Context value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.mapping.MappableArtefact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see org.polarsys.time4sys.mapping.MappingPackage#getLink_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappableArtefact> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.mapping.MappableArtefact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see org.polarsys.time4sys.mapping.MappingPackage#getLink_Targets()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappableArtefact> getTargets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject getUniqueSourceValue(String role);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject getUniqueTargetValue(String role);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<EObject> getSources(String role);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<EObject> getTargets(String role);

} // Link
