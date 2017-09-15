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
package org.polarsys.time4sys.trace.graphviz.popup.actions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
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
import org.polarsys.time4sys.trace.Slice;
import org.polarsys.time4sys.trace.Trace;

public class ExportHierarchyAsGraphviz implements IObjectActionDelegate {
	
	public static void export(final Slice slice, final File output) throws IOException, ParserConfigurationException, TransformerException {
		new ExportHierarchyAsGraphviz().run(slice, output);
	}
	
	public static void export(final Trace trace, final File output) throws IOException, ParserConfigurationException, TransformerException {
		new ExportHierarchyAsGraphviz().run(trace, output);
	}

	protected Shell shell;
	protected Slice slice = null;
	protected Trace trace = null;
	private File output;
	private FileOutputStream os;
	private OutputStreamWriter w;

	/**
	 * Constructor for Action1.
	 */
	public ExportHierarchyAsGraphviz() {
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
		if (slice == null && trace == null) {
			System.out.println("Selection was empty");
			return;
		}
		output = new File("slices.dot");
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
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		String label = "";
		if (slice != null) {
			label += "Slice " + slice.getName();
		}
		if (trace != null) {
			label += "Trace ";
		}
		if (MessageDialog.openQuestion(shell, "Trace Graphviz exporter", label + " exported in "
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
		trace = null;
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
		if (obj instanceof Trace) {
			trace = (Trace) obj;
		}
	}
	
	public void run(final Slice slc, final File output) throws IOException {
		assert(output != null);
		slice = slc;
		this.output = output; 
		run(new FileOutputStream(output));
	}
	
	private void run(Trace trc, File output) throws IOException {
		assert(output != null);
		trace = trc;
		this.output = output;
		run(new FileOutputStream(output));
	}

	public void run(final FileOutputStream fileOutputStream) throws IOException {
		assert(fileOutputStream != null);
		os = fileOutputStream;
		run(new OutputStreamWriter(os));
		w.close();
	}

	public void run(final OutputStreamWriter outputStreamWriter) throws IOException {
		assert(outputStreamWriter != null);
		assert(slice != null || trace != null);
		w = outputStreamWriter;
		export();
		w.flush();
	}
	
	protected static class VisitingQueue<T> {
		
		final Set<T> done = new HashSet<T>();
		final Queue<T> toBeDone = new LinkedBlockingQueue<T>();

		public boolean addAll(Collection<? extends T> c) {
			boolean result = true;
			for(T cur: c) {
				result = result && add(cur);
			}
			return result;
		}

		public boolean isEmpty() {
			return toBeDone.isEmpty();
		}

		public boolean add(T value) {
			if (done.contains(value)) {
				return false;
			}
			return toBeDone.add(value);
		}

		public T poll() {
			return toBeDone.poll();
		}

		public boolean notEmpty() {
			return !isEmpty();
		}

		public boolean finish(T cur) {
			return done.add(cur);
		}
		
	}

	protected void export() throws IOException {
		final VisitingQueue<Slice> toBeDone = new VisitingQueue<Slice>();
		if (slice != null) {
			toBeDone.add(slice);
		}
		if (trace != null) {
			toBeDone.addAll(trace.getSlices());
		}
		w.write("digraph SlicesHierarchy {\n");
		while (toBeDone.notEmpty()) {
			final Slice cur = toBeDone.poll();
			w.write("  ");
			writeId(cur);
			w.write("[label=\"");
			w.write(cur.getName());
			w.write(":");
			w.write(cur.getKindLabel());
			w.write("\"];\n");
			for(Slice child: cur.getOwnedSubSlices()) {
				w.write("  ");
				writeId(child);
				w.write("->");
				writeId(cur);
				w.write(";\n");
				toBeDone.add(child);
			}
			for(Slice child: cur.getSubSlices()) {
				w.write("  ");
				writeId(child);
				w.write("->");
				writeId(cur);
				w.write("[style=dotted];\n");
				toBeDone.add(child);
			}
			toBeDone.finish(cur);
		}
		w.write("}\n");
	}

	private void writeId(Slice cur) throws IOException {
		w.write("S");
		w.write(Integer.toString(System.identityHashCode(cur)));
	}

}
