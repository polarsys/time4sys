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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedulable Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.SchedulableResource#getDependentScheduler <em>Dependent Scheduler</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.SchedulableResource#getHost <em>Host</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.SchedulableResource#getSchedParams <em>Sched Params</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getSchedulableResource()
 * @model
 * @generated
 */
public interface SchedulableResource extends ConcurrencyResource {
	/**
	 * Returns the value of the '<em><b>Dependent Scheduler</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.grm.SecondaryScheduler#getVirtualProcessingUnit <em>Virtual Processing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Scheduler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Scheduler</em>' reference.
	 * @see #setDependentScheduler(SecondaryScheduler)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getSchedulableResource_DependentScheduler()
	 * @see org.polarsys.time4sys.marte.grm.SecondaryScheduler#getVirtualProcessingUnit
	 * @model opposite="virtualProcessingUnit"
	 * @generated
	 */
	SecondaryScheduler getDependentScheduler();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.SchedulableResource#getDependentScheduler <em>Dependent Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Scheduler</em>' reference.
	 * @see #getDependentScheduler()
	 * @generated
	 */
	void setDependentScheduler(SecondaryScheduler value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.grm.Scheduler#getSchedulableResource <em>Schedulable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference.
	 * @see #setHost(Scheduler)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getSchedulableResource_Host()
	 * @see org.polarsys.time4sys.marte.grm.Scheduler#getSchedulableResource
	 * @model opposite="schedulableResource" required="true"
	 * @generated
	 */
	Scheduler getHost();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.SchedulableResource#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(Scheduler value);

	/**
	 * Returns the value of the '<em><b>Sched Params</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.SchedulingParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sched Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sched Params</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getSchedulableResource_SchedParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchedulingParameter> getSchedParams();

} // SchedulableResource
