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
package org.polarsys.time4sys.analysis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.EventModel;
import org.polarsys.time4sys.analysis.EventModelContainer;
import org.polarsys.time4sys.analysis.Offset;
import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.EventModelImpl#getOffsets <em>Offsets</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.EventModelImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.EventModelImpl#getJitter <em>Jitter</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.EventModelImpl#getDmin <em>Dmin</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.EventModelImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.EventModelImpl#isIsSporadic <em>Is Sporadic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventModelImpl extends MinimalEObjectImpl.Container implements EventModel {
	/**
	 * The cached value of the '{@link #getOffsets() <em>Offsets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsets()
	 * @generated
	 * @ordered
	 */
	protected EList<Offset> offsets;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Duration PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Duration period = PERIOD_EDEFAULT;

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
	 * The default value of the '{@link #getDmin() <em>Dmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmin()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DMIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDmin() <em>Dmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmin()
	 * @generated
	 * @ordered
	 */
	protected Duration dmin = DMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSporadic() <em>Is Sporadic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSporadic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SPORADIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSporadic() <em>Is Sporadic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSporadic()
	 * @generated
	 * @ordered
	 */
	protected boolean isSporadic = IS_SPORADIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.EVENT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Offset> getOffsets() {
		if (offsets == null) {
			offsets = new EObjectContainmentWithInverseEList<Offset>(Offset.class, this, AnalysisPackage.EVENT_MODEL__OFFSETS, AnalysisPackage.OFFSET__EVENT_MODEL);
		}
		return offsets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Duration newPeriod) {
		Duration oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.EVENT_MODEL__PERIOD, oldPeriod, period));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.EVENT_MODEL__JITTER, oldJitter, jitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDmin() {
		return dmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmin(Duration newDmin) {
		Duration oldDmin = dmin;
		dmin = newDmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.EVENT_MODEL__DMIN, oldDmin, dmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventModelContainer getParent() {
		if (eContainerFeatureID() != AnalysisPackage.EVENT_MODEL__PARENT) return null;
		return (EventModelContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(EventModelContainer newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, AnalysisPackage.EVENT_MODEL__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(EventModelContainer newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != AnalysisPackage.EVENT_MODEL__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, AnalysisPackage.EVENT_MODEL_CONTAINER__EVENT_MODEL, EventModelContainer.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.EVENT_MODEL__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSporadic() {
		return isSporadic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSporadic(boolean newIsSporadic) {
		boolean oldIsSporadic = isSporadic;
		isSporadic = newIsSporadic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.EVENT_MODEL__IS_SPORADIC, oldIsSporadic, isSporadic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.EVENT_MODEL__OFFSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOffsets()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.EVENT_MODEL__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((EventModelContainer)otherEnd, msgs);
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
			case AnalysisPackage.EVENT_MODEL__OFFSETS:
				return ((InternalEList<?>)getOffsets()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.EVENT_MODEL__PARENT:
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
			case AnalysisPackage.EVENT_MODEL__PARENT:
				return eInternalContainer().eInverseRemove(this, AnalysisPackage.EVENT_MODEL_CONTAINER__EVENT_MODEL, EventModelContainer.class, msgs);
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
			case AnalysisPackage.EVENT_MODEL__OFFSETS:
				return getOffsets();
			case AnalysisPackage.EVENT_MODEL__PERIOD:
				return getPeriod();
			case AnalysisPackage.EVENT_MODEL__JITTER:
				return getJitter();
			case AnalysisPackage.EVENT_MODEL__DMIN:
				return getDmin();
			case AnalysisPackage.EVENT_MODEL__PARENT:
				return getParent();
			case AnalysisPackage.EVENT_MODEL__IS_SPORADIC:
				return isIsSporadic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnalysisPackage.EVENT_MODEL__OFFSETS:
				getOffsets().clear();
				getOffsets().addAll((Collection<? extends Offset>)newValue);
				return;
			case AnalysisPackage.EVENT_MODEL__PERIOD:
				setPeriod((Duration)newValue);
				return;
			case AnalysisPackage.EVENT_MODEL__JITTER:
				setJitter((Duration)newValue);
				return;
			case AnalysisPackage.EVENT_MODEL__DMIN:
				setDmin((Duration)newValue);
				return;
			case AnalysisPackage.EVENT_MODEL__PARENT:
				setParent((EventModelContainer)newValue);
				return;
			case AnalysisPackage.EVENT_MODEL__IS_SPORADIC:
				setIsSporadic((Boolean)newValue);
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
			case AnalysisPackage.EVENT_MODEL__OFFSETS:
				getOffsets().clear();
				return;
			case AnalysisPackage.EVENT_MODEL__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case AnalysisPackage.EVENT_MODEL__JITTER:
				setJitter(JITTER_EDEFAULT);
				return;
			case AnalysisPackage.EVENT_MODEL__DMIN:
				setDmin(DMIN_EDEFAULT);
				return;
			case AnalysisPackage.EVENT_MODEL__PARENT:
				setParent((EventModelContainer)null);
				return;
			case AnalysisPackage.EVENT_MODEL__IS_SPORADIC:
				setIsSporadic(IS_SPORADIC_EDEFAULT);
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
			case AnalysisPackage.EVENT_MODEL__OFFSETS:
				return offsets != null && !offsets.isEmpty();
			case AnalysisPackage.EVENT_MODEL__PERIOD:
				return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
			case AnalysisPackage.EVENT_MODEL__JITTER:
				return JITTER_EDEFAULT == null ? jitter != null : !JITTER_EDEFAULT.equals(jitter);
			case AnalysisPackage.EVENT_MODEL__DMIN:
				return DMIN_EDEFAULT == null ? dmin != null : !DMIN_EDEFAULT.equals(dmin);
			case AnalysisPackage.EVENT_MODEL__PARENT:
				return getParent() != null;
			case AnalysisPackage.EVENT_MODEL__IS_SPORADIC:
				return isSporadic != IS_SPORADIC_EDEFAULT;
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
		result.append(" (period: ");
		result.append(period);
		result.append(", jitter: ");
		result.append(jitter);
		result.append(", dmin: ");
		result.append(dmin);
		result.append(", isSporadic: ");
		result.append(isSporadic);
		result.append(')');
		return result.toString();
	}

} //EventModelImpl
