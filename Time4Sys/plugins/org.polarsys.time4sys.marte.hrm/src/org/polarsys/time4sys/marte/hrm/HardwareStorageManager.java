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
import org.polarsys.time4sys.marte.grm.ResourceBroker;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Storage Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareStorageManager#getManagedMemories <em>Managed Memories</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareStorageManager()
 * @model
 * @generated
 */
public interface HardwareStorageManager extends ResourceBroker, HardwareChip {
	/**
	 * Returns the value of the '<em><b>Managed Memories</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwareMemory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managed Memories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Memories</em>' reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareStorageManager_ManagedMemories()
	 * @model required="true"
	 * @generated
	 */
	EList<HardwareMemory> getManagedMemories();

} // HardwareStorageManager
