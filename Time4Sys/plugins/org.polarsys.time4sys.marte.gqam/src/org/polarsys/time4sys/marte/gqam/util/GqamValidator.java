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
package org.polarsys.time4sys.marte.gqam.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreValidator;
import org.polarsys.time4sys.marte.gqam.*;
import org.polarsys.time4sys.marte.gqam.AcquireStep;
import org.polarsys.time4sys.marte.gqam.ArrivalPattern;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.BurstPattern;
import org.polarsys.time4sys.marte.gqam.ClosedPattern;
import org.polarsys.time4sys.marte.gqam.CommunicationChannel;
import org.polarsys.time4sys.marte.gqam.CommunicationStep;
import org.polarsys.time4sys.marte.gqam.ConnectorKind;
import org.polarsys.time4sys.marte.gqam.Delay;
import org.polarsys.time4sys.marte.gqam.ExecutionStep;
import org.polarsys.time4sys.marte.gqam.FlowInvolvedElement;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.LatencyObserver;
import org.polarsys.time4sys.marte.gqam.LaxityKind;
import org.polarsys.time4sys.marte.gqam.MultiplicityElement;
import org.polarsys.time4sys.marte.gqam.ObjectNode;
import org.polarsys.time4sys.marte.gqam.ObjectNodeOrderingKind;
import org.polarsys.time4sys.marte.gqam.Once;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.Pin;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;
import org.polarsys.time4sys.marte.gqam.Reference;
import org.polarsys.time4sys.marte.gqam.ReleaseStep;
import org.polarsys.time4sys.marte.gqam.RequestedService;
import org.polarsys.time4sys.marte.gqam.ResourceServiceExcecution;
import org.polarsys.time4sys.marte.gqam.SlidingWindowPattern;
import org.polarsys.time4sys.marte.gqam.SporadicPattern;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.TimedObserver;
import org.polarsys.time4sys.marte.gqam.WorkloadBehavior;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.nfp.DataSize;
import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage
 * @generated
 */
public class GqamValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GqamValidator INSTANCE = new GqamValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.polarsys.time4sys.marte.gqam";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

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
	public GqamValidator() {
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
	  return GqamPackage.eINSTANCE;
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
			case GqamPackage.ACQUIRE_STEP:
				return validateAcquireStep((AcquireStep)value, diagnostics, context);
			case GqamPackage.ARRIVAL_PATTERN:
				return validateArrivalPattern((ArrivalPattern)value, diagnostics, context);
			case GqamPackage.BEHAVIOR_SCENARIO:
				return validateBehaviorScenario((BehaviorScenario)value, diagnostics, context);
			case GqamPackage.BURST_PATTERN:
				return validateBurstPattern((BurstPattern)value, diagnostics, context);
			case GqamPackage.CLOSED_PATTERN:
				return validateClosedPattern((ClosedPattern)value, diagnostics, context);
			case GqamPackage.COMMUNICATION_CHANNEL:
				return validateCommunicationChannel((CommunicationChannel)value, diagnostics, context);
			case GqamPackage.COMMUNICATION_STEP:
				return validateCommunicationStep((CommunicationStep)value, diagnostics, context);
			case GqamPackage.DELAY:
				return validateDelay((Delay)value, diagnostics, context);
			case GqamPackage.EXECUTION_STEP:
				return validateExecutionStep((ExecutionStep)value, diagnostics, context);
			case GqamPackage.FLOW_INVOLVED_ELEMENT:
				return validateFlowInvolvedElement((FlowInvolvedElement)value, diagnostics, context);
			case GqamPackage.INPUT_PIN:
				return validateInputPin((InputPin)value, diagnostics, context);
			case GqamPackage.LATENCY_OBSERVER:
				return validateLatencyObserver((LatencyObserver)value, diagnostics, context);
			case GqamPackage.MULTIPLICITY_ELEMENT:
				return validateMultiplicityElement((MultiplicityElement)value, diagnostics, context);
			case GqamPackage.OBJECT_NODE:
				return validateObjectNode((ObjectNode)value, diagnostics, context);
			case GqamPackage.ONCE:
				return validateOnce((Once)value, diagnostics, context);
			case GqamPackage.OUTPUT_PIN:
				return validateOutputPin((OutputPin)value, diagnostics, context);
			case GqamPackage.PERIODIC_PATTERN:
				return validatePeriodicPattern((PeriodicPattern)value, diagnostics, context);
			case GqamPackage.PIN:
				return validatePin((Pin)value, diagnostics, context);
			case GqamPackage.PRECEDENCE_RELATION:
				return validatePrecedenceRelation((PrecedenceRelation)value, diagnostics, context);
			case GqamPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case GqamPackage.RELEASE_STEP:
				return validateReleaseStep((ReleaseStep)value, diagnostics, context);
			case GqamPackage.REQUESTED_SERVICE:
				return validateRequestedService((RequestedService)value, diagnostics, context);
			case GqamPackage.RESOURCE_SERVICE_EXCECUTION:
				return validateResourceServiceExcecution((ResourceServiceExcecution)value, diagnostics, context);
			case GqamPackage.SLIDING_WINDOW_PATTERN:
				return validateSlidingWindowPattern((SlidingWindowPattern)value, diagnostics, context);
			case GqamPackage.SPORADIC_PATTERN:
				return validateSporadicPattern((SporadicPattern)value, diagnostics, context);
			case GqamPackage.STEP:
				return validateStep((Step)value, diagnostics, context);
			case GqamPackage.TIMED_OBSERVER:
				return validateTimedObserver((TimedObserver)value, diagnostics, context);
			case GqamPackage.WORKLOAD_BEHAVIOR:
				return validateWorkloadBehavior((WorkloadBehavior)value, diagnostics, context);
			case GqamPackage.WORKLOAD_EVENT:
				return validateWorkloadEvent((WorkloadEvent)value, diagnostics, context);
			case GqamPackage.CONNECTOR_KIND:
				return validateConnectorKind((ConnectorKind)value, diagnostics, context);
			case GqamPackage.LAXITY_KIND:
				return validateLaxityKind((LaxityKind)value, diagnostics, context);
			case GqamPackage.OBJECT_NODE_ORDERING_KIND:
				return validateObjectNodeOrderingKind((ObjectNodeOrderingKind)value, diagnostics, context);
			case GqamPackage.LOGICAL_KIND:
				return validateLogicalKind((LogicalKind)value, diagnostics, context);
			case GqamPackage.NFP_DATA_SIZE:
				return validateNFP_DataSize((DataSize)value, diagnostics, context);
			case GqamPackage.NFP_DURATION:
				return validateNFP_Duration((Duration)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcquireStep(AcquireStep acquireStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(acquireStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(acquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(acquireStep, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrivalPattern(ArrivalPattern arrivalPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrivalPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviorScenario(BehaviorScenario behaviorScenario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behaviorScenario, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behaviorScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behaviorScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behaviorScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behaviorScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behaviorScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behaviorScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behaviorScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behaviorScenario, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(behaviorScenario, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBurstPattern(BurstPattern burstPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(burstPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClosedPattern(ClosedPattern closedPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(closedPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationStep(CommunicationStep communicationStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(communicationStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(communicationStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(communicationStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(communicationStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(communicationStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(communicationStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(communicationStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(communicationStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(communicationStep, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(communicationStep, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePin(Pin pin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pin, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(pin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionStep(ExecutionStep executionStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executionStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executionStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executionStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executionStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executionStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executionStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executionStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executionStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executionStep, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(executionStep, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowInvolvedElement(FlowInvolvedElement flowInvolvedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowInvolvedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodicPattern(PeriodicPattern periodicPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(periodicPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrecedenceRelation(PrecedenceRelation precedenceRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(precedenceRelation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reference, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(reference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReleaseStep(ReleaseStep releaseStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(releaseStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(releaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(releaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(releaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(releaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(releaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(releaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(releaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(releaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(releaseStep, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestedService(RequestedService requestedService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requestedService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requestedService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requestedService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requestedService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requestedService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requestedService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requestedService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requestedService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requestedService, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(requestedService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceServiceExcecution(ResourceServiceExcecution resourceServiceExcecution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceServiceExcecution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceServiceExcecution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceServiceExcecution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceServiceExcecution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceServiceExcecution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceServiceExcecution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceServiceExcecution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceServiceExcecution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceServiceExcecution, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(resourceServiceExcecution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlidingWindowPattern(SlidingWindowPattern slidingWindowPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slidingWindowPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSporadicPattern(SporadicPattern sporadicPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sporadicPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(step, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(step, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(step, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedObserver(TimedObserver timedObserver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timedObserver, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timedObserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timedObserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timedObserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timedObserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timedObserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timedObserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timedObserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timedObserver, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(timedObserver, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkloadEvent(WorkloadEvent workloadEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(workloadEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(workloadEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(workloadEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(workloadEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(workloadEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(workloadEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(workloadEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(workloadEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(workloadEvent, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(workloadEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectNode(ObjectNode objectNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkloadBehavior(WorkloadBehavior workloadBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(workloadBehavior, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(workloadBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(workloadBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(workloadBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(workloadBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(workloadBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(workloadBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(workloadBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(workloadBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(workloadBehavior, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelay(Delay delay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delay, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delay, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelay_notOnAnyTask(delay, diagnostics, context);
		return result;
	}

	/**
	 * Validates the notOnAnyTask constraint of '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelay_notOnAnyTask(Delay delay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "notOnAnyTask", getObjectLabel(delay, context) },
						 new Object[] { delay },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiplicityElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputPin(InputPin inputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inputPin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(inputPin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatencyObserver(LatencyObserver latencyObserver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(latencyObserver, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(latencyObserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(latencyObserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(latencyObserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(latencyObserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(latencyObserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(latencyObserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(latencyObserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(latencyObserver, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(latencyObserver, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputPin(OutputPin outputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(outputPin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(outputPin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnce(Once once, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(once, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationChannel(CommunicationChannel communicationChannel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(communicationChannel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(communicationChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(communicationChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(communicationChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(communicationChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(communicationChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(communicationChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(communicationChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(communicationChannel, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(communicationChannel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorKind(ConnectorKind connectorKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaxityKind(LaxityKind laxityKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectNodeOrderingKind(ObjectNodeOrderingKind objectNodeOrderingKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalKind(LogicalKind logicalKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateNFP_Duration(Duration nfP_Duration, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GqamValidator
