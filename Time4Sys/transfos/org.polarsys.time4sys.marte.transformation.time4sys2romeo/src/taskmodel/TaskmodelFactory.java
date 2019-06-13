/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Thanh Dat NGUYEN- initial API and implementation
 *
 *******************************************************************************/
/**
 */
package taskmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see taskmodel.TaskmodelPackage
 * @generated
 */
public interface TaskmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskmodelFactory eINSTANCE = taskmodel.impl.TaskmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stimulus</em>'.
	 * @generated
	 */
	Stimulus createStimulus();

	/**
	 * Returns a new object of class '<em>First Release</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First Release</em>'.
	 * @generated
	 */
	First_Release createFirst_Release();

	/**
	 * Returns a new object of class '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Period</em>'.
	 * @generated
	 */
	Period createPeriod();

	/**
	 * Returns a new object of class '<em>Jitter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jitter</em>'.
	 * @generated
	 */
	Jitter createJitter();

	/**
	 * Returns a new object of class '<em>Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fragment</em>'.
	 * @generated
	 */
	Fragment createFragment();

	/**
	 * Returns a new object of class '<em>Offset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offset</em>'.
	 * @generated
	 */
	Offset createOffset();

	/**
	 * Returns a new object of class '<em>Bound Observer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bound Observer</em>'.
	 * @generated
	 */
	BoundObserver createBoundObserver();

	/**
	 * Returns a new object of class '<em>Response Time Observer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Time Observer</em>'.
	 * @generated
	 */
	ResponseTimeObserver createResponseTimeObserver();

	/**
	 * Returns a new object of class '<em>Sharing Resource Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sharing Resource Fragment</em>'.
	 * @generated
	 */
	SharingResourceFragment createSharingResourceFragment();

	/**
	 * Returns a new object of class '<em>Mutual Exclusion Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mutual Exclusion Resource</em>'.
	 * @generated
	 */
	MutualExclusionResource createMutualExclusionResource();

	/**
	 * Returns a new object of class '<em>Abstract Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Fragment</em>'.
	 * @generated
	 */
	AbstractFragment createAbstractFragment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TaskmodelPackage getTaskmodelPackage();

} //TaskmodelFactory
