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
package org.polarsys.time4sys.analysis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.MutualExclusionResource;
import org.polarsys.time4sys.analysis.SynchronizableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronizable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.SynchronizableElementImpl#getLockedMutexes <em>Locked Mutexes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SynchronizableElementImpl extends MinimalEObjectImpl.Container implements SynchronizableElement {
	/**
	 * The cached value of the '{@link #getLockedMutexes() <em>Locked Mutexes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockedMutexes()
	 * @generated
	 * @ordered
	 */
	protected EList<MutualExclusionResource> lockedMutexes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.SYNCHRONIZABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MutualExclusionResource> getLockedMutexes() {
		if (lockedMutexes == null) {
			lockedMutexes = new EObjectWithInverseResolvingEList.ManyInverse<MutualExclusionResource>(MutualExclusionResource.class, this, AnalysisPackage.SYNCHRONIZABLE_ELEMENT__LOCKED_MUTEXES, AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__ELEMENTS);
		}
		return lockedMutexes;
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
			case AnalysisPackage.SYNCHRONIZABLE_ELEMENT__LOCKED_MUTEXES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLockedMutexes()).basicAdd(otherEnd, msgs);
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
			case AnalysisPackage.SYNCHRONIZABLE_ELEMENT__LOCKED_MUTEXES:
				return ((InternalEList<?>)getLockedMutexes()).basicRemove(otherEnd, msgs);
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
			case AnalysisPackage.SYNCHRONIZABLE_ELEMENT__LOCKED_MUTEXES:
				return getLockedMutexes();
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
			case AnalysisPackage.SYNCHRONIZABLE_ELEMENT__LOCKED_MUTEXES:
				getLockedMutexes().clear();
				getLockedMutexes().addAll((Collection<? extends MutualExclusionResource>)newValue);
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
			case AnalysisPackage.SYNCHRONIZABLE_ELEMENT__LOCKED_MUTEXES:
				getLockedMutexes().clear();
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
			case AnalysisPackage.SYNCHRONIZABLE_ELEMENT__LOCKED_MUTEXES:
				return lockedMutexes != null && !lockedMutexes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SynchronizableElementImpl
