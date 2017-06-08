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
	 * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TRANSFORMATIONS = 6;

	/**
	 * The feature id for the '<em><b>Simulations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SIMULATIONS = 7;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 8;

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
	 * The meta object id for the '{@link org.polarsys.time4sys.model.time4sys.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.model.time4sys.impl.TransformationImpl
	 * @see org.polarsys.time4sys.model.time4sys.impl.Time4sysPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.model.time4sys.impl.SimulationImpl <em>Simulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.model.time4sys.impl.SimulationImpl
	 * @see org.polarsys.time4sys.model.time4sys.impl.Time4sysPackageImpl#getSimulation()
	 * @generated
	 */
	int SIMULATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__TRACE = 2;

	/**
	 * The number of structural features of the '<em>Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Design Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION___GET_DESIGN_MODEL = 0;

	/**
	 * The number of operations of the '<em>Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_OPERATION_COUNT = 1;


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
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.model.time4sys.Project#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformations</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Project#getTransformations()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Transformations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.model.time4sys.Project#getSimulations <em>Simulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simulations</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Project#getSimulations()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Simulations();

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
	 * Returns the meta object for class '{@link org.polarsys.time4sys.model.time4sys.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.model.time4sys.Transformation#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Transformation#getResult()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Result();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.model.time4sys.Transformation#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Transformation#getMapping()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Mapping();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.model.time4sys.Transformation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Transformation#getName()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Name();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.model.time4sys.Simulation <em>Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Simulation
	 * @generated
	 */
	EClass getSimulation();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.model.time4sys.Simulation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Simulation#getName()
	 * @see #getSimulation()
	 * @generated
	 */
	EAttribute getSimulation_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.model.time4sys.Simulation#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Simulation#getMapping()
	 * @see #getSimulation()
	 * @generated
	 */
	EReference getSimulation_Mapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.model.time4sys.Simulation#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trace</em>'.
	 * @see org.polarsys.time4sys.model.time4sys.Simulation#getTrace()
	 * @see #getSimulation()
	 * @generated
	 */
	EReference getSimulation_Trace();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.model.time4sys.Simulation#getDesignModel() <em>Get Design Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Design Model</em>' operation.
	 * @see org.polarsys.time4sys.model.time4sys.Simulation#getDesignModel()
	 * @generated
	 */
	EOperation getSimulation__GetDesignModel();

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
		 * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__TRANSFORMATIONS = eINSTANCE.getProject_Transformations();

		/**
		 * The meta object literal for the '<em><b>Simulations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__SIMULATIONS = eINSTANCE.getProject_Simulations();

		/**
		 * The meta object literal for the '<em><b>Derive Analyzed System</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT___DERIVE_ANALYZED_SYSTEM__BOOLEAN = eINSTANCE.getProject__DeriveAnalyzedSystem__boolean();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.model.time4sys.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.model.time4sys.impl.TransformationImpl
		 * @see org.polarsys.time4sys.model.time4sys.impl.Time4sysPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__RESULT = eINSTANCE.getTransformation_Result();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__MAPPING = eINSTANCE.getTransformation_Mapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NAME = eINSTANCE.getTransformation_Name();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.model.time4sys.impl.SimulationImpl <em>Simulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.model.time4sys.impl.SimulationImpl
		 * @see org.polarsys.time4sys.model.time4sys.impl.Time4sysPackageImpl#getSimulation()
		 * @generated
		 */
		EClass SIMULATION = eINSTANCE.getSimulation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION__NAME = eINSTANCE.getSimulation_Name();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION__MAPPING = eINSTANCE.getSimulation_Mapping();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION__TRACE = eINSTANCE.getSimulation_Trace();

		/**
		 * The meta object literal for the '<em><b>Get Design Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMULATION___GET_DESIGN_MODEL = eINSTANCE.getSimulation__GetDesignModel();

	}

} //Time4sysPackage
