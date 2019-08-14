/**
 */
package org.polarsys.time4sys.schedulingtrace;

import org.eclipse.emf.common.util.EList;

import org.polarsys.time4sys.marte.grm.SchedulableResource;

import org.polarsys.time4sys.trace.Slice;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.Partition#getTasktraces <em>Tasktraces</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.Partition#getSchedulableResource <em>Schedulable Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.Partition#getJobWithMaxRT <em>Job With Max RT</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getPartition()
 * @model
 * @generated
 */
public interface Partition extends Slice {
	/**
	 * Returns the value of the '<em><b>Tasktraces</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.schedulingtrace.TaskTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasktraces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasktraces</em>' reference list.
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getPartition_Tasktraces()
	 * @model
	 * @generated
	 */
	EList<TaskTrace> getTasktraces();

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
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getPartition_SchedulableResource()
	 * @model
	 * @generated
	 */
	SchedulableResource getSchedulableResource();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.schedulingtrace.Partition#getSchedulableResource <em>Schedulable Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedulable Resource</em>' reference.
	 * @see #getSchedulableResource()
	 * @generated
	 */
	void setSchedulableResource(SchedulableResource value);

	/**
	 * Returns the value of the '<em><b>Job With Max RT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job With Max RT</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job With Max RT</em>' reference.
	 * @see #setJobWithMaxRT(Job)
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getPartition_JobWithMaxRT()
	 * @model
	 * @generated
	 */
	Job getJobWithMaxRT();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.schedulingtrace.Partition#getJobWithMaxRT <em>Job With Max RT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job With Max RT</em>' reference.
	 * @see #getJobWithMaxRT()
	 * @generated
	 */
	void setJobWithMaxRT(Job value);

} // Partition
