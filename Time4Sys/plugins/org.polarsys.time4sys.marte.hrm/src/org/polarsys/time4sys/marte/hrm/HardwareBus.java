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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareBus#getAddressWidth <em>Address Width</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareBus#getWordWidth <em>Word Width</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareBus#isIsSynchronous <em>Is Synchronous</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareBus#isIsSerial <em>Is Serial</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareBus()
 * @model
 * @generated
 */
public interface HardwareBus extends HardwareMedia {
	/**
	 * Returns the value of the '<em><b>Address Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Width</em>' attribute.
	 * @see #setAddressWidth(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareBus_AddressWidth()
	 * @model
	 * @generated
	 */
	int getAddressWidth();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareBus#getAddressWidth <em>Address Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Width</em>' attribute.
	 * @see #getAddressWidth()
	 * @generated
	 */
	void setAddressWidth(int value);

	/**
	 * Returns the value of the '<em><b>Word Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Word Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Word Width</em>' attribute.
	 * @see #setWordWidth(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareBus_WordWidth()
	 * @model
	 * @generated
	 */
	int getWordWidth();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareBus#getWordWidth <em>Word Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word Width</em>' attribute.
	 * @see #getWordWidth()
	 * @generated
	 */
	void setWordWidth(int value);

	/**
	 * Returns the value of the '<em><b>Is Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Synchronous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Synchronous</em>' attribute.
	 * @see #setIsSynchronous(boolean)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareBus_IsSynchronous()
	 * @model
	 * @generated
	 */
	boolean isIsSynchronous();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareBus#isIsSynchronous <em>Is Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Synchronous</em>' attribute.
	 * @see #isIsSynchronous()
	 * @generated
	 */
	void setIsSynchronous(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Serial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Serial</em>' attribute.
	 * @see #setIsSerial(boolean)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareBus_IsSerial()
	 * @model
	 * @generated
	 */
	boolean isIsSerial();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareBus#isIsSerial <em>Is Serial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Serial</em>' attribute.
	 * @see #isIsSerial()
	 * @generated
	 */
	void setIsSerial(boolean value);

} // HardwareBus
