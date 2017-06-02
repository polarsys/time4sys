/**
 */
package org.polarsys.time4sys.marte.nfp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.DiscreteDistribution#getBuckets <em>Buckets</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getDiscreteDistribution()
 * @model
 * @generated
 */
public interface DiscreteDistribution extends ProbabilisticDuration {
	/**
	 * Returns the value of the '<em><b>Buckets</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.nfp.Bucket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buckets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buckets</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getDiscreteDistribution_Buckets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Bucket> getBuckets();

} // DiscreteDistribution
