/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Yassine OUHAMMOU- initial API and implementation
 *
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco;

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
 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface TyscoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tysco";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.polarsys.time4sys.marte.analysisrepository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tysco";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TyscoPackage eINSTANCE = org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.AnalysisRepositoryImpl <em>Analysis Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.AnalysisRepositoryImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getAnalysisRepository()
	 * @generated
	 */
	int ANALYSIS_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>All Context Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS = 2;

	/**
	 * The feature id for the '<em><b>All Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY__ALL_RULES = 3;

	/**
	 * The feature id for the '<em><b>All Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY__ALL_TESTS = 4;

	/**
	 * The feature id for the '<em><b>All Inner Transfos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY__ALL_INNER_TRANSFOS = 5;

	/**
	 * The number of structural features of the '<em>Analysis Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Analysis Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ContextModelImpl <em>Context Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ContextModelImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getContextModel()
	 * @generated
	 */
	int CONTEXT_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__REFERENCES = 3;

	/**
	 * The feature id for the '<em><b>Refined Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__REFINED_CONTEXTS = 4;

	/**
	 * The feature id for the '<em><b>Analysis Tests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__ANALYSIS_TESTS = 5;

	/**
	 * The feature id for the '<em><b>Root Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__ROOT_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Truth Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__TRUTH_VALUES = 7;

	/**
	 * The feature id for the '<em><b>Rule Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__RULE_GROUPS = 8;

	/**
	 * The number of structural features of the '<em>Context Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Context Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__REFERENCES = 3;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__CHARACTERISTICS = 4;

	/**
	 * The feature id for the '<em><b>Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__IMPLEMENTATIONS = 5;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.IdentificationRuleImpl <em>Identification Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.IdentificationRuleImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getIdentificationRule()
	 * @generated
	 */
	int IDENTIFICATION_RULE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE__CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Required Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE__REQUIRED_RULES = 3;

	/**
	 * The feature id for the '<em><b>Equivalent Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE__EQUIVALENT_RULES = 4;

	/**
	 * The feature id for the '<em><b>Conflictual Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE__CONFLICTUAL_RULES = 5;

	/**
	 * The feature id for the '<em><b>Formal Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE__FORMAL_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Applied Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE__APPLIED_CLASS = 7;

	/**
	 * The feature id for the '<em><b>One Or All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE__ONE_OR_ALL = 8;

	/**
	 * The number of structural features of the '<em>Identification Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Identification Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestImplementationImpl <em>Test Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestImplementationImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getTestImplementation()
	 * @generated
	 */
	int TEST_IMPLEMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IMPLEMENTATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IMPLEMENTATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IMPLEMENTATION__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IMPLEMENTATION__TRANSFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Analysis Exec Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IMPLEMENTATION__ANALYSIS_EXEC_PATH = 4;

	/**
	 * The feature id for the '<em><b>Tool Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IMPLEMENTATION__TOOL_NAME = 5;

	/**
	 * The feature id for the '<em><b>Tested File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IMPLEMENTATION__TESTED_FILE = 6;

	/**
	 * The feature id for the '<em><b>Test Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IMPLEMENTATION__TEST_RESULT = 7;

	/**
	 * The number of structural features of the '<em>Test Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IMPLEMENTATION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Test Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestCharacteristicTypeImpl <em>Test Characteristic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestCharacteristicTypeImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getTestCharacteristicType()
	 * @generated
	 */
	int TEST_CHARACTERISTIC_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CHARACTERISTIC_TYPE__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Referenced Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CHARACTERISTIC_TYPE__REFERENCED_CONTEXTS = 1;

	/**
	 * The number of structural features of the '<em>Test Characteristic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CHARACTERISTIC_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Test Characteristic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CHARACTERISTIC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.SustainabilityTypeImpl <em>Sustainability Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.SustainabilityTypeImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getSustainabilityType()
	 * @generated
	 */
	int SUSTAINABILITY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSTAINABILITY_TYPE__COMMENT = TEST_CHARACTERISTIC_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Referenced Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSTAINABILITY_TYPE__REFERENCED_CONTEXTS = TEST_CHARACTERISTIC_TYPE__REFERENCED_CONTEXTS;

	/**
	 * The number of structural features of the '<em>Sustainability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSTAINABILITY_TYPE_FEATURE_COUNT = TEST_CHARACTERISTIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sustainability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSTAINABILITY_TYPE_OPERATION_COUNT = TEST_CHARACTERISTIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.Deadline_SustainabilityImpl <em>Deadline Sustainability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.Deadline_SustainabilityImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getDeadline_Sustainability()
	 * @generated
	 */
	int DEADLINE_SUSTAINABILITY = 7;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_SUSTAINABILITY__COMMENT = SUSTAINABILITY_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Referenced Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_SUSTAINABILITY__REFERENCED_CONTEXTS = SUSTAINABILITY_TYPE__REFERENCED_CONTEXTS;

	/**
	 * The number of structural features of the '<em>Deadline Sustainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_SUSTAINABILITY_FEATURE_COUNT = SUSTAINABILITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deadline Sustainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_SUSTAINABILITY_OPERATION_COUNT = SUSTAINABILITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.Jitter_SustainabilityImpl <em>Jitter Sustainability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.Jitter_SustainabilityImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getJitter_Sustainability()
	 * @generated
	 */
	int JITTER_SUSTAINABILITY = 8;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_SUSTAINABILITY__COMMENT = SUSTAINABILITY_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Referenced Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_SUSTAINABILITY__REFERENCED_CONTEXTS = SUSTAINABILITY_TYPE__REFERENCED_CONTEXTS;

	/**
	 * The number of structural features of the '<em>Jitter Sustainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_SUSTAINABILITY_FEATURE_COUNT = SUSTAINABILITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Jitter Sustainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_SUSTAINABILITY_OPERATION_COUNT = SUSTAINABILITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.Period_SustainabilityImpl <em>Period Sustainability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.Period_SustainabilityImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getPeriod_Sustainability()
	 * @generated
	 */
	int PERIOD_SUSTAINABILITY = 9;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_SUSTAINABILITY__COMMENT = SUSTAINABILITY_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Referenced Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_SUSTAINABILITY__REFERENCED_CONTEXTS = SUSTAINABILITY_TYPE__REFERENCED_CONTEXTS;

	/**
	 * The number of structural features of the '<em>Period Sustainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_SUSTAINABILITY_FEATURE_COUNT = SUSTAINABILITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Period Sustainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_SUSTAINABILITY_OPERATION_COUNT = SUSTAINABILITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ExecutionTime_SustainabilityImpl <em>Execution Time Sustainability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ExecutionTime_SustainabilityImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getExecutionTime_Sustainability()
	 * @generated
	 */
	int EXECUTION_TIME_SUSTAINABILITY = 10;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_SUSTAINABILITY__COMMENT = SUSTAINABILITY_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Referenced Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_SUSTAINABILITY__REFERENCED_CONTEXTS = SUSTAINABILITY_TYPE__REFERENCED_CONTEXTS;

	/**
	 * The number of structural features of the '<em>Execution Time Sustainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_SUSTAINABILITY_FEATURE_COUNT = SUSTAINABILITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution Time Sustainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_SUSTAINABILITY_OPERATION_COUNT = SUSTAINABILITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.FeasibilityTypeImpl <em>Feasibility Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.FeasibilityTypeImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getFeasibilityType()
	 * @generated
	 */
	int FEASIBILITY_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEASIBILITY_TYPE__COMMENT = TEST_CHARACTERISTIC_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Referenced Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEASIBILITY_TYPE__REFERENCED_CONTEXTS = TEST_CHARACTERISTIC_TYPE__REFERENCED_CONTEXTS;

	/**
	 * The number of structural features of the '<em>Feasibility Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEASIBILITY_TYPE_FEATURE_COUNT = TEST_CHARACTERISTIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feasibility Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEASIBILITY_TYPE_OPERATION_COUNT = TEST_CHARACTERISTIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.SufficientConditionImpl <em>Sufficient Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.SufficientConditionImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getSufficientCondition()
	 * @generated
	 */
	int SUFFICIENT_CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFICIENT_CONDITION__COMMENT = FEASIBILITY_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Referenced Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFICIENT_CONDITION__REFERENCED_CONTEXTS = FEASIBILITY_TYPE__REFERENCED_CONTEXTS;

	/**
	 * The number of structural features of the '<em>Sufficient Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFICIENT_CONDITION_FEATURE_COUNT = FEASIBILITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sufficient Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFICIENT_CONDITION_OPERATION_COUNT = FEASIBILITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.NecessaryConditionImpl <em>Necessary Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.NecessaryConditionImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getNecessaryCondition()
	 * @generated
	 */
	int NECESSARY_CONDITION = 13;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECESSARY_CONDITION__COMMENT = FEASIBILITY_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Referenced Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECESSARY_CONDITION__REFERENCED_CONTEXTS = FEASIBILITY_TYPE__REFERENCED_CONTEXTS;

	/**
	 * The number of structural features of the '<em>Necessary Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECESSARY_CONDITION_FEATURE_COUNT = FEASIBILITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Necessary Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECESSARY_CONDITION_OPERATION_COUNT = FEASIBILITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TransformationImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 14;

	/**
	 * The feature id for the '<em><b>Context Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__CONTEXT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__ID = 1;

	/**
	 * The feature id for the '<em><b>Test Implementation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TEST_IMPLEMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Transfo Exec Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TRANSFO_EXEC_PATH = 4;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.RuleGroupImpl <em>Rule Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.RuleGroupImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getRuleGroup()
	 * @generated
	 */
	int RULE_GROUP = 15;

	/**
	 * The feature id for the '<em><b>Sub Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_GROUP__SUB_GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Expected Rule Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_GROUP__EXPECTED_RULE_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_GROUP__ID = 2;

	/**
	 * The feature id for the '<em><b>Junction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_GROUP__JUNCTION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_GROUP__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Contextmodel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_GROUP__CONTEXTMODEL = 5;

	/**
	 * The number of structural features of the '<em>Rule Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_GROUP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Rule Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ExpectedEvaluationValueImpl <em>Expected Evaluation Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ExpectedEvaluationValueImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getExpectedEvaluationValue()
	 * @generated
	 */
	int EXPECTED_EVALUATION_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_EVALUATION_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Associated Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_EVALUATION_VALUE__ASSOCIATED_RULE = 1;

	/**
	 * The number of structural features of the '<em>Expected Evaluation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_EVALUATION_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Expected Evaluation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_EVALUATION_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.InnerTransformationImpl <em>Inner Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.InnerTransformationImpl
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getInnerTransformation()
	 * @generated
	 */
	int INNER_TRANSFORMATION = 17;

	/**
	 * The feature id for the '<em><b>Required Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_TRANSFORMATION__REQUIRED_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_TRANSFORMATION__ID = 1;

	/**
	 * The feature id for the '<em><b>Turn True</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_TRANSFORMATION__TURN_TRUE = 2;

	/**
	 * The feature id for the '<em><b>Turn False</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_TRANSFORMATION__TURN_FALSE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_TRANSFORMATION__NAME = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_TRANSFORMATION__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_TRANSFORMATION__CLASS_PATH = 6;

	/**
	 * The number of structural features of the '<em>Inner Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_TRANSFORMATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Inner Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_TRANSFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.EvaluationResultType <em>Evaluation Result Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.EvaluationResultType
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getEvaluationResultType()
	 * @generated
	 */
	int EVALUATION_RESULT_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.JunctionType <em>Junction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.JunctionType
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getJunctionType()
	 * @generated
	 */
	int JUNCTION_TYPE = 19;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TruthType <em>Truth Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TruthType
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getTruthType()
	 * @generated
	 */
	int TRUTH_TYPE = 20;


	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AllOrOne <em>All Or One</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.AllOrOne
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getAllOrOne()
	 * @generated
	 */
	int ALL_OR_ONE = 21;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository <em>Analysis Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Repository</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository
	 * @generated
	 */
	EClass getAnalysisRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getName()
	 * @see #getAnalysisRepository()
	 * @generated
	 */
	EAttribute getAnalysisRepository_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getDescription()
	 * @see #getAnalysisRepository()
	 * @generated
	 */
	EAttribute getAnalysisRepository_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getAllContextModels <em>All Context Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Context Models</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getAllContextModels()
	 * @see #getAnalysisRepository()
	 * @generated
	 */
	EReference getAnalysisRepository_AllContextModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getAllRules <em>All Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Rules</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getAllRules()
	 * @see #getAnalysisRepository()
	 * @generated
	 */
	EReference getAnalysisRepository_AllRules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getAllTests <em>All Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Tests</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getAllTests()
	 * @see #getAnalysisRepository()
	 * @generated
	 */
	EReference getAnalysisRepository_AllTests();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getAllInnerTransfos <em>All Inner Transfos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Inner Transfos</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getAllInnerTransfos()
	 * @see #getAnalysisRepository()
	 * @generated
	 */
	EReference getAnalysisRepository_AllInnerTransfos();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Model</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel
	 * @generated
	 */
	EClass getContextModel();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getId()
	 * @see #getContextModel()
	 * @generated
	 */
	EAttribute getContextModel_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getName()
	 * @see #getContextModel()
	 * @generated
	 */
	EAttribute getContextModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getDescription()
	 * @see #getContextModel()
	 * @generated
	 */
	EAttribute getContextModel_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>References</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getReferences()
	 * @see #getContextModel()
	 * @generated
	 */
	EAttribute getContextModel_References();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getRefinedContexts <em>Refined Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refined Contexts</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getRefinedContexts()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_RefinedContexts();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getAnalysisTests <em>Analysis Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Analysis Tests</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getAnalysisTests()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_AnalysisTests();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getRuleGroups <em>Rule Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Groups</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getRuleGroups()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_RuleGroups();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getRootGroup <em>Root Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Group</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getRootGroup()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_RootGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getTruthValues <em>Truth Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Truth Values</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getTruthValues()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_TruthValues();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getId()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getName()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>References</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getReferences()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_References();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getDescription()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getCharacteristics <em>Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristics</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getCharacteristics()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Characteristics();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getImplementations <em>Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementations</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getImplementations()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Implementations();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule <em>Identification Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identification Rule</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule
	 * @generated
	 */
	EClass getIdentificationRule();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getId()
	 * @see #getIdentificationRule()
	 * @generated
	 */
	EAttribute getIdentificationRule_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getDescription()
	 * @see #getIdentificationRule()
	 * @generated
	 */
	EAttribute getIdentificationRule_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getContent()
	 * @see #getIdentificationRule()
	 * @generated
	 */
	EAttribute getIdentificationRule_Content();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getRequiredRules <em>Required Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Rules</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getRequiredRules()
	 * @see #getIdentificationRule()
	 * @generated
	 */
	EReference getIdentificationRule_RequiredRules();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getEquivalentRules <em>Equivalent Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent Rules</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getEquivalentRules()
	 * @see #getIdentificationRule()
	 * @generated
	 */
	EReference getIdentificationRule_EquivalentRules();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getConflictualRules <em>Conflictual Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conflictual Rules</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getConflictualRules()
	 * @see #getIdentificationRule()
	 * @generated
	 */
	EReference getIdentificationRule_ConflictualRules();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getFormalExpression <em>Formal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Expression</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getFormalExpression()
	 * @see #getIdentificationRule()
	 * @generated
	 */
	EAttribute getIdentificationRule_FormalExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getAppliedClass <em>Applied Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applied Class</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getAppliedClass()
	 * @see #getIdentificationRule()
	 * @generated
	 */
	EAttribute getIdentificationRule_AppliedClass();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getOneOrAll <em>One Or All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>One Or All</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getOneOrAll()
	 * @see #getIdentificationRule()
	 * @generated
	 */
	EAttribute getIdentificationRule_OneOrAll();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation <em>Test Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Implementation</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation
	 * @generated
	 */
	EClass getTestImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getId()
	 * @see #getTestImplementation()
	 * @generated
	 */
	EAttribute getTestImplementation_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getName()
	 * @see #getTestImplementation()
	 * @generated
	 */
	EAttribute getTestImplementation_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getDescription()
	 * @see #getTestImplementation()
	 * @generated
	 */
	EAttribute getTestImplementation_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getTransformation()
	 * @see #getTestImplementation()
	 * @generated
	 */
	EReference getTestImplementation_Transformation();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getAnalysisExecPath <em>Analysis Exec Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Analysis Exec Path</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getAnalysisExecPath()
	 * @see #getTestImplementation()
	 * @generated
	 */
	EAttribute getTestImplementation_AnalysisExecPath();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getToolName <em>Tool Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool Name</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getToolName()
	 * @see #getTestImplementation()
	 * @generated
	 */
	EAttribute getTestImplementation_ToolName();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getTestedFile <em>Tested File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tested File</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getTestedFile()
	 * @see #getTestImplementation()
	 * @generated
	 */
	EAttribute getTestImplementation_TestedFile();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getTestResult <em>Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Result</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getTestResult()
	 * @see #getTestImplementation()
	 * @generated
	 */
	EAttribute getTestImplementation_TestResult();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestCharacteristicType <em>Test Characteristic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Characteristic Type</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TestCharacteristicType
	 * @generated
	 */
	EClass getTestCharacteristicType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestCharacteristicType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TestCharacteristicType#getComment()
	 * @see #getTestCharacteristicType()
	 * @generated
	 */
	EAttribute getTestCharacteristicType_Comment();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestCharacteristicType#getReferencedContexts <em>Referenced Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Contexts</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TestCharacteristicType#getReferencedContexts()
	 * @see #getTestCharacteristicType()
	 * @generated
	 */
	EReference getTestCharacteristicType_ReferencedContexts();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.SustainabilityType <em>Sustainability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sustainability Type</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.SustainabilityType
	 * @generated
	 */
	EClass getSustainabilityType();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Deadline_Sustainability <em>Deadline Sustainability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadline Sustainability</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Deadline_Sustainability
	 * @generated
	 */
	EClass getDeadline_Sustainability();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Jitter_Sustainability <em>Jitter Sustainability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jitter Sustainability</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Jitter_Sustainability
	 * @generated
	 */
	EClass getJitter_Sustainability();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Period_Sustainability <em>Period Sustainability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period Sustainability</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Period_Sustainability
	 * @generated
	 */
	EClass getPeriod_Sustainability();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ExecutionTime_Sustainability <em>Execution Time Sustainability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Time Sustainability</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ExecutionTime_Sustainability
	 * @generated
	 */
	EClass getExecutionTime_Sustainability();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.FeasibilityType <em>Feasibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feasibility Type</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.FeasibilityType
	 * @generated
	 */
	EClass getFeasibilityType();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.SufficientCondition <em>Sufficient Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sufficient Condition</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.SufficientCondition
	 * @generated
	 */
	EClass getSufficientCondition();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.NecessaryCondition <em>Necessary Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Necessary Condition</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.NecessaryCondition
	 * @generated
	 */
	EClass getNecessaryCondition();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Model</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getContextModel()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_ContextModel();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getId()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Id();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getTestImplementation <em>Test Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Test Implementation</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getTestImplementation()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_TestImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getDescription()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getTransfoExecPath <em>Transfo Exec Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transfo Exec Path</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getTransfoExecPath()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_TransfoExecPath();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup <em>Rule Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Group</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup
	 * @generated
	 */
	EClass getRuleGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getSubGroups <em>Sub Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Groups</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getSubGroups()
	 * @see #getRuleGroup()
	 * @generated
	 */
	EReference getRuleGroup_SubGroups();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getExpectedRuleValues <em>Expected Rule Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expected Rule Values</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getExpectedRuleValues()
	 * @see #getRuleGroup()
	 * @generated
	 */
	EReference getRuleGroup_ExpectedRuleValues();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getId()
	 * @see #getRuleGroup()
	 * @generated
	 */
	EAttribute getRuleGroup_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getJunctionType <em>Junction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Junction Type</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getJunctionType()
	 * @see #getRuleGroup()
	 * @generated
	 */
	EAttribute getRuleGroup_JunctionType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getDescription()
	 * @see #getRuleGroup()
	 * @generated
	 */
	EAttribute getRuleGroup_Description();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getContextmodel <em>Contextmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contextmodel</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getContextmodel()
	 * @see #getRuleGroup()
	 * @generated
	 */
	EReference getRuleGroup_Contextmodel();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue <em>Expected Evaluation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Evaluation Value</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue
	 * @generated
	 */
	EClass getExpectedEvaluationValue();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue#getValue()
	 * @see #getExpectedEvaluationValue()
	 * @generated
	 */
	EAttribute getExpectedEvaluationValue_Value();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue#getAssociatedRule <em>Associated Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated Rule</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue#getAssociatedRule()
	 * @see #getExpectedEvaluationValue()
	 * @generated
	 */
	EReference getExpectedEvaluationValue_AssociatedRule();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation <em>Inner Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inner Transformation</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation
	 * @generated
	 */
	EClass getInnerTransformation();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getRequiredContext <em>Required Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Context</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getRequiredContext()
	 * @see #getInnerTransformation()
	 * @generated
	 */
	EReference getInnerTransformation_RequiredContext();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getId()
	 * @see #getInnerTransformation()
	 * @generated
	 */
	EAttribute getInnerTransformation_Id();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getTurnTrue <em>Turn True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Turn True</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getTurnTrue()
	 * @see #getInnerTransformation()
	 * @generated
	 */
	EReference getInnerTransformation_TurnTrue();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getTurnFalse <em>Turn False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Turn False</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getTurnFalse()
	 * @see #getInnerTransformation()
	 * @generated
	 */
	EReference getInnerTransformation_TurnFalse();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getName()
	 * @see #getInnerTransformation()
	 * @generated
	 */
	EAttribute getInnerTransformation_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getDescription()
	 * @see #getInnerTransformation()
	 * @generated
	 */
	EAttribute getInnerTransformation_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getClassPath <em>Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Path</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getClassPath()
	 * @see #getInnerTransformation()
	 * @generated
	 */
	EAttribute getInnerTransformation_ClassPath();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.EvaluationResultType <em>Evaluation Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evaluation Result Type</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.EvaluationResultType
	 * @generated
	 */
	EEnum getEvaluationResultType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.JunctionType <em>Junction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Junction Type</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.JunctionType
	 * @generated
	 */
	EEnum getJunctionType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TruthType <em>Truth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Truth Type</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TruthType
	 * @generated
	 */
	EEnum getTruthType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AllOrOne <em>All Or One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>All Or One</em>'.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.AllOrOne
	 * @generated
	 */
	EEnum getAllOrOne();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TyscoFactory getTyscoFactory();

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
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.AnalysisRepositoryImpl <em>Analysis Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.AnalysisRepositoryImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getAnalysisRepository()
		 * @generated
		 */
		EClass ANALYSIS_REPOSITORY = eINSTANCE.getAnalysisRepository();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_REPOSITORY__NAME = eINSTANCE.getAnalysisRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_REPOSITORY__DESCRIPTION = eINSTANCE.getAnalysisRepository_Description();

		/**
		 * The meta object literal for the '<em><b>All Context Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS = eINSTANCE.getAnalysisRepository_AllContextModels();

		/**
		 * The meta object literal for the '<em><b>All Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_REPOSITORY__ALL_RULES = eINSTANCE.getAnalysisRepository_AllRules();

		/**
		 * The meta object literal for the '<em><b>All Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_REPOSITORY__ALL_TESTS = eINSTANCE.getAnalysisRepository_AllTests();

		/**
		 * The meta object literal for the '<em><b>All Inner Transfos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_REPOSITORY__ALL_INNER_TRANSFOS = eINSTANCE.getAnalysisRepository_AllInnerTransfos();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ContextModelImpl <em>Context Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ContextModelImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getContextModel()
		 * @generated
		 */
		EClass CONTEXT_MODEL = eINSTANCE.getContextModel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MODEL__ID = eINSTANCE.getContextModel_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MODEL__NAME = eINSTANCE.getContextModel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MODEL__DESCRIPTION = eINSTANCE.getContextModel_Description();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MODEL__REFERENCES = eINSTANCE.getContextModel_References();

		/**
		 * The meta object literal for the '<em><b>Refined Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__REFINED_CONTEXTS = eINSTANCE.getContextModel_RefinedContexts();

		/**
		 * The meta object literal for the '<em><b>Analysis Tests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__ANALYSIS_TESTS = eINSTANCE.getContextModel_AnalysisTests();

		/**
		 * The meta object literal for the '<em><b>Rule Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__RULE_GROUPS = eINSTANCE.getContextModel_RuleGroups();

		/**
		 * The meta object literal for the '<em><b>Root Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__ROOT_GROUP = eINSTANCE.getContextModel_RootGroup();

		/**
		 * The meta object literal for the '<em><b>Truth Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__TRUTH_VALUES = eINSTANCE.getContextModel_TruthValues();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__ID = eINSTANCE.getTest_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__NAME = eINSTANCE.getTest_Name();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__REFERENCES = eINSTANCE.getTest_References();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__DESCRIPTION = eINSTANCE.getTest_Description();

		/**
		 * The meta object literal for the '<em><b>Characteristics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__CHARACTERISTICS = eINSTANCE.getTest_Characteristics();

		/**
		 * The meta object literal for the '<em><b>Implementations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__IMPLEMENTATIONS = eINSTANCE.getTest_Implementations();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.IdentificationRuleImpl <em>Identification Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.IdentificationRuleImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getIdentificationRule()
		 * @generated
		 */
		EClass IDENTIFICATION_RULE = eINSTANCE.getIdentificationRule();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_RULE__ID = eINSTANCE.getIdentificationRule_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_RULE__DESCRIPTION = eINSTANCE.getIdentificationRule_Description();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_RULE__CONTENT = eINSTANCE.getIdentificationRule_Content();

		/**
		 * The meta object literal for the '<em><b>Required Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFICATION_RULE__REQUIRED_RULES = eINSTANCE.getIdentificationRule_RequiredRules();

		/**
		 * The meta object literal for the '<em><b>Equivalent Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFICATION_RULE__EQUIVALENT_RULES = eINSTANCE.getIdentificationRule_EquivalentRules();

		/**
		 * The meta object literal for the '<em><b>Conflictual Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFICATION_RULE__CONFLICTUAL_RULES = eINSTANCE.getIdentificationRule_ConflictualRules();

		/**
		 * The meta object literal for the '<em><b>Formal Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_RULE__FORMAL_EXPRESSION = eINSTANCE.getIdentificationRule_FormalExpression();

		/**
		 * The meta object literal for the '<em><b>Applied Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_RULE__APPLIED_CLASS = eINSTANCE.getIdentificationRule_AppliedClass();

		/**
		 * The meta object literal for the '<em><b>One Or All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_RULE__ONE_OR_ALL = eINSTANCE.getIdentificationRule_OneOrAll();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestImplementationImpl <em>Test Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestImplementationImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getTestImplementation()
		 * @generated
		 */
		EClass TEST_IMPLEMENTATION = eINSTANCE.getTestImplementation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_IMPLEMENTATION__ID = eINSTANCE.getTestImplementation_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_IMPLEMENTATION__NAME = eINSTANCE.getTestImplementation_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_IMPLEMENTATION__DESCRIPTION = eINSTANCE.getTestImplementation_Description();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_IMPLEMENTATION__TRANSFORMATION = eINSTANCE.getTestImplementation_Transformation();

		/**
		 * The meta object literal for the '<em><b>Analysis Exec Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_IMPLEMENTATION__ANALYSIS_EXEC_PATH = eINSTANCE.getTestImplementation_AnalysisExecPath();

		/**
		 * The meta object literal for the '<em><b>Tool Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_IMPLEMENTATION__TOOL_NAME = eINSTANCE.getTestImplementation_ToolName();

		/**
		 * The meta object literal for the '<em><b>Tested File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_IMPLEMENTATION__TESTED_FILE = eINSTANCE.getTestImplementation_TestedFile();

		/**
		 * The meta object literal for the '<em><b>Test Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_IMPLEMENTATION__TEST_RESULT = eINSTANCE.getTestImplementation_TestResult();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestCharacteristicTypeImpl <em>Test Characteristic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestCharacteristicTypeImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getTestCharacteristicType()
		 * @generated
		 */
		EClass TEST_CHARACTERISTIC_TYPE = eINSTANCE.getTestCharacteristicType();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CHARACTERISTIC_TYPE__COMMENT = eINSTANCE.getTestCharacteristicType_Comment();

		/**
		 * The meta object literal for the '<em><b>Referenced Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CHARACTERISTIC_TYPE__REFERENCED_CONTEXTS = eINSTANCE.getTestCharacteristicType_ReferencedContexts();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.SustainabilityTypeImpl <em>Sustainability Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.SustainabilityTypeImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getSustainabilityType()
		 * @generated
		 */
		EClass SUSTAINABILITY_TYPE = eINSTANCE.getSustainabilityType();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.Deadline_SustainabilityImpl <em>Deadline Sustainability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.Deadline_SustainabilityImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getDeadline_Sustainability()
		 * @generated
		 */
		EClass DEADLINE_SUSTAINABILITY = eINSTANCE.getDeadline_Sustainability();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.Jitter_SustainabilityImpl <em>Jitter Sustainability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.Jitter_SustainabilityImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getJitter_Sustainability()
		 * @generated
		 */
		EClass JITTER_SUSTAINABILITY = eINSTANCE.getJitter_Sustainability();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.Period_SustainabilityImpl <em>Period Sustainability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.Period_SustainabilityImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getPeriod_Sustainability()
		 * @generated
		 */
		EClass PERIOD_SUSTAINABILITY = eINSTANCE.getPeriod_Sustainability();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ExecutionTime_SustainabilityImpl <em>Execution Time Sustainability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ExecutionTime_SustainabilityImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getExecutionTime_Sustainability()
		 * @generated
		 */
		EClass EXECUTION_TIME_SUSTAINABILITY = eINSTANCE.getExecutionTime_Sustainability();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.FeasibilityTypeImpl <em>Feasibility Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.FeasibilityTypeImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getFeasibilityType()
		 * @generated
		 */
		EClass FEASIBILITY_TYPE = eINSTANCE.getFeasibilityType();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.SufficientConditionImpl <em>Sufficient Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.SufficientConditionImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getSufficientCondition()
		 * @generated
		 */
		EClass SUFFICIENT_CONDITION = eINSTANCE.getSufficientCondition();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.NecessaryConditionImpl <em>Necessary Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.NecessaryConditionImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getNecessaryCondition()
		 * @generated
		 */
		EClass NECESSARY_CONDITION = eINSTANCE.getNecessaryCondition();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TransformationImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Context Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__CONTEXT_MODEL = eINSTANCE.getTransformation_ContextModel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__ID = eINSTANCE.getTransformation_Id();

		/**
		 * The meta object literal for the '<em><b>Test Implementation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__TEST_IMPLEMENTATION = eINSTANCE.getTransformation_TestImplementation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__DESCRIPTION = eINSTANCE.getTransformation_Description();

		/**
		 * The meta object literal for the '<em><b>Transfo Exec Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__TRANSFO_EXEC_PATH = eINSTANCE.getTransformation_TransfoExecPath();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.RuleGroupImpl <em>Rule Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.RuleGroupImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getRuleGroup()
		 * @generated
		 */
		EClass RULE_GROUP = eINSTANCE.getRuleGroup();

		/**
		 * The meta object literal for the '<em><b>Sub Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_GROUP__SUB_GROUPS = eINSTANCE.getRuleGroup_SubGroups();

		/**
		 * The meta object literal for the '<em><b>Expected Rule Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_GROUP__EXPECTED_RULE_VALUES = eINSTANCE.getRuleGroup_ExpectedRuleValues();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_GROUP__ID = eINSTANCE.getRuleGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Junction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_GROUP__JUNCTION_TYPE = eINSTANCE.getRuleGroup_JunctionType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_GROUP__DESCRIPTION = eINSTANCE.getRuleGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Contextmodel</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_GROUP__CONTEXTMODEL = eINSTANCE.getRuleGroup_Contextmodel();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ExpectedEvaluationValueImpl <em>Expected Evaluation Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ExpectedEvaluationValueImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getExpectedEvaluationValue()
		 * @generated
		 */
		EClass EXPECTED_EVALUATION_VALUE = eINSTANCE.getExpectedEvaluationValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTED_EVALUATION_VALUE__VALUE = eINSTANCE.getExpectedEvaluationValue_Value();

		/**
		 * The meta object literal for the '<em><b>Associated Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPECTED_EVALUATION_VALUE__ASSOCIATED_RULE = eINSTANCE.getExpectedEvaluationValue_AssociatedRule();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.InnerTransformationImpl <em>Inner Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.InnerTransformationImpl
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getInnerTransformation()
		 * @generated
		 */
		EClass INNER_TRANSFORMATION = eINSTANCE.getInnerTransformation();

		/**
		 * The meta object literal for the '<em><b>Required Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INNER_TRANSFORMATION__REQUIRED_CONTEXT = eINSTANCE.getInnerTransformation_RequiredContext();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INNER_TRANSFORMATION__ID = eINSTANCE.getInnerTransformation_Id();

		/**
		 * The meta object literal for the '<em><b>Turn True</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INNER_TRANSFORMATION__TURN_TRUE = eINSTANCE.getInnerTransformation_TurnTrue();

		/**
		 * The meta object literal for the '<em><b>Turn False</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INNER_TRANSFORMATION__TURN_FALSE = eINSTANCE.getInnerTransformation_TurnFalse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INNER_TRANSFORMATION__NAME = eINSTANCE.getInnerTransformation_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INNER_TRANSFORMATION__DESCRIPTION = eINSTANCE.getInnerTransformation_Description();

		/**
		 * The meta object literal for the '<em><b>Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INNER_TRANSFORMATION__CLASS_PATH = eINSTANCE.getInnerTransformation_ClassPath();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.EvaluationResultType <em>Evaluation Result Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.EvaluationResultType
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getEvaluationResultType()
		 * @generated
		 */
		EEnum EVALUATION_RESULT_TYPE = eINSTANCE.getEvaluationResultType();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.JunctionType <em>Junction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.JunctionType
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getJunctionType()
		 * @generated
		 */
		EEnum JUNCTION_TYPE = eINSTANCE.getJunctionType();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TruthType <em>Truth Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TruthType
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getTruthType()
		 * @generated
		 */
		EEnum TRUTH_TYPE = eINSTANCE.getTruthType();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AllOrOne <em>All Or One</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.AllOrOne
		 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoPackageImpl#getAllOrOne()
		 * @generated
		 */
		EEnum ALL_OR_ONE = eINSTANCE.getAllOrOne();

	}

} //TyscoPackage
