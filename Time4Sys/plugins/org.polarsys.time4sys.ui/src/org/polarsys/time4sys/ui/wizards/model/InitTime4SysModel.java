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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.polarsys.time4sys.ui.Time4SysProjectUtils;

/**
 * An operation to create and initialize a new session with empty semantic
 * Time4Sys model.
 */
public class InitTime4SysModel extends WorkspaceModifyOperation {

	/**
	 * The Time4Sys project.
	 */
	private final IProject project;

	/**
	 * The name of the semantic root element.
	 */
	private final String rootObjectName;

	/**
	 * The name of the Time4Sys file.
	 */
	private final String t4sFileName;

	/**
	 * The name of the Time4Sys file with time4sys extension.
	 */
	private final String t4sFile;

	/**
	 * Constructor.
	 *
	 * @param project
	 *            An {@link IProject} handle representing the project
	 * @param rootObjectType
	 *            The name of the semantic root element
	 * @param fileName
	 * @param projectName
	 */
	public InitTime4SysModel(IProject project, String rootObjectType, String file, String fileName) {
		super(null);
		this.project = project;
		this.rootObjectName = rootObjectType;
		t4sFile = file;
		t4sFileName = fileName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void execute(final IProgressMonitor monitor) throws CoreException, InterruptedException {
		final Option<ModelingProject> created = ModelingProject.asModelingProject(project);
		if (created.some()) {
			Display.getDefault().syncExec(new Runnable() {

				public void run() {
					// Create Time4Sys model
					Time4SysProjectUtils.createSemanticResource(project, rootObjectName, t4sFileName, t4sFile);
					// Enable Time4Sys viewpoints
					final Session session = created.get().getSession();

					if (session != null) {
						session.getTransactionalEditingDomain().getCommandStack()

								.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
									@Override
									protected void doExecute() {
										final ViewpointSelectionCallback selection = new ViewpointSelectionCallback();
										for (final Viewpoint previouslySelected : session
												.getSelectedViewpoints(false)) {
											selection.deselectViewpoint(previouslySelected, session,
													new NullProgressMonitor());
										}
										selection.selectViewpoint(
												ViewpointRegistry.getInstance()
														.getViewpoint(URI.createURI(
																"viewpoint:/org.polarsys.time4sys.odesign/Design")),
												session, new NullProgressMonitor());
									}
								});
					}
				}
			});
		}
	}

}
