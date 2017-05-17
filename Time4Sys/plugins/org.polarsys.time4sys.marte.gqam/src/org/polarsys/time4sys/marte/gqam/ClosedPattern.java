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
 * A representation of the model object '<em><b>Closed Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a TupleType that contains the parameters that are necessary to specify a closed pattern. It is characterized by a
 * fixed number of active or potential users or jobs that cycle between executing the scenario, and spending an external
 * delay period (sometimes called “think time”) outside the system, between the end of one response and the next request.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.ClosedPattern#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.ClosedPattern#getExtDelay <em>Ext Delay</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getClosedPattern()
 * @model
 * @generated
 */
public interface ClosedPattern extends ArrivalPattern {
	/**
	 * Returns the value of the '<em><b>Population</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of the workload (number of system users).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Population</em>' attribute.
	 * @see #setPopulation(long)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getClosedPattern_Population()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getPopulation();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.ClosedPattern#getPopulation <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' attribute.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(long value);

	/**
	 * Returns the value of the '<em><b>Ext Delay</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The delay between the end of one response and the start of the next for each member of the population of system
	 * users.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ext Delay</em>' attribute.
	 * @see #setExtDelay(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getClosedPattern_ExtDelay()
	 * @model default="0" dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration" required="true"
	 * @generated
	 */
	Duration getExtDelay();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.ClosedPattern#getExtDelay <em>Ext Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext Delay</em>' attribute.
	 * @see #getExtDelay()
	 * @generated
	 */
	void setExtDelay(Duration value);

} // ClosedPattern
