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
package org.polarsys.time4sys.marte.grm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.ResourceManager#getManagedResource <em>Managed Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.ResourceManager#getResCtrlPolicy <em>Res Ctrl Policy</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourceManager()
 * @model
 * @generated
 */
public interface ResourceManager extends Resource {
	/**
	 * Returns the value of the '<em><b>Managed Resource</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managed Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Resource</em>' reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourceManager_ManagedResource()
	 * @model required="true"
	 * @generated
	 */
	EList<Resource> getManagedResource();

	/**
	 * Returns the value of the '<em><b>Res Ctrl Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceControlPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Ctrl Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Ctrl Policy</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourceManager_ResCtrlPolicy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceControlPolicy> getResCtrlPolicy();

} // ResourceManager
