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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.marte.grm.ComputingResource;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.ProcessingResource;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.marte.grm.Scheduler;
import org.polarsys.time4sys.marte.grm.SchedulingPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.SchedulerImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.SchedulerImpl#getProcessingUnits <em>Processing Units</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.SchedulerImpl#getSchedulableResource <em>Schedulable Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.SchedulerImpl#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulerImpl extends ResourceBrokerImpl implements Scheduler {
	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected ComputingResource host;

	/**
	 * The cached value of the '{@link #getProcessingUnits() <em>Processing Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingResource> processingUnits;

	/**
	 * The cached value of the '{@link #getSchedulableResource() <em>Schedulable Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulableResource()
	 * @generated
	 * @ordered
	 */
	protected EList<SchedulableResource> schedulableResource;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected SchedulingPolicy policy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingResource getHost() {
		if (host != null && host.eIsProxy()) {
			InternalEObject oldHost = (InternalEObject)host;
			host = (ComputingResource)eResolveProxy(oldHost);
			if (host != oldHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrmPackage.SCHEDULER__HOST, oldHost, host));
			}
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingResource basicGetHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(ComputingResource newHost) {
		ComputingResource oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.SCHEDULER__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessingResource> getProcessingUnits() {
		if (processingUnits == null) {
			processingUnits = new EObjectResolvingEList<ProcessingResource>(ProcessingResource.class, this, GrmPackage.SCHEDULER__PROCESSING_UNITS);
		}
		return processingUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchedulableResource> getSchedulableResource() {
		if (schedulableResource == null) {
			schedulableResource = new EObjectWithInverseResolvingEList<SchedulableResource>(SchedulableResource.class, this, GrmPackage.SCHEDULER__SCHEDULABLE_RESOURCE, GrmPackage.SCHEDULABLE_RESOURCE__HOST);
		}
		return schedulableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicy getPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicy(SchedulingPolicy newPolicy, NotificationChain msgs) {
		SchedulingPolicy oldPolicy = policy;
		policy = newPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrmPackage.SCHEDULER__POLICY, oldPolicy, newPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy(SchedulingPolicy newPolicy) {
		if (newPolicy != policy) {
			NotificationChain msgs = null;
			if (policy != null)
				msgs = ((InternalEObject)policy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrmPackage.SCHEDULER__POLICY, null, msgs);
			if (newPolicy != null)
				msgs = ((InternalEObject)newPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrmPackage.SCHEDULER__POLICY, null, msgs);
			msgs = basicSetPolicy(newPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.SCHEDULER__POLICY, newPolicy, newPolicy));
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
			case GrmPackage.SCHEDULER__SCHEDULABLE_RESOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSchedulableResource()).basicAdd(otherEnd, msgs);
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
			case GrmPackage.SCHEDULER__SCHEDULABLE_RESOURCE:
				return ((InternalEList<?>)getSchedulableResource()).basicRemove(otherEnd, msgs);
			case GrmPackage.SCHEDULER__POLICY:
				return basicSetPolicy(null, msgs);
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
			case GrmPackage.SCHEDULER__HOST:
				if (resolve) return getHost();
				return basicGetHost();
			case GrmPackage.SCHEDULER__PROCESSING_UNITS:
				return getProcessingUnits();
			case GrmPackage.SCHEDULER__SCHEDULABLE_RESOURCE:
				return getSchedulableResource();
			case GrmPackage.SCHEDULER__POLICY:
				return getPolicy();
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
			case GrmPackage.SCHEDULER__HOST:
				setHost((ComputingResource)newValue);
				return;
			case GrmPackage.SCHEDULER__PROCESSING_UNITS:
				getProcessingUnits().clear();
				getProcessingUnits().addAll((Collection<? extends ProcessingResource>)newValue);
				return;
			case GrmPackage.SCHEDULER__SCHEDULABLE_RESOURCE:
				getSchedulableResource().clear();
				getSchedulableResource().addAll((Collection<? extends SchedulableResource>)newValue);
				return;
			case GrmPackage.SCHEDULER__POLICY:
				setPolicy((SchedulingPolicy)newValue);
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
			case GrmPackage.SCHEDULER__HOST:
				setHost((ComputingResource)null);
				return;
			case GrmPackage.SCHEDULER__PROCESSING_UNITS:
				getProcessingUnits().clear();
				return;
			case GrmPackage.SCHEDULER__SCHEDULABLE_RESOURCE:
				getSchedulableResource().clear();
				return;
			case GrmPackage.SCHEDULER__POLICY:
				setPolicy((SchedulingPolicy)null);
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
			case GrmPackage.SCHEDULER__HOST:
				return host != null;
			case GrmPackage.SCHEDULER__PROCESSING_UNITS:
				return processingUnits != null && !processingUnits.isEmpty();
			case GrmPackage.SCHEDULER__SCHEDULABLE_RESOURCE:
				return schedulableResource != null && !schedulableResource.isEmpty();
			case GrmPackage.SCHEDULER__POLICY:
				return policy != null;
		}
		return super.eIsSet(featureID);
	}

} //SchedulerImpl
