/**
 * 
 */
package org.polarsys.time4sys.transformations;

import static org.junit.Assert.*;
import static org.polarsys.time4sys.builder.design.TaskBuilder.aTask;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.marte.grm.EDFParameters;
import org.polarsys.time4sys.marte.grm.FixedPriorityParameters;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;

/**
 * @author loic
 *
 */
public class RemoveAndReplaceDeprecatedTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.transformations.RemoveAndReplaceDeprecated#removeAndReplaceDeprecated(org.polarsys.time4sys.model.time4sys.Project)}.
	 */
	@Test
	public void testRemoveAndReplaceDeprecatedFixedPriority() {
		// Given a model where Task priority used a raw SchedulingParameter
		final ProjectBuilder theProject = new ProjectBuilder();
		final DesignBuilder design = theProject.design().called("Challenge_Analysis");
		design.hasAProcessor().called("CPU1").thatRuns(
				aTask().called("T2")/*.ofPriority(10)*/,
				aTask().called("T5")/*.ofPriority(30)*/
			).under(SchedPolicyKind.FIXED_PRIORITY);
		design.task("T2").firstStep().called("Processing").ofPeriod("40ms").ofET("17ms");
		
		final SchedulingParameter t2SchedParam = GrmFactory.eINSTANCE.createSchedulingParameter();
		t2SchedParam.setName("FixedPriority");
		t2SchedParam.setValue("10");
		design.task("T2").build().getSchedParams().add(t2SchedParam);
		
		final SchedulingParameter t5SchedParam = GrmFactory.eINSTANCE.createSchedulingParameter();
		t5SchedParam.setName("FixedPriority");
		t5SchedParam.setValue("30");
		design.task("T5").build().getSchedParams().add(t5SchedParam);
		
		// When we remove deprecated
		RemoveAndReplaceDeprecated.removeAndReplaceDeprecated(theProject.build());
		
		// Then Task priority use the FixedPriorityParameters class
		final EList<SchedulingParameter> t5SchedParams = design.task("T5").build().getSchedParams();
		assertNotNull(t5SchedParams);
		assertEquals(1, t5SchedParams.size());
		
		final SchedulingParameter t5SchedParamAfter = t5SchedParams.get(0);
		assertTrue(t5SchedParamAfter instanceof FixedPriorityParameters);
		assertEquals(30, ((FixedPriorityParameters)t5SchedParamAfter).getPriority());
	}
	
	/**
	 * Test method for {@link org.polarsys.time4sys.transformations.RemoveAndReplaceDeprecated#removeAndReplaceDeprecated(org.polarsys.time4sys.model.time4sys.Project)}.
	 */
	@Test
	public void testRemoveAndReplaceDeprecatedDeadline() {
		// Given a model where Task priority used a raw SchedulingParameter
		final ProjectBuilder theProject = new ProjectBuilder();
		final DesignBuilder design = theProject.design().called("Challenge_Analysis");
		design.hasAProcessor().called("CPU1").thatRuns(
				aTask().called("T2")/*.ofPriority(10)*/,
				aTask().called("T5")/*.ofPriority(30)*/
			).under(SchedPolicyKind.FIXED_PRIORITY);
		design.task("T2").firstStep().called("Processing").ofPeriod("40ms").ofET("17ms");
		
		final SchedulingParameter t2SchedParam = GrmFactory.eINSTANCE.createSchedulingParameter();
		t2SchedParam.setName("Deadline");
		t2SchedParam.setValue("10");
		design.task("T2").build().getSchedParams().add(t2SchedParam);

		final SchedulingParameter t5SchedParam = GrmFactory.eINSTANCE.createSchedulingParameter();
		t5SchedParam.setName("Deadline");
		t5SchedParam.setValue("5ms");
		design.task("T5").build().getSchedParams().add(t5SchedParam);

		// When we remove deprecated
		RemoveAndReplaceDeprecated.removeAndReplaceDeprecated(theProject.build());

		// Then Task priority use the FixedPriorityParameters class
		final EList<SchedulingParameter> t5SchedParams = design.task("T5").build().getSchedParams();
		assertNotNull(t5SchedParams);
		assertEquals(1, t5SchedParams.size());

		final SchedulingParameter t5SchedParamAfter = t5SchedParams.get(0);
		assertTrue(t5SchedParamAfter instanceof EDFParameters);
		assertEquals("5ms", ((EDFParameters)t5SchedParamAfter).getDeadline().toString());
	}

}
