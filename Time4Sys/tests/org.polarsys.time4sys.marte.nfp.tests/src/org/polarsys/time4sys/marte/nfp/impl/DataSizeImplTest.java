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
package org.polarsys.time4sys.marte.nfp.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.marte.nfp.DataSize;
import org.polarsys.time4sys.marte.nfp.DataSizeUnitKind;
import org.polarsys.time4sys.marte.nfp.NfpFactory;

/**
 * @author loic
 *
 */
public class DataSizeImplTest extends AbstractRealWithUnitValueImplTest<DataSizeUnitKind, DataSize> {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		zero = new DataSizeImpl(0, DataSizeUnitKind.BIT);
		val1 = 10;
		unit1 = DataSizeUnitKind.BIT;
		v1 = new DataSizeImpl(val1, unit1);
		v2 = new DataSizeImpl(5, DataSizeUnitKind.BIT);
		v1_plus_v2 = new DataSizeImpl(15, DataSizeUnitKind.BIT);
		v1_minus_v2 = v2;
		
		v1_mul_3 = new DataSizeImpl(3 * val1, unit1);
		v1_min_v2 = v2;
		v1_max_v2 = v1;
		v1_lcm_v2 = v1;
		v1_divide_v2 = 2;
		v1_div_v2 = 2.0;
		obj = (EObject)v1;
		clz = obj.eClass();
	}

	@Test
	public void testZeroUnit1EqualsZeroInAnotherUnit() {
		final DataSizeImpl zero1 = new DataSizeImpl(0, DataSizeUnitKind.BIT);
		final DataSizeImpl zero2 = new DataSizeImpl(0, DataSizeUnitKind.GB);
		assertTrue(zero1.equals(zero2));
		assertTrue(zero2.equals(zero1));
	}
	
	@Test
	public void testEqualsDifferentUnits() {
		final DataSizeImpl v1 = new DataSizeImpl(123000, DataSizeUnitKind.BYTE);
		final DataSizeImpl v2 = new DataSizeImpl(123, DataSizeUnitKind.KB);
		assertTrue(v1.equals(v2));
		assertTrue(v2.equals(v1));
	}
	
	@Test
	public void testEqualsAnotherImpl() {
		final DataSizeImpl v1 = new DataSizeImpl(123000, DataSizeUnitKind.BIT);
		final DataSize v2 = new DataSize() {

			@Override
			public EClass eClass() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Resource eResource() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public EObject eContainer() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public EStructuralFeature eContainingFeature() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public EReference eContainmentFeature() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public EList<EObject> eContents() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public TreeIterator<EObject> eAllContents() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean eIsProxy() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public EList<EObject> eCrossReferences() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object eGet(EStructuralFeature feature) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object eGet(EStructuralFeature feature, boolean resolve) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void eSet(EStructuralFeature feature, Object newValue) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean eIsSet(EStructuralFeature feature) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void eUnset(EStructuralFeature feature) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public EList<Adapter> eAdapters() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean eDeliver() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void eSetDeliver(boolean deliver) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void eNotify(Notification notification) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public double getValue() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void setValue(double value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public DataSizeUnitKind getUnit() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setUnit(DataSizeUnitKind value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public DataSize add(DataSize v) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int compareTo(DataSize anotherDuration) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public DataSize convertToUnit(DataSizeUnitKind unit) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public double div(DataSize v) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public long divide(DataSize v) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isZero() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public DataSize lcm(DataSize v) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public DataSize max(DataSize other) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public DataSize min(DataSize other) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public DataSize multiply(long v) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean notZero() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public DataSize simplify() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public DataSize sub(DataSize v) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		assertFalse(v1.equals(v2));
	}
	
	@Test
	public void testEmptyConstructor() {
		assertNotNull(NfpFactory.eINSTANCE.createDataSize());
	}
}
