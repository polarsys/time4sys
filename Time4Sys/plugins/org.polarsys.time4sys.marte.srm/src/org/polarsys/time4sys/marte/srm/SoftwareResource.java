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
import org.polarsys.time4sys.marte.grm.ResourceManager;
import org.polarsys.time4sys.marte.grm.ResourceService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareResource#getCreateServices <em>Create Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareResource#getDeleteServices <em>Delete Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareResource#getInitializeServices <em>Initialize Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareResource#getMemorySizeFootprint <em>Memory Size Footprint</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareResource#getStateElements <em>State Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareResource#getIdentifierElements <em>Identifier Elements</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareResource()
 * @model
 * @generated
 */
public interface SoftwareResource extends ResourceManager {
	/**
	 * Returns the value of the '<em><b>Create Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareResource_CreateServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getCreateServices();

	/**
	 * Returns the value of the '<em><b>Delete Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareResource_DeleteServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getDeleteServices();

	/**
	 * Returns the value of the '<em><b>Initialize Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialize Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialize Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareResource_InitializeServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getInitializeServices();

	/**
	 * Returns the value of the '<em><b>Memory Size Footprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Size Footprint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Size Footprint</em>' attribute.
	 * @see #setMemorySizeFootprint(int)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareResource_MemorySizeFootprint()
	 * @model
	 * @generated
	 */
	int getMemorySizeFootprint();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.SoftwareResource#getMemorySizeFootprint <em>Memory Size Footprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Size Footprint</em>' attribute.
	 * @see #getMemorySizeFootprint()
	 * @generated
	 */
	void setMemorySizeFootprint(int value);

	/**
	 * Returns the value of the '<em><b>State Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareResource_StateElements()
	 * @model
	 * @generated
	 */
	EList<String> getStateElements();

	/**
	 * Returns the value of the '<em><b>Identifier Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareResource_IdentifierElements()
	 * @model
	 * @generated
	 */
	EList<String> getIdentifierElements();

} // SoftwareResource
