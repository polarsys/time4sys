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
 * An implementation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.OutputPortImpl#getSendTo <em>Send To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputPortImpl extends PortImpl implements OutputPort {
	/**
	 * The cached value of the '{@link #getSendTo() <em>Send To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendTo()
	 * @generated
	 * @ordered
	 */
	protected InputPort sendTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.OUTPUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort getSendTo() {
		if (sendTo != null && sendTo.eIsProxy()) {
			InternalEObject oldSendTo = (InternalEObject)sendTo;
			sendTo = (InputPort)eResolveProxy(oldSendTo);
			if (sendTo != oldSendTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.OUTPUT_PORT__SEND_TO, oldSendTo, sendTo));
			}
		}
		return sendTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort basicGetSendTo() {
		return sendTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendTo(InputPort newSendTo, NotificationChain msgs) {
		InputPort oldSendTo = sendTo;
		sendTo = newSendTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.OUTPUT_PORT__SEND_TO, oldSendTo, newSendTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendTo(InputPort newSendTo) {
		if (newSendTo != sendTo) {
			NotificationChain msgs = null;
			if (sendTo != null)
				msgs = ((InternalEObject)sendTo).eInverseRemove(this, AnalysisPackage.INPUT_PORT__RECEIVE_FROM, InputPort.class, msgs);
			if (newSendTo != null)
				msgs = ((InternalEObject)newSendTo).eInverseAdd(this, AnalysisPackage.INPUT_PORT__RECEIVE_FROM, InputPort.class, msgs);
			msgs = basicSetSendTo(newSendTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.OUTPUT_PORT__SEND_TO, newSendTo, newSendTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.OUTPUT_PORT__SEND_TO:
				if (sendTo != null)
					msgs = ((InternalEObject)sendTo).eInverseRemove(this, AnalysisPackage.INPUT_PORT__RECEIVE_FROM, InputPort.class, msgs);
				return basicSetSendTo((InputPort)otherEnd, msgs);
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
			case AnalysisPackage.OUTPUT_PORT__SEND_TO:
				return basicSetSendTo(null, msgs);
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
			case AnalysisPackage.OUTPUT_PORT__SEND_TO:
				if (resolve) return getSendTo();
				return basicGetSendTo();
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
			case AnalysisPackage.OUTPUT_PORT__SEND_TO:
				setSendTo((InputPort)newValue);
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
			case AnalysisPackage.OUTPUT_PORT__SEND_TO:
				setSendTo((InputPort)null);
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
			case AnalysisPackage.OUTPUT_PORT__SEND_TO:
				return sendTo != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputPortImpl
