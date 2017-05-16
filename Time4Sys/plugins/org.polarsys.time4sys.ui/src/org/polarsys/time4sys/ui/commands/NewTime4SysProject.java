/*******************************************************************************
 * Copyright (c) 2014 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/

package org.polarsys.time4sys.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.polarsys.time4sys.ui.wizards.project.Time4SysProjectWizard;

/**
 * Create a new Time4Sys project command handler.
 */
public class NewTime4SysProject extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Open the new Time4Sys project wizard
		final IWizard wizard = new Time4SysProjectWizard();
		final WizardDialog dialog = new WizardDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
		dialog.open();
		return null;
	}
}
