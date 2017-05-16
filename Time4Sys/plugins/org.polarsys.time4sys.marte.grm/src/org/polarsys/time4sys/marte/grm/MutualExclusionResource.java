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
 * A representation of the model object '<em><b>Mutual Exclusion Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.MutualExclusionResource#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.MutualExclusionResource#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.MutualExclusionResource#getProtectParams <em>Protect Params</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getMutualExclusionResource()
 * @model
 * @generated
 */
public interface MutualExclusionResource extends SynchResource {
	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' reference.
	 * @see #setScheduler(ResourceBroker)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getMutualExclusionResource_Scheduler()
	 * @model
	 * @generated
	 */
	ResourceBroker getScheduler();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.MutualExclusionResource#getScheduler <em>Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' reference.
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(ResourceBroker value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(MutualExclusionProtocol)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getMutualExclusionResource_Protocol()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MutualExclusionProtocol getProtocol();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.MutualExclusionResource#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(MutualExclusionProtocol value);

	/**
	 * Returns the value of the '<em><b>Protect Params</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ProtectionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protect Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protect Params</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getMutualExclusionResource_ProtectParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProtectionParameter> getProtectParams();

} // MutualExclusionResource
