/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.grm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.TableDrivenSchedule;
import org.polarsys.time4sys.marte.grm.TableEntryType;

import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.TableEntryTypeImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.TableEntryTypeImpl#getTimeSlot <em>Time Slot</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.TableEntryTypeImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.TableEntryTypeImpl#getInitialBudget <em>Initial Budget</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableEntryTypeImpl extends SchedulingParameterImpl implements TableEntryType {
	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected TableDrivenSchedule schedule;

	/**
	 * The cached value of the '{@link #getTimeSlot() <em>Time Slot</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<Duration> timeSlot;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected EList<Duration> offset;

	/**
	 * The default value of the '{@link #getInitialBudget() <em>Initial Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialBudget()
	 * @generated
	 * @ordered
	 */
	protected static final Duration INITIAL_BUDGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialBudget() <em>Initial Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialBudget()
	 * @generated
	 * @ordered
	 */
	protected Duration initialBudget = INITIAL_BUDGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.TABLE_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableDrivenSchedule getSchedule() {
		if (schedule != null && schedule.eIsProxy()) {
			InternalEObject oldSchedule = (InternalEObject)schedule;
			schedule = (TableDrivenSchedule)eResolveProxy(oldSchedule);
			if (schedule != oldSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrmPackage.TABLE_ENTRY_TYPE__SCHEDULE, oldSchedule, schedule));
			}
		}
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableDrivenSchedule basicGetSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(TableDrivenSchedule newSchedule, NotificationChain msgs) {
		TableDrivenSchedule oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrmPackage.TABLE_ENTRY_TYPE__SCHEDULE, oldSchedule, newSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(TableDrivenSchedule newSchedule) {
		if (newSchedule != schedule) {
			NotificationChain msgs = null;
			if (schedule != null)
				msgs = ((InternalEObject)schedule).eInverseRemove(this, GrmPackage.TABLE_DRIVEN_SCHEDULE__ENTRIES, TableDrivenSchedule.class, msgs);
			if (newSchedule != null)
				msgs = ((InternalEObject)newSchedule).eInverseAdd(this, GrmPackage.TABLE_DRIVEN_SCHEDULE__ENTRIES, TableDrivenSchedule.class, msgs);
			msgs = basicSetSchedule(newSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.TABLE_ENTRY_TYPE__SCHEDULE, newSchedule, newSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Duration> getTimeSlot() {
		if (timeSlot == null) {
			timeSlot = new EDataTypeUniqueEList<Duration>(Duration.class, this, GrmPackage.TABLE_ENTRY_TYPE__TIME_SLOT);
		}
		return timeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Duration> getOffset() {
		if (offset == null) {
			offset = new EDataTypeEList<Duration>(Duration.class, this, GrmPackage.TABLE_ENTRY_TYPE__OFFSET);
		}
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getInitialBudget() {
		return initialBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialBudget(Duration newInitialBudget) {
		Duration oldInitialBudget = initialBudget;
		initialBudget = newInitialBudget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.TABLE_ENTRY_TYPE__INITIAL_BUDGET, oldInitialBudget, initialBudget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrmPackage.TABLE_ENTRY_TYPE__SCHEDULE:
				if (schedule != null)
					msgs = ((InternalEObject)schedule).eInverseRemove(this, GrmPackage.TABLE_DRIVEN_SCHEDULE__ENTRIES, TableDrivenSchedule.class, msgs);
				return basicSetSchedule((TableDrivenSchedule)otherEnd, msgs);
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
			case GrmPackage.TABLE_ENTRY_TYPE__SCHEDULE:
				return basicSetSchedule(null, msgs);
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
			case GrmPackage.TABLE_ENTRY_TYPE__SCHEDULE:
				if (resolve) return getSchedule();
				return basicGetSchedule();
			case GrmPackage.TABLE_ENTRY_TYPE__TIME_SLOT:
				return getTimeSlot();
			case GrmPackage.TABLE_ENTRY_TYPE__OFFSET:
				return getOffset();
			case GrmPackage.TABLE_ENTRY_TYPE__INITIAL_BUDGET:
				return getInitialBudget();
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
			case GrmPackage.TABLE_ENTRY_TYPE__SCHEDULE:
				setSchedule((TableDrivenSchedule)newValue);
				return;
			case GrmPackage.TABLE_ENTRY_TYPE__TIME_SLOT:
				getTimeSlot().clear();
				getTimeSlot().addAll((Collection<? extends Duration>)newValue);
				return;
			case GrmPackage.TABLE_ENTRY_TYPE__OFFSET:
				getOffset().clear();
				getOffset().addAll((Collection<? extends Duration>)newValue);
				return;
			case GrmPackage.TABLE_ENTRY_TYPE__INITIAL_BUDGET:
				setInitialBudget((Duration)newValue);
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
			case GrmPackage.TABLE_ENTRY_TYPE__SCHEDULE:
				setSchedule((TableDrivenSchedule)null);
				return;
			case GrmPackage.TABLE_ENTRY_TYPE__TIME_SLOT:
				getTimeSlot().clear();
				return;
			case GrmPackage.TABLE_ENTRY_TYPE__OFFSET:
				getOffset().clear();
				return;
			case GrmPackage.TABLE_ENTRY_TYPE__INITIAL_BUDGET:
				setInitialBudget(INITIAL_BUDGET_EDEFAULT);
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
			case GrmPackage.TABLE_ENTRY_TYPE__SCHEDULE:
				return schedule != null;
			case GrmPackage.TABLE_ENTRY_TYPE__TIME_SLOT:
				return timeSlot != null && !timeSlot.isEmpty();
			case GrmPackage.TABLE_ENTRY_TYPE__OFFSET:
				return offset != null && !offset.isEmpty();
			case GrmPackage.TABLE_ENTRY_TYPE__INITIAL_BUDGET:
				return INITIAL_BUDGET_EDEFAULT == null ? initialBudget != null : !INITIAL_BUDGET_EDEFAULT.equals(initialBudget);
		}
		return super.eIsSet(featureID);
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
		result.append(" (timeSlot: ");
		result.append(timeSlot);
		result.append(", offset: ");
		result.append(offset);
		result.append(", initialBudget: ");
		result.append(initialBudget);
		result.append(')');
		return result.toString();
	}

} //TableEntryTypeImpl
