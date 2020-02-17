/**
 */
package org.polarsys.time4sys.results.results;

import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Result Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.AnalysisResultSet#getNbOfIterations <em>Nb Of Iterations</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.AnalysisResultSet#isHasConverged <em>Has Converged</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getAnalysisResultSet()
 * @model
 * @generated
 */
public interface AnalysisResultSet extends NamedElement, AbstractResultSet {
	/**
	 * Returns the value of the '<em><b>Nb Of Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Of Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Of Iterations</em>' attribute.
	 * @see #setNbOfIterations(int)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getAnalysisResultSet_NbOfIterations()
	 * @model
	 * @generated
	 */
	int getNbOfIterations();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.AnalysisResultSet#getNbOfIterations <em>Nb Of Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Of Iterations</em>' attribute.
	 * @see #getNbOfIterations()
	 * @generated
	 */
	void setNbOfIterations(int value);

	/**
	 * Returns the value of the '<em><b>Has Converged</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Converged</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Converged</em>' attribute.
	 * @see #setHasConverged(boolean)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getAnalysisResultSet_HasConverged()
	 * @model default="false"
	 * @generated
	 */
	boolean isHasConverged();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.AnalysisResultSet#isHasConverged <em>Has Converged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Converged</em>' attribute.
	 * @see #isHasConverged()
	 * @generated
	 */
	void setHasConverged(boolean value);

} // AnalysisResultSet
