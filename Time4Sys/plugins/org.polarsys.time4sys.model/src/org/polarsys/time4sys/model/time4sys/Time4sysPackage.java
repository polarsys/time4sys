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
package org.polarsys.time4sys.model.time4sys;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.time4sys.marte.grm.GrmPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.model.time4sys.Time4sysFactory
 * @model kind="package"
 * @generated
 */
public interface Time4sysPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "time4sys";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "time4sys";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Time4sysPackage eINSTANCE = org.polarsys.time4sys.model.time4sys.impl.Time4sysPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.model.time4sys.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.model.time4sys.impl.ProjectImpl
	 * @see org.polarsys.time4sys.model.time4sys.impl.Time4sysPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;


	/**
	 * The feature id for the '<em><b>Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ANALYSIS = 0;

	/**
	 * The feature id for the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESIGN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MAPPINGS = 3;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TRACES = 4;

	/**
	 * The feature id for the '<em><b>Derivations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DERIVATIONS = 5;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Derive Analyzed System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___DERIVE_ANALYZED_SYSTEM__BOOLEAN = 0;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.model.time4sys.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.model.time4sys.Project#getAnalysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Analysis</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Project#getAnalysis()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Analysis();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.model.time4sys.Project#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Design</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Project#getDesign()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Design();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.model.time4sys.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.model.time4sys.Project#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Project#getMappings()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Mappings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.model.time4sys.Project#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traces</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Project#getTraces()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Traces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.model.time4sys.Project#getDerivations <em>Derivations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derivations</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Project#getDerivations()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Derivations();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.model.time4sys.Project#deriveAnalyzedSystem(boolean) <em>Derive Analyzed System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Derive Analyzed System</em>' operation.
	 * @see org.polarsys.time4sys.model.time4sys.Project#deriveAnalyzedSystem(boolean)
	 * @generated
	 */
	EOperation getProject__DeriveAnalyzedSystem__boolean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Time4sysFactory getTime4sysFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.model.time4sys.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.model.time4sys.impl.ProjectImpl
		 * @see org.polarsys.time4sys.model.time4sys.impl.Time4sysPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Analysis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ANALYSIS = eINSTANCE.getProject_Analysis();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DESIGN = eINSTANCE.getProject_Design();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__MAPPINGS = eINSTANCE.getProject_Mappings();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__TRACES = eINSTANCE.getProject_Traces();

		/**
		 * The meta object literal for the '<em><b>Derivations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DERIVATIONS = eINSTANCE.getProject_Derivations();

		/**
		 * The meta object literal for the '<em><b>Derive Analyzed System</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT___DERIVE_ANALYZED_SYSTEM__BOOLEAN = eINSTANCE.getProject__DeriveAnalyzedSystem__boolean();

	}

} //Time4sysPackage
