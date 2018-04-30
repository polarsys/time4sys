/**
 * 
 */
package org.polarsys.time4sys.transformations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.polarsys.time4sys.builder.design.TaskBuilder.aTask;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.builder.design.InputPinBuilder;
import org.polarsys.time4sys.builder.design.OutputPinBuilder;
import org.polarsys.time4sys.builder.design.ReferenceBuilder;
import org.polarsys.time4sys.builder.design.SamplesBuilder;
import org.polarsys.time4sys.builder.design.StepBuilder;
import org.polarsys.time4sys.builder.design.TaskBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.Reference;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.model.time4sys.Transformation;

/**
 * @author loic
 *
 */
public class ActivationPropagatorTest {
	
	protected static void assertValidDepedencies(final DesignBuilder resultingDesign) {
		for(Step aStep: resultingDesign.allSteps()) {
			// Each entry step of a task has one and only one activation
			assertEquals(1, aStep.getCause().size());
		
			// There is no longer inter-tasks any control-flow dependency
			for(OutputPin opin: aStep.getOutputPin()) {
				assertFalse(opin.isIsControl());
			}
			for(InputPin ipin: aStep.getInputPin()) {
				assertFalse(ipin.isIsControl());
			}
			// Whenever there is a data-flow (formely control-flow) dependencies tau_i -> tau_j
			for(OutputPin opin: aStep.getOutputPin()) {
				for(InputPin ipin: opin.getSuccessors()) {
					final StepBuilder step_i = new StepBuilder(resultingDesign, aStep);
					final StepBuilder step_j = new StepBuilder(resultingDesign, (Step)ipin.eContainer());
					final String prefixMsg = step_i.name() + "_x_" + step_j.name();
					// Then offsets constraint is r_i <= r_j
					final Duration r_i = step_i.getOffset();
					final Duration r_j = step_j.getOffset();
					AbstractDerivationTest.assertIsLessOrEquals(prefixMsg + " offsets: ", r_i, r_j);
					// And deadlines constraint is D_i <= D_j
					final Duration d_i = step_i.getDeadline();
					final Duration d_j = step_j.getDeadline();
					AbstractDerivationTest.assertIsLessOrEquals(prefixMsg + " deadlines: ", d_i, d_j);
				}
			}
		}
	}
	
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
		AbstractDerivationTest.removeEndToEndFlows(design);
		
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
	
		assertEquals("8ms", resultingDesign.task("T1_x_tau_1,1").getPeriod().toString());
		assertEquals("8ms", resultingDesign.task("T1_x_tau_1,2").getPeriod().toString());
		assertEquals("8ms", resultingDesign.task("T1_x_tau_1,3").getPeriod().toString());
		assertEquals("8ms", resultingDesign.task("T2_x_tau_2,1").getPeriod().toString());
		assertEquals("8ms", resultingDesign.task("T2_x_tau_2,2").getPeriod().toString());
		assertEquals("8ms", resultingDesign.task("T2_x_tau_2,3").getPeriod().toString());
		assertEquals("8ms", resultingDesign.task("T3_x_tau_3").getPeriod().toString());
		assertEquals("8ms", resultingDesign.task("T4_x_tau_4").getPeriod().toString());
		
		assertEquals("0ms", resultingDesign.task("T1_x_tau_1,1").getOffset().toString());
		assertEquals("0ms", resultingDesign.task("T1_x_tau_1,2").getOffset().toString());
		assertEquals("1ms", resultingDesign.task("T1_x_tau_1,3").getOffset().toString());
		assertEquals("1ms", resultingDesign.task("T2_x_tau_2,1").getOffset().toString());
		assertEquals("1ms", resultingDesign.task("T2_x_tau_2,2").getOffset().toString());
		assertEquals("1ms", resultingDesign.task("T2_x_tau_2,3").getOffset().toString());
		assertEquals("1ms", resultingDesign.task("T3_x_tau_3").getOffset().toString());
		assertEquals("1ms", resultingDesign.task("T4_x_tau_4").getOffset().toString());
		
		assertEquals("4ms", resultingDesign.task("T3_x_tau_3").getDeadline().toString());
		assertEquals("6ms", resultingDesign.task("T4_x_tau_4").getDeadline().toString());
		assertEquals("7ms", resultingDesign.task("T1_x_tau_1,3").getDeadline().toString());
		assertEquals("6ms", resultingDesign.task("T1_x_tau_1,1").getDeadline().toString());
		assertEquals("6ms", resultingDesign.task("T2_x_tau_2,1").getDeadline().toString());
		assertEquals("6ms", resultingDesign.task("T2_x_tau_2,2").getDeadline().toString());
		assertEquals("6ms", resultingDesign.task("T2_x_tau_2,3").getDeadline().toString());
		assertEquals("7ms", resultingDesign.task("T1_x_tau_1,2").getDeadline().toString());
		
		
		assertValidDepedencies(resultingDesign);	
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
		final OutputPinBuilder t1OPin = t1.firstStep().hasAtLeastOneOutputPin();
		AbstractDerivationTest.removeEndToEndFlows(design.build());
		assertTrue(t1OPin.isControl());
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
		assertNotNull(transfo.getName());
		
		final DesignBuilder resultingDesign = new DesignBuilder((DesignModel)mapping.getSubLinks().get(0).getTargets().get(0).getValue());
		final TaskBuilder resultingT1 = resultingDesign.task("T1");
		final TaskBuilder resultingT2 = resultingDesign.task("T2");
		assertEquals("8ms", resultingT1.firstStep().getPeriod().toString());
		assertEquals("8ms", resultingT2.firstStep().getPeriod().toString());
		
		assertEquals("0ms", resultingT1.firstStep().getOffset().toString());
		assertEquals("0ms", resultingT2.firstStep().getOffset().toString());
		
		assertEquals("7ms", resultingT1.getDeadline().toString());
		assertEquals("7ms", resultingT2.getDeadline().toString());
		
		final OutputPinBuilder resultingT1OPin = resultingT1.firstStep().hasAtLeastOneOutputPin();
		assertFalse(resultingT1OPin.isControl());
		assertFalse(resultingT2.firstStep().hasAtLeastOneInputPin().isControl());
		final Reference refT1 = resultingT1.getReference().build();
		assertNotNull(refT1);
		final Reference refT2 = resultingT2.getReference().build();
		assertNotNull(refT2);
		assertSame(refT1, refT2);
		
		final EList<Link> t1OPinLnks = mapping.getLinksForSource(t1OPin.build());
		assertEquals(2, t1OPinLnks.size()); // The identity link for OutputPin and the transformation link for Activation
		
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
		AbstractDerivationTest.removeEndToEndFlows(design.build());
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
		
		assertEquals("7ms", resultingT1.getDeadline().toString());
		assertEquals("7ms", resultingT2.getDeadline().toString());
		assertEquals("7ms", resultingT3.getDeadline().toString());
	}
	
	@Test
	public void testTwoToOneTasks() {
		final DesignBuilder design = theProject.design();
		final ReferenceBuilder cpuStartRef = design.hasAReference().called("CPU Start");
		design.hasAProcessor().called("Main CPU").thatRuns(
				aTask().called("T1").ofET("1ms").ofPeriod("8ms").ofOffset("1ms").ofReference(cpuStartRef).ofDeadline("7ms"),
				aTask().called("T2").ofET("2ms").ofPeriod("8ms").ofOffset("4ms").ofReference(cpuStartRef).ofDeadline("5ms"),
				aTask().called("T3").ofET("3ms").ofDeadline("8ms")
		).under(SchedPolicyKind.FIXED_PRIORITY);
		final TaskBuilder t1 = design.task("T1");
		final TaskBuilder t2 = design.task("T2");
		final TaskBuilder t3 = design.task("T3");
		final StepBuilder tau1 = t1.firstStep().called("tau_1");
		final StepBuilder tau2 = t2.firstStep().called("tau_2");
		final StepBuilder tau3 = t3.firstStep().called("tau_3");
		final OutputPinBuilder tau1o = tau1.hasAtLeastOneOutputPin().called("tau_1_o");
		final OutputPinBuilder tau2o = tau2.hasAtLeastOneOutputPin().called("tau_2_o");
		final InputPinBuilder t3iA = tau3.hasOneInputPinNamed("tau_3_iA").activatedBy(tau1o);
		final InputPinBuilder t3iB = tau3.hasOneInputPinNamed("tau_3_iB").activatedBy(tau2o);
		AbstractDerivationTest.removeEndToEndFlows(design.build());
		assertTrue(tau1o.isControl());
		assertTrue(tau2o.isControl());
		assertTrue(t3iA.isControl());
		assertTrue(t3iB.isControl());
		
		// When the activations propagation transformation is applied
		final Transformation transfo = ActivationPropagator.transform(theProject.build(), design.build());
		
		// Debug
		try {
			theProject.saveAsEcore("../../runtime-EclipseApplication/test/ActivationPropagatorTest-testTwoToOneTasks.time4sys");
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
		
		assertEquals(1, resultingT3.firstStep().getCauses().size());
		
		assertFalse(resultingT1.firstStep().hasAtLeastOneOutputPin().isControl());
		assertFalse(resultingT2.firstStep().hasAtLeastOneOutputPin().isControl());
		assertFalse(resultingT3.firstStep().hasOneInputPinNamed("tau_3_iA").isControl());
		assertFalse(resultingT3.firstStep().hasOneInputPinNamed("tau_3_iB").isControl());
		final Reference refT1 = resultingT1.getReference().build();
		assertNotNull(refT1);
		final Reference refT2 = resultingT2.getReference().build();
		assertNotNull(refT2);
		final Reference refT3 = resultingT3.getReference().build();
		assertNotNull(refT3);
		assertSame(refT1, refT2);
		assertSame(refT1, refT3);
		
		assertValidDepedencies(resultingDesign);
		
		assertEquals("1ms", resultingT1.getOffset().toString());
		assertEquals("4ms", resultingT2.getOffset().toString());
		assertEquals("4ms", resultingT3.getOffset().toString());
		
		assertEquals("4ms", resultingT1.getDeadline().toString());
		assertEquals("4ms", resultingT2.getDeadline().toString());
		assertEquals("4ms", resultingT3.getDeadline().toString());
	}
	
	@Test
	public void testSimpleOneTaskTwoSteps() {
		// Given
		DesignBuilder design = theProject.design();
		design.hasAProcessor().called("mainproc").thatRuns(
				aTask().called("T1").ofPeriod("10ms").ofPriority(1)
			).under(SchedPolicyKind.FIXED_PRIORITY);
		final TaskBuilder t1 = design.task("T1");
		final StepBuilder s1 = t1.firstStep().called("S1").ofBCET("1ms").ofWCET("2ms");
		final StepBuilder s2 = s1.isFollowedByAStep().called("S2").ofBCET("4ms").ofWCET("6ms");
		design.build();
		assertEquals(s1.getTask().build(), s2.getTask().build());
		assertEquals(0, s1.build().getInputPin().size());
		assertEquals(1, s1.build().getOutputPin().size());
		assertEquals(1, s2.build().getInputPin().size());
		assertEquals(0, s2.build().getOutputPin().size());
		// When
		final Transformation transfo = ActivationPropagator.transform(theProject.build(), design.build());
		// Then
		
		try {
			theProject.saveAsEcore("../../runtime-EclipseApplication/test/ActivationPropagatorTest-testSimpleOneTaskTwoSteps.time4sys");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		assertNotNull(transfo);
		assertNotNull(transfo.getName());
		final Mapping mapping = transfo.getMapping();
		assertNotNull(mapping);
		
		final EList<Link> subLinks = mapping.getSubLinks();
		assertFalse(subLinks.isEmpty());
		// The design model has been copied.
		final DesignModel copy = (DesignModel) subLinks.get(0).getTargets().get(0).getValue();
		final DesignBuilder targetDesign = new DesignBuilder(copy);
		final EList<Link> s1Links = mapping.getLinksForSource(s1.build());
		assertEquals(1, s1Links.size());
		final EObject s1Copy = s1Links.get(0).getUniqueTargetValue(IdentityDerivation.COPY_ROLE);
		assertNotNull(s1Copy);
		assertTrue(s1Copy  instanceof Step);
		final StepBuilder s1Bis = new StepBuilder(targetDesign, (Step)s1Copy);
		final EList<Link> s2Links = mapping.getLinksForSource(s2.build());
		assertEquals(1, s2Links.size());
		final EObject s2Copy = s2Links.get(0).getUniqueTargetValue(IdentityDerivation.COPY_ROLE);
		assertTrue(s2Copy  instanceof Step);
		final StepBuilder s2Bis = new StepBuilder(targetDesign, (Step)s2Copy);
		assertEquals(s1Bis.getTask().build(), s2Bis.getTask().build());
		assertEquals(1, targetDesign.countTasks());
		
		final EList<Link> t1Links = mapping.getLinksForSource(t1.build());
		assertEquals(1, t1Links.size());
		int stepntaskCounter = 0;
		int duptaskCounter = 0;
		for(Link lnk: t1Links) {
			if (ActivationPropagator.CTRL2DATAFLOW_RULE.equals(lnk.getRationale().getName())) {
				stepntaskCounter++;
				assertEquals(2, lnk.getSources().size()); // 1 step & 1 task
				assertEquals(2, lnk.getTargets().size()); // 1 step & 1 task
			} else if (ActivationPropagator.DEP2ACTIVATION_RULE.equals(lnk.getRationale().getName())) {
				duptaskCounter++;
				final SoftwareSchedulableResource originalTask = (SoftwareSchedulableResource)lnk.getUniqueSourceValue(IdentityDerivation.ORIGINAL_ROLE);
				final EList<EObject> dupTasks = lnk.getTargets(TaskSplitter.COPY_TASK_ROLE);
				assertEquals(1, dupTasks.size()); // as many as original task's steps
				for(EObject current: dupTasks) {
					assertTrue(current instanceof SoftwareSchedulableResource);
					final SoftwareSchedulableResource aDupTask = (SoftwareSchedulableResource)current;
					assertTrue(aDupTask.getName().contains(originalTask.getName())); // Duplicated task's name contains the original name
				}
			} else if (IdentityDerivation.IDENTITY_RULE_NAME.equals(lnk.getRationale().getName())) {
			} else {
				fail("Invalid link's rationale: " + lnk.getRationale().getName());
			}
		}
		assertEquals(0, stepntaskCounter);
		assertEquals(0, duptaskCounter);
		assertEquals(ActivationPropagator.TRANS_NAME, mapping.getRationale().getName());
		for(Step aStep: targetDesign.allSteps()) {
			assertEquals(aStep.getInputPin().isEmpty(), !aStep.getCause().isEmpty());
			for(InputPin ipin: aStep.getInputPin()) {
				assertTrue(ipin.isIsControl());
			}
			for(OutputPin opin: aStep.getOutputPin()) {
				assertTrue(opin.isIsControl());
			}
		}
	}
	
	@Test
	public void testSimpleOneTaskTwoStepsForAllSteps() {
		// Given
		DesignBuilder design = theProject.design();
		design.hasAProcessor().called("mainproc").thatRuns(
				aTask().called("T1").ofPeriod("10ms").ofPriority(1)
			).under(SchedPolicyKind.FIXED_PRIORITY);
		final TaskBuilder t1 = design.task("T1");
		final StepBuilder s1 = t1.firstStep().called("S1").ofBCET("1ms").ofWCET("2ms");
		final StepBuilder s2 = s1.isFollowedByAStep().called("S2").ofBCET("4ms").ofWCET("6ms");
		design.build();
		assertEquals(s1.getTask().build(), s2.getTask().build());
		// When
		final Transformation transfo = ActivationPropagator.transform(
				ActivationPropagator.defaultCfg().withPropagationOnEveryStep(),
				theProject.build(),
				design.build());
		
		// Then
		
		try {
			theProject.saveAsEcore("../../runtime-EclipseApplication/test/ActivationPropagatorTest-testSimpleOneTaskTwoStepsForAllSteps.time4sys");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		assertNotNull(transfo);
		assertNotNull(transfo.getName());
		final Mapping mapping = transfo.getMapping();
		assertNotNull(mapping);
		
		final EList<Link> subLinks = mapping.getSubLinks();
		assertFalse(subLinks.isEmpty());
		// The design model has been copied.
		final DesignModel copy = (DesignModel) subLinks.get(0).getTargets().get(0).getValue();
		final DesignBuilder targetDesign = new DesignBuilder(copy);
		final EList<Link> s1Links = mapping.getLinksForSource(s1.build());
		assertEquals(1, s1Links.size());
		final EObject s1Copy = s1Links.get(0).getUniqueTargetValue(IdentityDerivation.COPY_ROLE);
		assertNotNull(s1Copy);
		assertTrue(s1Copy  instanceof Step);
		final StepBuilder s1Bis = new StepBuilder(targetDesign, (Step)s1Copy);
		final EList<Link> s2Links = mapping.getLinksForSource(s2.build());
		assertEquals(1, s2Links.size());
		final EObject s2Copy = s2Links.get(0).getUniqueTargetValue(IdentityDerivation.COPY_ROLE);
		assertTrue(s2Copy  instanceof Step);
		final StepBuilder s2Bis = new StepBuilder(targetDesign, (Step)s2Copy);
		assertEquals(s1Bis.getTask().build(), s2Bis.getTask().build());
		assertEquals(1, targetDesign.countTasks());
		
		final EList<Link> t1Links = mapping.getLinksForSource(t1.build());
		assertEquals(1, t1Links.size());
		int stepntaskCounter = 0;
		int duptaskCounter = 0;
		for(Link lnk: t1Links) {
			if (ActivationPropagator.CTRL2DATAFLOW_RULE.equals(lnk.getRationale().getName())) {
				stepntaskCounter++;
				assertEquals(2, lnk.getSources().size()); // 1 step & 1 task
				assertEquals(2, lnk.getTargets().size()); // 1 step & 1 task
			} else if (ActivationPropagator.DEP2ACTIVATION_RULE.equals(lnk.getRationale().getName())) {
				duptaskCounter++;
				final SoftwareSchedulableResource originalTask = (SoftwareSchedulableResource)lnk.getUniqueSourceValue(IdentityDerivation.ORIGINAL_ROLE);
				final EList<EObject> dupTasks = lnk.getTargets(TaskSplitter.COPY_TASK_ROLE);
				assertEquals(1, dupTasks.size()); // as many as original task's steps
				for(EObject current: dupTasks) {
					assertTrue(current instanceof SoftwareSchedulableResource);
					final SoftwareSchedulableResource aDupTask = (SoftwareSchedulableResource)current;
					assertTrue(aDupTask.getName().contains(originalTask.getName())); // Duplicated task's name contains the original name
				}
			} else if (IdentityDerivation.IDENTITY_RULE_NAME.equals(lnk.getRationale().getName())) {
			} else {
				fail("Invalid link's rationale: " + lnk.getRationale().getName());
			}
		}
		assertEquals(0, stepntaskCounter);
		assertEquals(0, duptaskCounter);
		assertEquals(ActivationPropagator.TRANS_NAME, mapping.getRationale().getName());
		for(Step aStep: targetDesign.allSteps()) {
			assertFalse(aStep.getCause().isEmpty());
			for(InputPin ipin: aStep.getInputPin()) {
				assertFalse(ipin.isIsControl());
			}
			for(OutputPin opin: aStep.getOutputPin()) {
				assertFalse(opin.isIsControl());
			}
		}
	}
}
