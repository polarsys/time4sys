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
package org.polarsys.time4sys.marte.grm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.ProcessingResource#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.ProcessingResource#getMainScheduler <em>Main Scheduler</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getProcessingResource()
 * @model abstract="true"
 * @generated
 */
public interface ProcessingResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Factor</em>' attribute.
	 * @see #setSpeedFactor(float)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getProcessingResource_SpeedFactor()
	 * @model
	 * @generated
	 */
	float getSpeedFactor();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.ProcessingResource#getSpeedFactor <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Factor</em>' attribute.
	 * @see #getSpeedFactor()
	 * @generated
	 */
	void setSpeedFactor(float value);

	/**
	 * Returns the value of the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Scheduler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Scheduler</em>' reference.
	 * @see #setMainScheduler(Scheduler)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getProcessingResource_MainScheduler()
	 * @model
	 * @generated
	 */
	Scheduler getMainScheduler();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.ProcessingResource#getMainScheduler <em>Main Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Scheduler</em>' reference.
	 * @see #getMainScheduler()
	 * @generated
	 */
	void setMainScheduler(Scheduler value);

} // ProcessingResource
