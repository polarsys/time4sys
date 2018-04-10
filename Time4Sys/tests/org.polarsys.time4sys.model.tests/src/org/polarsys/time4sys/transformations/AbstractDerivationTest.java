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
package org.polarsys.time4sys.transformations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Before;
import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.MappableArtefact;
import org.polarsys.time4sys.mapping.ResourceArtefact;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Time4sysFactory;

/**
 * @author loic
 *
 */
public abstract class AbstractDerivationTest {
	
	public static void assertIsLessOrEquals(final Duration r_i, final Duration r_j) {
		assertIsLessOrEquals("", r_i, r_j);
	}
	

	public static void assertIsLessOrEquals(final String prefix, final Duration r_i, final Duration r_j) {
		assertNotNull(r_i);
		assertNotNull(r_j);
		final int rComparison = r_i.compareTo(r_j);
		assertTrue(prefix + r_i.toString() + " shall be less or equals than " + r_j.toString(), rComparison == 0 || rComparison == -1);

	}
	
	public static void removeEndToEndFlows(DesignModel design) {
		final List<EndToEndFlow> listCopy = new LinkedList<>(design.getEndToEndFlows());
		for(EndToEndFlow flow: listCopy) {
			EcoreUtil.delete(flow);
		}
		design.getEndToEndFlows().clear();
	}
	
	protected static void assertArtefactEquals(final ResourceImpl expected, final MappableArtefact actualArtefact) {
		assert(expected != null);
		assertTrue(actualArtefact instanceof ResourceArtefact);
		ResourceArtefact artefact = (ResourceArtefact)actualArtefact;
		final Resource actualResource = artefact.getResource();
		//assertNotNull(actualResource);
		/*if (expected.getURI() == null) {
			assertNull(actualResource);
		}*/
		//assertEquals(expected.getURI(), actualResource.getURI());
		assertEquals(expected, actualResource);
	}
	

	protected static void assertEqualsCopy(final DesignModel expected, final DesignModel actual) {
		assertEquals(expected.getName(), actual.getName());
		assertEquals(expected.getEndToEndFlows().size(), actual.getEndToEndFlows().size()); 
	}

	
	protected static void assertAllArrivalPatternArePeriodic(final DesignModel copy) {
		for(WorkloadEvent evt: copy.getWorkloadBehavior().getDemand()) {
			assertTrue(evt.getPattern() instanceof PeriodicPattern);
		}
	}
	
	protected Project project;
	protected DesignModel original;
	protected ResourceImpl res;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		res = new ResourceImpl();
		project = Time4sysFactory.eINSTANCE.createProject();
		original = DesignFactory.eINSTANCE.createDesignModel();
		project.setDesign(original);
		res.getContents().add(project);
	}


}
