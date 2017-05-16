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
package org.polarsys.time4sys.marte.srm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.time4sys.marte.grm.CommunicationEndPoint;
import org.polarsys.time4sys.marte.grm.CommunicationMedia;
import org.polarsys.time4sys.marte.grm.CommunicationResource;
import org.polarsys.time4sys.marte.grm.ConcurrencyResource;
import org.polarsys.time4sys.marte.grm.MutualExclusionResource;
import org.polarsys.time4sys.marte.grm.NamedElement;
import org.polarsys.time4sys.marte.grm.ProcessingResource;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourceBroker;
import org.polarsys.time4sys.marte.grm.ResourceConnector;
import org.polarsys.time4sys.marte.grm.ResourceInterface;
import org.polarsys.time4sys.marte.grm.ResourceManager;
import org.polarsys.time4sys.marte.grm.ResourcePackage;
import org.polarsys.time4sys.marte.grm.ResourcePackageableElement;
import org.polarsys.time4sys.marte.grm.ResourcePort;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.marte.grm.Scheduler;
import org.polarsys.time4sys.marte.grm.SynchResource;
import org.polarsys.time4sys.marte.grm.TimerResource;
import org.polarsys.time4sys.marte.grm.TimingResource;

import org.polarsys.time4sys.marte.srm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.srm.SrmPackage
 * @generated
 */
public class SrmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SrmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SrmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrmSwitch<Adapter> modelSwitch =
		new SrmSwitch<Adapter>() {
			@Override
			public Adapter caseAlarm(Alarm object) {
				return createAlarmAdapter();
			}
			@Override
			public Adapter caseDeviceBroker(DeviceBroker object) {
				return createDeviceBrokerAdapter();
			}
			@Override
			public Adapter caseInterruptResource(InterruptResource object) {
				return createInterruptResourceAdapter();
			}
			@Override
			public Adapter caseMemoryBroker(MemoryBroker object) {
				return createMemoryBrokerAdapter();
			}
			@Override
			public Adapter caseMemoryPartition(MemoryPartition object) {
				return createMemoryPartitionAdapter();
			}
			@Override
			public Adapter caseMessageComResource(MessageComResource object) {
				return createMessageComResourceAdapter();
			}
			@Override
			public Adapter caseNotificationResource(NotificationResource object) {
				return createNotificationResourceAdapter();
			}
			@Override
			public Adapter caseSharedDataComResource(SharedDataComResource object) {
				return createSharedDataComResourceAdapter();
			}
			@Override
			public Adapter caseSoftwareAccessService(SoftwareAccessService object) {
				return createSoftwareAccessServiceAdapter();
			}
			@Override
			public Adapter caseSoftwareArchitecture(SoftwareArchitecture object) {
				return createSoftwareArchitectureAdapter();
			}
			@Override
			public Adapter caseSoftwareCommunicationResource(SoftwareCommunicationResource object) {
				return createSoftwareCommunicationResourceAdapter();
			}
			@Override
			public Adapter caseSoftwareConcurrentResource(SoftwareConcurrentResource object) {
				return createSoftwareConcurrentResourceAdapter();
			}
			@Override
			public Adapter caseSoftwareConnector(SoftwareConnector object) {
				return createSoftwareConnectorAdapter();
			}
			@Override
			public Adapter caseSoftwareInteractionResource(SoftwareInteractionResource object) {
				return createSoftwareInteractionResourceAdapter();
			}
			@Override
			public Adapter caseSoftwareInterface(SoftwareInterface object) {
				return createSoftwareInterfaceAdapter();
			}
			@Override
			public Adapter caseSoftwareInterfacePackage(SoftwareInterfacePackage object) {
				return createSoftwareInterfacePackageAdapter();
			}
			@Override
			public Adapter caseSoftwareMutualExclusionResource(SoftwareMutualExclusionResource object) {
				return createSoftwareMutualExclusionResourceAdapter();
			}
			@Override
			public Adapter caseSoftwarePort(SoftwarePort object) {
				return createSoftwarePortAdapter();
			}
			@Override
			public Adapter caseSoftwareResource(SoftwareResource object) {
				return createSoftwareResourceAdapter();
			}
			@Override
			public Adapter caseSoftwareResourcePackage(SoftwareResourcePackage object) {
				return createSoftwareResourcePackageAdapter();
			}
			@Override
			public Adapter caseSoftwareSchedulableResource(SoftwareSchedulableResource object) {
				return createSoftwareSchedulableResourceAdapter();
			}
			@Override
			public Adapter caseSoftwareScheduler(SoftwareScheduler object) {
				return createSoftwareSchedulerAdapter();
			}
			@Override
			public Adapter caseSoftwareService(SoftwareService object) {
				return createSoftwareServiceAdapter();
			}
			@Override
			public Adapter caseSoftwareSynchronizationResource(SoftwareSynchronizationResource object) {
				return createSoftwareSynchronizationResourceAdapter();
			}
			@Override
			public Adapter caseSoftwareTimerResource(SoftwareTimerResource object) {
				return createSoftwareTimerResourceAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseResourcePackageableElement(ResourcePackageableElement object) {
				return createResourcePackageableElementAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseResourceManager(ResourceManager object) {
				return createResourceManagerAdapter();
			}
			@Override
			public Adapter caseConcurrencyResource(ConcurrencyResource object) {
				return createConcurrencyResourceAdapter();
			}
			@Override
			public Adapter caseResourceBroker(ResourceBroker object) {
				return createResourceBrokerAdapter();
			}
			@Override
			public Adapter caseCommunicationEndPoint(CommunicationEndPoint object) {
				return createCommunicationEndPointAdapter();
			}
			@Override
			public Adapter caseCommunicationResource(CommunicationResource object) {
				return createCommunicationResourceAdapter();
			}
			@Override
			public Adapter caseProcessingResource(ProcessingResource object) {
				return createProcessingResourceAdapter();
			}
			@Override
			public Adapter caseCommunicationMedia(CommunicationMedia object) {
				return createCommunicationMediaAdapter();
			}
			@Override
			public Adapter caseSynchResource(SynchResource object) {
				return createSynchResourceAdapter();
			}
			@Override
			public Adapter caseResourceService(ResourceService object) {
				return createResourceServiceAdapter();
			}
			@Override
			public Adapter caseResourceConnector(ResourceConnector object) {
				return createResourceConnectorAdapter();
			}
			@Override
			public Adapter caseResourceInterface(ResourceInterface object) {
				return createResourceInterfaceAdapter();
			}
			@Override
			public Adapter caseResourcePackage(ResourcePackage object) {
				return createResourcePackageAdapter();
			}
			@Override
			public Adapter caseMutualExclusionResource(MutualExclusionResource object) {
				return createMutualExclusionResourceAdapter();
			}
			@Override
			public Adapter caseResourcePort(ResourcePort object) {
				return createResourcePortAdapter();
			}
			@Override
			public Adapter caseSchedulableResource(SchedulableResource object) {
				return createSchedulableResourceAdapter();
			}
			@Override
			public Adapter caseScheduler(Scheduler object) {
				return createSchedulerAdapter();
			}
			@Override
			public Adapter caseTimingResource(TimingResource object) {
				return createTimingResourceAdapter();
			}
			@Override
			public Adapter caseTimerResource(TimerResource object) {
				return createTimerResourceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwareResource <em>Software Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareResource
	 * @generated
	 */
	public Adapter createSoftwareResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwareAccessService <em>Software Access Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareAccessService
	 * @generated
	 */
	public Adapter createSoftwareAccessServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource <em>Software Concurrent Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource
	 * @generated
	 */
	public Adapter createSoftwareConcurrentResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.InterruptResource <em>Interrupt Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.InterruptResource
	 * @generated
	 */
	public Adapter createInterruptResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource <em>Software Schedulable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource
	 * @generated
	 */
	public Adapter createSoftwareSchedulableResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.MemoryPartition <em>Memory Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.MemoryPartition
	 * @generated
	 */
	public Adapter createMemoryPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.Alarm
	 * @generated
	 */
	public Adapter createAlarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwareTimerResource <em>Software Timer Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareTimerResource
	 * @generated
	 */
	public Adapter createSoftwareTimerResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwareInteractionResource <em>Software Interaction Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareInteractionResource
	 * @generated
	 */
	public Adapter createSoftwareInteractionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwareCommunicationResource <em>Software Communication Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareCommunicationResource
	 * @generated
	 */
	public Adapter createSoftwareCommunicationResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwareSynchronizationResource <em>Software Synchronization Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareSynchronizationResource
	 * @generated
	 */
	public Adapter createSoftwareSynchronizationResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource <em>Software Mutual Exclusion Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource
	 * @generated
	 */
	public Adapter createSoftwareMutualExclusionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.NotificationResource <em>Notification Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.NotificationResource
	 * @generated
	 */
	public Adapter createNotificationResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SharedDataComResource <em>Shared Data Com Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SharedDataComResource
	 * @generated
	 */
	public Adapter createSharedDataComResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.MessageComResource <em>Message Com Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.MessageComResource
	 * @generated
	 */
	public Adapter createMessageComResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.DeviceBroker <em>Device Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.DeviceBroker
	 * @generated
	 */
	public Adapter createDeviceBrokerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.MemoryBroker <em>Memory Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.MemoryBroker
	 * @generated
	 */
	public Adapter createMemoryBrokerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwareScheduler <em>Software Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareScheduler
	 * @generated
	 */
	public Adapter createSoftwareSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwarePort <em>Software Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwarePort
	 * @generated
	 */
	public Adapter createSoftwarePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwareService <em>Software Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareService
	 * @generated
	 */
	public Adapter createSoftwareServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwareInterface <em>Software Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareInterface
	 * @generated
	 */
	public Adapter createSoftwareInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwareArchitecture <em>Software Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareArchitecture
	 * @generated
	 */
	public Adapter createSoftwareArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwareConnector <em>Software Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConnector
	 * @generated
	 */
	public Adapter createSoftwareConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwareResourcePackage <em>Software Resource Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareResourcePackage
	 * @generated
	 */
	public Adapter createSoftwareResourcePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.srm.SoftwareInterfacePackage <em>Software Interface Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareInterfacePackage
	 * @generated
	 */
	public Adapter createSoftwareInterfacePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ResourcePackageableElement <em>Resource Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ResourcePackageableElement
	 * @generated
	 */
	public Adapter createResourcePackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ResourceManager <em>Resource Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ResourceManager
	 * @generated
	 */
	public Adapter createResourceManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ResourceService <em>Resource Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ResourceService
	 * @generated
	 */
	public Adapter createResourceServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ConcurrencyResource <em>Concurrency Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ConcurrencyResource
	 * @generated
	 */
	public Adapter createConcurrencyResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.SchedulableResource <em>Schedulable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.SchedulableResource
	 * @generated
	 */
	public Adapter createSchedulableResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.TimingResource <em>Timing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.TimingResource
	 * @generated
	 */
	public Adapter createTimingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.TimerResource <em>Timer Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.TimerResource
	 * @generated
	 */
	public Adapter createTimerResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.CommunicationEndPoint <em>Communication End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.CommunicationEndPoint
	 * @generated
	 */
	public Adapter createCommunicationEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.CommunicationResource <em>Communication Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.CommunicationResource
	 * @generated
	 */
	public Adapter createCommunicationResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ProcessingResource <em>Processing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ProcessingResource
	 * @generated
	 */
	public Adapter createProcessingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.CommunicationMedia <em>Communication Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.CommunicationMedia
	 * @generated
	 */
	public Adapter createCommunicationMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.SynchResource <em>Synch Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.SynchResource
	 * @generated
	 */
	public Adapter createSynchResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.MutualExclusionResource <em>Mutual Exclusion Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.MutualExclusionResource
	 * @generated
	 */
	public Adapter createMutualExclusionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ResourceBroker <em>Resource Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ResourceBroker
	 * @generated
	 */
	public Adapter createResourceBrokerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.Scheduler
	 * @generated
	 */
	public Adapter createSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ResourcePort <em>Resource Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ResourcePort
	 * @generated
	 */
	public Adapter createResourcePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ResourceInterface <em>Resource Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ResourceInterface
	 * @generated
	 */
	public Adapter createResourceInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ResourceConnector <em>Resource Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ResourceConnector
	 * @generated
	 */
	public Adapter createResourceConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ResourcePackage <em>Resource Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ResourcePackage
	 * @generated
	 */
	public Adapter createResourcePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SrmAdapterFactory
