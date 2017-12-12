/**
 */
package org.polarsys.time4sys.marte.nfp.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.marte.nfp.DataTxRate;
import org.polarsys.time4sys.marte.nfp.DataTxRateUnitKind;
import org.polarsys.time4sys.marte.nfp.NfpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Tx Rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.DataTxRateImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.DataTxRateImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated NOT
 */
public class DataTxRateImpl extends AbstractRealWithUnitValueImpl<DataTxRateUnitKind, DataTxRate> implements DataTxRate {
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
	protected static final DataTxRateUnitKind UNIT_EDEFAULT = DataTxRateUnitKind.BPER_S;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected DataTxRateUnitKind unit = UNIT_EDEFAULT;

	/**
	 * @generated NOT
	 */
	protected DataTxRateImpl(final double v, final DataTxRateUnitKind unit) {
		super(DataTxRateDimension.dataTxRateDimension);
		this.value = v;
		this.unit = unit;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DataTxRateImpl() {
		super(DataTxRateDimension.dataTxRateDimension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NfpPackage.Literals.DATA_TX_RATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.DATA_TX_RATE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTxRateUnitKind getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(DataTxRateUnitKind newUnit) {
		DataTxRateUnitKind oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.DATA_TX_RATE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NfpPackage.DATA_TX_RATE__VALUE:
				return getValue();
			case NfpPackage.DATA_TX_RATE__UNIT:
				return getUnit();
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
			case NfpPackage.DATA_TX_RATE__VALUE:
				setValue((Double)newValue);
				return;
			case NfpPackage.DATA_TX_RATE__UNIT:
				setUnit((DataTxRateUnitKind)newValue);
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
			case NfpPackage.DATA_TX_RATE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case NfpPackage.DATA_TX_RATE__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case NfpPackage.DATA_TX_RATE__VALUE:
				return value != VALUE_EDEFAULT;
			case NfpPackage.DATA_TX_RATE__UNIT:
				return unit != UNIT_EDEFAULT;
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
			case NfpPackage.DATA_TX_RATE___ADD__DATATXRATE:
				return add((DataTxRate)arguments.get(0));
			case NfpPackage.DATA_TX_RATE___COMPARE_TO__DATATXRATE:
				return compareTo((DataTxRate)arguments.get(0));
			case NfpPackage.DATA_TX_RATE___CONVERT_TO_UNIT__DATATXRATEUNITKIND:
				return convertToUnit((DataTxRateUnitKind)arguments.get(0));
			case NfpPackage.DATA_TX_RATE___DIV__DATATXRATE:
				return div((DataTxRate)arguments.get(0));
			case NfpPackage.DATA_TX_RATE___DIVIDE__DATATXRATE:
				return divide((DataTxRate)arguments.get(0));
			case NfpPackage.DATA_TX_RATE___IS_ZERO:
				return isZero();
			case NfpPackage.DATA_TX_RATE___LCM__DATATXRATE:
				return lcm((DataTxRate)arguments.get(0));
			case NfpPackage.DATA_TX_RATE___MAX__DATATXRATE:
				return max((DataTxRate)arguments.get(0));
			case NfpPackage.DATA_TX_RATE___MIN__DATATXRATE:
				return min((DataTxRate)arguments.get(0));
			case NfpPackage.DATA_TX_RATE___MULTIPLY__LONG:
				return multiply((Long)arguments.get(0));
			case NfpPackage.DATA_TX_RATE___NOT_ZERO:
				return notZero();
			case NfpPackage.DATA_TX_RATE___SIMPLIFY:
				return simplify();
			case NfpPackage.DATA_TX_RATE___SUB__DATATXRATE:
				return sub((DataTxRate)arguments.get(0));
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
		result.append(')');
		return result.toString();
	}
	
	@Override
	protected DataTxRateImpl create(double e, DataTxRateUnitKind targetUnit) {
		return new DataTxRateImpl(e, targetUnit);
	}

} //DataTxRateImpl
