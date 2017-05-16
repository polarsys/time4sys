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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.time4sys.marte.grm.AccessControlPolicy;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourceBroker;

import org.polarsys.time4sys.marte.hrm.HardwareArbiter;
import org.polarsys.time4sys.marte.hrm.HardwareMedia;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Arbiter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareArbiterImpl#getBrokedResource <em>Broked Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareArbiterImpl#getAccCtrlPolicy <em>Acc Ctrl Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareArbiterImpl#getControlledMedia <em>Controlled Media</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareArbiterImpl extends HardwareCommunicationResourceImpl implements HardwareArbiter {
	/**
	 * The cached value of the '{@link #getBrokedResource() <em>Broked Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> brokedResource;

	/**
	 * The cached value of the '{@link #getAccCtrlPolicy() <em>Acc Ctrl Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccCtrlPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessControlPolicy> accCtrlPolicy;

	/**
	 * The cached value of the '{@link #getControlledMedia() <em>Controlled Media</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledMedia()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareMedia> controlledMedia;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareArbiterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HrmPackage.Literals.HARDWARE_ARBITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getBrokedResource() {
		if (brokedResource == null) {
			brokedResource = new EObjectResolvingEList<Resource>(Resource.class, this, HrmPackage.HARDWARE_ARBITER__BROKED_RESOURCE);
		}
		return brokedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccessControlPolicy> getAccCtrlPolicy() {
		if (accCtrlPolicy == null) {
			accCtrlPolicy = new EObjectContainmentEList<AccessControlPolicy>(AccessControlPolicy.class, this, HrmPackage.HARDWARE_ARBITER__ACC_CTRL_POLICY);
		}
		return accCtrlPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareMedia> getControlledMedia() {
		if (controlledMedia == null) {
			controlledMedia = new EObjectWithInverseResolvingEList.ManyInverse<HardwareMedia>(HardwareMedia.class, this, HrmPackage.HARDWARE_ARBITER__CONTROLLED_MEDIA, HrmPackage.HARDWARE_MEDIA__ARBITERS);
		}
		return controlledMedia;
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
			case HrmPackage.HARDWARE_ARBITER__CONTROLLED_MEDIA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlledMedia()).basicAdd(otherEnd, msgs);
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
			case HrmPackage.HARDWARE_ARBITER__ACC_CTRL_POLICY:
				return ((InternalEList<?>)getAccCtrlPolicy()).basicRemove(otherEnd, msgs);
			case HrmPackage.HARDWARE_ARBITER__CONTROLLED_MEDIA:
				return ((InternalEList<?>)getControlledMedia()).basicRemove(otherEnd, msgs);
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
			case HrmPackage.HARDWARE_ARBITER__BROKED_RESOURCE:
				return getBrokedResource();
			case HrmPackage.HARDWARE_ARBITER__ACC_CTRL_POLICY:
				return getAccCtrlPolicy();
			case HrmPackage.HARDWARE_ARBITER__CONTROLLED_MEDIA:
				return getControlledMedia();
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
			case HrmPackage.HARDWARE_ARBITER__BROKED_RESOURCE:
				getBrokedResource().clear();
				getBrokedResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case HrmPackage.HARDWARE_ARBITER__ACC_CTRL_POLICY:
				getAccCtrlPolicy().clear();
				getAccCtrlPolicy().addAll((Collection<? extends AccessControlPolicy>)newValue);
				return;
			case HrmPackage.HARDWARE_ARBITER__CONTROLLED_MEDIA:
				getControlledMedia().clear();
				getControlledMedia().addAll((Collection<? extends HardwareMedia>)newValue);
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
			case HrmPackage.HARDWARE_ARBITER__BROKED_RESOURCE:
				getBrokedResource().clear();
				return;
			case HrmPackage.HARDWARE_ARBITER__ACC_CTRL_POLICY:
				getAccCtrlPolicy().clear();
				return;
			case HrmPackage.HARDWARE_ARBITER__CONTROLLED_MEDIA:
				getControlledMedia().clear();
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
			case HrmPackage.HARDWARE_ARBITER__BROKED_RESOURCE:
				return brokedResource != null && !brokedResource.isEmpty();
			case HrmPackage.HARDWARE_ARBITER__ACC_CTRL_POLICY:
				return accCtrlPolicy != null && !accCtrlPolicy.isEmpty();
			case HrmPackage.HARDWARE_ARBITER__CONTROLLED_MEDIA:
				return controlledMedia != null && !controlledMedia.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceBroker.class) {
			switch (derivedFeatureID) {
				case HrmPackage.HARDWARE_ARBITER__BROKED_RESOURCE: return GrmPackage.RESOURCE_BROKER__BROKED_RESOURCE;
				case HrmPackage.HARDWARE_ARBITER__ACC_CTRL_POLICY: return GrmPackage.RESOURCE_BROKER__ACC_CTRL_POLICY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceBroker.class) {
			switch (baseFeatureID) {
				case GrmPackage.RESOURCE_BROKER__BROKED_RESOURCE: return HrmPackage.HARDWARE_ARBITER__BROKED_RESOURCE;
				case GrmPackage.RESOURCE_BROKER__ACC_CTRL_POLICY: return HrmPackage.HARDWARE_ARBITER__ACC_CTRL_POLICY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //HardwareArbiterImpl
