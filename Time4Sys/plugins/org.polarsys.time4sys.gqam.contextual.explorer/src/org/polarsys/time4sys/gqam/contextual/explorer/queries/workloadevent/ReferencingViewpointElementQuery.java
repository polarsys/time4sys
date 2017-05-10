/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/

// Generated on 23.11.2016 at 05:48:04 CET by Viewpoint DSL Generator V 0.1

package org.polarsys.time4sys.gqam.contextual.explorer.queries.workloadevent;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.time4sys.marte.gqam.ArrivalPattern;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.EndToEndFlow;

/**
* <!-- begin-user-doc -->
* <!-- end-user-doc -->
* <p>
* </p>
*
* @generated
*/
public class ReferencingViewpointElementQuery implements IQuery {

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * Default constructor
	   * @generated
	   */
	public ReferencingViewpointElementQuery() {
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
		Resource resource = ((EObject) object_p).eResource();
		if (resource != null) {
			for (TreeIterator<EObject> iter = resource.getAllContents(); iter.hasNext();) {
				EObject eObject = iter.next();

				if (eObject instanceof ArrivalPattern) {
					ArrivalPattern referencingElement = (ArrivalPattern) eObject;
					if (referencingElement.getParent() != null && referencingElement.getParent().equals(object_p))
						result.add(eObject);
				}

				if (eObject instanceof BehaviorScenario) {
					BehaviorScenario referencingElement = (BehaviorScenario) eObject;
					if (referencingElement.getCause() != null && referencingElement.getCause().contains(object_p))
						result.add(eObject);
				}

				if (eObject instanceof EndToEndFlow) {
					EndToEndFlow referencingElement = (EndToEndFlow) eObject;
					if (referencingElement.getEndToEndStimuli() != null
							&& referencingElement.getEndToEndStimuli().contains(object_p))
						result.add(eObject);
				}
			}
		}
		return result;
	}

}