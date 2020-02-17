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
package org.polarsys.time4sys.marte.analysisrepository.tysco.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.polarsys.time4sys.marte.analysisrepository.tysco.*;
import org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel;
import org.polarsys.time4sys.marte.analysisrepository.tysco.Deadline_Sustainability;
import org.polarsys.time4sys.marte.analysisrepository.tysco.EvaluationResultType;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ExecutionTime_Sustainability;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue;
import org.polarsys.time4sys.marte.analysisrepository.tysco.FeasibilityType;
import org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule;
import org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.Jitter_Sustainability;
import org.polarsys.time4sys.marte.analysisrepository.tysco.JunctionType;
import org.polarsys.time4sys.marte.analysisrepository.tysco.NecessaryCondition;
import org.polarsys.time4sys.marte.analysisrepository.tysco.Period_Sustainability;
import org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup;
import org.polarsys.time4sys.marte.analysisrepository.tysco.SufficientCondition;
import org.polarsys.time4sys.marte.analysisrepository.tysco.SustainabilityType;
import org.polarsys.time4sys.marte.analysisrepository.tysco.Test;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TestCharacteristicType;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TruthType;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage
 * @generated
 */
public class TyscoValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TyscoValidator INSTANCE = new TyscoValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.polarsys.time4sys.marte.analysisrepository.tysco";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyscoValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TyscoPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TyscoPackage.ANALYSIS_REPOSITORY:
				return validateAnalysisRepository((AnalysisRepository)value, diagnostics, context);
			case TyscoPackage.CONTEXT_MODEL:
				return validateContextModel((ContextModel)value, diagnostics, context);
			case TyscoPackage.TEST:
				return validateTest((Test)value, diagnostics, context);
			case TyscoPackage.IDENTIFICATION_RULE:
				return validateIdentificationRule((IdentificationRule)value, diagnostics, context);
			case TyscoPackage.TEST_IMPLEMENTATION:
				return validateTestImplementation((TestImplementation)value, diagnostics, context);
			case TyscoPackage.TEST_CHARACTERISTIC_TYPE:
				return validateTestCharacteristicType((TestCharacteristicType)value, diagnostics, context);
			case TyscoPackage.SUSTAINABILITY_TYPE:
				return validateSustainabilityType((SustainabilityType)value, diagnostics, context);
			case TyscoPackage.DEADLINE_SUSTAINABILITY:
				return validateDeadline_Sustainability((Deadline_Sustainability)value, diagnostics, context);
			case TyscoPackage.JITTER_SUSTAINABILITY:
				return validateJitter_Sustainability((Jitter_Sustainability)value, diagnostics, context);
			case TyscoPackage.PERIOD_SUSTAINABILITY:
				return validatePeriod_Sustainability((Period_Sustainability)value, diagnostics, context);
			case TyscoPackage.EXECUTION_TIME_SUSTAINABILITY:
				return validateExecutionTime_Sustainability((ExecutionTime_Sustainability)value, diagnostics, context);
			case TyscoPackage.FEASIBILITY_TYPE:
				return validateFeasibilityType((FeasibilityType)value, diagnostics, context);
			case TyscoPackage.SUFFICIENT_CONDITION:
				return validateSufficientCondition((SufficientCondition)value, diagnostics, context);
			case TyscoPackage.NECESSARY_CONDITION:
				return validateNecessaryCondition((NecessaryCondition)value, diagnostics, context);
			case TyscoPackage.TRANSFORMATION:
				return validateTransformation((Transformation)value, diagnostics, context);
			case TyscoPackage.RULE_GROUP:
				return validateRuleGroup((RuleGroup)value, diagnostics, context);
			case TyscoPackage.EXPECTED_EVALUATION_VALUE:
				return validateExpectedEvaluationValue((ExpectedEvaluationValue)value, diagnostics, context);
			case TyscoPackage.INNER_TRANSFORMATION:
				return validateInnerTransformation((InnerTransformation)value, diagnostics, context);
			case TyscoPackage.EVALUATION_RESULT_TYPE:
				return validateEvaluationResultType((EvaluationResultType)value, diagnostics, context);
			case TyscoPackage.JUNCTION_TYPE:
				return validateJunctionType((JunctionType)value, diagnostics, context);
			case TyscoPackage.TRUTH_TYPE:
				return validateTruthType((TruthType)value, diagnostics, context);
			case TyscoPackage.ALL_OR_ONE:
				return validateAllOrOne((AllOrOne)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalysisRepository(AnalysisRepository analysisRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(analysisRepository, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(analysisRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(analysisRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(analysisRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(analysisRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(analysisRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(analysisRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(analysisRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(analysisRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnalysisRepository_IdCompliance_inv1(analysisRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnalysisRepository_IdCompliance_inv2(analysisRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnalysisRepository_IdCompliance_inv3(analysisRepository, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IdCompliance_inv1 constraint of '<em>Analysis Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ANALYSIS_REPOSITORY__ID_COMPLIANCE_INV1__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Ids conflicts: there are at least 2 context models whose id is the same',\n" +
		"\tstatus : Boolean = allContextModels->forAll(ct1,ct2|ct1 <> ct2 implies ct1.id <> ct2.id)\n" +
		"}.status";

	/**
	 * Validates the IdCompliance_inv1 constraint of '<em>Analysis Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalysisRepository_IdCompliance_inv1(AnalysisRepository analysisRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyscoPackage.Literals.ANALYSIS_REPOSITORY,
				 analysisRepository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IdCompliance_inv1",
				 ANALYSIS_REPOSITORY__ID_COMPLIANCE_INV1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IdCompliance_inv2 constraint of '<em>Analysis Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ANALYSIS_REPOSITORY__ID_COMPLIANCE_INV2__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Ids conflicts: there are at least 2 identification rules whose id is the same',\n" +
		"\tstatus : Boolean = allRules->forAll(ir1,ir2|ir1 <> ir2 implies ir1.id <> ir2.id)\n" +
		"}.status";

	/**
	 * Validates the IdCompliance_inv2 constraint of '<em>Analysis Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalysisRepository_IdCompliance_inv2(AnalysisRepository analysisRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyscoPackage.Literals.ANALYSIS_REPOSITORY,
				 analysisRepository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IdCompliance_inv2",
				 ANALYSIS_REPOSITORY__ID_COMPLIANCE_INV2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IdCompliance_inv3 constraint of '<em>Analysis Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ANALYSIS_REPOSITORY__ID_COMPLIANCE_INV3__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Ids conflicts: there are at least 2 tests whose id is the same',\n" +
		"\tstatus : Boolean = allTests->forAll(t1,t2|t1 <> t2 implies t1.id <> t2.id)\n" +
		"}.status";

	/**
	 * Validates the IdCompliance_inv3 constraint of '<em>Analysis Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalysisRepository_IdCompliance_inv3(AnalysisRepository analysisRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyscoPackage.Literals.ANALYSIS_REPOSITORY,
				 analysisRepository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IdCompliance_inv3",
				 ANALYSIS_REPOSITORY__ID_COMPLIANCE_INV3__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextModel(ContextModel contextModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTest(Test test, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(test, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(test, diagnostics, context);
		if (result || diagnostics != null) result &= validateTest_IdCompliance_inv4(test, diagnostics, context);
		if (result || diagnostics != null) result &= validateTest_Characteristic_inv1(test, diagnostics, context);
		if (result || diagnostics != null) result &= validateTest_Characteristic_inv2(test, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IdCompliance_inv4 constraint of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEST__ID_COMPLIANCE_INV4__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Error: Ids conflicts: there are at least 2 test implementations whose id is the same',\n" +
		"\tstatus : Boolean = self.implementations->forAll(impl1,impl2|impl1<>impl2 implies impl1.id<>impl2.id)\n" +
		"}.status";

	/**
	 * Validates the IdCompliance_inv4 constraint of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTest_IdCompliance_inv4(Test test, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyscoPackage.Literals.TEST,
				 test,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IdCompliance_inv4",
				 TEST__ID_COMPLIANCE_INV4__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the Characteristic_inv1 constraint of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEST__CHARACTERISTIC_INV1__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Error: There are at least 1 sufficient conditions in a test',\n" +
		"\tstatus : Boolean = self.characteristics->selectByKind(SufficientCondition)->size()<2\n" +
		"}.status";

	/**
	 * Validates the Characteristic_inv1 constraint of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTest_Characteristic_inv1(Test test, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyscoPackage.Literals.TEST,
				 test,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Characteristic_inv1",
				 TEST__CHARACTERISTIC_INV1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the Characteristic_inv2 constraint of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEST__CHARACTERISTIC_INV2__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Error: There are at least 1 necessary conditions in a test',\n" +
		"\tstatus : Boolean = self.characteristics->selectByKind(NecessaryCondition)->size()<2\n" +
		"}.status";

	/**
	 * Validates the Characteristic_inv2 constraint of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTest_Characteristic_inv2(Test test, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyscoPackage.Literals.TEST,
				 test,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Characteristic_inv2",
				 TEST__CHARACTERISTIC_INV2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentificationRule(IdentificationRule identificationRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identificationRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestImplementation(TestImplementation testImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(testImplementation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(testImplementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(testImplementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(testImplementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(testImplementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(testImplementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(testImplementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(testImplementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(testImplementation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestImplementation_TransformationUnique(testImplementation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TransformationUnique constraint of '<em>Test Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEST_IMPLEMENTATION__TRANSFORMATION_UNIQUE__EEXPRESSION = "self.transformation->size()<2";

	/**
	 * Validates the TransformationUnique constraint of '<em>Test Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestImplementation_TransformationUnique(TestImplementation testImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyscoPackage.Literals.TEST_IMPLEMENTATION,
				 testImplementation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TransformationUnique",
				 TEST_IMPLEMENTATION__TRANSFORMATION_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestCharacteristicType(TestCharacteristicType testCharacteristicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(testCharacteristicType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(testCharacteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(testCharacteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(testCharacteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(testCharacteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(testCharacteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(testCharacteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(testCharacteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(testCharacteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestCharacteristicType_TestCharacteristicType_inv1(testCharacteristicType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TestCharacteristicType_inv1 constraint of '<em>Test Characteristic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEST_CHARACTERISTIC_TYPE__TEST_CHARACTERISTIC_TYPE_INV1__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Please re-check the related contexts',\n" +
		"\tstatus : Boolean = self.referencedContexts->forAll(ct:ContextModel|ct.analysisTests.characteristics->includes(self))\n" +
		"}.status";

	/**
	 * Validates the TestCharacteristicType_inv1 constraint of '<em>Test Characteristic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestCharacteristicType_TestCharacteristicType_inv1(TestCharacteristicType testCharacteristicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyscoPackage.Literals.TEST_CHARACTERISTIC_TYPE,
				 testCharacteristicType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TestCharacteristicType_inv1",
				 TEST_CHARACTERISTIC_TYPE__TEST_CHARACTERISTIC_TYPE_INV1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSustainabilityType(SustainabilityType sustainabilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sustainabilityType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sustainabilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sustainabilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sustainabilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sustainabilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sustainabilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sustainabilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sustainabilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sustainabilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestCharacteristicType_TestCharacteristicType_inv1(sustainabilityType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeadline_Sustainability(Deadline_Sustainability deadline_Sustainability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deadline_Sustainability, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deadline_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deadline_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deadline_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deadline_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deadline_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deadline_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deadline_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deadline_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestCharacteristicType_TestCharacteristicType_inv1(deadline_Sustainability, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJitter_Sustainability(Jitter_Sustainability jitter_Sustainability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(jitter_Sustainability, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(jitter_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(jitter_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(jitter_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(jitter_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(jitter_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(jitter_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(jitter_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(jitter_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestCharacteristicType_TestCharacteristicType_inv1(jitter_Sustainability, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriod_Sustainability(Period_Sustainability period_Sustainability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(period_Sustainability, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(period_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(period_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(period_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(period_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(period_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(period_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(period_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(period_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestCharacteristicType_TestCharacteristicType_inv1(period_Sustainability, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionTime_Sustainability(ExecutionTime_Sustainability executionTime_Sustainability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executionTime_Sustainability, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executionTime_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executionTime_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executionTime_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executionTime_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executionTime_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executionTime_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executionTime_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executionTime_Sustainability, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestCharacteristicType_TestCharacteristicType_inv1(executionTime_Sustainability, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeasibilityType(FeasibilityType feasibilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(feasibilityType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(feasibilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(feasibilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(feasibilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(feasibilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(feasibilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(feasibilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(feasibilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(feasibilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestCharacteristicType_TestCharacteristicType_inv1(feasibilityType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSufficientCondition(SufficientCondition sufficientCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sufficientCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sufficientCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sufficientCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sufficientCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sufficientCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sufficientCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sufficientCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sufficientCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sufficientCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestCharacteristicType_TestCharacteristicType_inv1(sufficientCondition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNecessaryCondition(NecessaryCondition necessaryCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(necessaryCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(necessaryCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(necessaryCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(necessaryCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(necessaryCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(necessaryCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(necessaryCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(necessaryCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(necessaryCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestCharacteristicType_TestCharacteristicType_inv1(necessaryCondition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformation(Transformation transformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transformation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transformation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransformation_contextRelatedCompliance(transformation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the contextRelatedCompliance constraint of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSFORMATION__CONTEXT_RELATED_COMPLIANCE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The context model specified is irrelevant',\n" +
		"\tstatus : Boolean = self.contextModel.analysisTests.implementations.transformation->includes(self)\n" +
		"}.status";

	/**
	 * Validates the contextRelatedCompliance constraint of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformation_contextRelatedCompliance(Transformation transformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyscoPackage.Literals.TRANSFORMATION,
				 transformation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "contextRelatedCompliance",
				 TRANSFORMATION__CONTEXT_RELATED_COMPLIANCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleGroup(RuleGroup ruleGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ruleGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpectedEvaluationValue(ExpectedEvaluationValue expectedEvaluationValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expectedEvaluationValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInnerTransformation(InnerTransformation innerTransformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(innerTransformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationResultType(EvaluationResultType evaluationResultType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJunctionType(JunctionType junctionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTruthType(TruthType truthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllOrOne(AllOrOne allOrOne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TyscoValidator
