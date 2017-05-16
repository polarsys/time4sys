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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.AnalyzedSystem;
import org.polarsys.time4sys.analysis.InputJoinBehaviorKind;
import org.polarsys.time4sys.analysis.Port;
import org.polarsys.time4sys.analysis.PortContainer;
import org.polarsys.time4sys.analysis.SchedulableElement;
import org.polarsys.time4sys.analysis.Scheduler;
import org.polarsys.time4sys.analysis.SchedulerParameterValue;
import org.polarsys.time4sys.marte.nfp.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedulable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.SchedulableElementImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.SchedulableElementImpl#getBehaviorKind <em>Behavior Kind</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.SchedulableElementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.SchedulableElementImpl#getScheduledBy <em>Scheduled By</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.SchedulableElementImpl#getCET <em>CET</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.SchedulableElementImpl#getSchedulingParameters <em>Scheduling Parameters</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.SchedulableElementImpl#getOriginalName <em>Original Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SchedulableElementImpl extends EventModelContainerImpl implements SchedulableElement {
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The default value of the '{@link #getBehaviorKind() <em>Behavior Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorKind()
	 * @generated
	 * @ordered
	 */
	protected static final InputJoinBehaviorKind BEHAVIOR_KIND_EDEFAULT = InputJoinBehaviorKind.MERGE;

	/**
	 * The cached value of the '{@link #getBehaviorKind() <em>Behavior Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorKind()
	 * @generated
	 * @ordered
	 */
	protected InputJoinBehaviorKind behaviorKind = BEHAVIOR_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScheduledBy() <em>Scheduled By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledBy()
	 * @generated
	 * @ordered
	 */
	protected Scheduler scheduledBy;

	/**
	 * The default value of the '{@link #getCET() <em>CET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCET()
	 * @generated
	 * @ordered
	 */
	protected static final TimeInterval CET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCET() <em>CET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCET()
	 * @generated
	 * @ordered
	 */
	protected TimeInterval cet = CET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchedulingParameters() <em>Scheduling Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SchedulerParameterValue> schedulingParameters;

	/**
	 * The default value of the '{@link #getOriginalName() <em>Original Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalName()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalName() <em>Original Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalName()
	 * @generated
	 * @ordered
	 */
	protected String originalName = ORIGINAL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.SCHEDULABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentWithInverseEList<Port>(Port.class, this, AnalysisPackage.SCHEDULABLE_ELEMENT__PORTS, AnalysisPackage.PORT__PARENT);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputJoinBehaviorKind getBehaviorKind() {
		return behaviorKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviorKind(InputJoinBehaviorKind newBehaviorKind) {
		InputJoinBehaviorKind oldBehaviorKind = behaviorKind;
		behaviorKind = newBehaviorKind == null ? BEHAVIOR_KIND_EDEFAULT : newBehaviorKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.SCHEDULABLE_ELEMENT__BEHAVIOR_KIND, oldBehaviorKind, behaviorKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyzedSystem getParent() {
		if (eContainerFeatureID() != AnalysisPackage.SCHEDULABLE_ELEMENT__PARENT) return null;
		return (AnalyzedSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(AnalyzedSystem newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, AnalysisPackage.SCHEDULABLE_ELEMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(AnalyzedSystem newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != AnalysisPackage.SCHEDULABLE_ELEMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, AnalysisPackage.ANALYZED_SYSTEM__SCHEDULABLE_ELEMENTS, AnalyzedSystem.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.SCHEDULABLE_ELEMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getScheduledBy() {
		if (scheduledBy != null && scheduledBy.eIsProxy()) {
			InternalEObject oldScheduledBy = (InternalEObject)scheduledBy;
			scheduledBy = (Scheduler)eResolveProxy(oldScheduledBy);
			if (scheduledBy != oldScheduledBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULED_BY, oldScheduledBy, scheduledBy));
			}
		}
		return scheduledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler basicGetScheduledBy() {
		return scheduledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledBy(Scheduler newScheduledBy, NotificationChain msgs) {
		Scheduler oldScheduledBy = scheduledBy;
		scheduledBy = newScheduledBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULED_BY, oldScheduledBy, newScheduledBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledBy(Scheduler newScheduledBy) {
		if (newScheduledBy != scheduledBy) {
			NotificationChain msgs = null;
			if (scheduledBy != null)
				msgs = ((InternalEObject)scheduledBy).eInverseRemove(this, AnalysisPackage.SCHEDULER__SCHEDULED_ELEMENTS, Scheduler.class, msgs);
			if (newScheduledBy != null)
				msgs = ((InternalEObject)newScheduledBy).eInverseAdd(this, AnalysisPackage.SCHEDULER__SCHEDULED_ELEMENTS, Scheduler.class, msgs);
			msgs = basicSetScheduledBy(newScheduledBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULED_BY, newScheduledBy, newScheduledBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval getCET() {
		return cet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCET(TimeInterval newCET) {
		TimeInterval oldCET = cet;
		cet = newCET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.SCHEDULABLE_ELEMENT__CET, oldCET, cet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchedulerParameterValue> getSchedulingParameters() {
		if (schedulingParameters == null) {
			schedulingParameters = new EObjectContainmentWithInverseEList<SchedulerParameterValue>(SchedulerParameterValue.class, this, AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULING_PARAMETERS, AnalysisPackage.SCHEDULER_PARAMETER_VALUE__PARENT);
		}
		return schedulingParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginalName() {
		return originalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalName(String newOriginalName) {
		String oldOriginalName = originalName;
		originalName = newOriginalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.SCHEDULABLE_ELEMENT__ORIGINAL_NAME, oldOriginalName, originalName));
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
			case AnalysisPackage.SCHEDULABLE_ELEMENT__PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPorts()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.SCHEDULABLE_ELEMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((AnalyzedSystem)otherEnd, msgs);
			case AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULED_BY:
				if (scheduledBy != null)
					msgs = ((InternalEObject)scheduledBy).eInverseRemove(this, AnalysisPackage.SCHEDULER__SCHEDULED_ELEMENTS, Scheduler.class, msgs);
				return basicSetScheduledBy((Scheduler)otherEnd, msgs);
			case AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULING_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSchedulingParameters()).basicAdd(otherEnd, msgs);
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
			case AnalysisPackage.SCHEDULABLE_ELEMENT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.SCHEDULABLE_ELEMENT__PARENT:
				return basicSetParent(null, msgs);
			case AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULED_BY:
				return basicSetScheduledBy(null, msgs);
			case AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULING_PARAMETERS:
				return ((InternalEList<?>)getSchedulingParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AnalysisPackage.SCHEDULABLE_ELEMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, AnalysisPackage.ANALYZED_SYSTEM__SCHEDULABLE_ELEMENTS, AnalyzedSystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisPackage.SCHEDULABLE_ELEMENT__PORTS:
				return getPorts();
			case AnalysisPackage.SCHEDULABLE_ELEMENT__BEHAVIOR_KIND:
				return getBehaviorKind();
			case AnalysisPackage.SCHEDULABLE_ELEMENT__PARENT:
				return getParent();
			case AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULED_BY:
				if (resolve) return getScheduledBy();
				return basicGetScheduledBy();
			case AnalysisPackage.SCHEDULABLE_ELEMENT__CET:
				return getCET();
			case AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULING_PARAMETERS:
				return getSchedulingParameters();
			case AnalysisPackage.SCHEDULABLE_ELEMENT__ORIGINAL_NAME:
				return getOriginalName();
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
			case AnalysisPackage.SCHEDULABLE_ELEMENT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case AnalysisPackage.SCHEDULABLE_ELEMENT__BEHAVIOR_KIND:
				setBehaviorKind((InputJoinBehaviorKind)newValue);
				return;
			case AnalysisPackage.SCHEDULABLE_ELEMENT__PARENT:
				setParent((AnalyzedSystem)newValue);
				return;
			case AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULED_BY:
				setScheduledBy((Scheduler)newValue);
				return;
			case AnalysisPackage.SCHEDULABLE_ELEMENT__CET:
				setCET((TimeInterval)newValue);
				return;
			case AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULING_PARAMETERS:
				getSchedulingParameters().clear();
				getSchedulingParameters().addAll((Collection<? extends SchedulerParameterValue>)newValue);
				return;
			case AnalysisPackage.SCHEDULABLE_ELEMENT__ORIGINAL_NAME:
				setOriginalName((String)newValue);
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
			case AnalysisPackage.SCHEDULABLE_ELEMENT__PORTS:
				getPorts().clear();
				return;
			case AnalysisPackage.SCHEDULABLE_ELEMENT__BEHAVIOR_KIND:
				setBehaviorKind(BEHAVIOR_KIND_EDEFAULT);
				return;
			case AnalysisPackage.SCHEDULABLE_ELEMENT__PARENT:
				setParent((AnalyzedSystem)null);
				return;
			case AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULED_BY:
				setScheduledBy((Scheduler)null);
				return;
			case AnalysisPackage.SCHEDULABLE_ELEMENT__CET:
				setCET(CET_EDEFAULT);
				return;
			case AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULING_PARAMETERS:
				getSchedulingParameters().clear();
				return;
			case AnalysisPackage.SCHEDULABLE_ELEMENT__ORIGINAL_NAME:
				setOriginalName(ORIGINAL_NAME_EDEFAULT);
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
			case AnalysisPackage.SCHEDULABLE_ELEMENT__PORTS:
				return ports != null && !ports.isEmpty();
			case AnalysisPackage.SCHEDULABLE_ELEMENT__BEHAVIOR_KIND:
				return behaviorKind != BEHAVIOR_KIND_EDEFAULT;
			case AnalysisPackage.SCHEDULABLE_ELEMENT__PARENT:
				return getParent() != null;
			case AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULED_BY:
				return scheduledBy != null;
			case AnalysisPackage.SCHEDULABLE_ELEMENT__CET:
				return CET_EDEFAULT == null ? cet != null : !CET_EDEFAULT.equals(cet);
			case AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULING_PARAMETERS:
				return schedulingParameters != null && !schedulingParameters.isEmpty();
			case AnalysisPackage.SCHEDULABLE_ELEMENT__ORIGINAL_NAME:
				return ORIGINAL_NAME_EDEFAULT == null ? originalName != null : !ORIGINAL_NAME_EDEFAULT.equals(originalName);
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
		if (baseClass == PortContainer.class) {
			switch (derivedFeatureID) {
				case AnalysisPackage.SCHEDULABLE_ELEMENT__PORTS: return AnalysisPackage.PORT_CONTAINER__PORTS;
				case AnalysisPackage.SCHEDULABLE_ELEMENT__BEHAVIOR_KIND: return AnalysisPackage.PORT_CONTAINER__BEHAVIOR_KIND;
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
		if (baseClass == PortContainer.class) {
			switch (baseFeatureID) {
				case AnalysisPackage.PORT_CONTAINER__PORTS: return AnalysisPackage.SCHEDULABLE_ELEMENT__PORTS;
				case AnalysisPackage.PORT_CONTAINER__BEHAVIOR_KIND: return AnalysisPackage.SCHEDULABLE_ELEMENT__BEHAVIOR_KIND;
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
		result.append(" (behaviorKind: ");
		result.append(behaviorKind);
		result.append(", CET: ");
		result.append(cet);
		result.append(", originalName: ");
		result.append(originalName);
		result.append(')');
		return result.toString();
	}

} //SchedulableElementImpl
