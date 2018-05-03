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
import org.polarsys.time4sys.marte.grm.DeviceResource;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourceControlPolicy;
import org.polarsys.time4sys.marte.grm.ResourceManager;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.grm.impl.ResourceBrokerImpl;
import org.polarsys.time4sys.marte.srm.AccessPolicyKind;
import org.polarsys.time4sys.marte.srm.DeviceBroker;
import org.polarsys.time4sys.marte.srm.SoftwareResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Broker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl#getManagedResource <em>Managed Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl#getResCtrlPolicy <em>Res Ctrl Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl#getCreateServices <em>Create Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl#getDeleteServices <em>Delete Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl#getInitializeServices <em>Initialize Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl#getMemorySizeFootprint <em>Memory Size Footprint</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl#getStateElements <em>State Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl#getIdentifierElements <em>Identifier Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl#getAccessPolicy <em>Access Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl#isIsBuffered <em>Is Buffered</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl#getCloseServices <em>Close Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl#getOpenServices <em>Open Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl#getControlServices <em>Control Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl#getReadServices <em>Read Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl#getWriteServices <em>Write Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceBrokerImpl extends ResourceBrokerImpl implements DeviceBroker {
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
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceResource> devices;

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
	 * The default value of the '{@link #isIsBuffered() <em>Is Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBuffered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BUFFERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBuffered() <em>Is Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBuffered()
	 * @generated
	 * @ordered
	 */
	protected boolean isBuffered = IS_BUFFERED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCloseServices() <em>Close Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> closeServices;

	/**
	 * The cached value of the '{@link #getOpenServices() <em>Open Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> openServices;

	/**
	 * The cached value of the '{@link #getControlServices() <em>Control Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> controlServices;

	/**
	 * The cached value of the '{@link #getReadServices() <em>Read Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> readServices;

	/**
	 * The cached value of the '{@link #getWriteServices() <em>Write Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> writeServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceBrokerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.DEVICE_BROKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getManagedResource() {
		if (managedResource == null) {
			managedResource = new EObjectResolvingEList<Resource>(Resource.class, this, SrmPackage.DEVICE_BROKER__MANAGED_RESOURCE);
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
			resCtrlPolicy = new EObjectContainmentEList<ResourceControlPolicy>(ResourceControlPolicy.class, this, SrmPackage.DEVICE_BROKER__RES_CTRL_POLICY);
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
			createServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.DEVICE_BROKER__CREATE_SERVICES);
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
			deleteServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.DEVICE_BROKER__DELETE_SERVICES);
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
			initializeServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.DEVICE_BROKER__INITIALIZE_SERVICES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.DEVICE_BROKER__MEMORY_SIZE_FOOTPRINT, oldMemorySizeFootprint, memorySizeFootprint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStateElements() {
		if (stateElements == null) {
			stateElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.DEVICE_BROKER__STATE_ELEMENTS);
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
			identifierElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.DEVICE_BROKER__IDENTIFIER_ELEMENTS);
		}
		return identifierElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceResource> getDevices() {
		if (devices == null) {
			devices = new EObjectResolvingEList<DeviceResource>(DeviceResource.class, this, SrmPackage.DEVICE_BROKER__DEVICES);
		}
		return devices;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.DEVICE_BROKER__ACCESS_POLICY, oldAccessPolicy, accessPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBuffered() {
		return isBuffered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBuffered(boolean newIsBuffered) {
		boolean oldIsBuffered = isBuffered;
		isBuffered = newIsBuffered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.DEVICE_BROKER__IS_BUFFERED, oldIsBuffered, isBuffered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getCloseServices() {
		if (closeServices == null) {
			closeServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.DEVICE_BROKER__CLOSE_SERVICES);
		}
		return closeServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getOpenServices() {
		if (openServices == null) {
			openServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.DEVICE_BROKER__OPEN_SERVICES);
		}
		return openServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getControlServices() {
		if (controlServices == null) {
			controlServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.DEVICE_BROKER__CONTROL_SERVICES);
		}
		return controlServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getReadServices() {
		if (readServices == null) {
			readServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.DEVICE_BROKER__READ_SERVICES);
		}
		return readServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getWriteServices() {
		if (writeServices == null) {
			writeServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.DEVICE_BROKER__WRITE_SERVICES);
		}
		return writeServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SrmPackage.DEVICE_BROKER__RES_CTRL_POLICY:
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
			case SrmPackage.DEVICE_BROKER__MANAGED_RESOURCE:
				return getManagedResource();
			case SrmPackage.DEVICE_BROKER__RES_CTRL_POLICY:
				return getResCtrlPolicy();
			case SrmPackage.DEVICE_BROKER__CREATE_SERVICES:
				return getCreateServices();
			case SrmPackage.DEVICE_BROKER__DELETE_SERVICES:
				return getDeleteServices();
			case SrmPackage.DEVICE_BROKER__INITIALIZE_SERVICES:
				return getInitializeServices();
			case SrmPackage.DEVICE_BROKER__MEMORY_SIZE_FOOTPRINT:
				return getMemorySizeFootprint();
			case SrmPackage.DEVICE_BROKER__STATE_ELEMENTS:
				return getStateElements();
			case SrmPackage.DEVICE_BROKER__IDENTIFIER_ELEMENTS:
				return getIdentifierElements();
			case SrmPackage.DEVICE_BROKER__DEVICES:
				return getDevices();
			case SrmPackage.DEVICE_BROKER__ACCESS_POLICY:
				return getAccessPolicy();
			case SrmPackage.DEVICE_BROKER__IS_BUFFERED:
				return isIsBuffered();
			case SrmPackage.DEVICE_BROKER__CLOSE_SERVICES:
				return getCloseServices();
			case SrmPackage.DEVICE_BROKER__OPEN_SERVICES:
				return getOpenServices();
			case SrmPackage.DEVICE_BROKER__CONTROL_SERVICES:
				return getControlServices();
			case SrmPackage.DEVICE_BROKER__READ_SERVICES:
				return getReadServices();
			case SrmPackage.DEVICE_BROKER__WRITE_SERVICES:
				return getWriteServices();
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
			case SrmPackage.DEVICE_BROKER__MANAGED_RESOURCE:
				getManagedResource().clear();
				getManagedResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case SrmPackage.DEVICE_BROKER__RES_CTRL_POLICY:
				getResCtrlPolicy().clear();
				getResCtrlPolicy().addAll((Collection<? extends ResourceControlPolicy>)newValue);
				return;
			case SrmPackage.DEVICE_BROKER__CREATE_SERVICES:
				getCreateServices().clear();
				getCreateServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.DEVICE_BROKER__DELETE_SERVICES:
				getDeleteServices().clear();
				getDeleteServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.DEVICE_BROKER__INITIALIZE_SERVICES:
				getInitializeServices().clear();
				getInitializeServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.DEVICE_BROKER__MEMORY_SIZE_FOOTPRINT:
				setMemorySizeFootprint((Integer)newValue);
				return;
			case SrmPackage.DEVICE_BROKER__STATE_ELEMENTS:
				getStateElements().clear();
				getStateElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.DEVICE_BROKER__IDENTIFIER_ELEMENTS:
				getIdentifierElements().clear();
				getIdentifierElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.DEVICE_BROKER__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection<? extends DeviceResource>)newValue);
				return;
			case SrmPackage.DEVICE_BROKER__ACCESS_POLICY:
				setAccessPolicy((AccessPolicyKind)newValue);
				return;
			case SrmPackage.DEVICE_BROKER__IS_BUFFERED:
				setIsBuffered((Boolean)newValue);
				return;
			case SrmPackage.DEVICE_BROKER__CLOSE_SERVICES:
				getCloseServices().clear();
				getCloseServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.DEVICE_BROKER__OPEN_SERVICES:
				getOpenServices().clear();
				getOpenServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.DEVICE_BROKER__CONTROL_SERVICES:
				getControlServices().clear();
				getControlServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.DEVICE_BROKER__READ_SERVICES:
				getReadServices().clear();
				getReadServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.DEVICE_BROKER__WRITE_SERVICES:
				getWriteServices().clear();
				getWriteServices().addAll((Collection<? extends ResourceService>)newValue);
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
			case SrmPackage.DEVICE_BROKER__MANAGED_RESOURCE:
				getManagedResource().clear();
				return;
			case SrmPackage.DEVICE_BROKER__RES_CTRL_POLICY:
				getResCtrlPolicy().clear();
				return;
			case SrmPackage.DEVICE_BROKER__CREATE_SERVICES:
				getCreateServices().clear();
				return;
			case SrmPackage.DEVICE_BROKER__DELETE_SERVICES:
				getDeleteServices().clear();
				return;
			case SrmPackage.DEVICE_BROKER__INITIALIZE_SERVICES:
				getInitializeServices().clear();
				return;
			case SrmPackage.DEVICE_BROKER__MEMORY_SIZE_FOOTPRINT:
				setMemorySizeFootprint(MEMORY_SIZE_FOOTPRINT_EDEFAULT);
				return;
			case SrmPackage.DEVICE_BROKER__STATE_ELEMENTS:
				getStateElements().clear();
				return;
			case SrmPackage.DEVICE_BROKER__IDENTIFIER_ELEMENTS:
				getIdentifierElements().clear();
				return;
			case SrmPackage.DEVICE_BROKER__DEVICES:
				getDevices().clear();
				return;
			case SrmPackage.DEVICE_BROKER__ACCESS_POLICY:
				setAccessPolicy(ACCESS_POLICY_EDEFAULT);
				return;
			case SrmPackage.DEVICE_BROKER__IS_BUFFERED:
				setIsBuffered(IS_BUFFERED_EDEFAULT);
				return;
			case SrmPackage.DEVICE_BROKER__CLOSE_SERVICES:
				getCloseServices().clear();
				return;
			case SrmPackage.DEVICE_BROKER__OPEN_SERVICES:
				getOpenServices().clear();
				return;
			case SrmPackage.DEVICE_BROKER__CONTROL_SERVICES:
				getControlServices().clear();
				return;
			case SrmPackage.DEVICE_BROKER__READ_SERVICES:
				getReadServices().clear();
				return;
			case SrmPackage.DEVICE_BROKER__WRITE_SERVICES:
				getWriteServices().clear();
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
			case SrmPackage.DEVICE_BROKER__MANAGED_RESOURCE:
				return managedResource != null && !managedResource.isEmpty();
			case SrmPackage.DEVICE_BROKER__RES_CTRL_POLICY:
				return resCtrlPolicy != null && !resCtrlPolicy.isEmpty();
			case SrmPackage.DEVICE_BROKER__CREATE_SERVICES:
				return createServices != null && !createServices.isEmpty();
			case SrmPackage.DEVICE_BROKER__DELETE_SERVICES:
				return deleteServices != null && !deleteServices.isEmpty();
			case SrmPackage.DEVICE_BROKER__INITIALIZE_SERVICES:
				return initializeServices != null && !initializeServices.isEmpty();
			case SrmPackage.DEVICE_BROKER__MEMORY_SIZE_FOOTPRINT:
				return memorySizeFootprint != MEMORY_SIZE_FOOTPRINT_EDEFAULT;
			case SrmPackage.DEVICE_BROKER__STATE_ELEMENTS:
				return stateElements != null && !stateElements.isEmpty();
			case SrmPackage.DEVICE_BROKER__IDENTIFIER_ELEMENTS:
				return identifierElements != null && !identifierElements.isEmpty();
			case SrmPackage.DEVICE_BROKER__DEVICES:
				return devices != null && !devices.isEmpty();
			case SrmPackage.DEVICE_BROKER__ACCESS_POLICY:
				return accessPolicy != ACCESS_POLICY_EDEFAULT;
			case SrmPackage.DEVICE_BROKER__IS_BUFFERED:
				return isBuffered != IS_BUFFERED_EDEFAULT;
			case SrmPackage.DEVICE_BROKER__CLOSE_SERVICES:
				return closeServices != null && !closeServices.isEmpty();
			case SrmPackage.DEVICE_BROKER__OPEN_SERVICES:
				return openServices != null && !openServices.isEmpty();
			case SrmPackage.DEVICE_BROKER__CONTROL_SERVICES:
				return controlServices != null && !controlServices.isEmpty();
			case SrmPackage.DEVICE_BROKER__READ_SERVICES:
				return readServices != null && !readServices.isEmpty();
			case SrmPackage.DEVICE_BROKER__WRITE_SERVICES:
				return writeServices != null && !writeServices.isEmpty();
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
				case SrmPackage.DEVICE_BROKER__MANAGED_RESOURCE: return GrmPackage.RESOURCE_MANAGER__MANAGED_RESOURCE;
				case SrmPackage.DEVICE_BROKER__RES_CTRL_POLICY: return GrmPackage.RESOURCE_MANAGER__RES_CTRL_POLICY;
				default: return -1;
			}
		}
		if (baseClass == SoftwareResource.class) {
			switch (derivedFeatureID) {
				case SrmPackage.DEVICE_BROKER__CREATE_SERVICES: return SrmPackage.SOFTWARE_RESOURCE__CREATE_SERVICES;
				case SrmPackage.DEVICE_BROKER__DELETE_SERVICES: return SrmPackage.SOFTWARE_RESOURCE__DELETE_SERVICES;
				case SrmPackage.DEVICE_BROKER__INITIALIZE_SERVICES: return SrmPackage.SOFTWARE_RESOURCE__INITIALIZE_SERVICES;
				case SrmPackage.DEVICE_BROKER__MEMORY_SIZE_FOOTPRINT: return SrmPackage.SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT;
				case SrmPackage.DEVICE_BROKER__STATE_ELEMENTS: return SrmPackage.SOFTWARE_RESOURCE__STATE_ELEMENTS;
				case SrmPackage.DEVICE_BROKER__IDENTIFIER_ELEMENTS: return SrmPackage.SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS;
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
				case GrmPackage.RESOURCE_MANAGER__MANAGED_RESOURCE: return SrmPackage.DEVICE_BROKER__MANAGED_RESOURCE;
				case GrmPackage.RESOURCE_MANAGER__RES_CTRL_POLICY: return SrmPackage.DEVICE_BROKER__RES_CTRL_POLICY;
				default: return -1;
			}
		}
		if (baseClass == SoftwareResource.class) {
			switch (baseFeatureID) {
				case SrmPackage.SOFTWARE_RESOURCE__CREATE_SERVICES: return SrmPackage.DEVICE_BROKER__CREATE_SERVICES;
				case SrmPackage.SOFTWARE_RESOURCE__DELETE_SERVICES: return SrmPackage.DEVICE_BROKER__DELETE_SERVICES;
				case SrmPackage.SOFTWARE_RESOURCE__INITIALIZE_SERVICES: return SrmPackage.DEVICE_BROKER__INITIALIZE_SERVICES;
				case SrmPackage.SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT: return SrmPackage.DEVICE_BROKER__MEMORY_SIZE_FOOTPRINT;
				case SrmPackage.SOFTWARE_RESOURCE__STATE_ELEMENTS: return SrmPackage.DEVICE_BROKER__STATE_ELEMENTS;
				case SrmPackage.SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS: return SrmPackage.DEVICE_BROKER__IDENTIFIER_ELEMENTS;
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
		result.append(", isBuffered: ");
		result.append(isBuffered);
		result.append(')');
		return result.toString();
	}

} //DeviceBrokerImpl
