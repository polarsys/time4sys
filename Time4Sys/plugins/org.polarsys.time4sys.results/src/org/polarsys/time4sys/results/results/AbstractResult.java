/**
 */
package org.polarsys.time4sys.results.results;

import org.eclipse.emf.common.util.EList;
import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.AbstractResult#getSubResults <em>Sub Results</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getAbstractResult()
 * @model abstract="true"
 * @generated
 */
public interface AbstractResult extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.results.results.AbstractResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Results</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Results</em>' containment reference list.
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getAbstractResult_SubResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractResult> getSubResults();

} // AbstractResult
