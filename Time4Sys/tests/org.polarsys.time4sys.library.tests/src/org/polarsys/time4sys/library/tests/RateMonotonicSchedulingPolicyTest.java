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
package org.polarsys.time4sys.library.tests;

import org.polarsys.time4sys.library.LibraryFactory;
import org.polarsys.time4sys.library.RateMonotonicSchedulingPolicy;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rate Monotonic Scheduling Policy</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class RateMonotonicSchedulingPolicyTest extends TestCase {

	public void testRMConstructor() throws Exception {
		final RateMonotonicSchedulingPolicy sched = LibraryFactory.eINSTANCE.createRateMonotonicSchedulingPolicy();
		assertEquals(SchedPolicyKind.OTHER, sched.getPolicy());
		assertEquals("RateMonotonic", sched.getOtherSchedPolicy());
	}

} //RateMonotonicSchedulingPolicyTest
