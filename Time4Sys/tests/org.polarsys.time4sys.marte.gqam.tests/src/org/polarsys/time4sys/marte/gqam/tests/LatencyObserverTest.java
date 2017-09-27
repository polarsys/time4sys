/**
 */
package org.polarsys.time4sys.marte.gqam.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.LatencyObserver;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Latency Observer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LatencyObserverTest extends TimedObserverTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LatencyObserverTest.class);
	}

	/**
	 * Constructs a new Latency Observer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencyObserverTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Latency Observer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LatencyObserver getFixture() {
		return (LatencyObserver)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GqamFactory.eINSTANCE.createLatencyObserver());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LatencyObserverTest
