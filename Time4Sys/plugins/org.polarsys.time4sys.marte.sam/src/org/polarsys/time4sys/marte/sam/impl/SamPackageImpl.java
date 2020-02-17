/*******************************************************************************
 * Copyright (c) 2017, 2018 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.sam.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage;
import org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;
import org.polarsys.time4sys.marte.sam.SamFactory;
import org.polarsys.time4sys.marte.sam.SamPackage;
import org.polarsys.time4sys.marte.sam.SchedulingObserver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SamPackageImpl extends EPackageImpl implements SamPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endToEndFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingObserverEClass = null;

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
	 * @see org.polarsys.time4sys.marte.sam.SamPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SamPackageImpl() {
		super(eNS_URI, SamFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SamPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SamPackage init() {
		if (isInited) return (SamPackage)EPackage.Registry.INSTANCE.getEPackage(SamPackage.eNS_URI);

		// Obtain or create and register package
		SamPackageImpl theSamPackage = (SamPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SamPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SamPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GqamPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSamPackage.createPackageContents();

		// Initialize created meta-data
		theSamPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSamPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SamPackage.eNS_URI, theSamPackage);
		return theSamPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndToEndFlow() {
		return endToEndFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndToEndFlow_EndToEndStimuli() {
		return (EReference)endToEndFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndToEndFlow_EndToEndScenario() {
		return (EReference)endToEndFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndToEndFlow_IsSchedulable() {
		return (EAttribute)endToEndFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndToEndFlow_SchedulabilitySlack() {
		return (EAttribute)endToEndFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndToEndFlow_EndToEndTime() {
		return (EAttribute)endToEndFlowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndToEndFlow_EndToEndDeadline() {
		return (EAttribute)endToEndFlowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndToEndFlow_Timing() {
		return (EReference)endToEndFlowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndToEndFlow_InvolvedElement() {
		return (EReference)endToEndFlowEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndToEndFlow__FindStepsOnPath() {
		return endToEndFlowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulingObserver() {
		return schedulingObserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulingObserver_Suspensions() {
		return (EAttribute)schedulingObserverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulingObserver_BlockingTime() {
		return (EAttribute)schedulingObserverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulingObserver_Overlaps() {
		return (EAttribute)schedulingObserverEClass.getEStructuralFeatures().get(2);
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
	public SamFactory getSamFactory() {
		return (SamFactory)getEFactoryInstance();
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
		endToEndFlowEClass = createEClass(END_TO_END_FLOW);
		createEReference(endToEndFlowEClass, END_TO_END_FLOW__END_TO_END_STIMULI);
		createEReference(endToEndFlowEClass, END_TO_END_FLOW__END_TO_END_SCENARIO);
		createEAttribute(endToEndFlowEClass, END_TO_END_FLOW__IS_SCHEDULABLE);
		createEAttribute(endToEndFlowEClass, END_TO_END_FLOW__SCHEDULABILITY_SLACK);
		createEAttribute(endToEndFlowEClass, END_TO_END_FLOW__END_TO_END_TIME);
		createEAttribute(endToEndFlowEClass, END_TO_END_FLOW__END_TO_END_DEADLINE);
		createEReference(endToEndFlowEClass, END_TO_END_FLOW__TIMING);
		createEReference(endToEndFlowEClass, END_TO_END_FLOW__INVOLVED_ELEMENT);
		createEOperation(endToEndFlowEClass, END_TO_END_FLOW___FIND_STEPS_ON_PATH);

		schedulingObserverEClass = createEClass(SCHEDULING_OBSERVER);
		createEAttribute(schedulingObserverEClass, SCHEDULING_OBSERVER__SUSPENSIONS);
		createEAttribute(schedulingObserverEClass, SCHEDULING_OBSERVER__BLOCKING_TIME);
		createEAttribute(schedulingObserverEClass, SCHEDULING_OBSERVER__OVERLAPS);

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
		CoreElementsPackage theCoreElementsPackage = (CoreElementsPackage)EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI);
		AnnotationPackage theAnnotationPackage = (AnnotationPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationPackage.eNS_URI);
		GqamPackage theGqamPackage = (GqamPackage)EPackage.Registry.INSTANCE.getEPackage(GqamPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		endToEndFlowEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());
		endToEndFlowEClass.getESuperTypes().add(theAnnotationPackage.getAnnotatedElement());
		schedulingObserverEClass.getESuperTypes().add(theGqamPackage.getTimedObserver());

		// Initialize classes, features, and operations; add parameters
		initEClass(endToEndFlowEClass, EndToEndFlow.class, "EndToEndFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndToEndFlow_EndToEndStimuli(), theGqamPackage.getWorkloadEvent(), null, "endToEndStimuli", null, 0, -1, EndToEndFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndToEndFlow_EndToEndScenario(), theGqamPackage.getBehaviorScenario(), null, "endToEndScenario", null, 1, 1, EndToEndFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndToEndFlow_IsSchedulable(), ecorePackage.getEBoolean(), "isSchedulable", null, 0, 1, EndToEndFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndToEndFlow_SchedulabilitySlack(), ecorePackage.getEDouble(), "schedulabilitySlack", null, 0, 1, EndToEndFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndToEndFlow_EndToEndTime(), theGqamPackage.getNFP_Duration(), "endToEndTime", null, 0, 1, EndToEndFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndToEndFlow_EndToEndDeadline(), theGqamPackage.getNFP_Duration(), "endToEndDeadline", null, 0, 1, EndToEndFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndToEndFlow_Timing(), theGqamPackage.getTimedObserver(), null, "timing", null, 0, -1, EndToEndFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndToEndFlow_InvolvedElement(), theGqamPackage.getFlowInvolvedElement(), null, "involvedElement", null, 0, -1, EndToEndFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEndToEndFlow__FindStepsOnPath(), theGqamPackage.getBehaviorScenario(), "findStepsOnPath", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(schedulingObserverEClass, SchedulingObserver.class, "SchedulingObserver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchedulingObserver_Suspensions(), this.getNFP_Duration(), "suspensions", null, 0, 1, SchedulingObserver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedulingObserver_BlockingTime(), this.getNFP_Duration(), "blockingTime", null, 0, 1, SchedulingObserver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedulingObserver_Overlaps(), this.getNFP_Duration(), "overlaps", null, 0, 1, SchedulingObserver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(nfP_DurationEDataType, Duration.class, "NFP_Duration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SamPackageImpl
