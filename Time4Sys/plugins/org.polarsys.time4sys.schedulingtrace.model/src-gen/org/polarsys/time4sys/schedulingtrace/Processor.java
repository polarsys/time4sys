/**
 */
package org.polarsys.time4sys.schedulingtrace;

import org.eclipse.emf.common.util.EList;

import org.polarsys.time4sys.marte.hrm.HardwareResource;

import org.polarsys.time4sys.trace.Slice;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.Processor#getTasktraces <em>Tasktraces</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.Processor#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.Processor#getHardwareResource <em>Hardware Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.Processor#getJobWithMaxRT <em>Job With Max RT</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getProcessor()
 * @model
 * @generated
 */
public interface Processor extends Slice {
	/**
	 * Returns the value of the '<em><b>Tasktraces</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.schedulingtrace.TaskTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasktraces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasktraces</em>' containment reference list.
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getProcessor_Tasktraces()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskTrace> getTasktraces();

	/**
	 * Returns the value of the '<em><b>Partitions</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.schedulingtrace.Partition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partitions</em>' reference list.
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getProcessor_Partitions()
	 * @model
	 * @generated
	 */
	EList<Partition> getPartitions();

	/**
	 * Returns the value of the '<em><b>Hardware Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Resource</em>' reference.
	 * @see #setHardwareResource(HardwareResource)
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getProcessor_HardwareResource()
	 * @model
	 * @generated
	 */
	HardwareResource getHardwareResource();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.schedulingtrace.Processor#getHardwareResource <em>Hardware Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Resource</em>' reference.
	 * @see #getHardwareResource()
	 * @generated
	 */
	void setHardwareResource(HardwareResource value);

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
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getProcessor_JobWithMaxRT()
	 * @model
	 * @generated
	 */
	Job getJobWithMaxRT();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.schedulingtrace.Processor#getJobWithMaxRT <em>Job With Max RT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job With Max RT</em>' reference.
	 * @see #getJobWithMaxRT()
	 * @generated
	 */
	void setJobWithMaxRT(Job value);

} // Processor
