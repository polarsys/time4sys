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
package org.polarsys.time4sys.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
		// org.polarsys.time4sys.analysis.tests.AllTests.class,
		// org.polarsys.time4sys.design.tests.AllTests.class,
		org.polarsys.time4sys.library.tests.AllTests.class,
		// org.polarsys.time4sys.marte.gqam.tests.AllTests.class,
		// org.polarsys.time4sys.marte.grm.tests.AllTests.class,
		// org.polarsys.time4sys.marte.hrm.tests.AllTests.class,
		org.polarsys.time4sys.marte.nfp.tests.AllTests.class,
		// org.polarsys.time4sys.marte.srm.tests.AllTests.class,
		org.polarsys.time4sys.AllTests.class,
})
public class AllTest {

}
