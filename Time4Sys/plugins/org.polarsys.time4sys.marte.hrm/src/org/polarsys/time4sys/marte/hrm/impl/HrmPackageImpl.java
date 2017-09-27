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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.time4sys.marte.grm.GrmPackage;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HrmPackageImpl extends EPackageImpl implements HrmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareResourcePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwarePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareComputingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareAsicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwarePldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareBranchPredictorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareIsaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareProcessingMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareStorageMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareRamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareRomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareDriveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareStorageManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareDmaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareMmuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareArbiterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareCommunicationResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareMediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareBusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareBridgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareTimingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareClockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareWatchdogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareIoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareActuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwarePlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareChipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmwareArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareIpBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwarePinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareWireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareInterfacePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum isaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pldTechnologyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pldClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum replPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum writePolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cacheTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum romTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HrmPackageImpl() {
		super(eNS_URI, HrmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HrmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HrmPackage init() {
		if (isInited) return (HrmPackage)EPackage.Registry.INSTANCE.getEPackage(HrmPackage.eNS_URI);

		// Obtain or create and register package
		HrmPackageImpl theHrmPackage = (HrmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HrmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HrmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GrmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHrmPackage.createPackageContents();

		// Initialize created meta-data
		theHrmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHrmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HrmPackage.eNS_URI, theHrmPackage);
		return theHrmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareResourcePackage() {
		return hardwareResourcePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareResource() {
		return hardwareResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareResource_Clock() {
		return (EReference)hardwareResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwarePort() {
		return hardwarePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePort_Type() {
		return (EAttribute)hardwarePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwarePort_RealizedBy() {
		return (EReference)hardwarePortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareConnector() {
		return hardwareConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareService() {
		return hardwareServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareComputingResource() {
		return hardwareComputingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareComputingResource_OpFrequencies() {
		return (EAttribute)hardwareComputingResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareProcessor() {
		return hardwareProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareProcessor_Architecture() {
		return (EAttribute)hardwareProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareProcessor_Mips() {
		return (EAttribute)hardwareProcessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareProcessor_Ipc() {
		return (EAttribute)hardwareProcessorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareProcessor_NbCores() {
		return (EAttribute)hardwareProcessorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareProcessor_NbPipelines() {
		return (EAttribute)hardwareProcessorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareProcessor_NbStages() {
		return (EAttribute)hardwareProcessorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareProcessor_NbAlus() {
		return (EAttribute)hardwareProcessorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareProcessor_NbFpus() {
		return (EAttribute)hardwareProcessorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareProcessor_OwnedIsas() {
		return (EReference)hardwareProcessorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareProcessor_Predictors() {
		return (EReference)hardwareProcessorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareProcessor_Caches() {
		return (EReference)hardwareProcessorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareProcessor_OwnedMmus() {
		return (EReference)hardwareProcessorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareAsic() {
		return hardwareAsicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwarePld() {
		return hardwarePldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePld_PldTechnology() {
		return (EAttribute)hardwarePldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePld_NbRows() {
		return (EAttribute)hardwarePldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePld_NbColumns() {
		return (EAttribute)hardwarePldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePld_Kind() {
		return (EAttribute)hardwarePldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePld_NbLuts() {
		return (EAttribute)hardwarePldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePld_NbLutInputs() {
		return (EAttribute)hardwarePldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePld_NbFlipFlops() {
		return (EAttribute)hardwarePldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwarePld_BlocksRam() {
		return (EReference)hardwarePldEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwarePld_Architecture() {
		return (EReference)hardwarePldEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwarePld_IpBlock() {
		return (EReference)hardwarePldEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareBranchPredictor() {
		return hardwareBranchPredictorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareIsa() {
		return hardwareIsaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareIsa_Family() {
		return (EAttribute)hardwareIsaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareIsa_InstWidth() {
		return (EAttribute)hardwareIsaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareIsa_Type() {
		return (EAttribute)hardwareIsaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareMemory() {
		return hardwareMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareMemory_MemorySize() {
		return (EAttribute)hardwareMemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareMemory_AddressSize() {
		return (EAttribute)hardwareMemoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareMemory_Timings() {
		return (EAttribute)hardwareMemoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareMemory_Throughput() {
		return (EAttribute)hardwareMemoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareProcessingMemory() {
		return hardwareProcessingMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareProcessingMemory_ReplPolicy() {
		return (EAttribute)hardwareProcessingMemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareProcessingMemory_WritePolicy() {
		return (EAttribute)hardwareProcessingMemoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareStorageMemory() {
		return hardwareStorageMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareStorageMemory_Buffer() {
		return (EReference)hardwareStorageMemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareCache() {
		return hardwareCacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareCache_Level() {
		return (EAttribute)hardwareCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareCache_Type() {
		return (EAttribute)hardwareCacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareCache_NbSets() {
		return (EAttribute)hardwareCacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareCache_BlockSize() {
		return (EAttribute)hardwareCacheEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareCache_Associativity() {
		return (EAttribute)hardwareCacheEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareRam() {
		return hardwareRamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareRam_NbRows() {
		return (EAttribute)hardwareRamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareRam_NbColumns() {
		return (EAttribute)hardwareRamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareRam_NbBanks() {
		return (EAttribute)hardwareRamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareRam_WordSize() {
		return (EAttribute)hardwareRamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareRam_IsSynchronous() {
		return (EAttribute)hardwareRamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareRam_IsStatic() {
		return (EAttribute)hardwareRamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareRam_IsNonVolatile() {
		return (EAttribute)hardwareRamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareRom() {
		return hardwareRomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareRom_Type() {
		return (EAttribute)hardwareRomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareRom_NbRows() {
		return (EAttribute)hardwareRomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareRom_NbColumns() {
		return (EAttribute)hardwareRomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareRom_NbBanks() {
		return (EAttribute)hardwareRomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareRom_WordSize() {
		return (EAttribute)hardwareRomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareDrive() {
		return hardwareDriveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareDrive_SectorSize() {
		return (EAttribute)hardwareDriveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareStorageManager() {
		return hardwareStorageManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareStorageManager_ManagedMemories() {
		return (EReference)hardwareStorageManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareDma() {
		return hardwareDmaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareDma_NbChannels() {
		return (EAttribute)hardwareDmaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareDma_TransferWidth() {
		return (EAttribute)hardwareDmaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareDma_DrivenBy() {
		return (EReference)hardwareDmaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareMmu() {
		return hardwareMmuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareMmu_VirtualAddrSpace() {
		return (EAttribute)hardwareMmuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareMmu_PhysicalAddrSpace() {
		return (EAttribute)hardwareMmuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareMmu_MemoryProtection() {
		return (EAttribute)hardwareMmuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareMmu_NbEntriesTlb() {
		return (EAttribute)hardwareMmuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareMmu_OwnedTlbs() {
		return (EReference)hardwareMmuEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareArbiter() {
		return hardwareArbiterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareArbiter_ControlledMedia() {
		return (EReference)hardwareArbiterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareCommunicationResource() {
		return hardwareCommunicationResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareMedia() {
		return hardwareMediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareMedia_Arbiters() {
		return (EReference)hardwareMediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareBus() {
		return hardwareBusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareBus_AddressWidth() {
		return (EAttribute)hardwareBusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareBus_WordWidth() {
		return (EAttribute)hardwareBusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareBus_IsSynchronous() {
		return (EAttribute)hardwareBusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareBus_IsSerial() {
		return (EAttribute)hardwareBusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareBridge() {
		return hardwareBridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareBridge_Sides() {
		return (EReference)hardwareBridgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareTimingResource() {
		return hardwareTimingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareClock() {
		return hardwareClockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareClock_Frequency() {
		return (EAttribute)hardwareClockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareTimer() {
		return hardwareTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareTimer_InputClock() {
		return (EReference)hardwareTimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareWatchdog() {
		return hardwareWatchdogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareDevice() {
		return hardwareDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareIo() {
		return hardwareIoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareSupport() {
		return hardwareSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareActuator() {
		return hardwareActuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareSensor() {
		return hardwareSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwarePlatform() {
		return hardwarePlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareComponent() {
		return hardwareComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareComponent_Dimension() {
		return (EAttribute)hardwareComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareComponent_Area() {
		return (EAttribute)hardwareComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareComponent_PosX() {
		return (EAttribute)hardwareComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareComponent_PosY() {
		return (EAttribute)hardwareComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareComponent_Grid() {
		return (EAttribute)hardwareComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareComponent_NbPins() {
		return (EAttribute)hardwareComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareComponent_Weight() {
		return (EAttribute)hardwareComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareComponent_Price() {
		return (EAttribute)hardwareComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareComponent_RConditions() {
		return (EReference)hardwareComponentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareComponent_OwnedPin() {
		return (EReference)hardwareComponentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareComponent_OwnedWire() {
		return (EReference)hardwareComponentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvCondition() {
		return envConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvCondition_Type() {
		return (EAttribute)envConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvCondition_Status() {
		return (EAttribute)envConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvCondition_Description() {
		return (EAttribute)envConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvCondition_Range() {
		return (EAttribute)envConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareChip() {
		return hardwareChipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareChip_Technology() {
		return (EAttribute)hardwareChipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareChannel() {
		return hardwareChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareChannel_NbWires() {
		return (EAttribute)hardwareChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareChannel_RealizedBy() {
		return (EReference)hardwareChannelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareCard() {
		return hardwareCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirmwareArchitecture() {
		return firmwareArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFirmwareArchitecture_OwnedWire() {
		return (EReference)firmwareArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFirmwareArchitecture_OwnedPin() {
		return (EReference)firmwareArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareIpBlock() {
		return hardwareIpBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwarePin() {
		return hardwarePinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePin_Width() {
		return (EAttribute)hardwarePinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePin_Direction() {
		return (EAttribute)hardwarePinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareWire() {
		return hardwareWireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareWire_SourcePin() {
		return (EReference)hardwareWireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareWire_TargetPin() {
		return (EReference)hardwareWireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareInterface() {
		return hardwareInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareInterfacePackage() {
		return hardwareInterfacePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIsaType() {
		return isaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPldTechnology() {
		return pldTechnologyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPldClass() {
		return pldClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReplPolicy() {
		return replPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWritePolicy() {
		return writePolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCacheType() {
		return cacheTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRomType() {
		return romTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionType() {
		return conditionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortType() {
		return portTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentState() {
		return componentStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HrmFactory getHrmFactory() {
		return (HrmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		envConditionEClass = createEClass(ENV_CONDITION);
		createEAttribute(envConditionEClass, ENV_CONDITION__TYPE);
		createEAttribute(envConditionEClass, ENV_CONDITION__STATUS);
		createEAttribute(envConditionEClass, ENV_CONDITION__DESCRIPTION);
		createEAttribute(envConditionEClass, ENV_CONDITION__RANGE);

		firmwareArchitectureEClass = createEClass(FIRMWARE_ARCHITECTURE);
		createEReference(firmwareArchitectureEClass, FIRMWARE_ARCHITECTURE__OWNED_WIRE);
		createEReference(firmwareArchitectureEClass, FIRMWARE_ARCHITECTURE__OWNED_PIN);

		hardwareActuatorEClass = createEClass(HARDWARE_ACTUATOR);

		hardwareArbiterEClass = createEClass(HARDWARE_ARBITER);
		createEReference(hardwareArbiterEClass, HARDWARE_ARBITER__CONTROLLED_MEDIA);

		hardwareAsicEClass = createEClass(HARDWARE_ASIC);

		hardwareBranchPredictorEClass = createEClass(HARDWARE_BRANCH_PREDICTOR);

		hardwareBridgeEClass = createEClass(HARDWARE_BRIDGE);
		createEReference(hardwareBridgeEClass, HARDWARE_BRIDGE__SIDES);

		hardwareBusEClass = createEClass(HARDWARE_BUS);
		createEAttribute(hardwareBusEClass, HARDWARE_BUS__ADDRESS_WIDTH);
		createEAttribute(hardwareBusEClass, HARDWARE_BUS__WORD_WIDTH);
		createEAttribute(hardwareBusEClass, HARDWARE_BUS__IS_SYNCHRONOUS);
		createEAttribute(hardwareBusEClass, HARDWARE_BUS__IS_SERIAL);

		hardwareCacheEClass = createEClass(HARDWARE_CACHE);
		createEAttribute(hardwareCacheEClass, HARDWARE_CACHE__LEVEL);
		createEAttribute(hardwareCacheEClass, HARDWARE_CACHE__TYPE);
		createEAttribute(hardwareCacheEClass, HARDWARE_CACHE__NB_SETS);
		createEAttribute(hardwareCacheEClass, HARDWARE_CACHE__BLOCK_SIZE);
		createEAttribute(hardwareCacheEClass, HARDWARE_CACHE__ASSOCIATIVITY);

		hardwareCardEClass = createEClass(HARDWARE_CARD);

		hardwareChannelEClass = createEClass(HARDWARE_CHANNEL);
		createEAttribute(hardwareChannelEClass, HARDWARE_CHANNEL__NB_WIRES);
		createEReference(hardwareChannelEClass, HARDWARE_CHANNEL__REALIZED_BY);

		hardwareChipEClass = createEClass(HARDWARE_CHIP);
		createEAttribute(hardwareChipEClass, HARDWARE_CHIP__TECHNOLOGY);

		hardwareClockEClass = createEClass(HARDWARE_CLOCK);
		createEAttribute(hardwareClockEClass, HARDWARE_CLOCK__FREQUENCY);

		hardwareCommunicationResourceEClass = createEClass(HARDWARE_COMMUNICATION_RESOURCE);

		hardwareComponentEClass = createEClass(HARDWARE_COMPONENT);
		createEAttribute(hardwareComponentEClass, HARDWARE_COMPONENT__DIMENSION);
		createEAttribute(hardwareComponentEClass, HARDWARE_COMPONENT__AREA);
		createEAttribute(hardwareComponentEClass, HARDWARE_COMPONENT__POS_X);
		createEAttribute(hardwareComponentEClass, HARDWARE_COMPONENT__POS_Y);
		createEAttribute(hardwareComponentEClass, HARDWARE_COMPONENT__GRID);
		createEAttribute(hardwareComponentEClass, HARDWARE_COMPONENT__NB_PINS);
		createEAttribute(hardwareComponentEClass, HARDWARE_COMPONENT__WEIGHT);
		createEAttribute(hardwareComponentEClass, HARDWARE_COMPONENT__PRICE);
		createEReference(hardwareComponentEClass, HARDWARE_COMPONENT__RCONDITIONS);
		createEReference(hardwareComponentEClass, HARDWARE_COMPONENT__OWNED_PIN);
		createEReference(hardwareComponentEClass, HARDWARE_COMPONENT__OWNED_WIRE);

		hardwareComputingResourceEClass = createEClass(HARDWARE_COMPUTING_RESOURCE);
		createEAttribute(hardwareComputingResourceEClass, HARDWARE_COMPUTING_RESOURCE__OP_FREQUENCIES);

		hardwareConnectorEClass = createEClass(HARDWARE_CONNECTOR);

		hardwareDeviceEClass = createEClass(HARDWARE_DEVICE);

		hardwareDmaEClass = createEClass(HARDWARE_DMA);
		createEAttribute(hardwareDmaEClass, HARDWARE_DMA__NB_CHANNELS);
		createEAttribute(hardwareDmaEClass, HARDWARE_DMA__TRANSFER_WIDTH);
		createEReference(hardwareDmaEClass, HARDWARE_DMA__DRIVEN_BY);

		hardwareDriveEClass = createEClass(HARDWARE_DRIVE);
		createEAttribute(hardwareDriveEClass, HARDWARE_DRIVE__SECTOR_SIZE);

		hardwareInterfaceEClass = createEClass(HARDWARE_INTERFACE);

		hardwareInterfacePackageEClass = createEClass(HARDWARE_INTERFACE_PACKAGE);

		hardwareIoEClass = createEClass(HARDWARE_IO);

		hardwareIpBlockEClass = createEClass(HARDWARE_IP_BLOCK);

		hardwareIsaEClass = createEClass(HARDWARE_ISA);
		createEAttribute(hardwareIsaEClass, HARDWARE_ISA__FAMILY);
		createEAttribute(hardwareIsaEClass, HARDWARE_ISA__INST_WIDTH);
		createEAttribute(hardwareIsaEClass, HARDWARE_ISA__TYPE);

		hardwareMediaEClass = createEClass(HARDWARE_MEDIA);
		createEReference(hardwareMediaEClass, HARDWARE_MEDIA__ARBITERS);

		hardwareMemoryEClass = createEClass(HARDWARE_MEMORY);
		createEAttribute(hardwareMemoryEClass, HARDWARE_MEMORY__MEMORY_SIZE);
		createEAttribute(hardwareMemoryEClass, HARDWARE_MEMORY__ADDRESS_SIZE);
		createEAttribute(hardwareMemoryEClass, HARDWARE_MEMORY__TIMINGS);
		createEAttribute(hardwareMemoryEClass, HARDWARE_MEMORY__THROUGHPUT);

		hardwareMmuEClass = createEClass(HARDWARE_MMU);
		createEAttribute(hardwareMmuEClass, HARDWARE_MMU__VIRTUAL_ADDR_SPACE);
		createEAttribute(hardwareMmuEClass, HARDWARE_MMU__PHYSICAL_ADDR_SPACE);
		createEAttribute(hardwareMmuEClass, HARDWARE_MMU__MEMORY_PROTECTION);
		createEAttribute(hardwareMmuEClass, HARDWARE_MMU__NB_ENTRIES_TLB);
		createEReference(hardwareMmuEClass, HARDWARE_MMU__OWNED_TLBS);

		hardwarePinEClass = createEClass(HARDWARE_PIN);
		createEAttribute(hardwarePinEClass, HARDWARE_PIN__WIDTH);
		createEAttribute(hardwarePinEClass, HARDWARE_PIN__DIRECTION);

		hardwarePlatformEClass = createEClass(HARDWARE_PLATFORM);

		hardwarePldEClass = createEClass(HARDWARE_PLD);
		createEAttribute(hardwarePldEClass, HARDWARE_PLD__PLD_TECHNOLOGY);
		createEAttribute(hardwarePldEClass, HARDWARE_PLD__NB_ROWS);
		createEAttribute(hardwarePldEClass, HARDWARE_PLD__NB_COLUMNS);
		createEAttribute(hardwarePldEClass, HARDWARE_PLD__KIND);
		createEAttribute(hardwarePldEClass, HARDWARE_PLD__NB_LUTS);
		createEAttribute(hardwarePldEClass, HARDWARE_PLD__NB_LUT_INPUTS);
		createEAttribute(hardwarePldEClass, HARDWARE_PLD__NB_FLIP_FLOPS);
		createEReference(hardwarePldEClass, HARDWARE_PLD__BLOCKS_RAM);
		createEReference(hardwarePldEClass, HARDWARE_PLD__ARCHITECTURE);
		createEReference(hardwarePldEClass, HARDWARE_PLD__IP_BLOCK);

		hardwarePortEClass = createEClass(HARDWARE_PORT);
		createEAttribute(hardwarePortEClass, HARDWARE_PORT__TYPE);
		createEReference(hardwarePortEClass, HARDWARE_PORT__REALIZED_BY);

		hardwareProcessingMemoryEClass = createEClass(HARDWARE_PROCESSING_MEMORY);
		createEAttribute(hardwareProcessingMemoryEClass, HARDWARE_PROCESSING_MEMORY__REPL_POLICY);
		createEAttribute(hardwareProcessingMemoryEClass, HARDWARE_PROCESSING_MEMORY__WRITE_POLICY);

		hardwareProcessorEClass = createEClass(HARDWARE_PROCESSOR);
		createEAttribute(hardwareProcessorEClass, HARDWARE_PROCESSOR__ARCHITECTURE);
		createEAttribute(hardwareProcessorEClass, HARDWARE_PROCESSOR__MIPS);
		createEAttribute(hardwareProcessorEClass, HARDWARE_PROCESSOR__IPC);
		createEAttribute(hardwareProcessorEClass, HARDWARE_PROCESSOR__NB_CORES);
		createEAttribute(hardwareProcessorEClass, HARDWARE_PROCESSOR__NB_PIPELINES);
		createEAttribute(hardwareProcessorEClass, HARDWARE_PROCESSOR__NB_STAGES);
		createEAttribute(hardwareProcessorEClass, HARDWARE_PROCESSOR__NB_ALUS);
		createEAttribute(hardwareProcessorEClass, HARDWARE_PROCESSOR__NB_FPUS);
		createEReference(hardwareProcessorEClass, HARDWARE_PROCESSOR__OWNED_ISAS);
		createEReference(hardwareProcessorEClass, HARDWARE_PROCESSOR__PREDICTORS);
		createEReference(hardwareProcessorEClass, HARDWARE_PROCESSOR__CACHES);
		createEReference(hardwareProcessorEClass, HARDWARE_PROCESSOR__OWNED_MMUS);

		hardwareRamEClass = createEClass(HARDWARE_RAM);
		createEAttribute(hardwareRamEClass, HARDWARE_RAM__NB_ROWS);
		createEAttribute(hardwareRamEClass, HARDWARE_RAM__NB_COLUMNS);
		createEAttribute(hardwareRamEClass, HARDWARE_RAM__NB_BANKS);
		createEAttribute(hardwareRamEClass, HARDWARE_RAM__WORD_SIZE);
		createEAttribute(hardwareRamEClass, HARDWARE_RAM__IS_SYNCHRONOUS);
		createEAttribute(hardwareRamEClass, HARDWARE_RAM__IS_STATIC);
		createEAttribute(hardwareRamEClass, HARDWARE_RAM__IS_NON_VOLATILE);

		hardwareResourcePackageEClass = createEClass(HARDWARE_RESOURCE_PACKAGE);

		hardwareResourceEClass = createEClass(HARDWARE_RESOURCE);
		createEReference(hardwareResourceEClass, HARDWARE_RESOURCE__CLOCK);

		hardwareRomEClass = createEClass(HARDWARE_ROM);
		createEAttribute(hardwareRomEClass, HARDWARE_ROM__TYPE);
		createEAttribute(hardwareRomEClass, HARDWARE_ROM__NB_ROWS);
		createEAttribute(hardwareRomEClass, HARDWARE_ROM__NB_COLUMNS);
		createEAttribute(hardwareRomEClass, HARDWARE_ROM__NB_BANKS);
		createEAttribute(hardwareRomEClass, HARDWARE_ROM__WORD_SIZE);

		hardwareSensorEClass = createEClass(HARDWARE_SENSOR);

		hardwareServiceEClass = createEClass(HARDWARE_SERVICE);

		hardwareStorageManagerEClass = createEClass(HARDWARE_STORAGE_MANAGER);
		createEReference(hardwareStorageManagerEClass, HARDWARE_STORAGE_MANAGER__MANAGED_MEMORIES);

		hardwareStorageMemoryEClass = createEClass(HARDWARE_STORAGE_MEMORY);
		createEReference(hardwareStorageMemoryEClass, HARDWARE_STORAGE_MEMORY__BUFFER);

		hardwareSupportEClass = createEClass(HARDWARE_SUPPORT);

		hardwareTimingResourceEClass = createEClass(HARDWARE_TIMING_RESOURCE);

		hardwareTimerEClass = createEClass(HARDWARE_TIMER);
		createEReference(hardwareTimerEClass, HARDWARE_TIMER__INPUT_CLOCK);

		hardwareWatchdogEClass = createEClass(HARDWARE_WATCHDOG);

		hardwareWireEClass = createEClass(HARDWARE_WIRE);
		createEReference(hardwareWireEClass, HARDWARE_WIRE__SOURCE_PIN);
		createEReference(hardwareWireEClass, HARDWARE_WIRE__TARGET_PIN);

		// Create enums
		cacheTypeEEnum = createEEnum(CACHE_TYPE);
		componentStateEEnum = createEEnum(COMPONENT_STATE);
		conditionTypeEEnum = createEEnum(CONDITION_TYPE);
		directionEEnum = createEEnum(DIRECTION);
		isaTypeEEnum = createEEnum(ISA_TYPE);
		pldTechnologyEEnum = createEEnum(PLD_TECHNOLOGY);
		pldClassEEnum = createEEnum(PLD_CLASS);
		portTypeEEnum = createEEnum(PORT_TYPE);
		replPolicyEEnum = createEEnum(REPL_POLICY);
		romTypeEEnum = createEEnum(ROM_TYPE);
		writePolicyEEnum = createEEnum(WRITE_POLICY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GrmPackage theGrmPackage = (GrmPackage)EPackage.Registry.INSTANCE.getEPackage(GrmPackage.eNS_URI);
		org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage theCoreElementsPackage = (org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage)EPackage.Registry.INSTANCE.getEPackage(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		firmwareArchitectureEClass.getESuperTypes().add(this.getHardwareResource());
		hardwareActuatorEClass.getESuperTypes().add(this.getHardwareIo());
		hardwareArbiterEClass.getESuperTypes().add(this.getHardwareCommunicationResource());
		hardwareArbiterEClass.getESuperTypes().add(theGrmPackage.getResourceBroker());
		hardwareAsicEClass.getESuperTypes().add(this.getHardwareComputingResource());
		hardwareBranchPredictorEClass.getESuperTypes().add(this.getHardwareResource());
		hardwareBridgeEClass.getESuperTypes().add(this.getHardwareMedia());
		hardwareBusEClass.getESuperTypes().add(this.getHardwareMedia());
		hardwareCacheEClass.getESuperTypes().add(this.getHardwareProcessingMemory());
		hardwareCardEClass.getESuperTypes().add(this.getHardwareComponent());
		hardwareChannelEClass.getESuperTypes().add(this.getHardwareComponent());
		hardwareChipEClass.getESuperTypes().add(this.getHardwareComponent());
		hardwareClockEClass.getESuperTypes().add(this.getHardwareTimingResource());
		hardwareCommunicationResourceEClass.getESuperTypes().add(theGrmPackage.getCommunicationResource());
		hardwareCommunicationResourceEClass.getESuperTypes().add(this.getHardwareResource());
		hardwareCommunicationResourceEClass.getESuperTypes().add(this.getHardwareChannel());
		hardwareComputingResourceEClass.getESuperTypes().add(theGrmPackage.getComputingResource());
		hardwareComputingResourceEClass.getESuperTypes().add(this.getHardwareResource());
		hardwareComputingResourceEClass.getESuperTypes().add(this.getHardwareChip());
		hardwareConnectorEClass.getESuperTypes().add(theGrmPackage.getResourceConnector());
		hardwareDeviceEClass.getESuperTypes().add(theGrmPackage.getDeviceResource());
		hardwareDeviceEClass.getESuperTypes().add(this.getHardwareResource());
		hardwareDeviceEClass.getESuperTypes().add(this.getHardwareChip());
		hardwareDmaEClass.getESuperTypes().add(this.getHardwareStorageManager());
		hardwareDmaEClass.getESuperTypes().add(this.getHardwareArbiter());
		hardwareDriveEClass.getESuperTypes().add(this.getHardwareStorageMemory());
		hardwareInterfaceEClass.getESuperTypes().add(theGrmPackage.getResourceInterface());
		hardwareInterfacePackageEClass.getESuperTypes().add(theGrmPackage.getResourcePackage());
		hardwareIoEClass.getESuperTypes().add(this.getHardwareDevice());
		hardwareIpBlockEClass.getESuperTypes().add(this.getHardwareResource());
		hardwareIsaEClass.getESuperTypes().add(this.getHardwareResource());
		hardwareMediaEClass.getESuperTypes().add(this.getHardwareCommunicationResource());
		hardwareMemoryEClass.getESuperTypes().add(theGrmPackage.getStorageResource());
		hardwareMemoryEClass.getESuperTypes().add(this.getHardwareResource());
		hardwareMemoryEClass.getESuperTypes().add(this.getHardwareChip());
		hardwareMmuEClass.getESuperTypes().add(this.getHardwareStorageManager());
		hardwarePinEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());
		hardwarePlatformEClass.getESuperTypes().add(this.getHardwareResource());
		hardwarePlatformEClass.getESuperTypes().add(this.getHardwareCard());
		hardwarePldEClass.getESuperTypes().add(this.getHardwareComputingResource());
		hardwarePortEClass.getESuperTypes().add(theGrmPackage.getResourcePort());
		hardwarePortEClass.getESuperTypes().add(this.getHardwareComponent());
		hardwareProcessingMemoryEClass.getESuperTypes().add(this.getHardwareMemory());
		hardwareProcessorEClass.getESuperTypes().add(this.getHardwareComputingResource());
		hardwareRamEClass.getESuperTypes().add(this.getHardwareProcessingMemory());
		hardwareResourcePackageEClass.getESuperTypes().add(theGrmPackage.getResourcePackage());
		hardwareResourceEClass.getESuperTypes().add(theGrmPackage.getResource());
		hardwareRomEClass.getESuperTypes().add(this.getHardwareStorageMemory());
		hardwareSensorEClass.getESuperTypes().add(this.getHardwareIo());
		hardwareServiceEClass.getESuperTypes().add(theGrmPackage.getResourceService());
		hardwareStorageManagerEClass.getESuperTypes().add(theGrmPackage.getResourceBroker());
		hardwareStorageManagerEClass.getESuperTypes().add(this.getHardwareChip());
		hardwareStorageMemoryEClass.getESuperTypes().add(this.getHardwareMemory());
		hardwareSupportEClass.getESuperTypes().add(this.getHardwareDevice());
		hardwareTimingResourceEClass.getESuperTypes().add(this.getHardwareResource());
		hardwareTimingResourceEClass.getESuperTypes().add(theGrmPackage.getTimingResource());
		hardwareTimingResourceEClass.getESuperTypes().add(this.getHardwareChip());
		hardwareTimerEClass.getESuperTypes().add(this.getHardwareTimingResource());
		hardwareWatchdogEClass.getESuperTypes().add(this.getHardwareTimer());

		// Initialize classes, features, and operations; add parameters
		initEClass(envConditionEClass, EnvCondition.class, "EnvCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvCondition_Type(), this.getConditionType(), "type", null, 0, 1, EnvCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvCondition_Status(), this.getComponentState(), "status", null, 0, 1, EnvCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvCondition_Description(), ecorePackage.getEString(), "description", null, 0, 1, EnvCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvCondition_Range(), ecorePackage.getEInt(), "range", null, 0, 1, EnvCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(firmwareArchitectureEClass, FirmwareArchitecture.class, "FirmwareArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFirmwareArchitecture_OwnedWire(), this.getHardwareWire(), null, "ownedWire", null, 0, -1, FirmwareArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFirmwareArchitecture_OwnedPin(), this.getHardwarePin(), null, "ownedPin", null, 0, -1, FirmwareArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareActuatorEClass, HardwareActuator.class, "HardwareActuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareArbiterEClass, HardwareArbiter.class, "HardwareArbiter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareArbiter_ControlledMedia(), this.getHardwareMedia(), this.getHardwareMedia_Arbiters(), "controlledMedia", null, 1, -1, HardwareArbiter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareAsicEClass, HardwareAsic.class, "HardwareAsic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareBranchPredictorEClass, HardwareBranchPredictor.class, "HardwareBranchPredictor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareBridgeEClass, HardwareBridge.class, "HardwareBridge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareBridge_Sides(), this.getHardwareMedia(), null, "sides", null, 2, -1, HardwareBridge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareBusEClass, HardwareBus.class, "HardwareBus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareBus_AddressWidth(), ecorePackage.getEInt(), "addressWidth", null, 0, 1, HardwareBus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareBus_WordWidth(), ecorePackage.getEInt(), "wordWidth", null, 0, 1, HardwareBus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareBus_IsSynchronous(), ecorePackage.getEBoolean(), "isSynchronous", null, 0, 1, HardwareBus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareBus_IsSerial(), ecorePackage.getEBoolean(), "isSerial", null, 0, 1, HardwareBus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareCacheEClass, HardwareCache.class, "HardwareCache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareCache_Level(), ecorePackage.getEInt(), "level", null, 0, 1, HardwareCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareCache_Type(), this.getCacheType(), "type", null, 0, 1, HardwareCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareCache_NbSets(), ecorePackage.getEInt(), "nbSets", null, 0, 1, HardwareCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareCache_BlockSize(), ecorePackage.getEInt(), "blockSize", null, 0, 1, HardwareCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareCache_Associativity(), ecorePackage.getEInt(), "associativity", null, 0, 1, HardwareCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareCardEClass, HardwareCard.class, "HardwareCard", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareChannelEClass, HardwareChannel.class, "HardwareChannel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareChannel_NbWires(), ecorePackage.getEInt(), "nbWires", null, 0, 1, HardwareChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareChannel_RealizedBy(), this.getHardwareWire(), null, "realizedBy", null, 0, -1, HardwareChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareChipEClass, HardwareChip.class, "HardwareChip", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareChip_Technology(), ecorePackage.getEInt(), "technology", null, 0, 1, HardwareChip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareClockEClass, HardwareClock.class, "HardwareClock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareClock_Frequency(), ecorePackage.getEInt(), "frequency", null, 0, 1, HardwareClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareCommunicationResourceEClass, HardwareCommunicationResource.class, "HardwareCommunicationResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareComponentEClass, HardwareComponent.class, "HardwareComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareComponent_Dimension(), ecorePackage.getEInt(), "dimension", null, 0, 1, HardwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareComponent_Area(), ecorePackage.getEInt(), "area", null, 0, 1, HardwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareComponent_PosX(), ecorePackage.getEInt(), "posX", null, 0, 1, HardwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareComponent_PosY(), ecorePackage.getEInt(), "posY", null, 0, 1, HardwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareComponent_Grid(), ecorePackage.getEInt(), "grid", null, 0, 1, HardwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareComponent_NbPins(), ecorePackage.getEInt(), "nbPins", null, 0, 1, HardwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareComponent_Weight(), ecorePackage.getEInt(), "weight", null, 0, 1, HardwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareComponent_Price(), ecorePackage.getEInt(), "price", null, 0, 1, HardwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareComponent_RConditions(), this.getEnvCondition(), null, "rConditions", null, 0, -1, HardwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareComponent_OwnedPin(), this.getHardwarePin(), null, "ownedPin", null, 0, -1, HardwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareComponent_OwnedWire(), this.getHardwareWire(), null, "ownedWire", null, 0, -1, HardwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareComputingResourceEClass, HardwareComputingResource.class, "HardwareComputingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareComputingResource_OpFrequencies(), ecorePackage.getEInt(), "opFrequencies", null, 0, 1, HardwareComputingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareConnectorEClass, HardwareConnector.class, "HardwareConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareDeviceEClass, HardwareDevice.class, "HardwareDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareDmaEClass, HardwareDma.class, "HardwareDma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareDma_NbChannels(), ecorePackage.getEInt(), "nbChannels", null, 0, 1, HardwareDma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareDma_TransferWidth(), ecorePackage.getEInt(), "transferWidth", null, 0, 1, HardwareDma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareDma_DrivenBy(), this.getHardwareProcessor(), null, "drivenBy", null, 0, -1, HardwareDma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareDriveEClass, HardwareDrive.class, "HardwareDrive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareDrive_SectorSize(), ecorePackage.getEInt(), "sectorSize", null, 0, 1, HardwareDrive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareInterfaceEClass, HardwareInterface.class, "HardwareInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareInterfacePackageEClass, HardwareInterfacePackage.class, "HardwareInterfacePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareIoEClass, HardwareIo.class, "HardwareIo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareIpBlockEClass, HardwareIpBlock.class, "HardwareIpBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareIsaEClass, HardwareIsa.class, "HardwareIsa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareIsa_Family(), ecorePackage.getEString(), "family", null, 0, 1, HardwareIsa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareIsa_InstWidth(), ecorePackage.getEInt(), "instWidth", null, 0, 1, HardwareIsa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareIsa_Type(), this.getIsaType(), "type", null, 0, 1, HardwareIsa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareMediaEClass, HardwareMedia.class, "HardwareMedia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareMedia_Arbiters(), this.getHardwareArbiter(), this.getHardwareArbiter_ControlledMedia(), "arbiters", null, 0, -1, HardwareMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareMemoryEClass, HardwareMemory.class, "HardwareMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareMemory_MemorySize(), ecorePackage.getEInt(), "memorySize", null, 0, 1, HardwareMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareMemory_AddressSize(), ecorePackage.getEInt(), "addressSize", null, 0, 1, HardwareMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareMemory_Timings(), ecorePackage.getEInt(), "timings", null, 0, -1, HardwareMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareMemory_Throughput(), ecorePackage.getEInt(), "throughput", null, 0, 1, HardwareMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareMmuEClass, HardwareMmu.class, "HardwareMmu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareMmu_VirtualAddrSpace(), ecorePackage.getEInt(), "virtualAddrSpace", null, 0, 1, HardwareMmu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareMmu_PhysicalAddrSpace(), ecorePackage.getEInt(), "physicalAddrSpace", null, 0, 1, HardwareMmu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareMmu_MemoryProtection(), ecorePackage.getEBoolean(), "memoryProtection", null, 0, 1, HardwareMmu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareMmu_NbEntriesTlb(), ecorePackage.getEInt(), "nbEntriesTlb", null, 0, 1, HardwareMmu.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareMmu_OwnedTlbs(), this.getHardwareCache(), null, "ownedTlbs", null, 0, -1, HardwareMmu.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(hardwarePinEClass, HardwarePin.class, "HardwarePin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwarePin_Width(), ecorePackage.getEInt(), "width", null, 0, 1, HardwarePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwarePin_Direction(), this.getDirection(), "direction", null, 0, 1, HardwarePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwarePlatformEClass, HardwarePlatform.class, "HardwarePlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwarePldEClass, HardwarePld.class, "HardwarePld", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwarePld_PldTechnology(), this.getPldTechnology(), "pldTechnology", null, 0, 1, HardwarePld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwarePld_NbRows(), ecorePackage.getEInt(), "nbRows", null, 0, 1, HardwarePld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwarePld_NbColumns(), ecorePackage.getEInt(), "nbColumns", null, 0, 1, HardwarePld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwarePld_Kind(), this.getPldClass(), "kind", null, 0, 1, HardwarePld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwarePld_NbLuts(), ecorePackage.getEInt(), "nbLuts", null, 0, 1, HardwarePld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwarePld_NbLutInputs(), ecorePackage.getEInt(), "nbLutInputs", null, 0, 1, HardwarePld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwarePld_NbFlipFlops(), ecorePackage.getEInt(), "nbFlipFlops", null, 0, 1, HardwarePld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwarePld_BlocksRam(), this.getHardwareRam(), null, "blocksRam", null, 0, -1, HardwarePld.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHardwarePld_Architecture(), this.getFirmwareArchitecture(), null, "architecture", null, 0, 1, HardwarePld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwarePld_IpBlock(), this.getHardwareIpBlock(), null, "ipBlock", null, 0, -1, HardwarePld.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(hardwarePortEClass, HardwarePort.class, "HardwarePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwarePort_Type(), this.getPortType(), "type", null, 0, 1, HardwarePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwarePort_RealizedBy(), this.getHardwarePin(), null, "realizedBy", null, 0, -1, HardwarePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareProcessingMemoryEClass, HardwareProcessingMemory.class, "HardwareProcessingMemory", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareProcessingMemory_ReplPolicy(), this.getReplPolicy(), "replPolicy", null, 0, 1, HardwareProcessingMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareProcessingMemory_WritePolicy(), this.getWritePolicy(), "writePolicy", null, 0, 1, HardwareProcessingMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareProcessorEClass, HardwareProcessor.class, "HardwareProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareProcessor_Architecture(), ecorePackage.getEInt(), "architecture", null, 0, 1, HardwareProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareProcessor_Mips(), ecorePackage.getEInt(), "mips", null, 0, 1, HardwareProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareProcessor_Ipc(), ecorePackage.getEFloat(), "ipc", null, 0, 1, HardwareProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareProcessor_NbCores(), ecorePackage.getEInt(), "nbCores", null, 0, 1, HardwareProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareProcessor_NbPipelines(), ecorePackage.getEInt(), "nbPipelines", null, 0, 1, HardwareProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareProcessor_NbStages(), ecorePackage.getEInt(), "nbStages", null, 0, 1, HardwareProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareProcessor_NbAlus(), ecorePackage.getEInt(), "nbAlus", null, 0, 1, HardwareProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareProcessor_NbFpus(), ecorePackage.getEInt(), "nbFpus", null, 0, 1, HardwareProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareProcessor_OwnedIsas(), this.getHardwareIsa(), null, "ownedIsas", null, 0, -1, HardwareProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareProcessor_Predictors(), this.getHardwareBranchPredictor(), null, "predictors", null, 0, -1, HardwareProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareProcessor_Caches(), this.getHardwareCache(), null, "caches", null, 0, -1, HardwareProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareProcessor_OwnedMmus(), this.getHardwareMmu(), null, "ownedMmus", null, 0, -1, HardwareProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(hardwareRamEClass, HardwareRam.class, "HardwareRam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareRam_NbRows(), ecorePackage.getEInt(), "nbRows", null, 0, 1, HardwareRam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareRam_NbColumns(), ecorePackage.getEInt(), "nbColumns", null, 0, 1, HardwareRam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareRam_NbBanks(), ecorePackage.getEInt(), "nbBanks", null, 0, 1, HardwareRam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareRam_WordSize(), ecorePackage.getEInt(), "wordSize", null, 0, 1, HardwareRam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareRam_IsSynchronous(), ecorePackage.getEBoolean(), "isSynchronous", null, 0, 1, HardwareRam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareRam_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 0, 1, HardwareRam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareRam_IsNonVolatile(), ecorePackage.getEBoolean(), "isNonVolatile", null, 0, 1, HardwareRam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareResourcePackageEClass, HardwareResourcePackage.class, "HardwareResourcePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareResourceEClass, HardwareResource.class, "HardwareResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareResource_Clock(), this.getHardwareClock(), null, "clock", null, 0, 1, HardwareResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareRomEClass, HardwareRom.class, "HardwareRom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareRom_Type(), this.getRomType(), "type", null, 0, 1, HardwareRom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareRom_NbRows(), ecorePackage.getEInt(), "nbRows", null, 0, 1, HardwareRom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareRom_NbColumns(), ecorePackage.getEInt(), "nbColumns", null, 0, 1, HardwareRom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareRom_NbBanks(), ecorePackage.getEInt(), "nbBanks", null, 0, 1, HardwareRom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareRom_WordSize(), ecorePackage.getEInt(), "wordSize", null, 0, 1, HardwareRom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareSensorEClass, HardwareSensor.class, "HardwareSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareServiceEClass, HardwareService.class, "HardwareService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareStorageManagerEClass, HardwareStorageManager.class, "HardwareStorageManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareStorageManager_ManagedMemories(), this.getHardwareMemory(), null, "managedMemories", null, 1, -1, HardwareStorageManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareStorageMemoryEClass, HardwareStorageMemory.class, "HardwareStorageMemory", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareStorageMemory_Buffer(), this.getHardwareProcessingMemory(), null, "buffer", null, 0, 1, HardwareStorageMemory.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(hardwareSupportEClass, HardwareSupport.class, "HardwareSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareTimingResourceEClass, HardwareTimingResource.class, "HardwareTimingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareTimerEClass, HardwareTimer.class, "HardwareTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareTimer_InputClock(), this.getHardwareClock(), null, "inputClock", null, 1, 1, HardwareTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareWatchdogEClass, HardwareWatchdog.class, "HardwareWatchdog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareWireEClass, HardwareWire.class, "HardwareWire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareWire_SourcePin(), this.getHardwarePin(), null, "sourcePin", null, 1, 1, HardwareWire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareWire_TargetPin(), this.getHardwarePin(), null, "targetPin", null, 1, 1, HardwareWire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cacheTypeEEnum, CacheType.class, "CacheType");
		addEEnumLiteral(cacheTypeEEnum, CacheType.DATA);
		addEEnumLiteral(cacheTypeEEnum, CacheType.INSTRUCTION);
		addEEnumLiteral(cacheTypeEEnum, CacheType.UNIFIED);
		addEEnumLiteral(cacheTypeEEnum, CacheType.OTHER);
		addEEnumLiteral(cacheTypeEEnum, CacheType.UNDEF);

		initEEnum(componentStateEEnum, ComponentState.class, "ComponentState");
		addEEnumLiteral(componentStateEEnum, ComponentState.OPERATING);
		addEEnumLiteral(componentStateEEnum, ComponentState.STORAGE);
		addEEnumLiteral(componentStateEEnum, ComponentState.OTHER);
		addEEnumLiteral(componentStateEEnum, ComponentState.UNDEF);

		initEEnum(conditionTypeEEnum, ConditionType.class, "ConditionType");
		addEEnumLiteral(conditionTypeEEnum, ConditionType.TEMPERATURE);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.HUMIDITY);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.ALTITUDE);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.VIBRATION);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.SHOCK);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.OTHER);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.UNDEF);

		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.IN);
		addEEnumLiteral(directionEEnum, Direction.OUT);
		addEEnumLiteral(directionEEnum, Direction.INOUT);

		initEEnum(isaTypeEEnum, IsaType.class, "IsaType");
		addEEnumLiteral(isaTypeEEnum, IsaType.RISC);
		addEEnumLiteral(isaTypeEEnum, IsaType.CISC);
		addEEnumLiteral(isaTypeEEnum, IsaType.VLIW);
		addEEnumLiteral(isaTypeEEnum, IsaType.SIMD);
		addEEnumLiteral(isaTypeEEnum, IsaType.MIMD);
		addEEnumLiteral(isaTypeEEnum, IsaType.OTHER);
		addEEnumLiteral(isaTypeEEnum, IsaType.UNDEF);

		initEEnum(pldTechnologyEEnum, PldTechnology.class, "PldTechnology");
		addEEnumLiteral(pldTechnologyEEnum, PldTechnology.SRAM);
		addEEnumLiteral(pldTechnologyEEnum, PldTechnology.ANTIFUSE);
		addEEnumLiteral(pldTechnologyEEnum, PldTechnology.FLASH);
		addEEnumLiteral(pldTechnologyEEnum, PldTechnology.OTHER);
		addEEnumLiteral(pldTechnologyEEnum, PldTechnology.UNDEF);

		initEEnum(pldClassEEnum, PldClass.class, "PldClass");
		addEEnumLiteral(pldClassEEnum, PldClass.SYMETRICAL_ARRAY);
		addEEnumLiteral(pldClassEEnum, PldClass.ROW_BASED);
		addEEnumLiteral(pldClassEEnum, PldClass.SEA_OF_GATES);
		addEEnumLiteral(pldClassEEnum, PldClass.HIERARCHICAL_PLD);
		addEEnumLiteral(pldClassEEnum, PldClass.OTHER);
		addEEnumLiteral(pldClassEEnum, PldClass.UNDEF);

		initEEnum(portTypeEEnum, PortType.class, "PortType");
		addEEnumLiteral(portTypeEEnum, PortType.MALE);
		addEEnumLiteral(portTypeEEnum, PortType.FEMALE);
		addEEnumLiteral(portTypeEEnum, PortType.OTHER);
		addEEnumLiteral(portTypeEEnum, PortType.UNDEF);

		initEEnum(replPolicyEEnum, ReplPolicy.class, "ReplPolicy");
		addEEnumLiteral(replPolicyEEnum, ReplPolicy.LRU);
		addEEnumLiteral(replPolicyEEnum, ReplPolicy.NFU);
		addEEnumLiteral(replPolicyEEnum, ReplPolicy.FIFO);
		addEEnumLiteral(replPolicyEEnum, ReplPolicy.RANDOM);
		addEEnumLiteral(replPolicyEEnum, ReplPolicy.OTHER);
		addEEnumLiteral(replPolicyEEnum, ReplPolicy.UNDEF);

		initEEnum(romTypeEEnum, RomType.class, "RomType");
		addEEnumLiteral(romTypeEEnum, RomType.MASKED_ROM);
		addEEnumLiteral(romTypeEEnum, RomType.EPROM);
		addEEnumLiteral(romTypeEEnum, RomType.OTP_EPROM);
		addEEnumLiteral(romTypeEEnum, RomType.EEPROM);
		addEEnumLiteral(romTypeEEnum, RomType.FLASH);
		addEEnumLiteral(romTypeEEnum, RomType.OTHER);
		addEEnumLiteral(romTypeEEnum, RomType.UNDEF);

		initEEnum(writePolicyEEnum, WritePolicy.class, "WritePolicy");
		addEEnumLiteral(writePolicyEEnum, WritePolicy.WRITE_BACK);
		addEEnumLiteral(writePolicyEEnum, WritePolicy.WRITE_THROUGH);
		addEEnumLiteral(writePolicyEEnum, WritePolicy.OTHER);
		addEEnumLiteral(writePolicyEEnum, WritePolicy.UNDEF);

		// Create resource
		createResource(eNS_URI);
	}

} //HrmPackageImpl
