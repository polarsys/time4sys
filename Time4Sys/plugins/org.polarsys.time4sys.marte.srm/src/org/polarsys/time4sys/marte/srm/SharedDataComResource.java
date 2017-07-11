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
import org.polarsys.time4sys.marte.grm.ResourceService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Data Com Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SharedDataComResource#getReadServices <em>Read Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SharedDataComResource#getWriteServices <em>Write Services</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSharedDataComResource()
 * @model
 * @generated
 */
public interface SharedDataComResource extends SoftwareCommunicationResource {
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
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSharedDataComResource_ReadServices()
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
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSharedDataComResource_WriteServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getWriteServices();

} // SharedDataComResource
