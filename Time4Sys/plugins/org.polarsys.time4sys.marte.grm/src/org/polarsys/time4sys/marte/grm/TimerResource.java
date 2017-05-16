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
package org.polarsys.time4sys.marte.grm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.TimerResource#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.TimerResource#isIsPeriodic <em>Is Periodic</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.TimerResource#getStart <em>Start</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.TimerResource#getSet <em>Set</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.TimerResource#getGet <em>Get</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.TimerResource#getReset <em>Reset</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.TimerResource#getPause <em>Pause</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTimerResource()
 * @model
 * @generated
 */
public interface TimerResource extends TimingResource {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(float)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTimerResource_Duration()
	 * @model
	 * @generated
	 */
	float getDuration();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.TimerResource#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(float value);

	/**
	 * Returns the value of the '<em><b>Is Periodic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Periodic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Periodic</em>' attribute.
	 * @see #setIsPeriodic(boolean)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTimerResource_IsPeriodic()
	 * @model
	 * @generated
	 */
	boolean isIsPeriodic();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.TimerResource#isIsPeriodic <em>Is Periodic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Periodic</em>' attribute.
	 * @see #isIsPeriodic()
	 * @generated
	 */
	void setIsPeriodic(boolean value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(ResourceService)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTimerResource_Start()
	 * @model required="true"
	 * @generated
	 */
	ResourceService getStart();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.TimerResource#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(ResourceService value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' reference.
	 * @see #setSet(ResourceService)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTimerResource_Set()
	 * @model required="true"
	 * @generated
	 */
	ResourceService getSet();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.TimerResource#getSet <em>Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(ResourceService value);

	/**
	 * Returns the value of the '<em><b>Get</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get</em>' reference.
	 * @see #setGet(ResourceService)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTimerResource_Get()
	 * @model required="true"
	 * @generated
	 */
	ResourceService getGet();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.TimerResource#getGet <em>Get</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get</em>' reference.
	 * @see #getGet()
	 * @generated
	 */
	void setGet(ResourceService value);

	/**
	 * Returns the value of the '<em><b>Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset</em>' reference.
	 * @see #setReset(ResourceService)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTimerResource_Reset()
	 * @model required="true"
	 * @generated
	 */
	ResourceService getReset();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.TimerResource#getReset <em>Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset</em>' reference.
	 * @see #getReset()
	 * @generated
	 */
	void setReset(ResourceService value);

	/**
	 * Returns the value of the '<em><b>Pause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pause</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pause</em>' reference.
	 * @see #setPause(ResourceService)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTimerResource_Pause()
	 * @model required="true"
	 * @generated
	 */
	ResourceService getPause();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.TimerResource#getPause <em>Pause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pause</em>' reference.
	 * @see #getPause()
	 * @generated
	 */
	void setPause(ResourceService value);

} // TimerResource
