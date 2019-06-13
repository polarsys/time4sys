/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Thanh Dat NGUYEN- initial API and implementation
 *
 *******************************************************************************/
/**
 */
package taskmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see taskmodel.TaskmodelFactory
 * @model kind="package"
 * @generated
 */
public interface TaskmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "taskmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.polarsys.time4sys.marte.transformation.petrinet.taskmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "taskmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskmodelPackage eINSTANCE = taskmodel.impl.TaskmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link taskmodel.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmodel.impl.SystemImpl
	 * @see taskmodel.impl.TaskmodelPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Observers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OBSERVERS = 0;

	/**
	 * The feature id for the '<em><b>Owned Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_TASKS = 1;

	/**
	 * The feature id for the '<em><b>Owned Mutual Exclusion Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_MUTUAL_EXCLUSION_RESOURCES = 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Convert To Petri Net</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___CONVERT_TO_PETRI_NET = 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___CLONE = 1;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link taskmodel.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmodel.impl.TaskImpl
	 * @see taskmodel.impl.TaskmodelPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STIMULUS = 0;

	/**
	 * The feature id for the '<em><b>All Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ALL_FRAGMENTS = 1;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FRAGMENTS = 2;

	/**
	 * The feature id for the '<em><b>Sharing Resource Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SHARING_RESOURCE_FRAGMENTS = 3;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CLONE = 0;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link taskmodel.impl.ObserverImpl <em>Observer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmodel.impl.ObserverImpl
	 * @see taskmodel.impl.TaskmodelPackageImpl#getObserver()
	 * @generated
	 */
	int OBSERVER = 2;

	/**
	 * The feature id for the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__OWNED_TRANSITIONS = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Owned Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__OWNED_PLACES = 2;

	/**
	 * The feature id for the '<em><b>Check Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER__CHECK_PLACES = 3;

	/**
	 * The number of structural features of the '<em>Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link taskmodel.impl.StimulusImpl <em>Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmodel.impl.StimulusImpl
	 * @see taskmodel.impl.TaskmodelPackageImpl#getStimulus()
	 * @generated
	 */
	int STIMULUS = 3;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__OFFSET = 0;

	/**
	 * The feature id for the '<em><b>First Release</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__FIRST_RELEASE = 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__JITTER = 3;

	/**
	 * The number of structural features of the '<em>Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS___CLONE = 0;

	/**
	 * The number of operations of the '<em>Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link taskmodel.impl.SimpleComponentImpl <em>Simple Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmodel.impl.SimpleComponentImpl
	 * @see taskmodel.impl.TaskmodelPackageImpl#getSimpleComponent()
	 * @generated
	 */
	int SIMPLE_COMPONENT = 11;

	/**
	 * The feature id for the '<em><b>Owned Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPONENT__OWNED_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPONENT__CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Owned Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPONENT__OWNED_PLACE = 2;

	/**
	 * The number of structural features of the '<em>Simple Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Simple Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link taskmodel.impl.First_ReleaseImpl <em>First Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmodel.impl.First_ReleaseImpl
	 * @see taskmodel.impl.TaskmodelPackageImpl#getFirst_Release()
	 * @generated
	 */
	int FIRST_RELEASE = 4;

	/**
	 * The feature id for the '<em><b>Owned Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_RELEASE__OWNED_TRANSITION = SIMPLE_COMPONENT__OWNED_TRANSITION;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_RELEASE__CONNECTIONS = SIMPLE_COMPONENT__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Owned Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_RELEASE__OWNED_PLACE = SIMPLE_COMPONENT__OWNED_PLACE;

	/**
	 * The number of structural features of the '<em>First Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_RELEASE_FEATURE_COUNT = SIMPLE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_RELEASE___CLONE = SIMPLE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>First Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_RELEASE_OPERATION_COUNT = SIMPLE_COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link taskmodel.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmodel.impl.PeriodImpl
	 * @see taskmodel.impl.TaskmodelPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 5;

	/**
	 * The feature id for the '<em><b>Owned Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__OWNED_TRANSITION = SIMPLE_COMPONENT__OWNED_TRANSITION;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__CONNECTIONS = SIMPLE_COMPONENT__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Owned Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__OWNED_PLACE = SIMPLE_COMPONENT__OWNED_PLACE;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = SIMPLE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD___CLONE = SIMPLE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OPERATION_COUNT = SIMPLE_COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link taskmodel.impl.JitterImpl <em>Jitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmodel.impl.JitterImpl
	 * @see taskmodel.impl.TaskmodelPackageImpl#getJitter()
	 * @generated
	 */
	int JITTER = 6;

	/**
	 * The feature id for the '<em><b>Owned Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER__OWNED_TRANSITION = SIMPLE_COMPONENT__OWNED_TRANSITION;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER__CONNECTIONS = SIMPLE_COMPONENT__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Owned Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER__OWNED_PLACE = SIMPLE_COMPONENT__OWNED_PLACE;

	/**
	 * The number of structural features of the '<em>Jitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_FEATURE_COUNT = SIMPLE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER___CLONE = SIMPLE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Jitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_OPERATION_COUNT = SIMPLE_COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link taskmodel.impl.FragmentImpl <em>Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmodel.impl.FragmentImpl
	 * @see taskmodel.impl.TaskmodelPackageImpl#getFragment()
	 * @generated
	 */
	int FRAGMENT = 7;

	/**
	 * The feature id for the '<em><b>Owned Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__OWNED_TRANSITION = SIMPLE_COMPONENT__OWNED_TRANSITION;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__CONNECTIONS = SIMPLE_COMPONENT__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Owned Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__OWNED_PLACE = SIMPLE_COMPONENT__OWNED_PLACE;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__TASK = SIMPLE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__PRIORITY = SIMPLE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_FEATURE_COUNT = SIMPLE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT___CLONE = SIMPLE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_OPERATION_COUNT = SIMPLE_COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link taskmodel.impl.OffsetImpl <em>Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmodel.impl.OffsetImpl
	 * @see taskmodel.impl.TaskmodelPackageImpl#getOffset()
	 * @generated
	 */
	int OFFSET = 8;

	/**
	 * The feature id for the '<em><b>Owned Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__OWNED_TRANSITION = SIMPLE_COMPONENT__OWNED_TRANSITION;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__CONNECTIONS = SIMPLE_COMPONENT__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Owned Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__OWNED_PLACE = SIMPLE_COMPONENT__OWNED_PLACE;

	/**
	 * The number of structural features of the '<em>Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_FEATURE_COUNT = SIMPLE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET___CLONE = SIMPLE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_OPERATION_COUNT = SIMPLE_COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link taskmodel.impl.BoundObserverImpl <em>Bound Observer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmodel.impl.BoundObserverImpl
	 * @see taskmodel.impl.TaskmodelPackageImpl#getBoundObserver()
	 * @generated
	 */
	int BOUND_OBSERVER = 9;

	/**
	 * The feature id for the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OBSERVER__OWNED_TRANSITIONS = OBSERVER__OWNED_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OBSERVER__CONNECTIONS = OBSERVER__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Owned Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OBSERVER__OWNED_PLACES = OBSERVER__OWNED_PLACES;

	/**
	 * The feature id for the '<em><b>Check Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OBSERVER__CHECK_PLACES = OBSERVER__CHECK_PLACES;

	/**
	 * The number of structural features of the '<em>Bound Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OBSERVER_FEATURE_COUNT = OBSERVER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bound Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OBSERVER_OPERATION_COUNT = OBSERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link taskmodel.impl.ResponseTimeObserverImpl <em>Response Time Observer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmodel.impl.ResponseTimeObserverImpl
	 * @see taskmodel.impl.TaskmodelPackageImpl#getResponseTimeObserver()
	 * @generated
	 */
	int RESPONSE_TIME_OBSERVER = 10;

	/**
	 * The feature id for the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TIME_OBSERVER__OWNED_TRANSITIONS = OBSERVER__OWNED_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TIME_OBSERVER__CONNECTIONS = OBSERVER__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Owned Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TIME_OBSERVER__OWNED_PLACES = OBSERVER__OWNED_PLACES;

	/**
	 * The feature id for the '<em><b>Check Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TIME_OBSERVER__CHECK_PLACES = OBSERVER__CHECK_PLACES;

	/**
	 * The number of structural features of the '<em>Response Time Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TIME_OBSERVER_FEATURE_COUNT = OBSERVER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Response Time Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TIME_OBSERVER_OPERATION_COUNT = OBSERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link taskmodel.impl.AbstractFragmentImpl <em>Abstract Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmodel.impl.AbstractFragmentImpl
	 * @see taskmodel.impl.TaskmodelPackageImpl#getAbstractFragment()
	 * @generated
	 */
	int ABSTRACT_FRAGMENT = 14;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FRAGMENT__TASK = 0;

	/**
	 * The number of structural features of the '<em>Abstract Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FRAGMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FRAGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link taskmodel.impl.SharingResourceFragmentImpl <em>Sharing Resource Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmodel.impl.SharingResourceFragmentImpl
	 * @see taskmodel.impl.TaskmodelPackageImpl#getSharingResourceFragment()
	 * @generated
	 */
	int SHARING_RESOURCE_FRAGMENT = 12;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARING_RESOURCE_FRAGMENT__TASK = ABSTRACT_FRAGMENT__TASK;

	/**
	 * The feature id for the '<em><b>First Fragment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARING_RESOURCE_FRAGMENT__FIRST_FRAGMENT = ABSTRACT_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Fragment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARING_RESOURCE_FRAGMENT__SECOND_FRAGMENT = ABSTRACT_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARING_RESOURCE_FRAGMENT__CONNECTIONS = ABSTRACT_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sharing Resource Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARING_RESOURCE_FRAGMENT_FEATURE_COUNT = ABSTRACT_FRAGMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARING_RESOURCE_FRAGMENT___CLONE = ABSTRACT_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sharing Resource Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARING_RESOURCE_FRAGMENT_OPERATION_COUNT = ABSTRACT_FRAGMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link taskmodel.impl.MutualExclusionResourceImpl <em>Mutual Exclusion Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmodel.impl.MutualExclusionResourceImpl
	 * @see taskmodel.impl.TaskmodelPackageImpl#getMutualExclusionResource()
	 * @generated
	 */
	int MUTUAL_EXCLUSION_RESOURCE = 13;

	/**
	 * The feature id for the '<em><b>Mutual Exclusion Resource Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__MUTUAL_EXCLUSION_RESOURCE_PLACE = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE__CONNECTIONS = 1;

	/**
	 * The number of structural features of the '<em>Mutual Exclusion Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE___CLONE = 0;

	/**
	 * The number of operations of the '<em>Mutual Exclusion Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_RESOURCE_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link taskmodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see taskmodel.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link taskmodel.System#getObservers <em>Observers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Observers</em>'.
	 * @see taskmodel.System#getObservers()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Observers();

	/**
	 * Returns the meta object for the containment reference list '{@link taskmodel.System#getOwnedTasks <em>Owned Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Tasks</em>'.
	 * @see taskmodel.System#getOwnedTasks()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_OwnedTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link taskmodel.System#getOwnedMutualExclusionResources <em>Owned Mutual Exclusion Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Mutual Exclusion Resources</em>'.
	 * @see taskmodel.System#getOwnedMutualExclusionResources()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_OwnedMutualExclusionResources();

	/**
	 * Returns the meta object for the '{@link taskmodel.System#convertToPetriNet() <em>Convert To Petri Net</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Petri Net</em>' operation.
	 * @see taskmodel.System#convertToPetriNet()
	 * @generated
	 */
	EOperation getSystem__ConvertToPetriNet();

	/**
	 * Returns the meta object for the '{@link taskmodel.System#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see taskmodel.System#clone()
	 * @generated
	 */
	EOperation getSystem__Clone();

	/**
	 * Returns the meta object for class '{@link taskmodel.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see taskmodel.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference '{@link taskmodel.Task#getStimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stimulus</em>'.
	 * @see taskmodel.Task#getStimulus()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Stimulus();

	/**
	 * Returns the meta object for the containment reference list '{@link taskmodel.Task#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see taskmodel.Task#getFragments()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Fragments();

	/**
	 * Returns the meta object for the containment reference list '{@link taskmodel.Task#getSharingResourceFragments <em>Sharing Resource Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sharing Resource Fragments</em>'.
	 * @see taskmodel.Task#getSharingResourceFragments()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_SharingResourceFragments();

	/**
	 * Returns the meta object for the containment reference list '{@link taskmodel.Task#getAllFragments <em>All Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Fragments</em>'.
	 * @see taskmodel.Task#getAllFragments()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_AllFragments();

	/**
	 * Returns the meta object for the '{@link taskmodel.Task#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see taskmodel.Task#clone()
	 * @generated
	 */
	EOperation getTask__Clone();

	/**
	 * Returns the meta object for class '{@link taskmodel.Observer <em>Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observer</em>'.
	 * @see taskmodel.Observer
	 * @generated
	 */
	EClass getObserver();

	/**
	 * Returns the meta object for the containment reference list '{@link taskmodel.Observer#getOwnedTransitions <em>Owned Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Transitions</em>'.
	 * @see taskmodel.Observer#getOwnedTransitions()
	 * @see #getObserver()
	 * @generated
	 */
	EReference getObserver_OwnedTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link taskmodel.Observer#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see taskmodel.Observer#getConnections()
	 * @see #getObserver()
	 * @generated
	 */
	EReference getObserver_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link taskmodel.Observer#getOwnedPlaces <em>Owned Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Places</em>'.
	 * @see taskmodel.Observer#getOwnedPlaces()
	 * @see #getObserver()
	 * @generated
	 */
	EReference getObserver_OwnedPlaces();

	/**
	 * Returns the meta object for the reference list '{@link taskmodel.Observer#getCheckPlaces <em>Check Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Check Places</em>'.
	 * @see taskmodel.Observer#getCheckPlaces()
	 * @see #getObserver()
	 * @generated
	 */
	EReference getObserver_CheckPlaces();

	/**
	 * Returns the meta object for class '{@link taskmodel.Stimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus</em>'.
	 * @see taskmodel.Stimulus
	 * @generated
	 */
	EClass getStimulus();

	/**
	 * Returns the meta object for the containment reference '{@link taskmodel.Stimulus#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see taskmodel.Stimulus#getOffset()
	 * @see #getStimulus()
	 * @generated
	 */
	EReference getStimulus_Offset();

	/**
	 * Returns the meta object for the containment reference '{@link taskmodel.Stimulus#getFirstRelease <em>First Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Release</em>'.
	 * @see taskmodel.Stimulus#getFirstRelease()
	 * @see #getStimulus()
	 * @generated
	 */
	EReference getStimulus_FirstRelease();

	/**
	 * Returns the meta object for the containment reference '{@link taskmodel.Stimulus#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see taskmodel.Stimulus#getPeriod()
	 * @see #getStimulus()
	 * @generated
	 */
	EReference getStimulus_Period();

	/**
	 * Returns the meta object for the containment reference '{@link taskmodel.Stimulus#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jitter</em>'.
	 * @see taskmodel.Stimulus#getJitter()
	 * @see #getStimulus()
	 * @generated
	 */
	EReference getStimulus_Jitter();

	/**
	 * Returns the meta object for the '{@link taskmodel.Stimulus#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see taskmodel.Stimulus#clone()
	 * @generated
	 */
	EOperation getStimulus__Clone();

	/**
	 * Returns the meta object for class '{@link taskmodel.First_Release <em>First Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Release</em>'.
	 * @see taskmodel.First_Release
	 * @generated
	 */
	EClass getFirst_Release();

	/**
	 * Returns the meta object for the '{@link taskmodel.First_Release#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see taskmodel.First_Release#clone()
	 * @generated
	 */
	EOperation getFirst_Release__Clone();

	/**
	 * Returns the meta object for class '{@link taskmodel.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see taskmodel.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the '{@link taskmodel.Period#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see taskmodel.Period#clone()
	 * @generated
	 */
	EOperation getPeriod__Clone();

	/**
	 * Returns the meta object for class '{@link taskmodel.Jitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jitter</em>'.
	 * @see taskmodel.Jitter
	 * @generated
	 */
	EClass getJitter();

	/**
	 * Returns the meta object for the '{@link taskmodel.Jitter#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see taskmodel.Jitter#clone()
	 * @generated
	 */
	EOperation getJitter__Clone();

	/**
	 * Returns the meta object for class '{@link taskmodel.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment</em>'.
	 * @see taskmodel.Fragment
	 * @generated
	 */
	EClass getFragment();

	/**
	 * Returns the meta object for the attribute '{@link taskmodel.Fragment#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see taskmodel.Fragment#getPriority()
	 * @see #getFragment()
	 * @generated
	 */
	EAttribute getFragment_Priority();

	/**
	 * Returns the meta object for the '{@link taskmodel.Fragment#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see taskmodel.Fragment#clone()
	 * @generated
	 */
	EOperation getFragment__Clone();

	/**
	 * Returns the meta object for class '{@link taskmodel.Offset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offset</em>'.
	 * @see taskmodel.Offset
	 * @generated
	 */
	EClass getOffset();

	/**
	 * Returns the meta object for the '{@link taskmodel.Offset#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see taskmodel.Offset#clone()
	 * @generated
	 */
	EOperation getOffset__Clone();

	/**
	 * Returns the meta object for class '{@link taskmodel.BoundObserver <em>Bound Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound Observer</em>'.
	 * @see taskmodel.BoundObserver
	 * @generated
	 */
	EClass getBoundObserver();

	/**
	 * Returns the meta object for class '{@link taskmodel.ResponseTimeObserver <em>Response Time Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Time Observer</em>'.
	 * @see taskmodel.ResponseTimeObserver
	 * @generated
	 */
	EClass getResponseTimeObserver();

	/**
	 * Returns the meta object for class '{@link taskmodel.SimpleComponent <em>Simple Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Component</em>'.
	 * @see taskmodel.SimpleComponent
	 * @generated
	 */
	EClass getSimpleComponent();

	/**
	 * Returns the meta object for the containment reference '{@link taskmodel.SimpleComponent#getOwnedTransition <em>Owned Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Transition</em>'.
	 * @see taskmodel.SimpleComponent#getOwnedTransition()
	 * @see #getSimpleComponent()
	 * @generated
	 */
	EReference getSimpleComponent_OwnedTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link taskmodel.SimpleComponent#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see taskmodel.SimpleComponent#getConnections()
	 * @see #getSimpleComponent()
	 * @generated
	 */
	EReference getSimpleComponent_Connections();

	/**
	 * Returns the meta object for the containment reference '{@link taskmodel.SimpleComponent#getOwnedPlace <em>Owned Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Place</em>'.
	 * @see taskmodel.SimpleComponent#getOwnedPlace()
	 * @see #getSimpleComponent()
	 * @generated
	 */
	EReference getSimpleComponent_OwnedPlace();

	/**
	 * Returns the meta object for class '{@link taskmodel.SharingResourceFragment <em>Sharing Resource Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sharing Resource Fragment</em>'.
	 * @see taskmodel.SharingResourceFragment
	 * @generated
	 */
	EClass getSharingResourceFragment();

	/**
	 * Returns the meta object for the containment reference '{@link taskmodel.SharingResourceFragment#getFirstFragment <em>First Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Fragment</em>'.
	 * @see taskmodel.SharingResourceFragment#getFirstFragment()
	 * @see #getSharingResourceFragment()
	 * @generated
	 */
	EReference getSharingResourceFragment_FirstFragment();

	/**
	 * Returns the meta object for the containment reference '{@link taskmodel.SharingResourceFragment#getSecondFragment <em>Second Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second Fragment</em>'.
	 * @see taskmodel.SharingResourceFragment#getSecondFragment()
	 * @see #getSharingResourceFragment()
	 * @generated
	 */
	EReference getSharingResourceFragment_SecondFragment();

	/**
	 * Returns the meta object for the containment reference list '{@link taskmodel.SharingResourceFragment#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see taskmodel.SharingResourceFragment#getConnections()
	 * @see #getSharingResourceFragment()
	 * @generated
	 */
	EReference getSharingResourceFragment_Connections();

	/**
	 * Returns the meta object for the '{@link taskmodel.SharingResourceFragment#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see taskmodel.SharingResourceFragment#clone()
	 * @generated
	 */
	EOperation getSharingResourceFragment__Clone();

	/**
	 * Returns the meta object for class '{@link taskmodel.MutualExclusionResource <em>Mutual Exclusion Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutual Exclusion Resource</em>'.
	 * @see taskmodel.MutualExclusionResource
	 * @generated
	 */
	EClass getMutualExclusionResource();

	/**
	 * Returns the meta object for the containment reference '{@link taskmodel.MutualExclusionResource#getMutualExclusionResourcePlace <em>Mutual Exclusion Resource Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mutual Exclusion Resource Place</em>'.
	 * @see taskmodel.MutualExclusionResource#getMutualExclusionResourcePlace()
	 * @see #getMutualExclusionResource()
	 * @generated
	 */
	EReference getMutualExclusionResource_MutualExclusionResourcePlace();

	/**
	 * Returns the meta object for the containment reference list '{@link taskmodel.MutualExclusionResource#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see taskmodel.MutualExclusionResource#getConnections()
	 * @see #getMutualExclusionResource()
	 * @generated
	 */
	EReference getMutualExclusionResource_Connections();

	/**
	 * Returns the meta object for the '{@link taskmodel.MutualExclusionResource#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see taskmodel.MutualExclusionResource#clone()
	 * @generated
	 */
	EOperation getMutualExclusionResource__Clone();

	/**
	 * Returns the meta object for class '{@link taskmodel.AbstractFragment <em>Abstract Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Fragment</em>'.
	 * @see taskmodel.AbstractFragment
	 * @generated
	 */
	EClass getAbstractFragment();

	/**
	 * Returns the meta object for the reference '{@link taskmodel.AbstractFragment#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see taskmodel.AbstractFragment#getTask()
	 * @see #getAbstractFragment()
	 * @generated
	 */
	EReference getAbstractFragment_Task();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaskmodelFactory getTaskmodelFactory();

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
		 * The meta object literal for the '{@link taskmodel.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmodel.impl.SystemImpl
		 * @see taskmodel.impl.TaskmodelPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Observers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__OBSERVERS = eINSTANCE.getSystem_Observers();

		/**
		 * The meta object literal for the '<em><b>Owned Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__OWNED_TASKS = eINSTANCE.getSystem_OwnedTasks();

		/**
		 * The meta object literal for the '<em><b>Owned Mutual Exclusion Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__OWNED_MUTUAL_EXCLUSION_RESOURCES = eINSTANCE.getSystem_OwnedMutualExclusionResources();

		/**
		 * The meta object literal for the '<em><b>Convert To Petri Net</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___CONVERT_TO_PETRI_NET = eINSTANCE.getSystem__ConvertToPetriNet();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___CLONE = eINSTANCE.getSystem__Clone();

		/**
		 * The meta object literal for the '{@link taskmodel.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmodel.impl.TaskImpl
		 * @see taskmodel.impl.TaskmodelPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Stimulus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__STIMULUS = eINSTANCE.getTask_Stimulus();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__FRAGMENTS = eINSTANCE.getTask_Fragments();

		/**
		 * The meta object literal for the '<em><b>Sharing Resource Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SHARING_RESOURCE_FRAGMENTS = eINSTANCE.getTask_SharingResourceFragments();

		/**
		 * The meta object literal for the '<em><b>All Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ALL_FRAGMENTS = eINSTANCE.getTask_AllFragments();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___CLONE = eINSTANCE.getTask__Clone();

		/**
		 * The meta object literal for the '{@link taskmodel.impl.ObserverImpl <em>Observer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmodel.impl.ObserverImpl
		 * @see taskmodel.impl.TaskmodelPackageImpl#getObserver()
		 * @generated
		 */
		EClass OBSERVER = eINSTANCE.getObserver();

		/**
		 * The meta object literal for the '<em><b>Owned Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER__OWNED_TRANSITIONS = eINSTANCE.getObserver_OwnedTransitions();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER__CONNECTIONS = eINSTANCE.getObserver_Connections();

		/**
		 * The meta object literal for the '<em><b>Owned Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER__OWNED_PLACES = eINSTANCE.getObserver_OwnedPlaces();

		/**
		 * The meta object literal for the '<em><b>Check Places</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER__CHECK_PLACES = eINSTANCE.getObserver_CheckPlaces();

		/**
		 * The meta object literal for the '{@link taskmodel.impl.StimulusImpl <em>Stimulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmodel.impl.StimulusImpl
		 * @see taskmodel.impl.TaskmodelPackageImpl#getStimulus()
		 * @generated
		 */
		EClass STIMULUS = eINSTANCE.getStimulus();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULUS__OFFSET = eINSTANCE.getStimulus_Offset();

		/**
		 * The meta object literal for the '<em><b>First Release</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULUS__FIRST_RELEASE = eINSTANCE.getStimulus_FirstRelease();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULUS__PERIOD = eINSTANCE.getStimulus_Period();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULUS__JITTER = eINSTANCE.getStimulus_Jitter();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STIMULUS___CLONE = eINSTANCE.getStimulus__Clone();

		/**
		 * The meta object literal for the '{@link taskmodel.impl.First_ReleaseImpl <em>First Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmodel.impl.First_ReleaseImpl
		 * @see taskmodel.impl.TaskmodelPackageImpl#getFirst_Release()
		 * @generated
		 */
		EClass FIRST_RELEASE = eINSTANCE.getFirst_Release();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FIRST_RELEASE___CLONE = eINSTANCE.getFirst_Release__Clone();

		/**
		 * The meta object literal for the '{@link taskmodel.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmodel.impl.PeriodImpl
		 * @see taskmodel.impl.TaskmodelPackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERIOD___CLONE = eINSTANCE.getPeriod__Clone();

		/**
		 * The meta object literal for the '{@link taskmodel.impl.JitterImpl <em>Jitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmodel.impl.JitterImpl
		 * @see taskmodel.impl.TaskmodelPackageImpl#getJitter()
		 * @generated
		 */
		EClass JITTER = eINSTANCE.getJitter();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JITTER___CLONE = eINSTANCE.getJitter__Clone();

		/**
		 * The meta object literal for the '{@link taskmodel.impl.FragmentImpl <em>Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmodel.impl.FragmentImpl
		 * @see taskmodel.impl.TaskmodelPackageImpl#getFragment()
		 * @generated
		 */
		EClass FRAGMENT = eINSTANCE.getFragment();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT__PRIORITY = eINSTANCE.getFragment_Priority();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAGMENT___CLONE = eINSTANCE.getFragment__Clone();

		/**
		 * The meta object literal for the '{@link taskmodel.impl.OffsetImpl <em>Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmodel.impl.OffsetImpl
		 * @see taskmodel.impl.TaskmodelPackageImpl#getOffset()
		 * @generated
		 */
		EClass OFFSET = eINSTANCE.getOffset();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFSET___CLONE = eINSTANCE.getOffset__Clone();

		/**
		 * The meta object literal for the '{@link taskmodel.impl.BoundObserverImpl <em>Bound Observer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmodel.impl.BoundObserverImpl
		 * @see taskmodel.impl.TaskmodelPackageImpl#getBoundObserver()
		 * @generated
		 */
		EClass BOUND_OBSERVER = eINSTANCE.getBoundObserver();

		/**
		 * The meta object literal for the '{@link taskmodel.impl.ResponseTimeObserverImpl <em>Response Time Observer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmodel.impl.ResponseTimeObserverImpl
		 * @see taskmodel.impl.TaskmodelPackageImpl#getResponseTimeObserver()
		 * @generated
		 */
		EClass RESPONSE_TIME_OBSERVER = eINSTANCE.getResponseTimeObserver();

		/**
		 * The meta object literal for the '{@link taskmodel.impl.SimpleComponentImpl <em>Simple Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmodel.impl.SimpleComponentImpl
		 * @see taskmodel.impl.TaskmodelPackageImpl#getSimpleComponent()
		 * @generated
		 */
		EClass SIMPLE_COMPONENT = eINSTANCE.getSimpleComponent();

		/**
		 * The meta object literal for the '<em><b>Owned Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_COMPONENT__OWNED_TRANSITION = eINSTANCE.getSimpleComponent_OwnedTransition();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_COMPONENT__CONNECTIONS = eINSTANCE.getSimpleComponent_Connections();

		/**
		 * The meta object literal for the '<em><b>Owned Place</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_COMPONENT__OWNED_PLACE = eINSTANCE.getSimpleComponent_OwnedPlace();

		/**
		 * The meta object literal for the '{@link taskmodel.impl.SharingResourceFragmentImpl <em>Sharing Resource Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmodel.impl.SharingResourceFragmentImpl
		 * @see taskmodel.impl.TaskmodelPackageImpl#getSharingResourceFragment()
		 * @generated
		 */
		EClass SHARING_RESOURCE_FRAGMENT = eINSTANCE.getSharingResourceFragment();

		/**
		 * The meta object literal for the '<em><b>First Fragment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARING_RESOURCE_FRAGMENT__FIRST_FRAGMENT = eINSTANCE.getSharingResourceFragment_FirstFragment();

		/**
		 * The meta object literal for the '<em><b>Second Fragment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARING_RESOURCE_FRAGMENT__SECOND_FRAGMENT = eINSTANCE.getSharingResourceFragment_SecondFragment();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARING_RESOURCE_FRAGMENT__CONNECTIONS = eINSTANCE.getSharingResourceFragment_Connections();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHARING_RESOURCE_FRAGMENT___CLONE = eINSTANCE.getSharingResourceFragment__Clone();

		/**
		 * The meta object literal for the '{@link taskmodel.impl.MutualExclusionResourceImpl <em>Mutual Exclusion Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmodel.impl.MutualExclusionResourceImpl
		 * @see taskmodel.impl.TaskmodelPackageImpl#getMutualExclusionResource()
		 * @generated
		 */
		EClass MUTUAL_EXCLUSION_RESOURCE = eINSTANCE.getMutualExclusionResource();

		/**
		 * The meta object literal for the '<em><b>Mutual Exclusion Resource Place</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTUAL_EXCLUSION_RESOURCE__MUTUAL_EXCLUSION_RESOURCE_PLACE = eINSTANCE.getMutualExclusionResource_MutualExclusionResourcePlace();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTUAL_EXCLUSION_RESOURCE__CONNECTIONS = eINSTANCE.getMutualExclusionResource_Connections();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MUTUAL_EXCLUSION_RESOURCE___CLONE = eINSTANCE.getMutualExclusionResource__Clone();

		/**
		 * The meta object literal for the '{@link taskmodel.impl.AbstractFragmentImpl <em>Abstract Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmodel.impl.AbstractFragmentImpl
		 * @see taskmodel.impl.TaskmodelPackageImpl#getAbstractFragment()
		 * @generated
		 */
		EClass ABSTRACT_FRAGMENT = eINSTANCE.getAbstractFragment();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FRAGMENT__TASK = eINSTANCE.getAbstractFragment_Task();

	}

} //TaskmodelPackage
