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
package org.polarsys.time4sys.marte.grm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.grm.GrmPackage
 * @generated
 */
public interface GrmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrmFactory eINSTANCE = org.polarsys.time4sys.marte.grm.impl.GrmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Package</em>'.
	 * @generated
	 */
	ResourcePackage createResourcePackage();

	/**
	 * Returns a new object of class '<em>Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Instance</em>'.
	 * @generated
	 */
	ResourceInstance createResourceInstance();

	/**
	 * Returns a new object of class '<em>Storage Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Resource</em>'.
	 * @generated
	 */
	StorageResource createStorageResource();

	/**
	 * Returns a new object of class '<em>Synch Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synch Resource</em>'.
	 * @generated
	 */
	SynchResource createSynchResource();

	/**
	 * Returns a new object of class '<em>Table Driven Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Driven Schedule</em>'.
	 * @generated
	 */
	TableDrivenSchedule createTableDrivenSchedule();

	/**
	 * Returns a new object of class '<em>Table Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Entry Type</em>'.
	 * @generated
	 */
	TableEntryType createTableEntryType();

	/**
	 * Returns a new object of class '<em>Concurrency Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concurrency Resource</em>'.
	 * @generated
	 */
	ConcurrencyResource createConcurrencyResource();

	/**
	 * Returns a new object of class '<em>Computing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computing Resource</em>'.
	 * @generated
	 */
	ComputingResource createComputingResource();

	/**
	 * Returns a new object of class '<em>Device Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Resource</em>'.
	 * @generated
	 */
	DeviceResource createDeviceResource();

	/**
	 * Returns a new object of class '<em>Clock Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Resource</em>'.
	 * @generated
	 */
	ClockResource createClockResource();

	/**
	 * Returns a new object of class '<em>Timer Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timer Resource</em>'.
	 * @generated
	 */
	TimerResource createTimerResource();

	/**
	 * Returns a new object of class '<em>Resource Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Service</em>'.
	 * @generated
	 */
	ResourceService createResourceService();

	/**
	 * Returns a new object of class '<em>Communication Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Media</em>'.
	 * @generated
	 */
	CommunicationMedia createCommunicationMedia();

	/**
	 * Returns a new object of class '<em>Resource Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Connector</em>'.
	 * @generated
	 */
	ResourceConnector createResourceConnector();

	/**
	 * Returns a new object of class '<em>Resource Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Port</em>'.
	 * @generated
	 */
	ResourcePort createResourcePort();

	/**
	 * Returns a new object of class '<em>Resource Broker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Broker</em>'.
	 * @generated
	 */
	ResourceBroker createResourceBroker();

	/**
	 * Returns a new object of class '<em>Resource Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Manager</em>'.
	 * @generated
	 */
	ResourceManager createResourceManager();

	/**
	 * Returns a new object of class '<em>Access Control Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Control Policy</em>'.
	 * @generated
	 */
	AccessControlPolicy createAccessControlPolicy();

	/**
	 * Returns a new object of class '<em>Resource Control Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Control Policy</em>'.
	 * @generated
	 */
	ResourceControlPolicy createResourceControlPolicy();

	/**
	 * Returns a new object of class '<em>Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduler</em>'.
	 * @generated
	 */
	Scheduler createScheduler();

	/**
	 * Returns a new object of class '<em>Secondary Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secondary Scheduler</em>'.
	 * @generated
	 */
	SecondaryScheduler createSecondaryScheduler();

	/**
	 * Returns a new object of class '<em>Schedulable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedulable Resource</em>'.
	 * @generated
	 */
	SchedulableResource createSchedulableResource();

	/**
	 * Returns a new object of class '<em>Scheduling Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduling Parameter</em>'.
	 * @generated
	 */
	SchedulingParameter createSchedulingParameter();

	/**
	 * Returns a new object of class '<em>Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduling Policy</em>'.
	 * @generated
	 */
	SchedulingPolicy createSchedulingPolicy();
	
	/**
	 * @return
	 * @generated NOT
	 */
	SchedulingPolicy createSchedulingPolicy(SchedPolicyKind policy);

	/**
	 * Returns a new object of class '<em>Mutual Exclusion Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mutual Exclusion Resource</em>'.
	 * @generated
	 */
	MutualExclusionResource createMutualExclusionResource();

	/**
	 * Returns a new object of class '<em>Periodic Server Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Server Parameters</em>'.
	 * @generated
	 */
	PeriodicServerParameters createPeriodicServerParameters();

	/**
	 * Returns a new object of class '<em>Pooling Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pooling Parameters</em>'.
	 * @generated
	 */
	PoolingParameters createPoolingParameters();

	/**
	 * Returns a new object of class '<em>Mutual Exclusion Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mutual Exclusion Protocol</em>'.
	 * @generated
	 */
	MutualExclusionProtocol createMutualExclusionProtocol();

	/**
	 * Returns a new object of class '<em>Protection Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protection Parameter</em>'.
	 * @generated
	 */
	ProtectionParameter createProtectionParameter();

	/**
	 * Returns a new object of class '<em>Usage Demand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Demand</em>'.
	 * @generated
	 */
	UsageDemand createUsageDemand();

	/**
	 * Returns a new object of class '<em>Resource Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Usage</em>'.
	 * @generated
	 */
	ResourceUsage createResourceUsage();

	/**
	 * Returns a new object of class '<em>Usage Typed Amount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Typed Amount</em>'.
	 * @generated
	 */
	UsageTypedAmount createUsageTypedAmount();

	/**
	 * Returns a new object of class '<em>Dynamic Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Usage</em>'.
	 * @generated
	 */
	DynamicUsage createDynamicUsage();

	/**
	 * Returns a new object of class '<em>EDF Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDF Parameters</em>'.
	 * @generated
	 */
	EDFParameters createEDFParameters();

	/**
	 * Returns a new object of class '<em>Fixed Priority Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Priority Parameters</em>'.
	 * @generated
	 */
	FixedPriorityParameters createFixedPriorityParameters();

	/**
	 * Returns a new object of class '<em>Static Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Usage</em>'.
	 * @generated
	 */
	StaticUsage createStaticUsage();

	/**
	 * Returns a new object of class '<em>Resource Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Interface</em>'.
	 * @generated
	 */
	ResourceInterface createResourceInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GrmPackage getGrmPackage();

} //GrmFactory
