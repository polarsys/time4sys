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

import petrinet.PetriNet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taskmodel.System#getObservers <em>Observers</em>}</li>
 *   <li>{@link taskmodel.System#getOwnedTasks <em>Owned Tasks</em>}</li>
 *   <li>{@link taskmodel.System#getOwnedMutualExclusionResources <em>Owned Mutual Exclusion Resources</em>}</li>
 * </ul>
 *
 * @see taskmodel.TaskmodelPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Observers</b></em>' containment reference list.
	 * The list contents are of type {@link taskmodel.Observer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observers</em>' containment reference list.
	 * @see taskmodel.TaskmodelPackage#getSystem_Observers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Observer> getObservers();

	/**
	 * Returns the value of the '<em><b>Owned Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link taskmodel.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tasks</em>' containment reference list.
	 * @see taskmodel.TaskmodelPackage#getSystem_OwnedTasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getOwnedTasks();

	/**
	 * Returns the value of the '<em><b>Owned Mutual Exclusion Resources</b></em>' containment reference list.
	 * The list contents are of type {@link taskmodel.MutualExclusionResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Mutual Exclusion Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Mutual Exclusion Resources</em>' containment reference list.
	 * @see taskmodel.TaskmodelPackage#getSystem_OwnedMutualExclusionResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<MutualExclusionResource> getOwnedMutualExclusionResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PetriNet convertToPetriNet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	System clone();

} // System
