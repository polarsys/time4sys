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
package org.polarsys.time4sys.marte.hrm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.polarsys.time4sys.marte.hrm.HardwarePin;
import org.polarsys.time4sys.marte.hrm.HardwareWire;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Wire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareWireImpl#getSourcePin <em>Source Pin</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareWireImpl#getTargetPin <em>Target Pin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareWireImpl extends MinimalEObjectImpl.Container implements HardwareWire {
	/**
	 * The cached value of the '{@link #getSourcePin() <em>Source Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePin()
	 * @generated
	 * @ordered
	 */
	protected HardwarePin sourcePin;

	/**
	 * The cached value of the '{@link #getTargetPin() <em>Target Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPin()
	 * @generated
	 * @ordered
	 */
	protected HardwarePin targetPin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareWireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HrmPackage.Literals.HARDWARE_WIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePin getSourcePin() {
		if (sourcePin != null && sourcePin.eIsProxy()) {
			InternalEObject oldSourcePin = (InternalEObject)sourcePin;
			sourcePin = (HardwarePin)eResolveProxy(oldSourcePin);
			if (sourcePin != oldSourcePin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HrmPackage.HARDWARE_WIRE__SOURCE_PIN, oldSourcePin, sourcePin));
			}
		}
		return sourcePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePin basicGetSourcePin() {
		return sourcePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePin(HardwarePin newSourcePin) {
		HardwarePin oldSourcePin = sourcePin;
		sourcePin = newSourcePin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_WIRE__SOURCE_PIN, oldSourcePin, sourcePin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePin getTargetPin() {
		if (targetPin != null && targetPin.eIsProxy()) {
			InternalEObject oldTargetPin = (InternalEObject)targetPin;
			targetPin = (HardwarePin)eResolveProxy(oldTargetPin);
			if (targetPin != oldTargetPin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HrmPackage.HARDWARE_WIRE__TARGET_PIN, oldTargetPin, targetPin));
			}
		}
		return targetPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePin basicGetTargetPin() {
		return targetPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPin(HardwarePin newTargetPin) {
		HardwarePin oldTargetPin = targetPin;
		targetPin = newTargetPin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_WIRE__TARGET_PIN, oldTargetPin, targetPin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HrmPackage.HARDWARE_WIRE__SOURCE_PIN:
				if (resolve) return getSourcePin();
				return basicGetSourcePin();
			case HrmPackage.HARDWARE_WIRE__TARGET_PIN:
				if (resolve) return getTargetPin();
				return basicGetTargetPin();
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
			case HrmPackage.HARDWARE_WIRE__SOURCE_PIN:
				setSourcePin((HardwarePin)newValue);
				return;
			case HrmPackage.HARDWARE_WIRE__TARGET_PIN:
				setTargetPin((HardwarePin)newValue);
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
			case HrmPackage.HARDWARE_WIRE__SOURCE_PIN:
				setSourcePin((HardwarePin)null);
				return;
			case HrmPackage.HARDWARE_WIRE__TARGET_PIN:
				setTargetPin((HardwarePin)null);
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
			case HrmPackage.HARDWARE_WIRE__SOURCE_PIN:
				return sourcePin != null;
			case HrmPackage.HARDWARE_WIRE__TARGET_PIN:
				return targetPin != null;
		}
		return super.eIsSet(featureID);
	}

} //HardwareWireImpl
