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

import org.polarsys.time4sys.library.LibraryPackage;
import org.polarsys.time4sys.library.RateMonotonicSchedulingPolicy;

import org.polarsys.time4sys.marte.grm.impl.SchedulingPolicyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rate Monotonic Scheduling Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RateMonotonicSchedulingPolicyImpl extends SchedulingPolicyImpl implements RateMonotonicSchedulingPolicy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RateMonotonicSchedulingPolicyImpl() {
		super("RateMonotonic");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.RATE_MONOTONIC_SCHEDULING_POLICY;
	}

} //RateMonotonicSchedulingPolicyImpl
