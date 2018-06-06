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
package org.polarsys.time4sys.marte.grm.impl;

import static org.polarsys.time4sys.marte.grm.GrmPackage.RESOURCE;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.time4sys.marte.grm.AccessControlPolicy;
import org.polarsys.time4sys.marte.grm.ClockResource;
import org.polarsys.time4sys.marte.grm.CommunicationEndPoint;
import org.polarsys.time4sys.marte.grm.CommunicationMedia;
import org.polarsys.time4sys.marte.grm.CommunicationResource;
import org.polarsys.time4sys.marte.grm.ComputingResource;
import org.polarsys.time4sys.marte.grm.ConcurrencyResource;
import org.polarsys.time4sys.marte.grm.DeviceResource;
import org.polarsys.time4sys.marte.grm.DynamicUsage;
import org.polarsys.time4sys.marte.grm.EDFParameters;
import org.polarsys.time4sys.marte.grm.FixedPriorityParameters;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.MutualExclusionProtocol;
import org.polarsys.time4sys.marte.grm.MutualExclusionResource;
import org.polarsys.time4sys.marte.grm.PeriodicServerKind;
import org.polarsys.time4sys.marte.grm.PeriodicServerParameters;
import org.polarsys.time4sys.marte.grm.PoolingParameters;
import org.polarsys.time4sys.marte.grm.ProcessingResource;
import org.polarsys.time4sys.marte.grm.ProtectProtocolKind;
import org.polarsys.time4sys.marte.grm.ProtectionParameter;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourceBroker;
import org.polarsys.time4sys.marte.grm.ResourceConnector;
import org.polarsys.time4sys.marte.grm.ResourceControlPolicy;
import org.polarsys.time4sys.marte.grm.ResourceInstance;
import org.polarsys.time4sys.marte.grm.ResourceInterface;
import org.polarsys.time4sys.marte.grm.ResourceManager;
import org.polarsys.time4sys.marte.grm.ResourcePackage;
import org.polarsys.time4sys.marte.grm.ResourcePackageableElement;
import org.polarsys.time4sys.marte.grm.ResourcePort;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.grm.ResourceUsage;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.marte.grm.ScheduleSpecification;
import org.polarsys.time4sys.marte.grm.Scheduler;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.grm.SchedulingPolicy;
import org.polarsys.time4sys.marte.grm.SecondaryScheduler;
import org.polarsys.time4sys.marte.grm.StaticUsage;
import org.polarsys.time4sys.marte.grm.StorageResource;
import org.polarsys.time4sys.marte.grm.SynchResource;
import org.polarsys.time4sys.marte.grm.TableDrivenSchedule;
import org.polarsys.time4sys.marte.grm.TableEntryType;
import org.polarsys.time4sys.marte.grm.TimerResource;
import org.polarsys.time4sys.marte.grm.TimingResource;
import org.polarsys.time4sys.marte.grm.TransmModeKind;
import org.polarsys.time4sys.marte.grm.UsageDemand;
import org.polarsys.time4sys.marte.grm.UsageTypedAmount;
import org.polarsys.time4sys.marte.grm.util.GrmValidator;
import org.polarsys.time4sys.marte.nfp.DataSize;
import org.polarsys.time4sys.marte.nfp.DataTxRate;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrmPackageImpl extends EPackageImpl implements GrmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePackageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableDrivenScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationEndPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationMediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceBrokerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessControlPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceControlPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secondarySchedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulableResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutualExclusionResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicServerParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolingParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutualExclusionProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageDemandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageTypedAmountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum periodicServerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edfParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedPriorityParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transmModeKindEEnum = null;

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
	private EDataType nfP_DataSizeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nfP_DataTxRateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protectProtocolKindEEnum = null;

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
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GrmPackageImpl() {
		super(eNS_URI, GrmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GrmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GrmPackage init() {
		if (isInited) return (GrmPackage)EPackage.Registry.INSTANCE.getEPackage(GrmPackage.eNS_URI);

		// Obtain or create and register package
		GrmPackageImpl theGrmPackage = (GrmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GrmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GrmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CoreElementsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGrmPackage.createPackageContents();

		// Initialize created meta-data
		theGrmPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGrmPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GrmValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGrmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GrmPackage.eNS_URI, theGrmPackage);
		return theGrmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcePackage() {
		return resourcePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcePackageableElement() {
		return resourcePackageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceInstance() {
		return resourceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInstance_Type() {
		return (EReference)resourceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInstance_Port() {
		return (EReference)resourceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_OwnedResource() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_ResMult() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_IsProtected() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_IsActive() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_PServices() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_OwnedPort() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_OwnedConnector() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_RServices() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_UsedBy() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageResource() {
		return storageResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingResource() {
		return timingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationResource() {
		return communicationResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchResource() {
		return synchResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableDrivenSchedule() {
		return tableDrivenScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableDrivenSchedule_FrameCycleTime() {
		return (EAttribute)tableDrivenScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableDrivenSchedule_Entries() {
		return (EReference)tableDrivenScheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableEntryType() {
		return tableEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableEntryType_Schedule() {
		return (EReference)tableEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableEntryType_TimeSlot() {
		return (EAttribute)tableEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableEntryType_Offset() {
		return (EAttribute)tableEntryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableEntryType_InitialBudget() {
		return (EAttribute)tableEntryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcurrencyResource() {
		return concurrencyResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputingResource() {
		return computingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceResource() {
		return deviceResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockResource() {
		return clockResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimerResource() {
		return timerResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimerResource_Duration() {
		return (EAttribute)timerResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimerResource_IsPeriodic() {
		return (EAttribute)timerResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerResource_Start() {
		return (EReference)timerResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerResource_Set() {
		return (EReference)timerResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerResource_Get() {
		return (EReference)timerResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerResource_Reset() {
		return (EReference)timerResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerResource_Pause() {
		return (EReference)timerResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceService() {
		return resourceServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceService_Context() {
		return (EReference)resourceServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationEndPoint() {
		return communicationEndPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationEndPoint_PacketSize() {
		return (EAttribute)communicationEndPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationMedia() {
		return communicationMediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationMedia_ElementSize() {
		return (EAttribute)communicationMediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationMedia_Capacity() {
		return (EAttribute)communicationMediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationMedia_PacketTime() {
		return (EAttribute)communicationMediaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationMedia_BlockingTime() {
		return (EAttribute)communicationMediaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationMedia_TransmMode() {
		return (EAttribute)communicationMediaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingResource() {
		return processingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingResource_SpeedFactor() {
		return (EAttribute)processingResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingResource_MainScheduler() {
		return (EReference)processingResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceConnector() {
		return resourceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceConnector_SourcePort() {
		return (EReference)resourceConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceConnector_TargetPort() {
		return (EReference)resourceConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcePort() {
		return resourcePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcePort_PInterface() {
		return (EReference)resourcePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcePort_RInterface() {
		return (EReference)resourcePortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceBroker() {
		return resourceBrokerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceBroker_BrokedResource() {
		return (EReference)resourceBrokerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceBroker_AccCtrlPolicy() {
		return (EReference)resourceBrokerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceManager() {
		return resourceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceManager_ManagedResource() {
		return (EReference)resourceManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceManager_ResCtrlPolicy() {
		return (EReference)resourceManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessControlPolicy() {
		return accessControlPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceControlPolicy() {
		return resourceControlPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduler() {
		return schedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_Host() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_ProcessingUnits() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_SchedulableResource() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_Policy() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecondaryScheduler() {
		return secondarySchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondaryScheduler_VirtualProcessingUnit() {
		return (EReference)secondarySchedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulableResource() {
		return schedulableResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulableResource_DependentScheduler() {
		return (EReference)schedulableResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulableResource_Host() {
		return (EReference)schedulableResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulableResource_SchedParams() {
		return (EReference)schedulableResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduleSpecification() {
		return scheduleSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulingParameter() {
		return schedulingParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulingParameter_Value() {
		return (EAttribute)schedulingParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulingPolicy() {
		return schedulingPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulingPolicy_Policy() {
		return (EAttribute)schedulingPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulingPolicy_OtherSchedPolicy() {
		return (EAttribute)schedulingPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingPolicy_Schedule() {
		return (EReference)schedulingPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSchedulingPolicy__HasValidPolicy__DiagnosticChain_Map() {
		return schedulingPolicyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMutualExclusionResource() {
		return mutualExclusionResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutualExclusionResource_Scheduler() {
		return (EReference)mutualExclusionResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutualExclusionResource_Protocol() {
		return (EReference)mutualExclusionResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutualExclusionResource_ProtectParams() {
		return (EReference)mutualExclusionResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicServerParameters() {
		return periodicServerParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicServerParameters_Kind() {
		return (EAttribute)periodicServerParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicServerParameters_BackgroundPriority() {
		return (EAttribute)periodicServerParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicServerParameters_InitialBudget() {
		return (EAttribute)periodicServerParametersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicServerParameters_ReplenishPeriod() {
		return (EAttribute)periodicServerParametersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicServerParameters_MaxPendingReplenish() {
		return (EAttribute)periodicServerParametersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoolingParameters() {
		return poolingParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolingParameters_Period() {
		return (EAttribute)poolingParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolingParameters_Overhead() {
		return (EAttribute)poolingParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMutualExclusionProtocol() {
		return mutualExclusionProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMutualExclusionProtocol_Protocol() {
		return (EAttribute)mutualExclusionProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMutualExclusionProtocol_OtherProtocol() {
		return (EAttribute)mutualExclusionProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtectionParameter() {
		return protectionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtectionParameter_PriorityCeiling() {
		return (EAttribute)protectionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtectionParameter_PreemptionLevel() {
		return (EAttribute)protectionParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsageDemand() {
		return usageDemandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsageDemand_Usage() {
		return (EReference)usageDemandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsageDemand_Event() {
		return (EAttribute)usageDemandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceUsage() {
		return resourceUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceUsage_Workload() {
		return (EReference)resourceUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceUsage_RequiredAmount() {
		return (EReference)resourceUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceUsage_UsedResource() {
		return (EReference)resourceUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsageTypedAmount() {
		return usageTypedAmountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsageTypedAmount_ExecTime() {
		return (EAttribute)usageTypedAmountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsageTypedAmount_MsgSize() {
		return (EAttribute)usageTypedAmountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsageTypedAmount_Allocatedmemory() {
		return (EAttribute)usageTypedAmountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsageTypedAmount_UsedMemory() {
		return (EAttribute)usageTypedAmountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsageTypedAmount_PowerPeak() {
		return (EAttribute)usageTypedAmountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsageTypedAmount_Energy() {
		return (EAttribute)usageTypedAmountEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPeriodicServerKind() {
		return periodicServerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicUsage() {
		return dynamicUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDFParameters() {
		return edfParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDFParameters_Deadline() {
		return (EAttribute)edfParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedPriorityParameters() {
		return fixedPriorityParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedPriorityParameters_Priority() {
		return (EAttribute)fixedPriorityParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticUsage() {
		return staticUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceInterface() {
		return resourceInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInterface_OwnedService() {
		return (EReference)resourceInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransmModeKind() {
		return transmModeKindEEnum;
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
	public EDataType getNFP_DataSize() {
		return nfP_DataSizeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNFP_DataTxRate() {
		return nfP_DataTxRateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchedPolicyKind() {
		return schedPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtectProtocolKind() {
		return protectProtocolKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrmFactory getGrmFactory() {
		return (GrmFactory)getEFactoryInstance();
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
		accessControlPolicyEClass = createEClass(ACCESS_CONTROL_POLICY);

		clockResourceEClass = createEClass(CLOCK_RESOURCE);

		communicationEndPointEClass = createEClass(COMMUNICATION_END_POINT);
		createEAttribute(communicationEndPointEClass, COMMUNICATION_END_POINT__PACKET_SIZE);

		communicationMediaEClass = createEClass(COMMUNICATION_MEDIA);
		createEAttribute(communicationMediaEClass, COMMUNICATION_MEDIA__ELEMENT_SIZE);
		createEAttribute(communicationMediaEClass, COMMUNICATION_MEDIA__CAPACITY);
		createEAttribute(communicationMediaEClass, COMMUNICATION_MEDIA__PACKET_TIME);
		createEAttribute(communicationMediaEClass, COMMUNICATION_MEDIA__BLOCKING_TIME);
		createEAttribute(communicationMediaEClass, COMMUNICATION_MEDIA__TRANSM_MODE);

		computingResourceEClass = createEClass(COMPUTING_RESOURCE);

		concurrencyResourceEClass = createEClass(CONCURRENCY_RESOURCE);

		communicationResourceEClass = createEClass(COMMUNICATION_RESOURCE);

		deviceResourceEClass = createEClass(DEVICE_RESOURCE);

		dynamicUsageEClass = createEClass(DYNAMIC_USAGE);

		edfParametersEClass = createEClass(EDF_PARAMETERS);
		createEAttribute(edfParametersEClass, EDF_PARAMETERS__DEADLINE);

		fixedPriorityParametersEClass = createEClass(FIXED_PRIORITY_PARAMETERS);
		createEAttribute(fixedPriorityParametersEClass, FIXED_PRIORITY_PARAMETERS__PRIORITY);

		mutualExclusionProtocolEClass = createEClass(MUTUAL_EXCLUSION_PROTOCOL);
		createEAttribute(mutualExclusionProtocolEClass, MUTUAL_EXCLUSION_PROTOCOL__PROTOCOL);
		createEAttribute(mutualExclusionProtocolEClass, MUTUAL_EXCLUSION_PROTOCOL__OTHER_PROTOCOL);

		mutualExclusionResourceEClass = createEClass(MUTUAL_EXCLUSION_RESOURCE);
		createEReference(mutualExclusionResourceEClass, MUTUAL_EXCLUSION_RESOURCE__SCHEDULER);
		createEReference(mutualExclusionResourceEClass, MUTUAL_EXCLUSION_RESOURCE__PROTOCOL);
		createEReference(mutualExclusionResourceEClass, MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS);

		periodicServerParametersEClass = createEClass(PERIODIC_SERVER_PARAMETERS);
		createEAttribute(periodicServerParametersEClass, PERIODIC_SERVER_PARAMETERS__KIND);
		createEAttribute(periodicServerParametersEClass, PERIODIC_SERVER_PARAMETERS__BACKGROUND_PRIORITY);
		createEAttribute(periodicServerParametersEClass, PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET);
		createEAttribute(periodicServerParametersEClass, PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD);
		createEAttribute(periodicServerParametersEClass, PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH);

		poolingParametersEClass = createEClass(POOLING_PARAMETERS);
		createEAttribute(poolingParametersEClass, POOLING_PARAMETERS__PERIOD);
		createEAttribute(poolingParametersEClass, POOLING_PARAMETERS__OVERHEAD);

		processingResourceEClass = createEClass(PROCESSING_RESOURCE);
		createEAttribute(processingResourceEClass, PROCESSING_RESOURCE__SPEED_FACTOR);
		createEReference(processingResourceEClass, PROCESSING_RESOURCE__MAIN_SCHEDULER);

		protectionParameterEClass = createEClass(PROTECTION_PARAMETER);
		createEAttribute(protectionParameterEClass, PROTECTION_PARAMETER__PRIORITY_CEILING);
		createEAttribute(protectionParameterEClass, PROTECTION_PARAMETER__PREEMPTION_LEVEL);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__OWNED_RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__RES_MULT);
		createEAttribute(resourceEClass, RESOURCE__IS_PROTECTED);
		createEAttribute(resourceEClass, RESOURCE__IS_ACTIVE);
		createEReference(resourceEClass, RESOURCE__OWNED_PORT);
		createEReference(resourceEClass, RESOURCE__OWNED_CONNECTOR);
		createEReference(resourceEClass, RESOURCE__RSERVICES);
		createEReference(resourceEClass, RESOURCE__USED_BY);
		createEReference(resourceEClass, RESOURCE__PSERVICES);

		resourceBrokerEClass = createEClass(RESOURCE_BROKER);
		createEReference(resourceBrokerEClass, RESOURCE_BROKER__BROKED_RESOURCE);
		createEReference(resourceBrokerEClass, RESOURCE_BROKER__ACC_CTRL_POLICY);

		resourceConnectorEClass = createEClass(RESOURCE_CONNECTOR);
		createEReference(resourceConnectorEClass, RESOURCE_CONNECTOR__SOURCE_PORT);
		createEReference(resourceConnectorEClass, RESOURCE_CONNECTOR__TARGET_PORT);

		resourceControlPolicyEClass = createEClass(RESOURCE_CONTROL_POLICY);

		resourceInstanceEClass = createEClass(RESOURCE_INSTANCE);
		createEReference(resourceInstanceEClass, RESOURCE_INSTANCE__TYPE);
		createEReference(resourceInstanceEClass, RESOURCE_INSTANCE__PORT);

		resourceInterfaceEClass = createEClass(RESOURCE_INTERFACE);
		createEReference(resourceInterfaceEClass, RESOURCE_INTERFACE__OWNED_SERVICE);

		resourceManagerEClass = createEClass(RESOURCE_MANAGER);
		createEReference(resourceManagerEClass, RESOURCE_MANAGER__MANAGED_RESOURCE);
		createEReference(resourceManagerEClass, RESOURCE_MANAGER__RES_CTRL_POLICY);

		resourcePackageEClass = createEClass(RESOURCE_PACKAGE);

		resourcePackageableElementEClass = createEClass(RESOURCE_PACKAGEABLE_ELEMENT);

		resourcePortEClass = createEClass(RESOURCE_PORT);
		createEReference(resourcePortEClass, RESOURCE_PORT__PINTERFACE);
		createEReference(resourcePortEClass, RESOURCE_PORT__RINTERFACE);

		resourceServiceEClass = createEClass(RESOURCE_SERVICE);
		createEReference(resourceServiceEClass, RESOURCE_SERVICE__CONTEXT);

		resourceUsageEClass = createEClass(RESOURCE_USAGE);
		createEReference(resourceUsageEClass, RESOURCE_USAGE__WORKLOAD);
		createEReference(resourceUsageEClass, RESOURCE_USAGE__REQUIRED_AMOUNT);
		createEReference(resourceUsageEClass, RESOURCE_USAGE__USED_RESOURCE);

		schedulerEClass = createEClass(SCHEDULER);
		createEReference(schedulerEClass, SCHEDULER__HOST);
		createEReference(schedulerEClass, SCHEDULER__PROCESSING_UNITS);
		createEReference(schedulerEClass, SCHEDULER__SCHEDULABLE_RESOURCE);
		createEReference(schedulerEClass, SCHEDULER__POLICY);

		schedulableResourceEClass = createEClass(SCHEDULABLE_RESOURCE);
		createEReference(schedulableResourceEClass, SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER);
		createEReference(schedulableResourceEClass, SCHEDULABLE_RESOURCE__HOST);
		createEReference(schedulableResourceEClass, SCHEDULABLE_RESOURCE__SCHED_PARAMS);

		scheduleSpecificationEClass = createEClass(SCHEDULE_SPECIFICATION);

		schedulingParameterEClass = createEClass(SCHEDULING_PARAMETER);
		createEAttribute(schedulingParameterEClass, SCHEDULING_PARAMETER__VALUE);

		schedulingPolicyEClass = createEClass(SCHEDULING_POLICY);
		createEAttribute(schedulingPolicyEClass, SCHEDULING_POLICY__POLICY);
		createEAttribute(schedulingPolicyEClass, SCHEDULING_POLICY__OTHER_SCHED_POLICY);
		createEReference(schedulingPolicyEClass, SCHEDULING_POLICY__SCHEDULE);
		createEOperation(schedulingPolicyEClass, SCHEDULING_POLICY___HAS_VALID_POLICY__DIAGNOSTICCHAIN_MAP);

		secondarySchedulerEClass = createEClass(SECONDARY_SCHEDULER);
		createEReference(secondarySchedulerEClass, SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNIT);

		staticUsageEClass = createEClass(STATIC_USAGE);

		storageResourceEClass = createEClass(STORAGE_RESOURCE);

		synchResourceEClass = createEClass(SYNCH_RESOURCE);

		tableDrivenScheduleEClass = createEClass(TABLE_DRIVEN_SCHEDULE);
		createEAttribute(tableDrivenScheduleEClass, TABLE_DRIVEN_SCHEDULE__FRAME_CYCLE_TIME);
		createEReference(tableDrivenScheduleEClass, TABLE_DRIVEN_SCHEDULE__ENTRIES);

		tableEntryTypeEClass = createEClass(TABLE_ENTRY_TYPE);
		createEReference(tableEntryTypeEClass, TABLE_ENTRY_TYPE__SCHEDULE);
		createEAttribute(tableEntryTypeEClass, TABLE_ENTRY_TYPE__TIME_SLOT);
		createEAttribute(tableEntryTypeEClass, TABLE_ENTRY_TYPE__OFFSET);
		createEAttribute(tableEntryTypeEClass, TABLE_ENTRY_TYPE__INITIAL_BUDGET);

		timingResourceEClass = createEClass(TIMING_RESOURCE);

		timerResourceEClass = createEClass(TIMER_RESOURCE);
		createEAttribute(timerResourceEClass, TIMER_RESOURCE__DURATION);
		createEAttribute(timerResourceEClass, TIMER_RESOURCE__IS_PERIODIC);
		createEReference(timerResourceEClass, TIMER_RESOURCE__START);
		createEReference(timerResourceEClass, TIMER_RESOURCE__SET);
		createEReference(timerResourceEClass, TIMER_RESOURCE__GET);
		createEReference(timerResourceEClass, TIMER_RESOURCE__RESET);
		createEReference(timerResourceEClass, TIMER_RESOURCE__PAUSE);

		usageDemandEClass = createEClass(USAGE_DEMAND);
		createEReference(usageDemandEClass, USAGE_DEMAND__USAGE);
		createEAttribute(usageDemandEClass, USAGE_DEMAND__EVENT);

		usageTypedAmountEClass = createEClass(USAGE_TYPED_AMOUNT);
		createEAttribute(usageTypedAmountEClass, USAGE_TYPED_AMOUNT__EXEC_TIME);
		createEAttribute(usageTypedAmountEClass, USAGE_TYPED_AMOUNT__MSG_SIZE);
		createEAttribute(usageTypedAmountEClass, USAGE_TYPED_AMOUNT__ALLOCATEDMEMORY);
		createEAttribute(usageTypedAmountEClass, USAGE_TYPED_AMOUNT__USED_MEMORY);
		createEAttribute(usageTypedAmountEClass, USAGE_TYPED_AMOUNT__POWER_PEAK);
		createEAttribute(usageTypedAmountEClass, USAGE_TYPED_AMOUNT__ENERGY);

		// Create enums
		periodicServerKindEEnum = createEEnum(PERIODIC_SERVER_KIND);
		protectProtocolKindEEnum = createEEnum(PROTECT_PROTOCOL_KIND);
		schedPolicyKindEEnum = createEEnum(SCHED_POLICY_KIND);
		transmModeKindEEnum = createEEnum(TRANSM_MODE_KIND);

		// Create data types
		nfP_DurationEDataType = createEDataType(NFP_DURATION);
		nfP_DataSizeEDataType = createEDataType(NFP_DATA_SIZE);
		nfP_DataTxRateEDataType = createEDataType(NFP_DATA_TX_RATE);
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
		CoreElementsPackage theCoreElementsPackage = (CoreElementsPackage)EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		accessControlPolicyEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());
		clockResourceEClass.getESuperTypes().add(this.getTimingResource());
		communicationEndPointEClass.getESuperTypes().add(this.getCommunicationResource());
		communicationMediaEClass.getESuperTypes().add(this.getCommunicationResource());
		communicationMediaEClass.getESuperTypes().add(this.getProcessingResource());
		computingResourceEClass.getESuperTypes().add(this.getProcessingResource());
		concurrencyResourceEClass.getESuperTypes().add(this.getResource());
		communicationResourceEClass.getESuperTypes().add(this.getResource());
		deviceResourceEClass.getESuperTypes().add(this.getProcessingResource());
		dynamicUsageEClass.getESuperTypes().add(this.getResourceUsage());
		edfParametersEClass.getESuperTypes().add(this.getSchedulingParameter());
		fixedPriorityParametersEClass.getESuperTypes().add(this.getSchedulingParameter());
		mutualExclusionProtocolEClass.getESuperTypes().add(this.getAccessControlPolicy());
		mutualExclusionResourceEClass.getESuperTypes().add(this.getSynchResource());
		periodicServerParametersEClass.getESuperTypes().add(this.getFixedPriorityParameters());
		poolingParametersEClass.getESuperTypes().add(this.getFixedPriorityParameters());
		processingResourceEClass.getESuperTypes().add(this.getResource());
		protectionParameterEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());
		resourceEClass.getESuperTypes().add(this.getResourcePackageableElement());
		resourceBrokerEClass.getESuperTypes().add(this.getResource());
		resourceConnectorEClass.getESuperTypes().add(theCoreElementsPackage.getModelElement());
		resourceControlPolicyEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());
		resourceInstanceEClass.getESuperTypes().add(this.getResourcePackageableElement());
		resourceInterfaceEClass.getESuperTypes().add(this.getResourcePackageableElement());
		resourceManagerEClass.getESuperTypes().add(this.getResource());
		resourcePackageEClass.getESuperTypes().add(theCoreElementsPackage.getPackage());
		resourcePackageableElementEClass.getESuperTypes().add(theCoreElementsPackage.getPackageableElement());
		resourcePortEClass.getESuperTypes().add(this.getCommunicationEndPoint());
		resourcePortEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());
		resourceServiceEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());
		resourceUsageEClass.getESuperTypes().add(theCoreElementsPackage.getModelElement());
		schedulerEClass.getESuperTypes().add(this.getResourceBroker());
		schedulableResourceEClass.getESuperTypes().add(this.getConcurrencyResource());
		scheduleSpecificationEClass.getESuperTypes().add(theCoreElementsPackage.getModelElement());
		schedulingParameterEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());
		schedulingPolicyEClass.getESuperTypes().add(this.getAccessControlPolicy());
		secondarySchedulerEClass.getESuperTypes().add(this.getScheduler());
		staticUsageEClass.getESuperTypes().add(this.getResourceUsage());
		storageResourceEClass.getESuperTypes().add(this.getResource());
		synchResourceEClass.getESuperTypes().add(this.getResource());
		tableDrivenScheduleEClass.getESuperTypes().add(this.getScheduleSpecification());
		tableEntryTypeEClass.getESuperTypes().add(this.getSchedulingParameter());
		timingResourceEClass.getESuperTypes().add(this.getResource());
		timerResourceEClass.getESuperTypes().add(this.getTimingResource());
		usageDemandEClass.getESuperTypes().add(theCoreElementsPackage.getModelElement());
		usageTypedAmountEClass.getESuperTypes().add(this.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(accessControlPolicyEClass, AccessControlPolicy.class, "AccessControlPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clockResourceEClass, ClockResource.class, "ClockResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(communicationEndPointEClass, CommunicationEndPoint.class, "CommunicationEndPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationEndPoint_PacketSize(), ecorePackage.getEInt(), "packetSize", null, 0, 1, CommunicationEndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationMediaEClass, CommunicationMedia.class, "CommunicationMedia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationMedia_ElementSize(), this.getNFP_DataSize(), "elementSize", null, 0, 1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationMedia_Capacity(), this.getNFP_DataTxRate(), "capacity", null, 0, 1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationMedia_PacketTime(), this.getNFP_Duration(), "packetTime", null, 0, 1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationMedia_BlockingTime(), this.getNFP_Duration(), "blockingTime", null, 0, 1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationMedia_TransmMode(), this.getTransmModeKind(), "transmMode", null, 0, 1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computingResourceEClass, ComputingResource.class, "ComputingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concurrencyResourceEClass, ConcurrencyResource.class, "ConcurrencyResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(communicationResourceEClass, CommunicationResource.class, "CommunicationResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceResourceEClass, DeviceResource.class, "DeviceResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicUsageEClass, DynamicUsage.class, "DynamicUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edfParametersEClass, EDFParameters.class, "EDFParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDFParameters_Deadline(), this.getNFP_Duration(), "deadline", null, 1, 1, EDFParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedPriorityParametersEClass, FixedPriorityParameters.class, "FixedPriorityParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedPriorityParameters_Priority(), theEcorePackage.getEInt(), "priority", null, 1, 1, FixedPriorityParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mutualExclusionProtocolEClass, MutualExclusionProtocol.class, "MutualExclusionProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMutualExclusionProtocol_Protocol(), this.getProtectProtocolKind(), "protocol", null, 0, 1, MutualExclusionProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMutualExclusionProtocol_OtherProtocol(), ecorePackage.getEString(), "otherProtocol", null, 0, 1, MutualExclusionProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mutualExclusionResourceEClass, MutualExclusionResource.class, "MutualExclusionResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMutualExclusionResource_Scheduler(), this.getResourceBroker(), null, "scheduler", null, 0, 1, MutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutualExclusionResource_Protocol(), this.getMutualExclusionProtocol(), null, "protocol", null, 1, 1, MutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutualExclusionResource_ProtectParams(), this.getProtectionParameter(), null, "protectParams", null, 0, -1, MutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicServerParametersEClass, PeriodicServerParameters.class, "PeriodicServerParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriodicServerParameters_Kind(), this.getPeriodicServerKind(), "kind", "Undef", 0, 1, PeriodicServerParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicServerParameters_BackgroundPriority(), theEcorePackage.getEInt(), "backgroundPriority", null, 0, 1, PeriodicServerParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicServerParameters_InitialBudget(), this.getNFP_Duration(), "initialBudget", null, 0, 1, PeriodicServerParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicServerParameters_ReplenishPeriod(), this.getNFP_Duration(), "replenishPeriod", null, 0, 1, PeriodicServerParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicServerParameters_MaxPendingReplenish(), theEcorePackage.getEInt(), "maxPendingReplenish", null, 0, 1, PeriodicServerParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poolingParametersEClass, PoolingParameters.class, "PoolingParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoolingParameters_Period(), this.getNFP_Duration(), "period", null, 0, 1, PoolingParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoolingParameters_Overhead(), this.getNFP_Duration(), "overhead", null, 0, 1, PoolingParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingResourceEClass, ProcessingResource.class, "ProcessingResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingResource_SpeedFactor(), ecorePackage.getEFloat(), "speedFactor", null, 0, 1, ProcessingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingResource_MainScheduler(), this.getScheduler(), null, "mainScheduler", null, 0, 1, ProcessingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protectionParameterEClass, ProtectionParameter.class, "ProtectionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtectionParameter_PriorityCeiling(), ecorePackage.getEInt(), "priorityCeiling", null, 0, 1, ProtectionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtectionParameter_PreemptionLevel(), ecorePackage.getEInt(), "preemptionLevel", null, 0, 1, ProtectionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_OwnedResource(), this.getResource(), null, "ownedResource", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_ResMult(), ecorePackage.getEInt(), "resMult", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_IsProtected(), ecorePackage.getEBoolean(), "isProtected", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_IsActive(), ecorePackage.getEBoolean(), "isActive", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_OwnedPort(), this.getResourcePort(), null, "ownedPort", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_OwnedConnector(), this.getResourceConnector(), null, "ownedConnector", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_RServices(), this.getResourceService(), null, "rServices", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_UsedBy(), this.getResourceUsage(), this.getResourceUsage_UsedResource(), "usedBy", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_PServices(), this.getResourceService(), this.getResourceService_Context(), "pServices", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceBrokerEClass, ResourceBroker.class, "ResourceBroker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceBroker_BrokedResource(), this.getResource(), null, "brokedResource", null, 1, -1, ResourceBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceBroker_AccCtrlPolicy(), this.getAccessControlPolicy(), null, "accCtrlPolicy", null, 1, -1, ResourceBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceConnectorEClass, ResourceConnector.class, "ResourceConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceConnector_SourcePort(), this.getResourcePort(), null, "sourcePort", null, 1, 1, ResourceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceConnector_TargetPort(), this.getResourcePort(), null, "targetPort", null, 1, 1, ResourceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceControlPolicyEClass, ResourceControlPolicy.class, "ResourceControlPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceInstanceEClass, ResourceInstance.class, "ResourceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceInstance_Type(), this.getResource(), null, "type", null, 1, 1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceInstance_Port(), this.getResourcePort(), null, "port", null, 0, -1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(resourceInterfaceEClass, ResourceInterface.class, "ResourceInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceInterface_OwnedService(), this.getResourceService(), null, "ownedService", null, 0, -1, ResourceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceManagerEClass, ResourceManager.class, "ResourceManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceManager_ManagedResource(), this.getResource(), null, "managedResource", null, 1, -1, ResourceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceManager_ResCtrlPolicy(), this.getResourceControlPolicy(), null, "resCtrlPolicy", null, 1, -1, ResourceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcePackageEClass, ResourcePackage.class, "ResourcePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourcePackageableElementEClass, ResourcePackageableElement.class, "ResourcePackageableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourcePortEClass, ResourcePort.class, "ResourcePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourcePort_PInterface(), this.getResourceInterface(), null, "pInterface", null, 0, -1, ResourcePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourcePort_RInterface(), this.getResourceInterface(), null, "rInterface", null, 0, -1, ResourcePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceServiceEClass, ResourceService.class, "ResourceService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceService_Context(), this.getResource(), this.getResource_PServices(), "context", null, 0, 1, ResourceService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceUsageEClass, ResourceUsage.class, "ResourceUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceUsage_Workload(), this.getUsageDemand(), this.getUsageDemand_Usage(), "workload", null, 0, -1, ResourceUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceUsage_RequiredAmount(), this.getUsageTypedAmount(), null, "requiredAmount", null, 0, -1, ResourceUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceUsage_UsedResource(), this.getResource(), this.getResource_UsedBy(), "usedResource", null, 0, -1, ResourceUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulerEClass, Scheduler.class, "Scheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScheduler_Host(), this.getComputingResource(), null, "host", null, 1, 1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduler_ProcessingUnits(), this.getProcessingResource(), null, "processingUnits", null, 1, -1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduler_SchedulableResource(), this.getSchedulableResource(), this.getSchedulableResource_Host(), "schedulableResource", null, 0, -1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduler_Policy(), this.getSchedulingPolicy(), null, "policy", null, 1, 1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulableResourceEClass, SchedulableResource.class, "SchedulableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedulableResource_DependentScheduler(), this.getSecondaryScheduler(), this.getSecondaryScheduler_VirtualProcessingUnit(), "dependentScheduler", null, 0, 1, SchedulableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulableResource_Host(), this.getScheduler(), this.getScheduler_SchedulableResource(), "host", null, 1, 1, SchedulableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulableResource_SchedParams(), this.getSchedulingParameter(), null, "schedParams", null, 0, -1, SchedulableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scheduleSpecificationEClass, ScheduleSpecification.class, "ScheduleSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schedulingParameterEClass, SchedulingParameter.class, "SchedulingParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchedulingParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, SchedulingParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulingPolicyEClass, SchedulingPolicy.class, "SchedulingPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchedulingPolicy_Policy(), this.getSchedPolicyKind(), "policy", "Undef", 0, 1, SchedulingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedulingPolicy_OtherSchedPolicy(), ecorePackage.getEString(), "otherSchedPolicy", null, 0, 1, SchedulingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingPolicy_Schedule(), this.getScheduleSpecification(), null, "schedule", null, 0, 1, SchedulingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSchedulingPolicy__HasValidPolicy__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasValidPolicy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(secondarySchedulerEClass, SecondaryScheduler.class, "SecondaryScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecondaryScheduler_VirtualProcessingUnit(), this.getSchedulableResource(), this.getSchedulableResource_DependentScheduler(), "virtualProcessingUnit", null, 1, -1, SecondaryScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticUsageEClass, StaticUsage.class, "StaticUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storageResourceEClass, StorageResource.class, "StorageResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(synchResourceEClass, SynchResource.class, "SynchResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableDrivenScheduleEClass, TableDrivenSchedule.class, "TableDrivenSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableDrivenSchedule_FrameCycleTime(), this.getNFP_Duration(), "frameCycleTime", null, 0, 1, TableDrivenSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableDrivenSchedule_Entries(), this.getTableEntryType(), this.getTableEntryType_Schedule(), "entries", null, 0, -1, TableDrivenSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEntryTypeEClass, TableEntryType.class, "TableEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableEntryType_Schedule(), this.getTableDrivenSchedule(), this.getTableDrivenSchedule_Entries(), "schedule", null, 0, 1, TableEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableEntryType_TimeSlot(), this.getNFP_Duration(), "timeSlot", null, 1, -1, TableEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableEntryType_Offset(), this.getNFP_Duration(), "offset", null, 0, -1, TableEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableEntryType_InitialBudget(), this.getNFP_Duration(), "initialBudget", null, 0, 1, TableEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingResourceEClass, TimingResource.class, "TimingResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timerResourceEClass, TimerResource.class, "TimerResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimerResource_Duration(), this.getNFP_Duration(), "duration", null, 0, 1, TimerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimerResource_IsPeriodic(), ecorePackage.getEBoolean(), "isPeriodic", null, 0, 1, TimerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimerResource_Start(), this.getResourceService(), null, "start", null, 1, 1, TimerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimerResource_Set(), this.getResourceService(), null, "set", null, 1, 1, TimerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimerResource_Get(), this.getResourceService(), null, "get", null, 1, 1, TimerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimerResource_Reset(), this.getResourceService(), null, "reset", null, 1, 1, TimerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimerResource_Pause(), this.getResourceService(), null, "pause", null, 1, 1, TimerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usageDemandEClass, UsageDemand.class, "UsageDemand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsageDemand_Usage(), this.getResourceUsage(), this.getResourceUsage_Workload(), "usage", null, 0, -1, UsageDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsageDemand_Event(), ecorePackage.getEString(), "event", null, 0, 1, UsageDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usageTypedAmountEClass, UsageTypedAmount.class, "UsageTypedAmount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsageTypedAmount_ExecTime(), ecorePackage.getEInt(), "execTime", null, 0, 1, UsageTypedAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsageTypedAmount_MsgSize(), ecorePackage.getEInt(), "msgSize", null, 0, 1, UsageTypedAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsageTypedAmount_Allocatedmemory(), ecorePackage.getEInt(), "allocatedmemory", null, 0, 1, UsageTypedAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsageTypedAmount_UsedMemory(), ecorePackage.getEInt(), "usedMemory", null, 0, 1, UsageTypedAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsageTypedAmount_PowerPeak(), ecorePackage.getEInt(), "powerPeak", null, 0, 1, UsageTypedAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsageTypedAmount_Energy(), ecorePackage.getEInt(), "energy", null, 0, 1, UsageTypedAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(periodicServerKindEEnum, PeriodicServerKind.class, "PeriodicServerKind");
		addEEnumLiteral(periodicServerKindEEnum, PeriodicServerKind.UNDEF);
		addEEnumLiteral(periodicServerKindEEnum, PeriodicServerKind.SPORADIC);
		addEEnumLiteral(periodicServerKindEEnum, PeriodicServerKind.DEFERRABLE);
		addEEnumLiteral(periodicServerKindEEnum, PeriodicServerKind.OTHER);

		initEEnum(protectProtocolKindEEnum, ProtectProtocolKind.class, "ProtectProtocolKind");
		addEEnumLiteral(protectProtocolKindEEnum, ProtectProtocolKind.FIFO);
		addEEnumLiteral(protectProtocolKindEEnum, ProtectProtocolKind.NO_PREEMPTION);
		addEEnumLiteral(protectProtocolKindEEnum, ProtectProtocolKind.PRIORITY_CEILING);
		addEEnumLiteral(protectProtocolKindEEnum, ProtectProtocolKind.PRIORITY_INHERITANCE);
		addEEnumLiteral(protectProtocolKindEEnum, ProtectProtocolKind.STACK_BASED);
		addEEnumLiteral(protectProtocolKindEEnum, ProtectProtocolKind.UNDEF);
		addEEnumLiteral(protectProtocolKindEEnum, ProtectProtocolKind.OTHER);

		initEEnum(schedPolicyKindEEnum, SchedPolicyKind.class, "SchedPolicyKind");
		addEEnumLiteral(schedPolicyKindEEnum, SchedPolicyKind.UNDEF);
		addEEnumLiteral(schedPolicyKindEEnum, SchedPolicyKind.EARLIEST_DEADLINE_FIRST);
		addEEnumLiteral(schedPolicyKindEEnum, SchedPolicyKind.FIFO);
		addEEnumLiteral(schedPolicyKindEEnum, SchedPolicyKind.FIXED_PRIORITY);
		addEEnumLiteral(schedPolicyKindEEnum, SchedPolicyKind.LEAST_LAXITY_FIRST);
		addEEnumLiteral(schedPolicyKindEEnum, SchedPolicyKind.ROUND_ROBIN);
		addEEnumLiteral(schedPolicyKindEEnum, SchedPolicyKind.TIME_TABLE_DRIVEN);
		addEEnumLiteral(schedPolicyKindEEnum, SchedPolicyKind.OTHER);

		initEEnum(transmModeKindEEnum, TransmModeKind.class, "TransmModeKind");
		addEEnumLiteral(transmModeKindEEnum, TransmModeKind.SIMPLEX);
		addEEnumLiteral(transmModeKindEEnum, TransmModeKind.HALF_DUPLEX);
		addEEnumLiteral(transmModeKindEEnum, TransmModeKind.FULL_DUPLEX);

		// Initialize data types
		initEDataType(nfP_DurationEDataType, Duration.class, "NFP_Duration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nfP_DataSizeEDataType, DataSize.class, "NFP_DataSize", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nfP_DataTxRateEDataType, DataTxRate.class, "NFP_DataTxRate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getResource_OwnedResource(), 
		   source, 
		   new String[] {
			 "wildcards", "",
			 "name", ""
		   });
	}

} //GrmPackageImpl
