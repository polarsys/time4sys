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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Mmu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareMmu#getVirtualAddrSpace <em>Virtual Addr Space</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareMmu#getPhysicalAddrSpace <em>Physical Addr Space</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareMmu#isMemoryProtection <em>Memory Protection</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareMmu#getNbEntriesTlb <em>Nb Entries Tlb</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareMmu#getOwnedTlbs <em>Owned Tlbs</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareMmu()
 * @model
 * @generated
 */
public interface HardwareMmu extends HardwareStorageManager {
	/**
	 * Returns the value of the '<em><b>Virtual Addr Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Addr Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Addr Space</em>' attribute.
	 * @see #setVirtualAddrSpace(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareMmu_VirtualAddrSpace()
	 * @model
	 * @generated
	 */
	int getVirtualAddrSpace();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareMmu#getVirtualAddrSpace <em>Virtual Addr Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Addr Space</em>' attribute.
	 * @see #getVirtualAddrSpace()
	 * @generated
	 */
	void setVirtualAddrSpace(int value);

	/**
	 * Returns the value of the '<em><b>Physical Addr Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Addr Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Addr Space</em>' attribute.
	 * @see #setPhysicalAddrSpace(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareMmu_PhysicalAddrSpace()
	 * @model
	 * @generated
	 */
	int getPhysicalAddrSpace();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareMmu#getPhysicalAddrSpace <em>Physical Addr Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Addr Space</em>' attribute.
	 * @see #getPhysicalAddrSpace()
	 * @generated
	 */
	void setPhysicalAddrSpace(int value);

	/**
	 * Returns the value of the '<em><b>Memory Protection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Protection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Protection</em>' attribute.
	 * @see #setMemoryProtection(boolean)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareMmu_MemoryProtection()
	 * @model
	 * @generated
	 */
	boolean isMemoryProtection();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareMmu#isMemoryProtection <em>Memory Protection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Protection</em>' attribute.
	 * @see #isMemoryProtection()
	 * @generated
	 */
	void setMemoryProtection(boolean value);

	/**
	 * Returns the value of the '<em><b>Nb Entries Tlb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Entries Tlb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Entries Tlb</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareMmu_NbEntriesTlb()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	int getNbEntriesTlb();

	/**
	 * Returns the value of the '<em><b>Owned Tlbs</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwareCache}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Tlbs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tlbs</em>' reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareMmu_OwnedTlbs()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<HardwareCache> getOwnedTlbs();

} // HardwareMmu
