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

import org.eclipse.emf.common.util.EList;
import org.polarsys.time4sys.marte.grm.StorageResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareMemory#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareMemory#getAddressSize <em>Address Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareMemory#getTimings <em>Timings</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareMemory#getThroughput <em>Throughput</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareMemory()
 * @model
 * @generated
 */
public interface HardwareMemory extends StorageResource, HardwareResource, HardwareChip {
	/**
	 * Returns the value of the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Size</em>' attribute.
	 * @see #setMemorySize(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareMemory_MemorySize()
	 * @model
	 * @generated
	 */
	int getMemorySize();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareMemory#getMemorySize <em>Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Size</em>' attribute.
	 * @see #getMemorySize()
	 * @generated
	 */
	void setMemorySize(int value);

	/**
	 * Returns the value of the '<em><b>Address Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Size</em>' attribute.
	 * @see #setAddressSize(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareMemory_AddressSize()
	 * @model
	 * @generated
	 */
	int getAddressSize();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareMemory#getAddressSize <em>Address Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Size</em>' attribute.
	 * @see #getAddressSize()
	 * @generated
	 */
	void setAddressSize(int value);

	/**
	 * Returns the value of the '<em><b>Timings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timings</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timings</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareMemory_Timings()
	 * @model
	 * @generated
	 */
	EList<Integer> getTimings();

	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throughput</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' attribute.
	 * @see #setThroughput(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareMemory_Throughput()
	 * @model
	 * @generated
	 */
	int getThroughput();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareMemory#getThroughput <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' attribute.
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(int value);

} // HardwareMemory
