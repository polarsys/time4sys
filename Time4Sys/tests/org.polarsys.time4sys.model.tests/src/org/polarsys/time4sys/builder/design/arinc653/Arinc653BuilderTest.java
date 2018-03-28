/**
 * 
 */
package org.polarsys.time4sys.builder.design.arinc653;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.polarsys.time4sys.builder.design.arinc653.Arinc653MIFBuilder.aMIF;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.builder.ProjectBuilder;

/**
 * @author Utilisateur
 *
 */
public class Arinc653BuilderTest {

	protected ProjectBuilder theProject;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		theProject = new ProjectBuilder();
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.builder.design.arinc653.Arinc653Builder#Arinc653Builder()}.
	 */
	@Test
	public void testArinc653Builder() {
		final Arinc653DesignBuilder design = Arinc653Builder.newDesign(theProject);
		final Arinc653PlatformBuilder platform = design.hasAPlatform().called("CPU").thatRuns(
				aMIF().called("MIF1").withNoOffset(),
				aMIF().called("MIF2").withOffset("0ms"),
				aMIF().called("MIF3").withNoOffset(),
				aMIF().called("MIF4").withNoOffset()
		).withMIFDuration("10ms");
		final Arinc653MIFBuilder mif1 = platform.getMIF(0);
		final Arinc653MIFBuilder mif2 = platform.getMIF(1);
		final Arinc653MIFBuilder mif3 = platform.getMIF(2);
		final Arinc653MIFBuilder mif4 = platform.getMIF(3);
		design.build();
		
		assertEquals(4, platform.countMIF());
		assertNotNull(mif1);
		assertEquals("MIF1", mif1.getName());
		assertNotNull(mif1.getMIFDuration());
		assertEquals("10ms", mif1.getMIFDuration().toString());
		assertEquals("10ms", mif2.getMIFDuration().toString());
		assertEquals("40ms", platform.getMAFDuration().toString());
	}

}
