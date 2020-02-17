/**
 */
package org.polarsys.time4sys.results.results;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Task Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.AbstractTaskResult#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.AbstractTaskResult#getLoad <em>Load</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getAbstractTaskResult()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTaskResult extends AbstractResult {
	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(EObject)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getAbstractTaskResult_RefersTo()
	 * @model
	 * @generated
	 */
	EObject getRefersTo();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.AbstractTaskResult#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(EObject value);

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
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getAbstractTaskResult_Load()
	 * @model
	 * @generated
	 */
	double getLoad();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.AbstractTaskResult#getLoad <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load</em>' attribute.
	 * @see #getLoad()
	 * @generated
	 */
	void setLoad(double value);

} // AbstractTaskResult
