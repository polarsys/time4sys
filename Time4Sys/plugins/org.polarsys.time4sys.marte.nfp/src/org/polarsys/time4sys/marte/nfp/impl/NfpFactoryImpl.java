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
package org.polarsys.time4sys.marte.nfp.impl;

import java.util.NoSuchElementException;
import java.util.Scanner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.time4sys.marte.nfp.*;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class NfpFactoryImpl extends EFactoryImpl implements NfpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static NfpFactory init() {
		try {
			NfpFactory theNfpFactory = (NfpFactory)EPackage.Registry.INSTANCE.getEFactory(NfpPackage.eNS_URI);
			if (theNfpFactory != null) {
				return theNfpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NfpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public NfpFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NfpPackage.DURATION: return createDuration();
			case NfpPackage.TIME_INTERVAL: return createTimeInterval();
			case NfpPackage.DATA_SIZE: return createDataSize();
			case NfpPackage.PROBABILISTIC_DURATION: return createProbabilisticDuration();
			case NfpPackage.DISCRETE_DISTRIBUTION: return createDiscreteDistribution();
			case NfpPackage.BUCKET: return createBucket();
			case NfpPackage.NORMAL_DISTRIBUTION: return createNormalDistribution();
			case NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION: return createGeneralizedExtremeValueDistribution();
			case NfpPackage.UNIFORM_DISTRIBUTION: return createUniformDistribution();
			case NfpPackage.COMPOSITE_DISTRIBUTION: return createCompositeDistribution();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case NfpPackage.TIME_UNIT_KIND:
				return createTimeUnitKindFromString(eDataType, initialValue);
			case NfpPackage.DATA_SIZE_UNIT_KIND:
				return createDataSizeUnitKindFromString(eDataType, initialValue);
			case NfpPackage.NFP_DURATION:
				return createNFP_DurationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case NfpPackage.TIME_UNIT_KIND:
				return convertTimeUnitKindToString(eDataType, instanceValue);
			case NfpPackage.DATA_SIZE_UNIT_KIND:
				return convertDataSizeUnitKindToString(eDataType, instanceValue);
			case NfpPackage.NFP_DURATION:
				return convertNFP_DurationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Duration createDuration() {
		DurationImpl duration = new LongDurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval createTimeInterval() {
		TimeIntervalImpl timeInterval = new TimeIntervalImpl();
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize createDataSize() {
		DataSizeImpl dataSize = new DataSizeImpl();
		return dataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilisticDuration createProbabilisticDuration() {
		ProbabilisticDurationImpl probabilisticDuration = new ProbabilisticDurationImpl();
		return probabilisticDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteDistribution createDiscreteDistribution() {
		DiscreteDistributionImpl discreteDistribution = new DiscreteDistributionImpl();
		return discreteDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bucket createBucket() {
		BucketImpl bucket = new BucketImpl();
		return bucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalDistribution createNormalDistribution() {
		NormalDistributionImpl normalDistribution = new NormalDistributionImpl();
		return normalDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizedExtremeValueDistribution createGeneralizedExtremeValueDistribution() {
		GeneralizedExtremeValueDistributionImpl generalizedExtremeValueDistribution = new GeneralizedExtremeValueDistributionImpl();
		return generalizedExtremeValueDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformDistribution createUniformDistribution() {
		UniformDistributionImpl uniformDistribution = new UniformDistributionImpl();
		return uniformDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDistribution createCompositeDistribution() {
		CompositeDistributionImpl compositeDistribution = new CompositeDistributionImpl();
		return compositeDistribution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnitKind createTimeUnitKindFromString(EDataType eDataType, String initialValue) {
		TimeUnitKind result = TimeUnitKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSizeUnitKind createDataSizeUnitKindFromString(EDataType eDataType, String initialValue) {
		DataSizeUnitKind result = DataSizeUnitKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSizeUnitKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createNFP_DurationFromString(EDataType eDataType, String initialValue) {
		return (Duration)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNFP_DurationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NfpPackage getNfpPackage() {
		return (NfpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NfpPackage getPackage() {
		return NfpPackage.eINSTANCE;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public Duration createDurationFromString(final String value) {
		if (value == null) {
			return LongDurationImpl.ZERO;
		}
		final Scanner scan = new Scanner(value);
		final String valueStr = scan.findInLine("\\d+(\\.\\d+)?((E|e)\\d+)?");
		String unitStr;
		try {
			unitStr = scan.next();// scan.next("\\w+");
		} catch (NoSuchElementException e) {
			// There is no units. Use default
			unitStr = "ms";
		}
		scan.close();

		final DurationImpl duration;
		TimeUnitKind u = TimeUnitKind.getByName(unitStr);
		if (u == null) {
			u = TimeUnitKind.get(unitStr);
		}
		if (valueStr == null) {
			duration = LongDurationImpl.ZERO;
		} else {
			assert(u != null);
			duration = new LongDurationImpl(Double.parseDouble(valueStr), u);
		}
		return duration;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public TimeInterval createTimeIntervalFromString(final String value) {
		final TimeIntervalImpl anInterval = new TimeIntervalImpl();
		final Scanner scan = new Scanner(value);
		final String leftPar = scan.findInLine("\\]|\\[");
		anInterval.setMinOpen("]".equals(leftPar));
		final String leftStr = scan.findInLine("[^,]*");
		anInterval.setMin(createDurationFromString(leftStr));
		scan.findInLine(",");
		String rightStr = scan.findInLine("[^\\]\\[]*");
		if (rightStr == null) {
			rightStr = leftStr;
		}
		anInterval.setMax(createDurationFromString(rightStr));
		final String rightPar = scan.findInLine("\\]|\\[");
		anInterval.setMaxOpen("[".equals(rightPar));
		scan.close();
		return anInterval;
	}

	public static String convertDoubleToString(double v) {
		final String nominalStr = Double.toString(v);
		int pointIdx = nominalStr.indexOf('.');
		if (pointIdx == -1) {
			return nominalStr;
		}
		final String reducedStr = nominalStr.substring(0, pointIdx);
		final double vv = Double.parseDouble(reducedStr);
		if (Double.doubleToRawLongBits(v) == Double.doubleToRawLongBits(vv)) {
			return reducedStr;
		} else {
			return nominalStr;
		}
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String convertDurationToString(Duration instanceValue) {
		if (instanceValue == null) {
			instanceValue = createDuration();
		}
		return instanceValue.toString();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String convertTimeIntervalToString(TimeInterval instanceValue) {
		if (instanceValue == null) {
			instanceValue = createTimeInterval();
		}
		return instanceValue.toString();
	}

} // NfpFactoryImpl
