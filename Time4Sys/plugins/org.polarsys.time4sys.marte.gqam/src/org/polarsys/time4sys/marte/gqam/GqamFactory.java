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
package org.polarsys.time4sys.marte.gqam;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage
 * @generated
 */
public interface GqamFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GqamFactory eINSTANCE = org.polarsys.time4sys.marte.gqam.impl.GqamFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behavior Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Scenario</em>'.
	 * @generated
	 */
	BehaviorScenario createBehaviorScenario();

	/**
	 * Returns a new object of class '<em>Burst Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Burst Pattern</em>'.
	 * @generated
	 */
	BurstPattern createBurstPattern();

	/**
	 * Returns a new object of class '<em>Closed Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Closed Pattern</em>'.
	 * @generated
	 */
	ClosedPattern createClosedPattern();

	/**
	 * Returns a new object of class '<em>Workload Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workload Event</em>'.
	 * @generated
	 */
	WorkloadEvent createWorkloadEvent();

	/**
	 * Returns a new object of class '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	Step createStep();

	/**
	 * Returns a new object of class '<em>Precedence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precedence Relation</em>'.
	 * @generated
	 */
	PrecedenceRelation createPrecedenceRelation();

	/**
	 * Returns a new object of class '<em>Workload Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workload Behavior</em>'.
	 * @generated
	 */
	WorkloadBehavior createWorkloadBehavior();

	/**
	 * Returns a new object of class '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay</em>'.
	 * @generated
	 */
	Delay createDelay();

	/**
	 * Returns a new object of class '<em>Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Pin</em>'.
	 * @generated
	 */
	InputPin createInputPin();

	/**
	 * Returns a new object of class '<em>Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Pin</em>'.
	 * @generated
	 */
	OutputPin createOutputPin();

	/**
	 * Returns a new object of class '<em>Once</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Once</em>'.
	 * @generated
	 */
	Once createOnce();

	/**
	 * Returns a new object of class '<em>Communication Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Channel</em>'.
	 * @generated
	 */
	CommunicationChannel createCommunicationChannel();

	/**
	 * Returns a new object of class '<em>Communication Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Step</em>'.
	 * @generated
	 */
	CommunicationStep createCommunicationStep();

	/**
	 * Returns a new object of class '<em>Acquire Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acquire Step</em>'.
	 * @generated
	 */
	AcquireStep createAcquireStep();

	/**
	 * Returns a new object of class '<em>Release Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release Step</em>'.
	 * @generated
	 */
	ReleaseStep createReleaseStep();

	/**
	 * Returns a new object of class '<em>Requested Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requested Service</em>'.
	 * @generated
	 */
	RequestedService createRequestedService();

	/**
	 * Returns a new object of class '<em>Resource Service Excecution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Service Excecution</em>'.
	 * @generated
	 */
	ResourceServiceExcecution createResourceServiceExcecution();

	/**
	 * Returns a new object of class '<em>Sliding Window Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sliding Window Pattern</em>'.
	 * @generated
	 */
	SlidingWindowPattern createSlidingWindowPattern();

	/**
	 * Returns a new object of class '<em>Execution Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Step</em>'.
	 * @generated
	 */
	ExecutionStep createExecutionStep();

	/**
	 * Returns a new object of class '<em>Periodic Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Pattern</em>'.
	 * @generated
	 */
	PeriodicPattern createPeriodicPattern();

	/**
	 * Returns a new object of class '<em>Sporadic Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sporadic Pattern</em>'.
	 * @generated
	 */
	SporadicPattern createSporadicPattern();

	/**
	 * Returns a new object of class '<em>End To End Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End To End Flow</em>'.
	 * @generated
	 */
	EndToEndFlow createEndToEndFlow();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GqamPackage getGqamPackage();

} //GqamFactory
