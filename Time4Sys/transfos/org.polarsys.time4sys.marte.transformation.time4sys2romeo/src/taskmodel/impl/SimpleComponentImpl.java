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
import petrinet.Transition;
import taskmodel.SimpleComponent;
import taskmodel.TaskmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taskmodel.impl.SimpleComponentImpl#getOwnedTransition <em>Owned Transition</em>}</li>
 *   <li>{@link taskmodel.impl.SimpleComponentImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link taskmodel.impl.SimpleComponentImpl#getOwnedPlace <em>Owned Place</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SimpleComponentImpl extends MinimalEObjectImpl.Container implements SimpleComponent {
	/**
	 * The cached value of the '{@link #getOwnedTransition() <em>Owned Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition ownedTransition;

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
	 * The cached value of the '{@link #getOwnedPlace() <em>Owned Place</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPlace()
	 * @generated
	 * @ordered
	 */
	protected Place ownedPlace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskmodelPackage.Literals.SIMPLE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getOwnedTransition() {
		return ownedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTransition(Transition newOwnedTransition, NotificationChain msgs) {
		Transition oldOwnedTransition = ownedTransition;
		ownedTransition = newOwnedTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskmodelPackage.SIMPLE_COMPONENT__OWNED_TRANSITION, oldOwnedTransition, newOwnedTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTransition(Transition newOwnedTransition) {
		if (newOwnedTransition != ownedTransition) {
			NotificationChain msgs = null;
			if (ownedTransition != null)
				msgs = ((InternalEObject)ownedTransition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.SIMPLE_COMPONENT__OWNED_TRANSITION, null, msgs);
			if (newOwnedTransition != null)
				msgs = ((InternalEObject)newOwnedTransition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.SIMPLE_COMPONENT__OWNED_TRANSITION, null, msgs);
			msgs = basicSetOwnedTransition(newOwnedTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskmodelPackage.SIMPLE_COMPONENT__OWNED_TRANSITION, newOwnedTransition, newOwnedTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this, TaskmodelPackage.SIMPLE_COMPONENT__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getOwnedPlace() {
		return ownedPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPlace(Place newOwnedPlace, NotificationChain msgs) {
		Place oldOwnedPlace = ownedPlace;
		ownedPlace = newOwnedPlace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskmodelPackage.SIMPLE_COMPONENT__OWNED_PLACE, oldOwnedPlace, newOwnedPlace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPlace(Place newOwnedPlace) {
		if (newOwnedPlace != ownedPlace) {
			NotificationChain msgs = null;
			if (ownedPlace != null)
				msgs = ((InternalEObject)ownedPlace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.SIMPLE_COMPONENT__OWNED_PLACE, null, msgs);
			if (newOwnedPlace != null)
				msgs = ((InternalEObject)newOwnedPlace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.SIMPLE_COMPONENT__OWNED_PLACE, null, msgs);
			msgs = basicSetOwnedPlace(newOwnedPlace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskmodelPackage.SIMPLE_COMPONENT__OWNED_PLACE, newOwnedPlace, newOwnedPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskmodelPackage.SIMPLE_COMPONENT__OWNED_TRANSITION:
				return basicSetOwnedTransition(null, msgs);
			case TaskmodelPackage.SIMPLE_COMPONENT__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case TaskmodelPackage.SIMPLE_COMPONENT__OWNED_PLACE:
				return basicSetOwnedPlace(null, msgs);
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
			case TaskmodelPackage.SIMPLE_COMPONENT__OWNED_TRANSITION:
				return getOwnedTransition();
			case TaskmodelPackage.SIMPLE_COMPONENT__CONNECTIONS:
				return getConnections();
			case TaskmodelPackage.SIMPLE_COMPONENT__OWNED_PLACE:
				return getOwnedPlace();
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
			case TaskmodelPackage.SIMPLE_COMPONENT__OWNED_TRANSITION:
				setOwnedTransition((Transition)newValue);
				return;
			case TaskmodelPackage.SIMPLE_COMPONENT__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case TaskmodelPackage.SIMPLE_COMPONENT__OWNED_PLACE:
				setOwnedPlace((Place)newValue);
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
			case TaskmodelPackage.SIMPLE_COMPONENT__OWNED_TRANSITION:
				setOwnedTransition((Transition)null);
				return;
			case TaskmodelPackage.SIMPLE_COMPONENT__CONNECTIONS:
				getConnections().clear();
				return;
			case TaskmodelPackage.SIMPLE_COMPONENT__OWNED_PLACE:
				setOwnedPlace((Place)null);
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
			case TaskmodelPackage.SIMPLE_COMPONENT__OWNED_TRANSITION:
				return ownedTransition != null;
			case TaskmodelPackage.SIMPLE_COMPONENT__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case TaskmodelPackage.SIMPLE_COMPONENT__OWNED_PLACE:
				return ownedPlace != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleComponentImpl
