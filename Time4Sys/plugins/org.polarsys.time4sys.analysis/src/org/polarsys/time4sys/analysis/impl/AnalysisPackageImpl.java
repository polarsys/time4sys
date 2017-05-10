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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.time4sys.analysis.AnalysisFactory;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.AnalyzedSystem;
import org.polarsys.time4sys.analysis.Communication;
import org.polarsys.time4sys.analysis.CommunicationResource;
import org.polarsys.time4sys.analysis.ComputingResource;
import org.polarsys.time4sys.analysis.ConstraintContainer;
import org.polarsys.time4sys.analysis.Delay;
import org.polarsys.time4sys.analysis.EventModel;
import org.polarsys.time4sys.analysis.EventModelContainer;
import org.polarsys.time4sys.analysis.Fragment;
import org.polarsys.time4sys.analysis.InputJoinBehaviorKind;
import org.polarsys.time4sys.analysis.InputPort;
import org.polarsys.time4sys.analysis.InputStimulus;
import org.polarsys.time4sys.analysis.Mapping;
import org.polarsys.time4sys.analysis.MemoryResource;
import org.polarsys.time4sys.analysis.MutualExclusionResource;
import org.polarsys.time4sys.analysis.NamedElement;
import org.polarsys.time4sys.analysis.Offset;
import org.polarsys.time4sys.analysis.OutputPort;
import org.polarsys.time4sys.analysis.OutputStimulus;
import org.polarsys.time4sys.analysis.Port;
import org.polarsys.time4sys.analysis.PortContainer;
import org.polarsys.time4sys.analysis.ProtectionParameterValue;
import org.polarsys.time4sys.analysis.ProtectionProtocol;
import org.polarsys.time4sys.analysis.RequiredProtectionParameter;
import org.polarsys.time4sys.analysis.RequiredSchedulingParameter;
import org.polarsys.time4sys.analysis.Resource;
import org.polarsys.time4sys.analysis.ResourceProtectionParameterValue;
import org.polarsys.time4sys.analysis.ResourceSchedulingParameterValue;
import org.polarsys.time4sys.analysis.ResultContainer;
import org.polarsys.time4sys.analysis.SchedulableElement;
import org.polarsys.time4sys.analysis.Scheduler;
import org.polarsys.time4sys.analysis.SchedulerParameterValue;
import org.polarsys.time4sys.analysis.SchedulerPolicyKind;
import org.polarsys.time4sys.analysis.Stimulus;
import org.polarsys.time4sys.analysis.SynchronizableElement;
import org.polarsys.time4sys.analysis.Task;
import org.polarsys.time4sys.analysis.TwcaEventModel;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.nfp.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisPackageImpl extends EPackageImpl implements AnalysisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analyzedSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationEClass = null;

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
	private EClass computingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventModelContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputStimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryResourceEClass = null;

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
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputStimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectionParameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectionProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredProtectionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredSchedulingParameterEClass = null;

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
	private EClass resourceSchedulingParameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulerParameterValueEClass = null;

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
	private EClass stimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceProtectionParameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twcaEventModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inputJoinBehaviorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedulerPolicyKindEEnum = null;

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
	private EDataType nfP_TimeIntervalEDataType = null;

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
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnalysisPackageImpl() {
		super(eNS_URI, AnalysisFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AnalysisPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnalysisPackage init() {
		if (isInited) return (AnalysisPackage)EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI);

		// Obtain or create and register package
		AnalysisPackageImpl theAnalysisPackage = (AnalysisPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnalysisPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnalysisPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		NfpPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAnalysisPackage.createPackageContents();

		// Initialize created meta-data
		theAnalysisPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnalysisPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnalysisPackage.eNS_URI, theAnalysisPackage);
		return theAnalysisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalyzedSystem() {
		return analyzedSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzedSystem_SchedulableElements() {
		return (EReference)analyzedSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzedSystem_Schedulers() {
		return (EReference)analyzedSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzedSystem_Resources() {
		return (EReference)analyzedSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzedSystem_ConstraintContainer() {
		return (EReference)analyzedSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzedSystem_Stimuli() {
		return (EReference)analyzedSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzedSystem_Delays() {
		return (EReference)analyzedSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzedSystem_ProtectionProtocols() {
		return (EReference)analyzedSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzedSystem_Mutexes() {
		return (EReference)analyzedSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalyzedSystem_Status() {
		return (EAttribute)analyzedSystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzedSystem_ResultContainers() {
		return (EReference)analyzedSystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzedSystem_Mappings() {
		return (EReference)analyzedSystemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalyzedSystem_TimeUnit() {
		return (EAttribute)analyzedSystemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunication() {
		return communicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Bus() {
		return (EReference)communicationEClass.getEStructuralFeatures().get(0);
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
	public EReference getCommunicationResource_Links() {
		return (EReference)communicationResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationResource_CommunicationsAffectedOn() {
		return (EReference)communicationResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationResource_ProtocolName() {
		return (EAttribute)communicationResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationResource_Bandwidth() {
		return (EAttribute)communicationResourceEClass.getEStructuralFeatures().get(3);
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
	public EReference getComputingResource_TasksAffectedOn() {
		return (EReference)computingResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputingResource_LinkedBy() {
		return (EReference)computingResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintContainer() {
		return constraintContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintContainer_Constraints() {
		return (EReference)constraintContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintContainer_AnalyzedSystem() {
		return (EReference)constraintContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelay() {
		return delayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelay_Parent() {
		return (EReference)delayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelay_ReferencedEvent() {
		return (EReference)delayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelay_Duration() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventModel() {
		return eventModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventModel_Offsets() {
		return (EReference)eventModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventModel_Period() {
		return (EAttribute)eventModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventModel_Jitter() {
		return (EAttribute)eventModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventModel_Dmin() {
		return (EAttribute)eventModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventModel_Parent() {
		return (EReference)eventModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventModel_IsSporadic() {
		return (EAttribute)eventModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventModelContainer() {
		return eventModelContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventModelContainer_EventModel() {
		return (EReference)eventModelContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFragment() {
		return fragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragment_Next() {
		return (EReference)fragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragment_Previous() {
		return (EReference)fragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragment_Task() {
		return (EReference)fragmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFragment_CET() {
		return (EAttribute)fragmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_ReceiveFrom() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputStimulus() {
		return inputStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputStimulus_OutputPorts() {
		return (EReference)inputStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_System() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryResource() {
		return memoryResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryResource_Size() {
		return (EAttribute)memoryResourceEClass.getEStructuralFeatures().get(0);
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
	public EReference getMutualExclusionResource_Elements() {
		return (EReference)mutualExclusionResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutualExclusionResource_ProtectionParameters() {
		return (EReference)mutualExclusionResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutualExclusionResource_ProtectedBy() {
		return (EReference)mutualExclusionResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutualExclusionResource_Parent() {
		return (EReference)mutualExclusionResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffset() {
		return offsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffset_EventModel() {
		return (EReference)offsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffset_Value() {
		return (EAttribute)offsetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffset_Reference() {
		return (EAttribute)offsetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_SendTo() {
		return (EReference)outputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputStimulus() {
		return outputStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputStimulus_InputPorts() {
		return (EReference)outputStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Parent() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortContainer() {
		return portContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortContainer_Ports() {
		return (EReference)portContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortContainer_BehaviorKind() {
		return (EAttribute)portContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtectionParameterValue() {
		return protectionParameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtectionParameterValue_Value() {
		return (EAttribute)protectionParameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectionParameterValue_Type() {
		return (EReference)protectionParameterValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtectionProtocol() {
		return protectionProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtectionProtocol_ProtocolName() {
		return (EAttribute)protectionProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectionProtocol_Mutexes() {
		return (EReference)protectionProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectionProtocol_RequiredParameters() {
		return (EReference)protectionProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectionProtocol_ResourceParameterValue() {
		return (EReference)protectionProtocolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectionProtocol_Parent() {
		return (EReference)protectionProtocolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredProtectionParameter() {
		return requiredProtectionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredProtectionParameter_Parent() {
		return (EReference)requiredProtectionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredSchedulingParameter() {
		return requiredSchedulingParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredSchedulingParameter_Parent() {
		return (EReference)requiredSchedulingParameterEClass.getEStructuralFeatures().get(0);
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
	public EReference getResource_Scheduler() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Parent() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_SpeedFactor() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Delay() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceSchedulingParameterValue() {
		return resourceSchedulingParameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceSchedulingParameterValue_Value() {
		return (EAttribute)resourceSchedulingParameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultContainer() {
		return resultContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultContainer_AnalyzedSystem() {
		return (EReference)resultContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulableElement() {
		return schedulableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulableElement_Parent() {
		return (EReference)schedulableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulableElement_ScheduledBy() {
		return (EReference)schedulableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulableElement_CET() {
		return (EAttribute)schedulableElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulableElement_SchedulingParameters() {
		return (EReference)schedulableElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulableElement_OriginalName() {
		return (EAttribute)schedulableElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulerParameterValue() {
		return schedulerParameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulerParameterValue_Type() {
		return (EReference)schedulerParameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulerParameterValue_Value() {
		return (EAttribute)schedulerParameterValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulerParameterValue_Parent() {
		return (EReference)schedulerParameterValueEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getScheduler_PolicyKind() {
		return (EAttribute)schedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_ScheduledElements() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_UsedBy() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_RequiredParameters() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_Parent() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_ResourceParameterValue() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduler_PreferredPolicy() {
		return (EAttribute)schedulerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStimulus() {
		return stimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStimulus_Parent() {
		return (EReference)stimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizableElement() {
		return synchronizableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizableElement_LockedMutexes() {
		return (EReference)synchronizableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_MappedTo() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Fragments() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_First() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_BlockingTime() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceProtectionParameterValue() {
		return resourceProtectionParameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceProtectionParameterValue_Value() {
		return (EAttribute)resourceProtectionParameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwcaEventModel() {
		return twcaEventModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwcaEventModel_Deltamin_func() {
		return (EAttribute)twcaEventModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInputJoinBehaviorKind() {
		return inputJoinBehaviorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchedulerPolicyKind() {
		return schedulerPolicyKindEEnum;
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
	public EDataType getNFP_TimeInterval() {
		return nfP_TimeIntervalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFactory getAnalysisFactory() {
		return (AnalysisFactory)getEFactoryInstance();
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
		analyzedSystemEClass = createEClass(ANALYZED_SYSTEM);
		createEReference(analyzedSystemEClass, ANALYZED_SYSTEM__SCHEDULABLE_ELEMENTS);
		createEReference(analyzedSystemEClass, ANALYZED_SYSTEM__SCHEDULERS);
		createEReference(analyzedSystemEClass, ANALYZED_SYSTEM__RESOURCES);
		createEReference(analyzedSystemEClass, ANALYZED_SYSTEM__CONSTRAINT_CONTAINER);
		createEReference(analyzedSystemEClass, ANALYZED_SYSTEM__STIMULI);
		createEReference(analyzedSystemEClass, ANALYZED_SYSTEM__DELAYS);
		createEReference(analyzedSystemEClass, ANALYZED_SYSTEM__PROTECTION_PROTOCOLS);
		createEReference(analyzedSystemEClass, ANALYZED_SYSTEM__MUTEXES);
		createEAttribute(analyzedSystemEClass, ANALYZED_SYSTEM__STATUS);
		createEReference(analyzedSystemEClass, ANALYZED_SYSTEM__RESULT_CONTAINERS);
		createEReference(analyzedSystemEClass, ANALYZED_SYSTEM__MAPPINGS);
		createEAttribute(analyzedSystemEClass, ANALYZED_SYSTEM__TIME_UNIT);

		communicationEClass = createEClass(COMMUNICATION);
		createEReference(communicationEClass, COMMUNICATION__BUS);

		communicationResourceEClass = createEClass(COMMUNICATION_RESOURCE);
		createEReference(communicationResourceEClass, COMMUNICATION_RESOURCE__LINKS);
		createEReference(communicationResourceEClass, COMMUNICATION_RESOURCE__COMMUNICATIONS_AFFECTED_ON);
		createEAttribute(communicationResourceEClass, COMMUNICATION_RESOURCE__PROTOCOL_NAME);
		createEAttribute(communicationResourceEClass, COMMUNICATION_RESOURCE__BANDWIDTH);

		computingResourceEClass = createEClass(COMPUTING_RESOURCE);
		createEReference(computingResourceEClass, COMPUTING_RESOURCE__TASKS_AFFECTED_ON);
		createEReference(computingResourceEClass, COMPUTING_RESOURCE__LINKED_BY);

		constraintContainerEClass = createEClass(CONSTRAINT_CONTAINER);
		createEReference(constraintContainerEClass, CONSTRAINT_CONTAINER__CONSTRAINTS);
		createEReference(constraintContainerEClass, CONSTRAINT_CONTAINER__ANALYZED_SYSTEM);

		delayEClass = createEClass(DELAY);
		createEReference(delayEClass, DELAY__PARENT);
		createEReference(delayEClass, DELAY__REFERENCED_EVENT);
		createEAttribute(delayEClass, DELAY__DURATION);

		eventModelEClass = createEClass(EVENT_MODEL);
		createEReference(eventModelEClass, EVENT_MODEL__OFFSETS);
		createEAttribute(eventModelEClass, EVENT_MODEL__PERIOD);
		createEAttribute(eventModelEClass, EVENT_MODEL__JITTER);
		createEAttribute(eventModelEClass, EVENT_MODEL__DMIN);
		createEReference(eventModelEClass, EVENT_MODEL__PARENT);
		createEAttribute(eventModelEClass, EVENT_MODEL__IS_SPORADIC);

		eventModelContainerEClass = createEClass(EVENT_MODEL_CONTAINER);
		createEReference(eventModelContainerEClass, EVENT_MODEL_CONTAINER__EVENT_MODEL);

		fragmentEClass = createEClass(FRAGMENT);
		createEReference(fragmentEClass, FRAGMENT__NEXT);
		createEReference(fragmentEClass, FRAGMENT__PREVIOUS);
		createEReference(fragmentEClass, FRAGMENT__TASK);
		createEAttribute(fragmentEClass, FRAGMENT__CET);

		inputPortEClass = createEClass(INPUT_PORT);
		createEReference(inputPortEClass, INPUT_PORT__RECEIVE_FROM);

		inputStimulusEClass = createEClass(INPUT_STIMULUS);
		createEReference(inputStimulusEClass, INPUT_STIMULUS__OUTPUT_PORTS);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__SYSTEM);

		memoryResourceEClass = createEClass(MEMORY_RESOURCE);
		createEAttribute(memoryResourceEClass, MEMORY_RESOURCE__SIZE);

		mutualExclusionResourceEClass = createEClass(MUTUAL_EXCLUSION_RESOURCE);
		createEReference(mutualExclusionResourceEClass, MUTUAL_EXCLUSION_RESOURCE__ELEMENTS);
		createEReference(mutualExclusionResourceEClass, MUTUAL_EXCLUSION_RESOURCE__PROTECTION_PARAMETERS);
		createEReference(mutualExclusionResourceEClass, MUTUAL_EXCLUSION_RESOURCE__PROTECTED_BY);
		createEReference(mutualExclusionResourceEClass, MUTUAL_EXCLUSION_RESOURCE__PARENT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		offsetEClass = createEClass(OFFSET);
		createEReference(offsetEClass, OFFSET__EVENT_MODEL);
		createEAttribute(offsetEClass, OFFSET__VALUE);
		createEAttribute(offsetEClass, OFFSET__REFERENCE);

		outputPortEClass = createEClass(OUTPUT_PORT);
		createEReference(outputPortEClass, OUTPUT_PORT__SEND_TO);

		outputStimulusEClass = createEClass(OUTPUT_STIMULUS);
		createEReference(outputStimulusEClass, OUTPUT_STIMULUS__INPUT_PORTS);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__PARENT);

		portContainerEClass = createEClass(PORT_CONTAINER);
		createEReference(portContainerEClass, PORT_CONTAINER__PORTS);
		createEAttribute(portContainerEClass, PORT_CONTAINER__BEHAVIOR_KIND);

		protectionParameterValueEClass = createEClass(PROTECTION_PARAMETER_VALUE);
		createEAttribute(protectionParameterValueEClass, PROTECTION_PARAMETER_VALUE__VALUE);
		createEReference(protectionParameterValueEClass, PROTECTION_PARAMETER_VALUE__TYPE);

		protectionProtocolEClass = createEClass(PROTECTION_PROTOCOL);
		createEAttribute(protectionProtocolEClass, PROTECTION_PROTOCOL__PROTOCOL_NAME);
		createEReference(protectionProtocolEClass, PROTECTION_PROTOCOL__MUTEXES);
		createEReference(protectionProtocolEClass, PROTECTION_PROTOCOL__REQUIRED_PARAMETERS);
		createEReference(protectionProtocolEClass, PROTECTION_PROTOCOL__RESOURCE_PARAMETER_VALUE);
		createEReference(protectionProtocolEClass, PROTECTION_PROTOCOL__PARENT);

		requiredProtectionParameterEClass = createEClass(REQUIRED_PROTECTION_PARAMETER);
		createEReference(requiredProtectionParameterEClass, REQUIRED_PROTECTION_PARAMETER__PARENT);

		requiredSchedulingParameterEClass = createEClass(REQUIRED_SCHEDULING_PARAMETER);
		createEReference(requiredSchedulingParameterEClass, REQUIRED_SCHEDULING_PARAMETER__PARENT);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__SCHEDULER);
		createEReference(resourceEClass, RESOURCE__PARENT);
		createEAttribute(resourceEClass, RESOURCE__SPEED_FACTOR);
		createEAttribute(resourceEClass, RESOURCE__DELAY);

		resourceSchedulingParameterValueEClass = createEClass(RESOURCE_SCHEDULING_PARAMETER_VALUE);
		createEAttribute(resourceSchedulingParameterValueEClass, RESOURCE_SCHEDULING_PARAMETER_VALUE__VALUE);

		resultContainerEClass = createEClass(RESULT_CONTAINER);
		createEReference(resultContainerEClass, RESULT_CONTAINER__ANALYZED_SYSTEM);

		schedulableElementEClass = createEClass(SCHEDULABLE_ELEMENT);
		createEReference(schedulableElementEClass, SCHEDULABLE_ELEMENT__PARENT);
		createEReference(schedulableElementEClass, SCHEDULABLE_ELEMENT__SCHEDULED_BY);
		createEAttribute(schedulableElementEClass, SCHEDULABLE_ELEMENT__CET);
		createEReference(schedulableElementEClass, SCHEDULABLE_ELEMENT__SCHEDULING_PARAMETERS);
		createEAttribute(schedulableElementEClass, SCHEDULABLE_ELEMENT__ORIGINAL_NAME);

		schedulerParameterValueEClass = createEClass(SCHEDULER_PARAMETER_VALUE);
		createEReference(schedulerParameterValueEClass, SCHEDULER_PARAMETER_VALUE__TYPE);
		createEAttribute(schedulerParameterValueEClass, SCHEDULER_PARAMETER_VALUE__VALUE);
		createEReference(schedulerParameterValueEClass, SCHEDULER_PARAMETER_VALUE__PARENT);

		schedulerEClass = createEClass(SCHEDULER);
		createEAttribute(schedulerEClass, SCHEDULER__POLICY_KIND);
		createEReference(schedulerEClass, SCHEDULER__SCHEDULED_ELEMENTS);
		createEReference(schedulerEClass, SCHEDULER__USED_BY);
		createEReference(schedulerEClass, SCHEDULER__REQUIRED_PARAMETERS);
		createEReference(schedulerEClass, SCHEDULER__PARENT);
		createEReference(schedulerEClass, SCHEDULER__RESOURCE_PARAMETER_VALUE);
		createEAttribute(schedulerEClass, SCHEDULER__PREFERRED_POLICY);

		stimulusEClass = createEClass(STIMULUS);
		createEReference(stimulusEClass, STIMULUS__PARENT);

		synchronizableElementEClass = createEClass(SYNCHRONIZABLE_ELEMENT);
		createEReference(synchronizableElementEClass, SYNCHRONIZABLE_ELEMENT__LOCKED_MUTEXES);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__MAPPED_TO);
		createEReference(taskEClass, TASK__FRAGMENTS);
		createEReference(taskEClass, TASK__FIRST);
		createEAttribute(taskEClass, TASK__BLOCKING_TIME);

		resourceProtectionParameterValueEClass = createEClass(RESOURCE_PROTECTION_PARAMETER_VALUE);
		createEAttribute(resourceProtectionParameterValueEClass, RESOURCE_PROTECTION_PARAMETER_VALUE__VALUE);

		twcaEventModelEClass = createEClass(TWCA_EVENT_MODEL);
		createEAttribute(twcaEventModelEClass, TWCA_EVENT_MODEL__DELTAMIN_FUNC);

		// Create enums
		inputJoinBehaviorKindEEnum = createEEnum(INPUT_JOIN_BEHAVIOR_KIND);
		schedulerPolicyKindEEnum = createEEnum(SCHEDULER_POLICY_KIND);

		// Create data types
		nfP_DurationEDataType = createEDataType(NFP_DURATION);
		nfP_TimeIntervalEDataType = createEDataType(NFP_TIME_INTERVAL);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		analyzedSystemEClass.getESuperTypes().add(this.getNamedElement());
		communicationEClass.getESuperTypes().add(this.getSchedulableElement());
		communicationResourceEClass.getESuperTypes().add(this.getResource());
		computingResourceEClass.getESuperTypes().add(this.getResource());
		constraintContainerEClass.getESuperTypes().add(this.getNamedElement());
		delayEClass.getESuperTypes().add(this.getEventModelContainer());
		delayEClass.getESuperTypes().add(this.getPortContainer());
		eventModelContainerEClass.getESuperTypes().add(this.getNamedElement());
		fragmentEClass.getESuperTypes().add(this.getNamedElement());
		fragmentEClass.getESuperTypes().add(this.getSynchronizableElement());
		inputPortEClass.getESuperTypes().add(this.getPort());
		inputStimulusEClass.getESuperTypes().add(this.getStimulus());
		memoryResourceEClass.getESuperTypes().add(this.getResource());
		mutualExclusionResourceEClass.getESuperTypes().add(this.getNamedElement());
		outputPortEClass.getESuperTypes().add(this.getPort());
		outputStimulusEClass.getESuperTypes().add(this.getStimulus());
		portEClass.getESuperTypes().add(this.getEventModelContainer());
		requiredProtectionParameterEClass.getESuperTypes().add(this.getNamedElement());
		requiredSchedulingParameterEClass.getESuperTypes().add(this.getNamedElement());
		resourceEClass.getESuperTypes().add(this.getNamedElement());
		resourceSchedulingParameterValueEClass.getESuperTypes().add(this.getNamedElement());
		resultContainerEClass.getESuperTypes().add(this.getNamedElement());
		schedulableElementEClass.getESuperTypes().add(this.getEventModelContainer());
		schedulableElementEClass.getESuperTypes().add(this.getPortContainer());
		schedulerEClass.getESuperTypes().add(this.getNamedElement());
		stimulusEClass.getESuperTypes().add(this.getEventModelContainer());
		taskEClass.getESuperTypes().add(this.getSchedulableElement());
		taskEClass.getESuperTypes().add(this.getSynchronizableElement());
		resourceProtectionParameterValueEClass.getESuperTypes().add(this.getNamedElement());
		twcaEventModelEClass.getESuperTypes().add(this.getEventModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(analyzedSystemEClass, AnalyzedSystem.class, "AnalyzedSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalyzedSystem_SchedulableElements(), this.getSchedulableElement(), this.getSchedulableElement_Parent(), "schedulableElements", null, 0, -1, AnalyzedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalyzedSystem_Schedulers(), this.getScheduler(), this.getScheduler_Parent(), "schedulers", null, 0, -1, AnalyzedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalyzedSystem_Resources(), this.getResource(), this.getResource_Parent(), "resources", null, 0, -1, AnalyzedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalyzedSystem_ConstraintContainer(), this.getConstraintContainer(), this.getConstraintContainer_AnalyzedSystem(), "constraintContainer", null, 0, 1, AnalyzedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalyzedSystem_Stimuli(), this.getStimulus(), this.getStimulus_Parent(), "stimuli", null, 0, -1, AnalyzedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalyzedSystem_Delays(), this.getDelay(), this.getDelay_Parent(), "delays", null, 0, -1, AnalyzedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalyzedSystem_ProtectionProtocols(), this.getProtectionProtocol(), this.getProtectionProtocol_Parent(), "protectionProtocols", null, 0, -1, AnalyzedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalyzedSystem_Mutexes(), this.getMutualExclusionResource(), this.getMutualExclusionResource_Parent(), "mutexes", null, 0, -1, AnalyzedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalyzedSystem_Status(), ecorePackage.getEString(), "status", null, 1, 1, AnalyzedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalyzedSystem_ResultContainers(), this.getResultContainer(), this.getResultContainer_AnalyzedSystem(), "resultContainers", null, 0, -1, AnalyzedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalyzedSystem_Mappings(), this.getMapping(), null, "mappings", null, 0, -1, AnalyzedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalyzedSystem_TimeUnit(), ecorePackage.getEString(), "timeUnit", null, 0, 1, AnalyzedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationEClass, Communication.class, "Communication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunication_Bus(), this.getCommunicationResource(), this.getCommunicationResource_CommunicationsAffectedOn(), "bus", null, 1, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationResourceEClass, CommunicationResource.class, "CommunicationResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationResource_Links(), this.getComputingResource(), this.getComputingResource_LinkedBy(), "links", null, 0, -1, CommunicationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationResource_CommunicationsAffectedOn(), this.getCommunication(), this.getCommunication_Bus(), "communicationsAffectedOn", null, 0, -1, CommunicationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationResource_ProtocolName(), ecorePackage.getEString(), "protocolName", null, 1, 1, CommunicationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationResource_Bandwidth(), ecorePackage.getEDouble(), "bandwidth", null, 0, 1, CommunicationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computingResourceEClass, ComputingResource.class, "ComputingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputingResource_TasksAffectedOn(), this.getTask(), this.getTask_MappedTo(), "tasksAffectedOn", null, 0, -1, ComputingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputingResource_LinkedBy(), this.getCommunicationResource(), this.getCommunicationResource_Links(), "linkedBy", null, 0, -1, ComputingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintContainerEClass, ConstraintContainer.class, "ConstraintContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintContainer_Constraints(), ecorePackage.getEObject(), null, "constraints", null, 0, -1, ConstraintContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintContainer_AnalyzedSystem(), this.getAnalyzedSystem(), this.getAnalyzedSystem_ConstraintContainer(), "analyzedSystem", null, 0, 1, ConstraintContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delayEClass, Delay.class, "Delay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelay_Parent(), this.getAnalyzedSystem(), this.getAnalyzedSystem_Delays(), "parent", null, 1, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelay_ReferencedEvent(), this.getEventModelContainer(), null, "referencedEvent", null, 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelay_Duration(), this.getNFP_Duration(), "duration", null, 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventModelEClass, EventModel.class, "EventModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventModel_Offsets(), this.getOffset(), this.getOffset_EventModel(), "offsets", null, 0, -1, EventModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventModel_Period(), this.getNFP_Duration(), "period", null, 0, 1, EventModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventModel_Jitter(), this.getNFP_Duration(), "jitter", null, 0, 1, EventModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventModel_Dmin(), this.getNFP_Duration(), "dmin", null, 0, 1, EventModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventModel_Parent(), this.getEventModelContainer(), this.getEventModelContainer_EventModel(), "parent", null, 0, 1, EventModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventModel_IsSporadic(), ecorePackage.getEBoolean(), "isSporadic", null, 1, 1, EventModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventModelContainerEClass, EventModelContainer.class, "EventModelContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventModelContainer_EventModel(), this.getEventModel(), this.getEventModel_Parent(), "eventModel", null, 0, 1, EventModelContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fragmentEClass, Fragment.class, "Fragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFragment_Next(), this.getFragment(), this.getFragment_Previous(), "next", null, 0, 1, Fragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFragment_Previous(), this.getFragment(), this.getFragment_Next(), "previous", null, 0, 1, Fragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFragment_Task(), this.getTask(), this.getTask_Fragments(), "task", null, 1, 1, Fragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFragment_CET(), this.getNFP_TimeInterval(), "CET", null, 0, 1, Fragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputPortEClass, InputPort.class, "InputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputPort_ReceiveFrom(), this.getOutputPort(), this.getOutputPort_SendTo(), "receiveFrom", null, 0, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputStimulusEClass, InputStimulus.class, "InputStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputStimulus_OutputPorts(), this.getOutputPort(), null, "outputPorts", null, 0, -1, InputStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_System(), this.getAnalyzedSystem(), null, "system", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryResourceEClass, MemoryResource.class, "MemoryResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryResource_Size(), ecorePackage.getELong(), "size", null, 0, 1, MemoryResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mutualExclusionResourceEClass, MutualExclusionResource.class, "MutualExclusionResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMutualExclusionResource_Elements(), this.getSynchronizableElement(), this.getSynchronizableElement_LockedMutexes(), "elements", null, 0, -1, MutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutualExclusionResource_ProtectionParameters(), this.getProtectionParameterValue(), null, "protectionParameters", null, 0, -1, MutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutualExclusionResource_ProtectedBy(), this.getProtectionProtocol(), this.getProtectionProtocol_Mutexes(), "protectedBy", null, 1, 1, MutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutualExclusionResource_Parent(), this.getAnalyzedSystem(), this.getAnalyzedSystem_Mutexes(), "parent", null, 1, 1, MutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offsetEClass, Offset.class, "Offset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOffset_EventModel(), this.getEventModel(), this.getEventModel_Offsets(), "eventModel", null, 1, 1, Offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffset_Value(), this.getNFP_Duration(), "value", null, 1, 1, Offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffset_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, Offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputPort_SendTo(), this.getInputPort(), this.getInputPort_ReceiveFrom(), "sendTo", null, 0, 1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputStimulusEClass, OutputStimulus.class, "OutputStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputStimulus_InputPorts(), this.getInputPort(), null, "inputPorts", null, 0, -1, OutputStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Parent(), this.getPortContainer(), this.getPortContainer_Ports(), "parent", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portContainerEClass, PortContainer.class, "PortContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortContainer_Ports(), this.getPort(), this.getPort_Parent(), "ports", null, 0, -1, PortContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortContainer_BehaviorKind(), this.getInputJoinBehaviorKind(), "behaviorKind", null, 0, 1, PortContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protectionParameterValueEClass, ProtectionParameterValue.class, "ProtectionParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtectionParameterValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, ProtectionParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtectionParameterValue_Type(), this.getRequiredProtectionParameter(), null, "type", null, 1, 1, ProtectionParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protectionProtocolEClass, ProtectionProtocol.class, "ProtectionProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtectionProtocol_ProtocolName(), ecorePackage.getEString(), "protocolName", null, 1, 1, ProtectionProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtectionProtocol_Mutexes(), this.getMutualExclusionResource(), this.getMutualExclusionResource_ProtectedBy(), "mutexes", null, 0, -1, ProtectionProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtectionProtocol_RequiredParameters(), this.getRequiredProtectionParameter(), this.getRequiredProtectionParameter_Parent(), "requiredParameters", null, 0, -1, ProtectionProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtectionProtocol_ResourceParameterValue(), this.getResourceProtectionParameterValue(), null, "resourceParameterValue", null, 0, -1, ProtectionProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtectionProtocol_Parent(), this.getAnalyzedSystem(), this.getAnalyzedSystem_ProtectionProtocols(), "parent", null, 1, 1, ProtectionProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredProtectionParameterEClass, RequiredProtectionParameter.class, "RequiredProtectionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredProtectionParameter_Parent(), this.getProtectionProtocol(), this.getProtectionProtocol_RequiredParameters(), "parent", null, 1, 1, RequiredProtectionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredSchedulingParameterEClass, RequiredSchedulingParameter.class, "RequiredSchedulingParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredSchedulingParameter_Parent(), this.getScheduler(), this.getScheduler_RequiredParameters(), "parent", null, 1, 1, RequiredSchedulingParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Scheduler(), this.getScheduler(), this.getScheduler_UsedBy(), "scheduler", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Parent(), this.getAnalyzedSystem(), this.getAnalyzedSystem_Resources(), "parent", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_SpeedFactor(), ecorePackage.getEDouble(), "speedFactor", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Delay(), this.getNFP_Duration(), "delay", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceSchedulingParameterValueEClass, ResourceSchedulingParameterValue.class, "ResourceSchedulingParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceSchedulingParameterValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, ResourceSchedulingParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultContainerEClass, ResultContainer.class, "ResultContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultContainer_AnalyzedSystem(), this.getAnalyzedSystem(), this.getAnalyzedSystem_ResultContainers(), "analyzedSystem", null, 0, 1, ResultContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulableElementEClass, SchedulableElement.class, "SchedulableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedulableElement_Parent(), this.getAnalyzedSystem(), this.getAnalyzedSystem_SchedulableElements(), "parent", null, 1, 1, SchedulableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulableElement_ScheduledBy(), this.getScheduler(), this.getScheduler_ScheduledElements(), "scheduledBy", null, 0, 1, SchedulableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedulableElement_CET(), this.getNFP_TimeInterval(), "CET", null, 1, 1, SchedulableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulableElement_SchedulingParameters(), this.getSchedulerParameterValue(), this.getSchedulerParameterValue_Parent(), "schedulingParameters", null, 0, -1, SchedulableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedulableElement_OriginalName(), ecorePackage.getEString(), "originalName", null, 0, 1, SchedulableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulerParameterValueEClass, SchedulerParameterValue.class, "SchedulerParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedulerParameterValue_Type(), this.getRequiredSchedulingParameter(), null, "type", null, 1, 1, SchedulerParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedulerParameterValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, SchedulerParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulerParameterValue_Parent(), this.getSchedulableElement(), this.getSchedulableElement_SchedulingParameters(), "parent", null, 1, 1, SchedulerParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulerEClass, Scheduler.class, "Scheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduler_PolicyKind(), this.getSchedulerPolicyKind(), "policyKind", null, 1, 1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduler_ScheduledElements(), this.getSchedulableElement(), this.getSchedulableElement_ScheduledBy(), "scheduledElements", null, 0, -1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduler_UsedBy(), this.getResource(), this.getResource_Scheduler(), "usedBy", null, 0, 1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduler_RequiredParameters(), this.getRequiredSchedulingParameter(), this.getRequiredSchedulingParameter_Parent(), "requiredParameters", null, 0, -1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduler_Parent(), this.getAnalyzedSystem(), this.getAnalyzedSystem_Schedulers(), "parent", null, 0, 1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduler_ResourceParameterValue(), this.getResourceSchedulingParameterValue(), null, "resourceParameterValue", null, 0, -1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduler_PreferredPolicy(), ecorePackage.getEString(), "preferredPolicy", null, 0, 1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stimulusEClass, Stimulus.class, "Stimulus", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStimulus_Parent(), this.getAnalyzedSystem(), this.getAnalyzedSystem_Stimuli(), "parent", null, 1, 1, Stimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronizableElementEClass, SynchronizableElement.class, "SynchronizableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronizableElement_LockedMutexes(), this.getMutualExclusionResource(), this.getMutualExclusionResource_Elements(), "lockedMutexes", null, 0, -1, SynchronizableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_MappedTo(), this.getComputingResource(), this.getComputingResource_TasksAffectedOn(), "mappedTo", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Fragments(), this.getFragment(), this.getFragment_Task(), "fragments", null, 1, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_First(), this.getFragment(), null, "first", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_BlockingTime(), ecorePackage.getELong(), "blockingTime", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceProtectionParameterValueEClass, ResourceProtectionParameterValue.class, "ResourceProtectionParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceProtectionParameterValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, ResourceProtectionParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twcaEventModelEClass, TwcaEventModel.class, "TwcaEventModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwcaEventModel_Deltamin_func(), ecorePackage.getEString(), "deltamin_func", null, 0, 1, TwcaEventModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(inputJoinBehaviorKindEEnum, InputJoinBehaviorKind.class, "InputJoinBehaviorKind");
		addEEnumLiteral(inputJoinBehaviorKindEEnum, InputJoinBehaviorKind.MERGE);
		addEEnumLiteral(inputJoinBehaviorKindEEnum, InputJoinBehaviorKind.JOIN);

		initEEnum(schedulerPolicyKindEEnum, SchedulerPolicyKind.class, "SchedulerPolicyKind");
		addEEnumLiteral(schedulerPolicyKindEEnum, SchedulerPolicyKind.NO_CONTENTION);
		addEEnumLiteral(schedulerPolicyKindEEnum, SchedulerPolicyKind.FIXED_PRIORITY);
		addEEnumLiteral(schedulerPolicyKindEEnum, SchedulerPolicyKind.EDF);
		addEEnumLiteral(schedulerPolicyKindEEnum, SchedulerPolicyKind.FIFO);
		addEEnumLiteral(schedulerPolicyKindEEnum, SchedulerPolicyKind.TDMA);
		addEEnumLiteral(schedulerPolicyKindEEnum, SchedulerPolicyKind.ROUND_ROBIN);

		// Initialize data types
		initEDataType(nfP_DurationEDataType, Duration.class, "NFP_Duration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nfP_TimeIntervalEDataType, TimeInterval.class, "NFP_TimeInterval", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AnalysisPackageImpl
