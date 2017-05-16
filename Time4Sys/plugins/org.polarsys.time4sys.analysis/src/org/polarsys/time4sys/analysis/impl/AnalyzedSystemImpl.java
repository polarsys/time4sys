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
package org.polarsys.time4sys.analysis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.AnalyzedSystem;
import org.polarsys.time4sys.analysis.ConstraintContainer;
import org.polarsys.time4sys.analysis.Delay;
import org.polarsys.time4sys.analysis.Mapping;
import org.polarsys.time4sys.analysis.MutualExclusionResource;
import org.polarsys.time4sys.analysis.ProtectionProtocol;
import org.polarsys.time4sys.analysis.Resource;
import org.polarsys.time4sys.analysis.ResultContainer;
import org.polarsys.time4sys.analysis.SchedulableElement;
import org.polarsys.time4sys.analysis.Scheduler;
import org.polarsys.time4sys.analysis.Stimulus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analyzed System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.AnalyzedSystemImpl#getSchedulableElements <em>Schedulable Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.AnalyzedSystemImpl#getSchedulers <em>Schedulers</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.AnalyzedSystemImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.AnalyzedSystemImpl#getConstraintContainer <em>Constraint Container</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.AnalyzedSystemImpl#getStimuli <em>Stimuli</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.AnalyzedSystemImpl#getDelays <em>Delays</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.AnalyzedSystemImpl#getProtectionProtocols <em>Protection Protocols</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.AnalyzedSystemImpl#getMutexes <em>Mutexes</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.AnalyzedSystemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.AnalyzedSystemImpl#getResultContainers <em>Result Containers</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.AnalyzedSystemImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.AnalyzedSystemImpl#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalyzedSystemImpl extends NamedElementImpl implements AnalyzedSystem {
	/**
	 * The cached value of the '{@link #getSchedulableElements() <em>Schedulable Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulableElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SchedulableElement> schedulableElements;

	/**
	 * The cached value of the '{@link #getSchedulers() <em>Schedulers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulers()
	 * @generated
	 * @ordered
	 */
	protected EList<Scheduler> schedulers;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getConstraintContainer() <em>Constraint Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintContainer()
	 * @generated
	 * @ordered
	 */
	protected ConstraintContainer constraintContainer;

	/**
	 * The cached value of the '{@link #getStimuli() <em>Stimuli</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimuli()
	 * @generated
	 * @ordered
	 */
	protected EList<Stimulus> stimuli;

	/**
	 * The cached value of the '{@link #getDelays() <em>Delays</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelays()
	 * @generated
	 * @ordered
	 */
	protected EList<Delay> delays;

	/**
	 * The cached value of the '{@link #getProtectionProtocols() <em>Protection Protocols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectionProtocol> protectionProtocols;

	/**
	 * The cached value of the '{@link #getMutexes() <em>Mutexes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutexes()
	 * @generated
	 * @ordered
	 */
	protected EList<MutualExclusionResource> mutexes;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResultContainers() <em>Result Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultContainer> resultContainers;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected String timeUnit = TIME_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalyzedSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.ANALYZED_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchedulableElement> getSchedulableElements() {
		if (schedulableElements == null) {
			schedulableElements = new EObjectContainmentWithInverseEList<SchedulableElement>(SchedulableElement.class, this, AnalysisPackage.ANALYZED_SYSTEM__SCHEDULABLE_ELEMENTS, AnalysisPackage.SCHEDULABLE_ELEMENT__PARENT);
		}
		return schedulableElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scheduler> getSchedulers() {
		if (schedulers == null) {
			schedulers = new EObjectContainmentWithInverseEList<Scheduler>(Scheduler.class, this, AnalysisPackage.ANALYZED_SYSTEM__SCHEDULERS, AnalysisPackage.SCHEDULER__PARENT);
		}
		return schedulers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, AnalysisPackage.ANALYZED_SYSTEM__RESOURCES, AnalysisPackage.RESOURCE__PARENT);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintContainer getConstraintContainer() {
		return constraintContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintContainer(ConstraintContainer newConstraintContainer, NotificationChain msgs) {
		ConstraintContainer oldConstraintContainer = constraintContainer;
		constraintContainer = newConstraintContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYZED_SYSTEM__CONSTRAINT_CONTAINER, oldConstraintContainer, newConstraintContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintContainer(ConstraintContainer newConstraintContainer) {
		if (newConstraintContainer != constraintContainer) {
			NotificationChain msgs = null;
			if (constraintContainer != null)
				msgs = ((InternalEObject)constraintContainer).eInverseRemove(this, AnalysisPackage.CONSTRAINT_CONTAINER__ANALYZED_SYSTEM, ConstraintContainer.class, msgs);
			if (newConstraintContainer != null)
				msgs = ((InternalEObject)newConstraintContainer).eInverseAdd(this, AnalysisPackage.CONSTRAINT_CONTAINER__ANALYZED_SYSTEM, ConstraintContainer.class, msgs);
			msgs = basicSetConstraintContainer(newConstraintContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYZED_SYSTEM__CONSTRAINT_CONTAINER, newConstraintContainer, newConstraintContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stimulus> getStimuli() {
		if (stimuli == null) {
			stimuli = new EObjectContainmentWithInverseEList<Stimulus>(Stimulus.class, this, AnalysisPackage.ANALYZED_SYSTEM__STIMULI, AnalysisPackage.STIMULUS__PARENT);
		}
		return stimuli;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delay> getDelays() {
		if (delays == null) {
			delays = new EObjectContainmentWithInverseEList<Delay>(Delay.class, this, AnalysisPackage.ANALYZED_SYSTEM__DELAYS, AnalysisPackage.DELAY__PARENT);
		}
		return delays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtectionProtocol> getProtectionProtocols() {
		if (protectionProtocols == null) {
			protectionProtocols = new EObjectContainmentWithInverseEList<ProtectionProtocol>(ProtectionProtocol.class, this, AnalysisPackage.ANALYZED_SYSTEM__PROTECTION_PROTOCOLS, AnalysisPackage.PROTECTION_PROTOCOL__PARENT);
		}
		return protectionProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MutualExclusionResource> getMutexes() {
		if (mutexes == null) {
			mutexes = new EObjectContainmentWithInverseEList<MutualExclusionResource>(MutualExclusionResource.class, this, AnalysisPackage.ANALYZED_SYSTEM__MUTEXES, AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PARENT);
		}
		return mutexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYZED_SYSTEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultContainer> getResultContainers() {
		if (resultContainers == null) {
			resultContainers = new EObjectContainmentWithInverseEList<ResultContainer>(ResultContainer.class, this, AnalysisPackage.ANALYZED_SYSTEM__RESULT_CONTAINERS, AnalysisPackage.RESULT_CONTAINER__ANALYZED_SYSTEM);
		}
		return resultContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<Mapping>(Mapping.class, this, AnalysisPackage.ANALYZED_SYSTEM__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeUnit() {
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnit(String newTimeUnit) {
		String oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYZED_SYSTEM__TIME_UNIT, oldTimeUnit, timeUnit));
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
			case AnalysisPackage.ANALYZED_SYSTEM__SCHEDULABLE_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSchedulableElements()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__SCHEDULERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSchedulers()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__CONSTRAINT_CONTAINER:
				if (constraintContainer != null)
					msgs = ((InternalEObject)constraintContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYZED_SYSTEM__CONSTRAINT_CONTAINER, null, msgs);
				return basicSetConstraintContainer((ConstraintContainer)otherEnd, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__STIMULI:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStimuli()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__DELAYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelays()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__PROTECTION_PROTOCOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProtectionProtocols()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__MUTEXES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMutexes()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__RESULT_CONTAINERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResultContainers()).basicAdd(otherEnd, msgs);
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
			case AnalysisPackage.ANALYZED_SYSTEM__SCHEDULABLE_ELEMENTS:
				return ((InternalEList<?>)getSchedulableElements()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__SCHEDULERS:
				return ((InternalEList<?>)getSchedulers()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__CONSTRAINT_CONTAINER:
				return basicSetConstraintContainer(null, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__STIMULI:
				return ((InternalEList<?>)getStimuli()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__DELAYS:
				return ((InternalEList<?>)getDelays()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__PROTECTION_PROTOCOLS:
				return ((InternalEList<?>)getProtectionProtocols()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__MUTEXES:
				return ((InternalEList<?>)getMutexes()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__RESULT_CONTAINERS:
				return ((InternalEList<?>)getResultContainers()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYZED_SYSTEM__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
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
			case AnalysisPackage.ANALYZED_SYSTEM__SCHEDULABLE_ELEMENTS:
				return getSchedulableElements();
			case AnalysisPackage.ANALYZED_SYSTEM__SCHEDULERS:
				return getSchedulers();
			case AnalysisPackage.ANALYZED_SYSTEM__RESOURCES:
				return getResources();
			case AnalysisPackage.ANALYZED_SYSTEM__CONSTRAINT_CONTAINER:
				return getConstraintContainer();
			case AnalysisPackage.ANALYZED_SYSTEM__STIMULI:
				return getStimuli();
			case AnalysisPackage.ANALYZED_SYSTEM__DELAYS:
				return getDelays();
			case AnalysisPackage.ANALYZED_SYSTEM__PROTECTION_PROTOCOLS:
				return getProtectionProtocols();
			case AnalysisPackage.ANALYZED_SYSTEM__MUTEXES:
				return getMutexes();
			case AnalysisPackage.ANALYZED_SYSTEM__STATUS:
				return getStatus();
			case AnalysisPackage.ANALYZED_SYSTEM__RESULT_CONTAINERS:
				return getResultContainers();
			case AnalysisPackage.ANALYZED_SYSTEM__MAPPINGS:
				return getMappings();
			case AnalysisPackage.ANALYZED_SYSTEM__TIME_UNIT:
				return getTimeUnit();
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
			case AnalysisPackage.ANALYZED_SYSTEM__SCHEDULABLE_ELEMENTS:
				getSchedulableElements().clear();
				getSchedulableElements().addAll((Collection<? extends SchedulableElement>)newValue);
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__SCHEDULERS:
				getSchedulers().clear();
				getSchedulers().addAll((Collection<? extends Scheduler>)newValue);
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__CONSTRAINT_CONTAINER:
				setConstraintContainer((ConstraintContainer)newValue);
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__STIMULI:
				getStimuli().clear();
				getStimuli().addAll((Collection<? extends Stimulus>)newValue);
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__DELAYS:
				getDelays().clear();
				getDelays().addAll((Collection<? extends Delay>)newValue);
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__PROTECTION_PROTOCOLS:
				getProtectionProtocols().clear();
				getProtectionProtocols().addAll((Collection<? extends ProtectionProtocol>)newValue);
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__MUTEXES:
				getMutexes().clear();
				getMutexes().addAll((Collection<? extends MutualExclusionResource>)newValue);
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__STATUS:
				setStatus((String)newValue);
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__RESULT_CONTAINERS:
				getResultContainers().clear();
				getResultContainers().addAll((Collection<? extends ResultContainer>)newValue);
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends Mapping>)newValue);
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__TIME_UNIT:
				setTimeUnit((String)newValue);
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
			case AnalysisPackage.ANALYZED_SYSTEM__SCHEDULABLE_ELEMENTS:
				getSchedulableElements().clear();
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__SCHEDULERS:
				getSchedulers().clear();
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__RESOURCES:
				getResources().clear();
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__CONSTRAINT_CONTAINER:
				setConstraintContainer((ConstraintContainer)null);
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__STIMULI:
				getStimuli().clear();
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__DELAYS:
				getDelays().clear();
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__PROTECTION_PROTOCOLS:
				getProtectionProtocols().clear();
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__MUTEXES:
				getMutexes().clear();
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__RESULT_CONTAINERS:
				getResultContainers().clear();
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__MAPPINGS:
				getMappings().clear();
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
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
			case AnalysisPackage.ANALYZED_SYSTEM__SCHEDULABLE_ELEMENTS:
				return schedulableElements != null && !schedulableElements.isEmpty();
			case AnalysisPackage.ANALYZED_SYSTEM__SCHEDULERS:
				return schedulers != null && !schedulers.isEmpty();
			case AnalysisPackage.ANALYZED_SYSTEM__RESOURCES:
				return resources != null && !resources.isEmpty();
			case AnalysisPackage.ANALYZED_SYSTEM__CONSTRAINT_CONTAINER:
				return constraintContainer != null;
			case AnalysisPackage.ANALYZED_SYSTEM__STIMULI:
				return stimuli != null && !stimuli.isEmpty();
			case AnalysisPackage.ANALYZED_SYSTEM__DELAYS:
				return delays != null && !delays.isEmpty();
			case AnalysisPackage.ANALYZED_SYSTEM__PROTECTION_PROTOCOLS:
				return protectionProtocols != null && !protectionProtocols.isEmpty();
			case AnalysisPackage.ANALYZED_SYSTEM__MUTEXES:
				return mutexes != null && !mutexes.isEmpty();
			case AnalysisPackage.ANALYZED_SYSTEM__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case AnalysisPackage.ANALYZED_SYSTEM__RESULT_CONTAINERS:
				return resultContainers != null && !resultContainers.isEmpty();
			case AnalysisPackage.ANALYZED_SYSTEM__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
			case AnalysisPackage.ANALYZED_SYSTEM__TIME_UNIT:
				return TIME_UNIT_EDEFAULT == null ? timeUnit != null : !TIME_UNIT_EDEFAULT.equals(timeUnit);
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
		result.append(" (status: ");
		result.append(status);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(')');
		return result.toString();
	}

} //AnalyzedSystemImpl
