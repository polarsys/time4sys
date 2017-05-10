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
package org.polarsys.time4sys.marte.srm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.srm.SrmPackage
 * @generated
 */
public interface SrmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SrmFactory eINSTANCE = org.polarsys.time4sys.marte.srm.impl.SrmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Software Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Resource</em>'.
	 * @generated
	 */
	SoftwareResource createSoftwareResource();

	/**
	 * Returns a new object of class '<em>Software Access Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Access Service</em>'.
	 * @generated
	 */
	SoftwareAccessService createSoftwareAccessService();

	/**
	 * Returns a new object of class '<em>Interrupt Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interrupt Resource</em>'.
	 * @generated
	 */
	InterruptResource createInterruptResource();

	/**
	 * Returns a new object of class '<em>Software Schedulable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Schedulable Resource</em>'.
	 * @generated
	 */
	SoftwareSchedulableResource createSoftwareSchedulableResource();

	/**
	 * Returns a new object of class '<em>Memory Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Partition</em>'.
	 * @generated
	 */
	MemoryPartition createMemoryPartition();

	/**
	 * Returns a new object of class '<em>Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alarm</em>'.
	 * @generated
	 */
	Alarm createAlarm();

	/**
	 * Returns a new object of class '<em>Software Timer Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Timer Resource</em>'.
	 * @generated
	 */
	SoftwareTimerResource createSoftwareTimerResource();

	/**
	 * Returns a new object of class '<em>Software Mutual Exclusion Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Mutual Exclusion Resource</em>'.
	 * @generated
	 */
	SoftwareMutualExclusionResource createSoftwareMutualExclusionResource();

	/**
	 * Returns a new object of class '<em>Notification Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification Resource</em>'.
	 * @generated
	 */
	NotificationResource createNotificationResource();

	/**
	 * Returns a new object of class '<em>Shared Data Com Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Data Com Resource</em>'.
	 * @generated
	 */
	SharedDataComResource createSharedDataComResource();

	/**
	 * Returns a new object of class '<em>Message Com Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Com Resource</em>'.
	 * @generated
	 */
	MessageComResource createMessageComResource();

	/**
	 * Returns a new object of class '<em>Device Broker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Broker</em>'.
	 * @generated
	 */
	DeviceBroker createDeviceBroker();

	/**
	 * Returns a new object of class '<em>Memory Broker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Broker</em>'.
	 * @generated
	 */
	MemoryBroker createMemoryBroker();

	/**
	 * Returns a new object of class '<em>Software Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Scheduler</em>'.
	 * @generated
	 */
	SoftwareScheduler createSoftwareScheduler();

	/**
	 * Returns a new object of class '<em>Software Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Port</em>'.
	 * @generated
	 */
	SoftwarePort createSoftwarePort();

	/**
	 * Returns a new object of class '<em>Software Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Service</em>'.
	 * @generated
	 */
	SoftwareService createSoftwareService();

	/**
	 * Returns a new object of class '<em>Software Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Interface</em>'.
	 * @generated
	 */
	SoftwareInterface createSoftwareInterface();

	/**
	 * Returns a new object of class '<em>Software Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Architecture</em>'.
	 * @generated
	 */
	SoftwareArchitecture createSoftwareArchitecture();

	/**
	 * Returns a new object of class '<em>Software Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Connector</em>'.
	 * @generated
	 */
	SoftwareConnector createSoftwareConnector();

	/**
	 * Returns a new object of class '<em>Software Resource Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Resource Package</em>'.
	 * @generated
	 */
	SoftwareResourcePackage createSoftwareResourcePackage();

	/**
	 * Returns a new object of class '<em>Software Interface Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Interface Package</em>'.
	 * @generated
	 */
	SoftwareInterfacePackage createSoftwareInterfacePackage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SrmPackage getSrmPackage();

} //SrmFactory
