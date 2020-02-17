/**
 */
package org.polarsys.time4sys.results.results;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.results.results.ResultsPackage
 * @generated
 */
public interface ResultsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultsFactory eINSTANCE = org.polarsys.time4sys.results.results.impl.ResultsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Result Set Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Set Container</em>'.
	 * @generated
	 */
	ResultSetContainer createResultSetContainer();

	/**
	 * Returns a new object of class '<em>Analysis Result Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Result Set</em>'.
	 * @generated
	 */
	AnalysisResultSet createAnalysisResultSet();

	/**
	 * Returns a new object of class '<em>Task Chain Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Chain Result</em>'.
	 * @generated
	 */
	TaskChainResult createTaskChainResult();

	/**
	 * Returns a new object of class '<em>Simulation Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulation Result</em>'.
	 * @generated
	 */
	SimulationResult createSimulationResult();

	/**
	 * Returns a new object of class '<em>Contained Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contained Result</em>'.
	 * @generated
	 */
	ContainedResult createContainedResult();

	/**
	 * Returns a new object of class '<em>Referenced Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referenced Result</em>'.
	 * @generated
	 */
	ReferencedResult createReferencedResult();

	/**
	 * Returns a new object of class '<em>Task Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Result</em>'.
	 * @generated
	 */
	TaskResult createTaskResult();

	/**
	 * Returns a new object of class '<em>Simple Periodic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Periodic Event</em>'.
	 * @generated
	 */
	SimplePeriodicEvent createSimplePeriodicEvent();

	/**
	 * Returns a new object of class '<em>Simple Sporadic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Sporadic Event</em>'.
	 * @generated
	 */
	SimpleSporadicEvent createSimpleSporadicEvent();

	/**
	 * Returns a new object of class '<em>Once Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Once Event</em>'.
	 * @generated
	 */
	OnceEvent createOnceEvent();

	/**
	 * Returns a new object of class '<em>Sliding Window Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sliding Window Event</em>'.
	 * @generated
	 */
	SlidingWindowEvent createSlidingWindowEvent();

	/**
	 * Returns a new object of class '<em>Tindell Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tindell Event</em>'.
	 * @generated
	 */
	TindellEvent createTindellEvent();

	/**
	 * Returns a new object of class '<em>Offset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offset</em>'.
	 * @generated
	 */
	Offset createOffset();

	/**
	 * Returns a new object of class '<em>Custom Task Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Task Result</em>'.
	 * @generated
	 */
	CustomTaskResult createCustomTaskResult();

	/**
	 * Returns a new object of class '<em>Computing Resource Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computing Resource Result</em>'.
	 * @generated
	 */
	ComputingResourceResult createComputingResourceResult();

	/**
	 * Returns a new object of class '<em>Shared Resource Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Resource Result</em>'.
	 * @generated
	 */
	SharedResourceResult createSharedResourceResult();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResultsPackage getResultsPackage();

} //ResultsFactory
