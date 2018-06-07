/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
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
 * @author Loïc Fejoz
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
		assertNotNull(part1.getDurationInMIF(0));
		assertEquals("10ms", part1.getDurationInMIF(0).toString());
		assertEquals("10ms", part2.getDurationInMIF(0).toString());
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
				aPartition().called("partition1").withNoOffset(),
				aPartition().called("partition2").withOffset("0ms"),
				aPartition().called("partition3").withNoOffset().ofTimeBudget("3.33ms"),
				aPartition().called("partition4").withNoOffset()
		).withMIFDuration("10ms");
		final TaskBuilder t1 = aTask().called("T1").ofPeriod("10ms").ofPriority(2);
		final Arinc653PartitionBuilder partition1 = platform.getPartition(0).runs(
				t1,
				aTask().called("T2").ofPeriod("20ms").ofPriority(1)
		).under(SchedPolicyKind.FIXED_PRIORITY);
		final Arinc653PartitionBuilder partition2 = platform.getPartition(1);
		final Arinc653PartitionBuilder partition3 = platform.getPartition(2);
		final Arinc653PartitionBuilder partition4 = platform.getPartition(3);
		platform.build();
		
		// then
		assertEquals(4, platform.countPartition());
		assertNotNull(partition1);
		assertEquals("partition1", partition1.getName());
		assertNotNull(partition1.getDurationInMIF(0));
		assertEquals("10ms", partition1.getDurationInMIF(0).toString());
		assertEquals("10ms", partition2.getDurationInMIF(0).toString());
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
		assertEquals(2, partition1.countTasks());
		assertEquals("3330us", partition3.getTimeBudget().toString());
		final SecondaryScheduler partition1Sched = partition1.getScheduler();
		assertNotNull(partition1Sched);
		assertEquals(1, partition1Sched.getVirtualProcessingUnit().size());
		assertTrue(partition1Sched.getVirtualProcessingUnit().contains(partition1.build()));
		final Stream<SchedulingParameter> tableEntries = partition1.build().getSchedParams().stream().filter(new Predicate<SchedulingParameter>() {

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
		assertTrue(Arinc653PartitionBuilder.isPartition(partition1.build()));
		
		assertEquals(1, partition1.build().getOwnedResource().stream().filter(new Predicate<Resource>() {

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
				aPartition().called("partition1").withNoOffset(),
				aPartition().called("partition2").withOffset("0ms"),
				aPartition().called("partition3").withNoOffset(),
				aPartition().called("partition4").withNoOffset()
		).withMIFDuration("10ms");
		final Arinc653PartitionBuilder partition1 = platform.getPartition(0);
		final Arinc653PartitionBuilder partition2 = platform.getPartition(1);
		final Arinc653PartitionBuilder partition3 = platform.getPartition(2);
		final Arinc653PartitionBuilder partition4 = platform.getPartition(3);
		partition1.hasAReference().called("partition1_start");
		final DesignModel designRef = design.build();
		// When building incrementally
		final ProjectBuilder theProjectInc = new ProjectBuilder();
		//final Arinc653DesignBuilder designInc = Arinc653Builder.newDesign(theProjectInc);
		final Arinc653PlatformBuilder platformInc = design.hasAPlatform().called("CPU");
		platformInc.withMIFDuration("10ms");
		final Arinc653PartitionBuilder partition1Inc = aPartition().called("partition1").withNoOffset();
		platformInc.addPartition(partition1Inc);
		final Arinc653PartitionBuilder partition2Inc = aPartition().called("partition2").withOffset("0ms");
		platformInc.addPartition(partition2Inc);
		final Arinc653PartitionBuilder partition3Inc = aPartition().called("partition3").withNoOffset();
		platformInc.addPartition(partition3Inc);
		final Arinc653PartitionBuilder partition4Inc = aPartition().called("partition4").withNoOffset();
		platformInc.addPartition(partition4Inc);
		partition1Inc.hasAReference().called("partition1_start");
		final DesignModel designFinal = design.build();
		
		// Then we have same final models
		assertEquals(4, platform.countPartition());
		assertNotNull(partition1);
		assertEquals("partition1", partition1.getName());
		assertNotNull(partition1.getDurationInMIF(0));
		assertEquals("10ms", partition1.getDurationInMIF(0).toString());
		assertEquals("10ms", partition2.getDurationInMIF(0).toString());
		assertEquals("40ms", platform.getMAFDuration().toString());
		
		assertEquals(platform.countPartition(), platformInc.countPartition());
		assertNotNull(partition1Inc);
		assertEquals(partition1.getName(), partition1Inc.getName());
		assertNotNull(partition1Inc.getDurationInMIF(0));
		assertEquals(partition1.getDurationInMIF(0), partition1Inc.getDurationInMIF(0));
		assertEquals(partition2.getDurationInMIF(0), partition2Inc.getDurationInMIF(0));
		assertEquals(platform.getMAFDuration(), platformInc.getMAFDuration());
		assertEquals(designRef, designFinal);
		
		assertEquals("partition1_start", partition1Inc.hasAReference().getName());
		
		// Check structural equality
		assertTrue(new EcoreUtil.EqualityHelper().equals(designRef, designFinal));
	}
}
