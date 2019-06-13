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
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet.Connection;
import petrinet.Place;
import taskmodel.MutualExclusionResource;
import taskmodel.TaskmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mutual Exclusion Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taskmodel.impl.MutualExclusionResourceImpl#getMutualExclusionResourcePlace <em>Mutual Exclusion Resource Place</em>}</li>
 *   <li>{@link taskmodel.impl.MutualExclusionResourceImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MutualExclusionResourceImpl extends MinimalEObjectImpl.Container implements MutualExclusionResource {
	/**
	 * The cached value of the '{@link #getMutualExclusionResourcePlace() <em>Mutual Exclusion Resource Place</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutualExclusionResourcePlace()
	 * @generated
	 * @ordered
	 */
	protected Place mutualExclusionResourcePlace;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MutualExclusionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskmodelPackage.Literals.MUTUAL_EXCLUSION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getMutualExclusionResourcePlace() {
		return mutualExclusionResourcePlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMutualExclusionResourcePlace(Place newMutualExclusionResourcePlace, NotificationChain msgs) {
		Place oldMutualExclusionResourcePlace = mutualExclusionResourcePlace;
		mutualExclusionResourcePlace = newMutualExclusionResourcePlace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE__MUTUAL_EXCLUSION_RESOURCE_PLACE, oldMutualExclusionResourcePlace, newMutualExclusionResourcePlace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMutualExclusionResourcePlace(Place newMutualExclusionResourcePlace) {
		if (newMutualExclusionResourcePlace != mutualExclusionResourcePlace) {
			NotificationChain msgs = null;
			if (mutualExclusionResourcePlace != null)
				msgs = ((InternalEObject)mutualExclusionResourcePlace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE__MUTUAL_EXCLUSION_RESOURCE_PLACE, null, msgs);
			if (newMutualExclusionResourcePlace != null)
				msgs = ((InternalEObject)newMutualExclusionResourcePlace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE__MUTUAL_EXCLUSION_RESOURCE_PLACE, null, msgs);
			msgs = basicSetMutualExclusionResourcePlace(newMutualExclusionResourcePlace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE__MUTUAL_EXCLUSION_RESOURCE_PLACE, newMutualExclusionResourcePlace, newMutualExclusionResourcePlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this, TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutualExclusionResource clone() {
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
			case TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE__MUTUAL_EXCLUSION_RESOURCE_PLACE:
				return basicSetMutualExclusionResourcePlace(null, msgs);
			case TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
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
			case TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE__MUTUAL_EXCLUSION_RESOURCE_PLACE:
				return getMutualExclusionResourcePlace();
			case TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE__CONNECTIONS:
				return getConnections();
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
			case TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE__MUTUAL_EXCLUSION_RESOURCE_PLACE:
				setMutualExclusionResourcePlace((Place)newValue);
				return;
			case TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
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
			case TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE__MUTUAL_EXCLUSION_RESOURCE_PLACE:
				setMutualExclusionResourcePlace((Place)null);
				return;
			case TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE__CONNECTIONS:
				getConnections().clear();
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
			case TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE__MUTUAL_EXCLUSION_RESOURCE_PLACE:
				return mutualExclusionResourcePlace != null;
			case TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE__CONNECTIONS:
				return connections != null && !connections.isEmpty();
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
			case TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE___CLONE:
				return clone();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MutualExclusionResourceImpl
