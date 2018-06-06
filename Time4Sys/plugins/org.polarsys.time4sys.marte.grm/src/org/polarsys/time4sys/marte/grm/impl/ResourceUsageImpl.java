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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourceUsage;
import org.polarsys.time4sys.marte.grm.UsageDemand;
import org.polarsys.time4sys.marte.grm.UsageTypedAmount;
import org.polarsys.time4sys.marte.nfp.coreelements.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourceUsageImpl#getWorkload <em>Workload</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourceUsageImpl#getRequiredAmount <em>Required Amount</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourceUsageImpl#getUsedResource <em>Used Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceUsageImpl extends ModelElementImpl implements ResourceUsage {
	/**
	 * The cached value of the '{@link #getWorkload() <em>Workload</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkload()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageDemand> workload;

	/**
	 * The cached value of the '{@link #getRequiredAmount() <em>Required Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageTypedAmount> requiredAmount;

	/**
	 * The cached value of the '{@link #getUsedResource() <em>Used Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> usedResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.RESOURCE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageDemand> getWorkload() {
		if (workload == null) {
			workload = new EObjectWithInverseResolvingEList.ManyInverse<UsageDemand>(UsageDemand.class, this, GrmPackage.RESOURCE_USAGE__WORKLOAD, GrmPackage.USAGE_DEMAND__USAGE);
		}
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageTypedAmount> getRequiredAmount() {
		if (requiredAmount == null) {
			requiredAmount = new EObjectContainmentEList<UsageTypedAmount>(UsageTypedAmount.class, this, GrmPackage.RESOURCE_USAGE__REQUIRED_AMOUNT);
		}
		return requiredAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getUsedResource() {
		if (usedResource == null) {
			usedResource = new EObjectWithInverseResolvingEList.ManyInverse<Resource>(Resource.class, this, GrmPackage.RESOURCE_USAGE__USED_RESOURCE, GrmPackage.RESOURCE__USED_BY);
		}
		return usedResource;
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
			case GrmPackage.RESOURCE_USAGE__WORKLOAD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkload()).basicAdd(otherEnd, msgs);
			case GrmPackage.RESOURCE_USAGE__USED_RESOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedResource()).basicAdd(otherEnd, msgs);
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
			case GrmPackage.RESOURCE_USAGE__WORKLOAD:
				return ((InternalEList<?>)getWorkload()).basicRemove(otherEnd, msgs);
			case GrmPackage.RESOURCE_USAGE__REQUIRED_AMOUNT:
				return ((InternalEList<?>)getRequiredAmount()).basicRemove(otherEnd, msgs);
			case GrmPackage.RESOURCE_USAGE__USED_RESOURCE:
				return ((InternalEList<?>)getUsedResource()).basicRemove(otherEnd, msgs);
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
			case GrmPackage.RESOURCE_USAGE__WORKLOAD:
				return getWorkload();
			case GrmPackage.RESOURCE_USAGE__REQUIRED_AMOUNT:
				return getRequiredAmount();
			case GrmPackage.RESOURCE_USAGE__USED_RESOURCE:
				return getUsedResource();
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
			case GrmPackage.RESOURCE_USAGE__WORKLOAD:
				getWorkload().clear();
				getWorkload().addAll((Collection<? extends UsageDemand>)newValue);
				return;
			case GrmPackage.RESOURCE_USAGE__REQUIRED_AMOUNT:
				getRequiredAmount().clear();
				getRequiredAmount().addAll((Collection<? extends UsageTypedAmount>)newValue);
				return;
			case GrmPackage.RESOURCE_USAGE__USED_RESOURCE:
				getUsedResource().clear();
				getUsedResource().addAll((Collection<? extends Resource>)newValue);
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
			case GrmPackage.RESOURCE_USAGE__WORKLOAD:
				getWorkload().clear();
				return;
			case GrmPackage.RESOURCE_USAGE__REQUIRED_AMOUNT:
				getRequiredAmount().clear();
				return;
			case GrmPackage.RESOURCE_USAGE__USED_RESOURCE:
				getUsedResource().clear();
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
			case GrmPackage.RESOURCE_USAGE__WORKLOAD:
				return workload != null && !workload.isEmpty();
			case GrmPackage.RESOURCE_USAGE__REQUIRED_AMOUNT:
				return requiredAmount != null && !requiredAmount.isEmpty();
			case GrmPackage.RESOURCE_USAGE__USED_RESOURCE:
				return usedResource != null && !usedResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceUsageImpl
