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
package org.polarsys.time4sys.marte.grm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.polarsys.time4sys.marte.grm.GrmFactory
 * @model kind="package"
 * @generated
 */
public interface GrmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/marte/grm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "grm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrmPackage eINSTANCE = org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourcePackageImpl <em>Resource Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ResourcePackageImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourcePackage()
	 * @generated
	 */
	int RESOURCE_PACKAGE = 20;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourcePackageableElementImpl <em>Resource Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ResourcePackageableElementImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourcePackageableElement()
	 * @generated
	 */
	int RESOURCE_PACKAGEABLE_ELEMENT = 21;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ResourceInstanceImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourceInstance()
	 * @generated
	 */
	int RESOURCE_INSTANCE = 17;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ResourceImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 13;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.StorageResourceImpl <em>Storage Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.StorageResourceImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getStorageResource()
	 * @generated
	 */
	int STORAGE_RESOURCE = 31;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.TimingResourceImpl <em>Timing Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.TimingResourceImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getTimingResource()
	 * @generated
	 */
	int TIMING_RESOURCE = 33;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.CommunicationResourceImpl <em>Communication Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.CommunicationResourceImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getCommunicationResource()
	 * @generated
	 */
	int COMMUNICATION_RESOURCE = 6;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.SynchResourceImpl <em>Synch Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.SynchResourceImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getSynchResource()
	 * @generated
	 */
	int SYNCH_RESOURCE = 32;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ConcurrencyResourceImpl <em>Concurrency Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ConcurrencyResourceImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getConcurrencyResource()
	 * @generated
	 */
	int CONCURRENCY_RESOURCE = 5;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ProcessingResourceImpl <em>Processing Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ProcessingResourceImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getProcessingResource()
	 * @generated
	 */
	int PROCESSING_RESOURCE = 11;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ComputingResourceImpl <em>Computing Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ComputingResourceImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getComputingResource()
	 * @generated
	 */
	int COMPUTING_RESOURCE = 4;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.DeviceResourceImpl <em>Device Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.DeviceResourceImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getDeviceResource()
	 * @generated
	 */
	int DEVICE_RESOURCE = 7;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ClockResourceImpl <em>Clock Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ClockResourceImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getClockResource()
	 * @generated
	 */
	int CLOCK_RESOURCE = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.TimerResourceImpl <em>Timer Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.TimerResourceImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getTimerResource()
	 * @generated
	 */
	int TIMER_RESOURCE = 34;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceServiceImpl <em>Resource Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ResourceServiceImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourceService()
	 * @generated
	 */
	int RESOURCE_SERVICE = 23;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.CommunicationEndPointImpl <em>Communication End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.CommunicationEndPointImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getCommunicationEndPoint()
	 * @generated
	 */
	int COMMUNICATION_END_POINT = 2;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.CommunicationMediaImpl <em>Communication Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.CommunicationMediaImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getCommunicationMedia()
	 * @generated
	 */
	int COMMUNICATION_MEDIA = 3;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceConnectorImpl <em>Resource Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ResourceConnectorImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourceConnector()
	 * @generated
	 */
	int RESOURCE_CONNECTOR = 15;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourcePortImpl <em>Resource Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ResourcePortImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourcePort()
	 * @generated
	 */
	int RESOURCE_PORT = 22;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceBrokerImpl <em>Resource Broker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ResourceBrokerImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourceBroker()
	 * @generated
	 */
	int RESOURCE_BROKER = 14;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceManagerImpl <em>Resource Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ResourceManagerImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourceManager()
	 * @generated
	 */
	int RESOURCE_MANAGER = 19;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.AccessControlPolicyImpl <em>Access Control Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.AccessControlPolicyImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getAccessControlPolicy()
	 * @generated
	 */
	int ACCESS_CONTROL_POLICY = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_POLICY__EANNOTATIONS = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_POLICY__NAME = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Access Control Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_POLICY_FEATURE_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_POLICY___GET_EANNOTATION__STRING = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Access Control Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_POLICY_OPERATION_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PACKAGEABLE_ELEMENT__EANNOTATIONS = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGEABLE_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PACKAGEABLE_ELEMENT__NAME = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Resource Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PACKAGEABLE_ELEMENT_FEATURE_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PACKAGEABLE_ELEMENT___GET_EANNOTATION__STRING = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGEABLE_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Resource Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PACKAGEABLE_ELEMENT_OPERATION_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EANNOTATIONS = RESOURCE_PACKAGEABLE_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = RESOURCE_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__OWNED_RESOURCE = RESOURCE_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RES_MULT = RESOURCE_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__IS_PROTECTED = RESOURCE_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__IS_ACTIVE = RESOURCE_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__OWNED_PORT = RESOURCE_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__OWNED_CONNECTOR = RESOURCE_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RSERVICES = RESOURCE_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__USED_BY = RESOURCE_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PSERVICES = RESOURCE_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = RESOURCE_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___GET_EANNOTATION__STRING = RESOURCE_PACKAGEABLE_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = RESOURCE_PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESOURCE__EANNOTATIONS = RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESOURCE__OWNED_RESOURCE = RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESOURCE__RES_MULT = RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESOURCE__IS_PROTECTED = RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESOURCE__IS_ACTIVE = RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESOURCE__OWNED_PORT = RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESOURCE__OWNED_CONNECTOR = RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESOURCE__RSERVICES = RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESOURCE__USED_BY = RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESOURCE__PSERVICES = RESOURCE__PSERVICES;

	/**
	 * The number of structural features of the '<em>Timing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESOURCE___GET_EANNOTATION__STRING = RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Timing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESOURCE__EANNOTATIONS = TIMING_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESOURCE__NAME = TIMING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESOURCE__OWNED_RESOURCE = TIMING_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESOURCE__RES_MULT = TIMING_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESOURCE__IS_PROTECTED = TIMING_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESOURCE__IS_ACTIVE = TIMING_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESOURCE__OWNED_PORT = TIMING_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESOURCE__OWNED_CONNECTOR = TIMING_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESOURCE__RSERVICES = TIMING_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESOURCE__USED_BY = TIMING_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESOURCE__PSERVICES = TIMING_RESOURCE__PSERVICES;

	/**
	 * The number of structural features of the '<em>Clock Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESOURCE_FEATURE_COUNT = TIMING_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESOURCE___GET_EANNOTATION__STRING = TIMING_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Clock Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESOURCE_OPERATION_COUNT = TIMING_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_END_POINT__PACKET_SIZE = 0;

	/**
	 * The number of structural features of the '<em>Communication End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_END_POINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Communication End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_END_POINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__EANNOTATIONS = RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__OWNED_RESOURCE = RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__RES_MULT = RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__IS_PROTECTED = RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__IS_ACTIVE = RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__OWNED_PORT = RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__OWNED_CONNECTOR = RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__RSERVICES = RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__USED_BY = RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__PSERVICES = RESOURCE__PSERVICES;

	/**
	 * The number of structural features of the '<em>Communication Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE___GET_EANNOTATION__STRING = RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Communication Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__EANNOTATIONS = COMMUNICATION_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__NAME = COMMUNICATION_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__OWNED_RESOURCE = COMMUNICATION_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__RES_MULT = COMMUNICATION_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__IS_PROTECTED = COMMUNICATION_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__IS_ACTIVE = COMMUNICATION_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__OWNED_PORT = COMMUNICATION_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__OWNED_CONNECTOR = COMMUNICATION_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__RSERVICES = COMMUNICATION_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__USED_BY = COMMUNICATION_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__PSERVICES = COMMUNICATION_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__SPEED_FACTOR = COMMUNICATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__MAIN_SCHEDULER = COMMUNICATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__ELEMENT_SIZE = COMMUNICATION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__CAPACITY = COMMUNICATION_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Packet Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__PACKET_TIME = COMMUNICATION_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__BLOCKING_TIME = COMMUNICATION_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Transm Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__TRANSM_MODE = COMMUNICATION_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Communication Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_FEATURE_COUNT = COMMUNICATION_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA___GET_EANNOTATION__STRING = COMMUNICATION_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Communication Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_OPERATION_COUNT = COMMUNICATION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__EANNOTATIONS = RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__OWNED_RESOURCE = RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__RES_MULT = RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__IS_PROTECTED = RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__IS_ACTIVE = RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__OWNED_PORT = RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__OWNED_CONNECTOR = RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__RSERVICES = RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__USED_BY = RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__PSERVICES = RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__SPEED_FACTOR = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__MAIN_SCHEDULER = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Processing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE___GET_EANNOTATION__STRING = RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Processing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__EANNOTATIONS = PROCESSING_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__NAME = PROCESSING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__OWNED_RESOURCE = PROCESSING_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__RES_MULT = PROCESSING_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__IS_PROTECTED = PROCESSING_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__IS_ACTIVE = PROCESSING_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__OWNED_PORT = PROCESSING_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__OWNED_CONNECTOR = PROCESSING_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__RSERVICES = PROCESSING_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__USED_BY = PROCESSING_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__PSERVICES = PROCESSING_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__SPEED_FACTOR = PROCESSING_RESOURCE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__MAIN_SCHEDULER = PROCESSING_RESOURCE__MAIN_SCHEDULER;

	/**
	 * The number of structural features of the '<em>Computing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_FEATURE_COUNT = PROCESSING_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE___GET_EANNOTATION__STRING = PROCESSING_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Computing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_OPERATION_COUNT = PROCESSING_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_RESOURCE__EANNOTATIONS = RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_RESOURCE__OWNED_RESOURCE = RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_RESOURCE__RES_MULT = RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_RESOURCE__IS_PROTECTED = RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_RESOURCE__IS_ACTIVE = RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_RESOURCE__OWNED_PORT = RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_RESOURCE__OWNED_CONNECTOR = RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_RESOURCE__RSERVICES = RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_RESOURCE__USED_BY = RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_RESOURCE__PSERVICES = RESOURCE__PSERVICES;

	/**
	 * The number of structural features of the '<em>Concurrency Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_RESOURCE___GET_EANNOTATION__STRING = RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Concurrency Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE__EANNOTATIONS = PROCESSING_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE__NAME = PROCESSING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE__OWNED_RESOURCE = PROCESSING_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE__RES_MULT = PROCESSING_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE__IS_PROTECTED = PROCESSING_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE__IS_ACTIVE = PROCESSING_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE__OWNED_PORT = PROCESSING_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE__OWNED_CONNECTOR = PROCESSING_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE__RSERVICES = PROCESSING_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE__USED_BY = PROCESSING_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE__PSERVICES = PROCESSING_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE__SPEED_FACTOR = PROCESSING_RESOURCE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE__MAIN_SCHEDULER = PROCESSING_RESOURCE__MAIN_SCHEDULER;

	/**
	 * The number of structural features of the '<em>Device Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE_FEATURE_COUNT = PROCESSING_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE___GET_EANNOTATION__STRING = PROCESSING_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Device Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE_OPERATION_COUNT = PROCESSING_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceControlPolicyImpl <em>Resource Control Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ResourceControlPolicyImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourceControlPolicy()
	 * @generated
	 */
	int RESOURCE_CONTROL_POLICY = 16;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.SchedulerImpl <em>Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.SchedulerImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getScheduler()
	 * @generated
	 */
	int SCHEDULER = 25;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.SecondarySchedulerImpl <em>Secondary Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.SecondarySchedulerImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getSecondaryScheduler()
	 * @generated
	 */
	int SECONDARY_SCHEDULER = 29;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.SchedulableResourceImpl <em>Schedulable Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.SchedulableResourceImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getSchedulableResource()
	 * @generated
	 */
	int SCHEDULABLE_RESOURCE = 26;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.SchedulingParameterImpl <em>Scheduling Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.SchedulingParameterImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getSchedulingParameter()
	 * @generated
	 */
	int SCHEDULING_PARAMETER = 27;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.SchedulingPolicyImpl <em>Scheduling Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.SchedulingPolicyImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getSchedulingPolicy()
	 * @generated
	 */
	int SCHEDULING_POLICY = 28;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.MutualExclusionResourceImpl <em>Mutual Exclusion Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.MutualExclusionResourceImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getMutualExclusionResource()
	 * @generated
	 */
	int MUTUAL_EXCLUSION_RESOURCE = 10;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.MutualExclusionProtocolImpl <em>Mutual Exclusion Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.MutualExclusionProtocolImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getMutualExclusionProtocol()
	 * @generated
	 */
	int MUTUAL_EXCLUSION_PROTOCOL = 9;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ProtectionParameterImpl <em>Protection Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ProtectionParameterImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getProtectionParameter()
	 * @generated
	 */
	int PROTECTION_PARAMETER = 12;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.UsageDemandImpl <em>Usage Demand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.UsageDemandImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getUsageDemand()
	 * @generated
	 */
	int USAGE_DEMAND = 35;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceUsageImpl <em>Resource Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ResourceUsageImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourceUsage()
	 * @generated
	 */
	int RESOURCE_USAGE = 24;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_USAGE__WORKLOAD = 0;

	/**
	 * The feature id for the '<em><b>Required Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_USAGE__REQUIRED_AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Used Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_USAGE__USED_RESOURCE = 2;

	/**
	 * The number of structural features of the '<em>Resource Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_USAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_USAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.UsageTypedAmountImpl <em>Usage Typed Amount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.UsageTypedAmountImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getUsageTypedAmount()
	 * @generated
	 */
	int USAGE_TYPED_AMOUNT = 36;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.DynamicUsageImpl <em>Dynamic Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.DynamicUsageImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getDynamicUsage()
	 * @generated
	 */
	int DYNAMIC_USAGE = 8;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_USAGE__WORKLOAD = RESOURCE_USAGE__WORKLOAD;

	/**
	 * The feature id for the '<em><b>Required Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_USAGE__REQUIRED_AMOUNT = RESOURCE_USAGE__REQUIRED_AMOUNT;

	/**
	 * The feature id for the '<em><b>Used Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_USAGE__USED_RESOURCE = RESOURCE_USAGE__USED_RESOURCE;

	/**
	 * The number of structural features of the '<em>Dynamic Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_USAGE_FEATURE_COUNT = RESOURCE_USAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dynamic Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_USAGE_OPERATION_COUNT = RESOURCE_USAGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_PROTOCOL__EANNOTATIONS = ACCESS_CONTROL_POLICY__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_PROTOCOL__NAME = ACCESS_CONTROL_POLICY__NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_PROTOCOL__PROTOCOL = ACCESS_CONTROL_POLICY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Other Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_PROTOCOL__OTHER_PROTOCOL = ACCESS_CONTROL_POLICY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mutual Exclusion Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_PROTOCOL_FEATURE_COUNT = ACCESS_CONTROL_POLICY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_PROTOCOL___GET_EANNOTATION__STRING = ACCESS_CONTROL_POLICY___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Mutual Exclusion Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_PROTOCOL_OPERATION_COUNT = ACCESS_CONTROL_POLICY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_RESOURCE__EANNOTATIONS = RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_RESOURCE__OWNED_RESOURCE = RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_RESOURCE__RES_MULT = RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_RESOURCE__IS_PROTECTED = RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_RESOURCE__IS_ACTIVE = RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_RESOURCE__OWNED_PORT = RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_RESOURCE__OWNED_CONNECTOR = RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_RESOURCE__RSERVICES = RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_RESOURCE__USED_BY = RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_RESOURCE__PSERVICES = RESOURCE__PSERVICES;

	/**
	 * The number of structural features of the '<em>Synch Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_RESOURCE___GET_EANNOTATION__STRING = RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Synch Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__EANNOTATIONS = SYNCH_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__NAME = SYNCH_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__OWNED_RESOURCE = SYNCH_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__RES_MULT = SYNCH_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__IS_PROTECTED = SYNCH_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__IS_ACTIVE = SYNCH_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__OWNED_PORT = SYNCH_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__OWNED_CONNECTOR = SYNCH_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__RSERVICES = SYNCH_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__USED_BY = SYNCH_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__PSERVICES = SYNCH_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__SCHEDULER = SYNCH_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__PROTOCOL = SYNCH_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protect Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS = SYNCH_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mutual Exclusion Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE_FEATURE_COUNT = SYNCH_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE___GET_EANNOTATION__STRING = SYNCH_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Mutual Exclusion Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE_OPERATION_COUNT = SYNCH_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PARAMETER__EANNOTATIONS = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PARAMETER__NAME = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Priority Ceiling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PARAMETER__PRIORITY_CEILING = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preemption Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PARAMETER__PREEMPTION_LEVEL = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Protection Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PARAMETER_FEATURE_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PARAMETER___GET_EANNOTATION__STRING = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Protection Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PARAMETER_OPERATION_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BROKER__EANNOTATIONS = RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BROKER__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BROKER__OWNED_RESOURCE = RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BROKER__RES_MULT = RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BROKER__IS_PROTECTED = RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BROKER__IS_ACTIVE = RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BROKER__OWNED_PORT = RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BROKER__OWNED_CONNECTOR = RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BROKER__RSERVICES = RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BROKER__USED_BY = RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BROKER__PSERVICES = RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Broked Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BROKER__BROKED_RESOURCE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Acc Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BROKER__ACC_CTRL_POLICY = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BROKER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BROKER___GET_EANNOTATION__STRING = RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Resource Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BROKER_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONNECTOR__SOURCE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONNECTOR__TARGET_PORT = 1;

	/**
	 * The number of structural features of the '<em>Resource Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_POLICY__EANNOTATIONS = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_POLICY__NAME = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Resource Control Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_POLICY_FEATURE_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_POLICY___GET_EANNOTATION__STRING = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Resource Control Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROL_POLICY_OPERATION_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__EANNOTATIONS = RESOURCE_PACKAGEABLE_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__NAME = RESOURCE_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__TYPE = RESOURCE_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__PORT = RESOURCE_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_FEATURE_COUNT = RESOURCE_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___GET_EANNOTATION__STRING = RESOURCE_PACKAGEABLE_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_OPERATION_COUNT = RESOURCE_PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.StaticUsageImpl <em>Static Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.StaticUsageImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getStaticUsage()
	 * @generated
	 */
	int STATIC_USAGE = 30;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceInterfaceImpl <em>Resource Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.impl.ResourceInterfaceImpl
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourceInterface()
	 * @generated
	 */
	int RESOURCE_INTERFACE = 18;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE__EANNOTATIONS = RESOURCE_PACKAGEABLE_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE__NAME = RESOURCE_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE__OWNED_SERVICE = RESOURCE_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_FEATURE_COUNT = RESOURCE_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE___GET_EANNOTATION__STRING = RESOURCE_PACKAGEABLE_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Resource Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_OPERATION_COUNT = RESOURCE_PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER__EANNOTATIONS = RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER__OWNED_RESOURCE = RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER__RES_MULT = RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER__IS_PROTECTED = RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER__IS_ACTIVE = RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER__OWNED_PORT = RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER__OWNED_CONNECTOR = RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER__RSERVICES = RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER__USED_BY = RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER__PSERVICES = RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Managed Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER__MANAGED_RESOURCE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER__RES_CTRL_POLICY = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER___GET_EANNOTATION__STRING = RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Resource Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MANAGER_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PACKAGE__EANNOTATIONS = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PACKAGE__NAME = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PACKAGE__OWNED_ELEMENT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGE__OWNED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Resource Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PACKAGE_FEATURE_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PACKAGE___GET_EANNOTATION__STRING = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Resource Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PACKAGE_OPERATION_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PORT__PACKET_SIZE = COMMUNICATION_END_POINT__PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PORT__EANNOTATIONS = COMMUNICATION_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PORT__NAME = COMMUNICATION_END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>PInterface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PORT__PINTERFACE = COMMUNICATION_END_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>RInterface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PORT__RINTERFACE = COMMUNICATION_END_POINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resource Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PORT_FEATURE_COUNT = COMMUNICATION_END_POINT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PORT___GET_EANNOTATION__STRING = COMMUNICATION_END_POINT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PORT_OPERATION_COUNT = COMMUNICATION_END_POINT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERVICE__EANNOTATIONS = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERVICE__NAME = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERVICE__CONTEXT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERVICE_FEATURE_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERVICE___GET_EANNOTATION__STRING = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Resource Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SERVICE_OPERATION_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__EANNOTATIONS = RESOURCE_BROKER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__NAME = RESOURCE_BROKER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__OWNED_RESOURCE = RESOURCE_BROKER__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__RES_MULT = RESOURCE_BROKER__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__IS_PROTECTED = RESOURCE_BROKER__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__IS_ACTIVE = RESOURCE_BROKER__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__OWNED_PORT = RESOURCE_BROKER__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__OWNED_CONNECTOR = RESOURCE_BROKER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__RSERVICES = RESOURCE_BROKER__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__USED_BY = RESOURCE_BROKER__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__PSERVICES = RESOURCE_BROKER__PSERVICES;

	/**
	 * The feature id for the '<em><b>Broked Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__BROKED_RESOURCE = RESOURCE_BROKER__BROKED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Acc Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__ACC_CTRL_POLICY = RESOURCE_BROKER__ACC_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__HOST = RESOURCE_BROKER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processing Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__PROCESSING_UNITS = RESOURCE_BROKER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schedulable Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__SCHEDULABLE_RESOURCE = RESOURCE_BROKER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__POLICY = RESOURCE_BROKER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_FEATURE_COUNT = RESOURCE_BROKER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___GET_EANNOTATION__STRING = RESOURCE_BROKER___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_OPERATION_COUNT = RESOURCE_BROKER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE__EANNOTATIONS = CONCURRENCY_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE__NAME = CONCURRENCY_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE__OWNED_RESOURCE = CONCURRENCY_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE__RES_MULT = CONCURRENCY_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE__IS_PROTECTED = CONCURRENCY_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE__IS_ACTIVE = CONCURRENCY_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE__OWNED_PORT = CONCURRENCY_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE__OWNED_CONNECTOR = CONCURRENCY_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE__RSERVICES = CONCURRENCY_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE__USED_BY = CONCURRENCY_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE__PSERVICES = CONCURRENCY_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Dependent Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER = CONCURRENCY_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE__HOST = CONCURRENCY_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sched Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE__SCHED_PARAMS = CONCURRENCY_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Schedulable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE_FEATURE_COUNT = CONCURRENCY_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE___GET_EANNOTATION__STRING = CONCURRENCY_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Schedulable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_RESOURCE_OPERATION_COUNT = CONCURRENCY_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_PARAMETER__EANNOTATIONS = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_PARAMETER__NAME = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_PARAMETER__VALUE = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scheduling Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_PARAMETER_FEATURE_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_PARAMETER___GET_EANNOTATION__STRING = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Scheduling Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_PARAMETER_OPERATION_COUNT = org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY__EANNOTATIONS = ACCESS_CONTROL_POLICY__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY__NAME = ACCESS_CONTROL_POLICY__NAME;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY__POLICY = ACCESS_CONTROL_POLICY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Other Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY__OTHER_SCHED_POLICY = ACCESS_CONTROL_POLICY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_FEATURE_COUNT = ACCESS_CONTROL_POLICY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY___GET_EANNOTATION__STRING = ACCESS_CONTROL_POLICY___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Has Valid Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY___HAS_VALID_POLICY__DIAGNOSTICCHAIN_MAP = ACCESS_CONTROL_POLICY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_OPERATION_COUNT = ACCESS_CONTROL_POLICY_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__EANNOTATIONS = SCHEDULER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__NAME = SCHEDULER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__OWNED_RESOURCE = SCHEDULER__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__RES_MULT = SCHEDULER__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__IS_PROTECTED = SCHEDULER__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__IS_ACTIVE = SCHEDULER__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__OWNED_PORT = SCHEDULER__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__OWNED_CONNECTOR = SCHEDULER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__RSERVICES = SCHEDULER__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__USED_BY = SCHEDULER__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__PSERVICES = SCHEDULER__PSERVICES;

	/**
	 * The feature id for the '<em><b>Broked Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__BROKED_RESOURCE = SCHEDULER__BROKED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Acc Ctrl Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__ACC_CTRL_POLICY = SCHEDULER__ACC_CTRL_POLICY;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__HOST = SCHEDULER__HOST;

	/**
	 * The feature id for the '<em><b>Processing Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__PROCESSING_UNITS = SCHEDULER__PROCESSING_UNITS;

	/**
	 * The feature id for the '<em><b>Schedulable Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__SCHEDULABLE_RESOURCE = SCHEDULER__SCHEDULABLE_RESOURCE;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__POLICY = SCHEDULER__POLICY;

	/**
	 * The feature id for the '<em><b>Virtual Processing Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNIT = SCHEDULER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Secondary Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER_FEATURE_COUNT = SCHEDULER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER___GET_EANNOTATION__STRING = SCHEDULER___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Secondary Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER_OPERATION_COUNT = SCHEDULER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_USAGE__WORKLOAD = RESOURCE_USAGE__WORKLOAD;

	/**
	 * The feature id for the '<em><b>Required Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_USAGE__REQUIRED_AMOUNT = RESOURCE_USAGE__REQUIRED_AMOUNT;

	/**
	 * The feature id for the '<em><b>Used Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_USAGE__USED_RESOURCE = RESOURCE_USAGE__USED_RESOURCE;

	/**
	 * The number of structural features of the '<em>Static Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_USAGE_FEATURE_COUNT = RESOURCE_USAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Static Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_USAGE_OPERATION_COUNT = RESOURCE_USAGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RESOURCE__EANNOTATIONS = RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RESOURCE__OWNED_RESOURCE = RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RESOURCE__RES_MULT = RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RESOURCE__IS_PROTECTED = RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RESOURCE__IS_ACTIVE = RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RESOURCE__OWNED_PORT = RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RESOURCE__OWNED_CONNECTOR = RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RESOURCE__RSERVICES = RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RESOURCE__USED_BY = RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RESOURCE__PSERVICES = RESOURCE__PSERVICES;

	/**
	 * The number of structural features of the '<em>Storage Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RESOURCE___GET_EANNOTATION__STRING = RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Storage Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__EANNOTATIONS = TIMING_RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__NAME = TIMING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__OWNED_RESOURCE = TIMING_RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__RES_MULT = TIMING_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__IS_PROTECTED = TIMING_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__IS_ACTIVE = TIMING_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__OWNED_PORT = TIMING_RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__OWNED_CONNECTOR = TIMING_RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__RSERVICES = TIMING_RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__USED_BY = TIMING_RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__PSERVICES = TIMING_RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__DURATION = TIMING_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Periodic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__IS_PERIODIC = TIMING_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__START = TIMING_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__SET = TIMING_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Get</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__GET = TIMING_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__RESET = TIMING_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE__PAUSE = TIMING_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Timer Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE_FEATURE_COUNT = TIMING_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE___GET_EANNOTATION__STRING = TIMING_RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Timer Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RESOURCE_OPERATION_COUNT = TIMING_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_DEMAND__USAGE = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_DEMAND__EVENT = 1;

	/**
	 * The number of structural features of the '<em>Usage Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_DEMAND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Usage Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_DEMAND_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__EANNOTATIONS = RESOURCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__OWNED_RESOURCE = RESOURCE__OWNED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__RES_MULT = RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__IS_PROTECTED = RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__IS_ACTIVE = RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__OWNED_PORT = RESOURCE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__OWNED_CONNECTOR = RESOURCE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>RServices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__RSERVICES = RESOURCE__RSERVICES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__USED_BY = RESOURCE__USED_BY;

	/**
	 * The feature id for the '<em><b>PServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__PSERVICES = RESOURCE__PSERVICES;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__EXEC_TIME = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__MSG_SIZE = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allocatedmemory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__ALLOCATEDMEMORY = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__USED_MEMORY = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__POWER_PEAK = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT__ENERGY = RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Usage Typed Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT___GET_EANNOTATION__STRING = RESOURCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Usage Typed Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TYPED_AMOUNT_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.TransmModeKind <em>Transm Mode Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.TransmModeKind
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getTransmModeKind()
	 * @generated
	 */
	int TRANSM_MODE_KIND = 39;

	/**
	 * The meta object id for the '<em>NFP Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getNFP_Duration()
	 * @generated
	 */
	int NFP_DURATION = 40;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.SchedPolicyKind <em>Sched Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.SchedPolicyKind
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getSchedPolicyKind()
	 * @generated
	 */
	int SCHED_POLICY_KIND = 38;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.grm.ProtectProtocolKind <em>Protect Protocol Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.grm.ProtectProtocolKind
	 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getProtectProtocolKind()
	 * @generated
	 */
	int PROTECT_PROTOCOL_KIND = 37;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.ResourcePackage <em>Resource Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Package</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourcePackage
	 * @generated
	 */
	EClass getResourcePackage();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.ResourcePackageableElement <em>Resource Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Packageable Element</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourcePackageableElement
	 * @generated
	 */
	EClass getResourcePackageableElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.ResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Instance</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceInstance
	 * @generated
	 */
	EClass getResourceInstance();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.grm.ResourceInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceInstance#getType()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EReference getResourceInstance_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.grm.ResourceInstance#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceInstance#getPort()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EReference getResourceInstance_Port();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.grm.Resource#getOwnedResource <em>Owned Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.Resource#getOwnedResource()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_OwnedResource();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.Resource#getResMult <em>Res Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res Mult</em>'.
	 * @see org.polarsys.time4sys.marte.grm.Resource#getResMult()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ResMult();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.Resource#isIsProtected <em>Is Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Protected</em>'.
	 * @see org.polarsys.time4sys.marte.grm.Resource#isIsProtected()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_IsProtected();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.Resource#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see org.polarsys.time4sys.marte.grm.Resource#isIsActive()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_IsActive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.grm.Resource#getPServices <em>PServices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>PServices</em>'.
	 * @see org.polarsys.time4sys.marte.grm.Resource#getPServices()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_PServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.grm.Resource#getOwnedPort <em>Owned Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Port</em>'.
	 * @see org.polarsys.time4sys.marte.grm.Resource#getOwnedPort()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_OwnedPort();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.grm.Resource#getOwnedConnector <em>Owned Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Connector</em>'.
	 * @see org.polarsys.time4sys.marte.grm.Resource#getOwnedConnector()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_OwnedConnector();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.grm.Resource#getRServices <em>RServices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RServices</em>'.
	 * @see org.polarsys.time4sys.marte.grm.Resource#getRServices()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_RServices();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.grm.Resource#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used By</em>'.
	 * @see org.polarsys.time4sys.marte.grm.Resource#getUsedBy()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_UsedBy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.StorageResource <em>Storage Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.StorageResource
	 * @generated
	 */
	EClass getStorageResource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.TimingResource <em>Timing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.TimingResource
	 * @generated
	 */
	EClass getTimingResource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.CommunicationResource <em>Communication Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.CommunicationResource
	 * @generated
	 */
	EClass getCommunicationResource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.SynchResource <em>Synch Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synch Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.SynchResource
	 * @generated
	 */
	EClass getSynchResource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.ConcurrencyResource <em>Concurrency Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrency Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ConcurrencyResource
	 * @generated
	 */
	EClass getConcurrencyResource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.ComputingResource <em>Computing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ComputingResource
	 * @generated
	 */
	EClass getComputingResource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.DeviceResource <em>Device Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.DeviceResource
	 * @generated
	 */
	EClass getDeviceResource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.ClockResource <em>Clock Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ClockResource
	 * @generated
	 */
	EClass getClockResource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.TimerResource <em>Timer Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.TimerResource
	 * @generated
	 */
	EClass getTimerResource();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.TimerResource#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.polarsys.time4sys.marte.grm.TimerResource#getDuration()
	 * @see #getTimerResource()
	 * @generated
	 */
	EAttribute getTimerResource_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.TimerResource#isIsPeriodic <em>Is Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Periodic</em>'.
	 * @see org.polarsys.time4sys.marte.grm.TimerResource#isIsPeriodic()
	 * @see #getTimerResource()
	 * @generated
	 */
	EAttribute getTimerResource_IsPeriodic();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.grm.TimerResource#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.polarsys.time4sys.marte.grm.TimerResource#getStart()
	 * @see #getTimerResource()
	 * @generated
	 */
	EReference getTimerResource_Start();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.grm.TimerResource#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set</em>'.
	 * @see org.polarsys.time4sys.marte.grm.TimerResource#getSet()
	 * @see #getTimerResource()
	 * @generated
	 */
	EReference getTimerResource_Set();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.grm.TimerResource#getGet <em>Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get</em>'.
	 * @see org.polarsys.time4sys.marte.grm.TimerResource#getGet()
	 * @see #getTimerResource()
	 * @generated
	 */
	EReference getTimerResource_Get();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.grm.TimerResource#getReset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reset</em>'.
	 * @see org.polarsys.time4sys.marte.grm.TimerResource#getReset()
	 * @see #getTimerResource()
	 * @generated
	 */
	EReference getTimerResource_Reset();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.grm.TimerResource#getPause <em>Pause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pause</em>'.
	 * @see org.polarsys.time4sys.marte.grm.TimerResource#getPause()
	 * @see #getTimerResource()
	 * @generated
	 */
	EReference getTimerResource_Pause();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.ResourceService <em>Resource Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Service</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceService
	 * @generated
	 */
	EClass getResourceService();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.marte.grm.ResourceService#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceService#getContext()
	 * @see #getResourceService()
	 * @generated
	 */
	EReference getResourceService_Context();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.CommunicationEndPoint <em>Communication End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication End Point</em>'.
	 * @see org.polarsys.time4sys.marte.grm.CommunicationEndPoint
	 * @generated
	 */
	EClass getCommunicationEndPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.CommunicationEndPoint#getPacketSize <em>Packet Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Size</em>'.
	 * @see org.polarsys.time4sys.marte.grm.CommunicationEndPoint#getPacketSize()
	 * @see #getCommunicationEndPoint()
	 * @generated
	 */
	EAttribute getCommunicationEndPoint_PacketSize();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.CommunicationMedia <em>Communication Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Media</em>'.
	 * @see org.polarsys.time4sys.marte.grm.CommunicationMedia
	 * @generated
	 */
	EClass getCommunicationMedia();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.CommunicationMedia#getElementSize <em>Element Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Size</em>'.
	 * @see org.polarsys.time4sys.marte.grm.CommunicationMedia#getElementSize()
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	EAttribute getCommunicationMedia_ElementSize();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.CommunicationMedia#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see org.polarsys.time4sys.marte.grm.CommunicationMedia#getCapacity()
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	EAttribute getCommunicationMedia_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.CommunicationMedia#getPacketTime <em>Packet Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Time</em>'.
	 * @see org.polarsys.time4sys.marte.grm.CommunicationMedia#getPacketTime()
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	EAttribute getCommunicationMedia_PacketTime();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.CommunicationMedia#getBlockingTime <em>Blocking Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocking Time</em>'.
	 * @see org.polarsys.time4sys.marte.grm.CommunicationMedia#getBlockingTime()
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	EAttribute getCommunicationMedia_BlockingTime();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.CommunicationMedia#getTransmMode <em>Transm Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transm Mode</em>'.
	 * @see org.polarsys.time4sys.marte.grm.CommunicationMedia#getTransmMode()
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	EAttribute getCommunicationMedia_TransmMode();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.ProcessingResource <em>Processing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ProcessingResource
	 * @generated
	 */
	EClass getProcessingResource();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.ProcessingResource#getSpeedFactor <em>Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Factor</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ProcessingResource#getSpeedFactor()
	 * @see #getProcessingResource()
	 * @generated
	 */
	EAttribute getProcessingResource_SpeedFactor();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.grm.ProcessingResource#getMainScheduler <em>Main Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Scheduler</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ProcessingResource#getMainScheduler()
	 * @see #getProcessingResource()
	 * @generated
	 */
	EReference getProcessingResource_MainScheduler();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.ResourceConnector <em>Resource Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Connector</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceConnector
	 * @generated
	 */
	EClass getResourceConnector();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.grm.ResourceConnector#getSourcePort <em>Source Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Port</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceConnector#getSourcePort()
	 * @see #getResourceConnector()
	 * @generated
	 */
	EReference getResourceConnector_SourcePort();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.grm.ResourceConnector#getTargetPort <em>Target Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Port</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceConnector#getTargetPort()
	 * @see #getResourceConnector()
	 * @generated
	 */
	EReference getResourceConnector_TargetPort();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.ResourcePort <em>Resource Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Port</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourcePort
	 * @generated
	 */
	EClass getResourcePort();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.grm.ResourcePort#getPInterface <em>PInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>PInterface</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourcePort#getPInterface()
	 * @see #getResourcePort()
	 * @generated
	 */
	EReference getResourcePort_PInterface();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.grm.ResourcePort#getRInterface <em>RInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RInterface</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourcePort#getRInterface()
	 * @see #getResourcePort()
	 * @generated
	 */
	EReference getResourcePort_RInterface();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.ResourceBroker <em>Resource Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Broker</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceBroker
	 * @generated
	 */
	EClass getResourceBroker();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.grm.ResourceBroker#getBrokedResource <em>Broked Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Broked Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceBroker#getBrokedResource()
	 * @see #getResourceBroker()
	 * @generated
	 */
	EReference getResourceBroker_BrokedResource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.grm.ResourceBroker#getAccCtrlPolicy <em>Acc Ctrl Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acc Ctrl Policy</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceBroker#getAccCtrlPolicy()
	 * @see #getResourceBroker()
	 * @generated
	 */
	EReference getResourceBroker_AccCtrlPolicy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.ResourceManager <em>Resource Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Manager</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceManager
	 * @generated
	 */
	EClass getResourceManager();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.grm.ResourceManager#getManagedResource <em>Managed Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Managed Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceManager#getManagedResource()
	 * @see #getResourceManager()
	 * @generated
	 */
	EReference getResourceManager_ManagedResource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.grm.ResourceManager#getResCtrlPolicy <em>Res Ctrl Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Res Ctrl Policy</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceManager#getResCtrlPolicy()
	 * @see #getResourceManager()
	 * @generated
	 */
	EReference getResourceManager_ResCtrlPolicy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.AccessControlPolicy <em>Access Control Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Control Policy</em>'.
	 * @see org.polarsys.time4sys.marte.grm.AccessControlPolicy
	 * @generated
	 */
	EClass getAccessControlPolicy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.ResourceControlPolicy <em>Resource Control Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Control Policy</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceControlPolicy
	 * @generated
	 */
	EClass getResourceControlPolicy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler</em>'.
	 * @see org.polarsys.time4sys.marte.grm.Scheduler
	 * @generated
	 */
	EClass getScheduler();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.grm.Scheduler#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see org.polarsys.time4sys.marte.grm.Scheduler#getHost()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Host();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.grm.Scheduler#getProcessingUnits <em>Processing Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processing Units</em>'.
	 * @see org.polarsys.time4sys.marte.grm.Scheduler#getProcessingUnits()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_ProcessingUnits();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.grm.Scheduler#getSchedulableResource <em>Schedulable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schedulable Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.Scheduler#getSchedulableResource()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_SchedulableResource();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.marte.grm.Scheduler#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy</em>'.
	 * @see org.polarsys.time4sys.marte.grm.Scheduler#getPolicy()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Policy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.SecondaryScheduler <em>Secondary Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secondary Scheduler</em>'.
	 * @see org.polarsys.time4sys.marte.grm.SecondaryScheduler
	 * @generated
	 */
	EClass getSecondaryScheduler();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.grm.SecondaryScheduler#getVirtualProcessingUnit <em>Virtual Processing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Virtual Processing Unit</em>'.
	 * @see org.polarsys.time4sys.marte.grm.SecondaryScheduler#getVirtualProcessingUnit()
	 * @see #getSecondaryScheduler()
	 * @generated
	 */
	EReference getSecondaryScheduler_VirtualProcessingUnit();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.SchedulableResource <em>Schedulable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedulable Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.SchedulableResource
	 * @generated
	 */
	EClass getSchedulableResource();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.grm.SchedulableResource#getDependentScheduler <em>Dependent Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependent Scheduler</em>'.
	 * @see org.polarsys.time4sys.marte.grm.SchedulableResource#getDependentScheduler()
	 * @see #getSchedulableResource()
	 * @generated
	 */
	EReference getSchedulableResource_DependentScheduler();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.grm.SchedulableResource#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see org.polarsys.time4sys.marte.grm.SchedulableResource#getHost()
	 * @see #getSchedulableResource()
	 * @generated
	 */
	EReference getSchedulableResource_Host();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.grm.SchedulableResource#getSchedParams <em>Sched Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sched Params</em>'.
	 * @see org.polarsys.time4sys.marte.grm.SchedulableResource#getSchedParams()
	 * @see #getSchedulableResource()
	 * @generated
	 */
	EReference getSchedulableResource_SchedParams();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.SchedulingParameter <em>Scheduling Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Parameter</em>'.
	 * @see org.polarsys.time4sys.marte.grm.SchedulingParameter
	 * @generated
	 */
	EClass getSchedulingParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.SchedulingParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.marte.grm.SchedulingParameter#getValue()
	 * @see #getSchedulingParameter()
	 * @generated
	 */
	EAttribute getSchedulingParameter_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.SchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Policy</em>'.
	 * @see org.polarsys.time4sys.marte.grm.SchedulingPolicy
	 * @generated
	 */
	EClass getSchedulingPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.SchedulingPolicy#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy</em>'.
	 * @see org.polarsys.time4sys.marte.grm.SchedulingPolicy#getPolicy()
	 * @see #getSchedulingPolicy()
	 * @generated
	 */
	EAttribute getSchedulingPolicy_Policy();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.SchedulingPolicy#getOtherSchedPolicy <em>Other Sched Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Sched Policy</em>'.
	 * @see org.polarsys.time4sys.marte.grm.SchedulingPolicy#getOtherSchedPolicy()
	 * @see #getSchedulingPolicy()
	 * @generated
	 */
	EAttribute getSchedulingPolicy_OtherSchedPolicy();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.grm.SchedulingPolicy#hasValidPolicy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Valid Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Valid Policy</em>' operation.
	 * @see org.polarsys.time4sys.marte.grm.SchedulingPolicy#hasValidPolicy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSchedulingPolicy__HasValidPolicy__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.MutualExclusionResource <em>Mutual Exclusion Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutual Exclusion Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.MutualExclusionResource
	 * @generated
	 */
	EClass getMutualExclusionResource();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.grm.MutualExclusionResource#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduler</em>'.
	 * @see org.polarsys.time4sys.marte.grm.MutualExclusionResource#getScheduler()
	 * @see #getMutualExclusionResource()
	 * @generated
	 */
	EReference getMutualExclusionResource_Scheduler();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.marte.grm.MutualExclusionResource#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocol</em>'.
	 * @see org.polarsys.time4sys.marte.grm.MutualExclusionResource#getProtocol()
	 * @see #getMutualExclusionResource()
	 * @generated
	 */
	EReference getMutualExclusionResource_Protocol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.grm.MutualExclusionResource#getProtectParams <em>Protect Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protect Params</em>'.
	 * @see org.polarsys.time4sys.marte.grm.MutualExclusionResource#getProtectParams()
	 * @see #getMutualExclusionResource()
	 * @generated
	 */
	EReference getMutualExclusionResource_ProtectParams();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.MutualExclusionProtocol <em>Mutual Exclusion Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutual Exclusion Protocol</em>'.
	 * @see org.polarsys.time4sys.marte.grm.MutualExclusionProtocol
	 * @generated
	 */
	EClass getMutualExclusionProtocol();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.MutualExclusionProtocol#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.polarsys.time4sys.marte.grm.MutualExclusionProtocol#getProtocol()
	 * @see #getMutualExclusionProtocol()
	 * @generated
	 */
	EAttribute getMutualExclusionProtocol_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.MutualExclusionProtocol#getOtherProtocol <em>Other Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Protocol</em>'.
	 * @see org.polarsys.time4sys.marte.grm.MutualExclusionProtocol#getOtherProtocol()
	 * @see #getMutualExclusionProtocol()
	 * @generated
	 */
	EAttribute getMutualExclusionProtocol_OtherProtocol();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.ProtectionParameter <em>Protection Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protection Parameter</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ProtectionParameter
	 * @generated
	 */
	EClass getProtectionParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.ProtectionParameter#getPriorityCeiling <em>Priority Ceiling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority Ceiling</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ProtectionParameter#getPriorityCeiling()
	 * @see #getProtectionParameter()
	 * @generated
	 */
	EAttribute getProtectionParameter_PriorityCeiling();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.ProtectionParameter#getPreemptionLevel <em>Preemption Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preemption Level</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ProtectionParameter#getPreemptionLevel()
	 * @see #getProtectionParameter()
	 * @generated
	 */
	EAttribute getProtectionParameter_PreemptionLevel();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.UsageDemand <em>Usage Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Demand</em>'.
	 * @see org.polarsys.time4sys.marte.grm.UsageDemand
	 * @generated
	 */
	EClass getUsageDemand();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.grm.UsageDemand#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usage</em>'.
	 * @see org.polarsys.time4sys.marte.grm.UsageDemand#getUsage()
	 * @see #getUsageDemand()
	 * @generated
	 */
	EReference getUsageDemand_Usage();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.UsageDemand#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see org.polarsys.time4sys.marte.grm.UsageDemand#getEvent()
	 * @see #getUsageDemand()
	 * @generated
	 */
	EAttribute getUsageDemand_Event();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.ResourceUsage <em>Resource Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Usage</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceUsage
	 * @generated
	 */
	EClass getResourceUsage();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.grm.ResourceUsage#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workload</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceUsage#getWorkload()
	 * @see #getResourceUsage()
	 * @generated
	 */
	EReference getResourceUsage_Workload();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.grm.ResourceUsage#getRequiredAmount <em>Required Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Amount</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceUsage#getRequiredAmount()
	 * @see #getResourceUsage()
	 * @generated
	 */
	EReference getResourceUsage_RequiredAmount();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.grm.ResourceUsage#getUsedResource <em>Used Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Resource</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceUsage#getUsedResource()
	 * @see #getResourceUsage()
	 * @generated
	 */
	EReference getResourceUsage_UsedResource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount <em>Usage Typed Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Typed Amount</em>'.
	 * @see org.polarsys.time4sys.marte.grm.UsageTypedAmount
	 * @generated
	 */
	EClass getUsageTypedAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getExecTime <em>Exec Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exec Time</em>'.
	 * @see org.polarsys.time4sys.marte.grm.UsageTypedAmount#getExecTime()
	 * @see #getUsageTypedAmount()
	 * @generated
	 */
	EAttribute getUsageTypedAmount_ExecTime();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getMsgSize <em>Msg Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg Size</em>'.
	 * @see org.polarsys.time4sys.marte.grm.UsageTypedAmount#getMsgSize()
	 * @see #getUsageTypedAmount()
	 * @generated
	 */
	EAttribute getUsageTypedAmount_MsgSize();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getAllocatedmemory <em>Allocatedmemory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocatedmemory</em>'.
	 * @see org.polarsys.time4sys.marte.grm.UsageTypedAmount#getAllocatedmemory()
	 * @see #getUsageTypedAmount()
	 * @generated
	 */
	EAttribute getUsageTypedAmount_Allocatedmemory();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getUsedMemory <em>Used Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used Memory</em>'.
	 * @see org.polarsys.time4sys.marte.grm.UsageTypedAmount#getUsedMemory()
	 * @see #getUsageTypedAmount()
	 * @generated
	 */
	EAttribute getUsageTypedAmount_UsedMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getPowerPeak <em>Power Peak</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Peak</em>'.
	 * @see org.polarsys.time4sys.marte.grm.UsageTypedAmount#getPowerPeak()
	 * @see #getUsageTypedAmount()
	 * @generated
	 */
	EAttribute getUsageTypedAmount_PowerPeak();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.grm.UsageTypedAmount#getEnergy <em>Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy</em>'.
	 * @see org.polarsys.time4sys.marte.grm.UsageTypedAmount#getEnergy()
	 * @see #getUsageTypedAmount()
	 * @generated
	 */
	EAttribute getUsageTypedAmount_Energy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.DynamicUsage <em>Dynamic Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Usage</em>'.
	 * @see org.polarsys.time4sys.marte.grm.DynamicUsage
	 * @generated
	 */
	EClass getDynamicUsage();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.StaticUsage <em>Static Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Usage</em>'.
	 * @see org.polarsys.time4sys.marte.grm.StaticUsage
	 * @generated
	 */
	EClass getStaticUsage();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.grm.ResourceInterface <em>Resource Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Interface</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceInterface
	 * @generated
	 */
	EClass getResourceInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.grm.ResourceInterface#getOwnedService <em>Owned Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Service</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ResourceInterface#getOwnedService()
	 * @see #getResourceInterface()
	 * @generated
	 */
	EReference getResourceInterface_OwnedService();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.grm.TransmModeKind <em>Transm Mode Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transm Mode Kind</em>'.
	 * @see org.polarsys.time4sys.marte.grm.TransmModeKind
	 * @generated
	 */
	EEnum getTransmModeKind();

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
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.grm.SchedPolicyKind <em>Sched Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sched Policy Kind</em>'.
	 * @see org.polarsys.time4sys.marte.grm.SchedPolicyKind
	 * @generated
	 */
	EEnum getSchedPolicyKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.grm.ProtectProtocolKind <em>Protect Protocol Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protect Protocol Kind</em>'.
	 * @see org.polarsys.time4sys.marte.grm.ProtectProtocolKind
	 * @generated
	 */
	EEnum getProtectProtocolKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GrmFactory getGrmFactory();

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
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourcePackageImpl <em>Resource Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ResourcePackageImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourcePackage()
		 * @generated
		 */
		EClass RESOURCE_PACKAGE = eINSTANCE.getResourcePackage();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourcePackageableElementImpl <em>Resource Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ResourcePackageableElementImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourcePackageableElement()
		 * @generated
		 */
		EClass RESOURCE_PACKAGEABLE_ELEMENT = eINSTANCE.getResourcePackageableElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ResourceInstanceImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourceInstance()
		 * @generated
		 */
		EClass RESOURCE_INSTANCE = eINSTANCE.getResourceInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE__TYPE = eINSTANCE.getResourceInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE__PORT = eINSTANCE.getResourceInstance_Port();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ResourceImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Owned Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__OWNED_RESOURCE = eINSTANCE.getResource_OwnedResource();

		/**
		 * The meta object literal for the '<em><b>Res Mult</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__RES_MULT = eINSTANCE.getResource_ResMult();

		/**
		 * The meta object literal for the '<em><b>Is Protected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__IS_PROTECTED = eINSTANCE.getResource_IsProtected();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__IS_ACTIVE = eINSTANCE.getResource_IsActive();

		/**
		 * The meta object literal for the '<em><b>PServices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PSERVICES = eINSTANCE.getResource_PServices();

		/**
		 * The meta object literal for the '<em><b>Owned Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__OWNED_PORT = eINSTANCE.getResource_OwnedPort();

		/**
		 * The meta object literal for the '<em><b>Owned Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__OWNED_CONNECTOR = eINSTANCE.getResource_OwnedConnector();

		/**
		 * The meta object literal for the '<em><b>RServices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__RSERVICES = eINSTANCE.getResource_RServices();

		/**
		 * The meta object literal for the '<em><b>Used By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__USED_BY = eINSTANCE.getResource_UsedBy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.StorageResourceImpl <em>Storage Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.StorageResourceImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getStorageResource()
		 * @generated
		 */
		EClass STORAGE_RESOURCE = eINSTANCE.getStorageResource();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.TimingResourceImpl <em>Timing Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.TimingResourceImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getTimingResource()
		 * @generated
		 */
		EClass TIMING_RESOURCE = eINSTANCE.getTimingResource();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.CommunicationResourceImpl <em>Communication Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.CommunicationResourceImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getCommunicationResource()
		 * @generated
		 */
		EClass COMMUNICATION_RESOURCE = eINSTANCE.getCommunicationResource();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.SynchResourceImpl <em>Synch Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.SynchResourceImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getSynchResource()
		 * @generated
		 */
		EClass SYNCH_RESOURCE = eINSTANCE.getSynchResource();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ConcurrencyResourceImpl <em>Concurrency Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ConcurrencyResourceImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getConcurrencyResource()
		 * @generated
		 */
		EClass CONCURRENCY_RESOURCE = eINSTANCE.getConcurrencyResource();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ComputingResourceImpl <em>Computing Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ComputingResourceImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getComputingResource()
		 * @generated
		 */
		EClass COMPUTING_RESOURCE = eINSTANCE.getComputingResource();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.DeviceResourceImpl <em>Device Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.DeviceResourceImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getDeviceResource()
		 * @generated
		 */
		EClass DEVICE_RESOURCE = eINSTANCE.getDeviceResource();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ClockResourceImpl <em>Clock Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ClockResourceImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getClockResource()
		 * @generated
		 */
		EClass CLOCK_RESOURCE = eINSTANCE.getClockResource();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.TimerResourceImpl <em>Timer Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.TimerResourceImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getTimerResource()
		 * @generated
		 */
		EClass TIMER_RESOURCE = eINSTANCE.getTimerResource();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER_RESOURCE__DURATION = eINSTANCE.getTimerResource_Duration();

		/**
		 * The meta object literal for the '<em><b>Is Periodic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER_RESOURCE__IS_PERIODIC = eINSTANCE.getTimerResource_IsPeriodic();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_RESOURCE__START = eINSTANCE.getTimerResource_Start();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_RESOURCE__SET = eINSTANCE.getTimerResource_Set();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_RESOURCE__GET = eINSTANCE.getTimerResource_Get();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_RESOURCE__RESET = eINSTANCE.getTimerResource_Reset();

		/**
		 * The meta object literal for the '<em><b>Pause</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_RESOURCE__PAUSE = eINSTANCE.getTimerResource_Pause();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceServiceImpl <em>Resource Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ResourceServiceImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourceService()
		 * @generated
		 */
		EClass RESOURCE_SERVICE = eINSTANCE.getResourceService();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SERVICE__CONTEXT = eINSTANCE.getResourceService_Context();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.CommunicationEndPointImpl <em>Communication End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.CommunicationEndPointImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getCommunicationEndPoint()
		 * @generated
		 */
		EClass COMMUNICATION_END_POINT = eINSTANCE.getCommunicationEndPoint();

		/**
		 * The meta object literal for the '<em><b>Packet Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_END_POINT__PACKET_SIZE = eINSTANCE.getCommunicationEndPoint_PacketSize();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.CommunicationMediaImpl <em>Communication Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.CommunicationMediaImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getCommunicationMedia()
		 * @generated
		 */
		EClass COMMUNICATION_MEDIA = eINSTANCE.getCommunicationMedia();

		/**
		 * The meta object literal for the '<em><b>Element Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_MEDIA__ELEMENT_SIZE = eINSTANCE.getCommunicationMedia_ElementSize();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_MEDIA__CAPACITY = eINSTANCE.getCommunicationMedia_Capacity();

		/**
		 * The meta object literal for the '<em><b>Packet Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_MEDIA__PACKET_TIME = eINSTANCE.getCommunicationMedia_PacketTime();

		/**
		 * The meta object literal for the '<em><b>Blocking Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_MEDIA__BLOCKING_TIME = eINSTANCE.getCommunicationMedia_BlockingTime();

		/**
		 * The meta object literal for the '<em><b>Transm Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_MEDIA__TRANSM_MODE = eINSTANCE.getCommunicationMedia_TransmMode();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ProcessingResourceImpl <em>Processing Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ProcessingResourceImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getProcessingResource()
		 * @generated
		 */
		EClass PROCESSING_RESOURCE = eINSTANCE.getProcessingResource();

		/**
		 * The meta object literal for the '<em><b>Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE__SPEED_FACTOR = eINSTANCE.getProcessingResource_SpeedFactor();

		/**
		 * The meta object literal for the '<em><b>Main Scheduler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE__MAIN_SCHEDULER = eINSTANCE.getProcessingResource_MainScheduler();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceConnectorImpl <em>Resource Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ResourceConnectorImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourceConnector()
		 * @generated
		 */
		EClass RESOURCE_CONNECTOR = eINSTANCE.getResourceConnector();

		/**
		 * The meta object literal for the '<em><b>Source Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONNECTOR__SOURCE_PORT = eINSTANCE.getResourceConnector_SourcePort();

		/**
		 * The meta object literal for the '<em><b>Target Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONNECTOR__TARGET_PORT = eINSTANCE.getResourceConnector_TargetPort();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourcePortImpl <em>Resource Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ResourcePortImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourcePort()
		 * @generated
		 */
		EClass RESOURCE_PORT = eINSTANCE.getResourcePort();

		/**
		 * The meta object literal for the '<em><b>PInterface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PORT__PINTERFACE = eINSTANCE.getResourcePort_PInterface();

		/**
		 * The meta object literal for the '<em><b>RInterface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PORT__RINTERFACE = eINSTANCE.getResourcePort_RInterface();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceBrokerImpl <em>Resource Broker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ResourceBrokerImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourceBroker()
		 * @generated
		 */
		EClass RESOURCE_BROKER = eINSTANCE.getResourceBroker();

		/**
		 * The meta object literal for the '<em><b>Broked Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_BROKER__BROKED_RESOURCE = eINSTANCE.getResourceBroker_BrokedResource();

		/**
		 * The meta object literal for the '<em><b>Acc Ctrl Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_BROKER__ACC_CTRL_POLICY = eINSTANCE.getResourceBroker_AccCtrlPolicy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceManagerImpl <em>Resource Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ResourceManagerImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourceManager()
		 * @generated
		 */
		EClass RESOURCE_MANAGER = eINSTANCE.getResourceManager();

		/**
		 * The meta object literal for the '<em><b>Managed Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MANAGER__MANAGED_RESOURCE = eINSTANCE.getResourceManager_ManagedResource();

		/**
		 * The meta object literal for the '<em><b>Res Ctrl Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MANAGER__RES_CTRL_POLICY = eINSTANCE.getResourceManager_ResCtrlPolicy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.AccessControlPolicyImpl <em>Access Control Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.AccessControlPolicyImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getAccessControlPolicy()
		 * @generated
		 */
		EClass ACCESS_CONTROL_POLICY = eINSTANCE.getAccessControlPolicy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceControlPolicyImpl <em>Resource Control Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ResourceControlPolicyImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourceControlPolicy()
		 * @generated
		 */
		EClass RESOURCE_CONTROL_POLICY = eINSTANCE.getResourceControlPolicy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.SchedulerImpl <em>Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.SchedulerImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getScheduler()
		 * @generated
		 */
		EClass SCHEDULER = eINSTANCE.getScheduler();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__HOST = eINSTANCE.getScheduler_Host();

		/**
		 * The meta object literal for the '<em><b>Processing Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__PROCESSING_UNITS = eINSTANCE.getScheduler_ProcessingUnits();

		/**
		 * The meta object literal for the '<em><b>Schedulable Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__SCHEDULABLE_RESOURCE = eINSTANCE.getScheduler_SchedulableResource();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__POLICY = eINSTANCE.getScheduler_Policy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.SecondarySchedulerImpl <em>Secondary Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.SecondarySchedulerImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getSecondaryScheduler()
		 * @generated
		 */
		EClass SECONDARY_SCHEDULER = eINSTANCE.getSecondaryScheduler();

		/**
		 * The meta object literal for the '<em><b>Virtual Processing Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNIT = eINSTANCE.getSecondaryScheduler_VirtualProcessingUnit();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.SchedulableResourceImpl <em>Schedulable Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.SchedulableResourceImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getSchedulableResource()
		 * @generated
		 */
		EClass SCHEDULABLE_RESOURCE = eINSTANCE.getSchedulableResource();

		/**
		 * The meta object literal for the '<em><b>Dependent Scheduler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER = eINSTANCE.getSchedulableResource_DependentScheduler();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULABLE_RESOURCE__HOST = eINSTANCE.getSchedulableResource_Host();

		/**
		 * The meta object literal for the '<em><b>Sched Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULABLE_RESOURCE__SCHED_PARAMS = eINSTANCE.getSchedulableResource_SchedParams();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.SchedulingParameterImpl <em>Scheduling Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.SchedulingParameterImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getSchedulingParameter()
		 * @generated
		 */
		EClass SCHEDULING_PARAMETER = eINSTANCE.getSchedulingParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_PARAMETER__VALUE = eINSTANCE.getSchedulingParameter_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.SchedulingPolicyImpl <em>Scheduling Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.SchedulingPolicyImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getSchedulingPolicy()
		 * @generated
		 */
		EClass SCHEDULING_POLICY = eINSTANCE.getSchedulingPolicy();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_POLICY__POLICY = eINSTANCE.getSchedulingPolicy_Policy();

		/**
		 * The meta object literal for the '<em><b>Other Sched Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_POLICY__OTHER_SCHED_POLICY = eINSTANCE.getSchedulingPolicy_OtherSchedPolicy();

		/**
		 * The meta object literal for the '<em><b>Has Valid Policy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULING_POLICY___HAS_VALID_POLICY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSchedulingPolicy__HasValidPolicy__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.MutualExclusionResourceImpl <em>Mutual Exclusion Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.MutualExclusionResourceImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getMutualExclusionResource()
		 * @generated
		 */
		EClass MUTUAL_EXCLUSION_RESOURCE = eINSTANCE.getMutualExclusionResource();

		/**
		 * The meta object literal for the '<em><b>Scheduler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTUAL_EXCLUSION_RESOURCE__SCHEDULER = eINSTANCE.getMutualExclusionResource_Scheduler();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTUAL_EXCLUSION_RESOURCE__PROTOCOL = eINSTANCE.getMutualExclusionResource_Protocol();

		/**
		 * The meta object literal for the '<em><b>Protect Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS = eINSTANCE.getMutualExclusionResource_ProtectParams();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.MutualExclusionProtocolImpl <em>Mutual Exclusion Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.MutualExclusionProtocolImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getMutualExclusionProtocol()
		 * @generated
		 */
		EClass MUTUAL_EXCLUSION_PROTOCOL = eINSTANCE.getMutualExclusionProtocol();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUTUAL_EXCLUSION_PROTOCOL__PROTOCOL = eINSTANCE.getMutualExclusionProtocol_Protocol();

		/**
		 * The meta object literal for the '<em><b>Other Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUTUAL_EXCLUSION_PROTOCOL__OTHER_PROTOCOL = eINSTANCE.getMutualExclusionProtocol_OtherProtocol();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ProtectionParameterImpl <em>Protection Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ProtectionParameterImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getProtectionParameter()
		 * @generated
		 */
		EClass PROTECTION_PARAMETER = eINSTANCE.getProtectionParameter();

		/**
		 * The meta object literal for the '<em><b>Priority Ceiling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_PARAMETER__PRIORITY_CEILING = eINSTANCE.getProtectionParameter_PriorityCeiling();

		/**
		 * The meta object literal for the '<em><b>Preemption Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_PARAMETER__PREEMPTION_LEVEL = eINSTANCE.getProtectionParameter_PreemptionLevel();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.UsageDemandImpl <em>Usage Demand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.UsageDemandImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getUsageDemand()
		 * @generated
		 */
		EClass USAGE_DEMAND = eINSTANCE.getUsageDemand();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_DEMAND__USAGE = eINSTANCE.getUsageDemand_Usage();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_DEMAND__EVENT = eINSTANCE.getUsageDemand_Event();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceUsageImpl <em>Resource Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ResourceUsageImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourceUsage()
		 * @generated
		 */
		EClass RESOURCE_USAGE = eINSTANCE.getResourceUsage();

		/**
		 * The meta object literal for the '<em><b>Workload</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_USAGE__WORKLOAD = eINSTANCE.getResourceUsage_Workload();

		/**
		 * The meta object literal for the '<em><b>Required Amount</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_USAGE__REQUIRED_AMOUNT = eINSTANCE.getResourceUsage_RequiredAmount();

		/**
		 * The meta object literal for the '<em><b>Used Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_USAGE__USED_RESOURCE = eINSTANCE.getResourceUsage_UsedResource();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.UsageTypedAmountImpl <em>Usage Typed Amount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.UsageTypedAmountImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getUsageTypedAmount()
		 * @generated
		 */
		EClass USAGE_TYPED_AMOUNT = eINSTANCE.getUsageTypedAmount();

		/**
		 * The meta object literal for the '<em><b>Exec Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_TYPED_AMOUNT__EXEC_TIME = eINSTANCE.getUsageTypedAmount_ExecTime();

		/**
		 * The meta object literal for the '<em><b>Msg Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_TYPED_AMOUNT__MSG_SIZE = eINSTANCE.getUsageTypedAmount_MsgSize();

		/**
		 * The meta object literal for the '<em><b>Allocatedmemory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_TYPED_AMOUNT__ALLOCATEDMEMORY = eINSTANCE.getUsageTypedAmount_Allocatedmemory();

		/**
		 * The meta object literal for the '<em><b>Used Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_TYPED_AMOUNT__USED_MEMORY = eINSTANCE.getUsageTypedAmount_UsedMemory();

		/**
		 * The meta object literal for the '<em><b>Power Peak</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_TYPED_AMOUNT__POWER_PEAK = eINSTANCE.getUsageTypedAmount_PowerPeak();

		/**
		 * The meta object literal for the '<em><b>Energy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_TYPED_AMOUNT__ENERGY = eINSTANCE.getUsageTypedAmount_Energy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.DynamicUsageImpl <em>Dynamic Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.DynamicUsageImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getDynamicUsage()
		 * @generated
		 */
		EClass DYNAMIC_USAGE = eINSTANCE.getDynamicUsage();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.StaticUsageImpl <em>Static Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.StaticUsageImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getStaticUsage()
		 * @generated
		 */
		EClass STATIC_USAGE = eINSTANCE.getStaticUsage();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.impl.ResourceInterfaceImpl <em>Resource Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.impl.ResourceInterfaceImpl
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getResourceInterface()
		 * @generated
		 */
		EClass RESOURCE_INTERFACE = eINSTANCE.getResourceInterface();

		/**
		 * The meta object literal for the '<em><b>Owned Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERFACE__OWNED_SERVICE = eINSTANCE.getResourceInterface_OwnedService();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.TransmModeKind <em>Transm Mode Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.TransmModeKind
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getTransmModeKind()
		 * @generated
		 */
		EEnum TRANSM_MODE_KIND = eINSTANCE.getTransmModeKind();

		/**
		 * The meta object literal for the '<em>NFP Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.Duration
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getNFP_Duration()
		 * @generated
		 */
		EDataType NFP_DURATION = eINSTANCE.getNFP_Duration();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.SchedPolicyKind <em>Sched Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.SchedPolicyKind
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getSchedPolicyKind()
		 * @generated
		 */
		EEnum SCHED_POLICY_KIND = eINSTANCE.getSchedPolicyKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.grm.ProtectProtocolKind <em>Protect Protocol Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.grm.ProtectProtocolKind
		 * @see org.polarsys.time4sys.marte.grm.impl.GrmPackageImpl#getProtectProtocolKind()
		 * @generated
		 */
		EEnum PROTECT_PROTOCOL_KIND = eINSTANCE.getProtectProtocolKind();

	}

} //GrmPackage
