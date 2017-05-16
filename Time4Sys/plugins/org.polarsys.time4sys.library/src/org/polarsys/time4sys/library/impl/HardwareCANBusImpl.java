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
package org.polarsys.time4sys.library.impl;

import org.eclipse.emf.ecore.EClass;

import org.polarsys.time4sys.library.HardwareCANBus;
import org.polarsys.time4sys.library.LibraryPackage;

import org.polarsys.time4sys.marte.hrm.impl.HardwareBusImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware CAN Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HardwareCANBusImpl extends HardwareBusImpl implements HardwareCANBus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareCANBusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.HARDWARE_CAN_BUS;
	}

} //HardwareCANBusImpl
