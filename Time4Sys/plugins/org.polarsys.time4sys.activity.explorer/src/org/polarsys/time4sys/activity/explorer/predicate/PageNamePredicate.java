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
package org.polarsys.time4sys.activity.explorer.predicate;

import java.util.Arrays;
import java.util.List;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.predicates.IPredicate;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @generated
 */
public class PageNamePredicate implements IPredicate {
	/**
	 * Default constructor
	 * 
	 * @generated
	 */
	public PageNamePredicate() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @generated
	 */
	@Override
	public boolean isOk() {
		return fileExtensionPredicate();
	}

	/**
	 * This method check if the extension of the resource file associated with
	 * the Sirius session is provided by viewpoint specifier.
	 * 
	 * @return True if the current page can be used with the current resource.
	 * @generated
	 */
	protected boolean fileExtensionPredicate() {
		final EObject rootSemanticModel = ActivityExplorerManager.INSTANCE.getRootSemanticModel();
		final Resource eResource = rootSemanticModel.eResource();
		if (null == eResource)
			return false;

		final URI resourceURI = eResource.getURI();
		if (null == resourceURI)
			return false;

		final List<String> allowedFileExtensions = Arrays.asList("fileExtension");
		final String fileExtension = resourceURI.fileExtension().toLowerCase();

		return allowedFileExtensions.contains(fileExtension);
	}
}