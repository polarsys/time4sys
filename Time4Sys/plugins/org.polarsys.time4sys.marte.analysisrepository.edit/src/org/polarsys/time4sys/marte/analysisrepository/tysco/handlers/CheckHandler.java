package org.polarsys.time4sys.marte.analysisrepository.tysco.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
//import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.AnalysisRepositoryUI;
import org.polarsys.time4sys.model.time4sys.Project;


public class CheckHandler extends AbstractHandler {
	/**
	 * @generated NOT
	 */	
	
	public CheckHandler() {
		setBaseEnabled(false);
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		if (window==null||window.getShell()==null) return null;
		Shell shell = window.getShell();
		AnalysisRepositoryUI ui = new AnalysisRepositoryUI(shell);
		ui.setBlockOnOpen(true);
		
		   // Open the main window
		int returnCode = ui.open();
		if (returnCode==Window.CANCEL||returnCode==Window.OK) return null;

		return null;
	}
	
	@Override
	public void setEnabled(Object evaluationContext) {
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getSelection();
		
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			
			if (structuredSelection.getFirstElement() instanceof Project) {
					setBaseEnabled(true);
					return;			
			} 
		} 
		setBaseEnabled(false);
	}
}
