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
package org.polarsys.time4sys.marte.grm.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;

/**
 * @author loic
 *
 */
public class SchedulingPolicyImplTest {

	@Test
	public void test() {
		SchedulingPolicyImpl s = new SchedulingPolicyImpl();
		assertEquals(SchedPolicyKind.UNDEF, s.getPolicy());
		assertNotNull(s.getName());
		assertEquals("Undef", s.getName());
		assertNull(s.getOtherSchedPolicy());
	}

}
