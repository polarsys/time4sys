/*******************************************************************************
 * Copyright (c) 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.sam.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.time4sys.marte.gqam.impl.TimedObserverImpl;

import org.polarsys.time4sys.marte.nfp.Duration;

import org.polarsys.time4sys.marte.sam.SamPackage;
import org.polarsys.time4sys.marte.sam.SchedulingObserver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling Observer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.sam.impl.SchedulingObserverImpl#getSuspensions <em>Suspensions</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.sam.impl.SchedulingObserverImpl#getBlockingTime <em>Blocking Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.sam.impl.SchedulingObserverImpl#getOverlaps <em>Overlaps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulingObserverImpl extends TimedObserverImpl implements SchedulingObserver {
	/**
	 * The default value of the '{@link #getSuspensions() <em>Suspensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspensions()
	 * @generated
	 * @ordered
	 */
	protected static final Duration SUSPENSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuspensions() <em>Suspensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspensions()
	 * @generated
	 * @ordered
	 */
	protected Duration suspensions = SUSPENSIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockingTime() <em>Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected static final Duration BLOCKING_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockingTime() <em>Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected Duration blockingTime = BLOCKING_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverlaps() <em>Overlaps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlaps()
	 * @generated
	 * @ordered
	 */
	protected static final Duration OVERLAPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverlaps() <em>Overlaps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlaps()
	 * @generated
	 * @ordered
	 */
	protected Duration overlaps = OVERLAPS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingObserverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SamPackage.Literals.SCHEDULING_OBSERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getSuspensions() {
		return suspensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuspensions(Duration newSuspensions) {
		Duration oldSuspensions = suspensions;
		suspensions = newSuspensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SamPackage.SCHEDULING_OBSERVER__SUSPENSIONS, oldSuspensions, suspensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getBlockingTime() {
		return blockingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockingTime(Duration newBlockingTime) {
		Duration oldBlockingTime = blockingTime;
		blockingTime = newBlockingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SamPackage.SCHEDULING_OBSERVER__BLOCKING_TIME, oldBlockingTime, blockingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getOverlaps() {
		return overlaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverlaps(Duration newOverlaps) {
		Duration oldOverlaps = overlaps;
		overlaps = newOverlaps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SamPackage.SCHEDULING_OBSERVER__OVERLAPS, oldOverlaps, overlaps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SamPackage.SCHEDULING_OBSERVER__SUSPENSIONS:
				return getSuspensions();
			case SamPackage.SCHEDULING_OBSERVER__BLOCKING_TIME:
				return getBlockingTime();
			case SamPackage.SCHEDULING_OBSERVER__OVERLAPS:
				return getOverlaps();
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
			case SamPackage.SCHEDULING_OBSERVER__SUSPENSIONS:
				setSuspensions((Duration)newValue);
				return;
			case SamPackage.SCHEDULING_OBSERVER__BLOCKING_TIME:
				setBlockingTime((Duration)newValue);
				return;
			case SamPackage.SCHEDULING_OBSERVER__OVERLAPS:
				setOverlaps((Duration)newValue);
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
			case SamPackage.SCHEDULING_OBSERVER__SUSPENSIONS:
				setSuspensions(SUSPENSIONS_EDEFAULT);
				return;
			case SamPackage.SCHEDULING_OBSERVER__BLOCKING_TIME:
				setBlockingTime(BLOCKING_TIME_EDEFAULT);
				return;
			case SamPackage.SCHEDULING_OBSERVER__OVERLAPS:
				setOverlaps(OVERLAPS_EDEFAULT);
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
			case SamPackage.SCHEDULING_OBSERVER__SUSPENSIONS:
				return SUSPENSIONS_EDEFAULT == null ? suspensions != null : !SUSPENSIONS_EDEFAULT.equals(suspensions);
			case SamPackage.SCHEDULING_OBSERVER__BLOCKING_TIME:
				return BLOCKING_TIME_EDEFAULT == null ? blockingTime != null : !BLOCKING_TIME_EDEFAULT.equals(blockingTime);
			case SamPackage.SCHEDULING_OBSERVER__OVERLAPS:
				return OVERLAPS_EDEFAULT == null ? overlaps != null : !OVERLAPS_EDEFAULT.equals(overlaps);
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
		result.append(" (suspensions: ");
		result.append(suspensions);
		result.append(", blockingTime: ");
		result.append(blockingTime);
		result.append(", overlaps: ");
		result.append(overlaps);
		result.append(')');
		return result.toString();
	}

} //SchedulingObserverImpl
