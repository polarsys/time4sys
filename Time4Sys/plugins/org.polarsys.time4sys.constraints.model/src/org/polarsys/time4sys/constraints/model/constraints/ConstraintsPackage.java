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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.time4sys.analysis.AnalysisPackage;

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
 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsFactory
 * @model kind="package"
 * @generated
 */
public interface ConstraintsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "constraints";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/constraints/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "constraints";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintsPackage eINSTANCE = org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.constraints.model.constraints.impl.TwcaConstraintImpl <em>Twca Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.constraints.model.constraints.impl.TwcaConstraintImpl
	 * @see org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintsPackageImpl#getTwcaConstraint()
	 * @generated
	 */
	int TWCA_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Nb Consecutive Activations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWCA_CONSTRAINT__NB_CONSECUTIVE_ACTIVATIONS = 0;

	/**
	 * The feature id for the '<em><b>Nb Missed Deadlines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWCA_CONSTRAINT__NB_MISSED_DEADLINES = 1;

	/**
	 * The feature id for the '<em><b>Constrained Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWCA_CONSTRAINT__CONSTRAINED_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Twca Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWCA_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Twca Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWCA_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.constraints.model.constraints.impl.TimingConstraintImpl <em>Timing Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.constraints.model.constraints.impl.TimingConstraintImpl
	 * @see org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintsPackageImpl#getTimingConstraint()
	 * @generated
	 */
	int TIMING_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__MAX = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__TO = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__FROM = 3;

	/**
	 * The feature id for the '<em><b>Via</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__VIA = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__VALUE = 5;

	/**
	 * The number of structural features of the '<em>Timing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Timing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.constraints.model.constraints.impl.LatencyConstraintImpl <em>Latency Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.constraints.model.constraints.impl.LatencyConstraintImpl
	 * @see org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintsPackageImpl#getLatencyConstraint()
	 * @generated
	 */
	int LATENCY_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_CONSTRAINT__MIN = TIMING_CONSTRAINT__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_CONSTRAINT__MAX = TIMING_CONSTRAINT__MAX;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_CONSTRAINT__TO = TIMING_CONSTRAINT__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_CONSTRAINT__FROM = TIMING_CONSTRAINT__FROM;

	/**
	 * The feature id for the '<em><b>Via</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_CONSTRAINT__VIA = TIMING_CONSTRAINT__VIA;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_CONSTRAINT__VALUE = TIMING_CONSTRAINT__VALUE;

	/**
	 * The number of structural features of the '<em>Latency Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Latency Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_CONSTRAINT_OPERATION_COUNT = TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.constraints.model.constraints.impl.JitterConstraintImpl <em>Jitter Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.constraints.model.constraints.impl.JitterConstraintImpl
	 * @see org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintsPackageImpl#getJitterConstraint()
	 * @generated
	 */
	int JITTER_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_CONSTRAINT__MIN = TIMING_CONSTRAINT__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_CONSTRAINT__MAX = TIMING_CONSTRAINT__MAX;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_CONSTRAINT__TO = TIMING_CONSTRAINT__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_CONSTRAINT__FROM = TIMING_CONSTRAINT__FROM;

	/**
	 * The feature id for the '<em><b>Via</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_CONSTRAINT__VIA = TIMING_CONSTRAINT__VIA;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_CONSTRAINT__VALUE = TIMING_CONSTRAINT__VALUE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_CONSTRAINT__ELEMENTS = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jitter Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Jitter Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_CONSTRAINT_OPERATION_COUNT = TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.constraints.model.constraints.impl.LoadConstraintImpl <em>Load Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.constraints.model.constraints.impl.LoadConstraintImpl
	 * @see org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintsPackageImpl#getLoadConstraint()
	 * @generated
	 */
	int LOAD_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONSTRAINT__RESOURCES = 0;

	/**
	 * The number of structural features of the '<em>Load Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Load Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintContainerImpl <em>Constraint Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintContainerImpl
	 * @see org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintsPackageImpl#getConstraintContainer()
	 * @generated
	 */
	int CONSTRAINT_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CONTAINER__NAME = AnalysisPackage.CONSTRAINT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CONTAINER__CONSTRAINTS = AnalysisPackage.CONSTRAINT_CONTAINER__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Analyzed System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CONTAINER__ANALYZED_SYSTEM = AnalysisPackage.CONSTRAINT_CONTAINER__ANALYZED_SYSTEM;

	/**
	 * The feature id for the '<em><b>Twca Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CONTAINER__TWCA_CONSTRAINTS = AnalysisPackage.CONSTRAINT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latency Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CONTAINER__LATENCY_CONSTRAINTS = AnalysisPackage.CONSTRAINT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jitter Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CONTAINER__JITTER_CONSTRAINTS = AnalysisPackage.CONSTRAINT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Load Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CONTAINER__LOAD_CONSTRAINTS = AnalysisPackage.CONSTRAINT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Analysis Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CONTAINER__ANALYSIS_PARAMETERS = AnalysisPackage.CONSTRAINT_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Constraint Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CONTAINER_FEATURE_COUNT = AnalysisPackage.CONSTRAINT_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Constraint Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CONTAINER_OPERATION_COUNT = AnalysisPackage.CONSTRAINT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.constraints.model.constraints.impl.AnalysisParameterImpl <em>Analysis Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.constraints.model.constraints.impl.AnalysisParameterImpl
	 * @see org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintsPackageImpl#getAnalysisParameter()
	 * @generated
	 */
	int ANALYSIS_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_PARAMETER__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Analysis Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Analysis Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_PARAMETER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint <em>Twca Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twca Constraint</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint
	 * @generated
	 */
	EClass getTwcaConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint#getNbConsecutiveActivations <em>Nb Consecutive Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Consecutive Activations</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint#getNbConsecutiveActivations()
	 * @see #getTwcaConstraint()
	 * @generated
	 */
	EAttribute getTwcaConstraint_NbConsecutiveActivations();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint#getNbMissedDeadlines <em>Nb Missed Deadlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Missed Deadlines</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint#getNbMissedDeadlines()
	 * @see #getTwcaConstraint()
	 * @generated
	 */
	EAttribute getTwcaConstraint_NbMissedDeadlines();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint#getConstrainedElement <em>Constrained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Element</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint#getConstrainedElement()
	 * @see #getTwcaConstraint()
	 * @generated
	 */
	EReference getTwcaConstraint_ConstrainedElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.constraints.model.constraints.LatencyConstraint <em>Latency Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency Constraint</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.LatencyConstraint
	 * @generated
	 */
	EClass getLatencyConstraint();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.constraints.model.constraints.JitterConstraint <em>Jitter Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jitter Constraint</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.JitterConstraint
	 * @generated
	 */
	EClass getJitterConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.constraints.model.constraints.JitterConstraint#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.JitterConstraint#getElements()
	 * @see #getJitterConstraint()
	 * @generated
	 */
	EReference getJitterConstraint_Elements();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.constraints.model.constraints.LoadConstraint <em>Load Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Constraint</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.LoadConstraint
	 * @generated
	 */
	EClass getLoadConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.constraints.model.constraints.LoadConstraint#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.LoadConstraint#getResources()
	 * @see #getLoadConstraint()
	 * @generated
	 */
	EReference getLoadConstraint_Resources();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint <em>Timing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Constraint</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.TimingConstraint
	 * @generated
	 */
	EClass getTimingConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getMin()
	 * @see #getTimingConstraint()
	 * @generated
	 */
	EAttribute getTimingConstraint_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getMax()
	 * @see #getTimingConstraint()
	 * @generated
	 */
	EAttribute getTimingConstraint_Max();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getTo()
	 * @see #getTimingConstraint()
	 * @generated
	 */
	EReference getTimingConstraint_To();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getFrom()
	 * @see #getTimingConstraint()
	 * @generated
	 */
	EReference getTimingConstraint_From();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getVia <em>Via</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Via</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getVia()
	 * @see #getTimingConstraint()
	 * @generated
	 */
	EReference getTimingConstraint_Via();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getValue()
	 * @see #getTimingConstraint()
	 * @generated
	 */
	EAttribute getTimingConstraint_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer <em>Constraint Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Container</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer
	 * @generated
	 */
	EClass getConstraintContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer#getTwcaConstraints <em>Twca Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Twca Constraints</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer#getTwcaConstraints()
	 * @see #getConstraintContainer()
	 * @generated
	 */
	EReference getConstraintContainer_TwcaConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer#getLatencyConstraints <em>Latency Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Latency Constraints</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer#getLatencyConstraints()
	 * @see #getConstraintContainer()
	 * @generated
	 */
	EReference getConstraintContainer_LatencyConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer#getJitterConstraints <em>Jitter Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jitter Constraints</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer#getJitterConstraints()
	 * @see #getConstraintContainer()
	 * @generated
	 */
	EReference getConstraintContainer_JitterConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer#getLoadConstraints <em>Load Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Load Constraints</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer#getLoadConstraints()
	 * @see #getConstraintContainer()
	 * @generated
	 */
	EReference getConstraintContainer_LoadConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer#getAnalysisParameters <em>Analysis Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analysis Parameters</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer#getAnalysisParameters()
	 * @see #getConstraintContainer()
	 * @generated
	 */
	EReference getConstraintContainer_AnalysisParameters();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.constraints.model.constraints.AnalysisParameter <em>Analysis Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Parameter</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.AnalysisParameter
	 * @generated
	 */
	EClass getAnalysisParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.constraints.model.constraints.AnalysisParameter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.AnalysisParameter#getKey()
	 * @see #getAnalysisParameter()
	 * @generated
	 */
	EAttribute getAnalysisParameter_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.constraints.model.constraints.AnalysisParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.constraints.model.constraints.AnalysisParameter#getValue()
	 * @see #getAnalysisParameter()
	 * @generated
	 */
	EAttribute getAnalysisParameter_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstraintsFactory getConstraintsFactory();

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
		 * The meta object literal for the '{@link org.polarsys.time4sys.constraints.model.constraints.impl.TwcaConstraintImpl <em>Twca Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.constraints.model.constraints.impl.TwcaConstraintImpl
		 * @see org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintsPackageImpl#getTwcaConstraint()
		 * @generated
		 */
		EClass TWCA_CONSTRAINT = eINSTANCE.getTwcaConstraint();

		/**
		 * The meta object literal for the '<em><b>Nb Consecutive Activations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWCA_CONSTRAINT__NB_CONSECUTIVE_ACTIVATIONS = eINSTANCE.getTwcaConstraint_NbConsecutiveActivations();

		/**
		 * The meta object literal for the '<em><b>Nb Missed Deadlines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWCA_CONSTRAINT__NB_MISSED_DEADLINES = eINSTANCE.getTwcaConstraint_NbMissedDeadlines();

		/**
		 * The meta object literal for the '<em><b>Constrained Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWCA_CONSTRAINT__CONSTRAINED_ELEMENT = eINSTANCE.getTwcaConstraint_ConstrainedElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.constraints.model.constraints.impl.LatencyConstraintImpl <em>Latency Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.constraints.model.constraints.impl.LatencyConstraintImpl
		 * @see org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintsPackageImpl#getLatencyConstraint()
		 * @generated
		 */
		EClass LATENCY_CONSTRAINT = eINSTANCE.getLatencyConstraint();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.constraints.model.constraints.impl.JitterConstraintImpl <em>Jitter Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.constraints.model.constraints.impl.JitterConstraintImpl
		 * @see org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintsPackageImpl#getJitterConstraint()
		 * @generated
		 */
		EClass JITTER_CONSTRAINT = eINSTANCE.getJitterConstraint();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JITTER_CONSTRAINT__ELEMENTS = eINSTANCE.getJitterConstraint_Elements();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.constraints.model.constraints.impl.LoadConstraintImpl <em>Load Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.constraints.model.constraints.impl.LoadConstraintImpl
		 * @see org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintsPackageImpl#getLoadConstraint()
		 * @generated
		 */
		EClass LOAD_CONSTRAINT = eINSTANCE.getLoadConstraint();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_CONSTRAINT__RESOURCES = eINSTANCE.getLoadConstraint_Resources();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.constraints.model.constraints.impl.TimingConstraintImpl <em>Timing Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.constraints.model.constraints.impl.TimingConstraintImpl
		 * @see org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintsPackageImpl#getTimingConstraint()
		 * @generated
		 */
		EClass TIMING_CONSTRAINT = eINSTANCE.getTimingConstraint();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_CONSTRAINT__MIN = eINSTANCE.getTimingConstraint_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_CONSTRAINT__MAX = eINSTANCE.getTimingConstraint_Max();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_CONSTRAINT__TO = eINSTANCE.getTimingConstraint_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_CONSTRAINT__FROM = eINSTANCE.getTimingConstraint_From();

		/**
		 * The meta object literal for the '<em><b>Via</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_CONSTRAINT__VIA = eINSTANCE.getTimingConstraint_Via();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_CONSTRAINT__VALUE = eINSTANCE.getTimingConstraint_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintContainerImpl <em>Constraint Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintContainerImpl
		 * @see org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintsPackageImpl#getConstraintContainer()
		 * @generated
		 */
		EClass CONSTRAINT_CONTAINER = eINSTANCE.getConstraintContainer();

		/**
		 * The meta object literal for the '<em><b>Twca Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_CONTAINER__TWCA_CONSTRAINTS = eINSTANCE.getConstraintContainer_TwcaConstraints();

		/**
		 * The meta object literal for the '<em><b>Latency Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_CONTAINER__LATENCY_CONSTRAINTS = eINSTANCE.getConstraintContainer_LatencyConstraints();

		/**
		 * The meta object literal for the '<em><b>Jitter Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_CONTAINER__JITTER_CONSTRAINTS = eINSTANCE.getConstraintContainer_JitterConstraints();

		/**
		 * The meta object literal for the '<em><b>Load Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_CONTAINER__LOAD_CONSTRAINTS = eINSTANCE.getConstraintContainer_LoadConstraints();

		/**
		 * The meta object literal for the '<em><b>Analysis Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_CONTAINER__ANALYSIS_PARAMETERS = eINSTANCE.getConstraintContainer_AnalysisParameters();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.constraints.model.constraints.impl.AnalysisParameterImpl <em>Analysis Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.constraints.model.constraints.impl.AnalysisParameterImpl
		 * @see org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintsPackageImpl#getAnalysisParameter()
		 * @generated
		 */
		EClass ANALYSIS_PARAMETER = eINSTANCE.getAnalysisParameter();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_PARAMETER__KEY = eINSTANCE.getAnalysisParameter_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_PARAMETER__VALUE = eINSTANCE.getAnalysisParameter_Value();

	}

} //ConstraintsPackage
