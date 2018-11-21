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
import java.util.NoSuchElementException;
import java.util.Scanner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.time4sys.marte.nfp.*;
import org.polarsys.time4sys.marte.nfp.Bucket;
import org.polarsys.time4sys.marte.nfp.CompositeDistribution;
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
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class NfpFactoryImpl extends EFactoryImpl implements NfpFactory {
	private static final String UNIFORM_TOKEN = "uniform(";
	private static final String DISCRETE_TOKEN = "discrete(";

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
			case NfpPackage.BUCKET: return createBucket();
			case NfpPackage.COMPOSITE_DISTRIBUTION: return createCompositeDistribution();
			case NfpPackage.DATA_SIZE: return createDataSize();
			case NfpPackage.DATA_TX_RATE: return createDataTxRate();
			case NfpPackage.DISCRETE_DISTRIBUTION: return createDiscreteDistribution();
			case NfpPackage.DURATION: return createDuration();
			case NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION: return createGeneralizedExtremeValueDistribution();
			case NfpPackage.NORMAL_DISTRIBUTION: return createNormalDistribution();
			case NfpPackage.PROBABILISTIC_DURATION: return createProbabilisticDuration();
			case NfpPackage.TIME_INTERVAL: return createTimeInterval();
			case NfpPackage.UNIFORM_DISTRIBUTION: return createUniformDistribution();
			case NfpPackage.CYCLIC_DURATION: return createCyclicDuration();
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
			case NfpPackage.DATA_SIZE_UNIT_KIND:
				return createDataSizeUnitKindFromString(eDataType, initialValue);
			case NfpPackage.DATA_TX_RATE_UNIT_KIND:
				return createDataTxRateUnitKindFromString(eDataType, initialValue);
			case NfpPackage.DISCRETE_DISTRIBUTION_KIND:
				return createDiscreteDistributionKindFromString(eDataType, initialValue);
			case NfpPackage.TIME_UNIT_KIND:
				return createTimeUnitKindFromString(eDataType, initialValue);
			case NfpPackage.MATH_CONTEXT:
				return createMathContextFromString(eDataType, initialValue);
			case NfpPackage.NFP_DURATION:
				return createNFP_DurationFromString(eDataType, initialValue);
			case NfpPackage.NFP_TIME_INTERVAL:
				return createNFP_TimeIntervalFromString(eDataType, initialValue);
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
			case NfpPackage.DATA_SIZE_UNIT_KIND:
				return convertDataSizeUnitKindToString(eDataType, instanceValue);
			case NfpPackage.DATA_TX_RATE_UNIT_KIND:
				return convertDataTxRateUnitKindToString(eDataType, instanceValue);
			case NfpPackage.DISCRETE_DISTRIBUTION_KIND:
				return convertDiscreteDistributionKindToString(eDataType, instanceValue);
			case NfpPackage.TIME_UNIT_KIND:
				return convertTimeUnitKindToString(eDataType, instanceValue);
			case NfpPackage.MATH_CONTEXT:
				return convertMathContextToString(eDataType, instanceValue);
			case NfpPackage.NFP_DURATION:
				return convertNFP_DurationToString(eDataType, instanceValue);
			case NfpPackage.NFP_TIME_INTERVAL:
				return convertNFP_TimeIntervalToString(eDataType, instanceValue);
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
	
	@Override
	public TimeInterval createTimeInterval(final Duration value) {
		if (value instanceof UniformDistribution) {
			return new TimeIntervalImpl(((UniformDistribution)value).getInterval());
		}
		return new TimeIntervalImpl(value);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize createDataSize() {
		DataSizeImpl dataSize = new DataSizeImpl();
		return dataSize;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataTxRate createDataTxRate() {
		DataTxRateImpl dataTxRate = new DataTxRateImpl();
		return dataTxRate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilisticDuration createProbabilisticDuration() {
		ProbabilisticDurationImpl probabilisticDuration = new ProbabilisticDurationImpl();
		return probabilisticDuration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteDistribution createDiscreteDistribution() {
		DiscreteDistributionImpl discreteDistribution = new DiscreteDistributionImpl();
		return discreteDistribution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Bucket createBucket() {
		BucketImpl bucket = new BucketImpl();
		return bucket;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NormalDistribution createNormalDistribution() {
		NormalDistributionImpl normalDistribution = new NormalDistributionImpl();
		return normalDistribution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizedExtremeValueDistribution createGeneralizedExtremeValueDistribution() {
		GeneralizedExtremeValueDistributionImpl generalizedExtremeValueDistribution = new GeneralizedExtremeValueDistributionImpl();
		return generalizedExtremeValueDistribution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	public CyclicDuration createCyclicDuration() {
		CyclicDurationImpl cyclicDuration = new CyclicDurationImpl();
		return cyclicDuration;
	}

	public UniformDistribution createUniformDistribution(final TimeInterval value) {
		return new UniformDistributionImpl(value);
	}
	
	public UniformDistribution createUniformDistribution(final String interval) {
		return new UniformDistributionImpl(createTimeIntervalFromString(interval));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataSizeUnitKind createDataSizeUnitKindFromString(EDataType eDataType, String initialValue) {
		DataSizeUnitKind result = DataSizeUnitKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSizeUnitKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataTxRateUnitKind createDataTxRateUnitKindFromString(EDataType eDataType, String initialValue) {
		DataTxRateUnitKind result = DataTxRateUnitKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTxRateUnitKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteDistributionKind createDiscreteDistributionKindFromString(EDataType eDataType, String initialValue) {
		DiscreteDistributionKind result = DiscreteDistributionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiscreteDistributionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Duration createNFP_DurationFromString(EDataType eDataType, String initialValue) {
		return createDurationFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String convertNFP_DurationToString(EDataType eDataType, Object instanceValue) {
		assert (instanceValue == null || instanceValue instanceof Duration);
		return convertDurationToString((Duration) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval createNFP_TimeIntervalFromString(EDataType eDataType, String initialValue) {
		return (TimeInterval)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNFP_TimeIntervalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MathContext createMathContextFromString(EDataType eDataType, String initialValue) {
		return (MathContext)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathContextToString(EDataType eDataType, Object instanceValue) {
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
		//TODO implement a VSL value parser instead of this pile of hack.
		if (value != null) {
			if ("null".equals(value)) {
				return null;
			} else if ("*".equals(value) || value.endsWith("Infinity")) {
				return new DurationImpl(Double.POSITIVE_INFINITY, TimeUnitKind.PS);
			} else if (value.startsWith(UNIFORM_TOKEN)) {
				if (')' != value.charAt(value.length()-1)) {
					throw new NumberFormatException("Malformed uniform distribution:" + value);
				}
				final TimeInterval interval = createTimeIntervalFromString(value.substring(UNIFORM_TOKEN.length(), value.length()-1));
				return createUniformDistribution(interval);
			} else if (value.startsWith(DISCRETE_TOKEN)) {
				return createDiscreteDistributionFromString(value);
			}
		}
		try {
			return createSimpleOrCyclicDurationFromString(value);
		} catch(NumberFormatException e) {
			// We got it wrong, it must be an interval, thus a uniform distribution.
			final TimeInterval interval = createTimeIntervalFromString(value);
			return createUniformDistribution(interval);
		}
	}
	
	public Duration createDiscreteDistributionFromString(final String value) {
		if (value == null) {
			return LongDurationImpl.ZERO;
		}
		if (value.startsWith(DISCRETE_TOKEN)) {
			if (')' != value.charAt(value.length()-1)) {
				throw new NumberFormatException("Malformed discrete distribution:" + value);
			}
			final String params = value.substring(DISCRETE_TOKEN.length(), value.length()-1);
			final int idxComma = params.indexOf(',');
			if (idxComma == -1) {
				throw new NumberFormatException("Expected discrete([cyclic|random], {(<probability>, <duration>)...}), got " + value);
			}
			final String fisrtParam = params.substring(0, idxComma).toUpperCase();
			final DiscreteDistribution d = createDiscreteDistribution();
			if ("RANDOM".equals(fisrtParam)) {
				d.setKind(DiscreteDistributionKind.RANDOM);
			} else if ("CYCLIC".equals(fisrtParam)) {
				d.setKind(DiscreteDistributionKind.CYCLIC);
			} else {
				throw new NumberFormatException("Unexpected kind: " + fisrtParam);
			}
			String reminder = params.substring(idxComma+1).trim();
			if (reminder.charAt(0) != '{' || reminder.charAt(reminder.length()-1) != '}') {
				throw new NumberFormatException("Expected discrete([cyclic|random], {(<probability>, <duration>)...}), got " + value);
			}
			while(!reminder.isEmpty()) {
				final int startTuple = reminder.indexOf('(');
				int endTuple = reminder.indexOf(')');
				final int idxCommaTuple = reminder.indexOf(',');
				final String probaStr = reminder.substring(startTuple + 1, idxCommaTuple).trim();
				final double probability = Double.parseDouble(probaStr);
				String durationStr = reminder.substring(idxCommaTuple+1, endTuple).trim();
				if (durationStr.contains("uniform")) {
					endTuple = reminder.indexOf(')', endTuple+1);
					durationStr = reminder.substring(idxCommaTuple+1, endTuple).trim();
				}
				final Duration durationValue = createDurationFromString(durationStr);
				d.addBucket(probability, durationValue);
				reminder = reminder.substring(endTuple+1).trim();
				if (reminder.charAt(0) == '}') {
					break;
				} else if (reminder.charAt(0) != ',') {
					throw new NumberFormatException("Expected discrete([cyclic|random], {(<probability>, <duration>)...}), got " + value);
				}
				reminder = reminder.substring(1).trim();
			}
			return d;
		} else {
			throw new NumberFormatException("The input shall starts with 'discrete(', got " + value);
		}
	}
	
	@SuppressWarnings("null")
	public Duration createSimpleOrCyclicDurationFromString(final String value) {
		if (value == null) {
			return LongDurationImpl.ZERO;
		}
		String[] tab = value.split(",");
		if (tab.length==1){
			return createSimpleDurationFromString(value);
		} else {
			CyclicDuration durations = NfpFactory.eINSTANCE.createCyclicDuration();
			for (int i = 0; i < tab.length; i++) {
				durations.getDurations().add(createSimpleDurationFromString(tab[i]));
			}
			return durations;
		}
	}


	public Duration createSimpleDurationFromString(final String value) {
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
			if (u == null) {
				throw new NumberFormatException("Unexpected unit: " + ((unitStr == null) ? "null" : unitStr));
			}
			assert (u != null);
			duration = new LongDurationImpl(Double.parseDouble(valueStr), u);
		}
		return duration;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public TimeInterval createTimeIntervalFromString(final String value) {
		if (value == null || value.isEmpty()) {
			return null;
		}
		final TimeIntervalImpl anInterval = new TimeIntervalImpl();
		final char leftPar = value.charAt(0);
		if (leftPar != ']' && leftPar != '[') {
			final Duration singlePoint = createSimpleDurationFromString(value);
			anInterval.setMax(singlePoint);
			anInterval.setMin(singlePoint);
			anInterval.setMinOpen(false);
			anInterval.setMaxOpen(false);
			return anInterval;
		}
		anInterval.setMinOpen(']' == leftPar);
		final int twoDotsIdx = value.indexOf("..");
		final int semicolonIdx = value.indexOf(";");
		final int commaIdx = value.indexOf(",");
		final int sepIdx = Math.max(twoDotsIdx, Math.max(semicolonIdx, commaIdx));
		if (sepIdx == -1) {
			throw new NumberFormatException("Unexpected interval: " + value);
		}
		final String leftStr = value.substring(1, sepIdx);
		anInterval.setMin(createSimpleDurationFromString(leftStr));
		final String rightStr;
		if (sepIdx == twoDotsIdx) {
			rightStr = value.substring(twoDotsIdx + 1, value.length() - 1);
		} else {
			rightStr = value.substring(sepIdx, value.length() - 1);
		}
		anInterval.setMax(createSimpleDurationFromString(rightStr));
		final char rightPar = value.charAt(value.length() - 1);
		anInterval.setMaxOpen('[' == rightPar);
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
	public String convertDataTxRateToString(DataTxRate instanceValue) {
		if (instanceValue == null) {
			instanceValue = createDataTxRate();
		}
		return instanceValue.toString();
	}
	/**
	 * @generated NOT
	 */
	@Override
	public String convertDataSizeToString(DataSize instanceValue) {
		if (instanceValue == null) {
			instanceValue = createDataSize();
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

	/**
	 * @generated NOT
	 */
	@Override
	public DataTxRate createDataTxRateFromString(String value) {
		final DataTxRate txRate = new DataTxRateImpl();
		final Scanner scan = new Scanner(value);
		final String valueStr = scan.findInLine("\\d+(\\.\\d+)?((E|e)\\d+)?");
		String unitStr;
		try {
			unitStr = scan.next();// scan.next("\\w+");
		} catch (NoSuchElementException e) {
			// There is no units. Use default
			unitStr = "b/s";
		}
		scan.close();

		DataTxRateUnitKind unit = DataTxRateUnitKind.getByName(unitStr);
		if (unit == null) {
			unit = DataTxRateUnitKind.get(unitStr);
		}
		txRate.setValue(Double.parseDouble(valueStr));
		txRate.setUnit(unit);
		return txRate;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public DataSize createDataSizeFromString(String value) {
		// TODO Auto-generated method stub
		final DataSize dataSize = new DataSizeImpl();
		final Scanner scan = new Scanner(value);
		final String valueStr = scan.findInLine("\\d+(\\.\\d+)?((E|e)\\d+)?");
		String unitStr;
		try {
			unitStr = scan.next();// scan.next("\\w+");
		} catch (NoSuchElementException e) {
			// There is no units. Use default
			unitStr = "byte";
		}
		scan.close();

		DataSizeUnitKind unit = DataSizeUnitKind.getByName(unitStr);
		if (unit == null) {
			unit = DataSizeUnitKind.get(unitStr);
		}
		dataSize.setValue(Double.parseDouble(valueStr));
		dataSize.setUnit(unit);
		return dataSize;
	}
} // NfpFactoryImpl
