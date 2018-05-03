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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Isa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareIsa#getFamily <em>Family</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareIsa#getInstWidth <em>Inst Width</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareIsa#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareIsa()
 * @model
 * @generated
 */
public interface HardwareIsa extends HardwareResource {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(String)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareIsa_Family()
	 * @model
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareIsa#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(String value);

	/**
	 * Returns the value of the '<em><b>Inst Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inst Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inst Width</em>' attribute.
	 * @see #setInstWidth(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareIsa_InstWidth()
	 * @model
	 * @generated
	 */
	int getInstWidth();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareIsa#getInstWidth <em>Inst Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inst Width</em>' attribute.
	 * @see #getInstWidth()
	 * @generated
	 */
	void setInstWidth(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.hrm.IsaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.IsaType
	 * @see #setType(IsaType)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareIsa_Type()
	 * @model
	 * @generated
	 */
	IsaType getType();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareIsa#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.IsaType
	 * @see #getType()
	 * @generated
	 */
	void setType(IsaType value);

} // HardwareIsa
