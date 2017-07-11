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
import org.polarsys.time4sys.marte.hrm.HardwareBus;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareBusImpl#getAddressWidth <em>Address Width</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareBusImpl#getWordWidth <em>Word Width</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareBusImpl#isIsSynchronous <em>Is Synchronous</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareBusImpl#isIsSerial <em>Is Serial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareBusImpl extends HardwareMediaImpl implements HardwareBus {
	/**
	 * The default value of the '{@link #getAddressWidth() <em>Address Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int ADDRESS_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAddressWidth() <em>Address Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressWidth()
	 * @generated
	 * @ordered
	 */
	protected int addressWidth = ADDRESS_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWordWidth() <em>Word Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WORD_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWordWidth() <em>Word Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordWidth()
	 * @generated
	 * @ordered
	 */
	protected int wordWidth = WORD_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSynchronous() <em>Is Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSynchronous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SYNCHRONOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSynchronous() <em>Is Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSynchronous()
	 * @generated
	 * @ordered
	 */
	protected boolean isSynchronous = IS_SYNCHRONOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSerial() <em>Is Serial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSerial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SERIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSerial() <em>Is Serial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSerial()
	 * @generated
	 * @ordered
	 */
	protected boolean isSerial = IS_SERIAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareBusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HrmPackage.Literals.HARDWARE_BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAddressWidth() {
		return addressWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressWidth(int newAddressWidth) {
		int oldAddressWidth = addressWidth;
		addressWidth = newAddressWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_BUS__ADDRESS_WIDTH, oldAddressWidth, addressWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWordWidth() {
		return wordWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordWidth(int newWordWidth) {
		int oldWordWidth = wordWidth;
		wordWidth = newWordWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_BUS__WORD_WIDTH, oldWordWidth, wordWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSynchronous() {
		return isSynchronous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSynchronous(boolean newIsSynchronous) {
		boolean oldIsSynchronous = isSynchronous;
		isSynchronous = newIsSynchronous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_BUS__IS_SYNCHRONOUS, oldIsSynchronous, isSynchronous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSerial() {
		return isSerial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSerial(boolean newIsSerial) {
		boolean oldIsSerial = isSerial;
		isSerial = newIsSerial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_BUS__IS_SERIAL, oldIsSerial, isSerial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HrmPackage.HARDWARE_BUS__ADDRESS_WIDTH:
				return getAddressWidth();
			case HrmPackage.HARDWARE_BUS__WORD_WIDTH:
				return getWordWidth();
			case HrmPackage.HARDWARE_BUS__IS_SYNCHRONOUS:
				return isIsSynchronous();
			case HrmPackage.HARDWARE_BUS__IS_SERIAL:
				return isIsSerial();
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
			case HrmPackage.HARDWARE_BUS__ADDRESS_WIDTH:
				setAddressWidth((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_BUS__WORD_WIDTH:
				setWordWidth((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_BUS__IS_SYNCHRONOUS:
				setIsSynchronous((Boolean)newValue);
				return;
			case HrmPackage.HARDWARE_BUS__IS_SERIAL:
				setIsSerial((Boolean)newValue);
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
			case HrmPackage.HARDWARE_BUS__ADDRESS_WIDTH:
				setAddressWidth(ADDRESS_WIDTH_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_BUS__WORD_WIDTH:
				setWordWidth(WORD_WIDTH_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_BUS__IS_SYNCHRONOUS:
				setIsSynchronous(IS_SYNCHRONOUS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_BUS__IS_SERIAL:
				setIsSerial(IS_SERIAL_EDEFAULT);
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
			case HrmPackage.HARDWARE_BUS__ADDRESS_WIDTH:
				return addressWidth != ADDRESS_WIDTH_EDEFAULT;
			case HrmPackage.HARDWARE_BUS__WORD_WIDTH:
				return wordWidth != WORD_WIDTH_EDEFAULT;
			case HrmPackage.HARDWARE_BUS__IS_SYNCHRONOUS:
				return isSynchronous != IS_SYNCHRONOUS_EDEFAULT;
			case HrmPackage.HARDWARE_BUS__IS_SERIAL:
				return isSerial != IS_SERIAL_EDEFAULT;
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
		result.append(" (addressWidth: ");
		result.append(addressWidth);
		result.append(", wordWidth: ");
		result.append(wordWidth);
		result.append(", isSynchronous: ");
		result.append(isSynchronous);
		result.append(", isSerial: ");
		result.append(isSerial);
		result.append(')');
		return result.toString();
	}

} //HardwareBusImpl
