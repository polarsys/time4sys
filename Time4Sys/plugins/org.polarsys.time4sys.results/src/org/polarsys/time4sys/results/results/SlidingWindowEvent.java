/**
 */
package org.polarsys.time4sys.results.results;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sliding Window Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.SlidingWindowEvent#getNbEvents <em>Nb Events</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.SlidingWindowEvent#getWindowSize <em>Window Size</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getSlidingWindowEvent()
 * @model
 * @generated
 */
public interface SlidingWindowEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Nb Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Events</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Events</em>' attribute.
	 * @see #setNbEvents(int)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getSlidingWindowEvent_NbEvents()
	 * @model
	 * @generated
	 */
	int getNbEvents();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.SlidingWindowEvent#getNbEvents <em>Nb Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Events</em>' attribute.
	 * @see #getNbEvents()
	 * @generated
	 */
	void setNbEvents(int value);

	/**
	 * Returns the value of the '<em><b>Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window Size</em>' attribute.
	 * @see #setWindowSize(int)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getSlidingWindowEvent_WindowSize()
	 * @model
	 * @generated
	 */
	int getWindowSize();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.SlidingWindowEvent#getWindowSize <em>Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window Size</em>' attribute.
	 * @see #getWindowSize()
	 * @generated
	 */
	void setWindowSize(int value);

} // SlidingWindowEvent
