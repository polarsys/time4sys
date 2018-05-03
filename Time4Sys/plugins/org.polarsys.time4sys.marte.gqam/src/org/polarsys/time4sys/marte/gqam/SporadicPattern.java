/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
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
 * A representation of the model object '<em><b>Sporadic Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * It describes a bounded pattern that is defined by a corner case interarrival times and a maximum deviation (jitter).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.SporadicPattern#getMinInterarrival <em>Min Interarrival</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.SporadicPattern#getMaxInterarrival <em>Max Interarrival</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getSporadicPattern()
 * @model
 * @generated
 */
public interface SporadicPattern extends ArrivalPattern {
	/**
	 * Returns the value of the '<em><b>Min Interarrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Interarrival</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Interarrival</em>' attribute.
	 * @see #setMinInterarrival(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getSporadicPattern_MinInterarrival()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration"
	 * @generated
	 */
	Duration getMinInterarrival();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.SporadicPattern#getMinInterarrival <em>Min Interarrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Interarrival</em>' attribute.
	 * @see #getMinInterarrival()
	 * @generated
	 */
	void setMinInterarrival(Duration value);

	/**
	 * Returns the value of the '<em><b>Max Interarrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Interarrival</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Interarrival</em>' attribute.
	 * @see #setMaxInterarrival(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getSporadicPattern_MaxInterarrival()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration"
	 * @generated
	 */
	Duration getMaxInterarrival();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.SporadicPattern#getMaxInterarrival <em>Max Interarrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Interarrival</em>' attribute.
	 * @see #getMaxInterarrival()
	 * @generated
	 */
	void setMaxInterarrival(Duration value);

} // SporadicPattern
