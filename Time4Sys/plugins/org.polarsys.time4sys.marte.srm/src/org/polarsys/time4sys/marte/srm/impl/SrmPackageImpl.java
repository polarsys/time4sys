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
package org.polarsys.time4sys.marte.srm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.srm.AccessPolicyKind;
import org.polarsys.time4sys.marte.srm.Alarm;
import org.polarsys.time4sys.marte.srm.ConcurrentAccesProtocolKind;
import org.polarsys.time4sys.marte.srm.DeviceBroker;
import org.polarsys.time4sys.marte.srm.InterruptKind;
import org.polarsys.time4sys.marte.srm.InterruptResource;
import org.polarsys.time4sys.marte.srm.MemoryBroker;
import org.polarsys.time4sys.marte.srm.MemoryPartition;
import org.polarsys.time4sys.marte.srm.MessageComResource;
import org.polarsys.time4sys.marte.srm.MessageResourceKind;
import org.polarsys.time4sys.marte.srm.MutualExclusionResourceKind;
import org.polarsys.time4sys.marte.srm.NotificationResource;
import org.polarsys.time4sys.marte.srm.NotificationResourceKind;
import org.polarsys.time4sys.marte.srm.OccurencePolicyKind;
import org.polarsys.time4sys.marte.srm.QueuePolicyKind;
import org.polarsys.time4sys.marte.srm.SharedDataComResource;
import org.polarsys.time4sys.marte.srm.SoftwareAccessService;
import org.polarsys.time4sys.marte.srm.SoftwareArchitecture;
import org.polarsys.time4sys.marte.srm.SoftwareCommunicationResource;
import org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource;
import org.polarsys.time4sys.marte.srm.SoftwareConnector;
import org.polarsys.time4sys.marte.srm.SoftwareInteractionResource;
import org.polarsys.time4sys.marte.srm.SoftwareInterface;
import org.polarsys.time4sys.marte.srm.SoftwareInterfacePackage;
import org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource;
import org.polarsys.time4sys.marte.srm.SoftwarePort;
import org.polarsys.time4sys.marte.srm.SoftwareResource;
import org.polarsys.time4sys.marte.srm.SoftwareResourcePackage;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.marte.srm.SoftwareScheduler;
import org.polarsys.time4sys.marte.srm.SoftwareService;
import org.polarsys.time4sys.marte.srm.SoftwareSynchronizationResource;
import org.polarsys.time4sys.marte.srm.SoftwareTimerResource;
import org.polarsys.time4sys.marte.srm.SrmFactory;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SrmPackageImpl extends EPackageImpl implements SrmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareAccessServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareConcurrentResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareSchedulableResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryPartitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareTimerResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareInteractionResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareCommunicationResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareSynchronizationResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareMutualExclusionResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedDataComResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageComResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceBrokerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryBrokerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareSchedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwarePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareResourcePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareInterfacePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interruptKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum queuePolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mutualExclusionResourceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum concurrentAccesProtocolKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum occurencePolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nfP_DurationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum notificationResourceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageResourceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessPolicyKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SrmPackageImpl() {
		super(eNS_URI, SrmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SrmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SrmPackage init() {
		if (isInited) return (SrmPackage)EPackage.Registry.INSTANCE.getEPackage(SrmPackage.eNS_URI);

		// Obtain or create and register package
		SrmPackageImpl theSrmPackage = (SrmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SrmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SrmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GrmPackage.eINSTANCE.eClass();
		NfpPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSrmPackage.createPackageContents();

		// Initialize created meta-data
		theSrmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSrmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SrmPackage.eNS_URI, theSrmPackage);
		return theSrmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareResource() {
		return softwareResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareResource_CreateServices() {
		return (EReference)softwareResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareResource_DeleteServices() {
		return (EReference)softwareResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareResource_InitializeServices() {
		return (EReference)softwareResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareResource_MemorySizeFootprint() {
		return (EAttribute)softwareResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareResource_StateElements() {
		return (EAttribute)softwareResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareResource_IdentifierElements() {
		return (EAttribute)softwareResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareAccessService() {
		return softwareAccessServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareAccessService_IsModifier() {
		return (EAttribute)softwareAccessServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareAccessService_AccessedElement() {
		return (EAttribute)softwareAccessServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareConcurrentResource() {
		return softwareConcurrentResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareConcurrentResource_ActivateServices() {
		return (EReference)softwareConcurrentResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareConcurrentResource_ResumeServices() {
		return (EReference)softwareConcurrentResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareConcurrentResource_SuspendServices() {
		return (EReference)softwareConcurrentResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareConcurrentResource_EnableConcurrencyServices() {
		return (EReference)softwareConcurrentResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareConcurrentResource_DisableConcurrencyServices() {
		return (EReference)softwareConcurrentResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareConcurrentResource_TerminateServices() {
		return (EReference)softwareConcurrentResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareConcurrentResource_AdressSpace() {
		return (EReference)softwareConcurrentResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareConcurrentResource_PeriodElements() {
		return (EAttribute)softwareConcurrentResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareConcurrentResource_ActivationCapacity() {
		return (EAttribute)softwareConcurrentResourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareConcurrentResource_PriorityElements() {
		return (EAttribute)softwareConcurrentResourceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareConcurrentResource_StackSizeElements() {
		return (EAttribute)softwareConcurrentResourceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareConcurrentResource_HeapSizeElements() {
		return (EAttribute)softwareConcurrentResourceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareConcurrentResource_SharedDataResources() {
		return (EReference)softwareConcurrentResourceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareConcurrentResource_MessageResources() {
		return (EReference)softwareConcurrentResourceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareConcurrentResource_MutualExclusionResources() {
		return (EReference)softwareConcurrentResourceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareConcurrentResource_NotificationResources() {
		return (EReference)softwareConcurrentResourceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareConcurrentResource_EntryPoints() {
		return (EAttribute)softwareConcurrentResourceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareConcurrentResource_ArrivalPattern() {
		return (EAttribute)softwareConcurrentResourceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptResource() {
		return interruptResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterruptResource_Kind() {
		return (EAttribute)interruptResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterruptResource_IsMaskable() {
		return (EAttribute)interruptResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterruptResource_RoutineConnectServices() {
		return (EReference)interruptResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterruptResource_RoutineDisconnectServices() {
		return (EReference)interruptResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterruptResource_MaskElements() {
		return (EAttribute)interruptResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterruptResource_VectorElements() {
		return (EAttribute)interruptResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterruptResource_IsrEntryPoints() {
		return (EAttribute)interruptResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareSchedulableResource() {
		return softwareSchedulableResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareSchedulableResource_IsStaticSchedulingFeature() {
		return (EAttribute)softwareSchedulableResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareSchedulableResource_IsPreemptable() {
		return (EAttribute)softwareSchedulableResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareSchedulableResource_DeadlineElements() {
		return (EAttribute)softwareSchedulableResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareSchedulableResource_DeadlineTypeElements() {
		return (EAttribute)softwareSchedulableResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareSchedulableResource_TimeSliceElements() {
		return (EAttribute)softwareSchedulableResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareSchedulableResource_JoinServices() {
		return (EReference)softwareSchedulableResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareSchedulableResource_YieldServices() {
		return (EReference)softwareSchedulableResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareSchedulableResource_DelayServices() {
		return (EReference)softwareSchedulableResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareSchedulableResource_Scheduler() {
		return (EReference)softwareSchedulableResourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryPartition() {
		return memoryPartitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryPartition_ConcurrentResources() {
		return (EReference)memoryPartitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryPartition_ForkServices() {
		return (EReference)memoryPartitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryPartition_ExitServices() {
		return (EReference)memoryPartitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryPartition_MemorySpaces() {
		return (EReference)memoryPartitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlarm() {
		return alarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlarm_Timers() {
		return (EReference)alarmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlarm_IsWatchdog() {
		return (EAttribute)alarmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareTimerResource() {
		return softwareTimerResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareTimerResource_DurationElements() {
		return (EAttribute)softwareTimerResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareInteractionResource() {
		return softwareInteractionResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareInteractionResource_IsIntraMemoryPartitionInteraction() {
		return (EAttribute)softwareInteractionResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareInteractionResource_WaitingQueuePolicy() {
		return (EAttribute)softwareInteractionResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareInteractionResource_WaitingQueueCapacity() {
		return (EAttribute)softwareInteractionResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareInteractionResource_WaitingPolicyElements() {
		return (EAttribute)softwareInteractionResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareCommunicationResource() {
		return softwareCommunicationResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareSynchronizationResource() {
		return softwareSynchronizationResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareMutualExclusionResource() {
		return softwareMutualExclusionResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareMutualExclusionResource_ConcurrentAccessProtocol() {
		return (EAttribute)softwareMutualExclusionResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareMutualExclusionResource_Mechanism() {
		return (EAttribute)softwareMutualExclusionResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareMutualExclusionResource_AcquireServices() {
		return (EReference)softwareMutualExclusionResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareMutualExclusionResource_ReleaseServices() {
		return (EReference)softwareMutualExclusionResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareMutualExclusionResource_AccessTokenElements() {
		return (EReference)softwareMutualExclusionResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationResource() {
		return notificationResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationResource_FlushServices() {
		return (EReference)notificationResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationResource_SignalServices() {
		return (EReference)notificationResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationResource_WaitServices() {
		return (EReference)notificationResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationResource_ClearServices() {
		return (EReference)notificationResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationResource_Policy() {
		return (EAttribute)notificationResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationResource_Mechanism() {
		return (EAttribute)notificationResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationResource_OccurenceCountElements() {
		return (EAttribute)notificationResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationResource_MaskElements() {
		return (EAttribute)notificationResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedDataComResource() {
		return sharedDataComResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedDataComResource_ReadServices() {
		return (EReference)sharedDataComResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedDataComResource_WriteServices() {
		return (EReference)sharedDataComResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageComResource() {
		return messageComResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageComResource_SendServices() {
		return (EReference)messageComResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageComResource_ReceiveServices() {
		return (EReference)messageComResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageComResource_IsFixedMessageSize() {
		return (EAttribute)messageComResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageComResource_MessageSizeElements() {
		return (EAttribute)messageComResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageComResource_Mechanism() {
		return (EAttribute)messageComResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageComResource_MessageQueuePolicy() {
		return (EAttribute)messageComResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageComResource_MessageQueueCapacityElements() {
		return (EAttribute)messageComResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceBroker() {
		return deviceBrokerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceBroker_Devices() {
		return (EReference)deviceBrokerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceBroker_AccessPolicy() {
		return (EAttribute)deviceBrokerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceBroker_IsBuffered() {
		return (EAttribute)deviceBrokerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceBroker_CloseServices() {
		return (EReference)deviceBrokerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceBroker_OpenServices() {
		return (EReference)deviceBrokerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceBroker_ControlServices() {
		return (EReference)deviceBrokerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceBroker_ReadServices() {
		return (EReference)deviceBrokerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceBroker_WriteServices() {
		return (EReference)deviceBrokerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryBroker() {
		return memoryBrokerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryBroker_LockServices() {
		return (EReference)memoryBrokerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryBroker_UnlockServices() {
		return (EReference)memoryBrokerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryBroker_MapServices() {
		return (EReference)memoryBrokerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryBroker_UnmapServices() {
		return (EReference)memoryBrokerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryBroker_Memories() {
		return (EReference)memoryBrokerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryBroker_AccessPolicy() {
		return (EAttribute)memoryBrokerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryBroker_MemoryBlockAddressElements() {
		return (EAttribute)memoryBrokerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryBroker_MemoryBlockSizeElements() {
		return (EAttribute)memoryBrokerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareScheduler() {
		return softwareSchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareScheduler_ScheduledResource() {
		return (EReference)softwareSchedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwarePort() {
		return softwarePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareService() {
		return softwareServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareInterface() {
		return softwareInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareArchitecture() {
		return softwareArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareConnector() {
		return softwareConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareResourcePackage() {
		return softwareResourcePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareInterfacePackage() {
		return softwareInterfacePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterruptKind() {
		return interruptKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQueuePolicyKind() {
		return queuePolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMutualExclusionResourceKind() {
		return mutualExclusionResourceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConcurrentAccesProtocolKind() {
		return concurrentAccesProtocolKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOccurencePolicyKind() {
		return occurencePolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNFP_Duration() {
		return nfP_DurationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNotificationResourceKind() {
		return notificationResourceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageResourceKind() {
		return messageResourceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessPolicyKind() {
		return accessPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrmFactory getSrmFactory() {
		return (SrmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		alarmEClass = createEClass(ALARM);
		createEReference(alarmEClass, ALARM__TIMERS);
		createEAttribute(alarmEClass, ALARM__IS_WATCHDOG);

		deviceBrokerEClass = createEClass(DEVICE_BROKER);
		createEReference(deviceBrokerEClass, DEVICE_BROKER__DEVICES);
		createEAttribute(deviceBrokerEClass, DEVICE_BROKER__ACCESS_POLICY);
		createEAttribute(deviceBrokerEClass, DEVICE_BROKER__IS_BUFFERED);
		createEReference(deviceBrokerEClass, DEVICE_BROKER__CLOSE_SERVICES);
		createEReference(deviceBrokerEClass, DEVICE_BROKER__OPEN_SERVICES);
		createEReference(deviceBrokerEClass, DEVICE_BROKER__CONTROL_SERVICES);
		createEReference(deviceBrokerEClass, DEVICE_BROKER__READ_SERVICES);
		createEReference(deviceBrokerEClass, DEVICE_BROKER__WRITE_SERVICES);

		interruptResourceEClass = createEClass(INTERRUPT_RESOURCE);
		createEAttribute(interruptResourceEClass, INTERRUPT_RESOURCE__KIND);
		createEAttribute(interruptResourceEClass, INTERRUPT_RESOURCE__IS_MASKABLE);
		createEReference(interruptResourceEClass, INTERRUPT_RESOURCE__ROUTINE_CONNECT_SERVICES);
		createEReference(interruptResourceEClass, INTERRUPT_RESOURCE__ROUTINE_DISCONNECT_SERVICES);
		createEAttribute(interruptResourceEClass, INTERRUPT_RESOURCE__MASK_ELEMENTS);
		createEAttribute(interruptResourceEClass, INTERRUPT_RESOURCE__VECTOR_ELEMENTS);
		createEAttribute(interruptResourceEClass, INTERRUPT_RESOURCE__ISR_ENTRY_POINTS);

		memoryBrokerEClass = createEClass(MEMORY_BROKER);
		createEReference(memoryBrokerEClass, MEMORY_BROKER__LOCK_SERVICES);
		createEReference(memoryBrokerEClass, MEMORY_BROKER__UNLOCK_SERVICES);
		createEReference(memoryBrokerEClass, MEMORY_BROKER__MAP_SERVICES);
		createEReference(memoryBrokerEClass, MEMORY_BROKER__UNMAP_SERVICES);
		createEReference(memoryBrokerEClass, MEMORY_BROKER__MEMORIES);
		createEAttribute(memoryBrokerEClass, MEMORY_BROKER__ACCESS_POLICY);
		createEAttribute(memoryBrokerEClass, MEMORY_BROKER__MEMORY_BLOCK_ADDRESS_ELEMENTS);
		createEAttribute(memoryBrokerEClass, MEMORY_BROKER__MEMORY_BLOCK_SIZE_ELEMENTS);

		memoryPartitionEClass = createEClass(MEMORY_PARTITION);
		createEReference(memoryPartitionEClass, MEMORY_PARTITION__CONCURRENT_RESOURCES);
		createEReference(memoryPartitionEClass, MEMORY_PARTITION__FORK_SERVICES);
		createEReference(memoryPartitionEClass, MEMORY_PARTITION__EXIT_SERVICES);
		createEReference(memoryPartitionEClass, MEMORY_PARTITION__MEMORY_SPACES);

		messageComResourceEClass = createEClass(MESSAGE_COM_RESOURCE);
		createEReference(messageComResourceEClass, MESSAGE_COM_RESOURCE__SEND_SERVICES);
		createEReference(messageComResourceEClass, MESSAGE_COM_RESOURCE__RECEIVE_SERVICES);
		createEAttribute(messageComResourceEClass, MESSAGE_COM_RESOURCE__IS_FIXED_MESSAGE_SIZE);
		createEAttribute(messageComResourceEClass, MESSAGE_COM_RESOURCE__MESSAGE_SIZE_ELEMENTS);
		createEAttribute(messageComResourceEClass, MESSAGE_COM_RESOURCE__MECHANISM);
		createEAttribute(messageComResourceEClass, MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_POLICY);
		createEAttribute(messageComResourceEClass, MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_CAPACITY_ELEMENTS);

		notificationResourceEClass = createEClass(NOTIFICATION_RESOURCE);
		createEReference(notificationResourceEClass, NOTIFICATION_RESOURCE__FLUSH_SERVICES);
		createEReference(notificationResourceEClass, NOTIFICATION_RESOURCE__SIGNAL_SERVICES);
		createEReference(notificationResourceEClass, NOTIFICATION_RESOURCE__WAIT_SERVICES);
		createEReference(notificationResourceEClass, NOTIFICATION_RESOURCE__CLEAR_SERVICES);
		createEAttribute(notificationResourceEClass, NOTIFICATION_RESOURCE__POLICY);
		createEAttribute(notificationResourceEClass, NOTIFICATION_RESOURCE__MECHANISM);
		createEAttribute(notificationResourceEClass, NOTIFICATION_RESOURCE__OCCURENCE_COUNT_ELEMENTS);
		createEAttribute(notificationResourceEClass, NOTIFICATION_RESOURCE__MASK_ELEMENTS);

		sharedDataComResourceEClass = createEClass(SHARED_DATA_COM_RESOURCE);
		createEReference(sharedDataComResourceEClass, SHARED_DATA_COM_RESOURCE__READ_SERVICES);
		createEReference(sharedDataComResourceEClass, SHARED_DATA_COM_RESOURCE__WRITE_SERVICES);

		softwareAccessServiceEClass = createEClass(SOFTWARE_ACCESS_SERVICE);
		createEAttribute(softwareAccessServiceEClass, SOFTWARE_ACCESS_SERVICE__IS_MODIFIER);
		createEAttribute(softwareAccessServiceEClass, SOFTWARE_ACCESS_SERVICE__ACCESSED_ELEMENT);

		softwareArchitectureEClass = createEClass(SOFTWARE_ARCHITECTURE);

		softwareCommunicationResourceEClass = createEClass(SOFTWARE_COMMUNICATION_RESOURCE);

		softwareConcurrentResourceEClass = createEClass(SOFTWARE_CONCURRENT_RESOURCE);
		createEReference(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__ACTIVATE_SERVICES);
		createEReference(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__RESUME_SERVICES);
		createEReference(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__SUSPEND_SERVICES);
		createEReference(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES);
		createEReference(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES);
		createEReference(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__TERMINATE_SERVICES);
		createEReference(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE);
		createEAttribute(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__PERIOD_ELEMENTS);
		createEAttribute(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY);
		createEAttribute(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS);
		createEAttribute(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS);
		createEAttribute(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS);
		createEReference(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__SHARED_DATA_RESOURCES);
		createEReference(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__MESSAGE_RESOURCES);
		createEReference(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES);
		createEReference(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES);
		createEAttribute(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__ENTRY_POINTS);
		createEAttribute(softwareConcurrentResourceEClass, SOFTWARE_CONCURRENT_RESOURCE__ARRIVAL_PATTERN);

		softwareConnectorEClass = createEClass(SOFTWARE_CONNECTOR);

		softwareInteractionResourceEClass = createEClass(SOFTWARE_INTERACTION_RESOURCE);
		createEAttribute(softwareInteractionResourceEClass, SOFTWARE_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION);
		createEAttribute(softwareInteractionResourceEClass, SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY);
		createEAttribute(softwareInteractionResourceEClass, SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY);
		createEAttribute(softwareInteractionResourceEClass, SOFTWARE_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS);

		softwareInterfaceEClass = createEClass(SOFTWARE_INTERFACE);

		softwareInterfacePackageEClass = createEClass(SOFTWARE_INTERFACE_PACKAGE);

		softwareMutualExclusionResourceEClass = createEClass(SOFTWARE_MUTUAL_EXCLUSION_RESOURCE);
		createEAttribute(softwareMutualExclusionResourceEClass, SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__CONCURRENT_ACCESS_PROTOCOL);
		createEAttribute(softwareMutualExclusionResourceEClass, SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__MECHANISM);
		createEReference(softwareMutualExclusionResourceEClass, SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACQUIRE_SERVICES);
		createEReference(softwareMutualExclusionResourceEClass, SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__RELEASE_SERVICES);
		createEReference(softwareMutualExclusionResourceEClass, SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACCESS_TOKEN_ELEMENTS);

		softwarePortEClass = createEClass(SOFTWARE_PORT);

		softwareResourceEClass = createEClass(SOFTWARE_RESOURCE);
		createEReference(softwareResourceEClass, SOFTWARE_RESOURCE__CREATE_SERVICES);
		createEReference(softwareResourceEClass, SOFTWARE_RESOURCE__DELETE_SERVICES);
		createEReference(softwareResourceEClass, SOFTWARE_RESOURCE__INITIALIZE_SERVICES);
		createEAttribute(softwareResourceEClass, SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT);
		createEAttribute(softwareResourceEClass, SOFTWARE_RESOURCE__STATE_ELEMENTS);
		createEAttribute(softwareResourceEClass, SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS);

		softwareResourcePackageEClass = createEClass(SOFTWARE_RESOURCE_PACKAGE);

		softwareSchedulableResourceEClass = createEClass(SOFTWARE_SCHEDULABLE_RESOURCE);
		createEAttribute(softwareSchedulableResourceEClass, SOFTWARE_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE);
		createEAttribute(softwareSchedulableResourceEClass, SOFTWARE_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE);
		createEAttribute(softwareSchedulableResourceEClass, SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_ELEMENTS);
		createEAttribute(softwareSchedulableResourceEClass, SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_TYPE_ELEMENTS);
		createEAttribute(softwareSchedulableResourceEClass, SOFTWARE_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS);
		createEReference(softwareSchedulableResourceEClass, SOFTWARE_SCHEDULABLE_RESOURCE__JOIN_SERVICES);
		createEReference(softwareSchedulableResourceEClass, SOFTWARE_SCHEDULABLE_RESOURCE__YIELD_SERVICES);
		createEReference(softwareSchedulableResourceEClass, SOFTWARE_SCHEDULABLE_RESOURCE__DELAY_SERVICES);
		createEReference(softwareSchedulableResourceEClass, SOFTWARE_SCHEDULABLE_RESOURCE__SCHEDULER);

		softwareSchedulerEClass = createEClass(SOFTWARE_SCHEDULER);
		createEReference(softwareSchedulerEClass, SOFTWARE_SCHEDULER__SCHEDULED_RESOURCE);

		softwareServiceEClass = createEClass(SOFTWARE_SERVICE);

		softwareSynchronizationResourceEClass = createEClass(SOFTWARE_SYNCHRONIZATION_RESOURCE);

		softwareTimerResourceEClass = createEClass(SOFTWARE_TIMER_RESOURCE);
		createEAttribute(softwareTimerResourceEClass, SOFTWARE_TIMER_RESOURCE__DURATION_ELEMENTS);

		// Create enums
		accessPolicyKindEEnum = createEEnum(ACCESS_POLICY_KIND);
		concurrentAccesProtocolKindEEnum = createEEnum(CONCURRENT_ACCES_PROTOCOL_KIND);
		interruptKindEEnum = createEEnum(INTERRUPT_KIND);
		queuePolicyKindEEnum = createEEnum(QUEUE_POLICY_KIND);
		messageResourceKindEEnum = createEEnum(MESSAGE_RESOURCE_KIND);
		mutualExclusionResourceKindEEnum = createEEnum(MUTUAL_EXCLUSION_RESOURCE_KIND);
		notificationResourceKindEEnum = createEEnum(NOTIFICATION_RESOURCE_KIND);
		occurencePolicyKindEEnum = createEEnum(OCCURENCE_POLICY_KIND);

		// Create data types
		nfP_DurationEDataType = createEDataType(NFP_DURATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GrmPackage theGrmPackage = (GrmPackage)EPackage.Registry.INSTANCE.getEPackage(GrmPackage.eNS_URI);
		org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage theCoreElementsPackage = (org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage)EPackage.Registry.INSTANCE.getEPackage(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		alarmEClass.getESuperTypes().add(this.getInterruptResource());
		deviceBrokerEClass.getESuperTypes().add(theGrmPackage.getResourceBroker());
		deviceBrokerEClass.getESuperTypes().add(this.getSoftwareResource());
		interruptResourceEClass.getESuperTypes().add(this.getSoftwareConcurrentResource());
		memoryBrokerEClass.getESuperTypes().add(theGrmPackage.getResourceBroker());
		memoryBrokerEClass.getESuperTypes().add(this.getSoftwareResource());
		memoryPartitionEClass.getESuperTypes().add(this.getSoftwareResource());
		messageComResourceEClass.getESuperTypes().add(this.getSoftwareCommunicationResource());
		notificationResourceEClass.getESuperTypes().add(this.getSoftwareSynchronizationResource());
		sharedDataComResourceEClass.getESuperTypes().add(this.getSoftwareCommunicationResource());
		softwareAccessServiceEClass.getESuperTypes().add(theGrmPackage.getResourceService());
		softwareArchitectureEClass.getESuperTypes().add(this.getSoftwareResource());
		softwareCommunicationResourceEClass.getESuperTypes().add(this.getSoftwareInteractionResource());
		softwareCommunicationResourceEClass.getESuperTypes().add(theGrmPackage.getCommunicationMedia());
		softwareConcurrentResourceEClass.getESuperTypes().add(this.getSoftwareResource());
		softwareConcurrentResourceEClass.getESuperTypes().add(theGrmPackage.getConcurrencyResource());
		softwareConnectorEClass.getESuperTypes().add(theGrmPackage.getResourceConnector());
		softwareInteractionResourceEClass.getESuperTypes().add(theGrmPackage.getCommunicationEndPoint());
		softwareInteractionResourceEClass.getESuperTypes().add(this.getSoftwareResource());
		softwareInterfaceEClass.getESuperTypes().add(theGrmPackage.getResourceInterface());
		softwareInterfacePackageEClass.getESuperTypes().add(theGrmPackage.getResourcePackage());
		softwareMutualExclusionResourceEClass.getESuperTypes().add(this.getSoftwareSynchronizationResource());
		softwareMutualExclusionResourceEClass.getESuperTypes().add(theGrmPackage.getMutualExclusionResource());
		softwarePortEClass.getESuperTypes().add(theGrmPackage.getResourcePort());
		softwareResourceEClass.getESuperTypes().add(theGrmPackage.getResourceManager());
		softwareResourcePackageEClass.getESuperTypes().add(theGrmPackage.getResourcePackage());
		softwareSchedulableResourceEClass.getESuperTypes().add(theGrmPackage.getSchedulableResource());
		softwareSchedulableResourceEClass.getESuperTypes().add(this.getSoftwareConcurrentResource());
		softwareSchedulerEClass.getESuperTypes().add(theGrmPackage.getScheduler());
		softwareServiceEClass.getESuperTypes().add(theGrmPackage.getResourceService());
		softwareSynchronizationResourceEClass.getESuperTypes().add(this.getSoftwareInteractionResource());
		softwareSynchronizationResourceEClass.getESuperTypes().add(theGrmPackage.getSynchResource());
		softwareTimerResourceEClass.getESuperTypes().add(theGrmPackage.getTimerResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(alarmEClass, Alarm.class, "Alarm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlarm_Timers(), this.getSoftwareTimerResource(), null, "timers", null, 0, -1, Alarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlarm_IsWatchdog(), ecorePackage.getEBoolean(), "isWatchdog", null, 0, 1, Alarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceBrokerEClass, DeviceBroker.class, "DeviceBroker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceBroker_Devices(), theGrmPackage.getDeviceResource(), null, "devices", null, 0, -1, DeviceBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceBroker_AccessPolicy(), this.getAccessPolicyKind(), "accessPolicy", null, 0, 1, DeviceBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceBroker_IsBuffered(), ecorePackage.getEBoolean(), "isBuffered", null, 0, 1, DeviceBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceBroker_CloseServices(), theGrmPackage.getResourceService(), null, "closeServices", null, 0, -1, DeviceBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceBroker_OpenServices(), theGrmPackage.getResourceService(), null, "openServices", null, 0, -1, DeviceBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceBroker_ControlServices(), theGrmPackage.getResourceService(), null, "controlServices", null, 0, -1, DeviceBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceBroker_ReadServices(), theGrmPackage.getResourceService(), null, "readServices", null, 0, -1, DeviceBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceBroker_WriteServices(), theGrmPackage.getResourceService(), null, "writeServices", null, 0, -1, DeviceBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interruptResourceEClass, InterruptResource.class, "InterruptResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterruptResource_Kind(), this.getInterruptKind(), "kind", null, 1, 1, InterruptResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterruptResource_IsMaskable(), ecorePackage.getEBoolean(), "isMaskable", null, 1, 1, InterruptResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterruptResource_RoutineConnectServices(), theGrmPackage.getResourceService(), null, "routineConnectServices", null, 0, -1, InterruptResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterruptResource_RoutineDisconnectServices(), theGrmPackage.getResourceService(), null, "routineDisconnectServices", null, 0, -1, InterruptResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterruptResource_MaskElements(), ecorePackage.getEString(), "maskElements", null, 0, -1, InterruptResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterruptResource_VectorElements(), ecorePackage.getEString(), "vectorElements", null, 0, -1, InterruptResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterruptResource_IsrEntryPoints(), ecorePackage.getEString(), "isrEntryPoints", null, 0, -1, InterruptResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryBrokerEClass, MemoryBroker.class, "MemoryBroker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryBroker_LockServices(), theGrmPackage.getResourceService(), null, "lockServices", null, 0, -1, MemoryBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryBroker_UnlockServices(), theGrmPackage.getResourceService(), null, "unlockServices", null, 0, -1, MemoryBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryBroker_MapServices(), theGrmPackage.getResourceService(), null, "mapServices", null, 0, -1, MemoryBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryBroker_UnmapServices(), theGrmPackage.getResourceService(), null, "unmapServices", null, 0, -1, MemoryBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryBroker_Memories(), theGrmPackage.getStorageResource(), null, "memories", null, 0, -1, MemoryBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryBroker_AccessPolicy(), this.getAccessPolicyKind(), "accessPolicy", null, 0, 1, MemoryBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryBroker_MemoryBlockAddressElements(), ecorePackage.getEString(), "memoryBlockAddressElements", null, 0, -1, MemoryBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryBroker_MemoryBlockSizeElements(), ecorePackage.getEString(), "memoryBlockSizeElements", null, 0, -1, MemoryBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryPartitionEClass, MemoryPartition.class, "MemoryPartition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryPartition_ConcurrentResources(), this.getSoftwareConcurrentResource(), this.getSoftwareConcurrentResource_AdressSpace(), "concurrentResources", null, 1, -1, MemoryPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryPartition_ForkServices(), theGrmPackage.getResourceService(), null, "forkServices", null, 0, -1, MemoryPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryPartition_ExitServices(), theGrmPackage.getResourceService(), null, "exitServices", null, 0, -1, MemoryPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryPartition_MemorySpaces(), theGrmPackage.getStorageResource(), null, "memorySpaces", null, 0, -1, MemoryPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageComResourceEClass, MessageComResource.class, "MessageComResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageComResource_SendServices(), theGrmPackage.getResourceService(), null, "sendServices", null, 0, -1, MessageComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageComResource_ReceiveServices(), theGrmPackage.getResourceService(), null, "receiveServices", null, 0, -1, MessageComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageComResource_IsFixedMessageSize(), ecorePackage.getEBoolean(), "isFixedMessageSize", null, 1, 1, MessageComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageComResource_MessageSizeElements(), ecorePackage.getEString(), "messageSizeElements", null, 0, -1, MessageComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageComResource_Mechanism(), this.getMessageResourceKind(), "mechanism", null, 0, 1, MessageComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageComResource_MessageQueuePolicy(), this.getQueuePolicyKind(), "messageQueuePolicy", null, 0, 1, MessageComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageComResource_MessageQueueCapacityElements(), ecorePackage.getEString(), "messageQueueCapacityElements", null, 0, -1, MessageComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationResourceEClass, NotificationResource.class, "NotificationResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotificationResource_FlushServices(), theGrmPackage.getResourceService(), null, "flushServices", null, 0, -1, NotificationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotificationResource_SignalServices(), theGrmPackage.getResourceService(), null, "signalServices", null, 0, -1, NotificationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotificationResource_WaitServices(), theGrmPackage.getResourceService(), null, "waitServices", null, 0, -1, NotificationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotificationResource_ClearServices(), theGrmPackage.getResourceService(), null, "clearServices", null, 0, -1, NotificationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationResource_Policy(), this.getOccurencePolicyKind(), "policy", null, 1, 1, NotificationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationResource_Mechanism(), this.getNotificationResourceKind(), "mechanism", null, 1, 1, NotificationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationResource_OccurenceCountElements(), ecorePackage.getEString(), "occurenceCountElements", null, 0, -1, NotificationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationResource_MaskElements(), ecorePackage.getEString(), "maskElements", null, 0, -1, NotificationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedDataComResourceEClass, SharedDataComResource.class, "SharedDataComResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSharedDataComResource_ReadServices(), theGrmPackage.getResourceService(), null, "readServices", null, 0, -1, SharedDataComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedDataComResource_WriteServices(), theGrmPackage.getResourceService(), null, "writeServices", null, 0, -1, SharedDataComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareAccessServiceEClass, SoftwareAccessService.class, "SoftwareAccessService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareAccessService_IsModifier(), ecorePackage.getEBoolean(), "isModifier", null, 0, 1, SoftwareAccessService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareAccessService_AccessedElement(), ecorePackage.getEString(), "accessedElement", null, 0, 1, SoftwareAccessService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareArchitectureEClass, SoftwareArchitecture.class, "SoftwareArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareCommunicationResourceEClass, SoftwareCommunicationResource.class, "SoftwareCommunicationResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareConcurrentResourceEClass, SoftwareConcurrentResource.class, "SoftwareConcurrentResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareConcurrentResource_ActivateServices(), theGrmPackage.getResourceService(), null, "activateServices", null, 0, -1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareConcurrentResource_ResumeServices(), theGrmPackage.getResourceService(), null, "resumeServices", null, 0, -1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareConcurrentResource_SuspendServices(), theGrmPackage.getResourceService(), null, "suspendServices", null, 0, -1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareConcurrentResource_EnableConcurrencyServices(), theGrmPackage.getResourceService(), null, "enableConcurrencyServices", null, 0, -1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareConcurrentResource_DisableConcurrencyServices(), theGrmPackage.getResourceService(), null, "disableConcurrencyServices", null, 0, -1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareConcurrentResource_TerminateServices(), theGrmPackage.getResourceService(), null, "terminateServices", null, 0, -1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareConcurrentResource_AdressSpace(), this.getMemoryPartition(), this.getMemoryPartition_ConcurrentResources(), "adressSpace", null, 0, 1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareConcurrentResource_PeriodElements(), ecorePackage.getEString(), "periodElements", null, 0, -1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareConcurrentResource_ActivationCapacity(), ecorePackage.getEInt(), "activationCapacity", null, 0, 1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareConcurrentResource_PriorityElements(), ecorePackage.getEString(), "priorityElements", null, 0, -1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareConcurrentResource_StackSizeElements(), ecorePackage.getEString(), "stackSizeElements", null, 0, -1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareConcurrentResource_HeapSizeElements(), ecorePackage.getEString(), "heapSizeElements", null, 0, -1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareConcurrentResource_SharedDataResources(), this.getSharedDataComResource(), null, "sharedDataResources", null, 0, -1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareConcurrentResource_MessageResources(), this.getMessageComResource(), null, "messageResources", null, 0, -1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareConcurrentResource_MutualExclusionResources(), this.getSoftwareMutualExclusionResource(), null, "mutualExclusionResources", null, 0, -1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareConcurrentResource_NotificationResources(), this.getNotificationResource(), null, "notificationResources", null, 0, -1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareConcurrentResource_EntryPoints(), ecorePackage.getEString(), "entryPoints", null, 0, -1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareConcurrentResource_ArrivalPattern(), ecorePackage.getEString(), "arrivalPattern", null, 0, 1, SoftwareConcurrentResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareConnectorEClass, SoftwareConnector.class, "SoftwareConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareInteractionResourceEClass, SoftwareInteractionResource.class, "SoftwareInteractionResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareInteractionResource_IsIntraMemoryPartitionInteraction(), ecorePackage.getEBoolean(), "isIntraMemoryPartitionInteraction", null, 1, 1, SoftwareInteractionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareInteractionResource_WaitingQueuePolicy(), this.getQueuePolicyKind(), "waitingQueuePolicy", null, 0, 1, SoftwareInteractionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareInteractionResource_WaitingQueueCapacity(), ecorePackage.getEInt(), "waitingQueueCapacity", null, 0, 1, SoftwareInteractionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareInteractionResource_WaitingPolicyElements(), ecorePackage.getEString(), "waitingPolicyElements", null, 0, -1, SoftwareInteractionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareInterfaceEClass, SoftwareInterface.class, "SoftwareInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareInterfacePackageEClass, SoftwareInterfacePackage.class, "SoftwareInterfacePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareMutualExclusionResourceEClass, SoftwareMutualExclusionResource.class, "SoftwareMutualExclusionResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareMutualExclusionResource_ConcurrentAccessProtocol(), this.getConcurrentAccesProtocolKind(), "concurrentAccessProtocol", null, 0, 1, SoftwareMutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareMutualExclusionResource_Mechanism(), this.getMutualExclusionResourceKind(), "mechanism", null, 0, 1, SoftwareMutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareMutualExclusionResource_AcquireServices(), theGrmPackage.getResourceService(), null, "acquireServices", null, 0, -1, SoftwareMutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareMutualExclusionResource_ReleaseServices(), theGrmPackage.getResourceService(), null, "releaseServices", null, 0, -1, SoftwareMutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareMutualExclusionResource_AccessTokenElements(), theCoreElementsPackage.getModelElement(), null, "accessTokenElements", null, 0, -1, SoftwareMutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwarePortEClass, SoftwarePort.class, "SoftwarePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareResourceEClass, SoftwareResource.class, "SoftwareResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareResource_CreateServices(), theGrmPackage.getResourceService(), null, "createServices", null, 0, -1, SoftwareResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareResource_DeleteServices(), theGrmPackage.getResourceService(), null, "deleteServices", null, 0, -1, SoftwareResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareResource_InitializeServices(), theGrmPackage.getResourceService(), null, "initializeServices", null, 0, -1, SoftwareResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareResource_MemorySizeFootprint(), ecorePackage.getEInt(), "memorySizeFootprint", null, 0, 1, SoftwareResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareResource_StateElements(), ecorePackage.getEString(), "stateElements", null, 0, -1, SoftwareResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareResource_IdentifierElements(), ecorePackage.getEString(), "identifierElements", null, 0, -1, SoftwareResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareResourcePackageEClass, SoftwareResourcePackage.class, "SoftwareResourcePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareSchedulableResourceEClass, SoftwareSchedulableResource.class, "SoftwareSchedulableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareSchedulableResource_IsStaticSchedulingFeature(), ecorePackage.getEBoolean(), "isStaticSchedulingFeature", null, 1, 1, SoftwareSchedulableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareSchedulableResource_IsPreemptable(), ecorePackage.getEBoolean(), "isPreemptable", null, 1, 1, SoftwareSchedulableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareSchedulableResource_DeadlineElements(), ecorePackage.getEString(), "deadlineElements", null, 0, -1, SoftwareSchedulableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareSchedulableResource_DeadlineTypeElements(), ecorePackage.getEString(), "deadlineTypeElements", null, 0, -1, SoftwareSchedulableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareSchedulableResource_TimeSliceElements(), ecorePackage.getEString(), "timeSliceElements", null, 0, -1, SoftwareSchedulableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareSchedulableResource_JoinServices(), theGrmPackage.getResourceService(), null, "joinServices", null, 0, -1, SoftwareSchedulableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareSchedulableResource_YieldServices(), theGrmPackage.getResourceService(), null, "yieldServices", null, 0, -1, SoftwareSchedulableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareSchedulableResource_DelayServices(), theGrmPackage.getResourceService(), null, "delayServices", null, 0, -1, SoftwareSchedulableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareSchedulableResource_Scheduler(), this.getSoftwareScheduler(), this.getSoftwareScheduler_ScheduledResource(), "scheduler", null, 1, 1, SoftwareSchedulableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareSchedulerEClass, SoftwareScheduler.class, "SoftwareScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareScheduler_ScheduledResource(), this.getSoftwareSchedulableResource(), this.getSoftwareSchedulableResource_Scheduler(), "scheduledResource", null, 0, -1, SoftwareScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareServiceEClass, SoftwareService.class, "SoftwareService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareSynchronizationResourceEClass, SoftwareSynchronizationResource.class, "SoftwareSynchronizationResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareTimerResourceEClass, SoftwareTimerResource.class, "SoftwareTimerResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareTimerResource_DurationElements(), ecorePackage.getEString(), "durationElements", null, 0, -1, SoftwareTimerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accessPolicyKindEEnum, AccessPolicyKind.class, "AccessPolicyKind");
		addEEnumLiteral(accessPolicyKindEEnum, AccessPolicyKind.READ);
		addEEnumLiteral(accessPolicyKindEEnum, AccessPolicyKind.WRITE);
		addEEnumLiteral(accessPolicyKindEEnum, AccessPolicyKind.READ_WRITE);
		addEEnumLiteral(accessPolicyKindEEnum, AccessPolicyKind.UNDEF);
		addEEnumLiteral(accessPolicyKindEEnum, AccessPolicyKind.OTHER);

		initEEnum(concurrentAccesProtocolKindEEnum, ConcurrentAccesProtocolKind.class, "ConcurrentAccesProtocolKind");
		addEEnumLiteral(concurrentAccesProtocolKindEEnum, ConcurrentAccesProtocolKind.PCP);
		addEEnumLiteral(concurrentAccesProtocolKindEEnum, ConcurrentAccesProtocolKind.PIP);
		addEEnumLiteral(concurrentAccesProtocolKindEEnum, ConcurrentAccesProtocolKind.NO_PREEMPTION);
		addEEnumLiteral(concurrentAccesProtocolKindEEnum, ConcurrentAccesProtocolKind.UNDEF);
		addEEnumLiteral(concurrentAccesProtocolKindEEnum, ConcurrentAccesProtocolKind.OTHER);

		initEEnum(interruptKindEEnum, InterruptKind.class, "InterruptKind");
		addEEnumLiteral(interruptKindEEnum, InterruptKind.HARDWARE_INTERRUPTION);
		addEEnumLiteral(interruptKindEEnum, InterruptKind.PROCESSOR_DETECTED_EXCEPTION);
		addEEnumLiteral(interruptKindEEnum, InterruptKind.PROGRAMMED_EXCEPTION);
		addEEnumLiteral(interruptKindEEnum, InterruptKind.UNDEF);
		addEEnumLiteral(interruptKindEEnum, InterruptKind.OTHER);

		initEEnum(queuePolicyKindEEnum, QueuePolicyKind.class, "QueuePolicyKind");
		addEEnumLiteral(queuePolicyKindEEnum, QueuePolicyKind.FIFO);
		addEEnumLiteral(queuePolicyKindEEnum, QueuePolicyKind.LIFO);
		addEEnumLiteral(queuePolicyKindEEnum, QueuePolicyKind.PRIORITY);
		addEEnumLiteral(queuePolicyKindEEnum, QueuePolicyKind.UNDEF);
		addEEnumLiteral(queuePolicyKindEEnum, QueuePolicyKind.OTHER);

		initEEnum(messageResourceKindEEnum, MessageResourceKind.class, "MessageResourceKind");
		addEEnumLiteral(messageResourceKindEEnum, MessageResourceKind.MESSAGE_QUEUE);
		addEEnumLiteral(messageResourceKindEEnum, MessageResourceKind.PIPE);
		addEEnumLiteral(messageResourceKindEEnum, MessageResourceKind.BLACKBOARD);
		addEEnumLiteral(messageResourceKindEEnum, MessageResourceKind.UNDEF);
		addEEnumLiteral(messageResourceKindEEnum, MessageResourceKind.OTHER);

		initEEnum(mutualExclusionResourceKindEEnum, MutualExclusionResourceKind.class, "MutualExclusionResourceKind");
		addEEnumLiteral(mutualExclusionResourceKindEEnum, MutualExclusionResourceKind.BOOLEAN_SEMAPHORE);
		addEEnumLiteral(mutualExclusionResourceKindEEnum, MutualExclusionResourceKind.COUNT_SEMAPHORE);
		addEEnumLiteral(mutualExclusionResourceKindEEnum, MutualExclusionResourceKind.MUTEX);
		addEEnumLiteral(mutualExclusionResourceKindEEnum, MutualExclusionResourceKind.UNDEF);
		addEEnumLiteral(mutualExclusionResourceKindEEnum, MutualExclusionResourceKind.OTHER);

		initEEnum(notificationResourceKindEEnum, NotificationResourceKind.class, "NotificationResourceKind");
		addEEnumLiteral(notificationResourceKindEEnum, NotificationResourceKind.BARRIER);
		addEEnumLiteral(notificationResourceKindEEnum, NotificationResourceKind.EVENT);
		addEEnumLiteral(notificationResourceKindEEnum, NotificationResourceKind.UNDEF);
		addEEnumLiteral(notificationResourceKindEEnum, NotificationResourceKind.OTHER);

		initEEnum(occurencePolicyKindEEnum, OccurencePolicyKind.class, "OccurencePolicyKind");
		addEEnumLiteral(occurencePolicyKindEEnum, OccurencePolicyKind.MEMORIZED);
		addEEnumLiteral(occurencePolicyKindEEnum, OccurencePolicyKind.BOUNDED);
		addEEnumLiteral(occurencePolicyKindEEnum, OccurencePolicyKind.MEMORYLESS);
		addEEnumLiteral(occurencePolicyKindEEnum, OccurencePolicyKind.UNDEF);
		addEEnumLiteral(occurencePolicyKindEEnum, OccurencePolicyKind.OTHER);

		// Initialize data types
		initEDataType(nfP_DurationEDataType, Duration.class, "NFP_Duration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SrmPackageImpl
