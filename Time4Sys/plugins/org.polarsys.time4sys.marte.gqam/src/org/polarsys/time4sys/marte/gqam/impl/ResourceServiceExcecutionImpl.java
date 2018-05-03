/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.gqam.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.ResourceServiceExcecution;
import org.polarsys.time4sys.marte.grm.ResourceService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Service Excecution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.ResourceServiceExcecutionImpl#getResourceService <em>Resource Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceServiceExcecutionImpl extends StepImpl implements ResourceServiceExcecution {
	/**
	 * The cached value of the '{@link #getResourceService() <em>Resource Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceService()
	 * @generated
	 * @ordered
	 */
	protected ResourceService resourceService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceServiceExcecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.RESOURCE_SERVICE_EXCECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceService getResourceService() {
		if (resourceService != null && resourceService.eIsProxy()) {
			InternalEObject oldResourceService = (InternalEObject)resourceService;
			resourceService = (ResourceService)eResolveProxy(oldResourceService);
			if (resourceService != oldResourceService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GqamPackage.RESOURCE_SERVICE_EXCECUTION__RESOURCE_SERVICE, oldResourceService, resourceService));
			}
		}
		return resourceService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceService basicGetResourceService() {
		return resourceService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceService(ResourceService newResourceService) {
		ResourceService oldResourceService = resourceService;
		resourceService = newResourceService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.RESOURCE_SERVICE_EXCECUTION__RESOURCE_SERVICE, oldResourceService, resourceService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GqamPackage.RESOURCE_SERVICE_EXCECUTION__RESOURCE_SERVICE:
				if (resolve) return getResourceService();
				return basicGetResourceService();
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
			case GqamPackage.RESOURCE_SERVICE_EXCECUTION__RESOURCE_SERVICE:
				setResourceService((ResourceService)newValue);
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
			case GqamPackage.RESOURCE_SERVICE_EXCECUTION__RESOURCE_SERVICE:
				setResourceService((ResourceService)null);
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
			case GqamPackage.RESOURCE_SERVICE_EXCECUTION__RESOURCE_SERVICE:
				return resourceService != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceServiceExcecutionImpl
