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
package org.polarsys.time4sys.marte.grm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.MutualExclusionProtocol;
import org.polarsys.time4sys.marte.grm.MutualExclusionResource;
import org.polarsys.time4sys.marte.grm.ProtectionParameter;
import org.polarsys.time4sys.marte.grm.ResourceBroker;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mutual Exclusion Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.MutualExclusionResourceImpl#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.MutualExclusionResourceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.MutualExclusionResourceImpl#getProtectParams <em>Protect Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MutualExclusionResourceImpl extends SynchResourceImpl implements MutualExclusionResource {
	/**
	 * The cached value of the '{@link #getScheduler() <em>Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler()
	 * @generated
	 * @ordered
	 */
	protected ResourceBroker scheduler;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected MutualExclusionProtocol protocol;

	/**
	 * The cached value of the '{@link #getProtectParams() <em>Protect Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectParams()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectionParameter> protectParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MutualExclusionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.MUTUAL_EXCLUSION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceBroker getScheduler() {
		if (scheduler != null && scheduler.eIsProxy()) {
			InternalEObject oldScheduler = (InternalEObject)scheduler;
			scheduler = (ResourceBroker)eResolveProxy(oldScheduler);
			if (scheduler != oldScheduler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrmPackage.MUTUAL_EXCLUSION_RESOURCE__SCHEDULER, oldScheduler, scheduler));
			}
		}
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceBroker basicGetScheduler() {
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler(ResourceBroker newScheduler) {
		ResourceBroker oldScheduler = scheduler;
		scheduler = newScheduler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.MUTUAL_EXCLUSION_RESOURCE__SCHEDULER, oldScheduler, scheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutualExclusionProtocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocol(MutualExclusionProtocol newProtocol, NotificationChain msgs) {
		MutualExclusionProtocol oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTOCOL, oldProtocol, newProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(MutualExclusionProtocol newProtocol) {
		if (newProtocol != protocol) {
			NotificationChain msgs = null;
			if (protocol != null)
				msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTOCOL, null, msgs);
			if (newProtocol != null)
				msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTOCOL, null, msgs);
			msgs = basicSetProtocol(newProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTOCOL, newProtocol, newProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtectionParameter> getProtectParams() {
		if (protectParams == null) {
			protectParams = new EObjectContainmentEList<ProtectionParameter>(ProtectionParameter.class, this, GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS);
		}
		return protectParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTOCOL:
				return basicSetProtocol(null, msgs);
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS:
				return ((InternalEList<?>)getProtectParams()).basicRemove(otherEnd, msgs);
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
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__SCHEDULER:
				if (resolve) return getScheduler();
				return basicGetScheduler();
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTOCOL:
				return getProtocol();
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS:
				return getProtectParams();
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
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__SCHEDULER:
				setScheduler((ResourceBroker)newValue);
				return;
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTOCOL:
				setProtocol((MutualExclusionProtocol)newValue);
				return;
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS:
				getProtectParams().clear();
				getProtectParams().addAll((Collection<? extends ProtectionParameter>)newValue);
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
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__SCHEDULER:
				setScheduler((ResourceBroker)null);
				return;
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTOCOL:
				setProtocol((MutualExclusionProtocol)null);
				return;
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS:
				getProtectParams().clear();
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
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__SCHEDULER:
				return scheduler != null;
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTOCOL:
				return protocol != null;
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS:
				return protectParams != null && !protectParams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MutualExclusionResourceImpl
