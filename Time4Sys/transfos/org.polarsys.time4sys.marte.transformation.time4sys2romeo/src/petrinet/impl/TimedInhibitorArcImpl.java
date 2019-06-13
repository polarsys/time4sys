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

import petrinet.PetrinetPackage;
import petrinet.TimedInhibitorArc;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Inhibitor Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TimedInhibitorArcImpl extends ConnectionImpl implements TimedInhibitorArc {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedInhibitorArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.TIMED_INHIBITOR_ARC;
	}

	
	@Override
	public TimedInhibitorArc clone() {
		
		TimedInhibitorArc timedInhibitorArc = new TimedInhibitorArcImpl();
//		timedInhibitorArc.setSource(getSource());
//		timedInhibitorArc.setTarget(getTarget());
		timedInhibitorArc.setToken(getToken());
		
//		java.lang.System.out.println("oui");
		
		return timedInhibitorArc;
	}
} //TimedInhibitorArcImpl
