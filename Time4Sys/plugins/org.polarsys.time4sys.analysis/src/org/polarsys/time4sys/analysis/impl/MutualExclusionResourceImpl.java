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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.AnalyzedSystem;
import org.polarsys.time4sys.analysis.MutualExclusionResource;
import org.polarsys.time4sys.analysis.ProtectionParameterValue;
import org.polarsys.time4sys.analysis.ProtectionProtocol;
import org.polarsys.time4sys.analysis.SynchronizableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mutual Exclusion Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.MutualExclusionResourceImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.MutualExclusionResourceImpl#getProtectionParameters <em>Protection Parameters</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.MutualExclusionResourceImpl#getProtectedBy <em>Protected By</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.MutualExclusionResourceImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MutualExclusionResourceImpl extends NamedElementImpl implements MutualExclusionResource {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchronizableElement> elements;

	/**
	 * The cached value of the '{@link #getProtectionParameters() <em>Protection Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectionParameterValue> protectionParameters;

	/**
	 * The cached value of the '{@link #getProtectedBy() <em>Protected By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectedBy()
	 * @generated
	 * @ordered
	 */
	protected ProtectionProtocol protectedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MutualExclusionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.MUTUAL_EXCLUSION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SynchronizableElement> getElements() {
		if (elements == null) {
			elements = new EObjectWithInverseResolvingEList.ManyInverse<SynchronizableElement>(SynchronizableElement.class, this, AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__ELEMENTS, AnalysisPackage.SYNCHRONIZABLE_ELEMENT__LOCKED_MUTEXES);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtectionParameterValue> getProtectionParameters() {
		if (protectionParameters == null) {
			protectionParameters = new EObjectContainmentEList<ProtectionParameterValue>(ProtectionParameterValue.class, this, AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECTION_PARAMETERS);
		}
		return protectionParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionProtocol getProtectedBy() {
		if (protectedBy != null && protectedBy.eIsProxy()) {
			InternalEObject oldProtectedBy = (InternalEObject)protectedBy;
			protectedBy = (ProtectionProtocol)eResolveProxy(oldProtectedBy);
			if (protectedBy != oldProtectedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECTED_BY, oldProtectedBy, protectedBy));
			}
		}
		return protectedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionProtocol basicGetProtectedBy() {
		return protectedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtectedBy(ProtectionProtocol newProtectedBy, NotificationChain msgs) {
		ProtectionProtocol oldProtectedBy = protectedBy;
		protectedBy = newProtectedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECTED_BY, oldProtectedBy, newProtectedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectedBy(ProtectionProtocol newProtectedBy) {
		if (newProtectedBy != protectedBy) {
			NotificationChain msgs = null;
			if (protectedBy != null)
				msgs = ((InternalEObject)protectedBy).eInverseRemove(this, AnalysisPackage.PROTECTION_PROTOCOL__MUTEXES, ProtectionProtocol.class, msgs);
			if (newProtectedBy != null)
				msgs = ((InternalEObject)newProtectedBy).eInverseAdd(this, AnalysisPackage.PROTECTION_PROTOCOL__MUTEXES, ProtectionProtocol.class, msgs);
			msgs = basicSetProtectedBy(newProtectedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECTED_BY, newProtectedBy, newProtectedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyzedSystem getParent() {
		if (eContainerFeatureID() != AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PARENT) return null;
		return (AnalyzedSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(AnalyzedSystem newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(AnalyzedSystem newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, AnalysisPackage.ANALYZED_SYSTEM__MUTEXES, AnalyzedSystem.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PARENT, newParent, newParent));
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
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECTED_BY:
				if (protectedBy != null)
					msgs = ((InternalEObject)protectedBy).eInverseRemove(this, AnalysisPackage.PROTECTION_PROTOCOL__MUTEXES, ProtectionProtocol.class, msgs);
				return basicSetProtectedBy((ProtectionProtocol)otherEnd, msgs);
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((AnalyzedSystem)otherEnd, msgs);
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
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECTION_PARAMETERS:
				return ((InternalEList<?>)getProtectionParameters()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECTED_BY:
				return basicSetProtectedBy(null, msgs);
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PARENT:
				return basicSetParent(null, msgs);
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
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PARENT:
				return eInternalContainer().eInverseRemove(this, AnalysisPackage.ANALYZED_SYSTEM__MUTEXES, AnalyzedSystem.class, msgs);
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
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__ELEMENTS:
				return getElements();
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECTION_PARAMETERS:
				return getProtectionParameters();
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECTED_BY:
				if (resolve) return getProtectedBy();
				return basicGetProtectedBy();
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PARENT:
				return getParent();
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
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends SynchronizableElement>)newValue);
				return;
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECTION_PARAMETERS:
				getProtectionParameters().clear();
				getProtectionParameters().addAll((Collection<? extends ProtectionParameterValue>)newValue);
				return;
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECTED_BY:
				setProtectedBy((ProtectionProtocol)newValue);
				return;
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PARENT:
				setParent((AnalyzedSystem)newValue);
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
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__ELEMENTS:
				getElements().clear();
				return;
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECTION_PARAMETERS:
				getProtectionParameters().clear();
				return;
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECTED_BY:
				setProtectedBy((ProtectionProtocol)null);
				return;
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PARENT:
				setParent((AnalyzedSystem)null);
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
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECTION_PARAMETERS:
				return protectionParameters != null && !protectionParameters.isEmpty();
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECTED_BY:
				return protectedBy != null;
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

} //MutualExclusionResourceImpl
