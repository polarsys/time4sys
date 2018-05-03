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

import org.polarsys.time4sys.marte.grm.ComputingResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Computing Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareComputingResource#getOpFrequencies <em>Op Frequencies</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareComputingResource()
 * @model
 * @generated
 */
public interface HardwareComputingResource extends ComputingResource, HardwareResource, HardwareChip {
	/**
	 * Returns the value of the '<em><b>Op Frequencies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Frequencies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Frequencies</em>' attribute.
	 * @see #setOpFrequencies(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareComputingResource_OpFrequencies()
	 * @model
	 * @generated
	 */
	int getOpFrequencies();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareComputingResource#getOpFrequencies <em>Op Frequencies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Frequencies</em>' attribute.
	 * @see #getOpFrequencies()
	 * @generated
	 */
	void setOpFrequencies(int value);

} // HardwareComputingResource
