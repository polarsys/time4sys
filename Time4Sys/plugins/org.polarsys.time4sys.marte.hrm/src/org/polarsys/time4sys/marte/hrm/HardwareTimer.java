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
package org.polarsys.time4sys.marte.hrm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareTimer#getInputClock <em>Input Clock</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareTimer()
 * @model
 * @generated
 */
public interface HardwareTimer extends HardwareTimingResource {
	/**
	 * Returns the value of the '<em><b>Input Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Clock</em>' reference.
	 * @see #setInputClock(HardwareClock)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareTimer_InputClock()
	 * @model required="true"
	 * @generated
	 */
	HardwareClock getInputClock();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareTimer#getInputClock <em>Input Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Clock</em>' reference.
	 * @see #getInputClock()
	 * @generated
	 */
	void setInputClock(HardwareClock value);

} // HardwareTimer
