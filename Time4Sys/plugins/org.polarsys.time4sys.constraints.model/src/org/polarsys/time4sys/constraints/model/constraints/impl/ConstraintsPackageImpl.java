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
package org.polarsys.time4sys.constraints.model.constraints.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.time4sys.constraints.model.constraints.AnalysisParameter;
import org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer;
import org.polarsys.time4sys.constraints.model.constraints.ConstraintsFactory;
import org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage;
import org.polarsys.time4sys.constraints.model.constraints.JitterConstraint;
import org.polarsys.time4sys.constraints.model.constraints.LatencyConstraint;
import org.polarsys.time4sys.constraints.model.constraints.LoadConstraint;
import org.polarsys.time4sys.constraints.model.constraints.TimingConstraint;
import org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint;
import org.polarsys.time4sys.analysis.AnalysisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintsPackageImpl extends EPackageImpl implements ConstraintsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twcaConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jitterConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingConstraintEClass = null;

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
	private EClass analysisParameterEClass = null;

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
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConstraintsPackageImpl() {
		super(eNS_URI, ConstraintsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConstraintsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConstraintsPackage init() {
		if (isInited) return (ConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);

		// Obtain or create and register package
		ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConstraintsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConstraintsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AnalysisPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConstraintsPackage.createPackageContents();

		// Initialize created meta-data
		theConstraintsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConstraintsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConstraintsPackage.eNS_URI, theConstraintsPackage);
		return theConstraintsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwcaConstraint() {
		return twcaConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwcaConstraint_NbConsecutiveActivations() {
		return (EAttribute)twcaConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwcaConstraint_NbMissedDeadlines() {
		return (EAttribute)twcaConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTwcaConstraint_ConstrainedElement() {
		return (EReference)twcaConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatencyConstraint() {
		return latencyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJitterConstraint() {
		return jitterConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJitterConstraint_Elements() {
		return (EReference)jitterConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadConstraint() {
		return loadConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadConstraint_Resources() {
		return (EReference)loadConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingConstraint() {
		return timingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingConstraint_Min() {
		return (EAttribute)timingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingConstraint_Max() {
		return (EAttribute)timingConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingConstraint_To() {
		return (EReference)timingConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingConstraint_From() {
		return (EReference)timingConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingConstraint_Via() {
		return (EReference)timingConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingConstraint_Value() {
		return (EAttribute)timingConstraintEClass.getEStructuralFeatures().get(5);
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
	public EReference getConstraintContainer_TwcaConstraints() {
		return (EReference)constraintContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintContainer_LatencyConstraints() {
		return (EReference)constraintContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintContainer_JitterConstraints() {
		return (EReference)constraintContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintContainer_LoadConstraints() {
		return (EReference)constraintContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintContainer_AnalysisParameters() {
		return (EReference)constraintContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisParameter() {
		return analysisParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisParameter_Key() {
		return (EAttribute)analysisParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisParameter_Value() {
		return (EAttribute)analysisParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsFactory getConstraintsFactory() {
		return (ConstraintsFactory)getEFactoryInstance();
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
		twcaConstraintEClass = createEClass(TWCA_CONSTRAINT);
		createEAttribute(twcaConstraintEClass, TWCA_CONSTRAINT__NB_CONSECUTIVE_ACTIVATIONS);
		createEAttribute(twcaConstraintEClass, TWCA_CONSTRAINT__NB_MISSED_DEADLINES);
		createEReference(twcaConstraintEClass, TWCA_CONSTRAINT__CONSTRAINED_ELEMENT);

		latencyConstraintEClass = createEClass(LATENCY_CONSTRAINT);

		jitterConstraintEClass = createEClass(JITTER_CONSTRAINT);
		createEReference(jitterConstraintEClass, JITTER_CONSTRAINT__ELEMENTS);

		loadConstraintEClass = createEClass(LOAD_CONSTRAINT);
		createEReference(loadConstraintEClass, LOAD_CONSTRAINT__RESOURCES);

		timingConstraintEClass = createEClass(TIMING_CONSTRAINT);
		createEAttribute(timingConstraintEClass, TIMING_CONSTRAINT__MIN);
		createEAttribute(timingConstraintEClass, TIMING_CONSTRAINT__MAX);
		createEReference(timingConstraintEClass, TIMING_CONSTRAINT__TO);
		createEReference(timingConstraintEClass, TIMING_CONSTRAINT__FROM);
		createEReference(timingConstraintEClass, TIMING_CONSTRAINT__VIA);
		createEAttribute(timingConstraintEClass, TIMING_CONSTRAINT__VALUE);

		constraintContainerEClass = createEClass(CONSTRAINT_CONTAINER);
		createEReference(constraintContainerEClass, CONSTRAINT_CONTAINER__TWCA_CONSTRAINTS);
		createEReference(constraintContainerEClass, CONSTRAINT_CONTAINER__LATENCY_CONSTRAINTS);
		createEReference(constraintContainerEClass, CONSTRAINT_CONTAINER__JITTER_CONSTRAINTS);
		createEReference(constraintContainerEClass, CONSTRAINT_CONTAINER__LOAD_CONSTRAINTS);
		createEReference(constraintContainerEClass, CONSTRAINT_CONTAINER__ANALYSIS_PARAMETERS);

		analysisParameterEClass = createEClass(ANALYSIS_PARAMETER);
		createEAttribute(analysisParameterEClass, ANALYSIS_PARAMETER__KEY);
		createEAttribute(analysisParameterEClass, ANALYSIS_PARAMETER__VALUE);
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
		AnalysisPackage theAnalysisPackage = (AnalysisPackage)EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		latencyConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		jitterConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		constraintContainerEClass.getESuperTypes().add(theAnalysisPackage.getConstraintContainer());

		// Initialize classes, features, and operations; add parameters
		initEClass(twcaConstraintEClass, TwcaConstraint.class, "TwcaConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwcaConstraint_NbConsecutiveActivations(), ecorePackage.getEInt(), "nbConsecutiveActivations", null, 0, 1, TwcaConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwcaConstraint_NbMissedDeadlines(), ecorePackage.getEInt(), "nbMissedDeadlines", null, 0, 1, TwcaConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTwcaConstraint_ConstrainedElement(), ecorePackage.getEObject(), null, "constrainedElement", null, 0, 1, TwcaConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latencyConstraintEClass, LatencyConstraint.class, "LatencyConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jitterConstraintEClass, JitterConstraint.class, "JitterConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJitterConstraint_Elements(), ecorePackage.getEObject(), null, "elements", null, 1, -1, JitterConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadConstraintEClass, LoadConstraint.class, "LoadConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadConstraint_Resources(), ecorePackage.getEObject(), null, "resources", null, 1, -1, LoadConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingConstraintEClass, TimingConstraint.class, "TimingConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimingConstraint_Min(), ecorePackage.getEDouble(), "min", null, 0, 1, TimingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimingConstraint_Max(), ecorePackage.getEDouble(), "max", null, 0, 1, TimingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingConstraint_To(), ecorePackage.getEObject(), null, "to", null, 0, 1, TimingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingConstraint_From(), ecorePackage.getEObject(), null, "from", null, 0, 1, TimingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingConstraint_Via(), ecorePackage.getEObject(), null, "via", null, 0, -1, TimingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimingConstraint_Value(), ecorePackage.getELong(), "value", null, 0, 1, TimingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintContainerEClass, ConstraintContainer.class, "ConstraintContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintContainer_TwcaConstraints(), this.getTwcaConstraint(), null, "twcaConstraints", null, 0, -1, ConstraintContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintContainer_LatencyConstraints(), this.getLatencyConstraint(), null, "latencyConstraints", null, 0, -1, ConstraintContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintContainer_JitterConstraints(), this.getJitterConstraint(), null, "jitterConstraints", null, 0, -1, ConstraintContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintContainer_LoadConstraints(), this.getLoadConstraint(), null, "loadConstraints", null, 0, -1, ConstraintContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintContainer_AnalysisParameters(), this.getAnalysisParameter(), null, "analysisParameters", null, 0, -1, ConstraintContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisParameterEClass, AnalysisParameter.class, "AnalysisParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalysisParameter_Key(), ecorePackage.getEString(), "key", null, 0, 1, AnalysisParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysisParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, AnalysisParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ConstraintsPackageImpl
