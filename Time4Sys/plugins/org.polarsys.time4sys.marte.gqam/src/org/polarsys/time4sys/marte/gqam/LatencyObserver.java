/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.gqam;

import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Latency Observer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.LatencyObserver#getLatency <em>Latency</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.LatencyObserver#getMissRatio <em>Miss Ratio</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.LatencyObserver#getMaxJitter <em>Max Jitter</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getLatencyObserver()
 * @model
 * @generated
 */
public interface LatencyObserver extends TimedObserver {
	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' attribute.
	 * @see #setLatency(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getLatencyObserver_Latency()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration"
	 * @generated
	 */
	Duration getLatency();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.LatencyObserver#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(Duration value);

	/**
	 * Returns the value of the '<em><b>Miss Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Miss Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Miss Ratio</em>' attribute.
	 * @see #setMissRatio(double)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getLatencyObserver_MissRatio()
	 * @model
	 * @generated
	 */
	double getMissRatio();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.LatencyObserver#getMissRatio <em>Miss Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Miss Ratio</em>' attribute.
	 * @see #getMissRatio()
	 * @generated
	 */
	void setMissRatio(double value);

	/**
	 * Returns the value of the '<em><b>Max Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Jitter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Jitter</em>' attribute.
	 * @see #setMaxJitter(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getLatencyObserver_MaxJitter()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration"
	 * @generated
	 */
	Duration getMaxJitter();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.LatencyObserver#getMaxJitter <em>Max Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Jitter</em>' attribute.
	 * @see #getMaxJitter()
	 * @generated
	 */
	void setMaxJitter(Duration value);

} // LatencyObserver
