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
import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.ResourcePort#getPInterface <em>PInterface</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.ResourcePort#getRInterface <em>RInterface</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourcePort()
 * @model
 * @generated
 */
public interface ResourcePort extends CommunicationEndPoint, NamedElement {
	/**
	 * Returns the value of the '<em><b>PInterface</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PInterface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PInterface</em>' reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourcePort_PInterface()
	 * @model
	 * @generated
	 */
	EList<ResourceInterface> getPInterface();

	/**
	 * Returns the value of the '<em><b>RInterface</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RInterface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RInterface</em>' reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourcePort_RInterface()
	 * @model
	 * @generated
	 */
	EList<ResourceInterface> getRInterface();

} // ResourcePort
