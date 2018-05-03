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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Processing Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareProcessingMemory#getReplPolicy <em>Repl Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareProcessingMemory#getWritePolicy <em>Write Policy</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareProcessingMemory()
 * @model abstract="true"
 * @generated
 */
public interface HardwareProcessingMemory extends HardwareMemory {
	/**
	 * Returns the value of the '<em><b>Repl Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.hrm.ReplPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repl Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repl Policy</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.ReplPolicy
	 * @see #setReplPolicy(ReplPolicy)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareProcessingMemory_ReplPolicy()
	 * @model
	 * @generated
	 */
	ReplPolicy getReplPolicy();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessingMemory#getReplPolicy <em>Repl Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repl Policy</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.ReplPolicy
	 * @see #getReplPolicy()
	 * @generated
	 */
	void setReplPolicy(ReplPolicy value);

	/**
	 * Returns the value of the '<em><b>Write Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.hrm.WritePolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Policy</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.WritePolicy
	 * @see #setWritePolicy(WritePolicy)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareProcessingMemory_WritePolicy()
	 * @model
	 * @generated
	 */
	WritePolicy getWritePolicy();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessingMemory#getWritePolicy <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Policy</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.WritePolicy
	 * @see #getWritePolicy()
	 * @generated
	 */
	void setWritePolicy(WritePolicy value);

} // HardwareProcessingMemory
