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

import org.eclipse.emf.common.util.EList;
import org.junit.Test;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.model.time4sys.Transformation;
import org.polarsys.time4sys.transformations.IdentityDerivation;

/**
 * @author loic
 *
 */
public class IdentityDerivationTest extends AbstractDerivationTest {

	/**
	 * Test method for {@link org.polarsys.time4sys.transformations.IdentityDerivation#duplicate(org.polarsys.time4sys.model.time4sys.Project, org.polarsys.time4sys.design.DesignModel)}.
	 */
	@Test
	public void testDuplicateEmptyProject() {
		final Transformation transfo = IdentityDerivation.duplicate(project, original);
		final Mapping mapping = transfo.getMapping();
		assertNotNull(mapping);
		assertTrue(project.getTransformations().contains(transfo));
		assertFalse(mapping.getSources().isEmpty());
		assertFalse(mapping.getTargets().isEmpty());
		assertArtefactEquals(res, mapping.getSources().get(0));
		assertArtefactEquals(res, mapping.getTargets().get(0));
		/* There are actually 2 links: one for the resource, one for the project
		 * The first link is the mapping itself, the second a sublink, and two sub-sublinks for the workload behavior and resource package.
		 */
		final EList<Link> subLinks = mapping.getSubLinks();
		assertEquals(1, subLinks.size());
		// The design model has been copied.
		final DesignModel copy = (DesignModel) subLinks.get(0).getTargets().get(0).getValue();
		assertEqualsCopy(original, copy);
	}
	
	/**
	 * Test method for {@link org.polarsys.time4sys.transformations.IdentityDerivation#duplicate(org.polarsys.time4sys.model.time4sys.Project, org.polarsys.time4sys.design.DesignModel)}.
	 */
	@Test
	public void testDuplicateAUniTaskProject() {
		DesignBuilder design = new DesignBuilder(original);
		design.hasAProcessor().called("mainproc").thatRuns(
				aTask().called("T1").ofPeriod("10ms").ofWCET("3ms").ofBCET("1ms")
			).under(SchedPolicyKind.FIXED_PRIORITY);
		final Transformation transfo = IdentityDerivation.duplicate(project, original);
		final Mapping mapping = transfo.getMapping();
		assertNotNull(mapping);
		
		/*try {
			new ProjectBuilder(project).saveAsEcore("../../runtime-EclipseApplication/test/test-trans-identity.time4sys");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		assertTrue(project.getTransformations().contains(transfo));
		assertFalse(mapping.getSources().isEmpty());
		assertFalse(mapping.getTargets().isEmpty());
		assertArtefactEquals(res, mapping.getSources().get(0));
		assertArtefactEquals(res, mapping.getTargets().get(0));
		final EList<Link> subLinks = mapping.getSubLinks();
		assertFalse(subLinks.isEmpty());
		// The design model has been copied.
		final DesignModel copy = (DesignModel) subLinks.get(0).getTargets().get(0).getValue();
		assertEqualsCopy(original, copy);
	}

}
