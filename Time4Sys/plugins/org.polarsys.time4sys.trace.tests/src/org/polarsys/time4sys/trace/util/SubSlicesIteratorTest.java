/**
 * 
 */
package org.polarsys.time4sys.trace.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.trace.Slice;
import org.polarsys.time4sys.trace.SliceKind;
import org.polarsys.time4sys.trace.TraceFactory;

/**
 * @author Utilisateur
 *
 */
public class SubSlicesIteratorTest {

	protected Slice root;
	protected SubSlicesIterator it; 
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		root = TraceFactory.eINSTANCE.createSlice();
		root.setName("root");
		root.setKindLabel("Package");
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.trace.util.SubSlicesIterator#SubSlicesIterator(org.polarsys.time4sys.trace.Slice, org.polarsys.time4sys.trace.SliceKind)}.
	 */
	@Test
	public void testSubSlicesIteratorSliceSliceKindNoSubSlices() {
		it = new SubSlicesIterator(root, SliceKind.JOB);
		assertFalse(it.hasNext());
		it = new SubSlicesIterator(root, SliceKind.OTHER);
		assertFalse(it.hasNext());
	}
	
	/**
	 * Test method for {@link org.polarsys.time4sys.trace.util.SubSlicesIterator#SubSlicesIterator(org.polarsys.time4sys.trace.Slice, org.polarsys.time4sys.trace.SliceKind)}.
	 */
	@Test
	public void testSubSlicesIteratorSliceSliceKindOneSubSlicesThatMatch() {
		final Slice subSlice1 = TraceFactory.eINSTANCE.createSlice();
		subSlice1.setKind(SliceKind.JOB);
		root.getOwnedSubSlices().add(subSlice1);
		it = new SubSlicesIterator(root, SliceKind.JOB);
		assertTrue(it.hasNext());
		assertEquals(subSlice1, it.next());
		assertFalse(it.hasNext());
	}
	
	@Test
	public void testSubSlicesIteratorSliceSliceKindOneSubSubSlicesThatMatch() {
		final Slice subSlice1 = TraceFactory.eINSTANCE.createSlice();
		subSlice1.setKind(SliceKind.TASK);
		final Slice subSubSlice1 = TraceFactory.eINSTANCE.createSlice();
		subSubSlice1.setKind(SliceKind.JOB);
		subSlice1.getOwnedSubSlices().add(subSubSlice1);
		root.getOwnedSubSlices().add(subSlice1);
		it = new SubSlicesIterator(root, SliceKind.JOB);
		assertTrue(it.hasNext());
		assertEquals(subSubSlice1, it.next());
		assertFalse(it.hasNext());
	}
	
	@Test
	public void testSubSlicesIteratorSliceSliceKindOneSubSubSliceOneSubSliceThatMatch() {
		final Slice subSlice1 = TraceFactory.eINSTANCE.createSlice();
		subSlice1.setName("subSlice1");
		subSlice1.setKind(SliceKind.TASK);
		final Slice subSubSlice1 = TraceFactory.eINSTANCE.createSlice();
		subSubSlice1.setKind(SliceKind.JOB);
		subSubSlice1.setName("subsubSlice1");
		final Slice subSlice2 = TraceFactory.eINSTANCE.createSlice();
		subSlice2.setKind(SliceKind.JOB);
		subSlice2.setName("subSlice2");
		subSlice1.getOwnedSubSlices().add(subSubSlice1);
		root.getOwnedSubSlices().add(subSlice1);
		root.getOwnedSubSlices().add(subSlice2);
		it = new SubSlicesIterator(root, SliceKind.JOB);
		// Breadth first
		assertTrue(it.hasNext());
		assertEquals(subSlice2, it.next());
		assertTrue(it.hasNext());
		assertEquals(subSubSlice1, it.next());
		assertFalse(it.hasNext());
	}

	/**
	 * Test method for {@link org.polarsys.time4sys.trace.util.SubSlicesIterator#SubSlicesIterator(org.polarsys.time4sys.trace.Slice, java.lang.String)}.
	 */
	@Test
	public void testSubSlicesIteratorSliceString() {
		it = new SubSlicesIterator(root, "Package");
		assertFalse(it.hasNext());
	}
	
	@Test
	public void testSubSlicesIteratorSliceSliceKindNullRoot() {
		it = new SubSlicesIterator(null, SliceKind.JOB);
		assertFalse(it.hasNext());
	}
	
	@Test
	public void testSubSlicesIteratorSliceSliceKindOneLinkedSubSlicesThatMatch() {
		final Slice subSlice1 = TraceFactory.eINSTANCE.createSlice();
		subSlice1.setKind(SliceKind.TASK);
		final Slice linkedSubSlice1 = TraceFactory.eINSTANCE.createSlice();
		linkedSubSlice1.setKind(SliceKind.JOB);
		subSlice1.getSubSlices().add(linkedSubSlice1);
		root.getOwnedSubSlices().add(subSlice1);
		it = new SubSlicesIterator(root, SliceKind.JOB);
		assertTrue(it.hasNext());
		assertEquals(linkedSubSlice1, it.next());
		assertFalse(it.hasNext());
	}
	

}
