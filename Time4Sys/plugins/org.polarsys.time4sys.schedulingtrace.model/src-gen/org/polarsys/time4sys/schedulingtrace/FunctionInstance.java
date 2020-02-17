/**
 */
package org.polarsys.time4sys.schedulingtrace;

import org.polarsys.time4sys.marte.gqam.Step;

import org.polarsys.time4sys.trace.Slice;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.FunctionInstance#getJob <em>Job</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.FunctionInstance#getStep <em>Step</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.FunctionInstance#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getFunctionInstance()
 * @model
 * @generated
 */
public interface FunctionInstance extends Slice {
	/**
	 * Returns the value of the '<em><b>Job</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.schedulingtrace.Job#getFunctionInstances <em>Function Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' container reference.
	 * @see #setJob(Job)
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getFunctionInstance_Job()
	 * @see org.polarsys.time4sys.schedulingtrace.Job#getFunctionInstances
	 * @model opposite="functionInstances" transient="false"
	 * @generated
	 */
	Job getJob();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.schedulingtrace.FunctionInstance#getJob <em>Job</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job</em>' container reference.
	 * @see #getJob()
	 * @generated
	 */
	void setJob(Job value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' reference.
	 * @see #setStep(Step)
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getFunctionInstance_Step()
	 * @model
	 * @generated
	 */
	Step getStep();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.schedulingtrace.FunctionInstance#getStep <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(Step value);

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
	 * @see org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage#getFunctionInstance_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.schedulingtrace.FunctionInstance#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

} // FunctionInstance
