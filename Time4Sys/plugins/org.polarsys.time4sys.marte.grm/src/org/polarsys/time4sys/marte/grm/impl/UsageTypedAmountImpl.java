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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.UsageTypedAmount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Typed Amount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.UsageTypedAmountImpl#getExecTime <em>Exec Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.UsageTypedAmountImpl#getMsgSize <em>Msg Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.UsageTypedAmountImpl#getAllocatedmemory <em>Allocatedmemory</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.UsageTypedAmountImpl#getUsedMemory <em>Used Memory</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.UsageTypedAmountImpl#getPowerPeak <em>Power Peak</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.UsageTypedAmountImpl#getEnergy <em>Energy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsageTypedAmountImpl extends ResourceImpl implements UsageTypedAmount {
	/**
	 * The default value of the '{@link #getExecTime() <em>Exec Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecTime()
	 * @generated
	 * @ordered
	 */
	protected static final int EXEC_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExecTime() <em>Exec Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecTime()
	 * @generated
	 * @ordered
	 */
	protected int execTime = EXEC_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMsgSize() <em>Msg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MSG_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMsgSize() <em>Msg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgSize()
	 * @generated
	 * @ordered
	 */
	protected int msgSize = MSG_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllocatedmemory() <em>Allocatedmemory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedmemory()
	 * @generated
	 * @ordered
	 */
	protected static final int ALLOCATEDMEMORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAllocatedmemory() <em>Allocatedmemory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedmemory()
	 * @generated
	 * @ordered
	 */
	protected int allocatedmemory = ALLOCATEDMEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsedMemory() <em>Used Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int USED_MEMORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUsedMemory() <em>Used Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedMemory()
	 * @generated
	 * @ordered
	 */
	protected int usedMemory = USED_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerPeak() <em>Power Peak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerPeak()
	 * @generated
	 * @ordered
	 */
	protected static final int POWER_PEAK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPowerPeak() <em>Power Peak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerPeak()
	 * @generated
	 * @ordered
	 */
	protected int powerPeak = POWER_PEAK_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnergy() <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergy()
	 * @generated
	 * @ordered
	 */
	protected static final int ENERGY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnergy() <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergy()
	 * @generated
	 * @ordered
	 */
	protected int energy = ENERGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageTypedAmountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.USAGE_TYPED_AMOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExecTime() {
		return execTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecTime(int newExecTime) {
		int oldExecTime = execTime;
		execTime = newExecTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.USAGE_TYPED_AMOUNT__EXEC_TIME, oldExecTime, execTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMsgSize() {
		return msgSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsgSize(int newMsgSize) {
		int oldMsgSize = msgSize;
		msgSize = newMsgSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.USAGE_TYPED_AMOUNT__MSG_SIZE, oldMsgSize, msgSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAllocatedmemory() {
		return allocatedmemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocatedmemory(int newAllocatedmemory) {
		int oldAllocatedmemory = allocatedmemory;
		allocatedmemory = newAllocatedmemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.USAGE_TYPED_AMOUNT__ALLOCATEDMEMORY, oldAllocatedmemory, allocatedmemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUsedMemory() {
		return usedMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedMemory(int newUsedMemory) {
		int oldUsedMemory = usedMemory;
		usedMemory = newUsedMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.USAGE_TYPED_AMOUNT__USED_MEMORY, oldUsedMemory, usedMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPowerPeak() {
		return powerPeak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerPeak(int newPowerPeak) {
		int oldPowerPeak = powerPeak;
		powerPeak = newPowerPeak;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.USAGE_TYPED_AMOUNT__POWER_PEAK, oldPowerPeak, powerPeak));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnergy() {
		return energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergy(int newEnergy) {
		int oldEnergy = energy;
		energy = newEnergy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.USAGE_TYPED_AMOUNT__ENERGY, oldEnergy, energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrmPackage.USAGE_TYPED_AMOUNT__EXEC_TIME:
				return getExecTime();
			case GrmPackage.USAGE_TYPED_AMOUNT__MSG_SIZE:
				return getMsgSize();
			case GrmPackage.USAGE_TYPED_AMOUNT__ALLOCATEDMEMORY:
				return getAllocatedmemory();
			case GrmPackage.USAGE_TYPED_AMOUNT__USED_MEMORY:
				return getUsedMemory();
			case GrmPackage.USAGE_TYPED_AMOUNT__POWER_PEAK:
				return getPowerPeak();
			case GrmPackage.USAGE_TYPED_AMOUNT__ENERGY:
				return getEnergy();
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
			case GrmPackage.USAGE_TYPED_AMOUNT__EXEC_TIME:
				setExecTime((Integer)newValue);
				return;
			case GrmPackage.USAGE_TYPED_AMOUNT__MSG_SIZE:
				setMsgSize((Integer)newValue);
				return;
			case GrmPackage.USAGE_TYPED_AMOUNT__ALLOCATEDMEMORY:
				setAllocatedmemory((Integer)newValue);
				return;
			case GrmPackage.USAGE_TYPED_AMOUNT__USED_MEMORY:
				setUsedMemory((Integer)newValue);
				return;
			case GrmPackage.USAGE_TYPED_AMOUNT__POWER_PEAK:
				setPowerPeak((Integer)newValue);
				return;
			case GrmPackage.USAGE_TYPED_AMOUNT__ENERGY:
				setEnergy((Integer)newValue);
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
			case GrmPackage.USAGE_TYPED_AMOUNT__EXEC_TIME:
				setExecTime(EXEC_TIME_EDEFAULT);
				return;
			case GrmPackage.USAGE_TYPED_AMOUNT__MSG_SIZE:
				setMsgSize(MSG_SIZE_EDEFAULT);
				return;
			case GrmPackage.USAGE_TYPED_AMOUNT__ALLOCATEDMEMORY:
				setAllocatedmemory(ALLOCATEDMEMORY_EDEFAULT);
				return;
			case GrmPackage.USAGE_TYPED_AMOUNT__USED_MEMORY:
				setUsedMemory(USED_MEMORY_EDEFAULT);
				return;
			case GrmPackage.USAGE_TYPED_AMOUNT__POWER_PEAK:
				setPowerPeak(POWER_PEAK_EDEFAULT);
				return;
			case GrmPackage.USAGE_TYPED_AMOUNT__ENERGY:
				setEnergy(ENERGY_EDEFAULT);
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
			case GrmPackage.USAGE_TYPED_AMOUNT__EXEC_TIME:
				return execTime != EXEC_TIME_EDEFAULT;
			case GrmPackage.USAGE_TYPED_AMOUNT__MSG_SIZE:
				return msgSize != MSG_SIZE_EDEFAULT;
			case GrmPackage.USAGE_TYPED_AMOUNT__ALLOCATEDMEMORY:
				return allocatedmemory != ALLOCATEDMEMORY_EDEFAULT;
			case GrmPackage.USAGE_TYPED_AMOUNT__USED_MEMORY:
				return usedMemory != USED_MEMORY_EDEFAULT;
			case GrmPackage.USAGE_TYPED_AMOUNT__POWER_PEAK:
				return powerPeak != POWER_PEAK_EDEFAULT;
			case GrmPackage.USAGE_TYPED_AMOUNT__ENERGY:
				return energy != ENERGY_EDEFAULT;
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
		result.append(" (execTime: ");
		result.append(execTime);
		result.append(", msgSize: ");
		result.append(msgSize);
		result.append(", allocatedmemory: ");
		result.append(allocatedmemory);
		result.append(", usedMemory: ");
		result.append(usedMemory);
		result.append(", powerPeak: ");
		result.append(powerPeak);
		result.append(", energy: ");
		result.append(energy);
		result.append(')');
		return result.toString();
	}

} //UsageTypedAmountImpl
