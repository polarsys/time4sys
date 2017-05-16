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
package org.polarsys.time4sys.marte.srm.impl;

import org.eclipse.emf.ecore.EClass;

import org.polarsys.time4sys.marte.grm.impl.ResourcePortImpl;

import org.polarsys.time4sys.marte.srm.SoftwarePort;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SoftwarePortImpl extends ResourcePortImpl implements SoftwarePort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwarePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.SOFTWARE_PORT;
	}

} //SoftwarePortImpl
