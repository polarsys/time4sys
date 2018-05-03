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
 * A representation of the model object '<em><b>Burst Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * It describes a bursty interarrival pattern with a number of events that can occur in a bounded period.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.BurstPattern#getMinInterarrival <em>Min Interarrival</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.BurstPattern#getMaxInterarrival <em>Max Interarrival</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.BurstPattern#getMinEventInterval <em>Min Event Interval</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.BurstPattern#getMaxEventInterval <em>Max Event Interval</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.BurstPattern#getBurstSize <em>Burst Size</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getBurstPattern()
 * @model
 * @generated
 */
public interface BurstPattern extends ArrivalPattern {
	/**
	 * Returns the value of the '<em><b>Min Interarrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum interarrival duration between two successive occurrences of a burst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Interarrival</em>' attribute.
	 * @see #setMinInterarrival(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getBurstPattern_MinInterarrival()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration" required="true"
	 * @generated
	 */
	Duration getMinInterarrival();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.BurstPattern#getMinInterarrival <em>Min Interarrival</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum interarrival duration between two successive occurrences of a burst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Interarrival</em>' attribute.
	 * @see #setMaxInterarrival(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getBurstPattern_MaxInterarrival()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration"
	 * @generated
	 */
	Duration getMaxInterarrival();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.BurstPattern#getMaxInterarrival <em>Max Interarrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Interarrival</em>' attribute.
	 * @see #getMaxInterarrival()
	 * @generated
	 */
	void setMaxInterarrival(Duration value);

	/**
	 * Returns the value of the '<em><b>Min Event Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum interval between two event occurrences within a burst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Event Interval</em>' attribute.
	 * @see #setMinEventInterval(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getBurstPattern_MinEventInterval()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration" required="true"
	 * @generated
	 */
	Duration getMinEventInterval();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.BurstPattern#getMinEventInterval <em>Min Event Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Event Interval</em>' attribute.
	 * @see #getMinEventInterval()
	 * @generated
	 */
	void setMinEventInterval(Duration value);

	/**
	 * Returns the value of the '<em><b>Max Event Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum interval between two event occurrences within a burst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Event Interval</em>' attribute.
	 * @see #setMaxEventInterval(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getBurstPattern_MaxEventInterval()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration"
	 * @generated
	 */
	Duration getMaxEventInterval();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.BurstPattern#getMaxEventInterval <em>Max Event Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Event Interval</em>' attribute.
	 * @see #getMaxEventInterval()
	 * @generated
	 */
	void setMaxEventInterval(Duration value);

	/**
	 * Returns the value of the '<em><b>Burst Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of event occurrences within a burst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Burst Size</em>' attribute.
	 * @see #setBurstSize(long)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getBurstPattern_BurstSize()
	 * @model required="true"
	 * @generated
	 */
	long getBurstSize();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.BurstPattern#getBurstSize <em>Burst Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Burst Size</em>' attribute.
	 * @see #getBurstSize()
	 * @generated
	 */
	void setBurstSize(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueDataType="org.polarsys.time4sys.marte.gqam.NFP_Duration" valueRequired="true"
	 * @generated
	 */
	void setOuterPeriod(Duration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueDataType="org.polarsys.time4sys.marte.gqam.NFP_Duration" valueRequired="true"
	 * @generated
	 */
	void setInnerPeriod(Duration value);

} // BurstPattern
