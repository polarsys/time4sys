/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.simulation.commands;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.polarsys.time4sys.model.time4sys.Project;

public abstract class AbstractTransformationCommandHandler<T extends EObject, R> extends AbstractHandler {
	
	public static abstract class TransfoRunnable<T, R> extends AutoRecordingCommand {

		protected final T obj;
		protected Project project;
		protected R result;
		protected final TransactionalEditingDomain theDomain;

		public TransfoRunnable(final TransactionalEditingDomain domain, final T value, final String label) {
			super(domain, label);
			obj = value;
			theDomain = domain;
		}
		
		protected void setResult(final R value) {
			result = value;
		}
		
		@Override
		public Collection<R> getResult() {
		    return Collections.singletonList(result);
		}
	}
	
	private static Project getProject(final EObject obj) {
		EObject current = obj.eContainer();
		while(current != null && !(current instanceof Project)) {
			current = current.eContainer();
		}
		return (Project)current;
	}
	
	protected final Class<T> clazz;
	private String name;

	public AbstractTransformationCommandHandler(final Class<T> theHandledClass/*, final String transfoname*/) {
		clazz = theHandledClass;
		name = "Test";
	}

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		final ISelection selection = HandlerUtil.getCurrentSelection(event);
		try {
			window.run(true, false, new IRunnableWithProgress() {
				
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					if (selection instanceof ITreeSelection) {
						execute((ITreeSelection)selection, monitor, window);
					}
				}
			});
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return selection;
	}

	private void execute(final ITreeSelection selection, final IProgressMonitor monitor, final IWorkbenchWindow window) {
		monitor.beginTask(name, selection.size());
		try {
			final Iterator<?> it = selection.iterator();
			while (it.hasNext()) {
				final T obj = adapt(it.next());
				if (obj != null) {
					final Project project = getProject((EObject) obj);
					final CommandRunner cmdRunner = new CommandRunner(window, project);
					final TransfoRunnable<T, R> aCmd = createRecordingCommand(cmdRunner.getDomain(), obj);
					aCmd.project = project;
					cmdRunner.execute(aCmd);
				}
				monitor.worked(1);
			}
		} finally {
			monitor.done();
		}
	}

	/**
	 * Retrieve CommandStack either from editingDomain or current IWorkbenchWindow
	 * @param window
	 * @param theDomain
	 * @return
	 */
	public CommandStack getCommandStack(final IWorkbenchWindow window, final TransactionalEditingDomain theDomain) {
		CommandStack commandStack = null;
		if (theDomain == null && window != null) {
			final IWorkbenchPage page = window.getActivePage();
			if (page != null) {
				final IEditorPart activeEditor = page.getActiveEditor();
				if (activeEditor instanceof IEditingDomainProvider) {
					final EditingDomain editingDomain = ((IEditingDomainProvider)activeEditor).getEditingDomain();
					commandStack = editingDomain.getCommandStack();
				}
			}
		} else {
			commandStack = theDomain.getCommandStack();
		}
		return commandStack;
	}

	protected T adapt(final Object obj) {
		if (clazz.isInstance(obj)) {
			return (T)obj;
		}
		return null;
	}

	protected abstract TransfoRunnable<T, R> createRecordingCommand(final TransactionalEditingDomain domain, final T simu);
	
}
