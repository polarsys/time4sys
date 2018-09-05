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
package org.polarsys.time4sys.marte.nfp.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;
import org.polarsys.time4sys.marte.nfp.UniformDistribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.TimeIntervalImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.TimeIntervalImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.TimeIntervalImpl#isMinOpen <em>Min Open</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.TimeIntervalImpl#isMaxOpen <em>Max Open</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeIntervalImpl extends MinimalEObjectImpl.Container implements TimeInterval {
	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected Duration min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected Duration max;

	/**
	 * The default value of the '{@link #isMinOpen() <em>Min Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MIN_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMinOpen() <em>Min Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean minOpen = MIN_OPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaxOpen() <em>Max Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAX_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaxOpen() <em>Max Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean maxOpen = MAX_OPEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected TimeIntervalImpl() {
		this(false, LongDurationImpl.ZERO, LongDurationImpl.ZERO, false);
	}
	
	/**
	 * @generated NOT
	 */
	protected TimeIntervalImpl(
			final boolean isLeftOpen,
			final Duration leftValue,
			final Duration rightValue,
			final boolean isRightOpen) {
		super();
		this.min = leftValue;
		this.max = rightValue;
		this.minOpen = isLeftOpen;
		this.maxOpen = isRightOpen;
	}

	public TimeIntervalImpl(final TimeInterval value) {
		this(value.isMinOpen(), value.getMin(), value.getMax(), value.isMaxOpen());
	}

	public TimeIntervalImpl(final Duration value) {
		setMax(value);
		setMin(value);
		setMaxOpen(false);
		setMinOpen(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NfpPackage.Literals.TIME_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getMin() {
		if (min != null && min.eIsProxy()) {
			InternalEObject oldMin = (InternalEObject)min;
			min = (Duration)eResolveProxy(oldMin);
			if (min != oldMin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NfpPackage.TIME_INTERVAL__MIN, oldMin, min));
			}
		}
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration basicGetMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(Duration newMin) {
		Duration oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.TIME_INTERVAL__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getMax() {
		if (max != null && max.eIsProxy()) {
			InternalEObject oldMax = (InternalEObject)max;
			max = (Duration)eResolveProxy(oldMax);
			if (max != oldMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NfpPackage.TIME_INTERVAL__MAX, oldMax, max));
			}
		}
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration basicGetMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(Duration newMax) {
		Duration oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.TIME_INTERVAL__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMinOpen() {
		return minOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinOpen(boolean newMinOpen) {
		boolean oldMinOpen = minOpen;
		minOpen = newMinOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.TIME_INTERVAL__MIN_OPEN, oldMinOpen, minOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaxOpen() {
		return maxOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOpen(boolean newMaxOpen) {
		boolean oldMaxOpen = maxOpen;
		maxOpen = newMaxOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.TIME_INTERVAL__MAX_OPEN, oldMaxOpen, maxOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Duration computeLength() {
		return max.sub(min);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean contains(final Duration value) {
		final int maxCmp = getMax().compareTo(value);
		final int minCmp = getMin().compareTo(value);
		if (minCmp < 0 && maxCmp > 0) {
			return true;
		}
		if (minCmp > 0) {
			return false;
		}
		if (maxCmp < 0) {
			return false;
		}
		return (minCmp == 0 && !isMinOpen()) || (maxCmp == 0 && !isMaxOpen());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TimeInterval convertToUnit(final TimeUnitKind unit) {
		return new TimeIntervalImpl(minOpen, min.convertToUnit(unit), max.convertToUnit(unit), maxOpen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TimeInterval add(final TimeInterval v) {
		return new TimeIntervalImpl(minOpen || v.isMinOpen(), min.add(v.getMin()), max.add(v.getMax()), maxOpen || v.isMaxOpen());
	}

	public TimeInterval add(final Duration v) {
		return add(NfpFactory.eINSTANCE.createTimeInterval(v));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval divide(long v) {
		return new TimeIntervalImpl(minOpen, min.divide(v), max.divide(v), maxOpen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Duration max(final Duration other) {
		if (other.compareTo(max) > 0) {
			return other;
		}
		if (other.compareTo(min) < 0) {
			return new UniformDistributionImpl(this);
		}
		return new UniformDistributionImpl(new TimeIntervalImpl(false, other, max, maxOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Duration min(final Duration other) {
		if (other.compareTo(max) > 0) {
			return new UniformDistributionImpl(this);
		}
		if (other.compareTo(min) < 0) {
			return other;
		}
		return new UniformDistributionImpl(new TimeIntervalImpl(minOpen, min, other, false));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TimeInterval multiply(long v) {
		return new TimeIntervalImpl(minOpen, min.multiply(v), max.multiply(v), maxOpen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TimeInterval sub(final TimeInterval v) {
		return new TimeIntervalImpl(minOpen || v.isMinOpen(), min.sub(v.getMax()), max.sub(v.getMin()), maxOpen || v.isMaxOpen());
	}

	public TimeInterval sub(final Duration v) {
		return add(NfpFactory.eINSTANCE.createTimeInterval(v));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NfpPackage.TIME_INTERVAL__MIN:
				if (resolve) return getMin();
				return basicGetMin();
			case NfpPackage.TIME_INTERVAL__MAX:
				if (resolve) return getMax();
				return basicGetMax();
			case NfpPackage.TIME_INTERVAL__MIN_OPEN:
				return isMinOpen();
			case NfpPackage.TIME_INTERVAL__MAX_OPEN:
				return isMaxOpen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NfpPackage.TIME_INTERVAL__MIN:
				setMin((Duration)newValue);
				return;
			case NfpPackage.TIME_INTERVAL__MAX:
				setMax((Duration)newValue);
				return;
			case NfpPackage.TIME_INTERVAL__MIN_OPEN:
				setMinOpen((Boolean)newValue);
				return;
			case NfpPackage.TIME_INTERVAL__MAX_OPEN:
				setMaxOpen((Boolean)newValue);
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
			case NfpPackage.TIME_INTERVAL__MIN:
				setMin((Duration)null);
				return;
			case NfpPackage.TIME_INTERVAL__MAX:
				setMax((Duration)null);
				return;
			case NfpPackage.TIME_INTERVAL__MIN_OPEN:
				setMinOpen(MIN_OPEN_EDEFAULT);
				return;
			case NfpPackage.TIME_INTERVAL__MAX_OPEN:
				setMaxOpen(MAX_OPEN_EDEFAULT);
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
			case NfpPackage.TIME_INTERVAL__MIN:
				return min != null;
			case NfpPackage.TIME_INTERVAL__MAX:
				return max != null;
			case NfpPackage.TIME_INTERVAL__MIN_OPEN:
				return minOpen != MIN_OPEN_EDEFAULT;
			case NfpPackage.TIME_INTERVAL__MAX_OPEN:
				return maxOpen != MAX_OPEN_EDEFAULT;
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
			case NfpPackage.TIME_INTERVAL___COMPUTE_LENGTH:
				return computeLength();
			case NfpPackage.TIME_INTERVAL___CONTAINS__DURATION:
				return contains((Duration)arguments.get(0));
			case NfpPackage.TIME_INTERVAL___CONVERT_TO_UNIT__TIMEUNITKIND:
				return convertToUnit((TimeUnitKind)arguments.get(0));
			case NfpPackage.TIME_INTERVAL___ADD__DURATION:
				return add((TimeInterval)arguments.get(0));
			case NfpPackage.TIME_INTERVAL___DIVIDE__DURATION:
				return divide((Long)arguments.get(0));
			case NfpPackage.TIME_INTERVAL___MAX__DURATION:
				return max((Duration)arguments.get(0));
			case NfpPackage.TIME_INTERVAL___MIN__DURATION:
				return min((Duration)arguments.get(0));
			case NfpPackage.TIME_INTERVAL___MULTIPLY__LONG:
				return multiply((Long)arguments.get(0));
			case NfpPackage.TIME_INTERVAL___SUB__DURATION:
				return sub((TimeInterval)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();
		
		if (min instanceof DurationImpl && max instanceof DurationImpl) {
			if (((DurationImpl)min).isSimpleDuration() && ((DurationImpl)max).isSimpleDuration()) {
				StringBuffer result = new StringBuffer();
				if (minOpen) {
					result.append("]");
				} else {
					result.append("[");
				}
				result.append(min.toString());
				result.append(",");
				result.append(max.toString());
				if (maxOpen) {
					result.append("[");
				} else {
					result.append("]");
				}
				return result.toString();
			}
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (minOpen: ");
		result.append(minOpen);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", maxOpen: ");
		result.append(maxOpen);
		result.append(')');
		return result.toString();
	}

	@Override
	public Duration getCenter() {
		return getMax().add(getMin()).divide(2);
	}

} //TimeIntervalImpl
