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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet.Connection;
import petrinet.Place;
import petrinet.Transition;
import taskmodel.Observer;
import taskmodel.TaskmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taskmodel.impl.ObserverImpl#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link taskmodel.impl.ObserverImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link taskmodel.impl.ObserverImpl#getOwnedPlaces <em>Owned Places</em>}</li>
 *   <li>{@link taskmodel.impl.ObserverImpl#getCheckPlaces <em>Check Places</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ObserverImpl extends MinimalEObjectImpl.Container implements Observer {
	/**
	 * The cached value of the '{@link #getOwnedTransitions() <em>Owned Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> ownedTransitions;

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
	 * The cached value of the '{@link #getOwnedPlaces() <em>Owned Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> ownedPlaces;

	/**
	 * The cached value of the '{@link #getCheckPlaces() <em>Check Places</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> checkPlaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObserverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskmodelPackage.Literals.OBSERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOwnedTransitions() {
		if (ownedTransitions == null) {
			ownedTransitions = new EObjectContainmentEList<Transition>(Transition.class, this, TaskmodelPackage.OBSERVER__OWNED_TRANSITIONS);
		}
		return ownedTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this, TaskmodelPackage.OBSERVER__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getOwnedPlaces() {
		if (ownedPlaces == null) {
			ownedPlaces = new EObjectContainmentEList<Place>(Place.class, this, TaskmodelPackage.OBSERVER__OWNED_PLACES);
		}
		return ownedPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getCheckPlaces() {
		if (checkPlaces == null) {
			checkPlaces = new EObjectResolvingEList<Place>(Place.class, this, TaskmodelPackage.OBSERVER__CHECK_PLACES);
		}
		return checkPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskmodelPackage.OBSERVER__OWNED_TRANSITIONS:
				return ((InternalEList<?>)getOwnedTransitions()).basicRemove(otherEnd, msgs);
			case TaskmodelPackage.OBSERVER__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case TaskmodelPackage.OBSERVER__OWNED_PLACES:
				return ((InternalEList<?>)getOwnedPlaces()).basicRemove(otherEnd, msgs);
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
			case TaskmodelPackage.OBSERVER__OWNED_TRANSITIONS:
				return getOwnedTransitions();
			case TaskmodelPackage.OBSERVER__CONNECTIONS:
				return getConnections();
			case TaskmodelPackage.OBSERVER__OWNED_PLACES:
				return getOwnedPlaces();
			case TaskmodelPackage.OBSERVER__CHECK_PLACES:
				return getCheckPlaces();
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
			case TaskmodelPackage.OBSERVER__OWNED_TRANSITIONS:
				getOwnedTransitions().clear();
				getOwnedTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case TaskmodelPackage.OBSERVER__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case TaskmodelPackage.OBSERVER__OWNED_PLACES:
				getOwnedPlaces().clear();
				getOwnedPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case TaskmodelPackage.OBSERVER__CHECK_PLACES:
				getCheckPlaces().clear();
				getCheckPlaces().addAll((Collection<? extends Place>)newValue);
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
			case TaskmodelPackage.OBSERVER__OWNED_TRANSITIONS:
				getOwnedTransitions().clear();
				return;
			case TaskmodelPackage.OBSERVER__CONNECTIONS:
				getConnections().clear();
				return;
			case TaskmodelPackage.OBSERVER__OWNED_PLACES:
				getOwnedPlaces().clear();
				return;
			case TaskmodelPackage.OBSERVER__CHECK_PLACES:
				getCheckPlaces().clear();
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
			case TaskmodelPackage.OBSERVER__OWNED_TRANSITIONS:
				return ownedTransitions != null && !ownedTransitions.isEmpty();
			case TaskmodelPackage.OBSERVER__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case TaskmodelPackage.OBSERVER__OWNED_PLACES:
				return ownedPlaces != null && !ownedPlaces.isEmpty();
			case TaskmodelPackage.OBSERVER__CHECK_PLACES:
				return checkPlaces != null && !checkPlaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObserverImpl
