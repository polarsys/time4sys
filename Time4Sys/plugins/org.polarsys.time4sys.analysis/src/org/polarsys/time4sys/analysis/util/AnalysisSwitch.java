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
package org.polarsys.time4sys.analysis.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.polarsys.time4sys.analysis.*;

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
 * @see org.polarsys.time4sys.analysis.AnalysisPackage
 * @generated
 */
public class AnalysisSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnalysisPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisSwitch() {
		if (modelPackage == null) {
			modelPackage = AnalysisPackage.eINSTANCE;
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
			case AnalysisPackage.ANALYZED_SYSTEM: {
				AnalyzedSystem analyzedSystem = (AnalyzedSystem)theEObject;
				T result = caseAnalyzedSystem(analyzedSystem);
				if (result == null) result = caseNamedElement(analyzedSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.COMMUNICATION: {
				Communication communication = (Communication)theEObject;
				T result = caseCommunication(communication);
				if (result == null) result = caseSchedulableElement(communication);
				if (result == null) result = caseEventModelContainer(communication);
				if (result == null) result = casePortContainer(communication);
				if (result == null) result = caseNamedElement(communication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.COMMUNICATION_RESOURCE: {
				CommunicationResource communicationResource = (CommunicationResource)theEObject;
				T result = caseCommunicationResource(communicationResource);
				if (result == null) result = caseResource(communicationResource);
				if (result == null) result = caseNamedElement(communicationResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.COMPUTING_RESOURCE: {
				ComputingResource computingResource = (ComputingResource)theEObject;
				T result = caseComputingResource(computingResource);
				if (result == null) result = caseResource(computingResource);
				if (result == null) result = caseNamedElement(computingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.CONSTRAINT_CONTAINER: {
				ConstraintContainer constraintContainer = (ConstraintContainer)theEObject;
				T result = caseConstraintContainer(constraintContainer);
				if (result == null) result = caseNamedElement(constraintContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.DELAY: {
				Delay delay = (Delay)theEObject;
				T result = caseDelay(delay);
				if (result == null) result = caseEventModelContainer(delay);
				if (result == null) result = casePortContainer(delay);
				if (result == null) result = caseNamedElement(delay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.EVENT_MODEL: {
				EventModel eventModel = (EventModel)theEObject;
				T result = caseEventModel(eventModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.EVENT_MODEL_CONTAINER: {
				EventModelContainer eventModelContainer = (EventModelContainer)theEObject;
				T result = caseEventModelContainer(eventModelContainer);
				if (result == null) result = caseNamedElement(eventModelContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.FRAGMENT: {
				Fragment fragment = (Fragment)theEObject;
				T result = caseFragment(fragment);
				if (result == null) result = caseNamedElement(fragment);
				if (result == null) result = caseSynchronizableElement(fragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.INPUT_PORT: {
				InputPort inputPort = (InputPort)theEObject;
				T result = caseInputPort(inputPort);
				if (result == null) result = casePort(inputPort);
				if (result == null) result = caseEventModelContainer(inputPort);
				if (result == null) result = caseNamedElement(inputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.INPUT_STIMULUS: {
				InputStimulus inputStimulus = (InputStimulus)theEObject;
				T result = caseInputStimulus(inputStimulus);
				if (result == null) result = caseStimulus(inputStimulus);
				if (result == null) result = caseEventModelContainer(inputStimulus);
				if (result == null) result = caseNamedElement(inputStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.MEMORY_RESOURCE: {
				MemoryResource memoryResource = (MemoryResource)theEObject;
				T result = caseMemoryResource(memoryResource);
				if (result == null) result = caseResource(memoryResource);
				if (result == null) result = caseNamedElement(memoryResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE: {
				MutualExclusionResource mutualExclusionResource = (MutualExclusionResource)theEObject;
				T result = caseMutualExclusionResource(mutualExclusionResource);
				if (result == null) result = caseNamedElement(mutualExclusionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.OFFSET: {
				Offset offset = (Offset)theEObject;
				T result = caseOffset(offset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.OUTPUT_PORT: {
				OutputPort outputPort = (OutputPort)theEObject;
				T result = caseOutputPort(outputPort);
				if (result == null) result = casePort(outputPort);
				if (result == null) result = caseEventModelContainer(outputPort);
				if (result == null) result = caseNamedElement(outputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.OUTPUT_STIMULUS: {
				OutputStimulus outputStimulus = (OutputStimulus)theEObject;
				T result = caseOutputStimulus(outputStimulus);
				if (result == null) result = caseStimulus(outputStimulus);
				if (result == null) result = caseEventModelContainer(outputStimulus);
				if (result == null) result = caseNamedElement(outputStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseEventModelContainer(port);
				if (result == null) result = caseNamedElement(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.PORT_CONTAINER: {
				PortContainer portContainer = (PortContainer)theEObject;
				T result = casePortContainer(portContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.PROTECTION_PARAMETER_VALUE: {
				ProtectionParameterValue protectionParameterValue = (ProtectionParameterValue)theEObject;
				T result = caseProtectionParameterValue(protectionParameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.PROTECTION_PROTOCOL: {
				ProtectionProtocol protectionProtocol = (ProtectionProtocol)theEObject;
				T result = caseProtectionProtocol(protectionProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.REQUIRED_PROTECTION_PARAMETER: {
				RequiredProtectionParameter requiredProtectionParameter = (RequiredProtectionParameter)theEObject;
				T result = caseRequiredProtectionParameter(requiredProtectionParameter);
				if (result == null) result = caseNamedElement(requiredProtectionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.REQUIRED_SCHEDULING_PARAMETER: {
				RequiredSchedulingParameter requiredSchedulingParameter = (RequiredSchedulingParameter)theEObject;
				T result = caseRequiredSchedulingParameter(requiredSchedulingParameter);
				if (result == null) result = caseNamedElement(requiredSchedulingParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseNamedElement(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.RESOURCE_SCHEDULING_PARAMETER_VALUE: {
				ResourceSchedulingParameterValue resourceSchedulingParameterValue = (ResourceSchedulingParameterValue)theEObject;
				T result = caseResourceSchedulingParameterValue(resourceSchedulingParameterValue);
				if (result == null) result = caseNamedElement(resourceSchedulingParameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.RESULT_CONTAINER: {
				ResultContainer resultContainer = (ResultContainer)theEObject;
				T result = caseResultContainer(resultContainer);
				if (result == null) result = caseNamedElement(resultContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.SCHEDULABLE_ELEMENT: {
				SchedulableElement schedulableElement = (SchedulableElement)theEObject;
				T result = caseSchedulableElement(schedulableElement);
				if (result == null) result = caseEventModelContainer(schedulableElement);
				if (result == null) result = casePortContainer(schedulableElement);
				if (result == null) result = caseNamedElement(schedulableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.SCHEDULER_PARAMETER_VALUE: {
				SchedulerParameterValue schedulerParameterValue = (SchedulerParameterValue)theEObject;
				T result = caseSchedulerParameterValue(schedulerParameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.SCHEDULER: {
				Scheduler scheduler = (Scheduler)theEObject;
				T result = caseScheduler(scheduler);
				if (result == null) result = caseNamedElement(scheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.STIMULUS: {
				Stimulus stimulus = (Stimulus)theEObject;
				T result = caseStimulus(stimulus);
				if (result == null) result = caseEventModelContainer(stimulus);
				if (result == null) result = caseNamedElement(stimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.SYNCHRONIZABLE_ELEMENT: {
				SynchronizableElement synchronizableElement = (SynchronizableElement)theEObject;
				T result = caseSynchronizableElement(synchronizableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseSchedulableElement(task);
				if (result == null) result = caseSynchronizableElement(task);
				if (result == null) result = caseEventModelContainer(task);
				if (result == null) result = casePortContainer(task);
				if (result == null) result = caseNamedElement(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.RESOURCE_PROTECTION_PARAMETER_VALUE: {
				ResourceProtectionParameterValue resourceProtectionParameterValue = (ResourceProtectionParameterValue)theEObject;
				T result = caseResourceProtectionParameterValue(resourceProtectionParameterValue);
				if (result == null) result = caseNamedElement(resourceProtectionParameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisPackage.TWCA_EVENT_MODEL: {
				TwcaEventModel twcaEventModel = (TwcaEventModel)theEObject;
				T result = caseTwcaEventModel(twcaEventModel);
				if (result == null) result = caseEventModel(twcaEventModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analyzed System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analyzed System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalyzedSystem(AnalyzedSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunication(Communication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationResource(CommunicationResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputingResource(ComputingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintContainer(ConstraintContainer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Event Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventModel(EventModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Model Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Model Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventModelContainer(EventModelContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFragment(Fragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPort(InputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputStimulus(InputStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryResource(MemoryResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mutual Exclusion Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mutual Exclusion Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMutualExclusionResource(MutualExclusionResource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPort(OutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputStimulus(OutputStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortContainer(PortContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protection Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protection Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtectionParameterValue(ProtectionParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protection Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protection Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtectionProtocol(ProtectionProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Protection Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Protection Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredProtectionParameter(RequiredProtectionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Scheduling Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Scheduling Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredSchedulingParameter(RequiredSchedulingParameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Resource Scheduling Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Scheduling Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceSchedulingParameterValue(ResourceSchedulingParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultContainer(ResultContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedulable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedulable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulableElement(SchedulableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduler Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduler Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulerParameterValue(SchedulerParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduler(Scheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStimulus(Stimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronizable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronizable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizableElement(SynchronizableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Protection Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Protection Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceProtectionParameterValue(ResourceProtectionParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Twca Event Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Twca Event Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwcaEventModel(TwcaEventModel object) {
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

} //AnalysisSwitch
