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
package org.polarsys.time4sys.marte.gqam.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.time4sys.marte.gqam.ArrivalPattern;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;

import org.polarsys.time4sys.marte.grm.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.WorkloadEventImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.WorkloadEventImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkloadEventImpl extends NamedElementImpl implements WorkloadEvent {
	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected BehaviorScenario effect;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected ArrivalPattern pattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.WORKLOAD_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorScenario getEffect() {
		if (effect != null && effect.eIsProxy()) {
			InternalEObject oldEffect = (InternalEObject)effect;
			effect = (BehaviorScenario)eResolveProxy(oldEffect);
			if (effect != oldEffect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GqamPackage.WORKLOAD_EVENT__EFFECT, oldEffect, effect));
			}
		}
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorScenario basicGetEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffect(BehaviorScenario newEffect, NotificationChain msgs) {
		BehaviorScenario oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GqamPackage.WORKLOAD_EVENT__EFFECT, oldEffect, newEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(BehaviorScenario newEffect) {
		if (newEffect != effect) {
			NotificationChain msgs = null;
			if (effect != null)
				msgs = ((InternalEObject)effect).eInverseRemove(this, GqamPackage.BEHAVIOR_SCENARIO__CAUSE, BehaviorScenario.class, msgs);
			if (newEffect != null)
				msgs = ((InternalEObject)newEffect).eInverseAdd(this, GqamPackage.BEHAVIOR_SCENARIO__CAUSE, BehaviorScenario.class, msgs);
			msgs = basicSetEffect(newEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.WORKLOAD_EVENT__EFFECT, newEffect, newEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrivalPattern getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(ArrivalPattern newPattern, NotificationChain msgs) {
		ArrivalPattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GqamPackage.WORKLOAD_EVENT__PATTERN, oldPattern, newPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(ArrivalPattern newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject)pattern).eInverseRemove(this, GqamPackage.ARRIVAL_PATTERN__PARENT, ArrivalPattern.class, msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, GqamPackage.ARRIVAL_PATTERN__PARENT, ArrivalPattern.class, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.WORKLOAD_EVENT__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GqamPackage.WORKLOAD_EVENT__EFFECT:
				if (effect != null)
					msgs = ((InternalEObject)effect).eInverseRemove(this, GqamPackage.BEHAVIOR_SCENARIO__CAUSE, BehaviorScenario.class, msgs);
				return basicSetEffect((BehaviorScenario)otherEnd, msgs);
			case GqamPackage.WORKLOAD_EVENT__PATTERN:
				if (pattern != null)
					msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GqamPackage.WORKLOAD_EVENT__PATTERN, null, msgs);
				return basicSetPattern((ArrivalPattern)otherEnd, msgs);
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
			case GqamPackage.WORKLOAD_EVENT__EFFECT:
				return basicSetEffect(null, msgs);
			case GqamPackage.WORKLOAD_EVENT__PATTERN:
				return basicSetPattern(null, msgs);
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
			case GqamPackage.WORKLOAD_EVENT__EFFECT:
				if (resolve) return getEffect();
				return basicGetEffect();
			case GqamPackage.WORKLOAD_EVENT__PATTERN:
				return getPattern();
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
			case GqamPackage.WORKLOAD_EVENT__EFFECT:
				setEffect((BehaviorScenario)newValue);
				return;
			case GqamPackage.WORKLOAD_EVENT__PATTERN:
				setPattern((ArrivalPattern)newValue);
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
			case GqamPackage.WORKLOAD_EVENT__EFFECT:
				setEffect((BehaviorScenario)null);
				return;
			case GqamPackage.WORKLOAD_EVENT__PATTERN:
				setPattern((ArrivalPattern)null);
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
			case GqamPackage.WORKLOAD_EVENT__EFFECT:
				return effect != null;
			case GqamPackage.WORKLOAD_EVENT__PATTERN:
				return pattern != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkloadEventImpl
