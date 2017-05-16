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
package org.polarsys.time4sys.constraints.model.constraints.impl;

import org.eclipse.emf.ecore.EClass;
import org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage;
import org.polarsys.time4sys.constraints.model.constraints.LatencyConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Latency Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LatencyConstraintImpl extends TimingConstraintImpl implements LatencyConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatencyConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.LATENCY_CONSTRAINT;
	}

} //LatencyConstraintImpl
