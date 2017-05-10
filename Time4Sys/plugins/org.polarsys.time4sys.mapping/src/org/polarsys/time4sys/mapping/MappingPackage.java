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
package org.polarsys.time4sys.mapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.polarsys.time4sys.mapping.MappingFactory
 * @model kind="package"
 * @generated
 */
public interface MappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/mapping/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingPackage eINSTANCE = org.polarsys.time4sys.mapping.impl.MappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.mapping.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.mapping.impl.LinkImpl
	 * @see org.polarsys.time4sys.mapping.impl.MappingPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 0;

	/**
	 * The feature id for the '<em><b>Sub Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SUB_LINKS = 0;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__RATIONALE = 1;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCES = 2;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGETS = 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Unique Source Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___GET_UNIQUE_SOURCE_VALUE__STRING = 0;

	/**
	 * The operation id for the '<em>Get Unique Target Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___GET_UNIQUE_TARGET_VALUE__STRING = 1;

	/**
	 * The operation id for the '<em>Get Sources</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___GET_SOURCES__STRING = 2;

	/**
	 * The operation id for the '<em>Get Targets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___GET_TARGETS__STRING = 3;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.mapping.impl.MappableArtefactImpl <em>Mappable Artefact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.mapping.impl.MappableArtefactImpl
	 * @see org.polarsys.time4sys.mapping.impl.MappingPackageImpl#getMappableArtefact()
	 * @generated
	 */
	int MAPPABLE_ARTEFACT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPABLE_ARTEFACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPABLE_ARTEFACT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Mappable Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPABLE_ARTEFACT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mappable Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPABLE_ARTEFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.mapping.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.mapping.impl.MappingImpl
	 * @see org.polarsys.time4sys.mapping.impl.MappingPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Sub Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__SUB_LINKS = LINK__SUB_LINKS;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__RATIONALE = LINK__RATIONALE;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__SOURCES = LINK__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TARGETS = LINK__TARGETS;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__RULES = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Unique Source Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___GET_UNIQUE_SOURCE_VALUE__STRING = LINK___GET_UNIQUE_SOURCE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Unique Target Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___GET_UNIQUE_TARGET_VALUE__STRING = LINK___GET_UNIQUE_TARGET_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Sources</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___GET_SOURCES__STRING = LINK___GET_SOURCES__STRING;

	/**
	 * The operation id for the '<em>Get Targets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___GET_TARGETS__STRING = LINK___GET_TARGETS__STRING;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.mapping.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.mapping.impl.ContextImpl
	 * @see org.polarsys.time4sys.mapping.impl.MappingPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sub Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__SUB_RULES = 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.mapping.impl.ResourceArtefactImpl <em>Resource Artefact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.mapping.impl.ResourceArtefactImpl
	 * @see org.polarsys.time4sys.mapping.impl.MappingPackageImpl#getResourceArtefact()
	 * @generated
	 */
	int RESOURCE_ARTEFACT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARTEFACT__NAME = MAPPABLE_ARTEFACT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARTEFACT__VALUE = MAPPABLE_ARTEFACT__VALUE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARTEFACT__RESOURCE = MAPPABLE_ARTEFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARTEFACT__URI = MAPPABLE_ARTEFACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARTEFACT_FEATURE_COUNT = MAPPABLE_ARTEFACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resource Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARTEFACT_OPERATION_COUNT = MAPPABLE_ARTEFACT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.URI
	 * @see org.polarsys.time4sys.mapping.impl.MappingPackageImpl#getURI()
	 * @generated
	 */
	int URI = 5;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.mapping.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.polarsys.time4sys.mapping.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.mapping.Link#getSubLinks <em>Sub Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Links</em>'.
	 * @see org.polarsys.time4sys.mapping.Link#getSubLinks()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_SubLinks();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.mapping.Link#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rationale</em>'.
	 * @see org.polarsys.time4sys.mapping.Link#getRationale()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Rationale();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.mapping.Link#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see org.polarsys.time4sys.mapping.Link#getSources()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.mapping.Link#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see org.polarsys.time4sys.mapping.Link#getTargets()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Targets();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.mapping.Link#getUniqueSourceValue(java.lang.String) <em>Get Unique Source Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unique Source Value</em>' operation.
	 * @see org.polarsys.time4sys.mapping.Link#getUniqueSourceValue(java.lang.String)
	 * @generated
	 */
	EOperation getLink__GetUniqueSourceValue__String();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.mapping.Link#getUniqueTargetValue(java.lang.String) <em>Get Unique Target Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unique Target Value</em>' operation.
	 * @see org.polarsys.time4sys.mapping.Link#getUniqueTargetValue(java.lang.String)
	 * @generated
	 */
	EOperation getLink__GetUniqueTargetValue__String();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.mapping.Link#getSources(java.lang.String) <em>Get Sources</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sources</em>' operation.
	 * @see org.polarsys.time4sys.mapping.Link#getSources(java.lang.String)
	 * @generated
	 */
	EOperation getLink__GetSources__String();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.mapping.Link#getTargets(java.lang.String) <em>Get Targets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Targets</em>' operation.
	 * @see org.polarsys.time4sys.mapping.Link#getTargets(java.lang.String)
	 * @generated
	 */
	EOperation getLink__GetTargets__String();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.mapping.MappableArtefact <em>Mappable Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mappable Artefact</em>'.
	 * @see org.polarsys.time4sys.mapping.MappableArtefact
	 * @generated
	 */
	EClass getMappableArtefact();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.mapping.MappableArtefact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.time4sys.mapping.MappableArtefact#getName()
	 * @see #getMappableArtefact()
	 * @generated
	 */
	EAttribute getMappableArtefact_Name();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.mapping.MappableArtefact#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.polarsys.time4sys.mapping.MappableArtefact#getValue()
	 * @see #getMappableArtefact()
	 * @generated
	 */
	EReference getMappableArtefact_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.mapping.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see org.polarsys.time4sys.mapping.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.mapping.Mapping#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.polarsys.time4sys.mapping.Mapping#getRules()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Rules();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.mapping.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.polarsys.time4sys.mapping.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.mapping.Context#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.time4sys.mapping.Context#getName()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.mapping.Context#getSubRules <em>Sub Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Rules</em>'.
	 * @see org.polarsys.time4sys.mapping.Context#getSubRules()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_SubRules();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.mapping.ResourceArtefact <em>Resource Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Artefact</em>'.
	 * @see org.polarsys.time4sys.mapping.ResourceArtefact
	 * @generated
	 */
	EClass getResourceArtefact();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.mapping.ResourceArtefact#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.polarsys.time4sys.mapping.ResourceArtefact#getResource()
	 * @see #getResourceArtefact()
	 * @generated
	 */
	EAttribute getResourceArtefact_Resource();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.mapping.ResourceArtefact#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.polarsys.time4sys.mapping.ResourceArtefact#getUri()
	 * @see #getResourceArtefact()
	 * @generated
	 */
	EAttribute getResourceArtefact_Uri();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MappingFactory getMappingFactory();

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
		 * The meta object literal for the '{@link org.polarsys.time4sys.mapping.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.mapping.impl.LinkImpl
		 * @see org.polarsys.time4sys.mapping.impl.MappingPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Sub Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SUB_LINKS = eINSTANCE.getLink_SubLinks();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__RATIONALE = eINSTANCE.getLink_Rationale();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCES = eINSTANCE.getLink_Sources();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGETS = eINSTANCE.getLink_Targets();

		/**
		 * The meta object literal for the '<em><b>Get Unique Source Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINK___GET_UNIQUE_SOURCE_VALUE__STRING = eINSTANCE.getLink__GetUniqueSourceValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Unique Target Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINK___GET_UNIQUE_TARGET_VALUE__STRING = eINSTANCE.getLink__GetUniqueTargetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Sources</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINK___GET_SOURCES__STRING = eINSTANCE.getLink__GetSources__String();

		/**
		 * The meta object literal for the '<em><b>Get Targets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINK___GET_TARGETS__STRING = eINSTANCE.getLink__GetTargets__String();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.mapping.impl.MappableArtefactImpl <em>Mappable Artefact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.mapping.impl.MappableArtefactImpl
		 * @see org.polarsys.time4sys.mapping.impl.MappingPackageImpl#getMappableArtefact()
		 * @generated
		 */
		EClass MAPPABLE_ARTEFACT = eINSTANCE.getMappableArtefact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPABLE_ARTEFACT__NAME = eINSTANCE.getMappableArtefact_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPABLE_ARTEFACT__VALUE = eINSTANCE.getMappableArtefact_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.mapping.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.mapping.impl.MappingImpl
		 * @see org.polarsys.time4sys.mapping.impl.MappingPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__RULES = eINSTANCE.getMapping_Rules();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.mapping.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.mapping.impl.ContextImpl
		 * @see org.polarsys.time4sys.mapping.impl.MappingPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__NAME = eINSTANCE.getContext_Name();

		/**
		 * The meta object literal for the '<em><b>Sub Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__SUB_RULES = eINSTANCE.getContext_SubRules();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.mapping.impl.ResourceArtefactImpl <em>Resource Artefact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.mapping.impl.ResourceArtefactImpl
		 * @see org.polarsys.time4sys.mapping.impl.MappingPackageImpl#getResourceArtefact()
		 * @generated
		 */
		EClass RESOURCE_ARTEFACT = eINSTANCE.getResourceArtefact();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ARTEFACT__RESOURCE = eINSTANCE.getResourceArtefact_Resource();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ARTEFACT__URI = eINSTANCE.getResourceArtefact_Uri();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.URI
		 * @see org.polarsys.time4sys.mapping.impl.MappingPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

	}

} //MappingPackage
