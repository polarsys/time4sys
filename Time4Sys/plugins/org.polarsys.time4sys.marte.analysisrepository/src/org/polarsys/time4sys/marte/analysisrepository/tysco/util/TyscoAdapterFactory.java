/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.time4sys.marte.analysisrepository.tysco.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage
 * @generated
 */
public class TyscoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TyscoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyscoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TyscoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TyscoSwitch<Adapter> modelSwitch =
		new TyscoSwitch<Adapter>() {
			@Override
			public Adapter caseAnalysisRepository(AnalysisRepository object) {
				return createAnalysisRepositoryAdapter();
			}
			@Override
			public Adapter caseContextModel(ContextModel object) {
				return createContextModelAdapter();
			}
			@Override
			public Adapter caseTest(Test object) {
				return createTestAdapter();
			}
			@Override
			public Adapter caseIdentificationRule(IdentificationRule object) {
				return createIdentificationRuleAdapter();
			}
			@Override
			public Adapter caseTestImplementation(TestImplementation object) {
				return createTestImplementationAdapter();
			}
			@Override
			public Adapter caseTestCharacteristicType(TestCharacteristicType object) {
				return createTestCharacteristicTypeAdapter();
			}
			@Override
			public Adapter caseSustainabilityType(SustainabilityType object) {
				return createSustainabilityTypeAdapter();
			}
			@Override
			public Adapter caseDeadline_Sustainability(Deadline_Sustainability object) {
				return createDeadline_SustainabilityAdapter();
			}
			@Override
			public Adapter caseJitter_Sustainability(Jitter_Sustainability object) {
				return createJitter_SustainabilityAdapter();
			}
			@Override
			public Adapter casePeriod_Sustainability(Period_Sustainability object) {
				return createPeriod_SustainabilityAdapter();
			}
			@Override
			public Adapter caseExecutionTime_Sustainability(ExecutionTime_Sustainability object) {
				return createExecutionTime_SustainabilityAdapter();
			}
			@Override
			public Adapter caseFeasibilityType(FeasibilityType object) {
				return createFeasibilityTypeAdapter();
			}
			@Override
			public Adapter caseSufficientCondition(SufficientCondition object) {
				return createSufficientConditionAdapter();
			}
			@Override
			public Adapter caseNecessaryCondition(NecessaryCondition object) {
				return createNecessaryConditionAdapter();
			}
			@Override
			public Adapter caseTransformation(Transformation object) {
				return createTransformationAdapter();
			}
			@Override
			public Adapter caseRuleGroup(RuleGroup object) {
				return createRuleGroupAdapter();
			}
			@Override
			public Adapter caseExpectedEvaluationValue(ExpectedEvaluationValue object) {
				return createExpectedEvaluationValueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository <em>Analysis Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository
	 * @generated
	 */
	public Adapter createAnalysisRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel
	 * @generated
	 */
	public Adapter createContextModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Test
	 * @generated
	 */
	public Adapter createTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule <em>Identification Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule
	 * @generated
	 */
	public Adapter createIdentificationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation <em>Test Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation
	 * @generated
	 */
	public Adapter createTestImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestCharacteristicType <em>Test Characteristic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TestCharacteristicType
	 * @generated
	 */
	public Adapter createTestCharacteristicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.SustainabilityType <em>Sustainability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.SustainabilityType
	 * @generated
	 */
	public Adapter createSustainabilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Deadline_Sustainability <em>Deadline Sustainability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Deadline_Sustainability
	 * @generated
	 */
	public Adapter createDeadline_SustainabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Jitter_Sustainability <em>Jitter Sustainability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Jitter_Sustainability
	 * @generated
	 */
	public Adapter createJitter_SustainabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Period_Sustainability <em>Period Sustainability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Period_Sustainability
	 * @generated
	 */
	public Adapter createPeriod_SustainabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ExecutionTime_Sustainability <em>Execution Time Sustainability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ExecutionTime_Sustainability
	 * @generated
	 */
	public Adapter createExecutionTime_SustainabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.FeasibilityType <em>Feasibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.FeasibilityType
	 * @generated
	 */
	public Adapter createFeasibilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.SufficientCondition <em>Sufficient Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.SufficientCondition
	 * @generated
	 */
	public Adapter createSufficientConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.NecessaryCondition <em>Necessary Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.NecessaryCondition
	 * @generated
	 */
	public Adapter createNecessaryConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup <em>Rule Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup
	 * @generated
	 */
	public Adapter createRuleGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue <em>Expected Evaluation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue
	 * @generated
	 */
	public Adapter createExpectedEvaluationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TyscoAdapterFactory
