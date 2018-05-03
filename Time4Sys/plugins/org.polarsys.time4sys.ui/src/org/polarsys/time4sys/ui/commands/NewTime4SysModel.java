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

package org.polarsys.time4sys.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.polarsys.time4sys.ui.wizards.model.NewModelWizard;

/**
 * Create a new Time4Sys model command handler.
 */
public class NewTime4SysModel extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {

		final INewWizard wizard = new NewModelWizard();

		// Initialize the selection
		final IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		final ISelectionService service = window.getSelectionService();
		final IStructuredSelection selection = (IStructuredSelection)service
				.getSelection("org.eclipse.sirius.ui.tools.views.model.explorer"); //$NON-NLS-1$
		wizard.init(PlatformUI.getWorkbench(), selection);

		// Open the new model wizard
		final WizardDialog dialog = new WizardDialog(window.getShell(), wizard);
		dialog.open();
		return null;
	}
}
