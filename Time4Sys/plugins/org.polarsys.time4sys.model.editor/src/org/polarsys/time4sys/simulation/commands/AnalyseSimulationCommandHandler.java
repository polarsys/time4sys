/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.simulation.commands;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
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
	public TransfoRunnable<Simulation, Transformation> createRecordingCommand(final TransactionalEditingDomain domain, final Simulation simu) {
		return new AnalyseSimulationRunnable(domain, simu);
	}

}
