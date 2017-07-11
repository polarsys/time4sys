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
import org.polarsys.time4sys.marte.grm.impl.ResourceManagerImpl;
import org.polarsys.time4sys.marte.srm.SoftwareResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareResourceImpl#getCreateServices <em>Create Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareResourceImpl#getDeleteServices <em>Delete Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareResourceImpl#getInitializeServices <em>Initialize Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareResourceImpl#getMemorySizeFootprint <em>Memory Size Footprint</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareResourceImpl#getStateElements <em>State Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareResourceImpl#getIdentifierElements <em>Identifier Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareResourceImpl extends ResourceManagerImpl implements SoftwareResource {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.SOFTWARE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getCreateServices() {
		if (createServices == null) {
			createServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_RESOURCE__CREATE_SERVICES);
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
			deleteServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_RESOURCE__DELETE_SERVICES);
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
			initializeServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_RESOURCE__INITIALIZE_SERVICES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT, oldMemorySizeFootprint, memorySizeFootprint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStateElements() {
		if (stateElements == null) {
			stateElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_RESOURCE__STATE_ELEMENTS);
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
			identifierElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS);
		}
		return identifierElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SrmPackage.SOFTWARE_RESOURCE__CREATE_SERVICES:
				return getCreateServices();
			case SrmPackage.SOFTWARE_RESOURCE__DELETE_SERVICES:
				return getDeleteServices();
			case SrmPackage.SOFTWARE_RESOURCE__INITIALIZE_SERVICES:
				return getInitializeServices();
			case SrmPackage.SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT:
				return getMemorySizeFootprint();
			case SrmPackage.SOFTWARE_RESOURCE__STATE_ELEMENTS:
				return getStateElements();
			case SrmPackage.SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS:
				return getIdentifierElements();
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
			case SrmPackage.SOFTWARE_RESOURCE__CREATE_SERVICES:
				getCreateServices().clear();
				getCreateServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_RESOURCE__DELETE_SERVICES:
				getDeleteServices().clear();
				getDeleteServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_RESOURCE__INITIALIZE_SERVICES:
				getInitializeServices().clear();
				getInitializeServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT:
				setMemorySizeFootprint((Integer)newValue);
				return;
			case SrmPackage.SOFTWARE_RESOURCE__STATE_ELEMENTS:
				getStateElements().clear();
				getStateElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS:
				getIdentifierElements().clear();
				getIdentifierElements().addAll((Collection<? extends String>)newValue);
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
			case SrmPackage.SOFTWARE_RESOURCE__CREATE_SERVICES:
				getCreateServices().clear();
				return;
			case SrmPackage.SOFTWARE_RESOURCE__DELETE_SERVICES:
				getDeleteServices().clear();
				return;
			case SrmPackage.SOFTWARE_RESOURCE__INITIALIZE_SERVICES:
				getInitializeServices().clear();
				return;
			case SrmPackage.SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT:
				setMemorySizeFootprint(MEMORY_SIZE_FOOTPRINT_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_RESOURCE__STATE_ELEMENTS:
				getStateElements().clear();
				return;
			case SrmPackage.SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS:
				getIdentifierElements().clear();
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
			case SrmPackage.SOFTWARE_RESOURCE__CREATE_SERVICES:
				return createServices != null && !createServices.isEmpty();
			case SrmPackage.SOFTWARE_RESOURCE__DELETE_SERVICES:
				return deleteServices != null && !deleteServices.isEmpty();
			case SrmPackage.SOFTWARE_RESOURCE__INITIALIZE_SERVICES:
				return initializeServices != null && !initializeServices.isEmpty();
			case SrmPackage.SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT:
				return memorySizeFootprint != MEMORY_SIZE_FOOTPRINT_EDEFAULT;
			case SrmPackage.SOFTWARE_RESOURCE__STATE_ELEMENTS:
				return stateElements != null && !stateElements.isEmpty();
			case SrmPackage.SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS:
				return identifierElements != null && !identifierElements.isEmpty();
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
		result.append(" (memorySizeFootprint: ");
		result.append(memorySizeFootprint);
		result.append(", stateElements: ");
		result.append(stateElements);
		result.append(", identifierElements: ");
		result.append(identifierElements);
		result.append(')');
		return result.toString();
	}

} //SoftwareResourceImpl
