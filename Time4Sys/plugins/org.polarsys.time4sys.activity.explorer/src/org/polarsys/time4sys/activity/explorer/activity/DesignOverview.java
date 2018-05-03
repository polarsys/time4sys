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
package org.polarsys.time4sys.activity.explorer.activity;

import org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.AbstractNewDiagramHyperlinkAdapter;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.tools.api.ui.RefreshEditorsPrecommitListener;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.polarsys.time4sys.model.time4sys.Project;

public class DesignOverview extends AbstractNewDiagramHyperlinkAdapter {

	public DesignOverview() {
		super(ActivityExplorerManager.INSTANCE.getRootSemanticModel());
	}

	@Override
	public void linkActivated(HyperlinkEvent event) {
		Session session = ActivityExplorerManager.INSTANCE.getSession();
		RefreshEditorsPrecommitListener repl = session.getRefreshEditorsListener();
		repl.notify(SessionListener.REPRESENTATION_CHANGE);
		repl.notify(SessionListener.SEMANTIC_CHANGE);
		EObject root = ActivityExplorerManager.INSTANCE.getRootSemanticModel();
		if (root instanceof Project) {
			Project rootProject = (Project) root;
			linkPressed(event, rootProject.getDesign(), session);
		}
	}

	@Override
	public String getRepresentationName() {
		return "Design Overview";
	}
}