/**
 */
package org.polarsys.time4sys.results.results;

import org.eclipse.emf.common.util.EList;

import org.polarsys.time4sys.design.DesignModel;

import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Set Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.ResultSetContainer#getResultSet <em>Result Set</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.ResultSetContainer#getDesignModel <em>Design Model</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getResultSetContainer()
 * @model
 * @generated
 */
public interface ResultSetContainer extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Result Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.results.results.AbstractResultSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Set</em>' containment reference list.
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getResultSetContainer_ResultSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractResultSet> getResultSet();

	/**
	 * Returns the value of the '<em><b>Design Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Model</em>' reference.
	 * @see #setDesignModel(DesignModel)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getResultSetContainer_DesignModel()
	 * @model required="true"
	 * @generated
	 */
	DesignModel getDesignModel();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.ResultSetContainer#getDesignModel <em>Design Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Model</em>' reference.
	 * @see #getDesignModel()
	 * @generated
	 */
	void setDesignModel(DesignModel value);

} // ResultSetContainer
