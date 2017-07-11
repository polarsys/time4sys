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
package org.polarsys.time4sys.marte.hrm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.time4sys.marte.hrm.CacheType;
import org.polarsys.time4sys.marte.hrm.ComponentState;
import org.polarsys.time4sys.marte.hrm.ConditionType;
import org.polarsys.time4sys.marte.hrm.Direction;
import org.polarsys.time4sys.marte.hrm.EnvCondition;
import org.polarsys.time4sys.marte.hrm.FirmwareArchitecture;
import org.polarsys.time4sys.marte.hrm.HardwareActuator;
import org.polarsys.time4sys.marte.hrm.HardwareArbiter;
import org.polarsys.time4sys.marte.hrm.HardwareAsic;
import org.polarsys.time4sys.marte.hrm.HardwareBranchPredictor;
import org.polarsys.time4sys.marte.hrm.HardwareBridge;
import org.polarsys.time4sys.marte.hrm.HardwareBus;
import org.polarsys.time4sys.marte.hrm.HardwareCache;
import org.polarsys.time4sys.marte.hrm.HardwareClock;
import org.polarsys.time4sys.marte.hrm.HardwareCommunicationResource;
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
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;
import org.polarsys.time4sys.marte.hrm.HardwareRam;
import org.polarsys.time4sys.marte.hrm.HardwareResourcePackage;
import org.polarsys.time4sys.marte.hrm.HardwareRom;
import org.polarsys.time4sys.marte.hrm.HardwareSensor;
import org.polarsys.time4sys.marte.hrm.HardwareService;
import org.polarsys.time4sys.marte.hrm.HardwareStorageManager;
import org.polarsys.time4sys.marte.hrm.HardwareSupport;
import org.polarsys.time4sys.marte.hrm.HardwareTimer;
import org.polarsys.time4sys.marte.hrm.HardwareTimingResource;
import org.polarsys.time4sys.marte.hrm.HardwareWatchdog;
import org.polarsys.time4sys.marte.hrm.HardwareWire;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.marte.hrm.IsaType;
import org.polarsys.time4sys.marte.hrm.PldClass;
import org.polarsys.time4sys.marte.hrm.PldTechnology;
import org.polarsys.time4sys.marte.hrm.PortType;
import org.polarsys.time4sys.marte.hrm.ReplPolicy;
import org.polarsys.time4sys.marte.hrm.RomType;
import org.polarsys.time4sys.marte.hrm.WritePolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HrmFactoryImpl extends EFactoryImpl implements HrmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HrmFactory init() {
		try {
			HrmFactory theHrmFactory = (HrmFactory)EPackage.Registry.INSTANCE.getEFactory(HrmPackage.eNS_URI);
			if (theHrmFactory != null) {
				return theHrmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HrmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HrmFactoryImpl() {
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
			case HrmPackage.ENV_CONDITION: return createEnvCondition();
			case HrmPackage.FIRMWARE_ARCHITECTURE: return createFirmwareArchitecture();
			case HrmPackage.HARDWARE_ACTUATOR: return createHardwareActuator();
			case HrmPackage.HARDWARE_ARBITER: return createHardwareArbiter();
			case HrmPackage.HARDWARE_ASIC: return createHardwareAsic();
			case HrmPackage.HARDWARE_BRANCH_PREDICTOR: return createHardwareBranchPredictor();
			case HrmPackage.HARDWARE_BRIDGE: return createHardwareBridge();
			case HrmPackage.HARDWARE_BUS: return createHardwareBus();
			case HrmPackage.HARDWARE_CACHE: return createHardwareCache();
			case HrmPackage.HARDWARE_CLOCK: return createHardwareClock();
			case HrmPackage.HARDWARE_COMMUNICATION_RESOURCE: return createHardwareCommunicationResource();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE: return createHardwareComputingResource();
			case HrmPackage.HARDWARE_CONNECTOR: return createHardwareConnector();
			case HrmPackage.HARDWARE_DEVICE: return createHardwareDevice();
			case HrmPackage.HARDWARE_DMA: return createHardwareDma();
			case HrmPackage.HARDWARE_DRIVE: return createHardwareDrive();
			case HrmPackage.HARDWARE_INTERFACE: return createHardwareInterface();
			case HrmPackage.HARDWARE_INTERFACE_PACKAGE: return createHardwareInterfacePackage();
			case HrmPackage.HARDWARE_IO: return createHardwareIo();
			case HrmPackage.HARDWARE_IP_BLOCK: return createHardwareIpBlock();
			case HrmPackage.HARDWARE_ISA: return createHardwareIsa();
			case HrmPackage.HARDWARE_MEDIA: return createHardwareMedia();
			case HrmPackage.HARDWARE_MEMORY: return createHardwareMemory();
			case HrmPackage.HARDWARE_MMU: return createHardwareMmu();
			case HrmPackage.HARDWARE_PIN: return createHardwarePin();
			case HrmPackage.HARDWARE_PLATFORM: return createHardwarePlatform();
			case HrmPackage.HARDWARE_PLD: return createHardwarePld();
			case HrmPackage.HARDWARE_PORT: return createHardwarePort();
			case HrmPackage.HARDWARE_PROCESSOR: return createHardwareProcessor();
			case HrmPackage.HARDWARE_RAM: return createHardwareRam();
			case HrmPackage.HARDWARE_RESOURCE_PACKAGE: return createHardwareResourcePackage();
			case HrmPackage.HARDWARE_ROM: return createHardwareRom();
			case HrmPackage.HARDWARE_SENSOR: return createHardwareSensor();
			case HrmPackage.HARDWARE_SERVICE: return createHardwareService();
			case HrmPackage.HARDWARE_STORAGE_MANAGER: return createHardwareStorageManager();
			case HrmPackage.HARDWARE_SUPPORT: return createHardwareSupport();
			case HrmPackage.HARDWARE_TIMING_RESOURCE: return createHardwareTimingResource();
			case HrmPackage.HARDWARE_TIMER: return createHardwareTimer();
			case HrmPackage.HARDWARE_WATCHDOG: return createHardwareWatchdog();
			case HrmPackage.HARDWARE_WIRE: return createHardwareWire();
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
			case HrmPackage.CACHE_TYPE:
				return createCacheTypeFromString(eDataType, initialValue);
			case HrmPackage.COMPONENT_STATE:
				return createComponentStateFromString(eDataType, initialValue);
			case HrmPackage.CONDITION_TYPE:
				return createConditionTypeFromString(eDataType, initialValue);
			case HrmPackage.DIRECTION:
				return createDirectionFromString(eDataType, initialValue);
			case HrmPackage.ISA_TYPE:
				return createIsaTypeFromString(eDataType, initialValue);
			case HrmPackage.PLD_TECHNOLOGY:
				return createPldTechnologyFromString(eDataType, initialValue);
			case HrmPackage.PLD_CLASS:
				return createPldClassFromString(eDataType, initialValue);
			case HrmPackage.PORT_TYPE:
				return createPortTypeFromString(eDataType, initialValue);
			case HrmPackage.REPL_POLICY:
				return createReplPolicyFromString(eDataType, initialValue);
			case HrmPackage.ROM_TYPE:
				return createRomTypeFromString(eDataType, initialValue);
			case HrmPackage.WRITE_POLICY:
				return createWritePolicyFromString(eDataType, initialValue);
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
			case HrmPackage.CACHE_TYPE:
				return convertCacheTypeToString(eDataType, instanceValue);
			case HrmPackage.COMPONENT_STATE:
				return convertComponentStateToString(eDataType, instanceValue);
			case HrmPackage.CONDITION_TYPE:
				return convertConditionTypeToString(eDataType, instanceValue);
			case HrmPackage.DIRECTION:
				return convertDirectionToString(eDataType, instanceValue);
			case HrmPackage.ISA_TYPE:
				return convertIsaTypeToString(eDataType, instanceValue);
			case HrmPackage.PLD_TECHNOLOGY:
				return convertPldTechnologyToString(eDataType, instanceValue);
			case HrmPackage.PLD_CLASS:
				return convertPldClassToString(eDataType, instanceValue);
			case HrmPackage.PORT_TYPE:
				return convertPortTypeToString(eDataType, instanceValue);
			case HrmPackage.REPL_POLICY:
				return convertReplPolicyToString(eDataType, instanceValue);
			case HrmPackage.ROM_TYPE:
				return convertRomTypeToString(eDataType, instanceValue);
			case HrmPackage.WRITE_POLICY:
				return convertWritePolicyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareResourcePackage createHardwareResourcePackage() {
		HardwareResourcePackageImpl hardwareResourcePackage = new HardwareResourcePackageImpl();
		return hardwareResourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePort createHardwarePort() {
		HardwarePortImpl hardwarePort = new HardwarePortImpl();
		return hardwarePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareConnector createHardwareConnector() {
		HardwareConnectorImpl hardwareConnector = new HardwareConnectorImpl();
		return hardwareConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareService createHardwareService() {
		HardwareServiceImpl hardwareService = new HardwareServiceImpl();
		return hardwareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComputingResource createHardwareComputingResource() {
		HardwareComputingResourceImpl hardwareComputingResource = new HardwareComputingResourceImpl();
		return hardwareComputingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareProcessor createHardwareProcessor() {
		HardwareProcessorImpl hardwareProcessor = new HardwareProcessorImpl();
		return hardwareProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareAsic createHardwareAsic() {
		HardwareAsicImpl hardwareAsic = new HardwareAsicImpl();
		return hardwareAsic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePld createHardwarePld() {
		HardwarePldImpl hardwarePld = new HardwarePldImpl();
		return hardwarePld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareBranchPredictor createHardwareBranchPredictor() {
		HardwareBranchPredictorImpl hardwareBranchPredictor = new HardwareBranchPredictorImpl();
		return hardwareBranchPredictor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareIsa createHardwareIsa() {
		HardwareIsaImpl hardwareIsa = new HardwareIsaImpl();
		return hardwareIsa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareMemory createHardwareMemory() {
		HardwareMemoryImpl hardwareMemory = new HardwareMemoryImpl();
		return hardwareMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareCache createHardwareCache() {
		HardwareCacheImpl hardwareCache = new HardwareCacheImpl();
		return hardwareCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareRam createHardwareRam() {
		HardwareRamImpl hardwareRam = new HardwareRamImpl();
		return hardwareRam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareRom createHardwareRom() {
		HardwareRomImpl hardwareRom = new HardwareRomImpl();
		return hardwareRom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareDrive createHardwareDrive() {
		HardwareDriveImpl hardwareDrive = new HardwareDriveImpl();
		return hardwareDrive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareStorageManager createHardwareStorageManager() {
		HardwareStorageManagerImpl hardwareStorageManager = new HardwareStorageManagerImpl();
		return hardwareStorageManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareDma createHardwareDma() {
		HardwareDmaImpl hardwareDma = new HardwareDmaImpl();
		return hardwareDma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareMmu createHardwareMmu() {
		HardwareMmuImpl hardwareMmu = new HardwareMmuImpl();
		return hardwareMmu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArbiter createHardwareArbiter() {
		HardwareArbiterImpl hardwareArbiter = new HardwareArbiterImpl();
		return hardwareArbiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareCommunicationResource createHardwareCommunicationResource() {
		HardwareCommunicationResourceImpl hardwareCommunicationResource = new HardwareCommunicationResourceImpl();
		return hardwareCommunicationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareMedia createHardwareMedia() {
		HardwareMediaImpl hardwareMedia = new HardwareMediaImpl();
		return hardwareMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareBus createHardwareBus() {
		HardwareBusImpl hardwareBus = new HardwareBusImpl();
		return hardwareBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareBridge createHardwareBridge() {
		HardwareBridgeImpl hardwareBridge = new HardwareBridgeImpl();
		return hardwareBridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareTimingResource createHardwareTimingResource() {
		HardwareTimingResourceImpl hardwareTimingResource = new HardwareTimingResourceImpl();
		return hardwareTimingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareClock createHardwareClock() {
		HardwareClockImpl hardwareClock = new HardwareClockImpl();
		return hardwareClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareTimer createHardwareTimer() {
		HardwareTimerImpl hardwareTimer = new HardwareTimerImpl();
		return hardwareTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareWatchdog createHardwareWatchdog() {
		HardwareWatchdogImpl hardwareWatchdog = new HardwareWatchdogImpl();
		return hardwareWatchdog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareDevice createHardwareDevice() {
		HardwareDeviceImpl hardwareDevice = new HardwareDeviceImpl();
		return hardwareDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareIo createHardwareIo() {
		HardwareIoImpl hardwareIo = new HardwareIoImpl();
		return hardwareIo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareSupport createHardwareSupport() {
		HardwareSupportImpl hardwareSupport = new HardwareSupportImpl();
		return hardwareSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareActuator createHardwareActuator() {
		HardwareActuatorImpl hardwareActuator = new HardwareActuatorImpl();
		return hardwareActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareSensor createHardwareSensor() {
		HardwareSensorImpl hardwareSensor = new HardwareSensorImpl();
		return hardwareSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePlatform createHardwarePlatform() {
		HardwarePlatformImpl hardwarePlatform = new HardwarePlatformImpl();
		return hardwarePlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvCondition createEnvCondition() {
		EnvConditionImpl envCondition = new EnvConditionImpl();
		return envCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmwareArchitecture createFirmwareArchitecture() {
		FirmwareArchitectureImpl firmwareArchitecture = new FirmwareArchitectureImpl();
		return firmwareArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareIpBlock createHardwareIpBlock() {
		HardwareIpBlockImpl hardwareIpBlock = new HardwareIpBlockImpl();
		return hardwareIpBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePin createHardwarePin() {
		HardwarePinImpl hardwarePin = new HardwarePinImpl();
		return hardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareWire createHardwareWire() {
		HardwareWireImpl hardwareWire = new HardwareWireImpl();
		return hardwareWire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareInterface createHardwareInterface() {
		HardwareInterfaceImpl hardwareInterface = new HardwareInterfaceImpl();
		return hardwareInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareInterfacePackage createHardwareInterfacePackage() {
		HardwareInterfacePackageImpl hardwareInterfacePackage = new HardwareInterfacePackageImpl();
		return hardwareInterfacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsaType createIsaTypeFromString(EDataType eDataType, String initialValue) {
		IsaType result = IsaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PldTechnology createPldTechnologyFromString(EDataType eDataType, String initialValue) {
		PldTechnology result = PldTechnology.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPldTechnologyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PldClass createPldClassFromString(EDataType eDataType, String initialValue) {
		PldClass result = PldClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPldClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplPolicy createReplPolicyFromString(EDataType eDataType, String initialValue) {
		ReplPolicy result = ReplPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReplPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritePolicy createWritePolicyFromString(EDataType eDataType, String initialValue) {
		WritePolicy result = WritePolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWritePolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheType createCacheTypeFromString(EDataType eDataType, String initialValue) {
		CacheType result = CacheType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RomType createRomTypeFromString(EDataType eDataType, String initialValue) {
		RomType result = RomType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRomTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionType createConditionTypeFromString(EDataType eDataType, String initialValue) {
		ConditionType result = ConditionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortTypeFromString(EDataType eDataType, String initialValue) {
		PortType result = PortType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentState createComponentStateFromString(EDataType eDataType, String initialValue) {
		ComponentState result = ComponentState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HrmPackage getHrmPackage() {
		return (HrmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HrmPackage getPackage() {
		return HrmPackage.eINSTANCE;
	}

} //HrmFactoryImpl
