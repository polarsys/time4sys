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
package org.polarsys.time4sys.marte.nfp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.nfp.NfpFactory
 * @model kind="package"
 * @generated
 */
public interface NfpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nfp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/marte/nfp/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nfp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NfpPackage eINSTANCE = org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.impl.DurationImpl
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 5;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.impl.TimeIntervalImpl
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getTimeInterval()
	 * @generated
	 */
	int TIME_INTERVAL = 9;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.impl.DataSizeImpl <em>Data Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.impl.DataSizeImpl
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getDataSize()
	 * @generated
	 */
	int DATA_SIZE = 2;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.impl.DataTxRateImpl <em>Data Tx Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.impl.DataTxRateImpl
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getDataTxRate()
	 * @generated
	 */
	int DATA_TX_RATE = 3;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.impl.ProbabilisticDurationImpl <em>Probabilistic Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.impl.ProbabilisticDurationImpl
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getProbabilisticDuration()
	 * @generated
	 */
	int PROBABILISTIC_DURATION = 8;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.impl.DiscreteDistributionImpl <em>Discrete Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.impl.DiscreteDistributionImpl
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getDiscreteDistribution()
	 * @generated
	 */
	int DISCRETE_DISTRIBUTION = 4;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.impl.BucketImpl <em>Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.impl.BucketImpl
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getBucket()
	 * @generated
	 */
	int BUCKET = 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET__PROBABILITY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__MAX = 1;

	/**
	 * The feature id for the '<em><b>Min Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__MIN_OPEN = 2;

	/**
	 * The feature id for the '<em><b>Max Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__MAX_OPEN = 3;

	/**
	 * The number of structural features of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Compute Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___COMPUTE_LENGTH = 0;

	/**
	 * The number of operations of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION__MIN = TIME_INTERVAL__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION__MAX = TIME_INTERVAL__MAX;

	/**
	 * The feature id for the '<em><b>Min Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION__MIN_OPEN = TIME_INTERVAL__MIN_OPEN;

	/**
	 * The feature id for the '<em><b>Max Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION__MAX_OPEN = TIME_INTERVAL__MAX_OPEN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION__VALUE = TIME_INTERVAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION__UNIT = TIME_INTERVAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION__BEST = TIME_INTERVAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION__WORST = TIME_INTERVAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION__CLOCK = TIME_INTERVAL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION__PRECISION = TIME_INTERVAL_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Probabilistic Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION_FEATURE_COUNT = TIME_INTERVAL_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Compute Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION___COMPUTE_LENGTH = TIME_INTERVAL___COMPUTE_LENGTH;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION___ADD__DURATION = TIME_INTERVAL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION___COMPARE_TO__DURATION = TIME_INTERVAL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Convert To Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION___CONVERT_TO_UNIT__TIMEUNITKIND = TIME_INTERVAL_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION___DIV__DURATION = TIME_INTERVAL_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION___DIV__DURATION_MATHCONTEXT = TIME_INTERVAL_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Divide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION___DIVIDE__DURATION = TIME_INTERVAL_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Divide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION___DIVIDE__LONG = TIME_INTERVAL_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION___IS_ZERO = TIME_INTERVAL_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Lcm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION___LCM__DURATION = TIME_INTERVAL_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Max</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION___MAX__DURATION = TIME_INTERVAL_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Min</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION___MIN__DURATION = TIME_INTERVAL_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Multiply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION___MULTIPLY__LONG = TIME_INTERVAL_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Not Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION___NOT_ZERO = TIME_INTERVAL_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Simplify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION___SIMPLIFY = TIME_INTERVAL_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Sub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION___SUB__DURATION = TIME_INTERVAL_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Probabilistic Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_DURATION_OPERATION_COUNT = TIME_INTERVAL_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.impl.NormalDistributionImpl <em>Normal Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.impl.NormalDistributionImpl
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getNormalDistribution()
	 * @generated
	 */
	int NORMAL_DISTRIBUTION = 7;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.impl.GeneralizedExtremeValueDistributionImpl <em>Generalized Extreme Value Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.impl.GeneralizedExtremeValueDistributionImpl
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getGeneralizedExtremeValueDistribution()
	 * @generated
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION = 6;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.impl.UniformDistributionImpl <em>Uniform Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.impl.UniformDistributionImpl
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getUniformDistribution()
	 * @generated
	 */
	int UNIFORM_DISTRIBUTION = 10;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.impl.CompositeDistributionImpl <em>Composite Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.impl.CompositeDistributionImpl
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getCompositeDistribution()
	 * @generated
	 */
	int COMPOSITE_DISTRIBUTION = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION__MIN = PROBABILISTIC_DURATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION__MAX = PROBABILISTIC_DURATION__MAX;

	/**
	 * The feature id for the '<em><b>Min Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION__MIN_OPEN = PROBABILISTIC_DURATION__MIN_OPEN;

	/**
	 * The feature id for the '<em><b>Max Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION__MAX_OPEN = PROBABILISTIC_DURATION__MAX_OPEN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION__VALUE = PROBABILISTIC_DURATION__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION__UNIT = PROBABILISTIC_DURATION__UNIT;

	/**
	 * The feature id for the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION__BEST = PROBABILISTIC_DURATION__BEST;

	/**
	 * The feature id for the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION__WORST = PROBABILISTIC_DURATION__WORST;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION__CLOCK = PROBABILISTIC_DURATION__CLOCK;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION__PRECISION = PROBABILISTIC_DURATION__PRECISION;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION__PARTS = PROBABILISTIC_DURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION_FEATURE_COUNT = PROBABILISTIC_DURATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION___COMPUTE_LENGTH = PROBABILISTIC_DURATION___COMPUTE_LENGTH;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION___ADD__DURATION = PROBABILISTIC_DURATION___ADD__DURATION;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION___COMPARE_TO__DURATION = PROBABILISTIC_DURATION___COMPARE_TO__DURATION;

	/**
	 * The operation id for the '<em>Convert To Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION___CONVERT_TO_UNIT__TIMEUNITKIND = PROBABILISTIC_DURATION___CONVERT_TO_UNIT__TIMEUNITKIND;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION___DIV__DURATION = PROBABILISTIC_DURATION___DIV__DURATION;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION___DIV__DURATION_MATHCONTEXT = PROBABILISTIC_DURATION___DIV__DURATION_MATHCONTEXT;

	/**
	 * The operation id for the '<em>Divide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION___DIVIDE__DURATION = PROBABILISTIC_DURATION___DIVIDE__DURATION;

	/**
	 * The operation id for the '<em>Divide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION___DIVIDE__LONG = PROBABILISTIC_DURATION___DIVIDE__LONG;

	/**
	 * The operation id for the '<em>Is Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION___IS_ZERO = PROBABILISTIC_DURATION___IS_ZERO;

	/**
	 * The operation id for the '<em>Lcm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION___LCM__DURATION = PROBABILISTIC_DURATION___LCM__DURATION;

	/**
	 * The operation id for the '<em>Max</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION___MAX__DURATION = PROBABILISTIC_DURATION___MAX__DURATION;

	/**
	 * The operation id for the '<em>Min</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION___MIN__DURATION = PROBABILISTIC_DURATION___MIN__DURATION;

	/**
	 * The operation id for the '<em>Multiply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION___MULTIPLY__LONG = PROBABILISTIC_DURATION___MULTIPLY__LONG;

	/**
	 * The operation id for the '<em>Not Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION___NOT_ZERO = PROBABILISTIC_DURATION___NOT_ZERO;

	/**
	 * The operation id for the '<em>Simplify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION___SIMPLIFY = PROBABILISTIC_DURATION___SIMPLIFY;

	/**
	 * The operation id for the '<em>Sub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION___SUB__DURATION = PROBABILISTIC_DURATION___SUB__DURATION;

	/**
	 * The number of operations of the '<em>Composite Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DISTRIBUTION_OPERATION_COUNT = PROBABILISTIC_DURATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Data Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___ADD__DATASIZE = 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___COMPARE_TO__DATASIZE = 1;

	/**
	 * The operation id for the '<em>Convert To Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___CONVERT_TO_UNIT__DATASIZEUNITKIND = 2;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___DIV__DATASIZE = 3;

	/**
	 * The operation id for the '<em>Divide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___DIVIDE__DATASIZE = 4;

	/**
	 * The operation id for the '<em>Is Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___IS_ZERO = 5;

	/**
	 * The operation id for the '<em>Lcm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___LCM__DATASIZE = 6;

	/**
	 * The operation id for the '<em>Max</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___MAX__DATASIZE = 7;

	/**
	 * The operation id for the '<em>Min</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___MIN__DATASIZE = 8;

	/**
	 * The operation id for the '<em>Multiply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___MULTIPLY__LONG = 9;

	/**
	 * The operation id for the '<em>Not Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___NOT_ZERO = 10;

	/**
	 * The operation id for the '<em>Simplify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___SIMPLIFY = 11;

	/**
	 * The operation id for the '<em>Sub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___SUB__DATASIZE = 12;

	/**
	 * The number of operations of the '<em>Data Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_OPERATION_COUNT = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Data Tx Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE___ADD__DATATXRATE = 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE___COMPARE_TO__DATATXRATE = 1;

	/**
	 * The operation id for the '<em>Convert To Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE___CONVERT_TO_UNIT__DATATXRATEUNITKIND = 2;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE___DIV__DATATXRATE = 3;

	/**
	 * The operation id for the '<em>Divide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE___DIVIDE__DATATXRATE = 4;

	/**
	 * The operation id for the '<em>Is Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE___IS_ZERO = 5;

	/**
	 * The operation id for the '<em>Lcm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE___LCM__DATATXRATE = 6;

	/**
	 * The operation id for the '<em>Max</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE___MAX__DATATXRATE = 7;

	/**
	 * The operation id for the '<em>Min</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE___MIN__DATATXRATE = 8;

	/**
	 * The operation id for the '<em>Multiply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE___MULTIPLY__LONG = 9;

	/**
	 * The operation id for the '<em>Not Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE___NOT_ZERO = 10;

	/**
	 * The operation id for the '<em>Simplify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE___SIMPLIFY = 11;

	/**
	 * The operation id for the '<em>Sub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE___SUB__DATATXRATE = 12;

	/**
	 * The number of operations of the '<em>Data Tx Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TX_RATE_OPERATION_COUNT = 13;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION__MIN = PROBABILISTIC_DURATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION__MAX = PROBABILISTIC_DURATION__MAX;

	/**
	 * The feature id for the '<em><b>Min Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION__MIN_OPEN = PROBABILISTIC_DURATION__MIN_OPEN;

	/**
	 * The feature id for the '<em><b>Max Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION__MAX_OPEN = PROBABILISTIC_DURATION__MAX_OPEN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION__VALUE = PROBABILISTIC_DURATION__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION__UNIT = PROBABILISTIC_DURATION__UNIT;

	/**
	 * The feature id for the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION__BEST = PROBABILISTIC_DURATION__BEST;

	/**
	 * The feature id for the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION__WORST = PROBABILISTIC_DURATION__WORST;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION__CLOCK = PROBABILISTIC_DURATION__CLOCK;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION__PRECISION = PROBABILISTIC_DURATION__PRECISION;

	/**
	 * The feature id for the '<em><b>Buckets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION__BUCKETS = PROBABILISTIC_DURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION__KIND = PROBABILISTIC_DURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Discrete Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION_FEATURE_COUNT = PROBABILISTIC_DURATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION___COMPUTE_LENGTH = PROBABILISTIC_DURATION___COMPUTE_LENGTH;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION___ADD__DURATION = PROBABILISTIC_DURATION___ADD__DURATION;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION___COMPARE_TO__DURATION = PROBABILISTIC_DURATION___COMPARE_TO__DURATION;

	/**
	 * The operation id for the '<em>Convert To Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION___CONVERT_TO_UNIT__TIMEUNITKIND = PROBABILISTIC_DURATION___CONVERT_TO_UNIT__TIMEUNITKIND;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION___DIV__DURATION = PROBABILISTIC_DURATION___DIV__DURATION;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION___DIV__DURATION_MATHCONTEXT = PROBABILISTIC_DURATION___DIV__DURATION_MATHCONTEXT;

	/**
	 * The operation id for the '<em>Divide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION___DIVIDE__DURATION = PROBABILISTIC_DURATION___DIVIDE__DURATION;

	/**
	 * The operation id for the '<em>Divide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION___DIVIDE__LONG = PROBABILISTIC_DURATION___DIVIDE__LONG;

	/**
	 * The operation id for the '<em>Is Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION___IS_ZERO = PROBABILISTIC_DURATION___IS_ZERO;

	/**
	 * The operation id for the '<em>Lcm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION___LCM__DURATION = PROBABILISTIC_DURATION___LCM__DURATION;

	/**
	 * The operation id for the '<em>Max</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION___MAX__DURATION = PROBABILISTIC_DURATION___MAX__DURATION;

	/**
	 * The operation id for the '<em>Min</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION___MIN__DURATION = PROBABILISTIC_DURATION___MIN__DURATION;

	/**
	 * The operation id for the '<em>Multiply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION___MULTIPLY__LONG = PROBABILISTIC_DURATION___MULTIPLY__LONG;

	/**
	 * The operation id for the '<em>Not Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION___NOT_ZERO = PROBABILISTIC_DURATION___NOT_ZERO;

	/**
	 * The operation id for the '<em>Simplify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION___SIMPLIFY = PROBABILISTIC_DURATION___SIMPLIFY;

	/**
	 * The operation id for the '<em>Sub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION___SUB__DURATION = PROBABILISTIC_DURATION___SUB__DURATION;

	/**
	 * The number of operations of the '<em>Discrete Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_DISTRIBUTION_OPERATION_COUNT = PROBABILISTIC_DURATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__BEST = 2;

	/**
	 * The feature id for the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__WORST = 3;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__CLOCK = 4;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__PRECISION = 5;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___ADD__DURATION = 0;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___COMPARE_TO__DURATION = 1;

	/**
	 * The operation id for the '<em>Convert To Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___CONVERT_TO_UNIT__TIMEUNITKIND = 2;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___DIV__DURATION = 3;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___DIV__DURATION_MATHCONTEXT = 4;

	/**
	 * The operation id for the '<em>Divide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___DIVIDE__DURATION = 5;

	/**
	 * The operation id for the '<em>Divide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___DIVIDE__LONG = 6;

	/**
	 * The operation id for the '<em>Is Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___IS_ZERO = 7;

	/**
	 * The operation id for the '<em>Lcm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___LCM__DURATION = 8;

	/**
	 * The operation id for the '<em>Max</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___MAX__DURATION = 9;

	/**
	 * The operation id for the '<em>Min</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___MIN__DURATION = 10;

	/**
	 * The operation id for the '<em>Multiply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___MULTIPLY__LONG = 11;

	/**
	 * The operation id for the '<em>Not Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___NOT_ZERO = 12;

	/**
	 * The operation id for the '<em>Simplify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___SIMPLIFY = 13;

	/**
	 * The operation id for the '<em>Sub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___SUB__DURATION = 14;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = 15;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION__MIN = PROBABILISTIC_DURATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION__MAX = PROBABILISTIC_DURATION__MAX;

	/**
	 * The feature id for the '<em><b>Min Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION__MIN_OPEN = PROBABILISTIC_DURATION__MIN_OPEN;

	/**
	 * The feature id for the '<em><b>Max Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION__MAX_OPEN = PROBABILISTIC_DURATION__MAX_OPEN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION__VALUE = PROBABILISTIC_DURATION__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION__UNIT = PROBABILISTIC_DURATION__UNIT;

	/**
	 * The feature id for the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION__BEST = PROBABILISTIC_DURATION__BEST;

	/**
	 * The feature id for the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION__WORST = PROBABILISTIC_DURATION__WORST;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION__CLOCK = PROBABILISTIC_DURATION__CLOCK;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION__PRECISION = PROBABILISTIC_DURATION__PRECISION;

	/**
	 * The feature id for the '<em><b>Mu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION__MU = PROBABILISTIC_DURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sigma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION__SIGMA = PROBABILISTIC_DURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION__XI = PROBABILISTIC_DURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generalized Extreme Value Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION_FEATURE_COUNT = PROBABILISTIC_DURATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION___COMPUTE_LENGTH = PROBABILISTIC_DURATION___COMPUTE_LENGTH;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION___ADD__DURATION = PROBABILISTIC_DURATION___ADD__DURATION;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION___COMPARE_TO__DURATION = PROBABILISTIC_DURATION___COMPARE_TO__DURATION;

	/**
	 * The operation id for the '<em>Convert To Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION___CONVERT_TO_UNIT__TIMEUNITKIND = PROBABILISTIC_DURATION___CONVERT_TO_UNIT__TIMEUNITKIND;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION___DIV__DURATION = PROBABILISTIC_DURATION___DIV__DURATION;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION___DIV__DURATION_MATHCONTEXT = PROBABILISTIC_DURATION___DIV__DURATION_MATHCONTEXT;

	/**
	 * The operation id for the '<em>Divide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION___DIVIDE__DURATION = PROBABILISTIC_DURATION___DIVIDE__DURATION;

	/**
	 * The operation id for the '<em>Divide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION___DIVIDE__LONG = PROBABILISTIC_DURATION___DIVIDE__LONG;

	/**
	 * The operation id for the '<em>Is Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION___IS_ZERO = PROBABILISTIC_DURATION___IS_ZERO;

	/**
	 * The operation id for the '<em>Lcm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION___LCM__DURATION = PROBABILISTIC_DURATION___LCM__DURATION;

	/**
	 * The operation id for the '<em>Max</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION___MAX__DURATION = PROBABILISTIC_DURATION___MAX__DURATION;

	/**
	 * The operation id for the '<em>Min</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION___MIN__DURATION = PROBABILISTIC_DURATION___MIN__DURATION;

	/**
	 * The operation id for the '<em>Multiply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION___MULTIPLY__LONG = PROBABILISTIC_DURATION___MULTIPLY__LONG;

	/**
	 * The operation id for the '<em>Not Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION___NOT_ZERO = PROBABILISTIC_DURATION___NOT_ZERO;

	/**
	 * The operation id for the '<em>Simplify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION___SIMPLIFY = PROBABILISTIC_DURATION___SIMPLIFY;

	/**
	 * The operation id for the '<em>Sub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION___SUB__DURATION = PROBABILISTIC_DURATION___SUB__DURATION;

	/**
	 * The number of operations of the '<em>Generalized Extreme Value Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_EXTREME_VALUE_DISTRIBUTION_OPERATION_COUNT = PROBABILISTIC_DURATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION__MIN = PROBABILISTIC_DURATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION__MAX = PROBABILISTIC_DURATION__MAX;

	/**
	 * The feature id for the '<em><b>Min Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION__MIN_OPEN = PROBABILISTIC_DURATION__MIN_OPEN;

	/**
	 * The feature id for the '<em><b>Max Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION__MAX_OPEN = PROBABILISTIC_DURATION__MAX_OPEN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION__VALUE = PROBABILISTIC_DURATION__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION__UNIT = PROBABILISTIC_DURATION__UNIT;

	/**
	 * The feature id for the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION__BEST = PROBABILISTIC_DURATION__BEST;

	/**
	 * The feature id for the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION__WORST = PROBABILISTIC_DURATION__WORST;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION__CLOCK = PROBABILISTIC_DURATION__CLOCK;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION__PRECISION = PROBABILISTIC_DURATION__PRECISION;

	/**
	 * The feature id for the '<em><b>Mu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION__MU = PROBABILISTIC_DURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sigma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION__SIGMA = PROBABILISTIC_DURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Normal Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION_FEATURE_COUNT = PROBABILISTIC_DURATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION___COMPUTE_LENGTH = PROBABILISTIC_DURATION___COMPUTE_LENGTH;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION___ADD__DURATION = PROBABILISTIC_DURATION___ADD__DURATION;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION___COMPARE_TO__DURATION = PROBABILISTIC_DURATION___COMPARE_TO__DURATION;

	/**
	 * The operation id for the '<em>Convert To Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION___CONVERT_TO_UNIT__TIMEUNITKIND = PROBABILISTIC_DURATION___CONVERT_TO_UNIT__TIMEUNITKIND;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION___DIV__DURATION = PROBABILISTIC_DURATION___DIV__DURATION;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION___DIV__DURATION_MATHCONTEXT = PROBABILISTIC_DURATION___DIV__DURATION_MATHCONTEXT;

	/**
	 * The operation id for the '<em>Divide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION___DIVIDE__DURATION = PROBABILISTIC_DURATION___DIVIDE__DURATION;

	/**
	 * The operation id for the '<em>Divide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION___DIVIDE__LONG = PROBABILISTIC_DURATION___DIVIDE__LONG;

	/**
	 * The operation id for the '<em>Is Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION___IS_ZERO = PROBABILISTIC_DURATION___IS_ZERO;

	/**
	 * The operation id for the '<em>Lcm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION___LCM__DURATION = PROBABILISTIC_DURATION___LCM__DURATION;

	/**
	 * The operation id for the '<em>Max</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION___MAX__DURATION = PROBABILISTIC_DURATION___MAX__DURATION;

	/**
	 * The operation id for the '<em>Min</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION___MIN__DURATION = PROBABILISTIC_DURATION___MIN__DURATION;

	/**
	 * The operation id for the '<em>Multiply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION___MULTIPLY__LONG = PROBABILISTIC_DURATION___MULTIPLY__LONG;

	/**
	 * The operation id for the '<em>Not Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION___NOT_ZERO = PROBABILISTIC_DURATION___NOT_ZERO;

	/**
	 * The operation id for the '<em>Simplify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION___SIMPLIFY = PROBABILISTIC_DURATION___SIMPLIFY;

	/**
	 * The operation id for the '<em>Sub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION___SUB__DURATION = PROBABILISTIC_DURATION___SUB__DURATION;

	/**
	 * The number of operations of the '<em>Normal Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION_OPERATION_COUNT = PROBABILISTIC_DURATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION__MIN = PROBABILISTIC_DURATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION__MAX = PROBABILISTIC_DURATION__MAX;

	/**
	 * The feature id for the '<em><b>Min Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION__MIN_OPEN = PROBABILISTIC_DURATION__MIN_OPEN;

	/**
	 * The feature id for the '<em><b>Max Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION__MAX_OPEN = PROBABILISTIC_DURATION__MAX_OPEN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION__VALUE = PROBABILISTIC_DURATION__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION__UNIT = PROBABILISTIC_DURATION__UNIT;

	/**
	 * The feature id for the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION__BEST = PROBABILISTIC_DURATION__BEST;

	/**
	 * The feature id for the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION__WORST = PROBABILISTIC_DURATION__WORST;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION__CLOCK = PROBABILISTIC_DURATION__CLOCK;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION__PRECISION = PROBABILISTIC_DURATION__PRECISION;

	/**
	 * The number of structural features of the '<em>Uniform Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION_FEATURE_COUNT = PROBABILISTIC_DURATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION___COMPUTE_LENGTH = PROBABILISTIC_DURATION___COMPUTE_LENGTH;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION___ADD__DURATION = PROBABILISTIC_DURATION___ADD__DURATION;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION___COMPARE_TO__DURATION = PROBABILISTIC_DURATION___COMPARE_TO__DURATION;

	/**
	 * The operation id for the '<em>Convert To Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION___CONVERT_TO_UNIT__TIMEUNITKIND = PROBABILISTIC_DURATION___CONVERT_TO_UNIT__TIMEUNITKIND;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION___DIV__DURATION = PROBABILISTIC_DURATION___DIV__DURATION;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION___DIV__DURATION_MATHCONTEXT = PROBABILISTIC_DURATION___DIV__DURATION_MATHCONTEXT;

	/**
	 * The operation id for the '<em>Divide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION___DIVIDE__DURATION = PROBABILISTIC_DURATION___DIVIDE__DURATION;

	/**
	 * The operation id for the '<em>Divide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION___DIVIDE__LONG = PROBABILISTIC_DURATION___DIVIDE__LONG;

	/**
	 * The operation id for the '<em>Is Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION___IS_ZERO = PROBABILISTIC_DURATION___IS_ZERO;

	/**
	 * The operation id for the '<em>Lcm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION___LCM__DURATION = PROBABILISTIC_DURATION___LCM__DURATION;

	/**
	 * The operation id for the '<em>Max</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION___MAX__DURATION = PROBABILISTIC_DURATION___MAX__DURATION;

	/**
	 * The operation id for the '<em>Min</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION___MIN__DURATION = PROBABILISTIC_DURATION___MIN__DURATION;

	/**
	 * The operation id for the '<em>Multiply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION___MULTIPLY__LONG = PROBABILISTIC_DURATION___MULTIPLY__LONG;

	/**
	 * The operation id for the '<em>Not Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION___NOT_ZERO = PROBABILISTIC_DURATION___NOT_ZERO;

	/**
	 * The operation id for the '<em>Simplify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION___SIMPLIFY = PROBABILISTIC_DURATION___SIMPLIFY;

	/**
	 * The operation id for the '<em>Sub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION___SUB__DURATION = PROBABILISTIC_DURATION___SUB__DURATION;

	/**
	 * The number of operations of the '<em>Uniform Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION_OPERATION_COUNT = PROBABILISTIC_DURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.TimeUnitKind <em>Time Unit Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.TimeUnitKind
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getTimeUnitKind()
	 * @generated
	 */
	int TIME_UNIT_KIND = 14;


	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.DataSizeUnitKind <em>Data Size Unit Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.DataSizeUnitKind
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getDataSizeUnitKind()
	 * @generated
	 */
	int DATA_SIZE_UNIT_KIND = 11;


	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.DataTxRateUnitKind <em>Data Tx Rate Unit Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRateUnitKind
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getDataTxRateUnitKind()
	 * @generated
	 */
	int DATA_TX_RATE_UNIT_KIND = 12;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.DiscreteDistributionKind <em>Discrete Distribution Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.DiscreteDistributionKind
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getDiscreteDistributionKind()
	 * @generated
	 */
	int DISCRETE_DISTRIBUTION_KIND = 13;

	/**
	 * The meta object id for the '<em>NFP Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getNFP_Duration()
	 * @generated
	 */
	int NFP_DURATION = 16;


	/**
	 * The meta object id for the '<em>Math Context</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.MathContext
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getMathContext()
	 * @generated
	 */
	int MATH_CONTEXT = 15;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration
	 * @generated
	 */
	EClass getDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.Duration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#getValue()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.Duration#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#getUnit()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.Duration#getBest <em>Best</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#getBest()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Best();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.Duration#getWorst <em>Worst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#getWorst()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Worst();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.Duration#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#getClock()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Clock();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.Duration#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#getPrecision()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Precision();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#add(org.polarsys.time4sys.marte.nfp.Duration) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#add(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getDuration__Add__Duration();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#convertToUnit(org.polarsys.time4sys.marte.nfp.TimeUnitKind) <em>Convert To Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Unit</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#convertToUnit(org.polarsys.time4sys.marte.nfp.TimeUnitKind)
	 * @generated
	 */
	EOperation getDuration__ConvertToUnit__TimeUnitKind();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#simplify() <em>Simplify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Simplify</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#simplify()
	 * @generated
	 */
	EOperation getDuration__Simplify();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#sub(org.polarsys.time4sys.marte.nfp.Duration) <em>Sub</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sub</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#sub(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getDuration__Sub__Duration();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#compareTo(org.polarsys.time4sys.marte.nfp.Duration) <em>Compare To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare To</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#compareTo(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getDuration__CompareTo__Duration();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#isZero() <em>Is Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Zero</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#isZero()
	 * @generated
	 */
	EOperation getDuration__IsZero();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#notZero() <em>Not Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Not Zero</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#notZero()
	 * @generated
	 */
	EOperation getDuration__NotZero();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#max(org.polarsys.time4sys.marte.nfp.Duration) <em>Max</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Max</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#max(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getDuration__Max__Duration();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#min(org.polarsys.time4sys.marte.nfp.Duration) <em>Min</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Min</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#min(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getDuration__Min__Duration();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#multiply(long) <em>Multiply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Multiply</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#multiply(long)
	 * @generated
	 */
	EOperation getDuration__Multiply__long();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#lcm(org.polarsys.time4sys.marte.nfp.Duration) <em>Lcm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lcm</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#lcm(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getDuration__Lcm__Duration();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#div(org.polarsys.time4sys.marte.nfp.Duration) <em>Div</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Div</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#div(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getDuration__Div__Duration();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#div(org.polarsys.time4sys.marte.nfp.Duration, java.math.MathContext) <em>Div</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Div</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#div(org.polarsys.time4sys.marte.nfp.Duration, java.math.MathContext)
	 * @generated
	 */
	EOperation getDuration__Div__Duration_MathContext();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#divide(org.polarsys.time4sys.marte.nfp.Duration) <em>Divide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Divide</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#divide(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getDuration__Divide__Duration();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#divide(long) <em>Divide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Divide</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#divide(long)
	 * @generated
	 */
	EOperation getDuration__Divide__long();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval
	 * @generated
	 */
	EClass getTimeInterval();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval#getMin()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EReference getTimeInterval_Min();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval#getMax()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EReference getTimeInterval_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#isMinOpen <em>Min Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Open</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval#isMinOpen()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EAttribute getTimeInterval_MinOpen();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#isMaxOpen <em>Max Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Open</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval#isMaxOpen()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EAttribute getTimeInterval_MaxOpen();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#computeLength() <em>Compute Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Length</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval#computeLength()
	 * @generated
	 */
	EOperation getTimeInterval__ComputeLength();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.DataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Size</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize
	 * @generated
	 */
	EClass getDataSize();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.DataSize#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize#getValue()
	 * @see #getDataSize()
	 * @generated
	 */
	EAttribute getDataSize_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.DataSize#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize#getUnit()
	 * @see #getDataSize()
	 * @generated
	 */
	EAttribute getDataSize_Unit();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataSize#add(org.polarsys.time4sys.marte.nfp.DataSize) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize#add(org.polarsys.time4sys.marte.nfp.DataSize)
	 * @generated
	 */
	EOperation getDataSize__Add__DataSize();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataSize#compareTo(org.polarsys.time4sys.marte.nfp.DataSize) <em>Compare To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare To</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize#compareTo(org.polarsys.time4sys.marte.nfp.DataSize)
	 * @generated
	 */
	EOperation getDataSize__CompareTo__DataSize();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataSize#convertToUnit(org.polarsys.time4sys.marte.nfp.DataSizeUnitKind) <em>Convert To Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Unit</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize#convertToUnit(org.polarsys.time4sys.marte.nfp.DataSizeUnitKind)
	 * @generated
	 */
	EOperation getDataSize__ConvertToUnit__DataSizeUnitKind();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataSize#div(org.polarsys.time4sys.marte.nfp.DataSize) <em>Div</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Div</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize#div(org.polarsys.time4sys.marte.nfp.DataSize)
	 * @generated
	 */
	EOperation getDataSize__Div__DataSize();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataSize#divide(org.polarsys.time4sys.marte.nfp.DataSize) <em>Divide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Divide</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize#divide(org.polarsys.time4sys.marte.nfp.DataSize)
	 * @generated
	 */
	EOperation getDataSize__Divide__DataSize();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataSize#isZero() <em>Is Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Zero</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize#isZero()
	 * @generated
	 */
	EOperation getDataSize__IsZero();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataSize#lcm(org.polarsys.time4sys.marte.nfp.DataSize) <em>Lcm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lcm</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize#lcm(org.polarsys.time4sys.marte.nfp.DataSize)
	 * @generated
	 */
	EOperation getDataSize__Lcm__DataSize();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataSize#max(org.polarsys.time4sys.marte.nfp.DataSize) <em>Max</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Max</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize#max(org.polarsys.time4sys.marte.nfp.DataSize)
	 * @generated
	 */
	EOperation getDataSize__Max__DataSize();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataSize#min(org.polarsys.time4sys.marte.nfp.DataSize) <em>Min</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Min</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize#min(org.polarsys.time4sys.marte.nfp.DataSize)
	 * @generated
	 */
	EOperation getDataSize__Min__DataSize();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataSize#multiply(long) <em>Multiply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Multiply</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize#multiply(long)
	 * @generated
	 */
	EOperation getDataSize__Multiply__long();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataSize#notZero() <em>Not Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Not Zero</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize#notZero()
	 * @generated
	 */
	EOperation getDataSize__NotZero();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataSize#simplify() <em>Simplify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Simplify</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize#simplify()
	 * @generated
	 */
	EOperation getDataSize__Simplify();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataSize#sub(org.polarsys.time4sys.marte.nfp.DataSize) <em>Sub</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sub</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataSize#sub(org.polarsys.time4sys.marte.nfp.DataSize)
	 * @generated
	 */
	EOperation getDataSize__Sub__DataSize();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.DataTxRate <em>Data Tx Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Tx Rate</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRate
	 * @generated
	 */
	EClass getDataTxRate();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.DataTxRate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRate#getValue()
	 * @see #getDataTxRate()
	 * @generated
	 */
	EAttribute getDataTxRate_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.DataTxRate#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRate#getUnit()
	 * @see #getDataTxRate()
	 * @generated
	 */
	EAttribute getDataTxRate_Unit();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataTxRate#add(org.polarsys.time4sys.marte.nfp.DataTxRate) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRate#add(org.polarsys.time4sys.marte.nfp.DataTxRate)
	 * @generated
	 */
	EOperation getDataTxRate__Add__DataTxRate();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataTxRate#compareTo(org.polarsys.time4sys.marte.nfp.DataTxRate) <em>Compare To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare To</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRate#compareTo(org.polarsys.time4sys.marte.nfp.DataTxRate)
	 * @generated
	 */
	EOperation getDataTxRate__CompareTo__DataTxRate();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataTxRate#convertToUnit(org.polarsys.time4sys.marte.nfp.DataTxRateUnitKind) <em>Convert To Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Unit</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRate#convertToUnit(org.polarsys.time4sys.marte.nfp.DataTxRateUnitKind)
	 * @generated
	 */
	EOperation getDataTxRate__ConvertToUnit__DataTxRateUnitKind();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataTxRate#div(org.polarsys.time4sys.marte.nfp.DataTxRate) <em>Div</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Div</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRate#div(org.polarsys.time4sys.marte.nfp.DataTxRate)
	 * @generated
	 */
	EOperation getDataTxRate__Div__DataTxRate();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataTxRate#divide(org.polarsys.time4sys.marte.nfp.DataTxRate) <em>Divide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Divide</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRate#divide(org.polarsys.time4sys.marte.nfp.DataTxRate)
	 * @generated
	 */
	EOperation getDataTxRate__Divide__DataTxRate();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataTxRate#isZero() <em>Is Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Zero</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRate#isZero()
	 * @generated
	 */
	EOperation getDataTxRate__IsZero();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataTxRate#lcm(org.polarsys.time4sys.marte.nfp.DataTxRate) <em>Lcm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lcm</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRate#lcm(org.polarsys.time4sys.marte.nfp.DataTxRate)
	 * @generated
	 */
	EOperation getDataTxRate__Lcm__DataTxRate();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataTxRate#max(org.polarsys.time4sys.marte.nfp.DataTxRate) <em>Max</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Max</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRate#max(org.polarsys.time4sys.marte.nfp.DataTxRate)
	 * @generated
	 */
	EOperation getDataTxRate__Max__DataTxRate();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataTxRate#min(org.polarsys.time4sys.marte.nfp.DataTxRate) <em>Min</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Min</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRate#min(org.polarsys.time4sys.marte.nfp.DataTxRate)
	 * @generated
	 */
	EOperation getDataTxRate__Min__DataTxRate();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataTxRate#multiply(long) <em>Multiply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Multiply</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRate#multiply(long)
	 * @generated
	 */
	EOperation getDataTxRate__Multiply__long();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataTxRate#notZero() <em>Not Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Not Zero</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRate#notZero()
	 * @generated
	 */
	EOperation getDataTxRate__NotZero();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataTxRate#simplify() <em>Simplify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Simplify</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRate#simplify()
	 * @generated
	 */
	EOperation getDataTxRate__Simplify();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.DataTxRate#sub(org.polarsys.time4sys.marte.nfp.DataTxRate) <em>Sub</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sub</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRate#sub(org.polarsys.time4sys.marte.nfp.DataTxRate)
	 * @generated
	 */
	EOperation getDataTxRate__Sub__DataTxRate();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.ProbabilisticDuration <em>Probabilistic Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probabilistic Duration</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.ProbabilisticDuration
	 * @generated
	 */
	EClass getProbabilisticDuration();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.DiscreteDistribution <em>Discrete Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Distribution</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.DiscreteDistribution
	 * @generated
	 */
	EClass getDiscreteDistribution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.nfp.DiscreteDistribution#getBuckets <em>Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buckets</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.DiscreteDistribution#getBuckets()
	 * @see #getDiscreteDistribution()
	 * @generated
	 */
	EReference getDiscreteDistribution_Buckets();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.DiscreteDistribution#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.DiscreteDistribution#getKind()
	 * @see #getDiscreteDistribution()
	 * @generated
	 */
	EAttribute getDiscreteDistribution_Kind();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.Bucket <em>Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bucket</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Bucket
	 * @generated
	 */
	EClass getBucket();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.Bucket#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Bucket#getProbability()
	 * @see #getBucket()
	 * @generated
	 */
	EAttribute getBucket_Probability();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.Bucket#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Bucket#getValue()
	 * @see #getBucket()
	 * @generated
	 */
	EAttribute getBucket_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.NormalDistribution <em>Normal Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Distribution</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.NormalDistribution
	 * @generated
	 */
	EClass getNormalDistribution();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.NormalDistribution#getMu <em>Mu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mu</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.NormalDistribution#getMu()
	 * @see #getNormalDistribution()
	 * @generated
	 */
	EAttribute getNormalDistribution_Mu();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.NormalDistribution#getSigma <em>Sigma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sigma</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.NormalDistribution#getSigma()
	 * @see #getNormalDistribution()
	 * @generated
	 */
	EAttribute getNormalDistribution_Sigma();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution <em>Generalized Extreme Value Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalized Extreme Value Distribution</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution
	 * @generated
	 */
	EClass getGeneralizedExtremeValueDistribution();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution#getMu <em>Mu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mu</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution#getMu()
	 * @see #getGeneralizedExtremeValueDistribution()
	 * @generated
	 */
	EAttribute getGeneralizedExtremeValueDistribution_Mu();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution#getSigma <em>Sigma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sigma</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution#getSigma()
	 * @see #getGeneralizedExtremeValueDistribution()
	 * @generated
	 */
	EAttribute getGeneralizedExtremeValueDistribution_Sigma();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution#getXi <em>Xi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xi</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution#getXi()
	 * @see #getGeneralizedExtremeValueDistribution()
	 * @generated
	 */
	EAttribute getGeneralizedExtremeValueDistribution_Xi();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.UniformDistribution <em>Uniform Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniform Distribution</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.UniformDistribution
	 * @generated
	 */
	EClass getUniformDistribution();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.CompositeDistribution <em>Composite Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Distribution</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.CompositeDistribution
	 * @generated
	 */
	EClass getCompositeDistribution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.nfp.CompositeDistribution#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.CompositeDistribution#getParts()
	 * @see #getCompositeDistribution()
	 * @generated
	 */
	EReference getCompositeDistribution_Parts();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.nfp.TimeUnitKind <em>Time Unit Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit Kind</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.TimeUnitKind
	 * @generated
	 */
	EEnum getTimeUnitKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.nfp.DataSizeUnitKind <em>Data Size Unit Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Size Unit Kind</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.DataSizeUnitKind
	 * @generated
	 */
	EEnum getDataSizeUnitKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.nfp.DataTxRateUnitKind <em>Data Tx Rate Unit Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Tx Rate Unit Kind</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.DataTxRateUnitKind
	 * @generated
	 */
	EEnum getDataTxRateUnitKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.nfp.DiscreteDistributionKind <em>Discrete Distribution Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Discrete Distribution Kind</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.DiscreteDistributionKind
	 * @generated
	 */
	EEnum getDiscreteDistributionKind();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.time4sys.marte.nfp.Duration <em>NFP Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>NFP Duration</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration
	 * @model instanceClass="org.polarsys.time4sys.marte.nfp.Duration"
	 * @generated
	 */
	EDataType getNFP_Duration();

	/**
	 * Returns the meta object for data type '{@link java.math.MathContext <em>Math Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Math Context</em>'.
	 * @see java.math.MathContext
	 * @model instanceClass="java.math.MathContext"
	 * @generated
	 */
	EDataType getMathContext();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NfpFactory getNfpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.impl.DurationImpl <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.impl.DurationImpl
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getDuration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__VALUE = eINSTANCE.getDuration_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__UNIT = eINSTANCE.getDuration_Unit();

		/**
		 * The meta object literal for the '<em><b>Best</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__BEST = eINSTANCE.getDuration_Best();

		/**
		 * The meta object literal for the '<em><b>Worst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__WORST = eINSTANCE.getDuration_Worst();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__CLOCK = eINSTANCE.getDuration_Clock();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__PRECISION = eINSTANCE.getDuration_Precision();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___ADD__DURATION = eINSTANCE.getDuration__Add__Duration();

		/**
		 * The meta object literal for the '<em><b>Convert To Unit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___CONVERT_TO_UNIT__TIMEUNITKIND = eINSTANCE.getDuration__ConvertToUnit__TimeUnitKind();

		/**
		 * The meta object literal for the '<em><b>Simplify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___SIMPLIFY = eINSTANCE.getDuration__Simplify();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___SUB__DURATION = eINSTANCE.getDuration__Sub__Duration();

		/**
		 * The meta object literal for the '<em><b>Compare To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___COMPARE_TO__DURATION = eINSTANCE.getDuration__CompareTo__Duration();

		/**
		 * The meta object literal for the '<em><b>Is Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___IS_ZERO = eINSTANCE.getDuration__IsZero();

		/**
		 * The meta object literal for the '<em><b>Not Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___NOT_ZERO = eINSTANCE.getDuration__NotZero();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___MAX__DURATION = eINSTANCE.getDuration__Max__Duration();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___MIN__DURATION = eINSTANCE.getDuration__Min__Duration();

		/**
		 * The meta object literal for the '<em><b>Multiply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___MULTIPLY__LONG = eINSTANCE.getDuration__Multiply__long();

		/**
		 * The meta object literal for the '<em><b>Lcm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___LCM__DURATION = eINSTANCE.getDuration__Lcm__Duration();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___DIV__DURATION = eINSTANCE.getDuration__Div__Duration();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___DIV__DURATION_MATHCONTEXT = eINSTANCE.getDuration__Div__Duration_MathContext();

		/**
		 * The meta object literal for the '<em><b>Divide</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___DIVIDE__DURATION = eINSTANCE.getDuration__Divide__Duration();

		/**
		 * The meta object literal for the '<em><b>Divide</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___DIVIDE__LONG = eINSTANCE.getDuration__Divide__long();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.impl.TimeIntervalImpl
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getTimeInterval()
		 * @generated
		 */
		EClass TIME_INTERVAL = eINSTANCE.getTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_INTERVAL__MIN = eINSTANCE.getTimeInterval_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_INTERVAL__MAX = eINSTANCE.getTimeInterval_Max();

		/**
		 * The meta object literal for the '<em><b>Min Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INTERVAL__MIN_OPEN = eINSTANCE.getTimeInterval_MinOpen();

		/**
		 * The meta object literal for the '<em><b>Max Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INTERVAL__MAX_OPEN = eINSTANCE.getTimeInterval_MaxOpen();

		/**
		 * The meta object literal for the '<em><b>Compute Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_INTERVAL___COMPUTE_LENGTH = eINSTANCE.getTimeInterval__ComputeLength();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.impl.DataSizeImpl <em>Data Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.impl.DataSizeImpl
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getDataSize()
		 * @generated
		 */
		EClass DATA_SIZE = eINSTANCE.getDataSize();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SIZE__VALUE = eINSTANCE.getDataSize_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SIZE__UNIT = eINSTANCE.getDataSize_Unit();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SIZE___ADD__DATASIZE = eINSTANCE.getDataSize__Add__DataSize();

		/**
		 * The meta object literal for the '<em><b>Compare To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SIZE___COMPARE_TO__DATASIZE = eINSTANCE.getDataSize__CompareTo__DataSize();

		/**
		 * The meta object literal for the '<em><b>Convert To Unit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SIZE___CONVERT_TO_UNIT__DATASIZEUNITKIND = eINSTANCE.getDataSize__ConvertToUnit__DataSizeUnitKind();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SIZE___DIV__DATASIZE = eINSTANCE.getDataSize__Div__DataSize();

		/**
		 * The meta object literal for the '<em><b>Divide</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SIZE___DIVIDE__DATASIZE = eINSTANCE.getDataSize__Divide__DataSize();

		/**
		 * The meta object literal for the '<em><b>Is Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SIZE___IS_ZERO = eINSTANCE.getDataSize__IsZero();

		/**
		 * The meta object literal for the '<em><b>Lcm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SIZE___LCM__DATASIZE = eINSTANCE.getDataSize__Lcm__DataSize();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SIZE___MAX__DATASIZE = eINSTANCE.getDataSize__Max__DataSize();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SIZE___MIN__DATASIZE = eINSTANCE.getDataSize__Min__DataSize();

		/**
		 * The meta object literal for the '<em><b>Multiply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SIZE___MULTIPLY__LONG = eINSTANCE.getDataSize__Multiply__long();

		/**
		 * The meta object literal for the '<em><b>Not Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SIZE___NOT_ZERO = eINSTANCE.getDataSize__NotZero();

		/**
		 * The meta object literal for the '<em><b>Simplify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SIZE___SIMPLIFY = eINSTANCE.getDataSize__Simplify();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SIZE___SUB__DATASIZE = eINSTANCE.getDataSize__Sub__DataSize();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.impl.DataTxRateImpl <em>Data Tx Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.impl.DataTxRateImpl
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getDataTxRate()
		 * @generated
		 */
		EClass DATA_TX_RATE = eINSTANCE.getDataTxRate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TX_RATE__VALUE = eINSTANCE.getDataTxRate_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TX_RATE__UNIT = eINSTANCE.getDataTxRate_Unit();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TX_RATE___ADD__DATATXRATE = eINSTANCE.getDataTxRate__Add__DataTxRate();

		/**
		 * The meta object literal for the '<em><b>Compare To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TX_RATE___COMPARE_TO__DATATXRATE = eINSTANCE.getDataTxRate__CompareTo__DataTxRate();

		/**
		 * The meta object literal for the '<em><b>Convert To Unit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TX_RATE___CONVERT_TO_UNIT__DATATXRATEUNITKIND = eINSTANCE.getDataTxRate__ConvertToUnit__DataTxRateUnitKind();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TX_RATE___DIV__DATATXRATE = eINSTANCE.getDataTxRate__Div__DataTxRate();

		/**
		 * The meta object literal for the '<em><b>Divide</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TX_RATE___DIVIDE__DATATXRATE = eINSTANCE.getDataTxRate__Divide__DataTxRate();

		/**
		 * The meta object literal for the '<em><b>Is Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TX_RATE___IS_ZERO = eINSTANCE.getDataTxRate__IsZero();

		/**
		 * The meta object literal for the '<em><b>Lcm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TX_RATE___LCM__DATATXRATE = eINSTANCE.getDataTxRate__Lcm__DataTxRate();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TX_RATE___MAX__DATATXRATE = eINSTANCE.getDataTxRate__Max__DataTxRate();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TX_RATE___MIN__DATATXRATE = eINSTANCE.getDataTxRate__Min__DataTxRate();

		/**
		 * The meta object literal for the '<em><b>Multiply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TX_RATE___MULTIPLY__LONG = eINSTANCE.getDataTxRate__Multiply__long();

		/**
		 * The meta object literal for the '<em><b>Not Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TX_RATE___NOT_ZERO = eINSTANCE.getDataTxRate__NotZero();

		/**
		 * The meta object literal for the '<em><b>Simplify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TX_RATE___SIMPLIFY = eINSTANCE.getDataTxRate__Simplify();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TX_RATE___SUB__DATATXRATE = eINSTANCE.getDataTxRate__Sub__DataTxRate();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.impl.ProbabilisticDurationImpl <em>Probabilistic Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.impl.ProbabilisticDurationImpl
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getProbabilisticDuration()
		 * @generated
		 */
		EClass PROBABILISTIC_DURATION = eINSTANCE.getProbabilisticDuration();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.impl.DiscreteDistributionImpl <em>Discrete Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.impl.DiscreteDistributionImpl
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getDiscreteDistribution()
		 * @generated
		 */
		EClass DISCRETE_DISTRIBUTION = eINSTANCE.getDiscreteDistribution();

		/**
		 * The meta object literal for the '<em><b>Buckets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_DISTRIBUTION__BUCKETS = eINSTANCE.getDiscreteDistribution_Buckets();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_DISTRIBUTION__KIND = eINSTANCE.getDiscreteDistribution_Kind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.impl.BucketImpl <em>Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.impl.BucketImpl
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getBucket()
		 * @generated
		 */
		EClass BUCKET = eINSTANCE.getBucket();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUCKET__PROBABILITY = eINSTANCE.getBucket_Probability();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUCKET__VALUE = eINSTANCE.getBucket_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.impl.NormalDistributionImpl <em>Normal Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.impl.NormalDistributionImpl
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getNormalDistribution()
		 * @generated
		 */
		EClass NORMAL_DISTRIBUTION = eINSTANCE.getNormalDistribution();

		/**
		 * The meta object literal for the '<em><b>Mu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_DISTRIBUTION__MU = eINSTANCE.getNormalDistribution_Mu();

		/**
		 * The meta object literal for the '<em><b>Sigma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_DISTRIBUTION__SIGMA = eINSTANCE.getNormalDistribution_Sigma();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.impl.GeneralizedExtremeValueDistributionImpl <em>Generalized Extreme Value Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.impl.GeneralizedExtremeValueDistributionImpl
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getGeneralizedExtremeValueDistribution()
		 * @generated
		 */
		EClass GENERALIZED_EXTREME_VALUE_DISTRIBUTION = eINSTANCE.getGeneralizedExtremeValueDistribution();

		/**
		 * The meta object literal for the '<em><b>Mu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZED_EXTREME_VALUE_DISTRIBUTION__MU = eINSTANCE.getGeneralizedExtremeValueDistribution_Mu();

		/**
		 * The meta object literal for the '<em><b>Sigma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZED_EXTREME_VALUE_DISTRIBUTION__SIGMA = eINSTANCE.getGeneralizedExtremeValueDistribution_Sigma();

		/**
		 * The meta object literal for the '<em><b>Xi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZED_EXTREME_VALUE_DISTRIBUTION__XI = eINSTANCE.getGeneralizedExtremeValueDistribution_Xi();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.impl.UniformDistributionImpl <em>Uniform Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.impl.UniformDistributionImpl
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getUniformDistribution()
		 * @generated
		 */
		EClass UNIFORM_DISTRIBUTION = eINSTANCE.getUniformDistribution();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.impl.CompositeDistributionImpl <em>Composite Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.impl.CompositeDistributionImpl
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getCompositeDistribution()
		 * @generated
		 */
		EClass COMPOSITE_DISTRIBUTION = eINSTANCE.getCompositeDistribution();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DISTRIBUTION__PARTS = eINSTANCE.getCompositeDistribution_Parts();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.TimeUnitKind <em>Time Unit Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.TimeUnitKind
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getTimeUnitKind()
		 * @generated
		 */
		EEnum TIME_UNIT_KIND = eINSTANCE.getTimeUnitKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.DataSizeUnitKind <em>Data Size Unit Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.DataSizeUnitKind
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getDataSizeUnitKind()
		 * @generated
		 */
		EEnum DATA_SIZE_UNIT_KIND = eINSTANCE.getDataSizeUnitKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.DataTxRateUnitKind <em>Data Tx Rate Unit Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.DataTxRateUnitKind
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getDataTxRateUnitKind()
		 * @generated
		 */
		EEnum DATA_TX_RATE_UNIT_KIND = eINSTANCE.getDataTxRateUnitKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.DiscreteDistributionKind <em>Discrete Distribution Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.DiscreteDistributionKind
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getDiscreteDistributionKind()
		 * @generated
		 */
		EEnum DISCRETE_DISTRIBUTION_KIND = eINSTANCE.getDiscreteDistributionKind();

		/**
		 * The meta object literal for the '<em>NFP Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.Duration
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getNFP_Duration()
		 * @generated
		 */
		EDataType NFP_DURATION = eINSTANCE.getNFP_Duration();

		/**
		 * The meta object literal for the '<em>Math Context</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.MathContext
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getMathContext()
		 * @generated
		 */
		EDataType MATH_CONTEXT = eINSTANCE.getMathContext();

	}

} //NfpPackage
