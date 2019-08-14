/**
 */
package org.polarsys.time4sys.results.results.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.time4sys.results.results.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultsFactoryImpl extends EFactoryImpl implements ResultsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResultsFactory init() {
		try {
			ResultsFactory theResultsFactory = (ResultsFactory)EPackage.Registry.INSTANCE.getEFactory(ResultsPackage.eNS_URI);
			if (theResultsFactory != null) {
				return theResultsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResultsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ResultsPackage.RESULT_SET_CONTAINER: return createResultSetContainer();
			case ResultsPackage.ANALYSIS_RESULT_SET: return createAnalysisResultSet();
			case ResultsPackage.TASK_CHAIN_RESULT: return createTaskChainResult();
			case ResultsPackage.SIMULATION_RESULT: return createSimulationResult();
			case ResultsPackage.CONTAINED_RESULT: return createContainedResult();
			case ResultsPackage.REFERENCED_RESULT: return createReferencedResult();
			case ResultsPackage.TASK_RESULT: return createTaskResult();
			case ResultsPackage.SIMPLE_PERIODIC_EVENT: return createSimplePeriodicEvent();
			case ResultsPackage.SIMPLE_SPORADIC_EVENT: return createSimpleSporadicEvent();
			case ResultsPackage.ONCE_EVENT: return createOnceEvent();
			case ResultsPackage.SLIDING_WINDOW_EVENT: return createSlidingWindowEvent();
			case ResultsPackage.TINDELL_EVENT: return createTindellEvent();
			case ResultsPackage.OFFSET: return createOffset();
			case ResultsPackage.CUSTOM_TASK_RESULT: return createCustomTaskResult();
			case ResultsPackage.COMPUTING_RESOURCE_RESULT: return createComputingResourceResult();
			case ResultsPackage.SHARED_RESOURCE_RESULT: return createSharedResourceResult();
			case ResultsPackage.PARAMETER: return createParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultSetContainer createResultSetContainer() {
		ResultSetContainerImpl resultSetContainer = new ResultSetContainerImpl();
		return resultSetContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisResultSet createAnalysisResultSet() {
		AnalysisResultSetImpl analysisResultSet = new AnalysisResultSetImpl();
		return analysisResultSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskChainResult createTaskChainResult() {
		TaskChainResultImpl taskChainResult = new TaskChainResultImpl();
		return taskChainResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationResult createSimulationResult() {
		SimulationResultImpl simulationResult = new SimulationResultImpl();
		return simulationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainedResult createContainedResult() {
		ContainedResultImpl containedResult = new ContainedResultImpl();
		return containedResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedResult createReferencedResult() {
		ReferencedResultImpl referencedResult = new ReferencedResultImpl();
		return referencedResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskResult createTaskResult() {
		TaskResultImpl taskResult = new TaskResultImpl();
		return taskResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePeriodicEvent createSimplePeriodicEvent() {
		SimplePeriodicEventImpl simplePeriodicEvent = new SimplePeriodicEventImpl();
		return simplePeriodicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSporadicEvent createSimpleSporadicEvent() {
		SimpleSporadicEventImpl simpleSporadicEvent = new SimpleSporadicEventImpl();
		return simpleSporadicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnceEvent createOnceEvent() {
		OnceEventImpl onceEvent = new OnceEventImpl();
		return onceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlidingWindowEvent createSlidingWindowEvent() {
		SlidingWindowEventImpl slidingWindowEvent = new SlidingWindowEventImpl();
		return slidingWindowEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TindellEvent createTindellEvent() {
		TindellEventImpl tindellEvent = new TindellEventImpl();
		return tindellEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offset createOffset() {
		OffsetImpl offset = new OffsetImpl();
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTaskResult createCustomTaskResult() {
		CustomTaskResultImpl customTaskResult = new CustomTaskResultImpl();
		return customTaskResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingResourceResult createComputingResourceResult() {
		ComputingResourceResultImpl computingResourceResult = new ComputingResourceResultImpl();
		return computingResourceResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedResourceResult createSharedResourceResult() {
		SharedResourceResultImpl sharedResourceResult = new SharedResourceResultImpl();
		return sharedResourceResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsPackage getResultsPackage() {
		return (ResultsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResultsPackage getPackage() {
		return ResultsPackage.eINSTANCE;
	}

} //ResultsFactoryImpl
