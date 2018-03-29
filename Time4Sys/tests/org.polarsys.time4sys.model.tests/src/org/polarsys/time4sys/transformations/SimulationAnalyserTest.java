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
package org.polarsys.time4sys.transformations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.polarsys.time4sys.builder.design.TaskBuilder.aTask;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.builder.design.StepBuilder;
import org.polarsys.time4sys.builder.simulation.SimulationBuilder;
import org.polarsys.time4sys.builder.simulation.SliceBuilder;
import org.polarsys.time4sys.builder.simulation.TraceBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;
import org.polarsys.time4sys.model.time4sys.Transformation;
import org.polarsys.time4sys.transformations.SimulationAnalyser;

public class SimulationAnalyserTest {
	
	protected static void assertDurationEquals(final String expectedDuration, final Duration actualDuration) {
		assertNotNull(actualDuration);
		assertEquals(expectedDuration, actualDuration.toString());
	}

	protected static ProjectBuilder projectBuilder;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAnalyseNull() {
		assertNull(SimulationAnalyser.analyse(null));
	}
	
//	@Test
//	public void testAnalyseEmpty() {
//		assertNull(SimulationAnalyser.analyse(Collections.<Simulation>emptyList()));
//	}

	protected static ProjectBuilder createSimpleOneStepModel() {
		projectBuilder = new ProjectBuilder();
		projectBuilder.design().isNamed("sourceModel").hasAProcessor().called("CPU1").thatRuns(
				aTask().called("T1").ofPeriod("15ms").ofPriority(10).ofBCET("5ms").ofWCET("10ms").ofDeadline("11ms")
			).under(SchedPolicyKind.FIXED_PRIORITY);
		projectBuilder.build();
		return projectBuilder;
	}
	
	@Test
	public void testAnalyseOneStepNoTrace() {
		final ProjectBuilder prjBuilder = createSimpleOneStepModel();
		final SimulationBuilder simBuilder = prjBuilder.hasASimulation().named("sim1");
		assertNull(SimulationAnalyser.analyse(simBuilder.build()));
	}
		
	@Test
	public void testAnalyseOneStep() throws IOException {
		// Given this model
		final ProjectBuilder aProject = createSimpleOneStepModel();
		final SimulationBuilder aSimu = aProject.design().hasASimulation().named("sim1");
		final TraceBuilder aTrace = aSimu.whoseTrace().startAt("0ms").endAt("10ms");
		final StepBuilder stepT1 = aProject.design().step("T1");
		final SliceBuilder firstJobSlice = aTrace.logAJobOf(stepT1).called("T1_1").activatedAt("1ms").startedAt("2ms").endedAt("10ms");
		aTrace.getSliceFor(aProject.design().firstEndToEndFlowsConstraints()).hasJobSlice().called("_1").isConcernedBy(firstJobSlice);
		aProject.saveAsEcore("/home/loic/projets/runtime-EclipseApplication/test/" + this.getClass().getSimpleName()+ "-testAnalyseOneStep.time4sys");
		// When we analyse the simulation
		final Transformation analysis = SimulationAnalyser.analyse(aSimu.build());
		// (For manual inspection)
		//aProject.saveAsEcore("/home/loic/projets/runtime-EclipseApplication/test/" + this.getClass().getSimpleName()+ "-testAnalyseOneStep.time4sys");
		// Then...
		assertNotNull(analysis);
		assertNotNull(analysis.getResult());
		final DesignModel result = (DesignModel) analysis.getResult();
		assertFalse(result.getEndToEndFlows().isEmpty());
		assertEquals(1, result.getEndToEndFlows().size());
		for(EndToEndFlow flow: result.getEndToEndFlows()) {
			assertTrue(flow.isIsSchedulable());
			assertDurationEquals("9ms", flow.getEndToEndTime());
		}

	}
}
