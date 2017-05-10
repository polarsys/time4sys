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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.time4sys.marte.gqam.BurstPattern;
import org.polarsys.time4sys.marte.gqam.GqamPackage;

import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Burst Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.BurstPatternImpl#getMinInterarrival <em>Min Interarrival</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.BurstPatternImpl#getMaxInterarrival <em>Max Interarrival</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.BurstPatternImpl#getMinEventInterval <em>Min Event Interval</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.BurstPatternImpl#getMaxEventInterval <em>Max Event Interval</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.BurstPatternImpl#getBurstSize <em>Burst Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BurstPatternImpl extends ArrivalPatternImpl implements BurstPattern {
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
	 * The default value of the '{@link #getMinEventInterval() <em>Min Event Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinEventInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Duration MIN_EVENT_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinEventInterval() <em>Min Event Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinEventInterval()
	 * @generated
	 * @ordered
	 */
	protected Duration minEventInterval = MIN_EVENT_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxEventInterval() <em>Max Event Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEventInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Duration MAX_EVENT_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxEventInterval() <em>Max Event Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEventInterval()
	 * @generated
	 * @ordered
	 */
	protected Duration maxEventInterval = MAX_EVENT_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBurstSize() <em>Burst Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurstSize()
	 * @generated
	 * @ordered
	 */
	protected static final long BURST_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBurstSize() <em>Burst Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurstSize()
	 * @generated
	 * @ordered
	 */
	protected long burstSize = BURST_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BurstPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.BURST_PATTERN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.BURST_PATTERN__MIN_INTERARRIVAL, oldMinInterarrival, minInterarrival));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.BURST_PATTERN__MAX_INTERARRIVAL, oldMaxInterarrival, maxInterarrival));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getMinEventInterval() {
		return minEventInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinEventInterval(Duration newMinEventInterval) {
		Duration oldMinEventInterval = minEventInterval;
		minEventInterval = newMinEventInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.BURST_PATTERN__MIN_EVENT_INTERVAL, oldMinEventInterval, minEventInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getMaxEventInterval() {
		return maxEventInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEventInterval(Duration newMaxEventInterval) {
		Duration oldMaxEventInterval = maxEventInterval;
		maxEventInterval = newMaxEventInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.BURST_PATTERN__MAX_EVENT_INTERVAL, oldMaxEventInterval, maxEventInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getBurstSize() {
		return burstSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBurstSize(long newBurstSize) {
		long oldBurstSize = burstSize;
		burstSize = newBurstSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.BURST_PATTERN__BURST_SIZE, oldBurstSize, burstSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterPeriod(Duration value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerPeriod(Duration value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GqamPackage.BURST_PATTERN__MIN_INTERARRIVAL:
				return getMinInterarrival();
			case GqamPackage.BURST_PATTERN__MAX_INTERARRIVAL:
				return getMaxInterarrival();
			case GqamPackage.BURST_PATTERN__MIN_EVENT_INTERVAL:
				return getMinEventInterval();
			case GqamPackage.BURST_PATTERN__MAX_EVENT_INTERVAL:
				return getMaxEventInterval();
			case GqamPackage.BURST_PATTERN__BURST_SIZE:
				return getBurstSize();
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
			case GqamPackage.BURST_PATTERN__MIN_INTERARRIVAL:
				setMinInterarrival((Duration)newValue);
				return;
			case GqamPackage.BURST_PATTERN__MAX_INTERARRIVAL:
				setMaxInterarrival((Duration)newValue);
				return;
			case GqamPackage.BURST_PATTERN__MIN_EVENT_INTERVAL:
				setMinEventInterval((Duration)newValue);
				return;
			case GqamPackage.BURST_PATTERN__MAX_EVENT_INTERVAL:
				setMaxEventInterval((Duration)newValue);
				return;
			case GqamPackage.BURST_PATTERN__BURST_SIZE:
				setBurstSize((Long)newValue);
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
			case GqamPackage.BURST_PATTERN__MIN_INTERARRIVAL:
				setMinInterarrival(MIN_INTERARRIVAL_EDEFAULT);
				return;
			case GqamPackage.BURST_PATTERN__MAX_INTERARRIVAL:
				setMaxInterarrival(MAX_INTERARRIVAL_EDEFAULT);
				return;
			case GqamPackage.BURST_PATTERN__MIN_EVENT_INTERVAL:
				setMinEventInterval(MIN_EVENT_INTERVAL_EDEFAULT);
				return;
			case GqamPackage.BURST_PATTERN__MAX_EVENT_INTERVAL:
				setMaxEventInterval(MAX_EVENT_INTERVAL_EDEFAULT);
				return;
			case GqamPackage.BURST_PATTERN__BURST_SIZE:
				setBurstSize(BURST_SIZE_EDEFAULT);
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
			case GqamPackage.BURST_PATTERN__MIN_INTERARRIVAL:
				return MIN_INTERARRIVAL_EDEFAULT == null ? minInterarrival != null : !MIN_INTERARRIVAL_EDEFAULT.equals(minInterarrival);
			case GqamPackage.BURST_PATTERN__MAX_INTERARRIVAL:
				return MAX_INTERARRIVAL_EDEFAULT == null ? maxInterarrival != null : !MAX_INTERARRIVAL_EDEFAULT.equals(maxInterarrival);
			case GqamPackage.BURST_PATTERN__MIN_EVENT_INTERVAL:
				return MIN_EVENT_INTERVAL_EDEFAULT == null ? minEventInterval != null : !MIN_EVENT_INTERVAL_EDEFAULT.equals(minEventInterval);
			case GqamPackage.BURST_PATTERN__MAX_EVENT_INTERVAL:
				return MAX_EVENT_INTERVAL_EDEFAULT == null ? maxEventInterval != null : !MAX_EVENT_INTERVAL_EDEFAULT.equals(maxEventInterval);
			case GqamPackage.BURST_PATTERN__BURST_SIZE:
				return burstSize != BURST_SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GqamPackage.BURST_PATTERN___SET_OUTER_PERIOD__DURATION:
				setOuterPeriod((Duration)arguments.get(0));
				return null;
			case GqamPackage.BURST_PATTERN___SET_INNER_PERIOD__DURATION:
				setInnerPeriod((Duration)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", minEventInterval: ");
		result.append(minEventInterval);
		result.append(", maxEventInterval: ");
		result.append(maxEventInterval);
		result.append(", burstSize: ");
		result.append(burstSize);
		result.append(')');
		return result.toString();
	}

} //BurstPatternImpl
