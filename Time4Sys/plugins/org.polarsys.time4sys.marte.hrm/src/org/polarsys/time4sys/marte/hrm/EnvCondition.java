/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.hrm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.EnvCondition#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.EnvCondition#getStatus <em>Status</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.EnvCondition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.EnvCondition#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getEnvCondition()
 * @model
 * @generated
 */
public interface EnvCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.hrm.ConditionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.ConditionType
	 * @see #setType(ConditionType)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getEnvCondition_Type()
	 * @model
	 * @generated
	 */
	ConditionType getType();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.EnvCondition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.ConditionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConditionType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.hrm.ComponentState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.ComponentState
	 * @see #setStatus(ComponentState)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getEnvCondition_Status()
	 * @model
	 * @generated
	 */
	ComponentState getStatus();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.EnvCondition#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.ComponentState
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ComponentState value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getEnvCondition_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.EnvCondition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getEnvCondition_Range()
	 * @model
	 * @generated
	 */
	int getRange();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.EnvCondition#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(int value);

} // EnvCondition
