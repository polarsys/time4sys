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
package org.polarsys.time4sys.marte.hrm;

import org.eclipse.emf.common.util.EList;

import org.polarsys.time4sys.marte.grm.ResourcePort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwarePort#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwarePort#getRealizedBy <em>Realized By</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwarePort()
 * @model
 * @generated
 */
public interface HardwarePort extends ResourcePort, HardwareComponent {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.hrm.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.PortType
	 * @see #setType(PortType)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwarePort_Type()
	 * @model
	 * @generated
	 */
	PortType getType();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwarePort#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.PortType
	 * @see #getType()
	 * @generated
	 */
	void setType(PortType value);

	/**
	 * Returns the value of the '<em><b>Realized By</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwarePin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized By</em>' reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwarePort_RealizedBy()
	 * @model
	 * @generated
	 */
	EList<HardwarePin> getRealizedBy();

} // HardwarePort
