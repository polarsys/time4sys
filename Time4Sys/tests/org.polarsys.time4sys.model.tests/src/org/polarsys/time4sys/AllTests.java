package org.polarsys.time4sys;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	org.polarsys.time4sys.builder.AllTests.class,
	org.polarsys.time4sys.model.AllTests.class })
public class AllTests {

}
