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
package org.polarsys.time4sys.marte.hrm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.time4sys.marte.hrm.HardwareClock;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Clock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareClockImpl#getFrequency <em>Frequency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareClockImpl extends HardwareTimingResourceImpl implements HardwareClock {
	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected int frequency = FREQUENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareClockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HrmPackage.Literals.HARDWARE_CLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(int newFrequency) {
		int oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_CLOCK__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HrmPackage.HARDWARE_CLOCK__FREQUENCY:
				return getFrequency();
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
			case HrmPackage.HARDWARE_CLOCK__FREQUENCY:
				setFrequency((Integer)newValue);
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
			case HrmPackage.HARDWARE_CLOCK__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
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
			case HrmPackage.HARDWARE_CLOCK__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
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
		result.append(" (frequency: ");
		result.append(frequency);
		result.append(')');
		return result.toString();
	}

} //HardwareClockImpl
