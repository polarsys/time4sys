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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getMin <em>Min</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getMax <em>Max</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getTo <em>To</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getFrom <em>From</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getVia <em>Via</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getTimingConstraint()
 * @model abstract="true"
 * @generated
 */
public interface TimingConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(double)
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getTimingConstraint_Min()
	 * @model
	 * @generated
	 */
	double getMin();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(double value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(double)
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getTimingConstraint_Max()
	 * @model
	 * @generated
	 */
	double getMax();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(double value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(EObject)
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getTimingConstraint_To()
	 * @model
	 * @generated
	 */
	EObject getTo();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(EObject value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(EObject)
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getTimingConstraint_From()
	 * @model
	 * @generated
	 */
	EObject getFrom();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(EObject value);

	/**
	 * Returns the value of the '<em><b>Via</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Via</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Via</em>' reference list.
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getTimingConstraint_Via()
	 * @model
	 * @generated
	 */
	EList<EObject> getVia();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage#getTimingConstraint_Value()
	 * @model
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.constraints.model.constraints.TimingConstraint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

} // TimingConstraint
