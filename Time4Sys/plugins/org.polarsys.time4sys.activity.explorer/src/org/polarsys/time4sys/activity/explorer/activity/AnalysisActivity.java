/*******************************************************************************
 * Copyright (c) 2016, 2018 Artal Technologies and others.
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
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.common.ui.tools.api.selection.EObjectSelectionWizard;
import org.eclipse.sirius.diagram.ui.provider.DiagramUIPlugin;
import org.eclipse.sirius.tools.api.ui.RefreshEditorsPrecommitListener;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.model.time4sys.Project;

public class AnalysisActivity extends AbstractNewDiagramHyperlinkAdapter {

	public AnalysisActivity() {
		super(ActivityExplorerManager.INSTANCE.getRootSemanticModel());
	}

	@Override
	public void linkActivated(final HyperlinkEvent event) {
		final Session session = ActivityExplorerManager.INSTANCE.getSession();
		RefreshEditorsPrecommitListener repl = session.getRefreshEditorsListener();
		repl.notify(SessionListener.REPRESENTATION_CHANGE);
		repl.notify(SessionListener.SEMANTIC_CHANGE);
		EObject root = ActivityExplorerManager.INSTANCE.getRootSemanticModel();
		if (root instanceof Project) {
			final Project rootProject = (Project) root;
			if (rootProject.getDerivations().size() > 0) {
				EObjectSelectionWizard wizard = new EObjectSelectionWizard("Create a Design diagram",
						"Select the transformed design model", null, rootProject.getDerivations(),
						DiagramUIPlugin.getPlugin().getItemProvidersAdapterFactory());
				WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
						wizard);
				if (dialog.open() == Window.OK) {
					linkPressed(event, wizard.getSelectedEObject(), session);
				}
			} else {
			    TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(rootProject);
			    domain.getCommandStack().execute(new RecordingCommand(domain) {

			        @Override
			        protected void doExecute() {

				DesignModel designModel = DesignFactory.eINSTANCE.createDesignModel();
				rootProject.getDerivations().add(designModel);
				linkPressed(event, designModel, session);
			        }
			});
		}
	}}

	@Override
	public String getRepresentationName() {
		return "Transformed Design";
	}

}
