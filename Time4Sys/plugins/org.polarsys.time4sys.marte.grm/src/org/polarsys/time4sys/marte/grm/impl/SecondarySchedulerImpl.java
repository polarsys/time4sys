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
package org.polarsys.time4sys.marte.grm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.marte.grm.SecondaryScheduler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secondary Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.SecondarySchedulerImpl#getVirtualProcessingUnit <em>Virtual Processing Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecondarySchedulerImpl extends SchedulerImpl implements SecondaryScheduler {
	/**
	 * The cached value of the '{@link #getVirtualProcessingUnit() <em>Virtual Processing Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualProcessingUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<SchedulableResource> virtualProcessingUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecondarySchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.SECONDARY_SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchedulableResource> getVirtualProcessingUnit() {
		if (virtualProcessingUnit == null) {
			virtualProcessingUnit = new EObjectWithInverseResolvingEList<SchedulableResource>(SchedulableResource.class, this, GrmPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNIT, GrmPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER);
		}
		return virtualProcessingUnit;
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
			case GrmPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVirtualProcessingUnit()).basicAdd(otherEnd, msgs);
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
			case GrmPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNIT:
				return ((InternalEList<?>)getVirtualProcessingUnit()).basicRemove(otherEnd, msgs);
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
			case GrmPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNIT:
				return getVirtualProcessingUnit();
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
			case GrmPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNIT:
				getVirtualProcessingUnit().clear();
				getVirtualProcessingUnit().addAll((Collection<? extends SchedulableResource>)newValue);
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
			case GrmPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNIT:
				getVirtualProcessingUnit().clear();
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
			case GrmPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNIT:
				return virtualProcessingUnit != null && !virtualProcessingUnit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecondarySchedulerImpl
