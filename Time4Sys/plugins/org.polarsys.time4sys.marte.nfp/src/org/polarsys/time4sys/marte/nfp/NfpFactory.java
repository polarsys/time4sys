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
	String convertTimeIntervalToString(TimeInterval instanceValue);

} //NfpFactory
