/*******************************************************************************
 * Copyright (c) 2016, 2018 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.odesign.refresh.extension;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.business.api.refresh.IRefreshExtension;
import org.polarsys.time4sys.odesign.service.BehaviorScenarioServices;
import org.polarsys.time4sys.odesign.service.DiagramServices;

public class DesignRefreshExtension implements IRefreshExtension {

	@Override
	public void beforeRefresh(DDiagram arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see org.eclipse.sirius.business.api.refresh.IRefreshExtension#postRefresh(org.eclipse.sirius.DDiagram)
	 */
	public void postRefresh(DDiagram diagram_p) {
		if (DiagramServices.getDiagramServices().isFilterActivate("Hide End To End Flow Path / Show Behavior Scenario", diagram_p)) {
			BehaviorScenarioServices.getService().updateBehaviorScenarioStyles(diagram_p);
		} else {
			BehaviorScenarioServices.getService().updateETEFStyles(diagram_p);
		}
	}

}
