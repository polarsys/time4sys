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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.time4sys.marte.grm.AccessControlPolicy;
import org.polarsys.time4sys.marte.grm.ClockResource;
import org.polarsys.time4sys.marte.grm.CommunicationMedia;
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
import org.polarsys.time4sys.marte.grm.ProtectProtocolKind;
import org.polarsys.time4sys.marte.grm.ProtectionParameter;
import org.polarsys.time4sys.marte.grm.ResourceBroker;
import org.polarsys.time4sys.marte.grm.ResourceConnector;
import org.polarsys.time4sys.marte.grm.ResourceControlPolicy;
import org.polarsys.time4sys.marte.grm.ResourceInstance;
import org.polarsys.time4sys.marte.grm.ResourceInterface;
import org.polarsys.time4sys.marte.grm.ResourceManager;
import org.polarsys.time4sys.marte.grm.ResourcePackage;
import org.polarsys.time4sys.marte.grm.ResourcePort;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.grm.ResourceUsage;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
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
import org.polarsys.time4sys.marte.grm.TransmModeKind;
import org.polarsys.time4sys.marte.grm.UsageDemand;
import org.polarsys.time4sys.marte.grm.UsageTypedAmount;
import org.polarsys.time4sys.marte.nfp.DataSize;
import org.polarsys.time4sys.marte.nfp.DataTxRate;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrmFactoryImpl extends EFactoryImpl implements GrmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GrmFactory init() {
		try {
			GrmFactory theGrmFactory = (GrmFactory)EPackage.Registry.INSTANCE.getEFactory(GrmPackage.eNS_URI);
			if (theGrmFactory != null) {
				return theGrmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GrmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GrmPackage.ACCESS_CONTROL_POLICY: return createAccessControlPolicy();
			case GrmPackage.CLOCK_RESOURCE: return createClockResource();
			case GrmPackage.COMMUNICATION_MEDIA: return createCommunicationMedia();
			case GrmPackage.COMPUTING_RESOURCE: return createComputingResource();
			case GrmPackage.CONCURRENCY_RESOURCE: return createConcurrencyResource();
			case GrmPackage.DEVICE_RESOURCE: return createDeviceResource();
			case GrmPackage.DYNAMIC_USAGE: return createDynamicUsage();
			case GrmPackage.EDF_PARAMETERS: return createEDFParameters();
			case GrmPackage.FIXED_PRIORITY_PARAMETERS: return createFixedPriorityParameters();
			case GrmPackage.MUTUAL_EXCLUSION_PROTOCOL: return createMutualExclusionProtocol();
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE: return createMutualExclusionResource();
			case GrmPackage.PERIODIC_SERVER_PARAMETERS: return createPeriodicServerParameters();
			case GrmPackage.POOLING_PARAMETERS: return createPoolingParameters();
			case GrmPackage.PROTECTION_PARAMETER: return createProtectionParameter();
			case GrmPackage.RESOURCE_BROKER: return createResourceBroker();
			case GrmPackage.RESOURCE_CONNECTOR: return createResourceConnector();
			case GrmPackage.RESOURCE_CONTROL_POLICY: return createResourceControlPolicy();
			case GrmPackage.RESOURCE_INSTANCE: return createResourceInstance();
			case GrmPackage.RESOURCE_INTERFACE: return createResourceInterface();
			case GrmPackage.RESOURCE_MANAGER: return createResourceManager();
			case GrmPackage.RESOURCE_PACKAGE: return createResourcePackage();
			case GrmPackage.RESOURCE_PORT: return createResourcePort();
			case GrmPackage.RESOURCE_SERVICE: return createResourceService();
			case GrmPackage.RESOURCE_USAGE: return createResourceUsage();
			case GrmPackage.SCHEDULER: return createScheduler();
			case GrmPackage.SCHEDULABLE_RESOURCE: return createSchedulableResource();
			case GrmPackage.SCHEDULING_PARAMETER: return createSchedulingParameter();
			case GrmPackage.SCHEDULING_POLICY: return createSchedulingPolicy();
			case GrmPackage.SECONDARY_SCHEDULER: return createSecondaryScheduler();
			case GrmPackage.STATIC_USAGE: return createStaticUsage();
			case GrmPackage.STORAGE_RESOURCE: return createStorageResource();
			case GrmPackage.SYNCH_RESOURCE: return createSynchResource();
			case GrmPackage.TABLE_DRIVEN_SCHEDULE: return createTableDrivenSchedule();
			case GrmPackage.TABLE_ENTRY_TYPE: return createTableEntryType();
			case GrmPackage.TIMER_RESOURCE: return createTimerResource();
			case GrmPackage.USAGE_DEMAND: return createUsageDemand();
			case GrmPackage.USAGE_TYPED_AMOUNT: return createUsageTypedAmount();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GrmPackage.PERIODIC_SERVER_KIND:
				return createPeriodicServerKindFromString(eDataType, initialValue);
			case GrmPackage.PROTECT_PROTOCOL_KIND:
				return createProtectProtocolKindFromString(eDataType, initialValue);
			case GrmPackage.SCHED_POLICY_KIND:
				return createSchedPolicyKindFromString(eDataType, initialValue);
			case GrmPackage.TRANSM_MODE_KIND:
				return createTransmModeKindFromString(eDataType, initialValue);
			case GrmPackage.NFP_DURATION:
				return createNFP_DurationFromString(eDataType, initialValue);
			case GrmPackage.NFP_DATA_SIZE:
				return createNFP_DataSizeFromString(eDataType, initialValue);
			case GrmPackage.NFP_DATA_TX_RATE:
				return createNFP_DataTxRateFromString(eDataType, initialValue);
			case GrmPackage.NFP_TIME_INTERVAL:
				return createNFP_TimeIntervalFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GrmPackage.PERIODIC_SERVER_KIND:
				return convertPeriodicServerKindToString(eDataType, instanceValue);
			case GrmPackage.PROTECT_PROTOCOL_KIND:
				return convertProtectProtocolKindToString(eDataType, instanceValue);
			case GrmPackage.SCHED_POLICY_KIND:
				return convertSchedPolicyKindToString(eDataType, instanceValue);
			case GrmPackage.TRANSM_MODE_KIND:
				return convertTransmModeKindToString(eDataType, instanceValue);
			case GrmPackage.NFP_DURATION:
				return convertNFP_DurationToString(eDataType, instanceValue);
			case GrmPackage.NFP_DATA_SIZE:
				return convertNFP_DataSizeToString(eDataType, instanceValue);
			case GrmPackage.NFP_DATA_TX_RATE:
				return convertNFP_DataTxRateToString(eDataType, instanceValue);
			case GrmPackage.NFP_TIME_INTERVAL:
				return convertNFP_TimeIntervalToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePackage createResourcePackage() {
		ResourcePackageImpl resourcePackage = new ResourcePackageImpl();
		return resourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance createResourceInstance() {
		ResourceInstanceImpl resourceInstance = new ResourceInstanceImpl();
		return resourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageResource createStorageResource() {
		StorageResourceImpl storageResource = new StorageResourceImpl();
		return storageResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchResource createSynchResource() {
		SynchResourceImpl synchResource = new SynchResourceImpl();
		return synchResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableDrivenSchedule createTableDrivenSchedule() {
		TableDrivenScheduleImpl tableDrivenSchedule = new TableDrivenScheduleImpl();
		return tableDrivenSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableEntryType createTableEntryType() {
		TableEntryTypeImpl tableEntryType = new TableEntryTypeImpl();
		return tableEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrencyResource createConcurrencyResource() {
		ConcurrencyResourceImpl concurrencyResource = new ConcurrencyResourceImpl();
		return concurrencyResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingResource createComputingResource() {
		ComputingResourceImpl computingResource = new ComputingResourceImpl();
		return computingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceResource createDeviceResource() {
		DeviceResourceImpl deviceResource = new DeviceResourceImpl();
		return deviceResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockResource createClockResource() {
		ClockResourceImpl clockResource = new ClockResourceImpl();
		return clockResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerResource createTimerResource() {
		TimerResourceImpl timerResource = new TimerResourceImpl();
		return timerResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceService createResourceService() {
		ResourceServiceImpl resourceService = new ResourceServiceImpl();
		return resourceService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMedia createCommunicationMedia() {
		CommunicationMediaImpl communicationMedia = new CommunicationMediaImpl();
		return communicationMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceConnector createResourceConnector() {
		ResourceConnectorImpl resourceConnector = new ResourceConnectorImpl();
		return resourceConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePort createResourcePort() {
		ResourcePortImpl resourcePort = new ResourcePortImpl();
		return resourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceBroker createResourceBroker() {
		ResourceBrokerImpl resourceBroker = new ResourceBrokerImpl();
		return resourceBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceManager createResourceManager() {
		ResourceManagerImpl resourceManager = new ResourceManagerImpl();
		return resourceManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlPolicy createAccessControlPolicy() {
		AccessControlPolicyImpl accessControlPolicy = new AccessControlPolicyImpl();
		return accessControlPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceControlPolicy createResourceControlPolicy() {
		ResourceControlPolicyImpl resourceControlPolicy = new ResourceControlPolicyImpl();
		return resourceControlPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler createScheduler() {
		SchedulerImpl scheduler = new SchedulerImpl();
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondaryScheduler createSecondaryScheduler() {
		SecondarySchedulerImpl secondaryScheduler = new SecondarySchedulerImpl();
		return secondaryScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulableResource createSchedulableResource() {
		SchedulableResourceImpl schedulableResource = new SchedulableResourceImpl();
		return schedulableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingParameter createSchedulingParameter() {
		SchedulingParameterImpl schedulingParameter = new SchedulingParameterImpl();
		return schedulingParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicy createSchedulingPolicy() {
		SchedulingPolicyImpl schedulingPolicy = new SchedulingPolicyImpl();
		return schedulingPolicy;
	}
	
	/**
	 * @generated NOT
	 */
	public SchedulingPolicy createSchedulingPolicy(final SchedPolicyKind policy) {
		SchedulingPolicyImpl schedulingPolicy = new SchedulingPolicyImpl(policy);
		return schedulingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutualExclusionResource createMutualExclusionResource() {
		MutualExclusionResourceImpl mutualExclusionResource = new MutualExclusionResourceImpl();
		return mutualExclusionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicServerParameters createPeriodicServerParameters() {
		PeriodicServerParametersImpl periodicServerParameters = new PeriodicServerParametersImpl();
		return periodicServerParameters;
	}
	
	@Override
	public PeriodicServerParameters createPeriodicServerParameters(final FixedPriorityParameters schedParam) {
		final PeriodicServerParameters copy = createPeriodicServerParameters();
		for(EAttribute feature: GrmPackage.eINSTANCE.getFixedPriorityParameters().getEAllAttributes()) {
			copy.eSet(feature, schedParam.eGet(feature));
		}
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolingParameters createPoolingParameters() {
		PoolingParametersImpl poolingParameters = new PoolingParametersImpl();
		return poolingParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutualExclusionProtocol createMutualExclusionProtocol() {
		MutualExclusionProtocolImpl mutualExclusionProtocol = new MutualExclusionProtocolImpl();
		return mutualExclusionProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionParameter createProtectionParameter() {
		ProtectionParameterImpl protectionParameter = new ProtectionParameterImpl();
		return protectionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageDemand createUsageDemand() {
		UsageDemandImpl usageDemand = new UsageDemandImpl();
		return usageDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceUsage createResourceUsage() {
		ResourceUsageImpl resourceUsage = new ResourceUsageImpl();
		return resourceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageTypedAmount createUsageTypedAmount() {
		UsageTypedAmountImpl usageTypedAmount = new UsageTypedAmountImpl();
		return usageTypedAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicServerKind createPeriodicServerKindFromString(EDataType eDataType, String initialValue) {
		PeriodicServerKind result = PeriodicServerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPeriodicServerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicUsage createDynamicUsage() {
		DynamicUsageImpl dynamicUsage = new DynamicUsageImpl();
		return dynamicUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDFParameters createEDFParameters() {
		EDFParametersImpl edfParameters = new EDFParametersImpl();
		return edfParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedPriorityParameters createFixedPriorityParameters() {
		FixedPriorityParametersImpl fixedPriorityParameters = new FixedPriorityParametersImpl();
		return fixedPriorityParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticUsage createStaticUsage() {
		StaticUsageImpl staticUsage = new StaticUsageImpl();
		return staticUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInterface createResourceInterface() {
		ResourceInterfaceImpl resourceInterface = new ResourceInterfaceImpl();
		return resourceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmModeKind createTransmModeKindFromString(EDataType eDataType, String initialValue) {
		TransmModeKind result = TransmModeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransmModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Duration createNFP_DurationFromString(EDataType eDataType, String initialValue) {
		return NfpFactory.eINSTANCE.createDurationFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertNFP_DurationToString(EDataType eDataType, Object instanceValue) {
		assert(instanceValue == null || instanceValue instanceof Duration);
		return NfpFactory.eINSTANCE.convertDurationToString((Duration)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DataSize createNFP_DataSizeFromString(EDataType eDataType, String initialValue) {
		throw new UnsupportedOperationException("Not yet implemtented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNFP_DataSizeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DataTxRate createNFP_DataTxRateFromString(EDataType eDataType, String initialValue) {
		throw new UnsupportedOperationException("Not yet implemtented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNFP_DataTxRateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TimeInterval createNFP_TimeIntervalFromString(EDataType eDataType, String initialValue) {
		return NfpFactory.eINSTANCE.createTimeIntervalFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertNFP_TimeIntervalToString(EDataType eDataType, Object instanceValue) {
		assert(instanceValue == null || instanceValue instanceof TimeInterval);
		return NfpFactory.eINSTANCE.convertTimeIntervalToString((TimeInterval)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedPolicyKind createSchedPolicyKindFromString(EDataType eDataType, String initialValue) {
		SchedPolicyKind result = SchedPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedPolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectProtocolKind createProtectProtocolKindFromString(EDataType eDataType, String initialValue) {
		ProtectProtocolKind result = ProtectProtocolKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtectProtocolKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrmPackage getGrmPackage() {
		return (GrmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GrmPackage getPackage() {
		return GrmPackage.eINSTANCE;
	}

} //GrmFactoryImpl
