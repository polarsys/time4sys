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
package org.polarsys.time4sys.model.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.polarsys.time4sys.model.design2analysis.tests.Design2AnalysisTransformerTest;
import org.polarsys.time4sys.model.time4sys.tests.Time4sysAllTest;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Library</b></em>' model.
 * <!-- end-user-doc -->
 * @generated NOT
 */
@RunWith(Suite.class)
@SuiteClasses({
	Time4sysAllTest.class,
	Design2AnalysisTransformerTest.class,
})
public class AllTest {

}