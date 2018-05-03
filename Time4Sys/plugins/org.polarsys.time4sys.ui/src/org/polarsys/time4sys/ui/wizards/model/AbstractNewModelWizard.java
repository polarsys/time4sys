/*******************************************************************************
 * Copyright (c) 2014, 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/

package org.polarsys.time4sys.ui.wizards.model;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.amalgam.explorer.activity.ui.api.preferences.PreferenceConstants;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

/**
 * Implement the perform finish method when the Time4Sys creation wizard OK
 * button is pressed.
 */
public abstract class AbstractNewModelWizard extends BasicNewProjectResourceWizard {

	/**
	 * Time4Sys project.
	 */
	protected IProject project;

	/**
	 * Name of the model root element.
	 */
	protected String rootObjectType;

	/**
	 * Name of the Time4Sys file.
	 */
	protected String newT4SModelFileName;

	/**
	 * Name of the Time4Sys file.
	 */
	protected String newT4SModelFile;

	/**
	 * Open the dashboard representation containing in the representation file
	 * of this Modeling project.
	 *
	 * @param curProject
	 *            The modeling project containing the representations file.
	 */
	public void openDashboard(IProject curProject) {
		final Option<ModelingProject> opionalModelingProject = ModelingProject.asModelingProject(curProject);
		if (opionalModelingProject.some()) {
			final Session session = opionalModelingProject.get().getSession();
			if (session != null) {
				final boolean initialValue = ActivityExplorerActivator.getDefault().getPreferenceStore()
						.getBoolean(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER);
				// in order to open activity explorer at project creation the
				// preference store
				// P_OPEN_ACTIVITY_EXPLORER need to be set to true
				ActivityExplorerActivator.getDefault().getPreferenceStore()
						.setValue(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER, true);

				final IEditorPart part = ActivityExplorerManager.INSTANCE.getEditorFromSession(session);
				if (part != null) {
					// Activity explorer already opened
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().activate(part);
				} else {
					ActivityExplorerManager.INSTANCE.openEditor(session);
				}
				ActivityExplorerActivator.getDefault().getPreferenceStore()
						.setValue(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER, initialValue);
			}
		}
	}

	/**
	 */
	@Override
	public boolean performFinish() {
		if (project == null || rootObjectType == null || newT4SModelFile == null) {
			throw new IllegalArgumentException();
		}

		final IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
			@Override
			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				final InitTime4SysModel init = new InitTime4SysModel(project, rootObjectType, newT4SModelFile,
						newT4SModelFileName);
				try {
					getContainer().run(false, true, init);
				} catch (final InterruptedException e) {
					// Ignore.
				} catch (final InvocationTargetException e) {
				}

				// Get the newly created Time4Sys file
				final IResource newT4SModelFile = project.findMember(newT4SModelFileName);

				// Switch to the modeling perspective
				updatePerspective();

				// Select it in the explorer
				selectAndReveal(newT4SModelFile, PlatformUI.getWorkbench().getActiveWorkbenchWindow());

				// Open the dashboard
				openDashboard(project);

				PlatformUI.getWorkbench().getHelpSystem().displayDynamicHelp();
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (final InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(), "Error during model creation", null,
						((CoreException) e.getTargetException()).getStatus());
			}
		} catch (final InterruptedException e) {
			return false;
		}

		return true;
	}
}