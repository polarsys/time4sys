/**
 * 
 */
package org.polarsys.time4sys.builder.design.posix;

import static org.junit.Assert.*;
import static org.polarsys.time4sys.builder.design.arinc653.Arinc653MIFBuilder.aMIF;
import static org.polarsys.time4sys.builder.design.posix.PosixSporadicServerBuilder.aPSS;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.builder.design.TaskBuilder;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653Builder;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653DesignBuilder;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653MIFBuilder;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653PlatformBuilder;
import org.polarsys.time4sys.marte.grm.PeriodicServerParameters;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;

/**
 * @author loic
 *
 */
public class PosixSporadicServerBuilderTest {

	private ProjectBuilder theProject;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		theProject = new ProjectBuilder();
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.builder.design.posix.PosixSporadicServerBuilder#aPSS()}.
	 */
	@Test
	public void testPosixSporadicServer() {
		final Arinc653DesignBuilder design = Arinc653Builder.newDesign(theProject);
		final Arinc653PlatformBuilder platform = design.hasAPlatform().called("CPU").thatRuns(
				aMIF().called("MIF1").withNoOffset().thatRuns(
						aPSS().called("PSS1")
					          .ofBCET("5ms")
					          .ofWCET("15ms")
					          .ofInitialBudget("10ms")
							  .ofPriority(10)
							  .ofBackgroundPriority(2)
				)
		).withMIFDuration("10ms");
		design.build();
		
		try {
			theProject.saveAsEcore("../../runtime-EclipseApplication/test/testPosixSporadicServer.time4sys");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		final Arinc653MIFBuilder mif1 = platform.getMIF(0);
		assertEquals(1, platform.countMIF());
		assertNotNull(mif1);
		assertEquals("MIF1", mif1.getName());
		assertNotNull(mif1.getMIFDuration());
		
		final TaskBuilder pss1 = design.task("PSS1");
		assertNotNull(pss1);
		final SoftwareSchedulableResource pss1Raw = pss1.build();
		assertEquals(1, pss1Raw.getSchedParams().size());
		final SchedulingParameter schedParam = pss1Raw.getSchedParams().get(0);
		assertTrue(schedParam instanceof PeriodicServerParameters);
		final PeriodicServerParameters pssParam = (PeriodicServerParameters)schedParam;
		assertEquals(10, pssParam.getPriority());
		assertEquals(2, pssParam.getBackgroundPriority());
		assertNotNull(pssParam.getInitialBudget());
		assertEquals("10ms", pssParam.getInitialBudget().toString());
	}

}