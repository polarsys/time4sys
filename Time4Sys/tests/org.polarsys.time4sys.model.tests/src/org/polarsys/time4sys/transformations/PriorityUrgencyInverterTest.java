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
import static org.polarsys.time4sys.builder.design.TaskBuilder.aTask;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.builder.design.TaskBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.Mapping;
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
		
		final EList<Link> subLinks = mapping.getSubLinks();
		assertFalse(subLinks.isEmpty());
		// The design model has been copied.
		final DesignModel copy = (DesignModel) subLinks.get(0).getTargets().get(0).getValue();
		final DesignBuilder targetDesign = new DesignBuilder(copy);
		final TaskBuilder t1Task = targetDesign.task("T1");
		assertNotNull(t1Task);
		assertEquals(1, t1Task.getPriority());
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
		assertEquals(2, t1Task.getPriority());
		final TaskBuilder t2Task = targetDesign.task("T2");
		assertNotNull(t2Task);
		assertEquals(1, t2Task.getPriority());
	}

}
