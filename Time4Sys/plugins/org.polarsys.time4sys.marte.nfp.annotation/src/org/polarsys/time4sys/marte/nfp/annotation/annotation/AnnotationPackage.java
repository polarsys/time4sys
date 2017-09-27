/**
 */
package org.polarsys.time4sys.marte.nfp.annotation.annotation;

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
 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "annotation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/marte/nfp/annotation/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nfp_annotation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationPackage eINSTANCE = org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotatedElementImpl
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotationPackageImpl#getAnnotatedElement()
	 * @generated
	 */
	int ANNOTATED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT__EANNOTATIONS = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.MODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT__OWNER = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT_FEATURE_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT___GET_EANNOTATION__STRING = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.MODEL_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Annotated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT_OPERATION_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotatedModelImpl <em>Annotated Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotatedModelImpl
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotationPackageImpl#getAnnotatedModel()
	 * @generated
	 */
	int ANNOTATED_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Owns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_MODEL__OWNS = 0;

	/**
	 * The feature id for the '<em><b>Annotation Concern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_MODEL__ANNOTATION_CONCERN = 1;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_MODEL__OWNED_RULE = 2;

	/**
	 * The number of structural features of the '<em>Annotated Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Annotated Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.ModelingConcernImpl <em>Modeling Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.ModelingConcernImpl
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotationPackageImpl#getModelingConcern()
	 * @generated
	 */
	int MODELING_CONCERN = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONCERN__EANNOTATIONS = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGEABLE_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONCERN__NAME = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONCERN__DESCRIPTION = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modeling Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONCERN_FEATURE_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONCERN___GET_EANNOTATION__STRING = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGEABLE_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Modeling Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONCERN_OPERATION_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.ConstraintImpl
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotationPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EANNOTATIONS = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.CONSTRAINT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Constrained Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINED_ELEMENT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONTEXT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__KIND = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___GET_EANNOTATION__STRING = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.CONSTRAINT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.ConstraintKind <em>Constraint Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.ConstraintKind
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotationPackageImpl#getConstraintKind()
	 * @generated
	 */
	int CONSTRAINT_KIND = 4;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Element</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement
	 * @generated
	 */
	EClass getAnnotatedElement();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement#getOwner()
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	EReference getAnnotatedElement_Owner();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel <em>Annotated Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Model</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel
	 * @generated
	 */
	EClass getAnnotatedModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel#getOwns <em>Owns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel#getOwns()
	 * @see #getAnnotatedModel()
	 * @generated
	 */
	EReference getAnnotatedModel_Owns();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel#getAnnotationConcern <em>Annotation Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotation Concern</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel#getAnnotationConcern()
	 * @see #getAnnotatedModel()
	 * @generated
	 */
	EReference getAnnotatedModel_AnnotationConcern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel#getOwnedRule <em>Owned Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Rule</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel#getOwnedRule()
	 * @see #getAnnotatedModel()
	 * @generated
	 */
	EReference getAnnotatedModel_OwnedRule();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.ModelingConcern <em>Modeling Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modeling Concern</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.ModelingConcern
	 * @generated
	 */
	EClass getModelingConcern();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.ModelingConcern#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.ModelingConcern#getDescription()
	 * @see #getModelingConcern()
	 * @generated
	 */
	EAttribute getModelingConcern_Description();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint#getConstrainedElement <em>Constrained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained Element</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint#getConstrainedElement()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ConstrainedElement();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint#getContext()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint#getKind()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Kind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.ConstraintKind <em>Constraint Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Kind</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.ConstraintKind
	 * @generated
	 */
	EEnum getConstraintKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnnotationFactory getAnnotationFactory();

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
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotatedElementImpl
		 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotationPackageImpl#getAnnotatedElement()
		 * @generated
		 */
		EClass ANNOTATED_ELEMENT = eINSTANCE.getAnnotatedElement();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_ELEMENT__OWNER = eINSTANCE.getAnnotatedElement_Owner();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotatedModelImpl <em>Annotated Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotatedModelImpl
		 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotationPackageImpl#getAnnotatedModel()
		 * @generated
		 */
		EClass ANNOTATED_MODEL = eINSTANCE.getAnnotatedModel();

		/**
		 * The meta object literal for the '<em><b>Owns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_MODEL__OWNS = eINSTANCE.getAnnotatedModel_Owns();

		/**
		 * The meta object literal for the '<em><b>Annotation Concern</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_MODEL__ANNOTATION_CONCERN = eINSTANCE.getAnnotatedModel_AnnotationConcern();

		/**
		 * The meta object literal for the '<em><b>Owned Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_MODEL__OWNED_RULE = eINSTANCE.getAnnotatedModel_OwnedRule();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.ModelingConcernImpl <em>Modeling Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.ModelingConcernImpl
		 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotationPackageImpl#getModelingConcern()
		 * @generated
		 */
		EClass MODELING_CONCERN = eINSTANCE.getModelingConcern();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELING_CONCERN__DESCRIPTION = eINSTANCE.getModelingConcern_Description();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.ConstraintImpl
		 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotationPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONSTRAINED_ELEMENT = eINSTANCE.getConstraint_ConstrainedElement();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONTEXT = eINSTANCE.getConstraint_Context();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__KIND = eINSTANCE.getConstraint_Kind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.ConstraintKind <em>Constraint Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.ConstraintKind
		 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotationPackageImpl#getConstraintKind()
		 * @generated
		 */
		EEnum CONSTRAINT_KIND = eINSTANCE.getConstraintKind();

	}

} //AnnotationPackage
