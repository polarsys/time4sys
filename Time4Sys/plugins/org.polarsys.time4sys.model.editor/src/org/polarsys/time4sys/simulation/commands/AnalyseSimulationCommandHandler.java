package org.polarsys.time4sys.simulation.commands;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.polarsys.time4sys.model.time4sys.Simulation;
import org.polarsys.time4sys.model.time4sys.Transformation;
import org.polarsys.time4sys.transformations.SimulationAnalyser;

public class AnalyseSimulationCommandHandler extends AbstractTransformationCommandHandler<Simulation, Transformation> {

	public static class AnalyseSimulationRunnable extends TransfoRunnable<Simulation, Transformation> {
		
		public AnalyseSimulationRunnable(final TransactionalEditingDomain domain, final Simulation value) {
			super(domain, value, "Analyse Simulation");
		}

		public void doExecute() {
			setResult(SimulationAnalyser.analyse(obj));
		}
		
	}

	public AnalyseSimulationCommandHandler() {
		super(Simulation.class);
	}

	@Override
	protected TransfoRunnable<Simulation, Transformation> createRecordingCommand(final TransactionalEditingDomain domain, final Simulation simu) {
		return new AnalyseSimulationRunnable(domain, simu);
	}

}
