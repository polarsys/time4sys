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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourceControlPolicy;
import org.polarsys.time4sys.marte.grm.ResourceManager;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.grm.impl.SchedulableResourceImpl;
import org.polarsys.time4sys.marte.srm.MemoryPartition;
import org.polarsys.time4sys.marte.srm.MessageComResource;
import org.polarsys.time4sys.marte.srm.NotificationResource;
import org.polarsys.time4sys.marte.srm.SharedDataComResource;
import org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource;
import org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource;
import org.polarsys.time4sys.marte.srm.SoftwareResource;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.marte.srm.SoftwareScheduler;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Schedulable Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getManagedResource <em>Managed Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getResCtrlPolicy <em>Res Ctrl Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getCreateServices <em>Create Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getDeleteServices <em>Delete Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getInitializeServices <em>Initialize Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getMemorySizeFootprint <em>Memory Size Footprint</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getStateElements <em>State Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getIdentifierElements <em>Identifier Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getActivateServices <em>Activate Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getResumeServices <em>Resume Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getSuspendServices <em>Suspend Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getEnableConcurrencyServices <em>Enable Concurrency Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getDisableConcurrencyServices <em>Disable Concurrency Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getTerminateServices <em>Terminate Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getAdressSpace <em>Adress Space</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getPeriodElements <em>Period Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getActivationCapacity <em>Activation Capacity</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getPriorityElements <em>Priority Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getStackSizeElements <em>Stack Size Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getHeapSizeElements <em>Heap Size Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getSharedDataResources <em>Shared Data Resources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getMessageResources <em>Message Resources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getMutualExclusionResources <em>Mutual Exclusion Resources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getNotificationResources <em>Notification Resources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getEntryPoints <em>Entry Points</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getArrivalPattern <em>Arrival Pattern</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#isIsStaticSchedulingFeature <em>Is Static Scheduling Feature</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#isIsPreemptable <em>Is Preemptable</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getDeadlineElements <em>Deadline Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getDeadlineTypeElements <em>Deadline Type Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getTimeSliceElements <em>Time Slice Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getJoinServices <em>Join Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getYieldServices <em>Yield Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getDelayServices <em>Delay Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl#getScheduler <em>Scheduler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareSchedulableResourceImpl extends SchedulableResourceImpl implements SoftwareSchedulableResource {
	/**
	 * The cached value of the '{@link #getManagedResource() <em>Managed Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> managedResource;

	/**
	 * The cached value of the '{@link #getResCtrlPolicy() <em>Res Ctrl Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResCtrlPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceControlPolicy> resCtrlPolicy;

	/**
	 * The cached value of the '{@link #getCreateServices() <em>Create Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> createServices;

	/**
	 * The cached value of the '{@link #getDeleteServices() <em>Delete Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> deleteServices;

	/**
	 * The cached value of the '{@link #getInitializeServices() <em>Initialize Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializeServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> initializeServices;

	/**
	 * The default value of the '{@link #getMemorySizeFootprint() <em>Memory Size Footprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySizeFootprint()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_SIZE_FOOTPRINT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemorySizeFootprint() <em>Memory Size Footprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySizeFootprint()
	 * @generated
	 * @ordered
	 */
	protected int memorySizeFootprint = MEMORY_SIZE_FOOTPRINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStateElements() <em>State Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stateElements;

	/**
	 * The cached value of the '{@link #getIdentifierElements() <em>Identifier Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> identifierElements;

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
	 * The default value of the '{@link #isIsStaticSchedulingFeature() <em>Is Static Scheduling Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStaticSchedulingFeature()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_SCHEDULING_FEATURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStaticSchedulingFeature() <em>Is Static Scheduling Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStaticSchedulingFeature()
	 * @generated
	 * @ordered
	 */
	protected boolean isStaticSchedulingFeature = IS_STATIC_SCHEDULING_FEATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPreemptable() <em>Is Preemptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPreemptable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PREEMPTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPreemptable() <em>Is Preemptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPreemptable()
	 * @generated
	 * @ordered
	 */
	protected boolean isPreemptable = IS_PREEMPTABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeadlineElements() <em>Deadline Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadlineElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> deadlineElements;

	/**
	 * The cached value of the '{@link #getDeadlineTypeElements() <em>Deadline Type Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadlineTypeElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> deadlineTypeElements;

	/**
	 * The cached value of the '{@link #getTimeSliceElements() <em>Time Slice Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSliceElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> timeSliceElements;

	/**
	 * The cached value of the '{@link #getJoinServices() <em>Join Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> joinServices;

	/**
	 * The cached value of the '{@link #getYieldServices() <em>Yield Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYieldServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> yieldServices;

	/**
	 * The cached value of the '{@link #getDelayServices() <em>Delay Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> delayServices;

	/**
	 * The cached value of the '{@link #getScheduler() <em>Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler()
	 * @generated
	 * @ordered
	 */
	protected SoftwareScheduler scheduler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareSchedulableResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.SOFTWARE_SCHEDULABLE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getManagedResource() {
		if (managedResource == null) {
			managedResource = new EObjectResolvingEList<Resource>(Resource.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MANAGED_RESOURCE);
		}
		return managedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceControlPolicy> getResCtrlPolicy() {
		if (resCtrlPolicy == null) {
			resCtrlPolicy = new EObjectContainmentEList<ResourceControlPolicy>(ResourceControlPolicy.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__RES_CTRL_POLICY);
		}
		return resCtrlPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getCreateServices() {
		if (createServices == null) {
			createServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__CREATE_SERVICES);
		}
		return createServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getDeleteServices() {
		if (deleteServices == null) {
			deleteServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DELETE_SERVICES);
		}
		return deleteServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getInitializeServices() {
		if (initializeServices == null) {
			initializeServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__INITIALIZE_SERVICES);
		}
		return initializeServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemorySizeFootprint() {
		return memorySizeFootprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorySizeFootprint(int newMemorySizeFootprint) {
		int oldMemorySizeFootprint = memorySizeFootprint;
		memorySizeFootprint = newMemorySizeFootprint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MEMORY_SIZE_FOOTPRINT, oldMemorySizeFootprint, memorySizeFootprint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStateElements() {
		if (stateElements == null) {
			stateElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__STATE_ELEMENTS);
		}
		return stateElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIdentifierElements() {
		if (identifierElements == null) {
			identifierElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IDENTIFIER_ELEMENTS);
		}
		return identifierElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getActivateServices() {
		if (activateServices == null) {
			activateServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATE_SERVICES);
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
			resumeServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__RESUME_SERVICES);
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
			suspendServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SUSPEND_SERVICES);
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
			enableConcurrencyServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ENABLE_CONCURRENCY_SERVICES);
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
			disableConcurrencyServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DISABLE_CONCURRENCY_SERVICES);
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
			terminateServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__TERMINATE_SERVICES);
		}
		return terminateServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryPartition getAdressSpace() {
		if (eContainerFeatureID() != SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ADRESS_SPACE) return null;
		return (MemoryPartition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdressSpace(MemoryPartition newAdressSpace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAdressSpace, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ADRESS_SPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdressSpace(MemoryPartition newAdressSpace) {
		if (newAdressSpace != eInternalContainer() || (eContainerFeatureID() != SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ADRESS_SPACE && newAdressSpace != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ADRESS_SPACE, newAdressSpace, newAdressSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPeriodElements() {
		if (periodElements == null) {
			periodElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__PERIOD_ELEMENTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATION_CAPACITY, oldActivationCapacity, activationCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPriorityElements() {
		if (priorityElements == null) {
			priorityElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__PRIORITY_ELEMENTS);
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
			stackSizeElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__STACK_SIZE_ELEMENTS);
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
			heapSizeElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__HEAP_SIZE_ELEMENTS);
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
			sharedDataResources = new EObjectResolvingEList<SharedDataComResource>(SharedDataComResource.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SHARED_DATA_RESOURCES);
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
			messageResources = new EObjectResolvingEList<MessageComResource>(MessageComResource.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MESSAGE_RESOURCES);
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
			mutualExclusionResources = new EObjectResolvingEList<SoftwareMutualExclusionResource>(SoftwareMutualExclusionResource.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MUTUAL_EXCLUSION_RESOURCES);
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
			notificationResources = new EObjectResolvingEList<NotificationResource>(NotificationResource.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__NOTIFICATION_RESOURCES);
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
			entryPoints = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ENTRY_POINTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ARRIVAL_PATTERN, oldArrivalPattern, arrivalPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStaticSchedulingFeature() {
		return isStaticSchedulingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStaticSchedulingFeature(boolean newIsStaticSchedulingFeature) {
		boolean oldIsStaticSchedulingFeature = isStaticSchedulingFeature;
		isStaticSchedulingFeature = newIsStaticSchedulingFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE, oldIsStaticSchedulingFeature, isStaticSchedulingFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPreemptable() {
		return isPreemptable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPreemptable(boolean newIsPreemptable) {
		boolean oldIsPreemptable = isPreemptable;
		isPreemptable = newIsPreemptable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE, oldIsPreemptable, isPreemptable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDeadlineElements() {
		if (deadlineElements == null) {
			deadlineElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_ELEMENTS);
		}
		return deadlineElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDeadlineTypeElements() {
		if (deadlineTypeElements == null) {
			deadlineTypeElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_TYPE_ELEMENTS);
		}
		return deadlineTypeElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTimeSliceElements() {
		if (timeSliceElements == null) {
			timeSliceElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS);
		}
		return timeSliceElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getJoinServices() {
		if (joinServices == null) {
			joinServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__JOIN_SERVICES);
		}
		return joinServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getYieldServices() {
		if (yieldServices == null) {
			yieldServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__YIELD_SERVICES);
		}
		return yieldServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getDelayServices() {
		if (delayServices == null) {
			delayServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DELAY_SERVICES);
		}
		return delayServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareScheduler getScheduler() {
		if (scheduler != null && scheduler.eIsProxy()) {
			InternalEObject oldScheduler = (InternalEObject)scheduler;
			scheduler = (SoftwareScheduler)eResolveProxy(oldScheduler);
			if (scheduler != oldScheduler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SCHEDULER, oldScheduler, scheduler));
			}
		}
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareScheduler basicGetScheduler() {
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduler(SoftwareScheduler newScheduler, NotificationChain msgs) {
		SoftwareScheduler oldScheduler = scheduler;
		scheduler = newScheduler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SCHEDULER, oldScheduler, newScheduler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler(SoftwareScheduler newScheduler) {
		if (newScheduler != scheduler) {
			NotificationChain msgs = null;
			if (scheduler != null)
				msgs = ((InternalEObject)scheduler).eInverseRemove(this, SrmPackage.SOFTWARE_SCHEDULER__SCHEDULED_RESOURCE, SoftwareScheduler.class, msgs);
			if (newScheduler != null)
				msgs = ((InternalEObject)newScheduler).eInverseAdd(this, SrmPackage.SOFTWARE_SCHEDULER__SCHEDULED_RESOURCE, SoftwareScheduler.class, msgs);
			msgs = basicSetScheduler(newScheduler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SCHEDULER, newScheduler, newScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ADRESS_SPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAdressSpace((MemoryPartition)otherEnd, msgs);
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SCHEDULER:
				if (scheduler != null)
					msgs = ((InternalEObject)scheduler).eInverseRemove(this, SrmPackage.SOFTWARE_SCHEDULER__SCHEDULED_RESOURCE, SoftwareScheduler.class, msgs);
				return basicSetScheduler((SoftwareScheduler)otherEnd, msgs);
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
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__RES_CTRL_POLICY:
				return ((InternalEList<?>)getResCtrlPolicy()).basicRemove(otherEnd, msgs);
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ADRESS_SPACE:
				return basicSetAdressSpace(null, msgs);
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SCHEDULER:
				return basicSetScheduler(null, msgs);
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
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ADRESS_SPACE:
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
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MANAGED_RESOURCE:
				return getManagedResource();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__RES_CTRL_POLICY:
				return getResCtrlPolicy();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__CREATE_SERVICES:
				return getCreateServices();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DELETE_SERVICES:
				return getDeleteServices();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__INITIALIZE_SERVICES:
				return getInitializeServices();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MEMORY_SIZE_FOOTPRINT:
				return getMemorySizeFootprint();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__STATE_ELEMENTS:
				return getStateElements();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IDENTIFIER_ELEMENTS:
				return getIdentifierElements();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATE_SERVICES:
				return getActivateServices();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__RESUME_SERVICES:
				return getResumeServices();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SUSPEND_SERVICES:
				return getSuspendServices();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ENABLE_CONCURRENCY_SERVICES:
				return getEnableConcurrencyServices();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DISABLE_CONCURRENCY_SERVICES:
				return getDisableConcurrencyServices();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__TERMINATE_SERVICES:
				return getTerminateServices();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ADRESS_SPACE:
				return getAdressSpace();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__PERIOD_ELEMENTS:
				return getPeriodElements();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATION_CAPACITY:
				return getActivationCapacity();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__PRIORITY_ELEMENTS:
				return getPriorityElements();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__STACK_SIZE_ELEMENTS:
				return getStackSizeElements();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__HEAP_SIZE_ELEMENTS:
				return getHeapSizeElements();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SHARED_DATA_RESOURCES:
				return getSharedDataResources();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MESSAGE_RESOURCES:
				return getMessageResources();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MUTUAL_EXCLUSION_RESOURCES:
				return getMutualExclusionResources();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__NOTIFICATION_RESOURCES:
				return getNotificationResources();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ENTRY_POINTS:
				return getEntryPoints();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ARRIVAL_PATTERN:
				return getArrivalPattern();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE:
				return isIsStaticSchedulingFeature();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE:
				return isIsPreemptable();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_ELEMENTS:
				return getDeadlineElements();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_TYPE_ELEMENTS:
				return getDeadlineTypeElements();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS:
				return getTimeSliceElements();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__JOIN_SERVICES:
				return getJoinServices();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__YIELD_SERVICES:
				return getYieldServices();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DELAY_SERVICES:
				return getDelayServices();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SCHEDULER:
				if (resolve) return getScheduler();
				return basicGetScheduler();
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
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MANAGED_RESOURCE:
				getManagedResource().clear();
				getManagedResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__RES_CTRL_POLICY:
				getResCtrlPolicy().clear();
				getResCtrlPolicy().addAll((Collection<? extends ResourceControlPolicy>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__CREATE_SERVICES:
				getCreateServices().clear();
				getCreateServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DELETE_SERVICES:
				getDeleteServices().clear();
				getDeleteServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__INITIALIZE_SERVICES:
				getInitializeServices().clear();
				getInitializeServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MEMORY_SIZE_FOOTPRINT:
				setMemorySizeFootprint((Integer)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__STATE_ELEMENTS:
				getStateElements().clear();
				getStateElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IDENTIFIER_ELEMENTS:
				getIdentifierElements().clear();
				getIdentifierElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATE_SERVICES:
				getActivateServices().clear();
				getActivateServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__RESUME_SERVICES:
				getResumeServices().clear();
				getResumeServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SUSPEND_SERVICES:
				getSuspendServices().clear();
				getSuspendServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ENABLE_CONCURRENCY_SERVICES:
				getEnableConcurrencyServices().clear();
				getEnableConcurrencyServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DISABLE_CONCURRENCY_SERVICES:
				getDisableConcurrencyServices().clear();
				getDisableConcurrencyServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__TERMINATE_SERVICES:
				getTerminateServices().clear();
				getTerminateServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ADRESS_SPACE:
				setAdressSpace((MemoryPartition)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__PERIOD_ELEMENTS:
				getPeriodElements().clear();
				getPeriodElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATION_CAPACITY:
				setActivationCapacity((Integer)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__PRIORITY_ELEMENTS:
				getPriorityElements().clear();
				getPriorityElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__STACK_SIZE_ELEMENTS:
				getStackSizeElements().clear();
				getStackSizeElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__HEAP_SIZE_ELEMENTS:
				getHeapSizeElements().clear();
				getHeapSizeElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SHARED_DATA_RESOURCES:
				getSharedDataResources().clear();
				getSharedDataResources().addAll((Collection<? extends SharedDataComResource>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MESSAGE_RESOURCES:
				getMessageResources().clear();
				getMessageResources().addAll((Collection<? extends MessageComResource>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MUTUAL_EXCLUSION_RESOURCES:
				getMutualExclusionResources().clear();
				getMutualExclusionResources().addAll((Collection<? extends SoftwareMutualExclusionResource>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__NOTIFICATION_RESOURCES:
				getNotificationResources().clear();
				getNotificationResources().addAll((Collection<? extends NotificationResource>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ENTRY_POINTS:
				getEntryPoints().clear();
				getEntryPoints().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ARRIVAL_PATTERN:
				setArrivalPattern((String)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE:
				setIsStaticSchedulingFeature((Boolean)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE:
				setIsPreemptable((Boolean)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_ELEMENTS:
				getDeadlineElements().clear();
				getDeadlineElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_TYPE_ELEMENTS:
				getDeadlineTypeElements().clear();
				getDeadlineTypeElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS:
				getTimeSliceElements().clear();
				getTimeSliceElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__JOIN_SERVICES:
				getJoinServices().clear();
				getJoinServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__YIELD_SERVICES:
				getYieldServices().clear();
				getYieldServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DELAY_SERVICES:
				getDelayServices().clear();
				getDelayServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SCHEDULER:
				setScheduler((SoftwareScheduler)newValue);
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
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MANAGED_RESOURCE:
				getManagedResource().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__RES_CTRL_POLICY:
				getResCtrlPolicy().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__CREATE_SERVICES:
				getCreateServices().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DELETE_SERVICES:
				getDeleteServices().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__INITIALIZE_SERVICES:
				getInitializeServices().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MEMORY_SIZE_FOOTPRINT:
				setMemorySizeFootprint(MEMORY_SIZE_FOOTPRINT_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__STATE_ELEMENTS:
				getStateElements().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IDENTIFIER_ELEMENTS:
				getIdentifierElements().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATE_SERVICES:
				getActivateServices().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__RESUME_SERVICES:
				getResumeServices().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SUSPEND_SERVICES:
				getSuspendServices().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ENABLE_CONCURRENCY_SERVICES:
				getEnableConcurrencyServices().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DISABLE_CONCURRENCY_SERVICES:
				getDisableConcurrencyServices().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__TERMINATE_SERVICES:
				getTerminateServices().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ADRESS_SPACE:
				setAdressSpace((MemoryPartition)null);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__PERIOD_ELEMENTS:
				getPeriodElements().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATION_CAPACITY:
				setActivationCapacity(ACTIVATION_CAPACITY_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__PRIORITY_ELEMENTS:
				getPriorityElements().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__STACK_SIZE_ELEMENTS:
				getStackSizeElements().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__HEAP_SIZE_ELEMENTS:
				getHeapSizeElements().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SHARED_DATA_RESOURCES:
				getSharedDataResources().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MESSAGE_RESOURCES:
				getMessageResources().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MUTUAL_EXCLUSION_RESOURCES:
				getMutualExclusionResources().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__NOTIFICATION_RESOURCES:
				getNotificationResources().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ENTRY_POINTS:
				getEntryPoints().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ARRIVAL_PATTERN:
				setArrivalPattern(ARRIVAL_PATTERN_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE:
				setIsStaticSchedulingFeature(IS_STATIC_SCHEDULING_FEATURE_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE:
				setIsPreemptable(IS_PREEMPTABLE_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_ELEMENTS:
				getDeadlineElements().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_TYPE_ELEMENTS:
				getDeadlineTypeElements().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS:
				getTimeSliceElements().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__JOIN_SERVICES:
				getJoinServices().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__YIELD_SERVICES:
				getYieldServices().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DELAY_SERVICES:
				getDelayServices().clear();
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SCHEDULER:
				setScheduler((SoftwareScheduler)null);
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
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MANAGED_RESOURCE:
				return managedResource != null && !managedResource.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__RES_CTRL_POLICY:
				return resCtrlPolicy != null && !resCtrlPolicy.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__CREATE_SERVICES:
				return createServices != null && !createServices.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DELETE_SERVICES:
				return deleteServices != null && !deleteServices.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__INITIALIZE_SERVICES:
				return initializeServices != null && !initializeServices.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MEMORY_SIZE_FOOTPRINT:
				return memorySizeFootprint != MEMORY_SIZE_FOOTPRINT_EDEFAULT;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__STATE_ELEMENTS:
				return stateElements != null && !stateElements.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IDENTIFIER_ELEMENTS:
				return identifierElements != null && !identifierElements.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATE_SERVICES:
				return activateServices != null && !activateServices.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__RESUME_SERVICES:
				return resumeServices != null && !resumeServices.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SUSPEND_SERVICES:
				return suspendServices != null && !suspendServices.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ENABLE_CONCURRENCY_SERVICES:
				return enableConcurrencyServices != null && !enableConcurrencyServices.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DISABLE_CONCURRENCY_SERVICES:
				return disableConcurrencyServices != null && !disableConcurrencyServices.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__TERMINATE_SERVICES:
				return terminateServices != null && !terminateServices.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ADRESS_SPACE:
				return getAdressSpace() != null;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__PERIOD_ELEMENTS:
				return periodElements != null && !periodElements.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATION_CAPACITY:
				return activationCapacity != ACTIVATION_CAPACITY_EDEFAULT;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__PRIORITY_ELEMENTS:
				return priorityElements != null && !priorityElements.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__STACK_SIZE_ELEMENTS:
				return stackSizeElements != null && !stackSizeElements.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__HEAP_SIZE_ELEMENTS:
				return heapSizeElements != null && !heapSizeElements.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SHARED_DATA_RESOURCES:
				return sharedDataResources != null && !sharedDataResources.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MESSAGE_RESOURCES:
				return messageResources != null && !messageResources.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MUTUAL_EXCLUSION_RESOURCES:
				return mutualExclusionResources != null && !mutualExclusionResources.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__NOTIFICATION_RESOURCES:
				return notificationResources != null && !notificationResources.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ENTRY_POINTS:
				return entryPoints != null && !entryPoints.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ARRIVAL_PATTERN:
				return ARRIVAL_PATTERN_EDEFAULT == null ? arrivalPattern != null : !ARRIVAL_PATTERN_EDEFAULT.equals(arrivalPattern);
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE:
				return isStaticSchedulingFeature != IS_STATIC_SCHEDULING_FEATURE_EDEFAULT;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE:
				return isPreemptable != IS_PREEMPTABLE_EDEFAULT;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_ELEMENTS:
				return deadlineElements != null && !deadlineElements.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_TYPE_ELEMENTS:
				return deadlineTypeElements != null && !deadlineTypeElements.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS:
				return timeSliceElements != null && !timeSliceElements.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__JOIN_SERVICES:
				return joinServices != null && !joinServices.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__YIELD_SERVICES:
				return yieldServices != null && !yieldServices.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DELAY_SERVICES:
				return delayServices != null && !delayServices.isEmpty();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SCHEDULER:
				return scheduler != null;
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
		if (baseClass == ResourceManager.class) {
			switch (derivedFeatureID) {
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MANAGED_RESOURCE: return GrmPackage.RESOURCE_MANAGER__MANAGED_RESOURCE;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__RES_CTRL_POLICY: return GrmPackage.RESOURCE_MANAGER__RES_CTRL_POLICY;
				default: return -1;
			}
		}
		if (baseClass == SoftwareResource.class) {
			switch (derivedFeatureID) {
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__CREATE_SERVICES: return SrmPackage.SOFTWARE_RESOURCE__CREATE_SERVICES;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DELETE_SERVICES: return SrmPackage.SOFTWARE_RESOURCE__DELETE_SERVICES;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__INITIALIZE_SERVICES: return SrmPackage.SOFTWARE_RESOURCE__INITIALIZE_SERVICES;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MEMORY_SIZE_FOOTPRINT: return SrmPackage.SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__STATE_ELEMENTS: return SrmPackage.SOFTWARE_RESOURCE__STATE_ELEMENTS;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IDENTIFIER_ELEMENTS: return SrmPackage.SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == SoftwareConcurrentResource.class) {
			switch (derivedFeatureID) {
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATE_SERVICES: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATE_SERVICES;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__RESUME_SERVICES: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__RESUME_SERVICES;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SUSPEND_SERVICES: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__SUSPEND_SERVICES;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ENABLE_CONCURRENCY_SERVICES: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DISABLE_CONCURRENCY_SERVICES: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__TERMINATE_SERVICES: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__TERMINATE_SERVICES;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ADRESS_SPACE: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__PERIOD_ELEMENTS: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__PERIOD_ELEMENTS;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATION_CAPACITY: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__PRIORITY_ELEMENTS: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__STACK_SIZE_ELEMENTS: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__HEAP_SIZE_ELEMENTS: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SHARED_DATA_RESOURCES: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__SHARED_DATA_RESOURCES;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MESSAGE_RESOURCES: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__MESSAGE_RESOURCES;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MUTUAL_EXCLUSION_RESOURCES: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__NOTIFICATION_RESOURCES: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ENTRY_POINTS: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ENTRY_POINTS;
				case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ARRIVAL_PATTERN: return SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ARRIVAL_PATTERN;
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
		if (baseClass == ResourceManager.class) {
			switch (baseFeatureID) {
				case GrmPackage.RESOURCE_MANAGER__MANAGED_RESOURCE: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MANAGED_RESOURCE;
				case GrmPackage.RESOURCE_MANAGER__RES_CTRL_POLICY: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__RES_CTRL_POLICY;
				default: return -1;
			}
		}
		if (baseClass == SoftwareResource.class) {
			switch (baseFeatureID) {
				case SrmPackage.SOFTWARE_RESOURCE__CREATE_SERVICES: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__CREATE_SERVICES;
				case SrmPackage.SOFTWARE_RESOURCE__DELETE_SERVICES: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DELETE_SERVICES;
				case SrmPackage.SOFTWARE_RESOURCE__INITIALIZE_SERVICES: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__INITIALIZE_SERVICES;
				case SrmPackage.SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MEMORY_SIZE_FOOTPRINT;
				case SrmPackage.SOFTWARE_RESOURCE__STATE_ELEMENTS: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__STATE_ELEMENTS;
				case SrmPackage.SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IDENTIFIER_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == SoftwareConcurrentResource.class) {
			switch (baseFeatureID) {
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATE_SERVICES: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATE_SERVICES;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__RESUME_SERVICES: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__RESUME_SERVICES;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__SUSPEND_SERVICES: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SUSPEND_SERVICES;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ENABLE_CONCURRENCY_SERVICES;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DISABLE_CONCURRENCY_SERVICES;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__TERMINATE_SERVICES: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__TERMINATE_SERVICES;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ADRESS_SPACE;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__PERIOD_ELEMENTS: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__PERIOD_ELEMENTS;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATION_CAPACITY;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__PRIORITY_ELEMENTS;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__STACK_SIZE_ELEMENTS;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__HEAP_SIZE_ELEMENTS;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__SHARED_DATA_RESOURCES: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__SHARED_DATA_RESOURCES;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__MESSAGE_RESOURCES: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MESSAGE_RESOURCES;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MUTUAL_EXCLUSION_RESOURCES;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__NOTIFICATION_RESOURCES;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ENTRY_POINTS: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ENTRY_POINTS;
				case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ARRIVAL_PATTERN: return SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ARRIVAL_PATTERN;
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
		result.append(" (memorySizeFootprint: ");
		result.append(memorySizeFootprint);
		result.append(", stateElements: ");
		result.append(stateElements);
		result.append(", identifierElements: ");
		result.append(identifierElements);
		result.append(", periodElements: ");
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
		result.append(", isStaticSchedulingFeature: ");
		result.append(isStaticSchedulingFeature);
		result.append(", isPreemptable: ");
		result.append(isPreemptable);
		result.append(", deadlineElements: ");
		result.append(deadlineElements);
		result.append(", deadlineTypeElements: ");
		result.append(deadlineTypeElements);
		result.append(", timeSliceElements: ");
		result.append(timeSliceElements);
		result.append(')');
		return result.toString();
	}

} //SoftwareSchedulableResourceImpl
