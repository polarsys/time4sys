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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stimulus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taskmodel.Stimulus#getOffset <em>Offset</em>}</li>
 *   <li>{@link taskmodel.Stimulus#getFirstRelease <em>First Release</em>}</li>
 *   <li>{@link taskmodel.Stimulus#getPeriod <em>Period</em>}</li>
 *   <li>{@link taskmodel.Stimulus#getJitter <em>Jitter</em>}</li>
 * </ul>
 *
 * @see taskmodel.TaskmodelPackage#getStimulus()
 * @model
 * @generated
 */
public interface Stimulus extends EObject {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(Offset)
	 * @see taskmodel.TaskmodelPackage#getStimulus_Offset()
	 * @model containment="true"
	 * @generated
	 */
	Offset getOffset();

	/**
	 * Sets the value of the '{@link taskmodel.Stimulus#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Offset value);

	/**
	 * Returns the value of the '<em><b>First Release</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Release</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Release</em>' containment reference.
	 * @see #setFirstRelease(First_Release)
	 * @see taskmodel.TaskmodelPackage#getStimulus_FirstRelease()
	 * @model containment="true"
	 * @generated
	 */
	First_Release getFirstRelease();

	/**
	 * Sets the value of the '{@link taskmodel.Stimulus#getFirstRelease <em>First Release</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Release</em>' containment reference.
	 * @see #getFirstRelease()
	 * @generated
	 */
	void setFirstRelease(First_Release value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see taskmodel.TaskmodelPackage#getStimulus_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link taskmodel.Stimulus#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitter</em>' containment reference.
	 * @see #setJitter(Jitter)
	 * @see taskmodel.TaskmodelPackage#getStimulus_Jitter()
	 * @model containment="true"
	 * @generated
	 */
	Jitter getJitter();

	/**
	 * Sets the value of the '{@link taskmodel.Stimulus#getJitter <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' containment reference.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(Jitter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Stimulus clone();

} // Stimulus
