/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.odesign.actions.extensions;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.odesign.service.BehaviorScenarioServices;

/**
 * @author loic
 *
 */
public class Arinc653PartitionCreation implements IExternalJavaAction {

	/* (non-Javadoc)
	 * @see org.eclipse.sirius.tools.api.ui.IExternalJavaAction#execute(java.util.Collection, java.util.Map)
	 */
	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		final Object obj = parameters.get("task");
		final SoftwareSchedulableResource proc = BehaviorScenarioServices.unwrap(obj, SoftwareSchedulableResource.class);
		if (proc != null) {
			BehaviorScenarioServices.transformAsArinc653Partition(null, Collections.singletonList((EObject)proc));
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
