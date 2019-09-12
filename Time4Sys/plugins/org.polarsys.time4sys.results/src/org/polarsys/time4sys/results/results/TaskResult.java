/**
 */
package org.polarsys.time4sys.results.results;

import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.TaskResult#getEvent <em>Event</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.TaskResult#getSlack <em>Slack</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.TaskResult#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.TaskResult#getNbOfSuspension <em>Nb Of Suspension</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.TaskResult#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.TaskResult#getBCET <em>BCET</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.TaskResult#getWCET <em>WCET</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getTaskResult()
 * @model
 * @generated
 */
public interface TaskResult extends AtomicResult {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(Event)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getTaskResult_Event()
	 * @model containment="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.TaskResult#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #setDeadline(Duration)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getTaskResult_Deadline()
	 * @model dataType="org.polarsys.time4sys.marte.nfp.NFP_Duration"
	 * @generated
	 */
	Duration getDeadline();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.TaskResult#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(Duration value);

	/**
	 * Returns the value of the '<em><b>BCET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BCET</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BCET</em>' attribute.
	 * @see #setBCET(Duration)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getTaskResult_BCET()
	 * @model dataType="org.polarsys.time4sys.marte.nfp.NFP_Duration"
	 * @generated
	 */
	Duration getBCET();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.TaskResult#getBCET <em>BCET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BCET</em>' attribute.
	 * @see #getBCET()
	 * @generated
	 */
	void setBCET(Duration value);

	/**
	 * Returns the value of the '<em><b>WCET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WCET</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WCET</em>' attribute.
	 * @see #setWCET(Duration)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getTaskResult_WCET()
	 * @model dataType="org.polarsys.time4sys.marte.nfp.NFP_Duration"
	 * @generated
	 */
	Duration getWCET();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.TaskResult#getWCET <em>WCET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WCET</em>' attribute.
	 * @see #getWCET()
	 * @generated
	 */
	void setWCET(Duration value);

	/**
	 * Returns the value of the '<em><b>Slack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slack</em>' attribute.
	 * @see #setSlack(double)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getTaskResult_Slack()
	 * @model
	 * @generated
	 */
	double getSlack();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.TaskResult#getSlack <em>Slack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slack</em>' attribute.
	 * @see #getSlack()
	 * @generated
	 */
	void setSlack(double value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getTaskResult_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.TaskResult#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Nb Of Suspension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Of Suspension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Of Suspension</em>' attribute.
	 * @see #setNbOfSuspension(int)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getTaskResult_NbOfSuspension()
	 * @model
	 * @generated
	 */
	int getNbOfSuspension();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.TaskResult#getNbOfSuspension <em>Nb Of Suspension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Of Suspension</em>' attribute.
	 * @see #getNbOfSuspension()
	 * @generated
	 */
	void setNbOfSuspension(int value);

} // TaskResult
