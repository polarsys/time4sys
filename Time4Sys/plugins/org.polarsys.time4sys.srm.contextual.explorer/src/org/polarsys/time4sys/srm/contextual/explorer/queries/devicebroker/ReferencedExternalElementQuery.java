/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/

// Generated on 23.11.2016 at 05:40:11 CET by Viewpoint DSL Generator V 0.1

package org.polarsys.time4sys.srm.contextual.explorer.queries.devicebroker;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.marte.srm.DeviceBroker;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReferencedExternalElementQuery implements IQuery {

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * Default constructor
	   * @generated
	   */
	public ReferencedExternalElementQuery() {
		// TODO Auto-generated constructor stub
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object_p: The model element for which the Contextual Explorer extension is generated
	* @return List of object to display in the parent category
	* @generated
	*/
	public List<Object> compute(Object object_p) {
		List<Object> result = new ArrayList<Object>();
		DeviceBroker object = (DeviceBroker) object_p;

		for (EObject eObject : object.getDevices())
			result.add(eObject);

		for (EObject eObject : object.getCloseServices())
			result.add(eObject);

		for (EObject eObject : object.getOpenServices())
			result.add(eObject);

		for (EObject eObject : object.getControlServices())
			result.add(eObject);

		for (EObject eObject : object.getReadServices())
			result.add(eObject);

		for (EObject eObject : object.getWriteServices())
			result.add(eObject);

		return result;
	}

}