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

import org.polarsys.time4sys.marte.grm.DeviceResource;
import org.polarsys.time4sys.marte.grm.ResourceBroker;
import org.polarsys.time4sys.marte.grm.ResourceService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Broker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.DeviceBroker#getDevices <em>Devices</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.DeviceBroker#getAccessPolicy <em>Access Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.DeviceBroker#isIsBuffered <em>Is Buffered</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.DeviceBroker#getCloseServices <em>Close Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.DeviceBroker#getOpenServices <em>Open Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.DeviceBroker#getControlServices <em>Control Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.DeviceBroker#getReadServices <em>Read Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.DeviceBroker#getWriteServices <em>Write Services</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getDeviceBroker()
 * @model
 * @generated
 */
public interface DeviceBroker extends ResourceBroker, SoftwareResource {
	/**
	 * Returns the value of the '<em><b>Devices</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.DeviceResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getDeviceBroker_Devices()
	 * @model
	 * @generated
	 */
	EList<DeviceResource> getDevices();

	/**
	 * Returns the value of the '<em><b>Access Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.srm.AccessPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Policy</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.AccessPolicyKind
	 * @see #setAccessPolicy(AccessPolicyKind)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getDeviceBroker_AccessPolicy()
	 * @model
	 * @generated
	 */
	AccessPolicyKind getAccessPolicy();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.DeviceBroker#getAccessPolicy <em>Access Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Policy</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.AccessPolicyKind
	 * @see #getAccessPolicy()
	 * @generated
	 */
	void setAccessPolicy(AccessPolicyKind value);

	/**
	 * Returns the value of the '<em><b>Is Buffered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Buffered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Buffered</em>' attribute.
	 * @see #setIsBuffered(boolean)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getDeviceBroker_IsBuffered()
	 * @model
	 * @generated
	 */
	boolean isIsBuffered();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.DeviceBroker#isIsBuffered <em>Is Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Buffered</em>' attribute.
	 * @see #isIsBuffered()
	 * @generated
	 */
	void setIsBuffered(boolean value);

	/**
	 * Returns the value of the '<em><b>Close Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Close Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getDeviceBroker_CloseServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getCloseServices();

	/**
	 * Returns the value of the '<em><b>Open Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getDeviceBroker_OpenServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getOpenServices();

	/**
	 * Returns the value of the '<em><b>Control Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getDeviceBroker_ControlServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getControlServices();

	/**
	 * Returns the value of the '<em><b>Read Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getDeviceBroker_ReadServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getReadServices();

	/**
	 * Returns the value of the '<em><b>Write Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getDeviceBroker_WriteServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getWriteServices();

} // DeviceBroker
