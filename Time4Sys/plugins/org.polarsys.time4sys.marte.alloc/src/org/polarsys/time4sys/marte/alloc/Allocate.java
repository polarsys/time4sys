/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.alloc;

import org.eclipse.emf.common.util.EList;

import org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint;

import org.polarsys.time4sys.marte.nfp.coreelements.Abstraction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allocate is a dependency based on UML::Abstraction. It is a mechanism for associating elements of different types, or in different hierarchies, at an abstract level. Allocate is used for assessing user model consistency and directing future design activity. It is expected that an «allocate» relationship between model elements is a precursor to a more concrete relationship between the elements, their properties, operations, attributes, or sub-classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.alloc.Allocate#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.alloc.Allocate#getNature <em>Nature</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.alloc.Allocate#getImpliedConstraint <em>Implied Constraint</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.alloc.AllocPackage#getAllocate()
 * @model
 * @generated
 */
public interface Allocate extends Abstraction {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"hybrid"</code>.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.alloc.AllocationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This differentiates the kind of allocations, whether both allocated elements on each side are structural, behavioral, or whether this is a hybrid allocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.marte.alloc.AllocationKind
	 * @see #setKind(AllocationKind)
	 * @see org.polarsys.time4sys.marte.alloc.AllocPackage#getAllocate_Kind()
	 * @model default="hybrid"
	 * @generated
	 */
	AllocationKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.alloc.Allocate#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.marte.alloc.AllocationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(AllocationKind value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.alloc.AllocationNature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This identifies the purpose of the allocation, whether the allocation is equivalent to a spatial distribution, where several application model elements are distributed to different resources or whether timed elements are scheduled according to a given scheduler.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see org.polarsys.time4sys.marte.alloc.AllocationNature
	 * @see #setNature(AllocationNature)
	 * @see org.polarsys.time4sys.marte.alloc.AllocPackage#getAllocate_Nature()
	 * @model
	 * @generated
	 */
	AllocationNature getNature();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.alloc.Allocate#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see org.polarsys.time4sys.marte.alloc.AllocationNature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(AllocationNature value);

	/**
	 * Returns the value of the '<em><b>Implied Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implied Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implied Constraint</em>' reference list.
	 * @see org.polarsys.time4sys.marte.alloc.AllocPackage#getAllocate_ImpliedConstraint()
	 * @model
	 * @generated
	 */
	EList<Constraint> getImpliedConstraint();

} // Allocate
