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
package org.polarsys.time4sys.marte.srm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.MutualExclusionProtocol;
import org.polarsys.time4sys.marte.grm.MutualExclusionResource;
import org.polarsys.time4sys.marte.grm.ProtectionParameter;
import org.polarsys.time4sys.marte.grm.ResourceBroker;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;
import org.polarsys.time4sys.marte.srm.ConcurrentAccesProtocolKind;
import org.polarsys.time4sys.marte.srm.MutualExclusionResourceKind;
import org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Mutual Exclusion Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareMutualExclusionResourceImpl#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareMutualExclusionResourceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareMutualExclusionResourceImpl#getProtectParams <em>Protect Params</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareMutualExclusionResourceImpl#getConcurrentAccessProtocol <em>Concurrent Access Protocol</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareMutualExclusionResourceImpl#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareMutualExclusionResourceImpl#getAcquireServices <em>Acquire Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareMutualExclusionResourceImpl#getReleaseServices <em>Release Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareMutualExclusionResourceImpl#getAccessTokenElements <em>Access Token Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareMutualExclusionResourceImpl extends SoftwareSynchronizationResourceImpl implements SoftwareMutualExclusionResource {
	/**
	 * The cached value of the '{@link #getScheduler() <em>Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler()
	 * @generated
	 * @ordered
	 */
	protected ResourceBroker scheduler;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected MutualExclusionProtocol protocol;

	/**
	 * The cached value of the '{@link #getProtectParams() <em>Protect Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectParams()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectionParameter> protectParams;

	/**
	 * The default value of the '{@link #getConcurrentAccessProtocol() <em>Concurrent Access Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrentAccessProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final ConcurrentAccesProtocolKind CONCURRENT_ACCESS_PROTOCOL_EDEFAULT = ConcurrentAccesProtocolKind.PCP;

	/**
	 * The cached value of the '{@link #getConcurrentAccessProtocol() <em>Concurrent Access Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrentAccessProtocol()
	 * @generated
	 * @ordered
	 */
	protected ConcurrentAccesProtocolKind concurrentAccessProtocol = CONCURRENT_ACCESS_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final MutualExclusionResourceKind MECHANISM_EDEFAULT = MutualExclusionResourceKind.BOOLEAN_SEMAPHORE;

	/**
	 * The cached value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected MutualExclusionResourceKind mechanism = MECHANISM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAcquireServices() <em>Acquire Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquireServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> acquireServices;

	/**
	 * The cached value of the '{@link #getReleaseServices() <em>Release Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> releaseServices;

	/**
	 * The cached value of the '{@link #getAccessTokenElements() <em>Access Token Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTokenElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> accessTokenElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareMutualExclusionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceBroker getScheduler() {
		if (scheduler != null && scheduler.eIsProxy()) {
			InternalEObject oldScheduler = (InternalEObject)scheduler;
			scheduler = (ResourceBroker)eResolveProxy(oldScheduler);
			if (scheduler != oldScheduler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__SCHEDULER, oldScheduler, scheduler));
			}
		}
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceBroker basicGetScheduler() {
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler(ResourceBroker newScheduler) {
		ResourceBroker oldScheduler = scheduler;
		scheduler = newScheduler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__SCHEDULER, oldScheduler, scheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutualExclusionProtocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocol(MutualExclusionProtocol newProtocol, NotificationChain msgs) {
		MutualExclusionProtocol oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTOCOL, oldProtocol, newProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(MutualExclusionProtocol newProtocol) {
		if (newProtocol != protocol) {
			NotificationChain msgs = null;
			if (protocol != null)
				msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTOCOL, null, msgs);
			if (newProtocol != null)
				msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTOCOL, null, msgs);
			msgs = basicSetProtocol(newProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTOCOL, newProtocol, newProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtectionParameter> getProtectParams() {
		if (protectParams == null) {
			protectParams = new EObjectContainmentEList<ProtectionParameter>(ProtectionParameter.class, this, SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS);
		}
		return protectParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrentAccesProtocolKind getConcurrentAccessProtocol() {
		return concurrentAccessProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrentAccessProtocol(ConcurrentAccesProtocolKind newConcurrentAccessProtocol) {
		ConcurrentAccesProtocolKind oldConcurrentAccessProtocol = concurrentAccessProtocol;
		concurrentAccessProtocol = newConcurrentAccessProtocol == null ? CONCURRENT_ACCESS_PROTOCOL_EDEFAULT : newConcurrentAccessProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__CONCURRENT_ACCESS_PROTOCOL, oldConcurrentAccessProtocol, concurrentAccessProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutualExclusionResourceKind getMechanism() {
		return mechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMechanism(MutualExclusionResourceKind newMechanism) {
		MutualExclusionResourceKind oldMechanism = mechanism;
		mechanism = newMechanism == null ? MECHANISM_EDEFAULT : newMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__MECHANISM, oldMechanism, mechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getAcquireServices() {
		if (acquireServices == null) {
			acquireServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACQUIRE_SERVICES);
		}
		return acquireServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getReleaseServices() {
		if (releaseServices == null) {
			releaseServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__RELEASE_SERVICES);
		}
		return releaseServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getAccessTokenElements() {
		if (accessTokenElements == null) {
			accessTokenElements = new EObjectResolvingEList<ModelElement>(ModelElement.class, this, SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACCESS_TOKEN_ELEMENTS);
		}
		return accessTokenElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTOCOL:
				return basicSetProtocol(null, msgs);
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS:
				return ((InternalEList<?>)getProtectParams()).basicRemove(otherEnd, msgs);
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
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__SCHEDULER:
				if (resolve) return getScheduler();
				return basicGetScheduler();
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTOCOL:
				return getProtocol();
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS:
				return getProtectParams();
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__CONCURRENT_ACCESS_PROTOCOL:
				return getConcurrentAccessProtocol();
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__MECHANISM:
				return getMechanism();
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACQUIRE_SERVICES:
				return getAcquireServices();
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__RELEASE_SERVICES:
				return getReleaseServices();
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACCESS_TOKEN_ELEMENTS:
				return getAccessTokenElements();
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
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__SCHEDULER:
				setScheduler((ResourceBroker)newValue);
				return;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTOCOL:
				setProtocol((MutualExclusionProtocol)newValue);
				return;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS:
				getProtectParams().clear();
				getProtectParams().addAll((Collection<? extends ProtectionParameter>)newValue);
				return;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__CONCURRENT_ACCESS_PROTOCOL:
				setConcurrentAccessProtocol((ConcurrentAccesProtocolKind)newValue);
				return;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__MECHANISM:
				setMechanism((MutualExclusionResourceKind)newValue);
				return;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACQUIRE_SERVICES:
				getAcquireServices().clear();
				getAcquireServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__RELEASE_SERVICES:
				getReleaseServices().clear();
				getReleaseServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACCESS_TOKEN_ELEMENTS:
				getAccessTokenElements().clear();
				getAccessTokenElements().addAll((Collection<? extends ModelElement>)newValue);
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
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__SCHEDULER:
				setScheduler((ResourceBroker)null);
				return;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTOCOL:
				setProtocol((MutualExclusionProtocol)null);
				return;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS:
				getProtectParams().clear();
				return;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__CONCURRENT_ACCESS_PROTOCOL:
				setConcurrentAccessProtocol(CONCURRENT_ACCESS_PROTOCOL_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__MECHANISM:
				setMechanism(MECHANISM_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACQUIRE_SERVICES:
				getAcquireServices().clear();
				return;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__RELEASE_SERVICES:
				getReleaseServices().clear();
				return;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACCESS_TOKEN_ELEMENTS:
				getAccessTokenElements().clear();
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
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__SCHEDULER:
				return scheduler != null;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTOCOL:
				return protocol != null;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS:
				return protectParams != null && !protectParams.isEmpty();
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__CONCURRENT_ACCESS_PROTOCOL:
				return concurrentAccessProtocol != CONCURRENT_ACCESS_PROTOCOL_EDEFAULT;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__MECHANISM:
				return mechanism != MECHANISM_EDEFAULT;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACQUIRE_SERVICES:
				return acquireServices != null && !acquireServices.isEmpty();
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__RELEASE_SERVICES:
				return releaseServices != null && !releaseServices.isEmpty();
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACCESS_TOKEN_ELEMENTS:
				return accessTokenElements != null && !accessTokenElements.isEmpty();
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
		if (baseClass == MutualExclusionResource.class) {
			switch (derivedFeatureID) {
				case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__SCHEDULER: return GrmPackage.MUTUAL_EXCLUSION_RESOURCE__SCHEDULER;
				case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTOCOL: return GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTOCOL;
				case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS: return GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS;
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
		if (baseClass == MutualExclusionResource.class) {
			switch (baseFeatureID) {
				case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__SCHEDULER: return SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__SCHEDULER;
				case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTOCOL: return SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTOCOL;
				case GrmPackage.MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS: return SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (concurrentAccessProtocol: ");
		result.append(concurrentAccessProtocol);
		result.append(", mechanism: ");
		result.append(mechanism);
		result.append(')');
		return result.toString();
	}

} //SoftwareMutualExclusionResourceImpl
