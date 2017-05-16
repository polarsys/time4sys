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
package org.polarsys.time4sys.marte.hrm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.time4sys.marte.hrm.HardwareArbiter;
import org.polarsys.time4sys.marte.hrm.HardwareMedia;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareMediaImpl#getArbiters <em>Arbiters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareMediaImpl extends HardwareCommunicationResourceImpl implements HardwareMedia {
	/**
	 * The cached value of the '{@link #getArbiters() <em>Arbiters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArbiters()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareArbiter> arbiters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareMediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HrmPackage.Literals.HARDWARE_MEDIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareArbiter> getArbiters() {
		if (arbiters == null) {
			arbiters = new EObjectWithInverseResolvingEList.ManyInverse<HardwareArbiter>(HardwareArbiter.class, this, HrmPackage.HARDWARE_MEDIA__ARBITERS, HrmPackage.HARDWARE_ARBITER__CONTROLLED_MEDIA);
		}
		return arbiters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HrmPackage.HARDWARE_MEDIA__ARBITERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArbiters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HrmPackage.HARDWARE_MEDIA__ARBITERS:
				return ((InternalEList<?>)getArbiters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HrmPackage.HARDWARE_MEDIA__ARBITERS:
				return getArbiters();
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
			case HrmPackage.HARDWARE_MEDIA__ARBITERS:
				getArbiters().clear();
				getArbiters().addAll((Collection<? extends HardwareArbiter>)newValue);
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
			case HrmPackage.HARDWARE_MEDIA__ARBITERS:
				getArbiters().clear();
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
			case HrmPackage.HARDWARE_MEDIA__ARBITERS:
				return arbiters != null && !arbiters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HardwareMediaImpl
