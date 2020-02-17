/**
 */
package org.polarsys.time4sys.results.results;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Resource Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.SharedResourceResult#getUtilization <em>Utilization</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getSharedResourceResult()
 * @model
 * @generated
 */
public interface SharedResourceResult extends AtomicResult {
	/**
	 * Returns the value of the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilization</em>' attribute.
	 * @see #setUtilization(double)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getSharedResourceResult_Utilization()
	 * @model
	 * @generated
	 */
	double getUtilization();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.SharedResourceResult#getUtilization <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization</em>' attribute.
	 * @see #getUtilization()
	 * @generated
	 */
	void setUtilization(double value);

} // SharedResourceResult
