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

package org.polarsys.time4sys.ui;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;
import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Time4sysFactory;

import com.google.common.collect.Maps;

/**
 * Set of utilities to manage Time4Sys projects.
 */
public class Time4SysProjectUtils {
	/**
	 * Creates the semantic root element from the given operation arguments.
	 *
	 * @return the semantic root {@link EObject}
	 */
	private static EObject createInitialModel(String rootObjectName) {
		Project root = null;
		DesignModel design = null;

		if ("Project".equals(rootObjectName)) {
			root = Time4sysFactory.eINSTANCE.createProject();
			design = DesignFactory.eINSTANCE.createDesignModel();
			root.setDesign(design);
		} else if ("Design".equals(rootObjectName)) {
			return DesignFactory.eINSTANCE.createDesignModel();
		}
		return root;
	}

	/**
	 * Create a new Time4Sys model in a project.
	 *
	 * @param project
	 *            Modeling project
	 * @param rootObjectType
	 *            Name of the root object
	 * @param newT4SFileName
	 *            Name of the Time4Sys file
	 * @return Newly created Time4Sys file
	 */
	public static Option<IFile> createSemanticResource(final IProject project, final String rootObjectType,
			final String newT4SFileName, final String newT4SFile) {
		final Option<ModelingProject> modelingProject = ModelingProject.asModelingProject(project);
		final Session session = modelingProject.get().getSession();
		final String platformPath = getNewTime4SysModelFilePath(project, newT4SFile);
		session.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
					@Override
					protected void doExecute() {

						final URI semanticModelURI = URI.createPlatformResourceURI(platformPath, true);
						final Resource res = new ResourceSetImpl().createResource(semanticModelURI);
						/* Add the initial model object to the contents. */
						final EObject rootObject = Time4SysProjectUtils.createInitialModel(rootObjectType);

						if (rootObject != null) {
							((Project) rootObject).setName(newT4SFileName);
							res.getContents().add(rootObject);
						}

						try {
							res.save(Maps.newHashMap());
						} catch (final IOException e) {
						}

						session.addSemanticResource(semanticModelURI, new NullProgressMonitor());

						session.save(new NullProgressMonitor());
					}
				});
		return Options.newSome(ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformPath)));
	}

	/**
	 * Get the new Time4Sys model file path.
	 *
	 * @param project
	 *            Project
	 * @param t4SFileName
	 *            File name
	 * @return Time4Sys model file path
	 */
	private static String getNewTime4SysModelFilePath(IProject project, String t4SFileName) {
		return '/' + project.getName() + '/' + t4SFileName.toLowerCase();
	}

}
