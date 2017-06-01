/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.trace.html.popup.actions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;
import org.polarsys.time4sys.trace.Event;
import org.polarsys.time4sys.trace.SchedulingEvent;
import org.polarsys.time4sys.trace.Slice;

public class ExportAsHtml implements IObjectActionDelegate {

	protected Shell shell;
	protected Slice slice = null;
	private File output;
	private FileOutputStream os;
	private OutputStreamWriter w;

	/**
	 * Constructor for Action1.
	 */
	public ExportAsHtml() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (slice == null) {
			System.out.println("Slice was null");
			return;
		}
		output = new File("/tmp/slice.html");
		try {
			os = new FileOutputStream(output);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		w = new OutputStreamWriter(os);
		try {
			export();
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (MessageDialog.openQuestion(shell, "Trace Html exporter", "Slice " + slice.getName() + " exported in "
				+ output.getAbsolutePath() + ".\n" + "Would you view it?")) {
			if (output.exists() && output.isFile()) {
				final IFileStore fileStore = EFS.getLocalFileSystem().getStore(output.toURI());
				final IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

				try {
					IDE.openEditorOnFileStore(page, fileStore);
				} catch (PartInitException e) {
					// Put your exception handler here if you wish to
				}
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		slice = null;
		if (selection.isEmpty()) {
			return;
		}
		Object obj = null;
		if (selection instanceof IStructuredSelection) {
			obj = ((IStructuredSelection) selection).getFirstElement();
		}
		if (obj instanceof Slice) {
			slice = (Slice) obj;
		}
	}

	protected void export() throws IOException {
		w.write("<!DOCTYPE html>");
		w.write("<html>");
		w.write("<head>");
		w.write("<meta charset='utf-8' />");
		w.write("<title>Tasks activation</title>");
		w.write("<link rel='stylesheet' href='http://www.designcps.com/cpal-editor/tasks.css' />");
		w.write("<link rel='stylesheet' href='tasks.css' />");
		w.write("</head>");
		w.write("<body>");
		w.write("<textarea id='cpal_tasks_tsv'>PID	start	end	name	state\n");
		exportEventsOf(slice.getName(), slice.getEvents());
		for (Slice sub : slice.getSubSlices()) {
			exportEventsOf(sub.getName(), sub.getAggregatedEvents());
		}
		for (Slice sub : slice.getOwnedSubSlices()) {
			exportEventsOf(sub.getName(), sub.getAggregatedEvents());
		}
		w.write("\n</textarea>");
		w.write("<section id='tasks'>");
		w.write("</section>");
		w.write("</body>");
		w.write("<script src='http://d3js.org/d3.v3.min.js' charset='utf-8'></script>");
		w.write("<script src='d3.min.js' charset='utf-8'></script>");
		w.write("<script src='http://www.designcps.com/cpal-editor/tasks.js'></script>");
		w.write("<script src='tasks.js'></script>");
		w.write("<script>window.updateSVG('cpal_tasks_tsv', []);</script>");
		w.write("</html>");
	}

	protected void exportEventsOf(final String label, final List<Event> events) throws IOException {
		final Duration picosecond = NfpFactory.eINSTANCE.createDurationFromString("1ps");
		Duration start = null;
		Duration end = null;
		for (Event evt : events) {
			if (evt instanceof SchedulingEvent) {
				final SchedulingEvent schedEvt = (SchedulingEvent) evt;
				switch (schedEvt.getKind()) {
				case RUNNING:
					start = schedEvt.getTimestamp();
					break;
				case BLOCKED:
				case TERMINATED:
				case SUSPENDED:
					if (start == null) {
						break;
					}
					end = schedEvt.getTimestamp();
					assert (end != null);
					w.write(Integer.toString(label.hashCode()));
					w.write("\t");
					w.write(Long.toString(start.divide(picosecond)));
					w.write("\t");
					w.write(Long.toString(end.divide(picosecond)));
					w.write("\t");
					w.write(label);
					w.write("\tactivation\n");
				default:
					break;
				}
			}
		}
	}

}
