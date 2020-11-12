package org.polarsys.time4sys.graphics.partition.ui.action;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.PlatformUI;
import org.polarsys.time4sys.graphics.partition.ui.CRSelectionListener;

public class StartupAction implements IStartup {

	@Override
	public void earlyStartup() {
		Display.getDefault().asyncExec(new Runnable() {
		    @Override
		    public void run() {
		    	ISelectionService ss = PlatformUI
				.getWorkbench()
				.getActiveWorkbenchWindow()
				.getSelectionService();
				ss.addPostSelectionListener(CRSelectionListener.getInstance());
		    }
		});
	}

}
