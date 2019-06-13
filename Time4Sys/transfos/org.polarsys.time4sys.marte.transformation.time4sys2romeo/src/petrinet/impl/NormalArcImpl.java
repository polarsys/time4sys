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

import petrinet.NormalArc;
import petrinet.PetrinetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NormalArcImpl extends ConnectionImpl implements NormalArc {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.NORMAL_ARC;
	}

	@Override
	public NormalArc clone() {
		NormalArc normalArc = new NormalArcImpl();
//		normalArc.setSource(getSource());
//		normalArc.setTarget(getTarget());
		normalArc.setToken(getToken());
		return normalArc;
	}
} //NormalArcImpl
