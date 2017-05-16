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
package org.polarsys.time4sys.marte.grm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.MutualExclusionProtocol;
import org.polarsys.time4sys.marte.grm.ProtectProtocolKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mutual Exclusion Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.MutualExclusionProtocolImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.MutualExclusionProtocolImpl#getOtherProtocol <em>Other Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MutualExclusionProtocolImpl extends AccessControlPolicyImpl implements MutualExclusionProtocol {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final ProtectProtocolKind PROTOCOL_EDEFAULT = ProtectProtocolKind.FIFO;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ProtectProtocolKind protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherProtocol() <em>Other Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherProtocol() <em>Other Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtocol()
	 * @generated
	 * @ordered
	 */
	protected String otherProtocol = OTHER_PROTOCOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MutualExclusionProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.MUTUAL_EXCLUSION_PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectProtocolKind getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtectProtocolKind newProtocol) {
		ProtectProtocolKind oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.MUTUAL_EXCLUSION_PROTOCOL__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherProtocol() {
		return otherProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherProtocol(String newOtherProtocol) {
		String oldOtherProtocol = otherProtocol;
		otherProtocol = newOtherProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.MUTUAL_EXCLUSION_PROTOCOL__OTHER_PROTOCOL, oldOtherProtocol, otherProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrmPackage.MUTUAL_EXCLUSION_PROTOCOL__PROTOCOL:
				return getProtocol();
			case GrmPackage.MUTUAL_EXCLUSION_PROTOCOL__OTHER_PROTOCOL:
				return getOtherProtocol();
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
			case GrmPackage.MUTUAL_EXCLUSION_PROTOCOL__PROTOCOL:
				setProtocol((ProtectProtocolKind)newValue);
				return;
			case GrmPackage.MUTUAL_EXCLUSION_PROTOCOL__OTHER_PROTOCOL:
				setOtherProtocol((String)newValue);
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
			case GrmPackage.MUTUAL_EXCLUSION_PROTOCOL__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case GrmPackage.MUTUAL_EXCLUSION_PROTOCOL__OTHER_PROTOCOL:
				setOtherProtocol(OTHER_PROTOCOL_EDEFAULT);
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
			case GrmPackage.MUTUAL_EXCLUSION_PROTOCOL__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
			case GrmPackage.MUTUAL_EXCLUSION_PROTOCOL__OTHER_PROTOCOL:
				return OTHER_PROTOCOL_EDEFAULT == null ? otherProtocol != null : !OTHER_PROTOCOL_EDEFAULT.equals(otherProtocol);
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
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(", otherProtocol: ");
		result.append(otherProtocol);
		result.append(')');
		return result.toString();
	}

} //MutualExclusionProtocolImpl
