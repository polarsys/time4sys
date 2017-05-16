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
 * A representation of the model object '<em><b>Mutual Exclusion Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.MutualExclusionProtocol#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.MutualExclusionProtocol#getOtherProtocol <em>Other Protocol</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getMutualExclusionProtocol()
 * @model
 * @generated
 */
public interface MutualExclusionProtocol extends AccessControlPolicy {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.grm.ProtectProtocolKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see org.polarsys.time4sys.marte.grm.ProtectProtocolKind
	 * @see #setProtocol(ProtectProtocolKind)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getMutualExclusionProtocol_Protocol()
	 * @model
	 * @generated
	 */
	ProtectProtocolKind getProtocol();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.MutualExclusionProtocol#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see org.polarsys.time4sys.marte.grm.ProtectProtocolKind
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtectProtocolKind value);

	/**
	 * Returns the value of the '<em><b>Other Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Protocol</em>' attribute.
	 * @see #setOtherProtocol(String)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getMutualExclusionProtocol_OtherProtocol()
	 * @model
	 * @generated
	 */
	String getOtherProtocol();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.MutualExclusionProtocol#getOtherProtocol <em>Other Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Protocol</em>' attribute.
	 * @see #getOtherProtocol()
	 * @generated
	 */
	void setOtherProtocol(String value);

} // MutualExclusionProtocol
