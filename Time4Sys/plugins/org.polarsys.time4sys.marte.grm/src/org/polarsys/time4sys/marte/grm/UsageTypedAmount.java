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
package org.polarsys.time4sys.marte.grm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Typed Amount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getExecTime <em>Exec Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getMsgSize <em>Msg Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getAllocatedmemory <em>Allocatedmemory</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getUsedMemory <em>Used Memory</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getPowerPeak <em>Power Peak</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getEnergy <em>Energy</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getUsageTypedAmount()
 * @model
 * @generated
 */
public interface UsageTypedAmount extends Resource {
	/**
	 * Returns the value of the '<em><b>Exec Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exec Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exec Time</em>' attribute.
	 * @see #setExecTime(int)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getUsageTypedAmount_ExecTime()
	 * @model
	 * @generated
	 */
	int getExecTime();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getExecTime <em>Exec Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exec Time</em>' attribute.
	 * @see #getExecTime()
	 * @generated
	 */
	void setExecTime(int value);

	/**
	 * Returns the value of the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Size</em>' attribute.
	 * @see #setMsgSize(int)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getUsageTypedAmount_MsgSize()
	 * @model
	 * @generated
	 */
	int getMsgSize();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getMsgSize <em>Msg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg Size</em>' attribute.
	 * @see #getMsgSize()
	 * @generated
	 */
	void setMsgSize(int value);

	/**
	 * Returns the value of the '<em><b>Allocatedmemory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocatedmemory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocatedmemory</em>' attribute.
	 * @see #setAllocatedmemory(int)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getUsageTypedAmount_Allocatedmemory()
	 * @model
	 * @generated
	 */
	int getAllocatedmemory();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getAllocatedmemory <em>Allocatedmemory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocatedmemory</em>' attribute.
	 * @see #getAllocatedmemory()
	 * @generated
	 */
	void setAllocatedmemory(int value);

	/**
	 * Returns the value of the '<em><b>Used Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Memory</em>' attribute.
	 * @see #setUsedMemory(int)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getUsageTypedAmount_UsedMemory()
	 * @model
	 * @generated
	 */
	int getUsedMemory();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getUsedMemory <em>Used Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Memory</em>' attribute.
	 * @see #getUsedMemory()
	 * @generated
	 */
	void setUsedMemory(int value);

	/**
	 * Returns the value of the '<em><b>Power Peak</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Peak</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Peak</em>' attribute.
	 * @see #setPowerPeak(int)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getUsageTypedAmount_PowerPeak()
	 * @model
	 * @generated
	 */
	int getPowerPeak();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getPowerPeak <em>Power Peak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Peak</em>' attribute.
	 * @see #getPowerPeak()
	 * @generated
	 */
	void setPowerPeak(int value);

	/**
	 * Returns the value of the '<em><b>Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy</em>' attribute.
	 * @see #setEnergy(int)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getUsageTypedAmount_Energy()
	 * @model
	 * @generated
	 */
	int getEnergy();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getEnergy <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy</em>' attribute.
	 * @see #getEnergy()
	 * @generated
	 */
	void setEnergy(int value);

} // UsageTypedAmount
