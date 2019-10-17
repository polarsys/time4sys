/*******************************************************************************
 * Copyright (c) 2019 Link Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Khouloud BOUDHHIR / Oualid KHAYATI - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.trace.ctf.importer.ui.popup.actions;
/**
An implementation of the class ImportCTFtoSTAction
* Load CTF File
* Generate Scheduling Trace
* Save file trace.ST
* @author Khouloud
*
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import org.polarsys.time4sys.schedulingtrace.SchedulingTrace;
import org.polarsys.time4sys.trace.CTF.importer.ST.TraceCTFImporterSchedulingTrace;

//import com.linksoftware.runtimearchitect.core.console.RTAConsole;

public class ImportCTFtoSTAction implements IObjectActionDelegate {

	public ImportCTFtoSTAction() {
		// TODO Auto-generated constructor stub
	}
	private Shell shell;
	
	protected List<IFile> selectedFiles = new ArrayList<IFile>();
	
	@Override
	public void run(IAction action) {
		for(IFile selectedFile: selectedFiles){

			String traceFile = selectedFile.getLocation().toOSString();			
			traceFile = traceFile.replaceAll("\\\\","//");
					
		    String t4sFilePath = selectedFile.getParent().getLocation().toOSString();
		    t4sFilePath = t4sFilePath.replaceAll("\\\\","//");

			try {

				/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				 * 
				 * Place your import HERE !!!!!
				 *
				 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
			
				TraceCTFImporterSchedulingTrace.initXMIResources();

				SchedulingTrace trace = TraceCTFImporterSchedulingTrace.importCTFToSchedulingTrace(traceFile);
				 
				String resultFile = traceFile + ".ST"; 
				
				 TraceCTFImporterSchedulingTrace.saveToFile(trace,resultFile);
								
				selectedFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);

				MessageDialog.openInformation(
						shell,
						"Importation",
						"T4S Scheduling Trace model successfully generated");

			} catch (CoreException  e) {
				e.printStackTrace();
//				RTAConsole.INSTANCE.error("ERROR: " + e.getMessage());
				MessageDialog.openError(
						shell,
						"Importation aborted",
						"Importation ended with some errors (see console for more details)");
			}	
		}

	}
	

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			// the selection should be a single *.pivot file but we accept
			// several
			final StructuredSelection currentSelection = (StructuredSelection)selection;
			final Iterator<?> it = currentSelection.iterator();
			
			selectedFiles.clear();

			while (it.hasNext()) {
				Object obj = it.next();
				if (obj instanceof IFile) {
					selectedFiles.add((IFile) obj);
				}
			}
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();

	}
}
