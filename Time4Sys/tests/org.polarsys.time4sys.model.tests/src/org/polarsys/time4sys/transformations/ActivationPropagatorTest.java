/**
 * 
 */
package org.polarsys.time4sys.transformations;

import static org.junit.Assert.*;
import static org.polarsys.time4sys.builder.design.TaskBuilder.aTask;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.builder.design.ReferenceBuilder;
import org.polarsys.time4sys.builder.design.SamplesBuilder;
import org.polarsys.time4sys.builder.design.StepBuilder;
import org.polarsys.time4sys.builder.design.TaskBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.marte.gqam.Reference;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.model.time4sys.Transformation;

/**
 * @author loic
 *
 */
public class ActivationPropagatorTest {
	
	private ProjectBuilder theProject;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		theProject = new ProjectBuilder();
	}

	@Test
	public void testEmmanuelCourseSampleSETR96() {
		// Given a design model with one step per task, and control-flow dependencies
		final DesignBuilder sampleDesign = SamplesBuilder.emmanuelCourseSampleSETR96(theProject);
		final DesignModel design = (DesignModel)TaskDuplicator.transform(theProject.build(), sampleDesign.build()).getMapping().getSubLinks().get(0).getTargets().get(0).getValue();
		
		// When the activation propagation is applied
		final Transformation transfo = ActivationPropagator.transform(theProject.build(), design);
		
		// Debug
		try {
			theProject.saveAsEcore("../../runtime-EclipseApplication/test/ActivationPropagatorTest-testEmmanuelCourseSampleSETR96.time4sys");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Then
		
		
		final Mapping mapping = transfo.getMapping();
		assertNotNull(mapping);
		
		final DesignBuilder resultingDesign = new DesignBuilder((DesignModel)mapping.getSubLinks().get(0).getTargets().get(0).getValue());
		
		// There is no longer inter-task any control-flow dependency
		
		// Each entry step of a task has an activation
		
		// Whenever there is a data-flow (formely control-flow) dependencies tau_i -> tau_j
		// Then offsets constraint is r_i <= r_j
		// And deadlines constraint is D_i <= D_j
	}

	@Test
	public void testSimpleTwoTasks() {
		final DesignBuilder design = theProject.design();
		final ReferenceBuilder cpuStartRef = design.hasAReference().called("CPU Start");
		design.hasAProcessor().called("Main CPU").thatRuns(
				aTask().called("T1").ofET("1ms").ofPeriod("8ms").ofOffset("0ms").ofReference(cpuStartRef).ofDeadline("7ms"),
				aTask().called("T2").ofET("2ms")
		).under(SchedPolicyKind.FIXED_PRIORITY);
		final TaskBuilder t1 = design.task("T1");
		final TaskBuilder t2 = design.task("T2");
		t1.firstStep().called("tau_1").activates(t2.firstStep().called("tau_2"));
		assertTrue(t1.firstStep().hasAtLeastOneOutputPin().isControl());
		assertTrue(t2.firstStep().hasAtLeastOneInputPin().isControl());
		
		// When the activations propagation transformation is applied
		final Transformation transfo = ActivationPropagator.transform(theProject.build(), design.build());
		
		// Debug
		try {
			theProject.saveAsEcore("../../runtime-EclipseApplication/test/ActivationPropagatorTest-testSimpleTwoTasks.time4sys");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Then
		
		
		final Mapping mapping = transfo.getMapping();
		assertNotNull(mapping);
		
		final DesignBuilder resultingDesign = new DesignBuilder((DesignModel)mapping.getSubLinks().get(0).getTargets().get(0).getValue());
		final TaskBuilder resultingT1 = resultingDesign.task("T1");
		final TaskBuilder resultingT2 = resultingDesign.task("T2");
		assertEquals("8ms", resultingT1.firstStep().getPeriod().toString());
		assertEquals("8ms", resultingT2.firstStep().getPeriod().toString());
		assertEquals("0ms", resultingT1.firstStep().getOffset().toString());
		assertEquals("0ms", resultingT2.firstStep().getOffset().toString());
		
		assertFalse(resultingT1.firstStep().hasAtLeastOneOutputPin().isControl());
		assertFalse(resultingT2.firstStep().hasAtLeastOneInputPin().isControl());
		final Reference refT1 = resultingT1.getReference().build();
		assertNotNull(refT1);
		final Reference refT2 = resultingT2.getReference().build();
		assertNotNull(refT2);
		assertSame(refT1, refT2);
	}
	
	@Test
	public void testSimpleThreeTasks() {
		final DesignBuilder design = theProject.design();
		final ReferenceBuilder cpuStartRef = design.hasAReference().called("CPU Start");
		design.hasAProcessor().called("Main CPU").thatRuns(
				aTask().called("T1").ofET("1ms").ofPeriod("8ms").ofOffset("0ms").ofReference(cpuStartRef).ofDeadline("7ms"),
				aTask().called("T2").ofET("2ms"),
				aTask().called("T3").ofET("3ms")
		).under(SchedPolicyKind.FIXED_PRIORITY);
		final TaskBuilder t1 = design.task("T1");
		final TaskBuilder t2 = design.task("T2");
		final TaskBuilder t3 = design.task("T3");
		final StepBuilder tau1 = t1.firstStep().called("tau_1");
		final StepBuilder tau2 = t2.firstStep().called("tau_2");
		final StepBuilder tau3 = t3.firstStep().called("tau_3");
		tau1.activates(tau2);
		tau2.activates(tau3);
		assertTrue(tau1.hasAtLeastOneOutputPin().isControl());
		assertTrue(tau2.hasAtLeastOneInputPin().isControl());
		assertTrue(tau3.hasAtLeastOneInputPin().isControl());
		
		// When the activations propagation transformation is applied
		final Transformation transfo = ActivationPropagator.transform(theProject.build(), design.build());
		
		// Debug
		try {
			theProject.saveAsEcore("../../runtime-EclipseApplication/test/ActivationPropagatorTest-testSimpleThreeTasks.time4sys");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Then
		
		
		final Mapping mapping = transfo.getMapping();
		assertNotNull(mapping);
		
		final DesignBuilder resultingDesign = new DesignBuilder((DesignModel)mapping.getSubLinks().get(0).getTargets().get(0).getValue());
		final TaskBuilder resultingT1 = resultingDesign.task("T1");
		final TaskBuilder resultingT2 = resultingDesign.task("T2");
		final TaskBuilder resultingT3 = resultingDesign.task("T3");
		assertEquals("8ms", resultingT1.firstStep().getPeriod().toString());
		assertEquals("8ms", resultingT2.firstStep().getPeriod().toString());
		assertEquals("8ms", resultingT3.firstStep().getPeriod().toString());
		assertEquals("0ms", resultingT1.firstStep().getOffset().toString());
		assertEquals("0ms", resultingT2.firstStep().getOffset().toString());
		assertEquals("0ms", resultingT3.firstStep().getOffset().toString());
		
		assertFalse(resultingT1.firstStep().hasAtLeastOneOutputPin().isControl());
		assertFalse(resultingT2.firstStep().hasAtLeastOneInputPin().isControl());
		assertFalse(resultingT2.firstStep().hasAtLeastOneOutputPin().isControl());
		assertFalse(resultingT3.firstStep().hasAtLeastOneInputPin().isControl());
		final Reference refT1 = resultingT1.getReference().build();
		assertNotNull(refT1);
		final Reference refT2 = resultingT2.getReference().build();
		assertNotNull(refT2);
		final Reference refT3 = resultingT3.getReference().build();
		assertNotNull(refT3);
		assertSame(refT1, refT2);
		assertSame(refT1, refT3);
	}
}
