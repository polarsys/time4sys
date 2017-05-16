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

import org.polarsys.time4sys.marte.grm.ResourceBroker;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.grm.StorageResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Broker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getLockServices <em>Lock Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getUnlockServices <em>Unlock Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getMapServices <em>Map Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getUnmapServices <em>Unmap Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getMemories <em>Memories</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getAccessPolicy <em>Access Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getMemoryBlockAddressElements <em>Memory Block Address Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getMemoryBlockSizeElements <em>Memory Block Size Elements</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMemoryBroker()
 * @model
 * @generated
 */
public interface MemoryBroker extends ResourceBroker, SoftwareResource {
	/**
	 * Returns the value of the '<em><b>Lock Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMemoryBroker_LockServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getLockServices();

	/**
	 * Returns the value of the '<em><b>Unlock Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unlock Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlock Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMemoryBroker_UnlockServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getUnlockServices();

	/**
	 * Returns the value of the '<em><b>Map Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMemoryBroker_MapServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getMapServices();

	/**
	 * Returns the value of the '<em><b>Unmap Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unmap Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unmap Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMemoryBroker_UnmapServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getUnmapServices();

	/**
	 * Returns the value of the '<em><b>Memories</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.StorageResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memories</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMemoryBroker_Memories()
	 * @model
	 * @generated
	 */
	EList<StorageResource> getMemories();

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
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMemoryBroker_AccessPolicy()
	 * @model
	 * @generated
	 */
	AccessPolicyKind getAccessPolicy();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.MemoryBroker#getAccessPolicy <em>Access Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Policy</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.AccessPolicyKind
	 * @see #getAccessPolicy()
	 * @generated
	 */
	void setAccessPolicy(AccessPolicyKind value);

	/**
	 * Returns the value of the '<em><b>Memory Block Address Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Block Address Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Block Address Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMemoryBroker_MemoryBlockAddressElements()
	 * @model
	 * @generated
	 */
	EList<String> getMemoryBlockAddressElements();

	/**
	 * Returns the value of the '<em><b>Memory Block Size Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Block Size Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Block Size Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMemoryBroker_MemoryBlockSizeElements()
	 * @model
	 * @generated
	 */
	EList<String> getMemoryBlockSizeElements();

} // MemoryBroker
