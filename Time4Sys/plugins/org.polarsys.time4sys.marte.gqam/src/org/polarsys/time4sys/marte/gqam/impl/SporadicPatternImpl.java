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
package org.polarsys.time4sys.marte.gqam.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.SporadicPattern;

import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sporadic Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.SporadicPatternImpl#getMinInterarrival <em>Min Interarrival</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.SporadicPatternImpl#getMaxInterarrival <em>Max Interarrival</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SporadicPatternImpl extends ArrivalPatternImpl implements SporadicPattern {
	/**
	 * The default value of the '{@link #getMinInterarrival() <em>Min Interarrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInterarrival()
	 * @generated
	 * @ordered
	 */
	protected static final Duration MIN_INTERARRIVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinInterarrival() <em>Min Interarrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInterarrival()
	 * @generated
	 * @ordered
	 */
	protected Duration minInterarrival = MIN_INTERARRIVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxInterarrival() <em>Max Interarrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterarrival()
	 * @generated
	 * @ordered
	 */
	protected static final Duration MAX_INTERARRIVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxInterarrival() <em>Max Interarrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterarrival()
	 * @generated
	 * @ordered
	 */
	protected Duration maxInterarrival = MAX_INTERARRIVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SporadicPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.SPORADIC_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getMinInterarrival() {
		return minInterarrival;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInterarrival(Duration newMinInterarrival) {
		Duration oldMinInterarrival = minInterarrival;
		minInterarrival = newMinInterarrival;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.SPORADIC_PATTERN__MIN_INTERARRIVAL, oldMinInterarrival, minInterarrival));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getMaxInterarrival() {
		return maxInterarrival;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInterarrival(Duration newMaxInterarrival) {
		Duration oldMaxInterarrival = maxInterarrival;
		maxInterarrival = newMaxInterarrival;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.SPORADIC_PATTERN__MAX_INTERARRIVAL, oldMaxInterarrival, maxInterarrival));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GqamPackage.SPORADIC_PATTERN__MIN_INTERARRIVAL:
				return getMinInterarrival();
			case GqamPackage.SPORADIC_PATTERN__MAX_INTERARRIVAL:
				return getMaxInterarrival();
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
			case GqamPackage.SPORADIC_PATTERN__MIN_INTERARRIVAL:
				setMinInterarrival((Duration)newValue);
				return;
			case GqamPackage.SPORADIC_PATTERN__MAX_INTERARRIVAL:
				setMaxInterarrival((Duration)newValue);
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
			case GqamPackage.SPORADIC_PATTERN__MIN_INTERARRIVAL:
				setMinInterarrival(MIN_INTERARRIVAL_EDEFAULT);
				return;
			case GqamPackage.SPORADIC_PATTERN__MAX_INTERARRIVAL:
				setMaxInterarrival(MAX_INTERARRIVAL_EDEFAULT);
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
			case GqamPackage.SPORADIC_PATTERN__MIN_INTERARRIVAL:
				return MIN_INTERARRIVAL_EDEFAULT == null ? minInterarrival != null : !MIN_INTERARRIVAL_EDEFAULT.equals(minInterarrival);
			case GqamPackage.SPORADIC_PATTERN__MAX_INTERARRIVAL:
				return MAX_INTERARRIVAL_EDEFAULT == null ? maxInterarrival != null : !MAX_INTERARRIVAL_EDEFAULT.equals(maxInterarrival);
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
		result.append(" (minInterarrival: ");
		result.append(minInterarrival);
		result.append(", maxInterarrival: ");
		result.append(maxInterarrival);
		result.append(')');
		return result.toString();
	}

} //SporadicPatternImpl
