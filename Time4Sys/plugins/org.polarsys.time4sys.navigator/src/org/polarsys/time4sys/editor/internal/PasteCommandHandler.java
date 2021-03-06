/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.editor.internal;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.PasteFromClipboardCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.navigator.CommonNavigator;
import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;

public class PasteCommandHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
		if (selection instanceof IStructuredSelection) {
			@SuppressWarnings("unchecked")
			List<Object> selectionList = ((IStructuredSelection)selection).toList();
			int index = 0;
			EditingDomain memorizedDomain = null;
			boolean visiblebleCopyPaste = true;
			while (index < selectionList.size() && visiblebleCopyPaste == true) {
				if (!(selectionList.get(index) instanceof ModelElement)) {
					visiblebleCopyPaste = false;
				} else {
					Session session = SessionManager.INSTANCE.getSession((ModelElement)selectionList.get(index));

					// TransactionalEditingDomain tempDomain =
					// TransactionUtil.getEditingDomain((Element)selectionList.get(index));
					TransactionalEditingDomain tempDomain = session.getTransactionalEditingDomain();
					if (index == 0) {
						memorizedDomain = tempDomain;
					}
					if (memorizedDomain != tempDomain) {
						visiblebleCopyPaste = false;
					}
				}
				index++;
			}

			if (selectionList.size() == 1 && selectionList.get(0) instanceof ModelElement) {
				TransactionalEditingDomain tempDomain = TransactionUtil
						.getEditingDomain((ModelElement)selectionList.get(0));
				Command pasteFromClipBoardCommand = PasteFromClipboardCommand.create(memorizedDomain,
						(ModelElement)selectionList.get(0), null);
				tempDomain.getCommandStack().execute(pasteFromClipBoardCommand);

				IViewPart modelExplorerView = null;
				try {
					modelExplorerView = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
							.showView("org.eclipse.sirius.ui.tools.views.model.explorer"); //$NON-NLS-1$
					if (modelExplorerView instanceof CommonNavigator) {
						final CommonNavigator modelExplorer = (CommonNavigator)modelExplorerView;
						final Collection<?> affectedObjects = pasteFromClipBoardCommand.getAffectedObjects();
						final Object affectedObject = affectedObjects.iterator().next();
						modelExplorer.getCommonViewer().refresh(((ModelElement)affectedObject).eContainer());
						modelExplorer.selectReveal(new StructuredSelection(affectedObject));
					}
				} catch (final PartInitException e) {
//					UMLDesignerPlugin.log(IStatus.ERROR,
//							NLS.bind(Messages.UmlModelExplorer_UI_ErrorMsg_NotFound, modelExplorerView), e);
				}

			}
		}
		return null;
	}

	public boolean isEnabled() {

		return true;
	}

}
