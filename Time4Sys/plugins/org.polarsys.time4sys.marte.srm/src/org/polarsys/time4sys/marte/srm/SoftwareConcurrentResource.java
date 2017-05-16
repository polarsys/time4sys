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
package org.polarsys.time4sys.marte.srm;

import org.eclipse.emf.common.util.EList;

import org.polarsys.time4sys.marte.grm.ConcurrencyResource;
import org.polarsys.time4sys.marte.grm.ResourceService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Concurrent Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getActivateServices <em>Activate Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getResumeServices <em>Resume Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getSuspendServices <em>Suspend Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getEnableConcurrencyServices <em>Enable Concurrency Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getDisableConcurrencyServices <em>Disable Concurrency Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getTerminateServices <em>Terminate Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getAdressSpace <em>Adress Space</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getPeriodElements <em>Period Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getActivationCapacity <em>Activation Capacity</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getPriorityElements <em>Priority Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getStackSizeElements <em>Stack Size Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getHeapSizeElements <em>Heap Size Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getSharedDataResources <em>Shared Data Resources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getMessageResources <em>Message Resources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getMutualExclusionResources <em>Mutual Exclusion Resources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getNotificationResources <em>Notification Resources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getEntryPoints <em>Entry Points</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getArrivalPattern <em>Arrival Pattern</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource()
 * @model abstract="true"
 * @generated
 */
public interface SoftwareConcurrentResource extends SoftwareResource, ConcurrencyResource {
	/**
	 * Returns the value of the '<em><b>Activate Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activate Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activate Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_ActivateServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getActivateServices();

	/**
	 * Returns the value of the '<em><b>Resume Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resume Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resume Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_ResumeServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getResumeServices();

	/**
	 * Returns the value of the '<em><b>Suspend Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspend Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspend Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_SuspendServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getSuspendServices();

	/**
	 * Returns the value of the '<em><b>Enable Concurrency Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Concurrency Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Concurrency Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_EnableConcurrencyServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getEnableConcurrencyServices();

	/**
	 * Returns the value of the '<em><b>Disable Concurrency Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Concurrency Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Concurrency Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_DisableConcurrencyServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getDisableConcurrencyServices();

	/**
	 * Returns the value of the '<em><b>Terminate Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminate Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminate Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_TerminateServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getTerminateServices();

	/**
	 * Returns the value of the '<em><b>Adress Space</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.srm.MemoryPartition#getConcurrentResources <em>Concurrent Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adress Space</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adress Space</em>' container reference.
	 * @see #setAdressSpace(MemoryPartition)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_AdressSpace()
	 * @see org.polarsys.time4sys.marte.srm.MemoryPartition#getConcurrentResources
	 * @model opposite="concurrentResources" transient="false"
	 * @generated
	 */
	MemoryPartition getAdressSpace();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getAdressSpace <em>Adress Space</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress Space</em>' container reference.
	 * @see #getAdressSpace()
	 * @generated
	 */
	void setAdressSpace(MemoryPartition value);

	/**
	 * Returns the value of the '<em><b>Period Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_PeriodElements()
	 * @model
	 * @generated
	 */
	EList<String> getPeriodElements();

	/**
	 * Returns the value of the '<em><b>Activation Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Capacity</em>' attribute.
	 * @see #setActivationCapacity(int)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_ActivationCapacity()
	 * @model
	 * @generated
	 */
	int getActivationCapacity();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getActivationCapacity <em>Activation Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Capacity</em>' attribute.
	 * @see #getActivationCapacity()
	 * @generated
	 */
	void setActivationCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Priority Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_PriorityElements()
	 * @model
	 * @generated
	 */
	EList<String> getPriorityElements();

	/**
	 * Returns the value of the '<em><b>Stack Size Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stack Size Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Size Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_StackSizeElements()
	 * @model
	 * @generated
	 */
	EList<String> getStackSizeElements();

	/**
	 * Returns the value of the '<em><b>Heap Size Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heap Size Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heap Size Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_HeapSizeElements()
	 * @model
	 * @generated
	 */
	EList<String> getHeapSizeElements();

	/**
	 * Returns the value of the '<em><b>Shared Data Resources</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.srm.SharedDataComResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Data Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Data Resources</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_SharedDataResources()
	 * @model
	 * @generated
	 */
	EList<SharedDataComResource> getSharedDataResources();

	/**
	 * Returns the value of the '<em><b>Message Resources</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.srm.MessageComResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Resources</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_MessageResources()
	 * @model
	 * @generated
	 */
	EList<MessageComResource> getMessageResources();

	/**
	 * Returns the value of the '<em><b>Mutual Exclusion Resources</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutual Exclusion Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutual Exclusion Resources</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_MutualExclusionResources()
	 * @model
	 * @generated
	 */
	EList<SoftwareMutualExclusionResource> getMutualExclusionResources();

	/**
	 * Returns the value of the '<em><b>Notification Resources</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.srm.NotificationResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Resources</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_NotificationResources()
	 * @model
	 * @generated
	 */
	EList<NotificationResource> getNotificationResources();

	/**
	 * Returns the value of the '<em><b>Entry Points</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Points</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Points</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_EntryPoints()
	 * @model
	 * @generated
	 */
	EList<String> getEntryPoints();

	/**
	 * Returns the value of the '<em><b>Arrival Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Pattern</em>' attribute.
	 * @see #setArrivalPattern(String)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareConcurrentResource_ArrivalPattern()
	 * @model
	 * @generated
	 */
	String getArrivalPattern();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getArrivalPattern <em>Arrival Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Pattern</em>' attribute.
	 * @see #getArrivalPattern()
	 * @generated
	 */
	void setArrivalPattern(String value);

} // SoftwareConcurrentResource
