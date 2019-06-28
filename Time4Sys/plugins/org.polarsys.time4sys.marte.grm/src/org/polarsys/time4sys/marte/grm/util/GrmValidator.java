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
package org.polarsys.time4sys.marte.grm.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreValidator;
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
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.GrmPlugin;
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
import org.polarsys.time4sys.marte.nfp.DataSize;
import org.polarsys.time4sys.marte.nfp.DataTxRate;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.grm.GrmPackage
 * @generated
 */
public class GrmValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GrmValidator INSTANCE = new GrmValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.polarsys.time4sys.marte.grm";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Valid Policy' of 'Scheduling Policy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCHEDULING_POLICY__HAS_VALID_POLICY = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreValidator ecoreValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrmValidator() {
		super();
		ecoreValidator = EcoreValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GrmPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GrmPackage.ACCESS_CONTROL_POLICY:
				return validateAccessControlPolicy((AccessControlPolicy)value, diagnostics, context);
			case GrmPackage.CLOCK_RESOURCE:
				return validateClockResource((ClockResource)value, diagnostics, context);
			case GrmPackage.COMMUNICATION_END_POINT:
				return validateCommunicationEndPoint((CommunicationEndPoint)value, diagnostics, context);
			case GrmPackage.COMMUNICATION_MEDIA:
				return validateCommunicationMedia((CommunicationMedia)value, diagnostics, context);
			case GrmPackage.COMPUTING_RESOURCE:
				return validateComputingResource((ComputingResource)value, diagnostics, context);
			case GrmPackage.CONCURRENCY_RESOURCE:
				return validateConcurrencyResource((ConcurrencyResource)value, diagnostics, context);
			case GrmPackage.COMMUNICATION_RESOURCE:
				return validateCommunicationResource((CommunicationResource)value, diagnostics, context);
			case GrmPackage.DEVICE_RESOURCE:
				return validateDeviceResource((DeviceResource)value, diagnostics, context);
			case GrmPackage.DYNAMIC_USAGE:
				return validateDynamicUsage((DynamicUsage)value, diagnostics, context);
			case GrmPackage.EDF_PARAMETERS:
				return validateEDFParameters((EDFParameters)value, diagnostics, context);
			case GrmPackage.FIXED_PRIORITY_PARAMETERS:
				return validateFixedPriorityParameters((FixedPriorityParameters)value, diagnostics, context);
			case GrmPackage.MUTUAL_EXCLUSION_PROTOCOL:
				return validateMutualExclusionProtocol((MutualExclusionProtocol)value, diagnostics, context);
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE:
				return validateMutualExclusionResource((MutualExclusionResource)value, diagnostics, context);
			case GrmPackage.PERIODIC_SERVER_PARAMETERS:
				return validatePeriodicServerParameters((PeriodicServerParameters)value, diagnostics, context);
			case GrmPackage.POOLING_PARAMETERS:
				return validatePoolingParameters((PoolingParameters)value, diagnostics, context);
			case GrmPackage.PROCESSING_RESOURCE:
				return validateProcessingResource((ProcessingResource)value, diagnostics, context);
			case GrmPackage.PROTECTION_PARAMETER:
				return validateProtectionParameter((ProtectionParameter)value, diagnostics, context);
			case GrmPackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case GrmPackage.RESOURCE_BROKER:
				return validateResourceBroker((ResourceBroker)value, diagnostics, context);
			case GrmPackage.RESOURCE_CONNECTOR:
				return validateResourceConnector((ResourceConnector)value, diagnostics, context);
			case GrmPackage.RESOURCE_CONTROL_POLICY:
				return validateResourceControlPolicy((ResourceControlPolicy)value, diagnostics, context);
			case GrmPackage.RESOURCE_INSTANCE:
				return validateResourceInstance((ResourceInstance)value, diagnostics, context);
			case GrmPackage.RESOURCE_INTERFACE:
				return validateResourceInterface((ResourceInterface)value, diagnostics, context);
			case GrmPackage.RESOURCE_MANAGER:
				return validateResourceManager((ResourceManager)value, diagnostics, context);
			case GrmPackage.RESOURCE_PACKAGE:
				return validateResourcePackage((ResourcePackage)value, diagnostics, context);
			case GrmPackage.RESOURCE_PACKAGEABLE_ELEMENT:
				return validateResourcePackageableElement((ResourcePackageableElement)value, diagnostics, context);
			case GrmPackage.RESOURCE_PORT:
				return validateResourcePort((ResourcePort)value, diagnostics, context);
			case GrmPackage.RESOURCE_SERVICE:
				return validateResourceService((ResourceService)value, diagnostics, context);
			case GrmPackage.RESOURCE_USAGE:
				return validateResourceUsage((ResourceUsage)value, diagnostics, context);
			case GrmPackage.SCHEDULER:
				return validateScheduler((Scheduler)value, diagnostics, context);
			case GrmPackage.SCHEDULABLE_RESOURCE:
				return validateSchedulableResource((SchedulableResource)value, diagnostics, context);
			case GrmPackage.SCHEDULE_SPECIFICATION:
				return validateScheduleSpecification((ScheduleSpecification)value, diagnostics, context);
			case GrmPackage.SCHEDULING_PARAMETER:
				return validateSchedulingParameter((SchedulingParameter)value, diagnostics, context);
			case GrmPackage.SCHEDULING_POLICY:
				return validateSchedulingPolicy((SchedulingPolicy)value, diagnostics, context);
			case GrmPackage.SECONDARY_SCHEDULER:
				return validateSecondaryScheduler((SecondaryScheduler)value, diagnostics, context);
			case GrmPackage.STATIC_USAGE:
				return validateStaticUsage((StaticUsage)value, diagnostics, context);
			case GrmPackage.STORAGE_RESOURCE:
				return validateStorageResource((StorageResource)value, diagnostics, context);
			case GrmPackage.SYNCH_RESOURCE:
				return validateSynchResource((SynchResource)value, diagnostics, context);
			case GrmPackage.TABLE_DRIVEN_SCHEDULE:
				return validateTableDrivenSchedule((TableDrivenSchedule)value, diagnostics, context);
			case GrmPackage.TABLE_ENTRY_TYPE:
				return validateTableEntryType((TableEntryType)value, diagnostics, context);
			case GrmPackage.TIMING_RESOURCE:
				return validateTimingResource((TimingResource)value, diagnostics, context);
			case GrmPackage.TIMER_RESOURCE:
				return validateTimerResource((TimerResource)value, diagnostics, context);
			case GrmPackage.USAGE_DEMAND:
				return validateUsageDemand((UsageDemand)value, diagnostics, context);
			case GrmPackage.USAGE_TYPED_AMOUNT:
				return validateUsageTypedAmount((UsageTypedAmount)value, diagnostics, context);
			case GrmPackage.PERIODIC_SERVER_KIND:
				return validatePeriodicServerKind((PeriodicServerKind)value, diagnostics, context);
			case GrmPackage.PROTECT_PROTOCOL_KIND:
				return validateProtectProtocolKind((ProtectProtocolKind)value, diagnostics, context);
			case GrmPackage.SCHED_POLICY_KIND:
				return validateSchedPolicyKind((SchedPolicyKind)value, diagnostics, context);
			case GrmPackage.TRANSM_MODE_KIND:
				return validateTransmModeKind((TransmModeKind)value, diagnostics, context);
			case GrmPackage.NFP_DURATION:
				return validateNFP_Duration((Duration)value, diagnostics, context);
			case GrmPackage.NFP_DATA_SIZE:
				return validateNFP_DataSize((DataSize)value, diagnostics, context);
			case GrmPackage.NFP_DATA_TX_RATE:
				return validateNFP_DataTxRate((DataTxRate)value, diagnostics, context);
			case GrmPackage.NFP_TIME_INTERVAL:
				return validateNFP_TimeInterval((TimeInterval)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessControlPolicy(AccessControlPolicy accessControlPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accessControlPolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accessControlPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accessControlPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accessControlPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accessControlPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accessControlPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accessControlPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accessControlPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accessControlPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(accessControlPolicy, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockResource(ClockResource clockResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clockResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clockResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clockResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clockResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clockResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clockResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clockResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clockResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clockResource, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(clockResource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationEndPoint(CommunicationEndPoint communicationEndPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(communicationEndPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(communicationEndPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(communicationEndPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(communicationEndPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(communicationEndPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(communicationEndPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(communicationEndPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(communicationEndPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(communicationEndPoint, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(communicationEndPoint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationMedia(CommunicationMedia communicationMedia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(communicationMedia, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(communicationMedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(communicationMedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(communicationMedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(communicationMedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(communicationMedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(communicationMedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(communicationMedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(communicationMedia, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(communicationMedia, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputingResource(ComputingResource computingResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(computingResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(computingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(computingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(computingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(computingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(computingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(computingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(computingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(computingResource, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(computingResource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcurrencyResource(ConcurrencyResource concurrencyResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(concurrencyResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(concurrencyResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(concurrencyResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(concurrencyResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(concurrencyResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(concurrencyResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(concurrencyResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(concurrencyResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(concurrencyResource, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(concurrencyResource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationResource(CommunicationResource communicationResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(communicationResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(communicationResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(communicationResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(communicationResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(communicationResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(communicationResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(communicationResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(communicationResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(communicationResource, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(communicationResource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceResource(DeviceResource deviceResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deviceResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deviceResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deviceResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deviceResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deviceResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deviceResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deviceResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deviceResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deviceResource, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(deviceResource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicUsage(DynamicUsage dynamicUsage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicUsage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDFParameters(EDFParameters edfParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(edfParameters, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(edfParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(edfParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(edfParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(edfParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(edfParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(edfParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(edfParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(edfParameters, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(edfParameters, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedPriorityParameters(FixedPriorityParameters fixedPriorityParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fixedPriorityParameters, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fixedPriorityParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fixedPriorityParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fixedPriorityParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fixedPriorityParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fixedPriorityParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fixedPriorityParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fixedPriorityParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fixedPriorityParameters, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(fixedPriorityParameters, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMutualExclusionProtocol(MutualExclusionProtocol mutualExclusionProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mutualExclusionProtocol, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mutualExclusionProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mutualExclusionProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mutualExclusionProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mutualExclusionProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mutualExclusionProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mutualExclusionProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mutualExclusionProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mutualExclusionProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(mutualExclusionProtocol, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMutualExclusionResource(MutualExclusionResource mutualExclusionResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mutualExclusionResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mutualExclusionResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mutualExclusionResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mutualExclusionResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mutualExclusionResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mutualExclusionResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mutualExclusionResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mutualExclusionResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mutualExclusionResource, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(mutualExclusionResource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodicServerParameters(PeriodicServerParameters periodicServerParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(periodicServerParameters, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(periodicServerParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(periodicServerParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(periodicServerParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(periodicServerParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(periodicServerParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(periodicServerParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(periodicServerParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(periodicServerParameters, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(periodicServerParameters, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoolingParameters(PoolingParameters poolingParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(poolingParameters, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(poolingParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(poolingParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(poolingParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(poolingParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(poolingParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(poolingParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(poolingParameters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(poolingParameters, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(poolingParameters, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingResource(ProcessingResource processingResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processingResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processingResource, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(processingResource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtectionParameter(ProtectionParameter protectionParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(protectionParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(protectionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(protectionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(protectionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(protectionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(protectionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(protectionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(protectionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(protectionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(protectionParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(resource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceBroker(ResourceBroker resourceBroker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceBroker, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceBroker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceBroker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceBroker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceBroker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceBroker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceBroker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceBroker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceBroker, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(resourceBroker, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceConnector(ResourceConnector resourceConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceControlPolicy(ResourceControlPolicy resourceControlPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceControlPolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceControlPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceControlPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceControlPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceControlPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceControlPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceControlPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceControlPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceControlPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(resourceControlPolicy, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceInstance(ResourceInstance resourceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(resourceInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceInterface(ResourceInterface resourceInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceInterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(resourceInterface, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceManager(ResourceManager resourceManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceManager, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceManager, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(resourceManager, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourcePackage(ResourcePackage resourcePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourcePackage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourcePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourcePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourcePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourcePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourcePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourcePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourcePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourcePackage, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(resourcePackage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourcePackageableElement(ResourcePackageableElement resourcePackageableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourcePackageableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourcePackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourcePackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourcePackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourcePackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourcePackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourcePackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourcePackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourcePackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(resourcePackageableElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourcePort(ResourcePort resourcePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourcePort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourcePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourcePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourcePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourcePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourcePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourcePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourcePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourcePort, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(resourcePort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceService(ResourceService resourceService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceService, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(resourceService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceUsage(ResourceUsage resourceUsage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceUsage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScheduler(Scheduler scheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scheduler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scheduler, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(scheduler, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulableResource(SchedulableResource schedulableResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(schedulableResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(schedulableResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(schedulableResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(schedulableResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(schedulableResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(schedulableResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(schedulableResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(schedulableResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(schedulableResource, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(schedulableResource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScheduleSpecification(ScheduleSpecification scheduleSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scheduleSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingParameter(SchedulingParameter schedulingParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(schedulingParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(schedulingParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(schedulingParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(schedulingParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(schedulingParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(schedulingParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(schedulingParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(schedulingParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(schedulingParameter, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(schedulingParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingPolicy(SchedulingPolicy schedulingPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(schedulingPolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(schedulingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(schedulingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(schedulingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(schedulingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(schedulingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(schedulingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(schedulingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(schedulingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(schedulingPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateSchedulingPolicy_hasValidPolicy(schedulingPolicy, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasValidPolicy constraint of '<em>Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingPolicy_hasValidPolicy(SchedulingPolicy schedulingPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return schedulingPolicy.hasValidPolicy(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecondaryScheduler(SecondaryScheduler secondaryScheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(secondaryScheduler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(secondaryScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(secondaryScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(secondaryScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(secondaryScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(secondaryScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(secondaryScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(secondaryScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(secondaryScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(secondaryScheduler, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticUsage(StaticUsage staticUsage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticUsage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageResource(StorageResource storageResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storageResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storageResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storageResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storageResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storageResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storageResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storageResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storageResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storageResource, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(storageResource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchResource(SynchResource synchResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(synchResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(synchResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(synchResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(synchResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(synchResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(synchResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(synchResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(synchResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(synchResource, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(synchResource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableDrivenSchedule(TableDrivenSchedule tableDrivenSchedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableDrivenSchedule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableEntryType(TableEntryType tableEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tableEntryType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tableEntryType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tableEntryType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tableEntryType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tableEntryType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tableEntryType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tableEntryType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tableEntryType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tableEntryType, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(tableEntryType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimingResource(TimingResource timingResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timingResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timingResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timingResource, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(timingResource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimerResource(TimerResource timerResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timerResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timerResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timerResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timerResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timerResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timerResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timerResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timerResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timerResource, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(timerResource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageDemand(UsageDemand usageDemand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usageDemand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageTypedAmount(UsageTypedAmount usageTypedAmount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(usageTypedAmount, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(usageTypedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(usageTypedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(usageTypedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(usageTypedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(usageTypedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(usageTypedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(usageTypedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(usageTypedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(usageTypedAmount, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodicServerKind(PeriodicServerKind periodicServerKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtectProtocolKind(ProtectProtocolKind protectProtocolKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedPolicyKind(SchedPolicyKind schedPolicyKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmModeKind(TransmModeKind transmModeKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNFP_Duration(Duration nfP_Duration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNFP_DataSize(DataSize nfP_DataSize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNFP_DataTxRate(DataTxRate nfP_DataTxRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNFP_TimeInterval(TimeInterval nfP_TimeInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GrmPlugin.INSTANCE;
	}

} //GrmValidator
