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
package org.polarsys.time4sys.analysis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.time4sys.analysis.*;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisFactoryImpl extends EFactoryImpl implements AnalysisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnalysisFactory init() {
		try {
			AnalysisFactory theAnalysisFactory = (AnalysisFactory)EPackage.Registry.INSTANCE.getEFactory(AnalysisPackage.eNS_URI);
			if (theAnalysisFactory != null) {
				return theAnalysisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnalysisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFactoryImpl() {
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
			case AnalysisPackage.ANALYZED_SYSTEM: return createAnalyzedSystem();
			case AnalysisPackage.COMMUNICATION: return createCommunication();
			case AnalysisPackage.COMMUNICATION_RESOURCE: return createCommunicationResource();
			case AnalysisPackage.COMPUTING_RESOURCE: return createComputingResource();
			case AnalysisPackage.CONSTRAINT_CONTAINER: return createConstraintContainer();
			case AnalysisPackage.DELAY: return createDelay();
			case AnalysisPackage.EVENT_MODEL: return createEventModel();
			case AnalysisPackage.FRAGMENT: return createFragment();
			case AnalysisPackage.INPUT_PORT: return createInputPort();
			case AnalysisPackage.INPUT_STIMULUS: return createInputStimulus();
			case AnalysisPackage.MEMORY_RESOURCE: return createMemoryResource();
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE: return createMutualExclusionResource();
			case AnalysisPackage.OFFSET: return createOffset();
			case AnalysisPackage.OUTPUT_PORT: return createOutputPort();
			case AnalysisPackage.OUTPUT_STIMULUS: return createOutputStimulus();
			case AnalysisPackage.PROTECTION_PARAMETER_VALUE: return createProtectionParameterValue();
			case AnalysisPackage.PROTECTION_PROTOCOL: return createProtectionProtocol();
			case AnalysisPackage.REQUIRED_PROTECTION_PARAMETER: return createRequiredProtectionParameter();
			case AnalysisPackage.REQUIRED_SCHEDULING_PARAMETER: return createRequiredSchedulingParameter();
			case AnalysisPackage.RESOURCE_SCHEDULING_PARAMETER_VALUE: return createResourceSchedulingParameterValue();
			case AnalysisPackage.RESULT_CONTAINER: return createResultContainer();
			case AnalysisPackage.SCHEDULER_PARAMETER_VALUE: return createSchedulerParameterValue();
			case AnalysisPackage.SCHEDULER: return createScheduler();
			case AnalysisPackage.TASK: return createTask();
			case AnalysisPackage.RESOURCE_PROTECTION_PARAMETER_VALUE: return createResourceProtectionParameterValue();
			case AnalysisPackage.TWCA_EVENT_MODEL: return createTwcaEventModel();
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
			case AnalysisPackage.INPUT_JOIN_BEHAVIOR_KIND:
				return createInputJoinBehaviorKindFromString(eDataType, initialValue);
			case AnalysisPackage.SCHEDULER_POLICY_KIND:
				return createSchedulerPolicyKindFromString(eDataType, initialValue);
			case AnalysisPackage.NFP_DURATION:
				return createNFP_DurationFromString(eDataType, initialValue);
			case AnalysisPackage.NFP_TIME_INTERVAL:
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
			case AnalysisPackage.INPUT_JOIN_BEHAVIOR_KIND:
				return convertInputJoinBehaviorKindToString(eDataType, instanceValue);
			case AnalysisPackage.SCHEDULER_POLICY_KIND:
				return convertSchedulerPolicyKindToString(eDataType, instanceValue);
			case AnalysisPackage.NFP_DURATION:
				return convertNFP_DurationToString(eDataType, instanceValue);
			case AnalysisPackage.NFP_TIME_INTERVAL:
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
	public AnalyzedSystem createAnalyzedSystem() {
		AnalyzedSystemImpl analyzedSystem = new AnalyzedSystemImpl();
		return analyzedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationResource createCommunicationResource() {
		CommunicationResourceImpl communicationResource = new CommunicationResourceImpl();
		return communicationResource;
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
	public ConstraintContainer createConstraintContainer() {
		ConstraintContainerImpl constraintContainer = new ConstraintContainerImpl();
		return constraintContainer;
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
	public EventModel createEventModel() {
		EventModelImpl eventModel = new EventModelImpl();
		return eventModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment createFragment() {
		FragmentImpl fragment = new FragmentImpl();
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStimulus createInputStimulus() {
		InputStimulusImpl inputStimulus = new InputStimulusImpl();
		return inputStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryResource createMemoryResource() {
		MemoryResourceImpl memoryResource = new MemoryResourceImpl();
		return memoryResource;
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
	public Offset createOffset() {
		OffsetImpl offset = new OffsetImpl();
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputStimulus createOutputStimulus() {
		OutputStimulusImpl outputStimulus = new OutputStimulusImpl();
		return outputStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionParameterValue createProtectionParameterValue() {
		ProtectionParameterValueImpl protectionParameterValue = new ProtectionParameterValueImpl();
		return protectionParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionProtocol createProtectionProtocol() {
		ProtectionProtocolImpl protectionProtocol = new ProtectionProtocolImpl();
		return protectionProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredProtectionParameter createRequiredProtectionParameter() {
		RequiredProtectionParameterImpl requiredProtectionParameter = new RequiredProtectionParameterImpl();
		return requiredProtectionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredSchedulingParameter createRequiredSchedulingParameter() {
		RequiredSchedulingParameterImpl requiredSchedulingParameter = new RequiredSchedulingParameterImpl();
		return requiredSchedulingParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSchedulingParameterValue createResourceSchedulingParameterValue() {
		ResourceSchedulingParameterValueImpl resourceSchedulingParameterValue = new ResourceSchedulingParameterValueImpl();
		return resourceSchedulingParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultContainer createResultContainer() {
		ResultContainerImpl resultContainer = new ResultContainerImpl();
		return resultContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerParameterValue createSchedulerParameterValue() {
		SchedulerParameterValueImpl schedulerParameterValue = new SchedulerParameterValueImpl();
		return schedulerParameterValue;
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
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceProtectionParameterValue createResourceProtectionParameterValue() {
		ResourceProtectionParameterValueImpl resourceProtectionParameterValue = new ResourceProtectionParameterValueImpl();
		return resourceProtectionParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwcaEventModel createTwcaEventModel() {
		TwcaEventModelImpl twcaEventModel = new TwcaEventModelImpl();
		return twcaEventModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputJoinBehaviorKind createInputJoinBehaviorKindFromString(EDataType eDataType, String initialValue) {
		InputJoinBehaviorKind result = InputJoinBehaviorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputJoinBehaviorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerPolicyKind createSchedulerPolicyKindFromString(EDataType eDataType, String initialValue) {
		SchedulerPolicyKind result = SchedulerPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedulerPolicyKindToString(EDataType eDataType, Object instanceValue) {
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
		assert(instanceValue instanceof Duration);
		return NfpFactory.eINSTANCE.convertDurationToString((Duration)instanceValue);
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
		assert(instanceValue instanceof TimeInterval);
		return NfpFactory.eINSTANCE.convertTimeIntervalToString((TimeInterval)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisPackage getAnalysisPackage() {
		return (AnalysisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnalysisPackage getPackage() {
		return AnalysisPackage.eINSTANCE;
	}

} //AnalysisFactoryImpl
