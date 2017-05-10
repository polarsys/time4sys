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
import org.polarsys.time4sys.analysis.EventModel;
import org.polarsys.time4sys.analysis.EventModelContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Model Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.EventModelContainerImpl#getEventModel <em>Event Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EventModelContainerImpl extends NamedElementImpl implements EventModelContainer {
	/**
	 * The cached value of the '{@link #getEventModel() <em>Event Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventModel()
	 * @generated
	 * @ordered
	 */
	protected EventModel eventModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventModelContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.EVENT_MODEL_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventModel getEventModel() {
		return eventModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventModel(EventModel newEventModel, NotificationChain msgs) {
		EventModel oldEventModel = eventModel;
		eventModel = newEventModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.EVENT_MODEL_CONTAINER__EVENT_MODEL, oldEventModel, newEventModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventModel(EventModel newEventModel) {
		if (newEventModel != eventModel) {
			NotificationChain msgs = null;
			if (eventModel != null)
				msgs = ((InternalEObject)eventModel).eInverseRemove(this, AnalysisPackage.EVENT_MODEL__PARENT, EventModel.class, msgs);
			if (newEventModel != null)
				msgs = ((InternalEObject)newEventModel).eInverseAdd(this, AnalysisPackage.EVENT_MODEL__PARENT, EventModel.class, msgs);
			msgs = basicSetEventModel(newEventModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.EVENT_MODEL_CONTAINER__EVENT_MODEL, newEventModel, newEventModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.EVENT_MODEL_CONTAINER__EVENT_MODEL:
				if (eventModel != null)
					msgs = ((InternalEObject)eventModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.EVENT_MODEL_CONTAINER__EVENT_MODEL, null, msgs);
				return basicSetEventModel((EventModel)otherEnd, msgs);
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
			case AnalysisPackage.EVENT_MODEL_CONTAINER__EVENT_MODEL:
				return basicSetEventModel(null, msgs);
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
			case AnalysisPackage.EVENT_MODEL_CONTAINER__EVENT_MODEL:
				return getEventModel();
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
			case AnalysisPackage.EVENT_MODEL_CONTAINER__EVENT_MODEL:
				setEventModel((EventModel)newValue);
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
			case AnalysisPackage.EVENT_MODEL_CONTAINER__EVENT_MODEL:
				setEventModel((EventModel)null);
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
			case AnalysisPackage.EVENT_MODEL_CONTAINER__EVENT_MODEL:
				return eventModel != null;
		}
		return super.eIsSet(featureID);
	}

} //EventModelContainerImpl
