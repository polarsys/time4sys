/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies, RealTime-at-Work, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *     Loïc Fejoz - initial simple report generation
 *******************************************************************************/
package org.polarsys.time4sys.activity.explorer.activity;

import org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.AbstractHyperlinkAdapter;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.AnalysisRepositoryControler;
import org.polarsys.time4sys.model.time4sys.Project;

public class CheckProjectWithAnalysisRepository extends AbstractHyperlinkAdapter {

	/**
	 * Default constructor
	 */
	public CheckProjectWithAnalysisRepository() {
		super(ActivityExplorerManager.INSTANCE.getRootSemanticModel());
	}

	/**
	 * Constructor with parameters
	 * 
	 * @param root
	 *            the root model element ({@link EObject})
	 * @param session
	 *            the associated {@link Session} with the activity explorer
	 */
	public CheckProjectWithAnalysisRepository(EObject root) {
		super(root);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.
	 * AbstractHyperlinkAdapter#linkPressed(org.eclipse.ui.forms.events.
	 * HyperlinkEvent, org.eclipse.emf.ecore.EObject,
	 * org.eclipse.sirius.business.api.session.Session)
	 */
	@Override
	protected void linkPressed(final HyperlinkEvent event, EObject design, final Session session) {
		if (design instanceof Project){
			design = ((Project) design).getDesign();
		}
		if (design instanceof DesignModel) {
			AnalysisRepositoryControler ctrl = new AnalysisRepositoryControler();
			ctrl.check((DesignModel)design);
		}
	}
}