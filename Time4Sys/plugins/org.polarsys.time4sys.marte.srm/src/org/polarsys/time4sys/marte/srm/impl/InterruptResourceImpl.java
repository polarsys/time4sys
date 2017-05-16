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
package org.polarsys.time4sys.marte.srm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.time4sys.marte.grm.ResourceService;

import org.polarsys.time4sys.marte.srm.InterruptKind;
import org.polarsys.time4sys.marte.srm.InterruptResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interrupt Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.InterruptResourceImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.InterruptResourceImpl#isIsMaskable <em>Is Maskable</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.InterruptResourceImpl#getRoutineConnectServices <em>Routine Connect Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.InterruptResourceImpl#getRoutineDisconnectServices <em>Routine Disconnect Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.InterruptResourceImpl#getMaskElements <em>Mask Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.InterruptResourceImpl#getVectorElements <em>Vector Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.InterruptResourceImpl#getIsrEntryPoints <em>Isr Entry Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterruptResourceImpl extends SoftwareConcurrentResourceImpl implements InterruptResource {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final InterruptKind KIND_EDEFAULT = InterruptKind.HARDWARE_INTERRUPTION;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected InterruptKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMaskable() <em>Is Maskable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMaskable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MASKABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMaskable() <em>Is Maskable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMaskable()
	 * @generated
	 * @ordered
	 */
	protected boolean isMaskable = IS_MASKABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoutineConnectServices() <em>Routine Connect Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutineConnectServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> routineConnectServices;

	/**
	 * The cached value of the '{@link #getRoutineDisconnectServices() <em>Routine Disconnect Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutineDisconnectServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> routineDisconnectServices;

	/**
	 * The cached value of the '{@link #getMaskElements() <em>Mask Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> maskElements;

	/**
	 * The cached value of the '{@link #getVectorElements() <em>Vector Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vectorElements;

	/**
	 * The cached value of the '{@link #getIsrEntryPoints() <em>Isr Entry Points</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsrEntryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> isrEntryPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.INTERRUPT_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(InterruptKind newKind) {
		InterruptKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.INTERRUPT_RESOURCE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMaskable() {
		return isMaskable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMaskable(boolean newIsMaskable) {
		boolean oldIsMaskable = isMaskable;
		isMaskable = newIsMaskable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.INTERRUPT_RESOURCE__IS_MASKABLE, oldIsMaskable, isMaskable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getRoutineConnectServices() {
		if (routineConnectServices == null) {
			routineConnectServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.INTERRUPT_RESOURCE__ROUTINE_CONNECT_SERVICES);
		}
		return routineConnectServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getRoutineDisconnectServices() {
		if (routineDisconnectServices == null) {
			routineDisconnectServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.INTERRUPT_RESOURCE__ROUTINE_DISCONNECT_SERVICES);
		}
		return routineDisconnectServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMaskElements() {
		if (maskElements == null) {
			maskElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.INTERRUPT_RESOURCE__MASK_ELEMENTS);
		}
		return maskElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVectorElements() {
		if (vectorElements == null) {
			vectorElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.INTERRUPT_RESOURCE__VECTOR_ELEMENTS);
		}
		return vectorElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIsrEntryPoints() {
		if (isrEntryPoints == null) {
			isrEntryPoints = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.INTERRUPT_RESOURCE__ISR_ENTRY_POINTS);
		}
		return isrEntryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SrmPackage.INTERRUPT_RESOURCE__KIND:
				return getKind();
			case SrmPackage.INTERRUPT_RESOURCE__IS_MASKABLE:
				return isIsMaskable();
			case SrmPackage.INTERRUPT_RESOURCE__ROUTINE_CONNECT_SERVICES:
				return getRoutineConnectServices();
			case SrmPackage.INTERRUPT_RESOURCE__ROUTINE_DISCONNECT_SERVICES:
				return getRoutineDisconnectServices();
			case SrmPackage.INTERRUPT_RESOURCE__MASK_ELEMENTS:
				return getMaskElements();
			case SrmPackage.INTERRUPT_RESOURCE__VECTOR_ELEMENTS:
				return getVectorElements();
			case SrmPackage.INTERRUPT_RESOURCE__ISR_ENTRY_POINTS:
				return getIsrEntryPoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SrmPackage.INTERRUPT_RESOURCE__KIND:
				setKind((InterruptKind)newValue);
				return;
			case SrmPackage.INTERRUPT_RESOURCE__IS_MASKABLE:
				setIsMaskable((Boolean)newValue);
				return;
			case SrmPackage.INTERRUPT_RESOURCE__ROUTINE_CONNECT_SERVICES:
				getRoutineConnectServices().clear();
				getRoutineConnectServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.INTERRUPT_RESOURCE__ROUTINE_DISCONNECT_SERVICES:
				getRoutineDisconnectServices().clear();
				getRoutineDisconnectServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.INTERRUPT_RESOURCE__MASK_ELEMENTS:
				getMaskElements().clear();
				getMaskElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.INTERRUPT_RESOURCE__VECTOR_ELEMENTS:
				getVectorElements().clear();
				getVectorElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.INTERRUPT_RESOURCE__ISR_ENTRY_POINTS:
				getIsrEntryPoints().clear();
				getIsrEntryPoints().addAll((Collection<? extends String>)newValue);
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
			case SrmPackage.INTERRUPT_RESOURCE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case SrmPackage.INTERRUPT_RESOURCE__IS_MASKABLE:
				setIsMaskable(IS_MASKABLE_EDEFAULT);
				return;
			case SrmPackage.INTERRUPT_RESOURCE__ROUTINE_CONNECT_SERVICES:
				getRoutineConnectServices().clear();
				return;
			case SrmPackage.INTERRUPT_RESOURCE__ROUTINE_DISCONNECT_SERVICES:
				getRoutineDisconnectServices().clear();
				return;
			case SrmPackage.INTERRUPT_RESOURCE__MASK_ELEMENTS:
				getMaskElements().clear();
				return;
			case SrmPackage.INTERRUPT_RESOURCE__VECTOR_ELEMENTS:
				getVectorElements().clear();
				return;
			case SrmPackage.INTERRUPT_RESOURCE__ISR_ENTRY_POINTS:
				getIsrEntryPoints().clear();
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
			case SrmPackage.INTERRUPT_RESOURCE__KIND:
				return kind != KIND_EDEFAULT;
			case SrmPackage.INTERRUPT_RESOURCE__IS_MASKABLE:
				return isMaskable != IS_MASKABLE_EDEFAULT;
			case SrmPackage.INTERRUPT_RESOURCE__ROUTINE_CONNECT_SERVICES:
				return routineConnectServices != null && !routineConnectServices.isEmpty();
			case SrmPackage.INTERRUPT_RESOURCE__ROUTINE_DISCONNECT_SERVICES:
				return routineDisconnectServices != null && !routineDisconnectServices.isEmpty();
			case SrmPackage.INTERRUPT_RESOURCE__MASK_ELEMENTS:
				return maskElements != null && !maskElements.isEmpty();
			case SrmPackage.INTERRUPT_RESOURCE__VECTOR_ELEMENTS:
				return vectorElements != null && !vectorElements.isEmpty();
			case SrmPackage.INTERRUPT_RESOURCE__ISR_ENTRY_POINTS:
				return isrEntryPoints != null && !isrEntryPoints.isEmpty();
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", isMaskable: ");
		result.append(isMaskable);
		result.append(", maskElements: ");
		result.append(maskElements);
		result.append(", vectorElements: ");
		result.append(vectorElements);
		result.append(", isrEntryPoints: ");
		result.append(isrEntryPoints);
		result.append(')');
		return result.toString();
	}

} //InterruptResourceImpl
