/**
 */
package org.polarsys.time4sys.marte.nfp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.CompositeDistribution#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getCompositeDistribution()
 * @model
 * @generated
 */
public interface CompositeDistribution extends ProbabilisticDuration {
	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.nfp.ProbabilisticDuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getCompositeDistribution_Parts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProbabilisticDuration> getParts();

} // CompositeDistribution
