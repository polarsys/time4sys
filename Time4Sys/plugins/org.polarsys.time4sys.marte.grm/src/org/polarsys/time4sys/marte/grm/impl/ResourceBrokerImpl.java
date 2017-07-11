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
package org.polarsys.time4sys.marte.grm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.marte.grm.AccessControlPolicy;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourceBroker;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Broker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourceBrokerImpl#getBrokedResource <em>Broked Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourceBrokerImpl#getAccCtrlPolicy <em>Acc Ctrl Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceBrokerImpl extends ResourceImpl implements ResourceBroker {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceBrokerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.RESOURCE_BROKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getBrokedResource() {
		if (brokedResource == null) {
			brokedResource = new EObjectResolvingEList<Resource>(Resource.class, this, GrmPackage.RESOURCE_BROKER__BROKED_RESOURCE);
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
			accCtrlPolicy = new EObjectContainmentEList<AccessControlPolicy>(AccessControlPolicy.class, this, GrmPackage.RESOURCE_BROKER__ACC_CTRL_POLICY);
		}
		return accCtrlPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrmPackage.RESOURCE_BROKER__ACC_CTRL_POLICY:
				return ((InternalEList<?>)getAccCtrlPolicy()).basicRemove(otherEnd, msgs);
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
			case GrmPackage.RESOURCE_BROKER__BROKED_RESOURCE:
				return getBrokedResource();
			case GrmPackage.RESOURCE_BROKER__ACC_CTRL_POLICY:
				return getAccCtrlPolicy();
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
			case GrmPackage.RESOURCE_BROKER__BROKED_RESOURCE:
				getBrokedResource().clear();
				getBrokedResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case GrmPackage.RESOURCE_BROKER__ACC_CTRL_POLICY:
				getAccCtrlPolicy().clear();
				getAccCtrlPolicy().addAll((Collection<? extends AccessControlPolicy>)newValue);
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
			case GrmPackage.RESOURCE_BROKER__BROKED_RESOURCE:
				getBrokedResource().clear();
				return;
			case GrmPackage.RESOURCE_BROKER__ACC_CTRL_POLICY:
				getAccCtrlPolicy().clear();
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
			case GrmPackage.RESOURCE_BROKER__BROKED_RESOURCE:
				return brokedResource != null && !brokedResource.isEmpty();
			case GrmPackage.RESOURCE_BROKER__ACC_CTRL_POLICY:
				return accCtrlPolicy != null && !accCtrlPolicy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceBrokerImpl
