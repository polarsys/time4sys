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

import petrinet.Connection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sharing Resource Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taskmodel.SharingResourceFragment#getFirstFragment <em>First Fragment</em>}</li>
 *   <li>{@link taskmodel.SharingResourceFragment#getSecondFragment <em>Second Fragment</em>}</li>
 *   <li>{@link taskmodel.SharingResourceFragment#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see taskmodel.TaskmodelPackage#getSharingResourceFragment()
 * @model
 * @generated
 */
public interface SharingResourceFragment extends AbstractFragment {
	/**
	 * Returns the value of the '<em><b>First Fragment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Fragment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Fragment</em>' containment reference.
	 * @see #setFirstFragment(Fragment)
	 * @see taskmodel.TaskmodelPackage#getSharingResourceFragment_FirstFragment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Fragment getFirstFragment();

	/**
	 * Sets the value of the '{@link taskmodel.SharingResourceFragment#getFirstFragment <em>First Fragment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Fragment</em>' containment reference.
	 * @see #getFirstFragment()
	 * @generated
	 */
	void setFirstFragment(Fragment value);

	/**
	 * Returns the value of the '<em><b>Second Fragment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Fragment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Fragment</em>' containment reference.
	 * @see #setSecondFragment(Fragment)
	 * @see taskmodel.TaskmodelPackage#getSharingResourceFragment_SecondFragment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Fragment getSecondFragment();

	/**
	 * Sets the value of the '{@link taskmodel.SharingResourceFragment#getSecondFragment <em>Second Fragment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Fragment</em>' containment reference.
	 * @see #getSecondFragment()
	 * @generated
	 */
	void setSecondFragment(Fragment value);

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
	 * @see taskmodel.TaskmodelPackage#getSharingResourceFragment_Connections()
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
	SharingResourceFragment clone();

} // SharingResourceFragment
