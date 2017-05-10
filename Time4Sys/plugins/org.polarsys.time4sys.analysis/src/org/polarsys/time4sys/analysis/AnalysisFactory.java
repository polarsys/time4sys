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
package org.polarsys.time4sys.analysis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.analysis.AnalysisPackage
 * @generated
 */
public interface AnalysisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysisFactory eINSTANCE = org.polarsys.time4sys.analysis.impl.AnalysisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Analyzed System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analyzed System</em>'.
	 * @generated
	 */
	AnalyzedSystem createAnalyzedSystem();

	/**
	 * Returns a new object of class '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication</em>'.
	 * @generated
	 */
	Communication createCommunication();

	/**
	 * Returns a new object of class '<em>Communication Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Resource</em>'.
	 * @generated
	 */
	CommunicationResource createCommunicationResource();

	/**
	 * Returns a new object of class '<em>Computing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computing Resource</em>'.
	 * @generated
	 */
	ComputingResource createComputingResource();

	/**
	 * Returns a new object of class '<em>Constraint Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Container</em>'.
	 * @generated
	 */
	ConstraintContainer createConstraintContainer();

	/**
	 * Returns a new object of class '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay</em>'.
	 * @generated
	 */
	Delay createDelay();

	/**
	 * Returns a new object of class '<em>Event Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Model</em>'.
	 * @generated
	 */
	EventModel createEventModel();

	/**
	 * Returns a new object of class '<em>Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fragment</em>'.
	 * @generated
	 */
	Fragment createFragment();

	/**
	 * Returns a new object of class '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Port</em>'.
	 * @generated
	 */
	InputPort createInputPort();

	/**
	 * Returns a new object of class '<em>Input Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Stimulus</em>'.
	 * @generated
	 */
	InputStimulus createInputStimulus();

	/**
	 * Returns a new object of class '<em>Memory Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Resource</em>'.
	 * @generated
	 */
	MemoryResource createMemoryResource();

	/**
	 * Returns a new object of class '<em>Mutual Exclusion Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mutual Exclusion Resource</em>'.
	 * @generated
	 */
	MutualExclusionResource createMutualExclusionResource();

	/**
	 * Returns a new object of class '<em>Offset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offset</em>'.
	 * @generated
	 */
	Offset createOffset();

	/**
	 * Returns a new object of class '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Port</em>'.
	 * @generated
	 */
	OutputPort createOutputPort();

	/**
	 * Returns a new object of class '<em>Output Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Stimulus</em>'.
	 * @generated
	 */
	OutputStimulus createOutputStimulus();

	/**
	 * Returns a new object of class '<em>Protection Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protection Parameter Value</em>'.
	 * @generated
	 */
	ProtectionParameterValue createProtectionParameterValue();

	/**
	 * Returns a new object of class '<em>Protection Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protection Protocol</em>'.
	 * @generated
	 */
	ProtectionProtocol createProtectionProtocol();

	/**
	 * Returns a new object of class '<em>Required Protection Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Protection Parameter</em>'.
	 * @generated
	 */
	RequiredProtectionParameter createRequiredProtectionParameter();

	/**
	 * Returns a new object of class '<em>Required Scheduling Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Scheduling Parameter</em>'.
	 * @generated
	 */
	RequiredSchedulingParameter createRequiredSchedulingParameter();

	/**
	 * Returns a new object of class '<em>Resource Scheduling Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Scheduling Parameter Value</em>'.
	 * @generated
	 */
	ResourceSchedulingParameterValue createResourceSchedulingParameterValue();

	/**
	 * Returns a new object of class '<em>Result Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Container</em>'.
	 * @generated
	 */
	ResultContainer createResultContainer();

	/**
	 * Returns a new object of class '<em>Scheduler Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduler Parameter Value</em>'.
	 * @generated
	 */
	SchedulerParameterValue createSchedulerParameterValue();

	/**
	 * Returns a new object of class '<em>Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduler</em>'.
	 * @generated
	 */
	Scheduler createScheduler();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Resource Protection Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Protection Parameter Value</em>'.
	 * @generated
	 */
	ResourceProtectionParameterValue createResourceProtectionParameterValue();

	/**
	 * Returns a new object of class '<em>Twca Event Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Twca Event Model</em>'.
	 * @generated
	 */
	TwcaEventModel createTwcaEventModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnalysisPackage getAnalysisPackage();

} //AnalysisFactory
