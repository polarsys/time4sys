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
package org.polarsys.time4sys.trace.timinggraphics.popup.actions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.emf.ecore.EObject;
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
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;
import org.polarsys.time4sys.marte.nfp.impl.LongDurationImpl;
import org.polarsys.time4sys.model.time4sys.Simulation;
import org.polarsys.time4sys.trace.Event;
import org.polarsys.time4sys.trace.SchedulingEvent;
import org.polarsys.time4sys.trace.Slice;
import org.polarsys.time4sys.trace.SliceKind;
import org.polarsys.time4sys.trace.Trace;
import org.polarsys.time4sys.trace.util.SubSlicesIterator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ExportAsTimingGraphics implements IObjectActionDelegate {

	public static void export(final Slice slice, final File output)
			throws IOException, ParserConfigurationException, TransformerException {
		new ExportAsTimingGraphics().run(slice, output);
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
	public ExportAsTimingGraphics() {
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
			return;
		}
		output = new File("timingGraphics/gantt.xml");
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
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		if (MessageDialog.openQuestion(shell, "Trace Timing Graphics(tm) exporter",
				"Gantt chart(s) exported in " + output.getAbsolutePath() + ".\n" + "Would you view it?")) {
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
		if (obj instanceof Trace) {
			trace = (Trace) obj;
		}
	}

	public void run(final Slice slc, final File output)
			throws IOException, ParserConfigurationException, TransformerException {
		assert (output != null);
		this.output = output;
		slice = slc;
		trace = null;
		run(new FileOutputStream(output));
	}

	public void run(Trace trc, File output) throws IOException, ParserConfigurationException, TransformerException {
		assert (output != null);
		trace = trc;
		slice = null;
		this.output = output;
		run(new FileOutputStream(output));
	}

	public void run(final FileOutputStream fileOutputStream)
			throws IOException, ParserConfigurationException, TransformerException {
		assert (fileOutputStream != null);
		os = fileOutputStream;
		run(new OutputStreamWriter(os));
		w.close();
	}

	public void run(final OutputStreamWriter outputStreamWriter)
			throws IOException, TransformerException, ParserConfigurationException {
		assert (outputStreamWriter != null);
		w = outputStreamWriter;
		export();
		w.flush();
	}

	static private void setTextPropery(final Element parent, final String eltName, final String value) {
		final Document doc = parent.getOwnerDocument();
		final Element prop = doc.createElement(eltName);
		prop.appendChild(doc.createTextNode(value));
		parent.appendChild(prop);
	}

	static private void setTimePropery(final Element parent, final String eltName, final Duration value) {
		final Document doc = parent.getOwnerDocument();
		final Element prop = doc.createElement(eltName);
		final Duration durInPS = value.convertToUnit(TimeUnitKind.PS);
		final long picoseconds;
		if (durInPS instanceof LongDurationImpl) {
			picoseconds = ((LongDurationImpl)durInPS).getValueInPicoSeconds();
		} else {
			picoseconds = (long) durInPS.getValue();
		}
		prop.appendChild(doc.createTextNode(Long.toString(picoseconds)));
		parent.appendChild(prop);
	}

	static private Element createChildElement(final Element parent, final String eltName) {
		final Element child = parent.getOwnerDocument().createElement(eltName);
		parent.appendChild(child);
		return child;
	}

	protected void export() throws IOException, ParserConfigurationException, TransformerException {
		final DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		final DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		final Document ganttDoc = docBuilder.newDocument();
		final Element ganttFileElt = ganttDoc.createElement("GanttFile");
		ganttDoc.appendChild(ganttFileElt);

		String label = null;
		String descr = null;
		final Queue<Slice> toBeDone = new LinkedBlockingQueue<>();
		if (slice != null) {
			toBeDone.add(slice);
			label = slice.getName();
			descr = getSimulationName(slice);
		}
		if (trace != null) {
			toBeDone.addAll(trace.getSlices());
			label = "Trace";
			descr = getSimulationName(trace);
		}
		if (label == null) {
			label = "";
		}
		if (descr == null) {
			descr = "";
		}

		setTextPropery(ganttFileElt, "Date", new Date().toString());
		setTextPropery(ganttFileElt, "Description", descr);
		setTextPropery(ganttFileElt, "Name", label);
		setTextPropery(ganttFileElt, "Uuid", UUID.randomUUID().toString());

		final Element tabsElt = createChildElement(ganttFileElt, "Tabs");

		final Element tabElt = createChildElement(tabsElt, "Tab");
		setTextPropery(tabElt, "Name", "Gantts");

		final Element configElt = createChildElement(tabElt, "Config");
		setTextPropery(configElt, "Unit", "ms");

		final Element ganttsElt = createChildElement(tabElt, "Gantts");

		for (Slice tab : toBeDone) {
			createGanttSelector(ganttsElt, tab);
		}

		// write the content into xml file
		final TransformerFactory transformerFactory = TransformerFactory.newInstance();
		final Transformer transformer = transformerFactory.newTransformer();
		final DOMSource source = new DOMSource(ganttDoc);
		final StreamResult result = new StreamResult(w);
		transformer.transform(source, result);
	}

	static private void createGanttSelector(final Element ganttsElt, final Slice root) {
		final Element ganttElt = createChildElement(ganttsElt, "Gantt");
		setTextPropery(ganttElt, "Selector", root.getName());
		setTextPropery(ganttElt, "Title", root.getName());
		setTextPropery(ganttElt, "Date", "01/01/2017 10:00:00");
		setTextPropery(ganttElt, "Description", root.getName());
		setTimePropery(ganttElt, "Length", root.getLatestTimestamp());

		final Element ganttLinesElt = createChildElement(ganttElt, "GanttLines");

		for (Slice sub : root.getSubSlices()) {
			addGanttLine(ganttLinesElt, sub.getName(), sub, "activation");
			if (sub.getKind() == SliceKind.RESOURCE || "Package".equals(sub.getKindLabel())) {
				createGanttSelector(ganttsElt, sub);
			}
		}
		for (Slice sub : root.getOwnedSubSlices()) {
			addGanttLine(ganttLinesElt, sub.getName(), sub, "activation");
			if (sub.getKind() == SliceKind.RESOURCE || "Package".equals(sub.getKindLabel())) {
				createGanttSelector(ganttsElt, sub);
			}
		}
		if (!ganttLinesElt.hasChildNodes()) {
			ganttsElt.removeChild(ganttElt);
		}
	}

	static private void addGanttLine(Element ganttGanttLinesElt, String name, Slice sub, String label) {

		final Element ganttLineElt = createChildElement(ganttGanttLinesElt, "GanttLine");
		setTextPropery(ganttLineElt, "Name", sub.getName());
		setTextPropery(ganttLineElt, "TextLine1", sub.getKindLabel());
		setTextPropery(ganttLineElt, "TextLine2", " ");
		setTextPropery(ganttLineElt, "Description", sub.getName());
		final Element ganttElementsElt = createChildElement(ganttLineElt, "GanttElements");
		List<Slice> slices = getSlicesOfSlices(sub);
//			for (Slice job : new SubSlicesIterator(sub, SliceKind.JOB)) {//Iterator don't work for me, let's try with list.
		for (Slice job : filterSliceKind(slices, SliceKind.JOB)) {
			createGanttElement(ganttElementsElt, job);
		}
	}

	private static List<Slice> filterSliceKind(List<Slice> slices, SliceKind job) {
		List<Slice> filteredSlices = new ArrayList<>();
		for (Slice slice : slices){
			if (slice.getKind().equals(job)){
				filteredSlices.add(slice);
			}
		}
		return filteredSlices;
	}

	private static List<Slice> getSlicesOfSlices(final Slice sub) {
		List<Slice> slices = new ArrayList<Slice>();
		/*if (sub.getOwnedSubSlices().size()>0){
			slices.addAll(sub.getOwnedSubSlices());
			for (Slice owned : sub.getOwnedSubSlices()){
				slices = getSlicesOfSlices(slices, owned);
			}
		}
		if (sub.getSubSlices().size()>0){
			slices.addAll(sub.getSubSlices());
			for (Slice owned : sub.getSubSlices()){
				slices = getSlicesOfSlices(slices, owned);
			}
		}*/
		return getSlicesOfSlices(slices, sub);
	}
	
	private static List<Slice> getSlicesOfSlices(final List<Slice> accumulator, final Slice sub) {
		if (sub.getOwnedSubSlices().size()>0){
			accumulator.addAll(sub.getOwnedSubSlices());
			for (Slice owned : sub.getOwnedSubSlices()){
				getSlicesOfSlices(accumulator, owned);
			}
		}
		if (sub.getSubSlices().size()>0){
			accumulator.addAll(sub.getOwnedSubSlices());
			for (Slice owned : sub.getSubSlices()){
				getSlicesOfSlices(accumulator, owned);
			}
		}

		return accumulator;
	}

	static private void createGanttElement(final Element parent, final Slice job) {
		final Element ganttElementElt = createChildElement(parent, "GanttElement");
		setTextPropery(ganttElementElt, "Name", job.getName());
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.ROOT);
		nf.setMaximumFractionDigits(0);
		nf.setGroupingUsed(false);
//		setTextPropery(ganttElementElt, "Id", nf.format(job.get.convertToUnit(TimeUnitKind.MS).getValue()));

		setTextPropery(ganttElementElt, "Id", nf.format(job.getAggregatedEvents().get(0).getTimestamp().convertToUnit(TimeUnitKind.MS).getValue()));//TODOTODO
		final Element statusesElt = createChildElement(ganttElementElt, "Statuses");
		Element elementEventsElt = null;
		for (Event evt : job.getAggregatedEvents()) {
			if (evt instanceof SchedulingEvent) {
				final SchedulingEvent schedEvt = (SchedulingEvent) evt;
				switch (schedEvt.getKind()) {
				case ACTIVATED:
				case TERMINATED:
				case SUSPENDED:
				case BLOCKED:
					createStatus(statusesElt, schedEvt);
					break;
				case RUNNING:
					createStatus(statusesElt, schedEvt, "STARTED");
					break;
				case DEADLINE:
					if (elementEventsElt == null) {
						elementEventsElt = createChildElement(ganttElementElt, "ElementEvents");
					}
					createEvent(elementEventsElt, schedEvt, null);
					break;
				}
			}
		}
	}

	static private void createStatus(Element statusesElt, SchedulingEvent evt) {
		createStatus(statusesElt, evt, null);
	}

	static private void createStatus(Element parent, SchedulingEvent evt, String type) {
		createTypedTimedElt(parent, "Status", evt, type);
	}

	static private void createEvent(Element parent, SchedulingEvent evt, String type) {
		final Element elementEventElt = createTypedTimedElt(parent, "ElementEvent", evt, null);
		setTextPropery(elementEventElt, "Label", "");
	}

	static private Element createTypedTimedElt(final Element parent, final String eltName, final SchedulingEvent evt,
			String type) {
		if (type == null) {
			type = evt.getKind().getName().toUpperCase();
		}
		final Element childElt = createChildElement(parent, eltName);
		setTextPropery(childElt, "Type", type);
		setTimePropery(childElt, "Instant", evt.getTimestamp());
		return childElt;
	}

	static private String getSimulationName(EObject slice) {
		final Simulation simu = getSimulation(slice);
		if (simu == null) {
			return "";
		}
		;
		String name = simu.getName();
		if (name == null) {
			return "";
		}
		return name;
	}

	static private Simulation getSimulation(final EObject slice) {
		if (slice == null) {
			return null;
		}
		EObject current = slice.eContainer();
		while (current != null) {
			if (current instanceof Simulation) {
				return (Simulation) current;
			}
			current = current.eContainer();
		}
		return null;
	}

}
