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
package org.polarsys.time4sys.marte.gqam.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.time4sys.marte.gqam.*;

import org.polarsys.time4sys.marte.grm.ConcurrencyResource;
import org.polarsys.time4sys.marte.grm.NamedElement;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourcePackageableElement;
import org.polarsys.time4sys.marte.grm.SchedulableResource;

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
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage
 * @generated
 */
public class GqamSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GqamPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GqamSwitch() {
		if (modelPackage == null) {
			modelPackage = GqamPackage.eINSTANCE;
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
			case GqamPackage.ACQUIRE_STEP: {
				AcquireStep acquireStep = (AcquireStep)theEObject;
				T result = caseAcquireStep(acquireStep);
				if (result == null) result = caseStep(acquireStep);
				if (result == null) result = caseBehaviorScenario(acquireStep);
				if (result == null) result = caseNamedElement(acquireStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.ARRIVAL_PATTERN: {
				ArrivalPattern arrivalPattern = (ArrivalPattern)theEObject;
				T result = caseArrivalPattern(arrivalPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.BEHAVIOR_SCENARIO: {
				BehaviorScenario behaviorScenario = (BehaviorScenario)theEObject;
				T result = caseBehaviorScenario(behaviorScenario);
				if (result == null) result = caseNamedElement(behaviorScenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.BURST_PATTERN: {
				BurstPattern burstPattern = (BurstPattern)theEObject;
				T result = caseBurstPattern(burstPattern);
				if (result == null) result = caseArrivalPattern(burstPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.CLOSED_PATTERN: {
				ClosedPattern closedPattern = (ClosedPattern)theEObject;
				T result = caseClosedPattern(closedPattern);
				if (result == null) result = caseArrivalPattern(closedPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.COMMUNICATION_CHANNEL: {
				CommunicationChannel communicationChannel = (CommunicationChannel)theEObject;
				T result = caseCommunicationChannel(communicationChannel);
				if (result == null) result = caseSchedulableResource(communicationChannel);
				if (result == null) result = caseConcurrencyResource(communicationChannel);
				if (result == null) result = caseResource(communicationChannel);
				if (result == null) result = caseResourcePackageableElement(communicationChannel);
				if (result == null) result = caseNamedElement(communicationChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.COMMUNICATION_STEP: {
				CommunicationStep communicationStep = (CommunicationStep)theEObject;
				T result = caseCommunicationStep(communicationStep);
				if (result == null) result = caseStep(communicationStep);
				if (result == null) result = caseBehaviorScenario(communicationStep);
				if (result == null) result = caseNamedElement(communicationStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.CONTROL_PIN: {
				ControlPin controlPin = (ControlPin)theEObject;
				T result = caseControlPin(controlPin);
				if (result == null) result = caseMultiplicityElement(controlPin);
				if (result == null) result = caseNamedElement(controlPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.DELAY: {
				Delay delay = (Delay)theEObject;
				T result = caseDelay(delay);
				if (result == null) result = caseStep(delay);
				if (result == null) result = caseBehaviorScenario(delay);
				if (result == null) result = caseNamedElement(delay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.END_TO_END_FLOW: {
				EndToEndFlow endToEndFlow = (EndToEndFlow)theEObject;
				T result = caseEndToEndFlow(endToEndFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.EXECUTION_STEP: {
				ExecutionStep executionStep = (ExecutionStep)theEObject;
				T result = caseExecutionStep(executionStep);
				if (result == null) result = caseStep(executionStep);
				if (result == null) result = caseBehaviorScenario(executionStep);
				if (result == null) result = caseNamedElement(executionStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.INPUT_PIN: {
				InputPin inputPin = (InputPin)theEObject;
				T result = caseInputPin(inputPin);
				if (result == null) result = caseControlPin(inputPin);
				if (result == null) result = caseMultiplicityElement(inputPin);
				if (result == null) result = caseNamedElement(inputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.MULTIPLICITY_ELEMENT: {
				MultiplicityElement multiplicityElement = (MultiplicityElement)theEObject;
				T result = caseMultiplicityElement(multiplicityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.ONCE: {
				Once once = (Once)theEObject;
				T result = caseOnce(once);
				if (result == null) result = caseArrivalPattern(once);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.OUTPUT_PIN: {
				OutputPin outputPin = (OutputPin)theEObject;
				T result = caseOutputPin(outputPin);
				if (result == null) result = caseControlPin(outputPin);
				if (result == null) result = caseMultiplicityElement(outputPin);
				if (result == null) result = caseNamedElement(outputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.PERIODIC_PATTERN: {
				PeriodicPattern periodicPattern = (PeriodicPattern)theEObject;
				T result = casePeriodicPattern(periodicPattern);
				if (result == null) result = caseArrivalPattern(periodicPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.PRECEDENCE_RELATION: {
				PrecedenceRelation precedenceRelation = (PrecedenceRelation)theEObject;
				T result = casePrecedenceRelation(precedenceRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.RELEASE_STEP: {
				ReleaseStep releaseStep = (ReleaseStep)theEObject;
				T result = caseReleaseStep(releaseStep);
				if (result == null) result = caseStep(releaseStep);
				if (result == null) result = caseBehaviorScenario(releaseStep);
				if (result == null) result = caseNamedElement(releaseStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.REQUESTED_SERVICE: {
				RequestedService requestedService = (RequestedService)theEObject;
				T result = caseRequestedService(requestedService);
				if (result == null) result = caseStep(requestedService);
				if (result == null) result = caseBehaviorScenario(requestedService);
				if (result == null) result = caseNamedElement(requestedService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.SLIDING_WINDOW_PATTERN: {
				SlidingWindowPattern slidingWindowPattern = (SlidingWindowPattern)theEObject;
				T result = caseSlidingWindowPattern(slidingWindowPattern);
				if (result == null) result = caseArrivalPattern(slidingWindowPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.SPORADIC_PATTERN: {
				SporadicPattern sporadicPattern = (SporadicPattern)theEObject;
				T result = caseSporadicPattern(sporadicPattern);
				if (result == null) result = caseArrivalPattern(sporadicPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseBehaviorScenario(step);
				if (result == null) result = caseNamedElement(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.WORKLOAD_EVENT: {
				WorkloadEvent workloadEvent = (WorkloadEvent)theEObject;
				T result = caseWorkloadEvent(workloadEvent);
				if (result == null) result = caseNamedElement(workloadEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GqamPackage.WORKLOAD_BEHAVIOR: {
				WorkloadBehavior workloadBehavior = (WorkloadBehavior)theEObject;
				T result = caseWorkloadBehavior(workloadBehavior);
				if (result == null) result = caseNamedElement(workloadBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorScenario(BehaviorScenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Burst Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Burst Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBurstPattern(BurstPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Closed Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Closed Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosedPattern(ClosedPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workload Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workload Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkloadEvent(WorkloadEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedenceRelation(PrecedenceRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workload Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workload Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkloadBehavior(WorkloadBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelay(Delay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElement(MultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlPin(ControlPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPin(InputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPin(OutputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Once</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Once</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnce(Once object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationChannel(CommunicationChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationStep(CommunicationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acquire Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acquire Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcquireStep(AcquireStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseStep(ReleaseStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requested Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requested Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestedService(RequestedService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sliding Window Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sliding Window Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlidingWindowPattern(SlidingWindowPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionStep(ExecutionStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrival Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrival Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrivalPattern(ArrivalPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicPattern(PeriodicPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sporadic Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sporadic Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSporadicPattern(SporadicPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End To End Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End To End Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndToEndFlow(EndToEndFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Resource Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcePackageableElement(ResourcePackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concurrency Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concurrency Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcurrencyResource(ConcurrencyResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedulable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedulable Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulableResource(SchedulableResource object) {
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

} //GqamSwitch
