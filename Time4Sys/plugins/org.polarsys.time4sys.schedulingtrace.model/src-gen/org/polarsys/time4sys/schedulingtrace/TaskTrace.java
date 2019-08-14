/**
 */
package org.polarsys.time4sys.schedulingtrace;

import org.eclipse.emf.common.util.EList;

import org.polarsys.time4sys.trace.Slice;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.TaskTrace#getJobs <em>Jobs</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.TaskTrace#getJobWithMaxRT <em>Job With Max RT</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getTaskTrace()
 * @model
 * @generated
 */
public interface TaskTrace extends Slice {
	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.schedulingtrace.Job}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.schedulingtrace.Job#getTasktrace <em>Tasktrace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getTaskTrace_Jobs()
	 * @see org.polarsys.time4sys.schedulingtrace.Job#getTasktrace
	 * @model opposite="tasktrace" containment="true"
	 * @generated
	 */
	EList<Job> getJobs();

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
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getTaskTrace_JobWithMaxRT()
	 * @model
	 * @generated
	 */
	Job getJobWithMaxRT();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.schedulingtrace.TaskTrace#getJobWithMaxRT <em>Job With Max RT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job With Max RT</em>' reference.
	 * @see #getJobWithMaxRT()
	 * @generated
	 */
	void setJobWithMaxRT(Job value);

} // TaskTrace
