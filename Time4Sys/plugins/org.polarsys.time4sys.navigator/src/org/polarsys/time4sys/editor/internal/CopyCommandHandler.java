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
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CopyToClipboardCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;

public class CopyCommandHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
		if (selection instanceof IStructuredSelection){
			@SuppressWarnings("unchecked")
			List<Object> selectionList = ((IStructuredSelection)selection).toList();
			int index = 0;
			EditingDomain memorizedDomain = null;
			boolean visiblebleCopyPaste = true;
			while (index<selectionList.size() && visiblebleCopyPaste  == true){
				if (!(selectionList.get(index) instanceof ModelElement)){
					visiblebleCopyPaste = false;
				}else{
					TransactionalEditingDomain tempDomain = TransactionUtil.getEditingDomain((ModelElement)selectionList.get(index));
					if (index == 0){
						memorizedDomain = tempDomain;
					}
					if (memorizedDomain != tempDomain){
						visiblebleCopyPaste = false;
					}
				}
				index ++;
			}
			if (visiblebleCopyPaste){
				Command copyToClipBoardCommand = CopyToClipboardCommand.create(memorizedDomain, selectionList);
				if (copyToClipBoardCommand.canExecute()) {
					copyToClipBoardCommand.execute();
				}
			}
		}
		return null;
	}

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
