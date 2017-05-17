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
import org.polarsys.time4sys.library.TDMA;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TDMA</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class TDMATest extends TestCase {

	/**
	 * @generated NOT
	 */
	public void testConstructor() throws Exception {
		final TDMA sched = LibraryFactory.eINSTANCE.createTDMA();
		assertEquals(SchedPolicyKind.OTHER, sched.getPolicy());
		assertEquals("TDMA", sched.getOtherSchedPolicy());
		assertNotNull(sched.getSlot());
	}

} //TDMATest
