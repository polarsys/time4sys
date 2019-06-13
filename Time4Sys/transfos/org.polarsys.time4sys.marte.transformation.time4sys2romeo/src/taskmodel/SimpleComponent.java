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
import petrinet.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taskmodel.SimpleComponent#getOwnedTransition <em>Owned Transition</em>}</li>
 *   <li>{@link taskmodel.SimpleComponent#getConnections <em>Connections</em>}</li>
 *   <li>{@link taskmodel.SimpleComponent#getOwnedPlace <em>Owned Place</em>}</li>
 * </ul>
 *
 * @see taskmodel.TaskmodelPackage#getSimpleComponent()
 * @model abstract="true"
 * @generated
 */
public interface SimpleComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transition</em>' containment reference.
	 * @see #setOwnedTransition(Transition)
	 * @see taskmodel.TaskmodelPackage#getSimpleComponent_OwnedTransition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Transition getOwnedTransition();

	/**
	 * Sets the value of the '{@link taskmodel.SimpleComponent#getOwnedTransition <em>Owned Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Transition</em>' containment reference.
	 * @see #getOwnedTransition()
	 * @generated
	 */
	void setOwnedTransition(Transition value);

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
	 * @see taskmodel.TaskmodelPackage#getSimpleComponent_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Owned Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Place</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Place</em>' containment reference.
	 * @see #setOwnedPlace(Place)
	 * @see taskmodel.TaskmodelPackage#getSimpleComponent_OwnedPlace()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Place getOwnedPlace();

	/**
	 * Sets the value of the '{@link taskmodel.SimpleComponent#getOwnedPlace <em>Owned Place</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Place</em>' containment reference.
	 * @see #getOwnedPlace()
	 * @generated
	 */
	void setOwnedPlace(Place value);

} // SimpleComponent
