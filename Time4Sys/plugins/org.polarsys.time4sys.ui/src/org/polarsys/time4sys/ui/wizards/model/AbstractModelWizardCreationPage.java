/*******************************************************************************
 * Copyright (c) 2014, 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/

package org.polarsys.time4sys.ui.wizards.model;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * An extension to provide TimeSys designer custom provider in model content view.
 */
public abstract class AbstractModelWizardCreationPage extends WizardNewFileCreationPage {

	/**
	 * Constructor.
	 *
	 * @param pageName
	 *            the page name
	 * @param selection
	 *            the selection
	 */
	public AbstractModelWizardCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
	}

	/**
	 * Get the model file.
	 *
	 * @return Model file
	 */
	public Option<IFile> getModelFile() {
		return Options.newSome(ResourcesPlugin.getWorkspace().getRoot()
				.getFile(getContainerFullPath().append(getFileName())));
	}

	/**
	 * This method should return the extension of the file to create.
	 *
	 * @return the file extension to create.
	 */
	protected abstract String getRequiredExtension();

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected boolean validatePage() {
		if (super.validatePage()) {
			final String requiredExt = getRequiredExtension();
			final String enteredExt = new Path(getFileName()).getFileExtension();
			if (enteredExt == null || !enteredExt.equals(requiredExt)) {
				setErrorMessage(NLS.bind("Wrong file extension", requiredExt));
				return false;
			}
			return true;

		}
		return false;
	}
}
