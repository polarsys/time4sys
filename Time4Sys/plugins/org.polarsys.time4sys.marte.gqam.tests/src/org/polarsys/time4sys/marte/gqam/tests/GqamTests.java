/**
 */
package org.polarsys.time4sys.marte.gqam.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>gqam</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GqamTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new GqamTests("gqam Tests");
		suite.addTestSuite(AcquireStepTest.class);
		suite.addTestSuite(BehaviorScenarioTest.class);
		suite.addTestSuite(BurstPatternTest.class);
		suite.addTestSuite(ClosedPatternTest.class);
		suite.addTestSuite(CommunicationChannelTest.class);
		suite.addTestSuite(CommunicationStepTest.class);
		suite.addTestSuite(DelayTest.class);
		suite.addTestSuite(ExecutionStepTest.class);
		suite.addTestSuite(InputPinTest.class);
		suite.addTestSuite(LatencyObserverTest.class);
		suite.addTestSuite(OnceTest.class);
		suite.addTestSuite(OutputPinTest.class);
		suite.addTestSuite(PeriodicPatternTest.class);
		suite.addTestSuite(ReferenceTest.class);
		suite.addTestSuite(ReleaseStepTest.class);
		suite.addTestSuite(RequestedServiceTest.class);
		suite.addTestSuite(ResourceServiceExcecutionTest.class);
		suite.addTestSuite(SlidingWindowPatternTest.class);
		suite.addTestSuite(SporadicPatternTest.class);
		suite.addTestSuite(StepTest.class);
		suite.addTestSuite(TimedObserverTest.class);
		suite.addTestSuite(WorkloadBehaviorTest.class);
		suite.addTestSuite(WorkloadEventTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GqamTests(String name) {
		super(name);
	}

} //GqamTests
