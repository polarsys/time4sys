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
package org.polarsys.time4sys.marte.gqam.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
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
import org.polarsys.time4sys.marte.gqam.GqamFactory;
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
import org.polarsys.time4sys.marte.gqam.util.GqamValidator;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.nfp.DataSize;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage;
import org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GqamPackageImpl extends EPackageImpl implements GqamPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass burstPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closedPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workloadEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedObserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workloadBehaviorEClass = null;

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
	private EClass multiplicityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyObserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acquireStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestedServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceServiceExcecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slidingWindowPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrivalPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sporadicPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum laxityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectNodeOrderingKindEEnum = null;

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
	private EDataType nfP_DurationEDataType = null;

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
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GqamPackageImpl() {
		super(eNS_URI, GqamFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GqamPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GqamPackage init() {
		if (isInited) return (GqamPackage)EPackage.Registry.INSTANCE.getEPackage(GqamPackage.eNS_URI);

		// Obtain or create and register package
		GqamPackageImpl theGqamPackage = (GqamPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GqamPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GqamPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GrmPackage.eINSTANCE.eClass();
		NfpPackage.eINSTANCE.eClass();
		AnnotationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGqamPackage.createPackageContents();

		// Initialize created meta-data
		theGqamPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGqamPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GqamValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGqamPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GqamPackage.eNS_URI, theGqamPackage);
		return theGqamPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorScenario() {
		return behaviorScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorScenario_Steps() {
		return (EReference)behaviorScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorScenario_Cause() {
		return (EReference)behaviorScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorScenario_Root() {
		return (EReference)behaviorScenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorScenario_ParentStep() {
		return (EReference)behaviorScenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorScenario_Connectors() {
		return (EReference)behaviorScenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviorScenario_RespTime() {
		return (EAttribute)behaviorScenarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviorScenario_BestCET() {
		return (EAttribute)behaviorScenarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviorScenario_WorstCET() {
		return (EAttribute)behaviorScenarioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBurstPattern() {
		return burstPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBurstPattern_MinInterarrival() {
		return (EAttribute)burstPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBurstPattern_MaxInterarrival() {
		return (EAttribute)burstPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBurstPattern_MinEventInterval() {
		return (EAttribute)burstPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBurstPattern_MaxEventInterval() {
		return (EAttribute)burstPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBurstPattern_BurstSize() {
		return (EAttribute)burstPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBurstPattern__SetOuterPeriod__Duration() {
		return burstPatternEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBurstPattern__SetInnerPeriod__Duration() {
		return burstPatternEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClosedPattern() {
		return closedPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClosedPattern_Population() {
		return (EAttribute)closedPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClosedPattern_ExtDelay() {
		return (EAttribute)closedPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkloadEvent() {
		return workloadEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkloadEvent_Effect() {
		return (EReference)workloadEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkloadEvent_Pattern() {
		return (EReference)workloadEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectNode() {
		return objectNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNode_Ordering() {
		return (EAttribute)objectNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNode_Typename() {
		return (EAttribute)objectNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Scenario() {
		return (EReference)stepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_ChildScenario() {
		return (EReference)stepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_OutputRel() {
		return (EReference)stepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_ConcurRes() {
		return (EReference)stepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_InputPin() {
		return (EReference)stepEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_OutputPin() {
		return (EReference)stepEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedObserver() {
		return timedObserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedObserver_Laxity() {
		return (EAttribute)timedObserverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_InputRel() {
		return (EReference)stepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_IsAtomic() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_BlockingTime() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Repetitions() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Probability() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Priority() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_ServiceCount() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecedenceRelation() {
		return precedenceRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedenceRelation_Predec() {
		return (EReference)precedenceRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedenceRelation_Succes() {
		return (EReference)precedenceRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecedenceRelation_ConnectorKind() {
		return (EAttribute)precedenceRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkloadBehavior() {
		return workloadBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkloadBehavior_Behavior() {
		return (EReference)workloadBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkloadBehavior_Demand() {
		return (EReference)workloadBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkloadBehavior_References() {
		return (EReference)workloadBehaviorEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getDelay_Duration() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityElement() {
		return multiplicityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_LowerBound() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_UpperBound() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPin() {
		return inputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPin_Predecessors() {
		return (EReference)inputPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatencyObserver() {
		return latencyObserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatencyObserver_Latency() {
		return (EAttribute)latencyObserverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatencyObserver_MissRatio() {
		return (EAttribute)latencyObserverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatencyObserver_MaxJitter() {
		return (EAttribute)latencyObserverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPin() {
		return outputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPin_Successors() {
		return (EReference)outputPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnce() {
		return onceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationChannel() {
		return communicationChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationStep() {
		return communicationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationStep_MsgSize() {
		return (EAttribute)communicationStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationStep_ComRes() {
		return (EReference)communicationStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPin_Pattern() {
		return (EReference)pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_IsControl() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcquireStep() {
		return acquireStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcquireStep_AcqRes() {
		return (EReference)acquireStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcquireStep_ResUnits() {
		return (EAttribute)acquireStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseStep() {
		return releaseStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseStep_RelRes() {
		return (EReference)releaseStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseStep_ResUnits() {
		return (EAttribute)releaseStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestedService() {
		return requestedServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceServiceExcecution() {
		return resourceServiceExcecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceServiceExcecution_ResourceService() {
		return (EReference)resourceServiceExcecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlidingWindowPattern() {
		return slidingWindowPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlidingWindowPattern_WindowSize() {
		return (EAttribute)slidingWindowPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlidingWindowPattern_NbEvents() {
		return (EAttribute)slidingWindowPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionStep() {
		return executionStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrivalPattern() {
		return arrivalPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrivalPattern_Parent() {
		return (EReference)arrivalPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrivalPattern_Jitter() {
		return (EAttribute)arrivalPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrivalPattern_Phase() {
		return (EAttribute)arrivalPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrivalPattern_Reference() {
		return (EReference)arrivalPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicPattern() {
		return periodicPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicPattern_Period() {
		return (EAttribute)periodicPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicPattern_Occurences() {
		return (EAttribute)periodicPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSporadicPattern() {
		return sporadicPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicPattern_MinInterarrival() {
		return (EAttribute)sporadicPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicPattern_MaxInterarrival() {
		return (EAttribute)sporadicPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_ReferenceName() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectorKind() {
		return connectorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLaxityKind() {
		return laxityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObjectNodeOrderingKind() {
		return objectNodeOrderingKindEEnum;
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
	public EDataType getNFP_Duration() {
		return nfP_DurationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GqamFactory getGqamFactory() {
		return (GqamFactory)getEFactoryInstance();
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
		acquireStepEClass = createEClass(ACQUIRE_STEP);
		createEReference(acquireStepEClass, ACQUIRE_STEP__ACQ_RES);
		createEAttribute(acquireStepEClass, ACQUIRE_STEP__RES_UNITS);

		arrivalPatternEClass = createEClass(ARRIVAL_PATTERN);
		createEReference(arrivalPatternEClass, ARRIVAL_PATTERN__PARENT);
		createEAttribute(arrivalPatternEClass, ARRIVAL_PATTERN__JITTER);
		createEAttribute(arrivalPatternEClass, ARRIVAL_PATTERN__PHASE);
		createEReference(arrivalPatternEClass, ARRIVAL_PATTERN__REFERENCE);

		behaviorScenarioEClass = createEClass(BEHAVIOR_SCENARIO);
		createEReference(behaviorScenarioEClass, BEHAVIOR_SCENARIO__STEPS);
		createEReference(behaviorScenarioEClass, BEHAVIOR_SCENARIO__CAUSE);
		createEReference(behaviorScenarioEClass, BEHAVIOR_SCENARIO__ROOT);
		createEReference(behaviorScenarioEClass, BEHAVIOR_SCENARIO__PARENT_STEP);
		createEReference(behaviorScenarioEClass, BEHAVIOR_SCENARIO__CONNECTORS);
		createEAttribute(behaviorScenarioEClass, BEHAVIOR_SCENARIO__RESP_TIME);
		createEAttribute(behaviorScenarioEClass, BEHAVIOR_SCENARIO__BEST_CET);
		createEAttribute(behaviorScenarioEClass, BEHAVIOR_SCENARIO__WORST_CET);

		burstPatternEClass = createEClass(BURST_PATTERN);
		createEAttribute(burstPatternEClass, BURST_PATTERN__MIN_INTERARRIVAL);
		createEAttribute(burstPatternEClass, BURST_PATTERN__MAX_INTERARRIVAL);
		createEAttribute(burstPatternEClass, BURST_PATTERN__MIN_EVENT_INTERVAL);
		createEAttribute(burstPatternEClass, BURST_PATTERN__MAX_EVENT_INTERVAL);
		createEAttribute(burstPatternEClass, BURST_PATTERN__BURST_SIZE);
		createEOperation(burstPatternEClass, BURST_PATTERN___SET_OUTER_PERIOD__DURATION);
		createEOperation(burstPatternEClass, BURST_PATTERN___SET_INNER_PERIOD__DURATION);

		closedPatternEClass = createEClass(CLOSED_PATTERN);
		createEAttribute(closedPatternEClass, CLOSED_PATTERN__POPULATION);
		createEAttribute(closedPatternEClass, CLOSED_PATTERN__EXT_DELAY);

		communicationChannelEClass = createEClass(COMMUNICATION_CHANNEL);

		communicationStepEClass = createEClass(COMMUNICATION_STEP);
		createEAttribute(communicationStepEClass, COMMUNICATION_STEP__MSG_SIZE);
		createEReference(communicationStepEClass, COMMUNICATION_STEP__COM_RES);

		pinEClass = createEClass(PIN);
		createEReference(pinEClass, PIN__PATTERN);
		createEAttribute(pinEClass, PIN__IS_CONTROL);

		delayEClass = createEClass(DELAY);
		createEAttribute(delayEClass, DELAY__DURATION);

		executionStepEClass = createEClass(EXECUTION_STEP);

		inputPinEClass = createEClass(INPUT_PIN);
		createEReference(inputPinEClass, INPUT_PIN__PREDECESSORS);

		latencyObserverEClass = createEClass(LATENCY_OBSERVER);
		createEAttribute(latencyObserverEClass, LATENCY_OBSERVER__LATENCY);
		createEAttribute(latencyObserverEClass, LATENCY_OBSERVER__MISS_RATIO);
		createEAttribute(latencyObserverEClass, LATENCY_OBSERVER__MAX_JITTER);

		multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER_BOUND);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER_BOUND);

		onceEClass = createEClass(ONCE);

		outputPinEClass = createEClass(OUTPUT_PIN);
		createEReference(outputPinEClass, OUTPUT_PIN__SUCCESSORS);

		periodicPatternEClass = createEClass(PERIODIC_PATTERN);
		createEAttribute(periodicPatternEClass, PERIODIC_PATTERN__PERIOD);
		createEAttribute(periodicPatternEClass, PERIODIC_PATTERN__OCCURENCES);

		precedenceRelationEClass = createEClass(PRECEDENCE_RELATION);
		createEReference(precedenceRelationEClass, PRECEDENCE_RELATION__PREDEC);
		createEReference(precedenceRelationEClass, PRECEDENCE_RELATION__SUCCES);
		createEAttribute(precedenceRelationEClass, PRECEDENCE_RELATION__CONNECTOR_KIND);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__REFERENCE_NAME);

		releaseStepEClass = createEClass(RELEASE_STEP);
		createEReference(releaseStepEClass, RELEASE_STEP__REL_RES);
		createEAttribute(releaseStepEClass, RELEASE_STEP__RES_UNITS);

		requestedServiceEClass = createEClass(REQUESTED_SERVICE);

		resourceServiceExcecutionEClass = createEClass(RESOURCE_SERVICE_EXCECUTION);
		createEReference(resourceServiceExcecutionEClass, RESOURCE_SERVICE_EXCECUTION__RESOURCE_SERVICE);

		slidingWindowPatternEClass = createEClass(SLIDING_WINDOW_PATTERN);
		createEAttribute(slidingWindowPatternEClass, SLIDING_WINDOW_PATTERN__WINDOW_SIZE);
		createEAttribute(slidingWindowPatternEClass, SLIDING_WINDOW_PATTERN__NB_EVENTS);

		sporadicPatternEClass = createEClass(SPORADIC_PATTERN);
		createEAttribute(sporadicPatternEClass, SPORADIC_PATTERN__MIN_INTERARRIVAL);
		createEAttribute(sporadicPatternEClass, SPORADIC_PATTERN__MAX_INTERARRIVAL);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__IS_ATOMIC);
		createEAttribute(stepEClass, STEP__BLOCKING_TIME);
		createEAttribute(stepEClass, STEP__REPETITIONS);
		createEAttribute(stepEClass, STEP__PROBABILITY);
		createEAttribute(stepEClass, STEP__PRIORITY);
		createEAttribute(stepEClass, STEP__SERVICE_COUNT);
		createEReference(stepEClass, STEP__SCENARIO);
		createEReference(stepEClass, STEP__CHILD_SCENARIO);
		createEReference(stepEClass, STEP__INPUT_REL);
		createEReference(stepEClass, STEP__OUTPUT_REL);
		createEReference(stepEClass, STEP__CONCUR_RES);
		createEReference(stepEClass, STEP__INPUT_PIN);
		createEReference(stepEClass, STEP__OUTPUT_PIN);

		timedObserverEClass = createEClass(TIMED_OBSERVER);
		createEAttribute(timedObserverEClass, TIMED_OBSERVER__LAXITY);

		workloadBehaviorEClass = createEClass(WORKLOAD_BEHAVIOR);
		createEReference(workloadBehaviorEClass, WORKLOAD_BEHAVIOR__BEHAVIOR);
		createEReference(workloadBehaviorEClass, WORKLOAD_BEHAVIOR__DEMAND);
		createEReference(workloadBehaviorEClass, WORKLOAD_BEHAVIOR__REFERENCES);

		workloadEventEClass = createEClass(WORKLOAD_EVENT);
		createEReference(workloadEventEClass, WORKLOAD_EVENT__EFFECT);
		createEReference(workloadEventEClass, WORKLOAD_EVENT__PATTERN);

		objectNodeEClass = createEClass(OBJECT_NODE);
		createEAttribute(objectNodeEClass, OBJECT_NODE__ORDERING);
		createEAttribute(objectNodeEClass, OBJECT_NODE__TYPENAME);

		// Create enums
		connectorKindEEnum = createEEnum(CONNECTOR_KIND);
		laxityKindEEnum = createEEnum(LAXITY_KIND);
		objectNodeOrderingKindEEnum = createEEnum(OBJECT_NODE_ORDERING_KIND);

		// Create data types
		nfP_DataSizeEDataType = createEDataType(NFP_DATA_SIZE);
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
		CoreElementsPackage theCoreElementsPackage = (CoreElementsPackage)EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		AnnotationPackage theAnnotationPackage = (AnnotationPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		acquireStepEClass.getESuperTypes().add(this.getStep());
		behaviorScenarioEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());
		burstPatternEClass.getESuperTypes().add(this.getArrivalPattern());
		closedPatternEClass.getESuperTypes().add(this.getArrivalPattern());
		communicationChannelEClass.getESuperTypes().add(theGrmPackage.getSchedulableResource());
		communicationStepEClass.getESuperTypes().add(this.getStep());
		pinEClass.getESuperTypes().add(this.getMultiplicityElement());
		pinEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());
		pinEClass.getESuperTypes().add(this.getObjectNode());
		delayEClass.getESuperTypes().add(this.getStep());
		executionStepEClass.getESuperTypes().add(this.getStep());
		inputPinEClass.getESuperTypes().add(this.getPin());
		latencyObserverEClass.getESuperTypes().add(this.getTimedObserver());
		onceEClass.getESuperTypes().add(this.getArrivalPattern());
		outputPinEClass.getESuperTypes().add(this.getPin());
		periodicPatternEClass.getESuperTypes().add(this.getArrivalPattern());
		releaseStepEClass.getESuperTypes().add(this.getStep());
		requestedServiceEClass.getESuperTypes().add(this.getStep());
		resourceServiceExcecutionEClass.getESuperTypes().add(this.getStep());
		slidingWindowPatternEClass.getESuperTypes().add(this.getArrivalPattern());
		sporadicPatternEClass.getESuperTypes().add(this.getArrivalPattern());
		stepEClass.getESuperTypes().add(this.getBehaviorScenario());
		stepEClass.getESuperTypes().add(theAnnotationPackage.getAnnotatedElement());
		timedObserverEClass.getESuperTypes().add(theAnnotationPackage.getConstraint());
		workloadBehaviorEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());
		workloadEventEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(acquireStepEClass, AcquireStep.class, "AcquireStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcquireStep_AcqRes(), theGrmPackage.getResource(), null, "acqRes", null, 0, 1, AcquireStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcquireStep_ResUnits(), ecorePackage.getEInt(), "resUnits", null, 0, 1, AcquireStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrivalPatternEClass, ArrivalPattern.class, "ArrivalPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrivalPattern_Parent(), this.getWorkloadEvent(), this.getWorkloadEvent_Pattern(), "parent", null, 0, 1, ArrivalPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrivalPattern_Jitter(), this.getNFP_Duration(), "jitter", null, 0, 1, ArrivalPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrivalPattern_Phase(), this.getNFP_Duration(), "phase", null, 0, 1, ArrivalPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrivalPattern_Reference(), this.getReference(), null, "reference", null, 0, 1, ArrivalPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorScenarioEClass, BehaviorScenario.class, "BehaviorScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorScenario_Steps(), this.getStep(), this.getStep_Scenario(), "steps", null, 0, -1, BehaviorScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorScenario_Cause(), this.getWorkloadEvent(), this.getWorkloadEvent_Effect(), "cause", null, 0, -1, BehaviorScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorScenario_Root(), this.getStep(), null, "root", null, 0, 1, BehaviorScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorScenario_ParentStep(), this.getStep(), this.getStep_ChildScenario(), "parentStep", null, 0, 1, BehaviorScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorScenario_Connectors(), this.getPrecedenceRelation(), null, "connectors", null, 0, -1, BehaviorScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviorScenario_RespTime(), this.getNFP_Duration(), "respTime", null, 0, 1, BehaviorScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviorScenario_BestCET(), this.getNFP_Duration(), "bestCET", null, 0, 1, BehaviorScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviorScenario_WorstCET(), this.getNFP_Duration(), "worstCET", null, 0, 1, BehaviorScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(burstPatternEClass, BurstPattern.class, "BurstPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBurstPattern_MinInterarrival(), this.getNFP_Duration(), "minInterarrival", null, 1, 1, BurstPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBurstPattern_MaxInterarrival(), this.getNFP_Duration(), "maxInterarrival", null, 0, 1, BurstPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBurstPattern_MinEventInterval(), this.getNFP_Duration(), "minEventInterval", null, 1, 1, BurstPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBurstPattern_MaxEventInterval(), this.getNFP_Duration(), "maxEventInterval", null, 0, 1, BurstPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBurstPattern_BurstSize(), ecorePackage.getELong(), "burstSize", null, 1, 1, BurstPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getBurstPattern__SetOuterPeriod__Duration(), null, "setOuterPeriod", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNFP_Duration(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBurstPattern__SetInnerPeriod__Duration(), null, "setInnerPeriod", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNFP_Duration(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(closedPatternEClass, ClosedPattern.class, "ClosedPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClosedPattern_Population(), ecorePackage.getELong(), "population", "0", 1, 1, ClosedPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClosedPattern_ExtDelay(), this.getNFP_Duration(), "extDelay", "0", 1, 1, ClosedPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationChannelEClass, CommunicationChannel.class, "CommunicationChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(communicationStepEClass, CommunicationStep.class, "CommunicationStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationStep_MsgSize(), this.getNFP_DataSize(), "msgSize", null, 0, 1, CommunicationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationStep_ComRes(), theGrmPackage.getCommunicationResource(), null, "comRes", null, 0, 1, CommunicationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinEClass, Pin.class, "Pin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPin_Pattern(), this.getArrivalPattern(), null, "pattern", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPin_IsControl(), theEcorePackage.getEBoolean(), "isControl", "true", 1, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delayEClass, Delay.class, "Delay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelay_Duration(), this.getNFP_Duration(), "duration", null, 1, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionStepEClass, ExecutionStep.class, "ExecutionStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputPinEClass, InputPin.class, "InputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputPin_Predecessors(), this.getOutputPin(), this.getOutputPin_Successors(), "predecessors", null, 0, -1, InputPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latencyObserverEClass, LatencyObserver.class, "LatencyObserver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLatencyObserver_Latency(), this.getNFP_Duration(), "latency", null, 0, 1, LatencyObserver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatencyObserver_MissRatio(), ecorePackage.getEDouble(), "missRatio", null, 0, 1, LatencyObserver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatencyObserver_MaxJitter(), this.getNFP_Duration(), "maxJitter", null, 0, 1, LatencyObserver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityElement_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 1, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityElement_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 1, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onceEClass, Once.class, "Once", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputPinEClass, OutputPin.class, "OutputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputPin_Successors(), this.getInputPin(), this.getInputPin_Predecessors(), "successors", null, 0, -1, OutputPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicPatternEClass, PeriodicPattern.class, "PeriodicPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriodicPattern_Period(), this.getNFP_Duration(), "period", "", 0, 1, PeriodicPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicPattern_Occurences(), ecorePackage.getEInt(), "occurences", null, 0, 1, PeriodicPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precedenceRelationEClass, PrecedenceRelation.class, "PrecedenceRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrecedenceRelation_Predec(), this.getStep(), this.getStep_OutputRel(), "predec", null, 0, -1, PrecedenceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedenceRelation_Succes(), this.getStep(), this.getStep_InputRel(), "succes", null, 0, -1, PrecedenceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecedenceRelation_ConnectorKind(), this.getConnectorKind(), "connectorKind", null, 0, 1, PrecedenceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_ReferenceName(), ecorePackage.getEString(), "referenceName", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseStepEClass, ReleaseStep.class, "ReleaseStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReleaseStep_RelRes(), theGrmPackage.getResource(), null, "relRes", null, 0, 1, ReleaseStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReleaseStep_ResUnits(), ecorePackage.getEInt(), "resUnits", null, 0, 1, ReleaseStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestedServiceEClass, RequestedService.class, "RequestedService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceServiceExcecutionEClass, ResourceServiceExcecution.class, "ResourceServiceExcecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceServiceExcecution_ResourceService(), theGrmPackage.getResourceService(), null, "resourceService", null, 0, 1, ResourceServiceExcecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slidingWindowPatternEClass, SlidingWindowPattern.class, "SlidingWindowPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlidingWindowPattern_WindowSize(), this.getNFP_Duration(), "windowSize", null, 1, 1, SlidingWindowPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlidingWindowPattern_NbEvents(), ecorePackage.getELong(), "nbEvents", null, 0, 1, SlidingWindowPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sporadicPatternEClass, SporadicPattern.class, "SporadicPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSporadicPattern_MinInterarrival(), this.getNFP_Duration(), "minInterarrival", null, 0, 1, SporadicPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicPattern_MaxInterarrival(), this.getNFP_Duration(), "maxInterarrival", null, 0, 1, SporadicPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_IsAtomic(), ecorePackage.getEBoolean(), "isAtomic", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_BlockingTime(), this.getNFP_Duration(), "blockingTime", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Repetitions(), ecorePackage.getEDouble(), "repetitions", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Probability(), ecorePackage.getEDouble(), "probability", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_ServiceCount(), ecorePackage.getEInt(), "serviceCount", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Scenario(), this.getBehaviorScenario(), this.getBehaviorScenario_Steps(), "scenario", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_ChildScenario(), this.getBehaviorScenario(), this.getBehaviorScenario_ParentStep(), "childScenario", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_InputRel(), this.getPrecedenceRelation(), this.getPrecedenceRelation_Succes(), "inputRel", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_OutputRel(), this.getPrecedenceRelation(), this.getPrecedenceRelation_Predec(), "outputRel", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_ConcurRes(), theGrmPackage.getSchedulableResource(), null, "concurRes", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_InputPin(), this.getInputPin(), null, "inputPin", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_OutputPin(), this.getOutputPin(), null, "outputPin", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedObserverEClass, TimedObserver.class, "TimedObserver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedObserver_Laxity(), this.getLaxityKind(), "laxity", null, 0, -1, TimedObserver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workloadBehaviorEClass, WorkloadBehavior.class, "WorkloadBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkloadBehavior_Behavior(), this.getBehaviorScenario(), null, "behavior", null, 1, -1, WorkloadBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkloadBehavior_Demand(), this.getWorkloadEvent(), null, "demand", null, 1, -1, WorkloadBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkloadBehavior_References(), this.getReference(), null, "references", null, 0, -1, WorkloadBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workloadEventEClass, WorkloadEvent.class, "WorkloadEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkloadEvent_Effect(), this.getBehaviorScenario(), this.getBehaviorScenario_Cause(), "effect", null, 0, 1, WorkloadEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkloadEvent_Pattern(), this.getArrivalPattern(), this.getArrivalPattern_Parent(), "pattern", null, 0, 1, WorkloadEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectNodeEClass, ObjectNode.class, "ObjectNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectNode_Ordering(), this.getObjectNodeOrderingKind(), "ordering", null, 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectNode_Typename(), theEcorePackage.getEString(), "typename", null, 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(connectorKindEEnum, ConnectorKind.class, "ConnectorKind");
		addEEnumLiteral(connectorKindEEnum, ConnectorKind.SEQUENCE);
		addEEnumLiteral(connectorKindEEnum, ConnectorKind.BRANCH);
		addEEnumLiteral(connectorKindEEnum, ConnectorKind.MERGE);
		addEEnumLiteral(connectorKindEEnum, ConnectorKind.FORK);
		addEEnumLiteral(connectorKindEEnum, ConnectorKind.JOIN);

		initEEnum(laxityKindEEnum, LaxityKind.class, "LaxityKind");
		addEEnumLiteral(laxityKindEEnum, LaxityKind.UNDEF);
		addEEnumLiteral(laxityKindEEnum, LaxityKind.HARD);
		addEEnumLiteral(laxityKindEEnum, LaxityKind.SOFT);
		addEEnumLiteral(laxityKindEEnum, LaxityKind.OTHER);

		initEEnum(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.class, "ObjectNodeOrderingKind");
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.UNORDERED);
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.LIFO);
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.FIFO);
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.ORDERED);

		// Initialize data types
		initEDataType(nfP_DataSizeEDataType, DataSize.class, "NFP_DataSize", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nfP_DurationEDataType, Duration.class, "NFP_Duration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (delayEClass, 
		   source, 
		   new String[] {
			 "constraints", "notOnAnyTask"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (delayEClass, 
		   source, 
		   new String[] {
			 "notOnAnyTask", "self.concurRes.oclIsUndefined()"
		   });
	}

} //GqamPackageImpl
