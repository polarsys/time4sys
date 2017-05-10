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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.AnalyzedSystem;
import org.polarsys.time4sys.analysis.MutualExclusionResource;
import org.polarsys.time4sys.analysis.ProtectionProtocol;
import org.polarsys.time4sys.analysis.RequiredProtectionParameter;
import org.polarsys.time4sys.analysis.ResourceProtectionParameterValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protection Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.ProtectionProtocolImpl#getProtocolName <em>Protocol Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.ProtectionProtocolImpl#getMutexes <em>Mutexes</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.ProtectionProtocolImpl#getRequiredParameters <em>Required Parameters</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.ProtectionProtocolImpl#getResourceParameterValue <em>Resource Parameter Value</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.ProtectionProtocolImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtectionProtocolImpl extends MinimalEObjectImpl.Container implements ProtectionProtocol {
	/**
	 * The default value of the '{@link #getProtocolName() <em>Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolName() <em>Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolName()
	 * @generated
	 * @ordered
	 */
	protected String protocolName = PROTOCOL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMutexes() <em>Mutexes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutexes()
	 * @generated
	 * @ordered
	 */
	protected EList<MutualExclusionResource> mutexes;

	/**
	 * The cached value of the '{@link #getRequiredParameters() <em>Required Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredProtectionParameter> requiredParameters;

	/**
	 * The cached value of the '{@link #getResourceParameterValue() <em>Resource Parameter Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceParameterValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceProtectionParameterValue> resourceParameterValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectionProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.PROTECTION_PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocolName() {
		return protocolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolName(String newProtocolName) {
		String oldProtocolName = protocolName;
		protocolName = newProtocolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.PROTECTION_PROTOCOL__PROTOCOL_NAME, oldProtocolName, protocolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MutualExclusionResource> getMutexes() {
		if (mutexes == null) {
			mutexes = new EObjectWithInverseResolvingEList<MutualExclusionResource>(MutualExclusionResource.class, this, AnalysisPackage.PROTECTION_PROTOCOL__MUTEXES, AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECTED_BY);
		}
		return mutexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredProtectionParameter> getRequiredParameters() {
		if (requiredParameters == null) {
			requiredParameters = new EObjectContainmentWithInverseEList<RequiredProtectionParameter>(RequiredProtectionParameter.class, this, AnalysisPackage.PROTECTION_PROTOCOL__REQUIRED_PARAMETERS, AnalysisPackage.REQUIRED_PROTECTION_PARAMETER__PARENT);
		}
		return requiredParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceProtectionParameterValue> getResourceParameterValue() {
		if (resourceParameterValue == null) {
			resourceParameterValue = new EObjectContainmentEList<ResourceProtectionParameterValue>(ResourceProtectionParameterValue.class, this, AnalysisPackage.PROTECTION_PROTOCOL__RESOURCE_PARAMETER_VALUE);
		}
		return resourceParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyzedSystem getParent() {
		if (eContainerFeatureID() != AnalysisPackage.PROTECTION_PROTOCOL__PARENT) return null;
		return (AnalyzedSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(AnalyzedSystem newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, AnalysisPackage.PROTECTION_PROTOCOL__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(AnalyzedSystem newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != AnalysisPackage.PROTECTION_PROTOCOL__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, AnalysisPackage.ANALYZED_SYSTEM__PROTECTION_PROTOCOLS, AnalyzedSystem.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.PROTECTION_PROTOCOL__PARENT, newParent, newParent));
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
			case AnalysisPackage.PROTECTION_PROTOCOL__MUTEXES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMutexes()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.PROTECTION_PROTOCOL__REQUIRED_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredParameters()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.PROTECTION_PROTOCOL__PARENT:
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
			case AnalysisPackage.PROTECTION_PROTOCOL__MUTEXES:
				return ((InternalEList<?>)getMutexes()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.PROTECTION_PROTOCOL__REQUIRED_PARAMETERS:
				return ((InternalEList<?>)getRequiredParameters()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.PROTECTION_PROTOCOL__RESOURCE_PARAMETER_VALUE:
				return ((InternalEList<?>)getResourceParameterValue()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.PROTECTION_PROTOCOL__PARENT:
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
			case AnalysisPackage.PROTECTION_PROTOCOL__PARENT:
				return eInternalContainer().eInverseRemove(this, AnalysisPackage.ANALYZED_SYSTEM__PROTECTION_PROTOCOLS, AnalyzedSystem.class, msgs);
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
			case AnalysisPackage.PROTECTION_PROTOCOL__PROTOCOL_NAME:
				return getProtocolName();
			case AnalysisPackage.PROTECTION_PROTOCOL__MUTEXES:
				return getMutexes();
			case AnalysisPackage.PROTECTION_PROTOCOL__REQUIRED_PARAMETERS:
				return getRequiredParameters();
			case AnalysisPackage.PROTECTION_PROTOCOL__RESOURCE_PARAMETER_VALUE:
				return getResourceParameterValue();
			case AnalysisPackage.PROTECTION_PROTOCOL__PARENT:
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
			case AnalysisPackage.PROTECTION_PROTOCOL__PROTOCOL_NAME:
				setProtocolName((String)newValue);
				return;
			case AnalysisPackage.PROTECTION_PROTOCOL__MUTEXES:
				getMutexes().clear();
				getMutexes().addAll((Collection<? extends MutualExclusionResource>)newValue);
				return;
			case AnalysisPackage.PROTECTION_PROTOCOL__REQUIRED_PARAMETERS:
				getRequiredParameters().clear();
				getRequiredParameters().addAll((Collection<? extends RequiredProtectionParameter>)newValue);
				return;
			case AnalysisPackage.PROTECTION_PROTOCOL__RESOURCE_PARAMETER_VALUE:
				getResourceParameterValue().clear();
				getResourceParameterValue().addAll((Collection<? extends ResourceProtectionParameterValue>)newValue);
				return;
			case AnalysisPackage.PROTECTION_PROTOCOL__PARENT:
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
			case AnalysisPackage.PROTECTION_PROTOCOL__PROTOCOL_NAME:
				setProtocolName(PROTOCOL_NAME_EDEFAULT);
				return;
			case AnalysisPackage.PROTECTION_PROTOCOL__MUTEXES:
				getMutexes().clear();
				return;
			case AnalysisPackage.PROTECTION_PROTOCOL__REQUIRED_PARAMETERS:
				getRequiredParameters().clear();
				return;
			case AnalysisPackage.PROTECTION_PROTOCOL__RESOURCE_PARAMETER_VALUE:
				getResourceParameterValue().clear();
				return;
			case AnalysisPackage.PROTECTION_PROTOCOL__PARENT:
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
			case AnalysisPackage.PROTECTION_PROTOCOL__PROTOCOL_NAME:
				return PROTOCOL_NAME_EDEFAULT == null ? protocolName != null : !PROTOCOL_NAME_EDEFAULT.equals(protocolName);
			case AnalysisPackage.PROTECTION_PROTOCOL__MUTEXES:
				return mutexes != null && !mutexes.isEmpty();
			case AnalysisPackage.PROTECTION_PROTOCOL__REQUIRED_PARAMETERS:
				return requiredParameters != null && !requiredParameters.isEmpty();
			case AnalysisPackage.PROTECTION_PROTOCOL__RESOURCE_PARAMETER_VALUE:
				return resourceParameterValue != null && !resourceParameterValue.isEmpty();
			case AnalysisPackage.PROTECTION_PROTOCOL__PARENT:
				return getParent() != null;
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
		result.append(" (protocolName: ");
		result.append(protocolName);
		result.append(')');
		return result.toString();
	}

} //ProtectionProtocolImpl
