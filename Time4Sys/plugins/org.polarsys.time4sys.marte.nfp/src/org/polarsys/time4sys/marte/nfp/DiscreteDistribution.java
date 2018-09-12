/*******************************************************************************
 * Copyright (c) 2017, 2018 Artal Technologies and others.
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
 *   <li>{@link org.polarsys.time4sys.marte.nfp.DiscreteDistribution#getKind <em>Kind</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"Undef"</code>.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.nfp.DiscreteDistributionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.marte.nfp.DiscreteDistributionKind
	 * @see #setKind(DiscreteDistributionKind)
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getDiscreteDistribution_Kind()
	 * @model default="Undef" required="true"
	 * @generated
	 */
	DiscreteDistributionKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.DiscreteDistribution#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.marte.nfp.DiscreteDistributionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DiscreteDistributionKind value);

	void addBucket(double probability, Duration value);

} // DiscreteDistribution
