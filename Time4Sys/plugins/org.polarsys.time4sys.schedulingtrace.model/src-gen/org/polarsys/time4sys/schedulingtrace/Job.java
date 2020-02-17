/**
 */
package org.polarsys.time4sys.schedulingtrace;

import org.eclipse.emf.common.util.EList;

import org.polarsys.time4sys.marte.grm.SchedulableResource;

import org.polarsys.time4sys.trace.Slice;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.Job#getTasktrace <em>Tasktrace</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.Job#getFunctionInstances <em>Function Instances</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.Job#getSchedulableResource <em>Schedulable Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.Job#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.Job#getListPreemptedBy <em>List Preempted By</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getJob()
 * @model
 * @generated
 */
public interface Job extends Slice {
	/**
	 * Returns the value of the '<em><b>Tasktrace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.schedulingtrace.TaskTrace#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasktrace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasktrace</em>' container reference.
	 * @see #setTasktrace(TaskTrace)
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getJob_Tasktrace()
	 * @see org.polarsys.time4sys.schedulingtrace.TaskTrace#getJobs
	 * @model opposite="jobs" transient="false"
	 * @generated
	 */
	TaskTrace getTasktrace();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.schedulingtrace.Job#getTasktrace <em>Tasktrace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tasktrace</em>' container reference.
	 * @see #getTasktrace()
	 * @generated
	 */
	void setTasktrace(TaskTrace value);

	/**
	 * Returns the value of the '<em><b>Function Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.schedulingtrace.FunctionInstance}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.schedulingtrace.FunctionInstance#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Instances</em>' containment reference list.
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getJob_FunctionInstances()
	 * @see org.polarsys.time4sys.schedulingtrace.FunctionInstance#getJob
	 * @model opposite="job" containment="true"
	 * @generated
	 */
	EList<FunctionInstance> getFunctionInstances();

	/**
	 * Returns the value of the '<em><b>Schedulable Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedulable Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedulable Resource</em>' reference.
	 * @see #setSchedulableResource(SchedulableResource)
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getJob_SchedulableResource()
	 * @model
	 * @generated
	 */
	SchedulableResource getSchedulableResource();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.schedulingtrace.Job#getSchedulableResource <em>Schedulable Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedulable Resource</em>' reference.
	 * @see #getSchedulableResource()
	 * @generated
	 */
	void setSchedulableResource(SchedulableResource value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getJob_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.schedulingtrace.Job#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>List Preempted By</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.schedulingtrace.PreemptedBy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Preempted By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Preempted By</em>' containment reference list.
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getJob_ListPreemptedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<PreemptedBy> getListPreemptedBy();

} // Job
