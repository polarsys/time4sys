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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.AnalyzedSystem;
import org.polarsys.time4sys.analysis.RequiredSchedulingParameter;
import org.polarsys.time4sys.analysis.Resource;
import org.polarsys.time4sys.analysis.ResourceSchedulingParameterValue;
import org.polarsys.time4sys.analysis.SchedulableElement;
import org.polarsys.time4sys.analysis.Scheduler;
import org.polarsys.time4sys.analysis.SchedulerPolicyKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.SchedulerImpl#getPolicyKind <em>Policy Kind</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.SchedulerImpl#getScheduledElements <em>Scheduled Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.SchedulerImpl#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.SchedulerImpl#getRequiredParameters <em>Required Parameters</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.SchedulerImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.SchedulerImpl#getResourceParameterValue <em>Resource Parameter Value</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.SchedulerImpl#getPreferredPolicy <em>Preferred Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulerImpl extends NamedElementImpl implements Scheduler {
	/**
	 * The default value of the '{@link #getPolicyKind() <em>Policy Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyKind()
	 * @generated
	 * @ordered
	 */
	protected static final SchedulerPolicyKind POLICY_KIND_EDEFAULT = SchedulerPolicyKind.NO_CONTENTION;

	/**
	 * The cached value of the '{@link #getPolicyKind() <em>Policy Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyKind()
	 * @generated
	 * @ordered
	 */
	protected SchedulerPolicyKind policyKind = POLICY_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScheduledElements() <em>Scheduled Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SchedulableElement> scheduledElements;

	/**
	 * The cached value of the '{@link #getUsedBy() <em>Used By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedBy()
	 * @generated
	 * @ordered
	 */
	protected Resource usedBy;

	/**
	 * The cached value of the '{@link #getRequiredParameters() <em>Required Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredSchedulingParameter> requiredParameters;

	/**
	 * The cached value of the '{@link #getResourceParameterValue() <em>Resource Parameter Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceParameterValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceSchedulingParameterValue> resourceParameterValue;

	/**
	 * The default value of the '{@link #getPreferredPolicy() <em>Preferred Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFERRED_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferredPolicy() <em>Preferred Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredPolicy()
	 * @generated
	 * @ordered
	 */
	protected String preferredPolicy = PREFERRED_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerPolicyKind getPolicyKind() {
		return policyKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyKind(SchedulerPolicyKind newPolicyKind) {
		SchedulerPolicyKind oldPolicyKind = policyKind;
		policyKind = newPolicyKind == null ? POLICY_KIND_EDEFAULT : newPolicyKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.SCHEDULER__POLICY_KIND, oldPolicyKind, policyKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchedulableElement> getScheduledElements() {
		if (scheduledElements == null) {
			scheduledElements = new EObjectWithInverseResolvingEList<SchedulableElement>(SchedulableElement.class, this, AnalysisPackage.SCHEDULER__SCHEDULED_ELEMENTS, AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULED_BY);
		}
		return scheduledElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getUsedBy() {
		if (usedBy != null && usedBy.eIsProxy()) {
			InternalEObject oldUsedBy = (InternalEObject)usedBy;
			usedBy = (Resource)eResolveProxy(oldUsedBy);
			if (usedBy != oldUsedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.SCHEDULER__USED_BY, oldUsedBy, usedBy));
			}
		}
		return usedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetUsedBy() {
		return usedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedBy(Resource newUsedBy, NotificationChain msgs) {
		Resource oldUsedBy = usedBy;
		usedBy = newUsedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.SCHEDULER__USED_BY, oldUsedBy, newUsedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedBy(Resource newUsedBy) {
		if (newUsedBy != usedBy) {
			NotificationChain msgs = null;
			if (usedBy != null)
				msgs = ((InternalEObject)usedBy).eInverseRemove(this, AnalysisPackage.RESOURCE__SCHEDULER, Resource.class, msgs);
			if (newUsedBy != null)
				msgs = ((InternalEObject)newUsedBy).eInverseAdd(this, AnalysisPackage.RESOURCE__SCHEDULER, Resource.class, msgs);
			msgs = basicSetUsedBy(newUsedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.SCHEDULER__USED_BY, newUsedBy, newUsedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredSchedulingParameter> getRequiredParameters() {
		if (requiredParameters == null) {
			requiredParameters = new EObjectContainmentWithInverseEList<RequiredSchedulingParameter>(RequiredSchedulingParameter.class, this, AnalysisPackage.SCHEDULER__REQUIRED_PARAMETERS, AnalysisPackage.REQUIRED_SCHEDULING_PARAMETER__PARENT);
		}
		return requiredParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyzedSystem getParent() {
		if (eContainerFeatureID() != AnalysisPackage.SCHEDULER__PARENT) return null;
		return (AnalyzedSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(AnalyzedSystem newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, AnalysisPackage.SCHEDULER__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(AnalyzedSystem newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != AnalysisPackage.SCHEDULER__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, AnalysisPackage.ANALYZED_SYSTEM__SCHEDULERS, AnalyzedSystem.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.SCHEDULER__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceSchedulingParameterValue> getResourceParameterValue() {
		if (resourceParameterValue == null) {
			resourceParameterValue = new EObjectContainmentEList<ResourceSchedulingParameterValue>(ResourceSchedulingParameterValue.class, this, AnalysisPackage.SCHEDULER__RESOURCE_PARAMETER_VALUE);
		}
		return resourceParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreferredPolicy() {
		return preferredPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredPolicy(String newPreferredPolicy) {
		String oldPreferredPolicy = preferredPolicy;
		preferredPolicy = newPreferredPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.SCHEDULER__PREFERRED_POLICY, oldPreferredPolicy, preferredPolicy));
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
			case AnalysisPackage.SCHEDULER__SCHEDULED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduledElements()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.SCHEDULER__USED_BY:
				if (usedBy != null)
					msgs = ((InternalEObject)usedBy).eInverseRemove(this, AnalysisPackage.RESOURCE__SCHEDULER, Resource.class, msgs);
				return basicSetUsedBy((Resource)otherEnd, msgs);
			case AnalysisPackage.SCHEDULER__REQUIRED_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredParameters()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.SCHEDULER__PARENT:
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
			case AnalysisPackage.SCHEDULER__SCHEDULED_ELEMENTS:
				return ((InternalEList<?>)getScheduledElements()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.SCHEDULER__USED_BY:
				return basicSetUsedBy(null, msgs);
			case AnalysisPackage.SCHEDULER__REQUIRED_PARAMETERS:
				return ((InternalEList<?>)getRequiredParameters()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.SCHEDULER__PARENT:
				return basicSetParent(null, msgs);
			case AnalysisPackage.SCHEDULER__RESOURCE_PARAMETER_VALUE:
				return ((InternalEList<?>)getResourceParameterValue()).basicRemove(otherEnd, msgs);
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
			case AnalysisPackage.SCHEDULER__PARENT:
				return eInternalContainer().eInverseRemove(this, AnalysisPackage.ANALYZED_SYSTEM__SCHEDULERS, AnalyzedSystem.class, msgs);
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
			case AnalysisPackage.SCHEDULER__POLICY_KIND:
				return getPolicyKind();
			case AnalysisPackage.SCHEDULER__SCHEDULED_ELEMENTS:
				return getScheduledElements();
			case AnalysisPackage.SCHEDULER__USED_BY:
				if (resolve) return getUsedBy();
				return basicGetUsedBy();
			case AnalysisPackage.SCHEDULER__REQUIRED_PARAMETERS:
				return getRequiredParameters();
			case AnalysisPackage.SCHEDULER__PARENT:
				return getParent();
			case AnalysisPackage.SCHEDULER__RESOURCE_PARAMETER_VALUE:
				return getResourceParameterValue();
			case AnalysisPackage.SCHEDULER__PREFERRED_POLICY:
				return getPreferredPolicy();
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
			case AnalysisPackage.SCHEDULER__POLICY_KIND:
				setPolicyKind((SchedulerPolicyKind)newValue);
				return;
			case AnalysisPackage.SCHEDULER__SCHEDULED_ELEMENTS:
				getScheduledElements().clear();
				getScheduledElements().addAll((Collection<? extends SchedulableElement>)newValue);
				return;
			case AnalysisPackage.SCHEDULER__USED_BY:
				setUsedBy((Resource)newValue);
				return;
			case AnalysisPackage.SCHEDULER__REQUIRED_PARAMETERS:
				getRequiredParameters().clear();
				getRequiredParameters().addAll((Collection<? extends RequiredSchedulingParameter>)newValue);
				return;
			case AnalysisPackage.SCHEDULER__PARENT:
				setParent((AnalyzedSystem)newValue);
				return;
			case AnalysisPackage.SCHEDULER__RESOURCE_PARAMETER_VALUE:
				getResourceParameterValue().clear();
				getResourceParameterValue().addAll((Collection<? extends ResourceSchedulingParameterValue>)newValue);
				return;
			case AnalysisPackage.SCHEDULER__PREFERRED_POLICY:
				setPreferredPolicy((String)newValue);
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
			case AnalysisPackage.SCHEDULER__POLICY_KIND:
				setPolicyKind(POLICY_KIND_EDEFAULT);
				return;
			case AnalysisPackage.SCHEDULER__SCHEDULED_ELEMENTS:
				getScheduledElements().clear();
				return;
			case AnalysisPackage.SCHEDULER__USED_BY:
				setUsedBy((Resource)null);
				return;
			case AnalysisPackage.SCHEDULER__REQUIRED_PARAMETERS:
				getRequiredParameters().clear();
				return;
			case AnalysisPackage.SCHEDULER__PARENT:
				setParent((AnalyzedSystem)null);
				return;
			case AnalysisPackage.SCHEDULER__RESOURCE_PARAMETER_VALUE:
				getResourceParameterValue().clear();
				return;
			case AnalysisPackage.SCHEDULER__PREFERRED_POLICY:
				setPreferredPolicy(PREFERRED_POLICY_EDEFAULT);
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
			case AnalysisPackage.SCHEDULER__POLICY_KIND:
				return policyKind != POLICY_KIND_EDEFAULT;
			case AnalysisPackage.SCHEDULER__SCHEDULED_ELEMENTS:
				return scheduledElements != null && !scheduledElements.isEmpty();
			case AnalysisPackage.SCHEDULER__USED_BY:
				return usedBy != null;
			case AnalysisPackage.SCHEDULER__REQUIRED_PARAMETERS:
				return requiredParameters != null && !requiredParameters.isEmpty();
			case AnalysisPackage.SCHEDULER__PARENT:
				return getParent() != null;
			case AnalysisPackage.SCHEDULER__RESOURCE_PARAMETER_VALUE:
				return resourceParameterValue != null && !resourceParameterValue.isEmpty();
			case AnalysisPackage.SCHEDULER__PREFERRED_POLICY:
				return PREFERRED_POLICY_EDEFAULT == null ? preferredPolicy != null : !PREFERRED_POLICY_EDEFAULT.equals(preferredPolicy);
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
		result.append(" (policyKind: ");
		result.append(policyKind);
		result.append(", preferredPolicy: ");
		result.append(preferredPolicy);
		result.append(')');
		return result.toString();
	}

} //SchedulerImpl
