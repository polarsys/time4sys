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
import static org.junit.Assert.fail;
import static org.polarsys.time4sys.builder.design.TaskBuilder.aTask;
import static org.polarsys.time4sys.builder.design.arinc653.Arinc653PartitionBuilder.aPartition;

import java.io.IOException;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
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
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;

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
				aPartition().called("part_2"),
				aPartition().called("part_3"),
				aPartition().called("part_4")
		).withMIFDuration("40ms");
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
		
		EList<TimeInterval> activationsOf1 = part1.getOrCreateTableEntry().getActivation();
		assertEquals("0ms", activationsOf1.get(0).getMin().toString());
		assertEquals("10ms", activationsOf1.get(0).getMax().toString());
		assertEquals(1, activationsOf1.size());
		final EList<TimeInterval> activationsOf2 = part2.getOrCreateTableEntry().getActivation();
		assertEquals("10ms", activationsOf2.get(0).getMin().toString());
		assertEquals("20ms", activationsOf2.get(0).getMax().toString());
		assertEquals(1, activationsOf2.size());
		final EList<TimeInterval> activationsOf3 = part3.getOrCreateTableEntry().getActivation();
		assertEquals("20ms", activationsOf3.get(0).getMin().toString());
		assertEquals("30ms", activationsOf3.get(0).getMax().toString());
		assertEquals(1, activationsOf3.size());
		final EList<TimeInterval> activationsOf4 = part4.getOrCreateTableEntry().getActivation();
		assertEquals("30ms", activationsOf4.get(0).getMin().toString());
		assertEquals("40ms", activationsOf4.get(0).getMax().toString());
		assertEquals(1, activationsOf4.size());
		
		try {
			TimeInterval e = NfpFactory.eINSTANCE.createTimeIntervalFromString("[5ms,10ms]");
			activationsOf1.add(e);
			fail("activations is derived and shall not be modifiable.");
		} catch (Exception err) {
			// Pass
		}
		
		assertEquals("[0ms,10ms[", activationsOf1.get(0).toString());
		
		part1.getOrCreateTableEntry().getOffset().add(NfpFactory.eINSTANCE.createDurationFromString("40ms"));
		part1.getOrCreateTableEntry().getTimeSlot().add(NfpFactory.eINSTANCE.createDurationFromString("20ms"));
		
		activationsOf1 = part1.getOrCreateTableEntry().getActivation();
		assertEquals(2, activationsOf1.size());
		assertEquals("[0ms,10ms[", activationsOf1.get(0).toString());
		assertEquals("[40ms,60ms[", activationsOf1.get(1).toString());
		
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
		).withMIFDuration("40ms");
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
				aPartition().called("partition1"),
				aPartition().called("partition2"),
				aPartition().called("partition3"),
				aPartition().called("partition4")
		).withMIFDuration("40ms");
		final Arinc653PartitionBuilder partition1 = platform.getPartition(0);
		final Arinc653PartitionBuilder partition2 = platform.getPartition(1);
		final Arinc653PartitionBuilder partition3 = platform.getPartition(2);
		final Arinc653PartitionBuilder partition4 = platform.getPartition(3);
		partition1.hasAReference().called("partition1_start");
		final DesignModel designRef = design.build();
		// When building incrementally
		final ProjectBuilder theProjectInc = new ProjectBuilder();
		final Arinc653DesignBuilder designInc = Arinc653Builder.newDesign(theProjectInc);
		final Arinc653PlatformBuilder platformInc = design.hasAPlatform().called("CPU");
		platformInc.withMIFDuration("40ms");
		final Arinc653PartitionBuilder partition1Inc = aPartition().called("partition1");
		platformInc.addPartition(partition1Inc);
		final Arinc653PartitionBuilder partition2Inc = aPartition().called("partition2");
		platformInc.addPartition(partition2Inc);
		final Arinc653PartitionBuilder partition3Inc = aPartition().called("partition3");
		platformInc.addPartition(partition3Inc);
		final Arinc653PartitionBuilder partition4Inc = aPartition().called("partition4");
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
		assertEquals("40ms", platform.getMIFDuration().toString());
		assertEquals(designRef, designFinal);
		
		assertEquals("partition1_start", partition1Inc.hasAReference().getName());
		
		// Check structural equality
		assertTrue(new EcoreUtil.EqualityHelper().equals(designRef, designFinal));
	}
	
	
	/**
	 * Test methods from {@link org.polarsys.time4sys.builder.design.arinc653)}.
	 */
	@Test
	public void testArinc653BuilderWithTwoMIFsOfSameSize() {
		final Arinc653DesignBuilder design = Arinc653Builder.newDesign(theProject);
		final Arinc653PlatformBuilder platform = design.hasAPlatform().called("CPU").thatRuns(
				aPartition().called("part_1").withNoOffset().withMIFDuration("45ms").withOffset("60ms").withMIFDuration("10ms"),
				aPartition().called("part_2").withOffset("45ms").withMIFDuration("15ms").withOffset("70ms").withMIFDuration("50ms")
		);
		design.build();
		final Arinc653PartitionBuilder part1 = platform.getPartition(0);
		final Arinc653PartitionBuilder part2 = platform.getPartition(1);
		
		assertEquals(2, platform.countPartition());
		assertNotNull(part1);
		
		final TableEntryType tableEntry1 = part1.getOrCreateTableEntry();
		final EList<TimeInterval> activationsOf1 = tableEntry1.getActivation();
		assertEquals(2, activationsOf1.size());
		assertEquals("[0ms,45ms[", activationsOf1.get(0).toString());
		assertEquals("[60ms,70ms[", activationsOf1.get(1).toString());
		
		final EList<TimeInterval> activationsOf2 = part2.getOrCreateTableEntry().getActivation();
		assertEquals(2, activationsOf2.size());
		assertEquals("[45ms,60ms[", activationsOf2.get(0).toString());
		assertEquals("[70ms,120ms[", activationsOf2.get(1).toString());
		
		assertEquals("60ms", platform.getMIFDuration().toString());
		assertEquals("120ms", platform.getMAFDuration().toString());
	}
}
