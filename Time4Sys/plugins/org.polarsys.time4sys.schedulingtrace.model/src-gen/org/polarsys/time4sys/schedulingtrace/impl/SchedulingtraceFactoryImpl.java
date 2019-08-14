/**
 */
package org.polarsys.time4sys.schedulingtrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.time4sys.schedulingtrace.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedulingtraceFactoryImpl extends EFactoryImpl implements SchedulingtraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchedulingtraceFactory init() {
		try {
			SchedulingtraceFactory theSchedulingtraceFactory = (SchedulingtraceFactory)EPackage.Registry.INSTANCE.getEFactory(SchedulingtracePackage.eNS_URI);
			if (theSchedulingtraceFactory != null) {
				return theSchedulingtraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SchedulingtraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingtraceFactoryImpl() {
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
			case SchedulingtracePackage.PROCESSOR: return createProcessor();
			case SchedulingtracePackage.SCHEDULING_TRACE: return createSchedulingTrace();
			case SchedulingtracePackage.TASK_TRACE: return createTaskTrace();
			case SchedulingtracePackage.PARTITION: return createPartition();
			case SchedulingtracePackage.JOB: return createJob();
			case SchedulingtracePackage.FUNCTION_INSTANCE: return createFunctionInstance();
			case SchedulingtracePackage.PREEMPTED_BY: return createPreemptedBy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingTrace createSchedulingTrace() {
		SchedulingTraceImpl schedulingTrace = new SchedulingTraceImpl();
		return schedulingTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskTrace createTaskTrace() {
		TaskTraceImpl taskTrace = new TaskTraceImpl();
		return taskTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition createPartition() {
		PartitionImpl partition = new PartitionImpl();
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job createJob() {
		JobImpl job = new JobImpl();
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInstance createFunctionInstance() {
		FunctionInstanceImpl functionInstance = new FunctionInstanceImpl();
		return functionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreemptedBy createPreemptedBy() {
		PreemptedByImpl preemptedBy = new PreemptedByImpl();
		return preemptedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingtracePackage getSchedulingtracePackage() {
		return (SchedulingtracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SchedulingtracePackage getPackage() {
		return SchedulingtracePackage.eINSTANCE;
	}

} //SchedulingtraceFactoryImpl
