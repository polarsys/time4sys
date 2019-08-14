/**
 */
package org.polarsys.time4sys.results.results;

import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.mapping.Mapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Result Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.AbstractResultSet#getToolName <em>Tool Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.AbstractResultSet#getDate <em>Date</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.AbstractResultSet#getResults <em>Results</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.AbstractResultSet#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getAbstractResultSet()
 * @model abstract="true"
 * @generated
 */
public interface AbstractResultSet extends EObject {

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
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getAbstractResultSet_ToolName()
	 * @model
	 * @generated
	 */
	String getToolName();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.AbstractResultSet#getToolName <em>Tool Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Name</em>' attribute.
	 * @see #getToolName()
	 * @generated
	 */
	void setToolName(String value);

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
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getAbstractResultSet_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.AbstractResultSet#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

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
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getAbstractResultSet_Results()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractResult> getResults();

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(Mapping)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getAbstractResultSet_Mapping()
	 * @model containment="true"
	 * @generated
	 */
	Mapping getMapping();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.AbstractResultSet#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(Mapping value);

} // AbstractResultSet
