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
package org.polarsys.time4sys.marte.grm.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.polarsys.time4sys.marte.grm.*;

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrmValidator() {
		super();
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
			case GrmPackage.MUTUAL_EXCLUSION_PROTOCOL:
				return validateMutualExclusionProtocol((MutualExclusionProtocol)value, diagnostics, context);
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE:
				return validateMutualExclusionResource((MutualExclusionResource)value, diagnostics, context);
			case GrmPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
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
			case GrmPackage.TIMING_RESOURCE:
				return validateTimingResource((TimingResource)value, diagnostics, context);
			case GrmPackage.TIMER_RESOURCE:
				return validateTimerResource((TimerResource)value, diagnostics, context);
			case GrmPackage.USAGE_DEMAND:
				return validateUsageDemand((UsageDemand)value, diagnostics, context);
			case GrmPackage.USAGE_TYPED_AMOUNT:
				return validateUsageTypedAmount((UsageTypedAmount)value, diagnostics, context);
			case GrmPackage.PROTECT_PROTOCOL_KIND:
				return validateProtectProtocolKind((ProtectProtocolKind)value, diagnostics, context);
			case GrmPackage.SCHED_POLICY_KIND:
				return validateSchedPolicyKind((SchedPolicyKind)value, diagnostics, context);
			case GrmPackage.TRANSM_MODE_KIND:
				return validateTransmModeKind((TransmModeKind)value, diagnostics, context);
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
		return validate_EveryDefaultConstraint(accessControlPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockResource(ClockResource clockResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationEndPoint(CommunicationEndPoint communicationEndPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationEndPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationMedia(CommunicationMedia communicationMedia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationMedia, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputingResource(ComputingResource computingResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(computingResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcurrencyResource(ConcurrencyResource concurrencyResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concurrencyResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationResource(CommunicationResource communicationResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceResource(DeviceResource deviceResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceResource, diagnostics, context);
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
	public boolean validateMutualExclusionProtocol(MutualExclusionProtocol mutualExclusionProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mutualExclusionProtocol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMutualExclusionResource(MutualExclusionResource mutualExclusionResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mutualExclusionResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingResource(ProcessingResource processingResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processingResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtectionParameter(ProtectionParameter protectionParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protectionParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceBroker(ResourceBroker resourceBroker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceBroker, diagnostics, context);
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
		return validate_EveryDefaultConstraint(resourceControlPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceInstance(ResourceInstance resourceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceInterface(ResourceInterface resourceInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceManager(ResourceManager resourceManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceManager, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourcePackage(ResourcePackage resourcePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourcePackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourcePackageableElement(ResourcePackageableElement resourcePackageableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourcePackageableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourcePort(ResourcePort resourcePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourcePort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceService(ResourceService resourceService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceService, diagnostics, context);
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
		return validate_EveryDefaultConstraint(scheduler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulableResource(SchedulableResource schedulableResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schedulableResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingParameter(SchedulingParameter schedulingParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schedulingParameter, diagnostics, context);
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
		return validate_EveryDefaultConstraint(secondaryScheduler, diagnostics, context);
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
		return validate_EveryDefaultConstraint(storageResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchResource(SynchResource synchResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synchResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimingResource(TimingResource timingResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timingResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimerResource(TimerResource timerResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timerResource, diagnostics, context);
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
		return validate_EveryDefaultConstraint(usageTypedAmount, diagnostics, context);
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
