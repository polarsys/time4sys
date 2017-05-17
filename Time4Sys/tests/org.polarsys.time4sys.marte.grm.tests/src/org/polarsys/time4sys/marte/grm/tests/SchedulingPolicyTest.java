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
 */
package org.polarsys.time4sys.marte.grm.tests;

import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.grm.SchedulingPolicy;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scheduling Policy</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class SchedulingPolicyTest extends TestCase {
	public void testToStringForEnumeratedPolicy() {
		final SchedulingPolicy fifo = GrmFactory.eINSTANCE.createSchedulingPolicy(SchedPolicyKind.FIFO);
		assertEquals("FIFO", fifo.getName());
		assertTrue(fifo.toString().contains("FIFO"));
	}
	
	public void testDefaultPolicyConfigurationIsUndef() {
		final SchedulingPolicy s = GrmFactory.eINSTANCE.createSchedulingPolicy();
		assertEquals(SchedPolicyKind.UNDEF, s.getPolicy());
		assertTrue(s.toString().contains("Undef"));
		assertEquals("Undef", s.getName());
	}
} //SchedulingPolicyTest
