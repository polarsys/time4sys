/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.time4sys.marte.analysisrepository.tysco.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TyscoFactoryImpl extends EFactoryImpl implements TyscoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TyscoFactory init() {
		try {
			TyscoFactory theTyscoFactory = (TyscoFactory)EPackage.Registry.INSTANCE.getEFactory(TyscoPackage.eNS_URI);
			if (theTyscoFactory != null) {
				return theTyscoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TyscoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyscoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TyscoPackage.ANALYSIS_REPOSITORY: return createAnalysisRepository();
			case TyscoPackage.CONTEXT_MODEL: return createContextModel();
			case TyscoPackage.TEST: return createTest();
			case TyscoPackage.IDENTIFICATION_RULE: return createIdentificationRule();
			case TyscoPackage.TEST_IMPLEMENTATION: return createTestImplementation();
			case TyscoPackage.DEADLINE_SUSTAINABILITY: return createDeadline_Sustainability();
			case TyscoPackage.JITTER_SUSTAINABILITY: return createJitter_Sustainability();
			case TyscoPackage.PERIOD_SUSTAINABILITY: return createPeriod_Sustainability();
			case TyscoPackage.EXECUTION_TIME_SUSTAINABILITY: return createExecutionTime_Sustainability();
			case TyscoPackage.SUFFICIENT_CONDITION: return createSufficientCondition();
			case TyscoPackage.NECESSARY_CONDITION: return createNecessaryCondition();
			case TyscoPackage.TRANSFORMATION: return createTransformation();
			case TyscoPackage.RULE_GROUP: return createRuleGroup();
			case TyscoPackage.EXPECTED_EVALUATION_VALUE: return createExpectedEvaluationValue();
			case TyscoPackage.INNER_TRANSFORMATION: return createInnerTransformation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TyscoPackage.EVALUATION_RESULT_TYPE:
				return createEvaluationResultTypeFromString(eDataType, initialValue);
			case TyscoPackage.JUNCTION_TYPE:
				return createJunctionTypeFromString(eDataType, initialValue);
			case TyscoPackage.TRUTH_TYPE:
				return createTruthTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TyscoPackage.EVALUATION_RESULT_TYPE:
				return convertEvaluationResultTypeToString(eDataType, instanceValue);
			case TyscoPackage.JUNCTION_TYPE:
				return convertJunctionTypeToString(eDataType, instanceValue);
			case TyscoPackage.TRUTH_TYPE:
				return convertTruthTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisRepository createAnalysisRepository() {
		AnalysisRepositoryImpl analysisRepository = new AnalysisRepositoryImpl();
		return analysisRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel createContextModel() {
		ContextModelImpl contextModel = new ContextModelImpl();
		return contextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentificationRule createIdentificationRule() {
		IdentificationRuleImpl identificationRule = new IdentificationRuleImpl();
		return identificationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestImplementation createTestImplementation() {
		TestImplementationImpl testImplementation = new TestImplementationImpl();
		return testImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deadline_Sustainability createDeadline_Sustainability() {
		Deadline_SustainabilityImpl deadline_Sustainability = new Deadline_SustainabilityImpl();
		return deadline_Sustainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jitter_Sustainability createJitter_Sustainability() {
		Jitter_SustainabilityImpl jitter_Sustainability = new Jitter_SustainabilityImpl();
		return jitter_Sustainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period_Sustainability createPeriod_Sustainability() {
		Period_SustainabilityImpl period_Sustainability = new Period_SustainabilityImpl();
		return period_Sustainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionTime_Sustainability createExecutionTime_Sustainability() {
		ExecutionTime_SustainabilityImpl executionTime_Sustainability = new ExecutionTime_SustainabilityImpl();
		return executionTime_Sustainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SufficientCondition createSufficientCondition() {
		SufficientConditionImpl sufficientCondition = new SufficientConditionImpl();
		return sufficientCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NecessaryCondition createNecessaryCondition() {
		NecessaryConditionImpl necessaryCondition = new NecessaryConditionImpl();
		return necessaryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleGroup createRuleGroup() {
		RuleGroupImpl ruleGroup = new RuleGroupImpl();
		return ruleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedEvaluationValue createExpectedEvaluationValue() {
		ExpectedEvaluationValueImpl expectedEvaluationValue = new ExpectedEvaluationValueImpl();
		return expectedEvaluationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InnerTransformation createInnerTransformation() {
		InnerTransformationImpl innerTransformation = new InnerTransformationImpl();
		return innerTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationResultType createEvaluationResultTypeFromString(EDataType eDataType, String initialValue) {
		EvaluationResultType result = EvaluationResultType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvaluationResultTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JunctionType createJunctionTypeFromString(EDataType eDataType, String initialValue) {
		JunctionType result = JunctionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TruthType createTruthTypeFromString(EDataType eDataType, String initialValue) {
		TruthType result = TruthType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTruthTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyscoPackage getTyscoPackage() {
		return (TyscoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TyscoPackage getPackage() {
		return TyscoPackage.eINSTANCE;
	}

} //TyscoFactoryImpl
