/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.nfp.annotation.annotation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint#getConstrainedElement <em>Constrained Element</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint#getContext <em>Context</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends org.polarsys.time4sys.marte.nfp.coreelements.Constraint {
	/**
	 * Returns the value of the '<em><b>Constrained Element</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Element</em>' reference list.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage#getConstraint_ConstrainedElement()
	 * @model
	 * @generated
	 */
	EList<AnnotatedElement> getConstrainedElement();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(AnnotatedModel)
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage#getConstraint_Context()
	 * @model
	 * @generated
	 */
	AnnotatedModel getContext();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(AnnotatedModel value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.nfp.annotation.annotation.ConstraintKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.ConstraintKind
	 * @see #setKind(ConstraintKind)
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage#getConstraint_Kind()
	 * @model
	 * @generated
	 */
	ConstraintKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.ConstraintKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ConstraintKind value);

} // Constraint
