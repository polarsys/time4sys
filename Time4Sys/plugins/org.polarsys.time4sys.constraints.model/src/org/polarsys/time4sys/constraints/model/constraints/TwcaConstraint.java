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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Twca Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint#getNbConsecutiveActivations <em>Nb Consecutive Activations</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint#getNbMissedDeadlines <em>Nb Missed Deadlines</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint#getConstrainedElement <em>Constrained Element</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getTwcaConstraint()
 * @model
 * @generated
 */
public interface TwcaConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb Consecutive Activations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Consecutive Activations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Consecutive Activations</em>' attribute.
	 * @see #setNbConsecutiveActivations(int)
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getTwcaConstraint_NbConsecutiveActivations()
	 * @model
	 * @generated
	 */
	int getNbConsecutiveActivations();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint#getNbConsecutiveActivations <em>Nb Consecutive Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Consecutive Activations</em>' attribute.
	 * @see #getNbConsecutiveActivations()
	 * @generated
	 */
	void setNbConsecutiveActivations(int value);

	/**
	 * Returns the value of the '<em><b>Nb Missed Deadlines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Missed Deadlines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Missed Deadlines</em>' attribute.
	 * @see #setNbMissedDeadlines(int)
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getTwcaConstraint_NbMissedDeadlines()
	 * @model
	 * @generated
	 */
	int getNbMissedDeadlines();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint#getNbMissedDeadlines <em>Nb Missed Deadlines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Missed Deadlines</em>' attribute.
	 * @see #getNbMissedDeadlines()
	 * @generated
	 */
	void setNbMissedDeadlines(int value);

	/**
	 * Returns the value of the '<em><b>Constrained Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Element</em>' reference.
	 * @see #setConstrainedElement(EObject)
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getTwcaConstraint_ConstrainedElement()
	 * @model
	 * @generated
	 */
	EObject getConstrainedElement();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint#getConstrainedElement <em>Constrained Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Element</em>' reference.
	 * @see #getConstrainedElement()
	 * @generated
	 */
	void setConstrainedElement(EObject value);

} // TwcaConstraint
