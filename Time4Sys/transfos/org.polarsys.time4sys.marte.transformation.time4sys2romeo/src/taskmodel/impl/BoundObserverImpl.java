/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Thanh Dat NGUYEN- initial API and implementation
 *
 *******************************************************************************/
/**
 */
package taskmodel.impl;

import org.eclipse.emf.ecore.EClass;

import taskmodel.BoundObserver;
import taskmodel.TaskmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bound Observer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BoundObserverImpl extends ObserverImpl implements BoundObserver {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundObserverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskmodelPackage.Literals.BOUND_OBSERVER;
	}

} //BoundObserverImpl
