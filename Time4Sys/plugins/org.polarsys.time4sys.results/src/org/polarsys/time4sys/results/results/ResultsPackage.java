/**
 */
package org.polarsys.time4sys.results.results;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage;

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
 * @see org.polarsys.time4sys.results.results.ResultsFactory
 * @model kind="package"
 * @generated
 */
public interface ResultsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "results";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/results/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "results";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultsPackage eINSTANCE = org.polarsys.time4sys.results.results.impl.ResultsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.ResultSetContainerImpl <em>Result Set Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.ResultSetContainerImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getResultSetContainer()
	 * @generated
	 */
	int RESULT_SET_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_SET_CONTAINER__EANNOTATIONS = CoreElementsPackage.MODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Result Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_SET_CONTAINER__RESULT_SET = CoreElementsPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Design Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_SET_CONTAINER__DESIGN_MODEL = CoreElementsPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Result Set Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_SET_CONTAINER_FEATURE_COUNT = CoreElementsPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_SET_CONTAINER___GET_EANNOTATION__STRING = CoreElementsPackage.MODEL_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Result Set Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_SET_CONTAINER_OPERATION_COUNT = CoreElementsPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.AnalysisResultSetImpl <em>Analysis Result Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.AnalysisResultSetImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getAnalysisResultSet()
	 * @generated
	 */
	int ANALYSIS_RESULT_SET = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_SET__EANNOTATIONS = CoreElementsPackage.NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_SET__NAME = CoreElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tool Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_SET__TOOL_NAME = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_SET__DATE = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_SET__RESULTS = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_SET__MAPPING = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nb Of Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_SET__NB_OF_ITERATIONS = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has Converged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_SET__HAS_CONVERGED = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Analysis Result Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_SET_FEATURE_COUNT = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_SET___GET_EANNOTATION__STRING = CoreElementsPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Analysis Result Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_SET_OPERATION_COUNT = CoreElementsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.TaskChainResultImpl <em>Task Chain Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.TaskChainResultImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getTaskChainResult()
	 * @generated
	 */
	int TASK_CHAIN_RESULT = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT__EANNOTATIONS = CoreElementsPackage.NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT__NAME = CoreElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT__SUB_RESULTS = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT__LOAD = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT__PARAMETER = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT__EVENT = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Slack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT__SLACK = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT__PRIORITY = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nb Of Suspension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT__NB_OF_SUSPENSION = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT__DEADLINE = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>BCET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT__BCET = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>WCET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT__WCET = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT__RESOURCE = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Slice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT__SLICE = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Scheduling Trace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT__SCHEDULING_TRACE = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Task Chain Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT_FEATURE_COUNT = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT___GET_EANNOTATION__STRING = CoreElementsPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Task Chain Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CHAIN_RESULT_OPERATION_COUNT = CoreElementsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.SimulationResultImpl <em>Simulation Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.SimulationResultImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getSimulationResult()
	 * @generated
	 */
	int SIMULATION_RESULT = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__EANNOTATIONS = CoreElementsPackage.NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__NAME = CoreElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tool Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__TOOL_NAME = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__DATE = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__RESULTS = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__MAPPING = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Simulation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT_FEATURE_COUNT = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT___GET_EANNOTATION__STRING = CoreElementsPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Simulation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT_OPERATION_COUNT = CoreElementsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.AbstractResultReferenceImpl <em>Abstract Result Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.AbstractResultReferenceImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getAbstractResultReference()
	 * @generated
	 */
	int ABSTRACT_RESULT_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_REFERENCE__EANNOTATIONS = CoreElementsPackage.NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_REFERENCE__NAME = CoreElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_REFERENCE__SUB_RESULTS = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Result Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_REFERENCE_FEATURE_COUNT = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_REFERENCE___GET_EANNOTATION__STRING = CoreElementsPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Abstract Result Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_REFERENCE_OPERATION_COUNT = CoreElementsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.AbstractResultImpl <em>Abstract Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.AbstractResultImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getAbstractResult()
	 * @generated
	 */
	int ABSTRACT_RESULT = 21;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.AtomicResultImpl <em>Atomic Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.AtomicResultImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getAtomicResult()
	 * @generated
	 */
	int ATOMIC_RESULT = 15;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.ContainedResultImpl <em>Contained Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.ContainedResultImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getContainedResult()
	 * @generated
	 */
	int CONTAINED_RESULT = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_RESULT__EANNOTATIONS = ABSTRACT_RESULT_REFERENCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_RESULT__NAME = ABSTRACT_RESULT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Sub Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_RESULT__SUB_RESULTS = ABSTRACT_RESULT_REFERENCE__SUB_RESULTS;

	/**
	 * The number of structural features of the '<em>Contained Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_RESULT_FEATURE_COUNT = ABSTRACT_RESULT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_RESULT___GET_EANNOTATION__STRING = ABSTRACT_RESULT_REFERENCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Contained Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_RESULT_OPERATION_COUNT = ABSTRACT_RESULT_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.ReferencedResultImpl <em>Referenced Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.ReferencedResultImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getReferencedResult()
	 * @generated
	 */
	int REFERENCED_RESULT = 6;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESULT__EANNOTATIONS = ABSTRACT_RESULT_REFERENCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESULT__NAME = ABSTRACT_RESULT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Sub Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESULT__SUB_RESULTS = ABSTRACT_RESULT_REFERENCE__SUB_RESULTS;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESULT__DATA = ABSTRACT_RESULT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Referenced Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESULT_FEATURE_COUNT = ABSTRACT_RESULT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESULT___GET_EANNOTATION__STRING = ABSTRACT_RESULT_REFERENCE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Referenced Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESULT_OPERATION_COUNT = ABSTRACT_RESULT_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT__EANNOTATIONS = CoreElementsPackage.NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT__NAME = CoreElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT__SUB_RESULTS = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_FEATURE_COUNT = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT___GET_EANNOTATION__STRING = CoreElementsPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Abstract Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_OPERATION_COUNT = CoreElementsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESULT__EANNOTATIONS = ABSTRACT_RESULT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESULT__NAME = ABSTRACT_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESULT__SUB_RESULTS = ABSTRACT_RESULT__SUB_RESULTS;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESULT__LOAD = ABSTRACT_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESULT__PARAMETER = ABSTRACT_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atomic Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESULT_FEATURE_COUNT = ABSTRACT_RESULT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESULT___GET_EANNOTATION__STRING = ABSTRACT_RESULT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Atomic Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESULT_OPERATION_COUNT = ABSTRACT_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.TaskResultImpl <em>Task Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.TaskResultImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getTaskResult()
	 * @generated
	 */
	int TASK_RESULT = 7;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT__EANNOTATIONS = ATOMIC_RESULT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT__NAME = ATOMIC_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT__SUB_RESULTS = ATOMIC_RESULT__SUB_RESULTS;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT__LOAD = ATOMIC_RESULT__LOAD;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT__PARAMETER = ATOMIC_RESULT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT__EVENT = ATOMIC_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT__SLACK = ATOMIC_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT__PRIORITY = ATOMIC_RESULT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nb Of Suspension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT__NB_OF_SUSPENSION = ATOMIC_RESULT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT__DEADLINE = ATOMIC_RESULT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>BCET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT__BCET = ATOMIC_RESULT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>WCET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT__WCET = ATOMIC_RESULT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Task Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT_FEATURE_COUNT = ATOMIC_RESULT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT___GET_EANNOTATION__STRING = ATOMIC_RESULT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Task Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT_OPERATION_COUNT = ATOMIC_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.EventImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 8;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__JITTER = 0;

	/**
	 * The feature id for the '<em><b>Min Dist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__MIN_DIST = 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OFFSET = 2;

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
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.SimplePeriodicEventImpl <em>Simple Periodic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.SimplePeriodicEventImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getSimplePeriodicEvent()
	 * @generated
	 */
	int SIMPLE_PERIODIC_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PERIODIC_EVENT__JITTER = EVENT__JITTER;

	/**
	 * The feature id for the '<em><b>Min Dist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PERIODIC_EVENT__MIN_DIST = EVENT__MIN_DIST;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PERIODIC_EVENT__OFFSET = EVENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PERIODIC_EVENT__PERIOD = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Periodic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PERIODIC_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Periodic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PERIODIC_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.SimpleSporadicEventImpl <em>Simple Sporadic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.SimpleSporadicEventImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getSimpleSporadicEvent()
	 * @generated
	 */
	int SIMPLE_SPORADIC_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SPORADIC_EVENT__JITTER = EVENT__JITTER;

	/**
	 * The feature id for the '<em><b>Min Dist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SPORADIC_EVENT__MIN_DIST = EVENT__MIN_DIST;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SPORADIC_EVENT__OFFSET = EVENT__OFFSET;

	/**
	 * The feature id for the '<em><b>DMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SPORADIC_EVENT__DMIN = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Sporadic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SPORADIC_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Sporadic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SPORADIC_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.OnceEventImpl <em>Once Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.OnceEventImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getOnceEvent()
	 * @generated
	 */
	int ONCE_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONCE_EVENT__JITTER = EVENT__JITTER;

	/**
	 * The feature id for the '<em><b>Min Dist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONCE_EVENT__MIN_DIST = EVENT__MIN_DIST;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONCE_EVENT__OFFSET = EVENT__OFFSET;

	/**
	 * The number of structural features of the '<em>Once Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONCE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Once Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONCE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.SlidingWindowEventImpl <em>Sliding Window Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.SlidingWindowEventImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getSlidingWindowEvent()
	 * @generated
	 */
	int SLIDING_WINDOW_EVENT = 12;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW_EVENT__JITTER = EVENT__JITTER;

	/**
	 * The feature id for the '<em><b>Min Dist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW_EVENT__MIN_DIST = EVENT__MIN_DIST;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW_EVENT__OFFSET = EVENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Nb Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW_EVENT__NB_EVENTS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW_EVENT__WINDOW_SIZE = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sliding Window Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sliding Window Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.TindellEventImpl <em>Tindell Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.TindellEventImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getTindellEvent()
	 * @generated
	 */
	int TINDELL_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINDELL_EVENT__JITTER = EVENT__JITTER;

	/**
	 * The feature id for the '<em><b>Min Dist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINDELL_EVENT__MIN_DIST = EVENT__MIN_DIST;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINDELL_EVENT__OFFSET = EVENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Burst Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINDELL_EVENT__BURST_SIZE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inner Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINDELL_EVENT__INNER_PERIOD = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outer Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINDELL_EVENT__OUTER_PERIOD = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tindell Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINDELL_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tindell Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINDELL_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.OffsetImpl <em>Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.OffsetImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getOffset()
	 * @generated
	 */
	int OFFSET = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.AbstractResultSetImpl <em>Abstract Result Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.AbstractResultSetImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getAbstractResultSet()
	 * @generated
	 */
	int ABSTRACT_RESULT_SET = 16;

	/**
	 * The feature id for the '<em><b>Tool Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_SET__TOOL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_SET__DATE = 1;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_SET__RESULTS = 2;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_SET__MAPPING = 3;

	/**
	 * The number of structural features of the '<em>Abstract Result Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_SET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Abstract Result Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.CustomTaskResultImpl <em>Custom Task Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.CustomTaskResultImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getCustomTaskResult()
	 * @generated
	 */
	int CUSTOM_TASK_RESULT = 17;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT__EANNOTATIONS = TASK_RESULT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT__NAME = TASK_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT__SUB_RESULTS = TASK_RESULT__SUB_RESULTS;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT__LOAD = TASK_RESULT__LOAD;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT__PARAMETER = TASK_RESULT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT__EVENT = TASK_RESULT__EVENT;

	/**
	 * The feature id for the '<em><b>Slack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT__SLACK = TASK_RESULT__SLACK;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT__PRIORITY = TASK_RESULT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Nb Of Suspension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT__NB_OF_SUSPENSION = TASK_RESULT__NB_OF_SUSPENSION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT__DEADLINE = TASK_RESULT__DEADLINE;

	/**
	 * The feature id for the '<em><b>BCET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT__BCET = TASK_RESULT__BCET;

	/**
	 * The feature id for the '<em><b>WCET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT__WCET = TASK_RESULT__WCET;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT__BUFFER_SIZE = TASK_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Busy Window Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT__BUSY_WINDOW_LENGTH = TASK_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Task Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT_FEATURE_COUNT = TASK_RESULT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT___GET_EANNOTATION__STRING = TASK_RESULT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Custom Task Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_RESULT_OPERATION_COUNT = TASK_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.ComputingResourceResultImpl <em>Computing Resource Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.ComputingResourceResultImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getComputingResourceResult()
	 * @generated
	 */
	int COMPUTING_RESOURCE_RESULT = 18;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_RESULT__EANNOTATIONS = ATOMIC_RESULT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_RESULT__NAME = ATOMIC_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_RESULT__SUB_RESULTS = ATOMIC_RESULT__SUB_RESULTS;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_RESULT__LOAD = ATOMIC_RESULT__LOAD;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_RESULT__PARAMETER = ATOMIC_RESULT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_RESULT__TYPE_NAME = ATOMIC_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Computing Resource Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_RESULT_FEATURE_COUNT = ATOMIC_RESULT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_RESULT___GET_EANNOTATION__STRING = ATOMIC_RESULT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Computing Resource Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_RESULT_OPERATION_COUNT = ATOMIC_RESULT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.SharedResourceResultImpl <em>Shared Resource Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.SharedResourceResultImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getSharedResourceResult()
	 * @generated
	 */
	int SHARED_RESOURCE_RESULT = 19;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_RESULT__EANNOTATIONS = ATOMIC_RESULT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_RESULT__NAME = ATOMIC_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_RESULT__SUB_RESULTS = ATOMIC_RESULT__SUB_RESULTS;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_RESULT__LOAD = ATOMIC_RESULT__LOAD;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_RESULT__PARAMETER = ATOMIC_RESULT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_RESULT__UTILIZATION = ATOMIC_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shared Resource Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_RESULT_FEATURE_COUNT = ATOMIC_RESULT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_RESULT___GET_EANNOTATION__STRING = ATOMIC_RESULT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Shared Resource Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_RESULT_OPERATION_COUNT = ATOMIC_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.results.results.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.results.results.impl.ParameterImpl
	 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 20;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EANNOTATIONS = CoreElementsPackage.NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = CoreElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_EANNOTATION__STRING = CoreElementsPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = CoreElementsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.ResultSetContainer <em>Result Set Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Set Container</em>'.
	 * @see org.polarsys.time4sys.results.results.ResultSetContainer
	 * @generated
	 */
	EClass getResultSetContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.results.results.ResultSetContainer#getResultSet <em>Result Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Set</em>'.
	 * @see org.polarsys.time4sys.results.results.ResultSetContainer#getResultSet()
	 * @see #getResultSetContainer()
	 * @generated
	 */
	EReference getResultSetContainer_ResultSet();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.results.results.ResultSetContainer#getDesignModel <em>Design Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Model</em>'.
	 * @see org.polarsys.time4sys.results.results.ResultSetContainer#getDesignModel()
	 * @see #getResultSetContainer()
	 * @generated
	 */
	EReference getResultSetContainer_DesignModel();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.AnalysisResultSet <em>Analysis Result Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Result Set</em>'.
	 * @see org.polarsys.time4sys.results.results.AnalysisResultSet
	 * @generated
	 */
	EClass getAnalysisResultSet();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.AnalysisResultSet#getNbOfIterations <em>Nb Of Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Of Iterations</em>'.
	 * @see org.polarsys.time4sys.results.results.AnalysisResultSet#getNbOfIterations()
	 * @see #getAnalysisResultSet()
	 * @generated
	 */
	EAttribute getAnalysisResultSet_NbOfIterations();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.AnalysisResultSet#isHasConverged <em>Has Converged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Converged</em>'.
	 * @see org.polarsys.time4sys.results.results.AnalysisResultSet#isHasConverged()
	 * @see #getAnalysisResultSet()
	 * @generated
	 */
	EAttribute getAnalysisResultSet_HasConverged();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.TaskChainResult <em>Task Chain Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Chain Result</em>'.
	 * @see org.polarsys.time4sys.results.results.TaskChainResult
	 * @generated
	 */
	EClass getTaskChainResult();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.results.results.TaskChainResult#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see org.polarsys.time4sys.results.results.TaskChainResult#getResource()
	 * @see #getTaskChainResult()
	 * @generated
	 */
	EReference getTaskChainResult_Resource();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.results.results.TaskChainResult#getSlice <em>Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slice</em>'.
	 * @see org.polarsys.time4sys.results.results.TaskChainResult#getSlice()
	 * @see #getTaskChainResult()
	 * @generated
	 */
	EReference getTaskChainResult_Slice();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.results.results.TaskChainResult#getSchedulingTrace <em>Scheduling Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scheduling Trace</em>'.
	 * @see org.polarsys.time4sys.results.results.TaskChainResult#getSchedulingTrace()
	 * @see #getTaskChainResult()
	 * @generated
	 */
	EReference getTaskChainResult_SchedulingTrace();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.SimulationResult <em>Simulation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Result</em>'.
	 * @see org.polarsys.time4sys.results.results.SimulationResult
	 * @generated
	 */
	EClass getSimulationResult();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.AbstractResultReference <em>Abstract Result Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Result Reference</em>'.
	 * @see org.polarsys.time4sys.results.results.AbstractResultReference
	 * @generated
	 */
	EClass getAbstractResultReference();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.AbstractResult <em>Abstract Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Result</em>'.
	 * @see org.polarsys.time4sys.results.results.AbstractResult
	 * @generated
	 */
	EClass getAbstractResult();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.results.results.AbstractResult#getSubResults <em>Sub Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Results</em>'.
	 * @see org.polarsys.time4sys.results.results.AbstractResult#getSubResults()
	 * @see #getAbstractResult()
	 * @generated
	 */
	EReference getAbstractResult_SubResults();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.ContainedResult <em>Contained Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained Result</em>'.
	 * @see org.polarsys.time4sys.results.results.ContainedResult
	 * @generated
	 */
	EClass getContainedResult();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.ReferencedResult <em>Referenced Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenced Result</em>'.
	 * @see org.polarsys.time4sys.results.results.ReferencedResult
	 * @generated
	 */
	EClass getReferencedResult();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.results.results.ReferencedResult#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see org.polarsys.time4sys.results.results.ReferencedResult#getData()
	 * @see #getReferencedResult()
	 * @generated
	 */
	EReference getReferencedResult_Data();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.TaskResult <em>Task Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Result</em>'.
	 * @see org.polarsys.time4sys.results.results.TaskResult
	 * @generated
	 */
	EClass getTaskResult();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.results.results.TaskResult#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.polarsys.time4sys.results.results.TaskResult#getEvent()
	 * @see #getTaskResult()
	 * @generated
	 */
	EReference getTaskResult_Event();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.TaskResult#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see org.polarsys.time4sys.results.results.TaskResult#getDeadline()
	 * @see #getTaskResult()
	 * @generated
	 */
	EAttribute getTaskResult_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.TaskResult#getBCET <em>BCET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BCET</em>'.
	 * @see org.polarsys.time4sys.results.results.TaskResult#getBCET()
	 * @see #getTaskResult()
	 * @generated
	 */
	EAttribute getTaskResult_BCET();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.TaskResult#getWCET <em>WCET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WCET</em>'.
	 * @see org.polarsys.time4sys.results.results.TaskResult#getWCET()
	 * @see #getTaskResult()
	 * @generated
	 */
	EAttribute getTaskResult_WCET();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.TaskResult#getSlack <em>Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slack</em>'.
	 * @see org.polarsys.time4sys.results.results.TaskResult#getSlack()
	 * @see #getTaskResult()
	 * @generated
	 */
	EAttribute getTaskResult_Slack();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.TaskResult#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.polarsys.time4sys.results.results.TaskResult#getPriority()
	 * @see #getTaskResult()
	 * @generated
	 */
	EAttribute getTaskResult_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.TaskResult#getNbOfSuspension <em>Nb Of Suspension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Of Suspension</em>'.
	 * @see org.polarsys.time4sys.results.results.TaskResult#getNbOfSuspension()
	 * @see #getTaskResult()
	 * @generated
	 */
	EAttribute getTaskResult_NbOfSuspension();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.polarsys.time4sys.results.results.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.Event#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jitter</em>'.
	 * @see org.polarsys.time4sys.results.results.Event#getJitter()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Jitter();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.Event#getMinDist <em>Min Dist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Dist</em>'.
	 * @see org.polarsys.time4sys.results.results.Event#getMinDist()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_MinDist();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.results.results.Event#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see org.polarsys.time4sys.results.results.Event#getOffset()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Offset();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.SimplePeriodicEvent <em>Simple Periodic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Periodic Event</em>'.
	 * @see org.polarsys.time4sys.results.results.SimplePeriodicEvent
	 * @generated
	 */
	EClass getSimplePeriodicEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.SimplePeriodicEvent#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.polarsys.time4sys.results.results.SimplePeriodicEvent#getPeriod()
	 * @see #getSimplePeriodicEvent()
	 * @generated
	 */
	EAttribute getSimplePeriodicEvent_Period();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.SimpleSporadicEvent <em>Simple Sporadic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Sporadic Event</em>'.
	 * @see org.polarsys.time4sys.results.results.SimpleSporadicEvent
	 * @generated
	 */
	EClass getSimpleSporadicEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.SimpleSporadicEvent#getDMin <em>DMin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DMin</em>'.
	 * @see org.polarsys.time4sys.results.results.SimpleSporadicEvent#getDMin()
	 * @see #getSimpleSporadicEvent()
	 * @generated
	 */
	EAttribute getSimpleSporadicEvent_DMin();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.OnceEvent <em>Once Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Once Event</em>'.
	 * @see org.polarsys.time4sys.results.results.OnceEvent
	 * @generated
	 */
	EClass getOnceEvent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.SlidingWindowEvent <em>Sliding Window Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sliding Window Event</em>'.
	 * @see org.polarsys.time4sys.results.results.SlidingWindowEvent
	 * @generated
	 */
	EClass getSlidingWindowEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.SlidingWindowEvent#getNbEvents <em>Nb Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Events</em>'.
	 * @see org.polarsys.time4sys.results.results.SlidingWindowEvent#getNbEvents()
	 * @see #getSlidingWindowEvent()
	 * @generated
	 */
	EAttribute getSlidingWindowEvent_NbEvents();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.SlidingWindowEvent#getWindowSize <em>Window Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Window Size</em>'.
	 * @see org.polarsys.time4sys.results.results.SlidingWindowEvent#getWindowSize()
	 * @see #getSlidingWindowEvent()
	 * @generated
	 */
	EAttribute getSlidingWindowEvent_WindowSize();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.TindellEvent <em>Tindell Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tindell Event</em>'.
	 * @see org.polarsys.time4sys.results.results.TindellEvent
	 * @generated
	 */
	EClass getTindellEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.TindellEvent#getBurstSize <em>Burst Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Burst Size</em>'.
	 * @see org.polarsys.time4sys.results.results.TindellEvent#getBurstSize()
	 * @see #getTindellEvent()
	 * @generated
	 */
	EAttribute getTindellEvent_BurstSize();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.TindellEvent#getInnerPeriod <em>Inner Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner Period</em>'.
	 * @see org.polarsys.time4sys.results.results.TindellEvent#getInnerPeriod()
	 * @see #getTindellEvent()
	 * @generated
	 */
	EAttribute getTindellEvent_InnerPeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.TindellEvent#getOuterPeriod <em>Outer Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Period</em>'.
	 * @see org.polarsys.time4sys.results.results.TindellEvent#getOuterPeriod()
	 * @see #getTindellEvent()
	 * @generated
	 */
	EAttribute getTindellEvent_OuterPeriod();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.Offset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offset</em>'.
	 * @see org.polarsys.time4sys.results.results.Offset
	 * @generated
	 */
	EClass getOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.Offset#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.results.results.Offset#getValue()
	 * @see #getOffset()
	 * @generated
	 */
	EAttribute getOffset_Value();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.results.results.Offset#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.polarsys.time4sys.results.results.Offset#getReference()
	 * @see #getOffset()
	 * @generated
	 */
	EReference getOffset_Reference();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.AtomicResult <em>Atomic Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Result</em>'.
	 * @see org.polarsys.time4sys.results.results.AtomicResult
	 * @generated
	 */
	EClass getAtomicResult();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.AtomicResult#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load</em>'.
	 * @see org.polarsys.time4sys.results.results.AtomicResult#getLoad()
	 * @see #getAtomicResult()
	 * @generated
	 */
	EAttribute getAtomicResult_Load();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.results.results.AtomicResult#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.polarsys.time4sys.results.results.AtomicResult#getParameter()
	 * @see #getAtomicResult()
	 * @generated
	 */
	EReference getAtomicResult_Parameter();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.AbstractResultSet <em>Abstract Result Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Result Set</em>'.
	 * @see org.polarsys.time4sys.results.results.AbstractResultSet
	 * @generated
	 */
	EClass getAbstractResultSet();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.AbstractResultSet#getToolName <em>Tool Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool Name</em>'.
	 * @see org.polarsys.time4sys.results.results.AbstractResultSet#getToolName()
	 * @see #getAbstractResultSet()
	 * @generated
	 */
	EAttribute getAbstractResultSet_ToolName();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.AbstractResultSet#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.polarsys.time4sys.results.results.AbstractResultSet#getDate()
	 * @see #getAbstractResultSet()
	 * @generated
	 */
	EAttribute getAbstractResultSet_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.results.results.AbstractResultSet#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.polarsys.time4sys.results.results.AbstractResultSet#getResults()
	 * @see #getAbstractResultSet()
	 * @generated
	 */
	EReference getAbstractResultSet_Results();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.results.results.AbstractResultSet#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see org.polarsys.time4sys.results.results.AbstractResultSet#getMapping()
	 * @see #getAbstractResultSet()
	 * @generated
	 */
	EReference getAbstractResultSet_Mapping();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.CustomTaskResult <em>Custom Task Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Task Result</em>'.
	 * @see org.polarsys.time4sys.results.results.CustomTaskResult
	 * @generated
	 */
	EClass getCustomTaskResult();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.CustomTaskResult#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Size</em>'.
	 * @see org.polarsys.time4sys.results.results.CustomTaskResult#getBufferSize()
	 * @see #getCustomTaskResult()
	 * @generated
	 */
	EAttribute getCustomTaskResult_BufferSize();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.CustomTaskResult#getBusyWindowLength <em>Busy Window Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Busy Window Length</em>'.
	 * @see org.polarsys.time4sys.results.results.CustomTaskResult#getBusyWindowLength()
	 * @see #getCustomTaskResult()
	 * @generated
	 */
	EAttribute getCustomTaskResult_BusyWindowLength();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.ComputingResourceResult <em>Computing Resource Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Resource Result</em>'.
	 * @see org.polarsys.time4sys.results.results.ComputingResourceResult
	 * @generated
	 */
	EClass getComputingResourceResult();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.ComputingResourceResult#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see org.polarsys.time4sys.results.results.ComputingResourceResult#getTypeName()
	 * @see #getComputingResourceResult()
	 * @generated
	 */
	EAttribute getComputingResourceResult_TypeName();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.SharedResourceResult <em>Shared Resource Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Resource Result</em>'.
	 * @see org.polarsys.time4sys.results.results.SharedResourceResult
	 * @generated
	 */
	EClass getSharedResourceResult();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.SharedResourceResult#getUtilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization</em>'.
	 * @see org.polarsys.time4sys.results.results.SharedResourceResult#getUtilization()
	 * @see #getSharedResourceResult()
	 * @generated
	 */
	EAttribute getSharedResourceResult_Utilization();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.results.results.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.polarsys.time4sys.results.results.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.results.results.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.results.results.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResultsFactory getResultsFactory();

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
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.ResultSetContainerImpl <em>Result Set Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.ResultSetContainerImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getResultSetContainer()
		 * @generated
		 */
		EClass RESULT_SET_CONTAINER = eINSTANCE.getResultSetContainer();

		/**
		 * The meta object literal for the '<em><b>Result Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_SET_CONTAINER__RESULT_SET = eINSTANCE.getResultSetContainer_ResultSet();

		/**
		 * The meta object literal for the '<em><b>Design Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_SET_CONTAINER__DESIGN_MODEL = eINSTANCE.getResultSetContainer_DesignModel();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.AnalysisResultSetImpl <em>Analysis Result Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.AnalysisResultSetImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getAnalysisResultSet()
		 * @generated
		 */
		EClass ANALYSIS_RESULT_SET = eINSTANCE.getAnalysisResultSet();

		/**
		 * The meta object literal for the '<em><b>Nb Of Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_RESULT_SET__NB_OF_ITERATIONS = eINSTANCE.getAnalysisResultSet_NbOfIterations();

		/**
		 * The meta object literal for the '<em><b>Has Converged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_RESULT_SET__HAS_CONVERGED = eINSTANCE.getAnalysisResultSet_HasConverged();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.TaskChainResultImpl <em>Task Chain Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.TaskChainResultImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getTaskChainResult()
		 * @generated
		 */
		EClass TASK_CHAIN_RESULT = eINSTANCE.getTaskChainResult();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CHAIN_RESULT__RESOURCE = eINSTANCE.getTaskChainResult_Resource();

		/**
		 * The meta object literal for the '<em><b>Slice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CHAIN_RESULT__SLICE = eINSTANCE.getTaskChainResult_Slice();

		/**
		 * The meta object literal for the '<em><b>Scheduling Trace</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CHAIN_RESULT__SCHEDULING_TRACE = eINSTANCE.getTaskChainResult_SchedulingTrace();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.SimulationResultImpl <em>Simulation Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.SimulationResultImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getSimulationResult()
		 * @generated
		 */
		EClass SIMULATION_RESULT = eINSTANCE.getSimulationResult();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.AbstractResultReferenceImpl <em>Abstract Result Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.AbstractResultReferenceImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getAbstractResultReference()
		 * @generated
		 */
		EClass ABSTRACT_RESULT_REFERENCE = eINSTANCE.getAbstractResultReference();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.AbstractResultImpl <em>Abstract Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.AbstractResultImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getAbstractResult()
		 * @generated
		 */
		EClass ABSTRACT_RESULT = eINSTANCE.getAbstractResult();

		/**
		 * The meta object literal for the '<em><b>Sub Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RESULT__SUB_RESULTS = eINSTANCE.getAbstractResult_SubResults();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.ContainedResultImpl <em>Contained Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.ContainedResultImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getContainedResult()
		 * @generated
		 */
		EClass CONTAINED_RESULT = eINSTANCE.getContainedResult();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.ReferencedResultImpl <em>Referenced Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.ReferencedResultImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getReferencedResult()
		 * @generated
		 */
		EClass REFERENCED_RESULT = eINSTANCE.getReferencedResult();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCED_RESULT__DATA = eINSTANCE.getReferencedResult_Data();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.TaskResultImpl <em>Task Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.TaskResultImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getTaskResult()
		 * @generated
		 */
		EClass TASK_RESULT = eINSTANCE.getTaskResult();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_RESULT__EVENT = eINSTANCE.getTaskResult_Event();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_RESULT__DEADLINE = eINSTANCE.getTaskResult_Deadline();

		/**
		 * The meta object literal for the '<em><b>BCET</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_RESULT__BCET = eINSTANCE.getTaskResult_BCET();

		/**
		 * The meta object literal for the '<em><b>WCET</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_RESULT__WCET = eINSTANCE.getTaskResult_WCET();

		/**
		 * The meta object literal for the '<em><b>Slack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_RESULT__SLACK = eINSTANCE.getTaskResult_Slack();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_RESULT__PRIORITY = eINSTANCE.getTaskResult_Priority();

		/**
		 * The meta object literal for the '<em><b>Nb Of Suspension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_RESULT__NB_OF_SUSPENSION = eINSTANCE.getTaskResult_NbOfSuspension();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.EventImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__JITTER = eINSTANCE.getEvent_Jitter();

		/**
		 * The meta object literal for the '<em><b>Min Dist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__MIN_DIST = eINSTANCE.getEvent_MinDist();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__OFFSET = eINSTANCE.getEvent_Offset();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.SimplePeriodicEventImpl <em>Simple Periodic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.SimplePeriodicEventImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getSimplePeriodicEvent()
		 * @generated
		 */
		EClass SIMPLE_PERIODIC_EVENT = eINSTANCE.getSimplePeriodicEvent();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_PERIODIC_EVENT__PERIOD = eINSTANCE.getSimplePeriodicEvent_Period();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.SimpleSporadicEventImpl <em>Simple Sporadic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.SimpleSporadicEventImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getSimpleSporadicEvent()
		 * @generated
		 */
		EClass SIMPLE_SPORADIC_EVENT = eINSTANCE.getSimpleSporadicEvent();

		/**
		 * The meta object literal for the '<em><b>DMin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_SPORADIC_EVENT__DMIN = eINSTANCE.getSimpleSporadicEvent_DMin();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.OnceEventImpl <em>Once Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.OnceEventImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getOnceEvent()
		 * @generated
		 */
		EClass ONCE_EVENT = eINSTANCE.getOnceEvent();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.SlidingWindowEventImpl <em>Sliding Window Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.SlidingWindowEventImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getSlidingWindowEvent()
		 * @generated
		 */
		EClass SLIDING_WINDOW_EVENT = eINSTANCE.getSlidingWindowEvent();

		/**
		 * The meta object literal for the '<em><b>Nb Events</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDING_WINDOW_EVENT__NB_EVENTS = eINSTANCE.getSlidingWindowEvent_NbEvents();

		/**
		 * The meta object literal for the '<em><b>Window Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDING_WINDOW_EVENT__WINDOW_SIZE = eINSTANCE.getSlidingWindowEvent_WindowSize();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.TindellEventImpl <em>Tindell Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.TindellEventImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getTindellEvent()
		 * @generated
		 */
		EClass TINDELL_EVENT = eINSTANCE.getTindellEvent();

		/**
		 * The meta object literal for the '<em><b>Burst Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINDELL_EVENT__BURST_SIZE = eINSTANCE.getTindellEvent_BurstSize();

		/**
		 * The meta object literal for the '<em><b>Inner Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINDELL_EVENT__INNER_PERIOD = eINSTANCE.getTindellEvent_InnerPeriod();

		/**
		 * The meta object literal for the '<em><b>Outer Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINDELL_EVENT__OUTER_PERIOD = eINSTANCE.getTindellEvent_OuterPeriod();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.OffsetImpl <em>Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.OffsetImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getOffset()
		 * @generated
		 */
		EClass OFFSET = eINSTANCE.getOffset();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFSET__VALUE = eINSTANCE.getOffset_Value();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFSET__REFERENCE = eINSTANCE.getOffset_Reference();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.AtomicResultImpl <em>Atomic Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.AtomicResultImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getAtomicResult()
		 * @generated
		 */
		EClass ATOMIC_RESULT = eINSTANCE.getAtomicResult();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_RESULT__LOAD = eINSTANCE.getAtomicResult_Load();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_RESULT__PARAMETER = eINSTANCE.getAtomicResult_Parameter();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.AbstractResultSetImpl <em>Abstract Result Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.AbstractResultSetImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getAbstractResultSet()
		 * @generated
		 */
		EClass ABSTRACT_RESULT_SET = eINSTANCE.getAbstractResultSet();

		/**
		 * The meta object literal for the '<em><b>Tool Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_RESULT_SET__TOOL_NAME = eINSTANCE.getAbstractResultSet_ToolName();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_RESULT_SET__DATE = eINSTANCE.getAbstractResultSet_Date();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RESULT_SET__RESULTS = eINSTANCE.getAbstractResultSet_Results();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RESULT_SET__MAPPING = eINSTANCE.getAbstractResultSet_Mapping();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.CustomTaskResultImpl <em>Custom Task Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.CustomTaskResultImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getCustomTaskResult()
		 * @generated
		 */
		EClass CUSTOM_TASK_RESULT = eINSTANCE.getCustomTaskResult();

		/**
		 * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TASK_RESULT__BUFFER_SIZE = eINSTANCE.getCustomTaskResult_BufferSize();

		/**
		 * The meta object literal for the '<em><b>Busy Window Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TASK_RESULT__BUSY_WINDOW_LENGTH = eINSTANCE.getCustomTaskResult_BusyWindowLength();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.ComputingResourceResultImpl <em>Computing Resource Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.ComputingResourceResultImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getComputingResourceResult()
		 * @generated
		 */
		EClass COMPUTING_RESOURCE_RESULT = eINSTANCE.getComputingResourceResult();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_RESOURCE_RESULT__TYPE_NAME = eINSTANCE.getComputingResourceResult_TypeName();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.SharedResourceResultImpl <em>Shared Resource Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.SharedResourceResultImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getSharedResourceResult()
		 * @generated
		 */
		EClass SHARED_RESOURCE_RESULT = eINSTANCE.getSharedResourceResult();

		/**
		 * The meta object literal for the '<em><b>Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_RESOURCE_RESULT__UTILIZATION = eINSTANCE.getSharedResourceResult_Utilization();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.results.results.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.results.results.impl.ParameterImpl
		 * @see org.polarsys.time4sys.results.results.impl.ResultsPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

	}

} //ResultsPackage
