/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work and others.
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
package org.polarsys.time4sys.marte.srm.util;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.polarsys.time4sys.marte.grm.CommunicationEndPoint;
import org.polarsys.time4sys.marte.grm.CommunicationMedia;
import org.polarsys.time4sys.marte.grm.CommunicationResource;
import org.polarsys.time4sys.marte.grm.ConcurrencyResource;
import org.polarsys.time4sys.marte.grm.MutualExclusionResource;
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
import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;
import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;
import org.polarsys.time4sys.marte.nfp.coreelements.PackageableElement;
import org.polarsys.time4sys.marte.srm.Alarm;
import org.polarsys.time4sys.marte.srm.DeviceBroker;
import org.polarsys.time4sys.marte.srm.InterruptResource;
import org.polarsys.time4sys.marte.srm.MemoryBroker;
import org.polarsys.time4sys.marte.srm.MemoryPartition;
import org.polarsys.time4sys.marte.srm.MessageComResource;
import org.polarsys.time4sys.marte.srm.NotificationResource;
import org.polarsys.time4sys.marte.srm.SharedDataComResource;
import org.polarsys.time4sys.marte.srm.SoftwareAccessService;
import org.polarsys.time4sys.marte.srm.SoftwareArchitecture;
import org.polarsys.time4sys.marte.srm.SoftwareCommunicationResource;
import org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource;
import org.polarsys.time4sys.marte.srm.SoftwareConnector;
import org.polarsys.time4sys.marte.srm.SoftwareInteractionResource;
import org.polarsys.time4sys.marte.srm.SoftwareInterface;
import org.polarsys.time4sys.marte.srm.SoftwareInterfacePackage;
import org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource;
import org.polarsys.time4sys.marte.srm.SoftwarePort;
import org.polarsys.time4sys.marte.srm.SoftwareResource;
import org.polarsys.time4sys.marte.srm.SoftwareResourcePackage;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.marte.srm.SoftwareScheduler;
import org.polarsys.time4sys.marte.srm.SoftwareService;
import org.polarsys.time4sys.marte.srm.SoftwareSynchronizationResource;
import org.polarsys.time4sys.marte.srm.SoftwareTimerResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

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
 * @see org.polarsys.time4sys.marte.srm.SrmPackage
 * @generated
 */
public class SrmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SrmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrmSwitch() {
		if (modelPackage == null) {
			modelPackage = SrmPackage.eINSTANCE;
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
			case SrmPackage.ALARM: {
				Alarm alarm = (Alarm)theEObject;
				T result = caseAlarm(alarm);
				if (result == null) result = caseInterruptResource(alarm);
				if (result == null) result = caseSoftwareConcurrentResource(alarm);
				if (result == null) result = caseSoftwareResource(alarm);
				if (result == null) result = caseConcurrencyResource(alarm);
				if (result == null) result = caseResourceManager(alarm);
				if (result == null) result = caseResource(alarm);
				if (result == null) result = caseResourcePackageableElement(alarm);
				if (result == null) result = casePackageableElement(alarm);
				if (result == null) result = caseNamedElement(alarm);
				if (result == null) result = caseENamedElement(alarm);
				if (result == null) result = caseModelElement(alarm);
				if (result == null) result = caseEModelElement(alarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.DEVICE_BROKER: {
				DeviceBroker deviceBroker = (DeviceBroker)theEObject;
				T result = caseDeviceBroker(deviceBroker);
				if (result == null) result = caseResourceBroker(deviceBroker);
				if (result == null) result = caseSoftwareResource(deviceBroker);
				if (result == null) result = caseResourceManager(deviceBroker);
				if (result == null) result = caseResource(deviceBroker);
				if (result == null) result = caseResourcePackageableElement(deviceBroker);
				if (result == null) result = casePackageableElement(deviceBroker);
				if (result == null) result = caseNamedElement(deviceBroker);
				if (result == null) result = caseENamedElement(deviceBroker);
				if (result == null) result = caseModelElement(deviceBroker);
				if (result == null) result = caseEModelElement(deviceBroker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.INTERRUPT_RESOURCE: {
				InterruptResource interruptResource = (InterruptResource)theEObject;
				T result = caseInterruptResource(interruptResource);
				if (result == null) result = caseSoftwareConcurrentResource(interruptResource);
				if (result == null) result = caseSoftwareResource(interruptResource);
				if (result == null) result = caseConcurrencyResource(interruptResource);
				if (result == null) result = caseResourceManager(interruptResource);
				if (result == null) result = caseResource(interruptResource);
				if (result == null) result = caseResourcePackageableElement(interruptResource);
				if (result == null) result = casePackageableElement(interruptResource);
				if (result == null) result = caseNamedElement(interruptResource);
				if (result == null) result = caseENamedElement(interruptResource);
				if (result == null) result = caseModelElement(interruptResource);
				if (result == null) result = caseEModelElement(interruptResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.MEMORY_BROKER: {
				MemoryBroker memoryBroker = (MemoryBroker)theEObject;
				T result = caseMemoryBroker(memoryBroker);
				if (result == null) result = caseResourceBroker(memoryBroker);
				if (result == null) result = caseSoftwareResource(memoryBroker);
				if (result == null) result = caseResourceManager(memoryBroker);
				if (result == null) result = caseResource(memoryBroker);
				if (result == null) result = caseResourcePackageableElement(memoryBroker);
				if (result == null) result = casePackageableElement(memoryBroker);
				if (result == null) result = caseNamedElement(memoryBroker);
				if (result == null) result = caseENamedElement(memoryBroker);
				if (result == null) result = caseModelElement(memoryBroker);
				if (result == null) result = caseEModelElement(memoryBroker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.MEMORY_PARTITION: {
				MemoryPartition memoryPartition = (MemoryPartition)theEObject;
				T result = caseMemoryPartition(memoryPartition);
				if (result == null) result = caseSoftwareResource(memoryPartition);
				if (result == null) result = caseResourceManager(memoryPartition);
				if (result == null) result = caseResource(memoryPartition);
				if (result == null) result = caseResourcePackageableElement(memoryPartition);
				if (result == null) result = casePackageableElement(memoryPartition);
				if (result == null) result = caseNamedElement(memoryPartition);
				if (result == null) result = caseENamedElement(memoryPartition);
				if (result == null) result = caseModelElement(memoryPartition);
				if (result == null) result = caseEModelElement(memoryPartition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.MESSAGE_COM_RESOURCE: {
				MessageComResource messageComResource = (MessageComResource)theEObject;
				T result = caseMessageComResource(messageComResource);
				if (result == null) result = caseSoftwareCommunicationResource(messageComResource);
				if (result == null) result = caseSoftwareInteractionResource(messageComResource);
				if (result == null) result = caseCommunicationMedia(messageComResource);
				if (result == null) result = caseCommunicationEndPoint(messageComResource);
				if (result == null) result = caseSoftwareResource(messageComResource);
				if (result == null) result = caseProcessingResource(messageComResource);
				if (result == null) result = caseCommunicationResource(messageComResource);
				if (result == null) result = caseResourceManager(messageComResource);
				if (result == null) result = caseResource(messageComResource);
				if (result == null) result = caseResourcePackageableElement(messageComResource);
				if (result == null) result = casePackageableElement(messageComResource);
				if (result == null) result = caseNamedElement(messageComResource);
				if (result == null) result = caseENamedElement(messageComResource);
				if (result == null) result = caseModelElement(messageComResource);
				if (result == null) result = caseEModelElement(messageComResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.NOTIFICATION_RESOURCE: {
				NotificationResource notificationResource = (NotificationResource)theEObject;
				T result = caseNotificationResource(notificationResource);
				if (result == null) result = caseSoftwareSynchronizationResource(notificationResource);
				if (result == null) result = caseSoftwareInteractionResource(notificationResource);
				if (result == null) result = caseSynchResource(notificationResource);
				if (result == null) result = caseCommunicationEndPoint(notificationResource);
				if (result == null) result = caseSoftwareResource(notificationResource);
				if (result == null) result = caseCommunicationResource(notificationResource);
				if (result == null) result = caseResourceManager(notificationResource);
				if (result == null) result = caseResource(notificationResource);
				if (result == null) result = caseResourcePackageableElement(notificationResource);
				if (result == null) result = casePackageableElement(notificationResource);
				if (result == null) result = caseNamedElement(notificationResource);
				if (result == null) result = caseENamedElement(notificationResource);
				if (result == null) result = caseModelElement(notificationResource);
				if (result == null) result = caseEModelElement(notificationResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SHARED_DATA_COM_RESOURCE: {
				SharedDataComResource sharedDataComResource = (SharedDataComResource)theEObject;
				T result = caseSharedDataComResource(sharedDataComResource);
				if (result == null) result = caseSoftwareCommunicationResource(sharedDataComResource);
				if (result == null) result = caseSoftwareInteractionResource(sharedDataComResource);
				if (result == null) result = caseCommunicationMedia(sharedDataComResource);
				if (result == null) result = caseCommunicationEndPoint(sharedDataComResource);
				if (result == null) result = caseSoftwareResource(sharedDataComResource);
				if (result == null) result = caseProcessingResource(sharedDataComResource);
				if (result == null) result = caseCommunicationResource(sharedDataComResource);
				if (result == null) result = caseResourceManager(sharedDataComResource);
				if (result == null) result = caseResource(sharedDataComResource);
				if (result == null) result = caseResourcePackageableElement(sharedDataComResource);
				if (result == null) result = casePackageableElement(sharedDataComResource);
				if (result == null) result = caseNamedElement(sharedDataComResource);
				if (result == null) result = caseENamedElement(sharedDataComResource);
				if (result == null) result = caseModelElement(sharedDataComResource);
				if (result == null) result = caseEModelElement(sharedDataComResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_ACCESS_SERVICE: {
				SoftwareAccessService softwareAccessService = (SoftwareAccessService)theEObject;
				T result = caseSoftwareAccessService(softwareAccessService);
				if (result == null) result = caseResourceService(softwareAccessService);
				if (result == null) result = caseNamedElement(softwareAccessService);
				if (result == null) result = caseENamedElement(softwareAccessService);
				if (result == null) result = caseModelElement(softwareAccessService);
				if (result == null) result = caseEModelElement(softwareAccessService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_ARCHITECTURE: {
				SoftwareArchitecture softwareArchitecture = (SoftwareArchitecture)theEObject;
				T result = caseSoftwareArchitecture(softwareArchitecture);
				if (result == null) result = caseSoftwareResource(softwareArchitecture);
				if (result == null) result = caseResourceManager(softwareArchitecture);
				if (result == null) result = caseResource(softwareArchitecture);
				if (result == null) result = caseResourcePackageableElement(softwareArchitecture);
				if (result == null) result = casePackageableElement(softwareArchitecture);
				if (result == null) result = caseNamedElement(softwareArchitecture);
				if (result == null) result = caseENamedElement(softwareArchitecture);
				if (result == null) result = caseModelElement(softwareArchitecture);
				if (result == null) result = caseEModelElement(softwareArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE: {
				SoftwareCommunicationResource softwareCommunicationResource = (SoftwareCommunicationResource)theEObject;
				T result = caseSoftwareCommunicationResource(softwareCommunicationResource);
				if (result == null) result = caseSoftwareInteractionResource(softwareCommunicationResource);
				if (result == null) result = caseCommunicationMedia(softwareCommunicationResource);
				if (result == null) result = caseCommunicationEndPoint(softwareCommunicationResource);
				if (result == null) result = caseSoftwareResource(softwareCommunicationResource);
				if (result == null) result = caseProcessingResource(softwareCommunicationResource);
				if (result == null) result = caseCommunicationResource(softwareCommunicationResource);
				if (result == null) result = caseResourceManager(softwareCommunicationResource);
				if (result == null) result = caseResource(softwareCommunicationResource);
				if (result == null) result = caseResourcePackageableElement(softwareCommunicationResource);
				if (result == null) result = casePackageableElement(softwareCommunicationResource);
				if (result == null) result = caseNamedElement(softwareCommunicationResource);
				if (result == null) result = caseENamedElement(softwareCommunicationResource);
				if (result == null) result = caseModelElement(softwareCommunicationResource);
				if (result == null) result = caseEModelElement(softwareCommunicationResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE: {
				SoftwareConcurrentResource softwareConcurrentResource = (SoftwareConcurrentResource)theEObject;
				T result = caseSoftwareConcurrentResource(softwareConcurrentResource);
				if (result == null) result = caseSoftwareResource(softwareConcurrentResource);
				if (result == null) result = caseConcurrencyResource(softwareConcurrentResource);
				if (result == null) result = caseResourceManager(softwareConcurrentResource);
				if (result == null) result = caseResource(softwareConcurrentResource);
				if (result == null) result = caseResourcePackageableElement(softwareConcurrentResource);
				if (result == null) result = casePackageableElement(softwareConcurrentResource);
				if (result == null) result = caseNamedElement(softwareConcurrentResource);
				if (result == null) result = caseENamedElement(softwareConcurrentResource);
				if (result == null) result = caseModelElement(softwareConcurrentResource);
				if (result == null) result = caseEModelElement(softwareConcurrentResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_CONNECTOR: {
				SoftwareConnector softwareConnector = (SoftwareConnector)theEObject;
				T result = caseSoftwareConnector(softwareConnector);
				if (result == null) result = caseResourceConnector(softwareConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE: {
				SoftwareInteractionResource softwareInteractionResource = (SoftwareInteractionResource)theEObject;
				T result = caseSoftwareInteractionResource(softwareInteractionResource);
				if (result == null) result = caseCommunicationEndPoint(softwareInteractionResource);
				if (result == null) result = caseSoftwareResource(softwareInteractionResource);
				if (result == null) result = caseCommunicationResource(softwareInteractionResource);
				if (result == null) result = caseResourceManager(softwareInteractionResource);
				if (result == null) result = caseResource(softwareInteractionResource);
				if (result == null) result = caseResourcePackageableElement(softwareInteractionResource);
				if (result == null) result = casePackageableElement(softwareInteractionResource);
				if (result == null) result = caseNamedElement(softwareInteractionResource);
				if (result == null) result = caseENamedElement(softwareInteractionResource);
				if (result == null) result = caseModelElement(softwareInteractionResource);
				if (result == null) result = caseEModelElement(softwareInteractionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_INTERFACE: {
				SoftwareInterface softwareInterface = (SoftwareInterface)theEObject;
				T result = caseSoftwareInterface(softwareInterface);
				if (result == null) result = caseResourceInterface(softwareInterface);
				if (result == null) result = caseResourcePackageableElement(softwareInterface);
				if (result == null) result = casePackageableElement(softwareInterface);
				if (result == null) result = caseNamedElement(softwareInterface);
				if (result == null) result = caseENamedElement(softwareInterface);
				if (result == null) result = caseModelElement(softwareInterface);
				if (result == null) result = caseEModelElement(softwareInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_INTERFACE_PACKAGE: {
				SoftwareInterfacePackage softwareInterfacePackage = (SoftwareInterfacePackage)theEObject;
				T result = caseSoftwareInterfacePackage(softwareInterfacePackage);
				if (result == null) result = caseResourcePackage(softwareInterfacePackage);
				if (result == null) result = casePackage(softwareInterfacePackage);
				if (result == null) result = casePackageableElement(softwareInterfacePackage);
				if (result == null) result = caseNamedElement(softwareInterfacePackage);
				if (result == null) result = caseENamedElement(softwareInterfacePackage);
				if (result == null) result = caseModelElement(softwareInterfacePackage);
				if (result == null) result = caseEModelElement(softwareInterfacePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE: {
				SoftwareMutualExclusionResource softwareMutualExclusionResource = (SoftwareMutualExclusionResource)theEObject;
				T result = caseSoftwareMutualExclusionResource(softwareMutualExclusionResource);
				if (result == null) result = caseSoftwareSynchronizationResource(softwareMutualExclusionResource);
				if (result == null) result = caseMutualExclusionResource(softwareMutualExclusionResource);
				if (result == null) result = caseSoftwareInteractionResource(softwareMutualExclusionResource);
				if (result == null) result = caseSynchResource(softwareMutualExclusionResource);
				if (result == null) result = caseCommunicationEndPoint(softwareMutualExclusionResource);
				if (result == null) result = caseSoftwareResource(softwareMutualExclusionResource);
				if (result == null) result = caseCommunicationResource(softwareMutualExclusionResource);
				if (result == null) result = caseResourceManager(softwareMutualExclusionResource);
				if (result == null) result = caseResource(softwareMutualExclusionResource);
				if (result == null) result = caseResourcePackageableElement(softwareMutualExclusionResource);
				if (result == null) result = casePackageableElement(softwareMutualExclusionResource);
				if (result == null) result = caseNamedElement(softwareMutualExclusionResource);
				if (result == null) result = caseENamedElement(softwareMutualExclusionResource);
				if (result == null) result = caseModelElement(softwareMutualExclusionResource);
				if (result == null) result = caseEModelElement(softwareMutualExclusionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_PORT: {
				SoftwarePort softwarePort = (SoftwarePort)theEObject;
				T result = caseSoftwarePort(softwarePort);
				if (result == null) result = caseResourcePort(softwarePort);
				if (result == null) result = caseCommunicationEndPoint(softwarePort);
				if (result == null) result = caseCommunicationResource(softwarePort);
				if (result == null) result = caseResource(softwarePort);
				if (result == null) result = caseResourcePackageableElement(softwarePort);
				if (result == null) result = casePackageableElement(softwarePort);
				if (result == null) result = caseNamedElement(softwarePort);
				if (result == null) result = caseENamedElement(softwarePort);
				if (result == null) result = caseModelElement(softwarePort);
				if (result == null) result = caseEModelElement(softwarePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_RESOURCE: {
				SoftwareResource softwareResource = (SoftwareResource)theEObject;
				T result = caseSoftwareResource(softwareResource);
				if (result == null) result = caseResourceManager(softwareResource);
				if (result == null) result = caseResource(softwareResource);
				if (result == null) result = caseResourcePackageableElement(softwareResource);
				if (result == null) result = casePackageableElement(softwareResource);
				if (result == null) result = caseNamedElement(softwareResource);
				if (result == null) result = caseENamedElement(softwareResource);
				if (result == null) result = caseModelElement(softwareResource);
				if (result == null) result = caseEModelElement(softwareResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_RESOURCE_PACKAGE: {
				SoftwareResourcePackage softwareResourcePackage = (SoftwareResourcePackage)theEObject;
				T result = caseSoftwareResourcePackage(softwareResourcePackage);
				if (result == null) result = caseResourcePackage(softwareResourcePackage);
				if (result == null) result = casePackage(softwareResourcePackage);
				if (result == null) result = casePackageableElement(softwareResourcePackage);
				if (result == null) result = caseNamedElement(softwareResourcePackage);
				if (result == null) result = caseENamedElement(softwareResourcePackage);
				if (result == null) result = caseModelElement(softwareResourcePackage);
				if (result == null) result = caseEModelElement(softwareResourcePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE: {
				SoftwareSchedulableResource softwareSchedulableResource = (SoftwareSchedulableResource)theEObject;
				T result = caseSoftwareSchedulableResource(softwareSchedulableResource);
				if (result == null) result = caseSchedulableResource(softwareSchedulableResource);
				if (result == null) result = caseSoftwareConcurrentResource(softwareSchedulableResource);
				if (result == null) result = caseConcurrencyResource(softwareSchedulableResource);
				if (result == null) result = caseSoftwareResource(softwareSchedulableResource);
				if (result == null) result = caseResourceManager(softwareSchedulableResource);
				if (result == null) result = caseResource(softwareSchedulableResource);
				if (result == null) result = caseResourcePackageableElement(softwareSchedulableResource);
				if (result == null) result = casePackageableElement(softwareSchedulableResource);
				if (result == null) result = caseNamedElement(softwareSchedulableResource);
				if (result == null) result = caseENamedElement(softwareSchedulableResource);
				if (result == null) result = caseModelElement(softwareSchedulableResource);
				if (result == null) result = caseEModelElement(softwareSchedulableResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_SCHEDULER: {
				SoftwareScheduler softwareScheduler = (SoftwareScheduler)theEObject;
				T result = caseSoftwareScheduler(softwareScheduler);
				if (result == null) result = caseScheduler(softwareScheduler);
				if (result == null) result = caseResourceBroker(softwareScheduler);
				if (result == null) result = caseResource(softwareScheduler);
				if (result == null) result = caseResourcePackageableElement(softwareScheduler);
				if (result == null) result = casePackageableElement(softwareScheduler);
				if (result == null) result = caseNamedElement(softwareScheduler);
				if (result == null) result = caseENamedElement(softwareScheduler);
				if (result == null) result = caseModelElement(softwareScheduler);
				if (result == null) result = caseEModelElement(softwareScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_SERVICE: {
				SoftwareService softwareService = (SoftwareService)theEObject;
				T result = caseSoftwareService(softwareService);
				if (result == null) result = caseResourceService(softwareService);
				if (result == null) result = caseNamedElement(softwareService);
				if (result == null) result = caseENamedElement(softwareService);
				if (result == null) result = caseModelElement(softwareService);
				if (result == null) result = caseEModelElement(softwareService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_SYNCHRONIZATION_RESOURCE: {
				SoftwareSynchronizationResource softwareSynchronizationResource = (SoftwareSynchronizationResource)theEObject;
				T result = caseSoftwareSynchronizationResource(softwareSynchronizationResource);
				if (result == null) result = caseSoftwareInteractionResource(softwareSynchronizationResource);
				if (result == null) result = caseSynchResource(softwareSynchronizationResource);
				if (result == null) result = caseCommunicationEndPoint(softwareSynchronizationResource);
				if (result == null) result = caseSoftwareResource(softwareSynchronizationResource);
				if (result == null) result = caseCommunicationResource(softwareSynchronizationResource);
				if (result == null) result = caseResourceManager(softwareSynchronizationResource);
				if (result == null) result = caseResource(softwareSynchronizationResource);
				if (result == null) result = caseResourcePackageableElement(softwareSynchronizationResource);
				if (result == null) result = casePackageableElement(softwareSynchronizationResource);
				if (result == null) result = caseNamedElement(softwareSynchronizationResource);
				if (result == null) result = caseENamedElement(softwareSynchronizationResource);
				if (result == null) result = caseModelElement(softwareSynchronizationResource);
				if (result == null) result = caseEModelElement(softwareSynchronizationResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SrmPackage.SOFTWARE_TIMER_RESOURCE: {
				SoftwareTimerResource softwareTimerResource = (SoftwareTimerResource)theEObject;
				T result = caseSoftwareTimerResource(softwareTimerResource);
				if (result == null) result = caseTimerResource(softwareTimerResource);
				if (result == null) result = caseTimingResource(softwareTimerResource);
				if (result == null) result = caseResource(softwareTimerResource);
				if (result == null) result = caseResourcePackageableElement(softwareTimerResource);
				if (result == null) result = casePackageableElement(softwareTimerResource);
				if (result == null) result = caseNamedElement(softwareTimerResource);
				if (result == null) result = caseENamedElement(softwareTimerResource);
				if (result == null) result = caseModelElement(softwareTimerResource);
				if (result == null) result = caseEModelElement(softwareTimerResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareResource(SoftwareResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Access Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Access Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareAccessService(SoftwareAccessService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Concurrent Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Concurrent Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareConcurrentResource(SoftwareConcurrentResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interrupt Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interrupt Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterruptResource(InterruptResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Schedulable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Schedulable Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareSchedulableResource(SoftwareSchedulableResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryPartition(MemoryPartition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarm(Alarm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Timer Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Timer Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareTimerResource(SoftwareTimerResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENamedElement(ENamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageableElement(PackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Interaction Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Interaction Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareInteractionResource(SoftwareInteractionResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Communication Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Communication Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareCommunicationResource(SoftwareCommunicationResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Synchronization Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Synchronization Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareSynchronizationResource(SoftwareSynchronizationResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Mutual Exclusion Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Mutual Exclusion Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareMutualExclusionResource(SoftwareMutualExclusionResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotificationResource(NotificationResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Data Com Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Data Com Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedDataComResource(SharedDataComResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Com Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Com Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageComResource(MessageComResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Broker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Broker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceBroker(DeviceBroker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Broker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Broker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryBroker(MemoryBroker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareScheduler(SoftwareScheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwarePort(SoftwarePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareService(SoftwareService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareInterface(SoftwareInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareArchitecture(SoftwareArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareConnector(SoftwareConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Resource Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Resource Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareResourcePackage(SoftwareResourcePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Interface Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Interface Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareInterfacePackage(SoftwareInterfacePackage object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Resource Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceManager(ResourceManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceService(ResourceService object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Timing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingResource(TimingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timer Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timer Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimerResource(TimerResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationEndPoint(CommunicationEndPoint object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Processing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingResource(ProcessingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationMedia(CommunicationMedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synch Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synch Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchResource(SynchResource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Resource Broker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Broker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceBroker(ResourceBroker object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Resource Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcePort(ResourcePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceInterface(ResourceInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.polarsys.time4sys.marte.nfp.coreelements.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceConnector(ResourceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcePackage(ResourcePackage object) {
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

} //SrmSwitch
