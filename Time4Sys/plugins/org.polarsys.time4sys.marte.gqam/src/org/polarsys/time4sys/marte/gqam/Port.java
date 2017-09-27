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
package org.polarsys.time4sys.marte.gqam;

import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.Port#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.gqam.ConnectorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.marte.gqam.ConnectorKind
	 * @see #setKind(ConnectorKind)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getPort_Kind()
	 * @model
	 * @generated
	 */
	ConnectorKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.Port#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.marte.gqam.ConnectorKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ConnectorKind value);

} // Port
