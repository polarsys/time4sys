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
package org.polarsys.time4sys.marte.srm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.Alarm#getTimers <em>Timers</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.Alarm#isIsWatchdog <em>Is Watchdog</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getAlarm()
 * @model
 * @generated
 */
public interface Alarm extends InterruptResource {
	/**
	 * Returns the value of the '<em><b>Timers</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.srm.SoftwareTimerResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timers</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getAlarm_Timers()
	 * @model
	 * @generated
	 */
	EList<SoftwareTimerResource> getTimers();

	/**
	 * Returns the value of the '<em><b>Is Watchdog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Watchdog</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Watchdog</em>' attribute.
	 * @see #setIsWatchdog(boolean)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getAlarm_IsWatchdog()
	 * @model
	 * @generated
	 */
	boolean isIsWatchdog();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.Alarm#isIsWatchdog <em>Is Watchdog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Watchdog</em>' attribute.
	 * @see #isIsWatchdog()
	 * @generated
	 */
	void setIsWatchdog(boolean value);

} // Alarm
