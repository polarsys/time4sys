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
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.CopyToClipboardCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;

public class CutCommandHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
		if (selection instanceof IStructuredSelection){
			@SuppressWarnings("unchecked")
			List<Object> selectionList = ((IStructuredSelection)selection).toList();
			int index = 0;
			EditingDomain memorizedDomain = null;
			boolean copy = true;
			while (index<selectionList.size() && copy  == true){
				if (!(selectionList.get(index) instanceof ModelElement)){
					copy = false;
				}else{
					TransactionalEditingDomain tempDomain = TransactionUtil.getEditingDomain((ModelElement)selectionList.get(index));
					if (index == 0){
						memorizedDomain = tempDomain;
					}
					if (memorizedDomain != tempDomain){
						copy = false;
					}
				}
				index ++;
			}
			if (copy){
				CompoundCommand cutCommand = new CompoundCommand();
				Command copyToClipBoardCommand = CopyToClipboardCommand.create(memorizedDomain, selectionList);
				cutCommand.append(copyToClipBoardCommand);
				Command remove = RemoveCommand.create(memorizedDomain, selectionList);
				cutCommand.append(remove);
				memorizedDomain.getCommandStack().execute(cutCommand);
				
			}
		}
		return null;
	}

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
