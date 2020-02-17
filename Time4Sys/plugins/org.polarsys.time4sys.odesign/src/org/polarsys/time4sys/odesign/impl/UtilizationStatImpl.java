/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *      Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.odesign.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.polarsys.time4sys.odesign.OdesignPackage;
import org.polarsys.time4sys.odesign.UtilizationStat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Utilization Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.odesign.impl.UtilizationStatImpl#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link org.polarsys.time4sys.odesign.impl.UtilizationStatImpl#isNotSchedulable <em>Not Schedulable</em>}</li>
 *   <li>{@link org.polarsys.time4sys.odesign.impl.UtilizationStatImpl#isMaybeSchedulable <em>Maybe Schedulable</em>}</li>
 *   <li>{@link org.polarsys.time4sys.odesign.impl.UtilizationStatImpl#isIsSchedulable <em>Is Schedulable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilizationStatImpl extends MinimalEObjectImpl.Container implements UtilizationStat {
	/**
	 * The default value of the '{@link #getUtilization() <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final double UTILIZATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUtilization() <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected double utilization = UTILIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isNotSchedulable() <em>Not Schedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotSchedulable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_SCHEDULABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotSchedulable() <em>Not Schedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotSchedulable()
	 * @generated
	 * @ordered
	 */
	protected boolean notSchedulable = NOT_SCHEDULABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaybeSchedulable() <em>Maybe Schedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaybeSchedulable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAYBE_SCHEDULABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaybeSchedulable() <em>Maybe Schedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaybeSchedulable()
	 * @generated
	 * @ordered
	 */
	protected boolean maybeSchedulable = MAYBE_SCHEDULABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSchedulable() <em>Is Schedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSchedulable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SCHEDULABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSchedulable() <em>Is Schedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSchedulable()
	 * @generated
	 * @ordered
	 */
	protected boolean isSchedulable = IS_SCHEDULABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilizationStatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OdesignPackage.Literals.UTILIZATION_STAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUtilization() {
		return utilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilization(double newUtilization) {
		double oldUtilization = utilization;
		utilization = newUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OdesignPackage.UTILIZATION_STAT__UTILIZATION, oldUtilization, utilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotSchedulable() {
		return notSchedulable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotSchedulable(boolean newNotSchedulable) {
		boolean oldNotSchedulable = notSchedulable;
		notSchedulable = newNotSchedulable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OdesignPackage.UTILIZATION_STAT__NOT_SCHEDULABLE, oldNotSchedulable, notSchedulable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaybeSchedulable() {
		return maybeSchedulable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaybeSchedulable(boolean newMaybeSchedulable) {
		boolean oldMaybeSchedulable = maybeSchedulable;
		maybeSchedulable = newMaybeSchedulable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OdesignPackage.UTILIZATION_STAT__MAYBE_SCHEDULABLE, oldMaybeSchedulable, maybeSchedulable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSchedulable() {
		return isSchedulable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSchedulable(boolean newIsSchedulable) {
		boolean oldIsSchedulable = isSchedulable;
		isSchedulable = newIsSchedulable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OdesignPackage.UTILIZATION_STAT__IS_SCHEDULABLE, oldIsSchedulable, isSchedulable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OdesignPackage.UTILIZATION_STAT__UTILIZATION:
				return getUtilization();
			case OdesignPackage.UTILIZATION_STAT__NOT_SCHEDULABLE:
				return isNotSchedulable();
			case OdesignPackage.UTILIZATION_STAT__MAYBE_SCHEDULABLE:
				return isMaybeSchedulable();
			case OdesignPackage.UTILIZATION_STAT__IS_SCHEDULABLE:
				return isIsSchedulable();
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
			case OdesignPackage.UTILIZATION_STAT__UTILIZATION:
				setUtilization((Double)newValue);
				return;
			case OdesignPackage.UTILIZATION_STAT__NOT_SCHEDULABLE:
				setNotSchedulable((Boolean)newValue);
				return;
			case OdesignPackage.UTILIZATION_STAT__MAYBE_SCHEDULABLE:
				setMaybeSchedulable((Boolean)newValue);
				return;
			case OdesignPackage.UTILIZATION_STAT__IS_SCHEDULABLE:
				setIsSchedulable((Boolean)newValue);
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
			case OdesignPackage.UTILIZATION_STAT__UTILIZATION:
				setUtilization(UTILIZATION_EDEFAULT);
				return;
			case OdesignPackage.UTILIZATION_STAT__NOT_SCHEDULABLE:
				setNotSchedulable(NOT_SCHEDULABLE_EDEFAULT);
				return;
			case OdesignPackage.UTILIZATION_STAT__MAYBE_SCHEDULABLE:
				setMaybeSchedulable(MAYBE_SCHEDULABLE_EDEFAULT);
				return;
			case OdesignPackage.UTILIZATION_STAT__IS_SCHEDULABLE:
				setIsSchedulable(IS_SCHEDULABLE_EDEFAULT);
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
			case OdesignPackage.UTILIZATION_STAT__UTILIZATION:
				return utilization != UTILIZATION_EDEFAULT;
			case OdesignPackage.UTILIZATION_STAT__NOT_SCHEDULABLE:
				return notSchedulable != NOT_SCHEDULABLE_EDEFAULT;
			case OdesignPackage.UTILIZATION_STAT__MAYBE_SCHEDULABLE:
				return maybeSchedulable != MAYBE_SCHEDULABLE_EDEFAULT;
			case OdesignPackage.UTILIZATION_STAT__IS_SCHEDULABLE:
				return isSchedulable != IS_SCHEDULABLE_EDEFAULT;
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
		result.append(" (utilization: ");
		result.append(utilization);
		result.append(", notSchedulable: ");
		result.append(notSchedulable);
		result.append(", maybeSchedulable: ");
		result.append(maybeSchedulable);
		result.append(", isSchedulable: ");
		result.append(isSchedulable);
		result.append(')');
		return result.toString();
	}

} //UtilizationStatImpl
