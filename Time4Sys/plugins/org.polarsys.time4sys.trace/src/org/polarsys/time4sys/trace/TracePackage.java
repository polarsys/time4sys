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
package org.polarsys.time4sys.trace;

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
 * <!-- begin-model-doc -->
 * Return the Events of this slice ordered by timestamp.
 * <!-- end-model-doc -->
 * @see org.polarsys.time4sys.trace.TraceFactory
 * @model kind="package"
 * @generated
 */
public interface TracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/trace/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "trace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracePackage eINSTANCE = org.polarsys.time4sys.trace.impl.TracePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.trace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.impl.TraceImpl
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__RANGE = 1;

	/**
	 * The feature id for the '<em><b>Slices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SLICES = 2;

	/**
	 * The feature id for the '<em><b>Host Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__HOST_ID = 3;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__PRECISION = 4;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.trace.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.impl.EventImpl
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TRACE = 1;

	/**
	 * The feature id for the '<em><b>About</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ABOUT = 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.trace.impl.ResourceEventImpl <em>Resource Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.impl.ResourceEventImpl
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getResourceEvent()
	 * @generated
	 */
	int RESOURCE_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT__TIMESTAMP = EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT__TRACE = EVENT__TRACE;

	/**
	 * The feature id for the '<em><b>About</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT__ABOUT = EVENT__ABOUT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT__KIND = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.trace.impl.SchedulingEventImpl <em>Scheduling Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.impl.SchedulingEventImpl
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getSchedulingEvent()
	 * @generated
	 */
	int SCHEDULING_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_EVENT__TIMESTAMP = EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_EVENT__TRACE = EVENT__TRACE;

	/**
	 * The feature id for the '<em><b>About</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_EVENT__ABOUT = EVENT__ABOUT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_EVENT__KIND = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scheduling Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scheduling Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.trace.impl.MessageEventImpl <em>Message Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.impl.MessageEventImpl
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getMessageEvent()
	 * @generated
	 */
	int MESSAGE_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__TIMESTAMP = EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__TRACE = EVENT__TRACE;

	/**
	 * The feature id for the '<em><b>About</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__ABOUT = EVENT__ABOUT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__KIND = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.trace.impl.SliceImpl <em>Slice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.impl.SliceImpl
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getSlice()
	 * @generated
	 */
	int SLICE = 5;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Owned Sub Slices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE__OWNED_SUB_SLICES = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE__KIND = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE__PROPERTIES = 5;

	/**
	 * The feature id for the '<em><b>Sub Slices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE__SUB_SLICES = 6;

	/**
	 * The feature id for the '<em><b>Kind Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE__KIND_LABEL = 7;

	/**
	 * The number of structural features of the '<em>Slice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Get Hierarchical Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE___GET_HIERARCHICAL_NAME__STRING = 0;

	/**
	 * The operation id for the '<em>Get Aggregated Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE___GET_AGGREGATED_EVENTS = 1;

	/**
	 * The operation id for the '<em>Get Latest Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE___GET_LATEST_TIMESTAMP = 2;

	/**
	 * The number of operations of the '<em>Slice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.trace.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.impl.PropertiesImpl
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__RANGE = 0;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__BLOCKING_TIME = 1;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__EXECUTION_TIME = 2;

	/**
	 * The feature id for the '<em><b>Remaining Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__REMAINING_TIME = 3;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__RESPONSE_TIME = 4;

	/**
	 * The feature id for the '<em><b>Absolute Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__ABSOLUTE_DEADLINE = 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__INDEX = 6;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.trace.impl.ValueChangeEventImpl <em>Value Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.impl.ValueChangeEventImpl
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getValueChangeEvent()
	 * @generated
	 */
	int VALUE_CHANGE_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CHANGE_EVENT__TIMESTAMP = EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CHANGE_EVENT__TRACE = EVENT__TRACE;

	/**
	 * The feature id for the '<em><b>About</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CHANGE_EVENT__ABOUT = EVENT__ABOUT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CHANGE_EVENT__PROPERTY = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CHANGE_EVENT__OBJECT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CHANGE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CHANGE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.trace.impl.ObjectValueChangeEventImpl <em>Object Value Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.impl.ObjectValueChangeEventImpl
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getObjectValueChangeEvent()
	 * @generated
	 */
	int OBJECT_VALUE_CHANGE_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_CHANGE_EVENT__TIMESTAMP = VALUE_CHANGE_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_CHANGE_EVENT__TRACE = VALUE_CHANGE_EVENT__TRACE;

	/**
	 * The feature id for the '<em><b>About</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_CHANGE_EVENT__ABOUT = VALUE_CHANGE_EVENT__ABOUT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_CHANGE_EVENT__PROPERTY = VALUE_CHANGE_EVENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_CHANGE_EVENT__OBJECT = VALUE_CHANGE_EVENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_CHANGE_EVENT__VALUE = VALUE_CHANGE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Value Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_CHANGE_EVENT_FEATURE_COUNT = VALUE_CHANGE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Value Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_CHANGE_EVENT_OPERATION_COUNT = VALUE_CHANGE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.trace.impl.DurationValueChangeEventImpl <em>Duration Value Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.impl.DurationValueChangeEventImpl
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getDurationValueChangeEvent()
	 * @generated
	 */
	int DURATION_VALUE_CHANGE_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_VALUE_CHANGE_EVENT__TIMESTAMP = VALUE_CHANGE_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_VALUE_CHANGE_EVENT__TRACE = VALUE_CHANGE_EVENT__TRACE;

	/**
	 * The feature id for the '<em><b>About</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_VALUE_CHANGE_EVENT__ABOUT = VALUE_CHANGE_EVENT__ABOUT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_VALUE_CHANGE_EVENT__PROPERTY = VALUE_CHANGE_EVENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_VALUE_CHANGE_EVENT__OBJECT = VALUE_CHANGE_EVENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_VALUE_CHANGE_EVENT__VALUE = VALUE_CHANGE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Duration Value Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_VALUE_CHANGE_EVENT_FEATURE_COUNT = VALUE_CHANGE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Duration Value Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_VALUE_CHANGE_EVENT_OPERATION_COUNT = VALUE_CHANGE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.trace.impl.DataSizeValueChangeEventImpl <em>Data Size Value Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.impl.DataSizeValueChangeEventImpl
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getDataSizeValueChangeEvent()
	 * @generated
	 */
	int DATA_SIZE_VALUE_CHANGE_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_VALUE_CHANGE_EVENT__TIMESTAMP = VALUE_CHANGE_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_VALUE_CHANGE_EVENT__TRACE = VALUE_CHANGE_EVENT__TRACE;

	/**
	 * The feature id for the '<em><b>About</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_VALUE_CHANGE_EVENT__ABOUT = VALUE_CHANGE_EVENT__ABOUT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_VALUE_CHANGE_EVENT__PROPERTY = VALUE_CHANGE_EVENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_VALUE_CHANGE_EVENT__OBJECT = VALUE_CHANGE_EVENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_VALUE_CHANGE_EVENT__VALUE = VALUE_CHANGE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Size Value Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_VALUE_CHANGE_EVENT_FEATURE_COUNT = VALUE_CHANGE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Size Value Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_VALUE_CHANGE_EVENT_OPERATION_COUNT = VALUE_CHANGE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.trace.impl.NumberValueChangeEventImpl <em>Number Value Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.impl.NumberValueChangeEventImpl
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getNumberValueChangeEvent()
	 * @generated
	 */
	int NUMBER_VALUE_CHANGE_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_CHANGE_EVENT__TIMESTAMP = VALUE_CHANGE_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_CHANGE_EVENT__TRACE = VALUE_CHANGE_EVENT__TRACE;

	/**
	 * The feature id for the '<em><b>About</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_CHANGE_EVENT__ABOUT = VALUE_CHANGE_EVENT__ABOUT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_CHANGE_EVENT__PROPERTY = VALUE_CHANGE_EVENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_CHANGE_EVENT__OBJECT = VALUE_CHANGE_EVENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_CHANGE_EVENT__VALUE = VALUE_CHANGE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Value Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_CHANGE_EVENT_FEATURE_COUNT = VALUE_CHANGE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Value Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_CHANGE_EVENT_OPERATION_COUNT = VALUE_CHANGE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.trace.SchedulingEventKind <em>Scheduling Event Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.SchedulingEventKind
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getSchedulingEventKind()
	 * @generated
	 */
	int SCHEDULING_EVENT_KIND = 12;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.trace.ResourceEventKind <em>Resource Event Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.ResourceEventKind
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getResourceEventKind()
	 * @generated
	 */
	int RESOURCE_EVENT_KIND = 13;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.trace.MessageEventKind <em>Message Event Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.MessageEventKind
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getMessageEventKind()
	 * @generated
	 */
	int MESSAGE_EVENT_KIND = 14;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.trace.SliceKind <em>Slice Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.SliceKind
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getSliceKind()
	 * @generated
	 */
	int SLICE_KIND = 15;

	/**
	 * The meta object id for the '<em>NFP Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getNFP_Duration()
	 * @generated
	 */
	int NFP_DURATION = 16;

	/**
	 * The meta object id for the '<em>NFP Time Interval</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getNFP_TimeInterval()
	 * @generated
	 */
	int NFP_TIME_INTERVAL = 17;


	/**
	 * The meta object id for the '<em>ENumber</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Number
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getENumber()
	 * @generated
	 */
	int ENUMBER = 18;

	/**
	 * The meta object id for the '<em>NFP Data Size</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.DataSize
	 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getNFP_DataSize()
	 * @generated
	 */
	int NFP_DATA_SIZE = 19;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.trace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see org.polarsys.time4sys.trace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.trace.Trace#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.polarsys.time4sys.trace.Trace#getEvents()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Events();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.Trace#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see org.polarsys.time4sys.trace.Trace#getRange()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_Range();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.trace.Trace#getSlices <em>Slices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slices</em>'.
	 * @see org.polarsys.time4sys.trace.Trace#getSlices()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Slices();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.Trace#getHostId <em>Host Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Id</em>'.
	 * @see org.polarsys.time4sys.trace.Trace#getHostId()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_HostId();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.Trace#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.polarsys.time4sys.trace.Trace#getPrecision()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_Precision();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.trace.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.polarsys.time4sys.trace.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.Event#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.polarsys.time4sys.trace.Event#getTimestamp()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Timestamp();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.trace.Event#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Trace</em>'.
	 * @see org.polarsys.time4sys.trace.Event#getTrace()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Trace();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.trace.Event#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>About</em>'.
	 * @see org.polarsys.time4sys.trace.Event#getAbout()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_About();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.trace.ResourceEvent <em>Resource Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Event</em>'.
	 * @see org.polarsys.time4sys.trace.ResourceEvent
	 * @generated
	 */
	EClass getResourceEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.ResourceEvent#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.time4sys.trace.ResourceEvent#getKind()
	 * @see #getResourceEvent()
	 * @generated
	 */
	EAttribute getResourceEvent_Kind();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.trace.SchedulingEvent <em>Scheduling Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Event</em>'.
	 * @see org.polarsys.time4sys.trace.SchedulingEvent
	 * @generated
	 */
	EClass getSchedulingEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.SchedulingEvent#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.time4sys.trace.SchedulingEvent#getKind()
	 * @see #getSchedulingEvent()
	 * @generated
	 */
	EAttribute getSchedulingEvent_Kind();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.trace.MessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Event</em>'.
	 * @see org.polarsys.time4sys.trace.MessageEvent
	 * @generated
	 */
	EClass getMessageEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.MessageEvent#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.time4sys.trace.MessageEvent#getKind()
	 * @see #getMessageEvent()
	 * @generated
	 */
	EAttribute getMessageEvent_Kind();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.trace.Slice <em>Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slice</em>'.
	 * @see org.polarsys.time4sys.trace.Slice
	 * @generated
	 */
	EClass getSlice();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.trace.Slice#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see org.polarsys.time4sys.trace.Slice#getEvents()
	 * @see #getSlice()
	 * @generated
	 */
	EReference getSlice_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.trace.Slice#getOwnedSubSlices <em>Owned Sub Slices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Sub Slices</em>'.
	 * @see org.polarsys.time4sys.trace.Slice#getOwnedSubSlices()
	 * @see #getSlice()
	 * @generated
	 */
	EReference getSlice_OwnedSubSlices();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.trace.Slice#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.polarsys.time4sys.trace.Slice#getParent()
	 * @see #getSlice()
	 * @generated
	 */
	EReference getSlice_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.Slice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.time4sys.trace.Slice#getName()
	 * @see #getSlice()
	 * @generated
	 */
	EAttribute getSlice_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.Slice#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.time4sys.trace.Slice#getKind()
	 * @see #getSlice()
	 * @generated
	 */
	EAttribute getSlice_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.trace.Slice#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.polarsys.time4sys.trace.Slice#getProperties()
	 * @see #getSlice()
	 * @generated
	 */
	EReference getSlice_Properties();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.trace.Slice#getSubSlices <em>Sub Slices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Slices</em>'.
	 * @see org.polarsys.time4sys.trace.Slice#getSubSlices()
	 * @see #getSlice()
	 * @generated
	 */
	EReference getSlice_SubSlices();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.Slice#getKindLabel <em>Kind Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Label</em>'.
	 * @see org.polarsys.time4sys.trace.Slice#getKindLabel()
	 * @see #getSlice()
	 * @generated
	 */
	EAttribute getSlice_KindLabel();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.trace.Slice#getHierarchicalName(java.lang.String) <em>Get Hierarchical Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Hierarchical Name</em>' operation.
	 * @see org.polarsys.time4sys.trace.Slice#getHierarchicalName(java.lang.String)
	 * @generated
	 */
	EOperation getSlice__GetHierarchicalName__String();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.trace.Slice#getAggregatedEvents() <em>Get Aggregated Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Aggregated Events</em>' operation.
	 * @see org.polarsys.time4sys.trace.Slice#getAggregatedEvents()
	 * @generated
	 */
	EOperation getSlice__GetAggregatedEvents();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.trace.Slice#getLatestTimestamp() <em>Get Latest Timestamp</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Latest Timestamp</em>' operation.
	 * @see org.polarsys.time4sys.trace.Slice#getLatestTimestamp()
	 * @generated
	 */
	EOperation getSlice__GetLatestTimestamp();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.trace.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see org.polarsys.time4sys.trace.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.Properties#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see org.polarsys.time4sys.trace.Properties#getRange()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Range();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.Properties#getBlockingTime <em>Blocking Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocking Time</em>'.
	 * @see org.polarsys.time4sys.trace.Properties#getBlockingTime()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_BlockingTime();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.Properties#getExecutionTime <em>Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Time</em>'.
	 * @see org.polarsys.time4sys.trace.Properties#getExecutionTime()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_ExecutionTime();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.Properties#getRemainingTime <em>Remaining Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Time</em>'.
	 * @see org.polarsys.time4sys.trace.Properties#getRemainingTime()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_RemainingTime();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.Properties#getResponseTime <em>Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Time</em>'.
	 * @see org.polarsys.time4sys.trace.Properties#getResponseTime()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_ResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.Properties#getAbsoluteDeadline <em>Absolute Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Deadline</em>'.
	 * @see org.polarsys.time4sys.trace.Properties#getAbsoluteDeadline()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_AbsoluteDeadline();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.Properties#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.polarsys.time4sys.trace.Properties#getIndex()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Index();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.trace.ValueChangeEvent <em>Value Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Change Event</em>'.
	 * @see org.polarsys.time4sys.trace.ValueChangeEvent
	 * @generated
	 */
	EClass getValueChangeEvent();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.trace.ValueChangeEvent#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.polarsys.time4sys.trace.ValueChangeEvent#getProperty()
	 * @see #getValueChangeEvent()
	 * @generated
	 */
	EReference getValueChangeEvent_Property();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.trace.ValueChangeEvent#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.polarsys.time4sys.trace.ValueChangeEvent#getObject()
	 * @see #getValueChangeEvent()
	 * @generated
	 */
	EReference getValueChangeEvent_Object();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.trace.ObjectValueChangeEvent <em>Object Value Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Value Change Event</em>'.
	 * @see org.polarsys.time4sys.trace.ObjectValueChangeEvent
	 * @generated
	 */
	EClass getObjectValueChangeEvent();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.trace.ObjectValueChangeEvent#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.polarsys.time4sys.trace.ObjectValueChangeEvent#getValue()
	 * @see #getObjectValueChangeEvent()
	 * @generated
	 */
	EReference getObjectValueChangeEvent_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.trace.DurationValueChangeEvent <em>Duration Value Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration Value Change Event</em>'.
	 * @see org.polarsys.time4sys.trace.DurationValueChangeEvent
	 * @generated
	 */
	EClass getDurationValueChangeEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.DurationValueChangeEvent#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.trace.DurationValueChangeEvent#getValue()
	 * @see #getDurationValueChangeEvent()
	 * @generated
	 */
	EAttribute getDurationValueChangeEvent_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.trace.DataSizeValueChangeEvent <em>Data Size Value Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Size Value Change Event</em>'.
	 * @see org.polarsys.time4sys.trace.DataSizeValueChangeEvent
	 * @generated
	 */
	EClass getDataSizeValueChangeEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.DataSizeValueChangeEvent#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.trace.DataSizeValueChangeEvent#getValue()
	 * @see #getDataSizeValueChangeEvent()
	 * @generated
	 */
	EAttribute getDataSizeValueChangeEvent_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.trace.NumberValueChangeEvent <em>Number Value Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Value Change Event</em>'.
	 * @see org.polarsys.time4sys.trace.NumberValueChangeEvent
	 * @generated
	 */
	EClass getNumberValueChangeEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.trace.NumberValueChangeEvent#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.trace.NumberValueChangeEvent#getValue()
	 * @see #getNumberValueChangeEvent()
	 * @generated
	 */
	EAttribute getNumberValueChangeEvent_Value();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.trace.SchedulingEventKind <em>Scheduling Event Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduling Event Kind</em>'.
	 * @see org.polarsys.time4sys.trace.SchedulingEventKind
	 * @generated
	 */
	EEnum getSchedulingEventKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.trace.ResourceEventKind <em>Resource Event Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Event Kind</em>'.
	 * @see org.polarsys.time4sys.trace.ResourceEventKind
	 * @generated
	 */
	EEnum getResourceEventKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.trace.MessageEventKind <em>Message Event Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Event Kind</em>'.
	 * @see org.polarsys.time4sys.trace.MessageEventKind
	 * @generated
	 */
	EEnum getMessageEventKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.trace.SliceKind <em>Slice Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Slice Kind</em>'.
	 * @see org.polarsys.time4sys.trace.SliceKind
	 * @generated
	 */
	EEnum getSliceKind();

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
	 * Returns the meta object for data type '{@link java.lang.Number <em>ENumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENumber</em>'.
	 * @see java.lang.Number
	 * @model instanceClass="java.lang.Number"
	 * @generated
	 */
	EDataType getENumber();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.time4sys.marte.nfp.DataSize <em>NFP Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>NFP Data Size</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize
	 * @model instanceClass="org.polarsys.time4sys.marte.nfp.DataSize"
	 * @generated
	 */
	EDataType getNFP_DataSize();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceFactory getTraceFactory();

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
		 * The meta object literal for the '{@link org.polarsys.time4sys.trace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.trace.impl.TraceImpl
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__EVENTS = eINSTANCE.getTrace_Events();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__RANGE = eINSTANCE.getTrace_Range();

		/**
		 * The meta object literal for the '<em><b>Slices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__SLICES = eINSTANCE.getTrace_Slices();

		/**
		 * The meta object literal for the '<em><b>Host Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__HOST_ID = eINSTANCE.getTrace_HostId();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__PRECISION = eINSTANCE.getTrace_Precision();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.trace.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.trace.impl.EventImpl
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TIMESTAMP = eINSTANCE.getEvent_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__TRACE = eINSTANCE.getEvent_Trace();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ABOUT = eINSTANCE.getEvent_About();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.trace.impl.ResourceEventImpl <em>Resource Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.trace.impl.ResourceEventImpl
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getResourceEvent()
		 * @generated
		 */
		EClass RESOURCE_EVENT = eINSTANCE.getResourceEvent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_EVENT__KIND = eINSTANCE.getResourceEvent_Kind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.trace.impl.SchedulingEventImpl <em>Scheduling Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.trace.impl.SchedulingEventImpl
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getSchedulingEvent()
		 * @generated
		 */
		EClass SCHEDULING_EVENT = eINSTANCE.getSchedulingEvent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_EVENT__KIND = eINSTANCE.getSchedulingEvent_Kind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.trace.impl.MessageEventImpl <em>Message Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.trace.impl.MessageEventImpl
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getMessageEvent()
		 * @generated
		 */
		EClass MESSAGE_EVENT = eINSTANCE.getMessageEvent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_EVENT__KIND = eINSTANCE.getMessageEvent_Kind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.trace.impl.SliceImpl <em>Slice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.trace.impl.SliceImpl
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getSlice()
		 * @generated
		 */
		EClass SLICE = eINSTANCE.getSlice();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICE__EVENTS = eINSTANCE.getSlice_Events();

		/**
		 * The meta object literal for the '<em><b>Owned Sub Slices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICE__OWNED_SUB_SLICES = eINSTANCE.getSlice_OwnedSubSlices();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICE__PARENT = eINSTANCE.getSlice_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICE__NAME = eINSTANCE.getSlice_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICE__KIND = eINSTANCE.getSlice_Kind();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICE__PROPERTIES = eINSTANCE.getSlice_Properties();

		/**
		 * The meta object literal for the '<em><b>Sub Slices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICE__SUB_SLICES = eINSTANCE.getSlice_SubSlices();

		/**
		 * The meta object literal for the '<em><b>Kind Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICE__KIND_LABEL = eINSTANCE.getSlice_KindLabel();

		/**
		 * The meta object literal for the '<em><b>Get Hierarchical Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLICE___GET_HIERARCHICAL_NAME__STRING = eINSTANCE.getSlice__GetHierarchicalName__String();

		/**
		 * The meta object literal for the '<em><b>Get Aggregated Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLICE___GET_AGGREGATED_EVENTS = eINSTANCE.getSlice__GetAggregatedEvents();

		/**
		 * The meta object literal for the '<em><b>Get Latest Timestamp</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLICE___GET_LATEST_TIMESTAMP = eINSTANCE.getSlice__GetLatestTimestamp();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.trace.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.trace.impl.PropertiesImpl
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__RANGE = eINSTANCE.getProperties_Range();

		/**
		 * The meta object literal for the '<em><b>Blocking Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__BLOCKING_TIME = eINSTANCE.getProperties_BlockingTime();

		/**
		 * The meta object literal for the '<em><b>Execution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__EXECUTION_TIME = eINSTANCE.getProperties_ExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Remaining Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__REMAINING_TIME = eINSTANCE.getProperties_RemainingTime();

		/**
		 * The meta object literal for the '<em><b>Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__RESPONSE_TIME = eINSTANCE.getProperties_ResponseTime();

		/**
		 * The meta object literal for the '<em><b>Absolute Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__ABSOLUTE_DEADLINE = eINSTANCE.getProperties_AbsoluteDeadline();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__INDEX = eINSTANCE.getProperties_Index();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.trace.impl.ValueChangeEventImpl <em>Value Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.trace.impl.ValueChangeEventImpl
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getValueChangeEvent()
		 * @generated
		 */
		EClass VALUE_CHANGE_EVENT = eINSTANCE.getValueChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_CHANGE_EVENT__PROPERTY = eINSTANCE.getValueChangeEvent_Property();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_CHANGE_EVENT__OBJECT = eINSTANCE.getValueChangeEvent_Object();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.trace.impl.ObjectValueChangeEventImpl <em>Object Value Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.trace.impl.ObjectValueChangeEventImpl
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getObjectValueChangeEvent()
		 * @generated
		 */
		EClass OBJECT_VALUE_CHANGE_EVENT = eINSTANCE.getObjectValueChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VALUE_CHANGE_EVENT__VALUE = eINSTANCE.getObjectValueChangeEvent_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.trace.impl.DurationValueChangeEventImpl <em>Duration Value Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.trace.impl.DurationValueChangeEventImpl
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getDurationValueChangeEvent()
		 * @generated
		 */
		EClass DURATION_VALUE_CHANGE_EVENT = eINSTANCE.getDurationValueChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION_VALUE_CHANGE_EVENT__VALUE = eINSTANCE.getDurationValueChangeEvent_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.trace.impl.DataSizeValueChangeEventImpl <em>Data Size Value Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.trace.impl.DataSizeValueChangeEventImpl
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getDataSizeValueChangeEvent()
		 * @generated
		 */
		EClass DATA_SIZE_VALUE_CHANGE_EVENT = eINSTANCE.getDataSizeValueChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SIZE_VALUE_CHANGE_EVENT__VALUE = eINSTANCE.getDataSizeValueChangeEvent_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.trace.impl.NumberValueChangeEventImpl <em>Number Value Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.trace.impl.NumberValueChangeEventImpl
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getNumberValueChangeEvent()
		 * @generated
		 */
		EClass NUMBER_VALUE_CHANGE_EVENT = eINSTANCE.getNumberValueChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_VALUE_CHANGE_EVENT__VALUE = eINSTANCE.getNumberValueChangeEvent_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.trace.SchedulingEventKind <em>Scheduling Event Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.trace.SchedulingEventKind
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getSchedulingEventKind()
		 * @generated
		 */
		EEnum SCHEDULING_EVENT_KIND = eINSTANCE.getSchedulingEventKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.trace.ResourceEventKind <em>Resource Event Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.trace.ResourceEventKind
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getResourceEventKind()
		 * @generated
		 */
		EEnum RESOURCE_EVENT_KIND = eINSTANCE.getResourceEventKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.trace.MessageEventKind <em>Message Event Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.trace.MessageEventKind
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getMessageEventKind()
		 * @generated
		 */
		EEnum MESSAGE_EVENT_KIND = eINSTANCE.getMessageEventKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.trace.SliceKind <em>Slice Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.trace.SliceKind
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getSliceKind()
		 * @generated
		 */
		EEnum SLICE_KIND = eINSTANCE.getSliceKind();

		/**
		 * The meta object literal for the '<em>NFP Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.Duration
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getNFP_Duration()
		 * @generated
		 */
		EDataType NFP_DURATION = eINSTANCE.getNFP_Duration();

		/**
		 * The meta object literal for the '<em>NFP Time Interval</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.TimeInterval
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getNFP_TimeInterval()
		 * @generated
		 */
		EDataType NFP_TIME_INTERVAL = eINSTANCE.getNFP_TimeInterval();

		/**
		 * The meta object literal for the '<em>ENumber</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Number
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getENumber()
		 * @generated
		 */
		EDataType ENUMBER = eINSTANCE.getENumber();

		/**
		 * The meta object literal for the '<em>NFP Data Size</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.DataSize
		 * @see org.polarsys.time4sys.trace.impl.TracePackageImpl#getNFP_DataSize()
		 * @generated
		 */
		EDataType NFP_DATA_SIZE = eINSTANCE.getNFP_DataSize();

	}

} //TracePackage
