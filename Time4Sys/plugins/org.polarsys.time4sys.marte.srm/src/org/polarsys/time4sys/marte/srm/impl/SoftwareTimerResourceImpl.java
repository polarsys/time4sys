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
package org.polarsys.time4sys.marte.srm.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.polarsys.time4sys.marte.grm.impl.TimerResourceImpl;
import org.polarsys.time4sys.marte.srm.SoftwareTimerResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Timer Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareTimerResourceImpl#getDurationElements <em>Duration Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareTimerResourceImpl extends TimerResourceImpl implements SoftwareTimerResource {
	/**
	 * The cached value of the '{@link #getDurationElements() <em>Duration Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> durationElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareTimerResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.SOFTWARE_TIMER_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDurationElements() {
		if (durationElements == null) {
			durationElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_TIMER_RESOURCE__DURATION_ELEMENTS);
		}
		return durationElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SrmPackage.SOFTWARE_TIMER_RESOURCE__DURATION_ELEMENTS:
				return getDurationElements();
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
			case SrmPackage.SOFTWARE_TIMER_RESOURCE__DURATION_ELEMENTS:
				getDurationElements().clear();
				getDurationElements().addAll((Collection<? extends String>)newValue);
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
			case SrmPackage.SOFTWARE_TIMER_RESOURCE__DURATION_ELEMENTS:
				getDurationElements().clear();
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
			case SrmPackage.SOFTWARE_TIMER_RESOURCE__DURATION_ELEMENTS:
				return durationElements != null && !durationElements.isEmpty();
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
		result.append(" (durationElements: ");
		result.append(durationElements);
		result.append(')');
		return result.toString();
	}

} //SoftwareTimerResourceImpl
