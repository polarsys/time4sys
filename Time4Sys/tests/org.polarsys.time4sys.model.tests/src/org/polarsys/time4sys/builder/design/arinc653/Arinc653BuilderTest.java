/**
 * 
 */
package org.polarsys.time4sys.builder.design.arinc653;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.polarsys.time4sys.builder.design.TaskBuilder.aTask;
import static org.polarsys.time4sys.builder.design.arinc653.Arinc653PartitionBuilder.aPartition;

import java.io.IOException;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.builder.design.TaskBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.grm.FixedPriorityParameters;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.grm.Scheduler;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.grm.SecondaryScheduler;
import org.polarsys.time4sys.marte.grm.TableEntryType;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;

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
	 * Test methods from {@link org.polarsys.time4sys.builder.design.arinc653)}.
	 */
	@Test
	public void testArinc653Builder() {
		final Arinc653DesignBuilder design = Arinc653Builder.newDesign(theProject);
		final Arinc653PlatformBuilder platform = design.hasAPlatform().called("CPU").thatRuns(
				aPartition().called("part_1").withNoOffset(),
				aPartition().called("part_2").withOffset("0ms"),
				aPartition().called("part_3").withNoOffset(),
				aPartition().called("part_4").withNoOffset()
		).withMIFDuration("10ms");
		final Arinc653PartitionBuilder part1 = platform.getPartition(0);
		final Arinc653PartitionBuilder part2 = platform.getPartition(1);
		final Arinc653PartitionBuilder part3 = platform.getPartition(2);
		final Arinc653PartitionBuilder part4 = platform.getPartition(3);
		design.build();
		
		assertEquals(4, platform.countPartition());
		assertNotNull(part1);
		assertEquals("part_1", part1.getName());
		assertNotNull(part1.getMIFDuration());
		assertEquals("10ms", part1.getMIFDuration().toString());
		assertEquals("10ms", part2.getMIFDuration().toString());
		assertEquals("40ms", platform.getMAFDuration().toString());
		assertTrue(Arinc653PartitionBuilder.hasASecondaryScheduler(part1.build()));
	}

	/**
	 * Test methods from {@link org.polarsys.time4sys.builder.design.arinc653)}.
	 */
	@Test
	public void testArinc653BuilderWithTasks() {
		// When
		final Arinc653DesignBuilder design = Arinc653Builder.newDesign(theProject);
		final Arinc653PlatformBuilder platform = design.hasAPlatform().called("CPU").thatRuns(
				aPartition().called("MIF1").withNoOffset(),
				aPartition().called("MIF2").withOffset("0ms"),
				aPartition().called("MIF3").withNoOffset().ofTimeBudget("3.33ms"),
				aPartition().called("MIF4").withNoOffset()
		).withMIFDuration("10ms");
		final TaskBuilder t1 = aTask().called("T1").ofPeriod("10ms").ofPriority(2);
		final Arinc653PartitionBuilder mif1 = platform.getPartition(0).runs(
				t1,
				aTask().called("T2").ofPeriod("20ms").ofPriority(1)
		).under(SchedPolicyKind.FIXED_PRIORITY);
		final Arinc653PartitionBuilder mif2 = platform.getPartition(1);
		final Arinc653PartitionBuilder mif3 = platform.getPartition(2);
		final Arinc653PartitionBuilder mif4 = platform.getPartition(3);
		platform.build();
		
		// then
		assertEquals(4, platform.countPartition());
		assertNotNull(mif1);
		assertEquals("MIF1", mif1.getName());
		assertNotNull(mif1.getMIFDuration());
		assertEquals("10ms", mif1.getMIFDuration().toString());
		assertEquals("10ms", mif2.getMIFDuration().toString());
		assertEquals("40ms", platform.getMAFDuration().toString());
		final HardwareProcessor hw = platform.build();
		assertNotNull(hw);
		final Scheduler sched = hw.getMainScheduler();
		assertNotNull(sched);
		assertNotNull(sched.getName());
		assertNotNull(sched.getHost());
		assertEquals(1, sched.getProcessingUnits().size());
		assertTrue(sched.getProcessingUnits().contains(hw));
		assertEquals(4, sched.getSchedulableResource().size());
		assertEquals(2, mif1.countTasks());
		assertEquals("3330us", mif3.getTimeBudget().toString());
		final SecondaryScheduler mif1Sched = mif1.getScheduler();
		assertNotNull(mif1Sched);
		assertEquals(1, mif1Sched.getVirtualProcessingUnit().size());
		assertTrue(mif1Sched.getVirtualProcessingUnit().contains(mif1.build()));
		final Stream<SchedulingParameter> tableEntries = mif1.build().getSchedParams().stream().filter(new Predicate<SchedulingParameter>() {

			@Override
			public boolean test(SchedulingParameter v) {
				return v instanceof TableEntryType;
			}
			
		});
		assertEquals(1, tableEntries.count());
		final Stream<SchedulingParameter> t1FPParam = t1.build().getSchedParams().stream().filter(new Predicate<SchedulingParameter>() {

			@Override
			public boolean test(SchedulingParameter v) {
				return v instanceof FixedPriorityParameters;
			}
			
		});
		assertEquals(1, t1FPParam.count());
		
		try {
			theProject.saveAsEcore("../../runtime-EclipseApplication/test/testArinc653BuilderWithTasks.time4sys");
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertTrue(Arinc653PartitionBuilder.isPartition(mif1.build()));
		
		assertEquals(1, mif1.build().getOwnedResource().stream().filter(new Predicate<Resource>() {

			@Override
			public boolean test(Resource arg) {
				return arg instanceof SecondaryScheduler;
			}
			
		}).count());
	}
	
	@Test
	public void testArinc653BuilderIncremental() {
		// Given a referecne model
		final Arinc653DesignBuilder design = Arinc653Builder.newDesign(theProject);
		final Arinc653PlatformBuilder platform = design.hasAPlatform().called("CPU").thatRuns(
				aPartition().called("MIF1").withNoOffset(),
				aPartition().called("MIF2").withOffset("0ms"),
				aPartition().called("MIF3").withNoOffset(),
				aPartition().called("MIF4").withNoOffset()
		).withMIFDuration("10ms");
		final Arinc653PartitionBuilder mif1 = platform.getPartition(0);
		final Arinc653PartitionBuilder mif2 = platform.getPartition(1);
		final Arinc653PartitionBuilder mif3 = platform.getPartition(2);
		final Arinc653PartitionBuilder mif4 = platform.getPartition(3);
		mif1.hasAReference().called("mif1_start");
		final DesignModel designRef = design.build();
		// When building incrementally
		final ProjectBuilder theProjectInc = new ProjectBuilder();
		//final Arinc653DesignBuilder designInc = Arinc653Builder.newDesign(theProjectInc);
		final Arinc653PlatformBuilder platformInc = design.hasAPlatform().called("CPU");
		platformInc.withMIFDuration("10ms");
		final Arinc653PartitionBuilder mif1Inc = aPartition().called("MIF1").withNoOffset();
		platformInc.addPartition(mif1Inc);
		final Arinc653PartitionBuilder mif2Inc = aPartition().called("MIF2").withOffset("0ms");
		platformInc.addPartition(mif2Inc);
		final Arinc653PartitionBuilder mif3Inc = aPartition().called("MIF3").withNoOffset();
		platformInc.addPartition(mif3Inc);
		final Arinc653PartitionBuilder mif4Inc = aPartition().called("MIF4").withNoOffset();
		platformInc.addPartition(mif4Inc);
		mif1Inc.hasAReference().called("mif1_start");
		final DesignModel designFinal = design.build();
		
		// Then we have same final models
		assertEquals(4, platform.countPartition());
		assertNotNull(mif1);
		assertEquals("MIF1", mif1.getName());
		assertNotNull(mif1.getMIFDuration());
		assertEquals("10ms", mif1.getMIFDuration().toString());
		assertEquals("10ms", mif2.getMIFDuration().toString());
		assertEquals("40ms", platform.getMAFDuration().toString());
		
		assertEquals(platform.countPartition(), platformInc.countPartition());
		assertNotNull(mif1Inc);
		assertEquals(mif1.getName(), mif1Inc.getName());
		assertNotNull(mif1Inc.getMIFDuration());
		assertEquals(mif1.getMIFDuration(), mif1Inc.getMIFDuration());
		assertEquals(mif2.getMIFDuration(), mif2Inc.getMIFDuration());
		assertEquals(platform.getMAFDuration(), platformInc.getMAFDuration());
		assertEquals(designRef, designFinal);
		
		assertEquals("mif1_start", mif1Inc.hasAReference().getName());
		
		// Check structural equality
		assertTrue(new EcoreUtil.EqualityHelper().equals(designRef, designFinal));
	}
}
