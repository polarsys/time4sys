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
import org.polarsys.time4sys.marte.grm.ProtectionParameter;
import org.polarsys.time4sys.marte.nfp.coreelements.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protection Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ProtectionParameterImpl#getPriorityCeiling <em>Priority Ceiling</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ProtectionParameterImpl#getPreemptionLevel <em>Preemption Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtectionParameterImpl extends NamedElementImpl implements ProtectionParameter {
	/**
	 * The default value of the '{@link #getPriorityCeiling() <em>Priority Ceiling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityCeiling()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_CEILING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriorityCeiling() <em>Priority Ceiling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityCeiling()
	 * @generated
	 * @ordered
	 */
	protected int priorityCeiling = PRIORITY_CEILING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreemptionLevel() <em>Preemption Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreemptionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int PREEMPTION_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPreemptionLevel() <em>Preemption Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreemptionLevel()
	 * @generated
	 * @ordered
	 */
	protected int preemptionLevel = PREEMPTION_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectionParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.PROTECTION_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriorityCeiling() {
		return priorityCeiling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorityCeiling(int newPriorityCeiling) {
		int oldPriorityCeiling = priorityCeiling;
		priorityCeiling = newPriorityCeiling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.PROTECTION_PARAMETER__PRIORITY_CEILING, oldPriorityCeiling, priorityCeiling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPreemptionLevel() {
		return preemptionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreemptionLevel(int newPreemptionLevel) {
		int oldPreemptionLevel = preemptionLevel;
		preemptionLevel = newPreemptionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.PROTECTION_PARAMETER__PREEMPTION_LEVEL, oldPreemptionLevel, preemptionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrmPackage.PROTECTION_PARAMETER__PRIORITY_CEILING:
				return getPriorityCeiling();
			case GrmPackage.PROTECTION_PARAMETER__PREEMPTION_LEVEL:
				return getPreemptionLevel();
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
			case GrmPackage.PROTECTION_PARAMETER__PRIORITY_CEILING:
				setPriorityCeiling((Integer)newValue);
				return;
			case GrmPackage.PROTECTION_PARAMETER__PREEMPTION_LEVEL:
				setPreemptionLevel((Integer)newValue);
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
			case GrmPackage.PROTECTION_PARAMETER__PRIORITY_CEILING:
				setPriorityCeiling(PRIORITY_CEILING_EDEFAULT);
				return;
			case GrmPackage.PROTECTION_PARAMETER__PREEMPTION_LEVEL:
				setPreemptionLevel(PREEMPTION_LEVEL_EDEFAULT);
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
			case GrmPackage.PROTECTION_PARAMETER__PRIORITY_CEILING:
				return priorityCeiling != PRIORITY_CEILING_EDEFAULT;
			case GrmPackage.PROTECTION_PARAMETER__PREEMPTION_LEVEL:
				return preemptionLevel != PREEMPTION_LEVEL_EDEFAULT;
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
		result.append(" (priorityCeiling: ");
		result.append(priorityCeiling);
		result.append(", preemptionLevel: ");
		result.append(preemptionLevel);
		result.append(')');
		return result.toString();
	}

} //ProtectionParameterImpl
