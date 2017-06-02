/**
 */
package org.polarsys.time4sys.marte.nfp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.NormalDistribution#getMu <em>Mu</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.NormalDistribution#getSigma <em>Sigma</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getNormalDistribution()
 * @model
 * @generated
 */
public interface NormalDistribution extends ProbabilisticDuration {
	/**
	 * Returns the value of the '<em><b>Mu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mu</em>' attribute.
	 * @see #setMu(Duration)
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getNormalDistribution_Mu()
	 * @model dataType="org.polarsys.time4sys.marte.nfp.NFP_Duration" required="true"
	 * @generated
	 */
	Duration getMu();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.NormalDistribution#getMu <em>Mu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mu</em>' attribute.
	 * @see #getMu()
	 * @generated
	 */
	void setMu(Duration value);

	/**
	 * Returns the value of the '<em><b>Sigma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sigma</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sigma</em>' attribute.
	 * @see #setSigma(Duration)
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getNormalDistribution_Sigma()
	 * @model dataType="org.polarsys.time4sys.marte.nfp.NFP_Duration" required="true"
	 * @generated
	 */
	Duration getSigma();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.NormalDistribution#getSigma <em>Sigma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sigma</em>' attribute.
	 * @see #getSigma()
	 * @generated
	 */
	void setSigma(Duration value);

} // NormalDistribution
