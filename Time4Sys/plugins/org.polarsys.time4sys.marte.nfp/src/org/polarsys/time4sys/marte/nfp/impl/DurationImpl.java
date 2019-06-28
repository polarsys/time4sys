/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.marte.nfp.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.DurationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.DurationImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.DurationImpl#getBest <em>Best</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.DurationImpl#getWorst <em>Worst</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.DurationImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.DurationImpl#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @generated NOT
 */
public class DurationImpl extends AbstractRealWithUnitValueImpl<TimeUnitKind, Duration> implements Duration {
	
	/**
	 * @generated NOT
	 */
	protected static final DurationImpl ZERO = new DurationImpl(0.0, TimeUnitKind.MS);

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnitKind UNIT_EDEFAULT = TimeUnitKind.MS;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnitKind unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBest() <em>Best</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBest()
	 * @generated
	 * @ordered
	 */
	protected static final double BEST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBest() <em>Best</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBest()
	 * @generated
	 * @ordered
	 */
	protected double best = BEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorst() <em>Worst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorst()
	 * @generated
	 * @ordered
	 */
	protected static final double WORST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWorst() <em>Worst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorst()
	 * @generated
	 * @ordered
	 */
	protected double worst = WORST_EDEFAULT;

	/**
	 * The default value of the '{@link #getClock() <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected String clock = CLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final double PRECISION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected double precision = PRECISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DurationImpl() {
		this(0.0, TimeUnitKind.MS);
	}
	
	/**
	 * @generated NOT
	 */
	protected DurationImpl(final double v, final TimeUnitKind unit) {
		super(TimeDimension.timeDimension);
		this.value = v;
		this.unit = unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NfpPackage.Literals.DURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.DURATION__VALUE, oldValue, value));
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.DURATION__BEST, oldValue, value));
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.DURATION__WORST, oldValue, value));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnitKind getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(TimeUnitKind newUnit) {
		TimeUnitKind oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.DURATION__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getBest() {
		return getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setBest(double newBest) {
		throw new UnsupportedOperationException("Illegal call of setBest on single point in time duration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getWorst() {
		return getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setWorst(double newWorst) {
		throw new UnsupportedOperationException("Illegal call of setWorst on single point in time duration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(String newClock) {
		String oldClock = clock;
		clock = newClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.DURATION__CLOCK, oldClock, clock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(double newPrecision) {
		double oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.DURATION__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NfpPackage.DURATION__VALUE:
				return getValue();
			case NfpPackage.DURATION__UNIT:
				return getUnit();
			case NfpPackage.DURATION__BEST:
				return getBest();
			case NfpPackage.DURATION__WORST:
				return getWorst();
			case NfpPackage.DURATION__CLOCK:
				return getClock();
			case NfpPackage.DURATION__PRECISION:
				return getPrecision();
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
			case NfpPackage.DURATION__VALUE:
				setValue((Double)newValue);
				return;
			case NfpPackage.DURATION__UNIT:
				setUnit((TimeUnitKind)newValue);
				return;
			case NfpPackage.DURATION__BEST:
				setBest((Double)newValue);
				return;
			case NfpPackage.DURATION__WORST:
				setWorst((Double)newValue);
				return;
			case NfpPackage.DURATION__CLOCK:
				setClock((String)newValue);
				return;
			case NfpPackage.DURATION__PRECISION:
				setPrecision((Double)newValue);
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
			case NfpPackage.DURATION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case NfpPackage.DURATION__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case NfpPackage.DURATION__BEST:
				setBest(BEST_EDEFAULT);
				return;
			case NfpPackage.DURATION__WORST:
				setWorst(WORST_EDEFAULT);
				return;
			case NfpPackage.DURATION__CLOCK:
				setClock(CLOCK_EDEFAULT);
				return;
			case NfpPackage.DURATION__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
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
			case NfpPackage.DURATION__VALUE:
				return value != VALUE_EDEFAULT;
			case NfpPackage.DURATION__UNIT:
				return unit != UNIT_EDEFAULT;
			case NfpPackage.DURATION__BEST:
				return best != BEST_EDEFAULT;
			case NfpPackage.DURATION__WORST:
				return worst != WORST_EDEFAULT;
			case NfpPackage.DURATION__CLOCK:
				return CLOCK_EDEFAULT == null ? clock != null : !CLOCK_EDEFAULT.equals(clock);
			case NfpPackage.DURATION__PRECISION:
				return precision != PRECISION_EDEFAULT;
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
			case NfpPackage.DURATION___ADD__DURATION:
				return add((Duration)arguments.get(0));
			case NfpPackage.DURATION___COMPARE_TO__DURATION:
				return compareTo((Duration)arguments.get(0));
			case NfpPackage.DURATION___CONVERT_TO_UNIT__TIMEUNITKIND:
				return convertToUnit((TimeUnitKind)arguments.get(0));
			case NfpPackage.DURATION___DIV__DURATION:
				return div((Duration)arguments.get(0));
			case NfpPackage.DURATION___DIVIDE__DURATION:
				return divide((Duration)arguments.get(0));
			case NfpPackage.DURATION___IS_ZERO:
				return isZero();
			case NfpPackage.DURATION___LCM__DURATION:
				return lcm((Duration)arguments.get(0));
			case NfpPackage.DURATION___MAX__DURATION:
				return max((Duration)arguments.get(0));
			case NfpPackage.DURATION___MIN__DURATION:
				return min((Duration)arguments.get(0));
			case NfpPackage.DURATION___MULTIPLY__LONG:
				return multiply((Long)arguments.get(0));
			case NfpPackage.DURATION___NOT_ZERO:
				return notZero();
			case NfpPackage.DURATION___SIMPLIFY:
				return simplify();
			case NfpPackage.DURATION___SUB__DURATION:
				return sub((Duration)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * 
	 * @return true if value and unit are set.
	 * @geneared NOT
	 */
	public boolean isSimpleDuration() {
		return !eIsSet(NfpPackage.DURATION__WORST) && 
			   !eIsSet(NfpPackage.DURATION__BEST) &&
			   !eIsSet(NfpPackage.DURATION__CLOCK) &&
			   !eIsSet(NfpPackage.DURATION__PRECISION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		if (isSimpleDuration()) {
			final Duration s = simplify();
			if (s == this) {
				final StringBuilder sb = new StringBuilder();
				sb.append(NfpFactoryImpl.convertDoubleToString(s.getValue()));
				sb.append(s.getUnit().getName());
				return sb.toString();
			} else {
				return s.toString();
			}
		}
		
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", unit: ");
		result.append(unit);
		result.append(", best: ");
		result.append(best);
		result.append(", worst: ");
		result.append(worst);
		result.append(", clock: ");
		result.append(clock);
		result.append(", precision: ");
		result.append(precision);
		result.append(')');
		return result.toString();
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 * @generated NOT
	 */
	@Override
	public int hashCode() {
		if (isSimpleDuration()) {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((unit == null) ? 0 : unit.hashCode());
			long temp;
			temp = Double.doubleToLongBits(value);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		} else {
			return super.hashCode();
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @generated NOT
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Duration))
			return false;
		final Duration other = (Duration) obj;
		if (unit == other.getUnit()) {
			return (Double.doubleToLongBits(value) == Double.doubleToLongBits(other.getValue()));
		} else {
			if (isZero() && other.isZero()) {
				return true;
			} else {
				final TimeUnitKind target = d.findClosestUnitTo(unit, other.getUnit());
				return this.convertToUnit(target).equals(other.convertToUnit(target));
			}
		}
	}

	@Override
	protected Duration create(double e, TimeUnitKind targetUnit) {
		return new DurationImpl(e, targetUnit);
	}
} //DurationImpl
