/**
 */
package org.polarsys.time4sys.results.results;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.ReferencedResult#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getReferencedResult()
 * @model
 * @generated
 */
public interface ReferencedResult extends AbstractResultReference {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(EObject)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getReferencedResult_Data()
	 * @model
	 * @generated
	 */
	EObject getData();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.ReferencedResult#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(EObject value);

} // ReferencedResult
