/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.trace.tests;

import org.polarsys.time4sys.trace.Slice;
import org.polarsys.time4sys.trace.SliceKind;
import org.polarsys.time4sys.trace.TraceFactory;
import org.polarsys.time4sys.trace.TracePackage;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Slice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.polarsys.time4sys.trace.Slice#getHierarchicalName(java.lang.String) <em>Get Hierarchical Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Slice#getAggregatedEvents() <em>Get Aggregated Events</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SliceTest extends TestCase {

	private static final String UNKNOWN_LABEL = "uuunknownn";
	/**
	 * The fixture for this Slice test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Slice fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SliceTest.class);
	}

	/**
	 * Constructs a new Slice test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SliceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Slice test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Slice fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Slice test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Slice getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceFactory.eINSTANCE.createSlice());
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

	/**
	 * Tests the '{@link org.polarsys.time4sys.trace.Slice#getHierarchicalName(java.lang.String) <em>Get Hierarchical Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.Slice#getHierarchicalName(java.lang.String)
	 * @generated NOT
	 */
	public void testGetHierarchicalName__String() {
		fixture.setName("parent");
		final Slice child = TraceFactory.eINSTANCE.createSlice();
		child.setName("child");
		fixture.getOwnedSubSlices().add(child);
		assertEquals("parent", fixture.getHierarchicalName("::"));
		assertEquals("parent::child", child.getHierarchicalName("::"));
	}

	public void testKindFromEnum() {
		assertFalse(fixture.eIsSet(TracePackage.eINSTANCE.getSlice_Kind()));
		assertFalse(fixture.eIsSet(TracePackage.eINSTANCE.getSlice_KindLabel()));
		fixture.setKind(SliceKind.AUTOMATON);
		assertEquals(SliceKind.AUTOMATON.toString(), fixture.getKindLabel());
	}
	
	public void testKindFromUnknownLabel() {
		assertFalse(fixture.eIsSet(TracePackage.eINSTANCE.getSlice_Kind()));
		assertFalse(fixture.eIsSet(TracePackage.eINSTANCE.getSlice_KindLabel()));
		fixture.setKindLabel(UNKNOWN_LABEL);
		assertEquals(UNKNOWN_LABEL, fixture.getKindLabel());
		assertEquals(SliceKind.OTHER, fixture.getKind());
	}
	
	public void testKindFromEnumLabel() {
		assertFalse(fixture.eIsSet(TracePackage.eINSTANCE.getSlice_Kind()));
		assertFalse(fixture.eIsSet(TracePackage.eINSTANCE.getSlice_KindLabel()));
		fixture.setKindLabel(SliceKind.FUNCTION.toString());
		assertEquals(SliceKind.FUNCTION.toString(), fixture.getKindLabel());
		assertEquals(SliceKind.FUNCTION, fixture.getKind());
	}
	
	/**
	 * Tests the '{@link org.polarsys.time4sys.trace.Slice#getAggregatedEvents() <em>Get Aggregated Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.trace.Slice#getAggregatedEvents()
	 * @generated
	 */
	public void testGetAggregatedEvents() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SliceTest
