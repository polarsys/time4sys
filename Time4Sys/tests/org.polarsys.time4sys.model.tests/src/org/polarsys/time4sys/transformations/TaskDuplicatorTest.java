/**
 * 
 */
package org.polarsys.time4sys.transformations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.polarsys.time4sys.builder.design.TaskBuilder.aTask;
import static org.polarsys.time4sys.builder.design.arinc653.Arinc653PartitionBuilder.aPartition;
import static org.polarsys.time4sys.builder.design.arinc653.Arinc653SpareTaskBuilder.aSpareTask;
import static org.polarsys.time4sys.builder.design.posix.PosixSporadicServerBuilder.aPSS;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.builder.design.SamplesBuilder;
import org.polarsys.time4sys.builder.design.StepBuilder;
import org.polarsys.time4sys.builder.design.TaskBuilder;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653Builder;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653DesignBuilder;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653PartitionBuilder;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653PlatformBuilder;
import org.polarsys.time4sys.builder.design.posix.PosixSporadicServerBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.model.time4sys.Transformation;

/**
 * @author loic
 *
 */
public class TaskDuplicatorTest {

	private ProjectBuilder theProject;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		theProject = new ProjectBuilder();
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
		// When
		final Transformation transfo = TaskDuplicator.transform(theProject.build(), design.build());
		// Then
		
		try {
			theProject.saveAsEcore("../../runtime-EclipseApplication/test/TaskDuplicatorTest-testSimpleTwoTasks.time4sys");
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
		assertNotSame(s1Bis.getTask().build(), s2Bis.getTask().build());
		assertEquals(2, targetDesign.countTasks());
		
		final EList<Link> t1Links = mapping.getLinksForSource(t1.build());
		assertEquals(3, t1Links.size());
		int stepntaskCounter = 0;
		int duptaskCounter = 0;
		for(Link lnk: t1Links) {
			if (TaskDuplicator.STEPNTASK_TRANS_NAME.equals(lnk.getRationale().getName())) {
				stepntaskCounter++;
				assertEquals(2, lnk.getSources().size()); // 1 step & 1 task
				assertEquals(2, lnk.getTargets().size()); // 1 step & 1 task
			} else if (TaskDuplicator.TASK_TRANS_NAME.equals(lnk.getRationale().getName())) {
				duptaskCounter++;
				final SoftwareSchedulableResource originalTask = (SoftwareSchedulableResource)lnk.getUniqueSourceValue(IdentityDerivation.ORIGINAL_ROLE);
				final EList<EObject> dupTasks = lnk.getTargets(TaskDuplicator.COPY_TASK_ROLE);
				assertEquals(2, dupTasks.size()); // as many as original task's steps
				for(EObject current: dupTasks) {
					assertTrue(current instanceof SoftwareSchedulableResource);
					final SoftwareSchedulableResource aDupTask = (SoftwareSchedulableResource)current;
					assertTrue(aDupTask.getName().contains(originalTask.getName())); // Duplicated task's name contains the original name
				}
			} else {
				fail("Invalid link's rationale: " + lnk.getRationale().getName());
			}
		}
		assertEquals(2, stepntaskCounter);
		assertEquals(1, duptaskCounter);
		assertEquals(TaskDuplicator.TRANS_NAME, mapping.getRationale().getName());
	}

	@Test
	public void testSimpleTwoTasksThreeSteps() {
		// Given
		DesignBuilder design = theProject.design();
		design.hasAProcessor().called("mainproc").thatRuns(
				aTask().called("T1").ofPeriod("10ms").ofPriority(1),
				aTask().called("T2").ofPriority(2)
			).under(SchedPolicyKind.FIXED_PRIORITY);
		final TaskBuilder t1 = design.task("T1");
		final StepBuilder s1 = t1.firstStep().called("S1").ofBCET("1ms").ofWCET("2ms");
		final StepBuilder s2 = s1.isFollowedByAStep().called("S2").ofBCET("4ms").ofWCET("6ms");
		final TaskBuilder t2 = design.task("T2");
		final StepBuilder s3 = t2.firstStep().called("S3").ofBCET("1ms").ofWCET("2ms");
		s2.activates(s3);
		design.build();
		assertEquals(s1.getTask().build(), s2.getTask().build());
		assertNotSame(s1.getTask().build(), s3.getTask().build());
		// When
		final Transformation transfo = TaskDuplicator.transform(theProject.build(), design.build());
		// Then
		
		try {
			theProject.saveAsEcore("../../runtime-EclipseApplication/test/TaskDuplicatorTest-testSimpleTwoTasksThreeSteps.time4sys");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		assertNotNull(transfo);
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
		assertNotSame(s1Bis.getTask().build(), s2Bis.getTask().build());
		assertEquals(3, targetDesign.countTasks());
		
		// == Check T1 transformation ==
		final EList<Link> t1Links = mapping.getLinksForSource(t1.build());
		assertEquals(3, t1Links.size());
		int stepntaskCounter = 0;
		int duptaskCounter = 0;
		for(Link lnk: t1Links) {
			if (TaskDuplicator.STEPNTASK_TRANS_NAME.equals(lnk.getRationale().getName())) {
				stepntaskCounter++;
				assertEquals(2, lnk.getSources().size()); // 1 step & 1 task
				assertEquals(2, lnk.getTargets().size()); // 1 step & 1 task
			} else if (TaskDuplicator.TASK_TRANS_NAME.equals(lnk.getRationale().getName())) {
				duptaskCounter++;
				final SoftwareSchedulableResource originalTask = (SoftwareSchedulableResource)lnk.getUniqueSourceValue(IdentityDerivation.ORIGINAL_ROLE);
				final EList<EObject> dupTasks = lnk.getTargets(TaskDuplicator.COPY_TASK_ROLE);
				assertEquals(2, dupTasks.size()); // as many as original task's steps
				for(EObject current: dupTasks) {
					assertTrue(current instanceof SoftwareSchedulableResource);
					final SoftwareSchedulableResource aDupTask = (SoftwareSchedulableResource)current;
					assertTrue(aDupTask.getName().contains(originalTask.getName())); // Duplicated task's name contains the original name
				}
			} else {
				fail("Invalid link's rationale: " + lnk.getRationale().getName());
			}
		}
		assertEquals(2, stepntaskCounter);
		assertEquals(1, duptaskCounter);
		
		// == Check T2 transformation ==
		final EList<Link> t2Links = mapping.getLinksForSource(t2.build());
		assertEquals(2, t2Links.size());
		stepntaskCounter = 0;
		duptaskCounter = 0;
		for(Link lnk: t2Links) {
			if (TaskDuplicator.STEPNTASK_TRANS_NAME.equals(lnk.getRationale().getName())) {
				stepntaskCounter++;
				assertEquals(2, lnk.getSources().size()); // 1 step & 1 task
				assertEquals(2, lnk.getTargets().size()); // 1 step & 1 task
			} else if (TaskDuplicator.TASK_TRANS_NAME.equals(lnk.getRationale().getName())) {
				duptaskCounter++;
				final SoftwareSchedulableResource originalTask = (SoftwareSchedulableResource)lnk.getUniqueSourceValue(IdentityDerivation.ORIGINAL_ROLE);
				final EList<EObject> dupTasks = lnk.getTargets(TaskDuplicator.COPY_TASK_ROLE);
				assertEquals(1, dupTasks.size()); // as many as original task's steps
				for(EObject current: dupTasks) {
					assertTrue(current instanceof SoftwareSchedulableResource);
					final SoftwareSchedulableResource aDupTask = (SoftwareSchedulableResource)current;
					assertTrue(aDupTask.getName().contains(originalTask.getName())); // Duplicated task's name contains the original name
				}
			} else {
				fail("Invalid link's rationale: " + lnk.getRationale().getName());
			}
		}
		assertEquals(1, stepntaskCounter);
		assertEquals(1, duptaskCounter);
		
		assertEquals(TaskDuplicator.TRANS_NAME, mapping.getRationale().getName());
	}
	
	@Test
	public void testArinc653() {
		// Given an Arinc653 configuration
		final ProjectBuilder theProject = new ProjectBuilder();
		final Arinc653DesignBuilder db = Arinc653Builder.newDesign(theProject).called("Arinc653 test");
		final Arinc653PlatformBuilder ima = db.hasAPlatform().called("CPU").withMIFDuration("60ms");
		final Arinc653PartitionBuilder fms = aPartition().called("Partition_1").ofTimeBudget("44ms");
		final Arinc653PartitionBuilder utils = aPartition().called("Partition_2").ofTimeBudget("45ms");
		ima.runs(fms, utils);
		assertEquals(2, ima.countPartition());
		final TaskBuilder initialisationTask = aTask().called("initialisationTask").aperiodic().ofPriority(1).ofDeadline("65000us").ofET("6s");
		final TaskBuilder ttSecondaryTask = aTask().called("ttSecondaryTask").aperiodic().ofPriority(5).ofBCET("0.5ms").ofWCET("2ms");
		final TaskBuilder lr2ServerTask = aPSS().called("lr2ServerTask").ofPriority(29).ofInitialBudget("1ms").ofBackgroundPriority(2).aperiodic();
		final TaskBuilder periodicLowTask = aPSS().called("periodicLowTask")/*.withOrder(2)*/.ofPriority(32).ofDeadline("9600us").ofBackgroundPriority(4).ofPeriod("960ms").ofET("1ms");
		final TaskBuilder lr3ServerTask = aPSS().called("lr3ServerTask").withOrder(1).ofPriority(30).ofInitialBudget("1ms").ofBackgroundPriority(2).withSingleActivation().ofET("1ms");
		final TaskBuilder spareTask1 = aSpareTask().called("spareTask1").ofPriority(1);
		fms.runs(initialisationTask, ttSecondaryTask, lr2ServerTask, periodicLowTask, lr3ServerTask, spareTask1).under(SchedPolicyKind.FIXED_PRIORITY);
		lr2ServerTask.firstStep().called("LR2_Server");
		periodicLowTask.firstStep().called("Periodic_Low");
		spareTask1.firstStep().called("Periodic_Spare").ofET("11ms").ofPeriod("60ms");
		periodicLowTask.withReference(fms.reference());
		spareTask1.withReference(fms.reference());
		theProject.build();
		PosixSporadicServerBuilder.as(periodicLowTask.build()).withOrder(2);
		
		// When
		final Transformation transfo = TaskDuplicator.transform(theProject.build(), theProject.design().build());
		
		// Debug
		try {
			theProject.saveAsEcore("../../runtime-EclipseApplication/test/TaskDuplicatorTest-testArinc653.time4sys");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Then
		final DesignModel design = (DesignModel)transfo.getMapping().getSubLinks().get(0).getTargets().get(0).getValue();
		AbstractDerivationTest.removeEndToEndFlows(design);
		
		final DesignBuilder resultingDesign = new DesignBuilder((DesignModel)design);
		for(Step aStep: resultingDesign.allSteps()) {
			assertNotNull(aStep.getName() + " shall be allocated to a SoftwareSchedulableResource.", aStep.getConcurRes());
			assertNotNull(aStep.getConcurRes().getHost());
		}
		
	}
	
	@Test
	public void testEmmanuelCourseSampleSETR96() {
		// Given
		final DesignBuilder design = SamplesBuilder.emmanuelCourseSampleSETR96(theProject);
		// When
		final Transformation transfo = TaskDuplicator.transform(theProject.build(), design.build());
		// Then
		
		try {
			theProject.saveAsEcore("../../runtime-EclipseApplication/test/TaskDuplicatorTest-testEmmanuelCourseSampleSETR96.time4sys");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
