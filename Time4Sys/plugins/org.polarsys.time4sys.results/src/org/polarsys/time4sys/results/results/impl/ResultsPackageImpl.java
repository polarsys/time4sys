/**
 */
package org.polarsys.time4sys.results.results.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.time4sys.design.DesignPackage;

import org.polarsys.time4sys.mapping.MappingPackage;
import org.polarsys.time4sys.marte.gqam.GqamPackage;

import org.polarsys.time4sys.marte.grm.GrmPackage;

import org.polarsys.time4sys.marte.nfp.NfpPackage;

import org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage;

import org.polarsys.time4sys.results.results.AbstractResult;
import org.polarsys.time4sys.results.results.AbstractResultReference;
import org.polarsys.time4sys.results.results.AbstractResultSet;
import org.polarsys.time4sys.results.results.AnalysisResultSet;
import org.polarsys.time4sys.results.results.AtomicResult;
import org.polarsys.time4sys.results.results.ComputingResourceResult;
import org.polarsys.time4sys.results.results.ContainedResult;
import org.polarsys.time4sys.results.results.CustomTaskResult;
import org.polarsys.time4sys.results.results.Event;
import org.polarsys.time4sys.results.results.Offset;
import org.polarsys.time4sys.results.results.OnceEvent;
import org.polarsys.time4sys.results.results.Parameter;
import org.polarsys.time4sys.results.results.ReferencedResult;
import org.polarsys.time4sys.results.results.ResultSetContainer;
import org.polarsys.time4sys.results.results.ResultsFactory;
import org.polarsys.time4sys.results.results.ResultsPackage;
import org.polarsys.time4sys.results.results.SharedResourceResult;
import org.polarsys.time4sys.results.results.SimplePeriodicEvent;
import org.polarsys.time4sys.results.results.SimpleSporadicEvent;
import org.polarsys.time4sys.results.results.SimulationResult;
import org.polarsys.time4sys.results.results.SlidingWindowEvent;
import org.polarsys.time4sys.results.results.TaskChainResult;
import org.polarsys.time4sys.results.results.TaskResult;
import org.polarsys.time4sys.results.results.TindellEvent;

import org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage;

import org.polarsys.time4sys.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultsPackageImpl extends EPackageImpl implements ResultsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultSetContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisResultSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskChainResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractResultReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencedResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simplePeriodicEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSporadicEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slidingWindowEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tindellEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractResultSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customTaskResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingResourceResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedResourceResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

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
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResultsPackageImpl() {
		super(eNS_URI, ResultsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ResultsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResultsPackage init() {
		if (isInited) return (ResultsPackage)EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);

		// Obtain or create and register package
		ResultsPackageImpl theResultsPackage = (ResultsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResultsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResultsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DesignPackage.eINSTANCE.eClass();
		MappingPackage.eINSTANCE.eClass();
		SchedulingtracePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theResultsPackage.createPackageContents();

		// Initialize created meta-data
		theResultsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResultsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResultsPackage.eNS_URI, theResultsPackage);
		return theResultsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultSetContainer() {
		return resultSetContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultSetContainer_ResultSet() {
		return (EReference)resultSetContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultSetContainer_DesignModel() {
		return (EReference)resultSetContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisResultSet() {
		return analysisResultSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisResultSet_NbOfIterations() {
		return (EAttribute)analysisResultSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisResultSet_HasConverged() {
		return (EAttribute)analysisResultSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskChainResult() {
		return taskChainResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskChainResult_Resource() {
		return (EReference)taskChainResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskChainResult_Slice() {
		return (EReference)taskChainResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskChainResult_SchedulingTrace() {
		return (EReference)taskChainResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationResult() {
		return simulationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractResultReference() {
		return abstractResultReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractResult() {
		return abstractResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractResult_SubResults() {
		return (EReference)abstractResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainedResult() {
		return containedResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencedResult() {
		return referencedResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencedResult_Data() {
		return (EReference)referencedResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskResult() {
		return taskResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskResult_Event() {
		return (EReference)taskResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskResult_Deadline() {
		return (EAttribute)taskResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskResult_Cet() {
		return (EAttribute)taskResultEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskResult_ResponseTime() {
		return (EAttribute)taskResultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskResult_Slack() {
		return (EAttribute)taskResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskResult_Priority() {
		return (EAttribute)taskResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskResult_NbOfSuspension() {
		return (EAttribute)taskResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Jitter() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_MinDist() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Offset() {
		return (EReference)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimplePeriodicEvent() {
		return simplePeriodicEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimplePeriodicEvent_Period() {
		return (EAttribute)simplePeriodicEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSporadicEvent() {
		return simpleSporadicEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleSporadicEvent_DMin() {
		return (EAttribute)simpleSporadicEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnceEvent() {
		return onceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlidingWindowEvent() {
		return slidingWindowEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlidingWindowEvent_NbEvents() {
		return (EAttribute)slidingWindowEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlidingWindowEvent_WindowSize() {
		return (EAttribute)slidingWindowEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTindellEvent() {
		return tindellEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTindellEvent_BurstSize() {
		return (EAttribute)tindellEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTindellEvent_InnerPeriod() {
		return (EAttribute)tindellEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTindellEvent_OuterPeriod() {
		return (EAttribute)tindellEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffset() {
		return offsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffset_Value() {
		return (EAttribute)offsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffset_Reference() {
		return (EReference)offsetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicResult() {
		return atomicResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicResult_Load() {
		return (EAttribute)atomicResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicResult_Parameter() {
		return (EReference)atomicResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractResultSet() {
		return abstractResultSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractResultSet_ToolName() {
		return (EAttribute)abstractResultSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractResultSet_Date() {
		return (EAttribute)abstractResultSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractResultSet_Results() {
		return (EReference)abstractResultSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractResultSet_Mapping() {
		return (EReference)abstractResultSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomTaskResult() {
		return customTaskResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomTaskResult_BufferSize() {
		return (EAttribute)customTaskResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomTaskResult_BusyWindowLength() {
		return (EAttribute)customTaskResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputingResourceResult() {
		return computingResourceResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputingResourceResult_TypeName() {
		return (EAttribute)computingResourceResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedResourceResult() {
		return sharedResourceResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedResourceResult_Utilization() {
		return (EAttribute)sharedResourceResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsFactory getResultsFactory() {
		return (ResultsFactory)getEFactoryInstance();
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
		resultSetContainerEClass = createEClass(RESULT_SET_CONTAINER);
		createEReference(resultSetContainerEClass, RESULT_SET_CONTAINER__RESULT_SET);
		createEReference(resultSetContainerEClass, RESULT_SET_CONTAINER__DESIGN_MODEL);

		analysisResultSetEClass = createEClass(ANALYSIS_RESULT_SET);
		createEAttribute(analysisResultSetEClass, ANALYSIS_RESULT_SET__NB_OF_ITERATIONS);
		createEAttribute(analysisResultSetEClass, ANALYSIS_RESULT_SET__HAS_CONVERGED);

		taskChainResultEClass = createEClass(TASK_CHAIN_RESULT);
		createEReference(taskChainResultEClass, TASK_CHAIN_RESULT__RESOURCE);
		createEReference(taskChainResultEClass, TASK_CHAIN_RESULT__SLICE);
		createEReference(taskChainResultEClass, TASK_CHAIN_RESULT__SCHEDULING_TRACE);

		simulationResultEClass = createEClass(SIMULATION_RESULT);

		abstractResultReferenceEClass = createEClass(ABSTRACT_RESULT_REFERENCE);

		containedResultEClass = createEClass(CONTAINED_RESULT);

		referencedResultEClass = createEClass(REFERENCED_RESULT);
		createEReference(referencedResultEClass, REFERENCED_RESULT__DATA);

		taskResultEClass = createEClass(TASK_RESULT);
		createEReference(taskResultEClass, TASK_RESULT__EVENT);
		createEAttribute(taskResultEClass, TASK_RESULT__SLACK);
		createEAttribute(taskResultEClass, TASK_RESULT__PRIORITY);
		createEAttribute(taskResultEClass, TASK_RESULT__NB_OF_SUSPENSION);
		createEAttribute(taskResultEClass, TASK_RESULT__DEADLINE);
		createEAttribute(taskResultEClass, TASK_RESULT__RESPONSE_TIME);
		createEAttribute(taskResultEClass, TASK_RESULT__CET);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__JITTER);
		createEAttribute(eventEClass, EVENT__MIN_DIST);
		createEReference(eventEClass, EVENT__OFFSET);

		simplePeriodicEventEClass = createEClass(SIMPLE_PERIODIC_EVENT);
		createEAttribute(simplePeriodicEventEClass, SIMPLE_PERIODIC_EVENT__PERIOD);

		simpleSporadicEventEClass = createEClass(SIMPLE_SPORADIC_EVENT);
		createEAttribute(simpleSporadicEventEClass, SIMPLE_SPORADIC_EVENT__DMIN);

		onceEventEClass = createEClass(ONCE_EVENT);

		slidingWindowEventEClass = createEClass(SLIDING_WINDOW_EVENT);
		createEAttribute(slidingWindowEventEClass, SLIDING_WINDOW_EVENT__NB_EVENTS);
		createEAttribute(slidingWindowEventEClass, SLIDING_WINDOW_EVENT__WINDOW_SIZE);

		tindellEventEClass = createEClass(TINDELL_EVENT);
		createEAttribute(tindellEventEClass, TINDELL_EVENT__BURST_SIZE);
		createEAttribute(tindellEventEClass, TINDELL_EVENT__INNER_PERIOD);
		createEAttribute(tindellEventEClass, TINDELL_EVENT__OUTER_PERIOD);

		offsetEClass = createEClass(OFFSET);
		createEAttribute(offsetEClass, OFFSET__VALUE);
		createEReference(offsetEClass, OFFSET__REFERENCE);

		atomicResultEClass = createEClass(ATOMIC_RESULT);
		createEAttribute(atomicResultEClass, ATOMIC_RESULT__LOAD);
		createEReference(atomicResultEClass, ATOMIC_RESULT__PARAMETER);

		abstractResultSetEClass = createEClass(ABSTRACT_RESULT_SET);
		createEAttribute(abstractResultSetEClass, ABSTRACT_RESULT_SET__TOOL_NAME);
		createEAttribute(abstractResultSetEClass, ABSTRACT_RESULT_SET__DATE);
		createEReference(abstractResultSetEClass, ABSTRACT_RESULT_SET__RESULTS);
		createEReference(abstractResultSetEClass, ABSTRACT_RESULT_SET__MAPPING);

		customTaskResultEClass = createEClass(CUSTOM_TASK_RESULT);
		createEAttribute(customTaskResultEClass, CUSTOM_TASK_RESULT__BUFFER_SIZE);
		createEAttribute(customTaskResultEClass, CUSTOM_TASK_RESULT__BUSY_WINDOW_LENGTH);

		computingResourceResultEClass = createEClass(COMPUTING_RESOURCE_RESULT);
		createEAttribute(computingResourceResultEClass, COMPUTING_RESOURCE_RESULT__TYPE_NAME);

		sharedResourceResultEClass = createEClass(SHARED_RESOURCE_RESULT);
		createEAttribute(sharedResourceResultEClass, SHARED_RESOURCE_RESULT__UTILIZATION);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		abstractResultEClass = createEClass(ABSTRACT_RESULT);
		createEReference(abstractResultEClass, ABSTRACT_RESULT__SUB_RESULTS);
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
		CoreElementsPackage theCoreElementsPackage = (CoreElementsPackage)EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI);
		DesignPackage theDesignPackage = (DesignPackage)EPackage.Registry.INSTANCE.getEPackage(DesignPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		GrmPackage theGrmPackage = (GrmPackage)EPackage.Registry.INSTANCE.getEPackage(GrmPackage.eNS_URI);
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		SchedulingtracePackage theSchedulingtracePackage = (SchedulingtracePackage)EPackage.Registry.INSTANCE.getEPackage(SchedulingtracePackage.eNS_URI);
		NfpPackage theNfpPackage = (NfpPackage)EPackage.Registry.INSTANCE.getEPackage(NfpPackage.eNS_URI);
		GqamPackage theGqamPackage = (GqamPackage)EPackage.Registry.INSTANCE.getEPackage(GqamPackage.eNS_URI);
		MappingPackage theMappingPackage = (MappingPackage)EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resultSetContainerEClass.getESuperTypes().add(theCoreElementsPackage.getModelElement());
		analysisResultSetEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());
		analysisResultSetEClass.getESuperTypes().add(this.getAbstractResultSet());
		taskChainResultEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());
		taskChainResultEClass.getESuperTypes().add(this.getTaskResult());
		simulationResultEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());
		simulationResultEClass.getESuperTypes().add(this.getAbstractResultSet());
		abstractResultReferenceEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());
		abstractResultReferenceEClass.getESuperTypes().add(this.getAbstractResult());
		containedResultEClass.getESuperTypes().add(this.getAbstractResultReference());
		referencedResultEClass.getESuperTypes().add(this.getAbstractResultReference());
		taskResultEClass.getESuperTypes().add(this.getAtomicResult());
		simplePeriodicEventEClass.getESuperTypes().add(this.getEvent());
		simpleSporadicEventEClass.getESuperTypes().add(this.getEvent());
		onceEventEClass.getESuperTypes().add(this.getEvent());
		slidingWindowEventEClass.getESuperTypes().add(this.getEvent());
		tindellEventEClass.getESuperTypes().add(this.getEvent());
		atomicResultEClass.getESuperTypes().add(this.getAbstractResult());
		customTaskResultEClass.getESuperTypes().add(this.getTaskResult());
		computingResourceResultEClass.getESuperTypes().add(this.getAtomicResult());
		sharedResourceResultEClass.getESuperTypes().add(this.getAtomicResult());
		parameterEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());
		abstractResultEClass.getESuperTypes().add(theCoreElementsPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(resultSetContainerEClass, ResultSetContainer.class, "ResultSetContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultSetContainer_ResultSet(), this.getAbstractResultSet(), null, "resultSet", null, 0, -1, ResultSetContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultSetContainer_DesignModel(), theDesignPackage.getDesignModel(), null, "designModel", null, 1, 1, ResultSetContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisResultSetEClass, AnalysisResultSet.class, "AnalysisResultSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalysisResultSet_NbOfIterations(), theEcorePackage.getEInt(), "nbOfIterations", null, 0, 1, AnalysisResultSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysisResultSet_HasConverged(), ecorePackage.getEBoolean(), "hasConverged", "false", 0, 1, AnalysisResultSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskChainResultEClass, TaskChainResult.class, "TaskChainResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskChainResult_Resource(), theGrmPackage.getResource(), null, "resource", null, 0, 1, TaskChainResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskChainResult_Slice(), theTracePackage.getSlice(), null, "slice", null, 0, 1, TaskChainResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskChainResult_SchedulingTrace(), theSchedulingtracePackage.getSchedulingTrace(), null, "schedulingTrace", null, 0, -1, TaskChainResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulationResultEClass, SimulationResult.class, "SimulationResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractResultReferenceEClass, AbstractResultReference.class, "AbstractResultReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containedResultEClass, ContainedResult.class, "ContainedResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referencedResultEClass, ReferencedResult.class, "ReferencedResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencedResult_Data(), theEcorePackage.getEObject(), null, "data", null, 0, 1, ReferencedResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskResultEClass, TaskResult.class, "TaskResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskResult_Event(), this.getEvent(), null, "event", null, 0, 1, TaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskResult_Slack(), ecorePackage.getEDouble(), "slack", null, 0, 1, TaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskResult_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, TaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskResult_NbOfSuspension(), theEcorePackage.getEInt(), "nbOfSuspension", null, 0, 1, TaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskResult_Deadline(), theNfpPackage.getNFP_Duration(), "deadline", null, 0, 1, TaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskResult_ResponseTime(), theNfpPackage.getNFP_TimeInterval(), "responseTime", null, 0, 1, TaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskResult_Cet(), theNfpPackage.getNFP_TimeInterval(), "cet", null, 0, 1, TaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Jitter(), ecorePackage.getEInt(), "jitter", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_MinDist(), ecorePackage.getEInt(), "minDist", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Offset(), this.getOffset(), null, "offset", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simplePeriodicEventEClass, SimplePeriodicEvent.class, "SimplePeriodicEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimplePeriodicEvent_Period(), theNfpPackage.getNFP_Duration(), "period", null, 0, 1, SimplePeriodicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleSporadicEventEClass, SimpleSporadicEvent.class, "SimpleSporadicEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleSporadicEvent_DMin(), theNfpPackage.getNFP_Duration(), "dMin", null, 0, 1, SimpleSporadicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onceEventEClass, OnceEvent.class, "OnceEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(slidingWindowEventEClass, SlidingWindowEvent.class, "SlidingWindowEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlidingWindowEvent_NbEvents(), ecorePackage.getEInt(), "nbEvents", null, 0, 1, SlidingWindowEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlidingWindowEvent_WindowSize(), ecorePackage.getEInt(), "windowSize", null, 0, 1, SlidingWindowEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tindellEventEClass, TindellEvent.class, "TindellEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTindellEvent_BurstSize(), ecorePackage.getEInt(), "burstSize", null, 0, 1, TindellEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTindellEvent_InnerPeriod(), ecorePackage.getEInt(), "innerPeriod", null, 0, 1, TindellEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTindellEvent_OuterPeriod(), ecorePackage.getEInt(), "outerPeriod", null, 0, 1, TindellEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offsetEClass, Offset.class, "Offset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOffset_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffset_Reference(), theGqamPackage.getReference(), null, "reference", null, 0, 1, Offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicResultEClass, AtomicResult.class, "AtomicResult", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicResult_Load(), theEcorePackage.getEDouble(), "load", null, 0, 1, AtomicResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicResult_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, AtomicResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractResultSetEClass, AbstractResultSet.class, "AbstractResultSet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractResultSet_ToolName(), ecorePackage.getEString(), "toolName", null, 0, 1, AbstractResultSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractResultSet_Date(), theEcorePackage.getEDate(), "date", null, 0, 1, AbstractResultSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractResultSet_Results(), this.getAbstractResult(), null, "results", null, 0, -1, AbstractResultSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractResultSet_Mapping(), theMappingPackage.getMapping(), null, "mapping", null, 0, 1, AbstractResultSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customTaskResultEClass, CustomTaskResult.class, "CustomTaskResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomTaskResult_BufferSize(), theEcorePackage.getEInt(), "bufferSize", null, 0, 1, CustomTaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomTaskResult_BusyWindowLength(), theEcorePackage.getEInt(), "busyWindowLength", null, 0, 1, CustomTaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computingResourceResultEClass, ComputingResourceResult.class, "ComputingResourceResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputingResourceResult_TypeName(), theEcorePackage.getEString(), "typeName", null, 0, 1, ComputingResourceResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedResourceResultEClass, SharedResourceResult.class, "SharedResourceResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSharedResourceResult_Utilization(), theEcorePackage.getEDouble(), "utilization", null, 0, 1, SharedResourceResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractResultEClass, AbstractResult.class, "AbstractResult", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractResult_SubResults(), this.getAbstractResult(), null, "subResults", null, 0, -1, AbstractResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ResultsPackageImpl
