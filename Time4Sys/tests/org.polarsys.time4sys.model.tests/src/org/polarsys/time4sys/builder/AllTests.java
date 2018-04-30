package org.polarsys.time4sys.builder;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	org.polarsys.time4sys.builder.simulation.AllTests.class,
	org.polarsys.time4sys.builder.design.AllTests.class })
public class AllTests {

}
