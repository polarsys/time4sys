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
 * A representation of the model object '<em><b>Uniform Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.UniformDistribution#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getUniformDistribution()
 * @model
 * @generated
 */
public interface UniformDistribution extends ProbabilisticDuration {

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(TimeInterval)
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getUniformDistribution_Interval()
	 * @model dataType="org.polarsys.time4sys.marte.nfp.NFP_TimeInterval" required="true"
	 * @generated
	 */
	TimeInterval getInterval();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.UniformDistribution#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(TimeInterval value);
} // UniformDistribution
