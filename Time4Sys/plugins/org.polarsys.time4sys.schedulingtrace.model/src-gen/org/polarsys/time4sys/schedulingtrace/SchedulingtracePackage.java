/**
 */
package org.polarsys.time4sys.schedulingtrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.time4sys.trace.TracePackage;

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
 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtraceFactory
 * @model kind="package"
 * @generated
 */
public interface SchedulingtracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schedulingtrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/schedulingtrace/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "schedulingtrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulingtracePackage eINSTANCE = org.polarsys.time4sys.schedulingtrace.impl.SchedulingtracePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.schedulingtrace.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.schedulingtrace.impl.ProcessorImpl
	 * @see org.polarsys.time4sys.schedulingtrace.impl.SchedulingtracePackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__EANNOTATIONS = TracePackage.SLICE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__EVENTS = TracePackage.SLICE__EVENTS;

	/**
	 * The feature id for the '<em><b>Owned Sub Slices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__OWNED_SUB_SLICES = TracePackage.SLICE__OWNED_SUB_SLICES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PARENT = TracePackage.SLICE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = TracePackage.SLICE__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__KIND = TracePackage.SLICE__KIND;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PROPERTIES = TracePackage.SLICE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sub Slices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__SUB_SLICES = TracePackage.SLICE__SUB_SLICES;

	/**
	 * The feature id for the '<em><b>Kind Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__KIND_LABEL = TracePackage.SLICE__KIND_LABEL;

	/**
	 * The feature id for the '<em><b>Tasktraces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__TASKTRACES = TracePackage.SLICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PARTITIONS = TracePackage.SLICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hardware Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__HARDWARE_RESOURCE = TracePackage.SLICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Job With Max RT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__JOB_WITH_MAX_RT = TracePackage.SLICE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = TracePackage.SLICE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR___GET_EANNOTATION__STRING = TracePackage.SLICE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Hierarchical Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR___GET_HIERARCHICAL_NAME__STRING = TracePackage.SLICE___GET_HIERARCHICAL_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Aggregated Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR___GET_AGGREGATED_EVENTS = TracePackage.SLICE___GET_AGGREGATED_EVENTS;

	/**
	 * The operation id for the '<em>Get Latest Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR___GET_LATEST_TIMESTAMP = TracePackage.SLICE___GET_LATEST_TIMESTAMP;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = TracePackage.SLICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.schedulingtrace.impl.SchedulingTraceImpl <em>Scheduling Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.schedulingtrace.impl.SchedulingTraceImpl
	 * @see org.polarsys.time4sys.schedulingtrace.impl.SchedulingtracePackageImpl#getSchedulingTrace()
	 * @generated
	 */
	int SCHEDULING_TRACE = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_TRACE__EANNOTATIONS = TracePackage.TRACE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_TRACE__EVENTS = TracePackage.TRACE__EVENTS;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_TRACE__RANGE = TracePackage.TRACE__RANGE;

	/**
	 * The feature id for the '<em><b>Slices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_TRACE__SLICES = TracePackage.TRACE__SLICES;

	/**
	 * The feature id for the '<em><b>Host Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_TRACE__HOST_ID = TracePackage.TRACE__HOST_ID;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_TRACE__PRECISION = TracePackage.TRACE__PRECISION;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_TRACE__PROCESSORS = TracePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job With Max RT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_TRACE__JOB_WITH_MAX_RT = TracePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scheduling Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_TRACE_FEATURE_COUNT = TracePackage.TRACE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_TRACE___GET_EANNOTATION__STRING = TracePackage.TRACE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Scheduling Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_TRACE_OPERATION_COUNT = TracePackage.TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.schedulingtrace.impl.TaskTraceImpl <em>Task Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.schedulingtrace.impl.TaskTraceImpl
	 * @see org.polarsys.time4sys.schedulingtrace.impl.SchedulingtracePackageImpl#getTaskTrace()
	 * @generated
	 */
	int TASK_TRACE = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE__EANNOTATIONS = TracePackage.SLICE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE__EVENTS = TracePackage.SLICE__EVENTS;

	/**
	 * The feature id for the '<em><b>Owned Sub Slices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE__OWNED_SUB_SLICES = TracePackage.SLICE__OWNED_SUB_SLICES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE__PARENT = TracePackage.SLICE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE__NAME = TracePackage.SLICE__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE__KIND = TracePackage.SLICE__KIND;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE__PROPERTIES = TracePackage.SLICE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sub Slices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE__SUB_SLICES = TracePackage.SLICE__SUB_SLICES;

	/**
	 * The feature id for the '<em><b>Kind Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE__KIND_LABEL = TracePackage.SLICE__KIND_LABEL;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE__JOBS = TracePackage.SLICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job With Max RT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE__JOB_WITH_MAX_RT = TracePackage.SLICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE_FEATURE_COUNT = TracePackage.SLICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE___GET_EANNOTATION__STRING = TracePackage.SLICE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Hierarchical Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE___GET_HIERARCHICAL_NAME__STRING = TracePackage.SLICE___GET_HIERARCHICAL_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Aggregated Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE___GET_AGGREGATED_EVENTS = TracePackage.SLICE___GET_AGGREGATED_EVENTS;

	/**
	 * The operation id for the '<em>Get Latest Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE___GET_LATEST_TIMESTAMP = TracePackage.SLICE___GET_LATEST_TIMESTAMP;

	/**
	 * The number of operations of the '<em>Task Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACE_OPERATION_COUNT = TracePackage.SLICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.schedulingtrace.impl.PartitionImpl <em>Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.schedulingtrace.impl.PartitionImpl
	 * @see org.polarsys.time4sys.schedulingtrace.impl.SchedulingtracePackageImpl#getPartition()
	 * @generated
	 */
	int PARTITION = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__EANNOTATIONS = TracePackage.SLICE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__EVENTS = TracePackage.SLICE__EVENTS;

	/**
	 * The feature id for the '<em><b>Owned Sub Slices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__OWNED_SUB_SLICES = TracePackage.SLICE__OWNED_SUB_SLICES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__PARENT = TracePackage.SLICE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__NAME = TracePackage.SLICE__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__KIND = TracePackage.SLICE__KIND;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__PROPERTIES = TracePackage.SLICE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sub Slices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__SUB_SLICES = TracePackage.SLICE__SUB_SLICES;

	/**
	 * The feature id for the '<em><b>Kind Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__KIND_LABEL = TracePackage.SLICE__KIND_LABEL;

	/**
	 * The feature id for the '<em><b>Tasktraces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__TASKTRACES = TracePackage.SLICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schedulable Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__SCHEDULABLE_RESOURCE = TracePackage.SLICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Job With Max RT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__JOB_WITH_MAX_RT = TracePackage.SLICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_FEATURE_COUNT = TracePackage.SLICE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION___GET_EANNOTATION__STRING = TracePackage.SLICE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Hierarchical Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION___GET_HIERARCHICAL_NAME__STRING = TracePackage.SLICE___GET_HIERARCHICAL_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Aggregated Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION___GET_AGGREGATED_EVENTS = TracePackage.SLICE___GET_AGGREGATED_EVENTS;

	/**
	 * The operation id for the '<em>Get Latest Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION___GET_LATEST_TIMESTAMP = TracePackage.SLICE___GET_LATEST_TIMESTAMP;

	/**
	 * The number of operations of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATION_COUNT = TracePackage.SLICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.schedulingtrace.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.schedulingtrace.impl.JobImpl
	 * @see org.polarsys.time4sys.schedulingtrace.impl.SchedulingtracePackageImpl#getJob()
	 * @generated
	 */
	int JOB = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__EANNOTATIONS = TracePackage.SLICE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__EVENTS = TracePackage.SLICE__EVENTS;

	/**
	 * The feature id for the '<em><b>Owned Sub Slices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__OWNED_SUB_SLICES = TracePackage.SLICE__OWNED_SUB_SLICES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PARENT = TracePackage.SLICE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = TracePackage.SLICE__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__KIND = TracePackage.SLICE__KIND;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PROPERTIES = TracePackage.SLICE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sub Slices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SUB_SLICES = TracePackage.SLICE__SUB_SLICES;

	/**
	 * The feature id for the '<em><b>Kind Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__KIND_LABEL = TracePackage.SLICE__KIND_LABEL;

	/**
	 * The feature id for the '<em><b>Tasktrace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TASKTRACE = TracePackage.SLICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__FUNCTION_INSTANCES = TracePackage.SLICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schedulable Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SCHEDULABLE_RESOURCE = TracePackage.SLICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ID = TracePackage.SLICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>List Preempted By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__LIST_PREEMPTED_BY = TracePackage.SLICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = TracePackage.SLICE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___GET_EANNOTATION__STRING = TracePackage.SLICE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Hierarchical Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___GET_HIERARCHICAL_NAME__STRING = TracePackage.SLICE___GET_HIERARCHICAL_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Aggregated Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___GET_AGGREGATED_EVENTS = TracePackage.SLICE___GET_AGGREGATED_EVENTS;

	/**
	 * The operation id for the '<em>Get Latest Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___GET_LATEST_TIMESTAMP = TracePackage.SLICE___GET_LATEST_TIMESTAMP;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = TracePackage.SLICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.schedulingtrace.impl.FunctionInstanceImpl <em>Function Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.schedulingtrace.impl.FunctionInstanceImpl
	 * @see org.polarsys.time4sys.schedulingtrace.impl.SchedulingtracePackageImpl#getFunctionInstance()
	 * @generated
	 */
	int FUNCTION_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__EANNOTATIONS = TracePackage.SLICE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__EVENTS = TracePackage.SLICE__EVENTS;

	/**
	 * The feature id for the '<em><b>Owned Sub Slices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__OWNED_SUB_SLICES = TracePackage.SLICE__OWNED_SUB_SLICES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__PARENT = TracePackage.SLICE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__NAME = TracePackage.SLICE__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__KIND = TracePackage.SLICE__KIND;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__PROPERTIES = TracePackage.SLICE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sub Slices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__SUB_SLICES = TracePackage.SLICE__SUB_SLICES;

	/**
	 * The feature id for the '<em><b>Kind Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__KIND_LABEL = TracePackage.SLICE__KIND_LABEL;

	/**
	 * The feature id for the '<em><b>Job</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__JOB = TracePackage.SLICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__STEP = TracePackage.SLICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__ID = TracePackage.SLICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_FEATURE_COUNT = TracePackage.SLICE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE___GET_EANNOTATION__STRING = TracePackage.SLICE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Hierarchical Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE___GET_HIERARCHICAL_NAME__STRING = TracePackage.SLICE___GET_HIERARCHICAL_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Aggregated Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE___GET_AGGREGATED_EVENTS = TracePackage.SLICE___GET_AGGREGATED_EVENTS;

	/**
	 * The operation id for the '<em>Get Latest Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE___GET_LATEST_TIMESTAMP = TracePackage.SLICE___GET_LATEST_TIMESTAMP;

	/**
	 * The number of operations of the '<em>Function Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_OPERATION_COUNT = TracePackage.SLICE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.schedulingtrace.impl.PreemptedByImpl <em>Preempted By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.schedulingtrace.impl.PreemptedByImpl
	 * @see org.polarsys.time4sys.schedulingtrace.impl.SchedulingtracePackageImpl#getPreemptedBy()
	 * @generated
	 */
	int PREEMPTED_BY = 6;

	/**
	 * The feature id for the '<em><b>Job</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREEMPTED_BY__JOB = 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREEMPTED_BY__TIME_STAMP = 1;

	/**
	 * The number of structural features of the '<em>Preempted By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREEMPTED_BY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Preempted By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREEMPTED_BY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.schedulingtrace.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.schedulingtrace.Processor#getTasktraces <em>Tasktraces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasktraces</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.Processor#getTasktraces()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Tasktraces();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.schedulingtrace.Processor#getPartitions <em>Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Partitions</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.Processor#getPartitions()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Partitions();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.schedulingtrace.Processor#getHardwareResource <em>Hardware Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hardware Resource</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.Processor#getHardwareResource()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_HardwareResource();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.schedulingtrace.Processor#getJobWithMaxRT <em>Job With Max RT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job With Max RT</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.Processor#getJobWithMaxRT()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_JobWithMaxRT();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.schedulingtrace.SchedulingTrace <em>Scheduling Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Trace</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingTrace
	 * @generated
	 */
	EClass getSchedulingTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.schedulingtrace.SchedulingTrace#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processors</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingTrace#getProcessors()
	 * @see #getSchedulingTrace()
	 * @generated
	 */
	EReference getSchedulingTrace_Processors();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.schedulingtrace.SchedulingTrace#getJobWithMaxRT <em>Job With Max RT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job With Max RT</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingTrace#getJobWithMaxRT()
	 * @see #getSchedulingTrace()
	 * @generated
	 */
	EReference getSchedulingTrace_JobWithMaxRT();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.schedulingtrace.TaskTrace <em>Task Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Trace</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.TaskTrace
	 * @generated
	 */
	EClass getTaskTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.schedulingtrace.TaskTrace#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.TaskTrace#getJobs()
	 * @see #getTaskTrace()
	 * @generated
	 */
	EReference getTaskTrace_Jobs();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.schedulingtrace.TaskTrace#getJobWithMaxRT <em>Job With Max RT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job With Max RT</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.TaskTrace#getJobWithMaxRT()
	 * @see #getTaskTrace()
	 * @generated
	 */
	EReference getTaskTrace_JobWithMaxRT();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.schedulingtrace.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.Partition
	 * @generated
	 */
	EClass getPartition();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.schedulingtrace.Partition#getTasktraces <em>Tasktraces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasktraces</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.Partition#getTasktraces()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Tasktraces();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.schedulingtrace.Partition#getSchedulableResource <em>Schedulable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schedulable Resource</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.Partition#getSchedulableResource()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_SchedulableResource();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.schedulingtrace.Partition#getJobWithMaxRT <em>Job With Max RT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job With Max RT</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.Partition#getJobWithMaxRT()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_JobWithMaxRT();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.schedulingtrace.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.schedulingtrace.Job#getTasktrace <em>Tasktrace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tasktrace</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.Job#getTasktrace()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Tasktrace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.schedulingtrace.Job#getFunctionInstances <em>Function Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Instances</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.Job#getFunctionInstances()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_FunctionInstances();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.schedulingtrace.Job#getSchedulableResource <em>Schedulable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schedulable Resource</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.Job#getSchedulableResource()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_SchedulableResource();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.schedulingtrace.Job#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.Job#getId()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.schedulingtrace.Job#getListPreemptedBy <em>List Preempted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Preempted By</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.Job#getListPreemptedBy()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_ListPreemptedBy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.schedulingtrace.FunctionInstance <em>Function Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Instance</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.FunctionInstance
	 * @generated
	 */
	EClass getFunctionInstance();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.schedulingtrace.FunctionInstance#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Job</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.FunctionInstance#getJob()
	 * @see #getFunctionInstance()
	 * @generated
	 */
	EReference getFunctionInstance_Job();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.schedulingtrace.FunctionInstance#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.FunctionInstance#getStep()
	 * @see #getFunctionInstance()
	 * @generated
	 */
	EReference getFunctionInstance_Step();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.schedulingtrace.FunctionInstance#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.FunctionInstance#getId()
	 * @see #getFunctionInstance()
	 * @generated
	 */
	EAttribute getFunctionInstance_Id();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.schedulingtrace.PreemptedBy <em>Preempted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preempted By</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.PreemptedBy
	 * @generated
	 */
	EClass getPreemptedBy();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.schedulingtrace.PreemptedBy#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.PreemptedBy#getJob()
	 * @see #getPreemptedBy()
	 * @generated
	 */
	EReference getPreemptedBy_Job();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.schedulingtrace.PreemptedBy#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see org.polarsys.time4sys.schedulingtrace.PreemptedBy#getTimeStamp()
	 * @see #getPreemptedBy()
	 * @generated
	 */
	EAttribute getPreemptedBy_TimeStamp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchedulingtraceFactory getSchedulingtraceFactory();

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
		 * The meta object literal for the '{@link org.polarsys.time4sys.schedulingtrace.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.schedulingtrace.impl.ProcessorImpl
		 * @see org.polarsys.time4sys.schedulingtrace.impl.SchedulingtracePackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Tasktraces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__TASKTRACES = eINSTANCE.getProcessor_Tasktraces();

		/**
		 * The meta object literal for the '<em><b>Partitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__PARTITIONS = eINSTANCE.getProcessor_Partitions();

		/**
		 * The meta object literal for the '<em><b>Hardware Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__HARDWARE_RESOURCE = eINSTANCE.getProcessor_HardwareResource();

		/**
		 * The meta object literal for the '<em><b>Job With Max RT</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__JOB_WITH_MAX_RT = eINSTANCE.getProcessor_JobWithMaxRT();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.schedulingtrace.impl.SchedulingTraceImpl <em>Scheduling Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.schedulingtrace.impl.SchedulingTraceImpl
		 * @see org.polarsys.time4sys.schedulingtrace.impl.SchedulingtracePackageImpl#getSchedulingTrace()
		 * @generated
		 */
		EClass SCHEDULING_TRACE = eINSTANCE.getSchedulingTrace();

		/**
		 * The meta object literal for the '<em><b>Processors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_TRACE__PROCESSORS = eINSTANCE.getSchedulingTrace_Processors();

		/**
		 * The meta object literal for the '<em><b>Job With Max RT</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_TRACE__JOB_WITH_MAX_RT = eINSTANCE.getSchedulingTrace_JobWithMaxRT();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.schedulingtrace.impl.TaskTraceImpl <em>Task Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.schedulingtrace.impl.TaskTraceImpl
		 * @see org.polarsys.time4sys.schedulingtrace.impl.SchedulingtracePackageImpl#getTaskTrace()
		 * @generated
		 */
		EClass TASK_TRACE = eINSTANCE.getTaskTrace();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TRACE__JOBS = eINSTANCE.getTaskTrace_Jobs();

		/**
		 * The meta object literal for the '<em><b>Job With Max RT</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TRACE__JOB_WITH_MAX_RT = eINSTANCE.getTaskTrace_JobWithMaxRT();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.schedulingtrace.impl.PartitionImpl <em>Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.schedulingtrace.impl.PartitionImpl
		 * @see org.polarsys.time4sys.schedulingtrace.impl.SchedulingtracePackageImpl#getPartition()
		 * @generated
		 */
		EClass PARTITION = eINSTANCE.getPartition();

		/**
		 * The meta object literal for the '<em><b>Tasktraces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__TASKTRACES = eINSTANCE.getPartition_Tasktraces();

		/**
		 * The meta object literal for the '<em><b>Schedulable Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__SCHEDULABLE_RESOURCE = eINSTANCE.getPartition_SchedulableResource();

		/**
		 * The meta object literal for the '<em><b>Job With Max RT</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__JOB_WITH_MAX_RT = eINSTANCE.getPartition_JobWithMaxRT();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.schedulingtrace.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.schedulingtrace.impl.JobImpl
		 * @see org.polarsys.time4sys.schedulingtrace.impl.SchedulingtracePackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Tasktrace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__TASKTRACE = eINSTANCE.getJob_Tasktrace();

		/**
		 * The meta object literal for the '<em><b>Function Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__FUNCTION_INSTANCES = eINSTANCE.getJob_FunctionInstances();

		/**
		 * The meta object literal for the '<em><b>Schedulable Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__SCHEDULABLE_RESOURCE = eINSTANCE.getJob_SchedulableResource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__ID = eINSTANCE.getJob_Id();

		/**
		 * The meta object literal for the '<em><b>List Preempted By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__LIST_PREEMPTED_BY = eINSTANCE.getJob_ListPreemptedBy();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.schedulingtrace.impl.FunctionInstanceImpl <em>Function Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.schedulingtrace.impl.FunctionInstanceImpl
		 * @see org.polarsys.time4sys.schedulingtrace.impl.SchedulingtracePackageImpl#getFunctionInstance()
		 * @generated
		 */
		EClass FUNCTION_INSTANCE = eINSTANCE.getFunctionInstance();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INSTANCE__JOB = eINSTANCE.getFunctionInstance_Job();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INSTANCE__STEP = eINSTANCE.getFunctionInstance_Step();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_INSTANCE__ID = eINSTANCE.getFunctionInstance_Id();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.schedulingtrace.impl.PreemptedByImpl <em>Preempted By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.schedulingtrace.impl.PreemptedByImpl
		 * @see org.polarsys.time4sys.schedulingtrace.impl.SchedulingtracePackageImpl#getPreemptedBy()
		 * @generated
		 */
		EClass PREEMPTED_BY = eINSTANCE.getPreemptedBy();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREEMPTED_BY__JOB = eINSTANCE.getPreemptedBy_Job();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREEMPTED_BY__TIME_STAMP = eINSTANCE.getPreemptedBy_TimeStamp();

	}

} //SchedulingtracePackage
