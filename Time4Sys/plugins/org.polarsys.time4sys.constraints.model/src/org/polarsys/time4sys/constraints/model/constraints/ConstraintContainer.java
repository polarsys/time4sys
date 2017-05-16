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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer#getTwcaConstraints <em>Twca Constraints</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer#getLatencyConstraints <em>Latency Constraints</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer#getJitterConstraints <em>Jitter Constraints</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer#getLoadConstraints <em>Load Constraints</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer#getAnalysisParameters <em>Analysis Parameters</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getConstraintContainer()
 * @model
 * @generated
 */
public interface ConstraintContainer extends org.polarsys.time4sys.analysis.ConstraintContainer {
	/**
	 * Returns the value of the '<em><b>Twca Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Twca Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Twca Constraints</em>' containment reference list.
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getConstraintContainer_TwcaConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<TwcaConstraint> getTwcaConstraints();

	/**
	 * Returns the value of the '<em><b>Latency Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.constraints.model.constraints.LatencyConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency Constraints</em>' containment reference list.
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getConstraintContainer_LatencyConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<LatencyConstraint> getLatencyConstraints();

	/**
	 * Returns the value of the '<em><b>Jitter Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.constraints.model.constraints.JitterConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitter Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitter Constraints</em>' containment reference list.
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getConstraintContainer_JitterConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<JitterConstraint> getJitterConstraints();

	/**
	 * Returns the value of the '<em><b>Load Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.constraints.model.constraints.LoadConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Constraints</em>' containment reference list.
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getConstraintContainer_LoadConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<LoadConstraint> getLoadConstraints();

	/**
	 * Returns the value of the '<em><b>Analysis Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.constraints.model.constraints.AnalysisParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Parameters</em>' containment reference list.
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getConstraintContainer_AnalysisParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnalysisParameter> getAnalysisParameters();

} // ConstraintContainer
