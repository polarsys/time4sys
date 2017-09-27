/**
 */
package org.polarsys.time4sys.marte.alloc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.alloc.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.alloc.impl.DirectedRelationshipImpl
	 * @see org.polarsys.time4sys.marte.alloc.impl.AllocPackageImpl#getDirectedRelationship()
	 * @generated
	 */
	int DIRECTED_RELATIONSHIP = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Directed Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Directed Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.alloc.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.alloc.impl.DependencyImpl
	 * @see org.polarsys.time4sys.marte.alloc.impl.AllocPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TARGET = DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.alloc.impl.AbstractionImpl <em>Abstraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.alloc.impl.AbstractionImpl
	 * @see org.polarsys.time4sys.marte.alloc.impl.AllocPackageImpl#getAbstraction()
	 * @generated
	 */
	int ABSTRACTION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__TARGET = DEPENDENCY__TARGET;

	/**
	 * The number of structural features of the '<em>Abstraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.alloc.impl.AllocateImpl <em>Allocate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.alloc.impl.AllocateImpl
	 * @see org.polarsys.time4sys.marte.alloc.impl.AllocPackageImpl#getAllocate()
	 * @generated
	 */
	int ALLOCATE = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__SOURCE = ABSTRACTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__TARGET = ABSTRACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__KIND = ABSTRACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE__NATURE = ABSTRACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Allocate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_FEATURE_COUNT = ABSTRACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Allocate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_OPERATION_COUNT = ABSTRACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.alloc.AllocationNature <em>Allocation Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.alloc.AllocationNature
	 * @see org.polarsys.time4sys.marte.alloc.impl.AllocPackageImpl#getAllocationNature()
	 * @generated
	 */
	int ALLOCATION_NATURE = 4;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.alloc.AllocationKind <em>Allocation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.alloc.AllocationKind
	 * @see org.polarsys.time4sys.marte.alloc.impl.AllocPackageImpl#getAllocationKind()
	 * @generated
	 */
	int ALLOCATION_KIND = 5;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.alloc.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Relationship</em>'.
	 * @see org.polarsys.time4sys.marte.alloc.DirectedRelationship
	 * @generated
	 */
	EClass getDirectedRelationship();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.alloc.DirectedRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see org.polarsys.time4sys.marte.alloc.DirectedRelationship#getSource()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.alloc.DirectedRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.polarsys.time4sys.marte.alloc.DirectedRelationship#getTarget()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_Target();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.alloc.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see org.polarsys.time4sys.marte.alloc.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.alloc.Abstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstraction</em>'.
	 * @see org.polarsys.time4sys.marte.alloc.Abstraction
	 * @generated
	 */
	EClass getAbstraction();

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
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.alloc.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.alloc.impl.DirectedRelationshipImpl
		 * @see org.polarsys.time4sys.marte.alloc.impl.AllocPackageImpl#getDirectedRelationship()
		 * @generated
		 */
		EClass DIRECTED_RELATIONSHIP = eINSTANCE.getDirectedRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP__SOURCE = eINSTANCE.getDirectedRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP__TARGET = eINSTANCE.getDirectedRelationship_Target();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.alloc.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.alloc.impl.DependencyImpl
		 * @see org.polarsys.time4sys.marte.alloc.impl.AllocPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.alloc.impl.AbstractionImpl <em>Abstraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.alloc.impl.AbstractionImpl
		 * @see org.polarsys.time4sys.marte.alloc.impl.AllocPackageImpl#getAbstraction()
		 * @generated
		 */
		EClass ABSTRACTION = eINSTANCE.getAbstraction();

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
