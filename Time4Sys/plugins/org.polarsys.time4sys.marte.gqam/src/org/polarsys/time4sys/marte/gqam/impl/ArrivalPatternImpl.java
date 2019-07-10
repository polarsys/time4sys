/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.gqam.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.time4sys.marte.gqam.ArrivalPattern;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.Reference;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.coreelements.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrival Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.ArrivalPatternImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.ArrivalPatternImpl#getJitter <em>Jitter</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.ArrivalPatternImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.ArrivalPatternImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.ArrivalPatternImpl#isIsControl <em>Is Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArrivalPatternImpl extends ModelElementImpl implements ArrivalPattern {
	/**
	 * The default value of the '{@link #getJitter() <em>Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected static final Duration JITTER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getJitter() <em>Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected Duration jitter = JITTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final Duration PHASE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected Duration phase = PHASE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reference;

	/**
	 * The default value of the '{@link #isIsControl() <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTROL_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isIsControl() <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControl()
	 * @generated
	 * @ordered
	 */
	protected boolean isControl = IS_CONTROL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrivalPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.ARRIVAL_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadEvent getParent() {
		if (eContainerFeatureID() != GqamPackage.ARRIVAL_PATTERN__PARENT) return null;
		return (WorkloadEvent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(WorkloadEvent newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, GqamPackage.ARRIVAL_PATTERN__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(WorkloadEvent newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != GqamPackage.ARRIVAL_PATTERN__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, GqamPackage.WORKLOAD_EVENT__PATTERN, WorkloadEvent.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.ARRIVAL_PATTERN__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getJitter() {
		return jitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJitter(Duration newJitter) {
		Duration oldJitter = jitter;
		jitter = newJitter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.ARRIVAL_PATTERN__JITTER, oldJitter, jitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(Duration newPhase) {
		Duration oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.ARRIVAL_PATTERN__PHASE, oldPhase, phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (Reference)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GqamPackage.ARRIVAL_PATTERN__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Reference newReference) {
		Reference oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.ARRIVAL_PATTERN__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsControl() {
		return isControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControl(boolean newIsControl) {
		boolean oldIsControl = isControl;
		isControl = newIsControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.ARRIVAL_PATTERN__IS_CONTROL, oldIsControl, isControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GqamPackage.ARRIVAL_PATTERN__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((WorkloadEvent)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GqamPackage.ARRIVAL_PATTERN__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GqamPackage.ARRIVAL_PATTERN__PARENT:
				return eInternalContainer().eInverseRemove(this, GqamPackage.WORKLOAD_EVENT__PATTERN, WorkloadEvent.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GqamPackage.ARRIVAL_PATTERN__PARENT:
				return getParent();
			case GqamPackage.ARRIVAL_PATTERN__JITTER:
				return getJitter();
			case GqamPackage.ARRIVAL_PATTERN__PHASE:
				return getPhase();
			case GqamPackage.ARRIVAL_PATTERN__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case GqamPackage.ARRIVAL_PATTERN__IS_CONTROL:
				return isIsControl();
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
			case GqamPackage.ARRIVAL_PATTERN__PARENT:
				setParent((WorkloadEvent)newValue);
				return;
			case GqamPackage.ARRIVAL_PATTERN__JITTER:
				setJitter((Duration)newValue);
				return;
			case GqamPackage.ARRIVAL_PATTERN__PHASE:
				setPhase((Duration)newValue);
				return;
			case GqamPackage.ARRIVAL_PATTERN__REFERENCE:
				setReference((Reference)newValue);
				return;
			case GqamPackage.ARRIVAL_PATTERN__IS_CONTROL:
				setIsControl((Boolean)newValue);
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
			case GqamPackage.ARRIVAL_PATTERN__PARENT:
				setParent((WorkloadEvent)null);
				return;
			case GqamPackage.ARRIVAL_PATTERN__JITTER:
				setJitter(JITTER_EDEFAULT);
				return;
			case GqamPackage.ARRIVAL_PATTERN__PHASE:
				setPhase(PHASE_EDEFAULT);
				return;
			case GqamPackage.ARRIVAL_PATTERN__REFERENCE:
				setReference((Reference)null);
				return;
			case GqamPackage.ARRIVAL_PATTERN__IS_CONTROL:
				setIsControl(IS_CONTROL_EDEFAULT);
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
			case GqamPackage.ARRIVAL_PATTERN__PARENT:
				return getParent() != null;
			case GqamPackage.ARRIVAL_PATTERN__JITTER:
				return JITTER_EDEFAULT == null ? jitter != null : !JITTER_EDEFAULT.equals(jitter);
			case GqamPackage.ARRIVAL_PATTERN__PHASE:
				return PHASE_EDEFAULT == null ? phase != null : !PHASE_EDEFAULT.equals(phase);
			case GqamPackage.ARRIVAL_PATTERN__REFERENCE:
				return reference != null;
			case GqamPackage.ARRIVAL_PATTERN__IS_CONTROL:
				return isControl != IS_CONTROL_EDEFAULT;
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
		result.append(" (jitter: ");
		result.append(jitter);
		result.append(", phase: ");
		result.append(phase);
		result.append(", isControl: ");
		result.append(isControl);
		result.append(')');
		return result.toString();
	}

} //ArrivalPatternImpl
