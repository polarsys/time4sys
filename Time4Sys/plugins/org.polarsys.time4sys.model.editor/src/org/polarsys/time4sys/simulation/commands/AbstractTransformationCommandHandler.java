package org.polarsys.time4sys.simulation.commands;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.polarsys.time4sys.model.time4sys.Project;

public abstract class AbstractTransformationCommandHandler<T extends EObject, R> extends AbstractHandler {
	
	public static abstract class TransfoRunnable<T, R> extends RecordingCommand {

		protected final T obj;
		protected Project project;
		protected R result;

		public TransfoRunnable(final TransactionalEditingDomain domain, final T value) {
			super(domain);
			obj = value;
		}
		
		@Override
		protected abstract void doExecute();
		
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

	public AbstractTransformationCommandHandler(final Class<T> theHandledClass) {
		clazz = theHandledClass;
	}

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final ISelection selection = org.eclipse.ui.handlers.HandlerUtil.getCurrentSelection(event);
		if (selection instanceof ITreeSelection) {
			execute((ITreeSelection)selection);
		}
		return null;
	}

	private void execute(final ITreeSelection selection) {
		final Iterator<?> it = selection.iterator();
		while(it.hasNext()) {
			final Object obj = it.next();
			if (clazz.isInstance(obj)) {
				final TransactionalEditingDomain theDomain = TransactionUtil.getEditingDomain(obj);
				final TransfoRunnable<T, R> aCmd = createRecordingCommand(theDomain, (T)obj);
				aCmd.project = getProject((EObject)obj);
				final RunnableWithResult<?> privileged;
				if (theDomain == null) {
					aCmd.doExecute();
				} else {
					theDomain.getCommandStack().execute(aCmd);
				}
			}
		}
	}

	protected abstract TransfoRunnable<T, R> createRecordingCommand(final TransactionalEditingDomain domain, final T simu);
	
}
