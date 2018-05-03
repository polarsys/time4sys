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
package org.polarsys.time4sys.marte.gqam.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.ReleaseStep;
import org.polarsys.time4sys.marte.grm.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.ReleaseStepImpl#getRelRes <em>Rel Res</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.ReleaseStepImpl#getResUnits <em>Res Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseStepImpl extends StepImpl implements ReleaseStep {
	/**
	 * The cached value of the '{@link #getRelRes() <em>Rel Res</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelRes()
	 * @generated
	 * @ordered
	 */
	protected Resource relRes;

	/**
	 * The default value of the '{@link #getResUnits() <em>Res Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResUnits()
	 * @generated
	 * @ordered
	 */
	protected static final int RES_UNITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResUnits() <em>Res Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResUnits()
	 * @generated
	 * @ordered
	 */
	protected int resUnits = RES_UNITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.RELEASE_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getRelRes() {
		if (relRes != null && relRes.eIsProxy()) {
			InternalEObject oldRelRes = (InternalEObject)relRes;
			relRes = (Resource)eResolveProxy(oldRelRes);
			if (relRes != oldRelRes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GqamPackage.RELEASE_STEP__REL_RES, oldRelRes, relRes));
			}
		}
		return relRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetRelRes() {
		return relRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelRes(Resource newRelRes) {
		Resource oldRelRes = relRes;
		relRes = newRelRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.RELEASE_STEP__REL_RES, oldRelRes, relRes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResUnits() {
		return resUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResUnits(int newResUnits) {
		int oldResUnits = resUnits;
		resUnits = newResUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.RELEASE_STEP__RES_UNITS, oldResUnits, resUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GqamPackage.RELEASE_STEP__REL_RES:
				if (resolve) return getRelRes();
				return basicGetRelRes();
			case GqamPackage.RELEASE_STEP__RES_UNITS:
				return getResUnits();
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
			case GqamPackage.RELEASE_STEP__REL_RES:
				setRelRes((Resource)newValue);
				return;
			case GqamPackage.RELEASE_STEP__RES_UNITS:
				setResUnits((Integer)newValue);
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
			case GqamPackage.RELEASE_STEP__REL_RES:
				setRelRes((Resource)null);
				return;
			case GqamPackage.RELEASE_STEP__RES_UNITS:
				setResUnits(RES_UNITS_EDEFAULT);
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
			case GqamPackage.RELEASE_STEP__REL_RES:
				return relRes != null;
			case GqamPackage.RELEASE_STEP__RES_UNITS:
				return resUnits != RES_UNITS_EDEFAULT;
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
		result.append(" (resUnits: ");
		result.append(resUnits);
		result.append(')');
		return result.toString();
	}

} //ReleaseStepImpl
