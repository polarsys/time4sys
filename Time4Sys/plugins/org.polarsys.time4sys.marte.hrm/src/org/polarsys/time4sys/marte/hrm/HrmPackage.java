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
package org.polarsys.time4sys.marte.hrm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.time4sys.marte.grm.GrmPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.hrm.HrmFactory
 * @model kind="package"
 * @generated
 */
public interface HrmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hrm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/marte/hrm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hrm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HrmPackage eINSTANCE = org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareResourcePackageImpl <em>Hardware Resource Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareResourcePackageImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareResourcePackage()
	 * @generated
	 */
	int HARDWARE_RESOURCE_PACKAGE = 35;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareResourceImpl <em>Hardware Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareResourceImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareResource()
	 * @generated
	 */
	int HARDWARE_RESOURCE = 36;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePortImpl <em>Hardware Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwarePortImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwarePort()
	 * @generated
	 */
	int HARDWARE_PORT = 31;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareConnectorImpl <em>Hardware Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareConnectorImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareConnector()
	 * @generated
	 */
	int HARDWARE_CONNECTOR = 16;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareServiceImpl <em>Hardware Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareServiceImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareService()
	 * @generated
	 */
	int HARDWARE_SERVICE = 39;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl <em>Hardware Computing Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareComputingResource()
	 * @generated
	 */
	int HARDWARE_COMPUTING_RESOURCE = 15;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessorImpl <em>Hardware Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareProcessorImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareProcessor()
	 * @generated
	 */
	int HARDWARE_PROCESSOR = 33;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareAsicImpl <em>Hardware Asic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareAsicImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareAsic()
	 * @generated
	 */
	int HARDWARE_ASIC = 4;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePldImpl <em>Hardware Pld</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwarePldImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwarePld()
	 * @generated
	 */
	int HARDWARE_PLD = 30;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareBranchPredictorImpl <em>Hardware Branch Predictor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareBranchPredictorImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareBranchPredictor()
	 * @generated
	 */
	int HARDWARE_BRANCH_PREDICTOR = 5;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareIsaImpl <em>Hardware Isa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareIsaImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareIsa()
	 * @generated
	 */
	int HARDWARE_ISA = 24;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareMemoryImpl <em>Hardware Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareMemoryImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareMemory()
	 * @generated
	 */
	int HARDWARE_MEMORY = 26;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessingMemoryImpl <em>Hardware Processing Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareProcessingMemoryImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareProcessingMemory()
	 * @generated
	 */
	int HARDWARE_PROCESSING_MEMORY = 32;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareStorageMemoryImpl <em>Hardware Storage Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareStorageMemoryImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareStorageMemory()
	 * @generated
	 */
	int HARDWARE_STORAGE_MEMORY = 41;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareCacheImpl <em>Hardware Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareCacheImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareCache()
	 * @generated
	 */
	int HARDWARE_CACHE = 8;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareRamImpl <em>Hardware Ram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareRamImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareRam()
	 * @generated
	 */
	int HARDWARE_RAM = 34;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareRomImpl <em>Hardware Rom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareRomImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareRom()
	 * @generated
	 */
	int HARDWARE_ROM = 37;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareDriveImpl <em>Hardware Drive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareDriveImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareDrive()
	 * @generated
	 */
	int HARDWARE_DRIVE = 19;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareStorageManagerImpl <em>Hardware Storage Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareStorageManagerImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareStorageManager()
	 * @generated
	 */
	int HARDWARE_STORAGE_MANAGER = 40;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareDmaImpl <em>Hardware Dma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareDmaImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareDma()
	 * @generated
	 */
	int HARDWARE_DMA = 18;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareMmuImpl <em>Hardware Mmu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareMmuImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareMmu()
	 * @generated
	 */
	int HARDWARE_MMU = 27;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareCommunicationResourceImpl <em>Hardware Communication Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareCommunicationResourceImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareCommunicationResource()
	 * @generated
	 */
	int HARDWARE_COMMUNICATION_RESOURCE = 13;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareArbiterImpl <em>Hardware Arbiter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareArbiterImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareArbiter()
	 * @generated
	 */
	int HARDWARE_ARBITER = 3;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareMediaImpl <em>Hardware Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareMediaImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareMedia()
	 * @generated
	 */
	int HARDWARE_MEDIA = 25;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareBusImpl <em>Hardware Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareBusImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareBus()
	 * @generated
	 */
	int HARDWARE_BUS = 7;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareBridgeImpl <em>Hardware Bridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareBridgeImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareBridge()
	 * @generated
	 */
	int HARDWARE_BRIDGE = 6;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareTimingResourceImpl <em>Hardware Timing Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareTimingResourceImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareTimingResource()
	 * @generated
	 */
	int HARDWARE_TIMING_RESOURCE = 43;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareClockImpl <em>Hardware Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareClockImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareClock()
	 * @generated
	 */
	int HARDWARE_CLOCK = 12;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareTimerImpl <em>Hardware Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareTimerImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareTimer()
	 * @generated
	 */
	int HARDWARE_TIMER = 44;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareWatchdogImpl <em>Hardware Watchdog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareWatchdogImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareWatchdog()
	 * @generated
	 */
	int HARDWARE_WATCHDOG = 45;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareDeviceImpl <em>Hardware Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareDeviceImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareDevice()
	 * @generated
	 */
	int HARDWARE_DEVICE = 17;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareIoImpl <em>Hardware Io</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareIoImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareIo()
	 * @generated
	 */
	int HARDWARE_IO = 22;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareSupportImpl <em>Hardware Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareSupportImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareSupport()
	 * @generated
	 */
	int HARDWARE_SUPPORT = 42;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareActuatorImpl <em>Hardware Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareActuatorImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareActuator()
	 * @generated
	 */
	int HARDWARE_ACTUATOR = 2;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareSensorImpl <em>Hardware Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareSensorImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareSensor()
	 * @generated
	 */
	int HARDWARE_SENSOR = 38;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePlatformImpl <em>Hardware Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwarePlatformImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwarePlatform()
	 * @generated
	 */
	int HARDWARE_PLATFORM = 29;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComponentImpl <em>Hardware Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareComponentImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareComponent()
	 * @generated
	 */
	int HARDWARE_COMPONENT = 14;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.EnvConditionImpl <em>Env Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.EnvConditionImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getEnvCondition()
	 * @generated
	 */
	int ENV_CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_CONDITION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_CONDITION__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_CONDITION__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_CONDITION__RANGE = 3;

	/**
	 * The number of structural features of the '<em>Env Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_CONDITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Env Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE__NAME = GrmPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE__OWNED_RESOURCE = GrmPackage.RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE__RES_MULT = GrmPackage.RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE__IS_PROTECTED = GrmPackage.RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE__IS_ACTIVE = GrmPackage.RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE__OWNED_PORT = GrmPackage.RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE__OWNED_CONNECTOR = GrmPackage.RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE__RSERVICES = GrmPackage.RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE__USED_BY = GrmPackage.RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE__PSERVICES = GrmPackage.RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE__CLOCK = GrmPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE_FEATURE_COUNT = GrmPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hardware Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE_OPERATION_COUNT = GrmPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareChipImpl <em>Hardware Chip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareChipImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareChip()
	 * @generated
	 */
	int HARDWARE_CHIP = 11;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareChannelImpl <em>Hardware Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareChannelImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareChannel()
	 * @generated
	 */
	int HARDWARE_CHANNEL = 10;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareCardImpl <em>Hardware Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareCardImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareCard()
	 * @generated
	 */
	int HARDWARE_CARD = 9;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.FirmwareArchitectureImpl <em>Firmware Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.FirmwareArchitectureImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getFirmwareArchitecture()
	 * @generated
	 */
	int FIRMWARE_ARCHITECTURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ARCHITECTURE__NAME = HARDWARE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ARCHITECTURE__OWNED_RESOURCE = HARDWARE_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ARCHITECTURE__RES_MULT = HARDWARE_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ARCHITECTURE__IS_PROTECTED = HARDWARE_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ARCHITECTURE__IS_ACTIVE = HARDWARE_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ARCHITECTURE__OWNED_PORT = HARDWARE_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ARCHITECTURE__OWNED_CONNECTOR = HARDWARE_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ARCHITECTURE__RSERVICES = HARDWARE_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ARCHITECTURE__USED_BY = HARDWARE_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ARCHITECTURE__PSERVICES = HARDWARE_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ARCHITECTURE__CLOCK = HARDWARE_RESOURCE__CLOCK;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ARCHITECTURE__OWNED_WIRE = HARDWARE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ARCHITECTURE__OWNED_PIN = HARDWARE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Firmware Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ARCHITECTURE_FEATURE_COUNT = HARDWARE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Firmware Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ARCHITECTURE_OPERATION_COUNT = HARDWARE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__NAME = GrmPackage.DEVICE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__OWNED_RESOURCE = GrmPackage.DEVICE_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__RES_MULT = GrmPackage.DEVICE_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__IS_PROTECTED = GrmPackage.DEVICE_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__IS_ACTIVE = GrmPackage.DEVICE_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__OWNED_PORT = GrmPackage.DEVICE_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__OWNED_CONNECTOR = GrmPackage.DEVICE_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__RSERVICES = GrmPackage.DEVICE_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__USED_BY = GrmPackage.DEVICE_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__PSERVICES = GrmPackage.DEVICE_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__SPEED_FACTOR = GrmPackage.DEVICE_RESOURCE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__MAIN_SCHEDULER = GrmPackage.DEVICE_RESOURCE__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__CLOCK = GrmPackage.DEVICE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__DIMENSION = GrmPackage.DEVICE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__AREA = GrmPackage.DEVICE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__POS_X = GrmPackage.DEVICE_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__POS_Y = GrmPackage.DEVICE_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__GRID = GrmPackage.DEVICE_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__NB_PINS = GrmPackage.DEVICE_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__WEIGHT = GrmPackage.DEVICE_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__PRICE = GrmPackage.DEVICE_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__RCONDITIONS = GrmPackage.DEVICE_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__OWNED_PIN = GrmPackage.DEVICE_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__OWNED_WIRE = GrmPackage.DEVICE_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE__TECHNOLOGY = GrmPackage.DEVICE_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Hardware Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE_FEATURE_COUNT = GrmPackage.DEVICE_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Hardware Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DEVICE_OPERATION_COUNT = GrmPackage.DEVICE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__NAME = HARDWARE_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__OWNED_RESOURCE = HARDWARE_DEVICE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__RES_MULT = HARDWARE_DEVICE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__IS_PROTECTED = HARDWARE_DEVICE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__IS_ACTIVE = HARDWARE_DEVICE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__OWNED_PORT = HARDWARE_DEVICE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__OWNED_CONNECTOR = HARDWARE_DEVICE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__RSERVICES = HARDWARE_DEVICE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__USED_BY = HARDWARE_DEVICE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__PSERVICES = HARDWARE_DEVICE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__SPEED_FACTOR = HARDWARE_DEVICE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__MAIN_SCHEDULER = HARDWARE_DEVICE__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__CLOCK = HARDWARE_DEVICE__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__DIMENSION = HARDWARE_DEVICE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__AREA = HARDWARE_DEVICE__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__POS_X = HARDWARE_DEVICE__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__POS_Y = HARDWARE_DEVICE__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__GRID = HARDWARE_DEVICE__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__NB_PINS = HARDWARE_DEVICE__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__WEIGHT = HARDWARE_DEVICE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__PRICE = HARDWARE_DEVICE__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__RCONDITIONS = HARDWARE_DEVICE__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__OWNED_PIN = HARDWARE_DEVICE__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__OWNED_WIRE = HARDWARE_DEVICE__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO__TECHNOLOGY = HARDWARE_DEVICE__TECHNOLOGY;

	/**
	 * The number of structural features of the '<em>Hardware Io</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO_FEATURE_COUNT = HARDWARE_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Io</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IO_OPERATION_COUNT = HARDWARE_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__NAME = HARDWARE_IO__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__OWNED_RESOURCE = HARDWARE_IO__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__RES_MULT = HARDWARE_IO__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__IS_PROTECTED = HARDWARE_IO__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__IS_ACTIVE = HARDWARE_IO__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__OWNED_PORT = HARDWARE_IO__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__OWNED_CONNECTOR = HARDWARE_IO__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__RSERVICES = HARDWARE_IO__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__USED_BY = HARDWARE_IO__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__PSERVICES = HARDWARE_IO__PSERVICES;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__SPEED_FACTOR = HARDWARE_IO__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__MAIN_SCHEDULER = HARDWARE_IO__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__CLOCK = HARDWARE_IO__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__DIMENSION = HARDWARE_IO__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__AREA = HARDWARE_IO__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__POS_X = HARDWARE_IO__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__POS_Y = HARDWARE_IO__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__GRID = HARDWARE_IO__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__NB_PINS = HARDWARE_IO__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__WEIGHT = HARDWARE_IO__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__PRICE = HARDWARE_IO__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__RCONDITIONS = HARDWARE_IO__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__OWNED_PIN = HARDWARE_IO__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__OWNED_WIRE = HARDWARE_IO__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR__TECHNOLOGY = HARDWARE_IO__TECHNOLOGY;

	/**
	 * The number of structural features of the '<em>Hardware Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR_FEATURE_COUNT = HARDWARE_IO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ACTUATOR_OPERATION_COUNT = HARDWARE_IO_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__NAME = GrmPackage.COMMUNICATION_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__OWNED_RESOURCE = GrmPackage.COMMUNICATION_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__RES_MULT = GrmPackage.COMMUNICATION_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__IS_PROTECTED = GrmPackage.COMMUNICATION_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__IS_ACTIVE = GrmPackage.COMMUNICATION_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__OWNED_PORT = GrmPackage.COMMUNICATION_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__OWNED_CONNECTOR = GrmPackage.COMMUNICATION_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__RSERVICES = GrmPackage.COMMUNICATION_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__USED_BY = GrmPackage.COMMUNICATION_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__PSERVICES = GrmPackage.COMMUNICATION_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__CLOCK = GrmPackage.COMMUNICATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__DIMENSION = GrmPackage.COMMUNICATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__AREA = GrmPackage.COMMUNICATION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__POS_X = GrmPackage.COMMUNICATION_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__POS_Y = GrmPackage.COMMUNICATION_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__GRID = GrmPackage.COMMUNICATION_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__NB_PINS = GrmPackage.COMMUNICATION_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__WEIGHT = GrmPackage.COMMUNICATION_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__PRICE = GrmPackage.COMMUNICATION_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__RCONDITIONS = GrmPackage.COMMUNICATION_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__OWNED_PIN = GrmPackage.COMMUNICATION_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__OWNED_WIRE = GrmPackage.COMMUNICATION_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Nb Wires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__NB_WIRES = GrmPackage.COMMUNICATION_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE__REALIZED_BY = GrmPackage.COMMUNICATION_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Hardware Communication Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT = GrmPackage.COMMUNICATION_RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Hardware Communication Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMMUNICATION_RESOURCE_OPERATION_COUNT = GrmPackage.COMMUNICATION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__NAME = HARDWARE_COMMUNICATION_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__OWNED_RESOURCE = HARDWARE_COMMUNICATION_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__RES_MULT = HARDWARE_COMMUNICATION_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__IS_PROTECTED = HARDWARE_COMMUNICATION_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__IS_ACTIVE = HARDWARE_COMMUNICATION_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__OWNED_PORT = HARDWARE_COMMUNICATION_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__OWNED_CONNECTOR = HARDWARE_COMMUNICATION_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__RSERVICES = HARDWARE_COMMUNICATION_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__USED_BY = HARDWARE_COMMUNICATION_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__PSERVICES = HARDWARE_COMMUNICATION_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__CLOCK = HARDWARE_COMMUNICATION_RESOURCE__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__DIMENSION = HARDWARE_COMMUNICATION_RESOURCE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__AREA = HARDWARE_COMMUNICATION_RESOURCE__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__POS_X = HARDWARE_COMMUNICATION_RESOURCE__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__POS_Y = HARDWARE_COMMUNICATION_RESOURCE__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__GRID = HARDWARE_COMMUNICATION_RESOURCE__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__NB_PINS = HARDWARE_COMMUNICATION_RESOURCE__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__WEIGHT = HARDWARE_COMMUNICATION_RESOURCE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__PRICE = HARDWARE_COMMUNICATION_RESOURCE__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__RCONDITIONS = HARDWARE_COMMUNICATION_RESOURCE__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__OWNED_PIN = HARDWARE_COMMUNICATION_RESOURCE__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__OWNED_WIRE = HARDWARE_COMMUNICATION_RESOURCE__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Nb Wires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__NB_WIRES = HARDWARE_COMMUNICATION_RESOURCE__NB_WIRES;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__REALIZED_BY = HARDWARE_COMMUNICATION_RESOURCE__REALIZED_BY;

	/**
	 * The feature id for the '<em><b>Broked Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__BROKED_RESOURCE = HARDWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Acc Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__ACC_CTRL_POLICY = HARDWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Controlled Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER__CONTROLLED_MEDIA = HARDWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hardware Arbiter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER_FEATURE_COUNT = HARDWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Hardware Arbiter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARBITER_OPERATION_COUNT = HARDWARE_COMMUNICATION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__NAME = GrmPackage.COMPUTING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__OWNED_RESOURCE = GrmPackage.COMPUTING_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__RES_MULT = GrmPackage.COMPUTING_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__IS_PROTECTED = GrmPackage.COMPUTING_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__IS_ACTIVE = GrmPackage.COMPUTING_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__OWNED_PORT = GrmPackage.COMPUTING_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__OWNED_CONNECTOR = GrmPackage.COMPUTING_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__RSERVICES = GrmPackage.COMPUTING_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__USED_BY = GrmPackage.COMPUTING_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__PSERVICES = GrmPackage.COMPUTING_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__SPEED_FACTOR = GrmPackage.COMPUTING_RESOURCE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__MAIN_SCHEDULER = GrmPackage.COMPUTING_RESOURCE__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__CLOCK = GrmPackage.COMPUTING_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__DIMENSION = GrmPackage.COMPUTING_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__AREA = GrmPackage.COMPUTING_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__POS_X = GrmPackage.COMPUTING_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__POS_Y = GrmPackage.COMPUTING_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__GRID = GrmPackage.COMPUTING_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__NB_PINS = GrmPackage.COMPUTING_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__WEIGHT = GrmPackage.COMPUTING_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__PRICE = GrmPackage.COMPUTING_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__RCONDITIONS = GrmPackage.COMPUTING_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__OWNED_PIN = GrmPackage.COMPUTING_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__OWNED_WIRE = GrmPackage.COMPUTING_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__TECHNOLOGY = GrmPackage.COMPUTING_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Op Frequencies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE__OP_FREQUENCIES = GrmPackage.COMPUTING_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Hardware Computing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT = GrmPackage.COMPUTING_RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Hardware Computing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPUTING_RESOURCE_OPERATION_COUNT = GrmPackage.COMPUTING_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__NAME = HARDWARE_COMPUTING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__OWNED_RESOURCE = HARDWARE_COMPUTING_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__RES_MULT = HARDWARE_COMPUTING_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__IS_PROTECTED = HARDWARE_COMPUTING_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__IS_ACTIVE = HARDWARE_COMPUTING_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__OWNED_PORT = HARDWARE_COMPUTING_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__OWNED_CONNECTOR = HARDWARE_COMPUTING_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__RSERVICES = HARDWARE_COMPUTING_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__USED_BY = HARDWARE_COMPUTING_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__PSERVICES = HARDWARE_COMPUTING_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__SPEED_FACTOR = HARDWARE_COMPUTING_RESOURCE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__MAIN_SCHEDULER = HARDWARE_COMPUTING_RESOURCE__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__CLOCK = HARDWARE_COMPUTING_RESOURCE__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__DIMENSION = HARDWARE_COMPUTING_RESOURCE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__AREA = HARDWARE_COMPUTING_RESOURCE__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__POS_X = HARDWARE_COMPUTING_RESOURCE__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__POS_Y = HARDWARE_COMPUTING_RESOURCE__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__GRID = HARDWARE_COMPUTING_RESOURCE__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__NB_PINS = HARDWARE_COMPUTING_RESOURCE__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__WEIGHT = HARDWARE_COMPUTING_RESOURCE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__PRICE = HARDWARE_COMPUTING_RESOURCE__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__RCONDITIONS = HARDWARE_COMPUTING_RESOURCE__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__OWNED_PIN = HARDWARE_COMPUTING_RESOURCE__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__OWNED_WIRE = HARDWARE_COMPUTING_RESOURCE__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__TECHNOLOGY = HARDWARE_COMPUTING_RESOURCE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Op Frequencies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC__OP_FREQUENCIES = HARDWARE_COMPUTING_RESOURCE__OP_FREQUENCIES;

	/**
	 * The number of structural features of the '<em>Hardware Asic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC_FEATURE_COUNT = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Asic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ASIC_OPERATION_COUNT = HARDWARE_COMPUTING_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRANCH_PREDICTOR__NAME = HARDWARE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRANCH_PREDICTOR__OWNED_RESOURCE = HARDWARE_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRANCH_PREDICTOR__RES_MULT = HARDWARE_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRANCH_PREDICTOR__IS_PROTECTED = HARDWARE_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRANCH_PREDICTOR__IS_ACTIVE = HARDWARE_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRANCH_PREDICTOR__OWNED_PORT = HARDWARE_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRANCH_PREDICTOR__OWNED_CONNECTOR = HARDWARE_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRANCH_PREDICTOR__RSERVICES = HARDWARE_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRANCH_PREDICTOR__USED_BY = HARDWARE_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRANCH_PREDICTOR__PSERVICES = HARDWARE_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRANCH_PREDICTOR__CLOCK = HARDWARE_RESOURCE__CLOCK;

	/**
	 * The number of structural features of the '<em>Hardware Branch Predictor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRANCH_PREDICTOR_FEATURE_COUNT = HARDWARE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Branch Predictor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRANCH_PREDICTOR_OPERATION_COUNT = HARDWARE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__NAME = HARDWARE_COMMUNICATION_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__OWNED_RESOURCE = HARDWARE_COMMUNICATION_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__RES_MULT = HARDWARE_COMMUNICATION_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__IS_PROTECTED = HARDWARE_COMMUNICATION_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__IS_ACTIVE = HARDWARE_COMMUNICATION_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__OWNED_PORT = HARDWARE_COMMUNICATION_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__OWNED_CONNECTOR = HARDWARE_COMMUNICATION_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__RSERVICES = HARDWARE_COMMUNICATION_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__USED_BY = HARDWARE_COMMUNICATION_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__PSERVICES = HARDWARE_COMMUNICATION_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__CLOCK = HARDWARE_COMMUNICATION_RESOURCE__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__DIMENSION = HARDWARE_COMMUNICATION_RESOURCE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__AREA = HARDWARE_COMMUNICATION_RESOURCE__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__POS_X = HARDWARE_COMMUNICATION_RESOURCE__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__POS_Y = HARDWARE_COMMUNICATION_RESOURCE__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__GRID = HARDWARE_COMMUNICATION_RESOURCE__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__NB_PINS = HARDWARE_COMMUNICATION_RESOURCE__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__WEIGHT = HARDWARE_COMMUNICATION_RESOURCE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__PRICE = HARDWARE_COMMUNICATION_RESOURCE__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__RCONDITIONS = HARDWARE_COMMUNICATION_RESOURCE__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__OWNED_PIN = HARDWARE_COMMUNICATION_RESOURCE__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__OWNED_WIRE = HARDWARE_COMMUNICATION_RESOURCE__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Nb Wires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__NB_WIRES = HARDWARE_COMMUNICATION_RESOURCE__NB_WIRES;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__REALIZED_BY = HARDWARE_COMMUNICATION_RESOURCE__REALIZED_BY;

	/**
	 * The feature id for the '<em><b>Arbiters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA__ARBITERS = HARDWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA_FEATURE_COUNT = HARDWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hardware Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEDIA_OPERATION_COUNT = HARDWARE_COMMUNICATION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__NAME = HARDWARE_MEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__OWNED_RESOURCE = HARDWARE_MEDIA__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__RES_MULT = HARDWARE_MEDIA__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__IS_PROTECTED = HARDWARE_MEDIA__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__IS_ACTIVE = HARDWARE_MEDIA__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__OWNED_PORT = HARDWARE_MEDIA__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__OWNED_CONNECTOR = HARDWARE_MEDIA__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__RSERVICES = HARDWARE_MEDIA__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__USED_BY = HARDWARE_MEDIA__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__PSERVICES = HARDWARE_MEDIA__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__CLOCK = HARDWARE_MEDIA__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__DIMENSION = HARDWARE_MEDIA__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__AREA = HARDWARE_MEDIA__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__POS_X = HARDWARE_MEDIA__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__POS_Y = HARDWARE_MEDIA__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__GRID = HARDWARE_MEDIA__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__NB_PINS = HARDWARE_MEDIA__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__WEIGHT = HARDWARE_MEDIA__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__PRICE = HARDWARE_MEDIA__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__RCONDITIONS = HARDWARE_MEDIA__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__OWNED_PIN = HARDWARE_MEDIA__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__OWNED_WIRE = HARDWARE_MEDIA__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Nb Wires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__NB_WIRES = HARDWARE_MEDIA__NB_WIRES;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__REALIZED_BY = HARDWARE_MEDIA__REALIZED_BY;

	/**
	 * The feature id for the '<em><b>Arbiters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__ARBITERS = HARDWARE_MEDIA__ARBITERS;

	/**
	 * The feature id for the '<em><b>Sides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE__SIDES = HARDWARE_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE_FEATURE_COUNT = HARDWARE_MEDIA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hardware Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BRIDGE_OPERATION_COUNT = HARDWARE_MEDIA_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__NAME = HARDWARE_MEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__OWNED_RESOURCE = HARDWARE_MEDIA__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__RES_MULT = HARDWARE_MEDIA__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__IS_PROTECTED = HARDWARE_MEDIA__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__IS_ACTIVE = HARDWARE_MEDIA__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__OWNED_PORT = HARDWARE_MEDIA__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__OWNED_CONNECTOR = HARDWARE_MEDIA__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__RSERVICES = HARDWARE_MEDIA__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__USED_BY = HARDWARE_MEDIA__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__PSERVICES = HARDWARE_MEDIA__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__CLOCK = HARDWARE_MEDIA__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__DIMENSION = HARDWARE_MEDIA__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__AREA = HARDWARE_MEDIA__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__POS_X = HARDWARE_MEDIA__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__POS_Y = HARDWARE_MEDIA__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__GRID = HARDWARE_MEDIA__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__NB_PINS = HARDWARE_MEDIA__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__WEIGHT = HARDWARE_MEDIA__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__PRICE = HARDWARE_MEDIA__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__RCONDITIONS = HARDWARE_MEDIA__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__OWNED_PIN = HARDWARE_MEDIA__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__OWNED_WIRE = HARDWARE_MEDIA__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Nb Wires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__NB_WIRES = HARDWARE_MEDIA__NB_WIRES;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__REALIZED_BY = HARDWARE_MEDIA__REALIZED_BY;

	/**
	 * The feature id for the '<em><b>Arbiters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__ARBITERS = HARDWARE_MEDIA__ARBITERS;

	/**
	 * The feature id for the '<em><b>Address Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__ADDRESS_WIDTH = HARDWARE_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Word Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__WORD_WIDTH = HARDWARE_MEDIA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__IS_SYNCHRONOUS = HARDWARE_MEDIA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS__IS_SERIAL = HARDWARE_MEDIA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hardware Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS_FEATURE_COUNT = HARDWARE_MEDIA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Hardware Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_BUS_OPERATION_COUNT = HARDWARE_MEDIA_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__NAME = GrmPackage.STORAGE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__OWNED_RESOURCE = GrmPackage.STORAGE_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__RES_MULT = GrmPackage.STORAGE_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__IS_PROTECTED = GrmPackage.STORAGE_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__IS_ACTIVE = GrmPackage.STORAGE_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__OWNED_PORT = GrmPackage.STORAGE_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__OWNED_CONNECTOR = GrmPackage.STORAGE_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__RSERVICES = GrmPackage.STORAGE_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__USED_BY = GrmPackage.STORAGE_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__PSERVICES = GrmPackage.STORAGE_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__CLOCK = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__DIMENSION = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__AREA = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__POS_X = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__POS_Y = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__GRID = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__NB_PINS = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__WEIGHT = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__PRICE = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__RCONDITIONS = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__OWNED_PIN = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__OWNED_WIRE = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__TECHNOLOGY = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__MEMORY_SIZE = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Address Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__ADDRESS_SIZE = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Timings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__TIMINGS = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY__THROUGHPUT = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Hardware Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY_FEATURE_COUNT = GrmPackage.STORAGE_RESOURCE_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Hardware Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MEMORY_OPERATION_COUNT = GrmPackage.STORAGE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__NAME = HARDWARE_MEMORY__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__OWNED_RESOURCE = HARDWARE_MEMORY__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__RES_MULT = HARDWARE_MEMORY__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__IS_PROTECTED = HARDWARE_MEMORY__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__IS_ACTIVE = HARDWARE_MEMORY__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__OWNED_PORT = HARDWARE_MEMORY__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__OWNED_CONNECTOR = HARDWARE_MEMORY__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__RSERVICES = HARDWARE_MEMORY__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__USED_BY = HARDWARE_MEMORY__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__PSERVICES = HARDWARE_MEMORY__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__CLOCK = HARDWARE_MEMORY__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__DIMENSION = HARDWARE_MEMORY__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__AREA = HARDWARE_MEMORY__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__POS_X = HARDWARE_MEMORY__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__POS_Y = HARDWARE_MEMORY__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__GRID = HARDWARE_MEMORY__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__NB_PINS = HARDWARE_MEMORY__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__WEIGHT = HARDWARE_MEMORY__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__PRICE = HARDWARE_MEMORY__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__RCONDITIONS = HARDWARE_MEMORY__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__OWNED_PIN = HARDWARE_MEMORY__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__OWNED_WIRE = HARDWARE_MEMORY__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__TECHNOLOGY = HARDWARE_MEMORY__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__MEMORY_SIZE = HARDWARE_MEMORY__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Address Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__ADDRESS_SIZE = HARDWARE_MEMORY__ADDRESS_SIZE;

	/**
	 * The feature id for the '<em><b>Timings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__TIMINGS = HARDWARE_MEMORY__TIMINGS;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__THROUGHPUT = HARDWARE_MEMORY__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Repl Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__REPL_POLICY = HARDWARE_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Write Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY__WRITE_POLICY = HARDWARE_MEMORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hardware Processing Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY_FEATURE_COUNT = HARDWARE_MEMORY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hardware Processing Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSING_MEMORY_OPERATION_COUNT = HARDWARE_MEMORY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__NAME = HARDWARE_PROCESSING_MEMORY__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__OWNED_RESOURCE = HARDWARE_PROCESSING_MEMORY__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__RES_MULT = HARDWARE_PROCESSING_MEMORY__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__IS_PROTECTED = HARDWARE_PROCESSING_MEMORY__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__IS_ACTIVE = HARDWARE_PROCESSING_MEMORY__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__OWNED_PORT = HARDWARE_PROCESSING_MEMORY__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__OWNED_CONNECTOR = HARDWARE_PROCESSING_MEMORY__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__RSERVICES = HARDWARE_PROCESSING_MEMORY__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__USED_BY = HARDWARE_PROCESSING_MEMORY__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__PSERVICES = HARDWARE_PROCESSING_MEMORY__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__CLOCK = HARDWARE_PROCESSING_MEMORY__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__DIMENSION = HARDWARE_PROCESSING_MEMORY__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__AREA = HARDWARE_PROCESSING_MEMORY__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__POS_X = HARDWARE_PROCESSING_MEMORY__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__POS_Y = HARDWARE_PROCESSING_MEMORY__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__GRID = HARDWARE_PROCESSING_MEMORY__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__NB_PINS = HARDWARE_PROCESSING_MEMORY__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__WEIGHT = HARDWARE_PROCESSING_MEMORY__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__PRICE = HARDWARE_PROCESSING_MEMORY__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__RCONDITIONS = HARDWARE_PROCESSING_MEMORY__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__OWNED_PIN = HARDWARE_PROCESSING_MEMORY__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__OWNED_WIRE = HARDWARE_PROCESSING_MEMORY__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__TECHNOLOGY = HARDWARE_PROCESSING_MEMORY__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__MEMORY_SIZE = HARDWARE_PROCESSING_MEMORY__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Address Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__ADDRESS_SIZE = HARDWARE_PROCESSING_MEMORY__ADDRESS_SIZE;

	/**
	 * The feature id for the '<em><b>Timings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__TIMINGS = HARDWARE_PROCESSING_MEMORY__TIMINGS;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__THROUGHPUT = HARDWARE_PROCESSING_MEMORY__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Repl Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__REPL_POLICY = HARDWARE_PROCESSING_MEMORY__REPL_POLICY;

	/**
	 * The feature id for the '<em><b>Write Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__WRITE_POLICY = HARDWARE_PROCESSING_MEMORY__WRITE_POLICY;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__LEVEL = HARDWARE_PROCESSING_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__TYPE = HARDWARE_PROCESSING_MEMORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nb Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__NB_SETS = HARDWARE_PROCESSING_MEMORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__BLOCK_SIZE = HARDWARE_PROCESSING_MEMORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Associativity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE__ASSOCIATIVITY = HARDWARE_PROCESSING_MEMORY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hardware Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE_FEATURE_COUNT = HARDWARE_PROCESSING_MEMORY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Hardware Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CACHE_OPERATION_COUNT = HARDWARE_PROCESSING_MEMORY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__AREA = 1;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__POS_X = 2;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__POS_Y = 3;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__GRID = 4;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__NB_PINS = 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__WEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__PRICE = 7;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__RCONDITIONS = 8;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__OWNED_PIN = 9;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__OWNED_WIRE = 10;

	/**
	 * The number of structural features of the '<em>Hardware Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Hardware Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CARD__DIMENSION = HARDWARE_COMPONENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CARD__AREA = HARDWARE_COMPONENT__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CARD__POS_X = HARDWARE_COMPONENT__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CARD__POS_Y = HARDWARE_COMPONENT__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CARD__GRID = HARDWARE_COMPONENT__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CARD__NB_PINS = HARDWARE_COMPONENT__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CARD__WEIGHT = HARDWARE_COMPONENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CARD__PRICE = HARDWARE_COMPONENT__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CARD__RCONDITIONS = HARDWARE_COMPONENT__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CARD__OWNED_PIN = HARDWARE_COMPONENT__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CARD__OWNED_WIRE = HARDWARE_COMPONENT__OWNED_WIRE;

	/**
	 * The number of structural features of the '<em>Hardware Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CARD_FEATURE_COUNT = HARDWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CARD_OPERATION_COUNT = HARDWARE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHANNEL__DIMENSION = HARDWARE_COMPONENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHANNEL__AREA = HARDWARE_COMPONENT__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHANNEL__POS_X = HARDWARE_COMPONENT__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHANNEL__POS_Y = HARDWARE_COMPONENT__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHANNEL__GRID = HARDWARE_COMPONENT__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHANNEL__NB_PINS = HARDWARE_COMPONENT__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHANNEL__WEIGHT = HARDWARE_COMPONENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHANNEL__PRICE = HARDWARE_COMPONENT__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHANNEL__RCONDITIONS = HARDWARE_COMPONENT__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHANNEL__OWNED_PIN = HARDWARE_COMPONENT__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHANNEL__OWNED_WIRE = HARDWARE_COMPONENT__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Nb Wires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHANNEL__NB_WIRES = HARDWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHANNEL__REALIZED_BY = HARDWARE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hardware Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHANNEL_FEATURE_COUNT = HARDWARE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hardware Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHANNEL_OPERATION_COUNT = HARDWARE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHIP__DIMENSION = HARDWARE_COMPONENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHIP__AREA = HARDWARE_COMPONENT__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHIP__POS_X = HARDWARE_COMPONENT__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHIP__POS_Y = HARDWARE_COMPONENT__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHIP__GRID = HARDWARE_COMPONENT__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHIP__NB_PINS = HARDWARE_COMPONENT__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHIP__WEIGHT = HARDWARE_COMPONENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHIP__PRICE = HARDWARE_COMPONENT__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHIP__RCONDITIONS = HARDWARE_COMPONENT__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHIP__OWNED_PIN = HARDWARE_COMPONENT__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHIP__OWNED_WIRE = HARDWARE_COMPONENT__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHIP__TECHNOLOGY = HARDWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Chip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHIP_FEATURE_COUNT = HARDWARE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hardware Chip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CHIP_OPERATION_COUNT = HARDWARE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__NAME = HARDWARE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__OWNED_RESOURCE = HARDWARE_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__RES_MULT = HARDWARE_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__IS_PROTECTED = HARDWARE_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__IS_ACTIVE = HARDWARE_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__OWNED_PORT = HARDWARE_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__OWNED_CONNECTOR = HARDWARE_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__RSERVICES = HARDWARE_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__USED_BY = HARDWARE_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__PSERVICES = HARDWARE_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__CLOCK = HARDWARE_RESOURCE__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__DIMENSION = HARDWARE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__AREA = HARDWARE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__POS_X = HARDWARE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__POS_Y = HARDWARE_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__GRID = HARDWARE_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__NB_PINS = HARDWARE_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__WEIGHT = HARDWARE_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__PRICE = HARDWARE_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__RCONDITIONS = HARDWARE_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__OWNED_PIN = HARDWARE_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__OWNED_WIRE = HARDWARE_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE__TECHNOLOGY = HARDWARE_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Hardware Timing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE_FEATURE_COUNT = HARDWARE_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Hardware Timing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMING_RESOURCE_OPERATION_COUNT = HARDWARE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__NAME = HARDWARE_TIMING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__OWNED_RESOURCE = HARDWARE_TIMING_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__RES_MULT = HARDWARE_TIMING_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__IS_PROTECTED = HARDWARE_TIMING_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__IS_ACTIVE = HARDWARE_TIMING_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__OWNED_PORT = HARDWARE_TIMING_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__OWNED_CONNECTOR = HARDWARE_TIMING_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__RSERVICES = HARDWARE_TIMING_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__USED_BY = HARDWARE_TIMING_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__PSERVICES = HARDWARE_TIMING_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__CLOCK = HARDWARE_TIMING_RESOURCE__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__DIMENSION = HARDWARE_TIMING_RESOURCE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__AREA = HARDWARE_TIMING_RESOURCE__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__POS_X = HARDWARE_TIMING_RESOURCE__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__POS_Y = HARDWARE_TIMING_RESOURCE__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__GRID = HARDWARE_TIMING_RESOURCE__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__NB_PINS = HARDWARE_TIMING_RESOURCE__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__WEIGHT = HARDWARE_TIMING_RESOURCE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__PRICE = HARDWARE_TIMING_RESOURCE__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__RCONDITIONS = HARDWARE_TIMING_RESOURCE__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__OWNED_PIN = HARDWARE_TIMING_RESOURCE__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__OWNED_WIRE = HARDWARE_TIMING_RESOURCE__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__TECHNOLOGY = HARDWARE_TIMING_RESOURCE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK__FREQUENCY = HARDWARE_TIMING_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK_FEATURE_COUNT = HARDWARE_TIMING_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hardware Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CLOCK_OPERATION_COUNT = HARDWARE_TIMING_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR__SOURCE_PORT = GrmPackage.RESOURCE_CONNECTOR__SOURCE_PORT;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR__TARGET_PORT = GrmPackage.RESOURCE_CONNECTOR__TARGET_PORT;

	/**
	 * The number of structural features of the '<em>Hardware Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR_FEATURE_COUNT = GrmPackage.RESOURCE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR_OPERATION_COUNT = GrmPackage.RESOURCE_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__NAME = GrmPackage.RESOURCE_BROKER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__OWNED_RESOURCE = GrmPackage.RESOURCE_BROKER__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__RES_MULT = GrmPackage.RESOURCE_BROKER__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__IS_PROTECTED = GrmPackage.RESOURCE_BROKER__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__IS_ACTIVE = GrmPackage.RESOURCE_BROKER__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__OWNED_PORT = GrmPackage.RESOURCE_BROKER__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__OWNED_CONNECTOR = GrmPackage.RESOURCE_BROKER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__RSERVICES = GrmPackage.RESOURCE_BROKER__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__USED_BY = GrmPackage.RESOURCE_BROKER__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__PSERVICES = GrmPackage.RESOURCE_BROKER__PSERVICES;

	/**
	 * The feature id for the '<em><b>Broked Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__BROKED_RESOURCE = GrmPackage.RESOURCE_BROKER__BROKED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Acc Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__ACC_CTRL_POLICY = GrmPackage.RESOURCE_BROKER__ACC_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__DIMENSION = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__AREA = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__POS_X = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__POS_Y = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__GRID = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__NB_PINS = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__WEIGHT = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__PRICE = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__RCONDITIONS = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__OWNED_PIN = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__OWNED_WIRE = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__TECHNOLOGY = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Managed Memories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER__MANAGED_MEMORIES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Hardware Storage Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER_FEATURE_COUNT = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Hardware Storage Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MANAGER_OPERATION_COUNT = GrmPackage.RESOURCE_BROKER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__NAME = HARDWARE_STORAGE_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__OWNED_RESOURCE = HARDWARE_STORAGE_MANAGER__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__RES_MULT = HARDWARE_STORAGE_MANAGER__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__IS_PROTECTED = HARDWARE_STORAGE_MANAGER__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__IS_ACTIVE = HARDWARE_STORAGE_MANAGER__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__OWNED_PORT = HARDWARE_STORAGE_MANAGER__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__OWNED_CONNECTOR = HARDWARE_STORAGE_MANAGER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__RSERVICES = HARDWARE_STORAGE_MANAGER__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__USED_BY = HARDWARE_STORAGE_MANAGER__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__PSERVICES = HARDWARE_STORAGE_MANAGER__PSERVICES;

	/**
	 * The feature id for the '<em><b>Broked Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__BROKED_RESOURCE = HARDWARE_STORAGE_MANAGER__BROKED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Acc Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__ACC_CTRL_POLICY = HARDWARE_STORAGE_MANAGER__ACC_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__DIMENSION = HARDWARE_STORAGE_MANAGER__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__AREA = HARDWARE_STORAGE_MANAGER__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__POS_X = HARDWARE_STORAGE_MANAGER__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__POS_Y = HARDWARE_STORAGE_MANAGER__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__GRID = HARDWARE_STORAGE_MANAGER__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__NB_PINS = HARDWARE_STORAGE_MANAGER__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__WEIGHT = HARDWARE_STORAGE_MANAGER__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__PRICE = HARDWARE_STORAGE_MANAGER__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__RCONDITIONS = HARDWARE_STORAGE_MANAGER__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__OWNED_PIN = HARDWARE_STORAGE_MANAGER__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__OWNED_WIRE = HARDWARE_STORAGE_MANAGER__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__TECHNOLOGY = HARDWARE_STORAGE_MANAGER__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Managed Memories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__MANAGED_MEMORIES = HARDWARE_STORAGE_MANAGER__MANAGED_MEMORIES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__CLOCK = HARDWARE_STORAGE_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nb Wires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__NB_WIRES = HARDWARE_STORAGE_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__REALIZED_BY = HARDWARE_STORAGE_MANAGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Controlled Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__CONTROLLED_MEDIA = HARDWARE_STORAGE_MANAGER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nb Channels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__NB_CHANNELS = HARDWARE_STORAGE_MANAGER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transfer Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__TRANSFER_WIDTH = HARDWARE_STORAGE_MANAGER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Driven By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA__DRIVEN_BY = HARDWARE_STORAGE_MANAGER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Hardware Dma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA_FEATURE_COUNT = HARDWARE_STORAGE_MANAGER_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Hardware Dma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DMA_OPERATION_COUNT = HARDWARE_STORAGE_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__NAME = HARDWARE_MEMORY__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__OWNED_RESOURCE = HARDWARE_MEMORY__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__RES_MULT = HARDWARE_MEMORY__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__IS_PROTECTED = HARDWARE_MEMORY__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__IS_ACTIVE = HARDWARE_MEMORY__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__OWNED_PORT = HARDWARE_MEMORY__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__OWNED_CONNECTOR = HARDWARE_MEMORY__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__RSERVICES = HARDWARE_MEMORY__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__USED_BY = HARDWARE_MEMORY__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__PSERVICES = HARDWARE_MEMORY__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__CLOCK = HARDWARE_MEMORY__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__DIMENSION = HARDWARE_MEMORY__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__AREA = HARDWARE_MEMORY__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__POS_X = HARDWARE_MEMORY__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__POS_Y = HARDWARE_MEMORY__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__GRID = HARDWARE_MEMORY__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__NB_PINS = HARDWARE_MEMORY__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__WEIGHT = HARDWARE_MEMORY__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__PRICE = HARDWARE_MEMORY__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__RCONDITIONS = HARDWARE_MEMORY__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__OWNED_PIN = HARDWARE_MEMORY__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__OWNED_WIRE = HARDWARE_MEMORY__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__TECHNOLOGY = HARDWARE_MEMORY__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__MEMORY_SIZE = HARDWARE_MEMORY__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Address Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__ADDRESS_SIZE = HARDWARE_MEMORY__ADDRESS_SIZE;

	/**
	 * The feature id for the '<em><b>Timings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__TIMINGS = HARDWARE_MEMORY__TIMINGS;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__THROUGHPUT = HARDWARE_MEMORY__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY__BUFFER = HARDWARE_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Storage Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY_FEATURE_COUNT = HARDWARE_MEMORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hardware Storage Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_STORAGE_MEMORY_OPERATION_COUNT = HARDWARE_MEMORY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__NAME = HARDWARE_STORAGE_MEMORY__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__OWNED_RESOURCE = HARDWARE_STORAGE_MEMORY__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__RES_MULT = HARDWARE_STORAGE_MEMORY__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__IS_PROTECTED = HARDWARE_STORAGE_MEMORY__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__IS_ACTIVE = HARDWARE_STORAGE_MEMORY__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__OWNED_PORT = HARDWARE_STORAGE_MEMORY__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__OWNED_CONNECTOR = HARDWARE_STORAGE_MEMORY__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__RSERVICES = HARDWARE_STORAGE_MEMORY__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__USED_BY = HARDWARE_STORAGE_MEMORY__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__PSERVICES = HARDWARE_STORAGE_MEMORY__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__CLOCK = HARDWARE_STORAGE_MEMORY__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__DIMENSION = HARDWARE_STORAGE_MEMORY__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__AREA = HARDWARE_STORAGE_MEMORY__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__POS_X = HARDWARE_STORAGE_MEMORY__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__POS_Y = HARDWARE_STORAGE_MEMORY__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__GRID = HARDWARE_STORAGE_MEMORY__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__NB_PINS = HARDWARE_STORAGE_MEMORY__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__WEIGHT = HARDWARE_STORAGE_MEMORY__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__PRICE = HARDWARE_STORAGE_MEMORY__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__RCONDITIONS = HARDWARE_STORAGE_MEMORY__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__OWNED_PIN = HARDWARE_STORAGE_MEMORY__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__OWNED_WIRE = HARDWARE_STORAGE_MEMORY__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__TECHNOLOGY = HARDWARE_STORAGE_MEMORY__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__MEMORY_SIZE = HARDWARE_STORAGE_MEMORY__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Address Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__ADDRESS_SIZE = HARDWARE_STORAGE_MEMORY__ADDRESS_SIZE;

	/**
	 * The feature id for the '<em><b>Timings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__TIMINGS = HARDWARE_STORAGE_MEMORY__TIMINGS;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__THROUGHPUT = HARDWARE_STORAGE_MEMORY__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__BUFFER = HARDWARE_STORAGE_MEMORY__BUFFER;

	/**
	 * The feature id for the '<em><b>Sector Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE__SECTOR_SIZE = HARDWARE_STORAGE_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Drive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE_FEATURE_COUNT = HARDWARE_STORAGE_MEMORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hardware Drive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_DRIVE_OPERATION_COUNT = HARDWARE_STORAGE_MEMORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareIpBlockImpl <em>Hardware Ip Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareIpBlockImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareIpBlock()
	 * @generated
	 */
	int HARDWARE_IP_BLOCK = 23;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePinImpl <em>Hardware Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwarePinImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwarePin()
	 * @generated
	 */
	int HARDWARE_PIN = 28;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareWireImpl <em>Hardware Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareWireImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareWire()
	 * @generated
	 */
	int HARDWARE_WIRE = 46;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareInterfaceImpl <em>Hardware Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareInterfaceImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareInterface()
	 * @generated
	 */
	int HARDWARE_INTERFACE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INTERFACE__NAME = GrmPackage.RESOURCE_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INTERFACE__OWNED_SERVICE = GrmPackage.RESOURCE_INTERFACE__OWNED_SERVICE;

	/**
	 * The number of structural features of the '<em>Hardware Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INTERFACE_FEATURE_COUNT = GrmPackage.RESOURCE_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INTERFACE_OPERATION_COUNT = GrmPackage.RESOURCE_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareInterfacePackageImpl <em>Hardware Interface Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareInterfacePackageImpl
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareInterfacePackage()
	 * @generated
	 */
	int HARDWARE_INTERFACE_PACKAGE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INTERFACE_PACKAGE__NAME = GrmPackage.RESOURCE_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INTERFACE_PACKAGE__OWNED_ELEMENT = GrmPackage.RESOURCE_PACKAGE__OWNED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Hardware Interface Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INTERFACE_PACKAGE_FEATURE_COUNT = GrmPackage.RESOURCE_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Interface Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INTERFACE_PACKAGE_OPERATION_COUNT = GrmPackage.RESOURCE_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IP_BLOCK__NAME = HARDWARE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IP_BLOCK__OWNED_RESOURCE = HARDWARE_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IP_BLOCK__RES_MULT = HARDWARE_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IP_BLOCK__IS_PROTECTED = HARDWARE_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IP_BLOCK__IS_ACTIVE = HARDWARE_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IP_BLOCK__OWNED_PORT = HARDWARE_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IP_BLOCK__OWNED_CONNECTOR = HARDWARE_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IP_BLOCK__RSERVICES = HARDWARE_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IP_BLOCK__USED_BY = HARDWARE_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IP_BLOCK__PSERVICES = HARDWARE_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IP_BLOCK__CLOCK = HARDWARE_RESOURCE__CLOCK;

	/**
	 * The number of structural features of the '<em>Hardware Ip Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IP_BLOCK_FEATURE_COUNT = HARDWARE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Ip Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_IP_BLOCK_OPERATION_COUNT = HARDWARE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ISA__NAME = HARDWARE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ISA__OWNED_RESOURCE = HARDWARE_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ISA__RES_MULT = HARDWARE_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ISA__IS_PROTECTED = HARDWARE_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ISA__IS_ACTIVE = HARDWARE_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ISA__OWNED_PORT = HARDWARE_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ISA__OWNED_CONNECTOR = HARDWARE_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ISA__RSERVICES = HARDWARE_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ISA__USED_BY = HARDWARE_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ISA__PSERVICES = HARDWARE_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ISA__CLOCK = HARDWARE_RESOURCE__CLOCK;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ISA__FAMILY = HARDWARE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inst Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ISA__INST_WIDTH = HARDWARE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ISA__TYPE = HARDWARE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hardware Isa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ISA_FEATURE_COUNT = HARDWARE_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Hardware Isa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ISA_OPERATION_COUNT = HARDWARE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__NAME = HARDWARE_STORAGE_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__OWNED_RESOURCE = HARDWARE_STORAGE_MANAGER__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__RES_MULT = HARDWARE_STORAGE_MANAGER__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__IS_PROTECTED = HARDWARE_STORAGE_MANAGER__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__IS_ACTIVE = HARDWARE_STORAGE_MANAGER__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__OWNED_PORT = HARDWARE_STORAGE_MANAGER__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__OWNED_CONNECTOR = HARDWARE_STORAGE_MANAGER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__RSERVICES = HARDWARE_STORAGE_MANAGER__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__USED_BY = HARDWARE_STORAGE_MANAGER__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__PSERVICES = HARDWARE_STORAGE_MANAGER__PSERVICES;

	/**
	 * The feature id for the '<em><b>Broked Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__BROKED_RESOURCE = HARDWARE_STORAGE_MANAGER__BROKED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Acc Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__ACC_CTRL_POLICY = HARDWARE_STORAGE_MANAGER__ACC_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__DIMENSION = HARDWARE_STORAGE_MANAGER__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__AREA = HARDWARE_STORAGE_MANAGER__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__POS_X = HARDWARE_STORAGE_MANAGER__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__POS_Y = HARDWARE_STORAGE_MANAGER__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__GRID = HARDWARE_STORAGE_MANAGER__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__NB_PINS = HARDWARE_STORAGE_MANAGER__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__WEIGHT = HARDWARE_STORAGE_MANAGER__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__PRICE = HARDWARE_STORAGE_MANAGER__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__RCONDITIONS = HARDWARE_STORAGE_MANAGER__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__OWNED_PIN = HARDWARE_STORAGE_MANAGER__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__OWNED_WIRE = HARDWARE_STORAGE_MANAGER__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__TECHNOLOGY = HARDWARE_STORAGE_MANAGER__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Managed Memories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__MANAGED_MEMORIES = HARDWARE_STORAGE_MANAGER__MANAGED_MEMORIES;

	/**
	 * The feature id for the '<em><b>Virtual Addr Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__VIRTUAL_ADDR_SPACE = HARDWARE_STORAGE_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physical Addr Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__PHYSICAL_ADDR_SPACE = HARDWARE_STORAGE_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Memory Protection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__MEMORY_PROTECTION = HARDWARE_STORAGE_MANAGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nb Entries Tlb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__NB_ENTRIES_TLB = HARDWARE_STORAGE_MANAGER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Tlbs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU__OWNED_TLBS = HARDWARE_STORAGE_MANAGER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hardware Mmu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU_FEATURE_COUNT = HARDWARE_STORAGE_MANAGER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Hardware Mmu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_MMU_OPERATION_COUNT = HARDWARE_STORAGE_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PIN__NAME = GrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PIN__WIDTH = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PIN__DIRECTION = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hardware Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PIN_FEATURE_COUNT = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hardware Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PIN_OPERATION_COUNT = GrmPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__NAME = HARDWARE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__OWNED_RESOURCE = HARDWARE_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__RES_MULT = HARDWARE_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__IS_PROTECTED = HARDWARE_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__IS_ACTIVE = HARDWARE_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__OWNED_PORT = HARDWARE_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__OWNED_CONNECTOR = HARDWARE_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__RSERVICES = HARDWARE_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__USED_BY = HARDWARE_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__PSERVICES = HARDWARE_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__CLOCK = HARDWARE_RESOURCE__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__DIMENSION = HARDWARE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__AREA = HARDWARE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__POS_X = HARDWARE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__POS_Y = HARDWARE_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__GRID = HARDWARE_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__NB_PINS = HARDWARE_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__WEIGHT = HARDWARE_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__PRICE = HARDWARE_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__RCONDITIONS = HARDWARE_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__OWNED_PIN = HARDWARE_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM__OWNED_WIRE = HARDWARE_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Hardware Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM_FEATURE_COUNT = HARDWARE_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Hardware Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLATFORM_OPERATION_COUNT = HARDWARE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__NAME = HARDWARE_COMPUTING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__OWNED_RESOURCE = HARDWARE_COMPUTING_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__RES_MULT = HARDWARE_COMPUTING_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__IS_PROTECTED = HARDWARE_COMPUTING_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__IS_ACTIVE = HARDWARE_COMPUTING_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__OWNED_PORT = HARDWARE_COMPUTING_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__OWNED_CONNECTOR = HARDWARE_COMPUTING_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__RSERVICES = HARDWARE_COMPUTING_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__USED_BY = HARDWARE_COMPUTING_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__PSERVICES = HARDWARE_COMPUTING_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__SPEED_FACTOR = HARDWARE_COMPUTING_RESOURCE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__MAIN_SCHEDULER = HARDWARE_COMPUTING_RESOURCE__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__CLOCK = HARDWARE_COMPUTING_RESOURCE__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__DIMENSION = HARDWARE_COMPUTING_RESOURCE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__AREA = HARDWARE_COMPUTING_RESOURCE__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__POS_X = HARDWARE_COMPUTING_RESOURCE__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__POS_Y = HARDWARE_COMPUTING_RESOURCE__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__GRID = HARDWARE_COMPUTING_RESOURCE__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__NB_PINS = HARDWARE_COMPUTING_RESOURCE__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__WEIGHT = HARDWARE_COMPUTING_RESOURCE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__PRICE = HARDWARE_COMPUTING_RESOURCE__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__RCONDITIONS = HARDWARE_COMPUTING_RESOURCE__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__OWNED_PIN = HARDWARE_COMPUTING_RESOURCE__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__OWNED_WIRE = HARDWARE_COMPUTING_RESOURCE__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__TECHNOLOGY = HARDWARE_COMPUTING_RESOURCE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Op Frequencies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__OP_FREQUENCIES = HARDWARE_COMPUTING_RESOURCE__OP_FREQUENCIES;

	/**
	 * The feature id for the '<em><b>Pld Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__PLD_TECHNOLOGY = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nb Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__NB_ROWS = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nb Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__NB_COLUMNS = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__KIND = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nb Luts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__NB_LUTS = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nb Lut Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__NB_LUT_INPUTS = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nb Flip Flops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__NB_FLIP_FLOPS = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Blocks Ram</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__BLOCKS_RAM = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__ARCHITECTURE = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ip Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD__IP_BLOCK = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Hardware Pld</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD_FEATURE_COUNT = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Hardware Pld</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PLD_OPERATION_COUNT = HARDWARE_COMPUTING_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__PACKET_SIZE = GrmPackage.RESOURCE_PORT__PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__NAME = GrmPackage.RESOURCE_PORT__NAME;

	/**
	 * The feature id for the '<em><b>PInterface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__PINTERFACE = GrmPackage.RESOURCE_PORT__PINTERFACE;

	/**
	 * The feature id for the '<em><b>RInterface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__RINTERFACE = GrmPackage.RESOURCE_PORT__RINTERFACE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__DIMENSION = GrmPackage.RESOURCE_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__AREA = GrmPackage.RESOURCE_PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__POS_X = GrmPackage.RESOURCE_PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__POS_Y = GrmPackage.RESOURCE_PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__GRID = GrmPackage.RESOURCE_PORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__NB_PINS = GrmPackage.RESOURCE_PORT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__WEIGHT = GrmPackage.RESOURCE_PORT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__PRICE = GrmPackage.RESOURCE_PORT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__RCONDITIONS = GrmPackage.RESOURCE_PORT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__OWNED_PIN = GrmPackage.RESOURCE_PORT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__OWNED_WIRE = GrmPackage.RESOURCE_PORT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__TYPE = GrmPackage.RESOURCE_PORT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__REALIZED_BY = GrmPackage.RESOURCE_PORT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Hardware Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_FEATURE_COUNT = GrmPackage.RESOURCE_PORT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Hardware Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_OPERATION_COUNT = GrmPackage.RESOURCE_PORT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__NAME = HARDWARE_COMPUTING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__OWNED_RESOURCE = HARDWARE_COMPUTING_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__RES_MULT = HARDWARE_COMPUTING_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__IS_PROTECTED = HARDWARE_COMPUTING_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__IS_ACTIVE = HARDWARE_COMPUTING_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__OWNED_PORT = HARDWARE_COMPUTING_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__OWNED_CONNECTOR = HARDWARE_COMPUTING_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__RSERVICES = HARDWARE_COMPUTING_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__USED_BY = HARDWARE_COMPUTING_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__PSERVICES = HARDWARE_COMPUTING_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__SPEED_FACTOR = HARDWARE_COMPUTING_RESOURCE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__MAIN_SCHEDULER = HARDWARE_COMPUTING_RESOURCE__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__CLOCK = HARDWARE_COMPUTING_RESOURCE__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__DIMENSION = HARDWARE_COMPUTING_RESOURCE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__AREA = HARDWARE_COMPUTING_RESOURCE__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__POS_X = HARDWARE_COMPUTING_RESOURCE__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__POS_Y = HARDWARE_COMPUTING_RESOURCE__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__GRID = HARDWARE_COMPUTING_RESOURCE__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__NB_PINS = HARDWARE_COMPUTING_RESOURCE__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__WEIGHT = HARDWARE_COMPUTING_RESOURCE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__PRICE = HARDWARE_COMPUTING_RESOURCE__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__RCONDITIONS = HARDWARE_COMPUTING_RESOURCE__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__OWNED_PIN = HARDWARE_COMPUTING_RESOURCE__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__OWNED_WIRE = HARDWARE_COMPUTING_RESOURCE__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__TECHNOLOGY = HARDWARE_COMPUTING_RESOURCE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Op Frequencies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__OP_FREQUENCIES = HARDWARE_COMPUTING_RESOURCE__OP_FREQUENCIES;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__ARCHITECTURE = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__MIPS = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ipc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__IPC = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nb Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__NB_CORES = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nb Pipelines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__NB_PIPELINES = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nb Stages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__NB_STAGES = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nb Alus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__NB_ALUS = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Nb Fpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__NB_FPUS = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Isas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__OWNED_ISAS = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Predictors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__PREDICTORS = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Caches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__CACHES = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owned Mmus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR__OWNED_MMUS = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Hardware Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR_FEATURE_COUNT = HARDWARE_COMPUTING_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Hardware Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PROCESSOR_OPERATION_COUNT = HARDWARE_COMPUTING_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__NAME = HARDWARE_PROCESSING_MEMORY__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__OWNED_RESOURCE = HARDWARE_PROCESSING_MEMORY__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__RES_MULT = HARDWARE_PROCESSING_MEMORY__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__IS_PROTECTED = HARDWARE_PROCESSING_MEMORY__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__IS_ACTIVE = HARDWARE_PROCESSING_MEMORY__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__OWNED_PORT = HARDWARE_PROCESSING_MEMORY__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__OWNED_CONNECTOR = HARDWARE_PROCESSING_MEMORY__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__RSERVICES = HARDWARE_PROCESSING_MEMORY__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__USED_BY = HARDWARE_PROCESSING_MEMORY__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__PSERVICES = HARDWARE_PROCESSING_MEMORY__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__CLOCK = HARDWARE_PROCESSING_MEMORY__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__DIMENSION = HARDWARE_PROCESSING_MEMORY__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__AREA = HARDWARE_PROCESSING_MEMORY__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__POS_X = HARDWARE_PROCESSING_MEMORY__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__POS_Y = HARDWARE_PROCESSING_MEMORY__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__GRID = HARDWARE_PROCESSING_MEMORY__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__NB_PINS = HARDWARE_PROCESSING_MEMORY__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__WEIGHT = HARDWARE_PROCESSING_MEMORY__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__PRICE = HARDWARE_PROCESSING_MEMORY__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__RCONDITIONS = HARDWARE_PROCESSING_MEMORY__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__OWNED_PIN = HARDWARE_PROCESSING_MEMORY__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__OWNED_WIRE = HARDWARE_PROCESSING_MEMORY__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__TECHNOLOGY = HARDWARE_PROCESSING_MEMORY__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__MEMORY_SIZE = HARDWARE_PROCESSING_MEMORY__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Address Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__ADDRESS_SIZE = HARDWARE_PROCESSING_MEMORY__ADDRESS_SIZE;

	/**
	 * The feature id for the '<em><b>Timings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__TIMINGS = HARDWARE_PROCESSING_MEMORY__TIMINGS;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__THROUGHPUT = HARDWARE_PROCESSING_MEMORY__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Repl Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__REPL_POLICY = HARDWARE_PROCESSING_MEMORY__REPL_POLICY;

	/**
	 * The feature id for the '<em><b>Write Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__WRITE_POLICY = HARDWARE_PROCESSING_MEMORY__WRITE_POLICY;

	/**
	 * The feature id for the '<em><b>Nb Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__NB_ROWS = HARDWARE_PROCESSING_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nb Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__NB_COLUMNS = HARDWARE_PROCESSING_MEMORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nb Banks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__NB_BANKS = HARDWARE_PROCESSING_MEMORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Word Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__WORD_SIZE = HARDWARE_PROCESSING_MEMORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__IS_SYNCHRONOUS = HARDWARE_PROCESSING_MEMORY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__IS_STATIC = HARDWARE_PROCESSING_MEMORY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Non Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM__IS_NON_VOLATILE = HARDWARE_PROCESSING_MEMORY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Hardware Ram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM_FEATURE_COUNT = HARDWARE_PROCESSING_MEMORY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Hardware Ram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RAM_OPERATION_COUNT = HARDWARE_PROCESSING_MEMORY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE_PACKAGE__NAME = GrmPackage.RESOURCE_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE_PACKAGE__OWNED_ELEMENT = GrmPackage.RESOURCE_PACKAGE__OWNED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Hardware Resource Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE_PACKAGE_FEATURE_COUNT = GrmPackage.RESOURCE_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Resource Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE_PACKAGE_OPERATION_COUNT = GrmPackage.RESOURCE_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__NAME = HARDWARE_STORAGE_MEMORY__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__OWNED_RESOURCE = HARDWARE_STORAGE_MEMORY__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__RES_MULT = HARDWARE_STORAGE_MEMORY__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__IS_PROTECTED = HARDWARE_STORAGE_MEMORY__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__IS_ACTIVE = HARDWARE_STORAGE_MEMORY__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__OWNED_PORT = HARDWARE_STORAGE_MEMORY__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__OWNED_CONNECTOR = HARDWARE_STORAGE_MEMORY__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__RSERVICES = HARDWARE_STORAGE_MEMORY__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__USED_BY = HARDWARE_STORAGE_MEMORY__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__PSERVICES = HARDWARE_STORAGE_MEMORY__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__CLOCK = HARDWARE_STORAGE_MEMORY__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__DIMENSION = HARDWARE_STORAGE_MEMORY__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__AREA = HARDWARE_STORAGE_MEMORY__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__POS_X = HARDWARE_STORAGE_MEMORY__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__POS_Y = HARDWARE_STORAGE_MEMORY__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__GRID = HARDWARE_STORAGE_MEMORY__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__NB_PINS = HARDWARE_STORAGE_MEMORY__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__WEIGHT = HARDWARE_STORAGE_MEMORY__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__PRICE = HARDWARE_STORAGE_MEMORY__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__RCONDITIONS = HARDWARE_STORAGE_MEMORY__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__OWNED_PIN = HARDWARE_STORAGE_MEMORY__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__OWNED_WIRE = HARDWARE_STORAGE_MEMORY__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__TECHNOLOGY = HARDWARE_STORAGE_MEMORY__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__MEMORY_SIZE = HARDWARE_STORAGE_MEMORY__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Address Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__ADDRESS_SIZE = HARDWARE_STORAGE_MEMORY__ADDRESS_SIZE;

	/**
	 * The feature id for the '<em><b>Timings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__TIMINGS = HARDWARE_STORAGE_MEMORY__TIMINGS;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__THROUGHPUT = HARDWARE_STORAGE_MEMORY__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__BUFFER = HARDWARE_STORAGE_MEMORY__BUFFER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__TYPE = HARDWARE_STORAGE_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nb Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__NB_ROWS = HARDWARE_STORAGE_MEMORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nb Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__NB_COLUMNS = HARDWARE_STORAGE_MEMORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nb Banks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__NB_BANKS = HARDWARE_STORAGE_MEMORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Word Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM__WORD_SIZE = HARDWARE_STORAGE_MEMORY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hardware Rom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM_FEATURE_COUNT = HARDWARE_STORAGE_MEMORY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Hardware Rom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ROM_OPERATION_COUNT = HARDWARE_STORAGE_MEMORY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__NAME = HARDWARE_IO__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__OWNED_RESOURCE = HARDWARE_IO__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__RES_MULT = HARDWARE_IO__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__IS_PROTECTED = HARDWARE_IO__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__IS_ACTIVE = HARDWARE_IO__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__OWNED_PORT = HARDWARE_IO__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__OWNED_CONNECTOR = HARDWARE_IO__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__RSERVICES = HARDWARE_IO__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__USED_BY = HARDWARE_IO__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__PSERVICES = HARDWARE_IO__PSERVICES;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__SPEED_FACTOR = HARDWARE_IO__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__MAIN_SCHEDULER = HARDWARE_IO__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__CLOCK = HARDWARE_IO__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__DIMENSION = HARDWARE_IO__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__AREA = HARDWARE_IO__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__POS_X = HARDWARE_IO__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__POS_Y = HARDWARE_IO__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__GRID = HARDWARE_IO__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__NB_PINS = HARDWARE_IO__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__WEIGHT = HARDWARE_IO__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__PRICE = HARDWARE_IO__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__RCONDITIONS = HARDWARE_IO__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__OWNED_PIN = HARDWARE_IO__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__OWNED_WIRE = HARDWARE_IO__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR__TECHNOLOGY = HARDWARE_IO__TECHNOLOGY;

	/**
	 * The number of structural features of the '<em>Hardware Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR_FEATURE_COUNT = HARDWARE_IO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SENSOR_OPERATION_COUNT = HARDWARE_IO_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SERVICE__NAME = GrmPackage.RESOURCE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SERVICE__CONTEXT = GrmPackage.RESOURCE_SERVICE__CONTEXT;

	/**
	 * The number of structural features of the '<em>Hardware Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SERVICE_FEATURE_COUNT = GrmPackage.RESOURCE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SERVICE_OPERATION_COUNT = GrmPackage.RESOURCE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__NAME = HARDWARE_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__OWNED_RESOURCE = HARDWARE_DEVICE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__RES_MULT = HARDWARE_DEVICE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__IS_PROTECTED = HARDWARE_DEVICE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__IS_ACTIVE = HARDWARE_DEVICE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__OWNED_PORT = HARDWARE_DEVICE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__OWNED_CONNECTOR = HARDWARE_DEVICE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__RSERVICES = HARDWARE_DEVICE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__USED_BY = HARDWARE_DEVICE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__PSERVICES = HARDWARE_DEVICE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__SPEED_FACTOR = HARDWARE_DEVICE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__MAIN_SCHEDULER = HARDWARE_DEVICE__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__CLOCK = HARDWARE_DEVICE__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__DIMENSION = HARDWARE_DEVICE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__AREA = HARDWARE_DEVICE__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__POS_X = HARDWARE_DEVICE__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__POS_Y = HARDWARE_DEVICE__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__GRID = HARDWARE_DEVICE__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__NB_PINS = HARDWARE_DEVICE__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__WEIGHT = HARDWARE_DEVICE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__PRICE = HARDWARE_DEVICE__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__RCONDITIONS = HARDWARE_DEVICE__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__OWNED_PIN = HARDWARE_DEVICE__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__OWNED_WIRE = HARDWARE_DEVICE__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT__TECHNOLOGY = HARDWARE_DEVICE__TECHNOLOGY;

	/**
	 * The number of structural features of the '<em>Hardware Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT_FEATURE_COUNT = HARDWARE_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SUPPORT_OPERATION_COUNT = HARDWARE_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__NAME = HARDWARE_TIMING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__OWNED_RESOURCE = HARDWARE_TIMING_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__RES_MULT = HARDWARE_TIMING_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__IS_PROTECTED = HARDWARE_TIMING_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__IS_ACTIVE = HARDWARE_TIMING_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__OWNED_PORT = HARDWARE_TIMING_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__OWNED_CONNECTOR = HARDWARE_TIMING_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__RSERVICES = HARDWARE_TIMING_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__USED_BY = HARDWARE_TIMING_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__PSERVICES = HARDWARE_TIMING_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__CLOCK = HARDWARE_TIMING_RESOURCE__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__DIMENSION = HARDWARE_TIMING_RESOURCE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__AREA = HARDWARE_TIMING_RESOURCE__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__POS_X = HARDWARE_TIMING_RESOURCE__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__POS_Y = HARDWARE_TIMING_RESOURCE__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__GRID = HARDWARE_TIMING_RESOURCE__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__NB_PINS = HARDWARE_TIMING_RESOURCE__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__WEIGHT = HARDWARE_TIMING_RESOURCE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__PRICE = HARDWARE_TIMING_RESOURCE__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__RCONDITIONS = HARDWARE_TIMING_RESOURCE__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__OWNED_PIN = HARDWARE_TIMING_RESOURCE__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__OWNED_WIRE = HARDWARE_TIMING_RESOURCE__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__TECHNOLOGY = HARDWARE_TIMING_RESOURCE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Input Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER__INPUT_CLOCK = HARDWARE_TIMING_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER_FEATURE_COUNT = HARDWARE_TIMING_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hardware Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TIMER_OPERATION_COUNT = HARDWARE_TIMING_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__NAME = HARDWARE_TIMER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__OWNED_RESOURCE = HARDWARE_TIMER__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__RES_MULT = HARDWARE_TIMER__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__IS_PROTECTED = HARDWARE_TIMER__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__IS_ACTIVE = HARDWARE_TIMER__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__OWNED_PORT = HARDWARE_TIMER__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__OWNED_CONNECTOR = HARDWARE_TIMER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__RSERVICES = HARDWARE_TIMER__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__USED_BY = HARDWARE_TIMER__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__PSERVICES = HARDWARE_TIMER__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__CLOCK = HARDWARE_TIMER__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__DIMENSION = HARDWARE_TIMER__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__AREA = HARDWARE_TIMER__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__POS_X = HARDWARE_TIMER__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__POS_Y = HARDWARE_TIMER__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__GRID = HARDWARE_TIMER__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__NB_PINS = HARDWARE_TIMER__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__WEIGHT = HARDWARE_TIMER__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__PRICE = HARDWARE_TIMER__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__RCONDITIONS = HARDWARE_TIMER__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__OWNED_PIN = HARDWARE_TIMER__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__OWNED_WIRE = HARDWARE_TIMER__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__TECHNOLOGY = HARDWARE_TIMER__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Input Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG__INPUT_CLOCK = HARDWARE_TIMER__INPUT_CLOCK;

	/**
	 * The number of structural features of the '<em>Hardware Watchdog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG_FEATURE_COUNT = HARDWARE_TIMER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Watchdog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WATCHDOG_OPERATION_COUNT = HARDWARE_TIMER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WIRE__SOURCE_PIN = 0;

	/**
	 * The feature id for the '<em><b>Target Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WIRE__TARGET_PIN = 1;

	/**
	 * The number of structural features of the '<em>Hardware Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WIRE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hardware Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_WIRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.IsaType <em>Isa Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.IsaType
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getIsaType()
	 * @generated
	 */
	int ISA_TYPE = 51;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.PldTechnology <em>Pld Technology</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.PldTechnology
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getPldTechnology()
	 * @generated
	 */
	int PLD_TECHNOLOGY = 52;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.PldClass <em>Pld Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.PldClass
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getPldClass()
	 * @generated
	 */
	int PLD_CLASS = 53;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.ReplPolicy <em>Repl Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.ReplPolicy
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getReplPolicy()
	 * @generated
	 */
	int REPL_POLICY = 55;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.WritePolicy <em>Write Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.WritePolicy
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getWritePolicy()
	 * @generated
	 */
	int WRITE_POLICY = 57;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.CacheType <em>Cache Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.CacheType
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getCacheType()
	 * @generated
	 */
	int CACHE_TYPE = 47;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.RomType <em>Rom Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.RomType
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getRomType()
	 * @generated
	 */
	int ROM_TYPE = 56;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.ConditionType <em>Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.ConditionType
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getConditionType()
	 * @generated
	 */
	int CONDITION_TYPE = 49;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.PortType <em>Port Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.PortType
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 54;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.ComponentState <em>Component State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.ComponentState
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getComponentState()
	 * @generated
	 */
	int COMPONENT_STATE = 48;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.hrm.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.hrm.Direction
	 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 50;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareResourcePackage <em>Hardware Resource Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Resource Package</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareResourcePackage
	 * @generated
	 */
	EClass getHardwareResourcePackage();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareResource <em>Hardware Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Resource</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareResource
	 * @generated
	 */
	EClass getHardwareResource();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.hrm.HardwareResource#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareResource#getClock()
	 * @see #getHardwareResource()
	 * @generated
	 */
	EReference getHardwareResource_Clock();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwarePort <em>Hardware Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Port</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePort
	 * @generated
	 */
	EClass getHardwarePort();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwarePort#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePort#getType()
	 * @see #getHardwarePort()
	 * @generated
	 */
	EAttribute getHardwarePort_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.hrm.HardwarePort#getRealizedBy <em>Realized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized By</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePort#getRealizedBy()
	 * @see #getHardwarePort()
	 * @generated
	 */
	EReference getHardwarePort_RealizedBy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareConnector <em>Hardware Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Connector</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareConnector
	 * @generated
	 */
	EClass getHardwareConnector();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareService <em>Hardware Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Service</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareService
	 * @generated
	 */
	EClass getHardwareService();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareComputingResource <em>Hardware Computing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Computing Resource</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareComputingResource
	 * @generated
	 */
	EClass getHardwareComputingResource();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareComputingResource#getOpFrequencies <em>Op Frequencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op Frequencies</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareComputingResource#getOpFrequencies()
	 * @see #getHardwareComputingResource()
	 * @generated
	 */
	EAttribute getHardwareComputingResource_OpFrequencies();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor <em>Hardware Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Processor</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareProcessor
	 * @generated
	 */
	EClass getHardwareProcessor();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareProcessor#getArchitecture()
	 * @see #getHardwareProcessor()
	 * @generated
	 */
	EAttribute getHardwareProcessor_Architecture();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getMips <em>Mips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mips</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareProcessor#getMips()
	 * @see #getHardwareProcessor()
	 * @generated
	 */
	EAttribute getHardwareProcessor_Mips();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getIpc <em>Ipc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ipc</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareProcessor#getIpc()
	 * @see #getHardwareProcessor()
	 * @generated
	 */
	EAttribute getHardwareProcessor_Ipc();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbCores <em>Nb Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Cores</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbCores()
	 * @see #getHardwareProcessor()
	 * @generated
	 */
	EAttribute getHardwareProcessor_NbCores();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbPipelines <em>Nb Pipelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Pipelines</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbPipelines()
	 * @see #getHardwareProcessor()
	 * @generated
	 */
	EAttribute getHardwareProcessor_NbPipelines();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbStages <em>Nb Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Stages</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbStages()
	 * @see #getHardwareProcessor()
	 * @generated
	 */
	EAttribute getHardwareProcessor_NbStages();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbAlus <em>Nb Alus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Alus</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbAlus()
	 * @see #getHardwareProcessor()
	 * @generated
	 */
	EAttribute getHardwareProcessor_NbAlus();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbFpus <em>Nb Fpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Fpus</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbFpus()
	 * @see #getHardwareProcessor()
	 * @generated
	 */
	EAttribute getHardwareProcessor_NbFpus();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getOwnedIsas <em>Owned Isas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Isas</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareProcessor#getOwnedIsas()
	 * @see #getHardwareProcessor()
	 * @generated
	 */
	EReference getHardwareProcessor_OwnedIsas();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getPredictors <em>Predictors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predictors</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareProcessor#getPredictors()
	 * @see #getHardwareProcessor()
	 * @generated
	 */
	EReference getHardwareProcessor_Predictors();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getCaches <em>Caches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Caches</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareProcessor#getCaches()
	 * @see #getHardwareProcessor()
	 * @generated
	 */
	EReference getHardwareProcessor_Caches();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getOwnedMmus <em>Owned Mmus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Mmus</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareProcessor#getOwnedMmus()
	 * @see #getHardwareProcessor()
	 * @generated
	 */
	EReference getHardwareProcessor_OwnedMmus();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareAsic <em>Hardware Asic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Asic</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareAsic
	 * @generated
	 */
	EClass getHardwareAsic();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwarePld <em>Hardware Pld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Pld</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePld
	 * @generated
	 */
	EClass getHardwarePld();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getPldTechnology <em>Pld Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pld Technology</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePld#getPldTechnology()
	 * @see #getHardwarePld()
	 * @generated
	 */
	EAttribute getHardwarePld_PldTechnology();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getNbRows <em>Nb Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Rows</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePld#getNbRows()
	 * @see #getHardwarePld()
	 * @generated
	 */
	EAttribute getHardwarePld_NbRows();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getNbColumns <em>Nb Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Columns</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePld#getNbColumns()
	 * @see #getHardwarePld()
	 * @generated
	 */
	EAttribute getHardwarePld_NbColumns();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePld#getKind()
	 * @see #getHardwarePld()
	 * @generated
	 */
	EAttribute getHardwarePld_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getNbLuts <em>Nb Luts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Luts</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePld#getNbLuts()
	 * @see #getHardwarePld()
	 * @generated
	 */
	EAttribute getHardwarePld_NbLuts();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getNbLutInputs <em>Nb Lut Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Lut Inputs</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePld#getNbLutInputs()
	 * @see #getHardwarePld()
	 * @generated
	 */
	EAttribute getHardwarePld_NbLutInputs();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getNbFlipFlops <em>Nb Flip Flops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Flip Flops</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePld#getNbFlipFlops()
	 * @see #getHardwarePld()
	 * @generated
	 */
	EAttribute getHardwarePld_NbFlipFlops();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getBlocksRam <em>Blocks Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Blocks Ram</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePld#getBlocksRam()
	 * @see #getHardwarePld()
	 * @generated
	 */
	EReference getHardwarePld_BlocksRam();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Architecture</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePld#getArchitecture()
	 * @see #getHardwarePld()
	 * @generated
	 */
	EReference getHardwarePld_Architecture();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getIpBlock <em>Ip Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ip Block</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePld#getIpBlock()
	 * @see #getHardwarePld()
	 * @generated
	 */
	EReference getHardwarePld_IpBlock();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareBranchPredictor <em>Hardware Branch Predictor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Branch Predictor</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareBranchPredictor
	 * @generated
	 */
	EClass getHardwareBranchPredictor();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareIsa <em>Hardware Isa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Isa</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareIsa
	 * @generated
	 */
	EClass getHardwareIsa();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareIsa#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareIsa#getFamily()
	 * @see #getHardwareIsa()
	 * @generated
	 */
	EAttribute getHardwareIsa_Family();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareIsa#getInstWidth <em>Inst Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inst Width</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareIsa#getInstWidth()
	 * @see #getHardwareIsa()
	 * @generated
	 */
	EAttribute getHardwareIsa_InstWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareIsa#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareIsa#getType()
	 * @see #getHardwareIsa()
	 * @generated
	 */
	EAttribute getHardwareIsa_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareMemory <em>Hardware Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Memory</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareMemory
	 * @generated
	 */
	EClass getHardwareMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareMemory#getMemorySize <em>Memory Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Size</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareMemory#getMemorySize()
	 * @see #getHardwareMemory()
	 * @generated
	 */
	EAttribute getHardwareMemory_MemorySize();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareMemory#getAddressSize <em>Address Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Size</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareMemory#getAddressSize()
	 * @see #getHardwareMemory()
	 * @generated
	 */
	EAttribute getHardwareMemory_AddressSize();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.hrm.HardwareMemory#getTimings <em>Timings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Timings</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareMemory#getTimings()
	 * @see #getHardwareMemory()
	 * @generated
	 */
	EAttribute getHardwareMemory_Timings();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareMemory#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareMemory#getThroughput()
	 * @see #getHardwareMemory()
	 * @generated
	 */
	EAttribute getHardwareMemory_Throughput();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessingMemory <em>Hardware Processing Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Processing Memory</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareProcessingMemory
	 * @generated
	 */
	EClass getHardwareProcessingMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessingMemory#getReplPolicy <em>Repl Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repl Policy</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareProcessingMemory#getReplPolicy()
	 * @see #getHardwareProcessingMemory()
	 * @generated
	 */
	EAttribute getHardwareProcessingMemory_ReplPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessingMemory#getWritePolicy <em>Write Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Policy</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareProcessingMemory#getWritePolicy()
	 * @see #getHardwareProcessingMemory()
	 * @generated
	 */
	EAttribute getHardwareProcessingMemory_WritePolicy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareStorageMemory <em>Hardware Storage Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Storage Memory</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareStorageMemory
	 * @generated
	 */
	EClass getHardwareStorageMemory();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.hrm.HardwareStorageMemory#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Buffer</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareStorageMemory#getBuffer()
	 * @see #getHardwareStorageMemory()
	 * @generated
	 */
	EReference getHardwareStorageMemory_Buffer();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareCache <em>Hardware Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Cache</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareCache
	 * @generated
	 */
	EClass getHardwareCache();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareCache#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareCache#getLevel()
	 * @see #getHardwareCache()
	 * @generated
	 */
	EAttribute getHardwareCache_Level();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareCache#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareCache#getType()
	 * @see #getHardwareCache()
	 * @generated
	 */
	EAttribute getHardwareCache_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareCache#getNbSets <em>Nb Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Sets</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareCache#getNbSets()
	 * @see #getHardwareCache()
	 * @generated
	 */
	EAttribute getHardwareCache_NbSets();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareCache#getBlockSize <em>Block Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Size</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareCache#getBlockSize()
	 * @see #getHardwareCache()
	 * @generated
	 */
	EAttribute getHardwareCache_BlockSize();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareCache#getAssociativity <em>Associativity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associativity</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareCache#getAssociativity()
	 * @see #getHardwareCache()
	 * @generated
	 */
	EAttribute getHardwareCache_Associativity();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareRam <em>Hardware Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Ram</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareRam
	 * @generated
	 */
	EClass getHardwareRam();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareRam#getNbRows <em>Nb Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Rows</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareRam#getNbRows()
	 * @see #getHardwareRam()
	 * @generated
	 */
	EAttribute getHardwareRam_NbRows();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareRam#getNbColumns <em>Nb Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Columns</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareRam#getNbColumns()
	 * @see #getHardwareRam()
	 * @generated
	 */
	EAttribute getHardwareRam_NbColumns();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareRam#getNbBanks <em>Nb Banks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Banks</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareRam#getNbBanks()
	 * @see #getHardwareRam()
	 * @generated
	 */
	EAttribute getHardwareRam_NbBanks();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareRam#getWordSize <em>Word Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Word Size</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareRam#getWordSize()
	 * @see #getHardwareRam()
	 * @generated
	 */
	EAttribute getHardwareRam_WordSize();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareRam#isIsSynchronous <em>Is Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Synchronous</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareRam#isIsSynchronous()
	 * @see #getHardwareRam()
	 * @generated
	 */
	EAttribute getHardwareRam_IsSynchronous();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareRam#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareRam#isIsStatic()
	 * @see #getHardwareRam()
	 * @generated
	 */
	EAttribute getHardwareRam_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareRam#isIsNonVolatile <em>Is Non Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Non Volatile</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareRam#isIsNonVolatile()
	 * @see #getHardwareRam()
	 * @generated
	 */
	EAttribute getHardwareRam_IsNonVolatile();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareRom <em>Hardware Rom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Rom</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareRom
	 * @generated
	 */
	EClass getHardwareRom();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareRom#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareRom#getType()
	 * @see #getHardwareRom()
	 * @generated
	 */
	EAttribute getHardwareRom_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareRom#getNbRows <em>Nb Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Rows</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareRom#getNbRows()
	 * @see #getHardwareRom()
	 * @generated
	 */
	EAttribute getHardwareRom_NbRows();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareRom#getNbColumns <em>Nb Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Columns</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareRom#getNbColumns()
	 * @see #getHardwareRom()
	 * @generated
	 */
	EAttribute getHardwareRom_NbColumns();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareRom#getNbBanks <em>Nb Banks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Banks</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareRom#getNbBanks()
	 * @see #getHardwareRom()
	 * @generated
	 */
	EAttribute getHardwareRom_NbBanks();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareRom#getWordSize <em>Word Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Word Size</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareRom#getWordSize()
	 * @see #getHardwareRom()
	 * @generated
	 */
	EAttribute getHardwareRom_WordSize();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareDrive <em>Hardware Drive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Drive</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareDrive
	 * @generated
	 */
	EClass getHardwareDrive();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareDrive#getSectorSize <em>Sector Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sector Size</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareDrive#getSectorSize()
	 * @see #getHardwareDrive()
	 * @generated
	 */
	EAttribute getHardwareDrive_SectorSize();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareStorageManager <em>Hardware Storage Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Storage Manager</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareStorageManager
	 * @generated
	 */
	EClass getHardwareStorageManager();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.hrm.HardwareStorageManager#getManagedMemories <em>Managed Memories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Managed Memories</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareStorageManager#getManagedMemories()
	 * @see #getHardwareStorageManager()
	 * @generated
	 */
	EReference getHardwareStorageManager_ManagedMemories();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareDma <em>Hardware Dma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Dma</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareDma
	 * @generated
	 */
	EClass getHardwareDma();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareDma#getNbChannels <em>Nb Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Channels</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareDma#getNbChannels()
	 * @see #getHardwareDma()
	 * @generated
	 */
	EAttribute getHardwareDma_NbChannels();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareDma#getTransferWidth <em>Transfer Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transfer Width</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareDma#getTransferWidth()
	 * @see #getHardwareDma()
	 * @generated
	 */
	EAttribute getHardwareDma_TransferWidth();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.hrm.HardwareDma#getDrivenBy <em>Driven By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Driven By</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareDma#getDrivenBy()
	 * @see #getHardwareDma()
	 * @generated
	 */
	EReference getHardwareDma_DrivenBy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareMmu <em>Hardware Mmu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Mmu</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareMmu
	 * @generated
	 */
	EClass getHardwareMmu();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareMmu#getVirtualAddrSpace <em>Virtual Addr Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Addr Space</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareMmu#getVirtualAddrSpace()
	 * @see #getHardwareMmu()
	 * @generated
	 */
	EAttribute getHardwareMmu_VirtualAddrSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareMmu#getPhysicalAddrSpace <em>Physical Addr Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Addr Space</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareMmu#getPhysicalAddrSpace()
	 * @see #getHardwareMmu()
	 * @generated
	 */
	EAttribute getHardwareMmu_PhysicalAddrSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareMmu#isMemoryProtection <em>Memory Protection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Protection</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareMmu#isMemoryProtection()
	 * @see #getHardwareMmu()
	 * @generated
	 */
	EAttribute getHardwareMmu_MemoryProtection();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareMmu#getNbEntriesTlb <em>Nb Entries Tlb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Entries Tlb</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareMmu#getNbEntriesTlb()
	 * @see #getHardwareMmu()
	 * @generated
	 */
	EAttribute getHardwareMmu_NbEntriesTlb();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.hrm.HardwareMmu#getOwnedTlbs <em>Owned Tlbs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Tlbs</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareMmu#getOwnedTlbs()
	 * @see #getHardwareMmu()
	 * @generated
	 */
	EReference getHardwareMmu_OwnedTlbs();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareArbiter <em>Hardware Arbiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Arbiter</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareArbiter
	 * @generated
	 */
	EClass getHardwareArbiter();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.hrm.HardwareArbiter#getControlledMedia <em>Controlled Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controlled Media</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareArbiter#getControlledMedia()
	 * @see #getHardwareArbiter()
	 * @generated
	 */
	EReference getHardwareArbiter_ControlledMedia();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareCommunicationResource <em>Hardware Communication Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Communication Resource</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareCommunicationResource
	 * @generated
	 */
	EClass getHardwareCommunicationResource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareMedia <em>Hardware Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Media</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareMedia
	 * @generated
	 */
	EClass getHardwareMedia();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.hrm.HardwareMedia#getArbiters <em>Arbiters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arbiters</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareMedia#getArbiters()
	 * @see #getHardwareMedia()
	 * @generated
	 */
	EReference getHardwareMedia_Arbiters();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareBus <em>Hardware Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Bus</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareBus
	 * @generated
	 */
	EClass getHardwareBus();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareBus#getAddressWidth <em>Address Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Width</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareBus#getAddressWidth()
	 * @see #getHardwareBus()
	 * @generated
	 */
	EAttribute getHardwareBus_AddressWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareBus#getWordWidth <em>Word Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Word Width</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareBus#getWordWidth()
	 * @see #getHardwareBus()
	 * @generated
	 */
	EAttribute getHardwareBus_WordWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareBus#isIsSynchronous <em>Is Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Synchronous</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareBus#isIsSynchronous()
	 * @see #getHardwareBus()
	 * @generated
	 */
	EAttribute getHardwareBus_IsSynchronous();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareBus#isIsSerial <em>Is Serial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Serial</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareBus#isIsSerial()
	 * @see #getHardwareBus()
	 * @generated
	 */
	EAttribute getHardwareBus_IsSerial();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareBridge <em>Hardware Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Bridge</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareBridge
	 * @generated
	 */
	EClass getHardwareBridge();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.hrm.HardwareBridge#getSides <em>Sides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sides</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareBridge#getSides()
	 * @see #getHardwareBridge()
	 * @generated
	 */
	EReference getHardwareBridge_Sides();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareTimingResource <em>Hardware Timing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Timing Resource</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareTimingResource
	 * @generated
	 */
	EClass getHardwareTimingResource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareClock <em>Hardware Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Clock</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareClock
	 * @generated
	 */
	EClass getHardwareClock();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareClock#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareClock#getFrequency()
	 * @see #getHardwareClock()
	 * @generated
	 */
	EAttribute getHardwareClock_Frequency();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareTimer <em>Hardware Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Timer</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareTimer
	 * @generated
	 */
	EClass getHardwareTimer();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.hrm.HardwareTimer#getInputClock <em>Input Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Clock</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareTimer#getInputClock()
	 * @see #getHardwareTimer()
	 * @generated
	 */
	EReference getHardwareTimer_InputClock();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareWatchdog <em>Hardware Watchdog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Watchdog</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareWatchdog
	 * @generated
	 */
	EClass getHardwareWatchdog();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareDevice <em>Hardware Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Device</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareDevice
	 * @generated
	 */
	EClass getHardwareDevice();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareIo <em>Hardware Io</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Io</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareIo
	 * @generated
	 */
	EClass getHardwareIo();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareSupport <em>Hardware Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Support</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareSupport
	 * @generated
	 */
	EClass getHardwareSupport();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareActuator <em>Hardware Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Actuator</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareActuator
	 * @generated
	 */
	EClass getHardwareActuator();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareSensor <em>Hardware Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Sensor</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareSensor
	 * @generated
	 */
	EClass getHardwareSensor();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwarePlatform <em>Hardware Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Platform</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePlatform
	 * @generated
	 */
	EClass getHardwarePlatform();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent <em>Hardware Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Component</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareComponent
	 * @generated
	 */
	EClass getHardwareComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareComponent#getDimension()
	 * @see #getHardwareComponent()
	 * @generated
	 */
	EAttribute getHardwareComponent_Dimension();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareComponent#getArea()
	 * @see #getHardwareComponent()
	 * @generated
	 */
	EAttribute getHardwareComponent_Area();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareComponent#getPosX()
	 * @see #getHardwareComponent()
	 * @generated
	 */
	EAttribute getHardwareComponent_PosX();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareComponent#getPosY()
	 * @see #getHardwareComponent()
	 * @generated
	 */
	EAttribute getHardwareComponent_PosY();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareComponent#getGrid()
	 * @see #getHardwareComponent()
	 * @generated
	 */
	EAttribute getHardwareComponent_Grid();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getNbPins <em>Nb Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Pins</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareComponent#getNbPins()
	 * @see #getHardwareComponent()
	 * @generated
	 */
	EAttribute getHardwareComponent_NbPins();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareComponent#getWeight()
	 * @see #getHardwareComponent()
	 * @generated
	 */
	EAttribute getHardwareComponent_Weight();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareComponent#getPrice()
	 * @see #getHardwareComponent()
	 * @generated
	 */
	EAttribute getHardwareComponent_Price();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getRConditions <em>RConditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RConditions</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareComponent#getRConditions()
	 * @see #getHardwareComponent()
	 * @generated
	 */
	EReference getHardwareComponent_RConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getOwnedPin <em>Owned Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Pin</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareComponent#getOwnedPin()
	 * @see #getHardwareComponent()
	 * @generated
	 */
	EReference getHardwareComponent_OwnedPin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getOwnedWire <em>Owned Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Wire</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareComponent#getOwnedWire()
	 * @see #getHardwareComponent()
	 * @generated
	 */
	EReference getHardwareComponent_OwnedWire();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.EnvCondition <em>Env Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Condition</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.EnvCondition
	 * @generated
	 */
	EClass getEnvCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.EnvCondition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.EnvCondition#getType()
	 * @see #getEnvCondition()
	 * @generated
	 */
	EAttribute getEnvCondition_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.EnvCondition#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.EnvCondition#getStatus()
	 * @see #getEnvCondition()
	 * @generated
	 */
	EAttribute getEnvCondition_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.EnvCondition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.EnvCondition#getDescription()
	 * @see #getEnvCondition()
	 * @generated
	 */
	EAttribute getEnvCondition_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.EnvCondition#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.EnvCondition#getRange()
	 * @see #getEnvCondition()
	 * @generated
	 */
	EAttribute getEnvCondition_Range();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareChip <em>Hardware Chip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Chip</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareChip
	 * @generated
	 */
	EClass getHardwareChip();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareChip#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareChip#getTechnology()
	 * @see #getHardwareChip()
	 * @generated
	 */
	EAttribute getHardwareChip_Technology();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareChannel <em>Hardware Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Channel</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareChannel
	 * @generated
	 */
	EClass getHardwareChannel();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwareChannel#getNbWires <em>Nb Wires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Wires</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareChannel#getNbWires()
	 * @see #getHardwareChannel()
	 * @generated
	 */
	EAttribute getHardwareChannel_NbWires();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.hrm.HardwareChannel#getRealizedBy <em>Realized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized By</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareChannel#getRealizedBy()
	 * @see #getHardwareChannel()
	 * @generated
	 */
	EReference getHardwareChannel_RealizedBy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareCard <em>Hardware Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Card</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareCard
	 * @generated
	 */
	EClass getHardwareCard();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.FirmwareArchitecture <em>Firmware Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmware Architecture</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.FirmwareArchitecture
	 * @generated
	 */
	EClass getFirmwareArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.hrm.FirmwareArchitecture#getOwnedWire <em>Owned Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Wire</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.FirmwareArchitecture#getOwnedWire()
	 * @see #getFirmwareArchitecture()
	 * @generated
	 */
	EReference getFirmwareArchitecture_OwnedWire();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.hrm.FirmwareArchitecture#getOwnedPin <em>Owned Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Pin</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.FirmwareArchitecture#getOwnedPin()
	 * @see #getFirmwareArchitecture()
	 * @generated
	 */
	EReference getFirmwareArchitecture_OwnedPin();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareIpBlock <em>Hardware Ip Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Ip Block</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareIpBlock
	 * @generated
	 */
	EClass getHardwareIpBlock();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwarePin <em>Hardware Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Pin</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePin
	 * @generated
	 */
	EClass getHardwarePin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwarePin#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePin#getWidth()
	 * @see #getHardwarePin()
	 * @generated
	 */
	EAttribute getHardwarePin_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.hrm.HardwarePin#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwarePin#getDirection()
	 * @see #getHardwarePin()
	 * @generated
	 */
	EAttribute getHardwarePin_Direction();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareWire <em>Hardware Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Wire</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareWire
	 * @generated
	 */
	EClass getHardwareWire();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.hrm.HardwareWire#getSourcePin <em>Source Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Pin</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareWire#getSourcePin()
	 * @see #getHardwareWire()
	 * @generated
	 */
	EReference getHardwareWire_SourcePin();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.hrm.HardwareWire#getTargetPin <em>Target Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Pin</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareWire#getTargetPin()
	 * @see #getHardwareWire()
	 * @generated
	 */
	EReference getHardwareWire_TargetPin();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareInterface <em>Hardware Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Interface</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareInterface
	 * @generated
	 */
	EClass getHardwareInterface();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.hrm.HardwareInterfacePackage <em>Hardware Interface Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Interface Package</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.HardwareInterfacePackage
	 * @generated
	 */
	EClass getHardwareInterfacePackage();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.hrm.IsaType <em>Isa Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Isa Type</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.IsaType
	 * @generated
	 */
	EEnum getIsaType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.hrm.PldTechnology <em>Pld Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pld Technology</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.PldTechnology
	 * @generated
	 */
	EEnum getPldTechnology();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.hrm.PldClass <em>Pld Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pld Class</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.PldClass
	 * @generated
	 */
	EEnum getPldClass();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.hrm.ReplPolicy <em>Repl Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Repl Policy</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.ReplPolicy
	 * @generated
	 */
	EEnum getReplPolicy();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.hrm.WritePolicy <em>Write Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Write Policy</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.WritePolicy
	 * @generated
	 */
	EEnum getWritePolicy();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.hrm.CacheType <em>Cache Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Type</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.CacheType
	 * @generated
	 */
	EEnum getCacheType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.hrm.RomType <em>Rom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rom Type</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.RomType
	 * @generated
	 */
	EEnum getRomType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.hrm.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Type</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.ConditionType
	 * @generated
	 */
	EEnum getConditionType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.hrm.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Type</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.PortType
	 * @generated
	 */
	EEnum getPortType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.hrm.ComponentState <em>Component State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component State</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.ComponentState
	 * @generated
	 */
	EEnum getComponentState();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.hrm.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see org.polarsys.time4sys.marte.hrm.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HrmFactory getHrmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareResourcePackageImpl <em>Hardware Resource Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareResourcePackageImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareResourcePackage()
		 * @generated
		 */
		EClass HARDWARE_RESOURCE_PACKAGE = eINSTANCE.getHardwareResourcePackage();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareResourceImpl <em>Hardware Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareResourceImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareResource()
		 * @generated
		 */
		EClass HARDWARE_RESOURCE = eINSTANCE.getHardwareResource();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_RESOURCE__CLOCK = eINSTANCE.getHardwareResource_Clock();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePortImpl <em>Hardware Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwarePortImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwarePort()
		 * @generated
		 */
		EClass HARDWARE_PORT = eINSTANCE.getHardwarePort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PORT__TYPE = eINSTANCE.getHardwarePort_Type();

		/**
		 * The meta object literal for the '<em><b>Realized By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PORT__REALIZED_BY = eINSTANCE.getHardwarePort_RealizedBy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareConnectorImpl <em>Hardware Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareConnectorImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareConnector()
		 * @generated
		 */
		EClass HARDWARE_CONNECTOR = eINSTANCE.getHardwareConnector();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareServiceImpl <em>Hardware Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareServiceImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareService()
		 * @generated
		 */
		EClass HARDWARE_SERVICE = eINSTANCE.getHardwareService();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl <em>Hardware Computing Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareComputingResource()
		 * @generated
		 */
		EClass HARDWARE_COMPUTING_RESOURCE = eINSTANCE.getHardwareComputingResource();

		/**
		 * The meta object literal for the '<em><b>Op Frequencies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_COMPUTING_RESOURCE__OP_FREQUENCIES = eINSTANCE.getHardwareComputingResource_OpFrequencies();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessorImpl <em>Hardware Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareProcessorImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareProcessor()
		 * @generated
		 */
		EClass HARDWARE_PROCESSOR = eINSTANCE.getHardwareProcessor();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PROCESSOR__ARCHITECTURE = eINSTANCE.getHardwareProcessor_Architecture();

		/**
		 * The meta object literal for the '<em><b>Mips</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PROCESSOR__MIPS = eINSTANCE.getHardwareProcessor_Mips();

		/**
		 * The meta object literal for the '<em><b>Ipc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PROCESSOR__IPC = eINSTANCE.getHardwareProcessor_Ipc();

		/**
		 * The meta object literal for the '<em><b>Nb Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PROCESSOR__NB_CORES = eINSTANCE.getHardwareProcessor_NbCores();

		/**
		 * The meta object literal for the '<em><b>Nb Pipelines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PROCESSOR__NB_PIPELINES = eINSTANCE.getHardwareProcessor_NbPipelines();

		/**
		 * The meta object literal for the '<em><b>Nb Stages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PROCESSOR__NB_STAGES = eINSTANCE.getHardwareProcessor_NbStages();

		/**
		 * The meta object literal for the '<em><b>Nb Alus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PROCESSOR__NB_ALUS = eINSTANCE.getHardwareProcessor_NbAlus();

		/**
		 * The meta object literal for the '<em><b>Nb Fpus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PROCESSOR__NB_FPUS = eINSTANCE.getHardwareProcessor_NbFpus();

		/**
		 * The meta object literal for the '<em><b>Owned Isas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PROCESSOR__OWNED_ISAS = eINSTANCE.getHardwareProcessor_OwnedIsas();

		/**
		 * The meta object literal for the '<em><b>Predictors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PROCESSOR__PREDICTORS = eINSTANCE.getHardwareProcessor_Predictors();

		/**
		 * The meta object literal for the '<em><b>Caches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PROCESSOR__CACHES = eINSTANCE.getHardwareProcessor_Caches();

		/**
		 * The meta object literal for the '<em><b>Owned Mmus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PROCESSOR__OWNED_MMUS = eINSTANCE.getHardwareProcessor_OwnedMmus();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareAsicImpl <em>Hardware Asic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareAsicImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareAsic()
		 * @generated
		 */
		EClass HARDWARE_ASIC = eINSTANCE.getHardwareAsic();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePldImpl <em>Hardware Pld</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwarePldImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwarePld()
		 * @generated
		 */
		EClass HARDWARE_PLD = eINSTANCE.getHardwarePld();

		/**
		 * The meta object literal for the '<em><b>Pld Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PLD__PLD_TECHNOLOGY = eINSTANCE.getHardwarePld_PldTechnology();

		/**
		 * The meta object literal for the '<em><b>Nb Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PLD__NB_ROWS = eINSTANCE.getHardwarePld_NbRows();

		/**
		 * The meta object literal for the '<em><b>Nb Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PLD__NB_COLUMNS = eINSTANCE.getHardwarePld_NbColumns();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PLD__KIND = eINSTANCE.getHardwarePld_Kind();

		/**
		 * The meta object literal for the '<em><b>Nb Luts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PLD__NB_LUTS = eINSTANCE.getHardwarePld_NbLuts();

		/**
		 * The meta object literal for the '<em><b>Nb Lut Inputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PLD__NB_LUT_INPUTS = eINSTANCE.getHardwarePld_NbLutInputs();

		/**
		 * The meta object literal for the '<em><b>Nb Flip Flops</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PLD__NB_FLIP_FLOPS = eINSTANCE.getHardwarePld_NbFlipFlops();

		/**
		 * The meta object literal for the '<em><b>Blocks Ram</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PLD__BLOCKS_RAM = eINSTANCE.getHardwarePld_BlocksRam();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PLD__ARCHITECTURE = eINSTANCE.getHardwarePld_Architecture();

		/**
		 * The meta object literal for the '<em><b>Ip Block</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PLD__IP_BLOCK = eINSTANCE.getHardwarePld_IpBlock();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareBranchPredictorImpl <em>Hardware Branch Predictor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareBranchPredictorImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareBranchPredictor()
		 * @generated
		 */
		EClass HARDWARE_BRANCH_PREDICTOR = eINSTANCE.getHardwareBranchPredictor();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareIsaImpl <em>Hardware Isa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareIsaImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareIsa()
		 * @generated
		 */
		EClass HARDWARE_ISA = eINSTANCE.getHardwareIsa();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_ISA__FAMILY = eINSTANCE.getHardwareIsa_Family();

		/**
		 * The meta object literal for the '<em><b>Inst Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_ISA__INST_WIDTH = eINSTANCE.getHardwareIsa_InstWidth();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_ISA__TYPE = eINSTANCE.getHardwareIsa_Type();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareMemoryImpl <em>Hardware Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareMemoryImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareMemory()
		 * @generated
		 */
		EClass HARDWARE_MEMORY = eINSTANCE.getHardwareMemory();

		/**
		 * The meta object literal for the '<em><b>Memory Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_MEMORY__MEMORY_SIZE = eINSTANCE.getHardwareMemory_MemorySize();

		/**
		 * The meta object literal for the '<em><b>Address Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_MEMORY__ADDRESS_SIZE = eINSTANCE.getHardwareMemory_AddressSize();

		/**
		 * The meta object literal for the '<em><b>Timings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_MEMORY__TIMINGS = eINSTANCE.getHardwareMemory_Timings();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_MEMORY__THROUGHPUT = eINSTANCE.getHardwareMemory_Throughput();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessingMemoryImpl <em>Hardware Processing Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareProcessingMemoryImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareProcessingMemory()
		 * @generated
		 */
		EClass HARDWARE_PROCESSING_MEMORY = eINSTANCE.getHardwareProcessingMemory();

		/**
		 * The meta object literal for the '<em><b>Repl Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PROCESSING_MEMORY__REPL_POLICY = eINSTANCE.getHardwareProcessingMemory_ReplPolicy();

		/**
		 * The meta object literal for the '<em><b>Write Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PROCESSING_MEMORY__WRITE_POLICY = eINSTANCE.getHardwareProcessingMemory_WritePolicy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareStorageMemoryImpl <em>Hardware Storage Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareStorageMemoryImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareStorageMemory()
		 * @generated
		 */
		EClass HARDWARE_STORAGE_MEMORY = eINSTANCE.getHardwareStorageMemory();

		/**
		 * The meta object literal for the '<em><b>Buffer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_STORAGE_MEMORY__BUFFER = eINSTANCE.getHardwareStorageMemory_Buffer();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareCacheImpl <em>Hardware Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareCacheImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareCache()
		 * @generated
		 */
		EClass HARDWARE_CACHE = eINSTANCE.getHardwareCache();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_CACHE__LEVEL = eINSTANCE.getHardwareCache_Level();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_CACHE__TYPE = eINSTANCE.getHardwareCache_Type();

		/**
		 * The meta object literal for the '<em><b>Nb Sets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_CACHE__NB_SETS = eINSTANCE.getHardwareCache_NbSets();

		/**
		 * The meta object literal for the '<em><b>Block Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_CACHE__BLOCK_SIZE = eINSTANCE.getHardwareCache_BlockSize();

		/**
		 * The meta object literal for the '<em><b>Associativity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_CACHE__ASSOCIATIVITY = eINSTANCE.getHardwareCache_Associativity();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareRamImpl <em>Hardware Ram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareRamImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareRam()
		 * @generated
		 */
		EClass HARDWARE_RAM = eINSTANCE.getHardwareRam();

		/**
		 * The meta object literal for the '<em><b>Nb Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_RAM__NB_ROWS = eINSTANCE.getHardwareRam_NbRows();

		/**
		 * The meta object literal for the '<em><b>Nb Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_RAM__NB_COLUMNS = eINSTANCE.getHardwareRam_NbColumns();

		/**
		 * The meta object literal for the '<em><b>Nb Banks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_RAM__NB_BANKS = eINSTANCE.getHardwareRam_NbBanks();

		/**
		 * The meta object literal for the '<em><b>Word Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_RAM__WORD_SIZE = eINSTANCE.getHardwareRam_WordSize();

		/**
		 * The meta object literal for the '<em><b>Is Synchronous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_RAM__IS_SYNCHRONOUS = eINSTANCE.getHardwareRam_IsSynchronous();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_RAM__IS_STATIC = eINSTANCE.getHardwareRam_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Is Non Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_RAM__IS_NON_VOLATILE = eINSTANCE.getHardwareRam_IsNonVolatile();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareRomImpl <em>Hardware Rom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareRomImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareRom()
		 * @generated
		 */
		EClass HARDWARE_ROM = eINSTANCE.getHardwareRom();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_ROM__TYPE = eINSTANCE.getHardwareRom_Type();

		/**
		 * The meta object literal for the '<em><b>Nb Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_ROM__NB_ROWS = eINSTANCE.getHardwareRom_NbRows();

		/**
		 * The meta object literal for the '<em><b>Nb Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_ROM__NB_COLUMNS = eINSTANCE.getHardwareRom_NbColumns();

		/**
		 * The meta object literal for the '<em><b>Nb Banks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_ROM__NB_BANKS = eINSTANCE.getHardwareRom_NbBanks();

		/**
		 * The meta object literal for the '<em><b>Word Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_ROM__WORD_SIZE = eINSTANCE.getHardwareRom_WordSize();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareDriveImpl <em>Hardware Drive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareDriveImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareDrive()
		 * @generated
		 */
		EClass HARDWARE_DRIVE = eINSTANCE.getHardwareDrive();

		/**
		 * The meta object literal for the '<em><b>Sector Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_DRIVE__SECTOR_SIZE = eINSTANCE.getHardwareDrive_SectorSize();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareStorageManagerImpl <em>Hardware Storage Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareStorageManagerImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareStorageManager()
		 * @generated
		 */
		EClass HARDWARE_STORAGE_MANAGER = eINSTANCE.getHardwareStorageManager();

		/**
		 * The meta object literal for the '<em><b>Managed Memories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_STORAGE_MANAGER__MANAGED_MEMORIES = eINSTANCE.getHardwareStorageManager_ManagedMemories();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareDmaImpl <em>Hardware Dma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareDmaImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareDma()
		 * @generated
		 */
		EClass HARDWARE_DMA = eINSTANCE.getHardwareDma();

		/**
		 * The meta object literal for the '<em><b>Nb Channels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_DMA__NB_CHANNELS = eINSTANCE.getHardwareDma_NbChannels();

		/**
		 * The meta object literal for the '<em><b>Transfer Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_DMA__TRANSFER_WIDTH = eINSTANCE.getHardwareDma_TransferWidth();

		/**
		 * The meta object literal for the '<em><b>Driven By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_DMA__DRIVEN_BY = eINSTANCE.getHardwareDma_DrivenBy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareMmuImpl <em>Hardware Mmu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareMmuImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareMmu()
		 * @generated
		 */
		EClass HARDWARE_MMU = eINSTANCE.getHardwareMmu();

		/**
		 * The meta object literal for the '<em><b>Virtual Addr Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_MMU__VIRTUAL_ADDR_SPACE = eINSTANCE.getHardwareMmu_VirtualAddrSpace();

		/**
		 * The meta object literal for the '<em><b>Physical Addr Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_MMU__PHYSICAL_ADDR_SPACE = eINSTANCE.getHardwareMmu_PhysicalAddrSpace();

		/**
		 * The meta object literal for the '<em><b>Memory Protection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_MMU__MEMORY_PROTECTION = eINSTANCE.getHardwareMmu_MemoryProtection();

		/**
		 * The meta object literal for the '<em><b>Nb Entries Tlb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_MMU__NB_ENTRIES_TLB = eINSTANCE.getHardwareMmu_NbEntriesTlb();

		/**
		 * The meta object literal for the '<em><b>Owned Tlbs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_MMU__OWNED_TLBS = eINSTANCE.getHardwareMmu_OwnedTlbs();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareArbiterImpl <em>Hardware Arbiter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareArbiterImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareArbiter()
		 * @generated
		 */
		EClass HARDWARE_ARBITER = eINSTANCE.getHardwareArbiter();

		/**
		 * The meta object literal for the '<em><b>Controlled Media</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_ARBITER__CONTROLLED_MEDIA = eINSTANCE.getHardwareArbiter_ControlledMedia();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareCommunicationResourceImpl <em>Hardware Communication Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareCommunicationResourceImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareCommunicationResource()
		 * @generated
		 */
		EClass HARDWARE_COMMUNICATION_RESOURCE = eINSTANCE.getHardwareCommunicationResource();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareMediaImpl <em>Hardware Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareMediaImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareMedia()
		 * @generated
		 */
		EClass HARDWARE_MEDIA = eINSTANCE.getHardwareMedia();

		/**
		 * The meta object literal for the '<em><b>Arbiters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_MEDIA__ARBITERS = eINSTANCE.getHardwareMedia_Arbiters();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareBusImpl <em>Hardware Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareBusImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareBus()
		 * @generated
		 */
		EClass HARDWARE_BUS = eINSTANCE.getHardwareBus();

		/**
		 * The meta object literal for the '<em><b>Address Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_BUS__ADDRESS_WIDTH = eINSTANCE.getHardwareBus_AddressWidth();

		/**
		 * The meta object literal for the '<em><b>Word Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_BUS__WORD_WIDTH = eINSTANCE.getHardwareBus_WordWidth();

		/**
		 * The meta object literal for the '<em><b>Is Synchronous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_BUS__IS_SYNCHRONOUS = eINSTANCE.getHardwareBus_IsSynchronous();

		/**
		 * The meta object literal for the '<em><b>Is Serial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_BUS__IS_SERIAL = eINSTANCE.getHardwareBus_IsSerial();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareBridgeImpl <em>Hardware Bridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareBridgeImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareBridge()
		 * @generated
		 */
		EClass HARDWARE_BRIDGE = eINSTANCE.getHardwareBridge();

		/**
		 * The meta object literal for the '<em><b>Sides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_BRIDGE__SIDES = eINSTANCE.getHardwareBridge_Sides();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareTimingResourceImpl <em>Hardware Timing Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareTimingResourceImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareTimingResource()
		 * @generated
		 */
		EClass HARDWARE_TIMING_RESOURCE = eINSTANCE.getHardwareTimingResource();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareClockImpl <em>Hardware Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareClockImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareClock()
		 * @generated
		 */
		EClass HARDWARE_CLOCK = eINSTANCE.getHardwareClock();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_CLOCK__FREQUENCY = eINSTANCE.getHardwareClock_Frequency();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareTimerImpl <em>Hardware Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareTimerImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareTimer()
		 * @generated
		 */
		EClass HARDWARE_TIMER = eINSTANCE.getHardwareTimer();

		/**
		 * The meta object literal for the '<em><b>Input Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_TIMER__INPUT_CLOCK = eINSTANCE.getHardwareTimer_InputClock();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareWatchdogImpl <em>Hardware Watchdog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareWatchdogImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareWatchdog()
		 * @generated
		 */
		EClass HARDWARE_WATCHDOG = eINSTANCE.getHardwareWatchdog();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareDeviceImpl <em>Hardware Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareDeviceImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareDevice()
		 * @generated
		 */
		EClass HARDWARE_DEVICE = eINSTANCE.getHardwareDevice();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareIoImpl <em>Hardware Io</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareIoImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareIo()
		 * @generated
		 */
		EClass HARDWARE_IO = eINSTANCE.getHardwareIo();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareSupportImpl <em>Hardware Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareSupportImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareSupport()
		 * @generated
		 */
		EClass HARDWARE_SUPPORT = eINSTANCE.getHardwareSupport();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareActuatorImpl <em>Hardware Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareActuatorImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareActuator()
		 * @generated
		 */
		EClass HARDWARE_ACTUATOR = eINSTANCE.getHardwareActuator();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareSensorImpl <em>Hardware Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareSensorImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareSensor()
		 * @generated
		 */
		EClass HARDWARE_SENSOR = eINSTANCE.getHardwareSensor();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePlatformImpl <em>Hardware Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwarePlatformImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwarePlatform()
		 * @generated
		 */
		EClass HARDWARE_PLATFORM = eINSTANCE.getHardwarePlatform();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComponentImpl <em>Hardware Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareComponentImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareComponent()
		 * @generated
		 */
		EClass HARDWARE_COMPONENT = eINSTANCE.getHardwareComponent();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_COMPONENT__DIMENSION = eINSTANCE.getHardwareComponent_Dimension();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_COMPONENT__AREA = eINSTANCE.getHardwareComponent_Area();

		/**
		 * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_COMPONENT__POS_X = eINSTANCE.getHardwareComponent_PosX();

		/**
		 * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_COMPONENT__POS_Y = eINSTANCE.getHardwareComponent_PosY();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_COMPONENT__GRID = eINSTANCE.getHardwareComponent_Grid();

		/**
		 * The meta object literal for the '<em><b>Nb Pins</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_COMPONENT__NB_PINS = eINSTANCE.getHardwareComponent_NbPins();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_COMPONENT__WEIGHT = eINSTANCE.getHardwareComponent_Weight();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_COMPONENT__PRICE = eINSTANCE.getHardwareComponent_Price();

		/**
		 * The meta object literal for the '<em><b>RConditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_COMPONENT__RCONDITIONS = eINSTANCE.getHardwareComponent_RConditions();

		/**
		 * The meta object literal for the '<em><b>Owned Pin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_COMPONENT__OWNED_PIN = eINSTANCE.getHardwareComponent_OwnedPin();

		/**
		 * The meta object literal for the '<em><b>Owned Wire</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_COMPONENT__OWNED_WIRE = eINSTANCE.getHardwareComponent_OwnedWire();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.EnvConditionImpl <em>Env Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.EnvConditionImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getEnvCondition()
		 * @generated
		 */
		EClass ENV_CONDITION = eINSTANCE.getEnvCondition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_CONDITION__TYPE = eINSTANCE.getEnvCondition_Type();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_CONDITION__STATUS = eINSTANCE.getEnvCondition_Status();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_CONDITION__DESCRIPTION = eINSTANCE.getEnvCondition_Description();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_CONDITION__RANGE = eINSTANCE.getEnvCondition_Range();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareChipImpl <em>Hardware Chip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareChipImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareChip()
		 * @generated
		 */
		EClass HARDWARE_CHIP = eINSTANCE.getHardwareChip();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_CHIP__TECHNOLOGY = eINSTANCE.getHardwareChip_Technology();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareChannelImpl <em>Hardware Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareChannelImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareChannel()
		 * @generated
		 */
		EClass HARDWARE_CHANNEL = eINSTANCE.getHardwareChannel();

		/**
		 * The meta object literal for the '<em><b>Nb Wires</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_CHANNEL__NB_WIRES = eINSTANCE.getHardwareChannel_NbWires();

		/**
		 * The meta object literal for the '<em><b>Realized By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_CHANNEL__REALIZED_BY = eINSTANCE.getHardwareChannel_RealizedBy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareCardImpl <em>Hardware Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareCardImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareCard()
		 * @generated
		 */
		EClass HARDWARE_CARD = eINSTANCE.getHardwareCard();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.FirmwareArchitectureImpl <em>Firmware Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.FirmwareArchitectureImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getFirmwareArchitecture()
		 * @generated
		 */
		EClass FIRMWARE_ARCHITECTURE = eINSTANCE.getFirmwareArchitecture();

		/**
		 * The meta object literal for the '<em><b>Owned Wire</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIRMWARE_ARCHITECTURE__OWNED_WIRE = eINSTANCE.getFirmwareArchitecture_OwnedWire();

		/**
		 * The meta object literal for the '<em><b>Owned Pin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIRMWARE_ARCHITECTURE__OWNED_PIN = eINSTANCE.getFirmwareArchitecture_OwnedPin();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareIpBlockImpl <em>Hardware Ip Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareIpBlockImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareIpBlock()
		 * @generated
		 */
		EClass HARDWARE_IP_BLOCK = eINSTANCE.getHardwareIpBlock();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePinImpl <em>Hardware Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwarePinImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwarePin()
		 * @generated
		 */
		EClass HARDWARE_PIN = eINSTANCE.getHardwarePin();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PIN__WIDTH = eINSTANCE.getHardwarePin_Width();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PIN__DIRECTION = eINSTANCE.getHardwarePin_Direction();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareWireImpl <em>Hardware Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareWireImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareWire()
		 * @generated
		 */
		EClass HARDWARE_WIRE = eINSTANCE.getHardwareWire();

		/**
		 * The meta object literal for the '<em><b>Source Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_WIRE__SOURCE_PIN = eINSTANCE.getHardwareWire_SourcePin();

		/**
		 * The meta object literal for the '<em><b>Target Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_WIRE__TARGET_PIN = eINSTANCE.getHardwareWire_TargetPin();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareInterfaceImpl <em>Hardware Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareInterfaceImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareInterface()
		 * @generated
		 */
		EClass HARDWARE_INTERFACE = eINSTANCE.getHardwareInterface();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.impl.HardwareInterfacePackageImpl <em>Hardware Interface Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.impl.HardwareInterfacePackageImpl
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getHardwareInterfacePackage()
		 * @generated
		 */
		EClass HARDWARE_INTERFACE_PACKAGE = eINSTANCE.getHardwareInterfacePackage();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.IsaType <em>Isa Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.IsaType
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getIsaType()
		 * @generated
		 */
		EEnum ISA_TYPE = eINSTANCE.getIsaType();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.PldTechnology <em>Pld Technology</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.PldTechnology
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getPldTechnology()
		 * @generated
		 */
		EEnum PLD_TECHNOLOGY = eINSTANCE.getPldTechnology();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.PldClass <em>Pld Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.PldClass
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getPldClass()
		 * @generated
		 */
		EEnum PLD_CLASS = eINSTANCE.getPldClass();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.ReplPolicy <em>Repl Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.ReplPolicy
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getReplPolicy()
		 * @generated
		 */
		EEnum REPL_POLICY = eINSTANCE.getReplPolicy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.WritePolicy <em>Write Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.WritePolicy
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getWritePolicy()
		 * @generated
		 */
		EEnum WRITE_POLICY = eINSTANCE.getWritePolicy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.CacheType <em>Cache Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.CacheType
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getCacheType()
		 * @generated
		 */
		EEnum CACHE_TYPE = eINSTANCE.getCacheType();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.RomType <em>Rom Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.RomType
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getRomType()
		 * @generated
		 */
		EEnum ROM_TYPE = eINSTANCE.getRomType();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.ConditionType <em>Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.ConditionType
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getConditionType()
		 * @generated
		 */
		EEnum CONDITION_TYPE = eINSTANCE.getConditionType();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.PortType <em>Port Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.PortType
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getPortType()
		 * @generated
		 */
		EEnum PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.ComponentState <em>Component State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.ComponentState
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getComponentState()
		 * @generated
		 */
		EEnum COMPONENT_STATE = eINSTANCE.getComponentState();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.hrm.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.hrm.Direction
		 * @see org.polarsys.time4sys.marte.hrm.impl.HrmPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

	}

} //HrmPackage
