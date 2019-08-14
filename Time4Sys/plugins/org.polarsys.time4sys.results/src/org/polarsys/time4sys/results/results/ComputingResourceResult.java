/**
 */
package org.polarsys.time4sys.results.results;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Resource Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.ComputingResourceResult#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getComputingResourceResult()
 * @model
 * @generated
 */
public interface ComputingResourceResult extends AtomicResult {

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getComputingResourceResult_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.ComputingResourceResult#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);
} // ComputingResourceResult
