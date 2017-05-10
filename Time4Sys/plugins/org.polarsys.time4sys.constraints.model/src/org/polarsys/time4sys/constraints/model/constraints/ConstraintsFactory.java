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
package org.polarsys.time4sys.constraints.model.constraints;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage
 * @generated
 */
public interface ConstraintsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintsFactory eINSTANCE = org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Twca Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Twca Constraint</em>'.
	 * @generated
	 */
	TwcaConstraint createTwcaConstraint();

	/**
	 * Returns a new object of class '<em>Latency Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Latency Constraint</em>'.
	 * @generated
	 */
	LatencyConstraint createLatencyConstraint();

	/**
	 * Returns a new object of class '<em>Jitter Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jitter Constraint</em>'.
	 * @generated
	 */
	JitterConstraint createJitterConstraint();

	/**
	 * Returns a new object of class '<em>Load Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Constraint</em>'.
	 * @generated
	 */
	LoadConstraint createLoadConstraint();

	/**
	 * Returns a new object of class '<em>Constraint Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Container</em>'.
	 * @generated
	 */
	ConstraintContainer createConstraintContainer();

	/**
	 * Returns a new object of class '<em>Analysis Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Parameter</em>'.
	 * @generated
	 */
	AnalysisParameter createAnalysisParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConstraintsPackage getConstraintsPackage();

} //ConstraintsFactory
