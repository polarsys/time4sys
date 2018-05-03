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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.srm.SharedDataComResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared Data Com Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SharedDataComResourceImpl#getReadServices <em>Read Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SharedDataComResourceImpl#getWriteServices <em>Write Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SharedDataComResourceImpl extends SoftwareCommunicationResourceImpl implements SharedDataComResource {
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
	protected SharedDataComResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.SHARED_DATA_COM_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getReadServices() {
		if (readServices == null) {
			readServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SHARED_DATA_COM_RESOURCE__READ_SERVICES);
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
			writeServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SHARED_DATA_COM_RESOURCE__WRITE_SERVICES);
		}
		return writeServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SrmPackage.SHARED_DATA_COM_RESOURCE__READ_SERVICES:
				return getReadServices();
			case SrmPackage.SHARED_DATA_COM_RESOURCE__WRITE_SERVICES:
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
			case SrmPackage.SHARED_DATA_COM_RESOURCE__READ_SERVICES:
				getReadServices().clear();
				getReadServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SHARED_DATA_COM_RESOURCE__WRITE_SERVICES:
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
			case SrmPackage.SHARED_DATA_COM_RESOURCE__READ_SERVICES:
				getReadServices().clear();
				return;
			case SrmPackage.SHARED_DATA_COM_RESOURCE__WRITE_SERVICES:
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
			case SrmPackage.SHARED_DATA_COM_RESOURCE__READ_SERVICES:
				return readServices != null && !readServices.isEmpty();
			case SrmPackage.SHARED_DATA_COM_RESOURCE__WRITE_SERVICES:
				return writeServices != null && !writeServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SharedDataComResourceImpl
