/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.simulation.commands;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;

/**
 * @author loic
 *
 */
public class CommandRunner {

	/**
	 * Retrieve CommandStack either from editingDomain or current IWorkbenchWindow
	 * @param window
	 * @param theDomain
	 * @return
	 */
	public static CommandStack getCommandStack(final IWorkbenchPage page, final TransactionalEditingDomain theDomain) {
		CommandStack commandStack = null;
		if (theDomain == null && page != null) {
			final IEditorPart activeEditor = page.getActiveEditor();
			if (activeEditor instanceof IEditingDomainProvider) {
				final EditingDomain editingDomain = ((IEditingDomainProvider)activeEditor).getEditingDomain();
				commandStack = editingDomain.getCommandStack();
			}
		} else {
			commandStack = theDomain.getCommandStack();
		}
		return commandStack;
	}


	protected Object obj;
	private TransactionalEditingDomain theDomain;
	private IWorkbenchPage page;
	
	
	public CommandRunner(final IWorkbenchWindow window, final Object value) {
		this(window.getActivePage(), value);
	}


	public CommandRunner(final IWorkbenchPage page, Object value) {
		obj = value;
		this.page = page;
		theDomain = TransactionUtil.getEditingDomain(obj);	}


	public void execute(final AutoRecordingCommand aCmd) {
		if (aCmd == null) {
			return;
		}
		final CommandStack commandStack = getCommandStack(page, theDomain);
		if (commandStack == null) {
			aCmd.doExecute();
		} else {
			final Command theCmd;
			// Do we need to wrap RecordingCommand that expect a transaction (thus a domain)?
			if (theDomain == null) {
				theCmd = new RecWrapper(aCmd);
			} else {
				theCmd = aCmd;
			}
			commandStack.execute(theCmd);
		}
	}


	public TransactionalEditingDomain getDomain() {
		return theDomain;
	}

}
