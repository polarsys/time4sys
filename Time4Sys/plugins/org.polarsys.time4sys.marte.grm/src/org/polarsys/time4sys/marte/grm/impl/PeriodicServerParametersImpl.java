/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.grm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.PeriodicServerKind;
import org.polarsys.time4sys.marte.grm.PeriodicServerParameters;

import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Server Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.PeriodicServerParametersImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.PeriodicServerParametersImpl#getBackgroundPriority <em>Background Priority</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.PeriodicServerParametersImpl#getInitialBudget <em>Initial Budget</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.PeriodicServerParametersImpl#getReplenishPeriod <em>Replenish Period</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.PeriodicServerParametersImpl#getMaxPendingReplenish <em>Max Pending Replenish</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodicServerParametersImpl extends FixedPriorityParametersImpl implements PeriodicServerParameters {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final PeriodicServerKind KIND_EDEFAULT = PeriodicServerKind.UNDEF;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected PeriodicServerKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundPriority() <em>Background Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int BACKGROUND_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBackgroundPriority() <em>Background Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundPriority()
	 * @generated
	 * @ordered
	 */
	protected int backgroundPriority = BACKGROUND_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialBudget() <em>Initial Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialBudget()
	 * @generated
	 * @ordered
	 */
	protected static final Duration INITIAL_BUDGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialBudget() <em>Initial Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialBudget()
	 * @generated
	 * @ordered
	 */
	protected Duration initialBudget = INITIAL_BUDGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplenishPeriod() <em>Replenish Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplenishPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Duration REPLENISH_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplenishPeriod() <em>Replenish Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplenishPeriod()
	 * @generated
	 * @ordered
	 */
	protected Duration replenishPeriod = REPLENISH_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxPendingReplenish() <em>Max Pending Replenish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPendingReplenish()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_PENDING_REPLENISH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxPendingReplenish() <em>Max Pending Replenish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPendingReplenish()
	 * @generated
	 * @ordered
	 */
	protected int maxPendingReplenish = MAX_PENDING_REPLENISH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicServerParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.PERIODIC_SERVER_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicServerKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(PeriodicServerKind newKind) {
		PeriodicServerKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.PERIODIC_SERVER_PARAMETERS__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBackgroundPriority() {
		return backgroundPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundPriority(int newBackgroundPriority) {
		int oldBackgroundPriority = backgroundPriority;
		backgroundPriority = newBackgroundPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.PERIODIC_SERVER_PARAMETERS__BACKGROUND_PRIORITY, oldBackgroundPriority, backgroundPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getInitialBudget() {
		return initialBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialBudget(Duration newInitialBudget) {
		Duration oldInitialBudget = initialBudget;
		initialBudget = newInitialBudget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET, oldInitialBudget, initialBudget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getReplenishPeriod() {
		return replenishPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplenishPeriod(Duration newReplenishPeriod) {
		Duration oldReplenishPeriod = replenishPeriod;
		replenishPeriod = newReplenishPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD, oldReplenishPeriod, replenishPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxPendingReplenish() {
		return maxPendingReplenish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPendingReplenish(int newMaxPendingReplenish) {
		int oldMaxPendingReplenish = maxPendingReplenish;
		maxPendingReplenish = newMaxPendingReplenish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH, oldMaxPendingReplenish, maxPendingReplenish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__KIND:
				return getKind();
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__BACKGROUND_PRIORITY:
				return getBackgroundPriority();
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET:
				return getInitialBudget();
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD:
				return getReplenishPeriod();
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH:
				return getMaxPendingReplenish();
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
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__KIND:
				setKind((PeriodicServerKind)newValue);
				return;
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__BACKGROUND_PRIORITY:
				setBackgroundPriority((Integer)newValue);
				return;
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET:
				setInitialBudget((Duration)newValue);
				return;
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD:
				setReplenishPeriod((Duration)newValue);
				return;
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH:
				setMaxPendingReplenish((Integer)newValue);
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
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__BACKGROUND_PRIORITY:
				setBackgroundPriority(BACKGROUND_PRIORITY_EDEFAULT);
				return;
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET:
				setInitialBudget(INITIAL_BUDGET_EDEFAULT);
				return;
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD:
				setReplenishPeriod(REPLENISH_PERIOD_EDEFAULT);
				return;
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH:
				setMaxPendingReplenish(MAX_PENDING_REPLENISH_EDEFAULT);
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
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__KIND:
				return kind != KIND_EDEFAULT;
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__BACKGROUND_PRIORITY:
				return backgroundPriority != BACKGROUND_PRIORITY_EDEFAULT;
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET:
				return INITIAL_BUDGET_EDEFAULT == null ? initialBudget != null : !INITIAL_BUDGET_EDEFAULT.equals(initialBudget);
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD:
				return REPLENISH_PERIOD_EDEFAULT == null ? replenishPeriod != null : !REPLENISH_PERIOD_EDEFAULT.equals(replenishPeriod);
			case GrmPackage.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH:
				return maxPendingReplenish != MAX_PENDING_REPLENISH_EDEFAULT;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", backgroundPriority: ");
		result.append(backgroundPriority);
		result.append(", initialBudget: ");
		result.append(initialBudget);
		result.append(", replenishPeriod: ");
		result.append(replenishPeriod);
		result.append(", maxPendingReplenish: ");
		result.append(maxPendingReplenish);
		result.append(')');
		return result.toString();
	}

} //PeriodicServerParametersImpl
