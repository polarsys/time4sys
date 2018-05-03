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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Firmware Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.FirmwareArchitecture#getOwnedWire <em>Owned Wire</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.FirmwareArchitecture#getOwnedPin <em>Owned Pin</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getFirmwareArchitecture()
 * @model
 * @generated
 */
public interface FirmwareArchitecture extends HardwareResource {
	/**
	 * Returns the value of the '<em><b>Owned Wire</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwareWire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Wire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Wire</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getFirmwareArchitecture_OwnedWire()
	 * @model containment="true"
	 * @generated
	 */
	EList<HardwareWire> getOwnedWire();

	/**
	 * Returns the value of the '<em><b>Owned Pin</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwarePin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Pin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Pin</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getFirmwareArchitecture_OwnedPin()
	 * @model containment="true"
	 * @generated
	 */
	EList<HardwarePin> getOwnedPin();

} // FirmwareArchitecture
