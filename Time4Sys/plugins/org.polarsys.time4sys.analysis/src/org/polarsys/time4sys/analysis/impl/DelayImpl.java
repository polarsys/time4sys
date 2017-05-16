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
import org.polarsys.time4sys.analysis.Delay;
import org.polarsys.time4sys.analysis.EventModelContainer;
import org.polarsys.time4sys.analysis.InputJoinBehaviorKind;
import org.polarsys.time4sys.analysis.Port;
import org.polarsys.time4sys.analysis.PortContainer;
import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.DelayImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.DelayImpl#getBehaviorKind <em>Behavior Kind</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.DelayImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.DelayImpl#getReferencedEvent <em>Referenced Event</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.DelayImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelayImpl extends EventModelContainerImpl implements Delay {
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
	 * The cached value of the '{@link #getReferencedEvent() <em>Referenced Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedEvent()
	 * @generated
	 * @ordered
	 */
	protected EventModelContainer referencedEvent;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration duration = DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.DELAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentWithInverseEList<Port>(Port.class, this, AnalysisPackage.DELAY__PORTS, AnalysisPackage.PORT__PARENT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DELAY__BEHAVIOR_KIND, oldBehaviorKind, behaviorKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyzedSystem getParent() {
		if (eContainerFeatureID() != AnalysisPackage.DELAY__PARENT) return null;
		return (AnalyzedSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(AnalyzedSystem newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, AnalysisPackage.DELAY__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(AnalyzedSystem newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != AnalysisPackage.DELAY__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, AnalysisPackage.ANALYZED_SYSTEM__DELAYS, AnalyzedSystem.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DELAY__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventModelContainer getReferencedEvent() {
		if (referencedEvent != null && referencedEvent.eIsProxy()) {
			InternalEObject oldReferencedEvent = (InternalEObject)referencedEvent;
			referencedEvent = (EventModelContainer)eResolveProxy(oldReferencedEvent);
			if (referencedEvent != oldReferencedEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.DELAY__REFERENCED_EVENT, oldReferencedEvent, referencedEvent));
			}
		}
		return referencedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventModelContainer basicGetReferencedEvent() {
		return referencedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedEvent(EventModelContainer newReferencedEvent) {
		EventModelContainer oldReferencedEvent = referencedEvent;
		referencedEvent = newReferencedEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DELAY__REFERENCED_EVENT, oldReferencedEvent, referencedEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Duration newDuration) {
		Duration oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DELAY__DURATION, oldDuration, duration));
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
			case AnalysisPackage.DELAY__PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPorts()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.DELAY__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((AnalyzedSystem)otherEnd, msgs);
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
			case AnalysisPackage.DELAY__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.DELAY__PARENT:
				return basicSetParent(null, msgs);
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
			case AnalysisPackage.DELAY__PARENT:
				return eInternalContainer().eInverseRemove(this, AnalysisPackage.ANALYZED_SYSTEM__DELAYS, AnalyzedSystem.class, msgs);
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
			case AnalysisPackage.DELAY__PORTS:
				return getPorts();
			case AnalysisPackage.DELAY__BEHAVIOR_KIND:
				return getBehaviorKind();
			case AnalysisPackage.DELAY__PARENT:
				return getParent();
			case AnalysisPackage.DELAY__REFERENCED_EVENT:
				if (resolve) return getReferencedEvent();
				return basicGetReferencedEvent();
			case AnalysisPackage.DELAY__DURATION:
				return getDuration();
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
			case AnalysisPackage.DELAY__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case AnalysisPackage.DELAY__BEHAVIOR_KIND:
				setBehaviorKind((InputJoinBehaviorKind)newValue);
				return;
			case AnalysisPackage.DELAY__PARENT:
				setParent((AnalyzedSystem)newValue);
				return;
			case AnalysisPackage.DELAY__REFERENCED_EVENT:
				setReferencedEvent((EventModelContainer)newValue);
				return;
			case AnalysisPackage.DELAY__DURATION:
				setDuration((Duration)newValue);
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
			case AnalysisPackage.DELAY__PORTS:
				getPorts().clear();
				return;
			case AnalysisPackage.DELAY__BEHAVIOR_KIND:
				setBehaviorKind(BEHAVIOR_KIND_EDEFAULT);
				return;
			case AnalysisPackage.DELAY__PARENT:
				setParent((AnalyzedSystem)null);
				return;
			case AnalysisPackage.DELAY__REFERENCED_EVENT:
				setReferencedEvent((EventModelContainer)null);
				return;
			case AnalysisPackage.DELAY__DURATION:
				setDuration(DURATION_EDEFAULT);
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
			case AnalysisPackage.DELAY__PORTS:
				return ports != null && !ports.isEmpty();
			case AnalysisPackage.DELAY__BEHAVIOR_KIND:
				return behaviorKind != BEHAVIOR_KIND_EDEFAULT;
			case AnalysisPackage.DELAY__PARENT:
				return getParent() != null;
			case AnalysisPackage.DELAY__REFERENCED_EVENT:
				return referencedEvent != null;
			case AnalysisPackage.DELAY__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
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
				case AnalysisPackage.DELAY__PORTS: return AnalysisPackage.PORT_CONTAINER__PORTS;
				case AnalysisPackage.DELAY__BEHAVIOR_KIND: return AnalysisPackage.PORT_CONTAINER__BEHAVIOR_KIND;
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
				case AnalysisPackage.PORT_CONTAINER__PORTS: return AnalysisPackage.DELAY__PORTS;
				case AnalysisPackage.PORT_CONTAINER__BEHAVIOR_KIND: return AnalysisPackage.DELAY__BEHAVIOR_KIND;
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
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //DelayImpl
