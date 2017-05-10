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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage
 * @generated
 */
public interface HrmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HrmFactory eINSTANCE = org.polarsys.time4sys.marte.hrm.impl.HrmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hardware Resource Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Resource Package</em>'.
	 * @generated
	 */
	HardwareResourcePackage createHardwareResourcePackage();

	/**
	 * Returns a new object of class '<em>Hardware Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Port</em>'.
	 * @generated
	 */
	HardwarePort createHardwarePort();

	/**
	 * Returns a new object of class '<em>Hardware Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Connector</em>'.
	 * @generated
	 */
	HardwareConnector createHardwareConnector();

	/**
	 * Returns a new object of class '<em>Hardware Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Service</em>'.
	 * @generated
	 */
	HardwareService createHardwareService();

	/**
	 * Returns a new object of class '<em>Hardware Computing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Computing Resource</em>'.
	 * @generated
	 */
	HardwareComputingResource createHardwareComputingResource();

	/**
	 * Returns a new object of class '<em>Hardware Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Processor</em>'.
	 * @generated
	 */
	HardwareProcessor createHardwareProcessor();

	/**
	 * Returns a new object of class '<em>Hardware Asic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Asic</em>'.
	 * @generated
	 */
	HardwareAsic createHardwareAsic();

	/**
	 * Returns a new object of class '<em>Hardware Pld</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Pld</em>'.
	 * @generated
	 */
	HardwarePld createHardwarePld();

	/**
	 * Returns a new object of class '<em>Hardware Branch Predictor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Branch Predictor</em>'.
	 * @generated
	 */
	HardwareBranchPredictor createHardwareBranchPredictor();

	/**
	 * Returns a new object of class '<em>Hardware Isa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Isa</em>'.
	 * @generated
	 */
	HardwareIsa createHardwareIsa();

	/**
	 * Returns a new object of class '<em>Hardware Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Memory</em>'.
	 * @generated
	 */
	HardwareMemory createHardwareMemory();

	/**
	 * Returns a new object of class '<em>Hardware Cache</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Cache</em>'.
	 * @generated
	 */
	HardwareCache createHardwareCache();

	/**
	 * Returns a new object of class '<em>Hardware Ram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Ram</em>'.
	 * @generated
	 */
	HardwareRam createHardwareRam();

	/**
	 * Returns a new object of class '<em>Hardware Rom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Rom</em>'.
	 * @generated
	 */
	HardwareRom createHardwareRom();

	/**
	 * Returns a new object of class '<em>Hardware Drive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Drive</em>'.
	 * @generated
	 */
	HardwareDrive createHardwareDrive();

	/**
	 * Returns a new object of class '<em>Hardware Storage Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Storage Manager</em>'.
	 * @generated
	 */
	HardwareStorageManager createHardwareStorageManager();

	/**
	 * Returns a new object of class '<em>Hardware Dma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Dma</em>'.
	 * @generated
	 */
	HardwareDma createHardwareDma();

	/**
	 * Returns a new object of class '<em>Hardware Mmu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Mmu</em>'.
	 * @generated
	 */
	HardwareMmu createHardwareMmu();

	/**
	 * Returns a new object of class '<em>Hardware Arbiter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Arbiter</em>'.
	 * @generated
	 */
	HardwareArbiter createHardwareArbiter();

	/**
	 * Returns a new object of class '<em>Hardware Communication Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Communication Resource</em>'.
	 * @generated
	 */
	HardwareCommunicationResource createHardwareCommunicationResource();

	/**
	 * Returns a new object of class '<em>Hardware Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Media</em>'.
	 * @generated
	 */
	HardwareMedia createHardwareMedia();

	/**
	 * Returns a new object of class '<em>Hardware Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Bus</em>'.
	 * @generated
	 */
	HardwareBus createHardwareBus();

	/**
	 * Returns a new object of class '<em>Hardware Bridge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Bridge</em>'.
	 * @generated
	 */
	HardwareBridge createHardwareBridge();

	/**
	 * Returns a new object of class '<em>Hardware Timing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Timing Resource</em>'.
	 * @generated
	 */
	HardwareTimingResource createHardwareTimingResource();

	/**
	 * Returns a new object of class '<em>Hardware Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Clock</em>'.
	 * @generated
	 */
	HardwareClock createHardwareClock();

	/**
	 * Returns a new object of class '<em>Hardware Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Timer</em>'.
	 * @generated
	 */
	HardwareTimer createHardwareTimer();

	/**
	 * Returns a new object of class '<em>Hardware Watchdog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Watchdog</em>'.
	 * @generated
	 */
	HardwareWatchdog createHardwareWatchdog();

	/**
	 * Returns a new object of class '<em>Hardware Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Device</em>'.
	 * @generated
	 */
	HardwareDevice createHardwareDevice();

	/**
	 * Returns a new object of class '<em>Hardware Io</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Io</em>'.
	 * @generated
	 */
	HardwareIo createHardwareIo();

	/**
	 * Returns a new object of class '<em>Hardware Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Support</em>'.
	 * @generated
	 */
	HardwareSupport createHardwareSupport();

	/**
	 * Returns a new object of class '<em>Hardware Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Actuator</em>'.
	 * @generated
	 */
	HardwareActuator createHardwareActuator();

	/**
	 * Returns a new object of class '<em>Hardware Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Sensor</em>'.
	 * @generated
	 */
	HardwareSensor createHardwareSensor();

	/**
	 * Returns a new object of class '<em>Hardware Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Platform</em>'.
	 * @generated
	 */
	HardwarePlatform createHardwarePlatform();

	/**
	 * Returns a new object of class '<em>Env Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Env Condition</em>'.
	 * @generated
	 */
	EnvCondition createEnvCondition();

	/**
	 * Returns a new object of class '<em>Firmware Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firmware Architecture</em>'.
	 * @generated
	 */
	FirmwareArchitecture createFirmwareArchitecture();

	/**
	 * Returns a new object of class '<em>Hardware Ip Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Ip Block</em>'.
	 * @generated
	 */
	HardwareIpBlock createHardwareIpBlock();

	/**
	 * Returns a new object of class '<em>Hardware Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Pin</em>'.
	 * @generated
	 */
	HardwarePin createHardwarePin();

	/**
	 * Returns a new object of class '<em>Hardware Wire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Wire</em>'.
	 * @generated
	 */
	HardwareWire createHardwareWire();

	/**
	 * Returns a new object of class '<em>Hardware Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Interface</em>'.
	 * @generated
	 */
	HardwareInterface createHardwareInterface();

	/**
	 * Returns a new object of class '<em>Hardware Interface Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Interface Package</em>'.
	 * @generated
	 */
	HardwareInterfacePackage createHardwareInterfacePackage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HrmPackage getHrmPackage();

} //HrmFactory
