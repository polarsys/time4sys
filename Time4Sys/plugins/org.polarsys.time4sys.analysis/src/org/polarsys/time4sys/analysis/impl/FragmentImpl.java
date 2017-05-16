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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.Fragment;
import org.polarsys.time4sys.analysis.MutualExclusionResource;
import org.polarsys.time4sys.analysis.SynchronizableElement;
import org.polarsys.time4sys.analysis.Task;
import org.polarsys.time4sys.marte.nfp.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.FragmentImpl#getLockedMutexes <em>Locked Mutexes</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.FragmentImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.FragmentImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.FragmentImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.FragmentImpl#getCET <em>CET</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FragmentImpl extends NamedElementImpl implements Fragment {
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
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Fragment next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Fragment previous;

	/**
	 * The default value of the '{@link #getCET() <em>CET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCET()
	 * @generated
	 * @ordered
	 */
	protected static final TimeInterval CET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCET() <em>CET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCET()
	 * @generated
	 * @ordered
	 */
	protected TimeInterval cet = CET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MutualExclusionResource> getLockedMutexes() {
		if (lockedMutexes == null) {
			lockedMutexes = new EObjectWithInverseResolvingEList.ManyInverse<MutualExclusionResource>(MutualExclusionResource.class, this, AnalysisPackage.FRAGMENT__LOCKED_MUTEXES, AnalysisPackage.MUTUAL_EXCLUSION_RESOURCE__ELEMENTS);
		}
		return lockedMutexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (Fragment)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.FRAGMENT__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(Fragment newNext, NotificationChain msgs) {
		Fragment oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.FRAGMENT__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(Fragment newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, AnalysisPackage.FRAGMENT__PREVIOUS, Fragment.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, AnalysisPackage.FRAGMENT__PREVIOUS, Fragment.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.FRAGMENT__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (Fragment)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.FRAGMENT__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(Fragment newPrevious, NotificationChain msgs) {
		Fragment oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.FRAGMENT__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(Fragment newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, AnalysisPackage.FRAGMENT__NEXT, Fragment.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, AnalysisPackage.FRAGMENT__NEXT, Fragment.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.FRAGMENT__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		if (eContainerFeatureID() != AnalysisPackage.FRAGMENT__TASK) return null;
		return (Task)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTask, AnalysisPackage.FRAGMENT__TASK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		if (newTask != eInternalContainer() || (eContainerFeatureID() != AnalysisPackage.FRAGMENT__TASK && newTask != null)) {
			if (EcoreUtil.isAncestor(this, newTask))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTask != null)
				msgs = ((InternalEObject)newTask).eInverseAdd(this, AnalysisPackage.TASK__FRAGMENTS, Task.class, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.FRAGMENT__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval getCET() {
		return cet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCET(TimeInterval newCET) {
		TimeInterval oldCET = cet;
		cet = newCET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.FRAGMENT__CET, oldCET, cet));
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
			case AnalysisPackage.FRAGMENT__LOCKED_MUTEXES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLockedMutexes()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.FRAGMENT__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, AnalysisPackage.FRAGMENT__PREVIOUS, Fragment.class, msgs);
				return basicSetNext((Fragment)otherEnd, msgs);
			case AnalysisPackage.FRAGMENT__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, AnalysisPackage.FRAGMENT__NEXT, Fragment.class, msgs);
				return basicSetPrevious((Fragment)otherEnd, msgs);
			case AnalysisPackage.FRAGMENT__TASK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTask((Task)otherEnd, msgs);
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
			case AnalysisPackage.FRAGMENT__LOCKED_MUTEXES:
				return ((InternalEList<?>)getLockedMutexes()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.FRAGMENT__NEXT:
				return basicSetNext(null, msgs);
			case AnalysisPackage.FRAGMENT__PREVIOUS:
				return basicSetPrevious(null, msgs);
			case AnalysisPackage.FRAGMENT__TASK:
				return basicSetTask(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AnalysisPackage.FRAGMENT__TASK:
				return eInternalContainer().eInverseRemove(this, AnalysisPackage.TASK__FRAGMENTS, Task.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisPackage.FRAGMENT__LOCKED_MUTEXES:
				return getLockedMutexes();
			case AnalysisPackage.FRAGMENT__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case AnalysisPackage.FRAGMENT__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case AnalysisPackage.FRAGMENT__TASK:
				return getTask();
			case AnalysisPackage.FRAGMENT__CET:
				return getCET();
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
			case AnalysisPackage.FRAGMENT__LOCKED_MUTEXES:
				getLockedMutexes().clear();
				getLockedMutexes().addAll((Collection<? extends MutualExclusionResource>)newValue);
				return;
			case AnalysisPackage.FRAGMENT__NEXT:
				setNext((Fragment)newValue);
				return;
			case AnalysisPackage.FRAGMENT__PREVIOUS:
				setPrevious((Fragment)newValue);
				return;
			case AnalysisPackage.FRAGMENT__TASK:
				setTask((Task)newValue);
				return;
			case AnalysisPackage.FRAGMENT__CET:
				setCET((TimeInterval)newValue);
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
			case AnalysisPackage.FRAGMENT__LOCKED_MUTEXES:
				getLockedMutexes().clear();
				return;
			case AnalysisPackage.FRAGMENT__NEXT:
				setNext((Fragment)null);
				return;
			case AnalysisPackage.FRAGMENT__PREVIOUS:
				setPrevious((Fragment)null);
				return;
			case AnalysisPackage.FRAGMENT__TASK:
				setTask((Task)null);
				return;
			case AnalysisPackage.FRAGMENT__CET:
				setCET(CET_EDEFAULT);
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
			case AnalysisPackage.FRAGMENT__LOCKED_MUTEXES:
				return lockedMutexes != null && !lockedMutexes.isEmpty();
			case AnalysisPackage.FRAGMENT__NEXT:
				return next != null;
			case AnalysisPackage.FRAGMENT__PREVIOUS:
				return previous != null;
			case AnalysisPackage.FRAGMENT__TASK:
				return getTask() != null;
			case AnalysisPackage.FRAGMENT__CET:
				return CET_EDEFAULT == null ? cet != null : !CET_EDEFAULT.equals(cet);
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
				case AnalysisPackage.FRAGMENT__LOCKED_MUTEXES: return AnalysisPackage.SYNCHRONIZABLE_ELEMENT__LOCKED_MUTEXES;
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
				case AnalysisPackage.SYNCHRONIZABLE_ELEMENT__LOCKED_MUTEXES: return AnalysisPackage.FRAGMENT__LOCKED_MUTEXES;
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
		result.append(" (CET: ");
		result.append(cet);
		result.append(')');
		return result.toString();
	}

} //FragmentImpl
