/**
 * 
 */
package org.polarsys.time4sys.builder.simulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.builder.simulation.TraceBuilder;
import org.polarsys.time4sys.mapping.MappableArtefact;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.mapping.MappingFactory;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourcePackage;
import org.polarsys.time4sys.model.time4sys.Simulation;
import org.polarsys.time4sys.model.time4sys.Time4sysFactory;
import org.polarsys.time4sys.trace.Slice;
import org.polarsys.time4sys.trace.SliceKind;
import org.polarsys.time4sys.trace.Trace;
import org.polarsys.time4sys.trace.TraceFactory;

/**
 * @author loic
 *
 */
public class TraceBuilderTest {
	
	private static boolean isPartOfTrace(final Slice slc, final Trace tr) {
		if (slc.getParent() == null) {
			return tr.getSlices().contains(slc);
		} else {
			return isPartOfTrace(slc.getParent(), tr);
		}
	}
	
	public static void assertSliceIsPartOfThisTrace(final Slice slcOriginal, final Trace tr) {
		assertTrue(isPartOfTrace(slcOriginal, tr));
	}
	

	public static  boolean containsArtefact(final EList<MappableArtefact> targets, final Trace trace) {
		for(MappableArtefact ma: targets) {
			if (ma.getValue() == trace) {
				return true;
			}
		}
		return false;
	}
	
	public static  void assertContainsArtefact(final EList<MappableArtefact> targets, final Trace trace) {
		assertTrue(containsArtefact(targets, trace));
	}

	private TraceBuilder traceBuilder;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		traceBuilder = new TraceBuilder(TraceFactory.eINSTANCE.createTrace(), MappingFactory.eINSTANCE.createMapping(), MappingFactory.eINSTANCE.createContext("simulation"));
	}

	@Test
	public void testNullConstructorTrace() {
		try {
			traceBuilder = new TraceBuilder(null, MappingFactory.eINSTANCE.createMapping(), MappingFactory.eINSTANCE.createContext("simulation"));
			fail("Must throw");
		} catch (IllegalArgumentException e) {
			
		}
	}
	
	@Test
	public void testNullConstructorMap() {
		try {
			traceBuilder = new TraceBuilder(TraceFactory.eINSTANCE.createTrace(), null, MappingFactory.eINSTANCE.createContext("simulation"));
			fail("Must throw");
		} catch (IllegalArgumentException e) {
			
		}
	}
	
	@Test
	public void testNullConstructorContext() {
		try {
			traceBuilder = new TraceBuilder(TraceFactory.eINSTANCE.createTrace(), MappingFactory.eINSTANCE.createMapping(), null);
			fail("Must throw");
		} catch (IllegalArgumentException e) {
			
		}
	}
	
	/**
	 * Test method for {@link org.polarsys.time4sys.builder.trace.TraceBuilder#getSliceFor(org.polarsys.time4sys.marte.grm.Resource)}.
	 */
	@Test
	public void testGetSliceForResource() {
		final Resource res = GrmFactory.eINSTANCE.createCommunicationMedia();
		res.setName("aResource");
		// When getting a slice for a resource
		final Slice slcOriginal = traceBuilder.getSliceFor(res);
		// Then
		assertNotNull(slcOriginal);
		final Trace tr = traceBuilder.build();
		assertSliceIsPartOfThisTrace(slcOriginal, tr);
		assertEquals(SliceKind.RESOURCE, slcOriginal.getKind());
		assertNotNull(slcOriginal.getName());
		assertTrue(slcOriginal.getName().contains(res.getName()));
		// Idem potent
		final Slice slcDup = traceBuilder.getSliceFor(res);
		assertSame(slcOriginal, slcDup);
	}
	
	/**
	 * Test method for {@link org.polarsys.time4sys.builder.trace.TraceBuilder#getSliceFor(org.polarsys.time4sys.marte.grm.Resource)}.
	 */
	@Test
	public void testGetSliceForResourceInAPackage() {
		final ResourcePackage pkg = GrmFactory.eINSTANCE.createResourcePackage();
		pkg.setName("aPkg");
		final Resource res = GrmFactory.eINSTANCE.createCommunicationMedia();
		res.setName("aResource");
		pkg.getOwnedElement().add(res);
		// When getting a slice for a resource
		final Slice slcOriginal = traceBuilder.getSliceFor(res);
		// Then
		assertNotNull(slcOriginal);
		final Trace tr = traceBuilder.build();
		assertSliceIsPartOfThisTrace(slcOriginal, tr);
		assertEquals(SliceKind.RESOURCE, slcOriginal.getKind());
		assertNotNull(slcOriginal.getName());
		assertTrue(slcOriginal.getName().contains(res.getName()));
		// Idem potent
		final Slice slcDup = traceBuilder.getSliceFor(res);
		assertSame(slcOriginal, slcDup);
	}
	
	/**
	 * Test method for {@link org.polarsys.time4sys.builder.trace.TraceBuilder#getSliceFor(org.polarsys.time4sys.marte.grm.ResourcePackage)}.
	 */
	@Test
	public void testGetSliceForResourcePackage() {
		final ResourcePackage res = GrmFactory.eINSTANCE.createResourcePackage();
		res.setName("aPkg");
		// When getting a slice for a resource package
		final Slice slcOriginal = traceBuilder.getSliceFor(res);
		// Then
		assertNotNull(slcOriginal);
		final Trace tr = traceBuilder.build();
		assertSliceIsPartOfThisTrace(slcOriginal, tr);
		assertEquals(SliceKind.OTHER, slcOriginal.getKind());
		assertEquals("Package", slcOriginal.getKindLabel());
		assertNotNull(slcOriginal.getName());
		assertTrue(slcOriginal.getName().contains(res.getName()));
		// Idem potent
		final Slice slcDup = traceBuilder.getSliceFor(res);
		assertSame(slcOriginal, slcDup);
	}

	@Test
	public void testConstructorSimulation() {
		final Simulation simulation = Time4sysFactory.eINSTANCE.createSimulation();
		// When
		traceBuilder = new TraceBuilder(simulation);
		// Then
		final Trace trace = traceBuilder.build();
		assertNotNull(trace);
		final Mapping map = simulation.getMapping();
		assertNotNull(map);
		assertNotNull(map.getRationale());
		assertFalse(map.getRules().isEmpty());
		assertEquals(simulation.getTrace(), trace);
		assertFalse(map.getTargets().isEmpty());
		assertContainsArtefact(map.getTargets(), trace);
	}

}
