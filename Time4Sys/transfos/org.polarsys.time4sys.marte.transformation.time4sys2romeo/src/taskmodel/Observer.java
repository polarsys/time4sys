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
 * A representation of the model object '<em><b>Observer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taskmodel.Observer#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link taskmodel.Observer#getConnections <em>Connections</em>}</li>
 *   <li>{@link taskmodel.Observer#getOwnedPlaces <em>Owned Places</em>}</li>
 *   <li>{@link taskmodel.Observer#getCheckPlaces <em>Check Places</em>}</li>
 * </ul>
 *
 * @see taskmodel.TaskmodelPackage#getObserver()
 * @model abstract="true"
 * @generated
 */
public interface Observer extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transitions</em>' containment reference list.
	 * @see taskmodel.TaskmodelPackage#getObserver_OwnedTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getOwnedTransitions();

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
	 * @see taskmodel.TaskmodelPackage#getObserver_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Owned Places</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Places</em>' containment reference list.
	 * @see taskmodel.TaskmodelPackage#getObserver_OwnedPlaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getOwnedPlaces();

	/**
	 * Returns the value of the '<em><b>Check Places</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Places</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Places</em>' reference list.
	 * @see taskmodel.TaskmodelPackage#getObserver_CheckPlaces()
	 * @model
	 * @generated
	 */
	EList<Place> getCheckPlaces();

} // Observer
