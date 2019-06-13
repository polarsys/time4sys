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
package petrinet.impl;

import org.eclipse.emf.ecore.EClass;

import petrinet.FlushArc;
import petrinet.PetrinetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flush Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FlushArcImpl extends ConnectionImpl implements FlushArc {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlushArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.FLUSH_ARC;
	}

	@Override
	public FlushArc clone() {
		FlushArc flushArc = new FlushArcImpl();
//		flushArc.setSource(getSource());
//		flushArc.setTarget(getTarget());
		flushArc.setToken(getToken());
		return flushArc;
	}
} //FlushArcImpl
