package org.polarsys.time4sys;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	org.polarsys.time4sys.builder.AllTests.class,
	org.polarsys.time4sys.transformations.AllTests.class,
	//org.polarsys.time4sys.model.time4sys.tests.Time4sysAllTests.class,
})
public class AllTests {

}
