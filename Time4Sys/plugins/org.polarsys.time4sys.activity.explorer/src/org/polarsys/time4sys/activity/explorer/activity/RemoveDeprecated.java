/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and code
 *******************************************************************************/
package org.polarsys.time4sys.activity.explorer.activity;

import org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.AbstractHyperlinkAdapter;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.transformations.RemoveAndReplaceDeprecated;

public class RemoveDeprecated extends AbstractHyperlinkAdapter {
	
	/**
	 * Default constructor
	 */
	public RemoveDeprecated() {
		super(ActivityExplorerManager.INSTANCE.getRootSemanticModel());
	}

	/**
	 * Constructor with parameters
	 * 
	 * @param root
	 *            the root model element ({@link EObject})
	 * @param session
	 *            the associated {@link Session} with the activity explorer
	 */
	public RemoveDeprecated(final EObject root) {
		super(root);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.
	 * AbstractHyperlinkAdapter#linkPressed(org.eclipse.ui.forms.events.
	 * HyperlinkEvent, org.eclipse.emf.ecore.EObject,
	 * org.eclipse.sirius.business.api.session.Session)
	 */
	@Override
	protected void linkPressed(final HyperlinkEvent event, final EObject project_p, final Session session) {
		if (project_p instanceof Project) {
			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(project_p);
			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				protected void doExecute() {
					final Project prj = ((Project) project_p);
					RemoveAndReplaceDeprecated.removeAndReplaceDeprecated(prj);
				}
			});

		}
	}
}
