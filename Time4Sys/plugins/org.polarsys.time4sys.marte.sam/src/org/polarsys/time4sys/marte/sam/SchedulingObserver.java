/*******************************************************************************
 * Copyright (c) 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.sam;

import org.polarsys.time4sys.marte.gqam.TimedObserver;

import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling Observer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.sam.SchedulingObserver#getSuspensions <em>Suspensions</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.sam.SchedulingObserver#getBlockingTime <em>Blocking Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.sam.SchedulingObserver#getOverlaps <em>Overlaps</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.sam.SamPackage#getSchedulingObserver()
 * @model
 * @generated
 */
public interface SchedulingObserver extends TimedObserver {
	/**
	 * Returns the value of the '<em><b>Suspensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspensions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspensions</em>' attribute.
	 * @see #setSuspensions(Duration)
	 * @see org.polarsys.time4sys.marte.sam.SamPackage#getSchedulingObserver_Suspensions()
	 * @model dataType="org.polarsys.time4sys.marte.sam.NFP_Duration"
	 * @generated
	 */
	Duration getSuspensions();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.sam.SchedulingObserver#getSuspensions <em>Suspensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspensions</em>' attribute.
	 * @see #getSuspensions()
	 * @generated
	 */
	void setSuspensions(Duration value);

	/**
	 * Returns the value of the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocking Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocking Time</em>' attribute.
	 * @see #setBlockingTime(Duration)
	 * @see org.polarsys.time4sys.marte.sam.SamPackage#getSchedulingObserver_BlockingTime()
	 * @model dataType="org.polarsys.time4sys.marte.sam.NFP_Duration"
	 * @generated
	 */
	Duration getBlockingTime();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.sam.SchedulingObserver#getBlockingTime <em>Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocking Time</em>' attribute.
	 * @see #getBlockingTime()
	 * @generated
	 */
	void setBlockingTime(Duration value);

	/**
	 * Returns the value of the '<em><b>Overlaps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlaps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlaps</em>' attribute.
	 * @see #setOverlaps(Duration)
	 * @see org.polarsys.time4sys.marte.sam.SamPackage#getSchedulingObserver_Overlaps()
	 * @model dataType="org.polarsys.time4sys.marte.sam.NFP_Duration"
	 * @generated
	 */
	Duration getOverlaps();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.sam.SchedulingObserver#getOverlaps <em>Overlaps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlaps</em>' attribute.
	 * @see #getOverlaps()
	 * @generated
	 */
	void setOverlaps(Duration value);

} // SchedulingObserver
