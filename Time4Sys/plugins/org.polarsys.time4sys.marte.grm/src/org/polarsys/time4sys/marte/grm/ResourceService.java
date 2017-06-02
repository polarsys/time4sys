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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.ResourceService#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourceService()
 * @model
 * @generated
 */
public interface ResourceService extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.grm.Resource#getPServices <em>PServices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(Resource)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourceService_Context()
	 * @see org.polarsys.time4sys.marte.grm.Resource#getPServices
	 * @model opposite="pServices" transient="false"
	 * @generated
	 */
	Resource getContext();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.ResourceService#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Resource value);
} // ResourceService
