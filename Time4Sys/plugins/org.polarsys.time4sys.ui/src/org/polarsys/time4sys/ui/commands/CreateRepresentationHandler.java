/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.handlers.HandlerUtil;

public class CreateRepresentationHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Open the new Time4Sys project wizard
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		IResource res = null;
		for (Object selected : selection.toList()) {
			if (selected instanceof IResource) {
				res = (IResource) selected;
				break;
			}
		}
		final URI semanticUri = URI.createURI(res.getLocationURI().toString());

		URI airdUri = URI.createURI(res.getParent().getLocationURI().toString() + "/" + "representations.aird");
		final Session session = SessionManager.INSTANCE.getSession(airdUri, new NullProgressMonitor());
		session.open(new NullProgressMonitor());
		session.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
					@Override
					protected void doExecute() {
						session.addSemanticResource(semanticUri, new NullProgressMonitor());
						final ViewpointSelectionCallback selected = new ViewpointSelectionCallback();
						for (final Viewpoint previouslySelected : session.getSelectedViewpoints(false)) {
							selected.deselectViewpoint(previouslySelected, session, new NullProgressMonitor());
						}
						selected.selectViewpoint(
								ViewpointRegistry.getInstance().getViewpoint(
										URI.createURI("viewpoint:/org.polarsys.time4sys.odesign/Analysis")),
								session, new NullProgressMonitor());

						selected.selectViewpoint(
								ViewpointRegistry.getInstance()
										.getViewpoint(URI.createURI("viewpoint:/org.polarsys.time4sys.odesign/Design")),
								session, new NullProgressMonitor());

					}
				});
		
		session.save(new NullProgressMonitor());
		session.close(new NullProgressMonitor());

		return selection;
	}
}
