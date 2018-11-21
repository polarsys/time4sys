/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage
 * @generated
 */
public interface TyscoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TyscoFactory eINSTANCE = org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TyscoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Analysis Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Repository</em>'.
	 * @generated
	 */
	AnalysisRepository createAnalysisRepository();

	/**
	 * Returns a new object of class '<em>Context Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Model</em>'.
	 * @generated
	 */
	ContextModel createContextModel();

	/**
	 * Returns a new object of class '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test</em>'.
	 * @generated
	 */
	Test createTest();

	/**
	 * Returns a new object of class '<em>Identification Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identification Rule</em>'.
	 * @generated
	 */
	IdentificationRule createIdentificationRule();

	/**
	 * Returns a new object of class '<em>Test Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Implementation</em>'.
	 * @generated
	 */
	TestImplementation createTestImplementation();

	/**
	 * Returns a new object of class '<em>Deadline Sustainability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deadline Sustainability</em>'.
	 * @generated
	 */
	Deadline_Sustainability createDeadline_Sustainability();

	/**
	 * Returns a new object of class '<em>Jitter Sustainability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jitter Sustainability</em>'.
	 * @generated
	 */
	Jitter_Sustainability createJitter_Sustainability();

	/**
	 * Returns a new object of class '<em>Period Sustainability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Period Sustainability</em>'.
	 * @generated
	 */
	Period_Sustainability createPeriod_Sustainability();

	/**
	 * Returns a new object of class '<em>Execution Time Sustainability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Time Sustainability</em>'.
	 * @generated
	 */
	ExecutionTime_Sustainability createExecutionTime_Sustainability();

	/**
	 * Returns a new object of class '<em>Sufficient Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sufficient Condition</em>'.
	 * @generated
	 */
	SufficientCondition createSufficientCondition();

	/**
	 * Returns a new object of class '<em>Necessary Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Necessary Condition</em>'.
	 * @generated
	 */
	NecessaryCondition createNecessaryCondition();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	Transformation createTransformation();

	/**
	 * Returns a new object of class '<em>Rule Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Group</em>'.
	 * @generated
	 */
	RuleGroup createRuleGroup();

	/**
	 * Returns a new object of class '<em>Expected Evaluation Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expected Evaluation Value</em>'.
	 * @generated
	 */
	ExpectedEvaluationValue createExpectedEvaluationValue();

	/**
	 * Returns a new object of class '<em>Inner Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inner Transformation</em>'.
	 * @generated
	 */
	InnerTransformation createInnerTransformation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TyscoPackage getTyscoPackage();

} //TyscoFactory
