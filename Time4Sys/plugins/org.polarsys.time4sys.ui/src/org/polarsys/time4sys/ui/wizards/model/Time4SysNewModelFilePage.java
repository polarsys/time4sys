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

package org.polarsys.time4sys.ui.wizards.model;

import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * The semantic model file creation page.
 */
public class Time4SysNewModelFilePage extends AbstractModelWizardCreationPage {

	/**
	 * Constructor.
	 *
	 * @param pageName
	 *            the page name
	 * @param selection
	 *            the selection
	 */
	public Time4SysNewModelFilePage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getRequiredExtension() {
		return "time4sys"; //$NON-NLS-1$
	}
}
