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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.InputPort;
import org.polarsys.time4sys.analysis.OutputPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.InputPortImpl#getReceiveFrom <em>Receive From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputPortImpl extends PortImpl implements InputPort {
	/**
	 * The cached value of the '{@link #getReceiveFrom() <em>Receive From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveFrom()
	 * @generated
	 * @ordered
	 */
	protected OutputPort receiveFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.INPUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort getReceiveFrom() {
		if (receiveFrom != null && receiveFrom.eIsProxy()) {
			InternalEObject oldReceiveFrom = (InternalEObject)receiveFrom;
			receiveFrom = (OutputPort)eResolveProxy(oldReceiveFrom);
			if (receiveFrom != oldReceiveFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.INPUT_PORT__RECEIVE_FROM, oldReceiveFrom, receiveFrom));
			}
		}
		return receiveFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort basicGetReceiveFrom() {
		return receiveFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiveFrom(OutputPort newReceiveFrom, NotificationChain msgs) {
		OutputPort oldReceiveFrom = receiveFrom;
		receiveFrom = newReceiveFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.INPUT_PORT__RECEIVE_FROM, oldReceiveFrom, newReceiveFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveFrom(OutputPort newReceiveFrom) {
		if (newReceiveFrom != receiveFrom) {
			NotificationChain msgs = null;
			if (receiveFrom != null)
				msgs = ((InternalEObject)receiveFrom).eInverseRemove(this, AnalysisPackage.OUTPUT_PORT__SEND_TO, OutputPort.class, msgs);
			if (newReceiveFrom != null)
				msgs = ((InternalEObject)newReceiveFrom).eInverseAdd(this, AnalysisPackage.OUTPUT_PORT__SEND_TO, OutputPort.class, msgs);
			msgs = basicSetReceiveFrom(newReceiveFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.INPUT_PORT__RECEIVE_FROM, newReceiveFrom, newReceiveFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.INPUT_PORT__RECEIVE_FROM:
				if (receiveFrom != null)
					msgs = ((InternalEObject)receiveFrom).eInverseRemove(this, AnalysisPackage.OUTPUT_PORT__SEND_TO, OutputPort.class, msgs);
				return basicSetReceiveFrom((OutputPort)otherEnd, msgs);
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
			case AnalysisPackage.INPUT_PORT__RECEIVE_FROM:
				return basicSetReceiveFrom(null, msgs);
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
			case AnalysisPackage.INPUT_PORT__RECEIVE_FROM:
				if (resolve) return getReceiveFrom();
				return basicGetReceiveFrom();
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
			case AnalysisPackage.INPUT_PORT__RECEIVE_FROM:
				setReceiveFrom((OutputPort)newValue);
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
			case AnalysisPackage.INPUT_PORT__RECEIVE_FROM:
				setReceiveFrom((OutputPort)null);
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
			case AnalysisPackage.INPUT_PORT__RECEIVE_FROM:
				return receiveFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //InputPortImpl
