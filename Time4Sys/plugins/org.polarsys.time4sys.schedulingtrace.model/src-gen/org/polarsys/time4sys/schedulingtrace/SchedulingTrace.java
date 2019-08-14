/**
 */
package org.polarsys.time4sys.schedulingtrace;

import org.eclipse.emf.common.util.EList;

import org.polarsys.time4sys.trace.Trace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.SchedulingTrace#getProcessors <em>Processors</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.SchedulingTrace#getJobWithMaxRT <em>Job With Max RT</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getSchedulingTrace()
 * @model
 * @generated
 */
public interface SchedulingTrace  extends Trace {
	/**
	 * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.schedulingtrace.Processor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processors</em>' containment reference list.
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getSchedulingTrace_Processors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Processor> getProcessors();

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
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getSchedulingTrace_JobWithMaxRT()
	 * @model
	 * @generated
	 */
	Job getJobWithMaxRT();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.schedulingtrace.SchedulingTrace#getJobWithMaxRT <em>Job With Max RT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job With Max RT</em>' reference.
	 * @see #getJobWithMaxRT()
	 * @generated
	 */
	void setJobWithMaxRT(Job value);

} // SchedulingTrace
