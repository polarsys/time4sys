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
 * A representation of the model object '<em><b>Resource Broker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.ResourceBroker#getBrokedResource <em>Broked Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.ResourceBroker#getAccCtrlPolicy <em>Acc Ctrl Policy</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourceBroker()
 * @model
 * @generated
 */
public interface ResourceBroker extends Resource {
	/**
	 * Returns the value of the '<em><b>Broked Resource</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Broked Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broked Resource</em>' reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourceBroker_BrokedResource()
	 * @model required="true"
	 * @generated
	 */
	EList<Resource> getBrokedResource();

	/**
	 * Returns the value of the '<em><b>Acc Ctrl Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.AccessControlPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acc Ctrl Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acc Ctrl Policy</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourceBroker_AccCtrlPolicy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AccessControlPolicy> getAccCtrlPolicy();

} // ResourceBroker
