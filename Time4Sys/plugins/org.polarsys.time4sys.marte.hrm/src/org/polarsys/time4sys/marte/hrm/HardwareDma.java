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
 * A representation of the model object '<em><b>Hardware Dma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareDma#getNbChannels <em>Nb Channels</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareDma#getTransferWidth <em>Transfer Width</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareDma#getDrivenBy <em>Driven By</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareDma()
 * @model
 * @generated
 */
public interface HardwareDma extends HardwareStorageManager, HardwareArbiter {
	/**
	 * Returns the value of the '<em><b>Nb Channels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Channels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Channels</em>' attribute.
	 * @see #setNbChannels(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareDma_NbChannels()
	 * @model
	 * @generated
	 */
	int getNbChannels();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareDma#getNbChannels <em>Nb Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Channels</em>' attribute.
	 * @see #getNbChannels()
	 * @generated
	 */
	void setNbChannels(int value);

	/**
	 * Returns the value of the '<em><b>Transfer Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfer Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Width</em>' attribute.
	 * @see #setTransferWidth(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareDma_TransferWidth()
	 * @model
	 * @generated
	 */
	int getTransferWidth();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareDma#getTransferWidth <em>Transfer Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Width</em>' attribute.
	 * @see #getTransferWidth()
	 * @generated
	 */
	void setTransferWidth(int value);

	/**
	 * Returns the value of the '<em><b>Driven By</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwareProcessor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driven By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driven By</em>' reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareDma_DrivenBy()
	 * @model
	 * @generated
	 */
	EList<HardwareProcessor> getDrivenBy();

} // HardwareDma
