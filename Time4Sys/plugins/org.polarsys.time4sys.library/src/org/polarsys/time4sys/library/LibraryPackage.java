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
package org.polarsys.time4sys.library;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

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
 * @see org.polarsys.time4sys.library.LibraryFactory
 * @model kind="package"
 * @generated
 */
public interface LibraryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "library";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/library/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "library";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibraryPackage eINSTANCE = org.polarsys.time4sys.library.impl.LibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.library.impl.TDMAImpl <em>TDMA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.library.impl.TDMAImpl
	 * @see org.polarsys.time4sys.library.impl.LibraryPackageImpl#getTDMA()
	 * @generated
	 */
	int TDMA = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMA__EANNOTATIONS = GrmPackage.SCHEDULING_POLICY__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMA__NAME = GrmPackage.SCHEDULING_POLICY__NAME;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMA__POLICY = GrmPackage.SCHEDULING_POLICY__POLICY;

	/**
	 * The feature id for the '<em><b>Other Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMA__OTHER_SCHED_POLICY = GrmPackage.SCHEDULING_POLICY__OTHER_SCHED_POLICY;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMA__SLOT = GrmPackage.SCHEDULING_POLICY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TDMA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMA_FEATURE_COUNT = GrmPackage.SCHEDULING_POLICY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMA___GET_EANNOTATION__STRING = GrmPackage.SCHEDULING_POLICY___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Has Valid Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMA___HAS_VALID_POLICY__DIAGNOSTICCHAIN_MAP = GrmPackage.SCHEDULING_POLICY___HAS_VALID_POLICY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>TDMA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMA_OPERATION_COUNT = GrmPackage.SCHEDULING_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.library.impl.DeadlineMonotonicSchedulingPolicyImpl <em>Deadline Monotonic Scheduling Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.library.impl.DeadlineMonotonicSchedulingPolicyImpl
	 * @see org.polarsys.time4sys.library.impl.LibraryPackageImpl#getDeadlineMonotonicSchedulingPolicy()
	 * @generated
	 */
	int DEADLINE_MONOTONIC_SCHEDULING_POLICY = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_MONOTONIC_SCHEDULING_POLICY__EANNOTATIONS = GrmPackage.SCHEDULING_POLICY__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_MONOTONIC_SCHEDULING_POLICY__NAME = GrmPackage.SCHEDULING_POLICY__NAME;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_MONOTONIC_SCHEDULING_POLICY__POLICY = GrmPackage.SCHEDULING_POLICY__POLICY;

	/**
	 * The feature id for the '<em><b>Other Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_MONOTONIC_SCHEDULING_POLICY__OTHER_SCHED_POLICY = GrmPackage.SCHEDULING_POLICY__OTHER_SCHED_POLICY;

	/**
	 * The number of structural features of the '<em>Deadline Monotonic Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_MONOTONIC_SCHEDULING_POLICY_FEATURE_COUNT = GrmPackage.SCHEDULING_POLICY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_MONOTONIC_SCHEDULING_POLICY___GET_EANNOTATION__STRING = GrmPackage.SCHEDULING_POLICY___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Has Valid Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_MONOTONIC_SCHEDULING_POLICY___HAS_VALID_POLICY__DIAGNOSTICCHAIN_MAP = GrmPackage.SCHEDULING_POLICY___HAS_VALID_POLICY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Deadline Monotonic Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_MONOTONIC_SCHEDULING_POLICY_OPERATION_COUNT = GrmPackage.SCHEDULING_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.library.impl.RateMonotonicSchedulingPolicyImpl <em>Rate Monotonic Scheduling Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.library.impl.RateMonotonicSchedulingPolicyImpl
	 * @see org.polarsys.time4sys.library.impl.LibraryPackageImpl#getRateMonotonicSchedulingPolicy()
	 * @generated
	 */
	int RATE_MONOTONIC_SCHEDULING_POLICY = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_MONOTONIC_SCHEDULING_POLICY__EANNOTATIONS = GrmPackage.SCHEDULING_POLICY__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_MONOTONIC_SCHEDULING_POLICY__NAME = GrmPackage.SCHEDULING_POLICY__NAME;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_MONOTONIC_SCHEDULING_POLICY__POLICY = GrmPackage.SCHEDULING_POLICY__POLICY;

	/**
	 * The feature id for the '<em><b>Other Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_MONOTONIC_SCHEDULING_POLICY__OTHER_SCHED_POLICY = GrmPackage.SCHEDULING_POLICY__OTHER_SCHED_POLICY;

	/**
	 * The number of structural features of the '<em>Rate Monotonic Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_MONOTONIC_SCHEDULING_POLICY_FEATURE_COUNT = GrmPackage.SCHEDULING_POLICY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_MONOTONIC_SCHEDULING_POLICY___GET_EANNOTATION__STRING = GrmPackage.SCHEDULING_POLICY___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Has Valid Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_MONOTONIC_SCHEDULING_POLICY___HAS_VALID_POLICY__DIAGNOSTICCHAIN_MAP = GrmPackage.SCHEDULING_POLICY___HAS_VALID_POLICY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Rate Monotonic Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_MONOTONIC_SCHEDULING_POLICY_OPERATION_COUNT = GrmPackage.SCHEDULING_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.library.impl.HardwareCANBusImpl <em>Hardware CAN Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.library.impl.HardwareCANBusImpl
	 * @see org.polarsys.time4sys.library.impl.LibraryPackageImpl#getHardwareCANBus()
	 * @generated
	 */
	int HARDWARE_CAN_BUS = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__EANNOTATIONS = HrmPackage.HARDWARE_BUS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__NAME = HrmPackage.HARDWARE_BUS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__OWNED_RESOURCE = HrmPackage.HARDWARE_BUS__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__RES_MULT = HrmPackage.HARDWARE_BUS__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__IS_PROTECTED = HrmPackage.HARDWARE_BUS__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__IS_ACTIVE = HrmPackage.HARDWARE_BUS__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__OWNED_PORT = HrmPackage.HARDWARE_BUS__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__OWNED_CONNECTOR = HrmPackage.HARDWARE_BUS__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__RSERVICES = HrmPackage.HARDWARE_BUS__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__USED_BY = HrmPackage.HARDWARE_BUS__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__PSERVICES = HrmPackage.HARDWARE_BUS__PSERVICES;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__CLOCK = HrmPackage.HARDWARE_BUS__CLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__DIMENSION = HrmPackage.HARDWARE_BUS__DIMENSION;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__AREA = HrmPackage.HARDWARE_BUS__AREA;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__POS_X = HrmPackage.HARDWARE_BUS__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__POS_Y = HrmPackage.HARDWARE_BUS__POS_Y;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__GRID = HrmPackage.HARDWARE_BUS__GRID;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__NB_PINS = HrmPackage.HARDWARE_BUS__NB_PINS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__WEIGHT = HrmPackage.HARDWARE_BUS__WEIGHT;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__PRICE = HrmPackage.HARDWARE_BUS__PRICE;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__RCONDITIONS = HrmPackage.HARDWARE_BUS__RCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__OWNED_PIN = HrmPackage.HARDWARE_BUS__OWNED_PIN;

	/**
	 * The feature id for the '<em><b>Owned Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__OWNED_WIRE = HrmPackage.HARDWARE_BUS__OWNED_WIRE;

	/**
	 * The feature id for the '<em><b>Nb Wires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__NB_WIRES = HrmPackage.HARDWARE_BUS__NB_WIRES;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__REALIZED_BY = HrmPackage.HARDWARE_BUS__REALIZED_BY;

	/**
	 * The feature id for the '<em><b>Arbiters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__ARBITERS = HrmPackage.HARDWARE_BUS__ARBITERS;

	/**
	 * The feature id for the '<em><b>Address Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__ADDRESS_WIDTH = HrmPackage.HARDWARE_BUS__ADDRESS_WIDTH;

	/**
	 * The feature id for the '<em><b>Word Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__WORD_WIDTH = HrmPackage.HARDWARE_BUS__WORD_WIDTH;

	/**
	 * The feature id for the '<em><b>Is Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__IS_SYNCHRONOUS = HrmPackage.HARDWARE_BUS__IS_SYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Is Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS__IS_SERIAL = HrmPackage.HARDWARE_BUS__IS_SERIAL;

	/**
	 * The number of structural features of the '<em>Hardware CAN Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS_FEATURE_COUNT = HrmPackage.HARDWARE_BUS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS___GET_EANNOTATION__STRING = HrmPackage.HARDWARE_BUS___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Hardware CAN Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CAN_BUS_OPERATION_COUNT = HrmPackage.HARDWARE_BUS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.library.TDMA <em>TDMA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDMA</em>'.
	 * @see org.polarsys.time4sys.library.TDMA
	 * @generated
	 */
	EClass getTDMA();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.library.TDMA#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Slot</em>'.
	 * @see org.polarsys.time4sys.library.TDMA#getSlot()
	 * @see #getTDMA()
	 * @generated
	 */
	EAttribute getTDMA_Slot();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.library.DeadlineMonotonicSchedulingPolicy <em>Deadline Monotonic Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadline Monotonic Scheduling Policy</em>'.
	 * @see org.polarsys.time4sys.library.DeadlineMonotonicSchedulingPolicy
	 * @generated
	 */
	EClass getDeadlineMonotonicSchedulingPolicy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.library.RateMonotonicSchedulingPolicy <em>Rate Monotonic Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rate Monotonic Scheduling Policy</em>'.
	 * @see org.polarsys.time4sys.library.RateMonotonicSchedulingPolicy
	 * @generated
	 */
	EClass getRateMonotonicSchedulingPolicy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.library.HardwareCANBus <em>Hardware CAN Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware CAN Bus</em>'.
	 * @see org.polarsys.time4sys.library.HardwareCANBus
	 * @generated
	 */
	EClass getHardwareCANBus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LibraryFactory getLibraryFactory();

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
		 * The meta object literal for the '{@link org.polarsys.time4sys.library.impl.TDMAImpl <em>TDMA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.library.impl.TDMAImpl
		 * @see org.polarsys.time4sys.library.impl.LibraryPackageImpl#getTDMA()
		 * @generated
		 */
		EClass TDMA = eINSTANCE.getTDMA();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDMA__SLOT = eINSTANCE.getTDMA_Slot();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.library.impl.DeadlineMonotonicSchedulingPolicyImpl <em>Deadline Monotonic Scheduling Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.library.impl.DeadlineMonotonicSchedulingPolicyImpl
		 * @see org.polarsys.time4sys.library.impl.LibraryPackageImpl#getDeadlineMonotonicSchedulingPolicy()
		 * @generated
		 */
		EClass DEADLINE_MONOTONIC_SCHEDULING_POLICY = eINSTANCE.getDeadlineMonotonicSchedulingPolicy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.library.impl.RateMonotonicSchedulingPolicyImpl <em>Rate Monotonic Scheduling Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.library.impl.RateMonotonicSchedulingPolicyImpl
		 * @see org.polarsys.time4sys.library.impl.LibraryPackageImpl#getRateMonotonicSchedulingPolicy()
		 * @generated
		 */
		EClass RATE_MONOTONIC_SCHEDULING_POLICY = eINSTANCE.getRateMonotonicSchedulingPolicy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.library.impl.HardwareCANBusImpl <em>Hardware CAN Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.library.impl.HardwareCANBusImpl
		 * @see org.polarsys.time4sys.library.impl.LibraryPackageImpl#getHardwareCANBus()
		 * @generated
		 */
		EClass HARDWARE_CAN_BUS = eINSTANCE.getHardwareCANBus();

	}

} //LibraryPackage
