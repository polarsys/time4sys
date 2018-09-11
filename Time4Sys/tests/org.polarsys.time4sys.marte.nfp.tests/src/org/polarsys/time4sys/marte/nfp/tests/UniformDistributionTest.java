/**
 */
package org.polarsys.time4sys.marte.nfp.tests;

import junit.textui.TestRunner;

import java.math.MathContext;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;
import org.polarsys.time4sys.marte.nfp.UniformDistribution;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uniform Distribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniformDistributionTest extends ProbabilisticDurationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UniformDistributionTest.class);
	}

	/**
	 * Constructs a new Uniform Distribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformDistributionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Uniform Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UniformDistribution getFixture() {
		return (UniformDistribution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfpFactory.eINSTANCE.createUniformDistribution());
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
	
	
	public void testUniformDistributionComma() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("]0, 12ms]");
		assertTrue(d instanceof UniformDistribution);
		final TimeInterval interval = ((UniformDistribution)d).getInterval();
		assertEquals(true, interval.isMinOpen());
		assertEquals(false, interval.isMaxOpen());
		assertTrue(interval.getMin().isZero());
		assertEquals("12ms", interval.getMax().toString());
	}
	
	public void testUniformDistributionTwoDots() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("]0..12ms]");
		assertTrue(d instanceof UniformDistribution);
		final TimeInterval interval = ((UniformDistribution)d).getInterval();
		assertEquals(true, interval.isMinOpen());
		assertEquals(false, interval.isMaxOpen());
		assertTrue(interval.getMin().isZero());
		assertEquals("12ms", interval.getMax().toString());
	}
	
	public void testUniformDistributionSemiColon() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("]11ms;12ms]");
		assertTrue(d instanceof UniformDistribution);
		final TimeInterval interval = ((UniformDistribution)d).getInterval();
		assertEquals(true, interval.isMinOpen());
		assertEquals(false, interval.isMaxOpen());
		assertEquals("11ms", interval.getMin().toString());
		assertEquals("12ms", interval.getMax().toString());
		assertEquals("]11ms,12ms]", interval.toString());
	}
	
	public void testConvertToUnit__TimeUnitKind() {
		super.testConvertToUnit__TimeUnitKind();
		final UniformDistribution d = (UniformDistribution)NfpFactory.eINSTANCE.createUniformDistribution("]0ms, 5ms]").convertToUnit(TimeUnitKind.US);
		final TimeInterval i = d.getInterval();
		assertEquals(0.0, i.getMin().getValue());
		assertEquals(TimeUnitKind.US, i.getMin().getUnit());
		assertEquals(5000.0, i.getMax().getValue());
		assertEquals(TimeUnitKind.US, i.getMax().getUnit());
	}

	@Override
	public void testIsZero() {
		assertFalse(NfpFactory.eINSTANCE.createUniformDistribution("]0ms, 5ms]").isZero());
		assertTrue(NfpFactory.eINSTANCE.createUniformDistribution("[0ms, 5ms]").isZero());
		assertTrue(NfpFactory.eINSTANCE.createUniformDistribution("]0ms, 0ms]").isZero());
	}

	@Override
	public void testNotZero() {
		assertTrue(NfpFactory.eINSTANCE.createUniformDistribution("]0ms, 5ms]").notZero());
		assertFalse(NfpFactory.eINSTANCE.createUniformDistribution("[0ms, 5ms]").notZero());
		assertFalse(NfpFactory.eINSTANCE.createUniformDistribution("]0ms, 0ms]").notZero());
	}

	@Override
	public void testMax__Duration() {
		assertEquals("10ms", NfpFactory.eINSTANCE.createUniformDistribution("]0ms, 5ms]").max(NfpFactory.eINSTANCE.createDurationFromString("10ms")).toString());
		assertEquals("uniform(]3ms,5ms])", NfpFactory.eINSTANCE.createUniformDistribution("]3ms, 5ms]").max(NfpFactory.eINSTANCE.createDurationFromString("0ms")).toString());
		assertEquals("uniform([3ms,5ms])", NfpFactory.eINSTANCE.createUniformDistribution("]0ms, 5ms]").max(NfpFactory.eINSTANCE.createDurationFromString("3ms")).toString());
	}

	@Override
	public void testMin__Duration() {
		assertEquals("uniform(]0ms,5ms])", NfpFactory.eINSTANCE.createUniformDistribution("]0ms, 5ms]").min(NfpFactory.eINSTANCE.createDurationFromString("10ms")).toString());
		assertEquals("0ms", NfpFactory.eINSTANCE.createUniformDistribution("]3ms, 5ms]").min(NfpFactory.eINSTANCE.createDurationFromString("0ms")).toString());
		assertEquals("uniform(]0ms,3ms])", NfpFactory.eINSTANCE.createUniformDistribution("]0ms, 5ms]").min(NfpFactory.eINSTANCE.createDurationFromString("3ms")).toString());
	}
	
	public void testAdd__Duration() {
		assertEquals("uniform([3ms,12ms[)", NfpFactory.eINSTANCE.createUniformDistribution("[1ms,10ms[").add(NfpFactory.eINSTANCE.createDurationFromString("2ms")).toString());
		assertEquals("uniform([3ms,15ms[)", NfpFactory.eINSTANCE.createUniformDistribution("[1ms,10ms[").add(NfpFactory.eINSTANCE.createUniformDistribution("[2ms, 5ms]")).toString());
		assertEquals("uniform([3ms,15ms[)", NfpFactory.eINSTANCE.createUniformDistribution("[1ms,10ms[").add(NfpFactory.eINSTANCE.createUniformDistribution("[2ms, 5ms]")).toString());
	}

	@Override
	public void testSub__Duration() {
		super.testSub__Duration();
		assertEquals("uniform([1ms,10ms[)", NfpFactory.eINSTANCE.createUniformDistribution("[3ms,12ms[").sub(NfpFactory.eINSTANCE.createUniformDistribution("2ms")).toString());
		assertEquals("uniform([0ms,8ms[)", NfpFactory.eINSTANCE.createUniformDistribution("[5ms,10ms[").sub(NfpFactory.eINSTANCE.createUniformDistribution("[2ms, 5ms]")).toString());
	}
	
	@Override
	public void testMultiply__long() {
		assertEquals("uniform(]3ms,18ms])", NfpFactory.eINSTANCE.createUniformDistribution("]1ms,6ms]").multiply(3).toString());
	}

	@Override
	public void testLcm__Duration() {
		assertEquals(NfpFactory.eINSTANCE.createDurationFromString("32ms"), NfpFactory.eINSTANCE.createUniformDistribution("[32ms..32ms]").lcm(NfpFactory.eINSTANCE.createDurationFromString("32ms")));
		assertEquals(NfpFactory.eINSTANCE.createDurationFromString("12ms"), NfpFactory.eINSTANCE.createUniformDistribution("[4ms..4ms]").lcm(NfpFactory.eINSTANCE.createDurationFromString("6ms")));
	}

	@Override
	public void testDiv__Duration() {
		final UniformDistribution d = NfpFactory.eINSTANCE.createUniformDistribution("]3ms,18ms]");
		assertEquals(21.0, d.div(NfpFactory.eINSTANCE.createDurationFromString("0.5ms")));
	}

	@Override
	public void testDiv__Duration_MathContext() {
		final MathContext mathContext = new MathContext(2);
		final UniformDistribution d = NfpFactory.eINSTANCE.createUniformDistribution("]13ms,19ms]");
		assertEquals(5.3, d.div(NfpFactory.eINSTANCE.createDurationFromString("3ms"), mathContext), 0.0000001);
	}

	@Override
	public void testDivide__Duration() {
		final UniformDistribution d = NfpFactory.eINSTANCE.createUniformDistribution("]13ms,19ms]");
		assertEquals(5, d.divide(NfpFactory.eINSTANCE.createDurationFromString("3ms")));
		final UniformDistribution d2 = NfpFactory.eINSTANCE.createUniformDistribution("]13000us,19000us]");
		assertEquals(5, d2.divide(NfpFactory.eINSTANCE.createDurationFromString("3000us")));
	}

	public void testDivide__long() {
		assertEquals("uniform(]1ms,6ms])", NfpFactory.eINSTANCE.createUniformDistribution("]3ms,18ms]").divide(3).toString());
	}
	
	public void testSimplify() {
		super.testSimplify();
	}
	
	public void testBestWorst() {
		final UniformDistribution d = NfpFactory.eINSTANCE.createUniformDistribution("]3ms,18ms]");
		assertEquals(3.0, d.getBest());
		assertEquals(18.0, d.getWorst());
		final Duration dUs = d.convertToUnit(TimeUnitKind.US);
		assertEquals(3000.0, dUs.getBest());
		assertEquals(18000.0, dUs.getWorst());
	}

	public void testBestWorstBug() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("[12000.0us..60000.0us]");
		assertTrue(d instanceof UniformDistribution);
		assertEquals(12000.0, d.getBest());
		assertEquals(60000.0, d.getWorst());
		final Duration dUs = d.convertToUnit(TimeUnitKind.US);
		assertEquals(12000.0, dUs.getBest());
		assertEquals(60000.0, dUs.getWorst());
	}
	
	public void testBestWorstBugSemicolon() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("[12000.0us;60000.0us]");
		assertTrue(d instanceof UniformDistribution);
		assertEquals(12000.0, d.getBest());
		assertEquals(60000.0, d.getWorst());
		final Duration dUs = d.convertToUnit(TimeUnitKind.US);
		assertEquals(12000.0, dUs.getBest());
		assertEquals(60000.0, dUs.getWorst());
	}
	
	public void testBestWorstBugComma() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("[12000.0us,60000.0us]");
		assertTrue(d instanceof UniformDistribution);
		assertEquals(12000.0, d.getBest());
		assertEquals(60000.0, d.getWorst());
		final Duration dUs = d.convertToUnit(TimeUnitKind.US);
		assertEquals(12000.0, dUs.getBest());
		assertEquals(60000.0, dUs.getWorst());
	}

	public void testParseDouble() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("[12000.500us,60000.33us]");
		assertTrue(d instanceof UniformDistribution);
		assertEquals(12000.500, d.getBest());
		assertEquals(60000.33, d.getWorst());
		final Duration dUs = d.convertToUnit(TimeUnitKind.NS);
		assertEquals(12000500.0, dUs.getBest());
		assertEquals(60000330.0, dUs.getWorst());
	}
	
	public void testParseUniformSerial() {
		final Duration d = NfpFactory.eINSTANCE.createDurationFromString("uniform([12000.500us..60000.33us])");
		assertTrue(d instanceof UniformDistribution);
		assertEquals(12000.500, d.getBest());
		assertEquals(60000.33, d.getWorst());
		final Duration dUs = d.convertToUnit(TimeUnitKind.NS);
		assertEquals(12000500.0, dUs.getBest());
		assertEquals(60000330.0, dUs.getWorst());
	}
	
	public void testBadInputToleranceFullForm() {
		final String userInput = "uniform(]11ms..12ms])";
		for(int i=0; i < userInput.length(); ++i) {
			try {
				NfpFactory.eINSTANCE.createDurationFromString(userInput.substring(0, i));
			} catch (NumberFormatException e) {
				
			}
		}
	}
	
	public void testBadInputToleranceShortForm() {
		final String userInput = "]11ms..12ms]";
		for(int i=0; i < userInput.length(); ++i) {
			try {
				NfpFactory.eINSTANCE.createDurationFromString(userInput.substring(0, i));
			} catch (NumberFormatException e) {
				
			}
		}
	}
	
//	public void testCompareTo__Duration() {
//		super.testCompareTo__Duration();
//		assertFalse(NfpFactory.eINSTANCE.createUniformDistribution("[1ms,10ms[").compareTo(NfpFactory.eINSTANCE.createUniformDistribution("[2ms, 5ms]")));
//		assertEquals("uniform([3ms,15ms[)", NfpFactory.eINSTANCE.createUniformDistribution("[1ms,10ms[").add(NfpFactory.eINSTANCE.createUniformDistribution("[2ms, 5ms]")).toString());
//	}
} //UniformDistributionTest
