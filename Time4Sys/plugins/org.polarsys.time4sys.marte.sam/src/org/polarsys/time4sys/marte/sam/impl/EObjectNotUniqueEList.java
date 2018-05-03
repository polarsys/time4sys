/*******************************************************************************
 * Copyright (c) 2017, 2018 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.marte.sam.impl;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

public class EObjectNotUniqueEList<E> extends EObjectResolvingEList<E> {

	public EObjectNotUniqueEList(Class<?> dataClass, InternalEObject owner, int featureID) {
		super(dataClass, owner, featureID);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean isUnique() {
		return false;
	}
}
