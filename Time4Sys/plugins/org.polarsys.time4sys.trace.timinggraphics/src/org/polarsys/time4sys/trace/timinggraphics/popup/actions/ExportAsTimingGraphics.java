/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
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
import java.math.MathContext;
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
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.InstanceScope;
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
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.framework.Bundle;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;
import org.polarsys.time4sys.marte.nfp.impl.LongDurationImpl;
import org.polarsys.time4sys.model.time4sys.Simulation;
import org.polarsys.time4sys.schedulingtrace.Processor;
import org.polarsys.time4sys.schedulingtrace.SchedulingTrace;
import org.polarsys.time4sys.trace.Event;
import org.polarsys.time4sys.trace.SchedulingEvent;
import org.polarsys.time4sys.trace.Slice;
import org.polarsys.time4sys.trace.SliceKind;
import org.polarsys.time4sys.trace.Trace;
import org.polarsys.time4sys.trace.util.SliceDurationStatistics;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class ExportAsTimingGraphics implements IObjectActionDelegate {

	public static void exportGanttXml(final Slice slice, final File output)
			throws IOException, ParserConfigurationException, TransformerException {
		new ExportAsTimingGraphics(slice).writeGanttXml(output);
	}

	public static void exportGraphicsXml(final Slice slice, final File output)
			throws IOException, ParserConfigurationException, TransformerException {
		new ExportAsTimingGraphics(slice).writeGraphicsXml(output);
	}

	protected Shell shell;
	protected EObject rootElement = null;
	private File output;

	/**
	 * Constructor for Action1.
	 */
	public ExportAsTimingGraphics() {
		this(null);
	}

	public ExportAsTimingGraphics(final Slice toBeExported) {
		super();
		rootElement = toBeExported;
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
		if (rootElement == null) {
			return;
		}
		final File folder = getTimingGraphicsFolder();
		final Exception errGantt = writeGanttXml(new File(folder, "gantt.xml"));
		final Exception errGraphics = writeGraphicsXml(new File(folder, "graphics.xml"));
		if ((errGantt == null || errGraphics == null)
				&& MessageDialog.openQuestion(shell, "Trace Timing Graphics(tm) exporter",
						"Gantt chart(s) exported in " + output.getAbsolutePath() + ".\n" + "Would you view it?")) {
			/* If no errors raised during the export */
			if (output.exists() && output.isFile()) {
				final Bundle plugin = Platform.getBundle("org.polarsys.time4sys.trace.timinggraphics");
				if (plugin == null) {
					/* And no Timing Graphics plugin */
					final IFileStore fileStore = EFS.getLocalFileSystem().getStore(output.toURI());
					final IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

					try {
						IDE.openEditorOnFileStore(page, fileStore);
					} catch (PartInitException e) {
						// Put your exception handler here if you wish to
						e.printStackTrace();
					}
				} else {
					/* And the Timing graphics plugin is installed */
					try {
						PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
								.showView("com.linkconet.e3.dashboard.realtimecharts.ui.views.GanttChartsView");
					} catch (PartInitException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	private File getTimingGraphicsFolder() {
		final ScopedPreferenceStore preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE,
				"com.linkconet.e3.dashboard.RealTimeCharts.ui");
		final String path = preferenceStore.getString("xmlFilesLocation");
		final File folder;
		if (path == null || path.trim().isEmpty()) {
			folder = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile(), "timingGraphics");
		} else {
			folder = new File(path);
		}
		return folder;
	}

	private Exception writeGanttXml(final File outputFile) {
		output = outputFile;
		final FileOutputStream os;
		try {
			os = new FileOutputStream(output);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return e;
		}
		final OutputStreamWriter w = new OutputStreamWriter(os);
		try {
			exportGanttXml(w);
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
			return e;
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			return e;
		} catch (TransformerException e) {
			e.printStackTrace();
			return e;
		}
		return null;
	}

	private Exception writeGraphicsXml(final File outputFile) {
		output = outputFile;
		final FileOutputStream os;
		try {
			os = new FileOutputStream(output);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return e;
		}
		final OutputStreamWriter w = new OutputStreamWriter(os);
		try {
			exportGraphicsXml(w);
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
			return e;
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			return e;
		} catch (TransformerException e) {
			e.printStackTrace();
			return e;
		}
		return null;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		rootElement = null;
		if (selection.isEmpty()) {
			return;
		}
		Object obj = null;
		if (selection instanceof IStructuredSelection) {
			obj = ((IStructuredSelection) selection).getFirstElement();
		}
		if (obj instanceof Slice) {
			rootElement = (Slice) obj;
		}
		if (obj instanceof SchedulingTrace) {
			rootElement = (SchedulingTrace) obj;
		}
		if (obj instanceof Trace) {
			rootElement = (Trace) obj;
		}

	}

	static private Text setTextProperty(final Element parent, final String eltName, final String value) {
		final Document doc = parent.getOwnerDocument();
		final Element prop = doc.createElement(eltName);
		final Text textNode = doc.createTextNode(value);
		prop.appendChild(textNode);
		parent.appendChild(prop);
		return textNode;
	}

	static private void setTimePropery(final Element parent, final String eltName, final Duration value) {
		final Duration durInPS = value.convertToUnit(TimeUnitKind.PS);
		final long picoseconds;
		if (durInPS instanceof LongDurationImpl) {
			picoseconds = ((LongDurationImpl) durInPS).getValueInPicoSeconds();
		} else {
			picoseconds = (long) durInPS.getValue();
		}
		setTextProperty(parent, eltName, Long.toString(picoseconds));
	}

	private static String percentageFormat(int value) {
		return String.format("%d.%02d", value / 100, value % 100);
	}

	private static void setPercentagePropertyTwoDigits(final Element parent, final String eltName, final int value) {
		setTextProperty(parent, eltName, percentageFormat(value));
	}

	static private Element createChildElement(final Element parent, final String eltName) {
		final Element child = parent.getOwnerDocument().createElement(eltName);
		parent.appendChild(child);
		return child;
	}

	protected void exportGraphicsXml(final OutputStreamWriter w)
			throws IOException, ParserConfigurationException, TransformerException {
		final DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		final DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		final Document graphicsDoc = docBuilder.newDocument();
		final Element tabsFileElt = graphicsDoc.createElement("Tabs");
		graphicsDoc.appendChild(tabsFileElt);
		final Element tabSimulationLoad = createChildElement(tabsFileElt, "Tab");
		String label = null;
		String descr = null;
		final Queue<Slice> inputElementForGeneration = new LinkedBlockingQueue<>();
		if (rootElement instanceof Slice) {
			Slice slice = (Slice) rootElement;
			inputElementForGeneration.add(slice);
			label = findBestName(slice,slice.getName());
			descr = getSimulationName(slice);
		} else if (rootElement instanceof SchedulingTrace) {
			SchedulingTrace schedulingTrace = (SchedulingTrace) rootElement;
			inputElementForGeneration.addAll(schedulingTrace.getProcessors());
			label = "SchedulingTrace";
			descr = getSimulationName(schedulingTrace);
		} else if (rootElement instanceof Processor) {
			Processor processor = (Processor) rootElement;
			inputElementForGeneration.addAll(processor.getSubSlices());
			label = "SchedulingTrace";
			descr = getSimulationName(processor);
		} else if (rootElement instanceof Trace) {
			Trace trace = (Trace) rootElement;
			inputElementForGeneration.addAll(trace.getSlices());
			label = "Trace";
			descr = getSimulationName(trace);
		}

		if (label == null) {
			label = "";
		}
		if (descr == null) {
			descr = "";
		}
		setTextProperty(tabSimulationLoad, "Title", "Load of " + label);
		final Element dataSetsElt = createChildElement(tabSimulationLoad, "DataSets");

		for (Slice tab : inputElementForGeneration) {
			createLoadSelector(dataSetsElt, tab);
		}

		// write the content into xml file
		final TransformerFactory transformerFactory = TransformerFactory.newInstance();
		final Transformer transformer = transformerFactory.newTransformer();
		final DOMSource source = new DOMSource(graphicsDoc);
		final StreamResult result = new StreamResult(w);
		transformer.transform(source, result);
	}

	static private void createLoadSelector(final Element dataSetsElt, final Slice root) {
		final Element pieDatasetElt = createChildElement(dataSetsElt, "PieDataset");
		setTextProperty(pieDatasetElt, "Selector", findBestName(root,root.getName()));
		final Text titleElt = setTextProperty(pieDatasetElt, "Title", findBestName(root,root.getName()));
		final Duration simDuration = root.getLatestTimestamp();
		// two-digits fixed-point percentage, ie 123 = 1.23%, 100% = 10000
		int accumulator = 0;

		for (Slice sub : root.getSubSlices()) {
			accumulator += addLoadItem(pieDatasetElt, sub, simDuration);
			if (sub.getKind() == SliceKind.RESOURCE || sub.getKind() == SliceKind.TASK || "Package".equals(sub.getKindLabel())) {
				createLoadSelector(dataSetsElt, sub);
			}
		}
		for (Slice sub : root.getOwnedSubSlices()) {
			accumulator += addLoadItem(pieDatasetElt, sub, simDuration);
			if (sub.getKind() == SliceKind.RESOURCE || sub.getKind() == SliceKind.TASK || "Package".equals(sub.getKindLabel())) {
				createLoadSelector(dataSetsElt, sub);
			}

		}
		if (pieDatasetElt.hasChildNodes() && accumulator <= 10000) {
			if (accumulator <= 10000) {
				final Element idlePieItemElt = createChildElement(pieDatasetElt, "PieItem");
				setTextProperty(idlePieItemElt, "Color", "FFFFFF");
				setTextProperty(idlePieItemElt, "Key", "Idle");
				setPercentagePropertyTwoDigits(idlePieItemElt, "Value", 10000 - accumulator);
			}
			// Update title with total load
			titleElt.setTextContent(titleElt.getTextContent() + " -- " + percentageFormat(accumulator));
		} else {
			dataSetsElt.removeChild(pieDatasetElt);
		}
	}

	private static int addLoadItem(final Element pieDatasetElt, final Slice sub, final Duration simDuration) {
		final Duration sliceDuration = SliceDurationStatistics.computeExecutionTimeDuration(sub);
		if (sliceDuration.notZero()) {
			final int percentage = (int) (sliceDuration.div(simDuration, MathContext.DECIMAL32) * 10000.0);
			final Element pieItemElt = createChildElement(pieDatasetElt, "PieItem");
			setTextProperty(pieItemElt, "Key", findBestName(sub,sub.getName()));
			setPercentagePropertyTwoDigits(pieItemElt, "Value", percentage);
			return percentage;
		} else {
			return 0;
		}
	}

	protected void exportGanttXml(final OutputStreamWriter writer)
			throws IOException, ParserConfigurationException, TransformerException {
		final DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		final DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		final Document ganttDoc = docBuilder.newDocument();
		final Element ganttFileElt = ganttDoc.createElement("GanttFile");
		ganttDoc.appendChild(ganttFileElt);

		String label = null;
		String descr = null;
		final Queue<Slice> toBeDone = new LinkedBlockingQueue<>();
		if (rootElement instanceof Slice) {
			Slice slice = (Slice) rootElement;
			toBeDone.add(slice);
			label = findBestName(slice,slice.getName());
			descr = getSimulationName(slice);
		} else if (rootElement instanceof SchedulingTrace) {
			SchedulingTrace schedulingTrace = (SchedulingTrace) rootElement;
			toBeDone.addAll(schedulingTrace.getProcessors());
			label = "SchedulingTrace";
			descr = getSimulationName(schedulingTrace);
		} else if (rootElement instanceof Processor) {
			Processor processor = (Processor) rootElement;
			toBeDone.addAll(processor.getSubSlices());
			label = "SchedulingTrace";
			descr = getSimulationName(processor);
		} else if(rootElement instanceof Trace)

	{
		Trace trace = (Trace) rootElement;
		toBeDone.addAll(trace.getSlices());
		label = "Trace";
		descr = getSimulationName(trace);
	}if(label==null)
	{
		label = "";
	}if(descr==null)
	{
		descr = "";
	}

	setTextProperty(ganttFileElt, "Date", new Date().toString());
		setTextProperty(ganttFileElt, "Description", descr);
		setTextProperty(ganttFileElt, "Name", label);
		setTextProperty(ganttFileElt, "Uuid", UUID.randomUUID().toString());

		final Element tabsElt = createChildElement(ganttFileElt, "Tabs");

		final Element tabElt = createChildElement(tabsElt, "Tab");
		setTextProperty(tabElt, "Name", "Gantts");

		final Element configElt = createChildElement(tabElt, "Config");
		setTextProperty(configElt, "Unit", "ms");

		final Element ganttsElt = createChildElement(tabElt, "Gantts");

		for (Slice tab : toBeDone) {
			createGanttSelector(ganttsElt, tab);
		}

		// write the content into xml file
		final TransformerFactory transformerFactory = TransformerFactory.newInstance();
		final Transformer transformer = transformerFactory.newTransformer();
		final DOMSource source = new DOMSource(ganttDoc);
		final StreamResult result = new StreamResult(writer);
		transformer.transform(source, result);
	}

	static private void createGanttSelector(final Element ganttsElt, final Slice root) {
		final Element ganttElt = createChildElement(ganttsElt, "Gantt");
		setTextProperty(ganttElt, "Selector", findBestName(root, root.getName()));
		setTextProperty(ganttElt, "Title", findBestName(root, root.getName()));
		setTextProperty(ganttElt, "Date", "01/01/2017 10:00:00");
		setTextProperty(ganttElt, "Description", findBestName(root, root.getName()));
		setTimePropery(ganttElt, "Length", root.getLatestTimestamp());

		final Element ganttLinesElt = createChildElement(ganttElt, "GanttLines");

		for (Slice sub : root.getSubSlices()) {
			addGanttLine(ganttLinesElt, findBestName(root, root.getName()), sub, "activation");
			if (sub.getKind() == SliceKind.RESOURCE || sub.getKind() == SliceKind.TASK || "Package".equals(sub.getKindLabel())) {
				createGanttSelector(ganttsElt, sub);
			}
		}
		for (Slice sub : root.getOwnedSubSlices()) {
			addGanttLine(ganttLinesElt, sub.getName(), sub, "activation");
			if (sub.getKind() == SliceKind.RESOURCE || sub.getKind() == SliceKind.TASK || "Package".equals(sub.getKindLabel())) {
				createGanttSelector(ganttsElt, sub);
			}
		}
		if (!ganttLinesElt.hasChildNodes()) {
			ganttsElt.removeChild(ganttElt);
		}
	}

	static private void addGanttLine(Element ganttGanttLinesElt, String name, Slice sub, String label) {

		final Element ganttLineElt = createChildElement(ganttGanttLinesElt, "GanttLine");
		setTextProperty(ganttLineElt, "Name", sub.getName());
		setTextProperty(ganttLineElt, "TextLine1", sub.getKindLabel());
		setTextProperty(ganttLineElt, "TextLine2", " ");
		setTextProperty(ganttLineElt, "Description", sub.getName());
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
			accumulator.addAll(sub.getSubSlices());
			for (Slice owned : sub.getSubSlices()){
				getSlicesOfSlices(accumulator, owned);
			}
		}

		return accumulator;
	}

	static private void createGanttElement(final Element parent, final Slice job) {
		final Element ganttElementElt = createChildElement(parent, "GanttElement");
		setTextProperty(ganttElementElt, "Name", job.getName());
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.ROOT);
		nf.setMaximumFractionDigits(0);
		nf.setGroupingUsed(false);
//		setTextPropery(ganttElementElt, "Id", nf.format(job.get.convertToUnit(TimeUnitKind.MS).getValue()));

		setTextProperty(ganttElementElt, "Id", nf.format(job.getAggregatedEvents().get(0).getTimestamp().convertToUnit(TimeUnitKind.MS).getValue()));//TODOTODO
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
		setTextProperty(elementEventElt, "Label", "");
	}

	static private Element createTypedTimedElt(final Element parent, final String eltName, final SchedulingEvent evt,
			String type) {
		if (type == null) {
			type = evt.getKind().getName().toUpperCase();
		}
		final Element childElt = createChildElement(parent, eltName);
		setTextProperty(childElt, "Type", type);
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
	
	public static String findBestName(EObject obj, String name){
		if (name.equals(null) || name==""){
			return obj.eClass().getName();
		}
		return name;
	}

}
