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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.AnalyzedSystem;
import org.polarsys.time4sys.analysis.ResultContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.ResultContainerImpl#getAnalyzedSystem <em>Analyzed System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultContainerImpl extends NamedElementImpl implements ResultContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.RESULT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyzedSystem getAnalyzedSystem() {
		if (eContainerFeatureID() != AnalysisPackage.RESULT_CONTAINER__ANALYZED_SYSTEM) return null;
		return (AnalyzedSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalyzedSystem(AnalyzedSystem newAnalyzedSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnalyzedSystem, AnalysisPackage.RESULT_CONTAINER__ANALYZED_SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalyzedSystem(AnalyzedSystem newAnalyzedSystem) {
		if (newAnalyzedSystem != eInternalContainer() || (eContainerFeatureID() != AnalysisPackage.RESULT_CONTAINER__ANALYZED_SYSTEM && newAnalyzedSystem != null)) {
			if (EcoreUtil.isAncestor(this, newAnalyzedSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnalyzedSystem != null)
				msgs = ((InternalEObject)newAnalyzedSystem).eInverseAdd(this, AnalysisPackage.ANALYZED_SYSTEM__RESULT_CONTAINERS, AnalyzedSystem.class, msgs);
			msgs = basicSetAnalyzedSystem(newAnalyzedSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.RESULT_CONTAINER__ANALYZED_SYSTEM, newAnalyzedSystem, newAnalyzedSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.RESULT_CONTAINER__ANALYZED_SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAnalyzedSystem((AnalyzedSystem)otherEnd, msgs);
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
			case AnalysisPackage.RESULT_CONTAINER__ANALYZED_SYSTEM:
				return basicSetAnalyzedSystem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AnalysisPackage.RESULT_CONTAINER__ANALYZED_SYSTEM:
				return eInternalContainer().eInverseRemove(this, AnalysisPackage.ANALYZED_SYSTEM__RESULT_CONTAINERS, AnalyzedSystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisPackage.RESULT_CONTAINER__ANALYZED_SYSTEM:
				return getAnalyzedSystem();
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
			case AnalysisPackage.RESULT_CONTAINER__ANALYZED_SYSTEM:
				setAnalyzedSystem((AnalyzedSystem)newValue);
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
			case AnalysisPackage.RESULT_CONTAINER__ANALYZED_SYSTEM:
				setAnalyzedSystem((AnalyzedSystem)null);
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
			case AnalysisPackage.RESULT_CONTAINER__ANALYZED_SYSTEM:
				return getAnalyzedSystem() != null;
		}
		return super.eIsSet(featureID);
	}

} //ResultContainerImpl
