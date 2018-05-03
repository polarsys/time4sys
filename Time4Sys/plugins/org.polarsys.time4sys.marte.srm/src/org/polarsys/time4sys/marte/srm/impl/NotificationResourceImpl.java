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
package org.polarsys.time4sys.marte.srm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.srm.NotificationResource;
import org.polarsys.time4sys.marte.srm.NotificationResourceKind;
import org.polarsys.time4sys.marte.srm.OccurencePolicyKind;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.NotificationResourceImpl#getFlushServices <em>Flush Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.NotificationResourceImpl#getSignalServices <em>Signal Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.NotificationResourceImpl#getWaitServices <em>Wait Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.NotificationResourceImpl#getClearServices <em>Clear Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.NotificationResourceImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.NotificationResourceImpl#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.NotificationResourceImpl#getOccurenceCountElements <em>Occurence Count Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.NotificationResourceImpl#getMaskElements <em>Mask Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationResourceImpl extends SoftwareSynchronizationResourceImpl implements NotificationResource {
	/**
	 * The cached value of the '{@link #getFlushServices() <em>Flush Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlushServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> flushServices;

	/**
	 * The cached value of the '{@link #getSignalServices() <em>Signal Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> signalServices;

	/**
	 * The cached value of the '{@link #getWaitServices() <em>Wait Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> waitServices;

	/**
	 * The cached value of the '{@link #getClearServices() <em>Clear Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> clearServices;

	/**
	 * The default value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final OccurencePolicyKind POLICY_EDEFAULT = OccurencePolicyKind.MEMORIZED;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected OccurencePolicyKind policy = POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final NotificationResourceKind MECHANISM_EDEFAULT = NotificationResourceKind.BARRIER;

	/**
	 * The cached value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected NotificationResourceKind mechanism = MECHANISM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOccurenceCountElements() <em>Occurence Count Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurenceCountElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> occurenceCountElements;

	/**
	 * The cached value of the '{@link #getMaskElements() <em>Mask Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> maskElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.NOTIFICATION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getFlushServices() {
		if (flushServices == null) {
			flushServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.NOTIFICATION_RESOURCE__FLUSH_SERVICES);
		}
		return flushServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getSignalServices() {
		if (signalServices == null) {
			signalServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.NOTIFICATION_RESOURCE__SIGNAL_SERVICES);
		}
		return signalServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getWaitServices() {
		if (waitServices == null) {
			waitServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.NOTIFICATION_RESOURCE__WAIT_SERVICES);
		}
		return waitServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getClearServices() {
		if (clearServices == null) {
			clearServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.NOTIFICATION_RESOURCE__CLEAR_SERVICES);
		}
		return clearServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurencePolicyKind getPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy(OccurencePolicyKind newPolicy) {
		OccurencePolicyKind oldPolicy = policy;
		policy = newPolicy == null ? POLICY_EDEFAULT : newPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.NOTIFICATION_RESOURCE__POLICY, oldPolicy, policy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationResourceKind getMechanism() {
		return mechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMechanism(NotificationResourceKind newMechanism) {
		NotificationResourceKind oldMechanism = mechanism;
		mechanism = newMechanism == null ? MECHANISM_EDEFAULT : newMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.NOTIFICATION_RESOURCE__MECHANISM, oldMechanism, mechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOccurenceCountElements() {
		if (occurenceCountElements == null) {
			occurenceCountElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.NOTIFICATION_RESOURCE__OCCURENCE_COUNT_ELEMENTS);
		}
		return occurenceCountElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMaskElements() {
		if (maskElements == null) {
			maskElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.NOTIFICATION_RESOURCE__MASK_ELEMENTS);
		}
		return maskElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SrmPackage.NOTIFICATION_RESOURCE__FLUSH_SERVICES:
				return getFlushServices();
			case SrmPackage.NOTIFICATION_RESOURCE__SIGNAL_SERVICES:
				return getSignalServices();
			case SrmPackage.NOTIFICATION_RESOURCE__WAIT_SERVICES:
				return getWaitServices();
			case SrmPackage.NOTIFICATION_RESOURCE__CLEAR_SERVICES:
				return getClearServices();
			case SrmPackage.NOTIFICATION_RESOURCE__POLICY:
				return getPolicy();
			case SrmPackage.NOTIFICATION_RESOURCE__MECHANISM:
				return getMechanism();
			case SrmPackage.NOTIFICATION_RESOURCE__OCCURENCE_COUNT_ELEMENTS:
				return getOccurenceCountElements();
			case SrmPackage.NOTIFICATION_RESOURCE__MASK_ELEMENTS:
				return getMaskElements();
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
			case SrmPackage.NOTIFICATION_RESOURCE__FLUSH_SERVICES:
				getFlushServices().clear();
				getFlushServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.NOTIFICATION_RESOURCE__SIGNAL_SERVICES:
				getSignalServices().clear();
				getSignalServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.NOTIFICATION_RESOURCE__WAIT_SERVICES:
				getWaitServices().clear();
				getWaitServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.NOTIFICATION_RESOURCE__CLEAR_SERVICES:
				getClearServices().clear();
				getClearServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.NOTIFICATION_RESOURCE__POLICY:
				setPolicy((OccurencePolicyKind)newValue);
				return;
			case SrmPackage.NOTIFICATION_RESOURCE__MECHANISM:
				setMechanism((NotificationResourceKind)newValue);
				return;
			case SrmPackage.NOTIFICATION_RESOURCE__OCCURENCE_COUNT_ELEMENTS:
				getOccurenceCountElements().clear();
				getOccurenceCountElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.NOTIFICATION_RESOURCE__MASK_ELEMENTS:
				getMaskElements().clear();
				getMaskElements().addAll((Collection<? extends String>)newValue);
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
			case SrmPackage.NOTIFICATION_RESOURCE__FLUSH_SERVICES:
				getFlushServices().clear();
				return;
			case SrmPackage.NOTIFICATION_RESOURCE__SIGNAL_SERVICES:
				getSignalServices().clear();
				return;
			case SrmPackage.NOTIFICATION_RESOURCE__WAIT_SERVICES:
				getWaitServices().clear();
				return;
			case SrmPackage.NOTIFICATION_RESOURCE__CLEAR_SERVICES:
				getClearServices().clear();
				return;
			case SrmPackage.NOTIFICATION_RESOURCE__POLICY:
				setPolicy(POLICY_EDEFAULT);
				return;
			case SrmPackage.NOTIFICATION_RESOURCE__MECHANISM:
				setMechanism(MECHANISM_EDEFAULT);
				return;
			case SrmPackage.NOTIFICATION_RESOURCE__OCCURENCE_COUNT_ELEMENTS:
				getOccurenceCountElements().clear();
				return;
			case SrmPackage.NOTIFICATION_RESOURCE__MASK_ELEMENTS:
				getMaskElements().clear();
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
			case SrmPackage.NOTIFICATION_RESOURCE__FLUSH_SERVICES:
				return flushServices != null && !flushServices.isEmpty();
			case SrmPackage.NOTIFICATION_RESOURCE__SIGNAL_SERVICES:
				return signalServices != null && !signalServices.isEmpty();
			case SrmPackage.NOTIFICATION_RESOURCE__WAIT_SERVICES:
				return waitServices != null && !waitServices.isEmpty();
			case SrmPackage.NOTIFICATION_RESOURCE__CLEAR_SERVICES:
				return clearServices != null && !clearServices.isEmpty();
			case SrmPackage.NOTIFICATION_RESOURCE__POLICY:
				return policy != POLICY_EDEFAULT;
			case SrmPackage.NOTIFICATION_RESOURCE__MECHANISM:
				return mechanism != MECHANISM_EDEFAULT;
			case SrmPackage.NOTIFICATION_RESOURCE__OCCURENCE_COUNT_ELEMENTS:
				return occurenceCountElements != null && !occurenceCountElements.isEmpty();
			case SrmPackage.NOTIFICATION_RESOURCE__MASK_ELEMENTS:
				return maskElements != null && !maskElements.isEmpty();
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
		result.append(" (policy: ");
		result.append(policy);
		result.append(", mechanism: ");
		result.append(mechanism);
		result.append(", occurenceCountElements: ");
		result.append(occurenceCountElements);
		result.append(", maskElements: ");
		result.append(maskElements);
		result.append(')');
		return result.toString();
	}

} //NotificationResourceImpl
