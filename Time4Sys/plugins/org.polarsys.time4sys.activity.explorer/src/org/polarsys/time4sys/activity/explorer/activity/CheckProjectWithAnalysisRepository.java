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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.AbstractHyperlinkAdapter;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.handlers.HandlerUtil;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.AnalysisRepositoryControler;
import org.polarsys.time4sys.marte.gqam.ArrivalPattern;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.transformations.ToPeriodicDerivation;

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
	protected void linkPressed(final HyperlinkEvent event, final EObject project_p, final Session session) {
		if (project_p instanceof Project) {
			AnalysisRepositoryControler ctrl = new AnalysisRepositoryControler();
			ctrl.check((Project)project_p);
		}
	}
}