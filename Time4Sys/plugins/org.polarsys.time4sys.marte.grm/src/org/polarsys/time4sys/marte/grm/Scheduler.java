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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.Scheduler#getHost <em>Host</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.Scheduler#getProcessingUnits <em>Processing Units</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.Scheduler#getSchedulableResource <em>Schedulable Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.Scheduler#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getScheduler()
 * @model
 * @generated
 */
public interface Scheduler extends ResourceBroker {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference.
	 * @see #setHost(ComputingResource)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getScheduler_Host()
	 * @model required="true"
	 * @generated
	 */
	ComputingResource getHost();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.Scheduler#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(ComputingResource value);

	/**
	 * Returns the value of the '<em><b>Processing Units</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ProcessingResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Units</em>' reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getScheduler_ProcessingUnits()
	 * @model required="true"
	 * @generated
	 */
	EList<ProcessingResource> getProcessingUnits();

	/**
	 * Returns the value of the '<em><b>Schedulable Resource</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.SchedulableResource}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.grm.SchedulableResource#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedulable Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedulable Resource</em>' reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getScheduler_SchedulableResource()
	 * @see org.polarsys.time4sys.marte.grm.SchedulableResource#getHost
	 * @model opposite="host"
	 * @generated
	 */
	EList<SchedulableResource> getSchedulableResource();

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference.
	 * @see #setPolicy(SchedulingPolicy)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getScheduler_Policy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SchedulingPolicy getPolicy();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.Scheduler#getPolicy <em>Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' containment reference.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(SchedulingPolicy value);

} // Scheduler
