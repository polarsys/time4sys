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
package org.polarsys.time4sys.marte.hrm.util;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.polarsys.time4sys.marte.grm.CommunicationEndPoint;
import org.polarsys.time4sys.marte.grm.CommunicationResource;
import org.polarsys.time4sys.marte.grm.ComputingResource;
import org.polarsys.time4sys.marte.grm.DeviceResource;
import org.polarsys.time4sys.marte.grm.ProcessingResource;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourceBroker;
import org.polarsys.time4sys.marte.grm.ResourceConnector;
import org.polarsys.time4sys.marte.grm.ResourceInterface;
import org.polarsys.time4sys.marte.grm.ResourcePackage;
import org.polarsys.time4sys.marte.grm.ResourcePackageableElement;
import org.polarsys.time4sys.marte.grm.ResourcePort;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.grm.StorageResource;
import org.polarsys.time4sys.marte.grm.TimingResource;
import org.polarsys.time4sys.marte.hrm.*;
import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;
import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;
import org.polarsys.time4sys.marte.nfp.coreelements.PackageableElement;
import org.polarsys.time4sys.marte.hrm.EnvCondition;
import org.polarsys.time4sys.marte.hrm.FirmwareArchitecture;
import org.polarsys.time4sys.marte.hrm.HardwareActuator;
import org.polarsys.time4sys.marte.hrm.HardwareArbiter;
import org.polarsys.time4sys.marte.hrm.HardwareAsic;
import org.polarsys.time4sys.marte.hrm.HardwareBranchPredictor;
import org.polarsys.time4sys.marte.hrm.HardwareBridge;
import org.polarsys.time4sys.marte.hrm.HardwareBus;
import org.polarsys.time4sys.marte.hrm.HardwareCache;
import org.polarsys.time4sys.marte.hrm.HardwareCard;
import org.polarsys.time4sys.marte.hrm.HardwareChannel;
import org.polarsys.time4sys.marte.hrm.HardwareChip;
import org.polarsys.time4sys.marte.hrm.HardwareClock;
import org.polarsys.time4sys.marte.hrm.HardwareCommunicationResource;
import org.polarsys.time4sys.marte.hrm.HardwareComponent;
import org.polarsys.time4sys.marte.hrm.HardwareComputingResource;
import org.polarsys.time4sys.marte.hrm.HardwareConnector;
import org.polarsys.time4sys.marte.hrm.HardwareDevice;
import org.polarsys.time4sys.marte.hrm.HardwareDma;
import org.polarsys.time4sys.marte.hrm.HardwareDrive;
import org.polarsys.time4sys.marte.hrm.HardwareInterface;
import org.polarsys.time4sys.marte.hrm.HardwareInterfacePackage;
import org.polarsys.time4sys.marte.hrm.HardwareIo;
import org.polarsys.time4sys.marte.hrm.HardwareIpBlock;
import org.polarsys.time4sys.marte.hrm.HardwareIsa;
import org.polarsys.time4sys.marte.hrm.HardwareMedia;
import org.polarsys.time4sys.marte.hrm.HardwareMemory;
import org.polarsys.time4sys.marte.hrm.HardwareMmu;
import org.polarsys.time4sys.marte.hrm.HardwarePin;
import org.polarsys.time4sys.marte.hrm.HardwarePlatform;
import org.polarsys.time4sys.marte.hrm.HardwarePld;
import org.polarsys.time4sys.marte.hrm.HardwarePort;
import org.polarsys.time4sys.marte.hrm.HardwareProcessingMemory;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;
import org.polarsys.time4sys.marte.hrm.HardwareRam;
import org.polarsys.time4sys.marte.hrm.HardwareResource;
import org.polarsys.time4sys.marte.hrm.HardwareResourcePackage;
import org.polarsys.time4sys.marte.hrm.HardwareRom;
import org.polarsys.time4sys.marte.hrm.HardwareSensor;
import org.polarsys.time4sys.marte.hrm.HardwareService;
import org.polarsys.time4sys.marte.hrm.HardwareStorageManager;
import org.polarsys.time4sys.marte.hrm.HardwareStorageMemory;
import org.polarsys.time4sys.marte.hrm.HardwareSupport;
import org.polarsys.time4sys.marte.hrm.HardwareTimer;
import org.polarsys.time4sys.marte.hrm.HardwareTimingResource;
import org.polarsys.time4sys.marte.hrm.HardwareWatchdog;
import org.polarsys.time4sys.marte.hrm.HardwareWire;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

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
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage
 * @generated
 */
public class HrmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HrmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HrmSwitch() {
		if (modelPackage == null) {
			modelPackage = HrmPackage.eINSTANCE;
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
			case HrmPackage.ENV_CONDITION: {
				EnvCondition envCondition = (EnvCondition)theEObject;
				T result = caseEnvCondition(envCondition);
				if (result == null) result = caseModelElement(envCondition);
				if (result == null) result = caseEModelElement(envCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.FIRMWARE_ARCHITECTURE: {
				FirmwareArchitecture firmwareArchitecture = (FirmwareArchitecture)theEObject;
				T result = caseFirmwareArchitecture(firmwareArchitecture);
				if (result == null) result = caseHardwareResource(firmwareArchitecture);
				if (result == null) result = caseResource(firmwareArchitecture);
				if (result == null) result = caseResourcePackageableElement(firmwareArchitecture);
				if (result == null) result = casePackageableElement(firmwareArchitecture);
				if (result == null) result = caseNamedElement(firmwareArchitecture);
				if (result == null) result = caseENamedElement(firmwareArchitecture);
				if (result == null) result = caseModelElement(firmwareArchitecture);
				if (result == null) result = caseEModelElement(firmwareArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_ACTUATOR: {
				HardwareActuator hardwareActuator = (HardwareActuator)theEObject;
				T result = caseHardwareActuator(hardwareActuator);
				if (result == null) result = caseHardwareIo(hardwareActuator);
				if (result == null) result = caseHardwareDevice(hardwareActuator);
				if (result == null) result = caseDeviceResource(hardwareActuator);
				if (result == null) result = caseHardwareResource(hardwareActuator);
				if (result == null) result = caseHardwareChip(hardwareActuator);
				if (result == null) result = caseProcessingResource(hardwareActuator);
				if (result == null) result = caseHardwareComponent(hardwareActuator);
				if (result == null) result = caseResource(hardwareActuator);
				if (result == null) result = caseResourcePackageableElement(hardwareActuator);
				if (result == null) result = casePackageableElement(hardwareActuator);
				if (result == null) result = caseNamedElement(hardwareActuator);
				if (result == null) result = caseENamedElement(hardwareActuator);
				if (result == null) result = caseModelElement(hardwareActuator);
				if (result == null) result = caseEModelElement(hardwareActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_ARBITER: {
				HardwareArbiter hardwareArbiter = (HardwareArbiter)theEObject;
				T result = caseHardwareArbiter(hardwareArbiter);
				if (result == null) result = caseHardwareCommunicationResource(hardwareArbiter);
				if (result == null) result = caseResourceBroker(hardwareArbiter);
				if (result == null) result = caseCommunicationResource(hardwareArbiter);
				if (result == null) result = caseHardwareResource(hardwareArbiter);
				if (result == null) result = caseHardwareChannel(hardwareArbiter);
				if (result == null) result = caseResource(hardwareArbiter);
				if (result == null) result = caseHardwareComponent(hardwareArbiter);
				if (result == null) result = caseResourcePackageableElement(hardwareArbiter);
				if (result == null) result = casePackageableElement(hardwareArbiter);
				if (result == null) result = caseNamedElement(hardwareArbiter);
				if (result == null) result = caseENamedElement(hardwareArbiter);
				if (result == null) result = caseModelElement(hardwareArbiter);
				if (result == null) result = caseEModelElement(hardwareArbiter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_ASIC: {
				HardwareAsic hardwareAsic = (HardwareAsic)theEObject;
				T result = caseHardwareAsic(hardwareAsic);
				if (result == null) result = caseHardwareComputingResource(hardwareAsic);
				if (result == null) result = caseComputingResource(hardwareAsic);
				if (result == null) result = caseHardwareResource(hardwareAsic);
				if (result == null) result = caseHardwareChip(hardwareAsic);
				if (result == null) result = caseProcessingResource(hardwareAsic);
				if (result == null) result = caseHardwareComponent(hardwareAsic);
				if (result == null) result = caseResource(hardwareAsic);
				if (result == null) result = caseResourcePackageableElement(hardwareAsic);
				if (result == null) result = casePackageableElement(hardwareAsic);
				if (result == null) result = caseNamedElement(hardwareAsic);
				if (result == null) result = caseENamedElement(hardwareAsic);
				if (result == null) result = caseModelElement(hardwareAsic);
				if (result == null) result = caseEModelElement(hardwareAsic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_BRANCH_PREDICTOR: {
				HardwareBranchPredictor hardwareBranchPredictor = (HardwareBranchPredictor)theEObject;
				T result = caseHardwareBranchPredictor(hardwareBranchPredictor);
				if (result == null) result = caseHardwareResource(hardwareBranchPredictor);
				if (result == null) result = caseResource(hardwareBranchPredictor);
				if (result == null) result = caseResourcePackageableElement(hardwareBranchPredictor);
				if (result == null) result = casePackageableElement(hardwareBranchPredictor);
				if (result == null) result = caseNamedElement(hardwareBranchPredictor);
				if (result == null) result = caseENamedElement(hardwareBranchPredictor);
				if (result == null) result = caseModelElement(hardwareBranchPredictor);
				if (result == null) result = caseEModelElement(hardwareBranchPredictor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_BRIDGE: {
				HardwareBridge hardwareBridge = (HardwareBridge)theEObject;
				T result = caseHardwareBridge(hardwareBridge);
				if (result == null) result = caseHardwareMedia(hardwareBridge);
				if (result == null) result = caseHardwareCommunicationResource(hardwareBridge);
				if (result == null) result = caseCommunicationResource(hardwareBridge);
				if (result == null) result = caseHardwareResource(hardwareBridge);
				if (result == null) result = caseHardwareChannel(hardwareBridge);
				if (result == null) result = caseResource(hardwareBridge);
				if (result == null) result = caseHardwareComponent(hardwareBridge);
				if (result == null) result = caseResourcePackageableElement(hardwareBridge);
				if (result == null) result = casePackageableElement(hardwareBridge);
				if (result == null) result = caseNamedElement(hardwareBridge);
				if (result == null) result = caseENamedElement(hardwareBridge);
				if (result == null) result = caseModelElement(hardwareBridge);
				if (result == null) result = caseEModelElement(hardwareBridge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_BUS: {
				HardwareBus hardwareBus = (HardwareBus)theEObject;
				T result = caseHardwareBus(hardwareBus);
				if (result == null) result = caseHardwareMedia(hardwareBus);
				if (result == null) result = caseHardwareCommunicationResource(hardwareBus);
				if (result == null) result = caseCommunicationResource(hardwareBus);
				if (result == null) result = caseHardwareResource(hardwareBus);
				if (result == null) result = caseHardwareChannel(hardwareBus);
				if (result == null) result = caseResource(hardwareBus);
				if (result == null) result = caseHardwareComponent(hardwareBus);
				if (result == null) result = caseResourcePackageableElement(hardwareBus);
				if (result == null) result = casePackageableElement(hardwareBus);
				if (result == null) result = caseNamedElement(hardwareBus);
				if (result == null) result = caseENamedElement(hardwareBus);
				if (result == null) result = caseModelElement(hardwareBus);
				if (result == null) result = caseEModelElement(hardwareBus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_CACHE: {
				HardwareCache hardwareCache = (HardwareCache)theEObject;
				T result = caseHardwareCache(hardwareCache);
				if (result == null) result = caseHardwareProcessingMemory(hardwareCache);
				if (result == null) result = caseHardwareMemory(hardwareCache);
				if (result == null) result = caseStorageResource(hardwareCache);
				if (result == null) result = caseHardwareResource(hardwareCache);
				if (result == null) result = caseHardwareChip(hardwareCache);
				if (result == null) result = caseResource(hardwareCache);
				if (result == null) result = caseHardwareComponent(hardwareCache);
				if (result == null) result = caseResourcePackageableElement(hardwareCache);
				if (result == null) result = casePackageableElement(hardwareCache);
				if (result == null) result = caseNamedElement(hardwareCache);
				if (result == null) result = caseENamedElement(hardwareCache);
				if (result == null) result = caseModelElement(hardwareCache);
				if (result == null) result = caseEModelElement(hardwareCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_CARD: {
				HardwareCard hardwareCard = (HardwareCard)theEObject;
				T result = caseHardwareCard(hardwareCard);
				if (result == null) result = caseHardwareComponent(hardwareCard);
				if (result == null) result = caseModelElement(hardwareCard);
				if (result == null) result = caseEModelElement(hardwareCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_CHANNEL: {
				HardwareChannel hardwareChannel = (HardwareChannel)theEObject;
				T result = caseHardwareChannel(hardwareChannel);
				if (result == null) result = caseHardwareComponent(hardwareChannel);
				if (result == null) result = caseModelElement(hardwareChannel);
				if (result == null) result = caseEModelElement(hardwareChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_CHIP: {
				HardwareChip hardwareChip = (HardwareChip)theEObject;
				T result = caseHardwareChip(hardwareChip);
				if (result == null) result = caseHardwareComponent(hardwareChip);
				if (result == null) result = caseModelElement(hardwareChip);
				if (result == null) result = caseEModelElement(hardwareChip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_CLOCK: {
				HardwareClock hardwareClock = (HardwareClock)theEObject;
				T result = caseHardwareClock(hardwareClock);
				if (result == null) result = caseHardwareTimingResource(hardwareClock);
				if (result == null) result = caseHardwareResource(hardwareClock);
				if (result == null) result = caseTimingResource(hardwareClock);
				if (result == null) result = caseHardwareChip(hardwareClock);
				if (result == null) result = caseResource(hardwareClock);
				if (result == null) result = caseHardwareComponent(hardwareClock);
				if (result == null) result = caseResourcePackageableElement(hardwareClock);
				if (result == null) result = casePackageableElement(hardwareClock);
				if (result == null) result = caseNamedElement(hardwareClock);
				if (result == null) result = caseENamedElement(hardwareClock);
				if (result == null) result = caseModelElement(hardwareClock);
				if (result == null) result = caseEModelElement(hardwareClock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_COMMUNICATION_RESOURCE: {
				HardwareCommunicationResource hardwareCommunicationResource = (HardwareCommunicationResource)theEObject;
				T result = caseHardwareCommunicationResource(hardwareCommunicationResource);
				if (result == null) result = caseCommunicationResource(hardwareCommunicationResource);
				if (result == null) result = caseHardwareResource(hardwareCommunicationResource);
				if (result == null) result = caseHardwareChannel(hardwareCommunicationResource);
				if (result == null) result = caseResource(hardwareCommunicationResource);
				if (result == null) result = caseHardwareComponent(hardwareCommunicationResource);
				if (result == null) result = caseResourcePackageableElement(hardwareCommunicationResource);
				if (result == null) result = casePackageableElement(hardwareCommunicationResource);
				if (result == null) result = caseNamedElement(hardwareCommunicationResource);
				if (result == null) result = caseENamedElement(hardwareCommunicationResource);
				if (result == null) result = caseModelElement(hardwareCommunicationResource);
				if (result == null) result = caseEModelElement(hardwareCommunicationResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_COMPONENT: {
				HardwareComponent hardwareComponent = (HardwareComponent)theEObject;
				T result = caseHardwareComponent(hardwareComponent);
				if (result == null) result = caseModelElement(hardwareComponent);
				if (result == null) result = caseEModelElement(hardwareComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE: {
				HardwareComputingResource hardwareComputingResource = (HardwareComputingResource)theEObject;
				T result = caseHardwareComputingResource(hardwareComputingResource);
				if (result == null) result = caseComputingResource(hardwareComputingResource);
				if (result == null) result = caseHardwareResource(hardwareComputingResource);
				if (result == null) result = caseHardwareChip(hardwareComputingResource);
				if (result == null) result = caseProcessingResource(hardwareComputingResource);
				if (result == null) result = caseHardwareComponent(hardwareComputingResource);
				if (result == null) result = caseResource(hardwareComputingResource);
				if (result == null) result = caseResourcePackageableElement(hardwareComputingResource);
				if (result == null) result = casePackageableElement(hardwareComputingResource);
				if (result == null) result = caseNamedElement(hardwareComputingResource);
				if (result == null) result = caseENamedElement(hardwareComputingResource);
				if (result == null) result = caseModelElement(hardwareComputingResource);
				if (result == null) result = caseEModelElement(hardwareComputingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_CONNECTOR: {
				HardwareConnector hardwareConnector = (HardwareConnector)theEObject;
				T result = caseHardwareConnector(hardwareConnector);
				if (result == null) result = caseResourceConnector(hardwareConnector);
				if (result == null) result = caseModelElement(hardwareConnector);
				if (result == null) result = caseEModelElement(hardwareConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_DEVICE: {
				HardwareDevice hardwareDevice = (HardwareDevice)theEObject;
				T result = caseHardwareDevice(hardwareDevice);
				if (result == null) result = caseDeviceResource(hardwareDevice);
				if (result == null) result = caseHardwareResource(hardwareDevice);
				if (result == null) result = caseHardwareChip(hardwareDevice);
				if (result == null) result = caseProcessingResource(hardwareDevice);
				if (result == null) result = caseHardwareComponent(hardwareDevice);
				if (result == null) result = caseResource(hardwareDevice);
				if (result == null) result = caseResourcePackageableElement(hardwareDevice);
				if (result == null) result = casePackageableElement(hardwareDevice);
				if (result == null) result = caseNamedElement(hardwareDevice);
				if (result == null) result = caseENamedElement(hardwareDevice);
				if (result == null) result = caseModelElement(hardwareDevice);
				if (result == null) result = caseEModelElement(hardwareDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_DMA: {
				HardwareDma hardwareDma = (HardwareDma)theEObject;
				T result = caseHardwareDma(hardwareDma);
				if (result == null) result = caseHardwareStorageManager(hardwareDma);
				if (result == null) result = caseHardwareArbiter(hardwareDma);
				if (result == null) result = caseResourceBroker(hardwareDma);
				if (result == null) result = caseHardwareChip(hardwareDma);
				if (result == null) result = caseHardwareCommunicationResource(hardwareDma);
				if (result == null) result = caseCommunicationResource(hardwareDma);
				if (result == null) result = caseHardwareResource(hardwareDma);
				if (result == null) result = caseHardwareChannel(hardwareDma);
				if (result == null) result = caseResource(hardwareDma);
				if (result == null) result = caseResourcePackageableElement(hardwareDma);
				if (result == null) result = caseHardwareComponent(hardwareDma);
				if (result == null) result = casePackageableElement(hardwareDma);
				if (result == null) result = caseNamedElement(hardwareDma);
				if (result == null) result = caseENamedElement(hardwareDma);
				if (result == null) result = caseModelElement(hardwareDma);
				if (result == null) result = caseEModelElement(hardwareDma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_DRIVE: {
				HardwareDrive hardwareDrive = (HardwareDrive)theEObject;
				T result = caseHardwareDrive(hardwareDrive);
				if (result == null) result = caseHardwareStorageMemory(hardwareDrive);
				if (result == null) result = caseHardwareMemory(hardwareDrive);
				if (result == null) result = caseStorageResource(hardwareDrive);
				if (result == null) result = caseHardwareResource(hardwareDrive);
				if (result == null) result = caseHardwareChip(hardwareDrive);
				if (result == null) result = caseResource(hardwareDrive);
				if (result == null) result = caseHardwareComponent(hardwareDrive);
				if (result == null) result = caseResourcePackageableElement(hardwareDrive);
				if (result == null) result = casePackageableElement(hardwareDrive);
				if (result == null) result = caseNamedElement(hardwareDrive);
				if (result == null) result = caseENamedElement(hardwareDrive);
				if (result == null) result = caseModelElement(hardwareDrive);
				if (result == null) result = caseEModelElement(hardwareDrive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_INTERFACE: {
				HardwareInterface hardwareInterface = (HardwareInterface)theEObject;
				T result = caseHardwareInterface(hardwareInterface);
				if (result == null) result = caseResourceInterface(hardwareInterface);
				if (result == null) result = caseResourcePackageableElement(hardwareInterface);
				if (result == null) result = casePackageableElement(hardwareInterface);
				if (result == null) result = caseNamedElement(hardwareInterface);
				if (result == null) result = caseENamedElement(hardwareInterface);
				if (result == null) result = caseModelElement(hardwareInterface);
				if (result == null) result = caseEModelElement(hardwareInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_INTERFACE_PACKAGE: {
				HardwareInterfacePackage hardwareInterfacePackage = (HardwareInterfacePackage)theEObject;
				T result = caseHardwareInterfacePackage(hardwareInterfacePackage);
				if (result == null) result = caseResourcePackage(hardwareInterfacePackage);
				if (result == null) result = casePackage(hardwareInterfacePackage);
				if (result == null) result = casePackageableElement(hardwareInterfacePackage);
				if (result == null) result = caseNamedElement(hardwareInterfacePackage);
				if (result == null) result = caseENamedElement(hardwareInterfacePackage);
				if (result == null) result = caseModelElement(hardwareInterfacePackage);
				if (result == null) result = caseEModelElement(hardwareInterfacePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_IO: {
				HardwareIo hardwareIo = (HardwareIo)theEObject;
				T result = caseHardwareIo(hardwareIo);
				if (result == null) result = caseHardwareDevice(hardwareIo);
				if (result == null) result = caseDeviceResource(hardwareIo);
				if (result == null) result = caseHardwareResource(hardwareIo);
				if (result == null) result = caseHardwareChip(hardwareIo);
				if (result == null) result = caseProcessingResource(hardwareIo);
				if (result == null) result = caseHardwareComponent(hardwareIo);
				if (result == null) result = caseResource(hardwareIo);
				if (result == null) result = caseResourcePackageableElement(hardwareIo);
				if (result == null) result = casePackageableElement(hardwareIo);
				if (result == null) result = caseNamedElement(hardwareIo);
				if (result == null) result = caseENamedElement(hardwareIo);
				if (result == null) result = caseModelElement(hardwareIo);
				if (result == null) result = caseEModelElement(hardwareIo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_IP_BLOCK: {
				HardwareIpBlock hardwareIpBlock = (HardwareIpBlock)theEObject;
				T result = caseHardwareIpBlock(hardwareIpBlock);
				if (result == null) result = caseHardwareResource(hardwareIpBlock);
				if (result == null) result = caseResource(hardwareIpBlock);
				if (result == null) result = caseResourcePackageableElement(hardwareIpBlock);
				if (result == null) result = casePackageableElement(hardwareIpBlock);
				if (result == null) result = caseNamedElement(hardwareIpBlock);
				if (result == null) result = caseENamedElement(hardwareIpBlock);
				if (result == null) result = caseModelElement(hardwareIpBlock);
				if (result == null) result = caseEModelElement(hardwareIpBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_ISA: {
				HardwareIsa hardwareIsa = (HardwareIsa)theEObject;
				T result = caseHardwareIsa(hardwareIsa);
				if (result == null) result = caseHardwareResource(hardwareIsa);
				if (result == null) result = caseResource(hardwareIsa);
				if (result == null) result = caseResourcePackageableElement(hardwareIsa);
				if (result == null) result = casePackageableElement(hardwareIsa);
				if (result == null) result = caseNamedElement(hardwareIsa);
				if (result == null) result = caseENamedElement(hardwareIsa);
				if (result == null) result = caseModelElement(hardwareIsa);
				if (result == null) result = caseEModelElement(hardwareIsa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_MEDIA: {
				HardwareMedia hardwareMedia = (HardwareMedia)theEObject;
				T result = caseHardwareMedia(hardwareMedia);
				if (result == null) result = caseHardwareCommunicationResource(hardwareMedia);
				if (result == null) result = caseCommunicationResource(hardwareMedia);
				if (result == null) result = caseHardwareResource(hardwareMedia);
				if (result == null) result = caseHardwareChannel(hardwareMedia);
				if (result == null) result = caseResource(hardwareMedia);
				if (result == null) result = caseHardwareComponent(hardwareMedia);
				if (result == null) result = caseResourcePackageableElement(hardwareMedia);
				if (result == null) result = casePackageableElement(hardwareMedia);
				if (result == null) result = caseNamedElement(hardwareMedia);
				if (result == null) result = caseENamedElement(hardwareMedia);
				if (result == null) result = caseModelElement(hardwareMedia);
				if (result == null) result = caseEModelElement(hardwareMedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_MEMORY: {
				HardwareMemory hardwareMemory = (HardwareMemory)theEObject;
				T result = caseHardwareMemory(hardwareMemory);
				if (result == null) result = caseStorageResource(hardwareMemory);
				if (result == null) result = caseHardwareResource(hardwareMemory);
				if (result == null) result = caseHardwareChip(hardwareMemory);
				if (result == null) result = caseResource(hardwareMemory);
				if (result == null) result = caseHardwareComponent(hardwareMemory);
				if (result == null) result = caseResourcePackageableElement(hardwareMemory);
				if (result == null) result = casePackageableElement(hardwareMemory);
				if (result == null) result = caseNamedElement(hardwareMemory);
				if (result == null) result = caseENamedElement(hardwareMemory);
				if (result == null) result = caseModelElement(hardwareMemory);
				if (result == null) result = caseEModelElement(hardwareMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_MMU: {
				HardwareMmu hardwareMmu = (HardwareMmu)theEObject;
				T result = caseHardwareMmu(hardwareMmu);
				if (result == null) result = caseHardwareStorageManager(hardwareMmu);
				if (result == null) result = caseResourceBroker(hardwareMmu);
				if (result == null) result = caseHardwareChip(hardwareMmu);
				if (result == null) result = caseResource(hardwareMmu);
				if (result == null) result = caseHardwareComponent(hardwareMmu);
				if (result == null) result = caseResourcePackageableElement(hardwareMmu);
				if (result == null) result = casePackageableElement(hardwareMmu);
				if (result == null) result = caseNamedElement(hardwareMmu);
				if (result == null) result = caseENamedElement(hardwareMmu);
				if (result == null) result = caseModelElement(hardwareMmu);
				if (result == null) result = caseEModelElement(hardwareMmu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_PIN: {
				HardwarePin hardwarePin = (HardwarePin)theEObject;
				T result = caseHardwarePin(hardwarePin);
				if (result == null) result = caseNamedElement(hardwarePin);
				if (result == null) result = caseENamedElement(hardwarePin);
				if (result == null) result = caseModelElement(hardwarePin);
				if (result == null) result = caseEModelElement(hardwarePin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_PLATFORM: {
				HardwarePlatform hardwarePlatform = (HardwarePlatform)theEObject;
				T result = caseHardwarePlatform(hardwarePlatform);
				if (result == null) result = caseHardwareResource(hardwarePlatform);
				if (result == null) result = caseHardwareCard(hardwarePlatform);
				if (result == null) result = caseResource(hardwarePlatform);
				if (result == null) result = caseHardwareComponent(hardwarePlatform);
				if (result == null) result = caseResourcePackageableElement(hardwarePlatform);
				if (result == null) result = casePackageableElement(hardwarePlatform);
				if (result == null) result = caseNamedElement(hardwarePlatform);
				if (result == null) result = caseENamedElement(hardwarePlatform);
				if (result == null) result = caseModelElement(hardwarePlatform);
				if (result == null) result = caseEModelElement(hardwarePlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_PLD: {
				HardwarePld hardwarePld = (HardwarePld)theEObject;
				T result = caseHardwarePld(hardwarePld);
				if (result == null) result = caseHardwareComputingResource(hardwarePld);
				if (result == null) result = caseComputingResource(hardwarePld);
				if (result == null) result = caseHardwareResource(hardwarePld);
				if (result == null) result = caseHardwareChip(hardwarePld);
				if (result == null) result = caseProcessingResource(hardwarePld);
				if (result == null) result = caseHardwareComponent(hardwarePld);
				if (result == null) result = caseResource(hardwarePld);
				if (result == null) result = caseResourcePackageableElement(hardwarePld);
				if (result == null) result = casePackageableElement(hardwarePld);
				if (result == null) result = caseNamedElement(hardwarePld);
				if (result == null) result = caseENamedElement(hardwarePld);
				if (result == null) result = caseModelElement(hardwarePld);
				if (result == null) result = caseEModelElement(hardwarePld);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_PORT: {
				HardwarePort hardwarePort = (HardwarePort)theEObject;
				T result = caseHardwarePort(hardwarePort);
				if (result == null) result = caseResourcePort(hardwarePort);
				if (result == null) result = caseHardwareComponent(hardwarePort);
				if (result == null) result = caseCommunicationEndPoint(hardwarePort);
				if (result == null) result = caseCommunicationResource(hardwarePort);
				if (result == null) result = caseResource(hardwarePort);
				if (result == null) result = caseResourcePackageableElement(hardwarePort);
				if (result == null) result = casePackageableElement(hardwarePort);
				if (result == null) result = caseNamedElement(hardwarePort);
				if (result == null) result = caseENamedElement(hardwarePort);
				if (result == null) result = caseModelElement(hardwarePort);
				if (result == null) result = caseEModelElement(hardwarePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_PROCESSING_MEMORY: {
				HardwareProcessingMemory hardwareProcessingMemory = (HardwareProcessingMemory)theEObject;
				T result = caseHardwareProcessingMemory(hardwareProcessingMemory);
				if (result == null) result = caseHardwareMemory(hardwareProcessingMemory);
				if (result == null) result = caseStorageResource(hardwareProcessingMemory);
				if (result == null) result = caseHardwareResource(hardwareProcessingMemory);
				if (result == null) result = caseHardwareChip(hardwareProcessingMemory);
				if (result == null) result = caseResource(hardwareProcessingMemory);
				if (result == null) result = caseHardwareComponent(hardwareProcessingMemory);
				if (result == null) result = caseResourcePackageableElement(hardwareProcessingMemory);
				if (result == null) result = casePackageableElement(hardwareProcessingMemory);
				if (result == null) result = caseNamedElement(hardwareProcessingMemory);
				if (result == null) result = caseENamedElement(hardwareProcessingMemory);
				if (result == null) result = caseModelElement(hardwareProcessingMemory);
				if (result == null) result = caseEModelElement(hardwareProcessingMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_PROCESSOR: {
				HardwareProcessor hardwareProcessor = (HardwareProcessor)theEObject;
				T result = caseHardwareProcessor(hardwareProcessor);
				if (result == null) result = caseHardwareComputingResource(hardwareProcessor);
				if (result == null) result = caseComputingResource(hardwareProcessor);
				if (result == null) result = caseHardwareResource(hardwareProcessor);
				if (result == null) result = caseHardwareChip(hardwareProcessor);
				if (result == null) result = caseProcessingResource(hardwareProcessor);
				if (result == null) result = caseHardwareComponent(hardwareProcessor);
				if (result == null) result = caseResource(hardwareProcessor);
				if (result == null) result = caseResourcePackageableElement(hardwareProcessor);
				if (result == null) result = casePackageableElement(hardwareProcessor);
				if (result == null) result = caseNamedElement(hardwareProcessor);
				if (result == null) result = caseENamedElement(hardwareProcessor);
				if (result == null) result = caseModelElement(hardwareProcessor);
				if (result == null) result = caseEModelElement(hardwareProcessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_RAM: {
				HardwareRam hardwareRam = (HardwareRam)theEObject;
				T result = caseHardwareRam(hardwareRam);
				if (result == null) result = caseHardwareProcessingMemory(hardwareRam);
				if (result == null) result = caseHardwareMemory(hardwareRam);
				if (result == null) result = caseStorageResource(hardwareRam);
				if (result == null) result = caseHardwareResource(hardwareRam);
				if (result == null) result = caseHardwareChip(hardwareRam);
				if (result == null) result = caseResource(hardwareRam);
				if (result == null) result = caseHardwareComponent(hardwareRam);
				if (result == null) result = caseResourcePackageableElement(hardwareRam);
				if (result == null) result = casePackageableElement(hardwareRam);
				if (result == null) result = caseNamedElement(hardwareRam);
				if (result == null) result = caseENamedElement(hardwareRam);
				if (result == null) result = caseModelElement(hardwareRam);
				if (result == null) result = caseEModelElement(hardwareRam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_RESOURCE_PACKAGE: {
				HardwareResourcePackage hardwareResourcePackage = (HardwareResourcePackage)theEObject;
				T result = caseHardwareResourcePackage(hardwareResourcePackage);
				if (result == null) result = caseResourcePackage(hardwareResourcePackage);
				if (result == null) result = casePackage(hardwareResourcePackage);
				if (result == null) result = casePackageableElement(hardwareResourcePackage);
				if (result == null) result = caseNamedElement(hardwareResourcePackage);
				if (result == null) result = caseENamedElement(hardwareResourcePackage);
				if (result == null) result = caseModelElement(hardwareResourcePackage);
				if (result == null) result = caseEModelElement(hardwareResourcePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_RESOURCE: {
				HardwareResource hardwareResource = (HardwareResource)theEObject;
				T result = caseHardwareResource(hardwareResource);
				if (result == null) result = caseResource(hardwareResource);
				if (result == null) result = caseResourcePackageableElement(hardwareResource);
				if (result == null) result = casePackageableElement(hardwareResource);
				if (result == null) result = caseNamedElement(hardwareResource);
				if (result == null) result = caseENamedElement(hardwareResource);
				if (result == null) result = caseModelElement(hardwareResource);
				if (result == null) result = caseEModelElement(hardwareResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_ROM: {
				HardwareRom hardwareRom = (HardwareRom)theEObject;
				T result = caseHardwareRom(hardwareRom);
				if (result == null) result = caseHardwareStorageMemory(hardwareRom);
				if (result == null) result = caseHardwareMemory(hardwareRom);
				if (result == null) result = caseStorageResource(hardwareRom);
				if (result == null) result = caseHardwareResource(hardwareRom);
				if (result == null) result = caseHardwareChip(hardwareRom);
				if (result == null) result = caseResource(hardwareRom);
				if (result == null) result = caseHardwareComponent(hardwareRom);
				if (result == null) result = caseResourcePackageableElement(hardwareRom);
				if (result == null) result = casePackageableElement(hardwareRom);
				if (result == null) result = caseNamedElement(hardwareRom);
				if (result == null) result = caseENamedElement(hardwareRom);
				if (result == null) result = caseModelElement(hardwareRom);
				if (result == null) result = caseEModelElement(hardwareRom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_SENSOR: {
				HardwareSensor hardwareSensor = (HardwareSensor)theEObject;
				T result = caseHardwareSensor(hardwareSensor);
				if (result == null) result = caseHardwareIo(hardwareSensor);
				if (result == null) result = caseHardwareDevice(hardwareSensor);
				if (result == null) result = caseDeviceResource(hardwareSensor);
				if (result == null) result = caseHardwareResource(hardwareSensor);
				if (result == null) result = caseHardwareChip(hardwareSensor);
				if (result == null) result = caseProcessingResource(hardwareSensor);
				if (result == null) result = caseHardwareComponent(hardwareSensor);
				if (result == null) result = caseResource(hardwareSensor);
				if (result == null) result = caseResourcePackageableElement(hardwareSensor);
				if (result == null) result = casePackageableElement(hardwareSensor);
				if (result == null) result = caseNamedElement(hardwareSensor);
				if (result == null) result = caseENamedElement(hardwareSensor);
				if (result == null) result = caseModelElement(hardwareSensor);
				if (result == null) result = caseEModelElement(hardwareSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_SERVICE: {
				HardwareService hardwareService = (HardwareService)theEObject;
				T result = caseHardwareService(hardwareService);
				if (result == null) result = caseResourceService(hardwareService);
				if (result == null) result = caseNamedElement(hardwareService);
				if (result == null) result = caseENamedElement(hardwareService);
				if (result == null) result = caseModelElement(hardwareService);
				if (result == null) result = caseEModelElement(hardwareService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_STORAGE_MANAGER: {
				HardwareStorageManager hardwareStorageManager = (HardwareStorageManager)theEObject;
				T result = caseHardwareStorageManager(hardwareStorageManager);
				if (result == null) result = caseResourceBroker(hardwareStorageManager);
				if (result == null) result = caseHardwareChip(hardwareStorageManager);
				if (result == null) result = caseResource(hardwareStorageManager);
				if (result == null) result = caseHardwareComponent(hardwareStorageManager);
				if (result == null) result = caseResourcePackageableElement(hardwareStorageManager);
				if (result == null) result = casePackageableElement(hardwareStorageManager);
				if (result == null) result = caseNamedElement(hardwareStorageManager);
				if (result == null) result = caseENamedElement(hardwareStorageManager);
				if (result == null) result = caseModelElement(hardwareStorageManager);
				if (result == null) result = caseEModelElement(hardwareStorageManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_STORAGE_MEMORY: {
				HardwareStorageMemory hardwareStorageMemory = (HardwareStorageMemory)theEObject;
				T result = caseHardwareStorageMemory(hardwareStorageMemory);
				if (result == null) result = caseHardwareMemory(hardwareStorageMemory);
				if (result == null) result = caseStorageResource(hardwareStorageMemory);
				if (result == null) result = caseHardwareResource(hardwareStorageMemory);
				if (result == null) result = caseHardwareChip(hardwareStorageMemory);
				if (result == null) result = caseResource(hardwareStorageMemory);
				if (result == null) result = caseHardwareComponent(hardwareStorageMemory);
				if (result == null) result = caseResourcePackageableElement(hardwareStorageMemory);
				if (result == null) result = casePackageableElement(hardwareStorageMemory);
				if (result == null) result = caseNamedElement(hardwareStorageMemory);
				if (result == null) result = caseENamedElement(hardwareStorageMemory);
				if (result == null) result = caseModelElement(hardwareStorageMemory);
				if (result == null) result = caseEModelElement(hardwareStorageMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_SUPPORT: {
				HardwareSupport hardwareSupport = (HardwareSupport)theEObject;
				T result = caseHardwareSupport(hardwareSupport);
				if (result == null) result = caseHardwareDevice(hardwareSupport);
				if (result == null) result = caseDeviceResource(hardwareSupport);
				if (result == null) result = caseHardwareResource(hardwareSupport);
				if (result == null) result = caseHardwareChip(hardwareSupport);
				if (result == null) result = caseProcessingResource(hardwareSupport);
				if (result == null) result = caseHardwareComponent(hardwareSupport);
				if (result == null) result = caseResource(hardwareSupport);
				if (result == null) result = caseResourcePackageableElement(hardwareSupport);
				if (result == null) result = casePackageableElement(hardwareSupport);
				if (result == null) result = caseNamedElement(hardwareSupport);
				if (result == null) result = caseENamedElement(hardwareSupport);
				if (result == null) result = caseModelElement(hardwareSupport);
				if (result == null) result = caseEModelElement(hardwareSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_TIMING_RESOURCE: {
				HardwareTimingResource hardwareTimingResource = (HardwareTimingResource)theEObject;
				T result = caseHardwareTimingResource(hardwareTimingResource);
				if (result == null) result = caseHardwareResource(hardwareTimingResource);
				if (result == null) result = caseTimingResource(hardwareTimingResource);
				if (result == null) result = caseHardwareChip(hardwareTimingResource);
				if (result == null) result = caseResource(hardwareTimingResource);
				if (result == null) result = caseHardwareComponent(hardwareTimingResource);
				if (result == null) result = caseResourcePackageableElement(hardwareTimingResource);
				if (result == null) result = casePackageableElement(hardwareTimingResource);
				if (result == null) result = caseNamedElement(hardwareTimingResource);
				if (result == null) result = caseENamedElement(hardwareTimingResource);
				if (result == null) result = caseModelElement(hardwareTimingResource);
				if (result == null) result = caseEModelElement(hardwareTimingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_TIMER: {
				HardwareTimer hardwareTimer = (HardwareTimer)theEObject;
				T result = caseHardwareTimer(hardwareTimer);
				if (result == null) result = caseHardwareTimingResource(hardwareTimer);
				if (result == null) result = caseHardwareResource(hardwareTimer);
				if (result == null) result = caseTimingResource(hardwareTimer);
				if (result == null) result = caseHardwareChip(hardwareTimer);
				if (result == null) result = caseResource(hardwareTimer);
				if (result == null) result = caseHardwareComponent(hardwareTimer);
				if (result == null) result = caseResourcePackageableElement(hardwareTimer);
				if (result == null) result = casePackageableElement(hardwareTimer);
				if (result == null) result = caseNamedElement(hardwareTimer);
				if (result == null) result = caseENamedElement(hardwareTimer);
				if (result == null) result = caseModelElement(hardwareTimer);
				if (result == null) result = caseEModelElement(hardwareTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_WATCHDOG: {
				HardwareWatchdog hardwareWatchdog = (HardwareWatchdog)theEObject;
				T result = caseHardwareWatchdog(hardwareWatchdog);
				if (result == null) result = caseHardwareTimer(hardwareWatchdog);
				if (result == null) result = caseHardwareTimingResource(hardwareWatchdog);
				if (result == null) result = caseHardwareResource(hardwareWatchdog);
				if (result == null) result = caseTimingResource(hardwareWatchdog);
				if (result == null) result = caseHardwareChip(hardwareWatchdog);
				if (result == null) result = caseResource(hardwareWatchdog);
				if (result == null) result = caseHardwareComponent(hardwareWatchdog);
				if (result == null) result = caseResourcePackageableElement(hardwareWatchdog);
				if (result == null) result = casePackageableElement(hardwareWatchdog);
				if (result == null) result = caseNamedElement(hardwareWatchdog);
				if (result == null) result = caseENamedElement(hardwareWatchdog);
				if (result == null) result = caseModelElement(hardwareWatchdog);
				if (result == null) result = caseEModelElement(hardwareWatchdog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HrmPackage.HARDWARE_WIRE: {
				HardwareWire hardwareWire = (HardwareWire)theEObject;
				T result = caseHardwareWire(hardwareWire);
				if (result == null) result = caseModelElement(hardwareWire);
				if (result == null) result = caseEModelElement(hardwareWire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Resource Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Resource Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareResourcePackage(HardwareResourcePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareResource(HardwareResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwarePort(HardwarePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareConnector(HardwareConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareService(HardwareService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Computing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Computing Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareComputingResource(HardwareComputingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareProcessor(HardwareProcessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Asic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Asic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareAsic(HardwareAsic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Pld</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Pld</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwarePld(HardwarePld object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Branch Predictor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Branch Predictor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareBranchPredictor(HardwareBranchPredictor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Isa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Isa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareIsa(HardwareIsa object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareMemory(HardwareMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Processing Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Processing Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareProcessingMemory(HardwareProcessingMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Storage Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Storage Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareStorageMemory(HardwareStorageMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareCache(HardwareCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Ram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Ram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareRam(HardwareRam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Rom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Rom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareRom(HardwareRom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Drive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Drive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareDrive(HardwareDrive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Storage Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Storage Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareStorageManager(HardwareStorageManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Dma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Dma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareDma(HardwareDma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Mmu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Mmu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareMmu(HardwareMmu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Arbiter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Arbiter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareArbiter(HardwareArbiter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Communication Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Communication Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareCommunicationResource(HardwareCommunicationResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareMedia(HardwareMedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareBus(HardwareBus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Bridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Bridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareBridge(HardwareBridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Timing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Timing Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareTimingResource(HardwareTimingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareClock(HardwareClock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareTimer(HardwareTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Watchdog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Watchdog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareWatchdog(HardwareWatchdog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareDevice(HardwareDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Io</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Io</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareIo(HardwareIo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareSupport(HardwareSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareActuator(HardwareActuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareSensor(HardwareSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwarePlatform(HardwarePlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareComponent(HardwareComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Env Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Env Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvCondition(EnvCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Chip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Chip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareChip(HardwareChip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareChannel(HardwareChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareCard(HardwareCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firmware Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firmware Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmwareArchitecture(FirmwareArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Ip Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Ip Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareIpBlock(HardwareIpBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwarePin(HardwarePin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Wire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Wire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareWire(HardwareWire object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareInterface(HardwareInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Interface Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Interface Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareInterfacePackage(HardwareInterfacePackage object) {
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

} //HrmSwitch
