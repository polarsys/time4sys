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
package org.polarsys.time4sys.marte.srm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.time4sys.marte.grm.ResourceService;

import org.polarsys.time4sys.marte.srm.MessageComResource;
import org.polarsys.time4sys.marte.srm.MessageResourceKind;
import org.polarsys.time4sys.marte.srm.QueuePolicyKind;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Com Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MessageComResourceImpl#getSendServices <em>Send Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MessageComResourceImpl#getReceiveServices <em>Receive Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MessageComResourceImpl#isIsFixedMessageSize <em>Is Fixed Message Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MessageComResourceImpl#getMessageSizeElements <em>Message Size Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MessageComResourceImpl#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MessageComResourceImpl#getMessageQueuePolicy <em>Message Queue Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MessageComResourceImpl#getMessageQueueCapacityElements <em>Message Queue Capacity Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageComResourceImpl extends SoftwareCommunicationResourceImpl implements MessageComResource {
	/**
	 * The cached value of the '{@link #getSendServices() <em>Send Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> sendServices;

	/**
	 * The cached value of the '{@link #getReceiveServices() <em>Receive Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> receiveServices;

	/**
	 * The default value of the '{@link #isIsFixedMessageSize() <em>Is Fixed Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFixedMessageSize()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FIXED_MESSAGE_SIZE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFixedMessageSize() <em>Is Fixed Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFixedMessageSize()
	 * @generated
	 * @ordered
	 */
	protected boolean isFixedMessageSize = IS_FIXED_MESSAGE_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageSizeElements() <em>Message Size Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSizeElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> messageSizeElements;

	/**
	 * The default value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final MessageResourceKind MECHANISM_EDEFAULT = MessageResourceKind.MESSAGE_QUEUE;

	/**
	 * The cached value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected MessageResourceKind mechanism = MECHANISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageQueuePolicy() <em>Message Queue Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageQueuePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final QueuePolicyKind MESSAGE_QUEUE_POLICY_EDEFAULT = QueuePolicyKind.FIFO;

	/**
	 * The cached value of the '{@link #getMessageQueuePolicy() <em>Message Queue Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageQueuePolicy()
	 * @generated
	 * @ordered
	 */
	protected QueuePolicyKind messageQueuePolicy = MESSAGE_QUEUE_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageQueueCapacityElements() <em>Message Queue Capacity Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageQueueCapacityElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> messageQueueCapacityElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageComResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.MESSAGE_COM_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getSendServices() {
		if (sendServices == null) {
			sendServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.MESSAGE_COM_RESOURCE__SEND_SERVICES);
		}
		return sendServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getReceiveServices() {
		if (receiveServices == null) {
			receiveServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.MESSAGE_COM_RESOURCE__RECEIVE_SERVICES);
		}
		return receiveServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFixedMessageSize() {
		return isFixedMessageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFixedMessageSize(boolean newIsFixedMessageSize) {
		boolean oldIsFixedMessageSize = isFixedMessageSize;
		isFixedMessageSize = newIsFixedMessageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.MESSAGE_COM_RESOURCE__IS_FIXED_MESSAGE_SIZE, oldIsFixedMessageSize, isFixedMessageSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMessageSizeElements() {
		if (messageSizeElements == null) {
			messageSizeElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.MESSAGE_COM_RESOURCE__MESSAGE_SIZE_ELEMENTS);
		}
		return messageSizeElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageResourceKind getMechanism() {
		return mechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMechanism(MessageResourceKind newMechanism) {
		MessageResourceKind oldMechanism = mechanism;
		mechanism = newMechanism == null ? MECHANISM_EDEFAULT : newMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.MESSAGE_COM_RESOURCE__MECHANISM, oldMechanism, mechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueuePolicyKind getMessageQueuePolicy() {
		return messageQueuePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageQueuePolicy(QueuePolicyKind newMessageQueuePolicy) {
		QueuePolicyKind oldMessageQueuePolicy = messageQueuePolicy;
		messageQueuePolicy = newMessageQueuePolicy == null ? MESSAGE_QUEUE_POLICY_EDEFAULT : newMessageQueuePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_POLICY, oldMessageQueuePolicy, messageQueuePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMessageQueueCapacityElements() {
		if (messageQueueCapacityElements == null) {
			messageQueueCapacityElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_CAPACITY_ELEMENTS);
		}
		return messageQueueCapacityElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SrmPackage.MESSAGE_COM_RESOURCE__SEND_SERVICES:
				return getSendServices();
			case SrmPackage.MESSAGE_COM_RESOURCE__RECEIVE_SERVICES:
				return getReceiveServices();
			case SrmPackage.MESSAGE_COM_RESOURCE__IS_FIXED_MESSAGE_SIZE:
				return isIsFixedMessageSize();
			case SrmPackage.MESSAGE_COM_RESOURCE__MESSAGE_SIZE_ELEMENTS:
				return getMessageSizeElements();
			case SrmPackage.MESSAGE_COM_RESOURCE__MECHANISM:
				return getMechanism();
			case SrmPackage.MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_POLICY:
				return getMessageQueuePolicy();
			case SrmPackage.MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_CAPACITY_ELEMENTS:
				return getMessageQueueCapacityElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SrmPackage.MESSAGE_COM_RESOURCE__SEND_SERVICES:
				getSendServices().clear();
				getSendServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.MESSAGE_COM_RESOURCE__RECEIVE_SERVICES:
				getReceiveServices().clear();
				getReceiveServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.MESSAGE_COM_RESOURCE__IS_FIXED_MESSAGE_SIZE:
				setIsFixedMessageSize((Boolean)newValue);
				return;
			case SrmPackage.MESSAGE_COM_RESOURCE__MESSAGE_SIZE_ELEMENTS:
				getMessageSizeElements().clear();
				getMessageSizeElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.MESSAGE_COM_RESOURCE__MECHANISM:
				setMechanism((MessageResourceKind)newValue);
				return;
			case SrmPackage.MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_POLICY:
				setMessageQueuePolicy((QueuePolicyKind)newValue);
				return;
			case SrmPackage.MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_CAPACITY_ELEMENTS:
				getMessageQueueCapacityElements().clear();
				getMessageQueueCapacityElements().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SrmPackage.MESSAGE_COM_RESOURCE__SEND_SERVICES:
				getSendServices().clear();
				return;
			case SrmPackage.MESSAGE_COM_RESOURCE__RECEIVE_SERVICES:
				getReceiveServices().clear();
				return;
			case SrmPackage.MESSAGE_COM_RESOURCE__IS_FIXED_MESSAGE_SIZE:
				setIsFixedMessageSize(IS_FIXED_MESSAGE_SIZE_EDEFAULT);
				return;
			case SrmPackage.MESSAGE_COM_RESOURCE__MESSAGE_SIZE_ELEMENTS:
				getMessageSizeElements().clear();
				return;
			case SrmPackage.MESSAGE_COM_RESOURCE__MECHANISM:
				setMechanism(MECHANISM_EDEFAULT);
				return;
			case SrmPackage.MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_POLICY:
				setMessageQueuePolicy(MESSAGE_QUEUE_POLICY_EDEFAULT);
				return;
			case SrmPackage.MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_CAPACITY_ELEMENTS:
				getMessageQueueCapacityElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SrmPackage.MESSAGE_COM_RESOURCE__SEND_SERVICES:
				return sendServices != null && !sendServices.isEmpty();
			case SrmPackage.MESSAGE_COM_RESOURCE__RECEIVE_SERVICES:
				return receiveServices != null && !receiveServices.isEmpty();
			case SrmPackage.MESSAGE_COM_RESOURCE__IS_FIXED_MESSAGE_SIZE:
				return isFixedMessageSize != IS_FIXED_MESSAGE_SIZE_EDEFAULT;
			case SrmPackage.MESSAGE_COM_RESOURCE__MESSAGE_SIZE_ELEMENTS:
				return messageSizeElements != null && !messageSizeElements.isEmpty();
			case SrmPackage.MESSAGE_COM_RESOURCE__MECHANISM:
				return mechanism != MECHANISM_EDEFAULT;
			case SrmPackage.MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_POLICY:
				return messageQueuePolicy != MESSAGE_QUEUE_POLICY_EDEFAULT;
			case SrmPackage.MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_CAPACITY_ELEMENTS:
				return messageQueueCapacityElements != null && !messageQueueCapacityElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isFixedMessageSize: ");
		result.append(isFixedMessageSize);
		result.append(", messageSizeElements: ");
		result.append(messageSizeElements);
		result.append(", mechanism: ");
		result.append(mechanism);
		result.append(", messageQueuePolicy: ");
		result.append(messageQueuePolicy);
		result.append(", messageQueueCapacityElements: ");
		result.append(messageQueueCapacityElements);
		result.append(')');
		return result.toString();
	}

} //MessageComResourceImpl
