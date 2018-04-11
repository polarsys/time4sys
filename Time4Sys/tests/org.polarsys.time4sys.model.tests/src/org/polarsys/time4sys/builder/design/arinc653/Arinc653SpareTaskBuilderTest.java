/**
 * 
 */
package org.polarsys.time4sys.builder.design.arinc653;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.polarsys.time4sys.builder.design.StepBuilder.aStep;
import static org.polarsys.time4sys.builder.design.TaskBuilder.aTask;
import static org.polarsys.time4sys.builder.design.arinc653.Arinc653SpareTaskBuilder.aSpareTask;

import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.builder.design.TaskBuilder;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;

/**
 * @author loic
 *
 */
public class Arinc653SpareTaskBuilderTest {

	private ProjectBuilder theProject;
	private DesignBuilder designBuilder;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		theProject = new ProjectBuilder();
		designBuilder = theProject.design();
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.builder.design.arinc653.Arinc653SpareTaskBuilder#aSpareTask()}.
	 */
	@Test
	public void testASpareTask() {
		final SoftwareSchedulableResource task = aSpareTask().called("S1").build(designBuilder);
		assertTrue(Arinc653SpareTaskBuilder.isSpare(task));
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.builder.design.arinc653.Arinc653SpareTaskBuilder#isSpare(org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource)}.
	 */
	@Test
	public void testNotASpare() {
		final SoftwareSchedulableResource task = aTask().called("T1").build(designBuilder);
		assertFalse(Arinc653SpareTaskBuilder.isSpare(task));
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.builder.design.arinc653.Arinc653SpareTaskBuilder#aSpareTask()}.
	 */
	@Test
	public void testNotSpareTaskButAnnotated() {
		final TaskBuilder tb = aSpareTask().called("S1");
		tb.annotate(Arinc653Builder.ARINC653_URL).getDetails().put(Arinc653SpareTaskBuilder.SPARE_ATTR, "False");
		final SoftwareSchedulableResource task = tb.build(designBuilder);
		assertFalse(Arinc653SpareTaskBuilder.isSpare(task));
	}
	
	@Test
	public void testASpareStep() {
		final Step step = aStep(designBuilder).called("S1").build();
		Arinc653SpareTaskBuilder.asSpare(step);
		assertTrue(Arinc653SpareTaskBuilder.isSpare(step));
	}
}
