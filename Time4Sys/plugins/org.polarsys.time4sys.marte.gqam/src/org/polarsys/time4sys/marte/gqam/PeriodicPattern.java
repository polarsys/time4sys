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
 * A representation of the model object '<em><b>Periodic Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * It describes periodic interarrival patterns, with an optional maximal deviation (jitter).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.PeriodicPattern#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.PeriodicPattern#getOccurences <em>Occurences</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getPeriodicPattern()
 * @model
 * @generated
 */
public interface PeriodicPattern extends ArrivalPattern {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getPeriodicPattern_Period()
	 * @model default="" dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration"
	 * @generated
	 */
	Duration getPeriod();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.PeriodicPattern#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Duration value);

	/**
	 * Returns the value of the '<em><b>Occurences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurences</em>' attribute.
	 * @see #setOccurences(int)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getPeriodicPattern_Occurences()
	 * @model
	 * @generated
	 */
	int getOccurences();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.PeriodicPattern#getOccurences <em>Occurences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurences</em>' attribute.
	 * @see #getOccurences()
	 * @generated
	 */
	void setOccurences(int value);

} // PeriodicPattern
