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
 * A representation of the model object '<em><b>Hardware Storage Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareStorageMemory#getBuffer <em>Buffer</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareStorageMemory()
 * @model abstract="true"
 * @generated
 */
public interface HardwareStorageMemory extends HardwareMemory {
	/**
	 * Returns the value of the '<em><b>Buffer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer</em>' reference.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareStorageMemory_Buffer()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	HardwareProcessingMemory getBuffer();

} // HardwareStorageMemory
