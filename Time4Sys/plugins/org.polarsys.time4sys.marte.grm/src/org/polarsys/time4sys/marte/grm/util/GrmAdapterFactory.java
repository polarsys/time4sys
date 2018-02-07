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
package org.polarsys.time4sys.marte.grm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.marte.grm.*;
import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;
import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;
import org.polarsys.time4sys.marte.nfp.coreelements.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.grm.GrmPackage
 * @generated
 */
public class GrmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GrmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GrmPackage.eINSTANCE;
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
	protected GrmSwitch<Adapter> modelSwitch =
		new GrmSwitch<Adapter>() {
			@Override
			public Adapter caseAccessControlPolicy(AccessControlPolicy object) {
				return createAccessControlPolicyAdapter();
			}
			@Override
			public Adapter caseClockResource(ClockResource object) {
				return createClockResourceAdapter();
			}
			@Override
			public Adapter caseCommunicationEndPoint(CommunicationEndPoint object) {
				return createCommunicationEndPointAdapter();
			}
			@Override
			public Adapter caseCommunicationMedia(CommunicationMedia object) {
				return createCommunicationMediaAdapter();
			}
			@Override
			public Adapter caseComputingResource(ComputingResource object) {
				return createComputingResourceAdapter();
			}
			@Override
			public Adapter caseConcurrencyResource(ConcurrencyResource object) {
				return createConcurrencyResourceAdapter();
			}
			@Override
			public Adapter caseCommunicationResource(CommunicationResource object) {
				return createCommunicationResourceAdapter();
			}
			@Override
			public Adapter caseDeviceResource(DeviceResource object) {
				return createDeviceResourceAdapter();
			}
			@Override
			public Adapter caseDynamicUsage(DynamicUsage object) {
				return createDynamicUsageAdapter();
			}
			@Override
			public Adapter caseMutualExclusionProtocol(MutualExclusionProtocol object) {
				return createMutualExclusionProtocolAdapter();
			}
			@Override
			public Adapter caseMutualExclusionResource(MutualExclusionResource object) {
				return createMutualExclusionResourceAdapter();
			}
			@Override
			public Adapter caseProcessingResource(ProcessingResource object) {
				return createProcessingResourceAdapter();
			}
			@Override
			public Adapter caseProtectionParameter(ProtectionParameter object) {
				return createProtectionParameterAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseResourceBroker(ResourceBroker object) {
				return createResourceBrokerAdapter();
			}
			@Override
			public Adapter caseResourceConnector(ResourceConnector object) {
				return createResourceConnectorAdapter();
			}
			@Override
			public Adapter caseResourceControlPolicy(ResourceControlPolicy object) {
				return createResourceControlPolicyAdapter();
			}
			@Override
			public Adapter caseResourceInstance(ResourceInstance object) {
				return createResourceInstanceAdapter();
			}
			@Override
			public Adapter caseResourceInterface(ResourceInterface object) {
				return createResourceInterfaceAdapter();
			}
			@Override
			public Adapter caseResourceManager(ResourceManager object) {
				return createResourceManagerAdapter();
			}
			@Override
			public Adapter caseResourcePackage(ResourcePackage object) {
				return createResourcePackageAdapter();
			}
			@Override
			public Adapter caseResourcePackageableElement(ResourcePackageableElement object) {
				return createResourcePackageableElementAdapter();
			}
			@Override
			public Adapter caseResourcePort(ResourcePort object) {
				return createResourcePortAdapter();
			}
			@Override
			public Adapter caseResourceService(ResourceService object) {
				return createResourceServiceAdapter();
			}
			@Override
			public Adapter caseResourceUsage(ResourceUsage object) {
				return createResourceUsageAdapter();
			}
			@Override
			public Adapter caseScheduler(Scheduler object) {
				return createSchedulerAdapter();
			}
			@Override
			public Adapter caseSchedulableResource(SchedulableResource object) {
				return createSchedulableResourceAdapter();
			}
			@Override
			public Adapter caseSchedulingParameter(SchedulingParameter object) {
				return createSchedulingParameterAdapter();
			}
			@Override
			public Adapter caseSchedulingPolicy(SchedulingPolicy object) {
				return createSchedulingPolicyAdapter();
			}
			@Override
			public Adapter caseSecondaryScheduler(SecondaryScheduler object) {
				return createSecondarySchedulerAdapter();
			}
			@Override
			public Adapter caseStaticUsage(StaticUsage object) {
				return createStaticUsageAdapter();
			}
			@Override
			public Adapter caseStorageResource(StorageResource object) {
				return createStorageResourceAdapter();
			}
			@Override
			public Adapter caseSynchResource(SynchResource object) {
				return createSynchResourceAdapter();
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
			public Adapter caseUsageDemand(UsageDemand object) {
				return createUsageDemandAdapter();
			}
			@Override
			public Adapter caseUsageTypedAmount(UsageTypedAmount object) {
				return createUsageTypedAmountAdapter();
			}
			@Override
			public Adapter caseEModelElement(EModelElement object) {
				return createEModelElementAdapter();
			}
			@Override
			public Adapter caseENamedElement(ENamedElement object) {
				return createENamedElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter casePackageableElement(PackageableElement object) {
				return createPackageableElementAdapter();
			}
			@Override
			public Adapter casePackage(org.polarsys.time4sys.marte.nfp.coreelements.Package object) {
				return createPackageAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ResourceInstance
	 * @generated
	 */
	public Adapter createResourceInstanceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.StorageResource <em>Storage Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.StorageResource
	 * @generated
	 */
	public Adapter createStorageResourceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ComputingResource <em>Computing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ComputingResource
	 * @generated
	 */
	public Adapter createComputingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.DeviceResource <em>Device Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.DeviceResource
	 * @generated
	 */
	public Adapter createDeviceResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ClockResource <em>Clock Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ClockResource
	 * @generated
	 */
	public Adapter createClockResourceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.AccessControlPolicy <em>Access Control Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.AccessControlPolicy
	 * @generated
	 */
	public Adapter createAccessControlPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ResourceControlPolicy <em>Resource Control Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ResourceControlPolicy
	 * @generated
	 */
	public Adapter createResourceControlPolicyAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.SecondaryScheduler <em>Secondary Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.SecondaryScheduler
	 * @generated
	 */
	public Adapter createSecondarySchedulerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.SchedulingParameter <em>Scheduling Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.SchedulingParameter
	 * @generated
	 */
	public Adapter createSchedulingParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.SchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.SchedulingPolicy
	 * @generated
	 */
	public Adapter createSchedulingPolicyAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.MutualExclusionProtocol <em>Mutual Exclusion Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.MutualExclusionProtocol
	 * @generated
	 */
	public Adapter createMutualExclusionProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ProtectionParameter <em>Protection Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ProtectionParameter
	 * @generated
	 */
	public Adapter createProtectionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.UsageDemand <em>Usage Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.UsageDemand
	 * @generated
	 */
	public Adapter createUsageDemandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ResourceUsage <em>Resource Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ResourceUsage
	 * @generated
	 */
	public Adapter createResourceUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount <em>Usage Typed Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.UsageTypedAmount
	 * @generated
	 */
	public Adapter createUsageTypedAmountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.ENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.ENamedElement
	 * @generated
	 */
	public Adapter createENamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.nfp.coreelements.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.nfp.coreelements.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.nfp.coreelements.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.nfp.coreelements.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.nfp.coreelements.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.nfp.coreelements.PackageableElement
	 * @generated
	 */
	public Adapter createPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.nfp.coreelements.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.nfp.coreelements.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.DynamicUsage <em>Dynamic Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.DynamicUsage
	 * @generated
	 */
	public Adapter createDynamicUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.StaticUsage <em>Static Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.StaticUsage
	 * @generated
	 */
	public Adapter createStaticUsageAdapter() {
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

} //GrmAdapterFactory
