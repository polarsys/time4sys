/*******************************************************************************
 * Copyright (c) 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.nfp.impl;

import java.math.MathContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;
import org.polarsys.time4sys.marte.nfp.UniformDistribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uniform Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.UniformDistributionImpl#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniformDistributionImpl extends ProbabilisticDurationImpl implements UniformDistribution {
	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated NOT
	 * @ordered
	 */
	protected static final TimeInterval INTERVAL_EDEFAULT = new TimeIntervalImpl(false, ZERO, ZERO, false);
	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected TimeInterval interval = INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniformDistributionImpl() {
		super();
	}

	public UniformDistributionImpl(final TimeInterval value) {
		setInterval(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NfpPackage.Literals.UNIFORM_DISTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(TimeInterval newInterval) {
		TimeInterval oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.UNIFORM_DISTRIBUTION__INTERVAL, oldInterval, interval));
	}

	public void setValue(double newValue) {
		getInterval().getMax().setValue(newValue);
		getInterval().getMin().setValue(newValue);
	}
	
	public double getValue() {
		return getInterval().getCenter().getValue();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NfpPackage.UNIFORM_DISTRIBUTION__INTERVAL:
				return getInterval();
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
			case NfpPackage.UNIFORM_DISTRIBUTION__INTERVAL:
				setInterval((TimeInterval)newValue);
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
			case NfpPackage.UNIFORM_DISTRIBUTION__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
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
			case NfpPackage.UNIFORM_DISTRIBUTION__INTERVAL:
				return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		final StringBuffer result = new StringBuffer();
		result.append("uniform(");
		result.append(getInterval().toString());
		result.append(")");
		return result.toString();
	}
	
	@Override
	public boolean isZero() {
		return getInterval().contains(ZERO);
	}
	
	@Override
	public Duration convertToUnit(final TimeUnitKind unit) {
		return new UniformDistributionImpl(getInterval().convertToUnit(unit));
	}

	@Override
	public UniformDistribution add(final Duration v) {
		return new UniformDistributionImpl(getInterval().add(NfpFactory.eINSTANCE.createTimeInterval(v)));
	}
	
	@Override
	public UniformDistribution sub(final Duration v) {
		return new UniformDistributionImpl(getInterval().sub(NfpFactory.eINSTANCE.createTimeInterval(v)));
	}
	
	@Override
	public Duration min(final Duration other) {
		return getInterval().min(other);
	}
	
	@Override
	public Duration max(final Duration other) {
		return getInterval().max(other);
	}
	
	@Override
	public Duration multiply(final long value) {
		return new UniformDistributionImpl(getInterval().multiply(value));
	}
	
	@Override
	public Duration divide(final long value) {
		return new UniformDistributionImpl(getInterval().divide(value));
	}
	
	@Override
	public double div(final Duration value, final MathContext ctx) {
		return getInterval().getCenter().div(value, ctx);
	}
	
	@Override
	public double getBest() {
		return getInterval().getMin().getValue();
	}
	
	@Override
	public double getWorst() {
		return getInterval().getMax().getValue();
	}
} //UniformDistributionImpl
