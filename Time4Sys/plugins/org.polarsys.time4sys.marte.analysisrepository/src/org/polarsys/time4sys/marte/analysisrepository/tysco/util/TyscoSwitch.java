/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.time4sys.marte.analysisrepository.tysco.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage
 * @generated
 */
public class TyscoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TyscoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyscoSwitch() {
		if (modelPackage == null) {
			modelPackage = TyscoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TyscoPackage.ANALYSIS_REPOSITORY: {
				AnalysisRepository analysisRepository = (AnalysisRepository)theEObject;
				T result = caseAnalysisRepository(analysisRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.CONTEXT_MODEL: {
				ContextModel contextModel = (ContextModel)theEObject;
				T result = caseContextModel(contextModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.TEST: {
				Test test = (Test)theEObject;
				T result = caseTest(test);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.IDENTIFICATION_RULE: {
				IdentificationRule identificationRule = (IdentificationRule)theEObject;
				T result = caseIdentificationRule(identificationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.TEST_IMPLEMENTATION: {
				TestImplementation testImplementation = (TestImplementation)theEObject;
				T result = caseTestImplementation(testImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.TEST_CHARACTERISTIC_TYPE: {
				TestCharacteristicType testCharacteristicType = (TestCharacteristicType)theEObject;
				T result = caseTestCharacteristicType(testCharacteristicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.SUSTAINABILITY_TYPE: {
				SustainabilityType sustainabilityType = (SustainabilityType)theEObject;
				T result = caseSustainabilityType(sustainabilityType);
				if (result == null) result = caseTestCharacteristicType(sustainabilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.DEADLINE_SUSTAINABILITY: {
				Deadline_Sustainability deadline_Sustainability = (Deadline_Sustainability)theEObject;
				T result = caseDeadline_Sustainability(deadline_Sustainability);
				if (result == null) result = caseSustainabilityType(deadline_Sustainability);
				if (result == null) result = caseTestCharacteristicType(deadline_Sustainability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.JITTER_SUSTAINABILITY: {
				Jitter_Sustainability jitter_Sustainability = (Jitter_Sustainability)theEObject;
				T result = caseJitter_Sustainability(jitter_Sustainability);
				if (result == null) result = caseSustainabilityType(jitter_Sustainability);
				if (result == null) result = caseTestCharacteristicType(jitter_Sustainability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.PERIOD_SUSTAINABILITY: {
				Period_Sustainability period_Sustainability = (Period_Sustainability)theEObject;
				T result = casePeriod_Sustainability(period_Sustainability);
				if (result == null) result = caseSustainabilityType(period_Sustainability);
				if (result == null) result = caseTestCharacteristicType(period_Sustainability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.EXECUTION_TIME_SUSTAINABILITY: {
				ExecutionTime_Sustainability executionTime_Sustainability = (ExecutionTime_Sustainability)theEObject;
				T result = caseExecutionTime_Sustainability(executionTime_Sustainability);
				if (result == null) result = caseSustainabilityType(executionTime_Sustainability);
				if (result == null) result = caseTestCharacteristicType(executionTime_Sustainability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.FEASIBILITY_TYPE: {
				FeasibilityType feasibilityType = (FeasibilityType)theEObject;
				T result = caseFeasibilityType(feasibilityType);
				if (result == null) result = caseTestCharacteristicType(feasibilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.SUFFICIENT_CONDITION: {
				SufficientCondition sufficientCondition = (SufficientCondition)theEObject;
				T result = caseSufficientCondition(sufficientCondition);
				if (result == null) result = caseFeasibilityType(sufficientCondition);
				if (result == null) result = caseTestCharacteristicType(sufficientCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.NECESSARY_CONDITION: {
				NecessaryCondition necessaryCondition = (NecessaryCondition)theEObject;
				T result = caseNecessaryCondition(necessaryCondition);
				if (result == null) result = caseFeasibilityType(necessaryCondition);
				if (result == null) result = caseTestCharacteristicType(necessaryCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				T result = caseTransformation(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.RULE_GROUP: {
				RuleGroup ruleGroup = (RuleGroup)theEObject;
				T result = caseRuleGroup(ruleGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.EXPECTED_EVALUATION_VALUE: {
				ExpectedEvaluationValue expectedEvaluationValue = (ExpectedEvaluationValue)theEObject;
				T result = caseExpectedEvaluationValue(expectedEvaluationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyscoPackage.INNER_TRANSFORMATION: {
				InnerTransformation innerTransformation = (InnerTransformation)theEObject;
				T result = caseInnerTransformation(innerTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisRepository(AnalysisRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextModel(ContextModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTest(Test object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identification Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identification Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentificationRule(IdentificationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestImplementation(TestImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Characteristic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Characteristic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestCharacteristicType(TestCharacteristicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sustainability Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sustainability Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSustainabilityType(SustainabilityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deadline Sustainability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deadline Sustainability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeadline_Sustainability(Deadline_Sustainability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jitter Sustainability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jitter Sustainability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJitter_Sustainability(Jitter_Sustainability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Period Sustainability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Period Sustainability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriod_Sustainability(Period_Sustainability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Time Sustainability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Time Sustainability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionTime_Sustainability(ExecutionTime_Sustainability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feasibility Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feasibility Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeasibilityType(FeasibilityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sufficient Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sufficient Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSufficientCondition(SufficientCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Necessary Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Necessary Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNecessaryCondition(NecessaryCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleGroup(RuleGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Evaluation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Evaluation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedEvaluationValue(ExpectedEvaluationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inner Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inner Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInnerTransformation(InnerTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TyscoSwitch
