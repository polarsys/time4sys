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
 * A representation of the model object '<em><b>Resource Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.ResourceInterface#getOwnedService <em>Owned Service</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourceInterface()
 * @model
 * @generated
 */
public interface ResourceInterface extends ResourcePackageableElement {
	/**
	 * Returns the value of the '<em><b>Owned Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Service</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourceInterface_OwnedService()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceService> getOwnedService();

} // ResourceInterface
