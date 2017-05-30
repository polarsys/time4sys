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
/**
 * 
 */
package org.polarsys.time4sys.model.design2analysis.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.polarsys.time4sys.builder.design.TaskBuilder.aTask;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.analysis.ComputingResource;
import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.builder.analysis.AnalysisBuilder;
import org.polarsys.time4sys.builder.analysis.SchedulerBuilder;
import org.polarsys.time4sys.builder.analysis.TaskBuilder;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * @author loic
 *
 */
public class Design2AnalysisTransformerTest {
	
	protected static DesignFactory df = DesignFactory.eINSTANCE;
	protected static GqamFactory gqamFactory = GqamFactory.eINSTANCE;
	protected static SrmFactory srmFactory = SrmFactory.eINSTANCE;
	protected static GrmFactory grmFactory = GrmFactory.eINSTANCE;
	protected static HrmFactory hrmFactory = HrmFactory.eINSTANCE;
	protected static NfpFactory nfpFactory = NfpFactory.eINSTANCE;

	protected ProjectBuilder theProject;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		theProject = new ProjectBuilder();
	}
	
	private void assertDurationEquals(final String expectedValue, final Duration actualValue) {
		final Duration expected = NfpFactory.eINSTANCE.createDurationFromString(expectedValue);
		assertEquals(expected, actualValue);
	}
	

	public void assertAtLeastSameNumberOfSoftwareTasks(final ProjectBuilder theProject) {
		final int designTasksCount = theProject.design().countTasks();
		final int analysisTasksCount = theProject.analysis().countTasks();
		assertTrue("Expecting more tasks: " + Integer.toString(designTasksCount) + ", Actual: " + Integer.toString(analysisTasksCount), designTasksCount <= analysisTasksCount);
	}
	
	public void assertPrecedencesRespect(final ProjectBuilder projet) {
		final DesignBuilder design = theProject.design();
		final AnalysisBuilder analysis = theProject.analysis();
		for(PrecedenceRelation rel: design.allPrecedenceRelations()) {
			for(Step source: rel.getPredec()) {
				for(Step target: rel.getSucces()) {
					// if tau_i -> tau_j then r_i <= r_j
					final TaskBuilder anaSource = analysis.mappingOf(source);
					final TaskBuilder anaTarget = analysis.mappingOf(target);
					assertTrue(anaSource.getOffset().compareTo(anaTarget.getOffset()) <= 0);
					// if tau_i -> tau_j then D_i <= D_j
					final Duration sourceDeadline = anaSource.getDeadline();
					final Duration targetDeadline = anaTarget.getDeadline();
					final int deadlineComparison = sourceDeadline.compareTo(targetDeadline);
					assertTrue(deadlineComparison <= 0);
					if (deadlineComparison == 0) {
						// If equality of deadlines then priority must reflect precedence
						assertTrue("If equality of deadlines then priority must reflect precedence between " + anaSource.getName() + " and " + anaTarget.getName(), anaSource.getPriority() < anaTarget.getPriority());
					}
				}
			}
		}
	}
	
	public void assertGenericTests(final ProjectBuilder theProject) {
		assertAtLeastSameNumberOfSoftwareTasks(theProject);
		assertPrecedencesRespect(theProject);
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.design2analysis.Design2AnalysisTransformer#transform(org.polarsys.time4sys.model.time4sys.Project)}.
	 */
	@Test
	public void testTransformOneStep() {
		theProject.design().hasAProcessor().called("mainproc").thatRuns(
					aTask().called("T1").ofPeriod("10ms").ofWCET("3ms").ofBCET("1ms")
				).under(SchedPolicyKind.FIXED_PRIORITY);
		theProject.deriveAnalyzedSystem(true);
		assertAtLeastSameNumberOfSoftwareTasks(theProject);
		assertEquals(1, theProject.design().countTasks());
		assertEquals(1, theProject.analysis().countTasks());
		assertDurationEquals("10ms", theProject.analysis().firstTask().getPeriod());
		assertDurationEquals("3ms", theProject.analysis().firstTask().getWCET());
		assertDurationEquals("1ms", theProject.analysis().firstTask().getBCET());
	}
	
	/**
	 * Test method for {@link org.polarsys.time4sys.design2analysis.Design2AnalysisTransformer#transform(org.polarsys.time4sys.model.time4sys.Project)}.
	 */
	@Test
	public void testTransformTwoSteps() {
		theProject.design().hasAProcessor().called("mainproc").thatRuns(
					aTask().called("T1")
				).under(SchedPolicyKind.FIXED_PRIORITY);
		assertEquals(1, theProject.design().countTasks());
		theProject.design().task("T1")
			.whoseFirstStep().called("step1").isPeriodic("10ms").ofWCET("2ms")
			.isFollowedByAStep().called("step2").ofWCET("5ms");
		assertEquals(1, theProject.design().build().getWorkloadBehavior().getDemand().size());
		assertEquals(1, theProject.design().countTasks());
		assertEquals(2, theProject.design().countSteps());
		
		theProject.deriveAnalyzedSystem(true);
		//assertGenericTests(theProject);
		assertAtLeastSameNumberOfSoftwareTasks(theProject);
		assertEquals(2, theProject.analysis().countTasks());
		final TaskBuilder firstTask = theProject.analysis().firstTask();
		assertEquals("T1 - step1", firstTask.getName());
		assertDurationEquals("10ms", firstTask.getPeriod());
		assertDurationEquals("2ms", firstTask.getWCET());
		//assertDurationEquals("1ms", theProject.analysis().firstTask().getBCET());
		final TaskBuilder secondTask = theProject.analysis().secondTask();
		assertNotSame(secondTask, firstTask);
		assertEquals("T1 - step2", secondTask.getName());
		assertDurationEquals("5ms", secondTask.getWCET());
	}

	
	/**
	 * Test method for {@link org.polarsys.time4sys.design2analysis.Design2AnalysisTransformer#transform(org.polarsys.time4sys.model.time4sys.Project)}.
	 */
	@Test
	public void testTransformFromEmmanuelClassesP96() {
		// Given this design
		final DesignBuilder design = theProject.design().called("from emmanuel course SETR p96");
		design.hasAProcessor().called("mainproc").thatRuns(
					aTask().called("T1").ofDeadline("8ms").ofPriority(9),
					aTask().called("T2").ofDeadline("8ms").ofPriority(8),
					aTask().called("T3").ofDeadline("4ms").ofPriority(1),
					aTask().called("T4").ofDeadline("7ms").ofPriority(10)
				).under(SchedPolicyKind.FIXED_PRIORITY);
		design.task("T1").has(
			design.aStep().called("tau_1,1").ofET("1ms").ofPeriod("8ms"),
			design.aStep().called("tau_1,2").ofET("2"),
			design.aStep().called("tau_1,3").ofET("1ms"),
			design.aStep().called("artefact2").ofET("0ms"));
		design.task("T2").has(
			design.aStep().called("tau_2,1").ofET("1ms"),
			design.aStep().called("tau_2,2").ofET("2ms"),
			design.aStep().called("tau_2,3").ofET("1ms"),
			design.aStep().called("artefact1").ofET("0ms"));
		assertEquals(4, design.countTasks());
		assertEquals(8, design.countSteps());
		design.task("T3")
			.firstStep().called("tau_3").ofPeriod("8ms").ofET("1ms").ofOffset("1ms")
			.activates(design.step("tau_2,1"));
		design.task("T4").firstStep().called("tau_4").ofET("1ms");
		design.hasAPrecedenceRelation()
			.from(design.step("tau_1,1"))
			.to(design.step("tau_1,2"), design.step("artefact1"));
		design.hasAPrecedenceRelation()
			.from(design.step("tau_2,1"), design.step("artefact1"))
			.to(design.step("tau_2,2"));
		design.hasAPrecedenceRelation()
			.from(design.step("tau_1,2"), design.step("artefact2"))
			.to(design.step("tau_1,3"));
		design.hasAPrecedenceRelation()
			.from(design.step("tau_2,2"))
			.to(design.step("tau_2,3"), design.step("artefact2"));		
		design.step("tau_2,3").activates(design.step("tau_4"));
		try {
			theProject.saveDesignAsEcore("../../runtime-EclipseApplication/test/emmanuel-p96.design");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(4, design.countTasks());
		assertEquals(10, design.countSteps());
		assertEquals(4, design.countPrecedenceRelations());
		assertEquals(2, design.step("tau_1,1").build().getOutputRel().getSucces().size());
		
		assertEquals(2, design.step("tau_2,2").build().getOutputRel().getSucces().size());
		assertEquals(1, design.step("tau_1,2").build().getOutputRel().getSucces().size());
		assertEquals(1, design.step("tau_2,1").build().getOutputRel().getSucces().size());
		assertEquals(2, design.step("tau_1,3").build().getInputRel().getPredec().size());
		
		assertNotNull(theProject.design());
		assertNotNull(theProject.design());
		// When transforming it into analysis model
		theProject.deriveAnalyzedSystem(true);
		
		// Then 
		final AnalysisBuilder analysis = theProject.analysis();
		assertEquals(10, analysis.countTasks());
		final TaskBuilder tau11 = analysis.task("T1 - tau_1,1");
		final TaskBuilder tau12 = analysis.task("T1 - tau_1,2");
		final TaskBuilder tau13 = analysis.task("T1 - tau_1,3");
		final TaskBuilder tau21 = analysis.task("T2 - tau_2,1");
		final TaskBuilder tau22 = analysis.task("T2 - tau_2,2");
		final TaskBuilder tau23 = analysis.task("T2 - tau_2,3");
		final TaskBuilder tau3 = analysis.task("T3 - tau_3");
		final TaskBuilder tau4 = analysis.task("T4 - tau_4");
		assertNotNull(tau11);
		assertNotNull(tau12);
		assertNotNull(tau13);
		assertNotNull(tau21);
		assertNotNull(tau22);
		assertNotNull(tau23);
		assertNotNull(tau3);
		assertNotNull(tau4);
		// All same period 8ms
		assertDurationEquals("8ms", tau11.getPeriod());
		assertDurationEquals("8ms", tau12.getPeriod());
		assertDurationEquals("8ms", tau13.getPeriod());
		assertDurationEquals("8ms", tau21.getPeriod());
		assertDurationEquals("8ms", tau22.getPeriod());
		assertDurationEquals("8ms", tau23.getPeriod());
		assertDurationEquals("8ms", tau3.getPeriod());
		assertDurationEquals("8ms", tau4.getPeriod());
		
		// same wcet as original step
		assertDurationEquals("1ms", tau11.getWCET());
		assertDurationEquals("2ms", tau12.getWCET());
		assertDurationEquals("1ms", tau13.getWCET());
		assertDurationEquals("1ms", tau21.getWCET());
		assertDurationEquals("2ms", tau22.getWCET());
		assertDurationEquals("1ms", tau23.getWCET());
		assertDurationEquals("1ms", tau3.getWCET());
		assertDurationEquals("1ms", tau4.getWCET());
		
		// Propagation of offset
		assertDurationEquals("0ms", tau11.getOffset());
		assertDurationEquals("0ms", tau12.getOffset());
		assertDurationEquals("1ms", tau13.getOffset());
		assertDurationEquals("1ms", tau21.getOffset());
		assertDurationEquals("1ms", tau22.getOffset());
		assertDurationEquals("1ms", tau23.getOffset());
		assertDurationEquals("1ms", tau3.getOffset());
		assertDurationEquals("1ms", tau4.getOffset());
		
		// deadline
		assertDurationEquals("6ms", tau4.getDeadline());
		assertDurationEquals("6ms", tau11.getDeadline());
		assertDurationEquals("7ms", tau12.getDeadline());
		assertDurationEquals("7ms", tau13.getDeadline());
		assertDurationEquals("6ms", tau21.getDeadline());
		assertDurationEquals("6ms", tau22.getDeadline());
		assertDurationEquals("6ms", tau23.getDeadline());
		assertDurationEquals("4ms", tau3.getDeadline());

		// We just propagate the priority from design to analysis yet, thus
		assertEquals(8, tau21.getPriority());
		assertEquals(8, tau22.getPriority());
		assertEquals(8, tau23.getPriority());
		assertEquals(9, tau11.getPriority());
		assertEquals(9, tau12.getPriority());
		assertEquals(9, tau13.getPriority());
		assertEquals(10, tau4.getPriority());
		assertEquals(1, tau3.getPriority());
		
		
		// But this is not enough regarding precedence and deadline
		// TODO Shall we reassign priority or what?
//		tau3.setPriority(1);
		tau21.setPriority(2);
		tau11.setPriority(3);
		analysis.task("T2 - artefact1").setPriority(4);
		tau12.setPriority(5);
		tau22.setPriority(6);
		analysis.task("T1 - artefact2").setPriority(7);
//		tau23.setPriority(8);
//		tau13.setPriority(9);
//		tau4.setPriority(10);

		final ComputingResource mainproc = tau3.getMappedTo();
		assertNotNull(mainproc);
		assertEquals("mainproc", mainproc.getName());
		assertEquals(mainproc, tau11.getMappedTo());
		assertEquals(mainproc, tau12.getMappedTo());
		assertEquals(mainproc, tau13.getMappedTo());
		assertEquals(mainproc, tau21.getMappedTo());
		assertEquals(mainproc, tau22.getMappedTo());
		assertEquals(mainproc, tau23.getMappedTo());
		assertEquals(mainproc, tau4.getMappedTo());
		
		final org.polarsys.time4sys.analysis.Scheduler sched = tau3.getScheduledBy().build();
		assertNotNull(sched);
		assertEquals(sched, tau11.getScheduledBy().build());
		assertEquals(sched, tau12.getScheduledBy().build());
		assertEquals(sched, tau13.getScheduledBy().build());
		assertEquals(sched, tau21.getScheduledBy().build());
		assertEquals(sched, tau22.getScheduledBy().build());
		assertEquals(sched, tau23.getScheduledBy().build());
		assertEquals(sched, tau4.getScheduledBy().build());
		
		assertEquals(mainproc, sched.getUsedBy());
		
		assertGenericTests(theProject);
		
		try {
			theProject.saveAsEcore("../../runtime-EclipseApplication/test/emmanuel-p96.time4sys");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
