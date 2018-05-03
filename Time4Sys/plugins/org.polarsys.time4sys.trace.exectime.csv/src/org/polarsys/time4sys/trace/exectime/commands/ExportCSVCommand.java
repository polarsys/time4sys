/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 * 
 */
package org.polarsys.time4sys.trace.exectime.commands;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URISyntaxException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;
import org.polarsys.time4sys.marte.nfp.impl.LongDurationImpl;
import org.polarsys.time4sys.trace.Slice;
import org.polarsys.time4sys.trace.SliceKind;
import org.polarsys.time4sys.trace.Trace;
import org.polarsys.time4sys.trace.util.SliceDurationStatistics;
import org.polarsys.time4sys.trace.util.SubSlicesIterator;

/**
 * @author Loïc Fejoz
 *
 */
public class ExportCSVCommand extends AbstractHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final List<File> results = new LinkedList<File>();
		final ISelection selection = org.eclipse.ui.handlers.HandlerUtil.getCurrentSelection(event);
		if (selection instanceof ITreeSelection) {
			final ITreeSelection treeSelection = (ITreeSelection)selection;
			final Iterator<?> it = treeSelection.iterator();
			while(it.hasNext()) {
				final Object obj = it.next();
				if (obj instanceof Slice) {
					export((Slice)obj, results);
				} else if (obj instanceof Trace) {
					export((Trace)obj, results);
				}
			}
		}
		return results;
	}

	protected void export(final Slice obj, final List<File> results) {
		final Queue<Slice> toExplore = new ConcurrentLinkedQueue<Slice>();
		toExplore.add(obj);
		while(!toExplore.isEmpty()) {
			final Slice slc = toExplore.poll();
			//toExplore.addAll(slc.getSubSlices());
			toExplore.addAll(slc.getOwnedSubSlices());
			switch(slc.getKind()) {
			case FUNCTION:
			case TASK:
				try {
					exportToCsv(slc, results);
				} catch (Exception e) {
					e.printStackTrace();
//					ILog logger = Activator.getDefault().getLog();
//					final Status err = new Status(IStatus.ERROR, "Cannot create file: " + output.getAbsolutePath(), e.getLocalizedMessage());
//					logger.log(err);
					return;
				}
				break;
			default:
				
			}
		}
	}

	protected void export(final Trace obj, final List<File> results) {
		for(Slice slc: obj.getSlices()) {
			export(slc, results);
		}
	}

	private void exportToCsv(final Slice slc, final List<File> results) throws IOException, URISyntaxException {
		SubSlicesIterator it;
		switch(slc.getKind()) {
		case FUNCTION:
			it = new SubSlicesIterator(slc, SliceKind.FUNCTION_INSTANCE);
			break;
		case TASK:
			it = new SubSlicesIterator(slc, SliceKind.JOB);
			break;
		default:
			return;
		}
		assert(it != null);
		URI emfUri = slc.eResource().getURI();
		URI r = CommonPlugin.asLocalURI(emfUri);
		String uriStr = r.toString();
		java.net.URI neturi = new java.net.URI(uriStr); 
		File originFile = new File(neturi);
		File outputDir = originFile.getParentFile();
		final File output = newOutputFile(slc, outputDir);
		final OutputStreamWriter writer;
		writer = new OutputStreamWriter(new FileOutputStream(output));
		while(it.hasNext()) {
			final Duration duration = SliceDurationStatistics.computeExecutionTimeDuration(it.next());
			if (duration instanceof LongDurationImpl) {
				writer.write(Long.toString(((LongDurationImpl)duration).getValueInPicoSeconds()));
			} else {
				writer.write(Double.toString(duration.convertToUnit(TimeUnitKind.PS).getValue()));
			}
			writer.write('\n');
		}
		writer.close();
		results.add(output);
	}

	/**
	 * Return the first non-existing file in the sequence slc_name.csv, slc_name-000.csv, ...
	 * @param slc
	 * @param outputDir
	 * @return
	 */
	private File newOutputFile(final Slice slc, final File outputDir) {
		final String basename = slc.getName().replaceAll("\\s", "-");
		File output = new File(outputDir, basename + ".csv");
		int counter = 0;
		final NumberFormat formatter = new DecimalFormat("#000");
		while (output.exists()) {
			output = new File(outputDir, basename + "-" + formatter.format(counter) + ".csv");
		}
		return output;
	}
}
