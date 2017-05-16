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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.time4sys.marte.grm.*;

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
 * @see org.polarsys.time4sys.marte.grm.GrmPackage
 * @generated
 */
public class GrmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GrmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrmSwitch() {
		if (modelPackage == null) {
			modelPackage = GrmPackage.eINSTANCE;
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
			case GrmPackage.ACCESS_CONTROL_POLICY: {
				AccessControlPolicy accessControlPolicy = (AccessControlPolicy)theEObject;
				T result = caseAccessControlPolicy(accessControlPolicy);
				if (result == null) result = caseNamedElement(accessControlPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.CLOCK_RESOURCE: {
				ClockResource clockResource = (ClockResource)theEObject;
				T result = caseClockResource(clockResource);
				if (result == null) result = caseTimingResource(clockResource);
				if (result == null) result = caseResource(clockResource);
				if (result == null) result = caseResourcePackageableElement(clockResource);
				if (result == null) result = caseNamedElement(clockResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.COMMUNICATION_END_POINT: {
				CommunicationEndPoint communicationEndPoint = (CommunicationEndPoint)theEObject;
				T result = caseCommunicationEndPoint(communicationEndPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.COMMUNICATION_MEDIA: {
				CommunicationMedia communicationMedia = (CommunicationMedia)theEObject;
				T result = caseCommunicationMedia(communicationMedia);
				if (result == null) result = caseCommunicationResource(communicationMedia);
				if (result == null) result = caseProcessingResource(communicationMedia);
				if (result == null) result = caseResource(communicationMedia);
				if (result == null) result = caseResourcePackageableElement(communicationMedia);
				if (result == null) result = caseNamedElement(communicationMedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.COMPUTING_RESOURCE: {
				ComputingResource computingResource = (ComputingResource)theEObject;
				T result = caseComputingResource(computingResource);
				if (result == null) result = caseProcessingResource(computingResource);
				if (result == null) result = caseResource(computingResource);
				if (result == null) result = caseResourcePackageableElement(computingResource);
				if (result == null) result = caseNamedElement(computingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.CONCURRENCY_RESOURCE: {
				ConcurrencyResource concurrencyResource = (ConcurrencyResource)theEObject;
				T result = caseConcurrencyResource(concurrencyResource);
				if (result == null) result = caseResource(concurrencyResource);
				if (result == null) result = caseResourcePackageableElement(concurrencyResource);
				if (result == null) result = caseNamedElement(concurrencyResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.COMMUNICATION_RESOURCE: {
				CommunicationResource communicationResource = (CommunicationResource)theEObject;
				T result = caseCommunicationResource(communicationResource);
				if (result == null) result = caseResource(communicationResource);
				if (result == null) result = caseResourcePackageableElement(communicationResource);
				if (result == null) result = caseNamedElement(communicationResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.DEVICE_RESOURCE: {
				DeviceResource deviceResource = (DeviceResource)theEObject;
				T result = caseDeviceResource(deviceResource);
				if (result == null) result = caseProcessingResource(deviceResource);
				if (result == null) result = caseResource(deviceResource);
				if (result == null) result = caseResourcePackageableElement(deviceResource);
				if (result == null) result = caseNamedElement(deviceResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.DYNAMIC_USAGE: {
				DynamicUsage dynamicUsage = (DynamicUsage)theEObject;
				T result = caseDynamicUsage(dynamicUsage);
				if (result == null) result = caseResourceUsage(dynamicUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.MUTUAL_EXCLUSION_PROTOCOL: {
				MutualExclusionProtocol mutualExclusionProtocol = (MutualExclusionProtocol)theEObject;
				T result = caseMutualExclusionProtocol(mutualExclusionProtocol);
				if (result == null) result = caseAccessControlPolicy(mutualExclusionProtocol);
				if (result == null) result = caseNamedElement(mutualExclusionProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.MUTUAL_EXCLUSION_RESOURCE: {
				MutualExclusionResource mutualExclusionResource = (MutualExclusionResource)theEObject;
				T result = caseMutualExclusionResource(mutualExclusionResource);
				if (result == null) result = caseSynchResource(mutualExclusionResource);
				if (result == null) result = caseResource(mutualExclusionResource);
				if (result == null) result = caseResourcePackageableElement(mutualExclusionResource);
				if (result == null) result = caseNamedElement(mutualExclusionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.PROCESSING_RESOURCE: {
				ProcessingResource processingResource = (ProcessingResource)theEObject;
				T result = caseProcessingResource(processingResource);
				if (result == null) result = caseResource(processingResource);
				if (result == null) result = caseResourcePackageableElement(processingResource);
				if (result == null) result = caseNamedElement(processingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.PROTECTION_PARAMETER: {
				ProtectionParameter protectionParameter = (ProtectionParameter)theEObject;
				T result = caseProtectionParameter(protectionParameter);
				if (result == null) result = caseNamedElement(protectionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseResourcePackageableElement(resource);
				if (result == null) result = caseNamedElement(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.RESOURCE_BROKER: {
				ResourceBroker resourceBroker = (ResourceBroker)theEObject;
				T result = caseResourceBroker(resourceBroker);
				if (result == null) result = caseResource(resourceBroker);
				if (result == null) result = caseResourcePackageableElement(resourceBroker);
				if (result == null) result = caseNamedElement(resourceBroker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.RESOURCE_CONNECTOR: {
				ResourceConnector resourceConnector = (ResourceConnector)theEObject;
				T result = caseResourceConnector(resourceConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.RESOURCE_CONTROL_POLICY: {
				ResourceControlPolicy resourceControlPolicy = (ResourceControlPolicy)theEObject;
				T result = caseResourceControlPolicy(resourceControlPolicy);
				if (result == null) result = caseNamedElement(resourceControlPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.RESOURCE_INSTANCE: {
				ResourceInstance resourceInstance = (ResourceInstance)theEObject;
				T result = caseResourceInstance(resourceInstance);
				if (result == null) result = caseResourcePackageableElement(resourceInstance);
				if (result == null) result = caseNamedElement(resourceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.RESOURCE_INTERFACE: {
				ResourceInterface resourceInterface = (ResourceInterface)theEObject;
				T result = caseResourceInterface(resourceInterface);
				if (result == null) result = caseResourcePackageableElement(resourceInterface);
				if (result == null) result = caseNamedElement(resourceInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.RESOURCE_MANAGER: {
				ResourceManager resourceManager = (ResourceManager)theEObject;
				T result = caseResourceManager(resourceManager);
				if (result == null) result = caseResource(resourceManager);
				if (result == null) result = caseResourcePackageableElement(resourceManager);
				if (result == null) result = caseNamedElement(resourceManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.RESOURCE_PACKAGE: {
				ResourcePackage resourcePackage = (ResourcePackage)theEObject;
				T result = caseResourcePackage(resourcePackage);
				if (result == null) result = caseNamedElement(resourcePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.RESOURCE_PACKAGEABLE_ELEMENT: {
				ResourcePackageableElement resourcePackageableElement = (ResourcePackageableElement)theEObject;
				T result = caseResourcePackageableElement(resourcePackageableElement);
				if (result == null) result = caseNamedElement(resourcePackageableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.RESOURCE_PORT: {
				ResourcePort resourcePort = (ResourcePort)theEObject;
				T result = caseResourcePort(resourcePort);
				if (result == null) result = caseCommunicationEndPoint(resourcePort);
				if (result == null) result = caseNamedElement(resourcePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.RESOURCE_SERVICE: {
				ResourceService resourceService = (ResourceService)theEObject;
				T result = caseResourceService(resourceService);
				if (result == null) result = caseNamedElement(resourceService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.RESOURCE_USAGE: {
				ResourceUsage resourceUsage = (ResourceUsage)theEObject;
				T result = caseResourceUsage(resourceUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.SCHEDULER: {
				Scheduler scheduler = (Scheduler)theEObject;
				T result = caseScheduler(scheduler);
				if (result == null) result = caseResourceBroker(scheduler);
				if (result == null) result = caseResource(scheduler);
				if (result == null) result = caseResourcePackageableElement(scheduler);
				if (result == null) result = caseNamedElement(scheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.SCHEDULABLE_RESOURCE: {
				SchedulableResource schedulableResource = (SchedulableResource)theEObject;
				T result = caseSchedulableResource(schedulableResource);
				if (result == null) result = caseConcurrencyResource(schedulableResource);
				if (result == null) result = caseResource(schedulableResource);
				if (result == null) result = caseResourcePackageableElement(schedulableResource);
				if (result == null) result = caseNamedElement(schedulableResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.SCHEDULING_PARAMETER: {
				SchedulingParameter schedulingParameter = (SchedulingParameter)theEObject;
				T result = caseSchedulingParameter(schedulingParameter);
				if (result == null) result = caseNamedElement(schedulingParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.SCHEDULING_POLICY: {
				SchedulingPolicy schedulingPolicy = (SchedulingPolicy)theEObject;
				T result = caseSchedulingPolicy(schedulingPolicy);
				if (result == null) result = caseAccessControlPolicy(schedulingPolicy);
				if (result == null) result = caseNamedElement(schedulingPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.SECONDARY_SCHEDULER: {
				SecondaryScheduler secondaryScheduler = (SecondaryScheduler)theEObject;
				T result = caseSecondaryScheduler(secondaryScheduler);
				if (result == null) result = caseScheduler(secondaryScheduler);
				if (result == null) result = caseResourceBroker(secondaryScheduler);
				if (result == null) result = caseResource(secondaryScheduler);
				if (result == null) result = caseResourcePackageableElement(secondaryScheduler);
				if (result == null) result = caseNamedElement(secondaryScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.STATIC_USAGE: {
				StaticUsage staticUsage = (StaticUsage)theEObject;
				T result = caseStaticUsage(staticUsage);
				if (result == null) result = caseResourceUsage(staticUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.STORAGE_RESOURCE: {
				StorageResource storageResource = (StorageResource)theEObject;
				T result = caseStorageResource(storageResource);
				if (result == null) result = caseResource(storageResource);
				if (result == null) result = caseResourcePackageableElement(storageResource);
				if (result == null) result = caseNamedElement(storageResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.SYNCH_RESOURCE: {
				SynchResource synchResource = (SynchResource)theEObject;
				T result = caseSynchResource(synchResource);
				if (result == null) result = caseResource(synchResource);
				if (result == null) result = caseResourcePackageableElement(synchResource);
				if (result == null) result = caseNamedElement(synchResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.TIMING_RESOURCE: {
				TimingResource timingResource = (TimingResource)theEObject;
				T result = caseTimingResource(timingResource);
				if (result == null) result = caseResource(timingResource);
				if (result == null) result = caseResourcePackageableElement(timingResource);
				if (result == null) result = caseNamedElement(timingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.TIMER_RESOURCE: {
				TimerResource timerResource = (TimerResource)theEObject;
				T result = caseTimerResource(timerResource);
				if (result == null) result = caseTimingResource(timerResource);
				if (result == null) result = caseResource(timerResource);
				if (result == null) result = caseResourcePackageableElement(timerResource);
				if (result == null) result = caseNamedElement(timerResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.USAGE_DEMAND: {
				UsageDemand usageDemand = (UsageDemand)theEObject;
				T result = caseUsageDemand(usageDemand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrmPackage.USAGE_TYPED_AMOUNT: {
				UsageTypedAmount usageTypedAmount = (UsageTypedAmount)theEObject;
				T result = caseUsageTypedAmount(usageTypedAmount);
				if (result == null) result = caseResource(usageTypedAmount);
				if (result == null) result = caseResourcePackageableElement(usageTypedAmount);
				if (result == null) result = caseNamedElement(usageTypedAmount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceInstance(ResourceInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Storage Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageResource(StorageResource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Device Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceResource(DeviceResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockResource(ClockResource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Access Control Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Control Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessControlPolicy(AccessControlPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Control Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Control Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceControlPolicy(ResourceControlPolicy object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Secondary Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secondary Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecondaryScheduler(SecondaryScheduler object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Scheduling Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduling Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulingParameter(SchedulingParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduling Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulingPolicy(SchedulingPolicy object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Mutual Exclusion Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mutual Exclusion Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMutualExclusionProtocol(MutualExclusionProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protection Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protection Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtectionParameter(ProtectionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Demand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Demand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageDemand(UsageDemand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceUsage(ResourceUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Typed Amount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Typed Amount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageTypedAmount(UsageTypedAmount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicUsage(DynamicUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticUsage(StaticUsage object) {
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

} //GrmSwitch
