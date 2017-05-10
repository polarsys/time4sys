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
package org.polarsys.time4sys.analysis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.polarsys.time4sys.analysis.AnalysisFactory
 * @model kind="package"
 * @generated
 */
public interface AnalysisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "analysis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/analysis/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "analysis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysisPackage eINSTANCE = org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.NamedElementImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.AnalyzedSystemImpl <em>Analyzed System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.AnalyzedSystemImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getAnalyzedSystem()
	 * @generated
	 */
	int ANALYZED_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_SYSTEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Schedulable Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_SYSTEM__SCHEDULABLE_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schedulers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_SYSTEM__SCHEDULERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_SYSTEM__RESOURCES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraint Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_SYSTEM__CONSTRAINT_CONTAINER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stimuli</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_SYSTEM__STIMULI = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Delays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_SYSTEM__DELAYS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Protection Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_SYSTEM__PROTECTION_PROTOCOLS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mutexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_SYSTEM__MUTEXES = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_SYSTEM__STATUS = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Result Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_SYSTEM__RESULT_CONTAINERS = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_SYSTEM__MAPPINGS = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_SYSTEM__TIME_UNIT = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Analyzed System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_SYSTEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Analyzed System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_SYSTEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.EventModelContainerImpl <em>Event Model Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.EventModelContainerImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getEventModelContainer()
	 * @generated
	 */
	int EVENT_MODEL_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Event Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_CONTAINER__EVENT_MODEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Model Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Model Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_CONTAINER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.SchedulableElementImpl <em>Schedulable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.SchedulableElementImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getSchedulableElement()
	 * @generated
	 */
	int SCHEDULABLE_ELEMENT = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_ELEMENT__NAME = EVENT_MODEL_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Event Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_ELEMENT__EVENT_MODEL = EVENT_MODEL_CONTAINER__EVENT_MODEL;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_ELEMENT__PORTS = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavior Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_ELEMENT__BEHAVIOR_KIND = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_ELEMENT__PARENT = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scheduled By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_ELEMENT__SCHEDULED_BY = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_ELEMENT__CET = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scheduling Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_ELEMENT__SCHEDULING_PARAMETERS = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Original Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_ELEMENT__ORIGINAL_NAME = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Schedulable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_ELEMENT_FEATURE_COUNT = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Schedulable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_ELEMENT_OPERATION_COUNT = EVENT_MODEL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.CommunicationImpl <em>Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.CommunicationImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getCommunication()
	 * @generated
	 */
	int COMMUNICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__NAME = SCHEDULABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Event Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__EVENT_MODEL = SCHEDULABLE_ELEMENT__EVENT_MODEL;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__PORTS = SCHEDULABLE_ELEMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Behavior Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__BEHAVIOR_KIND = SCHEDULABLE_ELEMENT__BEHAVIOR_KIND;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__PARENT = SCHEDULABLE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Scheduled By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__SCHEDULED_BY = SCHEDULABLE_ELEMENT__SCHEDULED_BY;

	/**
	 * The feature id for the '<em><b>CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__CET = SCHEDULABLE_ELEMENT__CET;

	/**
	 * The feature id for the '<em><b>Scheduling Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__SCHEDULING_PARAMETERS = SCHEDULABLE_ELEMENT__SCHEDULING_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Original Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__ORIGINAL_NAME = SCHEDULABLE_ELEMENT__ORIGINAL_NAME;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__BUS = SCHEDULABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_FEATURE_COUNT = SCHEDULABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OPERATION_COUNT = SCHEDULABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.ResourceImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SCHEDULER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SPEED_FACTOR = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DELAY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.CommunicationResourceImpl <em>Communication Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.CommunicationResourceImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getCommunicationResource()
	 * @generated
	 */
	int COMMUNICATION_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__SCHEDULER = RESOURCE__SCHEDULER;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__PARENT = RESOURCE__PARENT;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__SPEED_FACTOR = RESOURCE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__DELAY = RESOURCE__DELAY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__LINKS = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communications Affected On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__COMMUNICATIONS_AFFECTED_ON = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protocol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__PROTOCOL_NAME = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__BANDWIDTH = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Communication Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Communication Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.ComputingResourceImpl <em>Computing Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.ComputingResourceImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getComputingResource()
	 * @generated
	 */
	int COMPUTING_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__SCHEDULER = RESOURCE__SCHEDULER;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__PARENT = RESOURCE__PARENT;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__SPEED_FACTOR = RESOURCE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__DELAY = RESOURCE__DELAY;

	/**
	 * The feature id for the '<em><b>Tasks Affected On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__TASKS_AFFECTED_ON = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linked By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__LINKED_BY = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Computing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Computing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.ConstraintContainerImpl <em>Constraint Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.ConstraintContainerImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getConstraintContainer()
	 * @generated
	 */
	int CONSTRAINT_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CONTAINER__CONSTRAINTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Analyzed System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CONTAINER__ANALYZED_SYSTEM = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constraint Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constraint Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CONTAINER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.DelayImpl <em>Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.DelayImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getDelay()
	 * @generated
	 */
	int DELAY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__NAME = EVENT_MODEL_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Event Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__EVENT_MODEL = EVENT_MODEL_CONTAINER__EVENT_MODEL;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__PORTS = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavior Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__BEHAVIOR_KIND = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__PARENT = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Referenced Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__REFERENCED_EVENT = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__DURATION = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_FEATURE_COUNT = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_OPERATION_COUNT = EVENT_MODEL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.EventModelImpl <em>Event Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.EventModelImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getEventModel()
	 * @generated
	 */
	int EVENT_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Offsets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL__OFFSETS = 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL__PERIOD = 1;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL__JITTER = 2;

	/**
	 * The feature id for the '<em><b>Dmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL__DMIN = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL__PARENT = 4;

	/**
	 * The feature id for the '<em><b>Is Sporadic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL__IS_SPORADIC = 5;

	/**
	 * The number of structural features of the '<em>Event Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Event Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.FragmentImpl <em>Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.FragmentImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getFragment()
	 * @generated
	 */
	int FRAGMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Locked Mutexes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__LOCKED_MUTEXES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__NEXT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__PREVIOUS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__TASK = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__CET = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.PortImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = EVENT_MODEL_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Event Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__EVENT_MODEL = EVENT_MODEL_CONTAINER__EVENT_MODEL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PARENT = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = EVENT_MODEL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.InputPortImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Event Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__EVENT_MODEL = PORT__EVENT_MODEL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__PARENT = PORT__PARENT;

	/**
	 * The feature id for the '<em><b>Receive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__RECEIVE_FROM = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.StimulusImpl <em>Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.StimulusImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getStimulus()
	 * @generated
	 */
	int STIMULUS = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__NAME = EVENT_MODEL_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Event Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__EVENT_MODEL = EVENT_MODEL_CONTAINER__EVENT_MODEL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__PARENT = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_FEATURE_COUNT = EVENT_MODEL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_OPERATION_COUNT = EVENT_MODEL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.InputStimulusImpl <em>Input Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.InputStimulusImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getInputStimulus()
	 * @generated
	 */
	int INPUT_STIMULUS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STIMULUS__NAME = STIMULUS__NAME;

	/**
	 * The feature id for the '<em><b>Event Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STIMULUS__EVENT_MODEL = STIMULUS__EVENT_MODEL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STIMULUS__PARENT = STIMULUS__PARENT;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STIMULUS__OUTPUT_PORTS = STIMULUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STIMULUS_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STIMULUS_OPERATION_COUNT = STIMULUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.MappingImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 11;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__SYSTEM = 0;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.MemoryResourceImpl <em>Memory Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.MemoryResourceImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getMemoryResource()
	 * @generated
	 */
	int MEMORY_RESOURCE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__SCHEDULER = RESOURCE__SCHEDULER;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__PARENT = RESOURCE__PARENT;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__SPEED_FACTOR = RESOURCE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__DELAY = RESOURCE__DELAY;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__SIZE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memory Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Memory Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.MutualExclusionResourceImpl <em>Mutual Exclusion Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.MutualExclusionResourceImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getMutualExclusionResource()
	 * @generated
	 */
	int MUTUAL_EXCLUSION_RESOURCE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protection Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__PROTECTION_PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protected By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__PROTECTED_BY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mutual Exclusion Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Mutual Exclusion Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.OffsetImpl <em>Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.OffsetImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getOffset()
	 * @generated
	 */
	int OFFSET = 15;

	/**
	 * The feature id for the '<em><b>Event Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__EVENT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__REFERENCE = 2;

	/**
	 * The number of structural features of the '<em>Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.OutputPortImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Event Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__EVENT_MODEL = PORT__EVENT_MODEL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__PARENT = PORT__PARENT;

	/**
	 * The feature id for the '<em><b>Send To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__SEND_TO = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.OutputStimulusImpl <em>Output Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.OutputStimulusImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getOutputStimulus()
	 * @generated
	 */
	int OUTPUT_STIMULUS = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STIMULUS__NAME = STIMULUS__NAME;

	/**
	 * The feature id for the '<em><b>Event Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STIMULUS__EVENT_MODEL = STIMULUS__EVENT_MODEL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STIMULUS__PARENT = STIMULUS__PARENT;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STIMULUS__INPUT_PORTS = STIMULUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STIMULUS_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STIMULUS_OPERATION_COUNT = STIMULUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.PortContainerImpl <em>Port Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.PortContainerImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getPortContainer()
	 * @generated
	 */
	int PORT_CONTAINER = 19;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONTAINER__PORTS = 0;

	/**
	 * The feature id for the '<em><b>Behavior Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONTAINER__BEHAVIOR_KIND = 1;

	/**
	 * The number of structural features of the '<em>Port Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.ProtectionParameterValueImpl <em>Protection Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.ProtectionParameterValueImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getProtectionParameterValue()
	 * @generated
	 */
	int PROTECTION_PARAMETER_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PARAMETER_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PARAMETER_VALUE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Protection Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PARAMETER_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Protection Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PARAMETER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.ProtectionProtocolImpl <em>Protection Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.ProtectionProtocolImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getProtectionProtocol()
	 * @generated
	 */
	int PROTECTION_PROTOCOL = 21;

	/**
	 * The feature id for the '<em><b>Protocol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PROTOCOL__PROTOCOL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Mutexes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PROTOCOL__MUTEXES = 1;

	/**
	 * The feature id for the '<em><b>Required Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PROTOCOL__REQUIRED_PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Resource Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PROTOCOL__RESOURCE_PARAMETER_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PROTOCOL__PARENT = 4;

	/**
	 * The number of structural features of the '<em>Protection Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PROTOCOL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Protection Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_PROTOCOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.RequiredProtectionParameterImpl <em>Required Protection Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.RequiredProtectionParameterImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getRequiredProtectionParameter()
	 * @generated
	 */
	int REQUIRED_PROTECTION_PARAMETER = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PROTECTION_PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PROTECTION_PARAMETER__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Protection Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PROTECTION_PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Required Protection Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PROTECTION_PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.RequiredSchedulingParameterImpl <em>Required Scheduling Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.RequiredSchedulingParameterImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getRequiredSchedulingParameter()
	 * @generated
	 */
	int REQUIRED_SCHEDULING_PARAMETER = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SCHEDULING_PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SCHEDULING_PARAMETER__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Scheduling Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SCHEDULING_PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Required Scheduling Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SCHEDULING_PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.ResourceSchedulingParameterValueImpl <em>Resource Scheduling Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.ResourceSchedulingParameterValueImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getResourceSchedulingParameterValue()
	 * @generated
	 */
	int RESOURCE_SCHEDULING_PARAMETER_VALUE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SCHEDULING_PARAMETER_VALUE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SCHEDULING_PARAMETER_VALUE__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Scheduling Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SCHEDULING_PARAMETER_VALUE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Scheduling Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SCHEDULING_PARAMETER_VALUE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.ResultContainerImpl <em>Result Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.ResultContainerImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getResultContainer()
	 * @generated
	 */
	int RESULT_CONTAINER = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Analyzed System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONTAINER__ANALYZED_SYSTEM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Result Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Result Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONTAINER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.SchedulerParameterValueImpl <em>Scheduler Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.SchedulerParameterValueImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getSchedulerParameterValue()
	 * @generated
	 */
	int SCHEDULER_PARAMETER_VALUE = 28;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_PARAMETER_VALUE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_PARAMETER_VALUE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_PARAMETER_VALUE__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Scheduler Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_PARAMETER_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scheduler Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_PARAMETER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.SchedulerImpl <em>Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.SchedulerImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getScheduler()
	 * @generated
	 */
	int SCHEDULER = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Policy Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__POLICY_KIND = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheduled Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__SCHEDULED_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__USED_BY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__REQUIRED_PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resource Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__RESOURCE_PARAMETER_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Preferred Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__PREFERRED_POLICY = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.SynchronizableElementImpl <em>Synchronizable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.SynchronizableElementImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getSynchronizableElement()
	 * @generated
	 */
	int SYNCHRONIZABLE_ELEMENT = 31;

	/**
	 * The feature id for the '<em><b>Locked Mutexes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZABLE_ELEMENT__LOCKED_MUTEXES = 0;

	/**
	 * The number of structural features of the '<em>Synchronizable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Synchronizable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.TaskImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = SCHEDULABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Event Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EVENT_MODEL = SCHEDULABLE_ELEMENT__EVENT_MODEL;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PORTS = SCHEDULABLE_ELEMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Behavior Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BEHAVIOR_KIND = SCHEDULABLE_ELEMENT__BEHAVIOR_KIND;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT = SCHEDULABLE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Scheduled By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SCHEDULED_BY = SCHEDULABLE_ELEMENT__SCHEDULED_BY;

	/**
	 * The feature id for the '<em><b>CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CET = SCHEDULABLE_ELEMENT__CET;

	/**
	 * The feature id for the '<em><b>Scheduling Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SCHEDULING_PARAMETERS = SCHEDULABLE_ELEMENT__SCHEDULING_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Original Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ORIGINAL_NAME = SCHEDULABLE_ELEMENT__ORIGINAL_NAME;

	/**
	 * The feature id for the '<em><b>Locked Mutexes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LOCKED_MUTEXES = SCHEDULABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapped To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MAPPED_TO = SCHEDULABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FRAGMENTS = SCHEDULABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FIRST = SCHEDULABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BLOCKING_TIME = SCHEDULABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = SCHEDULABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = SCHEDULABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.ResourceProtectionParameterValueImpl <em>Resource Protection Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.ResourceProtectionParameterValueImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getResourceProtectionParameterValue()
	 * @generated
	 */
	int RESOURCE_PROTECTION_PARAMETER_VALUE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROTECTION_PARAMETER_VALUE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROTECTION_PARAMETER_VALUE__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Protection Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROTECTION_PARAMETER_VALUE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Protection Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROTECTION_PARAMETER_VALUE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.impl.TwcaEventModelImpl <em>Twca Event Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.impl.TwcaEventModelImpl
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getTwcaEventModel()
	 * @generated
	 */
	int TWCA_EVENT_MODEL = 34;

	/**
	 * The feature id for the '<em><b>Offsets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWCA_EVENT_MODEL__OFFSETS = EVENT_MODEL__OFFSETS;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWCA_EVENT_MODEL__PERIOD = EVENT_MODEL__PERIOD;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWCA_EVENT_MODEL__JITTER = EVENT_MODEL__JITTER;

	/**
	 * The feature id for the '<em><b>Dmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWCA_EVENT_MODEL__DMIN = EVENT_MODEL__DMIN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWCA_EVENT_MODEL__PARENT = EVENT_MODEL__PARENT;

	/**
	 * The feature id for the '<em><b>Is Sporadic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWCA_EVENT_MODEL__IS_SPORADIC = EVENT_MODEL__IS_SPORADIC;

	/**
	 * The feature id for the '<em><b>Deltamin func</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWCA_EVENT_MODEL__DELTAMIN_FUNC = EVENT_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Twca Event Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWCA_EVENT_MODEL_FEATURE_COUNT = EVENT_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Twca Event Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWCA_EVENT_MODEL_OPERATION_COUNT = EVENT_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.InputJoinBehaviorKind <em>Input Join Behavior Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.InputJoinBehaviorKind
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getInputJoinBehaviorKind()
	 * @generated
	 */
	int INPUT_JOIN_BEHAVIOR_KIND = 35;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.analysis.SchedulerPolicyKind <em>Scheduler Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.analysis.SchedulerPolicyKind
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getSchedulerPolicyKind()
	 * @generated
	 */
	int SCHEDULER_POLICY_KIND = 36;

	/**
	 * The meta object id for the '<em>NFP Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getNFP_Duration()
	 * @generated
	 */
	int NFP_DURATION = 37;

	/**
	 * The meta object id for the '<em>NFP Time Interval</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval
	 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getNFP_TimeInterval()
	 * @generated
	 */
	int NFP_TIME_INTERVAL = 38;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.AnalyzedSystem <em>Analyzed System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analyzed System</em>'.
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem
	 * @generated
	 */
	EClass getAnalyzedSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getSchedulableElements <em>Schedulable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schedulable Elements</em>'.
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getSchedulableElements()
	 * @see #getAnalyzedSystem()
	 * @generated
	 */
	EReference getAnalyzedSystem_SchedulableElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getSchedulers <em>Schedulers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schedulers</em>'.
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getSchedulers()
	 * @see #getAnalyzedSystem()
	 * @generated
	 */
	EReference getAnalyzedSystem_Schedulers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getResources()
	 * @see #getAnalyzedSystem()
	 * @generated
	 */
	EReference getAnalyzedSystem_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getConstraintContainer <em>Constraint Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint Container</em>'.
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getConstraintContainer()
	 * @see #getAnalyzedSystem()
	 * @generated
	 */
	EReference getAnalyzedSystem_ConstraintContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getStimuli <em>Stimuli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stimuli</em>'.
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getStimuli()
	 * @see #getAnalyzedSystem()
	 * @generated
	 */
	EReference getAnalyzedSystem_Stimuli();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getDelays <em>Delays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delays</em>'.
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getDelays()
	 * @see #getAnalyzedSystem()
	 * @generated
	 */
	EReference getAnalyzedSystem_Delays();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getProtectionProtocols <em>Protection Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protection Protocols</em>'.
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getProtectionProtocols()
	 * @see #getAnalyzedSystem()
	 * @generated
	 */
	EReference getAnalyzedSystem_ProtectionProtocols();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getMutexes <em>Mutexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mutexes</em>'.
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getMutexes()
	 * @see #getAnalyzedSystem()
	 * @generated
	 */
	EReference getAnalyzedSystem_Mutexes();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getStatus()
	 * @see #getAnalyzedSystem()
	 * @generated
	 */
	EAttribute getAnalyzedSystem_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getResultContainers <em>Result Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Containers</em>'.
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getResultContainers()
	 * @see #getAnalyzedSystem()
	 * @generated
	 */
	EReference getAnalyzedSystem_ResultContainers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getMappings()
	 * @see #getAnalyzedSystem()
	 * @generated
	 */
	EReference getAnalyzedSystem_Mappings();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getTimeUnit()
	 * @see #getAnalyzedSystem()
	 * @generated
	 */
	EAttribute getAnalyzedSystem_TimeUnit();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication</em>'.
	 * @see org.polarsys.time4sys.analysis.Communication
	 * @generated
	 */
	EClass getCommunication();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.analysis.Communication#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus</em>'.
	 * @see org.polarsys.time4sys.analysis.Communication#getBus()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Bus();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.CommunicationResource <em>Communication Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Resource</em>'.
	 * @see org.polarsys.time4sys.analysis.CommunicationResource
	 * @generated
	 */
	EClass getCommunicationResource();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.analysis.CommunicationResource#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see org.polarsys.time4sys.analysis.CommunicationResource#getLinks()
	 * @see #getCommunicationResource()
	 * @generated
	 */
	EReference getCommunicationResource_Links();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.analysis.CommunicationResource#getCommunicationsAffectedOn <em>Communications Affected On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communications Affected On</em>'.
	 * @see org.polarsys.time4sys.analysis.CommunicationResource#getCommunicationsAffectedOn()
	 * @see #getCommunicationResource()
	 * @generated
	 */
	EReference getCommunicationResource_CommunicationsAffectedOn();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.CommunicationResource#getProtocolName <em>Protocol Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol Name</em>'.
	 * @see org.polarsys.time4sys.analysis.CommunicationResource#getProtocolName()
	 * @see #getCommunicationResource()
	 * @generated
	 */
	EAttribute getCommunicationResource_ProtocolName();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.CommunicationResource#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth</em>'.
	 * @see org.polarsys.time4sys.analysis.CommunicationResource#getBandwidth()
	 * @see #getCommunicationResource()
	 * @generated
	 */
	EAttribute getCommunicationResource_Bandwidth();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.ComputingResource <em>Computing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Resource</em>'.
	 * @see org.polarsys.time4sys.analysis.ComputingResource
	 * @generated
	 */
	EClass getComputingResource();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.analysis.ComputingResource#getTasksAffectedOn <em>Tasks Affected On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks Affected On</em>'.
	 * @see org.polarsys.time4sys.analysis.ComputingResource#getTasksAffectedOn()
	 * @see #getComputingResource()
	 * @generated
	 */
	EReference getComputingResource_TasksAffectedOn();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.analysis.ComputingResource#getLinkedBy <em>Linked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked By</em>'.
	 * @see org.polarsys.time4sys.analysis.ComputingResource#getLinkedBy()
	 * @see #getComputingResource()
	 * @generated
	 */
	EReference getComputingResource_LinkedBy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.ConstraintContainer <em>Constraint Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Container</em>'.
	 * @see org.polarsys.time4sys.analysis.ConstraintContainer
	 * @generated
	 */
	EClass getConstraintContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.ConstraintContainer#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.polarsys.time4sys.analysis.ConstraintContainer#getConstraints()
	 * @see #getConstraintContainer()
	 * @generated
	 */
	EReference getConstraintContainer_Constraints();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.analysis.ConstraintContainer#getAnalyzedSystem <em>Analyzed System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Analyzed System</em>'.
	 * @see org.polarsys.time4sys.analysis.ConstraintContainer#getAnalyzedSystem()
	 * @see #getConstraintContainer()
	 * @generated
	 */
	EReference getConstraintContainer_AnalyzedSystem();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay</em>'.
	 * @see org.polarsys.time4sys.analysis.Delay
	 * @generated
	 */
	EClass getDelay();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.analysis.Delay#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.polarsys.time4sys.analysis.Delay#getParent()
	 * @see #getDelay()
	 * @generated
	 */
	EReference getDelay_Parent();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.analysis.Delay#getReferencedEvent <em>Referenced Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Event</em>'.
	 * @see org.polarsys.time4sys.analysis.Delay#getReferencedEvent()
	 * @see #getDelay()
	 * @generated
	 */
	EReference getDelay_ReferencedEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.Delay#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.polarsys.time4sys.analysis.Delay#getDuration()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_Duration();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.EventModel <em>Event Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Model</em>'.
	 * @see org.polarsys.time4sys.analysis.EventModel
	 * @generated
	 */
	EClass getEventModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.EventModel#getOffsets <em>Offsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offsets</em>'.
	 * @see org.polarsys.time4sys.analysis.EventModel#getOffsets()
	 * @see #getEventModel()
	 * @generated
	 */
	EReference getEventModel_Offsets();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.EventModel#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.polarsys.time4sys.analysis.EventModel#getPeriod()
	 * @see #getEventModel()
	 * @generated
	 */
	EAttribute getEventModel_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.EventModel#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jitter</em>'.
	 * @see org.polarsys.time4sys.analysis.EventModel#getJitter()
	 * @see #getEventModel()
	 * @generated
	 */
	EAttribute getEventModel_Jitter();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.EventModel#getDmin <em>Dmin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dmin</em>'.
	 * @see org.polarsys.time4sys.analysis.EventModel#getDmin()
	 * @see #getEventModel()
	 * @generated
	 */
	EAttribute getEventModel_Dmin();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.analysis.EventModel#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.polarsys.time4sys.analysis.EventModel#getParent()
	 * @see #getEventModel()
	 * @generated
	 */
	EReference getEventModel_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.EventModel#isIsSporadic <em>Is Sporadic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sporadic</em>'.
	 * @see org.polarsys.time4sys.analysis.EventModel#isIsSporadic()
	 * @see #getEventModel()
	 * @generated
	 */
	EAttribute getEventModel_IsSporadic();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.EventModelContainer <em>Event Model Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Model Container</em>'.
	 * @see org.polarsys.time4sys.analysis.EventModelContainer
	 * @generated
	 */
	EClass getEventModelContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.analysis.EventModelContainer#getEventModel <em>Event Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Model</em>'.
	 * @see org.polarsys.time4sys.analysis.EventModelContainer#getEventModel()
	 * @see #getEventModelContainer()
	 * @generated
	 */
	EReference getEventModelContainer_EventModel();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment</em>'.
	 * @see org.polarsys.time4sys.analysis.Fragment
	 * @generated
	 */
	EClass getFragment();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.analysis.Fragment#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see org.polarsys.time4sys.analysis.Fragment#getNext()
	 * @see #getFragment()
	 * @generated
	 */
	EReference getFragment_Next();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.analysis.Fragment#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see org.polarsys.time4sys.analysis.Fragment#getPrevious()
	 * @see #getFragment()
	 * @generated
	 */
	EReference getFragment_Previous();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.analysis.Fragment#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task</em>'.
	 * @see org.polarsys.time4sys.analysis.Fragment#getTask()
	 * @see #getFragment()
	 * @generated
	 */
	EReference getFragment_Task();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.Fragment#getCET <em>CET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CET</em>'.
	 * @see org.polarsys.time4sys.analysis.Fragment#getCET()
	 * @see #getFragment()
	 * @generated
	 */
	EAttribute getFragment_CET();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see org.polarsys.time4sys.analysis.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.analysis.InputPort#getReceiveFrom <em>Receive From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receive From</em>'.
	 * @see org.polarsys.time4sys.analysis.InputPort#getReceiveFrom()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_ReceiveFrom();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.InputStimulus <em>Input Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Stimulus</em>'.
	 * @see org.polarsys.time4sys.analysis.InputStimulus
	 * @generated
	 */
	EClass getInputStimulus();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.InputStimulus#getOutputPorts <em>Output Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Ports</em>'.
	 * @see org.polarsys.time4sys.analysis.InputStimulus#getOutputPorts()
	 * @see #getInputStimulus()
	 * @generated
	 */
	EReference getInputStimulus_OutputPorts();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see org.polarsys.time4sys.analysis.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.analysis.Mapping#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.polarsys.time4sys.analysis.Mapping#getSystem()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_System();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.MemoryResource <em>Memory Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Resource</em>'.
	 * @see org.polarsys.time4sys.analysis.MemoryResource
	 * @generated
	 */
	EClass getMemoryResource();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.MemoryResource#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.polarsys.time4sys.analysis.MemoryResource#getSize()
	 * @see #getMemoryResource()
	 * @generated
	 */
	EAttribute getMemoryResource_Size();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.MutualExclusionResource <em>Mutual Exclusion Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutual Exclusion Resource</em>'.
	 * @see org.polarsys.time4sys.analysis.MutualExclusionResource
	 * @generated
	 */
	EClass getMutualExclusionResource();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.analysis.MutualExclusionResource#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.polarsys.time4sys.analysis.MutualExclusionResource#getElements()
	 * @see #getMutualExclusionResource()
	 * @generated
	 */
	EReference getMutualExclusionResource_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.MutualExclusionResource#getProtectionParameters <em>Protection Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protection Parameters</em>'.
	 * @see org.polarsys.time4sys.analysis.MutualExclusionResource#getProtectionParameters()
	 * @see #getMutualExclusionResource()
	 * @generated
	 */
	EReference getMutualExclusionResource_ProtectionParameters();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.analysis.MutualExclusionResource#getProtectedBy <em>Protected By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protected By</em>'.
	 * @see org.polarsys.time4sys.analysis.MutualExclusionResource#getProtectedBy()
	 * @see #getMutualExclusionResource()
	 * @generated
	 */
	EReference getMutualExclusionResource_ProtectedBy();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.analysis.MutualExclusionResource#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.polarsys.time4sys.analysis.MutualExclusionResource#getParent()
	 * @see #getMutualExclusionResource()
	 * @generated
	 */
	EReference getMutualExclusionResource_Parent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.polarsys.time4sys.analysis.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.time4sys.analysis.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.Offset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offset</em>'.
	 * @see org.polarsys.time4sys.analysis.Offset
	 * @generated
	 */
	EClass getOffset();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.analysis.Offset#getEventModel <em>Event Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Event Model</em>'.
	 * @see org.polarsys.time4sys.analysis.Offset#getEventModel()
	 * @see #getOffset()
	 * @generated
	 */
	EReference getOffset_EventModel();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.Offset#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.analysis.Offset#getValue()
	 * @see #getOffset()
	 * @generated
	 */
	EAttribute getOffset_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.Offset#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.polarsys.time4sys.analysis.Offset#getReference()
	 * @see #getOffset()
	 * @generated
	 */
	EAttribute getOffset_Reference();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see org.polarsys.time4sys.analysis.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.analysis.OutputPort#getSendTo <em>Send To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Send To</em>'.
	 * @see org.polarsys.time4sys.analysis.OutputPort#getSendTo()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_SendTo();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.OutputStimulus <em>Output Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Stimulus</em>'.
	 * @see org.polarsys.time4sys.analysis.OutputStimulus
	 * @generated
	 */
	EClass getOutputStimulus();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.OutputStimulus#getInputPorts <em>Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Ports</em>'.
	 * @see org.polarsys.time4sys.analysis.OutputStimulus#getInputPorts()
	 * @see #getOutputStimulus()
	 * @generated
	 */
	EReference getOutputStimulus_InputPorts();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.polarsys.time4sys.analysis.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.analysis.Port#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.polarsys.time4sys.analysis.Port#getParent()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Parent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.PortContainer <em>Port Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Container</em>'.
	 * @see org.polarsys.time4sys.analysis.PortContainer
	 * @generated
	 */
	EClass getPortContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.PortContainer#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.polarsys.time4sys.analysis.PortContainer#getPorts()
	 * @see #getPortContainer()
	 * @generated
	 */
	EReference getPortContainer_Ports();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.PortContainer#getBehaviorKind <em>Behavior Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior Kind</em>'.
	 * @see org.polarsys.time4sys.analysis.PortContainer#getBehaviorKind()
	 * @see #getPortContainer()
	 * @generated
	 */
	EAttribute getPortContainer_BehaviorKind();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.ProtectionParameterValue <em>Protection Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protection Parameter Value</em>'.
	 * @see org.polarsys.time4sys.analysis.ProtectionParameterValue
	 * @generated
	 */
	EClass getProtectionParameterValue();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.ProtectionParameterValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.analysis.ProtectionParameterValue#getValue()
	 * @see #getProtectionParameterValue()
	 * @generated
	 */
	EAttribute getProtectionParameterValue_Value();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.analysis.ProtectionParameterValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.polarsys.time4sys.analysis.ProtectionParameterValue#getType()
	 * @see #getProtectionParameterValue()
	 * @generated
	 */
	EReference getProtectionParameterValue_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.ProtectionProtocol <em>Protection Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protection Protocol</em>'.
	 * @see org.polarsys.time4sys.analysis.ProtectionProtocol
	 * @generated
	 */
	EClass getProtectionProtocol();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.ProtectionProtocol#getProtocolName <em>Protocol Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol Name</em>'.
	 * @see org.polarsys.time4sys.analysis.ProtectionProtocol#getProtocolName()
	 * @see #getProtectionProtocol()
	 * @generated
	 */
	EAttribute getProtectionProtocol_ProtocolName();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.analysis.ProtectionProtocol#getMutexes <em>Mutexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mutexes</em>'.
	 * @see org.polarsys.time4sys.analysis.ProtectionProtocol#getMutexes()
	 * @see #getProtectionProtocol()
	 * @generated
	 */
	EReference getProtectionProtocol_Mutexes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.ProtectionProtocol#getRequiredParameters <em>Required Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Parameters</em>'.
	 * @see org.polarsys.time4sys.analysis.ProtectionProtocol#getRequiredParameters()
	 * @see #getProtectionProtocol()
	 * @generated
	 */
	EReference getProtectionProtocol_RequiredParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.ProtectionProtocol#getResourceParameterValue <em>Resource Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Parameter Value</em>'.
	 * @see org.polarsys.time4sys.analysis.ProtectionProtocol#getResourceParameterValue()
	 * @see #getProtectionProtocol()
	 * @generated
	 */
	EReference getProtectionProtocol_ResourceParameterValue();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.analysis.ProtectionProtocol#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.polarsys.time4sys.analysis.ProtectionProtocol#getParent()
	 * @see #getProtectionProtocol()
	 * @generated
	 */
	EReference getProtectionProtocol_Parent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.RequiredProtectionParameter <em>Required Protection Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Protection Parameter</em>'.
	 * @see org.polarsys.time4sys.analysis.RequiredProtectionParameter
	 * @generated
	 */
	EClass getRequiredProtectionParameter();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.analysis.RequiredProtectionParameter#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.polarsys.time4sys.analysis.RequiredProtectionParameter#getParent()
	 * @see #getRequiredProtectionParameter()
	 * @generated
	 */
	EReference getRequiredProtectionParameter_Parent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.RequiredSchedulingParameter <em>Required Scheduling Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Scheduling Parameter</em>'.
	 * @see org.polarsys.time4sys.analysis.RequiredSchedulingParameter
	 * @generated
	 */
	EClass getRequiredSchedulingParameter();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.analysis.RequiredSchedulingParameter#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.polarsys.time4sys.analysis.RequiredSchedulingParameter#getParent()
	 * @see #getRequiredSchedulingParameter()
	 * @generated
	 */
	EReference getRequiredSchedulingParameter_Parent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.polarsys.time4sys.analysis.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.analysis.Resource#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduler</em>'.
	 * @see org.polarsys.time4sys.analysis.Resource#getScheduler()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Scheduler();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.analysis.Resource#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.polarsys.time4sys.analysis.Resource#getParent()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.Resource#getSpeedFactor <em>Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Factor</em>'.
	 * @see org.polarsys.time4sys.analysis.Resource#getSpeedFactor()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_SpeedFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.Resource#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see org.polarsys.time4sys.analysis.Resource#getDelay()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Delay();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.ResourceSchedulingParameterValue <em>Resource Scheduling Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Scheduling Parameter Value</em>'.
	 * @see org.polarsys.time4sys.analysis.ResourceSchedulingParameterValue
	 * @generated
	 */
	EClass getResourceSchedulingParameterValue();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.ResourceSchedulingParameterValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.analysis.ResourceSchedulingParameterValue#getValue()
	 * @see #getResourceSchedulingParameterValue()
	 * @generated
	 */
	EAttribute getResourceSchedulingParameterValue_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.ResultContainer <em>Result Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Container</em>'.
	 * @see org.polarsys.time4sys.analysis.ResultContainer
	 * @generated
	 */
	EClass getResultContainer();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.analysis.ResultContainer#getAnalyzedSystem <em>Analyzed System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Analyzed System</em>'.
	 * @see org.polarsys.time4sys.analysis.ResultContainer#getAnalyzedSystem()
	 * @see #getResultContainer()
	 * @generated
	 */
	EReference getResultContainer_AnalyzedSystem();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.SchedulableElement <em>Schedulable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedulable Element</em>'.
	 * @see org.polarsys.time4sys.analysis.SchedulableElement
	 * @generated
	 */
	EClass getSchedulableElement();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.analysis.SchedulableElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.polarsys.time4sys.analysis.SchedulableElement#getParent()
	 * @see #getSchedulableElement()
	 * @generated
	 */
	EReference getSchedulableElement_Parent();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.analysis.SchedulableElement#getScheduledBy <em>Scheduled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduled By</em>'.
	 * @see org.polarsys.time4sys.analysis.SchedulableElement#getScheduledBy()
	 * @see #getSchedulableElement()
	 * @generated
	 */
	EReference getSchedulableElement_ScheduledBy();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.SchedulableElement#getCET <em>CET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CET</em>'.
	 * @see org.polarsys.time4sys.analysis.SchedulableElement#getCET()
	 * @see #getSchedulableElement()
	 * @generated
	 */
	EAttribute getSchedulableElement_CET();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.SchedulableElement#getSchedulingParameters <em>Scheduling Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduling Parameters</em>'.
	 * @see org.polarsys.time4sys.analysis.SchedulableElement#getSchedulingParameters()
	 * @see #getSchedulableElement()
	 * @generated
	 */
	EReference getSchedulableElement_SchedulingParameters();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.SchedulableElement#getOriginalName <em>Original Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Name</em>'.
	 * @see org.polarsys.time4sys.analysis.SchedulableElement#getOriginalName()
	 * @see #getSchedulableElement()
	 * @generated
	 */
	EAttribute getSchedulableElement_OriginalName();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.SchedulerParameterValue <em>Scheduler Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler Parameter Value</em>'.
	 * @see org.polarsys.time4sys.analysis.SchedulerParameterValue
	 * @generated
	 */
	EClass getSchedulerParameterValue();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.analysis.SchedulerParameterValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.polarsys.time4sys.analysis.SchedulerParameterValue#getType()
	 * @see #getSchedulerParameterValue()
	 * @generated
	 */
	EReference getSchedulerParameterValue_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.SchedulerParameterValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.analysis.SchedulerParameterValue#getValue()
	 * @see #getSchedulerParameterValue()
	 * @generated
	 */
	EAttribute getSchedulerParameterValue_Value();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.analysis.SchedulerParameterValue#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.polarsys.time4sys.analysis.SchedulerParameterValue#getParent()
	 * @see #getSchedulerParameterValue()
	 * @generated
	 */
	EReference getSchedulerParameterValue_Parent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler</em>'.
	 * @see org.polarsys.time4sys.analysis.Scheduler
	 * @generated
	 */
	EClass getScheduler();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.Scheduler#getPolicyKind <em>Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Kind</em>'.
	 * @see org.polarsys.time4sys.analysis.Scheduler#getPolicyKind()
	 * @see #getScheduler()
	 * @generated
	 */
	EAttribute getScheduler_PolicyKind();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.analysis.Scheduler#getScheduledElements <em>Scheduled Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scheduled Elements</em>'.
	 * @see org.polarsys.time4sys.analysis.Scheduler#getScheduledElements()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_ScheduledElements();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.analysis.Scheduler#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Used By</em>'.
	 * @see org.polarsys.time4sys.analysis.Scheduler#getUsedBy()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_UsedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.Scheduler#getRequiredParameters <em>Required Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Parameters</em>'.
	 * @see org.polarsys.time4sys.analysis.Scheduler#getRequiredParameters()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_RequiredParameters();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.analysis.Scheduler#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.polarsys.time4sys.analysis.Scheduler#getParent()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.Scheduler#getResourceParameterValue <em>Resource Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Parameter Value</em>'.
	 * @see org.polarsys.time4sys.analysis.Scheduler#getResourceParameterValue()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_ResourceParameterValue();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.Scheduler#getPreferredPolicy <em>Preferred Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preferred Policy</em>'.
	 * @see org.polarsys.time4sys.analysis.Scheduler#getPreferredPolicy()
	 * @see #getScheduler()
	 * @generated
	 */
	EAttribute getScheduler_PreferredPolicy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.Stimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus</em>'.
	 * @see org.polarsys.time4sys.analysis.Stimulus
	 * @generated
	 */
	EClass getStimulus();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.analysis.Stimulus#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.polarsys.time4sys.analysis.Stimulus#getParent()
	 * @see #getStimulus()
	 * @generated
	 */
	EReference getStimulus_Parent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.SynchronizableElement <em>Synchronizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronizable Element</em>'.
	 * @see org.polarsys.time4sys.analysis.SynchronizableElement
	 * @generated
	 */
	EClass getSynchronizableElement();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.analysis.SynchronizableElement#getLockedMutexes <em>Locked Mutexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locked Mutexes</em>'.
	 * @see org.polarsys.time4sys.analysis.SynchronizableElement#getLockedMutexes()
	 * @see #getSynchronizableElement()
	 * @generated
	 */
	EReference getSynchronizableElement_LockedMutexes();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.polarsys.time4sys.analysis.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.analysis.Task#getMappedTo <em>Mapped To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapped To</em>'.
	 * @see org.polarsys.time4sys.analysis.Task#getMappedTo()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_MappedTo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.analysis.Task#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see org.polarsys.time4sys.analysis.Task#getFragments()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Fragments();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.analysis.Task#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see org.polarsys.time4sys.analysis.Task#getFirst()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_First();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.Task#getBlockingTime <em>Blocking Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocking Time</em>'.
	 * @see org.polarsys.time4sys.analysis.Task#getBlockingTime()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_BlockingTime();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.ResourceProtectionParameterValue <em>Resource Protection Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Protection Parameter Value</em>'.
	 * @see org.polarsys.time4sys.analysis.ResourceProtectionParameterValue
	 * @generated
	 */
	EClass getResourceProtectionParameterValue();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.ResourceProtectionParameterValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.analysis.ResourceProtectionParameterValue#getValue()
	 * @see #getResourceProtectionParameterValue()
	 * @generated
	 */
	EAttribute getResourceProtectionParameterValue_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.analysis.TwcaEventModel <em>Twca Event Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twca Event Model</em>'.
	 * @see org.polarsys.time4sys.analysis.TwcaEventModel
	 * @generated
	 */
	EClass getTwcaEventModel();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.analysis.TwcaEventModel#getDeltamin_func <em>Deltamin func</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deltamin func</em>'.
	 * @see org.polarsys.time4sys.analysis.TwcaEventModel#getDeltamin_func()
	 * @see #getTwcaEventModel()
	 * @generated
	 */
	EAttribute getTwcaEventModel_Deltamin_func();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.analysis.InputJoinBehaviorKind <em>Input Join Behavior Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Input Join Behavior Kind</em>'.
	 * @see org.polarsys.time4sys.analysis.InputJoinBehaviorKind
	 * @generated
	 */
	EEnum getInputJoinBehaviorKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.analysis.SchedulerPolicyKind <em>Scheduler Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduler Policy Kind</em>'.
	 * @see org.polarsys.time4sys.analysis.SchedulerPolicyKind
	 * @generated
	 */
	EEnum getSchedulerPolicyKind();

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
	 * Returns the meta object for data type '{@link org.polarsys.time4sys.marte.nfp.TimeInterval <em>NFP Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>NFP Time Interval</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval
	 * @model instanceClass="org.polarsys.time4sys.marte.nfp.TimeInterval"
	 * @generated
	 */
	EDataType getNFP_TimeInterval();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnalysisFactory getAnalysisFactory();

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
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.AnalyzedSystemImpl <em>Analyzed System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.AnalyzedSystemImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getAnalyzedSystem()
		 * @generated
		 */
		EClass ANALYZED_SYSTEM = eINSTANCE.getAnalyzedSystem();

		/**
		 * The meta object literal for the '<em><b>Schedulable Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZED_SYSTEM__SCHEDULABLE_ELEMENTS = eINSTANCE.getAnalyzedSystem_SchedulableElements();

		/**
		 * The meta object literal for the '<em><b>Schedulers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZED_SYSTEM__SCHEDULERS = eINSTANCE.getAnalyzedSystem_Schedulers();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZED_SYSTEM__RESOURCES = eINSTANCE.getAnalyzedSystem_Resources();

		/**
		 * The meta object literal for the '<em><b>Constraint Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZED_SYSTEM__CONSTRAINT_CONTAINER = eINSTANCE.getAnalyzedSystem_ConstraintContainer();

		/**
		 * The meta object literal for the '<em><b>Stimuli</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZED_SYSTEM__STIMULI = eINSTANCE.getAnalyzedSystem_Stimuli();

		/**
		 * The meta object literal for the '<em><b>Delays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZED_SYSTEM__DELAYS = eINSTANCE.getAnalyzedSystem_Delays();

		/**
		 * The meta object literal for the '<em><b>Protection Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZED_SYSTEM__PROTECTION_PROTOCOLS = eINSTANCE.getAnalyzedSystem_ProtectionProtocols();

		/**
		 * The meta object literal for the '<em><b>Mutexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZED_SYSTEM__MUTEXES = eINSTANCE.getAnalyzedSystem_Mutexes();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYZED_SYSTEM__STATUS = eINSTANCE.getAnalyzedSystem_Status();

		/**
		 * The meta object literal for the '<em><b>Result Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZED_SYSTEM__RESULT_CONTAINERS = eINSTANCE.getAnalyzedSystem_ResultContainers();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZED_SYSTEM__MAPPINGS = eINSTANCE.getAnalyzedSystem_Mappings();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYZED_SYSTEM__TIME_UNIT = eINSTANCE.getAnalyzedSystem_TimeUnit();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.CommunicationImpl <em>Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.CommunicationImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getCommunication()
		 * @generated
		 */
		EClass COMMUNICATION = eINSTANCE.getCommunication();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__BUS = eINSTANCE.getCommunication_Bus();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.CommunicationResourceImpl <em>Communication Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.CommunicationResourceImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getCommunicationResource()
		 * @generated
		 */
		EClass COMMUNICATION_RESOURCE = eINSTANCE.getCommunicationResource();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_RESOURCE__LINKS = eINSTANCE.getCommunicationResource_Links();

		/**
		 * The meta object literal for the '<em><b>Communications Affected On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_RESOURCE__COMMUNICATIONS_AFFECTED_ON = eINSTANCE.getCommunicationResource_CommunicationsAffectedOn();

		/**
		 * The meta object literal for the '<em><b>Protocol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_RESOURCE__PROTOCOL_NAME = eINSTANCE.getCommunicationResource_ProtocolName();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_RESOURCE__BANDWIDTH = eINSTANCE.getCommunicationResource_Bandwidth();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.ComputingResourceImpl <em>Computing Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.ComputingResourceImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getComputingResource()
		 * @generated
		 */
		EClass COMPUTING_RESOURCE = eINSTANCE.getComputingResource();

		/**
		 * The meta object literal for the '<em><b>Tasks Affected On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_RESOURCE__TASKS_AFFECTED_ON = eINSTANCE.getComputingResource_TasksAffectedOn();

		/**
		 * The meta object literal for the '<em><b>Linked By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_RESOURCE__LINKED_BY = eINSTANCE.getComputingResource_LinkedBy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.ConstraintContainerImpl <em>Constraint Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.ConstraintContainerImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getConstraintContainer()
		 * @generated
		 */
		EClass CONSTRAINT_CONTAINER = eINSTANCE.getConstraintContainer();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_CONTAINER__CONSTRAINTS = eINSTANCE.getConstraintContainer_Constraints();

		/**
		 * The meta object literal for the '<em><b>Analyzed System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_CONTAINER__ANALYZED_SYSTEM = eINSTANCE.getConstraintContainer_AnalyzedSystem();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.DelayImpl <em>Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.DelayImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getDelay()
		 * @generated
		 */
		EClass DELAY = eINSTANCE.getDelay();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELAY__PARENT = eINSTANCE.getDelay_Parent();

		/**
		 * The meta object literal for the '<em><b>Referenced Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELAY__REFERENCED_EVENT = eINSTANCE.getDelay_ReferencedEvent();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__DURATION = eINSTANCE.getDelay_Duration();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.EventModelImpl <em>Event Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.EventModelImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getEventModel()
		 * @generated
		 */
		EClass EVENT_MODEL = eINSTANCE.getEventModel();

		/**
		 * The meta object literal for the '<em><b>Offsets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_MODEL__OFFSETS = eINSTANCE.getEventModel_Offsets();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_MODEL__PERIOD = eINSTANCE.getEventModel_Period();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_MODEL__JITTER = eINSTANCE.getEventModel_Jitter();

		/**
		 * The meta object literal for the '<em><b>Dmin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_MODEL__DMIN = eINSTANCE.getEventModel_Dmin();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_MODEL__PARENT = eINSTANCE.getEventModel_Parent();

		/**
		 * The meta object literal for the '<em><b>Is Sporadic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_MODEL__IS_SPORADIC = eINSTANCE.getEventModel_IsSporadic();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.EventModelContainerImpl <em>Event Model Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.EventModelContainerImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getEventModelContainer()
		 * @generated
		 */
		EClass EVENT_MODEL_CONTAINER = eINSTANCE.getEventModelContainer();

		/**
		 * The meta object literal for the '<em><b>Event Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_MODEL_CONTAINER__EVENT_MODEL = eINSTANCE.getEventModelContainer_EventModel();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.FragmentImpl <em>Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.FragmentImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getFragment()
		 * @generated
		 */
		EClass FRAGMENT = eINSTANCE.getFragment();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT__NEXT = eINSTANCE.getFragment_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT__PREVIOUS = eINSTANCE.getFragment_Previous();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT__TASK = eINSTANCE.getFragment_Task();

		/**
		 * The meta object literal for the '<em><b>CET</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT__CET = eINSTANCE.getFragment_CET();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.InputPortImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '<em><b>Receive From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__RECEIVE_FROM = eINSTANCE.getInputPort_ReceiveFrom();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.InputStimulusImpl <em>Input Stimulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.InputStimulusImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getInputStimulus()
		 * @generated
		 */
		EClass INPUT_STIMULUS = eINSTANCE.getInputStimulus();

		/**
		 * The meta object literal for the '<em><b>Output Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_STIMULUS__OUTPUT_PORTS = eINSTANCE.getInputStimulus_OutputPorts();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.MappingImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__SYSTEM = eINSTANCE.getMapping_System();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.MemoryResourceImpl <em>Memory Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.MemoryResourceImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getMemoryResource()
		 * @generated
		 */
		EClass MEMORY_RESOURCE = eINSTANCE.getMemoryResource();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_RESOURCE__SIZE = eINSTANCE.getMemoryResource_Size();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.MutualExclusionResourceImpl <em>Mutual Exclusion Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.MutualExclusionResourceImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getMutualExclusionResource()
		 * @generated
		 */
		EClass MUTUAL_EXCLUSION_RESOURCE = eINSTANCE.getMutualExclusionResource();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTUAL_EXCLUSION_RESOURCE__ELEMENTS = eINSTANCE.getMutualExclusionResource_Elements();

		/**
		 * The meta object literal for the '<em><b>Protection Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTUAL_EXCLUSION_RESOURCE__PROTECTION_PARAMETERS = eINSTANCE.getMutualExclusionResource_ProtectionParameters();

		/**
		 * The meta object literal for the '<em><b>Protected By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTUAL_EXCLUSION_RESOURCE__PROTECTED_BY = eINSTANCE.getMutualExclusionResource_ProtectedBy();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTUAL_EXCLUSION_RESOURCE__PARENT = eINSTANCE.getMutualExclusionResource_Parent();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.NamedElementImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.OffsetImpl <em>Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.OffsetImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getOffset()
		 * @generated
		 */
		EClass OFFSET = eINSTANCE.getOffset();

		/**
		 * The meta object literal for the '<em><b>Event Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFSET__EVENT_MODEL = eINSTANCE.getOffset_EventModel();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFSET__VALUE = eINSTANCE.getOffset_Value();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFSET__REFERENCE = eINSTANCE.getOffset_Reference();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.OutputPortImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '<em><b>Send To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__SEND_TO = eINSTANCE.getOutputPort_SendTo();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.OutputStimulusImpl <em>Output Stimulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.OutputStimulusImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getOutputStimulus()
		 * @generated
		 */
		EClass OUTPUT_STIMULUS = eINSTANCE.getOutputStimulus();

		/**
		 * The meta object literal for the '<em><b>Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_STIMULUS__INPUT_PORTS = eINSTANCE.getOutputStimulus_InputPorts();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.PortImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__PARENT = eINSTANCE.getPort_Parent();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.PortContainerImpl <em>Port Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.PortContainerImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getPortContainer()
		 * @generated
		 */
		EClass PORT_CONTAINER = eINSTANCE.getPortContainer();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONTAINER__PORTS = eINSTANCE.getPortContainer_Ports();

		/**
		 * The meta object literal for the '<em><b>Behavior Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_CONTAINER__BEHAVIOR_KIND = eINSTANCE.getPortContainer_BehaviorKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.ProtectionParameterValueImpl <em>Protection Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.ProtectionParameterValueImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getProtectionParameterValue()
		 * @generated
		 */
		EClass PROTECTION_PARAMETER_VALUE = eINSTANCE.getProtectionParameterValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_PARAMETER_VALUE__VALUE = eINSTANCE.getProtectionParameterValue_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_PARAMETER_VALUE__TYPE = eINSTANCE.getProtectionParameterValue_Type();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.ProtectionProtocolImpl <em>Protection Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.ProtectionProtocolImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getProtectionProtocol()
		 * @generated
		 */
		EClass PROTECTION_PROTOCOL = eINSTANCE.getProtectionProtocol();

		/**
		 * The meta object literal for the '<em><b>Protocol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_PROTOCOL__PROTOCOL_NAME = eINSTANCE.getProtectionProtocol_ProtocolName();

		/**
		 * The meta object literal for the '<em><b>Mutexes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_PROTOCOL__MUTEXES = eINSTANCE.getProtectionProtocol_Mutexes();

		/**
		 * The meta object literal for the '<em><b>Required Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_PROTOCOL__REQUIRED_PARAMETERS = eINSTANCE.getProtectionProtocol_RequiredParameters();

		/**
		 * The meta object literal for the '<em><b>Resource Parameter Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_PROTOCOL__RESOURCE_PARAMETER_VALUE = eINSTANCE.getProtectionProtocol_ResourceParameterValue();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_PROTOCOL__PARENT = eINSTANCE.getProtectionProtocol_Parent();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.RequiredProtectionParameterImpl <em>Required Protection Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.RequiredProtectionParameterImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getRequiredProtectionParameter()
		 * @generated
		 */
		EClass REQUIRED_PROTECTION_PARAMETER = eINSTANCE.getRequiredProtectionParameter();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_PROTECTION_PARAMETER__PARENT = eINSTANCE.getRequiredProtectionParameter_Parent();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.RequiredSchedulingParameterImpl <em>Required Scheduling Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.RequiredSchedulingParameterImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getRequiredSchedulingParameter()
		 * @generated
		 */
		EClass REQUIRED_SCHEDULING_PARAMETER = eINSTANCE.getRequiredSchedulingParameter();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_SCHEDULING_PARAMETER__PARENT = eINSTANCE.getRequiredSchedulingParameter_Parent();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.ResourceImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Scheduler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__SCHEDULER = eINSTANCE.getResource_Scheduler();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PARENT = eINSTANCE.getResource_Parent();

		/**
		 * The meta object literal for the '<em><b>Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__SPEED_FACTOR = eINSTANCE.getResource_SpeedFactor();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__DELAY = eINSTANCE.getResource_Delay();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.ResourceSchedulingParameterValueImpl <em>Resource Scheduling Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.ResourceSchedulingParameterValueImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getResourceSchedulingParameterValue()
		 * @generated
		 */
		EClass RESOURCE_SCHEDULING_PARAMETER_VALUE = eINSTANCE.getResourceSchedulingParameterValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_SCHEDULING_PARAMETER_VALUE__VALUE = eINSTANCE.getResourceSchedulingParameterValue_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.ResultContainerImpl <em>Result Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.ResultContainerImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getResultContainer()
		 * @generated
		 */
		EClass RESULT_CONTAINER = eINSTANCE.getResultContainer();

		/**
		 * The meta object literal for the '<em><b>Analyzed System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_CONTAINER__ANALYZED_SYSTEM = eINSTANCE.getResultContainer_AnalyzedSystem();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.SchedulableElementImpl <em>Schedulable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.SchedulableElementImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getSchedulableElement()
		 * @generated
		 */
		EClass SCHEDULABLE_ELEMENT = eINSTANCE.getSchedulableElement();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULABLE_ELEMENT__PARENT = eINSTANCE.getSchedulableElement_Parent();

		/**
		 * The meta object literal for the '<em><b>Scheduled By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULABLE_ELEMENT__SCHEDULED_BY = eINSTANCE.getSchedulableElement_ScheduledBy();

		/**
		 * The meta object literal for the '<em><b>CET</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULABLE_ELEMENT__CET = eINSTANCE.getSchedulableElement_CET();

		/**
		 * The meta object literal for the '<em><b>Scheduling Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULABLE_ELEMENT__SCHEDULING_PARAMETERS = eINSTANCE.getSchedulableElement_SchedulingParameters();

		/**
		 * The meta object literal for the '<em><b>Original Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULABLE_ELEMENT__ORIGINAL_NAME = eINSTANCE.getSchedulableElement_OriginalName();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.SchedulerParameterValueImpl <em>Scheduler Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.SchedulerParameterValueImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getSchedulerParameterValue()
		 * @generated
		 */
		EClass SCHEDULER_PARAMETER_VALUE = eINSTANCE.getSchedulerParameterValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER_PARAMETER_VALUE__TYPE = eINSTANCE.getSchedulerParameterValue_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULER_PARAMETER_VALUE__VALUE = eINSTANCE.getSchedulerParameterValue_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER_PARAMETER_VALUE__PARENT = eINSTANCE.getSchedulerParameterValue_Parent();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.SchedulerImpl <em>Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.SchedulerImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getScheduler()
		 * @generated
		 */
		EClass SCHEDULER = eINSTANCE.getScheduler();

		/**
		 * The meta object literal for the '<em><b>Policy Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULER__POLICY_KIND = eINSTANCE.getScheduler_PolicyKind();

		/**
		 * The meta object literal for the '<em><b>Scheduled Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__SCHEDULED_ELEMENTS = eINSTANCE.getScheduler_ScheduledElements();

		/**
		 * The meta object literal for the '<em><b>Used By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__USED_BY = eINSTANCE.getScheduler_UsedBy();

		/**
		 * The meta object literal for the '<em><b>Required Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__REQUIRED_PARAMETERS = eINSTANCE.getScheduler_RequiredParameters();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__PARENT = eINSTANCE.getScheduler_Parent();

		/**
		 * The meta object literal for the '<em><b>Resource Parameter Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__RESOURCE_PARAMETER_VALUE = eINSTANCE.getScheduler_ResourceParameterValue();

		/**
		 * The meta object literal for the '<em><b>Preferred Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULER__PREFERRED_POLICY = eINSTANCE.getScheduler_PreferredPolicy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.StimulusImpl <em>Stimulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.StimulusImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getStimulus()
		 * @generated
		 */
		EClass STIMULUS = eINSTANCE.getStimulus();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULUS__PARENT = eINSTANCE.getStimulus_Parent();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.SynchronizableElementImpl <em>Synchronizable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.SynchronizableElementImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getSynchronizableElement()
		 * @generated
		 */
		EClass SYNCHRONIZABLE_ELEMENT = eINSTANCE.getSynchronizableElement();

		/**
		 * The meta object literal for the '<em><b>Locked Mutexes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZABLE_ELEMENT__LOCKED_MUTEXES = eINSTANCE.getSynchronizableElement_LockedMutexes();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.TaskImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Mapped To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__MAPPED_TO = eINSTANCE.getTask_MappedTo();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__FRAGMENTS = eINSTANCE.getTask_Fragments();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__FIRST = eINSTANCE.getTask_First();

		/**
		 * The meta object literal for the '<em><b>Blocking Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__BLOCKING_TIME = eINSTANCE.getTask_BlockingTime();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.ResourceProtectionParameterValueImpl <em>Resource Protection Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.ResourceProtectionParameterValueImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getResourceProtectionParameterValue()
		 * @generated
		 */
		EClass RESOURCE_PROTECTION_PARAMETER_VALUE = eINSTANCE.getResourceProtectionParameterValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROTECTION_PARAMETER_VALUE__VALUE = eINSTANCE.getResourceProtectionParameterValue_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.impl.TwcaEventModelImpl <em>Twca Event Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.impl.TwcaEventModelImpl
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getTwcaEventModel()
		 * @generated
		 */
		EClass TWCA_EVENT_MODEL = eINSTANCE.getTwcaEventModel();

		/**
		 * The meta object literal for the '<em><b>Deltamin func</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWCA_EVENT_MODEL__DELTAMIN_FUNC = eINSTANCE.getTwcaEventModel_Deltamin_func();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.InputJoinBehaviorKind <em>Input Join Behavior Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.InputJoinBehaviorKind
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getInputJoinBehaviorKind()
		 * @generated
		 */
		EEnum INPUT_JOIN_BEHAVIOR_KIND = eINSTANCE.getInputJoinBehaviorKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.analysis.SchedulerPolicyKind <em>Scheduler Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.analysis.SchedulerPolicyKind
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getSchedulerPolicyKind()
		 * @generated
		 */
		EEnum SCHEDULER_POLICY_KIND = eINSTANCE.getSchedulerPolicyKind();

		/**
		 * The meta object literal for the '<em>NFP Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.Duration
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getNFP_Duration()
		 * @generated
		 */
		EDataType NFP_DURATION = eINSTANCE.getNFP_Duration();

		/**
		 * The meta object literal for the '<em>NFP Time Interval</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.TimeInterval
		 * @see org.polarsys.time4sys.analysis.impl.AnalysisPackageImpl#getNFP_TimeInterval()
		 * @generated
		 */
		EDataType NFP_TIME_INTERVAL = eINSTANCE.getNFP_TimeInterval();

	}

} //AnalysisPackage
