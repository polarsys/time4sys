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
package org.polarsys.time4sys.marte.grm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourceConnector;
import org.polarsys.time4sys.marte.grm.ResourcePort;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.grm.ResourceUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourceImpl#getOwnedResource <em>Owned Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourceImpl#getResMult <em>Res Mult</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourceImpl#isIsProtected <em>Is Protected</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourceImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourceImpl#getOwnedPort <em>Owned Port</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourceImpl#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourceImpl#getRServices <em>RServices</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourceImpl#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourceImpl#getPServices <em>PServices</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceImpl extends ResourcePackageableElementImpl implements Resource {
	/**
	 * The cached value of the '{@link #getOwnedResource() <em>Owned Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> ownedResource;

	/**
	 * The default value of the '{@link #getResMult() <em>Res Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResMult()
	 * @generated
	 * @ordered
	 */
	protected static final int RES_MULT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResMult() <em>Res Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResMult()
	 * @generated
	 * @ordered
	 */
	protected int resMult = RES_MULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsProtected() <em>Is Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProtected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROTECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsProtected() <em>Is Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProtected()
	 * @generated
	 * @ordered
	 */
	protected boolean isProtected = IS_PROTECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedPort() <em>Owned Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPort()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourcePort> ownedPort;

	/**
	 * The cached value of the '{@link #getOwnedConnector() <em>Owned Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceConnector> ownedConnector;

	/**
	 * The cached value of the '{@link #getRServices() <em>RServices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> rServices;

	/**
	 * The cached value of the '{@link #getUsedBy() <em>Used By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceUsage> usedBy;

	/**
	 * The cached value of the '{@link #getPServices() <em>PServices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> pServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getOwnedResource() {
		if (ownedResource == null) {
			ownedResource = new EObjectContainmentEList<Resource>(Resource.class, this, GrmPackage.RESOURCE__OWNED_RESOURCE);
		}
		return ownedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResMult() {
		return resMult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResMult(int newResMult) {
		int oldResMult = resMult;
		resMult = newResMult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.RESOURCE__RES_MULT, oldResMult, resMult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsProtected() {
		return isProtected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsProtected(boolean newIsProtected) {
		boolean oldIsProtected = isProtected;
		isProtected = newIsProtected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.RESOURCE__IS_PROTECTED, oldIsProtected, isProtected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.RESOURCE__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getPServices() {
		if (pServices == null) {
			pServices = new EObjectContainmentWithInverseEList<ResourceService>(ResourceService.class, this, GrmPackage.RESOURCE__PSERVICES, GrmPackage.RESOURCE_SERVICE__CONTEXT);
		}
		return pServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourcePort> getOwnedPort() {
		if (ownedPort == null) {
			ownedPort = new EObjectContainmentEList<ResourcePort>(ResourcePort.class, this, GrmPackage.RESOURCE__OWNED_PORT);
		}
		return ownedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceConnector> getOwnedConnector() {
		if (ownedConnector == null) {
			ownedConnector = new EObjectContainmentEList<ResourceConnector>(ResourceConnector.class, this, GrmPackage.RESOURCE__OWNED_CONNECTOR);
		}
		return ownedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getRServices() {
		if (rServices == null) {
			rServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, GrmPackage.RESOURCE__RSERVICES);
		}
		return rServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceUsage> getUsedBy() {
		if (usedBy == null) {
			usedBy = new EObjectWithInverseResolvingEList.ManyInverse<ResourceUsage>(ResourceUsage.class, this, GrmPackage.RESOURCE__USED_BY, GrmPackage.RESOURCE_USAGE__USED_RESOURCE);
		}
		return usedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrmPackage.RESOURCE__USED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedBy()).basicAdd(otherEnd, msgs);
			case GrmPackage.RESOURCE__PSERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPServices()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrmPackage.RESOURCE__OWNED_RESOURCE:
				return ((InternalEList<?>)getOwnedResource()).basicRemove(otherEnd, msgs);
			case GrmPackage.RESOURCE__OWNED_PORT:
				return ((InternalEList<?>)getOwnedPort()).basicRemove(otherEnd, msgs);
			case GrmPackage.RESOURCE__OWNED_CONNECTOR:
				return ((InternalEList<?>)getOwnedConnector()).basicRemove(otherEnd, msgs);
			case GrmPackage.RESOURCE__USED_BY:
				return ((InternalEList<?>)getUsedBy()).basicRemove(otherEnd, msgs);
			case GrmPackage.RESOURCE__PSERVICES:
				return ((InternalEList<?>)getPServices()).basicRemove(otherEnd, msgs);
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
			case GrmPackage.RESOURCE__OWNED_RESOURCE:
				return getOwnedResource();
			case GrmPackage.RESOURCE__RES_MULT:
				return getResMult();
			case GrmPackage.RESOURCE__IS_PROTECTED:
				return isIsProtected();
			case GrmPackage.RESOURCE__IS_ACTIVE:
				return isIsActive();
			case GrmPackage.RESOURCE__OWNED_PORT:
				return getOwnedPort();
			case GrmPackage.RESOURCE__OWNED_CONNECTOR:
				return getOwnedConnector();
			case GrmPackage.RESOURCE__RSERVICES:
				return getRServices();
			case GrmPackage.RESOURCE__USED_BY:
				return getUsedBy();
			case GrmPackage.RESOURCE__PSERVICES:
				return getPServices();
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
			case GrmPackage.RESOURCE__OWNED_RESOURCE:
				getOwnedResource().clear();
				getOwnedResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case GrmPackage.RESOURCE__RES_MULT:
				setResMult((Integer)newValue);
				return;
			case GrmPackage.RESOURCE__IS_PROTECTED:
				setIsProtected((Boolean)newValue);
				return;
			case GrmPackage.RESOURCE__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case GrmPackage.RESOURCE__OWNED_PORT:
				getOwnedPort().clear();
				getOwnedPort().addAll((Collection<? extends ResourcePort>)newValue);
				return;
			case GrmPackage.RESOURCE__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				getOwnedConnector().addAll((Collection<? extends ResourceConnector>)newValue);
				return;
			case GrmPackage.RESOURCE__RSERVICES:
				getRServices().clear();
				getRServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case GrmPackage.RESOURCE__USED_BY:
				getUsedBy().clear();
				getUsedBy().addAll((Collection<? extends ResourceUsage>)newValue);
				return;
			case GrmPackage.RESOURCE__PSERVICES:
				getPServices().clear();
				getPServices().addAll((Collection<? extends ResourceService>)newValue);
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
			case GrmPackage.RESOURCE__OWNED_RESOURCE:
				getOwnedResource().clear();
				return;
			case GrmPackage.RESOURCE__RES_MULT:
				setResMult(RES_MULT_EDEFAULT);
				return;
			case GrmPackage.RESOURCE__IS_PROTECTED:
				setIsProtected(IS_PROTECTED_EDEFAULT);
				return;
			case GrmPackage.RESOURCE__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case GrmPackage.RESOURCE__OWNED_PORT:
				getOwnedPort().clear();
				return;
			case GrmPackage.RESOURCE__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				return;
			case GrmPackage.RESOURCE__RSERVICES:
				getRServices().clear();
				return;
			case GrmPackage.RESOURCE__USED_BY:
				getUsedBy().clear();
				return;
			case GrmPackage.RESOURCE__PSERVICES:
				getPServices().clear();
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
			case GrmPackage.RESOURCE__OWNED_RESOURCE:
				return ownedResource != null && !ownedResource.isEmpty();
			case GrmPackage.RESOURCE__RES_MULT:
				return resMult != RES_MULT_EDEFAULT;
			case GrmPackage.RESOURCE__IS_PROTECTED:
				return isProtected != IS_PROTECTED_EDEFAULT;
			case GrmPackage.RESOURCE__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case GrmPackage.RESOURCE__OWNED_PORT:
				return ownedPort != null && !ownedPort.isEmpty();
			case GrmPackage.RESOURCE__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case GrmPackage.RESOURCE__RSERVICES:
				return rServices != null && !rServices.isEmpty();
			case GrmPackage.RESOURCE__USED_BY:
				return usedBy != null && !usedBy.isEmpty();
			case GrmPackage.RESOURCE__PSERVICES:
				return pServices != null && !pServices.isEmpty();
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
		result.append(" (resMult: ");
		result.append(resMult);
		result.append(", isProtected: ");
		result.append(isProtected);
		result.append(", isActive: ");
		result.append(isActive);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
