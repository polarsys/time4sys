/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 * 
 */
package org.polarsys.time4sys.model.transformations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.polarsys.time4sys.builder.design.TaskBuilder.aTask;

import java.io.IOException;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;
import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Context;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.SlidingWindowPattern;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.transformations.IdentityDerivation;
import org.polarsys.time4sys.transformations.ToPeriodicDerivation;

/**
 * @author loic
 *
 */
public class ToPeriodicDerivationTest extends AbstractDerivationTest {

	/**
	 * Test method for {@link org.polarsys.time4sys.transformations.IdentityDerivation#duplicate(org.polarsys.time4sys.model.time4sys.Project, org.polarsys.time4sys.design.DesignModel)}.
	 */
	@Test
	public void testDuplicateAUniTaskProjectWithoutChange() {
		DesignBuilder design = new DesignBuilder(original);
		design.hasAProcessor().called("mainproc").thatRuns(
				aTask().called("T1").ofPeriod("10ms").ofWCET("3ms").ofBCET("1ms")
			).under(SchedPolicyKind.FIXED_PRIORITY);
		final Mapping mapping = ToPeriodicDerivation.duplicate(project, original).getMapping();
		assertNotNull(mapping);
		
		/*try {
			new ProjectBuilder(project).saveAsEcore("../../runtime-EclipseApplication/test/test-trans-identity.time4sys");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		assertTrue(project.getMappings().contains(mapping));
		assertFalse(mapping.getSources().isEmpty());
		assertFalse(mapping.getTargets().isEmpty());
		assertArtefactEquals(res, mapping.getSources().get(0));
		assertArtefactEquals(res, mapping.getTargets().get(0));
		final EList<Link> subLinks = mapping.getSubLinks();
		assertFalse(subLinks.isEmpty());
		// The design model has been copied.
		final DesignModel copy = (DesignModel) subLinks.get(0).getTargets().get(0).getValue();
		assertEqualsCopy(original, copy);
		// Moreover the copy is in the project's list.
		assertTrue(project.getDerivations().contains(copy));
		assertAllArrivalPatternArePeriodic(copy);
		
		final Context rationale = mapping.getRationale();
		assertNotNull(rationale);
		assertEquals(ToPeriodicDerivation.TRANS_NAME, rationale.getName());
		final Stack<Link> links = new Stack<Link>();
		links.addAll(mapping.getSubLinks());
		while(!links.isEmpty()) {
			final Link lnk = links.pop();
			links.addAll(lnk.getSubLinks());
			final Context rule = lnk.getRationale();
			assertNotNull(rule);
			assertEquals(IdentityDerivation.IDENTITY_RULE_NAME, rule.getName());
		}
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.transformations.IdentityDerivation#duplicate(org.polarsys.time4sys.model.time4sys.Project, org.polarsys.time4sys.design.DesignModel)}.
	 */
	@Test
	public void testDuplicateAUniTaskProjectWithChange() {
		DesignBuilder design = new DesignBuilder(original);
		design.hasAProcessor().called("mainproc").thatRuns(
				aTask().called("T1").withSlidingWindow(2, "10ms").ofWCET("3ms").ofBCET("1ms")
			).under(SchedPolicyKind.FIXED_PRIORITY);
		final Mapping mapping = ToPeriodicDerivation.duplicate(project, original).getMapping();
		assertNotNull(mapping);
		
		try {
			new ProjectBuilder(project).saveAsEcore("../../runtime-EclipseApplication/test/test-trans-to-periodic.time4sys");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertTrue(project.getMappings().contains(mapping));
		assertFalse(mapping.getSources().isEmpty());
		assertFalse(mapping.getTargets().isEmpty());
		assertArtefactEquals(res, mapping.getSources().get(0));
		assertArtefactEquals(res, mapping.getTargets().get(0));
		final EList<Link> subLinks = mapping.getSubLinks();
		assertFalse(subLinks.isEmpty());
		// The design model has been copied.
		final DesignModel copy = (DesignModel) subLinks.get(0).getTargets().get(0).getValue();
		assertEqualsCopy(original, copy);
		// Moreover the copy is in the project's list.
		assertTrue(project.getDerivations().contains(copy));
		assertAllArrivalPatternArePeriodic(copy);
		
		final Context rationale = mapping.getRationale();
		assertNotNull(rationale);
		assertEquals(ToPeriodicDerivation.TRANS_NAME, rationale.getName());
		
		final Stack<Link> links = new Stack<Link>();
		links.addAll(mapping.getSubLinks());
		while(!links.isEmpty()) {
			final Link lnk = links.pop();
			links.addAll(lnk.getSubLinks());
			final Context rule = lnk.getRationale();
			assertNotNull(rule);
			final String ruleName = rule.getName();
			if (ToPeriodicDerivation.STEP_RULE_NAME.equals(ruleName)) {
				final Step original = (Step)lnk.getUniqueSourceValue("original");
				final SlidingWindowPattern originalPattern = (SlidingWindowPattern)lnk.getUniqueSourceValue("pattern");
				final Step modifiedStep = (Step)lnk.getUniqueTargetValue("modified");
				assertEquals(original.getWorstCET().multiply(originalPattern.getNbEvents()), modifiedStep.getWorstCET());
			} else if (ToPeriodicDerivation.PATTERN_RULE_NAME.equals(ruleName)) {
				//final Step original = (Step)lnk.getUniqueSourceValue("step");
				final SlidingWindowPattern originalPattern = (SlidingWindowPattern)lnk.getUniqueSourceValue("original");
				final PeriodicPattern modifiedPattern = (PeriodicPattern)lnk.getUniqueTargetValue("modified");
				assertEquals(originalPattern.getWindowSize(), modifiedPattern.getPeriod());
			}
		}
	}

}
