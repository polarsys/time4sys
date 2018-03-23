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
package org.polarsys.time4sys.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.polarsys.time4sys.model.time4sys.tests.Time4sysAllTests;

@RunWith(Suite.class)
@SuiteClasses({
	org.polarsys.time4sys.model.transformations.AllTests.class,
	org.polarsys.time4sys.builder.simulation.AllTests.class,
	Time4sysAllTests.class
})
public class AllTests {

}
