/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.gqam;

import org.polarsys.time4sys.marte.grm.ResourceService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Service Excecution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.ResourceServiceExcecution#getResourceService <em>Resource Service</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getResourceServiceExcecution()
 * @model
 * @generated
 */
public interface ResourceServiceExcecution extends Step {
	/**
	 * Returns the value of the '<em><b>Resource Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Service</em>' reference.
	 * @see #setResourceService(ResourceService)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getResourceServiceExcecution_ResourceService()
	 * @model
	 * @generated
	 */
	ResourceService getResourceService();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.ResourceServiceExcecution#getResourceService <em>Resource Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Service</em>' reference.
	 * @see #getResourceService()
	 * @generated
	 */
	void setResourceService(ResourceService value);

} // ResourceServiceExcecution
