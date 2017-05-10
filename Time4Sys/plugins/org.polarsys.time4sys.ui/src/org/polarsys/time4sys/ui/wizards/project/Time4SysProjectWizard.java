/*******************************************************************************
 * Copyright (c) 2009, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/

package org.polarsys.time4sys.ui.wizards.project;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.polarsys.time4sys.ui.wizards.model.AbstractNewModelWizard;
import org.polarsys.time4sys.ui.wizards.model.ModelWizardInitPage;

/**
 * The wizard to create a new Time4Sys designer project.
 */
public class Time4SysProjectWizard extends AbstractNewModelWizard {

	protected ModelWizardInitPage modelPage;

	protected WizardNewProjectCreationPage newProjectPage;

	@Override
	public void addPages() {

		newProjectPage = new WizardNewProjectCreationPage("Project"); //$NON-NLS-1$
		newProjectPage.setInitialProjectName("New Project"); //$NON-NLS-1$
		newProjectPage.setTitle("Create a Time4Sys Modeling project"); //$NON-NLS-1$
		newProjectPage.setDescription("Enter a project name"); //$NON-NLS-1$
		addPage(newProjectPage);

		modelPage = new ModelWizardInitPage("New model");
		modelPage.setTitle("Time4Sys project creation");
		modelPage.setDescription("Create a new Time4Sys Project");
		addPage(modelPage);
	}

	@Override
	public boolean performFinish() {
		try {
			project = ModelingProjectManager.INSTANCE.createNewModelingProject(newProjectPage.getProjectName(),
					newProjectPage.getLocationPath(), true, new NullProgressMonitor());
			rootObjectType = modelPage.getInitialObjectName();
			newT4SModelFileName = newProjectPage.getProjectName();
			newT4SModelFile = newT4SModelFileName + ".time4sys";

			super.performFinish();
		} catch (final CoreException e) {
		}

		return true;
	}
}
