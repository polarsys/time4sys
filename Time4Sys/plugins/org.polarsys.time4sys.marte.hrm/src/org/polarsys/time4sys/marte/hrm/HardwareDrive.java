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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Drive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareDrive#getSectorSize <em>Sector Size</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareDrive()
 * @model
 * @generated
 */
public interface HardwareDrive extends HardwareStorageMemory {
	/**
	 * Returns the value of the '<em><b>Sector Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sector Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sector Size</em>' attribute.
	 * @see #setSectorSize(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareDrive_SectorSize()
	 * @model
	 * @generated
	 */
	int getSectorSize();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareDrive#getSectorSize <em>Sector Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sector Size</em>' attribute.
	 * @see #getSectorSize()
	 * @generated
	 */
	void setSectorSize(int value);

} // HardwareDrive
