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

// Generated on 23.11.2016 at 05:45:03 CET by Viewpoint DSL Generator V 0.1

package org.polarsys.time4sys.grm.contextual.explorer.queries.scheduler;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.time4sys.marte.grm.MutualExclusionResource;
import org.polarsys.time4sys.marte.grm.ProcessingResource;
import org.polarsys.time4sys.marte.grm.ResourceBroker;
import org.polarsys.time4sys.marte.grm.ResourceInstance;
import org.polarsys.time4sys.marte.grm.ResourceManager;
import org.polarsys.time4sys.marte.grm.ResourceUsage;
import org.polarsys.time4sys.marte.grm.SchedulableResource;

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

				if (eObject instanceof MutualExclusionResource) {
					MutualExclusionResource referencingElement = (MutualExclusionResource) eObject;
					if (referencingElement.getScheduler() != null && referencingElement.getScheduler().equals(object_p))
						result.add(eObject);
				}

				if (eObject instanceof ProcessingResource) {
					ProcessingResource referencingElement = (ProcessingResource) eObject;
					if (referencingElement.getMainScheduler() != null
							&& referencingElement.getMainScheduler().equals(object_p))
						result.add(eObject);
				}

				if (eObject instanceof ResourceBroker) {
					ResourceBroker referencingElement = (ResourceBroker) eObject;
					if (referencingElement.getBrokedResource() != null
							&& referencingElement.getBrokedResource().contains(object_p))
						result.add(eObject);
				}

				if (eObject instanceof ResourceInstance) {
					ResourceInstance referencingElement = (ResourceInstance) eObject;
					if (referencingElement.getType() != null && referencingElement.getType().equals(object_p))
						result.add(eObject);
				}

				if (eObject instanceof ResourceManager) {
					ResourceManager referencingElement = (ResourceManager) eObject;
					if (referencingElement.getManagedResource() != null
							&& referencingElement.getManagedResource().contains(object_p))
						result.add(eObject);
				}

				if (eObject instanceof ResourceUsage) {
					ResourceUsage referencingElement = (ResourceUsage) eObject;
					if (referencingElement.getUsedResource() != null
							&& referencingElement.getUsedResource().contains(object_p))
						result.add(eObject);
				}

				if (eObject instanceof SchedulableResource) {
					SchedulableResource referencingElement = (SchedulableResource) eObject;
					if (referencingElement.getHost() != null && referencingElement.getHost().equals(object_p))
						result.add(eObject);
				}
			}
		}
		return result;
	}

}