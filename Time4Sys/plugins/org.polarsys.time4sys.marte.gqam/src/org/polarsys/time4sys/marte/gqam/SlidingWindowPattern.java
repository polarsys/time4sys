/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.gqam;

import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sliding Window Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.SlidingWindowPattern#getWindowSize <em>Window Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.SlidingWindowPattern#getNbEvents <em>Nb Events</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getSlidingWindowPattern()
 * @model
 * @generated
 */
public interface SlidingWindowPattern extends ArrivalPattern {
	/**
	 * Returns the value of the '<em><b>Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window Size</em>' attribute.
	 * @see #setWindowSize(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getSlidingWindowPattern_WindowSize()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration" required="true"
	 * @generated
	 */
	Duration getWindowSize();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.SlidingWindowPattern#getWindowSize <em>Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window Size</em>' attribute.
	 * @see #getWindowSize()
	 * @generated
	 */
	void setWindowSize(Duration value);

	/**
	 * Returns the value of the '<em><b>Nb Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Events</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Events</em>' attribute.
	 * @see #setNbEvents(long)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getSlidingWindowPattern_NbEvents()
	 * @model
	 * @generated
	 */
	long getNbEvents();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.SlidingWindowPattern#getNbEvents <em>Nb Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Events</em>' attribute.
	 * @see #getNbEvents()
	 * @generated
	 */
	void setNbEvents(long value);

} // SlidingWindowPattern
