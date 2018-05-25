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
package org.polarsys.time4sys.trace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EModelElementImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.trace.Properties;
import org.polarsys.time4sys.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.trace.impl.PropertiesImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.impl.PropertiesImpl#getBlockingTime <em>Blocking Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.impl.PropertiesImpl#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.impl.PropertiesImpl#getRemainingTime <em>Remaining Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.impl.PropertiesImpl#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.impl.PropertiesImpl#getAbsoluteDeadline <em>Absolute Deadline</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.impl.PropertiesImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertiesImpl extends EModelElementImpl implements Properties {
	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final TimeInterval RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected TimeInterval range = RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockingTime() <em>Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected static final Duration BLOCKING_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockingTime() <em>Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected Duration blockingTime = BLOCKING_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionTime() <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected static final Duration EXECUTION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionTime() <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected Duration executionTime = EXECUTION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingTime() <em>Remaining Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingTime()
	 * @generated
	 * @ordered
	 */
	protected static final Duration REMAINING_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingTime() <em>Remaining Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingTime()
	 * @generated
	 * @ordered
	 */
	protected Duration remainingTime = REMAINING_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final Duration RESPONSE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected Duration responseTime = RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbsoluteDeadline() <em>Absolute Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final Duration ABSOLUTE_DEADLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbsoluteDeadline() <em>Absolute Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteDeadline()
	 * @generated
	 * @ordered
	 */
	protected Duration absoluteDeadline = ABSOLUTE_DEADLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final long INDEX_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected long index = INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(TimeInterval newRange) {
		TimeInterval oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.PROPERTIES__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getBlockingTime() {
		return blockingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockingTime(Duration newBlockingTime) {
		Duration oldBlockingTime = blockingTime;
		blockingTime = newBlockingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.PROPERTIES__BLOCKING_TIME, oldBlockingTime, blockingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getExecutionTime() {
		return executionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionTime(Duration newExecutionTime) {
		Duration oldExecutionTime = executionTime;
		executionTime = newExecutionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.PROPERTIES__EXECUTION_TIME, oldExecutionTime, executionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getRemainingTime() {
		return remainingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingTime(Duration newRemainingTime) {
		Duration oldRemainingTime = remainingTime;
		remainingTime = newRemainingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.PROPERTIES__REMAINING_TIME, oldRemainingTime, remainingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getResponseTime() {
		return responseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseTime(Duration newResponseTime) {
		Duration oldResponseTime = responseTime;
		responseTime = newResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.PROPERTIES__RESPONSE_TIME, oldResponseTime, responseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getAbsoluteDeadline() {
		return absoluteDeadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsoluteDeadline(Duration newAbsoluteDeadline) {
		Duration oldAbsoluteDeadline = absoluteDeadline;
		absoluteDeadline = newAbsoluteDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.PROPERTIES__ABSOLUTE_DEADLINE, oldAbsoluteDeadline, absoluteDeadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(long newIndex) {
		long oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.PROPERTIES__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.PROPERTIES__RANGE:
				return getRange();
			case TracePackage.PROPERTIES__BLOCKING_TIME:
				return getBlockingTime();
			case TracePackage.PROPERTIES__EXECUTION_TIME:
				return getExecutionTime();
			case TracePackage.PROPERTIES__REMAINING_TIME:
				return getRemainingTime();
			case TracePackage.PROPERTIES__RESPONSE_TIME:
				return getResponseTime();
			case TracePackage.PROPERTIES__ABSOLUTE_DEADLINE:
				return getAbsoluteDeadline();
			case TracePackage.PROPERTIES__INDEX:
				return getIndex();
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
			case TracePackage.PROPERTIES__RANGE:
				setRange((TimeInterval)newValue);
				return;
			case TracePackage.PROPERTIES__BLOCKING_TIME:
				setBlockingTime((Duration)newValue);
				return;
			case TracePackage.PROPERTIES__EXECUTION_TIME:
				setExecutionTime((Duration)newValue);
				return;
			case TracePackage.PROPERTIES__REMAINING_TIME:
				setRemainingTime((Duration)newValue);
				return;
			case TracePackage.PROPERTIES__RESPONSE_TIME:
				setResponseTime((Duration)newValue);
				return;
			case TracePackage.PROPERTIES__ABSOLUTE_DEADLINE:
				setAbsoluteDeadline((Duration)newValue);
				return;
			case TracePackage.PROPERTIES__INDEX:
				setIndex((Long)newValue);
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
			case TracePackage.PROPERTIES__RANGE:
				setRange(RANGE_EDEFAULT);
				return;
			case TracePackage.PROPERTIES__BLOCKING_TIME:
				setBlockingTime(BLOCKING_TIME_EDEFAULT);
				return;
			case TracePackage.PROPERTIES__EXECUTION_TIME:
				setExecutionTime(EXECUTION_TIME_EDEFAULT);
				return;
			case TracePackage.PROPERTIES__REMAINING_TIME:
				setRemainingTime(REMAINING_TIME_EDEFAULT);
				return;
			case TracePackage.PROPERTIES__RESPONSE_TIME:
				setResponseTime(RESPONSE_TIME_EDEFAULT);
				return;
			case TracePackage.PROPERTIES__ABSOLUTE_DEADLINE:
				setAbsoluteDeadline(ABSOLUTE_DEADLINE_EDEFAULT);
				return;
			case TracePackage.PROPERTIES__INDEX:
				setIndex(INDEX_EDEFAULT);
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
			case TracePackage.PROPERTIES__RANGE:
				return RANGE_EDEFAULT == null ? range != null : !RANGE_EDEFAULT.equals(range);
			case TracePackage.PROPERTIES__BLOCKING_TIME:
				return BLOCKING_TIME_EDEFAULT == null ? blockingTime != null : !BLOCKING_TIME_EDEFAULT.equals(blockingTime);
			case TracePackage.PROPERTIES__EXECUTION_TIME:
				return EXECUTION_TIME_EDEFAULT == null ? executionTime != null : !EXECUTION_TIME_EDEFAULT.equals(executionTime);
			case TracePackage.PROPERTIES__REMAINING_TIME:
				return REMAINING_TIME_EDEFAULT == null ? remainingTime != null : !REMAINING_TIME_EDEFAULT.equals(remainingTime);
			case TracePackage.PROPERTIES__RESPONSE_TIME:
				return RESPONSE_TIME_EDEFAULT == null ? responseTime != null : !RESPONSE_TIME_EDEFAULT.equals(responseTime);
			case TracePackage.PROPERTIES__ABSOLUTE_DEADLINE:
				return ABSOLUTE_DEADLINE_EDEFAULT == null ? absoluteDeadline != null : !ABSOLUTE_DEADLINE_EDEFAULT.equals(absoluteDeadline);
			case TracePackage.PROPERTIES__INDEX:
				return index != INDEX_EDEFAULT;
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
		result.append(" (range: ");
		result.append(range);
		result.append(", blockingTime: ");
		result.append(blockingTime);
		result.append(", executionTime: ");
		result.append(executionTime);
		result.append(", remainingTime: ");
		result.append(remainingTime);
		result.append(", responseTime: ");
		result.append(responseTime);
		result.append(", absoluteDeadline: ");
		result.append(absoluteDeadline);
		result.append(", index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //PropertiesImpl
