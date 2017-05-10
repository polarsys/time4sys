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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.TwcaEventModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Twca Event Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.TwcaEventModelImpl#getDeltamin_func <em>Deltamin func</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TwcaEventModelImpl extends EventModelImpl implements TwcaEventModel {
	/**
	 * The default value of the '{@link #getDeltamin_func() <em>Deltamin func</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltamin_func()
	 * @generated
	 * @ordered
	 */
	protected static final String DELTAMIN_FUNC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltamin_func() <em>Deltamin func</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltamin_func()
	 * @generated
	 * @ordered
	 */
	protected String deltamin_func = DELTAMIN_FUNC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwcaEventModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.TWCA_EVENT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeltamin_func() {
		return deltamin_func;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltamin_func(String newDeltamin_func) {
		String oldDeltamin_func = deltamin_func;
		deltamin_func = newDeltamin_func;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.TWCA_EVENT_MODEL__DELTAMIN_FUNC, oldDeltamin_func, deltamin_func));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisPackage.TWCA_EVENT_MODEL__DELTAMIN_FUNC:
				return getDeltamin_func();
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
			case AnalysisPackage.TWCA_EVENT_MODEL__DELTAMIN_FUNC:
				setDeltamin_func((String)newValue);
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
			case AnalysisPackage.TWCA_EVENT_MODEL__DELTAMIN_FUNC:
				setDeltamin_func(DELTAMIN_FUNC_EDEFAULT);
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
			case AnalysisPackage.TWCA_EVENT_MODEL__DELTAMIN_FUNC:
				return DELTAMIN_FUNC_EDEFAULT == null ? deltamin_func != null : !DELTAMIN_FUNC_EDEFAULT.equals(deltamin_func);
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
		result.append(" (deltamin_func: ");
		result.append(deltamin_func);
		result.append(')');
		return result.toString();
	}

} //TwcaEventModelImpl
