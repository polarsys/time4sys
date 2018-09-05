/**
 */
package org.polarsys.time4sys.marte.nfp.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generalized Extreme Value Distribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneralizedExtremeValueDistributionTest extends ProbabilisticDurationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GeneralizedExtremeValueDistributionTest.class);
	}

	/**
	 * Constructs a new Generalized Extreme Value Distribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizedExtremeValueDistributionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Generalized Extreme Value Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GeneralizedExtremeValueDistribution getFixture() {
		return (GeneralizedExtremeValueDistribution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfpFactory.eINSTANCE.createGeneralizedExtremeValueDistribution());
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
	
	public void testConvertTo() {
		final Duration converted = getFixture().convertToUnit(TimeUnitKind.S);
		assertEquals(TimeUnitKind.S, converted.getUnit());
	}

	@Override
	public void testIsZero() {
		// TODO Auto-generated method stub
		fail("TODO");
	}

	@Override
	public void testNotZero() {
		// TODO Auto-generated method stub
		fail("TODO");
	}

	@Override
	public void testMax__Duration() {
		// TODO Auto-generated method stub
		fail("TODO");
	}

	@Override
	public void testMin__Duration() {
		// TODO Auto-generated method stub
		fail("TODO");
	}

	@Override
	public void testMultiply__long() {
		// TODO Auto-generated method stub
		fail("TODO");
	}

	@Override
	public void testLcm__Duration() {
		// TODO Auto-generated method stub
		fail("TODO");
	}

	@Override
	public void testDiv__Duration() {
		// TODO Auto-generated method stub
		fail("TODO");
	}

	@Override
	public void testDiv__Duration_MathContext() {
		// TODO Auto-generated method stub
		fail("TODO");
	}

	@Override
	public void testDivide__Duration() {
		// TODO Auto-generated method stub
		fail("TODO");
	}

	@Override
	public void testDivide__long() {
		// TODO Auto-generated method stub
		fail("TODO");
	}

} //GeneralizedExtremeValueDistributionTest
