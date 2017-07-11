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
import org.polarsys.time4sys.marte.gqam.ClosedPattern;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Closed Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.ClosedPatternImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.ClosedPatternImpl#getExtDelay <em>Ext Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClosedPatternImpl extends ArrivalPatternImpl implements ClosedPattern {
	/**
	 * The default value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected static final long POPULATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected long population = POPULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtDelay() <em>Ext Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtDelay()
	 * @generated
	 * @ordered
	 */
	protected static final Duration EXT_DELAY_EDEFAULT = (Duration)GqamFactory.eINSTANCE.createFromString(GqamPackage.eINSTANCE.getNFP_Duration(), "0");

	/**
	 * The cached value of the '{@link #getExtDelay() <em>Ext Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtDelay()
	 * @generated
	 * @ordered
	 */
	protected Duration extDelay = EXT_DELAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClosedPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.CLOSED_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulation(long newPopulation) {
		long oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.CLOSED_PATTERN__POPULATION, oldPopulation, population));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getExtDelay() {
		return extDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtDelay(Duration newExtDelay) {
		Duration oldExtDelay = extDelay;
		extDelay = newExtDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.CLOSED_PATTERN__EXT_DELAY, oldExtDelay, extDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GqamPackage.CLOSED_PATTERN__POPULATION:
				return getPopulation();
			case GqamPackage.CLOSED_PATTERN__EXT_DELAY:
				return getExtDelay();
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
			case GqamPackage.CLOSED_PATTERN__POPULATION:
				setPopulation((Long)newValue);
				return;
			case GqamPackage.CLOSED_PATTERN__EXT_DELAY:
				setExtDelay((Duration)newValue);
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
			case GqamPackage.CLOSED_PATTERN__POPULATION:
				setPopulation(POPULATION_EDEFAULT);
				return;
			case GqamPackage.CLOSED_PATTERN__EXT_DELAY:
				setExtDelay(EXT_DELAY_EDEFAULT);
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
			case GqamPackage.CLOSED_PATTERN__POPULATION:
				return population != POPULATION_EDEFAULT;
			case GqamPackage.CLOSED_PATTERN__EXT_DELAY:
				return EXT_DELAY_EDEFAULT == null ? extDelay != null : !EXT_DELAY_EDEFAULT.equals(extDelay);
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
		result.append(" (population: ");
		result.append(population);
		result.append(", extDelay: ");
		result.append(extDelay);
		result.append(')');
		return result.toString();
	}

} //ClosedPatternImpl
