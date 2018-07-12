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
package org.polarsys.time4sys.marte.nfp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.nfp.NfpPackage
 * @generated
 */
public interface NfpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NfpFactory eINSTANCE = org.polarsys.time4sys.marte.nfp.impl.NfpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duration</em>'.
	 * @generated
	 */
	Duration createDuration();
	
	/**
	 * Returns a new object of class '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Interval</em>'.
	 * @generated
	 */
	TimeInterval createTimeInterval();

	/**
	 * Returns a new object of class '<em>Data Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Size</em>'.
	 * @generated
	 */
	DataSize createDataSize();

	/**
	 * Returns a new object of class '<em>Probabilistic Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Probabilistic Duration</em>'.
	 * @generated
	 */
	ProbabilisticDuration createProbabilisticDuration();

	/**
	 * Returns a new object of class '<em>Discrete Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Distribution</em>'.
	 * @generated
	 */
	DiscreteDistribution createDiscreteDistribution();

	/**
	 * Returns a new object of class '<em>Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bucket</em>'.
	 * @generated
	 */
	Bucket createBucket();

	/**
	 * Returns a new object of class '<em>Normal Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Distribution</em>'.
	 * @generated
	 */
	NormalDistribution createNormalDistribution();

	/**
	 * Returns a new object of class '<em>Generalized Extreme Value Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalized Extreme Value Distribution</em>'.
	 * @generated
	 */
	GeneralizedExtremeValueDistribution createGeneralizedExtremeValueDistribution();

	/**
	 * Returns a new object of class '<em>Uniform Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uniform Distribution</em>'.
	 * @generated
	 */
	UniformDistribution createUniformDistribution();

	/**
	 * Returns a new object of class '<em>Composite Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Distribution</em>'.
	 * @generated
	 */
	CompositeDistribution createCompositeDistribution();

	/**
	 * Returns a new object of class '<em>Data Tx Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Tx Rate</em>'.
	 * @generated
	 */
	DataTxRate createDataTxRate();

	/**
	 * 
	 * @return
	 * @generated NOT
	 */
	DataTxRate createDataTxRateFromString(String value);

	/**
	 * 
	 * @return
	 * @generated NOT
	 */
	Duration createDurationFromString(String value);
	
	/**
	 * 
	 * @return
	 * @generated NOT
	 */
	TimeInterval createTimeIntervalFromString(String value);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NfpPackage getNfpPackage();

	/**
	 * 
	 * @return
	 * @generated NOT
	 */
	String convertDurationToString(Duration instanceValue);
	
	/**
	 * 
	 * @return
	 * @generated NOT
	 */
	String convertDataTxRateToString(DataTxRate instanceValue);

	/**
	 * 
	 * @return
	 * @generated NOT
	 */
	String convertDataSizeToString(DataSize instanceValue);

	/**
	 * 
	 * @return
	 * @generated NOT
	 */
	String convertTimeIntervalToString(TimeInterval instanceValue);

	/**
	 * 
	 * @return
	 * @generated NOT
	 */
	DataSize createDataSizeFromString(String instanceValue);

} //NfpFactory
