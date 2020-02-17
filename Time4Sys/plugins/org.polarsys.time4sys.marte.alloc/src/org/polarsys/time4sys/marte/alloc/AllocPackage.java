/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.alloc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage;

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
 * @see org.polarsys.time4sys.marte.alloc.AllocFactory
 * @model kind="package"
 * @generated
 */
public interface AllocPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "alloc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/marte/alloc/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "alloc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AllocPackage eINSTANCE = org.polarsys.time4sys.marte.alloc.impl.AllocPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.alloc.impl.AllocateImpl <em>Allocate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.alloc.impl.AllocateImpl
	 * @see org.polarsys.time4sys.marte.alloc.impl.AllocPackageImpl#getAllocate()
	 * @generated
	 */
	int ALLOCATE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__SOURCE = CoreElementsPackage.ABSTRACTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__TARGET = CoreElementsPackage.ABSTRACTION__TARGET;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__EANNOTATIONS = CoreElementsPackage.ABSTRACTION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__NAME = CoreElementsPackage.ABSTRACTION__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__KIND = CoreElementsPackage.ABSTRACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__NATURE = CoreElementsPackage.ABSTRACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implied Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__IMPLIED_CONSTRAINT = CoreElementsPackage.ABSTRACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Allocate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_FEATURE_COUNT = CoreElementsPackage.ABSTRACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE___GET_EANNOTATION__STRING = CoreElementsPackage.ABSTRACTION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Allocate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_OPERATION_COUNT = CoreElementsPackage.ABSTRACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.alloc.AllocationNature <em>Allocation Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.alloc.AllocationNature
	 * @see org.polarsys.time4sys.marte.alloc.impl.AllocPackageImpl#getAllocationNature()
	 * @generated
	 */
	int ALLOCATION_NATURE = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.alloc.AllocationKind <em>Allocation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.alloc.AllocationKind
	 * @see org.polarsys.time4sys.marte.alloc.impl.AllocPackageImpl#getAllocationKind()
	 * @generated
	 */
	int ALLOCATION_KIND = 2;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.alloc.Allocate <em>Allocate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocate</em>'.
	 * @see org.polarsys.time4sys.marte.alloc.Allocate
	 * @generated
	 */
	EClass getAllocate();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.alloc.Allocate#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.time4sys.marte.alloc.Allocate#getKind()
	 * @see #getAllocate()
	 * @generated
	 */
	EAttribute getAllocate_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.alloc.Allocate#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see org.polarsys.time4sys.marte.alloc.Allocate#getNature()
	 * @see #getAllocate()
	 * @generated
	 */
	EAttribute getAllocate_Nature();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.alloc.Allocate#getImpliedConstraint <em>Implied Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implied Constraint</em>'.
	 * @see org.polarsys.time4sys.marte.alloc.Allocate#getImpliedConstraint()
	 * @see #getAllocate()
	 * @generated
	 */
	EReference getAllocate_ImpliedConstraint();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.alloc.AllocationNature <em>Allocation Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allocation Nature</em>'.
	 * @see org.polarsys.time4sys.marte.alloc.AllocationNature
	 * @generated
	 */
	EEnum getAllocationNature();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.alloc.AllocationKind <em>Allocation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allocation Kind</em>'.
	 * @see org.polarsys.time4sys.marte.alloc.AllocationKind
	 * @generated
	 */
	EEnum getAllocationKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AllocFactory getAllocFactory();

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
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.alloc.impl.AllocateImpl <em>Allocate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.alloc.impl.AllocateImpl
		 * @see org.polarsys.time4sys.marte.alloc.impl.AllocPackageImpl#getAllocate()
		 * @generated
		 */
		EClass ALLOCATE = eINSTANCE.getAllocate();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATE__KIND = eINSTANCE.getAllocate_Kind();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATE__NATURE = eINSTANCE.getAllocate_Nature();

		/**
		 * The meta object literal for the '<em><b>Implied Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATE__IMPLIED_CONSTRAINT = eINSTANCE.getAllocate_ImpliedConstraint();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.alloc.AllocationNature <em>Allocation Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.alloc.AllocationNature
		 * @see org.polarsys.time4sys.marte.alloc.impl.AllocPackageImpl#getAllocationNature()
		 * @generated
		 */
		EEnum ALLOCATION_NATURE = eINSTANCE.getAllocationNature();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.alloc.AllocationKind <em>Allocation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.alloc.AllocationKind
		 * @see org.polarsys.time4sys.marte.alloc.impl.AllocPackageImpl#getAllocationKind()
		 * @generated
		 */
		EEnum ALLOCATION_KIND = eINSTANCE.getAllocationKind();

	}

} //AllocPackage
