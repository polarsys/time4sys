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
 * A representation of the model object '<em><b>Message Com Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MessageComResource#getSendServices <em>Send Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MessageComResource#getReceiveServices <em>Receive Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MessageComResource#isIsFixedMessageSize <em>Is Fixed Message Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MessageComResource#getMessageSizeElements <em>Message Size Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MessageComResource#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MessageComResource#getMessageQueuePolicy <em>Message Queue Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MessageComResource#getMessageQueueCapacityElements <em>Message Queue Capacity Elements</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMessageComResource()
 * @model
 * @generated
 */
public interface MessageComResource extends SoftwareCommunicationResource {
	/**
	 * Returns the value of the '<em><b>Send Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMessageComResource_SendServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getSendServices();

	/**
	 * Returns the value of the '<em><b>Receive Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMessageComResource_ReceiveServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getReceiveServices();

	/**
	 * Returns the value of the '<em><b>Is Fixed Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Fixed Message Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Fixed Message Size</em>' attribute.
	 * @see #setIsFixedMessageSize(boolean)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMessageComResource_IsFixedMessageSize()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsFixedMessageSize();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.MessageComResource#isIsFixedMessageSize <em>Is Fixed Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fixed Message Size</em>' attribute.
	 * @see #isIsFixedMessageSize()
	 * @generated
	 */
	void setIsFixedMessageSize(boolean value);

	/**
	 * Returns the value of the '<em><b>Message Size Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Size Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Size Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMessageComResource_MessageSizeElements()
	 * @model
	 * @generated
	 */
	EList<String> getMessageSizeElements();

	/**
	 * Returns the value of the '<em><b>Mechanism</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.srm.MessageResourceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mechanism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanism</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.MessageResourceKind
	 * @see #setMechanism(MessageResourceKind)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMessageComResource_Mechanism()
	 * @model
	 * @generated
	 */
	MessageResourceKind getMechanism();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.MessageComResource#getMechanism <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanism</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.MessageResourceKind
	 * @see #getMechanism()
	 * @generated
	 */
	void setMechanism(MessageResourceKind value);

	/**
	 * Returns the value of the '<em><b>Message Queue Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.srm.QueuePolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Queue Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Queue Policy</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.QueuePolicyKind
	 * @see #setMessageQueuePolicy(QueuePolicyKind)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMessageComResource_MessageQueuePolicy()
	 * @model
	 * @generated
	 */
	QueuePolicyKind getMessageQueuePolicy();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.MessageComResource#getMessageQueuePolicy <em>Message Queue Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Queue Policy</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.QueuePolicyKind
	 * @see #getMessageQueuePolicy()
	 * @generated
	 */
	void setMessageQueuePolicy(QueuePolicyKind value);

	/**
	 * Returns the value of the '<em><b>Message Queue Capacity Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Queue Capacity Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Queue Capacity Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMessageComResource_MessageQueueCapacityElements()
	 * @model
	 * @generated
	 */
	EList<String> getMessageQueueCapacityElements();

} // MessageComResource
