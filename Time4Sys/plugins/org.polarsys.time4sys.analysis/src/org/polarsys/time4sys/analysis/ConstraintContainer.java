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
package org.polarsys.time4sys.analysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.ConstraintContainer#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.ConstraintContainer#getAnalyzedSystem <em>Analyzed System</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getConstraintContainer()
 * @model
 * @generated
 */
public interface ConstraintContainer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getConstraintContainer_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getConstraints();

	/**
	 * Returns the value of the '<em><b>Analyzed System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getConstraintContainer <em>Constraint Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analyzed System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analyzed System</em>' container reference.
	 * @see #setAnalyzedSystem(AnalyzedSystem)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getConstraintContainer_AnalyzedSystem()
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getConstraintContainer
	 * @model opposite="constraintContainer" transient="false"
	 * @generated
	 */
	AnalyzedSystem getAnalyzedSystem();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.ConstraintContainer#getAnalyzedSystem <em>Analyzed System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analyzed System</em>' container reference.
	 * @see #getAnalyzedSystem()
	 * @generated
	 */
	void setAnalyzedSystem(AnalyzedSystem value);

} // ConstraintContainer
