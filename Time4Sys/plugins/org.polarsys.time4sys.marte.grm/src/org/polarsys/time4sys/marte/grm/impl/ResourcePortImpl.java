/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work and others.
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.ResourceInterface;
import org.polarsys.time4sys.marte.grm.ResourcePort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourcePortImpl#getPInterface <em>PInterface</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourcePortImpl#getRInterface <em>RInterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourcePortImpl extends CommunicationEndPointImpl implements ResourcePort {
	/**
	 * The cached value of the '{@link #getPInterface() <em>PInterface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceInterface> pInterface;

	/**
	 * The cached value of the '{@link #getRInterface() <em>RInterface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceInterface> rInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.RESOURCE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInterface> getPInterface() {
		if (pInterface == null) {
			pInterface = new EObjectResolvingEList<ResourceInterface>(ResourceInterface.class, this, GrmPackage.RESOURCE_PORT__PINTERFACE);
		}
		return pInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInterface> getRInterface() {
		if (rInterface == null) {
			rInterface = new EObjectResolvingEList<ResourceInterface>(ResourceInterface.class, this, GrmPackage.RESOURCE_PORT__RINTERFACE);
		}
		return rInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrmPackage.RESOURCE_PORT__PINTERFACE:
				return getPInterface();
			case GrmPackage.RESOURCE_PORT__RINTERFACE:
				return getRInterface();
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
			case GrmPackage.RESOURCE_PORT__PINTERFACE:
				getPInterface().clear();
				getPInterface().addAll((Collection<? extends ResourceInterface>)newValue);
				return;
			case GrmPackage.RESOURCE_PORT__RINTERFACE:
				getRInterface().clear();
				getRInterface().addAll((Collection<? extends ResourceInterface>)newValue);
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
			case GrmPackage.RESOURCE_PORT__PINTERFACE:
				getPInterface().clear();
				return;
			case GrmPackage.RESOURCE_PORT__RINTERFACE:
				getRInterface().clear();
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
			case GrmPackage.RESOURCE_PORT__PINTERFACE:
				return pInterface != null && !pInterface.isEmpty();
			case GrmPackage.RESOURCE_PORT__RINTERFACE:
				return rInterface != null && !rInterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourcePortImpl
