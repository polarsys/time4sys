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
package org.polarsys.time4sys.marte.gqam.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.time4sys.marte.gqam.AcquireStep;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.BurstPattern;
import org.polarsys.time4sys.marte.gqam.ClosedPattern;
import org.polarsys.time4sys.marte.gqam.CommunicationChannel;
import org.polarsys.time4sys.marte.gqam.CommunicationStep;
import org.polarsys.time4sys.marte.gqam.ConnectorKind;
import org.polarsys.time4sys.marte.gqam.Delay;
import org.polarsys.time4sys.marte.gqam.ExecutionStep;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.LatencyObserver;
import org.polarsys.time4sys.marte.gqam.LaxityKind;
import org.polarsys.time4sys.marte.gqam.ObjectNodeOrderingKind;
import org.polarsys.time4sys.marte.gqam.Once;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
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
import org.polarsys.time4sys.marte.nfp.NfpFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GqamFactoryImpl extends EFactoryImpl implements GqamFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GqamFactory init() {
		try {
			GqamFactory theGqamFactory = (GqamFactory)EPackage.Registry.INSTANCE.getEFactory(GqamPackage.eNS_URI);
			if (theGqamFactory != null) {
				return theGqamFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GqamFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GqamFactoryImpl() {
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
			case GqamPackage.ACQUIRE_STEP: return createAcquireStep();
			case GqamPackage.BEHAVIOR_SCENARIO: return createBehaviorScenario();
			case GqamPackage.BURST_PATTERN: return createBurstPattern();
			case GqamPackage.CLOSED_PATTERN: return createClosedPattern();
			case GqamPackage.COMMUNICATION_CHANNEL: return createCommunicationChannel();
			case GqamPackage.COMMUNICATION_STEP: return createCommunicationStep();
			case GqamPackage.DELAY: return createDelay();
			case GqamPackage.EXECUTION_STEP: return createExecutionStep();
			case GqamPackage.INPUT_PIN: return createInputPin();
			case GqamPackage.LATENCY_OBSERVER: return createLatencyObserver();
			case GqamPackage.ONCE: return createOnce();
			case GqamPackage.OUTPUT_PIN: return createOutputPin();
			case GqamPackage.PERIODIC_PATTERN: return createPeriodicPattern();
			case GqamPackage.PRECEDENCE_RELATION: return createPrecedenceRelation();
			case GqamPackage.REFERENCE: return createReference();
			case GqamPackage.RELEASE_STEP: return createReleaseStep();
			case GqamPackage.REQUESTED_SERVICE: return createRequestedService();
			case GqamPackage.RESOURCE_SERVICE_EXCECUTION: return createResourceServiceExcecution();
			case GqamPackage.SLIDING_WINDOW_PATTERN: return createSlidingWindowPattern();
			case GqamPackage.SPORADIC_PATTERN: return createSporadicPattern();
			case GqamPackage.STEP: return createStep();
			case GqamPackage.TIMED_OBSERVER: return createTimedObserver();
			case GqamPackage.WORKLOAD_BEHAVIOR: return createWorkloadBehavior();
			case GqamPackage.WORKLOAD_EVENT: return createWorkloadEvent();
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
			case GqamPackage.CONNECTOR_KIND:
				return createConnectorKindFromString(eDataType, initialValue);
			case GqamPackage.LAXITY_KIND:
				return createLaxityKindFromString(eDataType, initialValue);
			case GqamPackage.OBJECT_NODE_ORDERING_KIND:
				return createObjectNodeOrderingKindFromString(eDataType, initialValue);
			case GqamPackage.NFP_DATA_SIZE:
				return createNFP_DataSizeFromString(eDataType, initialValue);
			case GqamPackage.NFP_DURATION:
				return createNFP_DurationFromString(eDataType, initialValue);
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
			case GqamPackage.CONNECTOR_KIND:
				return convertConnectorKindToString(eDataType, instanceValue);
			case GqamPackage.LAXITY_KIND:
				return convertLaxityKindToString(eDataType, instanceValue);
			case GqamPackage.OBJECT_NODE_ORDERING_KIND:
				return convertObjectNodeOrderingKindToString(eDataType, instanceValue);
			case GqamPackage.NFP_DATA_SIZE:
				return convertNFP_DataSizeToString(eDataType, instanceValue);
			case GqamPackage.NFP_DURATION:
				return convertNFP_DurationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorScenario createBehaviorScenario() {
		BehaviorScenarioImpl behaviorScenario = new BehaviorScenarioImpl();
		return behaviorScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BurstPattern createBurstPattern() {
		BurstPatternImpl burstPattern = new BurstPatternImpl();
		return burstPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosedPattern createClosedPattern() {
		ClosedPatternImpl closedPattern = new ClosedPatternImpl();
		return closedPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadEvent createWorkloadEvent() {
		WorkloadEventImpl workloadEvent = new WorkloadEventImpl();
		return workloadEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedObserver createTimedObserver() {
		TimedObserverImpl timedObserver = new TimedObserverImpl();
		return timedObserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceRelation createPrecedenceRelation() {
		PrecedenceRelationImpl precedenceRelation = new PrecedenceRelationImpl();
		return precedenceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadBehavior createWorkloadBehavior() {
		WorkloadBehaviorImpl workloadBehavior = new WorkloadBehaviorImpl();
		return workloadBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delay createDelay() {
		DelayImpl delay = new DelayImpl();
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createInputPin() {
		InputPinImpl inputPin = new InputPinImpl();
		return inputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencyObserver createLatencyObserver() {
		LatencyObserverImpl latencyObserver = new LatencyObserverImpl();
		return latencyObserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createOutputPin() {
		OutputPinImpl outputPin = new OutputPinImpl();
		return outputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Once createOnce() {
		OnceImpl once = new OnceImpl();
		return once;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationChannel createCommunicationChannel() {
		CommunicationChannelImpl communicationChannel = new CommunicationChannelImpl();
		return communicationChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationStep createCommunicationStep() {
		CommunicationStepImpl communicationStep = new CommunicationStepImpl();
		return communicationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquireStep createAcquireStep() {
		AcquireStepImpl acquireStep = new AcquireStepImpl();
		return acquireStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseStep createReleaseStep() {
		ReleaseStepImpl releaseStep = new ReleaseStepImpl();
		return releaseStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestedService createRequestedService() {
		RequestedServiceImpl requestedService = new RequestedServiceImpl();
		return requestedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceServiceExcecution createResourceServiceExcecution() {
		ResourceServiceExcecutionImpl resourceServiceExcecution = new ResourceServiceExcecutionImpl();
		return resourceServiceExcecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlidingWindowPattern createSlidingWindowPattern() {
		SlidingWindowPatternImpl slidingWindowPattern = new SlidingWindowPatternImpl();
		return slidingWindowPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionStep createExecutionStep() {
		ExecutionStepImpl executionStep = new ExecutionStepImpl();
		return executionStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicPattern createPeriodicPattern() {
		PeriodicPatternImpl periodicPattern = new PeriodicPatternImpl();
		return periodicPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SporadicPattern createSporadicPattern() {
		SporadicPatternImpl sporadicPattern = new SporadicPatternImpl();
		return sporadicPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorKind createConnectorKindFromString(EDataType eDataType, String initialValue) {
		ConnectorKind result = ConnectorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaxityKind createLaxityKindFromString(EDataType eDataType, String initialValue) {
		LaxityKind result = LaxityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLaxityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind createObjectNodeOrderingKindFromString(EDataType eDataType, String initialValue) {
		ObjectNodeOrderingKind result = ObjectNodeOrderingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectNodeOrderingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DataSize createNFP_DataSizeFromString(EDataType eDataType, String initialValue) {
		return NfpFactory.eINSTANCE.createDataSizeFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertNFP_DataSizeToString(EDataType eDataType, Object instanceValue) {
		assert(instanceValue == null || instanceValue instanceof DataSize);
		return NfpFactory.eINSTANCE.convertDataSizeToString((DataSize)instanceValue);
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
	 * @generated
	 */
	public GqamPackage getGqamPackage() {
		return (GqamPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GqamPackage getPackage() {
		return GqamPackage.eINSTANCE;
	}

} //GqamFactoryImpl
