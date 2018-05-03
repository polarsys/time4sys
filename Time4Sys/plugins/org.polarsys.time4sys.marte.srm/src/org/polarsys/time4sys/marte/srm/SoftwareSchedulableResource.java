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
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.grm.SchedulableResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Schedulable Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#isIsStaticSchedulingFeature <em>Is Static Scheduling Feature</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#isIsPreemptable <em>Is Preemptable</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getDeadlineElements <em>Deadline Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getDeadlineTypeElements <em>Deadline Type Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getTimeSliceElements <em>Time Slice Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getJoinServices <em>Join Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getYieldServices <em>Yield Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getDelayServices <em>Delay Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getScheduler <em>Scheduler</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareSchedulableResource()
 * @model
 * @generated
 */
public interface SoftwareSchedulableResource extends SchedulableResource, SoftwareConcurrentResource {
	/**
	 * Returns the value of the '<em><b>Is Static Scheduling Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static Scheduling Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static Scheduling Feature</em>' attribute.
	 * @see #setIsStaticSchedulingFeature(boolean)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareSchedulableResource_IsStaticSchedulingFeature()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsStaticSchedulingFeature();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#isIsStaticSchedulingFeature <em>Is Static Scheduling Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static Scheduling Feature</em>' attribute.
	 * @see #isIsStaticSchedulingFeature()
	 * @generated
	 */
	void setIsStaticSchedulingFeature(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Preemptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Preemptable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Preemptable</em>' attribute.
	 * @see #setIsPreemptable(boolean)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareSchedulableResource_IsPreemptable()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPreemptable();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#isIsPreemptable <em>Is Preemptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Preemptable</em>' attribute.
	 * @see #isIsPreemptable()
	 * @generated
	 */
	void setIsPreemptable(boolean value);

	/**
	 * Returns the value of the '<em><b>Deadline Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareSchedulableResource_DeadlineElements()
	 * @model
	 * @generated
	 */
	EList<String> getDeadlineElements();

	/**
	 * Returns the value of the '<em><b>Deadline Type Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline Type Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline Type Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareSchedulableResource_DeadlineTypeElements()
	 * @model
	 * @generated
	 */
	EList<String> getDeadlineTypeElements();

	/**
	 * Returns the value of the '<em><b>Time Slice Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Slice Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Slice Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareSchedulableResource_TimeSliceElements()
	 * @model
	 * @generated
	 */
	EList<String> getTimeSliceElements();

	/**
	 * Returns the value of the '<em><b>Join Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareSchedulableResource_JoinServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getJoinServices();

	/**
	 * Returns the value of the '<em><b>Yield Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yield Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yield Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareSchedulableResource_YieldServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getYieldServices();

	/**
	 * Returns the value of the '<em><b>Delay Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareSchedulableResource_DelayServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getDelayServices();

	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.srm.SoftwareScheduler#getScheduledResource <em>Scheduled Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' reference.
	 * @see #setScheduler(SoftwareScheduler)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareSchedulableResource_Scheduler()
	 * @see org.polarsys.time4sys.marte.srm.SoftwareScheduler#getScheduledResource
	 * @model opposite="scheduledResource" required="true"
	 * @generated
	 */
	SoftwareScheduler getScheduler();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getScheduler <em>Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' reference.
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(SoftwareScheduler value);

} // SoftwareSchedulableResource
