/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.library.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.time4sys.library.DeadlineMonotonicSchedulingPolicy;
import org.polarsys.time4sys.library.HardwareCANBus;
import org.polarsys.time4sys.library.LibraryFactory;
import org.polarsys.time4sys.library.LibraryPackage;
import org.polarsys.time4sys.library.RateMonotonicSchedulingPolicy;
import org.polarsys.time4sys.library.TDMA;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryFactoryImpl extends EFactoryImpl implements LibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LibraryFactory init() {
		try {
			LibraryFactory theLibraryFactory = (LibraryFactory)EPackage.Registry.INSTANCE.getEFactory(LibraryPackage.eNS_URI);
			if (theLibraryFactory != null) {
				return theLibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LibraryPackage.TDMA: return createTDMA();
			case LibraryPackage.DEADLINE_MONOTONIC_SCHEDULING_POLICY: return createDeadlineMonotonicSchedulingPolicy();
			case LibraryPackage.RATE_MONOTONIC_SCHEDULING_POLICY: return createRateMonotonicSchedulingPolicy();
			case LibraryPackage.HARDWARE_CAN_BUS: return createHardwareCANBus();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDMA createTDMA() {
		TDMAImpl tdma = new TDMAImpl();
		return tdma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeadlineMonotonicSchedulingPolicy createDeadlineMonotonicSchedulingPolicy() {
		DeadlineMonotonicSchedulingPolicyImpl deadlineMonotonicSchedulingPolicy = new DeadlineMonotonicSchedulingPolicyImpl();
		return deadlineMonotonicSchedulingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateMonotonicSchedulingPolicy createRateMonotonicSchedulingPolicy() {
		RateMonotonicSchedulingPolicyImpl rateMonotonicSchedulingPolicy = new RateMonotonicSchedulingPolicyImpl();
		return rateMonotonicSchedulingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareCANBus createHardwareCANBus() {
		HardwareCANBusImpl hardwareCANBus = new HardwareCANBusImpl();
		return hardwareCANBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryPackage getLibraryPackage() {
		return (LibraryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LibraryPackage getPackage() {
		return LibraryPackage.eINSTANCE;
	}

} //LibraryFactoryImpl
