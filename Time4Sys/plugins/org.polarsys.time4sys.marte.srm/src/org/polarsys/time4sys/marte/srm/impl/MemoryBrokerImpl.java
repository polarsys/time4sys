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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourceControlPolicy;
import org.polarsys.time4sys.marte.grm.ResourceManager;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.grm.StorageResource;

import org.polarsys.time4sys.marte.grm.impl.ResourceBrokerImpl;

import org.polarsys.time4sys.marte.srm.AccessPolicyKind;
import org.polarsys.time4sys.marte.srm.MemoryBroker;
import org.polarsys.time4sys.marte.srm.SoftwareResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Broker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl#getManagedResource <em>Managed Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl#getResCtrlPolicy <em>Res Ctrl Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl#getCreateServices <em>Create Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl#getDeleteServices <em>Delete Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl#getInitializeServices <em>Initialize Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl#getMemorySizeFootprint <em>Memory Size Footprint</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl#getStateElements <em>State Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl#getIdentifierElements <em>Identifier Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl#getLockServices <em>Lock Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl#getUnlockServices <em>Unlock Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl#getMapServices <em>Map Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl#getUnmapServices <em>Unmap Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl#getMemories <em>Memories</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl#getAccessPolicy <em>Access Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl#getMemoryBlockAddressElements <em>Memory Block Address Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl#getMemoryBlockSizeElements <em>Memory Block Size Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryBrokerImpl extends ResourceBrokerImpl implements MemoryBroker {
	/**
	 * The cached value of the '{@link #getManagedResource() <em>Managed Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> managedResource;

	/**
	 * The cached value of the '{@link #getResCtrlPolicy() <em>Res Ctrl Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResCtrlPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceControlPolicy> resCtrlPolicy;

	/**
	 * The cached value of the '{@link #getCreateServices() <em>Create Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> createServices;

	/**
	 * The cached value of the '{@link #getDeleteServices() <em>Delete Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> deleteServices;

	/**
	 * The cached value of the '{@link #getInitializeServices() <em>Initialize Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializeServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> initializeServices;

	/**
	 * The default value of the '{@link #getMemorySizeFootprint() <em>Memory Size Footprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySizeFootprint()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_SIZE_FOOTPRINT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemorySizeFootprint() <em>Memory Size Footprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySizeFootprint()
	 * @generated
	 * @ordered
	 */
	protected int memorySizeFootprint = MEMORY_SIZE_FOOTPRINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStateElements() <em>State Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stateElements;

	/**
	 * The cached value of the '{@link #getIdentifierElements() <em>Identifier Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> identifierElements;

	/**
	 * The cached value of the '{@link #getLockServices() <em>Lock Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> lockServices;

	/**
	 * The cached value of the '{@link #getUnlockServices() <em>Unlock Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnlockServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> unlockServices;

	/**
	 * The cached value of the '{@link #getMapServices() <em>Map Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> mapServices;

	/**
	 * The cached value of the '{@link #getUnmapServices() <em>Unmap Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmapServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> unmapServices;

	/**
	 * The cached value of the '{@link #getMemories() <em>Memories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemories()
	 * @generated
	 * @ordered
	 */
	protected EList<StorageResource> memories;

	/**
	 * The default value of the '{@link #getAccessPolicy() <em>Access Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final AccessPolicyKind ACCESS_POLICY_EDEFAULT = AccessPolicyKind.READ;

	/**
	 * The cached value of the '{@link #getAccessPolicy() <em>Access Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPolicy()
	 * @generated
	 * @ordered
	 */
	protected AccessPolicyKind accessPolicy = ACCESS_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMemoryBlockAddressElements() <em>Memory Block Address Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryBlockAddressElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> memoryBlockAddressElements;

	/**
	 * The cached value of the '{@link #getMemoryBlockSizeElements() <em>Memory Block Size Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryBlockSizeElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> memoryBlockSizeElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryBrokerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.MEMORY_BROKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getManagedResource() {
		if (managedResource == null) {
			managedResource = new EObjectResolvingEList<Resource>(Resource.class, this, SrmPackage.MEMORY_BROKER__MANAGED_RESOURCE);
		}
		return managedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceControlPolicy> getResCtrlPolicy() {
		if (resCtrlPolicy == null) {
			resCtrlPolicy = new EObjectContainmentEList<ResourceControlPolicy>(ResourceControlPolicy.class, this, SrmPackage.MEMORY_BROKER__RES_CTRL_POLICY);
		}
		return resCtrlPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getCreateServices() {
		if (createServices == null) {
			createServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.MEMORY_BROKER__CREATE_SERVICES);
		}
		return createServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getDeleteServices() {
		if (deleteServices == null) {
			deleteServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.MEMORY_BROKER__DELETE_SERVICES);
		}
		return deleteServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getInitializeServices() {
		if (initializeServices == null) {
			initializeServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.MEMORY_BROKER__INITIALIZE_SERVICES);
		}
		return initializeServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemorySizeFootprint() {
		return memorySizeFootprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorySizeFootprint(int newMemorySizeFootprint) {
		int oldMemorySizeFootprint = memorySizeFootprint;
		memorySizeFootprint = newMemorySizeFootprint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.MEMORY_BROKER__MEMORY_SIZE_FOOTPRINT, oldMemorySizeFootprint, memorySizeFootprint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStateElements() {
		if (stateElements == null) {
			stateElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.MEMORY_BROKER__STATE_ELEMENTS);
		}
		return stateElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIdentifierElements() {
		if (identifierElements == null) {
			identifierElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.MEMORY_BROKER__IDENTIFIER_ELEMENTS);
		}
		return identifierElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getLockServices() {
		if (lockServices == null) {
			lockServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.MEMORY_BROKER__LOCK_SERVICES);
		}
		return lockServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getUnlockServices() {
		if (unlockServices == null) {
			unlockServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.MEMORY_BROKER__UNLOCK_SERVICES);
		}
		return unlockServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getMapServices() {
		if (mapServices == null) {
			mapServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.MEMORY_BROKER__MAP_SERVICES);
		}
		return mapServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getUnmapServices() {
		if (unmapServices == null) {
			unmapServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.MEMORY_BROKER__UNMAP_SERVICES);
		}
		return unmapServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StorageResource> getMemories() {
		if (memories == null) {
			memories = new EObjectResolvingEList<StorageResource>(StorageResource.class, this, SrmPackage.MEMORY_BROKER__MEMORIES);
		}
		return memories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessPolicyKind getAccessPolicy() {
		return accessPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessPolicy(AccessPolicyKind newAccessPolicy) {
		AccessPolicyKind oldAccessPolicy = accessPolicy;
		accessPolicy = newAccessPolicy == null ? ACCESS_POLICY_EDEFAULT : newAccessPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.MEMORY_BROKER__ACCESS_POLICY, oldAccessPolicy, accessPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMemoryBlockAddressElements() {
		if (memoryBlockAddressElements == null) {
			memoryBlockAddressElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.MEMORY_BROKER__MEMORY_BLOCK_ADDRESS_ELEMENTS);
		}
		return memoryBlockAddressElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMemoryBlockSizeElements() {
		if (memoryBlockSizeElements == null) {
			memoryBlockSizeElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.MEMORY_BROKER__MEMORY_BLOCK_SIZE_ELEMENTS);
		}
		return memoryBlockSizeElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SrmPackage.MEMORY_BROKER__RES_CTRL_POLICY:
				return ((InternalEList<?>)getResCtrlPolicy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SrmPackage.MEMORY_BROKER__MANAGED_RESOURCE:
				return getManagedResource();
			case SrmPackage.MEMORY_BROKER__RES_CTRL_POLICY:
				return getResCtrlPolicy();
			case SrmPackage.MEMORY_BROKER__CREATE_SERVICES:
				return getCreateServices();
			case SrmPackage.MEMORY_BROKER__DELETE_SERVICES:
				return getDeleteServices();
			case SrmPackage.MEMORY_BROKER__INITIALIZE_SERVICES:
				return getInitializeServices();
			case SrmPackage.MEMORY_BROKER__MEMORY_SIZE_FOOTPRINT:
				return getMemorySizeFootprint();
			case SrmPackage.MEMORY_BROKER__STATE_ELEMENTS:
				return getStateElements();
			case SrmPackage.MEMORY_BROKER__IDENTIFIER_ELEMENTS:
				return getIdentifierElements();
			case SrmPackage.MEMORY_BROKER__LOCK_SERVICES:
				return getLockServices();
			case SrmPackage.MEMORY_BROKER__UNLOCK_SERVICES:
				return getUnlockServices();
			case SrmPackage.MEMORY_BROKER__MAP_SERVICES:
				return getMapServices();
			case SrmPackage.MEMORY_BROKER__UNMAP_SERVICES:
				return getUnmapServices();
			case SrmPackage.MEMORY_BROKER__MEMORIES:
				return getMemories();
			case SrmPackage.MEMORY_BROKER__ACCESS_POLICY:
				return getAccessPolicy();
			case SrmPackage.MEMORY_BROKER__MEMORY_BLOCK_ADDRESS_ELEMENTS:
				return getMemoryBlockAddressElements();
			case SrmPackage.MEMORY_BROKER__MEMORY_BLOCK_SIZE_ELEMENTS:
				return getMemoryBlockSizeElements();
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
			case SrmPackage.MEMORY_BROKER__MANAGED_RESOURCE:
				getManagedResource().clear();
				getManagedResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case SrmPackage.MEMORY_BROKER__RES_CTRL_POLICY:
				getResCtrlPolicy().clear();
				getResCtrlPolicy().addAll((Collection<? extends ResourceControlPolicy>)newValue);
				return;
			case SrmPackage.MEMORY_BROKER__CREATE_SERVICES:
				getCreateServices().clear();
				getCreateServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.MEMORY_BROKER__DELETE_SERVICES:
				getDeleteServices().clear();
				getDeleteServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.MEMORY_BROKER__INITIALIZE_SERVICES:
				getInitializeServices().clear();
				getInitializeServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.MEMORY_BROKER__MEMORY_SIZE_FOOTPRINT:
				setMemorySizeFootprint((Integer)newValue);
				return;
			case SrmPackage.MEMORY_BROKER__STATE_ELEMENTS:
				getStateElements().clear();
				getStateElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.MEMORY_BROKER__IDENTIFIER_ELEMENTS:
				getIdentifierElements().clear();
				getIdentifierElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.MEMORY_BROKER__LOCK_SERVICES:
				getLockServices().clear();
				getLockServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.MEMORY_BROKER__UNLOCK_SERVICES:
				getUnlockServices().clear();
				getUnlockServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.MEMORY_BROKER__MAP_SERVICES:
				getMapServices().clear();
				getMapServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.MEMORY_BROKER__UNMAP_SERVICES:
				getUnmapServices().clear();
				getUnmapServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.MEMORY_BROKER__MEMORIES:
				getMemories().clear();
				getMemories().addAll((Collection<? extends StorageResource>)newValue);
				return;
			case SrmPackage.MEMORY_BROKER__ACCESS_POLICY:
				setAccessPolicy((AccessPolicyKind)newValue);
				return;
			case SrmPackage.MEMORY_BROKER__MEMORY_BLOCK_ADDRESS_ELEMENTS:
				getMemoryBlockAddressElements().clear();
				getMemoryBlockAddressElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.MEMORY_BROKER__MEMORY_BLOCK_SIZE_ELEMENTS:
				getMemoryBlockSizeElements().clear();
				getMemoryBlockSizeElements().addAll((Collection<? extends String>)newValue);
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
			case SrmPackage.MEMORY_BROKER__MANAGED_RESOURCE:
				getManagedResource().clear();
				return;
			case SrmPackage.MEMORY_BROKER__RES_CTRL_POLICY:
				getResCtrlPolicy().clear();
				return;
			case SrmPackage.MEMORY_BROKER__CREATE_SERVICES:
				getCreateServices().clear();
				return;
			case SrmPackage.MEMORY_BROKER__DELETE_SERVICES:
				getDeleteServices().clear();
				return;
			case SrmPackage.MEMORY_BROKER__INITIALIZE_SERVICES:
				getInitializeServices().clear();
				return;
			case SrmPackage.MEMORY_BROKER__MEMORY_SIZE_FOOTPRINT:
				setMemorySizeFootprint(MEMORY_SIZE_FOOTPRINT_EDEFAULT);
				return;
			case SrmPackage.MEMORY_BROKER__STATE_ELEMENTS:
				getStateElements().clear();
				return;
			case SrmPackage.MEMORY_BROKER__IDENTIFIER_ELEMENTS:
				getIdentifierElements().clear();
				return;
			case SrmPackage.MEMORY_BROKER__LOCK_SERVICES:
				getLockServices().clear();
				return;
			case SrmPackage.MEMORY_BROKER__UNLOCK_SERVICES:
				getUnlockServices().clear();
				return;
			case SrmPackage.MEMORY_BROKER__MAP_SERVICES:
				getMapServices().clear();
				return;
			case SrmPackage.MEMORY_BROKER__UNMAP_SERVICES:
				getUnmapServices().clear();
				return;
			case SrmPackage.MEMORY_BROKER__MEMORIES:
				getMemories().clear();
				return;
			case SrmPackage.MEMORY_BROKER__ACCESS_POLICY:
				setAccessPolicy(ACCESS_POLICY_EDEFAULT);
				return;
			case SrmPackage.MEMORY_BROKER__MEMORY_BLOCK_ADDRESS_ELEMENTS:
				getMemoryBlockAddressElements().clear();
				return;
			case SrmPackage.MEMORY_BROKER__MEMORY_BLOCK_SIZE_ELEMENTS:
				getMemoryBlockSizeElements().clear();
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
			case SrmPackage.MEMORY_BROKER__MANAGED_RESOURCE:
				return managedResource != null && !managedResource.isEmpty();
			case SrmPackage.MEMORY_BROKER__RES_CTRL_POLICY:
				return resCtrlPolicy != null && !resCtrlPolicy.isEmpty();
			case SrmPackage.MEMORY_BROKER__CREATE_SERVICES:
				return createServices != null && !createServices.isEmpty();
			case SrmPackage.MEMORY_BROKER__DELETE_SERVICES:
				return deleteServices != null && !deleteServices.isEmpty();
			case SrmPackage.MEMORY_BROKER__INITIALIZE_SERVICES:
				return initializeServices != null && !initializeServices.isEmpty();
			case SrmPackage.MEMORY_BROKER__MEMORY_SIZE_FOOTPRINT:
				return memorySizeFootprint != MEMORY_SIZE_FOOTPRINT_EDEFAULT;
			case SrmPackage.MEMORY_BROKER__STATE_ELEMENTS:
				return stateElements != null && !stateElements.isEmpty();
			case SrmPackage.MEMORY_BROKER__IDENTIFIER_ELEMENTS:
				return identifierElements != null && !identifierElements.isEmpty();
			case SrmPackage.MEMORY_BROKER__LOCK_SERVICES:
				return lockServices != null && !lockServices.isEmpty();
			case SrmPackage.MEMORY_BROKER__UNLOCK_SERVICES:
				return unlockServices != null && !unlockServices.isEmpty();
			case SrmPackage.MEMORY_BROKER__MAP_SERVICES:
				return mapServices != null && !mapServices.isEmpty();
			case SrmPackage.MEMORY_BROKER__UNMAP_SERVICES:
				return unmapServices != null && !unmapServices.isEmpty();
			case SrmPackage.MEMORY_BROKER__MEMORIES:
				return memories != null && !memories.isEmpty();
			case SrmPackage.MEMORY_BROKER__ACCESS_POLICY:
				return accessPolicy != ACCESS_POLICY_EDEFAULT;
			case SrmPackage.MEMORY_BROKER__MEMORY_BLOCK_ADDRESS_ELEMENTS:
				return memoryBlockAddressElements != null && !memoryBlockAddressElements.isEmpty();
			case SrmPackage.MEMORY_BROKER__MEMORY_BLOCK_SIZE_ELEMENTS:
				return memoryBlockSizeElements != null && !memoryBlockSizeElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceManager.class) {
			switch (derivedFeatureID) {
				case SrmPackage.MEMORY_BROKER__MANAGED_RESOURCE: return GrmPackage.RESOURCE_MANAGER__MANAGED_RESOURCE;
				case SrmPackage.MEMORY_BROKER__RES_CTRL_POLICY: return GrmPackage.RESOURCE_MANAGER__RES_CTRL_POLICY;
				default: return -1;
			}
		}
		if (baseClass == SoftwareResource.class) {
			switch (derivedFeatureID) {
				case SrmPackage.MEMORY_BROKER__CREATE_SERVICES: return SrmPackage.SOFTWARE_RESOURCE__CREATE_SERVICES;
				case SrmPackage.MEMORY_BROKER__DELETE_SERVICES: return SrmPackage.SOFTWARE_RESOURCE__DELETE_SERVICES;
				case SrmPackage.MEMORY_BROKER__INITIALIZE_SERVICES: return SrmPackage.SOFTWARE_RESOURCE__INITIALIZE_SERVICES;
				case SrmPackage.MEMORY_BROKER__MEMORY_SIZE_FOOTPRINT: return SrmPackage.SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT;
				case SrmPackage.MEMORY_BROKER__STATE_ELEMENTS: return SrmPackage.SOFTWARE_RESOURCE__STATE_ELEMENTS;
				case SrmPackage.MEMORY_BROKER__IDENTIFIER_ELEMENTS: return SrmPackage.SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceManager.class) {
			switch (baseFeatureID) {
				case GrmPackage.RESOURCE_MANAGER__MANAGED_RESOURCE: return SrmPackage.MEMORY_BROKER__MANAGED_RESOURCE;
				case GrmPackage.RESOURCE_MANAGER__RES_CTRL_POLICY: return SrmPackage.MEMORY_BROKER__RES_CTRL_POLICY;
				default: return -1;
			}
		}
		if (baseClass == SoftwareResource.class) {
			switch (baseFeatureID) {
				case SrmPackage.SOFTWARE_RESOURCE__CREATE_SERVICES: return SrmPackage.MEMORY_BROKER__CREATE_SERVICES;
				case SrmPackage.SOFTWARE_RESOURCE__DELETE_SERVICES: return SrmPackage.MEMORY_BROKER__DELETE_SERVICES;
				case SrmPackage.SOFTWARE_RESOURCE__INITIALIZE_SERVICES: return SrmPackage.MEMORY_BROKER__INITIALIZE_SERVICES;
				case SrmPackage.SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT: return SrmPackage.MEMORY_BROKER__MEMORY_SIZE_FOOTPRINT;
				case SrmPackage.SOFTWARE_RESOURCE__STATE_ELEMENTS: return SrmPackage.MEMORY_BROKER__STATE_ELEMENTS;
				case SrmPackage.SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS: return SrmPackage.MEMORY_BROKER__IDENTIFIER_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (memorySizeFootprint: ");
		result.append(memorySizeFootprint);
		result.append(", stateElements: ");
		result.append(stateElements);
		result.append(", identifierElements: ");
		result.append(identifierElements);
		result.append(", accessPolicy: ");
		result.append(accessPolicy);
		result.append(", memoryBlockAddressElements: ");
		result.append(memoryBlockAddressElements);
		result.append(", memoryBlockSizeElements: ");
		result.append(memoryBlockSizeElements);
		result.append(')');
		return result.toString();
	}

} //MemoryBrokerImpl
