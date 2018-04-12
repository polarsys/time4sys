/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.transformations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.polarsys.time4sys.builder.design.TaskBuilder.aTask;
import static org.polarsys.time4sys.builder.design.posix.PosixSporadicServerBuilder.aPSS;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.builder.design.TaskBuilder;
import org.polarsys.time4sys.builder.design.posix.PosixSporadicServerBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.marte.grm.FixedPriorityParameters;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.model.time4sys.Transformation;

/**
 * @author loic
 *
 */
public class PriorityUrgencyInverterTest {

	private ProjectBuilder theProject;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		theProject = new ProjectBuilder();
	}

	@Test
	public void testOneTask() {
		DesignBuilder design = theProject.design();
		design.hasAProcessor().called("mainproc").thatRuns(
				aTask().called("T1").ofPeriod("10ms").ofWCET("3ms").ofBCET("1ms").ofPriority(1)
			).under(SchedPolicyKind.FIXED_PRIORITY);
		final Transformation transfo = PriorityUrgencyInverter.transform(theProject.build(), design.build());
		final Mapping mapping = transfo.getMapping();
		assertNotNull(mapping);
		assertNotNull(transfo.getName());
		final EList<Link> subLinks = mapping.getSubLinks();
		assertFalse(subLinks.isEmpty());
		// The design model has been copied.
		final DesignModel copy = (DesignModel) subLinks.get(0).getTargets().get(0).getValue();
		final DesignBuilder targetDesign = new DesignBuilder(copy);
		final TaskBuilder t1Task = targetDesign.task("T1");
		assertNotNull(t1Task);
		assertEquals(0, t1Task.getPriority());
		// Links for the FixedPriorityParameters is not identity rule but priority rule
		final EList<Link> links = mapping.getLinksForSlice(t1Task.build().getSchedParams().get(0));
		assertEquals(1, links.size());
		for(Link lnk: links) {
			System.out.println(lnk.getRationale().getName());
			assertTrue(lnk.getRationale().getName().toLowerCase().contains("priority"));
		}
		assertTrue(mapping.getRationale().getName().toLowerCase().contains("priority"));
	}
	
	@Test
	public void testTwoTasks() {
		// Given a two tasks model
		DesignBuilder design = theProject.design();
		design.hasAProcessor().called("mainproc").thatRuns(
				aTask().called("T1").ofPeriod("10ms").ofWCET("3ms").ofBCET("1ms").ofPriority(1),
				aTask().called("T2").ofPeriod("10ms").ofWCET("3ms").ofBCET("1ms").ofPriority(2)
			).under(SchedPolicyKind.FIXED_PRIORITY);
		// When inverting priority and urgency
		final Transformation transfo = PriorityUrgencyInverter.transform(theProject.build(), design.build());
		
		// Then
		final Mapping mapping = transfo.getMapping();
		assertNotNull(mapping);
		
		
		final EList<Link> subLinks = mapping.getSubLinks();
		assertFalse(subLinks.isEmpty());
		// The design model has been copied.
		final DesignModel copy = (DesignModel) subLinks.get(0).getTargets().get(0).getValue();
		final DesignBuilder targetDesign = new DesignBuilder(copy);
		final TaskBuilder t1Task = targetDesign.task("T1");
		assertNotNull(t1Task);
		// Task with lower priority value become the one with maximum urgency 
		assertEquals(1, t1Task.getPriority());
		final TaskBuilder t2Task = targetDesign.task("T2");
		assertNotNull(t2Task);
		assertEquals(0, t2Task.getPriority());
	}

	@Test
	public void testTwoPSSTasks() {
		// Given a two tasks model
		DesignBuilder design = theProject.design();
		design.hasAProcessor().called("mainproc").thatRuns(
				aPSS().called("T1").ofPeriod("10ms").ofWCET("3ms").ofBCET("1ms").ofPriority(1).ofBackgroundPriority(5),
				aPSS().called("T2").ofPeriod("10ms").ofWCET("3ms").ofBCET("1ms").ofPriority(2).ofBackgroundPriority(6)
			).under(SchedPolicyKind.FIXED_PRIORITY);
		// When inverting priority and urgency
		final Transformation transfo = PriorityUrgencyInverter.transform(theProject.build(), design.build());
		
		// Then
		final Mapping mapping = transfo.getMapping();
		assertNotNull(mapping);
		
		
		final EList<Link> subLinks = mapping.getSubLinks();
		assertFalse(subLinks.isEmpty());
		// The design model has been copied.
		final DesignModel copy = (DesignModel) subLinks.get(0).getTargets().get(0).getValue();
		final DesignBuilder targetDesign = new DesignBuilder(copy);
		final PosixSporadicServerBuilder t1Task = PosixSporadicServerBuilder.as(targetDesign.task("T1"));
		assertNotNull(t1Task);
		// Task with lower priority value become the one with maximum urgency 
		assertEquals(5, t1Task.getPriority());
		assertEquals(1, t1Task.getBackgroundPriority());
		final PosixSporadicServerBuilder t2Task = PosixSporadicServerBuilder.as(targetDesign.task("T2"));
		assertNotNull(t2Task);
		assertEquals(4, t2Task.getPriority());
		assertEquals(0, t2Task.getBackgroundPriority());
	}
	
	@Test
	public void testTwoPSSTasksAndOrderFrom1to2() {
		// Given a two tasks model
		DesignBuilder design = theProject.design();
		design.hasAProcessor().called("mainproc").thatRuns(
				aPSS()
					.called("T1").ofPeriod("10ms").ofWCET("3ms").ofBCET("1ms")
					.ofPriority(1).ofBackgroundPriority(5).withOrder(1),
				aPSS()
					.called("T2").ofPeriod("10ms").ofWCET("3ms").ofBCET("1ms")
					.ofPriority(2).ofBackgroundPriority(5).withOrder(2)
			).under(SchedPolicyKind.FIXED_PRIORITY);
		// When inverting priority and urgency
		final Transformation transfo = PriorityUrgencyInverter.transform(theProject.build(), design.build());
		
		// Then
		final Mapping mapping = transfo.getMapping();
		assertNotNull(mapping);
		
		
		final EList<Link> subLinks = mapping.getSubLinks();
		assertFalse(subLinks.isEmpty());
		// The design model has been copied.
		final DesignModel copy = (DesignModel) subLinks.get(0).getTargets().get(0).getValue();
		final DesignBuilder targetDesign = new DesignBuilder(copy);
		final PosixSporadicServerBuilder t1Task = PosixSporadicServerBuilder.as(targetDesign.task("T1"));
		assertNotNull(t1Task);
		// Task with lower priority value become the one with maximum urgency 
		assertEquals(5, t1Task.getPriority());
		assertEquals(1, t1Task.getBackgroundPriority());
		final PosixSporadicServerBuilder t2Task = PosixSporadicServerBuilder.as(targetDesign.task("T2"));
		assertNotNull(t2Task);
		assertEquals(4, t2Task.getPriority());
		assertEquals(0, t2Task.getBackgroundPriority());
	}
	
	@Test
	public void testTwoPSSTasksAndOrderFrom0to1() {
		// Given a two tasks model
		DesignBuilder design = theProject.design();
		design.hasAProcessor().called("mainproc").thatRuns(
				aPSS()
					.called("T1").ofPeriod("10ms").ofWCET("3ms").ofBCET("1ms")
					.ofPriority(1).ofBackgroundPriority(5).withOrder(0),
				aPSS()
					.called("T2").ofPeriod("10ms").ofWCET("3ms").ofBCET("1ms")
					.ofPriority(2).ofBackgroundPriority(5).withOrder(1)
			).under(SchedPolicyKind.FIXED_PRIORITY);
		// When inverting priority and urgency
		final Transformation transfo = PriorityUrgencyInverter.transform(theProject.build(), design.build());
		
		// Then
		final Mapping mapping = transfo.getMapping();
		assertNotNull(mapping);
		
		
		final EList<Link> subLinks = mapping.getSubLinks();
		assertFalse(subLinks.isEmpty());
		// The design model has been copied.
		final DesignModel copy = (DesignModel) subLinks.get(0).getTargets().get(0).getValue();
		final DesignBuilder targetDesign = new DesignBuilder(copy);
		final PosixSporadicServerBuilder t1Task = PosixSporadicServerBuilder.as(targetDesign.task("T1"));
		assertNotNull(t1Task);
		// Task with lower priority value become the one with maximum urgency 
		assertEquals(5, t1Task.getPriority());
		assertEquals(1, t1Task.getBackgroundPriority());
		final PosixSporadicServerBuilder t2Task = PosixSporadicServerBuilder.as(targetDesign.task("T2"));
		assertNotNull(t2Task);
		assertEquals(4, t2Task.getPriority());
		assertEquals(0, t2Task.getBackgroundPriority());
		// Annotation has been removed
		assertFalse(t1Task.hasAnnotation(PosixSporadicServerBuilder.POSIX_URL));
		assertFalse(t2Task.hasAnnotation(PosixSporadicServerBuilder.POSIX_URL));
	}
}
