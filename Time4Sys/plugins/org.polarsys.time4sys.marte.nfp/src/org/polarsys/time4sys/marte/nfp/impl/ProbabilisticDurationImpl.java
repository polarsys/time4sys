/**
 */
package org.polarsys.time4sys.marte.nfp.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.nfp.ProbabilisticDuration;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probabilistic Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.ProbabilisticDurationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.ProbabilisticDurationImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.ProbabilisticDurationImpl#getBest <em>Best</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.ProbabilisticDurationImpl#getWorst <em>Worst</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.ProbabilisticDurationImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.ProbabilisticDurationImpl#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProbabilisticDurationImpl extends TimeIntervalImpl implements ProbabilisticDuration {
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
	 * @generated
	 */
	protected ProbabilisticDurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NfpPackage.Literals.PROBABILISTIC_DURATION;
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
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.PROBABILISTIC_DURATION__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.PROBABILISTIC_DURATION__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBest() {
		return best;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBest(double newBest) {
		double oldBest = best;
		best = newBest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.PROBABILISTIC_DURATION__BEST, oldBest, best));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWorst() {
		return worst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorst(double newWorst) {
		double oldWorst = worst;
		worst = newWorst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.PROBABILISTIC_DURATION__WORST, oldWorst, worst));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.PROBABILISTIC_DURATION__CLOCK, oldClock, clock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.PROBABILISTIC_DURATION__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration add(Duration v) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int compareTo(Duration anotherDuration) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration convertToUnit(TimeUnitKind unit) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double div(Duration v) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long divide(Duration v) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isZero() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration lcm(Duration v) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration max(Duration other) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration min(Duration other) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration multiply(long v) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean notZero() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration simplify() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration sub(Duration v) {
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
			case NfpPackage.PROBABILISTIC_DURATION__VALUE:
				return getValue();
			case NfpPackage.PROBABILISTIC_DURATION__UNIT:
				return getUnit();
			case NfpPackage.PROBABILISTIC_DURATION__BEST:
				return getBest();
			case NfpPackage.PROBABILISTIC_DURATION__WORST:
				return getWorst();
			case NfpPackage.PROBABILISTIC_DURATION__CLOCK:
				return getClock();
			case NfpPackage.PROBABILISTIC_DURATION__PRECISION:
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
			case NfpPackage.PROBABILISTIC_DURATION__VALUE:
				setValue((Double)newValue);
				return;
			case NfpPackage.PROBABILISTIC_DURATION__UNIT:
				setUnit((TimeUnitKind)newValue);
				return;
			case NfpPackage.PROBABILISTIC_DURATION__BEST:
				setBest((Double)newValue);
				return;
			case NfpPackage.PROBABILISTIC_DURATION__WORST:
				setWorst((Double)newValue);
				return;
			case NfpPackage.PROBABILISTIC_DURATION__CLOCK:
				setClock((String)newValue);
				return;
			case NfpPackage.PROBABILISTIC_DURATION__PRECISION:
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
			case NfpPackage.PROBABILISTIC_DURATION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case NfpPackage.PROBABILISTIC_DURATION__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case NfpPackage.PROBABILISTIC_DURATION__BEST:
				setBest(BEST_EDEFAULT);
				return;
			case NfpPackage.PROBABILISTIC_DURATION__WORST:
				setWorst(WORST_EDEFAULT);
				return;
			case NfpPackage.PROBABILISTIC_DURATION__CLOCK:
				setClock(CLOCK_EDEFAULT);
				return;
			case NfpPackage.PROBABILISTIC_DURATION__PRECISION:
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
			case NfpPackage.PROBABILISTIC_DURATION__VALUE:
				return value != VALUE_EDEFAULT;
			case NfpPackage.PROBABILISTIC_DURATION__UNIT:
				return unit != UNIT_EDEFAULT;
			case NfpPackage.PROBABILISTIC_DURATION__BEST:
				return best != BEST_EDEFAULT;
			case NfpPackage.PROBABILISTIC_DURATION__WORST:
				return worst != WORST_EDEFAULT;
			case NfpPackage.PROBABILISTIC_DURATION__CLOCK:
				return CLOCK_EDEFAULT == null ? clock != null : !CLOCK_EDEFAULT.equals(clock);
			case NfpPackage.PROBABILISTIC_DURATION__PRECISION:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Duration.class) {
			switch (derivedFeatureID) {
				case NfpPackage.PROBABILISTIC_DURATION__VALUE: return NfpPackage.DURATION__VALUE;
				case NfpPackage.PROBABILISTIC_DURATION__UNIT: return NfpPackage.DURATION__UNIT;
				case NfpPackage.PROBABILISTIC_DURATION__BEST: return NfpPackage.DURATION__BEST;
				case NfpPackage.PROBABILISTIC_DURATION__WORST: return NfpPackage.DURATION__WORST;
				case NfpPackage.PROBABILISTIC_DURATION__CLOCK: return NfpPackage.DURATION__CLOCK;
				case NfpPackage.PROBABILISTIC_DURATION__PRECISION: return NfpPackage.DURATION__PRECISION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Duration.class) {
			switch (baseFeatureID) {
				case NfpPackage.DURATION__VALUE: return NfpPackage.PROBABILISTIC_DURATION__VALUE;
				case NfpPackage.DURATION__UNIT: return NfpPackage.PROBABILISTIC_DURATION__UNIT;
				case NfpPackage.DURATION__BEST: return NfpPackage.PROBABILISTIC_DURATION__BEST;
				case NfpPackage.DURATION__WORST: return NfpPackage.PROBABILISTIC_DURATION__WORST;
				case NfpPackage.DURATION__CLOCK: return NfpPackage.PROBABILISTIC_DURATION__CLOCK;
				case NfpPackage.DURATION__PRECISION: return NfpPackage.PROBABILISTIC_DURATION__PRECISION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Duration.class) {
			switch (baseOperationID) {
				case NfpPackage.DURATION___ADD__DURATION: return NfpPackage.PROBABILISTIC_DURATION___ADD__DURATION;
				case NfpPackage.DURATION___COMPARE_TO__DURATION: return NfpPackage.PROBABILISTIC_DURATION___COMPARE_TO__DURATION;
				case NfpPackage.DURATION___CONVERT_TO_UNIT__TIMEUNITKIND: return NfpPackage.PROBABILISTIC_DURATION___CONVERT_TO_UNIT__TIMEUNITKIND;
				case NfpPackage.DURATION___DIV__DURATION: return NfpPackage.PROBABILISTIC_DURATION___DIV__DURATION;
				case NfpPackage.DURATION___DIVIDE__DURATION: return NfpPackage.PROBABILISTIC_DURATION___DIVIDE__DURATION;
				case NfpPackage.DURATION___IS_ZERO: return NfpPackage.PROBABILISTIC_DURATION___IS_ZERO;
				case NfpPackage.DURATION___LCM__DURATION: return NfpPackage.PROBABILISTIC_DURATION___LCM__DURATION;
				case NfpPackage.DURATION___MAX__DURATION: return NfpPackage.PROBABILISTIC_DURATION___MAX__DURATION;
				case NfpPackage.DURATION___MIN__DURATION: return NfpPackage.PROBABILISTIC_DURATION___MIN__DURATION;
				case NfpPackage.DURATION___MULTIPLY__LONG: return NfpPackage.PROBABILISTIC_DURATION___MULTIPLY__LONG;
				case NfpPackage.DURATION___NOT_ZERO: return NfpPackage.PROBABILISTIC_DURATION___NOT_ZERO;
				case NfpPackage.DURATION___SIMPLIFY: return NfpPackage.PROBABILISTIC_DURATION___SIMPLIFY;
				case NfpPackage.DURATION___SUB__DURATION: return NfpPackage.PROBABILISTIC_DURATION___SUB__DURATION;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case NfpPackage.PROBABILISTIC_DURATION___ADD__DURATION:
				return add((Duration)arguments.get(0));
			case NfpPackage.PROBABILISTIC_DURATION___COMPARE_TO__DURATION:
				return compareTo((Duration)arguments.get(0));
			case NfpPackage.PROBABILISTIC_DURATION___CONVERT_TO_UNIT__TIMEUNITKIND:
				return convertToUnit((TimeUnitKind)arguments.get(0));
			case NfpPackage.PROBABILISTIC_DURATION___DIV__DURATION:
				return div((Duration)arguments.get(0));
			case NfpPackage.PROBABILISTIC_DURATION___DIVIDE__DURATION:
				return divide((Duration)arguments.get(0));
			case NfpPackage.PROBABILISTIC_DURATION___IS_ZERO:
				return isZero();
			case NfpPackage.PROBABILISTIC_DURATION___LCM__DURATION:
				return lcm((Duration)arguments.get(0));
			case NfpPackage.PROBABILISTIC_DURATION___MAX__DURATION:
				return max((Duration)arguments.get(0));
			case NfpPackage.PROBABILISTIC_DURATION___MIN__DURATION:
				return min((Duration)arguments.get(0));
			case NfpPackage.PROBABILISTIC_DURATION___MULTIPLY__LONG:
				return multiply((Long)arguments.get(0));
			case NfpPackage.PROBABILISTIC_DURATION___NOT_ZERO:
				return notZero();
			case NfpPackage.PROBABILISTIC_DURATION___SIMPLIFY:
				return simplify();
			case NfpPackage.PROBABILISTIC_DURATION___SUB__DURATION:
				return sub((Duration)arguments.get(0));
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

} //ProbabilisticDurationImpl
