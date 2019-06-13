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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet.Connection;
import taskmodel.Fragment;
import taskmodel.SharingResourceFragment;
import taskmodel.TaskmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sharing Resource Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taskmodel.impl.SharingResourceFragmentImpl#getFirstFragment <em>First Fragment</em>}</li>
 *   <li>{@link taskmodel.impl.SharingResourceFragmentImpl#getSecondFragment <em>Second Fragment</em>}</li>
 *   <li>{@link taskmodel.impl.SharingResourceFragmentImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SharingResourceFragmentImpl extends AbstractFragmentImpl implements SharingResourceFragment {
	/**
	 * The cached value of the '{@link #getFirstFragment() <em>First Fragment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstFragment()
	 * @generated
	 * @ordered
	 */
	protected Fragment firstFragment;

	/**
	 * The cached value of the '{@link #getSecondFragment() <em>Second Fragment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondFragment()
	 * @generated
	 * @ordered
	 */
	protected Fragment secondFragment;

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
	protected SharingResourceFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskmodelPackage.Literals.SHARING_RESOURCE_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment getFirstFragment() {
		return firstFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstFragment(Fragment newFirstFragment, NotificationChain msgs) {
		Fragment oldFirstFragment = firstFragment;
		firstFragment = newFirstFragment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__FIRST_FRAGMENT, oldFirstFragment, newFirstFragment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstFragment(Fragment newFirstFragment) {
		if (newFirstFragment != firstFragment) {
			NotificationChain msgs = null;
			if (firstFragment != null)
				msgs = ((InternalEObject)firstFragment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__FIRST_FRAGMENT, null, msgs);
			if (newFirstFragment != null)
				msgs = ((InternalEObject)newFirstFragment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__FIRST_FRAGMENT, null, msgs);
			msgs = basicSetFirstFragment(newFirstFragment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__FIRST_FRAGMENT, newFirstFragment, newFirstFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment getSecondFragment() {
		return secondFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondFragment(Fragment newSecondFragment, NotificationChain msgs) {
		Fragment oldSecondFragment = secondFragment;
		secondFragment = newSecondFragment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__SECOND_FRAGMENT, oldSecondFragment, newSecondFragment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondFragment(Fragment newSecondFragment) {
		if (newSecondFragment != secondFragment) {
			NotificationChain msgs = null;
			if (secondFragment != null)
				msgs = ((InternalEObject)secondFragment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__SECOND_FRAGMENT, null, msgs);
			if (newSecondFragment != null)
				msgs = ((InternalEObject)newSecondFragment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__SECOND_FRAGMENT, null, msgs);
			msgs = basicSetSecondFragment(newSecondFragment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__SECOND_FRAGMENT, newSecondFragment, newSecondFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this, TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingResourceFragment clone() {
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
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__FIRST_FRAGMENT:
				return basicSetFirstFragment(null, msgs);
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__SECOND_FRAGMENT:
				return basicSetSecondFragment(null, msgs);
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__CONNECTIONS:
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
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__FIRST_FRAGMENT:
				return getFirstFragment();
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__SECOND_FRAGMENT:
				return getSecondFragment();
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__CONNECTIONS:
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
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__FIRST_FRAGMENT:
				setFirstFragment((Fragment)newValue);
				return;
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__SECOND_FRAGMENT:
				setSecondFragment((Fragment)newValue);
				return;
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__CONNECTIONS:
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
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__FIRST_FRAGMENT:
				setFirstFragment((Fragment)null);
				return;
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__SECOND_FRAGMENT:
				setSecondFragment((Fragment)null);
				return;
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__CONNECTIONS:
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
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__FIRST_FRAGMENT:
				return firstFragment != null;
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__SECOND_FRAGMENT:
				return secondFragment != null;
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT__CONNECTIONS:
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
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT___CLONE:
				return clone();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SharingResourceFragmentImpl
