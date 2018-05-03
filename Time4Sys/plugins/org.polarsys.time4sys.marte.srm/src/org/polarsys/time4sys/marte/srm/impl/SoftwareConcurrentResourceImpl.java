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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.srm.MemoryPartition;
import org.polarsys.time4sys.marte.srm.MessageComResource;
import org.polarsys.time4sys.marte.srm.NotificationResource;
import org.polarsys.time4sys.marte.srm.SharedDataComResource;
import org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource;
import org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Concurrent Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getActivateServices <em>Activate Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getResumeServices <em>Resume Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getSuspendServices <em>Suspend Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getEnableConcurrencyServices <em>Enable Concurrency Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getDisableConcurrencyServices <em>Disable Concurrency Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getTerminateServices <em>Terminate Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getAdressSpace <em>Adress Space</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getPeriodElements <em>Period Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getActivationCapacity <em>Activation Capacity</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getPriorityElements <em>Priority Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getStackSizeElements <em>Stack Size Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getHeapSizeElements <em>Heap Size Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getSharedDataResources <em>Shared Data Resources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getMessageResources <em>Message Resources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getMutualExclusionResources <em>Mutual Exclusion Resources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getNotificationResources <em>Notification Resources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getEntryPoints <em>Entry Points</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl#getArrivalPattern <em>Arrival Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SoftwareConcurrentResourceImpl extends SoftwareResourceImpl implements SoftwareConcurrentResource {
	/**
	 * The cached value of the '{@link #getActivateServices() <em>Activate Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivateServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> activateServices;

	/**
	 * The cached value of the '{@link #getResumeServices() <em>Resume Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResumeServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> resumeServices;

	/**
	 * The cached value of the '{@link #getSuspendServices() <em>Suspend Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspendServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> suspendServices;

	/**
	 * The cached value of the '{@link #getEnableConcurrencyServices() <em>Enable Concurrency Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableConcurrencyServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> enableConcurrencyServices;

	/**
	 * The cached value of the '{@link #getDisableConcurrencyServices() <em>Disable Concurrency Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableConcurrencyServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> disableConcurrencyServices;

	/**
	 * The cached value of the '{@link #getTerminateServices() <em>Terminate Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminateServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> terminateServices;

	/**
	 * The cached value of the '{@link #getPeriodElements() <em>Period Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> periodElements;

	/**
	 * The default value of the '{@link #getActivationCapacity() <em>Activation Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTIVATION_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActivationCapacity() <em>Activation Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationCapacity()
	 * @generated
	 * @ordered
	 */
	protected int activationCapacity = ACTIVATION_CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPriorityElements() <em>Priority Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> priorityElements;

	/**
	 * The cached value of the '{@link #getStackSizeElements() <em>Stack Size Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackSizeElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stackSizeElements;

	/**
	 * The cached value of the '{@link #getHeapSizeElements() <em>Heap Size Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapSizeElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> heapSizeElements;

	/**
	 * The cached value of the '{@link #getSharedDataResources() <em>Shared Data Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedDataResources()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedDataComResource> sharedDataResources;

	/**
	 * The cached value of the '{@link #getMessageResources() <em>Message Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageResources()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageComResource> messageResources;

	/**
	 * The cached value of the '{@link #getMutualExclusionResources() <em>Mutual Exclusion Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutualExclusionResources()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareMutualExclusionResource> mutualExclusionResources;

	/**
	 * The cached value of the '{@link #getNotificationResources() <em>Notification Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationResources()
	 * @generated
	 * @ordered
	 */
	protected EList<NotificationResource> notificationResources;

	/**
	 * The cached value of the '{@link #getEntryPoints() <em>Entry Points</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> entryPoints;

	/**
	 * The default value of the '{@link #getArrivalPattern() <em>Arrival Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String ARRIVAL_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrivalPattern() <em>Arrival Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalPattern()
	 * @generated
	 * @ordered
	 */
	protected String arrivalPattern = ARRIVAL_PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareConcurrentResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getActivateServices() {
		if (activateServices == null) {
			activateServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATE_SERVICES);
		}
		return activateServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getResumeServices() {
		if (resumeServices == null) {
			resumeServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__RESUME_SERVICES);
		}
		return resumeServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getSuspendServices() {
		if (suspendServices == null) {
			suspendServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__SUSPEND_SERVICES);
		}
		return suspendServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getEnableConcurrencyServices() {
		if (enableConcurrencyServices == null) {
			enableConcurrencyServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES);
		}
		return enableConcurrencyServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getDisableConcurrencyServices() {
		if (disableConcurrencyServices == null) {
			disableConcurrencyServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES);
		}
		return disableConcurrencyServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getTerminateServices() {
		if (terminateServices == null) {
			terminateServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__TERMINATE_SERVICES);
		}
		return terminateServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryPartition getAdressSpace() {
		if (eContainerFeatureID() != SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE) return null;
		return (MemoryPartition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdressSpace(MemoryPartition newAdressSpace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAdressSpace, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdressSpace(MemoryPartition newAdressSpace) {
		if (newAdressSpace != eInternalContainer() || (eContainerFeatureID() != SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE && newAdressSpace != null)) {
			if (EcoreUtil.isAncestor(this, newAdressSpace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAdressSpace != null)
				msgs = ((InternalEObject)newAdressSpace).eInverseAdd(this, SrmPackage.MEMORY_PARTITION__CONCURRENT_RESOURCES, MemoryPartition.class, msgs);
			msgs = basicSetAdressSpace(newAdressSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE, newAdressSpace, newAdressSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPeriodElements() {
		if (periodElements == null) {
			periodElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__PERIOD_ELEMENTS);
		}
		return periodElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActivationCapacity() {
		return activationCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationCapacity(int newActivationCapacity) {
		int oldActivationCapacity = activationCapacity;
		activationCapacity = newActivationCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY, oldActivationCapacity, activationCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPriorityElements() {
		if (priorityElements == null) {
			priorityElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS);
		}
		return priorityElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStackSizeElements() {
		if (stackSizeElements == null) {
			stackSizeElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS);
		}
		return stackSizeElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHeapSizeElements() {
		if (heapSizeElements == null) {
			heapSizeElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS);
		}
		return heapSizeElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedDataComResource> getSharedDataResources() {
		if (sharedDataResources == null) {
			sharedDataResources = new EObjectResolvingEList<SharedDataComResource>(SharedDataComResource.class, this, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__SHARED_DATA_RESOURCES);
		}
		return sharedDataResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageComResource> getMessageResources() {
		if (messageResources == null) {
			messageResources = new EObjectResolvingEList<MessageComResource>(MessageComResource.class, this, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__MESSAGE_RESOURCES);
		}
		return messageResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareMutualExclusionResource> getMutualExclusionResources() {
		if (mutualExclusionResources == null) {
			mutualExclusionResources = new EObjectResolvingEList<SoftwareMutualExclusionResource>(SoftwareMutualExclusionResource.class, this, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES);
		}
		return mutualExclusionResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NotificationResource> getNotificationResources() {
		if (notificationResources == null) {
			notificationResources = new EObjectResolvingEList<NotificationResource>(NotificationResource.class, this, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES);
		}
		return notificationResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEntryPoints() {
		if (entryPoints == null) {
			entryPoints = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ENTRY_POINTS);
		}
		return entryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArrivalPattern() {
		return arrivalPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalPattern(String newArrivalPattern) {
		String oldArrivalPattern = arrivalPattern;
		arrivalPattern = newArrivalPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ARRIVAL_PATTERN, oldArrivalPattern, arrivalPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAdressSpace((MemoryPartition)otherEnd, msgs);
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
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE:
				return basicSetAdressSpace(null, msgs);
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
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE:
				return eInternalContainer().eInverseRemove(this, SrmPackage.MEMORY_PARTITION__CONCURRENT_RESOURCES, MemoryPartition.class, msgs);
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
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATE_SERVICES:
				return getActivateServices();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__RESUME_SERVICES:
				return getResumeServices();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__SUSPEND_SERVICES:
				return getSuspendServices();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES:
				return getEnableConcurrencyServices();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES:
				return getDisableConcurrencyServices();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__TERMINATE_SERVICES:
				return getTerminateServices();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE:
				return getAdressSpace();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__PERIOD_ELEMENTS:
				return getPeriodElements();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY:
				return getActivationCapacity();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS:
				return getPriorityElements();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS:
				return getStackSizeElements();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS:
				return getHeapSizeElements();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__SHARED_DATA_RESOURCES:
				return getSharedDataResources();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__MESSAGE_RESOURCES:
				return getMessageResources();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES:
				return getMutualExclusionResources();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES:
				return getNotificationResources();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ENTRY_POINTS:
				return getEntryPoints();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ARRIVAL_PATTERN:
				return getArrivalPattern();
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
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATE_SERVICES:
				getActivateServices().clear();
				getActivateServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__RESUME_SERVICES:
				getResumeServices().clear();
				getResumeServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__SUSPEND_SERVICES:
				getSuspendServices().clear();
				getSuspendServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES:
				getEnableConcurrencyServices().clear();
				getEnableConcurrencyServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES:
				getDisableConcurrencyServices().clear();
				getDisableConcurrencyServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__TERMINATE_SERVICES:
				getTerminateServices().clear();
				getTerminateServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE:
				setAdressSpace((MemoryPartition)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__PERIOD_ELEMENTS:
				getPeriodElements().clear();
				getPeriodElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY:
				setActivationCapacity((Integer)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS:
				getPriorityElements().clear();
				getPriorityElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS:
				getStackSizeElements().clear();
				getStackSizeElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS:
				getHeapSizeElements().clear();
				getHeapSizeElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__SHARED_DATA_RESOURCES:
				getSharedDataResources().clear();
				getSharedDataResources().addAll((Collection<? extends SharedDataComResource>)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__MESSAGE_RESOURCES:
				getMessageResources().clear();
				getMessageResources().addAll((Collection<? extends MessageComResource>)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES:
				getMutualExclusionResources().clear();
				getMutualExclusionResources().addAll((Collection<? extends SoftwareMutualExclusionResource>)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES:
				getNotificationResources().clear();
				getNotificationResources().addAll((Collection<? extends NotificationResource>)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ENTRY_POINTS:
				getEntryPoints().clear();
				getEntryPoints().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ARRIVAL_PATTERN:
				setArrivalPattern((String)newValue);
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
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATE_SERVICES:
				getActivateServices().clear();
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__RESUME_SERVICES:
				getResumeServices().clear();
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__SUSPEND_SERVICES:
				getSuspendServices().clear();
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES:
				getEnableConcurrencyServices().clear();
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES:
				getDisableConcurrencyServices().clear();
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__TERMINATE_SERVICES:
				getTerminateServices().clear();
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE:
				setAdressSpace((MemoryPartition)null);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__PERIOD_ELEMENTS:
				getPeriodElements().clear();
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY:
				setActivationCapacity(ACTIVATION_CAPACITY_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS:
				getPriorityElements().clear();
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS:
				getStackSizeElements().clear();
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS:
				getHeapSizeElements().clear();
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__SHARED_DATA_RESOURCES:
				getSharedDataResources().clear();
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__MESSAGE_RESOURCES:
				getMessageResources().clear();
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES:
				getMutualExclusionResources().clear();
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES:
				getNotificationResources().clear();
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ENTRY_POINTS:
				getEntryPoints().clear();
				return;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ARRIVAL_PATTERN:
				setArrivalPattern(ARRIVAL_PATTERN_EDEFAULT);
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
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATE_SERVICES:
				return activateServices != null && !activateServices.isEmpty();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__RESUME_SERVICES:
				return resumeServices != null && !resumeServices.isEmpty();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__SUSPEND_SERVICES:
				return suspendServices != null && !suspendServices.isEmpty();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES:
				return enableConcurrencyServices != null && !enableConcurrencyServices.isEmpty();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES:
				return disableConcurrencyServices != null && !disableConcurrencyServices.isEmpty();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__TERMINATE_SERVICES:
				return terminateServices != null && !terminateServices.isEmpty();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE:
				return getAdressSpace() != null;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__PERIOD_ELEMENTS:
				return periodElements != null && !periodElements.isEmpty();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY:
				return activationCapacity != ACTIVATION_CAPACITY_EDEFAULT;
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS:
				return priorityElements != null && !priorityElements.isEmpty();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS:
				return stackSizeElements != null && !stackSizeElements.isEmpty();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS:
				return heapSizeElements != null && !heapSizeElements.isEmpty();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__SHARED_DATA_RESOURCES:
				return sharedDataResources != null && !sharedDataResources.isEmpty();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__MESSAGE_RESOURCES:
				return messageResources != null && !messageResources.isEmpty();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES:
				return mutualExclusionResources != null && !mutualExclusionResources.isEmpty();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES:
				return notificationResources != null && !notificationResources.isEmpty();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ENTRY_POINTS:
				return entryPoints != null && !entryPoints.isEmpty();
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ARRIVAL_PATTERN:
				return ARRIVAL_PATTERN_EDEFAULT == null ? arrivalPattern != null : !ARRIVAL_PATTERN_EDEFAULT.equals(arrivalPattern);
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
		result.append(" (periodElements: ");
		result.append(periodElements);
		result.append(", activationCapacity: ");
		result.append(activationCapacity);
		result.append(", priorityElements: ");
		result.append(priorityElements);
		result.append(", stackSizeElements: ");
		result.append(stackSizeElements);
		result.append(", heapSizeElements: ");
		result.append(heapSizeElements);
		result.append(", entryPoints: ");
		result.append(entryPoints);
		result.append(", arrivalPattern: ");
		result.append(arrivalPattern);
		result.append(')');
		return result.toString();
	}

} //SoftwareConcurrentResourceImpl
