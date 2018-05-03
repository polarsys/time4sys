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
import org.polarsys.time4sys.marte.grm.StorageResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MemoryPartition#getConcurrentResources <em>Concurrent Resources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MemoryPartition#getForkServices <em>Fork Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MemoryPartition#getExitServices <em>Exit Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.MemoryPartition#getMemorySpaces <em>Memory Spaces</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMemoryPartition()
 * @model
 * @generated
 */
public interface MemoryPartition extends SoftwareResource {
	/**
	 * Returns the value of the '<em><b>Concurrent Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getAdressSpace <em>Adress Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrent Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrent Resources</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMemoryPartition_ConcurrentResources()
	 * @see org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource#getAdressSpace
	 * @model opposite="adressSpace" containment="true" required="true"
	 * @generated
	 */
	EList<SoftwareConcurrentResource> getConcurrentResources();

	/**
	 * Returns the value of the '<em><b>Fork Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fork Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMemoryPartition_ForkServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getForkServices();

	/**
	 * Returns the value of the '<em><b>Exit Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMemoryPartition_ExitServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getExitServices();

	/**
	 * Returns the value of the '<em><b>Memory Spaces</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.StorageResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Spaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Spaces</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getMemoryPartition_MemorySpaces()
	 * @model
	 * @generated
	 */
	EList<StorageResource> getMemorySpaces();

} // MemoryPartition
