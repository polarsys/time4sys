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
 * A representation of the model object '<em><b>Hardware Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareMedia#getArbiters <em>Arbiters</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareMedia()
 * @model
 * @generated
 */
public interface HardwareMedia extends HardwareCommunicationResource {
	/**
	 * Returns the value of the '<em><b>Arbiters</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwareArbiter}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.hrm.HardwareArbiter#getControlledMedia <em>Controlled Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arbiters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arbiters</em>' reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareMedia_Arbiters()
	 * @see org.polarsys.time4sys.marte.hrm.HardwareArbiter#getControlledMedia
	 * @model opposite="controlledMedia"
	 * @generated
	 */
	EList<HardwareArbiter> getArbiters();

} // HardwareMedia
