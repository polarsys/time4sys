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
import org.polarsys.time4sys.marte.gqam.SlidingWindowPattern;

import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sliding Window Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.SlidingWindowPatternImpl#getWindowSize <em>Window Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.SlidingWindowPatternImpl#getNbEvents <em>Nb Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlidingWindowPatternImpl extends ArrivalPatternImpl implements SlidingWindowPattern {
	/**
	 * The default value of the '{@link #getWindowSize() <em>Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowSize()
	 * @generated
	 * @ordered
	 */
	protected static final Duration WINDOW_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindowSize() <em>Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowSize()
	 * @generated
	 * @ordered
	 */
	protected Duration windowSize = WINDOW_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbEvents() <em>Nb Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbEvents()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_EVENTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbEvents() <em>Nb Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbEvents()
	 * @generated
	 * @ordered
	 */
	protected long nbEvents = NB_EVENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlidingWindowPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.SLIDING_WINDOW_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getWindowSize() {
		return windowSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindowSize(Duration newWindowSize) {
		Duration oldWindowSize = windowSize;
		windowSize = newWindowSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.SLIDING_WINDOW_PATTERN__WINDOW_SIZE, oldWindowSize, windowSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbEvents() {
		return nbEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbEvents(long newNbEvents) {
		long oldNbEvents = nbEvents;
		nbEvents = newNbEvents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.SLIDING_WINDOW_PATTERN__NB_EVENTS, oldNbEvents, nbEvents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GqamPackage.SLIDING_WINDOW_PATTERN__WINDOW_SIZE:
				return getWindowSize();
			case GqamPackage.SLIDING_WINDOW_PATTERN__NB_EVENTS:
				return getNbEvents();
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
			case GqamPackage.SLIDING_WINDOW_PATTERN__WINDOW_SIZE:
				setWindowSize((Duration)newValue);
				return;
			case GqamPackage.SLIDING_WINDOW_PATTERN__NB_EVENTS:
				setNbEvents((Long)newValue);
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
			case GqamPackage.SLIDING_WINDOW_PATTERN__WINDOW_SIZE:
				setWindowSize(WINDOW_SIZE_EDEFAULT);
				return;
			case GqamPackage.SLIDING_WINDOW_PATTERN__NB_EVENTS:
				setNbEvents(NB_EVENTS_EDEFAULT);
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
			case GqamPackage.SLIDING_WINDOW_PATTERN__WINDOW_SIZE:
				return WINDOW_SIZE_EDEFAULT == null ? windowSize != null : !WINDOW_SIZE_EDEFAULT.equals(windowSize);
			case GqamPackage.SLIDING_WINDOW_PATTERN__NB_EVENTS:
				return nbEvents != NB_EVENTS_EDEFAULT;
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
		result.append(" (windowSize: ");
		result.append(windowSize);
		result.append(", nbEvents: ");
		result.append(nbEvents);
		result.append(')');
		return result.toString();
	}

} //SlidingWindowPatternImpl
