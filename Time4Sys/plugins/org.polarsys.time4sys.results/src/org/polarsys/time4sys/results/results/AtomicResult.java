/**
 */
package org.polarsys.time4sys.results.results;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.AtomicResult#getLoad <em>Load</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.AtomicResult#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getAtomicResult()
 * @model abstract="true"
 * @generated
 */
public interface AtomicResult extends AbstractResult {
	/**
	 * Returns the value of the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load</em>' attribute.
	 * @see #setLoad(double)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getAtomicResult_Load()
	 * @model
	 * @generated
	 */
	double getLoad();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.AtomicResult#getLoad <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load</em>' attribute.
	 * @see #getLoad()
	 * @generated
	 */
	void setLoad(double value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.results.results.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getAtomicResult_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // AtomicResult
