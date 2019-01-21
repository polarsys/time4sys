/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;
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
import org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoFactory;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage;

import org.polarsys.time4sys.marte.analysisrepository.tysco.util.TyscoValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TyscoPackageImpl extends EPackageImpl implements TyscoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identificationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCharacteristicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sustainabilityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deadline_SustainabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jitter_SustainabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass period_SustainabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionTime_SustainabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feasibilityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sufficientConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass necessaryConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedEvaluationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evaluationResultTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum junctionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum truthTypeEEnum = null;

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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TyscoPackageImpl() {
		super(eNS_URI, TyscoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TyscoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TyscoPackage init() {
		if (isInited) return (TyscoPackage)EPackage.Registry.INSTANCE.getEPackage(TyscoPackage.eNS_URI);

		// Obtain or create and register package
		TyscoPackageImpl theTyscoPackage = (TyscoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TyscoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TyscoPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTyscoPackage.createPackageContents();

		// Initialize created meta-data
		theTyscoPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTyscoPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TyscoValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTyscoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TyscoPackage.eNS_URI, theTyscoPackage);
		return theTyscoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisRepository() {
		return analysisRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisRepository_Name() {
		return (EAttribute)analysisRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisRepository_Description() {
		return (EAttribute)analysisRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisRepository_AllContextModels() {
		return (EReference)analysisRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisRepository_AllRules() {
		return (EReference)analysisRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisRepository_AllTests() {
		return (EReference)analysisRepositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisRepository_AllInnerTransfos() {
		return (EReference)analysisRepositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextModel() {
		return contextModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextModel_Id() {
		return (EAttribute)contextModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextModel_Name() {
		return (EAttribute)contextModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextModel_Description() {
		return (EAttribute)contextModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextModel_References() {
		return (EAttribute)contextModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextModel_RefinedContexts() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextModel_AnalysisTests() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextModel_RuleGroups() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextModel_RootGroup() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextModel_TruthValues() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest() {
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Id() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Name() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_References() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Description() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_Characteristics() {
		return (EReference)testEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_Implementations() {
		return (EReference)testEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentificationRule() {
		return identificationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentificationRule_Id() {
		return (EAttribute)identificationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentificationRule_Description() {
		return (EAttribute)identificationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentificationRule_Content() {
		return (EAttribute)identificationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentificationRule_RequiredRules() {
		return (EReference)identificationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentificationRule_EquivalentRules() {
		return (EReference)identificationRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentificationRule_ConflictualRules() {
		return (EReference)identificationRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentificationRule_FormalExpression() {
		return (EAttribute)identificationRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestImplementation() {
		return testImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestImplementation_Id() {
		return (EAttribute)testImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestImplementation_Name() {
		return (EAttribute)testImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestImplementation_Description() {
		return (EAttribute)testImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestImplementation_Transformation() {
		return (EReference)testImplementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestImplementation_AnalysisExecPath() {
		return (EAttribute)testImplementationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestImplementation_ToolName() {
		return (EAttribute)testImplementationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCharacteristicType() {
		return testCharacteristicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCharacteristicType_Comment() {
		return (EAttribute)testCharacteristicTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCharacteristicType_ReferencedContexts() {
		return (EReference)testCharacteristicTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSustainabilityType() {
		return sustainabilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeadline_Sustainability() {
		return deadline_SustainabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJitter_Sustainability() {
		return jitter_SustainabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriod_Sustainability() {
		return period_SustainabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionTime_Sustainability() {
		return executionTime_SustainabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeasibilityType() {
		return feasibilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSufficientCondition() {
		return sufficientConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNecessaryCondition() {
		return necessaryConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_ContextModel() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Id() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_TestImplementation() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Description() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_TransfoExecPath() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleGroup() {
		return ruleGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleGroup_SubGroups() {
		return (EReference)ruleGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleGroup_ExpectedRuleValues() {
		return (EReference)ruleGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleGroup_Id() {
		return (EAttribute)ruleGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleGroup_JunctionType() {
		return (EAttribute)ruleGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleGroup_Description() {
		return (EAttribute)ruleGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleGroup_Contextmodel() {
		return (EReference)ruleGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpectedEvaluationValue() {
		return expectedEvaluationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpectedEvaluationValue_Value() {
		return (EAttribute)expectedEvaluationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpectedEvaluationValue_AssociatedRule() {
		return (EReference)expectedEvaluationValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInnerTransformation() {
		return innerTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInnerTransformation_RequiredContext() {
		return (EReference)innerTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInnerTransformation_Id() {
		return (EAttribute)innerTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInnerTransformation_TurnTrue() {
		return (EReference)innerTransformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInnerTransformation_TurnFalse() {
		return (EReference)innerTransformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInnerTransformation_Name() {
		return (EAttribute)innerTransformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInnerTransformation_Description() {
		return (EAttribute)innerTransformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInnerTransformation_ClassPath() {
		return (EAttribute)innerTransformationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEvaluationResultType() {
		return evaluationResultTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJunctionType() {
		return junctionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTruthType() {
		return truthTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyscoFactory getTyscoFactory() {
		return (TyscoFactory)getEFactoryInstance();
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
		analysisRepositoryEClass = createEClass(ANALYSIS_REPOSITORY);
		createEAttribute(analysisRepositoryEClass, ANALYSIS_REPOSITORY__NAME);
		createEAttribute(analysisRepositoryEClass, ANALYSIS_REPOSITORY__DESCRIPTION);
		createEReference(analysisRepositoryEClass, ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS);
		createEReference(analysisRepositoryEClass, ANALYSIS_REPOSITORY__ALL_RULES);
		createEReference(analysisRepositoryEClass, ANALYSIS_REPOSITORY__ALL_TESTS);
		createEReference(analysisRepositoryEClass, ANALYSIS_REPOSITORY__ALL_INNER_TRANSFOS);

		contextModelEClass = createEClass(CONTEXT_MODEL);
		createEAttribute(contextModelEClass, CONTEXT_MODEL__ID);
		createEAttribute(contextModelEClass, CONTEXT_MODEL__NAME);
		createEAttribute(contextModelEClass, CONTEXT_MODEL__DESCRIPTION);
		createEAttribute(contextModelEClass, CONTEXT_MODEL__REFERENCES);
		createEReference(contextModelEClass, CONTEXT_MODEL__REFINED_CONTEXTS);
		createEReference(contextModelEClass, CONTEXT_MODEL__ANALYSIS_TESTS);
		createEReference(contextModelEClass, CONTEXT_MODEL__ROOT_GROUP);
		createEReference(contextModelEClass, CONTEXT_MODEL__TRUTH_VALUES);
		createEReference(contextModelEClass, CONTEXT_MODEL__RULE_GROUPS);

		testEClass = createEClass(TEST);
		createEAttribute(testEClass, TEST__ID);
		createEAttribute(testEClass, TEST__NAME);
		createEAttribute(testEClass, TEST__REFERENCES);
		createEAttribute(testEClass, TEST__DESCRIPTION);
		createEReference(testEClass, TEST__CHARACTERISTICS);
		createEReference(testEClass, TEST__IMPLEMENTATIONS);

		identificationRuleEClass = createEClass(IDENTIFICATION_RULE);
		createEAttribute(identificationRuleEClass, IDENTIFICATION_RULE__ID);
		createEAttribute(identificationRuleEClass, IDENTIFICATION_RULE__DESCRIPTION);
		createEAttribute(identificationRuleEClass, IDENTIFICATION_RULE__CONTENT);
		createEReference(identificationRuleEClass, IDENTIFICATION_RULE__REQUIRED_RULES);
		createEReference(identificationRuleEClass, IDENTIFICATION_RULE__EQUIVALENT_RULES);
		createEReference(identificationRuleEClass, IDENTIFICATION_RULE__CONFLICTUAL_RULES);
		createEAttribute(identificationRuleEClass, IDENTIFICATION_RULE__FORMAL_EXPRESSION);

		testImplementationEClass = createEClass(TEST_IMPLEMENTATION);
		createEAttribute(testImplementationEClass, TEST_IMPLEMENTATION__ID);
		createEAttribute(testImplementationEClass, TEST_IMPLEMENTATION__NAME);
		createEAttribute(testImplementationEClass, TEST_IMPLEMENTATION__DESCRIPTION);
		createEReference(testImplementationEClass, TEST_IMPLEMENTATION__TRANSFORMATION);
		createEAttribute(testImplementationEClass, TEST_IMPLEMENTATION__ANALYSIS_EXEC_PATH);
		createEAttribute(testImplementationEClass, TEST_IMPLEMENTATION__TOOL_NAME);

		testCharacteristicTypeEClass = createEClass(TEST_CHARACTERISTIC_TYPE);
		createEAttribute(testCharacteristicTypeEClass, TEST_CHARACTERISTIC_TYPE__COMMENT);
		createEReference(testCharacteristicTypeEClass, TEST_CHARACTERISTIC_TYPE__REFERENCED_CONTEXTS);

		sustainabilityTypeEClass = createEClass(SUSTAINABILITY_TYPE);

		deadline_SustainabilityEClass = createEClass(DEADLINE_SUSTAINABILITY);

		jitter_SustainabilityEClass = createEClass(JITTER_SUSTAINABILITY);

		period_SustainabilityEClass = createEClass(PERIOD_SUSTAINABILITY);

		executionTime_SustainabilityEClass = createEClass(EXECUTION_TIME_SUSTAINABILITY);

		feasibilityTypeEClass = createEClass(FEASIBILITY_TYPE);

		sufficientConditionEClass = createEClass(SUFFICIENT_CONDITION);

		necessaryConditionEClass = createEClass(NECESSARY_CONDITION);

		transformationEClass = createEClass(TRANSFORMATION);
		createEReference(transformationEClass, TRANSFORMATION__CONTEXT_MODEL);
		createEAttribute(transformationEClass, TRANSFORMATION__ID);
		createEReference(transformationEClass, TRANSFORMATION__TEST_IMPLEMENTATION);
		createEAttribute(transformationEClass, TRANSFORMATION__DESCRIPTION);
		createEAttribute(transformationEClass, TRANSFORMATION__TRANSFO_EXEC_PATH);

		ruleGroupEClass = createEClass(RULE_GROUP);
		createEReference(ruleGroupEClass, RULE_GROUP__SUB_GROUPS);
		createEReference(ruleGroupEClass, RULE_GROUP__EXPECTED_RULE_VALUES);
		createEAttribute(ruleGroupEClass, RULE_GROUP__ID);
		createEAttribute(ruleGroupEClass, RULE_GROUP__JUNCTION_TYPE);
		createEAttribute(ruleGroupEClass, RULE_GROUP__DESCRIPTION);
		createEReference(ruleGroupEClass, RULE_GROUP__CONTEXTMODEL);

		expectedEvaluationValueEClass = createEClass(EXPECTED_EVALUATION_VALUE);
		createEAttribute(expectedEvaluationValueEClass, EXPECTED_EVALUATION_VALUE__VALUE);
		createEReference(expectedEvaluationValueEClass, EXPECTED_EVALUATION_VALUE__ASSOCIATED_RULE);

		innerTransformationEClass = createEClass(INNER_TRANSFORMATION);
		createEReference(innerTransformationEClass, INNER_TRANSFORMATION__REQUIRED_CONTEXT);
		createEAttribute(innerTransformationEClass, INNER_TRANSFORMATION__ID);
		createEReference(innerTransformationEClass, INNER_TRANSFORMATION__TURN_TRUE);
		createEReference(innerTransformationEClass, INNER_TRANSFORMATION__TURN_FALSE);
		createEAttribute(innerTransformationEClass, INNER_TRANSFORMATION__NAME);
		createEAttribute(innerTransformationEClass, INNER_TRANSFORMATION__DESCRIPTION);
		createEAttribute(innerTransformationEClass, INNER_TRANSFORMATION__CLASS_PATH);

		// Create enums
		evaluationResultTypeEEnum = createEEnum(EVALUATION_RESULT_TYPE);
		junctionTypeEEnum = createEEnum(JUNCTION_TYPE);
		truthTypeEEnum = createEEnum(TRUTH_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sustainabilityTypeEClass.getESuperTypes().add(this.getTestCharacteristicType());
		deadline_SustainabilityEClass.getESuperTypes().add(this.getSustainabilityType());
		jitter_SustainabilityEClass.getESuperTypes().add(this.getSustainabilityType());
		period_SustainabilityEClass.getESuperTypes().add(this.getSustainabilityType());
		executionTime_SustainabilityEClass.getESuperTypes().add(this.getSustainabilityType());
		feasibilityTypeEClass.getESuperTypes().add(this.getTestCharacteristicType());
		sufficientConditionEClass.getESuperTypes().add(this.getFeasibilityType());
		necessaryConditionEClass.getESuperTypes().add(this.getFeasibilityType());

		// Initialize classes, features, and operations; add parameters
		initEClass(analysisRepositoryEClass, AnalysisRepository.class, "AnalysisRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalysisRepository_Name(), ecorePackage.getEString(), "name", null, 1, 1, AnalysisRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysisRepository_Description(), ecorePackage.getEString(), "description", null, 0, 1, AnalysisRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisRepository_AllContextModels(), this.getContextModel(), null, "allContextModels", null, 0, -1, AnalysisRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisRepository_AllRules(), this.getIdentificationRule(), null, "allRules", null, 0, -1, AnalysisRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisRepository_AllTests(), this.getTest(), null, "allTests", null, 0, -1, AnalysisRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisRepository_AllInnerTransfos(), this.getInnerTransformation(), null, "allInnerTransfos", null, 0, -1, AnalysisRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextModelEClass, ContextModel.class, "ContextModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextModel_Id(), ecorePackage.getEInt(), "id", null, 1, 1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextModel_References(), ecorePackage.getEString(), "references", null, 0, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextModel_RefinedContexts(), this.getContextModel(), null, "refinedContexts", null, 0, -1, ContextModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextModel_AnalysisTests(), this.getTest(), null, "analysisTests", null, 0, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextModel_RootGroup(), this.getRuleGroup(), null, "rootGroup", null, 1, 1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextModel_TruthValues(), this.getExpectedEvaluationValue(), null, "truthValues", null, 0, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextModel_RuleGroups(), this.getRuleGroup(), this.getRuleGroup_Contextmodel(), "ruleGroups", null, 0, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testEClass, Test.class, "Test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTest_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTest_Name(), ecorePackage.getEString(), "name", null, 1, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTest_References(), ecorePackage.getEString(), "references", null, 0, -1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTest_Description(), ecorePackage.getEString(), "description", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_Characteristics(), this.getTestCharacteristicType(), null, "characteristics", null, 0, -1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_Implementations(), this.getTestImplementation(), null, "implementations", null, 0, -1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identificationRuleEClass, IdentificationRule.class, "IdentificationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentificationRule_Id(), ecorePackage.getEInt(), "id", null, 1, 1, IdentificationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentificationRule_Description(), ecorePackage.getEString(), "description", null, 0, 1, IdentificationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentificationRule_Content(), ecorePackage.getEString(), "content", null, 0, 1, IdentificationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentificationRule_RequiredRules(), this.getIdentificationRule(), null, "requiredRules", null, 0, -1, IdentificationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentificationRule_EquivalentRules(), this.getIdentificationRule(), null, "equivalentRules", null, 0, -1, IdentificationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentificationRule_ConflictualRules(), this.getIdentificationRule(), null, "conflictualRules", null, 0, -1, IdentificationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentificationRule_FormalExpression(), ecorePackage.getEString(), "formalExpression", null, 0, 1, IdentificationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testImplementationEClass, TestImplementation.class, "TestImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestImplementation_Id(), ecorePackage.getEInt(), "id", null, 1, 1, TestImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestImplementation_Name(), ecorePackage.getEString(), "name", null, 1, 1, TestImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestImplementation_Description(), ecorePackage.getEString(), "description", null, 0, 1, TestImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestImplementation_Transformation(), this.getTransformation(), this.getTransformation_TestImplementation(), "transformation", null, 0, 1, TestImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestImplementation_AnalysisExecPath(), ecorePackage.getEString(), "analysisExecPath", null, 0, 1, TestImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestImplementation_ToolName(), ecorePackage.getEString(), "toolName", null, 0, 1, TestImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testCharacteristicTypeEClass, TestCharacteristicType.class, "TestCharacteristicType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestCharacteristicType_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, TestCharacteristicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCharacteristicType_ReferencedContexts(), this.getContextModel(), null, "referencedContexts", null, 1, -1, TestCharacteristicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sustainabilityTypeEClass, SustainabilityType.class, "SustainabilityType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deadline_SustainabilityEClass, Deadline_Sustainability.class, "Deadline_Sustainability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jitter_SustainabilityEClass, Jitter_Sustainability.class, "Jitter_Sustainability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(period_SustainabilityEClass, Period_Sustainability.class, "Period_Sustainability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionTime_SustainabilityEClass, ExecutionTime_Sustainability.class, "ExecutionTime_Sustainability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(feasibilityTypeEClass, FeasibilityType.class, "FeasibilityType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sufficientConditionEClass, SufficientCondition.class, "SufficientCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(necessaryConditionEClass, NecessaryCondition.class, "NecessaryCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformation_ContextModel(), this.getContextModel(), null, "contextModel", null, 1, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_TestImplementation(), this.getTestImplementation(), this.getTestImplementation_Transformation(), "testImplementation", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_Description(), ecorePackage.getEString(), "description", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_TransfoExecPath(), ecorePackage.getEString(), "transfoExecPath", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleGroupEClass, RuleGroup.class, "RuleGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleGroup_SubGroups(), this.getRuleGroup(), null, "subGroups", null, 0, -1, RuleGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleGroup_ExpectedRuleValues(), this.getExpectedEvaluationValue(), null, "expectedRuleValues", null, 0, -1, RuleGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleGroup_Id(), ecorePackage.getEInt(), "id", null, 1, 1, RuleGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleGroup_JunctionType(), this.getJunctionType(), "junctionType", "and", 0, 1, RuleGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, RuleGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleGroup_Contextmodel(), this.getContextModel(), this.getContextModel_RuleGroups(), "contextmodel", null, 1, 1, RuleGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expectedEvaluationValueEClass, ExpectedEvaluationValue.class, "ExpectedEvaluationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpectedEvaluationValue_Value(), this.getTruthType(), "value", null, 0, 1, ExpectedEvaluationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpectedEvaluationValue_AssociatedRule(), this.getIdentificationRule(), null, "associatedRule", null, 1, 1, ExpectedEvaluationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(innerTransformationEClass, InnerTransformation.class, "InnerTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInnerTransformation_RequiredContext(), this.getContextModel(), null, "requiredContext", null, 1, 1, InnerTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInnerTransformation_Id(), ecorePackage.getEInt(), "id", null, 1, 1, InnerTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInnerTransformation_TurnTrue(), this.getIdentificationRule(), null, "turnTrue", null, 0, -1, InnerTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInnerTransformation_TurnFalse(), this.getIdentificationRule(), null, "turnFalse", null, 0, -1, InnerTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInnerTransformation_Name(), ecorePackage.getEString(), "name", null, 0, 1, InnerTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInnerTransformation_Description(), ecorePackage.getEString(), "description", null, 0, 1, InnerTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInnerTransformation_ClassPath(), ecorePackage.getEString(), "classPath", null, 0, 1, InnerTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(evaluationResultTypeEEnum, EvaluationResultType.class, "EvaluationResultType");
		addEEnumLiteral(evaluationResultTypeEEnum, EvaluationResultType.TRUE);
		addEEnumLiteral(evaluationResultTypeEEnum, EvaluationResultType.FALSE);
		addEEnumLiteral(evaluationResultTypeEEnum, EvaluationResultType.UNDEFINED);

		initEEnum(junctionTypeEEnum, JunctionType.class, "JunctionType");
		addEEnumLiteral(junctionTypeEEnum, JunctionType.AND);
		addEEnumLiteral(junctionTypeEEnum, JunctionType.OR);
		addEEnumLiteral(junctionTypeEEnum, JunctionType.XOR);

		initEEnum(truthTypeEEnum, TruthType.class, "TruthType");
		addEEnumLiteral(truthTypeEEnum, TruthType.TRUE);
		addEEnumLiteral(truthTypeEEnum, TruthType.FALSE);
		addEEnumLiteral(truthTypeEEnum, TruthType.NEUTRAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (analysisRepositoryEClass, 
		   source, 
		   new String[] {
			 "constraints", "IdCompliance_inv1 IdCompliance_inv2 IdCompliance_inv3"
		   });	
		addAnnotation
		  (testEClass, 
		   source, 
		   new String[] {
			 "constraints", "IdCompliance_inv4 Characteristic_inv1 Characteristic_inv2"
		   });	
		addAnnotation
		  (testImplementationEClass, 
		   source, 
		   new String[] {
			 "constraints", "TransformationUnique"
		   });	
		addAnnotation
		  (testCharacteristicTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "TestCharacteristicType_inv1"
		   });	
		addAnnotation
		  (transformationEClass, 
		   source, 
		   new String[] {
			 "constraints", "contextRelatedCompliance"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (analysisRepositoryEClass, 
		   source, 
		   new String[] {
			 "IdCompliance_inv1", "Tuple {\n\tmessage : String = \'Ids conflicts: there are at least 2 context models whose id is the same\',\n\tstatus : Boolean = allContextModels->forAll(ct1,ct2|ct1 <> ct2 implies ct1.id <> ct2.id)\n}.status",
			 "IdCompliance_inv2", "Tuple {\n\tmessage : String = \'Ids conflicts: there are at least 2 identification rules whose id is the same\',\n\tstatus : Boolean = allRules->forAll(ir1,ir2|ir1 <> ir2 implies ir1.id <> ir2.id)\n}.status",
			 "IdCompliance_inv3", "Tuple {\n\tmessage : String = \'Ids conflicts: there are at least 2 tests whose id is the same\',\n\tstatus : Boolean = allTests->forAll(t1,t2|t1 <> t2 implies t1.id <> t2.id)\n}.status"
		   });	
		addAnnotation
		  (testEClass, 
		   source, 
		   new String[] {
			 "IdCompliance_inv4", "Tuple {\n\tmessage : String = \'Error: Ids conflicts: there are at least 2 test implementations whose id is the same\',\n\tstatus : Boolean = self.implementations->forAll(impl1,impl2|impl1<>impl2 implies impl1.id<>impl2.id)\n}.status",
			 "Characteristic_inv1", "Tuple {\n\tmessage : String = \'Error: There are at least 1 sufficient conditions in a test\',\n\tstatus : Boolean = self.characteristics->selectByKind(SufficientCondition)->size()<2\n}.status",
			 "Characteristic_inv2", "Tuple {\n\tmessage : String = \'Error: There are at least 1 necessary conditions in a test\',\n\tstatus : Boolean = self.characteristics->selectByKind(NecessaryCondition)->size()<2\n}.status"
		   });	
		addAnnotation
		  (testImplementationEClass, 
		   source, 
		   new String[] {
			 "TransformationUnique", "self.transformation->size()<2"
		   });	
		addAnnotation
		  (testCharacteristicTypeEClass, 
		   source, 
		   new String[] {
			 "TestCharacteristicType_inv1", "Tuple {\n\tmessage : String = \'Please re-check the related contexts\',\n\tstatus : Boolean = self.referencedContexts->forAll(ct:ContextModel|ct.analysisTests.characteristics->includes(self))\n}.status"
		   });	
		addAnnotation
		  (transformationEClass, 
		   source, 
		   new String[] {
			 "contextRelatedCompliance", "Tuple {\n\tmessage : String = \'The context model specified is irrelevant\',\n\tstatus : Boolean = self.contextModel.analysisTests.implementations.transformation->includes(self)\n}.status"
		   });
	}

} //TyscoPackageImpl
