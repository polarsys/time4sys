/**
 */
package org.polarsys.time4sys.marte.alloc.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.time4sys.marte.alloc.AllocFactory;
import org.polarsys.time4sys.marte.alloc.AllocPackage;
import org.polarsys.time4sys.marte.alloc.Allocate;
import org.polarsys.time4sys.marte.alloc.AllocationKind;
import org.polarsys.time4sys.marte.alloc.AllocationNature;

import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage;

import org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocPackageImpl extends EPackageImpl implements AllocPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allocationNatureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allocationKindEEnum = null;

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
	 * @see org.polarsys.time4sys.marte.alloc.AllocPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AllocPackageImpl() {
		super(eNS_URI, AllocFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AllocPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AllocPackage init() {
		if (isInited) return (AllocPackage)EPackage.Registry.INSTANCE.getEPackage(AllocPackage.eNS_URI);

		// Obtain or create and register package
		AllocPackageImpl theAllocPackage = (AllocPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AllocPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AllocPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AnnotationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAllocPackage.createPackageContents();

		// Initialize created meta-data
		theAllocPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAllocPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AllocPackage.eNS_URI, theAllocPackage);
		return theAllocPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocate() {
		return allocateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllocate_Kind() {
		return (EAttribute)allocateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllocate_Nature() {
		return (EAttribute)allocateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocate_ImpliedConstraint() {
		return (EReference)allocateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllocationNature() {
		return allocationNatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllocationKind() {
		return allocationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocFactory getAllocFactory() {
		return (AllocFactory)getEFactoryInstance();
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
		allocateEClass = createEClass(ALLOCATE);
		createEAttribute(allocateEClass, ALLOCATE__KIND);
		createEAttribute(allocateEClass, ALLOCATE__NATURE);
		createEReference(allocateEClass, ALLOCATE__IMPLIED_CONSTRAINT);

		// Create enums
		allocationNatureEEnum = createEEnum(ALLOCATION_NATURE);
		allocationKindEEnum = createEEnum(ALLOCATION_KIND);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		allocateEClass.getESuperTypes().add(theCoreElementsPackage.getAbstraction());

		// Initialize classes, features, and operations; add parameters
		initEClass(allocateEClass, Allocate.class, "Allocate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllocate_Kind(), this.getAllocationKind(), "kind", "hybrid", 0, 1, Allocate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllocate_Nature(), this.getAllocationNature(), "nature", null, 0, 1, Allocate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocate_ImpliedConstraint(), theAnnotationPackage.getConstraint(), null, "impliedConstraint", null, 0, -1, Allocate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(allocationNatureEEnum, AllocationNature.class, "AllocationNature");
		addEEnumLiteral(allocationNatureEEnum, AllocationNature.SPATIAL_DISTRIBUTION);
		addEEnumLiteral(allocationNatureEEnum, AllocationNature.TIME_SCHEDULING);

		initEEnum(allocationKindEEnum, AllocationKind.class, "AllocationKind");
		addEEnumLiteral(allocationKindEEnum, AllocationKind.STRUCTURAL);
		addEEnumLiteral(allocationKindEEnum, AllocationKind.BEHAVIORAL);
		addEEnumLiteral(allocationKindEEnum, AllocationKind.HYBRID);

		// Create resource
		createResource(eNS_URI);
	}

} //AllocPackageImpl
