/**
 */
package org.polarsys.time4sys.marte.nfp.tests;

import java.math.MathContext;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.time4sys.marte.nfp.Bucket;
import org.polarsys.time4sys.marte.nfp.DiscreteDistribution;
import org.polarsys.time4sys.marte.nfp.DiscreteDistributionKind;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Discrete Distribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscreteDistributionTest extends ProbabilisticDurationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiscreteDistributionTest.class);
	}

	/**
	 * Constructs a new Discrete Distribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteDistributionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Discrete Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DiscreteDistribution getFixture() {
		return (DiscreteDistribution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		final DiscreteDistribution d = NfpFactory.eINSTANCE.createDiscreteDistribution();
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("10ms"));
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("5ms"));
		d.setKind(DiscreteDistributionKind.RANDOM);
		setFixture(d);
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
		final DiscreteDistribution converted = (DiscreteDistribution) getFixture().convertToUnit(TimeUnitKind.S);
		assertEquals(TimeUnitKind.S, converted.getUnit());
		for(Bucket b: converted.getBuckets()) {
			assertEquals(TimeUnitKind.S, b.getValue().getUnit());
		}
		// Original is unchanged
		for(Bucket b: getFixture().getBuckets()) {
			assertEquals(TimeUnitKind.MS, b.getValue().getUnit());
		}
	}

	@Override
	public void testIsZero() {
		assertFalse(getFixture().isZero());
		
		final DiscreteDistribution d = NfpFactory.eINSTANCE.createDiscreteDistribution();
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("0ms"));
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("5ms"));
		d.setKind(DiscreteDistributionKind.CYCLIC);
		assertTrue(d.isZero());
	}

	@Override
	public void testNotZero() {
		assertTrue(getFixture().notZero());
		
		final DiscreteDistribution d = NfpFactory.eINSTANCE.createDiscreteDistribution();
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("0ms"));
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("5ms"));
		d.setKind(DiscreteDistributionKind.CYCLIC);
		assertFalse(d.notZero());
	}
	
	@Override
	public void testMax__Duration() {
		super.testMax__Duration();
		final DiscreteDistribution d = NfpFactory.eINSTANCE.createDiscreteDistribution();
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("0ms"));
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("5ms"));
		d.setKind(DiscreteDistributionKind.CYCLIC);
		
		assertEquals("5ms", d.max(NfpFactory.eINSTANCE.createDurationFromString("0ms")).toString());
		assertEquals("5ms", d.max(NfpFactory.eINSTANCE.createDurationFromString("2ms")).toString());
		assertEquals("5ms", d.max(NfpFactory.eINSTANCE.createDurationFromString("5ms")).toString());
		assertEquals("10ms", d.max(NfpFactory.eINSTANCE.createDurationFromString("10ms")).toString());
	}

	@Override
	public void testMin__Duration() {
		super.testMin__Duration();
		final DiscreteDistribution d = NfpFactory.eINSTANCE.createDiscreteDistribution();
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("2ms"));
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("5ms"));
		d.setKind(DiscreteDistributionKind.CYCLIC);
		
		assertEquals("0ms", d.min(NfpFactory.eINSTANCE.createDurationFromString("0ms")).toString());
		assertEquals("2ms", d.min(NfpFactory.eINSTANCE.createDurationFromString("2ms")).toString());
		assertEquals("2ms", d.min(NfpFactory.eINSTANCE.createDurationFromString("5ms")).toString());
		assertEquals("2ms", d.min(NfpFactory.eINSTANCE.createDurationFromString("10ms")).toString());
	}

	@Override
	public void testMultiply__long() {
		assertEquals("discrete(random, {(0.5, 30ms), (0.5, 15ms)})", getFixture().multiply(3).toString());
	}

	@Override
	public void testLcm__Duration() {
		final DiscreteDistribution d = NfpFactory.eINSTANCE.createDiscreteDistribution();
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("3ms"));
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("5ms"));
		d.setKind(DiscreteDistributionKind.RANDOM);
		assertEquals("105ms", d.lcm(NfpFactory.eINSTANCE.createDurationFromString("7ms")).toString());
	}

	@Override
	public void testDiv__Duration() {
		try {
			getFixture().div(NfpFactory.eINSTANCE.createDurationFromString("3ms"));
			fail("Division on Discrete value is unavailable.");
		} catch (UnsupportedOperationException e) {
		}
	}

	@Override
	public void testDiv__Duration_MathContext() {
		try {
			getFixture().div(NfpFactory.eINSTANCE.createDurationFromString("3ms"), MathContext.DECIMAL64);
			fail("Division on Discrete value is unavailable.");
		} catch (UnsupportedOperationException e) {
		}
	}

	@Override
	public void testDivide__Duration() {
		try {
			getFixture().div(NfpFactory.eINSTANCE.createDurationFromString("3ms"));
			fail("Division on Discrete value is unavailable.");
		} catch (UnsupportedOperationException e) {
		}
	}

	@Override
	public void testDivide__long() {
		final DiscreteDistribution d = NfpFactory.eINSTANCE.createDiscreteDistribution();
		d.addBucket(0.7, NfpFactory.eINSTANCE.createDurationFromString("15ms"));
		d.addBucket(0.3, NfpFactory.eINSTANCE.createDurationFromString("5ms"));
		d.setKind(DiscreteDistributionKind.RANDOM);
		assertEquals("discrete(random, {(0.7, 3ms), (0.3, 1ms)})", d.divide(5).toString());
	}

	public void testBestWorst() {
		final Duration dUs = getFixture().convertToUnit(TimeUnitKind.MS);
		assertEquals(5.0, dUs.getBest());
		assertEquals(10.0, dUs.getWorst());
	}
	
	public void testBestWorstWithInteval() {
		final DiscreteDistribution d = NfpFactory.eINSTANCE.createDiscreteDistribution();
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("[0ms..3ms]"));
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("5ms"));
		d.setKind(DiscreteDistributionKind.CYCLIC);
		final Duration dUs = d.convertToUnit(TimeUnitKind.MS);
		assertEquals(0.0, dUs.getBest());
		assertEquals(5.0, dUs.getWorst());
	}
	
	public void testBestWorstWithOverlappingIntevals() {
		final DiscreteDistribution d = NfpFactory.eINSTANCE.createDiscreteDistribution();
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("[0ms..3ms]"));
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("[2ms..4ms]"));
		d.setKind(DiscreteDistributionKind.CYCLIC);
		final Duration dMs = d.convertToUnit(TimeUnitKind.MS);
		assertEquals(0.0, dMs.getBest());
		assertEquals(4.0, dMs.getWorst());
	}
	
	public void testToStringSimpleUnordered() {
		assertEquals("discrete(random, {(0.5, 10ms), (0.5, 5ms)})", getFixture().toString());
	}
	
	public void testToStringOneZero() {
		final DiscreteDistribution d = NfpFactory.eINSTANCE.createDiscreteDistribution();
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("0ms"));
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("5ms"));
		d.setKind(DiscreteDistributionKind.CYCLIC);
		assertEquals("discrete(cyclic, {(0.5, 0ms), (0.5, 5ms)})", d.toString());
	}
	
	public void testToStringOneUniform() {
		final DiscreteDistribution d = NfpFactory.eINSTANCE.createDiscreteDistribution();
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("[0ms..3ms]"));
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("5ms"));
		d.setKind(DiscreteDistributionKind.CYCLIC);
		assertEquals("discrete(cyclic, {(0.5, uniform([0ms..3ms])), (0.5, 5ms)})", d.toString());
	}
	
	public void testParseSimpleUnordered() {
		final String input = "discrete(random, {(0.5, 10ms), (0.5, 5ms)})";
		final Duration parsed = NfpFactory.eINSTANCE.createDurationFromString(input);
		assertEquals(input, parsed.toString());
		assertTrue(EcoreUtil.equals(fixture, parsed));
	}
	
	public void testParseOneZero() {
		final String input = "discrete(random, {(0.5, 10ms), (0.5, 5ms)})";
		final Duration parsed = NfpFactory.eINSTANCE.createDurationFromString(input);
		assertEquals(input, parsed.toString());
		
		final DiscreteDistribution d = NfpFactory.eINSTANCE.createDiscreteDistribution();
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("0ms"));
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("5ms"));
		d.setKind(DiscreteDistributionKind.CYCLIC);
		assertEquals(d, parsed);
	}
	
	public void testParseOneUniform() {
		final String input = "discrete(cyclic, {(0.5, uniform([0ms..3ms])), (0.5, 5ms)})";
		final Duration parsed = NfpFactory.eINSTANCE.createDurationFromString(input);
		assertEquals(input, parsed.toString());
		
		final DiscreteDistribution d = NfpFactory.eINSTANCE.createDiscreteDistribution();
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("[0ms..3ms]"));
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("5ms"));
		d.setKind(DiscreteDistributionKind.CYCLIC);
		assertEquals(d, parsed);
	}
	
	public void testParseOneUniformWithIntervalNotation() {
		final String input = "discrete(cyclic, {(0.5, [0ms..3ms]), (0.5, 5ms)})";
		final Duration parsed = NfpFactory.eINSTANCE.createDurationFromString(input);
		assertEquals("discrete(cyclic, {(0.5, uniform([0ms..3ms])), (0.5, 5ms)})", parsed.toString());
		
		final DiscreteDistribution d = NfpFactory.eINSTANCE.createDiscreteDistribution();
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("[0ms..3ms]"));
		d.addBucket(0.5, NfpFactory.eINSTANCE.createDurationFromString("5ms"));
		d.setKind(DiscreteDistributionKind.CYCLIC);
		assertEquals(d, parsed);
	}
} //DiscreteDistributionTest
