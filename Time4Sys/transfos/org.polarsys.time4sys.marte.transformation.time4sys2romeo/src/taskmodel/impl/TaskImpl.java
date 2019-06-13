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

import taskmodel.AbstractFragment;
import taskmodel.Fragment;
import taskmodel.SharingResourceFragment;
import taskmodel.Stimulus;
import taskmodel.Task;
import taskmodel.TaskmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taskmodel.impl.TaskImpl#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link taskmodel.impl.TaskImpl#getAllFragments <em>All Fragments</em>}</li>
 *   <li>{@link taskmodel.impl.TaskImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link taskmodel.impl.TaskImpl#getSharingResourceFragments <em>Sharing Resource Fragments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The cached value of the '{@link #getStimulus() <em>Stimulus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulus()
	 * @generated
	 * @ordered
	 */
	protected Stimulus stimulus;

	/**
	 * The cached value of the '{@link #getAllFragments() <em>All Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractFragment> allFragments;

	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<Fragment> fragments;

	/**
	 * The cached value of the '{@link #getSharingResourceFragments() <em>Sharing Resource Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharingResourceFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<SharingResourceFragment> sharingResourceFragments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskmodelPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stimulus getStimulus() {
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStimulus(Stimulus newStimulus, NotificationChain msgs) {
		Stimulus oldStimulus = stimulus;
		stimulus = newStimulus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskmodelPackage.TASK__STIMULUS, oldStimulus, newStimulus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStimulus(Stimulus newStimulus) {
		if (newStimulus != stimulus) {
			NotificationChain msgs = null;
			if (stimulus != null)
				msgs = ((InternalEObject)stimulus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.TASK__STIMULUS, null, msgs);
			if (newStimulus != null)
				msgs = ((InternalEObject)newStimulus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskmodelPackage.TASK__STIMULUS, null, msgs);
			msgs = basicSetStimulus(newStimulus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskmodelPackage.TASK__STIMULUS, newStimulus, newStimulus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fragment> getFragments() {
		if (fragments == null) {
			fragments = new EObjectContainmentEList<Fragment>(Fragment.class, this, TaskmodelPackage.TASK__FRAGMENTS);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharingResourceFragment> getSharingResourceFragments() {
		if (sharingResourceFragments == null) {
			sharingResourceFragments = new EObjectContainmentEList<SharingResourceFragment>(SharingResourceFragment.class, this, TaskmodelPackage.TASK__SHARING_RESOURCE_FRAGMENTS);
		}
		return sharingResourceFragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractFragment> getAllFragments() {
		if (allFragments == null) {
			allFragments = new EObjectContainmentEList<AbstractFragment>(AbstractFragment.class, this, TaskmodelPackage.TASK__ALL_FRAGMENTS);
		}
		return allFragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task clone() {
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
			case TaskmodelPackage.TASK__STIMULUS:
				return basicSetStimulus(null, msgs);
			case TaskmodelPackage.TASK__ALL_FRAGMENTS:
				return ((InternalEList<?>)getAllFragments()).basicRemove(otherEnd, msgs);
			case TaskmodelPackage.TASK__FRAGMENTS:
				return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
			case TaskmodelPackage.TASK__SHARING_RESOURCE_FRAGMENTS:
				return ((InternalEList<?>)getSharingResourceFragments()).basicRemove(otherEnd, msgs);
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
			case TaskmodelPackage.TASK__STIMULUS:
				return getStimulus();
			case TaskmodelPackage.TASK__ALL_FRAGMENTS:
				return getAllFragments();
			case TaskmodelPackage.TASK__FRAGMENTS:
				return getFragments();
			case TaskmodelPackage.TASK__SHARING_RESOURCE_FRAGMENTS:
				return getSharingResourceFragments();
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
			case TaskmodelPackage.TASK__STIMULUS:
				setStimulus((Stimulus)newValue);
				return;
			case TaskmodelPackage.TASK__ALL_FRAGMENTS:
				getAllFragments().clear();
				getAllFragments().addAll((Collection<? extends AbstractFragment>)newValue);
				return;
			case TaskmodelPackage.TASK__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends Fragment>)newValue);
				return;
			case TaskmodelPackage.TASK__SHARING_RESOURCE_FRAGMENTS:
				getSharingResourceFragments().clear();
				getSharingResourceFragments().addAll((Collection<? extends SharingResourceFragment>)newValue);
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
			case TaskmodelPackage.TASK__STIMULUS:
				setStimulus((Stimulus)null);
				return;
			case TaskmodelPackage.TASK__ALL_FRAGMENTS:
				getAllFragments().clear();
				return;
			case TaskmodelPackage.TASK__FRAGMENTS:
				getFragments().clear();
				return;
			case TaskmodelPackage.TASK__SHARING_RESOURCE_FRAGMENTS:
				getSharingResourceFragments().clear();
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
			case TaskmodelPackage.TASK__STIMULUS:
				return stimulus != null;
			case TaskmodelPackage.TASK__ALL_FRAGMENTS:
				return allFragments != null && !allFragments.isEmpty();
			case TaskmodelPackage.TASK__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
			case TaskmodelPackage.TASK__SHARING_RESOURCE_FRAGMENTS:
				return sharingResourceFragments != null && !sharingResourceFragments.isEmpty();
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
			case TaskmodelPackage.TASK___CLONE:
				return clone();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskImpl
