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
package org.polarsys.time4sys.constraints.model.constraints.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.time4sys.constraints.model.constraints.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintsFactoryImpl extends EFactoryImpl implements ConstraintsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConstraintsFactory init() {
		try {
			ConstraintsFactory theConstraintsFactory = (ConstraintsFactory)EPackage.Registry.INSTANCE.getEFactory(ConstraintsPackage.eNS_URI);
			if (theConstraintsFactory != null) {
				return theConstraintsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConstraintsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsFactoryImpl() {
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
			case ConstraintsPackage.TWCA_CONSTRAINT: return createTwcaConstraint();
			case ConstraintsPackage.LATENCY_CONSTRAINT: return createLatencyConstraint();
			case ConstraintsPackage.JITTER_CONSTRAINT: return createJitterConstraint();
			case ConstraintsPackage.LOAD_CONSTRAINT: return createLoadConstraint();
			case ConstraintsPackage.CONSTRAINT_CONTAINER: return createConstraintContainer();
			case ConstraintsPackage.ANALYSIS_PARAMETER: return createAnalysisParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwcaConstraint createTwcaConstraint() {
		TwcaConstraintImpl twcaConstraint = new TwcaConstraintImpl();
		return twcaConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencyConstraint createLatencyConstraint() {
		LatencyConstraintImpl latencyConstraint = new LatencyConstraintImpl();
		return latencyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JitterConstraint createJitterConstraint() {
		JitterConstraintImpl jitterConstraint = new JitterConstraintImpl();
		return jitterConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadConstraint createLoadConstraint() {
		LoadConstraintImpl loadConstraint = new LoadConstraintImpl();
		return loadConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintContainer createConstraintContainer() {
		ConstraintContainerImpl constraintContainer = new ConstraintContainerImpl();
		return constraintContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisParameter createAnalysisParameter() {
		AnalysisParameterImpl analysisParameter = new AnalysisParameterImpl();
		return analysisParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsPackage getConstraintsPackage() {
		return (ConstraintsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConstraintsPackage getPackage() {
		return ConstraintsPackage.eINSTANCE;
	}

} //ConstraintsFactoryImpl
