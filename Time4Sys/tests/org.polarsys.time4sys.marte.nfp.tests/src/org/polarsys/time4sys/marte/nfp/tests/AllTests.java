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
package org.polarsys.time4sys.marte.nfp.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.polarsys.time4sys.marte.nfp.impl.NfpFactoryImplTest;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Library</b></em>' model.
 * <!-- end-user-doc -->
 * @generated NOT
 */
@RunWith(Suite.class)
@SuiteClasses({
	DurationTest.class,
	TimeIntervalTest.class,
	TimeUnitKindTest.class,
	TimeIntervalTest.class,
	
	org.polarsys.time4sys.marte.nfp.impl.AllTests.class,
})
public class AllTests {

}