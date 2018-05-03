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
package org.polarsys.time4sys.marte.srm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.time4sys.marte.srm.Alarm;
import org.polarsys.time4sys.marte.srm.SoftwareTimerResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.AlarmImpl#getTimers <em>Timers</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.AlarmImpl#isIsWatchdog <em>Is Watchdog</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlarmImpl extends InterruptResourceImpl implements Alarm {
	/**
	 * The cached value of the '{@link #getTimers() <em>Timers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimers()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareTimerResource> timers;

	/**
	 * The default value of the '{@link #isIsWatchdog() <em>Is Watchdog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWatchdog()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WATCHDOG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsWatchdog() <em>Is Watchdog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWatchdog()
	 * @generated
	 * @ordered
	 */
	protected boolean isWatchdog = IS_WATCHDOG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.ALARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareTimerResource> getTimers() {
		if (timers == null) {
			timers = new EObjectResolvingEList<SoftwareTimerResource>(SoftwareTimerResource.class, this, SrmPackage.ALARM__TIMERS);
		}
		return timers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsWatchdog() {
		return isWatchdog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWatchdog(boolean newIsWatchdog) {
		boolean oldIsWatchdog = isWatchdog;
		isWatchdog = newIsWatchdog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.ALARM__IS_WATCHDOG, oldIsWatchdog, isWatchdog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SrmPackage.ALARM__TIMERS:
				return getTimers();
			case SrmPackage.ALARM__IS_WATCHDOG:
				return isIsWatchdog();
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
			case SrmPackage.ALARM__TIMERS:
				getTimers().clear();
				getTimers().addAll((Collection<? extends SoftwareTimerResource>)newValue);
				return;
			case SrmPackage.ALARM__IS_WATCHDOG:
				setIsWatchdog((Boolean)newValue);
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
			case SrmPackage.ALARM__TIMERS:
				getTimers().clear();
				return;
			case SrmPackage.ALARM__IS_WATCHDOG:
				setIsWatchdog(IS_WATCHDOG_EDEFAULT);
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
			case SrmPackage.ALARM__TIMERS:
				return timers != null && !timers.isEmpty();
			case SrmPackage.ALARM__IS_WATCHDOG:
				return isWatchdog != IS_WATCHDOG_EDEFAULT;
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
		result.append(" (isWatchdog: ");
		result.append(isWatchdog);
		result.append(')');
		return result.toString();
	}

} //AlarmImpl
