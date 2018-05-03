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
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.marte.grm.Scheduler;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.grm.SecondaryScheduler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedulable Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.SchedulableResourceImpl#getDependentScheduler <em>Dependent Scheduler</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.SchedulableResourceImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.SchedulableResourceImpl#getSchedParams <em>Sched Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulableResourceImpl extends ConcurrencyResourceImpl implements SchedulableResource {
	/**
	 * The cached value of the '{@link #getDependentScheduler() <em>Dependent Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentScheduler()
	 * @generated
	 * @ordered
	 */
	protected SecondaryScheduler dependentScheduler;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected Scheduler host;

	/**
	 * The cached value of the '{@link #getSchedParams() <em>Sched Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedParams()
	 * @generated
	 * @ordered
	 */
	protected EList<SchedulingParameter> schedParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulableResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.SCHEDULABLE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondaryScheduler getDependentScheduler() {
		if (dependentScheduler != null && dependentScheduler.eIsProxy()) {
			InternalEObject oldDependentScheduler = (InternalEObject)dependentScheduler;
			dependentScheduler = (SecondaryScheduler)eResolveProxy(oldDependentScheduler);
			if (dependentScheduler != oldDependentScheduler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrmPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER, oldDependentScheduler, dependentScheduler));
			}
		}
		return dependentScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondaryScheduler basicGetDependentScheduler() {
		return dependentScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependentScheduler(SecondaryScheduler newDependentScheduler, NotificationChain msgs) {
		SecondaryScheduler oldDependentScheduler = dependentScheduler;
		dependentScheduler = newDependentScheduler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrmPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER, oldDependentScheduler, newDependentScheduler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentScheduler(SecondaryScheduler newDependentScheduler) {
		if (newDependentScheduler != dependentScheduler) {
			NotificationChain msgs = null;
			if (dependentScheduler != null)
				msgs = ((InternalEObject)dependentScheduler).eInverseRemove(this, GrmPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNIT, SecondaryScheduler.class, msgs);
			if (newDependentScheduler != null)
				msgs = ((InternalEObject)newDependentScheduler).eInverseAdd(this, GrmPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNIT, SecondaryScheduler.class, msgs);
			msgs = basicSetDependentScheduler(newDependentScheduler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER, newDependentScheduler, newDependentScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getHost() {
		if (host != null && host.eIsProxy()) {
			InternalEObject oldHost = (InternalEObject)host;
			host = (Scheduler)eResolveProxy(oldHost);
			if (host != oldHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrmPackage.SCHEDULABLE_RESOURCE__HOST, oldHost, host));
			}
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler basicGetHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHost(Scheduler newHost, NotificationChain msgs) {
		Scheduler oldHost = host;
		host = newHost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrmPackage.SCHEDULABLE_RESOURCE__HOST, oldHost, newHost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(Scheduler newHost) {
		if (newHost != host) {
			NotificationChain msgs = null;
			if (host != null)
				msgs = ((InternalEObject)host).eInverseRemove(this, GrmPackage.SCHEDULER__SCHEDULABLE_RESOURCE, Scheduler.class, msgs);
			if (newHost != null)
				msgs = ((InternalEObject)newHost).eInverseAdd(this, GrmPackage.SCHEDULER__SCHEDULABLE_RESOURCE, Scheduler.class, msgs);
			msgs = basicSetHost(newHost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.SCHEDULABLE_RESOURCE__HOST, newHost, newHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchedulingParameter> getSchedParams() {
		if (schedParams == null) {
			schedParams = new EObjectContainmentEList<SchedulingParameter>(SchedulingParameter.class, this, GrmPackage.SCHEDULABLE_RESOURCE__SCHED_PARAMS);
		}
		return schedParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrmPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				if (dependentScheduler != null)
					msgs = ((InternalEObject)dependentScheduler).eInverseRemove(this, GrmPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNIT, SecondaryScheduler.class, msgs);
				return basicSetDependentScheduler((SecondaryScheduler)otherEnd, msgs);
			case GrmPackage.SCHEDULABLE_RESOURCE__HOST:
				if (host != null)
					msgs = ((InternalEObject)host).eInverseRemove(this, GrmPackage.SCHEDULER__SCHEDULABLE_RESOURCE, Scheduler.class, msgs);
				return basicSetHost((Scheduler)otherEnd, msgs);
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
			case GrmPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				return basicSetDependentScheduler(null, msgs);
			case GrmPackage.SCHEDULABLE_RESOURCE__HOST:
				return basicSetHost(null, msgs);
			case GrmPackage.SCHEDULABLE_RESOURCE__SCHED_PARAMS:
				return ((InternalEList<?>)getSchedParams()).basicRemove(otherEnd, msgs);
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
			case GrmPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				if (resolve) return getDependentScheduler();
				return basicGetDependentScheduler();
			case GrmPackage.SCHEDULABLE_RESOURCE__HOST:
				if (resolve) return getHost();
				return basicGetHost();
			case GrmPackage.SCHEDULABLE_RESOURCE__SCHED_PARAMS:
				return getSchedParams();
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
			case GrmPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				setDependentScheduler((SecondaryScheduler)newValue);
				return;
			case GrmPackage.SCHEDULABLE_RESOURCE__HOST:
				setHost((Scheduler)newValue);
				return;
			case GrmPackage.SCHEDULABLE_RESOURCE__SCHED_PARAMS:
				getSchedParams().clear();
				getSchedParams().addAll((Collection<? extends SchedulingParameter>)newValue);
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
			case GrmPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				setDependentScheduler((SecondaryScheduler)null);
				return;
			case GrmPackage.SCHEDULABLE_RESOURCE__HOST:
				setHost((Scheduler)null);
				return;
			case GrmPackage.SCHEDULABLE_RESOURCE__SCHED_PARAMS:
				getSchedParams().clear();
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
			case GrmPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				return dependentScheduler != null;
			case GrmPackage.SCHEDULABLE_RESOURCE__HOST:
				return host != null;
			case GrmPackage.SCHEDULABLE_RESOURCE__SCHED_PARAMS:
				return schedParams != null && !schedParams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchedulableResourceImpl
