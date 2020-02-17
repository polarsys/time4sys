/**
 */
package org.polarsys.time4sys.results.results;

import org.eclipse.emf.common.util.EList;

import org.polarsys.time4sys.marte.grm.Resource;

import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;

import org.polarsys.time4sys.schedulingtrace.SchedulingTrace;

import org.polarsys.time4sys.trace.Slice;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Chain Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.TaskChainResult#getResource <em>Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.TaskChainResult#getSlice <em>Slice</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.TaskChainResult#getSchedulingTrace <em>Scheduling Trace</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getTaskChainResult()
 * @model
 * @generated
 */
public interface TaskChainResult extends NamedElement, TaskResult {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getTaskChainResult_Resource()
	 * @model
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.TaskChainResult#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Slice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slice</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slice</em>' reference.
	 * @see #setSlice(Slice)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getTaskChainResult_Slice()
	 * @model
	 * @generated
	 */
	Slice getSlice();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.TaskChainResult#getSlice <em>Slice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slice</em>' reference.
	 * @see #getSlice()
	 * @generated
	 */
	void setSlice(Slice value);

	/**
	 * Returns the value of the '<em><b>Scheduling Trace</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.schedulingtrace.SchedulingTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Trace</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Trace</em>' reference list.
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getTaskChainResult_SchedulingTrace()
	 * @model
	 * @generated
	 */
	EList<SchedulingTrace> getSchedulingTrace();

} // TaskChainResult
