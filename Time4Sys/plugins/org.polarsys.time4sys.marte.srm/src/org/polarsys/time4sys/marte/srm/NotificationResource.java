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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.NotificationResource#getFlushServices <em>Flush Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.NotificationResource#getSignalServices <em>Signal Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.NotificationResource#getWaitServices <em>Wait Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.NotificationResource#getClearServices <em>Clear Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.NotificationResource#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.NotificationResource#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.NotificationResource#getOccurenceCountElements <em>Occurence Count Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.NotificationResource#getMaskElements <em>Mask Elements</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getNotificationResource()
 * @model
 * @generated
 */
public interface NotificationResource extends SoftwareSynchronizationResource {
	/**
	 * Returns the value of the '<em><b>Flush Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flush Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flush Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getNotificationResource_FlushServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getFlushServices();

	/**
	 * Returns the value of the '<em><b>Signal Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getNotificationResource_SignalServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getSignalServices();

	/**
	 * Returns the value of the '<em><b>Wait Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wait Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getNotificationResource_WaitServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getWaitServices();

	/**
	 * Returns the value of the '<em><b>Clear Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clear Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getNotificationResource_ClearServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getClearServices();

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.srm.OccurencePolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.OccurencePolicyKind
	 * @see #setPolicy(OccurencePolicyKind)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getNotificationResource_Policy()
	 * @model required="true"
	 * @generated
	 */
	OccurencePolicyKind getPolicy();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.NotificationResource#getPolicy <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.OccurencePolicyKind
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(OccurencePolicyKind value);

	/**
	 * Returns the value of the '<em><b>Mechanism</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.srm.NotificationResourceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mechanism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanism</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.NotificationResourceKind
	 * @see #setMechanism(NotificationResourceKind)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getNotificationResource_Mechanism()
	 * @model required="true"
	 * @generated
	 */
	NotificationResourceKind getMechanism();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.NotificationResource#getMechanism <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanism</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.NotificationResourceKind
	 * @see #getMechanism()
	 * @generated
	 */
	void setMechanism(NotificationResourceKind value);

	/**
	 * Returns the value of the '<em><b>Occurence Count Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurence Count Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurence Count Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getNotificationResource_OccurenceCountElements()
	 * @model
	 * @generated
	 */
	EList<String> getOccurenceCountElements();

	/**
	 * Returns the value of the '<em><b>Mask Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getNotificationResource_MaskElements()
	 * @model
	 * @generated
	 */
	EList<String> getMaskElements();

} // NotificationResource
