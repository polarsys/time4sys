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
package org.polarsys.time4sys.marte.srm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.polarsys.time4sys.marte.srm.SrmFactory
 * @model kind="package"
 * @generated
 */
public interface SrmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "srm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/marte/srm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "srm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SrmPackage eINSTANCE = org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareResourceImpl <em>Software Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareResourceImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareResource()
	 * @generated
	 */
	int SOFTWARE_RESOURCE = 18;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__EANNOTATIONS = GrmPackage.RESOURCE_MANAGER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__NAME = GrmPackage.RESOURCE_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__OWNED_RESOURCE = GrmPackage.RESOURCE_MANAGER__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__RES_MULT = GrmPackage.RESOURCE_MANAGER__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__IS_PROTECTED = GrmPackage.RESOURCE_MANAGER__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__IS_ACTIVE = GrmPackage.RESOURCE_MANAGER__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__OWNED_PORT = GrmPackage.RESOURCE_MANAGER__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__OWNED_CONNECTOR = GrmPackage.RESOURCE_MANAGER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__RSERVICES = GrmPackage.RESOURCE_MANAGER__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__USED_BY = GrmPackage.RESOURCE_MANAGER__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__PSERVICES = GrmPackage.RESOURCE_MANAGER__PSERVICES;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__MANAGED_RESOURCE = GrmPackage.RESOURCE_MANAGER__MANAGED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__RES_CTRL_POLICY = GrmPackage.RESOURCE_MANAGER__RES_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Create Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__CREATE_SERVICES = GrmPackage.RESOURCE_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delete Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__DELETE_SERVICES = GrmPackage.RESOURCE_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initialize Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__INITIALIZE_SERVICES = GrmPackage.RESOURCE_MANAGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT = GrmPackage.RESOURCE_MANAGER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__STATE_ELEMENTS = GrmPackage.RESOURCE_MANAGER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Identifier Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS = GrmPackage.RESOURCE_MANAGER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Software Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE_FEATURE_COUNT = GrmPackage.RESOURCE_MANAGER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE___GET_EANNOTATION__STRING = GrmPackage.RESOURCE_MANAGER___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Software Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE_OPERATION_COUNT = GrmPackage.RESOURCE_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareAccessServiceImpl <em>Software Access Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareAccessServiceImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareAccessService()
	 * @generated
	 */
	int SOFTWARE_ACCESS_SERVICE = 8;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl <em>Software Concurrent Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareConcurrentResource()
	 * @generated
	 */
	int SOFTWARE_CONCURRENT_RESOURCE = 11;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__EANNOTATIONS = SOFTWARE_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__NAME = SOFTWARE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__OWNED_RESOURCE = SOFTWARE_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__RES_MULT = SOFTWARE_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__IS_PROTECTED = SOFTWARE_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__IS_ACTIVE = SOFTWARE_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__OWNED_PORT = SOFTWARE_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__OWNED_CONNECTOR = SOFTWARE_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__RSERVICES = SOFTWARE_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__USED_BY = SOFTWARE_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__PSERVICES = SOFTWARE_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__MANAGED_RESOURCE = SOFTWARE_RESOURCE__MANAGED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__RES_CTRL_POLICY = SOFTWARE_RESOURCE__RES_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Create Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__CREATE_SERVICES = SOFTWARE_RESOURCE__CREATE_SERVICES;

	/**
	 * The feature id for the '<em><b>Delete Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__DELETE_SERVICES = SOFTWARE_RESOURCE__DELETE_SERVICES;

	/**
	 * The feature id for the '<em><b>Initialize Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__INITIALIZE_SERVICES = SOFTWARE_RESOURCE__INITIALIZE_SERVICES;

	/**
	 * The feature id for the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__MEMORY_SIZE_FOOTPRINT = SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT;

	/**
	 * The feature id for the '<em><b>State Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__STATE_ELEMENTS = SOFTWARE_RESOURCE__STATE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Identifier Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__IDENTIFIER_ELEMENTS = SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Activate Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__ACTIVATE_SERVICES = SOFTWARE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resume Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__RESUME_SERVICES = SOFTWARE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Suspend Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__SUSPEND_SERVICES = SOFTWARE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable Concurrency Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES = SOFTWARE_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disable Concurrency Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES = SOFTWARE_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Terminate Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__TERMINATE_SERVICES = SOFTWARE_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Adress Space</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE = SOFTWARE_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Period Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__PERIOD_ELEMENTS = SOFTWARE_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Activation Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY = SOFTWARE_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Priority Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS = SOFTWARE_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Stack Size Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS = SOFTWARE_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Heap Size Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS = SOFTWARE_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Shared Data Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__SHARED_DATA_RESOURCES = SOFTWARE_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Message Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__MESSAGE_RESOURCES = SOFTWARE_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Mutual Exclusion Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES = SOFTWARE_RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Notification Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES = SOFTWARE_RESOURCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Entry Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__ENTRY_POINTS = SOFTWARE_RESOURCE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Arrival Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE__ARRIVAL_PATTERN = SOFTWARE_RESOURCE_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Software Concurrent Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE_FEATURE_COUNT = SOFTWARE_RESOURCE_FEATURE_COUNT + 18;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE___GET_EANNOTATION__STRING = SOFTWARE_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Software Concurrent Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONCURRENT_RESOURCE_OPERATION_COUNT = SOFTWARE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.InterruptResourceImpl <em>Interrupt Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.InterruptResourceImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getInterruptResource()
	 * @generated
	 */
	int INTERRUPT_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__EANNOTATIONS = SOFTWARE_CONCURRENT_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__NAME = SOFTWARE_CONCURRENT_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__OWNED_RESOURCE = SOFTWARE_CONCURRENT_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__RES_MULT = SOFTWARE_CONCURRENT_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__IS_PROTECTED = SOFTWARE_CONCURRENT_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__IS_ACTIVE = SOFTWARE_CONCURRENT_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__OWNED_PORT = SOFTWARE_CONCURRENT_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__OWNED_CONNECTOR = SOFTWARE_CONCURRENT_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__RSERVICES = SOFTWARE_CONCURRENT_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__USED_BY = SOFTWARE_CONCURRENT_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__PSERVICES = SOFTWARE_CONCURRENT_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__MANAGED_RESOURCE = SOFTWARE_CONCURRENT_RESOURCE__MANAGED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__RES_CTRL_POLICY = SOFTWARE_CONCURRENT_RESOURCE__RES_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Create Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__CREATE_SERVICES = SOFTWARE_CONCURRENT_RESOURCE__CREATE_SERVICES;

	/**
	 * The feature id for the '<em><b>Delete Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__DELETE_SERVICES = SOFTWARE_CONCURRENT_RESOURCE__DELETE_SERVICES;

	/**
	 * The feature id for the '<em><b>Initialize Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__INITIALIZE_SERVICES = SOFTWARE_CONCURRENT_RESOURCE__INITIALIZE_SERVICES;

	/**
	 * The feature id for the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__MEMORY_SIZE_FOOTPRINT = SOFTWARE_CONCURRENT_RESOURCE__MEMORY_SIZE_FOOTPRINT;

	/**
	 * The feature id for the '<em><b>State Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__STATE_ELEMENTS = SOFTWARE_CONCURRENT_RESOURCE__STATE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Identifier Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__IDENTIFIER_ELEMENTS = SOFTWARE_CONCURRENT_RESOURCE__IDENTIFIER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Activate Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__ACTIVATE_SERVICES = SOFTWARE_CONCURRENT_RESOURCE__ACTIVATE_SERVICES;

	/**
	 * The feature id for the '<em><b>Resume Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__RESUME_SERVICES = SOFTWARE_CONCURRENT_RESOURCE__RESUME_SERVICES;

	/**
	 * The feature id for the '<em><b>Suspend Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__SUSPEND_SERVICES = SOFTWARE_CONCURRENT_RESOURCE__SUSPEND_SERVICES;

	/**
	 * The feature id for the '<em><b>Enable Concurrency Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__ENABLE_CONCURRENCY_SERVICES = SOFTWARE_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES;

	/**
	 * The feature id for the '<em><b>Disable Concurrency Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__DISABLE_CONCURRENCY_SERVICES = SOFTWARE_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES;

	/**
	 * The feature id for the '<em><b>Terminate Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__TERMINATE_SERVICES = SOFTWARE_CONCURRENT_RESOURCE__TERMINATE_SERVICES;

	/**
	 * The feature id for the '<em><b>Adress Space</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__ADRESS_SPACE = SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE;

	/**
	 * The feature id for the '<em><b>Period Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__PERIOD_ELEMENTS = SOFTWARE_CONCURRENT_RESOURCE__PERIOD_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Activation Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__ACTIVATION_CAPACITY = SOFTWARE_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY;

	/**
	 * The feature id for the '<em><b>Priority Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__PRIORITY_ELEMENTS = SOFTWARE_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Stack Size Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__STACK_SIZE_ELEMENTS = SOFTWARE_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Heap Size Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__HEAP_SIZE_ELEMENTS = SOFTWARE_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Shared Data Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__SHARED_DATA_RESOURCES = SOFTWARE_CONCURRENT_RESOURCE__SHARED_DATA_RESOURCES;

	/**
	 * The feature id for the '<em><b>Message Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__MESSAGE_RESOURCES = SOFTWARE_CONCURRENT_RESOURCE__MESSAGE_RESOURCES;

	/**
	 * The feature id for the '<em><b>Mutual Exclusion Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES = SOFTWARE_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES;

	/**
	 * The feature id for the '<em><b>Notification Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__NOTIFICATION_RESOURCES = SOFTWARE_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES;

	/**
	 * The feature id for the '<em><b>Entry Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__ENTRY_POINTS = SOFTWARE_CONCURRENT_RESOURCE__ENTRY_POINTS;

	/**
	 * The feature id for the '<em><b>Arrival Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__ARRIVAL_PATTERN = SOFTWARE_CONCURRENT_RESOURCE__ARRIVAL_PATTERN;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__KIND = SOFTWARE_CONCURRENT_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Maskable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__IS_MASKABLE = SOFTWARE_CONCURRENT_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Routine Connect Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__ROUTINE_CONNECT_SERVICES = SOFTWARE_CONCURRENT_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Routine Disconnect Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__ROUTINE_DISCONNECT_SERVICES = SOFTWARE_CONCURRENT_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mask Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__MASK_ELEMENTS = SOFTWARE_CONCURRENT_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vector Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__VECTOR_ELEMENTS = SOFTWARE_CONCURRENT_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Isr Entry Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE__ISR_ENTRY_POINTS = SOFTWARE_CONCURRENT_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Interrupt Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE_FEATURE_COUNT = SOFTWARE_CONCURRENT_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE___GET_EANNOTATION__STRING = SOFTWARE_CONCURRENT_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Interrupt Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_RESOURCE_OPERATION_COUNT = SOFTWARE_CONCURRENT_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl <em>Software Schedulable Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareSchedulableResource()
	 * @generated
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE = 20;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.MemoryPartitionImpl <em>Memory Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.MemoryPartitionImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getMemoryPartition()
	 * @generated
	 */
	int MEMORY_PARTITION = 4;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.AlarmImpl <em>Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.AlarmImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getAlarm()
	 * @generated
	 */
	int ALARM = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__EANNOTATIONS = INTERRUPT_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__NAME = INTERRUPT_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__OWNED_RESOURCE = INTERRUPT_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__RES_MULT = INTERRUPT_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__IS_PROTECTED = INTERRUPT_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__IS_ACTIVE = INTERRUPT_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__OWNED_PORT = INTERRUPT_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__OWNED_CONNECTOR = INTERRUPT_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__RSERVICES = INTERRUPT_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__USED_BY = INTERRUPT_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__PSERVICES = INTERRUPT_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__MANAGED_RESOURCE = INTERRUPT_RESOURCE__MANAGED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__RES_CTRL_POLICY = INTERRUPT_RESOURCE__RES_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Create Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__CREATE_SERVICES = INTERRUPT_RESOURCE__CREATE_SERVICES;

	/**
	 * The feature id for the '<em><b>Delete Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__DELETE_SERVICES = INTERRUPT_RESOURCE__DELETE_SERVICES;

	/**
	 * The feature id for the '<em><b>Initialize Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__INITIALIZE_SERVICES = INTERRUPT_RESOURCE__INITIALIZE_SERVICES;

	/**
	 * The feature id for the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__MEMORY_SIZE_FOOTPRINT = INTERRUPT_RESOURCE__MEMORY_SIZE_FOOTPRINT;

	/**
	 * The feature id for the '<em><b>State Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__STATE_ELEMENTS = INTERRUPT_RESOURCE__STATE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Identifier Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__IDENTIFIER_ELEMENTS = INTERRUPT_RESOURCE__IDENTIFIER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Activate Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ACTIVATE_SERVICES = INTERRUPT_RESOURCE__ACTIVATE_SERVICES;

	/**
	 * The feature id for the '<em><b>Resume Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__RESUME_SERVICES = INTERRUPT_RESOURCE__RESUME_SERVICES;

	/**
	 * The feature id for the '<em><b>Suspend Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__SUSPEND_SERVICES = INTERRUPT_RESOURCE__SUSPEND_SERVICES;

	/**
	 * The feature id for the '<em><b>Enable Concurrency Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ENABLE_CONCURRENCY_SERVICES = INTERRUPT_RESOURCE__ENABLE_CONCURRENCY_SERVICES;

	/**
	 * The feature id for the '<em><b>Disable Concurrency Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__DISABLE_CONCURRENCY_SERVICES = INTERRUPT_RESOURCE__DISABLE_CONCURRENCY_SERVICES;

	/**
	 * The feature id for the '<em><b>Terminate Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__TERMINATE_SERVICES = INTERRUPT_RESOURCE__TERMINATE_SERVICES;

	/**
	 * The feature id for the '<em><b>Adress Space</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ADRESS_SPACE = INTERRUPT_RESOURCE__ADRESS_SPACE;

	/**
	 * The feature id for the '<em><b>Period Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__PERIOD_ELEMENTS = INTERRUPT_RESOURCE__PERIOD_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Activation Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ACTIVATION_CAPACITY = INTERRUPT_RESOURCE__ACTIVATION_CAPACITY;

	/**
	 * The feature id for the '<em><b>Priority Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__PRIORITY_ELEMENTS = INTERRUPT_RESOURCE__PRIORITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Stack Size Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__STACK_SIZE_ELEMENTS = INTERRUPT_RESOURCE__STACK_SIZE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Heap Size Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__HEAP_SIZE_ELEMENTS = INTERRUPT_RESOURCE__HEAP_SIZE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Shared Data Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__SHARED_DATA_RESOURCES = INTERRUPT_RESOURCE__SHARED_DATA_RESOURCES;

	/**
	 * The feature id for the '<em><b>Message Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__MESSAGE_RESOURCES = INTERRUPT_RESOURCE__MESSAGE_RESOURCES;

	/**
	 * The feature id for the '<em><b>Mutual Exclusion Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__MUTUAL_EXCLUSION_RESOURCES = INTERRUPT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES;

	/**
	 * The feature id for the '<em><b>Notification Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__NOTIFICATION_RESOURCES = INTERRUPT_RESOURCE__NOTIFICATION_RESOURCES;

	/**
	 * The feature id for the '<em><b>Entry Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ENTRY_POINTS = INTERRUPT_RESOURCE__ENTRY_POINTS;

	/**
	 * The feature id for the '<em><b>Arrival Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ARRIVAL_PATTERN = INTERRUPT_RESOURCE__ARRIVAL_PATTERN;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__KIND = INTERRUPT_RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Is Maskable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__IS_MASKABLE = INTERRUPT_RESOURCE__IS_MASKABLE;

	/**
	 * The feature id for the '<em><b>Routine Connect Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ROUTINE_CONNECT_SERVICES = INTERRUPT_RESOURCE__ROUTINE_CONNECT_SERVICES;

	/**
	 * The feature id for the '<em><b>Routine Disconnect Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ROUTINE_DISCONNECT_SERVICES = INTERRUPT_RESOURCE__ROUTINE_DISCONNECT_SERVICES;

	/**
	 * The feature id for the '<em><b>Mask Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__MASK_ELEMENTS = INTERRUPT_RESOURCE__MASK_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Vector Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__VECTOR_ELEMENTS = INTERRUPT_RESOURCE__VECTOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Isr Entry Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ISR_ENTRY_POINTS = INTERRUPT_RESOURCE__ISR_ENTRY_POINTS;

	/**
	 * The feature id for the '<em><b>Timers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__TIMERS = INTERRUPT_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Watchdog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__IS_WATCHDOG = INTERRUPT_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_FEATURE_COUNT = INTERRUPT_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM___GET_EANNOTATION__STRING = INTERRUPT_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_OPERATION_COUNT = INTERRUPT_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareTimerResourceImpl <em>Software Timer Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareTimerResourceImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareTimerResource()
	 * @generated
	 */
	int SOFTWARE_TIMER_RESOURCE = 24;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl <em>Software Interaction Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareInteractionResource()
	 * @generated
	 */
	int SOFTWARE_INTERACTION_RESOURCE = 13;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareCommunicationResourceImpl <em>Software Communication Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareCommunicationResourceImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareCommunicationResource()
	 * @generated
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE = 10;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSynchronizationResourceImpl <em>Software Synchronization Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareSynchronizationResourceImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareSynchronizationResource()
	 * @generated
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE = 23;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareMutualExclusionResourceImpl <em>Software Mutual Exclusion Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareMutualExclusionResourceImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareMutualExclusionResource()
	 * @generated
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE = 16;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.NotificationResourceImpl <em>Notification Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.NotificationResourceImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getNotificationResource()
	 * @generated
	 */
	int NOTIFICATION_RESOURCE = 6;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SharedDataComResourceImpl <em>Shared Data Com Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SharedDataComResourceImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSharedDataComResource()
	 * @generated
	 */
	int SHARED_DATA_COM_RESOURCE = 7;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.MessageComResourceImpl <em>Message Com Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.MessageComResourceImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getMessageComResource()
	 * @generated
	 */
	int MESSAGE_COM_RESOURCE = 5;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl <em>Device Broker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getDeviceBroker()
	 * @generated
	 */
	int DEVICE_BROKER = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__EANNOTATIONS = GrmPackage.RESOURCE_BROKER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__NAME = GrmPackage.RESOURCE_BROKER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__OWNED_RESOURCE = GrmPackage.RESOURCE_BROKER__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__RES_MULT = GrmPackage.RESOURCE_BROKER__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__IS_PROTECTED = GrmPackage.RESOURCE_BROKER__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__IS_ACTIVE = GrmPackage.RESOURCE_BROKER__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__OWNED_PORT = GrmPackage.RESOURCE_BROKER__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__OWNED_CONNECTOR = GrmPackage.RESOURCE_BROKER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__RSERVICES = GrmPackage.RESOURCE_BROKER__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__USED_BY = GrmPackage.RESOURCE_BROKER__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__PSERVICES = GrmPackage.RESOURCE_BROKER__PSERVICES;

	/**
	 * The feature id for the '<em><b>Broked Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__BROKED_RESOURCE = GrmPackage.RESOURCE_BROKER__BROKED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Acc Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__ACC_CTRL_POLICY = GrmPackage.RESOURCE_BROKER__ACC_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__MANAGED_RESOURCE = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__RES_CTRL_POLICY = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Create Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__CREATE_SERVICES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delete Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__DELETE_SERVICES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initialize Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__INITIALIZE_SERVICES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__MEMORY_SIZE_FOOTPRINT = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>State Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__STATE_ELEMENTS = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Identifier Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__IDENTIFIER_ELEMENTS = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__DEVICES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Access Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__ACCESS_POLICY = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Buffered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__IS_BUFFERED = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Close Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__CLOSE_SERVICES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Open Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__OPEN_SERVICES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Control Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__CONTROL_SERVICES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Read Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__READ_SERVICES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Write Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER__WRITE_SERVICES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Device Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER_FEATURE_COUNT = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER___GET_EANNOTATION__STRING = GrmPackage.RESOURCE_BROKER___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Device Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_BROKER_OPERATION_COUNT = GrmPackage.RESOURCE_BROKER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl <em>Memory Broker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getMemoryBroker()
	 * @generated
	 */
	int MEMORY_BROKER = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__EANNOTATIONS = GrmPackage.RESOURCE_BROKER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__NAME = GrmPackage.RESOURCE_BROKER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__OWNED_RESOURCE = GrmPackage.RESOURCE_BROKER__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__RES_MULT = GrmPackage.RESOURCE_BROKER__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__IS_PROTECTED = GrmPackage.RESOURCE_BROKER__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__IS_ACTIVE = GrmPackage.RESOURCE_BROKER__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__OWNED_PORT = GrmPackage.RESOURCE_BROKER__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__OWNED_CONNECTOR = GrmPackage.RESOURCE_BROKER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__RSERVICES = GrmPackage.RESOURCE_BROKER__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__USED_BY = GrmPackage.RESOURCE_BROKER__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__PSERVICES = GrmPackage.RESOURCE_BROKER__PSERVICES;

	/**
	 * The feature id for the '<em><b>Broked Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__BROKED_RESOURCE = GrmPackage.RESOURCE_BROKER__BROKED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Acc Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__ACC_CTRL_POLICY = GrmPackage.RESOURCE_BROKER__ACC_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__MANAGED_RESOURCE = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__RES_CTRL_POLICY = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Create Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__CREATE_SERVICES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delete Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__DELETE_SERVICES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initialize Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__INITIALIZE_SERVICES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__MEMORY_SIZE_FOOTPRINT = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>State Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__STATE_ELEMENTS = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Identifier Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__IDENTIFIER_ELEMENTS = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Lock Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__LOCK_SERVICES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Unlock Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__UNLOCK_SERVICES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Map Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__MAP_SERVICES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Unmap Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__UNMAP_SERVICES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Memories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__MEMORIES = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Access Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__ACCESS_POLICY = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Memory Block Address Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__MEMORY_BLOCK_ADDRESS_ELEMENTS = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Memory Block Size Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER__MEMORY_BLOCK_SIZE_ELEMENTS = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Memory Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER_FEATURE_COUNT = GrmPackage.RESOURCE_BROKER_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER___GET_EANNOTATION__STRING = GrmPackage.RESOURCE_BROKER___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Memory Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BROKER_OPERATION_COUNT = GrmPackage.RESOURCE_BROKER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__EANNOTATIONS = SOFTWARE_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__NAME = SOFTWARE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__OWNED_RESOURCE = SOFTWARE_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__RES_MULT = SOFTWARE_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__IS_PROTECTED = SOFTWARE_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__IS_ACTIVE = SOFTWARE_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__OWNED_PORT = SOFTWARE_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__OWNED_CONNECTOR = SOFTWARE_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__RSERVICES = SOFTWARE_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__USED_BY = SOFTWARE_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__PSERVICES = SOFTWARE_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__MANAGED_RESOURCE = SOFTWARE_RESOURCE__MANAGED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__RES_CTRL_POLICY = SOFTWARE_RESOURCE__RES_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Create Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__CREATE_SERVICES = SOFTWARE_RESOURCE__CREATE_SERVICES;

	/**
	 * The feature id for the '<em><b>Delete Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__DELETE_SERVICES = SOFTWARE_RESOURCE__DELETE_SERVICES;

	/**
	 * The feature id for the '<em><b>Initialize Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__INITIALIZE_SERVICES = SOFTWARE_RESOURCE__INITIALIZE_SERVICES;

	/**
	 * The feature id for the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__MEMORY_SIZE_FOOTPRINT = SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT;

	/**
	 * The feature id for the '<em><b>State Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__STATE_ELEMENTS = SOFTWARE_RESOURCE__STATE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Identifier Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__IDENTIFIER_ELEMENTS = SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Concurrent Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__CONCURRENT_RESOURCES = SOFTWARE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fork Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__FORK_SERVICES = SOFTWARE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exit Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__EXIT_SERVICES = SOFTWARE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Memory Spaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION__MEMORY_SPACES = SOFTWARE_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Memory Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION_FEATURE_COUNT = SOFTWARE_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION___GET_EANNOTATION__STRING = SOFTWARE_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Memory Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION_OPERATION_COUNT = SOFTWARE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__EANNOTATIONS = GrmPackage.COMMUNICATION_END_POINT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__NAME = GrmPackage.COMMUNICATION_END_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__OWNED_RESOURCE = GrmPackage.COMMUNICATION_END_POINT__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__RES_MULT = GrmPackage.COMMUNICATION_END_POINT__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__IS_PROTECTED = GrmPackage.COMMUNICATION_END_POINT__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__IS_ACTIVE = GrmPackage.COMMUNICATION_END_POINT__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__OWNED_PORT = GrmPackage.COMMUNICATION_END_POINT__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__OWNED_CONNECTOR = GrmPackage.COMMUNICATION_END_POINT__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__RSERVICES = GrmPackage.COMMUNICATION_END_POINT__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__USED_BY = GrmPackage.COMMUNICATION_END_POINT__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__PSERVICES = GrmPackage.COMMUNICATION_END_POINT__PSERVICES;

	/**
	 * The feature id for the '<em><b>Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__PACKET_SIZE = GrmPackage.COMMUNICATION_END_POINT__PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__MANAGED_RESOURCE = GrmPackage.COMMUNICATION_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__RES_CTRL_POLICY = GrmPackage.COMMUNICATION_END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Create Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__CREATE_SERVICES = GrmPackage.COMMUNICATION_END_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delete Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__DELETE_SERVICES = GrmPackage.COMMUNICATION_END_POINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initialize Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__INITIALIZE_SERVICES = GrmPackage.COMMUNICATION_END_POINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__MEMORY_SIZE_FOOTPRINT = GrmPackage.COMMUNICATION_END_POINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>State Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__STATE_ELEMENTS = GrmPackage.COMMUNICATION_END_POINT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Identifier Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__IDENTIFIER_ELEMENTS = GrmPackage.COMMUNICATION_END_POINT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Intra Memory Partition Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION = GrmPackage.COMMUNICATION_END_POINT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Waiting Queue Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY = GrmPackage.COMMUNICATION_END_POINT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Waiting Queue Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY = GrmPackage.COMMUNICATION_END_POINT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Waiting Policy Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS = GrmPackage.COMMUNICATION_END_POINT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Software Interaction Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE_FEATURE_COUNT = GrmPackage.COMMUNICATION_END_POINT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE___GET_EANNOTATION__STRING = GrmPackage.COMMUNICATION_END_POINT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Software Interaction Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERACTION_RESOURCE_OPERATION_COUNT = GrmPackage.COMMUNICATION_END_POINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__EANNOTATIONS = SOFTWARE_INTERACTION_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__NAME = SOFTWARE_INTERACTION_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__OWNED_RESOURCE = SOFTWARE_INTERACTION_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__RES_MULT = SOFTWARE_INTERACTION_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__IS_PROTECTED = SOFTWARE_INTERACTION_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__IS_ACTIVE = SOFTWARE_INTERACTION_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__OWNED_PORT = SOFTWARE_INTERACTION_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__OWNED_CONNECTOR = SOFTWARE_INTERACTION_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__RSERVICES = SOFTWARE_INTERACTION_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__USED_BY = SOFTWARE_INTERACTION_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__PSERVICES = SOFTWARE_INTERACTION_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__PACKET_SIZE = SOFTWARE_INTERACTION_RESOURCE__PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__MANAGED_RESOURCE = SOFTWARE_INTERACTION_RESOURCE__MANAGED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__RES_CTRL_POLICY = SOFTWARE_INTERACTION_RESOURCE__RES_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Create Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__CREATE_SERVICES = SOFTWARE_INTERACTION_RESOURCE__CREATE_SERVICES;

	/**
	 * The feature id for the '<em><b>Delete Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__DELETE_SERVICES = SOFTWARE_INTERACTION_RESOURCE__DELETE_SERVICES;

	/**
	 * The feature id for the '<em><b>Initialize Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__INITIALIZE_SERVICES = SOFTWARE_INTERACTION_RESOURCE__INITIALIZE_SERVICES;

	/**
	 * The feature id for the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__MEMORY_SIZE_FOOTPRINT = SOFTWARE_INTERACTION_RESOURCE__MEMORY_SIZE_FOOTPRINT;

	/**
	 * The feature id for the '<em><b>State Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__STATE_ELEMENTS = SOFTWARE_INTERACTION_RESOURCE__STATE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Identifier Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__IDENTIFIER_ELEMENTS = SOFTWARE_INTERACTION_RESOURCE__IDENTIFIER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Is Intra Memory Partition Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION = SOFTWARE_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION;

	/**
	 * The feature id for the '<em><b>Waiting Queue Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__WAITING_QUEUE_POLICY = SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY;

	/**
	 * The feature id for the '<em><b>Waiting Queue Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__WAITING_QUEUE_CAPACITY = SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY;

	/**
	 * The feature id for the '<em><b>Waiting Policy Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__WAITING_POLICY_ELEMENTS = SOFTWARE_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__SPEED_FACTOR = SOFTWARE_INTERACTION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__MAIN_SCHEDULER = SOFTWARE_INTERACTION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__ELEMENT_SIZE = SOFTWARE_INTERACTION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__CAPACITY = SOFTWARE_INTERACTION_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Packet Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__PACKET_TIME = SOFTWARE_INTERACTION_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__BLOCKING_TIME = SOFTWARE_INTERACTION_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Transm Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE__TRANSM_MODE = SOFTWARE_INTERACTION_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Software Communication Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT = SOFTWARE_INTERACTION_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE___GET_EANNOTATION__STRING = SOFTWARE_INTERACTION_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Software Communication Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMMUNICATION_RESOURCE_OPERATION_COUNT = SOFTWARE_INTERACTION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__EANNOTATIONS = SOFTWARE_COMMUNICATION_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__NAME = SOFTWARE_COMMUNICATION_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__OWNED_RESOURCE = SOFTWARE_COMMUNICATION_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__RES_MULT = SOFTWARE_COMMUNICATION_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__IS_PROTECTED = SOFTWARE_COMMUNICATION_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__IS_ACTIVE = SOFTWARE_COMMUNICATION_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__OWNED_PORT = SOFTWARE_COMMUNICATION_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__OWNED_CONNECTOR = SOFTWARE_COMMUNICATION_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__RSERVICES = SOFTWARE_COMMUNICATION_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__USED_BY = SOFTWARE_COMMUNICATION_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__PSERVICES = SOFTWARE_COMMUNICATION_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__PACKET_SIZE = SOFTWARE_COMMUNICATION_RESOURCE__PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__MANAGED_RESOURCE = SOFTWARE_COMMUNICATION_RESOURCE__MANAGED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__RES_CTRL_POLICY = SOFTWARE_COMMUNICATION_RESOURCE__RES_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Create Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__CREATE_SERVICES = SOFTWARE_COMMUNICATION_RESOURCE__CREATE_SERVICES;

	/**
	 * The feature id for the '<em><b>Delete Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__DELETE_SERVICES = SOFTWARE_COMMUNICATION_RESOURCE__DELETE_SERVICES;

	/**
	 * The feature id for the '<em><b>Initialize Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__INITIALIZE_SERVICES = SOFTWARE_COMMUNICATION_RESOURCE__INITIALIZE_SERVICES;

	/**
	 * The feature id for the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__MEMORY_SIZE_FOOTPRINT = SOFTWARE_COMMUNICATION_RESOURCE__MEMORY_SIZE_FOOTPRINT;

	/**
	 * The feature id for the '<em><b>State Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__STATE_ELEMENTS = SOFTWARE_COMMUNICATION_RESOURCE__STATE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Identifier Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__IDENTIFIER_ELEMENTS = SOFTWARE_COMMUNICATION_RESOURCE__IDENTIFIER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Is Intra Memory Partition Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION = SOFTWARE_COMMUNICATION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION;

	/**
	 * The feature id for the '<em><b>Waiting Queue Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__WAITING_QUEUE_POLICY = SOFTWARE_COMMUNICATION_RESOURCE__WAITING_QUEUE_POLICY;

	/**
	 * The feature id for the '<em><b>Waiting Queue Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__WAITING_QUEUE_CAPACITY = SOFTWARE_COMMUNICATION_RESOURCE__WAITING_QUEUE_CAPACITY;

	/**
	 * The feature id for the '<em><b>Waiting Policy Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__WAITING_POLICY_ELEMENTS = SOFTWARE_COMMUNICATION_RESOURCE__WAITING_POLICY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__SPEED_FACTOR = SOFTWARE_COMMUNICATION_RESOURCE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__MAIN_SCHEDULER = SOFTWARE_COMMUNICATION_RESOURCE__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__ELEMENT_SIZE = SOFTWARE_COMMUNICATION_RESOURCE__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__CAPACITY = SOFTWARE_COMMUNICATION_RESOURCE__CAPACITY;

	/**
	 * The feature id for the '<em><b>Packet Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__PACKET_TIME = SOFTWARE_COMMUNICATION_RESOURCE__PACKET_TIME;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__BLOCKING_TIME = SOFTWARE_COMMUNICATION_RESOURCE__BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Transm Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__TRANSM_MODE = SOFTWARE_COMMUNICATION_RESOURCE__TRANSM_MODE;

	/**
	 * The feature id for the '<em><b>Send Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__SEND_SERVICES = SOFTWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receive Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__RECEIVE_SERVICES = SOFTWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Fixed Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__IS_FIXED_MESSAGE_SIZE = SOFTWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Size Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__MESSAGE_SIZE_ELEMENTS = SOFTWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__MECHANISM = SOFTWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Message Queue Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_POLICY = SOFTWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Message Queue Capacity Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_CAPACITY_ELEMENTS = SOFTWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Message Com Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE_FEATURE_COUNT = SOFTWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE___GET_EANNOTATION__STRING = SOFTWARE_COMMUNICATION_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Message Com Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COM_RESOURCE_OPERATION_COUNT = SOFTWARE_COMMUNICATION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__EANNOTATIONS = SOFTWARE_INTERACTION_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__NAME = SOFTWARE_INTERACTION_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__OWNED_RESOURCE = SOFTWARE_INTERACTION_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__RES_MULT = SOFTWARE_INTERACTION_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__IS_PROTECTED = SOFTWARE_INTERACTION_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__IS_ACTIVE = SOFTWARE_INTERACTION_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__OWNED_PORT = SOFTWARE_INTERACTION_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__OWNED_CONNECTOR = SOFTWARE_INTERACTION_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__RSERVICES = SOFTWARE_INTERACTION_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__USED_BY = SOFTWARE_INTERACTION_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__PSERVICES = SOFTWARE_INTERACTION_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__PACKET_SIZE = SOFTWARE_INTERACTION_RESOURCE__PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__MANAGED_RESOURCE = SOFTWARE_INTERACTION_RESOURCE__MANAGED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__RES_CTRL_POLICY = SOFTWARE_INTERACTION_RESOURCE__RES_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Create Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__CREATE_SERVICES = SOFTWARE_INTERACTION_RESOURCE__CREATE_SERVICES;

	/**
	 * The feature id for the '<em><b>Delete Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__DELETE_SERVICES = SOFTWARE_INTERACTION_RESOURCE__DELETE_SERVICES;

	/**
	 * The feature id for the '<em><b>Initialize Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__INITIALIZE_SERVICES = SOFTWARE_INTERACTION_RESOURCE__INITIALIZE_SERVICES;

	/**
	 * The feature id for the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__MEMORY_SIZE_FOOTPRINT = SOFTWARE_INTERACTION_RESOURCE__MEMORY_SIZE_FOOTPRINT;

	/**
	 * The feature id for the '<em><b>State Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__STATE_ELEMENTS = SOFTWARE_INTERACTION_RESOURCE__STATE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Identifier Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__IDENTIFIER_ELEMENTS = SOFTWARE_INTERACTION_RESOURCE__IDENTIFIER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Is Intra Memory Partition Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION = SOFTWARE_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION;

	/**
	 * The feature id for the '<em><b>Waiting Queue Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__WAITING_QUEUE_POLICY = SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY;

	/**
	 * The feature id for the '<em><b>Waiting Queue Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__WAITING_QUEUE_CAPACITY = SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY;

	/**
	 * The feature id for the '<em><b>Waiting Policy Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE__WAITING_POLICY_ELEMENTS = SOFTWARE_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Software Synchronization Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT = SOFTWARE_INTERACTION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE___GET_EANNOTATION__STRING = SOFTWARE_INTERACTION_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Software Synchronization Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYNCHRONIZATION_RESOURCE_OPERATION_COUNT = SOFTWARE_INTERACTION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__EANNOTATIONS = SOFTWARE_SYNCHRONIZATION_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__NAME = SOFTWARE_SYNCHRONIZATION_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__OWNED_RESOURCE = SOFTWARE_SYNCHRONIZATION_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__RES_MULT = SOFTWARE_SYNCHRONIZATION_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__IS_PROTECTED = SOFTWARE_SYNCHRONIZATION_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__IS_ACTIVE = SOFTWARE_SYNCHRONIZATION_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__OWNED_PORT = SOFTWARE_SYNCHRONIZATION_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__OWNED_CONNECTOR = SOFTWARE_SYNCHRONIZATION_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__RSERVICES = SOFTWARE_SYNCHRONIZATION_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__USED_BY = SOFTWARE_SYNCHRONIZATION_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__PSERVICES = SOFTWARE_SYNCHRONIZATION_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__PACKET_SIZE = SOFTWARE_SYNCHRONIZATION_RESOURCE__PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__MANAGED_RESOURCE = SOFTWARE_SYNCHRONIZATION_RESOURCE__MANAGED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__RES_CTRL_POLICY = SOFTWARE_SYNCHRONIZATION_RESOURCE__RES_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Create Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__CREATE_SERVICES = SOFTWARE_SYNCHRONIZATION_RESOURCE__CREATE_SERVICES;

	/**
	 * The feature id for the '<em><b>Delete Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__DELETE_SERVICES = SOFTWARE_SYNCHRONIZATION_RESOURCE__DELETE_SERVICES;

	/**
	 * The feature id for the '<em><b>Initialize Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__INITIALIZE_SERVICES = SOFTWARE_SYNCHRONIZATION_RESOURCE__INITIALIZE_SERVICES;

	/**
	 * The feature id for the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__MEMORY_SIZE_FOOTPRINT = SOFTWARE_SYNCHRONIZATION_RESOURCE__MEMORY_SIZE_FOOTPRINT;

	/**
	 * The feature id for the '<em><b>State Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__STATE_ELEMENTS = SOFTWARE_SYNCHRONIZATION_RESOURCE__STATE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Identifier Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__IDENTIFIER_ELEMENTS = SOFTWARE_SYNCHRONIZATION_RESOURCE__IDENTIFIER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Is Intra Memory Partition Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION = SOFTWARE_SYNCHRONIZATION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION;

	/**
	 * The feature id for the '<em><b>Waiting Queue Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__WAITING_QUEUE_POLICY = SOFTWARE_SYNCHRONIZATION_RESOURCE__WAITING_QUEUE_POLICY;

	/**
	 * The feature id for the '<em><b>Waiting Queue Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__WAITING_QUEUE_CAPACITY = SOFTWARE_SYNCHRONIZATION_RESOURCE__WAITING_QUEUE_CAPACITY;

	/**
	 * The feature id for the '<em><b>Waiting Policy Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__WAITING_POLICY_ELEMENTS = SOFTWARE_SYNCHRONIZATION_RESOURCE__WAITING_POLICY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Flush Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__FLUSH_SERVICES = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__SIGNAL_SERVICES = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wait Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__WAIT_SERVICES = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clear Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__CLEAR_SERVICES = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__POLICY = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__MECHANISM = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Occurence Count Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__OCCURENCE_COUNT_ELEMENTS = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mask Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE__MASK_ELEMENTS = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Notification Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE_FEATURE_COUNT = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE___GET_EANNOTATION__STRING = SOFTWARE_SYNCHRONIZATION_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Notification Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_RESOURCE_OPERATION_COUNT = SOFTWARE_SYNCHRONIZATION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__EANNOTATIONS = SOFTWARE_COMMUNICATION_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__NAME = SOFTWARE_COMMUNICATION_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__OWNED_RESOURCE = SOFTWARE_COMMUNICATION_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__RES_MULT = SOFTWARE_COMMUNICATION_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__IS_PROTECTED = SOFTWARE_COMMUNICATION_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__IS_ACTIVE = SOFTWARE_COMMUNICATION_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__OWNED_PORT = SOFTWARE_COMMUNICATION_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__OWNED_CONNECTOR = SOFTWARE_COMMUNICATION_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__RSERVICES = SOFTWARE_COMMUNICATION_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__USED_BY = SOFTWARE_COMMUNICATION_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__PSERVICES = SOFTWARE_COMMUNICATION_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__PACKET_SIZE = SOFTWARE_COMMUNICATION_RESOURCE__PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__MANAGED_RESOURCE = SOFTWARE_COMMUNICATION_RESOURCE__MANAGED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__RES_CTRL_POLICY = SOFTWARE_COMMUNICATION_RESOURCE__RES_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Create Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__CREATE_SERVICES = SOFTWARE_COMMUNICATION_RESOURCE__CREATE_SERVICES;

	/**
	 * The feature id for the '<em><b>Delete Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__DELETE_SERVICES = SOFTWARE_COMMUNICATION_RESOURCE__DELETE_SERVICES;

	/**
	 * The feature id for the '<em><b>Initialize Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__INITIALIZE_SERVICES = SOFTWARE_COMMUNICATION_RESOURCE__INITIALIZE_SERVICES;

	/**
	 * The feature id for the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__MEMORY_SIZE_FOOTPRINT = SOFTWARE_COMMUNICATION_RESOURCE__MEMORY_SIZE_FOOTPRINT;

	/**
	 * The feature id for the '<em><b>State Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__STATE_ELEMENTS = SOFTWARE_COMMUNICATION_RESOURCE__STATE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Identifier Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__IDENTIFIER_ELEMENTS = SOFTWARE_COMMUNICATION_RESOURCE__IDENTIFIER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Is Intra Memory Partition Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION = SOFTWARE_COMMUNICATION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION;

	/**
	 * The feature id for the '<em><b>Waiting Queue Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__WAITING_QUEUE_POLICY = SOFTWARE_COMMUNICATION_RESOURCE__WAITING_QUEUE_POLICY;

	/**
	 * The feature id for the '<em><b>Waiting Queue Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__WAITING_QUEUE_CAPACITY = SOFTWARE_COMMUNICATION_RESOURCE__WAITING_QUEUE_CAPACITY;

	/**
	 * The feature id for the '<em><b>Waiting Policy Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__WAITING_POLICY_ELEMENTS = SOFTWARE_COMMUNICATION_RESOURCE__WAITING_POLICY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__SPEED_FACTOR = SOFTWARE_COMMUNICATION_RESOURCE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__MAIN_SCHEDULER = SOFTWARE_COMMUNICATION_RESOURCE__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__ELEMENT_SIZE = SOFTWARE_COMMUNICATION_RESOURCE__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__CAPACITY = SOFTWARE_COMMUNICATION_RESOURCE__CAPACITY;

	/**
	 * The feature id for the '<em><b>Packet Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__PACKET_TIME = SOFTWARE_COMMUNICATION_RESOURCE__PACKET_TIME;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__BLOCKING_TIME = SOFTWARE_COMMUNICATION_RESOURCE__BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Transm Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__TRANSM_MODE = SOFTWARE_COMMUNICATION_RESOURCE__TRANSM_MODE;

	/**
	 * The feature id for the '<em><b>Read Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__READ_SERVICES = SOFTWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Write Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE__WRITE_SERVICES = SOFTWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shared Data Com Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE_FEATURE_COUNT = SOFTWARE_COMMUNICATION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE___GET_EANNOTATION__STRING = SOFTWARE_COMMUNICATION_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Shared Data Com Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DATA_COM_RESOURCE_OPERATION_COUNT = SOFTWARE_COMMUNICATION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACCESS_SERVICE__EANNOTATIONS = GrmPackage.RESOURCE_SERVICE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACCESS_SERVICE__NAME = GrmPackage.RESOURCE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACCESS_SERVICE__CONTEXT = GrmPackage.RESOURCE_SERVICE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACCESS_SERVICE__IS_MODIFIER = GrmPackage.RESOURCE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accessed Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACCESS_SERVICE__ACCESSED_ELEMENT = GrmPackage.RESOURCE_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Software Access Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACCESS_SERVICE_FEATURE_COUNT = GrmPackage.RESOURCE_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACCESS_SERVICE___GET_EANNOTATION__STRING = GrmPackage.RESOURCE_SERVICE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Software Access Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACCESS_SERVICE_OPERATION_COUNT = GrmPackage.RESOURCE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulerImpl <em>Software Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulerImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareScheduler()
	 * @generated
	 */
	int SOFTWARE_SCHEDULER = 21;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwarePortImpl <em>Software Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwarePortImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwarePort()
	 * @generated
	 */
	int SOFTWARE_PORT = 17;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareServiceImpl <em>Software Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareServiceImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareService()
	 * @generated
	 */
	int SOFTWARE_SERVICE = 22;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInterfaceImpl <em>Software Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareInterfaceImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareInterface()
	 * @generated
	 */
	int SOFTWARE_INTERFACE = 14;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareArchitectureImpl <em>Software Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareArchitectureImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareArchitecture()
	 * @generated
	 */
	int SOFTWARE_ARCHITECTURE = 9;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__EANNOTATIONS = SOFTWARE_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__NAME = SOFTWARE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__OWNED_RESOURCE = SOFTWARE_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__RES_MULT = SOFTWARE_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__IS_PROTECTED = SOFTWARE_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__IS_ACTIVE = SOFTWARE_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__OWNED_PORT = SOFTWARE_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__OWNED_CONNECTOR = SOFTWARE_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__RSERVICES = SOFTWARE_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__USED_BY = SOFTWARE_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__PSERVICES = SOFTWARE_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__MANAGED_RESOURCE = SOFTWARE_RESOURCE__MANAGED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__RES_CTRL_POLICY = SOFTWARE_RESOURCE__RES_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Create Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__CREATE_SERVICES = SOFTWARE_RESOURCE__CREATE_SERVICES;

	/**
	 * The feature id for the '<em><b>Delete Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__DELETE_SERVICES = SOFTWARE_RESOURCE__DELETE_SERVICES;

	/**
	 * The feature id for the '<em><b>Initialize Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__INITIALIZE_SERVICES = SOFTWARE_RESOURCE__INITIALIZE_SERVICES;

	/**
	 * The feature id for the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__MEMORY_SIZE_FOOTPRINT = SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT;

	/**
	 * The feature id for the '<em><b>State Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__STATE_ELEMENTS = SOFTWARE_RESOURCE__STATE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Identifier Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE__IDENTIFIER_ELEMENTS = SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Software Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE_FEATURE_COUNT = SOFTWARE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE___GET_EANNOTATION__STRING = SOFTWARE_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Software Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ARCHITECTURE_OPERATION_COUNT = SOFTWARE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConnectorImpl <em>Software Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareConnectorImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareConnector()
	 * @generated
	 */
	int SOFTWARE_CONNECTOR = 12;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONNECTOR__SOURCE_PORT = GrmPackage.RESOURCE_CONNECTOR__SOURCE_PORT;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONNECTOR__TARGET_PORT = GrmPackage.RESOURCE_CONNECTOR__TARGET_PORT;

	/**
	 * The number of structural features of the '<em>Software Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONNECTOR_FEATURE_COUNT = GrmPackage.RESOURCE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Software Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONNECTOR_OPERATION_COUNT = GrmPackage.RESOURCE_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE__EANNOTATIONS = GrmPackage.RESOURCE_INTERFACE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE__NAME = GrmPackage.RESOURCE_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE__OWNED_SERVICE = GrmPackage.RESOURCE_INTERFACE__OWNED_SERVICE;

	/**
	 * The number of structural features of the '<em>Software Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE_FEATURE_COUNT = GrmPackage.RESOURCE_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE___GET_EANNOTATION__STRING = GrmPackage.RESOURCE_INTERFACE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Software Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE_OPERATION_COUNT = GrmPackage.RESOURCE_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareResourcePackageImpl <em>Software Resource Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareResourcePackageImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareResourcePackage()
	 * @generated
	 */
	int SOFTWARE_RESOURCE_PACKAGE = 19;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInterfacePackageImpl <em>Software Interface Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareInterfacePackageImpl
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareInterfacePackage()
	 * @generated
	 */
	int SOFTWARE_INTERFACE_PACKAGE = 15;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE_PACKAGE__EANNOTATIONS = GrmPackage.RESOURCE_PACKAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE_PACKAGE__NAME = GrmPackage.RESOURCE_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE_PACKAGE__OWNED_ELEMENT = GrmPackage.RESOURCE_PACKAGE__OWNED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Software Interface Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE_PACKAGE_FEATURE_COUNT = GrmPackage.RESOURCE_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE_PACKAGE___GET_EANNOTATION__STRING = GrmPackage.RESOURCE_PACKAGE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Software Interface Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE_PACKAGE_OPERATION_COUNT = GrmPackage.RESOURCE_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__EANNOTATIONS = SOFTWARE_SYNCHRONIZATION_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__NAME = SOFTWARE_SYNCHRONIZATION_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__OWNED_RESOURCE = SOFTWARE_SYNCHRONIZATION_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__RES_MULT = SOFTWARE_SYNCHRONIZATION_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__IS_PROTECTED = SOFTWARE_SYNCHRONIZATION_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__IS_ACTIVE = SOFTWARE_SYNCHRONIZATION_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__OWNED_PORT = SOFTWARE_SYNCHRONIZATION_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__OWNED_CONNECTOR = SOFTWARE_SYNCHRONIZATION_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__RSERVICES = SOFTWARE_SYNCHRONIZATION_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__USED_BY = SOFTWARE_SYNCHRONIZATION_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PSERVICES = SOFTWARE_SYNCHRONIZATION_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PACKET_SIZE = SOFTWARE_SYNCHRONIZATION_RESOURCE__PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__MANAGED_RESOURCE = SOFTWARE_SYNCHRONIZATION_RESOURCE__MANAGED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__RES_CTRL_POLICY = SOFTWARE_SYNCHRONIZATION_RESOURCE__RES_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Create Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__CREATE_SERVICES = SOFTWARE_SYNCHRONIZATION_RESOURCE__CREATE_SERVICES;

	/**
	 * The feature id for the '<em><b>Delete Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__DELETE_SERVICES = SOFTWARE_SYNCHRONIZATION_RESOURCE__DELETE_SERVICES;

	/**
	 * The feature id for the '<em><b>Initialize Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__INITIALIZE_SERVICES = SOFTWARE_SYNCHRONIZATION_RESOURCE__INITIALIZE_SERVICES;

	/**
	 * The feature id for the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__MEMORY_SIZE_FOOTPRINT = SOFTWARE_SYNCHRONIZATION_RESOURCE__MEMORY_SIZE_FOOTPRINT;

	/**
	 * The feature id for the '<em><b>State Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__STATE_ELEMENTS = SOFTWARE_SYNCHRONIZATION_RESOURCE__STATE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Identifier Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__IDENTIFIER_ELEMENTS = SOFTWARE_SYNCHRONIZATION_RESOURCE__IDENTIFIER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Is Intra Memory Partition Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION = SOFTWARE_SYNCHRONIZATION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION;

	/**
	 * The feature id for the '<em><b>Waiting Queue Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__WAITING_QUEUE_POLICY = SOFTWARE_SYNCHRONIZATION_RESOURCE__WAITING_QUEUE_POLICY;

	/**
	 * The feature id for the '<em><b>Waiting Queue Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__WAITING_QUEUE_CAPACITY = SOFTWARE_SYNCHRONIZATION_RESOURCE__WAITING_QUEUE_CAPACITY;

	/**
	 * The feature id for the '<em><b>Waiting Policy Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__WAITING_POLICY_ELEMENTS = SOFTWARE_SYNCHRONIZATION_RESOURCE__WAITING_POLICY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__SCHEDULER = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTOCOL = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protect Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Concurrent Access Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__CONCURRENT_ACCESS_PROTOCOL = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__MECHANISM = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Acquire Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACQUIRE_SERVICES = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Release Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__RELEASE_SERVICES = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Access Token Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACCESS_TOKEN_ELEMENTS = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Software Mutual Exclusion Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE_FEATURE_COUNT = SOFTWARE_SYNCHRONIZATION_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE___GET_EANNOTATION__STRING = SOFTWARE_SYNCHRONIZATION_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Software Mutual Exclusion Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MUTUAL_EXCLUSION_RESOURCE_OPERATION_COUNT = SOFTWARE_SYNCHRONIZATION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__EANNOTATIONS = GrmPackage.RESOURCE_PORT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__NAME = GrmPackage.RESOURCE_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__OWNED_RESOURCE = GrmPackage.RESOURCE_PORT__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__RES_MULT = GrmPackage.RESOURCE_PORT__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__IS_PROTECTED = GrmPackage.RESOURCE_PORT__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__IS_ACTIVE = GrmPackage.RESOURCE_PORT__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__OWNED_PORT = GrmPackage.RESOURCE_PORT__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__OWNED_CONNECTOR = GrmPackage.RESOURCE_PORT__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__RSERVICES = GrmPackage.RESOURCE_PORT__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__USED_BY = GrmPackage.RESOURCE_PORT__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__PSERVICES = GrmPackage.RESOURCE_PORT__PSERVICES;

	/**
	 * The feature id for the '<em><b>Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__PACKET_SIZE = GrmPackage.RESOURCE_PORT__PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>PInterface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__PINTERFACE = GrmPackage.RESOURCE_PORT__PINTERFACE;

	/**
	 * The feature id for the '<em><b>RInterface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__RINTERFACE = GrmPackage.RESOURCE_PORT__RINTERFACE;

	/**
	 * The number of structural features of the '<em>Software Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT_FEATURE_COUNT = GrmPackage.RESOURCE_PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT___GET_EANNOTATION__STRING = GrmPackage.RESOURCE_PORT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Software Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT_OPERATION_COUNT = GrmPackage.RESOURCE_PORT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE_PACKAGE__EANNOTATIONS = GrmPackage.RESOURCE_PACKAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE_PACKAGE__NAME = GrmPackage.RESOURCE_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE_PACKAGE__OWNED_ELEMENT = GrmPackage.RESOURCE_PACKAGE__OWNED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Software Resource Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE_PACKAGE_FEATURE_COUNT = GrmPackage.RESOURCE_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE_PACKAGE___GET_EANNOTATION__STRING = GrmPackage.RESOURCE_PACKAGE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Software Resource Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE_PACKAGE_OPERATION_COUNT = GrmPackage.RESOURCE_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__EANNOTATIONS = GrmPackage.SCHEDULABLE_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__NAME = GrmPackage.SCHEDULABLE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__OWNED_RESOURCE = GrmPackage.SCHEDULABLE_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__RES_MULT = GrmPackage.SCHEDULABLE_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__IS_PROTECTED = GrmPackage.SCHEDULABLE_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__IS_ACTIVE = GrmPackage.SCHEDULABLE_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__OWNED_PORT = GrmPackage.SCHEDULABLE_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__OWNED_CONNECTOR = GrmPackage.SCHEDULABLE_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__RSERVICES = GrmPackage.SCHEDULABLE_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__USED_BY = GrmPackage.SCHEDULABLE_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__PSERVICES = GrmPackage.SCHEDULABLE_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Dependent Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER = GrmPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__HOST = GrmPackage.SCHEDULABLE_RESOURCE__HOST;

	/**
	 * The feature id for the '<em><b>Sched Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__SCHED_PARAMS = GrmPackage.SCHEDULABLE_RESOURCE__SCHED_PARAMS;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__MANAGED_RESOURCE = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__RES_CTRL_POLICY = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Create Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__CREATE_SERVICES = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delete Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__DELETE_SERVICES = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initialize Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__INITIALIZE_SERVICES = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__MEMORY_SIZE_FOOTPRINT = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>State Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__STATE_ELEMENTS = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Identifier Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__IDENTIFIER_ELEMENTS = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Activate Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATE_SERVICES = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Resume Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__RESUME_SERVICES = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Suspend Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__SUSPEND_SERVICES = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Enable Concurrency Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__ENABLE_CONCURRENCY_SERVICES = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Disable Concurrency Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__DISABLE_CONCURRENCY_SERVICES = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Terminate Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__TERMINATE_SERVICES = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Adress Space</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__ADRESS_SPACE = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Period Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__PERIOD_ELEMENTS = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Activation Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATION_CAPACITY = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Priority Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__PRIORITY_ELEMENTS = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Stack Size Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__STACK_SIZE_ELEMENTS = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Heap Size Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__HEAP_SIZE_ELEMENTS = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Shared Data Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__SHARED_DATA_RESOURCES = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Message Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__MESSAGE_RESOURCES = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Mutual Exclusion Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__MUTUAL_EXCLUSION_RESOURCES = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Notification Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__NOTIFICATION_RESOURCES = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Entry Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__ENTRY_POINTS = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Arrival Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__ARRIVAL_PATTERN = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Is Static Scheduling Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Is Preemptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Deadline Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_ELEMENTS = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Deadline Type Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_TYPE_ELEMENTS = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Time Slice Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Join Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__JOIN_SERVICES = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Yield Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__YIELD_SERVICES = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Delay Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__DELAY_SERVICES = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE__SCHEDULER = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 34;

	/**
	 * The number of structural features of the '<em>Software Schedulable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE_FEATURE_COUNT = GrmPackage.SCHEDULABLE_RESOURCE_FEATURE_COUNT + 35;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE___GET_EANNOTATION__STRING = GrmPackage.SCHEDULABLE_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Software Schedulable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULABLE_RESOURCE_OPERATION_COUNT = GrmPackage.SCHEDULABLE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__EANNOTATIONS = GrmPackage.SCHEDULER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__NAME = GrmPackage.SCHEDULER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__OWNED_RESOURCE = GrmPackage.SCHEDULER__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__RES_MULT = GrmPackage.SCHEDULER__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__IS_PROTECTED = GrmPackage.SCHEDULER__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__IS_ACTIVE = GrmPackage.SCHEDULER__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__OWNED_PORT = GrmPackage.SCHEDULER__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__OWNED_CONNECTOR = GrmPackage.SCHEDULER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__RSERVICES = GrmPackage.SCHEDULER__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__USED_BY = GrmPackage.SCHEDULER__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__PSERVICES = GrmPackage.SCHEDULER__PSERVICES;

	/**
	 * The feature id for the '<em><b>Broked Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__BROKED_RESOURCE = GrmPackage.SCHEDULER__BROKED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Acc Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__ACC_CTRL_POLICY = GrmPackage.SCHEDULER__ACC_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__HOST = GrmPackage.SCHEDULER__HOST;

	/**
	 * The feature id for the '<em><b>Processing Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__PROCESSING_UNITS = GrmPackage.SCHEDULER__PROCESSING_UNITS;

	/**
	 * The feature id for the '<em><b>Schedulable Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__SCHEDULABLE_RESOURCE = GrmPackage.SCHEDULER__SCHEDULABLE_RESOURCE;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__POLICY = GrmPackage.SCHEDULER__POLICY;

	/**
	 * The feature id for the '<em><b>Scheduled Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER__SCHEDULED_RESOURCE = GrmPackage.SCHEDULER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Software Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER_FEATURE_COUNT = GrmPackage.SCHEDULER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER___GET_EANNOTATION__STRING = GrmPackage.SCHEDULER___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Software Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SCHEDULER_OPERATION_COUNT = GrmPackage.SCHEDULER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SERVICE__EANNOTATIONS = GrmPackage.RESOURCE_SERVICE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SERVICE__NAME = GrmPackage.RESOURCE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SERVICE__CONTEXT = GrmPackage.RESOURCE_SERVICE__CONTEXT;

	/**
	 * The number of structural features of the '<em>Software Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SERVICE_FEATURE_COUNT = GrmPackage.RESOURCE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SERVICE___GET_EANNOTATION__STRING = GrmPackage.RESOURCE_SERVICE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Software Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SERVICE_OPERATION_COUNT = GrmPackage.RESOURCE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__EANNOTATIONS = GrmPackage.TIMER_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__NAME = GrmPackage.TIMER_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__OWNED_RESOURCE = GrmPackage.TIMER_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__RES_MULT = GrmPackage.TIMER_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__IS_PROTECTED = GrmPackage.TIMER_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__IS_ACTIVE = GrmPackage.TIMER_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__OWNED_PORT = GrmPackage.TIMER_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__OWNED_CONNECTOR = GrmPackage.TIMER_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__RSERVICES = GrmPackage.TIMER_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__USED_BY = GrmPackage.TIMER_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__PSERVICES = GrmPackage.TIMER_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__DURATION = GrmPackage.TIMER_RESOURCE__DURATION;

	/**
	 * The feature id for the '<em><b>Is Periodic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__IS_PERIODIC = GrmPackage.TIMER_RESOURCE__IS_PERIODIC;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__START = GrmPackage.TIMER_RESOURCE__START;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__SET = GrmPackage.TIMER_RESOURCE__SET;

	/**
	 * The feature id for the '<em><b>Get</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__GET = GrmPackage.TIMER_RESOURCE__GET;

	/**
	 * The feature id for the '<em><b>Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__RESET = GrmPackage.TIMER_RESOURCE__RESET;

	/**
	 * The feature id for the '<em><b>Pause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__PAUSE = GrmPackage.TIMER_RESOURCE__PAUSE;

	/**
	 * The feature id for the '<em><b>Duration Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE__DURATION_ELEMENTS = GrmPackage.TIMER_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Software Timer Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE_FEATURE_COUNT = GrmPackage.TIMER_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE___GET_EANNOTATION__STRING = GrmPackage.TIMER_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Software Timer Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TIMER_RESOURCE_OPERATION_COUNT = GrmPackage.TIMER_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.InterruptKind <em>Interrupt Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.InterruptKind
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getInterruptKind()
	 * @generated
	 */
	int INTERRUPT_KIND = 27;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.QueuePolicyKind <em>Queue Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.QueuePolicyKind
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getQueuePolicyKind()
	 * @generated
	 */
	int QUEUE_POLICY_KIND = 28;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.MutualExclusionResourceKind <em>Mutual Exclusion Resource Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.MutualExclusionResourceKind
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getMutualExclusionResourceKind()
	 * @generated
	 */
	int MUTUAL_EXCLUSION_RESOURCE_KIND = 30;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.ConcurrentAccesProtocolKind <em>Concurrent Acces Protocol Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.ConcurrentAccesProtocolKind
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getConcurrentAccesProtocolKind()
	 * @generated
	 */
	int CONCURRENT_ACCES_PROTOCOL_KIND = 26;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.OccurencePolicyKind <em>Occurence Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.OccurencePolicyKind
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getOccurencePolicyKind()
	 * @generated
	 */
	int OCCURENCE_POLICY_KIND = 32;

	/**
	 * The meta object id for the '<em>NFP Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getNFP_Duration()
	 * @generated
	 */
	int NFP_DURATION = 33;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.NotificationResourceKind <em>Notification Resource Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.NotificationResourceKind
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getNotificationResourceKind()
	 * @generated
	 */
	int NOTIFICATION_RESOURCE_KIND = 31;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.MessageResourceKind <em>Message Resource Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.MessageResourceKind
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getMessageResourceKind()
	 * @generated
	 */
	int MESSAGE_RESOURCE_KIND = 29;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.srm.AccessPolicyKind <em>Access Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.srm.AccessPolicyKind
	 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getAccessPolicyKind()
	 * @generated
	 */
	int ACCESS_POLICY_KIND = 25;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwareResource <em>Software Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Resource</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareResource
	 * @generated
	 */
	EClass getSoftwareResource();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareResource#getCreateServices <em>Create Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Create Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareResource#getCreateServices()
	 * @see #getSoftwareResource()
	 * @generated
	 */
	EReference getSoftwareResource_CreateServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareResource#getDeleteServices <em>Delete Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delete Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareResource#getDeleteServices()
	 * @see #getSoftwareResource()
	 * @generated
	 */
	EReference getSoftwareResource_DeleteServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareResource#getInitializeServices <em>Initialize Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Initialize Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareResource#getInitializeServices()
	 * @see #getSoftwareResource()
	 * @generated
	 */
	EReference getSoftwareResource_InitializeServices();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.SoftwareResource#getMemorySizeFootprint <em>Memory Size Footprint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Size Footprint</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareResource#getMemorySizeFootprint()
	 * @see #getSoftwareResource()
	 * @generated
	 */
	EAttribute getSoftwareResource_MemorySizeFootprint();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.SoftwareResource#getStateElements <em>State Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>State Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareResource#getStateElements()
	 * @see #getSoftwareResource()
	 * @generated
	 */
	EAttribute getSoftwareResource_StateElements();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.SoftwareResource#getIdentifierElements <em>Identifier Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifier Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareResource#getIdentifierElements()
	 * @see #getSoftwareResource()
	 * @generated
	 */
	EAttribute getSoftwareResource_IdentifierElements();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwareAccessService <em>Software Access Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Access Service</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareAccessService
	 * @generated
	 */
	EClass getSoftwareAccessService();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.SoftwareAccessService#isIsModifier <em>Is Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Modifier</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareAccessService#isIsModifier()
	 * @see #getSoftwareAccessService()
	 * @generated
	 */
	EAttribute getSoftwareAccessService_IsModifier();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.SoftwareAccessService#getAccessedElement <em>Accessed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accessed Element</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareAccessService#getAccessedElement()
	 * @see #getSoftwareAccessService()
	 * @generated
	 */
	EAttribute getSoftwareAccessService_AccessedElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource <em>Software Concurrent Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Concurrent Resource</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource
	 * @generated
	 */
	EClass getSoftwareConcurrentResource();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getActivateServices <em>Activate Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activate Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getActivateServices()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EReference getSoftwareConcurrentResource_ActivateServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getResumeServices <em>Resume Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resume Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getResumeServices()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EReference getSoftwareConcurrentResource_ResumeServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getSuspendServices <em>Suspend Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Suspend Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getSuspendServices()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EReference getSoftwareConcurrentResource_SuspendServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getEnableConcurrencyServices <em>Enable Concurrency Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enable Concurrency Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getEnableConcurrencyServices()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EReference getSoftwareConcurrentResource_EnableConcurrencyServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getDisableConcurrencyServices <em>Disable Concurrency Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disable Concurrency Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getDisableConcurrencyServices()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EReference getSoftwareConcurrentResource_DisableConcurrencyServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getTerminateServices <em>Terminate Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terminate Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getTerminateServices()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EReference getSoftwareConcurrentResource_TerminateServices();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getAdressSpace <em>Adress Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Adress Space</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getAdressSpace()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EReference getSoftwareConcurrentResource_AdressSpace();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getPeriodElements <em>Period Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Period Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getPeriodElements()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EAttribute getSoftwareConcurrentResource_PeriodElements();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getActivationCapacity <em>Activation Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Capacity</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getActivationCapacity()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EAttribute getSoftwareConcurrentResource_ActivationCapacity();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getPriorityElements <em>Priority Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Priority Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getPriorityElements()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EAttribute getSoftwareConcurrentResource_PriorityElements();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getStackSizeElements <em>Stack Size Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stack Size Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getStackSizeElements()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EAttribute getSoftwareConcurrentResource_StackSizeElements();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getHeapSizeElements <em>Heap Size Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Heap Size Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getHeapSizeElements()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EAttribute getSoftwareConcurrentResource_HeapSizeElements();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getSharedDataResources <em>Shared Data Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shared Data Resources</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getSharedDataResources()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EReference getSoftwareConcurrentResource_SharedDataResources();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getMessageResources <em>Message Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message Resources</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getMessageResources()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EReference getSoftwareConcurrentResource_MessageResources();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getMutualExclusionResources <em>Mutual Exclusion Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mutual Exclusion Resources</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getMutualExclusionResources()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EReference getSoftwareConcurrentResource_MutualExclusionResources();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getNotificationResources <em>Notification Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Notification Resources</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getNotificationResources()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EReference getSoftwareConcurrentResource_NotificationResources();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getEntryPoints <em>Entry Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entry Points</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getEntryPoints()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EAttribute getSoftwareConcurrentResource_EntryPoints();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getArrivalPattern <em>Arrival Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Pattern</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getArrivalPattern()
	 * @see #getSoftwareConcurrentResource()
	 * @generated
	 */
	EAttribute getSoftwareConcurrentResource_ArrivalPattern();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.InterruptResource <em>Interrupt Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupt Resource</em>'.
	 * @see org.polarsys.time4sys.marte.srm.InterruptResource
	 * @generated
	 */
	EClass getInterruptResource();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.InterruptResource#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.time4sys.marte.srm.InterruptResource#getKind()
	 * @see #getInterruptResource()
	 * @generated
	 */
	EAttribute getInterruptResource_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.InterruptResource#isIsMaskable <em>Is Maskable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Maskable</em>'.
	 * @see org.polarsys.time4sys.marte.srm.InterruptResource#isIsMaskable()
	 * @see #getInterruptResource()
	 * @generated
	 */
	EAttribute getInterruptResource_IsMaskable();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.InterruptResource#getRoutineConnectServices <em>Routine Connect Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Routine Connect Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.InterruptResource#getRoutineConnectServices()
	 * @see #getInterruptResource()
	 * @generated
	 */
	EReference getInterruptResource_RoutineConnectServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.InterruptResource#getRoutineDisconnectServices <em>Routine Disconnect Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Routine Disconnect Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.InterruptResource#getRoutineDisconnectServices()
	 * @see #getInterruptResource()
	 * @generated
	 */
	EReference getInterruptResource_RoutineDisconnectServices();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.InterruptResource#getMaskElements <em>Mask Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mask Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.InterruptResource#getMaskElements()
	 * @see #getInterruptResource()
	 * @generated
	 */
	EAttribute getInterruptResource_MaskElements();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.InterruptResource#getVectorElements <em>Vector Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Vector Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.InterruptResource#getVectorElements()
	 * @see #getInterruptResource()
	 * @generated
	 */
	EAttribute getInterruptResource_VectorElements();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.InterruptResource#getIsrEntryPoints <em>Isr Entry Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Isr Entry Points</em>'.
	 * @see org.polarsys.time4sys.marte.srm.InterruptResource#getIsrEntryPoints()
	 * @see #getInterruptResource()
	 * @generated
	 */
	EAttribute getInterruptResource_IsrEntryPoints();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource <em>Software Schedulable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Schedulable Resource</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource
	 * @generated
	 */
	EClass getSoftwareSchedulableResource();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#isIsStaticSchedulingFeature <em>Is Static Scheduling Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static Scheduling Feature</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#isIsStaticSchedulingFeature()
	 * @see #getSoftwareSchedulableResource()
	 * @generated
	 */
	EAttribute getSoftwareSchedulableResource_IsStaticSchedulingFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#isIsPreemptable <em>Is Preemptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Preemptable</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#isIsPreemptable()
	 * @see #getSoftwareSchedulableResource()
	 * @generated
	 */
	EAttribute getSoftwareSchedulableResource_IsPreemptable();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getDeadlineElements <em>Deadline Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Deadline Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getDeadlineElements()
	 * @see #getSoftwareSchedulableResource()
	 * @generated
	 */
	EAttribute getSoftwareSchedulableResource_DeadlineElements();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getDeadlineTypeElements <em>Deadline Type Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Deadline Type Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getDeadlineTypeElements()
	 * @see #getSoftwareSchedulableResource()
	 * @generated
	 */
	EAttribute getSoftwareSchedulableResource_DeadlineTypeElements();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getTimeSliceElements <em>Time Slice Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Time Slice Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getTimeSliceElements()
	 * @see #getSoftwareSchedulableResource()
	 * @generated
	 */
	EAttribute getSoftwareSchedulableResource_TimeSliceElements();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getJoinServices <em>Join Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Join Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getJoinServices()
	 * @see #getSoftwareSchedulableResource()
	 * @generated
	 */
	EReference getSoftwareSchedulableResource_JoinServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getYieldServices <em>Yield Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Yield Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getYieldServices()
	 * @see #getSoftwareSchedulableResource()
	 * @generated
	 */
	EReference getSoftwareSchedulableResource_YieldServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getDelayServices <em>Delay Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delay Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getDelayServices()
	 * @see #getSoftwareSchedulableResource()
	 * @generated
	 */
	EReference getSoftwareSchedulableResource_DelayServices();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduler</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getScheduler()
	 * @see #getSoftwareSchedulableResource()
	 * @generated
	 */
	EReference getSoftwareSchedulableResource_Scheduler();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.MemoryPartition <em>Memory Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Partition</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MemoryPartition
	 * @generated
	 */
	EClass getMemoryPartition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.srm.MemoryPartition#getConcurrentResources <em>Concurrent Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concurrent Resources</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MemoryPartition#getConcurrentResources()
	 * @see #getMemoryPartition()
	 * @generated
	 */
	EReference getMemoryPartition_ConcurrentResources();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.MemoryPartition#getForkServices <em>Fork Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fork Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MemoryPartition#getForkServices()
	 * @see #getMemoryPartition()
	 * @generated
	 */
	EReference getMemoryPartition_ForkServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.MemoryPartition#getExitServices <em>Exit Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exit Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MemoryPartition#getExitServices()
	 * @see #getMemoryPartition()
	 * @generated
	 */
	EReference getMemoryPartition_ExitServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.MemoryPartition#getMemorySpaces <em>Memory Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Memory Spaces</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MemoryPartition#getMemorySpaces()
	 * @see #getMemoryPartition()
	 * @generated
	 */
	EReference getMemoryPartition_MemorySpaces();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm</em>'.
	 * @see org.polarsys.time4sys.marte.srm.Alarm
	 * @generated
	 */
	EClass getAlarm();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.Alarm#getTimers <em>Timers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Timers</em>'.
	 * @see org.polarsys.time4sys.marte.srm.Alarm#getTimers()
	 * @see #getAlarm()
	 * @generated
	 */
	EReference getAlarm_Timers();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.Alarm#isIsWatchdog <em>Is Watchdog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Watchdog</em>'.
	 * @see org.polarsys.time4sys.marte.srm.Alarm#isIsWatchdog()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_IsWatchdog();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwareTimerResource <em>Software Timer Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Timer Resource</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareTimerResource
	 * @generated
	 */
	EClass getSoftwareTimerResource();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.SoftwareTimerResource#getDurationElements <em>Duration Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Duration Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareTimerResource#getDurationElements()
	 * @see #getSoftwareTimerResource()
	 * @generated
	 */
	EAttribute getSoftwareTimerResource_DurationElements();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwareInteractionResource <em>Software Interaction Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Interaction Resource</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareInteractionResource
	 * @generated
	 */
	EClass getSoftwareInteractionResource();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.SoftwareInteractionResource#isIsIntraMemoryPartitionInteraction <em>Is Intra Memory Partition Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Intra Memory Partition Interaction</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareInteractionResource#isIsIntraMemoryPartitionInteraction()
	 * @see #getSoftwareInteractionResource()
	 * @generated
	 */
	EAttribute getSoftwareInteractionResource_IsIntraMemoryPartitionInteraction();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.SoftwareInteractionResource#getWaitingQueuePolicy <em>Waiting Queue Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting Queue Policy</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareInteractionResource#getWaitingQueuePolicy()
	 * @see #getSoftwareInteractionResource()
	 * @generated
	 */
	EAttribute getSoftwareInteractionResource_WaitingQueuePolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.SoftwareInteractionResource#getWaitingQueueCapacity <em>Waiting Queue Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting Queue Capacity</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareInteractionResource#getWaitingQueueCapacity()
	 * @see #getSoftwareInteractionResource()
	 * @generated
	 */
	EAttribute getSoftwareInteractionResource_WaitingQueueCapacity();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.SoftwareInteractionResource#getWaitingPolicyElements <em>Waiting Policy Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Waiting Policy Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareInteractionResource#getWaitingPolicyElements()
	 * @see #getSoftwareInteractionResource()
	 * @generated
	 */
	EAttribute getSoftwareInteractionResource_WaitingPolicyElements();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwareCommunicationResource <em>Software Communication Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Communication Resource</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareCommunicationResource
	 * @generated
	 */
	EClass getSoftwareCommunicationResource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwareSynchronizationResource <em>Software Synchronization Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Synchronization Resource</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareSynchronizationResource
	 * @generated
	 */
	EClass getSoftwareSynchronizationResource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource <em>Software Mutual Exclusion Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Mutual Exclusion Resource</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource
	 * @generated
	 */
	EClass getSoftwareMutualExclusionResource();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getConcurrentAccessProtocol <em>Concurrent Access Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrent Access Protocol</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getConcurrentAccessProtocol()
	 * @see #getSoftwareMutualExclusionResource()
	 * @generated
	 */
	EAttribute getSoftwareMutualExclusionResource_ConcurrentAccessProtocol();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getMechanism <em>Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanism</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getMechanism()
	 * @see #getSoftwareMutualExclusionResource()
	 * @generated
	 */
	EAttribute getSoftwareMutualExclusionResource_Mechanism();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getAcquireServices <em>Acquire Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Acquire Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getAcquireServices()
	 * @see #getSoftwareMutualExclusionResource()
	 * @generated
	 */
	EReference getSoftwareMutualExclusionResource_AcquireServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getReleaseServices <em>Release Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Release Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getReleaseServices()
	 * @see #getSoftwareMutualExclusionResource()
	 * @generated
	 */
	EReference getSoftwareMutualExclusionResource_ReleaseServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getAccessTokenElements <em>Access Token Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Access Token Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getAccessTokenElements()
	 * @see #getSoftwareMutualExclusionResource()
	 * @generated
	 */
	EReference getSoftwareMutualExclusionResource_AccessTokenElements();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.NotificationResource <em>Notification Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Resource</em>'.
	 * @see org.polarsys.time4sys.marte.srm.NotificationResource
	 * @generated
	 */
	EClass getNotificationResource();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.NotificationResource#getFlushServices <em>Flush Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flush Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.NotificationResource#getFlushServices()
	 * @see #getNotificationResource()
	 * @generated
	 */
	EReference getNotificationResource_FlushServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.NotificationResource#getSignalServices <em>Signal Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signal Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.NotificationResource#getSignalServices()
	 * @see #getNotificationResource()
	 * @generated
	 */
	EReference getNotificationResource_SignalServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.NotificationResource#getWaitServices <em>Wait Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wait Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.NotificationResource#getWaitServices()
	 * @see #getNotificationResource()
	 * @generated
	 */
	EReference getNotificationResource_WaitServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.NotificationResource#getClearServices <em>Clear Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clear Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.NotificationResource#getClearServices()
	 * @see #getNotificationResource()
	 * @generated
	 */
	EReference getNotificationResource_ClearServices();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.NotificationResource#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy</em>'.
	 * @see org.polarsys.time4sys.marte.srm.NotificationResource#getPolicy()
	 * @see #getNotificationResource()
	 * @generated
	 */
	EAttribute getNotificationResource_Policy();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.NotificationResource#getMechanism <em>Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanism</em>'.
	 * @see org.polarsys.time4sys.marte.srm.NotificationResource#getMechanism()
	 * @see #getNotificationResource()
	 * @generated
	 */
	EAttribute getNotificationResource_Mechanism();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.NotificationResource#getOccurenceCountElements <em>Occurence Count Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Occurence Count Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.NotificationResource#getOccurenceCountElements()
	 * @see #getNotificationResource()
	 * @generated
	 */
	EAttribute getNotificationResource_OccurenceCountElements();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.NotificationResource#getMaskElements <em>Mask Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mask Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.NotificationResource#getMaskElements()
	 * @see #getNotificationResource()
	 * @generated
	 */
	EAttribute getNotificationResource_MaskElements();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SharedDataComResource <em>Shared Data Com Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Data Com Resource</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SharedDataComResource
	 * @generated
	 */
	EClass getSharedDataComResource();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SharedDataComResource#getReadServices <em>Read Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Read Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SharedDataComResource#getReadServices()
	 * @see #getSharedDataComResource()
	 * @generated
	 */
	EReference getSharedDataComResource_ReadServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SharedDataComResource#getWriteServices <em>Write Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Write Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SharedDataComResource#getWriteServices()
	 * @see #getSharedDataComResource()
	 * @generated
	 */
	EReference getSharedDataComResource_WriteServices();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.MessageComResource <em>Message Com Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Com Resource</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MessageComResource
	 * @generated
	 */
	EClass getMessageComResource();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.MessageComResource#getSendServices <em>Send Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Send Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MessageComResource#getSendServices()
	 * @see #getMessageComResource()
	 * @generated
	 */
	EReference getMessageComResource_SendServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.MessageComResource#getReceiveServices <em>Receive Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receive Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MessageComResource#getReceiveServices()
	 * @see #getMessageComResource()
	 * @generated
	 */
	EReference getMessageComResource_ReceiveServices();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.MessageComResource#isIsFixedMessageSize <em>Is Fixed Message Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fixed Message Size</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MessageComResource#isIsFixedMessageSize()
	 * @see #getMessageComResource()
	 * @generated
	 */
	EAttribute getMessageComResource_IsFixedMessageSize();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.MessageComResource#getMessageSizeElements <em>Message Size Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Message Size Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MessageComResource#getMessageSizeElements()
	 * @see #getMessageComResource()
	 * @generated
	 */
	EAttribute getMessageComResource_MessageSizeElements();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.MessageComResource#getMechanism <em>Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanism</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MessageComResource#getMechanism()
	 * @see #getMessageComResource()
	 * @generated
	 */
	EAttribute getMessageComResource_Mechanism();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.MessageComResource#getMessageQueuePolicy <em>Message Queue Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Queue Policy</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MessageComResource#getMessageQueuePolicy()
	 * @see #getMessageComResource()
	 * @generated
	 */
	EAttribute getMessageComResource_MessageQueuePolicy();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.MessageComResource#getMessageQueueCapacityElements <em>Message Queue Capacity Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Message Queue Capacity Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MessageComResource#getMessageQueueCapacityElements()
	 * @see #getMessageComResource()
	 * @generated
	 */
	EAttribute getMessageComResource_MessageQueueCapacityElements();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.DeviceBroker <em>Device Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Broker</em>'.
	 * @see org.polarsys.time4sys.marte.srm.DeviceBroker
	 * @generated
	 */
	EClass getDeviceBroker();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.DeviceBroker#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devices</em>'.
	 * @see org.polarsys.time4sys.marte.srm.DeviceBroker#getDevices()
	 * @see #getDeviceBroker()
	 * @generated
	 */
	EReference getDeviceBroker_Devices();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.DeviceBroker#getAccessPolicy <em>Access Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Policy</em>'.
	 * @see org.polarsys.time4sys.marte.srm.DeviceBroker#getAccessPolicy()
	 * @see #getDeviceBroker()
	 * @generated
	 */
	EAttribute getDeviceBroker_AccessPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.DeviceBroker#isIsBuffered <em>Is Buffered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Buffered</em>'.
	 * @see org.polarsys.time4sys.marte.srm.DeviceBroker#isIsBuffered()
	 * @see #getDeviceBroker()
	 * @generated
	 */
	EAttribute getDeviceBroker_IsBuffered();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.DeviceBroker#getCloseServices <em>Close Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Close Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.DeviceBroker#getCloseServices()
	 * @see #getDeviceBroker()
	 * @generated
	 */
	EReference getDeviceBroker_CloseServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.DeviceBroker#getOpenServices <em>Open Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Open Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.DeviceBroker#getOpenServices()
	 * @see #getDeviceBroker()
	 * @generated
	 */
	EReference getDeviceBroker_OpenServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.DeviceBroker#getControlServices <em>Control Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.DeviceBroker#getControlServices()
	 * @see #getDeviceBroker()
	 * @generated
	 */
	EReference getDeviceBroker_ControlServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.DeviceBroker#getReadServices <em>Read Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Read Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.DeviceBroker#getReadServices()
	 * @see #getDeviceBroker()
	 * @generated
	 */
	EReference getDeviceBroker_ReadServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.DeviceBroker#getWriteServices <em>Write Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Write Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.DeviceBroker#getWriteServices()
	 * @see #getDeviceBroker()
	 * @generated
	 */
	EReference getDeviceBroker_WriteServices();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.MemoryBroker <em>Memory Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Broker</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MemoryBroker
	 * @generated
	 */
	EClass getMemoryBroker();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getLockServices <em>Lock Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lock Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MemoryBroker#getLockServices()
	 * @see #getMemoryBroker()
	 * @generated
	 */
	EReference getMemoryBroker_LockServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getUnlockServices <em>Unlock Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unlock Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MemoryBroker#getUnlockServices()
	 * @see #getMemoryBroker()
	 * @generated
	 */
	EReference getMemoryBroker_UnlockServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getMapServices <em>Map Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Map Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MemoryBroker#getMapServices()
	 * @see #getMemoryBroker()
	 * @generated
	 */
	EReference getMemoryBroker_MapServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getUnmapServices <em>Unmap Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unmap Services</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MemoryBroker#getUnmapServices()
	 * @see #getMemoryBroker()
	 * @generated
	 */
	EReference getMemoryBroker_UnmapServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getMemories <em>Memories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Memories</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MemoryBroker#getMemories()
	 * @see #getMemoryBroker()
	 * @generated
	 */
	EReference getMemoryBroker_Memories();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getAccessPolicy <em>Access Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Policy</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MemoryBroker#getAccessPolicy()
	 * @see #getMemoryBroker()
	 * @generated
	 */
	EAttribute getMemoryBroker_AccessPolicy();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getMemoryBlockAddressElements <em>Memory Block Address Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Memory Block Address Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MemoryBroker#getMemoryBlockAddressElements()
	 * @see #getMemoryBroker()
	 * @generated
	 */
	EAttribute getMemoryBroker_MemoryBlockAddressElements();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getMemoryBlockSizeElements <em>Memory Block Size Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Memory Block Size Elements</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MemoryBroker#getMemoryBlockSizeElements()
	 * @see #getMemoryBroker()
	 * @generated
	 */
	EAttribute getMemoryBroker_MemoryBlockSizeElements();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwareScheduler <em>Software Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Scheduler</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareScheduler
	 * @generated
	 */
	EClass getSoftwareScheduler();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.srm.SoftwareScheduler#getScheduledResource <em>Scheduled Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scheduled Resource</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareScheduler#getScheduledResource()
	 * @see #getSoftwareScheduler()
	 * @generated
	 */
	EReference getSoftwareScheduler_ScheduledResource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwarePort <em>Software Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Port</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwarePort
	 * @generated
	 */
	EClass getSoftwarePort();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwareService <em>Software Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Service</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareService
	 * @generated
	 */
	EClass getSoftwareService();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwareInterface <em>Software Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Interface</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareInterface
	 * @generated
	 */
	EClass getSoftwareInterface();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwareArchitecture <em>Software Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Architecture</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareArchitecture
	 * @generated
	 */
	EClass getSoftwareArchitecture();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwareConnector <em>Software Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Connector</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConnector
	 * @generated
	 */
	EClass getSoftwareConnector();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwareResourcePackage <em>Software Resource Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Resource Package</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareResourcePackage
	 * @generated
	 */
	EClass getSoftwareResourcePackage();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.srm.SoftwareInterfacePackage <em>Software Interface Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Interface Package</em>'.
	 * @see org.polarsys.time4sys.marte.srm.SoftwareInterfacePackage
	 * @generated
	 */
	EClass getSoftwareInterfacePackage();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.srm.InterruptKind <em>Interrupt Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interrupt Kind</em>'.
	 * @see org.polarsys.time4sys.marte.srm.InterruptKind
	 * @generated
	 */
	EEnum getInterruptKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.srm.QueuePolicyKind <em>Queue Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Queue Policy Kind</em>'.
	 * @see org.polarsys.time4sys.marte.srm.QueuePolicyKind
	 * @generated
	 */
	EEnum getQueuePolicyKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.srm.MutualExclusionResourceKind <em>Mutual Exclusion Resource Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mutual Exclusion Resource Kind</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MutualExclusionResourceKind
	 * @generated
	 */
	EEnum getMutualExclusionResourceKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.srm.ConcurrentAccesProtocolKind <em>Concurrent Acces Protocol Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Concurrent Acces Protocol Kind</em>'.
	 * @see org.polarsys.time4sys.marte.srm.ConcurrentAccesProtocolKind
	 * @generated
	 */
	EEnum getConcurrentAccesProtocolKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.srm.OccurencePolicyKind <em>Occurence Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Occurence Policy Kind</em>'.
	 * @see org.polarsys.time4sys.marte.srm.OccurencePolicyKind
	 * @generated
	 */
	EEnum getOccurencePolicyKind();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.time4sys.marte.nfp.Duration <em>NFP Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>NFP Duration</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration
	 * @model instanceClass="org.polarsys.time4sys.marte.nfp.Duration"
	 * @generated
	 */
	EDataType getNFP_Duration();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.srm.NotificationResourceKind <em>Notification Resource Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Notification Resource Kind</em>'.
	 * @see org.polarsys.time4sys.marte.srm.NotificationResourceKind
	 * @generated
	 */
	EEnum getNotificationResourceKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.srm.MessageResourceKind <em>Message Resource Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Resource Kind</em>'.
	 * @see org.polarsys.time4sys.marte.srm.MessageResourceKind
	 * @generated
	 */
	EEnum getMessageResourceKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.srm.AccessPolicyKind <em>Access Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Policy Kind</em>'.
	 * @see org.polarsys.time4sys.marte.srm.AccessPolicyKind
	 * @generated
	 */
	EEnum getAccessPolicyKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SrmFactory getSrmFactory();

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
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareResourceImpl <em>Software Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareResourceImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareResource()
		 * @generated
		 */
		EClass SOFTWARE_RESOURCE = eINSTANCE.getSoftwareResource();

		/**
		 * The meta object literal for the '<em><b>Create Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_RESOURCE__CREATE_SERVICES = eINSTANCE.getSoftwareResource_CreateServices();

		/**
		 * The meta object literal for the '<em><b>Delete Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_RESOURCE__DELETE_SERVICES = eINSTANCE.getSoftwareResource_DeleteServices();

		/**
		 * The meta object literal for the '<em><b>Initialize Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_RESOURCE__INITIALIZE_SERVICES = eINSTANCE.getSoftwareResource_InitializeServices();

		/**
		 * The meta object literal for the '<em><b>Memory Size Footprint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT = eINSTANCE.getSoftwareResource_MemorySizeFootprint();

		/**
		 * The meta object literal for the '<em><b>State Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_RESOURCE__STATE_ELEMENTS = eINSTANCE.getSoftwareResource_StateElements();

		/**
		 * The meta object literal for the '<em><b>Identifier Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS = eINSTANCE.getSoftwareResource_IdentifierElements();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareAccessServiceImpl <em>Software Access Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareAccessServiceImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareAccessService()
		 * @generated
		 */
		EClass SOFTWARE_ACCESS_SERVICE = eINSTANCE.getSoftwareAccessService();

		/**
		 * The meta object literal for the '<em><b>Is Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_ACCESS_SERVICE__IS_MODIFIER = eINSTANCE.getSoftwareAccessService_IsModifier();

		/**
		 * The meta object literal for the '<em><b>Accessed Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_ACCESS_SERVICE__ACCESSED_ELEMENT = eINSTANCE.getSoftwareAccessService_AccessedElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl <em>Software Concurrent Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareConcurrentResourceImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareConcurrentResource()
		 * @generated
		 */
		EClass SOFTWARE_CONCURRENT_RESOURCE = eINSTANCE.getSoftwareConcurrentResource();

		/**
		 * The meta object literal for the '<em><b>Activate Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_CONCURRENT_RESOURCE__ACTIVATE_SERVICES = eINSTANCE.getSoftwareConcurrentResource_ActivateServices();

		/**
		 * The meta object literal for the '<em><b>Resume Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_CONCURRENT_RESOURCE__RESUME_SERVICES = eINSTANCE.getSoftwareConcurrentResource_ResumeServices();

		/**
		 * The meta object literal for the '<em><b>Suspend Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_CONCURRENT_RESOURCE__SUSPEND_SERVICES = eINSTANCE.getSoftwareConcurrentResource_SuspendServices();

		/**
		 * The meta object literal for the '<em><b>Enable Concurrency Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES = eINSTANCE.getSoftwareConcurrentResource_EnableConcurrencyServices();

		/**
		 * The meta object literal for the '<em><b>Disable Concurrency Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES = eINSTANCE.getSoftwareConcurrentResource_DisableConcurrencyServices();

		/**
		 * The meta object literal for the '<em><b>Terminate Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_CONCURRENT_RESOURCE__TERMINATE_SERVICES = eINSTANCE.getSoftwareConcurrentResource_TerminateServices();

		/**
		 * The meta object literal for the '<em><b>Adress Space</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE = eINSTANCE.getSoftwareConcurrentResource_AdressSpace();

		/**
		 * The meta object literal for the '<em><b>Period Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_CONCURRENT_RESOURCE__PERIOD_ELEMENTS = eINSTANCE.getSoftwareConcurrentResource_PeriodElements();

		/**
		 * The meta object literal for the '<em><b>Activation Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY = eINSTANCE.getSoftwareConcurrentResource_ActivationCapacity();

		/**
		 * The meta object literal for the '<em><b>Priority Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS = eINSTANCE.getSoftwareConcurrentResource_PriorityElements();

		/**
		 * The meta object literal for the '<em><b>Stack Size Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS = eINSTANCE.getSoftwareConcurrentResource_StackSizeElements();

		/**
		 * The meta object literal for the '<em><b>Heap Size Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS = eINSTANCE.getSoftwareConcurrentResource_HeapSizeElements();

		/**
		 * The meta object literal for the '<em><b>Shared Data Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_CONCURRENT_RESOURCE__SHARED_DATA_RESOURCES = eINSTANCE.getSoftwareConcurrentResource_SharedDataResources();

		/**
		 * The meta object literal for the '<em><b>Message Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_CONCURRENT_RESOURCE__MESSAGE_RESOURCES = eINSTANCE.getSoftwareConcurrentResource_MessageResources();

		/**
		 * The meta object literal for the '<em><b>Mutual Exclusion Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES = eINSTANCE.getSoftwareConcurrentResource_MutualExclusionResources();

		/**
		 * The meta object literal for the '<em><b>Notification Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES = eINSTANCE.getSoftwareConcurrentResource_NotificationResources();

		/**
		 * The meta object literal for the '<em><b>Entry Points</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_CONCURRENT_RESOURCE__ENTRY_POINTS = eINSTANCE.getSoftwareConcurrentResource_EntryPoints();

		/**
		 * The meta object literal for the '<em><b>Arrival Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_CONCURRENT_RESOURCE__ARRIVAL_PATTERN = eINSTANCE.getSoftwareConcurrentResource_ArrivalPattern();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.InterruptResourceImpl <em>Interrupt Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.InterruptResourceImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getInterruptResource()
		 * @generated
		 */
		EClass INTERRUPT_RESOURCE = eINSTANCE.getInterruptResource();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERRUPT_RESOURCE__KIND = eINSTANCE.getInterruptResource_Kind();

		/**
		 * The meta object literal for the '<em><b>Is Maskable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERRUPT_RESOURCE__IS_MASKABLE = eINSTANCE.getInterruptResource_IsMaskable();

		/**
		 * The meta object literal for the '<em><b>Routine Connect Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERRUPT_RESOURCE__ROUTINE_CONNECT_SERVICES = eINSTANCE.getInterruptResource_RoutineConnectServices();

		/**
		 * The meta object literal for the '<em><b>Routine Disconnect Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERRUPT_RESOURCE__ROUTINE_DISCONNECT_SERVICES = eINSTANCE.getInterruptResource_RoutineDisconnectServices();

		/**
		 * The meta object literal for the '<em><b>Mask Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERRUPT_RESOURCE__MASK_ELEMENTS = eINSTANCE.getInterruptResource_MaskElements();

		/**
		 * The meta object literal for the '<em><b>Vector Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERRUPT_RESOURCE__VECTOR_ELEMENTS = eINSTANCE.getInterruptResource_VectorElements();

		/**
		 * The meta object literal for the '<em><b>Isr Entry Points</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERRUPT_RESOURCE__ISR_ENTRY_POINTS = eINSTANCE.getInterruptResource_IsrEntryPoints();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl <em>Software Schedulable Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulableResourceImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareSchedulableResource()
		 * @generated
		 */
		EClass SOFTWARE_SCHEDULABLE_RESOURCE = eINSTANCE.getSoftwareSchedulableResource();

		/**
		 * The meta object literal for the '<em><b>Is Static Scheduling Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE = eINSTANCE.getSoftwareSchedulableResource_IsStaticSchedulingFeature();

		/**
		 * The meta object literal for the '<em><b>Is Preemptable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE = eINSTANCE.getSoftwareSchedulableResource_IsPreemptable();

		/**
		 * The meta object literal for the '<em><b>Deadline Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_ELEMENTS = eINSTANCE.getSoftwareSchedulableResource_DeadlineElements();

		/**
		 * The meta object literal for the '<em><b>Deadline Type Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_TYPE_ELEMENTS = eINSTANCE.getSoftwareSchedulableResource_DeadlineTypeElements();

		/**
		 * The meta object literal for the '<em><b>Time Slice Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS = eINSTANCE.getSoftwareSchedulableResource_TimeSliceElements();

		/**
		 * The meta object literal for the '<em><b>Join Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_SCHEDULABLE_RESOURCE__JOIN_SERVICES = eINSTANCE.getSoftwareSchedulableResource_JoinServices();

		/**
		 * The meta object literal for the '<em><b>Yield Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_SCHEDULABLE_RESOURCE__YIELD_SERVICES = eINSTANCE.getSoftwareSchedulableResource_YieldServices();

		/**
		 * The meta object literal for the '<em><b>Delay Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_SCHEDULABLE_RESOURCE__DELAY_SERVICES = eINSTANCE.getSoftwareSchedulableResource_DelayServices();

		/**
		 * The meta object literal for the '<em><b>Scheduler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_SCHEDULABLE_RESOURCE__SCHEDULER = eINSTANCE.getSoftwareSchedulableResource_Scheduler();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.MemoryPartitionImpl <em>Memory Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.MemoryPartitionImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getMemoryPartition()
		 * @generated
		 */
		EClass MEMORY_PARTITION = eINSTANCE.getMemoryPartition();

		/**
		 * The meta object literal for the '<em><b>Concurrent Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_PARTITION__CONCURRENT_RESOURCES = eINSTANCE.getMemoryPartition_ConcurrentResources();

		/**
		 * The meta object literal for the '<em><b>Fork Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_PARTITION__FORK_SERVICES = eINSTANCE.getMemoryPartition_ForkServices();

		/**
		 * The meta object literal for the '<em><b>Exit Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_PARTITION__EXIT_SERVICES = eINSTANCE.getMemoryPartition_ExitServices();

		/**
		 * The meta object literal for the '<em><b>Memory Spaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_PARTITION__MEMORY_SPACES = eINSTANCE.getMemoryPartition_MemorySpaces();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.AlarmImpl <em>Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.AlarmImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getAlarm()
		 * @generated
		 */
		EClass ALARM = eINSTANCE.getAlarm();

		/**
		 * The meta object literal for the '<em><b>Timers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALARM__TIMERS = eINSTANCE.getAlarm_Timers();

		/**
		 * The meta object literal for the '<em><b>Is Watchdog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM__IS_WATCHDOG = eINSTANCE.getAlarm_IsWatchdog();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareTimerResourceImpl <em>Software Timer Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareTimerResourceImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareTimerResource()
		 * @generated
		 */
		EClass SOFTWARE_TIMER_RESOURCE = eINSTANCE.getSoftwareTimerResource();

		/**
		 * The meta object literal for the '<em><b>Duration Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_TIMER_RESOURCE__DURATION_ELEMENTS = eINSTANCE.getSoftwareTimerResource_DurationElements();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl <em>Software Interaction Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareInteractionResource()
		 * @generated
		 */
		EClass SOFTWARE_INTERACTION_RESOURCE = eINSTANCE.getSoftwareInteractionResource();

		/**
		 * The meta object literal for the '<em><b>Is Intra Memory Partition Interaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION = eINSTANCE.getSoftwareInteractionResource_IsIntraMemoryPartitionInteraction();

		/**
		 * The meta object literal for the '<em><b>Waiting Queue Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY = eINSTANCE.getSoftwareInteractionResource_WaitingQueuePolicy();

		/**
		 * The meta object literal for the '<em><b>Waiting Queue Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY = eINSTANCE.getSoftwareInteractionResource_WaitingQueueCapacity();

		/**
		 * The meta object literal for the '<em><b>Waiting Policy Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS = eINSTANCE.getSoftwareInteractionResource_WaitingPolicyElements();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareCommunicationResourceImpl <em>Software Communication Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareCommunicationResourceImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareCommunicationResource()
		 * @generated
		 */
		EClass SOFTWARE_COMMUNICATION_RESOURCE = eINSTANCE.getSoftwareCommunicationResource();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSynchronizationResourceImpl <em>Software Synchronization Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareSynchronizationResourceImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareSynchronizationResource()
		 * @generated
		 */
		EClass SOFTWARE_SYNCHRONIZATION_RESOURCE = eINSTANCE.getSoftwareSynchronizationResource();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareMutualExclusionResourceImpl <em>Software Mutual Exclusion Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareMutualExclusionResourceImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareMutualExclusionResource()
		 * @generated
		 */
		EClass SOFTWARE_MUTUAL_EXCLUSION_RESOURCE = eINSTANCE.getSoftwareMutualExclusionResource();

		/**
		 * The meta object literal for the '<em><b>Concurrent Access Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__CONCURRENT_ACCESS_PROTOCOL = eINSTANCE.getSoftwareMutualExclusionResource_ConcurrentAccessProtocol();

		/**
		 * The meta object literal for the '<em><b>Mechanism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__MECHANISM = eINSTANCE.getSoftwareMutualExclusionResource_Mechanism();

		/**
		 * The meta object literal for the '<em><b>Acquire Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACQUIRE_SERVICES = eINSTANCE.getSoftwareMutualExclusionResource_AcquireServices();

		/**
		 * The meta object literal for the '<em><b>Release Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__RELEASE_SERVICES = eINSTANCE.getSoftwareMutualExclusionResource_ReleaseServices();

		/**
		 * The meta object literal for the '<em><b>Access Token Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACCESS_TOKEN_ELEMENTS = eINSTANCE.getSoftwareMutualExclusionResource_AccessTokenElements();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.NotificationResourceImpl <em>Notification Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.NotificationResourceImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getNotificationResource()
		 * @generated
		 */
		EClass NOTIFICATION_RESOURCE = eINSTANCE.getNotificationResource();

		/**
		 * The meta object literal for the '<em><b>Flush Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_RESOURCE__FLUSH_SERVICES = eINSTANCE.getNotificationResource_FlushServices();

		/**
		 * The meta object literal for the '<em><b>Signal Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_RESOURCE__SIGNAL_SERVICES = eINSTANCE.getNotificationResource_SignalServices();

		/**
		 * The meta object literal for the '<em><b>Wait Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_RESOURCE__WAIT_SERVICES = eINSTANCE.getNotificationResource_WaitServices();

		/**
		 * The meta object literal for the '<em><b>Clear Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_RESOURCE__CLEAR_SERVICES = eINSTANCE.getNotificationResource_ClearServices();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_RESOURCE__POLICY = eINSTANCE.getNotificationResource_Policy();

		/**
		 * The meta object literal for the '<em><b>Mechanism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_RESOURCE__MECHANISM = eINSTANCE.getNotificationResource_Mechanism();

		/**
		 * The meta object literal for the '<em><b>Occurence Count Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_RESOURCE__OCCURENCE_COUNT_ELEMENTS = eINSTANCE.getNotificationResource_OccurenceCountElements();

		/**
		 * The meta object literal for the '<em><b>Mask Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_RESOURCE__MASK_ELEMENTS = eINSTANCE.getNotificationResource_MaskElements();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SharedDataComResourceImpl <em>Shared Data Com Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SharedDataComResourceImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSharedDataComResource()
		 * @generated
		 */
		EClass SHARED_DATA_COM_RESOURCE = eINSTANCE.getSharedDataComResource();

		/**
		 * The meta object literal for the '<em><b>Read Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_DATA_COM_RESOURCE__READ_SERVICES = eINSTANCE.getSharedDataComResource_ReadServices();

		/**
		 * The meta object literal for the '<em><b>Write Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_DATA_COM_RESOURCE__WRITE_SERVICES = eINSTANCE.getSharedDataComResource_WriteServices();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.MessageComResourceImpl <em>Message Com Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.MessageComResourceImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getMessageComResource()
		 * @generated
		 */
		EClass MESSAGE_COM_RESOURCE = eINSTANCE.getMessageComResource();

		/**
		 * The meta object literal for the '<em><b>Send Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_COM_RESOURCE__SEND_SERVICES = eINSTANCE.getMessageComResource_SendServices();

		/**
		 * The meta object literal for the '<em><b>Receive Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_COM_RESOURCE__RECEIVE_SERVICES = eINSTANCE.getMessageComResource_ReceiveServices();

		/**
		 * The meta object literal for the '<em><b>Is Fixed Message Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_COM_RESOURCE__IS_FIXED_MESSAGE_SIZE = eINSTANCE.getMessageComResource_IsFixedMessageSize();

		/**
		 * The meta object literal for the '<em><b>Message Size Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_COM_RESOURCE__MESSAGE_SIZE_ELEMENTS = eINSTANCE.getMessageComResource_MessageSizeElements();

		/**
		 * The meta object literal for the '<em><b>Mechanism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_COM_RESOURCE__MECHANISM = eINSTANCE.getMessageComResource_Mechanism();

		/**
		 * The meta object literal for the '<em><b>Message Queue Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_POLICY = eINSTANCE.getMessageComResource_MessageQueuePolicy();

		/**
		 * The meta object literal for the '<em><b>Message Queue Capacity Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_CAPACITY_ELEMENTS = eINSTANCE.getMessageComResource_MessageQueueCapacityElements();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl <em>Device Broker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.DeviceBrokerImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getDeviceBroker()
		 * @generated
		 */
		EClass DEVICE_BROKER = eINSTANCE.getDeviceBroker();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_BROKER__DEVICES = eINSTANCE.getDeviceBroker_Devices();

		/**
		 * The meta object literal for the '<em><b>Access Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_BROKER__ACCESS_POLICY = eINSTANCE.getDeviceBroker_AccessPolicy();

		/**
		 * The meta object literal for the '<em><b>Is Buffered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_BROKER__IS_BUFFERED = eINSTANCE.getDeviceBroker_IsBuffered();

		/**
		 * The meta object literal for the '<em><b>Close Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_BROKER__CLOSE_SERVICES = eINSTANCE.getDeviceBroker_CloseServices();

		/**
		 * The meta object literal for the '<em><b>Open Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_BROKER__OPEN_SERVICES = eINSTANCE.getDeviceBroker_OpenServices();

		/**
		 * The meta object literal for the '<em><b>Control Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_BROKER__CONTROL_SERVICES = eINSTANCE.getDeviceBroker_ControlServices();

		/**
		 * The meta object literal for the '<em><b>Read Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_BROKER__READ_SERVICES = eINSTANCE.getDeviceBroker_ReadServices();

		/**
		 * The meta object literal for the '<em><b>Write Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_BROKER__WRITE_SERVICES = eINSTANCE.getDeviceBroker_WriteServices();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl <em>Memory Broker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.MemoryBrokerImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getMemoryBroker()
		 * @generated
		 */
		EClass MEMORY_BROKER = eINSTANCE.getMemoryBroker();

		/**
		 * The meta object literal for the '<em><b>Lock Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_BROKER__LOCK_SERVICES = eINSTANCE.getMemoryBroker_LockServices();

		/**
		 * The meta object literal for the '<em><b>Unlock Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_BROKER__UNLOCK_SERVICES = eINSTANCE.getMemoryBroker_UnlockServices();

		/**
		 * The meta object literal for the '<em><b>Map Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_BROKER__MAP_SERVICES = eINSTANCE.getMemoryBroker_MapServices();

		/**
		 * The meta object literal for the '<em><b>Unmap Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_BROKER__UNMAP_SERVICES = eINSTANCE.getMemoryBroker_UnmapServices();

		/**
		 * The meta object literal for the '<em><b>Memories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_BROKER__MEMORIES = eINSTANCE.getMemoryBroker_Memories();

		/**
		 * The meta object literal for the '<em><b>Access Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_BROKER__ACCESS_POLICY = eINSTANCE.getMemoryBroker_AccessPolicy();

		/**
		 * The meta object literal for the '<em><b>Memory Block Address Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_BROKER__MEMORY_BLOCK_ADDRESS_ELEMENTS = eINSTANCE.getMemoryBroker_MemoryBlockAddressElements();

		/**
		 * The meta object literal for the '<em><b>Memory Block Size Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_BROKER__MEMORY_BLOCK_SIZE_ELEMENTS = eINSTANCE.getMemoryBroker_MemoryBlockSizeElements();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulerImpl <em>Software Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareSchedulerImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareScheduler()
		 * @generated
		 */
		EClass SOFTWARE_SCHEDULER = eINSTANCE.getSoftwareScheduler();

		/**
		 * The meta object literal for the '<em><b>Scheduled Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_SCHEDULER__SCHEDULED_RESOURCE = eINSTANCE.getSoftwareScheduler_ScheduledResource();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwarePortImpl <em>Software Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwarePortImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwarePort()
		 * @generated
		 */
		EClass SOFTWARE_PORT = eINSTANCE.getSoftwarePort();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareServiceImpl <em>Software Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareServiceImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareService()
		 * @generated
		 */
		EClass SOFTWARE_SERVICE = eINSTANCE.getSoftwareService();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInterfaceImpl <em>Software Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareInterfaceImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareInterface()
		 * @generated
		 */
		EClass SOFTWARE_INTERFACE = eINSTANCE.getSoftwareInterface();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareArchitectureImpl <em>Software Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareArchitectureImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareArchitecture()
		 * @generated
		 */
		EClass SOFTWARE_ARCHITECTURE = eINSTANCE.getSoftwareArchitecture();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareConnectorImpl <em>Software Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareConnectorImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareConnector()
		 * @generated
		 */
		EClass SOFTWARE_CONNECTOR = eINSTANCE.getSoftwareConnector();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareResourcePackageImpl <em>Software Resource Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareResourcePackageImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareResourcePackage()
		 * @generated
		 */
		EClass SOFTWARE_RESOURCE_PACKAGE = eINSTANCE.getSoftwareResourcePackage();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInterfacePackageImpl <em>Software Interface Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.impl.SoftwareInterfacePackageImpl
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getSoftwareInterfacePackage()
		 * @generated
		 */
		EClass SOFTWARE_INTERFACE_PACKAGE = eINSTANCE.getSoftwareInterfacePackage();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.InterruptKind <em>Interrupt Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.InterruptKind
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getInterruptKind()
		 * @generated
		 */
		EEnum INTERRUPT_KIND = eINSTANCE.getInterruptKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.QueuePolicyKind <em>Queue Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.QueuePolicyKind
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getQueuePolicyKind()
		 * @generated
		 */
		EEnum QUEUE_POLICY_KIND = eINSTANCE.getQueuePolicyKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.MutualExclusionResourceKind <em>Mutual Exclusion Resource Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.MutualExclusionResourceKind
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getMutualExclusionResourceKind()
		 * @generated
		 */
		EEnum MUTUAL_EXCLUSION_RESOURCE_KIND = eINSTANCE.getMutualExclusionResourceKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.ConcurrentAccesProtocolKind <em>Concurrent Acces Protocol Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.ConcurrentAccesProtocolKind
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getConcurrentAccesProtocolKind()
		 * @generated
		 */
		EEnum CONCURRENT_ACCES_PROTOCOL_KIND = eINSTANCE.getConcurrentAccesProtocolKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.OccurencePolicyKind <em>Occurence Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.OccurencePolicyKind
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getOccurencePolicyKind()
		 * @generated
		 */
		EEnum OCCURENCE_POLICY_KIND = eINSTANCE.getOccurencePolicyKind();

		/**
		 * The meta object literal for the '<em>NFP Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.Duration
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getNFP_Duration()
		 * @generated
		 */
		EDataType NFP_DURATION = eINSTANCE.getNFP_Duration();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.NotificationResourceKind <em>Notification Resource Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.NotificationResourceKind
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getNotificationResourceKind()
		 * @generated
		 */
		EEnum NOTIFICATION_RESOURCE_KIND = eINSTANCE.getNotificationResourceKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.MessageResourceKind <em>Message Resource Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.MessageResourceKind
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getMessageResourceKind()
		 * @generated
		 */
		EEnum MESSAGE_RESOURCE_KIND = eINSTANCE.getMessageResourceKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.srm.AccessPolicyKind <em>Access Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.srm.AccessPolicyKind
		 * @see org.polarsys.time4sys.marte.srm.impl.SrmPackageImpl#getAccessPolicyKind()
		 * @generated
		 */
		EEnum ACCESS_POLICY_KIND = eINSTANCE.getAccessPolicyKind();

	}

} //SrmPackage
