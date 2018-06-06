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
package org.polarsys.time4sys.marte.hrm;

import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Wire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareWire#getSourcePin <em>Source Pin</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareWire#getTargetPin <em>Target Pin</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareWire()
 * @model
 * @generated
 */
public interface HardwareWire extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Source Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Pin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Pin</em>' reference.
	 * @see #setSourcePin(HardwarePin)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareWire_SourcePin()
	 * @model required="true"
	 * @generated
	 */
	HardwarePin getSourcePin();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareWire#getSourcePin <em>Source Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Pin</em>' reference.
	 * @see #getSourcePin()
	 * @generated
	 */
	void setSourcePin(HardwarePin value);

	/**
	 * Returns the value of the '<em><b>Target Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Pin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Pin</em>' reference.
	 * @see #setTargetPin(HardwarePin)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareWire_TargetPin()
	 * @model required="true"
	 * @generated
	 */
	HardwarePin getTargetPin();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareWire#getTargetPin <em>Target Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Pin</em>' reference.
	 * @see #getTargetPin()
	 * @generated
	 */
	void setTargetPin(HardwarePin value);

} // HardwareWire
