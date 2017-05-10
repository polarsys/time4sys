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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.ComputingResource;
import org.polarsys.time4sys.analysis.Fragment;
import org.polarsys.time4sys.analysis.MutualExclusionResource;
import org.polarsys.time4sys.analysis.SynchronizableElement;
import org.polarsys.time4sys.analysis.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.TaskImpl#getLockedMutexes <em>Locked Mutexes</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.TaskImpl#getMappedTo <em>Mapped To</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.TaskImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.TaskImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.TaskImpl#getBlockingTime <em>Blocking Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends SchedulableElementImpl implements Task {
	/**
	 * The cached value of the '{@link #getLockedMutexes() <em>Locked Mutexes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockedMutexes()
	 * @generated
	 * @ordered
	 */
	protected EList<MutualExclusionResource> lockedMutexes;

	/**
	 * The cached value of the '{@link #getMappedTo() <em>Mapped To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedTo()
	 * @generated
	 * @ordered
	 */
	protected ComputingResource mappedTo;

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
	 * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected Fragment first;

	/**
	 * The default value of the '{@link #getBlockingTime() <em>Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected static final long BLOCKING_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBlockingTime() <em>Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected long blockingTime = BLOCKING_TIME_EDEFAULT;

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
		return AnalysisPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MutualExclusionResource> getLockedMutexes() {
		if (lockedMutexes == null) {
			lockedMutexes = new EObjectWithInverseResolvingEList.ManyInverse<MutualExclusionResource>(MutualExclusionResource.class, this, AnalysisPackage.TASK__LOCKED_MUTEXES, AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__ELEMENTS);
		}
		return lockedMutexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingResource getMappedTo() {
		if (mappedTo != null && mappedTo.eIsProxy()) {
			InternalEObject oldMappedTo = (InternalEObject)mappedTo;
			mappedTo = (ComputingResource)eResolveProxy(oldMappedTo);
			if (mappedTo != oldMappedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.TASK__MAPPED_TO, oldMappedTo, mappedTo));
			}
		}
		return mappedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingResource basicGetMappedTo() {
		return mappedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappedTo(ComputingResource newMappedTo, NotificationChain msgs) {
		ComputingResource oldMappedTo = mappedTo;
		mappedTo = newMappedTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.TASK__MAPPED_TO, oldMappedTo, newMappedTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedTo(ComputingResource newMappedTo) {
		if (newMappedTo != mappedTo) {
			NotificationChain msgs = null;
			if (mappedTo != null)
				msgs = ((InternalEObject)mappedTo).eInverseRemove(this, AnalysisPackage.COMPUTING_RESOURCE__TASKS_AFFECTED_ON, ComputingResource.class, msgs);
			if (newMappedTo != null)
				msgs = ((InternalEObject)newMappedTo).eInverseAdd(this, AnalysisPackage.COMPUTING_RESOURCE__TASKS_AFFECTED_ON, ComputingResource.class, msgs);
			msgs = basicSetMappedTo(newMappedTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.TASK__MAPPED_TO, newMappedTo, newMappedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fragment> getFragments() {
		if (fragments == null) {
			fragments = new EObjectContainmentWithInverseEList<Fragment>(Fragment.class, this, AnalysisPackage.TASK__FRAGMENTS, AnalysisPackage.FRAGMENT__TASK);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment getFirst() {
		if (first != null && first.eIsProxy()) {
			InternalEObject oldFirst = (InternalEObject)first;
			first = (Fragment)eResolveProxy(oldFirst);
			if (first != oldFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.TASK__FIRST, oldFirst, first));
			}
		}
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment basicGetFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(Fragment newFirst) {
		Fragment oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.TASK__FIRST, oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getBlockingTime() {
		return blockingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockingTime(long newBlockingTime) {
		long oldBlockingTime = blockingTime;
		blockingTime = newBlockingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.TASK__BLOCKING_TIME, oldBlockingTime, blockingTime));
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
			case AnalysisPackage.TASK__LOCKED_MUTEXES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLockedMutexes()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.TASK__MAPPED_TO:
				if (mappedTo != null)
					msgs = ((InternalEObject)mappedTo).eInverseRemove(this, AnalysisPackage.COMPUTING_RESOURCE__TASKS_AFFECTED_ON, ComputingResource.class, msgs);
				return basicSetMappedTo((ComputingResource)otherEnd, msgs);
			case AnalysisPackage.TASK__FRAGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFragments()).basicAdd(otherEnd, msgs);
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
			case AnalysisPackage.TASK__LOCKED_MUTEXES:
				return ((InternalEList<?>)getLockedMutexes()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.TASK__MAPPED_TO:
				return basicSetMappedTo(null, msgs);
			case AnalysisPackage.TASK__FRAGMENTS:
				return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
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
			case AnalysisPackage.TASK__LOCKED_MUTEXES:
				return getLockedMutexes();
			case AnalysisPackage.TASK__MAPPED_TO:
				if (resolve) return getMappedTo();
				return basicGetMappedTo();
			case AnalysisPackage.TASK__FRAGMENTS:
				return getFragments();
			case AnalysisPackage.TASK__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
			case AnalysisPackage.TASK__BLOCKING_TIME:
				return getBlockingTime();
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
			case AnalysisPackage.TASK__LOCKED_MUTEXES:
				getLockedMutexes().clear();
				getLockedMutexes().addAll((Collection<? extends MutualExclusionResource>)newValue);
				return;
			case AnalysisPackage.TASK__MAPPED_TO:
				setMappedTo((ComputingResource)newValue);
				return;
			case AnalysisPackage.TASK__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends Fragment>)newValue);
				return;
			case AnalysisPackage.TASK__FIRST:
				setFirst((Fragment)newValue);
				return;
			case AnalysisPackage.TASK__BLOCKING_TIME:
				setBlockingTime((Long)newValue);
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
			case AnalysisPackage.TASK__LOCKED_MUTEXES:
				getLockedMutexes().clear();
				return;
			case AnalysisPackage.TASK__MAPPED_TO:
				setMappedTo((ComputingResource)null);
				return;
			case AnalysisPackage.TASK__FRAGMENTS:
				getFragments().clear();
				return;
			case AnalysisPackage.TASK__FIRST:
				setFirst((Fragment)null);
				return;
			case AnalysisPackage.TASK__BLOCKING_TIME:
				setBlockingTime(BLOCKING_TIME_EDEFAULT);
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
			case AnalysisPackage.TASK__LOCKED_MUTEXES:
				return lockedMutexes != null && !lockedMutexes.isEmpty();
			case AnalysisPackage.TASK__MAPPED_TO:
				return mappedTo != null;
			case AnalysisPackage.TASK__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
			case AnalysisPackage.TASK__FIRST:
				return first != null;
			case AnalysisPackage.TASK__BLOCKING_TIME:
				return blockingTime != BLOCKING_TIME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SynchronizableElement.class) {
			switch (derivedFeatureID) {
				case AnalysisPackage.TASK__LOCKED_MUTEXES: return AnalysisPackage.SYNCHRONIZABLE_ELEMENT__LOCKED_MUTEXES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SynchronizableElement.class) {
			switch (baseFeatureID) {
				case AnalysisPackage.SYNCHRONIZABLE_ELEMENT__LOCKED_MUTEXES: return AnalysisPackage.TASK__LOCKED_MUTEXES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (blockingTime: ");
		result.append(blockingTime);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
