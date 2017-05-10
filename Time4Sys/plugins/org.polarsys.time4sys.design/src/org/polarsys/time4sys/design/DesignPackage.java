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
package org.polarsys.time4sys.design;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.polarsys.time4sys.design.DesignFactory
 * @model kind="package"
 * @generated
 */
public interface DesignPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "design";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/design/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "design";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DesignPackage eINSTANCE = org.polarsys.time4sys.design.impl.DesignPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.design.impl.DesignModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.design.impl.DesignModelImpl
	 * @see org.polarsys.time4sys.design.impl.DesignPackageImpl#getDesignModel()
	 * @generated
	 */
	int DESIGN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Workload Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_MODEL__WORKLOAD_BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Resource Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_MODEL__RESOURCE_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>End To End Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_MODEL__END_TO_END_FLOWS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_MODEL__NAME = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.design.DesignModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.polarsys.time4sys.design.DesignModel
	 * @generated
	 */
	EClass getDesignModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.design.DesignModel#getWorkloadBehavior <em>Workload Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workload Behavior</em>'.
	 * @see org.polarsys.time4sys.design.DesignModel#getWorkloadBehavior()
	 * @see #getDesignModel()
	 * @generated
	 */
	EReference getDesignModel_WorkloadBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.design.DesignModel#getResourcePackage <em>Resource Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Package</em>'.
	 * @see org.polarsys.time4sys.design.DesignModel#getResourcePackage()
	 * @see #getDesignModel()
	 * @generated
	 */
	EReference getDesignModel_ResourcePackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.design.DesignModel#getEndToEndFlows <em>End To End Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End To End Flows</em>'.
	 * @see org.polarsys.time4sys.design.DesignModel#getEndToEndFlows()
	 * @see #getDesignModel()
	 * @generated
	 */
	EReference getDesignModel_EndToEndFlows();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.design.DesignModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.time4sys.design.DesignModel#getName()
	 * @see #getDesignModel()
	 * @generated
	 */
	EAttribute getDesignModel_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DesignFactory getDesignFactory();

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
		 * The meta object literal for the '{@link org.polarsys.time4sys.design.impl.DesignModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.design.impl.DesignModelImpl
		 * @see org.polarsys.time4sys.design.impl.DesignPackageImpl#getDesignModel()
		 * @generated
		 */
		EClass DESIGN_MODEL = eINSTANCE.getDesignModel();

		/**
		 * The meta object literal for the '<em><b>Workload Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_MODEL__WORKLOAD_BEHAVIOR = eINSTANCE.getDesignModel_WorkloadBehavior();

		/**
		 * The meta object literal for the '<em><b>Resource Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_MODEL__RESOURCE_PACKAGE = eINSTANCE.getDesignModel_ResourcePackage();

		/**
		 * The meta object literal for the '<em><b>End To End Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_MODEL__END_TO_END_FLOWS = eINSTANCE.getDesignModel_EndToEndFlows();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_MODEL__NAME = eINSTANCE.getDesignModel_Name();

	}

} //DesignPackage
