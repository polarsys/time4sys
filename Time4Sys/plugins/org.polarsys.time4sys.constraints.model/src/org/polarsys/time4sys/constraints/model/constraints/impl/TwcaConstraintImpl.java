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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage;
import org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Twca Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.impl.TwcaConstraintImpl#getNbConsecutiveActivations <em>Nb Consecutive Activations</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.impl.TwcaConstraintImpl#getNbMissedDeadlines <em>Nb Missed Deadlines</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.impl.TwcaConstraintImpl#getConstrainedElement <em>Constrained Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TwcaConstraintImpl extends MinimalEObjectImpl.Container implements TwcaConstraint {
	/**
	 * The default value of the '{@link #getNbConsecutiveActivations() <em>Nb Consecutive Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbConsecutiveActivations()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_CONSECUTIVE_ACTIVATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbConsecutiveActivations() <em>Nb Consecutive Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbConsecutiveActivations()
	 * @generated
	 * @ordered
	 */
	protected int nbConsecutiveActivations = NB_CONSECUTIVE_ACTIVATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbMissedDeadlines() <em>Nb Missed Deadlines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbMissedDeadlines()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_MISSED_DEADLINES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbMissedDeadlines() <em>Nb Missed Deadlines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbMissedDeadlines()
	 * @generated
	 * @ordered
	 */
	protected int nbMissedDeadlines = NB_MISSED_DEADLINES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstrainedElement() <em>Constrained Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedElement()
	 * @generated
	 * @ordered
	 */
	protected EObject constrainedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwcaConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.TWCA_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbConsecutiveActivations() {
		return nbConsecutiveActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbConsecutiveActivations(int newNbConsecutiveActivations) {
		int oldNbConsecutiveActivations = nbConsecutiveActivations;
		nbConsecutiveActivations = newNbConsecutiveActivations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.TWCA_CONSTRAINT__NB_CONSECUTIVE_ACTIVATIONS, oldNbConsecutiveActivations, nbConsecutiveActivations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbMissedDeadlines() {
		return nbMissedDeadlines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbMissedDeadlines(int newNbMissedDeadlines) {
		int oldNbMissedDeadlines = nbMissedDeadlines;
		nbMissedDeadlines = newNbMissedDeadlines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.TWCA_CONSTRAINT__NB_MISSED_DEADLINES, oldNbMissedDeadlines, nbMissedDeadlines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getConstrainedElement() {
		if (constrainedElement != null && constrainedElement.eIsProxy()) {
			InternalEObject oldConstrainedElement = (InternalEObject)constrainedElement;
			constrainedElement = eResolveProxy(oldConstrainedElement);
			if (constrainedElement != oldConstrainedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintsPackage.TWCA_CONSTRAINT__CONSTRAINED_ELEMENT, oldConstrainedElement, constrainedElement));
			}
		}
		return constrainedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetConstrainedElement() {
		return constrainedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedElement(EObject newConstrainedElement) {
		EObject oldConstrainedElement = constrainedElement;
		constrainedElement = newConstrainedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.TWCA_CONSTRAINT__CONSTRAINED_ELEMENT, oldConstrainedElement, constrainedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintsPackage.TWCA_CONSTRAINT__NB_CONSECUTIVE_ACTIVATIONS:
				return getNbConsecutiveActivations();
			case ConstraintsPackage.TWCA_CONSTRAINT__NB_MISSED_DEADLINES:
				return getNbMissedDeadlines();
			case ConstraintsPackage.TWCA_CONSTRAINT__CONSTRAINED_ELEMENT:
				if (resolve) return getConstrainedElement();
				return basicGetConstrainedElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConstraintsPackage.TWCA_CONSTRAINT__NB_CONSECUTIVE_ACTIVATIONS:
				setNbConsecutiveActivations((Integer)newValue);
				return;
			case ConstraintsPackage.TWCA_CONSTRAINT__NB_MISSED_DEADLINES:
				setNbMissedDeadlines((Integer)newValue);
				return;
			case ConstraintsPackage.TWCA_CONSTRAINT__CONSTRAINED_ELEMENT:
				setConstrainedElement((EObject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConstraintsPackage.TWCA_CONSTRAINT__NB_CONSECUTIVE_ACTIVATIONS:
				setNbConsecutiveActivations(NB_CONSECUTIVE_ACTIVATIONS_EDEFAULT);
				return;
			case ConstraintsPackage.TWCA_CONSTRAINT__NB_MISSED_DEADLINES:
				setNbMissedDeadlines(NB_MISSED_DEADLINES_EDEFAULT);
				return;
			case ConstraintsPackage.TWCA_CONSTRAINT__CONSTRAINED_ELEMENT:
				setConstrainedElement((EObject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConstraintsPackage.TWCA_CONSTRAINT__NB_CONSECUTIVE_ACTIVATIONS:
				return nbConsecutiveActivations != NB_CONSECUTIVE_ACTIVATIONS_EDEFAULT;
			case ConstraintsPackage.TWCA_CONSTRAINT__NB_MISSED_DEADLINES:
				return nbMissedDeadlines != NB_MISSED_DEADLINES_EDEFAULT;
			case ConstraintsPackage.TWCA_CONSTRAINT__CONSTRAINED_ELEMENT:
				return constrainedElement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nbConsecutiveActivations: ");
		result.append(nbConsecutiveActivations);
		result.append(", nbMissedDeadlines: ");
		result.append(nbMissedDeadlines);
		result.append(')');
		return result.toString();
	}

} //TwcaConstraintImpl
