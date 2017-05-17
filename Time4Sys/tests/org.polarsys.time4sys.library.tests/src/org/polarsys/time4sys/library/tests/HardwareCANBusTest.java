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

import org.eclipse.emf.common.util.EList;
import org.polarsys.time4sys.library.HardwareCANBus;
import org.polarsys.time4sys.library.LibraryFactory;
import org.polarsys.time4sys.marte.hrm.HardwareArbiter;
import org.polarsys.time4sys.marte.hrm.HardwareBus;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hardware CAN Bus</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class HardwareCANBusTest extends TestCase {

	public void testDefaultConfigurationOfCANBus() {
		final HardwareCANBus fixture = LibraryFactory.eINSTANCE.createHardwareCANBus();
		assertTrue(fixture instanceof HardwareBus);
		final EList<HardwareArbiter> arbiters = fixture.getArbiters();
		assertNotNull(arbiters);
		
	}

} //HardwareCANBusTest
