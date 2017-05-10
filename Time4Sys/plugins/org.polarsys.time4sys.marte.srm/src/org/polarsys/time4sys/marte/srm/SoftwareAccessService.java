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

import org.polarsys.time4sys.marte.grm.ResourceService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Access Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareAccessService#isIsModifier <em>Is Modifier</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareAccessService#getAccessedElement <em>Accessed Element</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareAccessService()
 * @model
 * @generated
 */
public interface SoftwareAccessService extends ResourceService {
	/**
	 * Returns the value of the '<em><b>Is Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Modifier</em>' attribute.
	 * @see #setIsModifier(boolean)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareAccessService_IsModifier()
	 * @model
	 * @generated
	 */
	boolean isIsModifier();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.SoftwareAccessService#isIsModifier <em>Is Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Modifier</em>' attribute.
	 * @see #isIsModifier()
	 * @generated
	 */
	void setIsModifier(boolean value);

	/**
	 * Returns the value of the '<em><b>Accessed Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessed Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessed Element</em>' attribute.
	 * @see #setAccessedElement(String)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareAccessService_AccessedElement()
	 * @model
	 * @generated
	 */
	String getAccessedElement();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.SoftwareAccessService#getAccessedElement <em>Accessed Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessed Element</em>' attribute.
	 * @see #getAccessedElement()
	 * @generated
	 */
	void setAccessedElement(String value);

} // SoftwareAccessService
