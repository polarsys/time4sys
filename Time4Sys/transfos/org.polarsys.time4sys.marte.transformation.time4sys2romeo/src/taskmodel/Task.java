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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taskmodel.Task#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link taskmodel.Task#getAllFragments <em>All Fragments</em>}</li>
 *   <li>{@link taskmodel.Task#getFragments <em>Fragments</em>}</li>
 *   <li>{@link taskmodel.Task#getSharingResourceFragments <em>Sharing Resource Fragments</em>}</li>
 * </ul>
 *
 * @see taskmodel.TaskmodelPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Stimulus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimulus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimulus</em>' containment reference.
	 * @see #setStimulus(Stimulus)
	 * @see taskmodel.TaskmodelPackage#getTask_Stimulus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Stimulus getStimulus();

	/**
	 * Sets the value of the '{@link taskmodel.Task#getStimulus <em>Stimulus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus</em>' containment reference.
	 * @see #getStimulus()
	 * @generated
	 */
	void setStimulus(Stimulus value);

	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link taskmodel.Fragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see taskmodel.TaskmodelPackage#getTask_Fragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fragment> getFragments();

	/**
	 * Returns the value of the '<em><b>Sharing Resource Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link taskmodel.SharingResourceFragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sharing Resource Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sharing Resource Fragments</em>' containment reference list.
	 * @see taskmodel.TaskmodelPackage#getTask_SharingResourceFragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<SharingResourceFragment> getSharingResourceFragments();

	/**
	 * Returns the value of the '<em><b>All Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link taskmodel.AbstractFragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Fragments</em>' containment reference list.
	 * @see taskmodel.TaskmodelPackage#getTask_AllFragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractFragment> getAllFragments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Task clone();

} // Task
