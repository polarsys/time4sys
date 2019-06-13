/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Thanh Dat NGUYEN- initial API and implementation
 *
 *******************************************************************************/
/**
 */
package taskmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import petrinet.Connection;
import petrinet.Place;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mutual Exclusion Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taskmodel.MutualExclusionResource#getMutualExclusionResourcePlace <em>Mutual Exclusion Resource Place</em>}</li>
 *   <li>{@link taskmodel.MutualExclusionResource#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see taskmodel.TaskmodelPackage#getMutualExclusionResource()
 * @model
 * @generated
 */
public interface MutualExclusionResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Mutual Exclusion Resource Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutual Exclusion Resource Place</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutual Exclusion Resource Place</em>' containment reference.
	 * @see #setMutualExclusionResourcePlace(Place)
	 * @see taskmodel.TaskmodelPackage#getMutualExclusionResource_MutualExclusionResourcePlace()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Place getMutualExclusionResourcePlace();

	/**
	 * Sets the value of the '{@link taskmodel.MutualExclusionResource#getMutualExclusionResourcePlace <em>Mutual Exclusion Resource Place</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutual Exclusion Resource Place</em>' containment reference.
	 * @see #getMutualExclusionResourcePlace()
	 * @generated
	 */
	void setMutualExclusionResourcePlace(Place value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see taskmodel.TaskmodelPackage#getMutualExclusionResource_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MutualExclusionResource clone();

} // MutualExclusionResource
