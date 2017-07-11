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
package org.polarsys.time4sys.marte.gqam.impl;

import org.eclipse.emf.ecore.EClass;
import org.polarsys.time4sys.marte.gqam.CommunicationChannel;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.grm.impl.SchedulableResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CommunicationChannelImpl extends SchedulableResourceImpl implements CommunicationChannel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.COMMUNICATION_CHANNEL;
	}

} //CommunicationChannelImpl
