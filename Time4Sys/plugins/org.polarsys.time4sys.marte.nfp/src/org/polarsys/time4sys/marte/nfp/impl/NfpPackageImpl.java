/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work and others.
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
package org.polarsys.time4sys.marte.nfp.impl;

import java.math.MathContext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.time4sys.marte.nfp.Bucket;
import org.polarsys.time4sys.marte.nfp.CompositeDistribution;
import org.polarsys.time4sys.marte.nfp.CyclicDuration;
import org.polarsys.time4sys.marte.nfp.DataSize;
import org.polarsys.time4sys.marte.nfp.DataSizeUnitKind;
import org.polarsys.time4sys.marte.nfp.DataTxRate;
import org.polarsys.time4sys.marte.nfp.DataTxRateUnitKind;
import org.polarsys.time4sys.marte.nfp.DiscreteDistribution;
import org.polarsys.time4sys.marte.nfp.DiscreteDistributionKind;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.nfp.NormalDistribution;
import org.polarsys.time4sys.marte.nfp.ProbabilisticDuration;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;
import org.polarsys.time4sys.marte.nfp.UniformDistribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NfpPackageImpl extends EPackageImpl implements NfpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTxRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilisticDurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizedExtremeValueDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniformDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cyclicDurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataSizeUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTxRateUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum discreteDistributionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nfP_DurationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nfP_TimeIntervalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mathContextEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NfpPackageImpl() {
		super(eNS_URI, NfpFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link NfpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NfpPackage init() {
		if (isInited) return (NfpPackage)EPackage.Registry.INSTANCE.getEPackage(NfpPackage.eNS_URI);

		// Obtain or create and register package
		NfpPackageImpl theNfpPackage = (NfpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NfpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NfpPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theNfpPackage.createPackageContents();

		// Initialize created meta-data
		theNfpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNfpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NfpPackage.eNS_URI, theNfpPackage);
		return theNfpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuration() {
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Value() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Unit() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Best() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Worst() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Clock() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Precision() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Add__Duration() {
		return durationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__ConvertToUnit__TimeUnitKind() {
		return durationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Simplify() {
		return durationEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Sub__Duration() {
		return durationEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__CompareTo__Duration() {
		return durationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__IsZero() {
		return durationEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__NotZero() {
		return durationEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Max__Duration() {
		return durationEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Min__Duration() {
		return durationEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Multiply__long() {
		return durationEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Lcm__Duration() {
		return durationEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Div__Duration() {
		return durationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Div__Duration_MathContext() {
		return durationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Divide__Duration() {
		return durationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Divide__long() {
		return durationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeInterval() {
		return timeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeInterval_Min() {
		return (EReference)timeIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeInterval_Max() {
		return (EReference)timeIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInterval_MinOpen() {
		return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInterval_MaxOpen() {
		return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__ComputeLength() {
		return timeIntervalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__Contains__Duration() {
		return timeIntervalEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__ConvertToUnit__TimeUnitKind() {
		return timeIntervalEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__Add__TimeInterval() {
		return timeIntervalEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__Divide__long() {
		return timeIntervalEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__Max__Duration() {
		return timeIntervalEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__Min__Duration() {
		return timeIntervalEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__Multiply__long() {
		return timeIntervalEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__Sub__TimeInterval() {
		return timeIntervalEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSize() {
		return dataSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSize_Value() {
		return (EAttribute)dataSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSize_Unit() {
		return (EAttribute)dataSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__Add__DataSize() {
		return dataSizeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__CompareTo__DataSize() {
		return dataSizeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__ConvertToUnit__DataSizeUnitKind() {
		return dataSizeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__Div__DataSize() {
		return dataSizeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__Divide__DataSize() {
		return dataSizeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__IsZero() {
		return dataSizeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__Lcm__DataSize() {
		return dataSizeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__Max__DataSize() {
		return dataSizeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__Min__DataSize() {
		return dataSizeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__Multiply__long() {
		return dataSizeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__NotZero() {
		return dataSizeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__Simplify() {
		return dataSizeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__Sub__DataSize() {
		return dataSizeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTxRate() {
		return dataTxRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTxRate_Value() {
		return (EAttribute)dataTxRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTxRate_Unit() {
		return (EAttribute)dataTxRateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataTxRate__Add__DataTxRate() {
		return dataTxRateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataTxRate__CompareTo__DataTxRate() {
		return dataTxRateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataTxRate__ConvertToUnit__DataTxRateUnitKind() {
		return dataTxRateEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataTxRate__Div__DataTxRate() {
		return dataTxRateEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataTxRate__Divide__DataTxRate() {
		return dataTxRateEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataTxRate__IsZero() {
		return dataTxRateEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataTxRate__Lcm__DataTxRate() {
		return dataTxRateEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataTxRate__Max__DataTxRate() {
		return dataTxRateEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataTxRate__Min__DataTxRate() {
		return dataTxRateEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataTxRate__Multiply__long() {
		return dataTxRateEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataTxRate__NotZero() {
		return dataTxRateEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataTxRate__Simplify() {
		return dataTxRateEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataTxRate__Sub__DataTxRate() {
		return dataTxRateEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbabilisticDuration() {
		return probabilisticDurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteDistribution() {
		return discreteDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteDistribution_Buckets() {
		return (EReference)discreteDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteDistribution_Kind() {
		return (EAttribute)discreteDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBucket() {
		return bucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBucket_Probability() {
		return (EAttribute)bucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBucket_Value() {
		return (EAttribute)bucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalDistribution() {
		return normalDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalDistribution_Mu() {
		return (EAttribute)normalDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalDistribution_Sigma() {
		return (EAttribute)normalDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizedExtremeValueDistribution() {
		return generalizedExtremeValueDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizedExtremeValueDistribution_Mu() {
		return (EAttribute)generalizedExtremeValueDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizedExtremeValueDistribution_Sigma() {
		return (EAttribute)generalizedExtremeValueDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizedExtremeValueDistribution_Xi() {
		return (EAttribute)generalizedExtremeValueDistributionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniformDistribution() {
		return uniformDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniformDistribution_Interval() {
		return (EAttribute)uniformDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCyclicDuration() {
		return cyclicDurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCyclicDuration_Durations() {
		return (EReference)cyclicDurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeDistribution() {
		return compositeDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeDistribution_Parts() {
		return (EReference)compositeDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnitKind() {
		return timeUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataSizeUnitKind() {
		return dataSizeUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataTxRateUnitKind() {
		return dataTxRateUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiscreteDistributionKind() {
		return discreteDistributionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNFP_Duration() {
		return nfP_DurationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNFP_TimeInterval() {
		return nfP_TimeIntervalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMathContext() {
		return mathContextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NfpFactory getNfpFactory() {
		return (NfpFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bucketEClass = createEClass(BUCKET);
		createEAttribute(bucketEClass, BUCKET__PROBABILITY);
		createEAttribute(bucketEClass, BUCKET__VALUE);

		compositeDistributionEClass = createEClass(COMPOSITE_DISTRIBUTION);
		createEReference(compositeDistributionEClass, COMPOSITE_DISTRIBUTION__PARTS);

		dataSizeEClass = createEClass(DATA_SIZE);
		createEAttribute(dataSizeEClass, DATA_SIZE__VALUE);
		createEAttribute(dataSizeEClass, DATA_SIZE__UNIT);
		createEOperation(dataSizeEClass, DATA_SIZE___ADD__DATASIZE);
		createEOperation(dataSizeEClass, DATA_SIZE___COMPARE_TO__DATASIZE);
		createEOperation(dataSizeEClass, DATA_SIZE___CONVERT_TO_UNIT__DATASIZEUNITKIND);
		createEOperation(dataSizeEClass, DATA_SIZE___DIV__DATASIZE);
		createEOperation(dataSizeEClass, DATA_SIZE___DIVIDE__DATASIZE);
		createEOperation(dataSizeEClass, DATA_SIZE___IS_ZERO);
		createEOperation(dataSizeEClass, DATA_SIZE___LCM__DATASIZE);
		createEOperation(dataSizeEClass, DATA_SIZE___MAX__DATASIZE);
		createEOperation(dataSizeEClass, DATA_SIZE___MIN__DATASIZE);
		createEOperation(dataSizeEClass, DATA_SIZE___MULTIPLY__LONG);
		createEOperation(dataSizeEClass, DATA_SIZE___NOT_ZERO);
		createEOperation(dataSizeEClass, DATA_SIZE___SIMPLIFY);
		createEOperation(dataSizeEClass, DATA_SIZE___SUB__DATASIZE);

		dataTxRateEClass = createEClass(DATA_TX_RATE);
		createEAttribute(dataTxRateEClass, DATA_TX_RATE__VALUE);
		createEAttribute(dataTxRateEClass, DATA_TX_RATE__UNIT);
		createEOperation(dataTxRateEClass, DATA_TX_RATE___ADD__DATATXRATE);
		createEOperation(dataTxRateEClass, DATA_TX_RATE___COMPARE_TO__DATATXRATE);
		createEOperation(dataTxRateEClass, DATA_TX_RATE___CONVERT_TO_UNIT__DATATXRATEUNITKIND);
		createEOperation(dataTxRateEClass, DATA_TX_RATE___DIV__DATATXRATE);
		createEOperation(dataTxRateEClass, DATA_TX_RATE___DIVIDE__DATATXRATE);
		createEOperation(dataTxRateEClass, DATA_TX_RATE___IS_ZERO);
		createEOperation(dataTxRateEClass, DATA_TX_RATE___LCM__DATATXRATE);
		createEOperation(dataTxRateEClass, DATA_TX_RATE___MAX__DATATXRATE);
		createEOperation(dataTxRateEClass, DATA_TX_RATE___MIN__DATATXRATE);
		createEOperation(dataTxRateEClass, DATA_TX_RATE___MULTIPLY__LONG);
		createEOperation(dataTxRateEClass, DATA_TX_RATE___NOT_ZERO);
		createEOperation(dataTxRateEClass, DATA_TX_RATE___SIMPLIFY);
		createEOperation(dataTxRateEClass, DATA_TX_RATE___SUB__DATATXRATE);

		discreteDistributionEClass = createEClass(DISCRETE_DISTRIBUTION);
		createEReference(discreteDistributionEClass, DISCRETE_DISTRIBUTION__BUCKETS);
		createEAttribute(discreteDistributionEClass, DISCRETE_DISTRIBUTION__KIND);

		durationEClass = createEClass(DURATION);
		createEAttribute(durationEClass, DURATION__VALUE);
		createEAttribute(durationEClass, DURATION__UNIT);
		createEAttribute(durationEClass, DURATION__BEST);
		createEAttribute(durationEClass, DURATION__WORST);
		createEAttribute(durationEClass, DURATION__CLOCK);
		createEAttribute(durationEClass, DURATION__PRECISION);
		createEOperation(durationEClass, DURATION___ADD__DURATION);
		createEOperation(durationEClass, DURATION___COMPARE_TO__DURATION);
		createEOperation(durationEClass, DURATION___CONVERT_TO_UNIT__TIMEUNITKIND);
		createEOperation(durationEClass, DURATION___DIV__DURATION);
		createEOperation(durationEClass, DURATION___DIV__DURATION_MATHCONTEXT);
		createEOperation(durationEClass, DURATION___DIVIDE__DURATION);
		createEOperation(durationEClass, DURATION___DIVIDE__LONG);
		createEOperation(durationEClass, DURATION___IS_ZERO);
		createEOperation(durationEClass, DURATION___LCM__DURATION);
		createEOperation(durationEClass, DURATION___MAX__DURATION);
		createEOperation(durationEClass, DURATION___MIN__DURATION);
		createEOperation(durationEClass, DURATION___MULTIPLY__LONG);
		createEOperation(durationEClass, DURATION___NOT_ZERO);
		createEOperation(durationEClass, DURATION___SIMPLIFY);
		createEOperation(durationEClass, DURATION___SUB__DURATION);

		generalizedExtremeValueDistributionEClass = createEClass(GENERALIZED_EXTREME_VALUE_DISTRIBUTION);
		createEAttribute(generalizedExtremeValueDistributionEClass, GENERALIZED_EXTREME_VALUE_DISTRIBUTION__MU);
		createEAttribute(generalizedExtremeValueDistributionEClass, GENERALIZED_EXTREME_VALUE_DISTRIBUTION__SIGMA);
		createEAttribute(generalizedExtremeValueDistributionEClass, GENERALIZED_EXTREME_VALUE_DISTRIBUTION__XI);

		normalDistributionEClass = createEClass(NORMAL_DISTRIBUTION);
		createEAttribute(normalDistributionEClass, NORMAL_DISTRIBUTION__MU);
		createEAttribute(normalDistributionEClass, NORMAL_DISTRIBUTION__SIGMA);

		probabilisticDurationEClass = createEClass(PROBABILISTIC_DURATION);

		timeIntervalEClass = createEClass(TIME_INTERVAL);
		createEReference(timeIntervalEClass, TIME_INTERVAL__MIN);
		createEReference(timeIntervalEClass, TIME_INTERVAL__MAX);
		createEAttribute(timeIntervalEClass, TIME_INTERVAL__MIN_OPEN);
		createEAttribute(timeIntervalEClass, TIME_INTERVAL__MAX_OPEN);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___COMPUTE_LENGTH);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___CONTAINS__DURATION);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___CONVERT_TO_UNIT__TIMEUNITKIND);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___ADD__TIMEINTERVAL);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___DIVIDE__LONG);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___MAX__DURATION);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___MIN__DURATION);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___MULTIPLY__LONG);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___SUB__TIMEINTERVAL);

		uniformDistributionEClass = createEClass(UNIFORM_DISTRIBUTION);
		createEAttribute(uniformDistributionEClass, UNIFORM_DISTRIBUTION__INTERVAL);

		cyclicDurationEClass = createEClass(CYCLIC_DURATION);
		createEReference(cyclicDurationEClass, CYCLIC_DURATION__DURATIONS);

		// Create enums
		dataSizeUnitKindEEnum = createEEnum(DATA_SIZE_UNIT_KIND);
		dataTxRateUnitKindEEnum = createEEnum(DATA_TX_RATE_UNIT_KIND);
		discreteDistributionKindEEnum = createEEnum(DISCRETE_DISTRIBUTION_KIND);
		timeUnitKindEEnum = createEEnum(TIME_UNIT_KIND);

		// Create data types
		mathContextEDataType = createEDataType(MATH_CONTEXT);
		nfP_DurationEDataType = createEDataType(NFP_DURATION);
		nfP_TimeIntervalEDataType = createEDataType(NFP_TIME_INTERVAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeDistributionEClass.getESuperTypes().add(this.getProbabilisticDuration());
		discreteDistributionEClass.getESuperTypes().add(this.getProbabilisticDuration());
		generalizedExtremeValueDistributionEClass.getESuperTypes().add(this.getProbabilisticDuration());
		normalDistributionEClass.getESuperTypes().add(this.getProbabilisticDuration());
		probabilisticDurationEClass.getESuperTypes().add(this.getDuration());
		uniformDistributionEClass.getESuperTypes().add(this.getProbabilisticDuration());
		cyclicDurationEClass.getESuperTypes().add(this.getDuration());

		// Initialize classes, features, and operations; add parameters
		initEClass(bucketEClass, Bucket.class, "Bucket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBucket_Probability(), ecorePackage.getEDouble(), "probability", null, 1, 1, Bucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBucket_Value(), this.getNFP_Duration(), "value", null, 1, 1, Bucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeDistributionEClass, CompositeDistribution.class, "CompositeDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeDistribution_Parts(), this.getProbabilisticDuration(), null, "parts", null, 1, -1, CompositeDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSizeEClass, DataSize.class, "DataSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSize_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, DataSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSize_Unit(), this.getDataSizeUnitKind(), "unit", "BYTE", 1, 1, DataSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDataSize__Add__DataSize(), this.getDataSize(), "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataSize(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSize__CompareTo__DataSize(), ecorePackage.getEInt(), "compareTo", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataSize(), "anotherDuration", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSize__ConvertToUnit__DataSizeUnitKind(), this.getDataSize(), "convertToUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataSizeUnitKind(), "unit", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSize__Div__DataSize(), ecorePackage.getEDouble(), "div", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataSize(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSize__Divide__DataSize(), ecorePackage.getELong(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataSize(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSize__IsZero(), ecorePackage.getEBoolean(), "isZero", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSize__Lcm__DataSize(), this.getDataSize(), "lcm", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataSize(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSize__Max__DataSize(), this.getDataSize(), "max", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataSize(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSize__Min__DataSize(), this.getDataSize(), "min", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataSize(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSize__Multiply__long(), this.getDataSize(), "multiply", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSize__NotZero(), ecorePackage.getEBoolean(), "notZero", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSize__Simplify(), this.getDataSize(), "simplify", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSize__Sub__DataSize(), this.getDataSize(), "sub", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataSize(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataTxRateEClass, DataTxRate.class, "DataTxRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTxRate_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, DataTxRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTxRate_Unit(), this.getDataTxRateUnitKind(), "unit", "b/s", 1, 1, DataTxRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDataTxRate__Add__DataTxRate(), this.getDataTxRate(), "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTxRate(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataTxRate__CompareTo__DataTxRate(), ecorePackage.getEInt(), "compareTo", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTxRate(), "anotherDuration", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataTxRate__ConvertToUnit__DataTxRateUnitKind(), this.getDataTxRate(), "convertToUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTxRateUnitKind(), "unit", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataTxRate__Div__DataTxRate(), ecorePackage.getEDouble(), "div", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTxRate(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataTxRate__Divide__DataTxRate(), ecorePackage.getELong(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTxRate(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataTxRate__IsZero(), ecorePackage.getEBoolean(), "isZero", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataTxRate__Lcm__DataTxRate(), this.getDataTxRate(), "lcm", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTxRate(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataTxRate__Max__DataTxRate(), this.getDataTxRate(), "max", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTxRate(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataTxRate__Min__DataTxRate(), this.getDataTxRate(), "min", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTxRate(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataTxRate__Multiply__long(), this.getDataTxRate(), "multiply", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataTxRate__NotZero(), ecorePackage.getEBoolean(), "notZero", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataTxRate__Simplify(), this.getDataTxRate(), "simplify", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataTxRate__Sub__DataTxRate(), this.getDataTxRate(), "sub", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTxRate(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(discreteDistributionEClass, DiscreteDistribution.class, "DiscreteDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscreteDistribution_Buckets(), this.getBucket(), null, "buckets", null, 1, -1, DiscreteDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteDistribution_Kind(), this.getDiscreteDistributionKind(), "kind", "Undef", 1, 1, DiscreteDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDuration_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Unit(), this.getTimeUnitKind(), "unit", "millisecond", 1, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Best(), ecorePackage.getEDouble(), "best", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Worst(), ecorePackage.getEDouble(), "worst", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Clock(), ecorePackage.getEString(), "clock", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Precision(), ecorePackage.getEDouble(), "precision", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDuration__Add__Duration(), this.getDuration(), "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__CompareTo__Duration(), ecorePackage.getEInt(), "compareTo", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "anotherDuration", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__ConvertToUnit__TimeUnitKind(), this.getDuration(), "convertToUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeUnitKind(), "unit", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__Div__Duration(), ecorePackage.getEDouble(), "div", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__Div__Duration_MathContext(), ecorePackage.getEDouble(), "div", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMathContext(), "mc", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__Divide__Duration(), ecorePackage.getELong(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__Divide__long(), this.getDuration(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDuration__IsZero(), ecorePackage.getEBoolean(), "isZero", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__Lcm__Duration(), this.getDuration(), "lcm", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__Max__Duration(), this.getDuration(), "max", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__Min__Duration(), this.getDuration(), "min", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__Multiply__long(), this.getDuration(), "multiply", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDuration__NotZero(), ecorePackage.getEBoolean(), "notZero", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDuration__Simplify(), this.getDuration(), "simplify", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__Sub__Duration(), this.getDuration(), "sub", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(generalizedExtremeValueDistributionEClass, GeneralizedExtremeValueDistribution.class, "GeneralizedExtremeValueDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralizedExtremeValueDistribution_Mu(), this.getNFP_Duration(), "mu", null, 1, 1, GeneralizedExtremeValueDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizedExtremeValueDistribution_Sigma(), this.getNFP_Duration(), "sigma", null, 1, 1, GeneralizedExtremeValueDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizedExtremeValueDistribution_Xi(), this.getNFP_Duration(), "xi", null, 1, 1, GeneralizedExtremeValueDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalDistributionEClass, NormalDistribution.class, "NormalDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNormalDistribution_Mu(), this.getNFP_Duration(), "mu", null, 1, 1, NormalDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormalDistribution_Sigma(), this.getNFP_Duration(), "sigma", null, 1, 1, NormalDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probabilisticDurationEClass, ProbabilisticDuration.class, "ProbabilisticDuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeInterval_Min(), this.getDuration(), null, "min", null, 1, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeInterval_Max(), this.getDuration(), null, "max", null, 1, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeInterval_MinOpen(), ecorePackage.getEBoolean(), "minOpen", "false", 1, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeInterval_MaxOpen(), ecorePackage.getEBoolean(), "maxOpen", "false", 1, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTimeInterval__ComputeLength(), this.getDuration(), "computeLength", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__Contains__Duration(), ecorePackage.getEBoolean(), "contains", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__ConvertToUnit__TimeUnitKind(), this.getTimeInterval(), "convertToUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeUnitKind(), "unit", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__Add__TimeInterval(), this.getTimeInterval(), "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeInterval(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__Divide__long(), this.getTimeInterval(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__Max__Duration(), this.getDuration(), "max", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__Min__Duration(), this.getDuration(), "min", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__Multiply__long(), this.getTimeInterval(), "multiply", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__Sub__TimeInterval(), this.getTimeInterval(), "sub", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeInterval(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(uniformDistributionEClass, UniformDistribution.class, "UniformDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniformDistribution_Interval(), this.getNFP_TimeInterval(), "interval", null, 1, 1, UniformDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cyclicDurationEClass, CyclicDuration.class, "CyclicDuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCyclicDuration_Durations(), this.getDuration(), null, "durations", null, 0, -1, CyclicDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataSizeUnitKindEEnum, DataSizeUnitKind.class, "DataSizeUnitKind");
		addEEnumLiteral(dataSizeUnitKindEEnum, DataSizeUnitKind.BIT);
		addEEnumLiteral(dataSizeUnitKindEEnum, DataSizeUnitKind.BYTE);
		addEEnumLiteral(dataSizeUnitKindEEnum, DataSizeUnitKind.KB);
		addEEnumLiteral(dataSizeUnitKindEEnum, DataSizeUnitKind.MB);
		addEEnumLiteral(dataSizeUnitKindEEnum, DataSizeUnitKind.GB);

		initEEnum(dataTxRateUnitKindEEnum, DataTxRateUnitKind.class, "DataTxRateUnitKind");
		addEEnumLiteral(dataTxRateUnitKindEEnum, DataTxRateUnitKind.BPER_S);
		addEEnumLiteral(dataTxRateUnitKindEEnum, DataTxRateUnitKind.KB_PER_S);
		addEEnumLiteral(dataTxRateUnitKindEEnum, DataTxRateUnitKind.MB_PER_S);

		initEEnum(discreteDistributionKindEEnum, DiscreteDistributionKind.class, "DiscreteDistributionKind");
		addEEnumLiteral(discreteDistributionKindEEnum, DiscreteDistributionKind.UNDEF);
		addEEnumLiteral(discreteDistributionKindEEnum, DiscreteDistributionKind.RANDOM);
		addEEnumLiteral(discreteDistributionKindEEnum, DiscreteDistributionKind.CYCLIC);

		initEEnum(timeUnitKindEEnum, TimeUnitKind.class, "TimeUnitKind");
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.PS);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.NS);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.US);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.MS);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.S);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.MN);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.H);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.D);

		// Initialize data types
		initEDataType(mathContextEDataType, MathContext.class, "MathContext", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nfP_DurationEDataType, Duration.class, "NFP_Duration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nfP_TimeIntervalEDataType, TimeInterval.class, "NFP_TimeInterval", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //NfpPackageImpl
