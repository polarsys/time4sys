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
package org.polarsys.time4sys.marte.grm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.Resource#getOwnedResource <em>Owned Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.Resource#getResMult <em>Res Mult</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.Resource#isIsProtected <em>Is Protected</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.Resource#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.Resource#getOwnedPort <em>Owned Port</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.Resource#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.Resource#getRServices <em>RServices</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.Resource#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.Resource#getPServices <em>PServices</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface Resource extends ResourcePackageableElement {
	/**
	 * Returns the value of the '<em><b>Owned Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Resource</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResource_OwnedResource()
	 * @model containment="true"
	 *        extendedMetaData="wildcards='' name=''"
	 * @generated
	 */
	EList<Resource> getOwnedResource();

	/**
	 * Returns the value of the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Mult</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Mult</em>' attribute.
	 * @see #setResMult(int)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResource_ResMult()
	 * @model
	 * @generated
	 */
	int getResMult();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.Resource#getResMult <em>Res Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Mult</em>' attribute.
	 * @see #getResMult()
	 * @generated
	 */
	void setResMult(int value);

	/**
	 * Returns the value of the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Protected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Protected</em>' attribute.
	 * @see #setIsProtected(boolean)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResource_IsProtected()
	 * @model
	 * @generated
	 */
	boolean isIsProtected();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.Resource#isIsProtected <em>Is Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Protected</em>' attribute.
	 * @see #isIsProtected()
	 * @generated
	 */
	void setIsProtected(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResource_IsActive()
	 * @model
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.Resource#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * Returns the value of the '<em><b>PServices</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.grm.ResourceService#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PServices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PServices</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResource_PServices()
	 * @see org.polarsys.time4sys.marte.grm.ResourceService#getContext
	 * @model opposite="context" containment="true"
	 * @generated
	 */
	EList<ResourceService> getPServices();

	/**
	 * Returns the value of the '<em><b>Owned Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourcePort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Port</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResource_OwnedPort()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourcePort> getOwnedPort();

	/**
	 * Returns the value of the '<em><b>Owned Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Connector</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResource_OwnedConnector()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceConnector> getOwnedConnector();

	/**
	 * Returns the value of the '<em><b>RServices</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RServices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RServices</em>' reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResource_RServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getRServices();

	/**
	 * Returns the value of the '<em><b>Used By</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceUsage}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.grm.ResourceUsage#getUsedResource <em>Used Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By</em>' reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResource_UsedBy()
	 * @see org.polarsys.time4sys.marte.grm.ResourceUsage#getUsedResource
	 * @model opposite="usedResource"
	 * @generated
	 */
	EList<ResourceUsage> getUsedBy();

} // Resource
