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
package org.polarsys.time4sys.marte.hrm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.time4sys.marte.hrm.HardwareCache;
import org.polarsys.time4sys.marte.hrm.HardwareMmu;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Mmu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareMmuImpl#getVirtualAddrSpace <em>Virtual Addr Space</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareMmuImpl#getPhysicalAddrSpace <em>Physical Addr Space</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareMmuImpl#isMemoryProtection <em>Memory Protection</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareMmuImpl#getNbEntriesTlb <em>Nb Entries Tlb</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareMmuImpl#getOwnedTlbs <em>Owned Tlbs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareMmuImpl extends HardwareStorageManagerImpl implements HardwareMmu {
	/**
	 * The default value of the '{@link #getVirtualAddrSpace() <em>Virtual Addr Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualAddrSpace()
	 * @generated
	 * @ordered
	 */
	protected static final int VIRTUAL_ADDR_SPACE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVirtualAddrSpace() <em>Virtual Addr Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualAddrSpace()
	 * @generated
	 * @ordered
	 */
	protected int virtualAddrSpace = VIRTUAL_ADDR_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicalAddrSpace() <em>Physical Addr Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalAddrSpace()
	 * @generated
	 * @ordered
	 */
	protected static final int PHYSICAL_ADDR_SPACE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhysicalAddrSpace() <em>Physical Addr Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalAddrSpace()
	 * @generated
	 * @ordered
	 */
	protected int physicalAddrSpace = PHYSICAL_ADDR_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMemoryProtection() <em>Memory Protection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMemoryProtection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MEMORY_PROTECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMemoryProtection() <em>Memory Protection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMemoryProtection()
	 * @generated
	 * @ordered
	 */
	protected boolean memoryProtection = MEMORY_PROTECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbEntriesTlb() <em>Nb Entries Tlb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbEntriesTlb()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_ENTRIES_TLB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbEntriesTlb() <em>Nb Entries Tlb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbEntriesTlb()
	 * @generated
	 * @ordered
	 */
	protected int nbEntriesTlb = NB_ENTRIES_TLB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedTlbs() <em>Owned Tlbs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTlbs()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareCache> ownedTlbs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareMmuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HrmPackage.Literals.HARDWARE_MMU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVirtualAddrSpace() {
		return virtualAddrSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualAddrSpace(int newVirtualAddrSpace) {
		int oldVirtualAddrSpace = virtualAddrSpace;
		virtualAddrSpace = newVirtualAddrSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_MMU__VIRTUAL_ADDR_SPACE, oldVirtualAddrSpace, virtualAddrSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhysicalAddrSpace() {
		return physicalAddrSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalAddrSpace(int newPhysicalAddrSpace) {
		int oldPhysicalAddrSpace = physicalAddrSpace;
		physicalAddrSpace = newPhysicalAddrSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_MMU__PHYSICAL_ADDR_SPACE, oldPhysicalAddrSpace, physicalAddrSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMemoryProtection() {
		return memoryProtection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryProtection(boolean newMemoryProtection) {
		boolean oldMemoryProtection = memoryProtection;
		memoryProtection = newMemoryProtection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_MMU__MEMORY_PROTECTION, oldMemoryProtection, memoryProtection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbEntriesTlb() {
		return nbEntriesTlb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareCache> getOwnedTlbs() {
		if (ownedTlbs == null) {
			ownedTlbs = new EObjectResolvingEList<HardwareCache>(HardwareCache.class, this, HrmPackage.HARDWARE_MMU__OWNED_TLBS);
		}
		return ownedTlbs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HrmPackage.HARDWARE_MMU__VIRTUAL_ADDR_SPACE:
				return getVirtualAddrSpace();
			case HrmPackage.HARDWARE_MMU__PHYSICAL_ADDR_SPACE:
				return getPhysicalAddrSpace();
			case HrmPackage.HARDWARE_MMU__MEMORY_PROTECTION:
				return isMemoryProtection();
			case HrmPackage.HARDWARE_MMU__NB_ENTRIES_TLB:
				return getNbEntriesTlb();
			case HrmPackage.HARDWARE_MMU__OWNED_TLBS:
				return getOwnedTlbs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HrmPackage.HARDWARE_MMU__VIRTUAL_ADDR_SPACE:
				setVirtualAddrSpace((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_MMU__PHYSICAL_ADDR_SPACE:
				setPhysicalAddrSpace((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_MMU__MEMORY_PROTECTION:
				setMemoryProtection((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HrmPackage.HARDWARE_MMU__VIRTUAL_ADDR_SPACE:
				setVirtualAddrSpace(VIRTUAL_ADDR_SPACE_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_MMU__PHYSICAL_ADDR_SPACE:
				setPhysicalAddrSpace(PHYSICAL_ADDR_SPACE_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_MMU__MEMORY_PROTECTION:
				setMemoryProtection(MEMORY_PROTECTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HrmPackage.HARDWARE_MMU__VIRTUAL_ADDR_SPACE:
				return virtualAddrSpace != VIRTUAL_ADDR_SPACE_EDEFAULT;
			case HrmPackage.HARDWARE_MMU__PHYSICAL_ADDR_SPACE:
				return physicalAddrSpace != PHYSICAL_ADDR_SPACE_EDEFAULT;
			case HrmPackage.HARDWARE_MMU__MEMORY_PROTECTION:
				return memoryProtection != MEMORY_PROTECTION_EDEFAULT;
			case HrmPackage.HARDWARE_MMU__NB_ENTRIES_TLB:
				return nbEntriesTlb != NB_ENTRIES_TLB_EDEFAULT;
			case HrmPackage.HARDWARE_MMU__OWNED_TLBS:
				return ownedTlbs != null && !ownedTlbs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (virtualAddrSpace: ");
		result.append(virtualAddrSpace);
		result.append(", physicalAddrSpace: ");
		result.append(physicalAddrSpace);
		result.append(", memoryProtection: ");
		result.append(memoryProtection);
		result.append(", nbEntriesTlb: ");
		result.append(nbEntriesTlb);
		result.append(')');
		return result.toString();
	}

} //HardwareMmuImpl
