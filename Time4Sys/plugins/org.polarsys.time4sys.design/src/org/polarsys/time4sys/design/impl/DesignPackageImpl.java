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
package org.polarsys.time4sys.design.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.design.DesignPackage;
import org.polarsys.time4sys.marte.alloc.AllocPackage;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage;
import org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage;
import org.polarsys.time4sys.marte.sam.SamPackage;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DesignPackageImpl extends EPackageImpl implements DesignPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designModelEClass = null;

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
	 * @see org.polarsys.time4sys.design.DesignPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DesignPackageImpl() {
		super(eNS_URI, DesignFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DesignPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DesignPackage init() {
		if (isInited) return (DesignPackage)EPackage.Registry.INSTANCE.getEPackage(DesignPackage.eNS_URI);

		// Obtain or create and register package
		DesignPackageImpl theDesignPackage = (DesignPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DesignPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DesignPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SrmPackage.eINSTANCE.eClass();
		HrmPackage.eINSTANCE.eClass();
		AllocPackage.eINSTANCE.eClass();
		SamPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDesignPackage.createPackageContents();

		// Initialize created meta-data
		theDesignPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDesignPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DesignPackage.eNS_URI, theDesignPackage);
		return theDesignPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignModel() {
		return designModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignModel_WorkloadBehavior() {
		return (EReference)designModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignModel_ResourcePackage() {
		return (EReference)designModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignModel_EndToEndFlows() {
		return (EReference)designModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignFactory getDesignFactory() {
		return (DesignFactory)getEFactoryInstance();
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
		designModelEClass = createEClass(DESIGN_MODEL);
		createEReference(designModelEClass, DESIGN_MODEL__WORKLOAD_BEHAVIOR);
		createEReference(designModelEClass, DESIGN_MODEL__RESOURCE_PACKAGE);
		createEReference(designModelEClass, DESIGN_MODEL__END_TO_END_FLOWS);
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
		GrmPackage theGrmPackage = (GrmPackage)EPackage.Registry.INSTANCE.getEPackage(GrmPackage.eNS_URI);
		SamPackage theSamPackage = (SamPackage)EPackage.Registry.INSTANCE.getEPackage(SamPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		designModelEClass.getESuperTypes().add(theCoreElementsPackage.getPackage());
		designModelEClass.getESuperTypes().add(theAnnotationPackage.getAnnotatedModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(designModelEClass, DesignModel.class, "DesignModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesignModel_WorkloadBehavior(), theGqamPackage.getWorkloadBehavior(), null, "workloadBehavior", null, 0, 1, DesignModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignModel_ResourcePackage(), theGrmPackage.getResourcePackage(), null, "resourcePackage", null, 0, 1, DesignModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignModel_EndToEndFlows(), theSamPackage.getEndToEndFlow(), null, "endToEndFlows", null, 0, -1, DesignModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DesignPackageImpl
