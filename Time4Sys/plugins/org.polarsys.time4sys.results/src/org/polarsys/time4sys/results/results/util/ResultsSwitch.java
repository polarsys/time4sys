/**
 */
package org.polarsys.time4sys.results.results.util;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;
import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;

import org.polarsys.time4sys.results.results.*;

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
 * @see org.polarsys.time4sys.results.results.ResultsPackage
 * @generated
 */
public class ResultsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResultsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSwitch() {
		if (modelPackage == null) {
			modelPackage = ResultsPackage.eINSTANCE;
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
			case ResultsPackage.RESULT_SET_CONTAINER: {
				ResultSetContainer resultSetContainer = (ResultSetContainer)theEObject;
				T result = caseResultSetContainer(resultSetContainer);
				if (result == null) result = caseModelElement(resultSetContainer);
				if (result == null) result = caseEModelElement(resultSetContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.ANALYSIS_RESULT_SET: {
				AnalysisResultSet analysisResultSet = (AnalysisResultSet)theEObject;
				T result = caseAnalysisResultSet(analysisResultSet);
				if (result == null) result = caseNamedElement(analysisResultSet);
				if (result == null) result = caseAbstractResultSet(analysisResultSet);
				if (result == null) result = caseENamedElement(analysisResultSet);
				if (result == null) result = caseModelElement(analysisResultSet);
				if (result == null) result = caseEModelElement(analysisResultSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.TASK_CHAIN_RESULT: {
				TaskChainResult taskChainResult = (TaskChainResult)theEObject;
				T result = caseTaskChainResult(taskChainResult);
				if (result == null) result = caseTaskResult(taskChainResult);
				if (result == null) result = caseENamedElement(taskChainResult);
				if (result == null) result = caseModelElement(taskChainResult);
				if (result == null) result = caseAtomicResult(taskChainResult);
				if (result == null) result = caseEModelElement(taskChainResult);
				if (result == null) result = caseAbstractResult(taskChainResult);
				if (result == null) result = caseNamedElement(taskChainResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.SIMULATION_RESULT: {
				SimulationResult simulationResult = (SimulationResult)theEObject;
				T result = caseSimulationResult(simulationResult);
				if (result == null) result = caseNamedElement(simulationResult);
				if (result == null) result = caseAbstractResultSet(simulationResult);
				if (result == null) result = caseENamedElement(simulationResult);
				if (result == null) result = caseModelElement(simulationResult);
				if (result == null) result = caseEModelElement(simulationResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.ABSTRACT_RESULT_REFERENCE: {
				AbstractResultReference abstractResultReference = (AbstractResultReference)theEObject;
				T result = caseAbstractResultReference(abstractResultReference);
				if (result == null) result = caseAbstractResult(abstractResultReference);
				if (result == null) result = caseNamedElement(abstractResultReference);
				if (result == null) result = caseENamedElement(abstractResultReference);
				if (result == null) result = caseModelElement(abstractResultReference);
				if (result == null) result = caseEModelElement(abstractResultReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.CONTAINED_RESULT: {
				ContainedResult containedResult = (ContainedResult)theEObject;
				T result = caseContainedResult(containedResult);
				if (result == null) result = caseAbstractResultReference(containedResult);
				if (result == null) result = caseAbstractResult(containedResult);
				if (result == null) result = caseNamedElement(containedResult);
				if (result == null) result = caseENamedElement(containedResult);
				if (result == null) result = caseModelElement(containedResult);
				if (result == null) result = caseEModelElement(containedResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.REFERENCED_RESULT: {
				ReferencedResult referencedResult = (ReferencedResult)theEObject;
				T result = caseReferencedResult(referencedResult);
				if (result == null) result = caseAbstractResultReference(referencedResult);
				if (result == null) result = caseAbstractResult(referencedResult);
				if (result == null) result = caseNamedElement(referencedResult);
				if (result == null) result = caseENamedElement(referencedResult);
				if (result == null) result = caseModelElement(referencedResult);
				if (result == null) result = caseEModelElement(referencedResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.TASK_RESULT: {
				TaskResult taskResult = (TaskResult)theEObject;
				T result = caseTaskResult(taskResult);
				if (result == null) result = caseAtomicResult(taskResult);
				if (result == null) result = caseAbstractResult(taskResult);
				if (result == null) result = caseNamedElement(taskResult);
				if (result == null) result = caseENamedElement(taskResult);
				if (result == null) result = caseModelElement(taskResult);
				if (result == null) result = caseEModelElement(taskResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.SIMPLE_PERIODIC_EVENT: {
				SimplePeriodicEvent simplePeriodicEvent = (SimplePeriodicEvent)theEObject;
				T result = caseSimplePeriodicEvent(simplePeriodicEvent);
				if (result == null) result = caseEvent(simplePeriodicEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.SIMPLE_SPORADIC_EVENT: {
				SimpleSporadicEvent simpleSporadicEvent = (SimpleSporadicEvent)theEObject;
				T result = caseSimpleSporadicEvent(simpleSporadicEvent);
				if (result == null) result = caseEvent(simpleSporadicEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.ONCE_EVENT: {
				OnceEvent onceEvent = (OnceEvent)theEObject;
				T result = caseOnceEvent(onceEvent);
				if (result == null) result = caseEvent(onceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.SLIDING_WINDOW_EVENT: {
				SlidingWindowEvent slidingWindowEvent = (SlidingWindowEvent)theEObject;
				T result = caseSlidingWindowEvent(slidingWindowEvent);
				if (result == null) result = caseEvent(slidingWindowEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.TINDELL_EVENT: {
				TindellEvent tindellEvent = (TindellEvent)theEObject;
				T result = caseTindellEvent(tindellEvent);
				if (result == null) result = caseEvent(tindellEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.OFFSET: {
				Offset offset = (Offset)theEObject;
				T result = caseOffset(offset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.ATOMIC_RESULT: {
				AtomicResult atomicResult = (AtomicResult)theEObject;
				T result = caseAtomicResult(atomicResult);
				if (result == null) result = caseAbstractResult(atomicResult);
				if (result == null) result = caseNamedElement(atomicResult);
				if (result == null) result = caseENamedElement(atomicResult);
				if (result == null) result = caseModelElement(atomicResult);
				if (result == null) result = caseEModelElement(atomicResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.ABSTRACT_RESULT_SET: {
				AbstractResultSet abstractResultSet = (AbstractResultSet)theEObject;
				T result = caseAbstractResultSet(abstractResultSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.CUSTOM_TASK_RESULT: {
				CustomTaskResult customTaskResult = (CustomTaskResult)theEObject;
				T result = caseCustomTaskResult(customTaskResult);
				if (result == null) result = caseTaskResult(customTaskResult);
				if (result == null) result = caseAtomicResult(customTaskResult);
				if (result == null) result = caseAbstractResult(customTaskResult);
				if (result == null) result = caseNamedElement(customTaskResult);
				if (result == null) result = caseENamedElement(customTaskResult);
				if (result == null) result = caseModelElement(customTaskResult);
				if (result == null) result = caseEModelElement(customTaskResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.COMPUTING_RESOURCE_RESULT: {
				ComputingResourceResult computingResourceResult = (ComputingResourceResult)theEObject;
				T result = caseComputingResourceResult(computingResourceResult);
				if (result == null) result = caseAtomicResult(computingResourceResult);
				if (result == null) result = caseAbstractResult(computingResourceResult);
				if (result == null) result = caseNamedElement(computingResourceResult);
				if (result == null) result = caseENamedElement(computingResourceResult);
				if (result == null) result = caseModelElement(computingResourceResult);
				if (result == null) result = caseEModelElement(computingResourceResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.SHARED_RESOURCE_RESULT: {
				SharedResourceResult sharedResourceResult = (SharedResourceResult)theEObject;
				T result = caseSharedResourceResult(sharedResourceResult);
				if (result == null) result = caseAtomicResult(sharedResourceResult);
				if (result == null) result = caseAbstractResult(sharedResourceResult);
				if (result == null) result = caseNamedElement(sharedResourceResult);
				if (result == null) result = caseENamedElement(sharedResourceResult);
				if (result == null) result = caseModelElement(sharedResourceResult);
				if (result == null) result = caseEModelElement(sharedResourceResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseENamedElement(parameter);
				if (result == null) result = caseModelElement(parameter);
				if (result == null) result = caseEModelElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.ABSTRACT_RESULT: {
				AbstractResult abstractResult = (AbstractResult)theEObject;
				T result = caseAbstractResult(abstractResult);
				if (result == null) result = caseNamedElement(abstractResult);
				if (result == null) result = caseENamedElement(abstractResult);
				if (result == null) result = caseModelElement(abstractResult);
				if (result == null) result = caseEModelElement(abstractResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Set Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Set Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultSetContainer(ResultSetContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis Result Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis Result Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisResultSet(AnalysisResultSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Chain Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Chain Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskChainResult(TaskChainResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulationResult(SimulationResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Result Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Result Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractResultReference(AbstractResultReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractResult(AbstractResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contained Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contained Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainedResult(ContainedResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenced Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenced Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencedResult(ReferencedResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskResult(TaskResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Periodic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Periodic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimplePeriodicEvent(SimplePeriodicEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Sporadic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Sporadic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleSporadicEvent(SimpleSporadicEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Once Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Once Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnceEvent(OnceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sliding Window Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sliding Window Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlidingWindowEvent(SlidingWindowEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tindell Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tindell Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTindellEvent(TindellEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffset(Offset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicResult(AtomicResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Result Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Result Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractResultSet(AbstractResultSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Task Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Task Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomTaskResult(CustomTaskResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computing Resource Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing Resource Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputingResourceResult(ComputingResourceResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Resource Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Resource Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedResourceResult(SharedResourceResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENamedElement(ENamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
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

} //ResultsSwitch
