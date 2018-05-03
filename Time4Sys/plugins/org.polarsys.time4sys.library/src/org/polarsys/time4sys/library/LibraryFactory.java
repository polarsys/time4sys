/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.library;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.library.LibraryPackage
 * @generated
 */
public interface LibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibraryFactory eINSTANCE = org.polarsys.time4sys.library.impl.LibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TDMA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDMA</em>'.
	 * @generated
	 */
	TDMA createTDMA();

	/**
	 * Returns a new object of class '<em>Deadline Monotonic Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deadline Monotonic Scheduling Policy</em>'.
	 * @generated
	 */
	DeadlineMonotonicSchedulingPolicy createDeadlineMonotonicSchedulingPolicy();

	/**
	 * Returns a new object of class '<em>Rate Monotonic Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rate Monotonic Scheduling Policy</em>'.
	 * @generated
	 */
	RateMonotonicSchedulingPolicy createRateMonotonicSchedulingPolicy();

	/**
	 * Returns a new object of class '<em>Hardware CAN Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware CAN Bus</em>'.
	 * @generated
	 */
	HardwareCANBus createHardwareCANBus();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LibraryPackage getLibraryPackage();

} //LibraryFactory
