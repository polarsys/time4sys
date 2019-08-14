/**
 */
package org.polarsys.time4sys.results.results;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Task Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.CustomTaskResult#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.CustomTaskResult#getBusyWindowLength <em>Busy Window Length</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getCustomTaskResult()
 * @model
 * @generated
 */
public interface CustomTaskResult extends TaskResult {
	/**
	 * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Size</em>' attribute.
	 * @see #setBufferSize(int)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getCustomTaskResult_BufferSize()
	 * @model
	 * @generated
	 */
	int getBufferSize();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.CustomTaskResult#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(int value);

	/**
	 * Returns the value of the '<em><b>Busy Window Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busy Window Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busy Window Length</em>' attribute.
	 * @see #setBusyWindowLength(int)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getCustomTaskResult_BusyWindowLength()
	 * @model
	 * @generated
	 */
	int getBusyWindowLength();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.CustomTaskResult#getBusyWindowLength <em>Busy Window Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Busy Window Length</em>' attribute.
	 * @see #getBusyWindowLength()
	 * @generated
	 */
	void setBusyWindowLength(int value);

} // CustomTaskResult
