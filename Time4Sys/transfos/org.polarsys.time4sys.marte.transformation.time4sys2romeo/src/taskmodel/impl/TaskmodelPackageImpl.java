/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Thanh Dat NGUYEN- initial API and implementation
 *
 *******************************************************************************/
/**
 */
package taskmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import petrinet.PetrinetPackage;
import taskmodel.AbstractFragment;
import taskmodel.BoundObserver;
import taskmodel.First_Release;
import taskmodel.Fragment;
import taskmodel.Jitter;
import taskmodel.MutualExclusionResource;
import taskmodel.Observer;
import taskmodel.Offset;
import taskmodel.Period;
import taskmodel.ResponseTimeObserver;
import taskmodel.SharingResourceFragment;
import taskmodel.SimpleComponent;
import taskmodel.Stimulus;
import taskmodel.Task;
import taskmodel.TaskmodelFactory;
import taskmodel.TaskmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskmodelPackageImpl extends EPackageImpl implements TaskmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

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
	private EClass observerEClass = null;

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
	private EClass first_ReleaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jitterEClass = null;

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
	private EClass offsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundObserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseTimeObserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharingResourceFragmentEClass = null;

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
	private EClass abstractFragmentEClass = null;

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
	 * @see taskmodel.TaskmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TaskmodelPackageImpl() {
		super(eNS_URI, TaskmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TaskmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TaskmodelPackage init() {
		if (isInited) return (TaskmodelPackage)EPackage.Registry.INSTANCE.getEPackage(TaskmodelPackage.eNS_URI);

		// Obtain or create and register package
		TaskmodelPackageImpl theTaskmodelPackage = (TaskmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TaskmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TaskmodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PetrinetPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTaskmodelPackage.createPackageContents();

		// Initialize created meta-data
		theTaskmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTaskmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TaskmodelPackage.eNS_URI, theTaskmodelPackage);
		return theTaskmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Observers() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_OwnedTasks() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_OwnedMutualExclusionResources() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystem__ConvertToPetriNet() {
		return systemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystem__Clone() {
		return systemEClass.getEOperations().get(1);
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
	public EReference getTask_Stimulus() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Fragments() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_SharingResourceFragments() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_AllFragments() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__Clone() {
		return taskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObserver() {
		return observerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserver_OwnedTransitions() {
		return (EReference)observerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserver_Connections() {
		return (EReference)observerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserver_OwnedPlaces() {
		return (EReference)observerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserver_CheckPlaces() {
		return (EReference)observerEClass.getEStructuralFeatures().get(3);
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
	public EReference getStimulus_Offset() {
		return (EReference)stimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStimulus_FirstRelease() {
		return (EReference)stimulusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStimulus_Period() {
		return (EReference)stimulusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStimulus_Jitter() {
		return (EReference)stimulusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStimulus__Clone() {
		return stimulusEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirst_Release() {
		return first_ReleaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirst_Release__Clone() {
		return first_ReleaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriod() {
		return periodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPeriod__Clone() {
		return periodEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJitter() {
		return jitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJitter__Clone() {
		return jitterEClass.getEOperations().get(0);
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
	public EAttribute getFragment_Priority() {
		return (EAttribute)fragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFragment__Clone() {
		return fragmentEClass.getEOperations().get(0);
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
	public EOperation getOffset__Clone() {
		return offsetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundObserver() {
		return boundObserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseTimeObserver() {
		return responseTimeObserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleComponent() {
		return simpleComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleComponent_OwnedTransition() {
		return (EReference)simpleComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleComponent_Connections() {
		return (EReference)simpleComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleComponent_OwnedPlace() {
		return (EReference)simpleComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharingResourceFragment() {
		return sharingResourceFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharingResourceFragment_FirstFragment() {
		return (EReference)sharingResourceFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharingResourceFragment_SecondFragment() {
		return (EReference)sharingResourceFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharingResourceFragment_Connections() {
		return (EReference)sharingResourceFragmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSharingResourceFragment__Clone() {
		return sharingResourceFragmentEClass.getEOperations().get(0);
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
	public EReference getMutualExclusionResource_MutualExclusionResourcePlace() {
		return (EReference)mutualExclusionResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutualExclusionResource_Connections() {
		return (EReference)mutualExclusionResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMutualExclusionResource__Clone() {
		return mutualExclusionResourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFragment() {
		return abstractFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFragment_Task() {
		return (EReference)abstractFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskmodelFactory getTaskmodelFactory() {
		return (TaskmodelFactory)getEFactoryInstance();
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
		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__OBSERVERS);
		createEReference(systemEClass, SYSTEM__OWNED_TASKS);
		createEReference(systemEClass, SYSTEM__OWNED_MUTUAL_EXCLUSION_RESOURCES);
		createEOperation(systemEClass, SYSTEM___CONVERT_TO_PETRI_NET);
		createEOperation(systemEClass, SYSTEM___CLONE);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__STIMULUS);
		createEReference(taskEClass, TASK__ALL_FRAGMENTS);
		createEReference(taskEClass, TASK__FRAGMENTS);
		createEReference(taskEClass, TASK__SHARING_RESOURCE_FRAGMENTS);
		createEOperation(taskEClass, TASK___CLONE);

		observerEClass = createEClass(OBSERVER);
		createEReference(observerEClass, OBSERVER__OWNED_TRANSITIONS);
		createEReference(observerEClass, OBSERVER__CONNECTIONS);
		createEReference(observerEClass, OBSERVER__OWNED_PLACES);
		createEReference(observerEClass, OBSERVER__CHECK_PLACES);

		stimulusEClass = createEClass(STIMULUS);
		createEReference(stimulusEClass, STIMULUS__OFFSET);
		createEReference(stimulusEClass, STIMULUS__FIRST_RELEASE);
		createEReference(stimulusEClass, STIMULUS__PERIOD);
		createEReference(stimulusEClass, STIMULUS__JITTER);
		createEOperation(stimulusEClass, STIMULUS___CLONE);

		first_ReleaseEClass = createEClass(FIRST_RELEASE);
		createEOperation(first_ReleaseEClass, FIRST_RELEASE___CLONE);

		periodEClass = createEClass(PERIOD);
		createEOperation(periodEClass, PERIOD___CLONE);

		jitterEClass = createEClass(JITTER);
		createEOperation(jitterEClass, JITTER___CLONE);

		fragmentEClass = createEClass(FRAGMENT);
		createEAttribute(fragmentEClass, FRAGMENT__PRIORITY);
		createEOperation(fragmentEClass, FRAGMENT___CLONE);

		offsetEClass = createEClass(OFFSET);
		createEOperation(offsetEClass, OFFSET___CLONE);

		boundObserverEClass = createEClass(BOUND_OBSERVER);

		responseTimeObserverEClass = createEClass(RESPONSE_TIME_OBSERVER);

		simpleComponentEClass = createEClass(SIMPLE_COMPONENT);
		createEReference(simpleComponentEClass, SIMPLE_COMPONENT__OWNED_TRANSITION);
		createEReference(simpleComponentEClass, SIMPLE_COMPONENT__CONNECTIONS);
		createEReference(simpleComponentEClass, SIMPLE_COMPONENT__OWNED_PLACE);

		sharingResourceFragmentEClass = createEClass(SHARING_RESOURCE_FRAGMENT);
		createEReference(sharingResourceFragmentEClass, SHARING_RESOURCE_FRAGMENT__FIRST_FRAGMENT);
		createEReference(sharingResourceFragmentEClass, SHARING_RESOURCE_FRAGMENT__SECOND_FRAGMENT);
		createEReference(sharingResourceFragmentEClass, SHARING_RESOURCE_FRAGMENT__CONNECTIONS);
		createEOperation(sharingResourceFragmentEClass, SHARING_RESOURCE_FRAGMENT___CLONE);

		mutualExclusionResourceEClass = createEClass(MUTUAL_EXCLUSION_RESOURCE);
		createEReference(mutualExclusionResourceEClass, MUTUAL_EXCLUSION_RESOURCE__MUTUAL_EXCLUSION_RESOURCE_PLACE);
		createEReference(mutualExclusionResourceEClass, MUTUAL_EXCLUSION_RESOURCE__CONNECTIONS);
		createEOperation(mutualExclusionResourceEClass, MUTUAL_EXCLUSION_RESOURCE___CLONE);

		abstractFragmentEClass = createEClass(ABSTRACT_FRAGMENT);
		createEReference(abstractFragmentEClass, ABSTRACT_FRAGMENT__TASK);
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
		PetrinetPackage thePetrinetPackage = (PetrinetPackage)EPackage.Registry.INSTANCE.getEPackage(PetrinetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		first_ReleaseEClass.getESuperTypes().add(this.getSimpleComponent());
		periodEClass.getESuperTypes().add(this.getSimpleComponent());
		jitterEClass.getESuperTypes().add(this.getSimpleComponent());
		fragmentEClass.getESuperTypes().add(this.getSimpleComponent());
		fragmentEClass.getESuperTypes().add(this.getAbstractFragment());
		offsetEClass.getESuperTypes().add(this.getSimpleComponent());
		boundObserverEClass.getESuperTypes().add(this.getObserver());
		responseTimeObserverEClass.getESuperTypes().add(this.getObserver());
		sharingResourceFragmentEClass.getESuperTypes().add(this.getAbstractFragment());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemEClass, taskmodel.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Observers(), this.getObserver(), null, "observers", null, 0, -1, taskmodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_OwnedTasks(), this.getTask(), null, "ownedTasks", null, 0, -1, taskmodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_OwnedMutualExclusionResources(), this.getMutualExclusionResource(), null, "ownedMutualExclusionResources", null, 0, -1, taskmodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSystem__ConvertToPetriNet(), thePetrinetPackage.getPetriNet(), "convertToPetriNet", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSystem__Clone(), this.getSystem(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Stimulus(), this.getStimulus(), null, "stimulus", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_AllFragments(), this.getAbstractFragment(), null, "allFragments", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Fragments(), this.getFragment(), null, "fragments", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_SharingResourceFragments(), this.getSharingResourceFragment(), null, "sharingResourceFragments", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTask__Clone(), this.getTask(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(observerEClass, Observer.class, "Observer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObserver_OwnedTransitions(), thePetrinetPackage.getTransition(), null, "ownedTransitions", null, 0, -1, Observer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserver_Connections(), thePetrinetPackage.getConnection(), null, "connections", null, 0, -1, Observer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserver_OwnedPlaces(), thePetrinetPackage.getPlace(), null, "ownedPlaces", null, 0, -1, Observer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserver_CheckPlaces(), thePetrinetPackage.getPlace(), null, "checkPlaces", null, 0, -1, Observer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stimulusEClass, Stimulus.class, "Stimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStimulus_Offset(), this.getOffset(), null, "offset", null, 0, 1, Stimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStimulus_FirstRelease(), this.getFirst_Release(), null, "firstRelease", null, 0, 1, Stimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStimulus_Period(), this.getPeriod(), null, "period", null, 0, 1, Stimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStimulus_Jitter(), this.getJitter(), null, "jitter", null, 0, 1, Stimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStimulus__Clone(), this.getStimulus(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(first_ReleaseEClass, First_Release.class, "First_Release", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getFirst_Release__Clone(), this.getFirst_Release(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(periodEClass, Period.class, "Period", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPeriod__Clone(), this.getPeriod(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jitterEClass, Jitter.class, "Jitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getJitter__Clone(), this.getJitter(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fragmentEClass, Fragment.class, "Fragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFragment_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Fragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFragment__Clone(), this.getFragment(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(offsetEClass, Offset.class, "Offset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getOffset__Clone(), this.getOffset(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(boundObserverEClass, BoundObserver.class, "BoundObserver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responseTimeObserverEClass, ResponseTimeObserver.class, "ResponseTimeObserver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleComponentEClass, SimpleComponent.class, "SimpleComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleComponent_OwnedTransition(), thePetrinetPackage.getTransition(), null, "ownedTransition", null, 1, 1, SimpleComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleComponent_Connections(), thePetrinetPackage.getConnection(), null, "connections", null, 0, -1, SimpleComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleComponent_OwnedPlace(), thePetrinetPackage.getPlace(), null, "ownedPlace", null, 1, 1, SimpleComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharingResourceFragmentEClass, SharingResourceFragment.class, "SharingResourceFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSharingResourceFragment_FirstFragment(), this.getFragment(), null, "firstFragment", null, 1, 1, SharingResourceFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharingResourceFragment_SecondFragment(), this.getFragment(), null, "secondFragment", null, 1, 1, SharingResourceFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharingResourceFragment_Connections(), thePetrinetPackage.getConnection(), null, "connections", null, 0, -1, SharingResourceFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSharingResourceFragment__Clone(), this.getSharingResourceFragment(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mutualExclusionResourceEClass, MutualExclusionResource.class, "MutualExclusionResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMutualExclusionResource_MutualExclusionResourcePlace(), thePetrinetPackage.getPlace(), null, "mutualExclusionResourcePlace", null, 1, 1, MutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutualExclusionResource_Connections(), thePetrinetPackage.getConnection(), null, "connections", null, 0, -1, MutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMutualExclusionResource__Clone(), this.getMutualExclusionResource(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractFragmentEClass, AbstractFragment.class, "AbstractFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractFragment_Task(), this.getTask(), null, "task", null, 0, 1, AbstractFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TaskmodelPackageImpl
