/**
 */
package org.polarsys.time4sys.schedulingtrace;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preempted By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.PreemptedBy#getJob <em>Job</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.PreemptedBy#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getPreemptedBy()
 * @model
 * @generated
 */
public interface PreemptedBy extends EObject {
	/**
	 * Returns the value of the '<em><b>Job</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' reference.
	 * @see #setJob(Job)
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getPreemptedBy_Job()
	 * @model
	 * @generated
	 */
	Job getJob();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.schedulingtrace.PreemptedBy#getJob <em>Job</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job</em>' reference.
	 * @see #getJob()
	 * @generated
	 */
	void setJob(Job value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(Duration)
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getPreemptedBy_TimeStamp()
	 * @model dataType="org.polarsys.time4sys.trace.NFP_Duration"
	 * @generated
	 */
	Duration getTimeStamp();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.schedulingtrace.PreemptedBy#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(Duration value);

} // PreemptedBy
