package org.polarsys.time4sys.simulation.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.polarsys.time4sys.model.time4sys.Simulation;
import org.polarsys.time4sys.transformations.SimulationAnalyser;

public class AnalyseSimulationCommandHandler extends AbstractHandler {

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
			if (obj instanceof Simulation) {
				execute((Simulation)obj);
			}
		}
	}

	private void execute(final Simulation simu) {
		SimulationAnalyser.analyse(simu);
	}

}
