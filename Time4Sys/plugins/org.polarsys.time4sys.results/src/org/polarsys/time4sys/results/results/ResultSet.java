/**
 */
package org.polarsys.time4sys.results.results;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.ResultSet#getDate <em>Date</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.ResultSet#getToolName <em>Tool Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.ResultSet#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getResultSet()
 * @model
 * @generated
 */
public interface ResultSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getResultSet_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.ResultSet#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Tool Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Name</em>' attribute.
	 * @see #setToolName(String)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getResultSet_ToolName()
	 * @model
	 * @generated
	 */
	String getToolName();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.ResultSet#getToolName <em>Tool Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Name</em>' attribute.
	 * @see #getToolName()
	 * @generated
	 */
	void setToolName(String value);

	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.results.results.AbstractResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getResultSet_Results()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractResult> getResults();

} // ResultSet
