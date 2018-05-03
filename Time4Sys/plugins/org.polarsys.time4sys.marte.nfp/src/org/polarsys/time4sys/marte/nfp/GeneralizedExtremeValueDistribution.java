/*******************************************************************************
 * Copyright (c) 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.nfp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalized Extreme Value Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution#getMu <em>Mu</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution#getSigma <em>Sigma</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution#getXi <em>Xi</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getGeneralizedExtremeValueDistribution()
 * @model
 * @generated
 */
public interface GeneralizedExtremeValueDistribution extends ProbabilisticDuration {
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
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getGeneralizedExtremeValueDistribution_Mu()
	 * @model dataType="org.polarsys.time4sys.marte.nfp.NFP_Duration" required="true"
	 * @generated
	 */
	Duration getMu();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution#getMu <em>Mu</em>}' attribute.
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
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getGeneralizedExtremeValueDistribution_Sigma()
	 * @model dataType="org.polarsys.time4sys.marte.nfp.NFP_Duration" required="true"
	 * @generated
	 */
	Duration getSigma();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution#getSigma <em>Sigma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sigma</em>' attribute.
	 * @see #getSigma()
	 * @generated
	 */
	void setSigma(Duration value);

	/**
	 * Returns the value of the '<em><b>Xi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xi</em>' attribute.
	 * @see #setXi(Duration)
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getGeneralizedExtremeValueDistribution_Xi()
	 * @model dataType="org.polarsys.time4sys.marte.nfp.NFP_Duration" required="true"
	 * @generated
	 */
	Duration getXi();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution#getXi <em>Xi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xi</em>' attribute.
	 * @see #getXi()
	 * @generated
	 */
	void setXi(Duration value);

} // GeneralizedExtremeValueDistribution
