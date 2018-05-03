/*******************************************************************************
 * Copyright (c) 2009, 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.ui.wizards.model;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.ui.IWorkbench;

/**
 * The wizard to create a new Time4Sys designer model.
 */
public class NewModelWizard extends AbstractNewModelWizard {
	/**
	 * The semantic model creation file page.
	 */
	private Time4SysNewModelFilePage newModelFilePage;

	/**
	 * The initialization model page.
	 */
	private ModelWizardInitPage initModelPage;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addPages() {
		newModelFilePage = new Time4SysNewModelFilePage("Init Model", selection);
		newModelFilePage.setTitle("Time4Sys model creation wizard");
		newModelFilePage.setDescription("Create a new model");
		newModelFilePage.setFileName("Project.time4sys");
		addPage(newModelFilePage);

		initModelPage = new ModelWizardInitPage("Create a new Time4Sys model");
		initModelPage.setTitle("Create a new Time4Sys model");
		initModelPage.setDescription("Select the root model element");
		addPage(initModelPage);

		// Try and get the resource selection to determine a current directory
		// for the file dialog.
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			final Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				IResource selectedResource = (IResource) selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newModelFilePage.setContainerFullPath(selectedResource.getFullPath());

					// Make up a unique new name here.
					final String modelFilename = getNewModelName(selectedResource);
					newModelFilePage.setFileName(modelFilename);
				}
			}
		}
	}

	/**
	 * Compute the name of the new Time4Sys model.
	 *
	 * @param selectedResource
	 *            Selected resource
	 * @return Name of the new Time4Sys model
	 */
	private String getNewModelName(IResource selectedResource) {
		final String defaultModelBaseFilename = "NewProject";
		String modelFilename = defaultModelBaseFilename + ".time4sys"; //$NON-NLS-1$
		for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; ++i) {
			modelFilename = defaultModelBaseFilename + i + ".time4sys"; //$NON-NLS-1$
		}
		return modelFilename;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection structuredSelection) {
		selection = structuredSelection;
		setWindowTitle("New Time4Sys Model");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean performFinish() {
		final Option<IFile> option = newModelFilePage.getModelFile();

		if (option.some()) {
			final IFile modelFile = option.get();
			project = modelFile.getProject();

			// Convert project to modeling project
			try {
				ModelingProjectManager.INSTANCE.convertToModelingProject(project, new NullProgressMonitor());
			} catch (final CoreException e) {
			}

			rootObjectType = initModelPage.getInitialObjectName();
			newT4SModelFile = newModelFilePage.getName().toLowerCase() + ".time4sys";

			super.performFinish();
			return true;
		}
		return false;
	}
}
