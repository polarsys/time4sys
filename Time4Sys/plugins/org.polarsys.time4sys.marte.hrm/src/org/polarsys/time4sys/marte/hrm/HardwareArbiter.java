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

import org.polarsys.time4sys.marte.grm.ResourceBroker;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Arbiter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareArbiter#getControlledMedia <em>Controlled Media</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareArbiter()
 * @model
 * @generated
 */
public interface HardwareArbiter extends HardwareCommunicationResource, ResourceBroker {
	/**
	 * Returns the value of the '<em><b>Controlled Media</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwareMedia}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.hrm.HardwareMedia#getArbiters <em>Arbiters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled Media</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled Media</em>' reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareArbiter_ControlledMedia()
	 * @see org.polarsys.time4sys.marte.hrm.HardwareMedia#getArbiters
	 * @model opposite="arbiters" required="true"
	 * @generated
	 */
	EList<HardwareMedia> getControlledMedia();

} // HardwareArbiter
