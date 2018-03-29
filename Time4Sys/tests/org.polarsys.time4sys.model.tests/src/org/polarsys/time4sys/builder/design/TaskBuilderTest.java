/**
 * 
 */
package org.polarsys.time4sys.builder.design;

import static org.junit.Assert.*;
import static org.polarsys.time4sys.builder.design.TaskBuilder.aTask;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.marte.grm.FixedPriorityParameters;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;

/**
 * @author loic
 *
 */
public class TaskBuilderTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.builder.design.TaskBuilder#ofPriority(int)}.
	 */
	@Test
	public void testOfPriority() {
		// Given a task
		final ProjectBuilder theProject = new ProjectBuilder();
		final DesignBuilder db = theProject.design();
		final TaskBuilder t = aTask().called("T1").ofPriority(10);
		// When we build it
		final SoftwareSchedulableResource buildedTask = t.build(db);
		// Then
		assertNotNull(buildedTask.getSchedParams());
		assertEquals(1, buildedTask.getSchedParams().size());
		final SchedulingParameter schedParam = buildedTask.getSchedParams().get(0);
		assertTrue(schedParam instanceof FixedPriorityParameters);
		final FixedPriorityParameters fp = (FixedPriorityParameters)schedParam;
		assertEquals(10, fp.getPriority());
	}

}
