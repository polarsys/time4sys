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
package org.polarsys.time4sys.marte.srm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.time4sys.marte.srm.AccessPolicyKind;
import org.polarsys.time4sys.marte.srm.Alarm;
import org.polarsys.time4sys.marte.srm.ConcurrentAccesProtocolKind;
import org.polarsys.time4sys.marte.srm.DeviceBroker;
import org.polarsys.time4sys.marte.srm.InterruptKind;
import org.polarsys.time4sys.marte.srm.InterruptResource;
import org.polarsys.time4sys.marte.srm.MemoryBroker;
import org.polarsys.time4sys.marte.srm.MemoryPartition;
import org.polarsys.time4sys.marte.srm.MessageComResource;
import org.polarsys.time4sys.marte.srm.MessageResourceKind;
import org.polarsys.time4sys.marte.srm.MutualExclusionResourceKind;
import org.polarsys.time4sys.marte.srm.NotificationResource;
import org.polarsys.time4sys.marte.srm.NotificationResourceKind;
import org.polarsys.time4sys.marte.srm.OccurencePolicyKind;
import org.polarsys.time4sys.marte.srm.QueuePolicyKind;
import org.polarsys.time4sys.marte.srm.SharedDataComResource;
import org.polarsys.time4sys.marte.srm.SoftwareAccessService;
import org.polarsys.time4sys.marte.srm.SoftwareArchitecture;
import org.polarsys.time4sys.marte.srm.SoftwareConnector;
import org.polarsys.time4sys.marte.srm.SoftwareInterface;
import org.polarsys.time4sys.marte.srm.SoftwareInterfacePackage;
import org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource;
import org.polarsys.time4sys.marte.srm.SoftwarePort;
import org.polarsys.time4sys.marte.srm.SoftwareResource;
import org.polarsys.time4sys.marte.srm.SoftwareResourcePackage;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.marte.srm.SoftwareScheduler;
import org.polarsys.time4sys.marte.srm.SoftwareService;
import org.polarsys.time4sys.marte.srm.SoftwareTimerResource;
import org.polarsys.time4sys.marte.srm.SrmFactory;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SrmFactoryImpl extends EFactoryImpl implements SrmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SrmFactory init() {
		try {
			SrmFactory theSrmFactory = (SrmFactory)EPackage.Registry.INSTANCE.getEFactory(SrmPackage.eNS_URI);
			if (theSrmFactory != null) {
				return theSrmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SrmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SrmPackage.ALARM: return createAlarm();
			case SrmPackage.DEVICE_BROKER: return createDeviceBroker();
			case SrmPackage.INTERRUPT_RESOURCE: return createInterruptResource();
			case SrmPackage.MEMORY_BROKER: return createMemoryBroker();
			case SrmPackage.MEMORY_PARTITION: return createMemoryPartition();
			case SrmPackage.MESSAGE_COM_RESOURCE: return createMessageComResource();
			case SrmPackage.NOTIFICATION_RESOURCE: return createNotificationResource();
			case SrmPackage.SHARED_DATA_COM_RESOURCE: return createSharedDataComResource();
			case SrmPackage.SOFTWARE_ACCESS_SERVICE: return createSoftwareAccessService();
			case SrmPackage.SOFTWARE_ARCHITECTURE: return createSoftwareArchitecture();
			case SrmPackage.SOFTWARE_CONNECTOR: return createSoftwareConnector();
			case SrmPackage.SOFTWARE_INTERFACE: return createSoftwareInterface();
			case SrmPackage.SOFTWARE_INTERFACE_PACKAGE: return createSoftwareInterfacePackage();
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE: return createSoftwareMutualExclusionResource();
			case SrmPackage.SOFTWARE_PORT: return createSoftwarePort();
			case SrmPackage.SOFTWARE_RESOURCE: return createSoftwareResource();
			case SrmPackage.SOFTWARE_RESOURCE_PACKAGE: return createSoftwareResourcePackage();
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE: return createSoftwareSchedulableResource();
			case SrmPackage.SOFTWARE_SCHEDULER: return createSoftwareScheduler();
			case SrmPackage.SOFTWARE_SERVICE: return createSoftwareService();
			case SrmPackage.SOFTWARE_TIMER_RESOURCE: return createSoftwareTimerResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SrmPackage.ACCESS_POLICY_KIND:
				return createAccessPolicyKindFromString(eDataType, initialValue);
			case SrmPackage.CONCURRENT_ACCES_PROTOCOL_KIND:
				return createConcurrentAccesProtocolKindFromString(eDataType, initialValue);
			case SrmPackage.INTERRUPT_KIND:
				return createInterruptKindFromString(eDataType, initialValue);
			case SrmPackage.QUEUE_POLICY_KIND:
				return createQueuePolicyKindFromString(eDataType, initialValue);
			case SrmPackage.MESSAGE_RESOURCE_KIND:
				return createMessageResourceKindFromString(eDataType, initialValue);
			case SrmPackage.MUTUAL_EXCLUSION_RESOURCE_KIND:
				return createMutualExclusionResourceKindFromString(eDataType, initialValue);
			case SrmPackage.NOTIFICATION_RESOURCE_KIND:
				return createNotificationResourceKindFromString(eDataType, initialValue);
			case SrmPackage.OCCURENCE_POLICY_KIND:
				return createOccurencePolicyKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SrmPackage.ACCESS_POLICY_KIND:
				return convertAccessPolicyKindToString(eDataType, instanceValue);
			case SrmPackage.CONCURRENT_ACCES_PROTOCOL_KIND:
				return convertConcurrentAccesProtocolKindToString(eDataType, instanceValue);
			case SrmPackage.INTERRUPT_KIND:
				return convertInterruptKindToString(eDataType, instanceValue);
			case SrmPackage.QUEUE_POLICY_KIND:
				return convertQueuePolicyKindToString(eDataType, instanceValue);
			case SrmPackage.MESSAGE_RESOURCE_KIND:
				return convertMessageResourceKindToString(eDataType, instanceValue);
			case SrmPackage.MUTUAL_EXCLUSION_RESOURCE_KIND:
				return convertMutualExclusionResourceKindToString(eDataType, instanceValue);
			case SrmPackage.NOTIFICATION_RESOURCE_KIND:
				return convertNotificationResourceKindToString(eDataType, instanceValue);
			case SrmPackage.OCCURENCE_POLICY_KIND:
				return convertOccurencePolicyKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareResource createSoftwareResource() {
		SoftwareResourceImpl softwareResource = new SoftwareResourceImpl();
		return softwareResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareAccessService createSoftwareAccessService() {
		SoftwareAccessServiceImpl softwareAccessService = new SoftwareAccessServiceImpl();
		return softwareAccessService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptResource createInterruptResource() {
		InterruptResourceImpl interruptResource = new InterruptResourceImpl();
		return interruptResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSchedulableResource createSoftwareSchedulableResource() {
		SoftwareSchedulableResourceImpl softwareSchedulableResource = new SoftwareSchedulableResourceImpl();
		return softwareSchedulableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryPartition createMemoryPartition() {
		MemoryPartitionImpl memoryPartition = new MemoryPartitionImpl();
		return memoryPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alarm createAlarm() {
		AlarmImpl alarm = new AlarmImpl();
		return alarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareTimerResource createSoftwareTimerResource() {
		SoftwareTimerResourceImpl softwareTimerResource = new SoftwareTimerResourceImpl();
		return softwareTimerResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareMutualExclusionResource createSoftwareMutualExclusionResource() {
		SoftwareMutualExclusionResourceImpl softwareMutualExclusionResource = new SoftwareMutualExclusionResourceImpl();
		return softwareMutualExclusionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationResource createNotificationResource() {
		NotificationResourceImpl notificationResource = new NotificationResourceImpl();
		return notificationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedDataComResource createSharedDataComResource() {
		SharedDataComResourceImpl sharedDataComResource = new SharedDataComResourceImpl();
		return sharedDataComResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageComResource createMessageComResource() {
		MessageComResourceImpl messageComResource = new MessageComResourceImpl();
		return messageComResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceBroker createDeviceBroker() {
		DeviceBrokerImpl deviceBroker = new DeviceBrokerImpl();
		return deviceBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryBroker createMemoryBroker() {
		MemoryBrokerImpl memoryBroker = new MemoryBrokerImpl();
		return memoryBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareScheduler createSoftwareScheduler() {
		SoftwareSchedulerImpl softwareScheduler = new SoftwareSchedulerImpl();
		return softwareScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwarePort createSoftwarePort() {
		SoftwarePortImpl softwarePort = new SoftwarePortImpl();
		return softwarePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareService createSoftwareService() {
		SoftwareServiceImpl softwareService = new SoftwareServiceImpl();
		return softwareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareInterface createSoftwareInterface() {
		SoftwareInterfaceImpl softwareInterface = new SoftwareInterfaceImpl();
		return softwareInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareArchitecture createSoftwareArchitecture() {
		SoftwareArchitectureImpl softwareArchitecture = new SoftwareArchitectureImpl();
		return softwareArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareConnector createSoftwareConnector() {
		SoftwareConnectorImpl softwareConnector = new SoftwareConnectorImpl();
		return softwareConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareResourcePackage createSoftwareResourcePackage() {
		SoftwareResourcePackageImpl softwareResourcePackage = new SoftwareResourcePackageImpl();
		return softwareResourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareInterfacePackage createSoftwareInterfacePackage() {
		SoftwareInterfacePackageImpl softwareInterfacePackage = new SoftwareInterfacePackageImpl();
		return softwareInterfacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptKind createInterruptKindFromString(EDataType eDataType, String initialValue) {
		InterruptKind result = InterruptKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterruptKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueuePolicyKind createQueuePolicyKindFromString(EDataType eDataType, String initialValue) {
		QueuePolicyKind result = QueuePolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueuePolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutualExclusionResourceKind createMutualExclusionResourceKindFromString(EDataType eDataType, String initialValue) {
		MutualExclusionResourceKind result = MutualExclusionResourceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMutualExclusionResourceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrentAccesProtocolKind createConcurrentAccesProtocolKindFromString(EDataType eDataType, String initialValue) {
		ConcurrentAccesProtocolKind result = ConcurrentAccesProtocolKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConcurrentAccesProtocolKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurencePolicyKind createOccurencePolicyKindFromString(EDataType eDataType, String initialValue) {
		OccurencePolicyKind result = OccurencePolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOccurencePolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationResourceKind createNotificationResourceKindFromString(EDataType eDataType, String initialValue) {
		NotificationResourceKind result = NotificationResourceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotificationResourceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageResourceKind createMessageResourceKindFromString(EDataType eDataType, String initialValue) {
		MessageResourceKind result = MessageResourceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageResourceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessPolicyKind createAccessPolicyKindFromString(EDataType eDataType, String initialValue) {
		AccessPolicyKind result = AccessPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessPolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrmPackage getSrmPackage() {
		return (SrmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SrmPackage getPackage() {
		return SrmPackage.eINSTANCE;
	}

} //SrmFactoryImpl
