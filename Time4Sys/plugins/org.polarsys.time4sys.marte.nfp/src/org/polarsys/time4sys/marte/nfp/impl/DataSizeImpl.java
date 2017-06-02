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
package org.polarsys.time4sys.marte.nfp.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.marte.nfp.DataSize;
import org.polarsys.time4sys.marte.nfp.DataSizeUnitKind;
import org.polarsys.time4sys.marte.nfp.NfpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.DataSizeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.DataSizeImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated NOT
 */
public class DataSizeImpl extends AbstractRealWithUnitValueImpl<DataSizeUnitKind, DataSize> implements DataSize {
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
	protected static final DataSizeUnitKind UNIT_EDEFAULT = DataSizeUnitKind.BYTE;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected DataSizeUnitKind unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSizeImpl() {
		super(DataSizeDimension.dataSizeDimension);
	}
	
	/**
	 * @generated NOT
	 */
	protected DataSizeImpl(final double v, final DataSizeUnitKind unit) {
		super(DataSizeDimension.dataSizeDimension);
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
		return NfpPackage.Literals.DATA_SIZE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.DATA_SIZE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSizeUnitKind getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(DataSizeUnitKind newUnit) {
		DataSizeUnitKind oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.DATA_SIZE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NfpPackage.DATA_SIZE__VALUE:
				return getValue();
			case NfpPackage.DATA_SIZE__UNIT:
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
			case NfpPackage.DATA_SIZE__VALUE:
				setValue((Double)newValue);
				return;
			case NfpPackage.DATA_SIZE__UNIT:
				setUnit((DataSizeUnitKind)newValue);
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
			case NfpPackage.DATA_SIZE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case NfpPackage.DATA_SIZE__UNIT:
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
			case NfpPackage.DATA_SIZE__VALUE:
				return value != VALUE_EDEFAULT;
			case NfpPackage.DATA_SIZE__UNIT:
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
			case NfpPackage.DATA_SIZE___ADD__DATASIZE:
				return add((DataSize)arguments.get(0));
			case NfpPackage.DATA_SIZE___COMPARE_TO__DATASIZE:
				return compareTo((DataSize)arguments.get(0));
			case NfpPackage.DATA_SIZE___CONVERT_TO_UNIT__DATASIZEUNITKIND:
				return convertToUnit((DataSizeUnitKind)arguments.get(0));
			case NfpPackage.DATA_SIZE___DIV__DATASIZE:
				return div((DataSize)arguments.get(0));
			case NfpPackage.DATA_SIZE___DIVIDE__DATASIZE:
				return divide((DataSize)arguments.get(0));
			case NfpPackage.DATA_SIZE___IS_ZERO:
				return isZero();
			case NfpPackage.DATA_SIZE___LCM__DATASIZE:
				return lcm((DataSize)arguments.get(0));
			case NfpPackage.DATA_SIZE___MAX__DATASIZE:
				return max((DataSize)arguments.get(0));
			case NfpPackage.DATA_SIZE___MIN__DATASIZE:
				return min((DataSize)arguments.get(0));
			case NfpPackage.DATA_SIZE___MULTIPLY__LONG:
				return multiply((Long)arguments.get(0));
			case NfpPackage.DATA_SIZE___NOT_ZERO:
				return notZero();
			case NfpPackage.DATA_SIZE___SIMPLIFY:
				return simplify();
			case NfpPackage.DATA_SIZE___SUB__DATASIZE:
				return sub((DataSize)arguments.get(0));
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
	protected DataSizeImpl create(double e, DataSizeUnitKind targetUnit) {
		return new DataSizeImpl(e, targetUnit);
	}

} //DataSizeImpl
