/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *      Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.odesign.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.time4sys.odesign.OdesignFactory;
import org.polarsys.time4sys.odesign.OdesignPackage;
import org.polarsys.time4sys.odesign.UtilizationStat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OdesignPackageImpl extends EPackageImpl implements OdesignPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilizationStatEClass = null;

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
	 * @see org.polarsys.time4sys.odesign.OdesignPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OdesignPackageImpl() {
		super(eNS_URI, OdesignFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OdesignPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OdesignPackage init() {
		if (isInited) return (OdesignPackage)EPackage.Registry.INSTANCE.getEPackage(OdesignPackage.eNS_URI);

		// Obtain or create and register package
		OdesignPackageImpl theOdesignPackage = (OdesignPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OdesignPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OdesignPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOdesignPackage.createPackageContents();

		// Initialize created meta-data
		theOdesignPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOdesignPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OdesignPackage.eNS_URI, theOdesignPackage);
		return theOdesignPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilizationStat() {
		return utilizationStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilizationStat_Utilization() {
		return (EAttribute)utilizationStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilizationStat_NotSchedulable() {
		return (EAttribute)utilizationStatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilizationStat_MaybeSchedulable() {
		return (EAttribute)utilizationStatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilizationStat_IsSchedulable() {
		return (EAttribute)utilizationStatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OdesignFactory getOdesignFactory() {
		return (OdesignFactory)getEFactoryInstance();
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
		utilizationStatEClass = createEClass(UTILIZATION_STAT);
		createEAttribute(utilizationStatEClass, UTILIZATION_STAT__UTILIZATION);
		createEAttribute(utilizationStatEClass, UTILIZATION_STAT__NOT_SCHEDULABLE);
		createEAttribute(utilizationStatEClass, UTILIZATION_STAT__MAYBE_SCHEDULABLE);
		createEAttribute(utilizationStatEClass, UTILIZATION_STAT__IS_SCHEDULABLE);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(utilizationStatEClass, UtilizationStat.class, "UtilizationStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUtilizationStat_Utilization(), ecorePackage.getEDouble(), "utilization", null, 1, 1, UtilizationStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilizationStat_NotSchedulable(), ecorePackage.getEBoolean(), "notSchedulable", null, 1, 1, UtilizationStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilizationStat_MaybeSchedulable(), ecorePackage.getEBoolean(), "maybeSchedulable", null, 1, 1, UtilizationStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilizationStat_IsSchedulable(), ecorePackage.getEBoolean(), "isSchedulable", null, 1, 1, UtilizationStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OdesignPackageImpl
