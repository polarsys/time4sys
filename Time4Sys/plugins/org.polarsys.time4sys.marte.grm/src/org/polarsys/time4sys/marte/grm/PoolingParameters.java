/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.grm;

import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pooling Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.PoolingParameters#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.PoolingParameters#getOverhead <em>Overhead</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getPoolingParameters()
 * @model
 * @generated
 */
public interface PoolingParameters extends FixedPriorityParameters {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(Duration)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getPoolingParameters_Period()
	 * @model dataType="org.polarsys.time4sys.marte.grm.NFP_Duration"
	 * @generated
	 */
	Duration getPeriod();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.PoolingParameters#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Duration value);

	/**
	 * Returns the value of the '<em><b>Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overhead</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overhead</em>' attribute.
	 * @see #setOverhead(Duration)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getPoolingParameters_Overhead()
	 * @model dataType="org.polarsys.time4sys.marte.grm.NFP_Duration"
	 * @generated
	 */
	Duration getOverhead();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.PoolingParameters#getOverhead <em>Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overhead</em>' attribute.
	 * @see #getOverhead()
	 * @generated
	 */
	void setOverhead(Duration value);

} // PoolingParameters
