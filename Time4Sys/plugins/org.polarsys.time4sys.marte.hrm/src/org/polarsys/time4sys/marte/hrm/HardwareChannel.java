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
package org.polarsys.time4sys.marte.hrm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareChannel#getNbWires <em>Nb Wires</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareChannel#getRealizedBy <em>Realized By</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareChannel()
 * @model abstract="true"
 * @generated
 */
public interface HardwareChannel extends HardwareComponent {
	/**
	 * Returns the value of the '<em><b>Nb Wires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Wires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Wires</em>' attribute.
	 * @see #setNbWires(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareChannel_NbWires()
	 * @model
	 * @generated
	 */
	int getNbWires();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareChannel#getNbWires <em>Nb Wires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Wires</em>' attribute.
	 * @see #getNbWires()
	 * @generated
	 */
	void setNbWires(int value);

	/**
	 * Returns the value of the '<em><b>Realized By</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwareWire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized By</em>' reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareChannel_RealizedBy()
	 * @model
	 * @generated
	 */
	EList<HardwareWire> getRealizedBy();

} // HardwareChannel
