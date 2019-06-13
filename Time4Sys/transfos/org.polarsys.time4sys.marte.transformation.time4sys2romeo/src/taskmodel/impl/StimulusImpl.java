/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Thanh Dat NGUYEN- initial API and implementation
 *
 *******************************************************************************/
/**
 */
package taskmodel.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import taskmodel.First_Release;
import taskmodel.Jitter;
import taskmodel.Offset;
import taskmodel.Period;
import taskmodel.Stimulus;
import taskmodel.TaskmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stimulus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taskmodel.impl.StimulusImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link taskmodel.impl.StimulusImpl#getFirstRelease <em>First Release</em>}</li>
 *   <li>{@link taskmodel.impl.StimulusImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link taskmodel.impl.StimulusImpl#getJitter <em>Jitter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StimulusImpl extends MinimalEObjectImpl.Container implements Stimulus {
	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected Offset offset;

	/**
	 * The cached value of the '{@link #getFirstRelease() <em>First Release</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstRelease()
	 * @generated
	 * @ordered
	 */
	protected First_Release firstRelease;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getJitter() <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected Jitter jitter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StimulusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskmodelPackage.Literals.STIMULUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offset getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset(Offset newOffset, NotificationChain msgs) {
		Offset oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskmodelPackage.STIMULUS__OFFSET, oldOffset, newOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(Offset newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.STIMULUS__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.STIMULUS__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskmodelPackage.STIMULUS__OFFSET, newOffset, newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public First_Release getFirstRelease() {
		return firstRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstRelease(First_Release newFirstRelease, NotificationChain msgs) {
		First_Release oldFirstRelease = firstRelease;
		firstRelease = newFirstRelease;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskmodelPackage.STIMULUS__FIRST_RELEASE, oldFirstRelease, newFirstRelease);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstRelease(First_Release newFirstRelease) {
		if (newFirstRelease != firstRelease) {
			NotificationChain msgs = null;
			if (firstRelease != null)
				msgs = ((InternalEObject)firstRelease).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.STIMULUS__FIRST_RELEASE, null, msgs);
			if (newFirstRelease != null)
				msgs = ((InternalEObject)newFirstRelease).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.STIMULUS__FIRST_RELEASE, null, msgs);
			msgs = basicSetFirstRelease(newFirstRelease, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskmodelPackage.STIMULUS__FIRST_RELEASE, newFirstRelease, newFirstRelease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskmodelPackage.STIMULUS__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.STIMULUS__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.STIMULUS__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskmodelPackage.STIMULUS__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jitter getJitter() {
		return jitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJitter(Jitter newJitter, NotificationChain msgs) {
		Jitter oldJitter = jitter;
		jitter = newJitter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskmodelPackage.STIMULUS__JITTER, oldJitter, newJitter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJitter(Jitter newJitter) {
		if (newJitter != jitter) {
			NotificationChain msgs = null;
			if (jitter != null)
				msgs = ((InternalEObject)jitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.STIMULUS__JITTER, null, msgs);
			if (newJitter != null)
				msgs = ((InternalEObject)newJitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.STIMULUS__JITTER, null, msgs);
			msgs = basicSetJitter(newJitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskmodelPackage.STIMULUS__JITTER, newJitter, newJitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stimulus clone() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskmodelPackage.STIMULUS__OFFSET:
				return basicSetOffset(null, msgs);
			case TaskmodelPackage.STIMULUS__FIRST_RELEASE:
				return basicSetFirstRelease(null, msgs);
			case TaskmodelPackage.STIMULUS__PERIOD:
				return basicSetPeriod(null, msgs);
			case TaskmodelPackage.STIMULUS__JITTER:
				return basicSetJitter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskmodelPackage.STIMULUS__OFFSET:
				return getOffset();
			case TaskmodelPackage.STIMULUS__FIRST_RELEASE:
				return getFirstRelease();
			case TaskmodelPackage.STIMULUS__PERIOD:
				return getPeriod();
			case TaskmodelPackage.STIMULUS__JITTER:
				return getJitter();
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
			case TaskmodelPackage.STIMULUS__OFFSET:
				setOffset((Offset)newValue);
				return;
			case TaskmodelPackage.STIMULUS__FIRST_RELEASE:
				setFirstRelease((First_Release)newValue);
				return;
			case TaskmodelPackage.STIMULUS__PERIOD:
				setPeriod((Period)newValue);
				return;
			case TaskmodelPackage.STIMULUS__JITTER:
				setJitter((Jitter)newValue);
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
			case TaskmodelPackage.STIMULUS__OFFSET:
				setOffset((Offset)null);
				return;
			case TaskmodelPackage.STIMULUS__FIRST_RELEASE:
				setFirstRelease((First_Release)null);
				return;
			case TaskmodelPackage.STIMULUS__PERIOD:
				setPeriod((Period)null);
				return;
			case TaskmodelPackage.STIMULUS__JITTER:
				setJitter((Jitter)null);
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
			case TaskmodelPackage.STIMULUS__OFFSET:
				return offset != null;
			case TaskmodelPackage.STIMULUS__FIRST_RELEASE:
				return firstRelease != null;
			case TaskmodelPackage.STIMULUS__PERIOD:
				return period != null;
			case TaskmodelPackage.STIMULUS__JITTER:
				return jitter != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TaskmodelPackage.STIMULUS___CLONE:
				return clone();
		}
		return super.eInvoke(operationID, arguments);
	}

} //StimulusImpl
