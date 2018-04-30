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
package org.polarsys.time4sys.builder.simulation;

import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.builder.mapping.MappingBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.mapping.MappingFactory;
import org.polarsys.time4sys.model.time4sys.Simulation;
import org.polarsys.time4sys.model.time4sys.Time4sysPackage;
import org.polarsys.time4sys.trace.Trace;
import org.polarsys.time4sys.trace.TraceFactory;

/**
 * @author loic
 *
 */
public class SimulationBuilder {

	private Simulation simu;

	public SimulationBuilder(final ProjectBuilder projectBuilder, final Simulation theSimu) {
		this.simu = theSimu;
	}

	public SimulationBuilder named(final String name) {
		simu.setName(name);
		return this;
	}

	public Simulation build() {
		return simu;
	}

	public TraceBuilder whoseTrace() {
		final Trace theTrace;
		if (simu.eIsSet(Time4sysPackage.eINSTANCE.getSimulation_Trace())) {
			theTrace = simu.getTrace();
		} else {
			theTrace = TraceFactory.eINSTANCE.createTrace();
		}
		simu.setTrace(theTrace);
		final TraceBuilder trace = new TraceBuilder(this, theTrace);
		withMapping().tracing(trace);
		return trace;
	}

	public SimulationBuilder of(final DesignBuilder designBuilder) {
		withMapping().about(designBuilder);
		return this;
	}

	public MappingBuilder withMapping() {
		Mapping mapping = simu.getMapping();
		if (mapping == null) {
			mapping = MappingFactory.eINSTANCE.createMapping();
			simu.setMapping(mapping);
		}
		return new MappingBuilder(this, mapping);
	}

}
