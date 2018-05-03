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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.TableDrivenSchedule;
import org.polarsys.time4sys.marte.grm.TableEntryType;

import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Driven Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.TableDrivenScheduleImpl#getFrameCycleTime <em>Frame Cycle Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.TableDrivenScheduleImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableDrivenScheduleImpl extends ScheduleSpecificationImpl implements TableDrivenSchedule {
	/**
	 * The default value of the '{@link #getFrameCycleTime() <em>Frame Cycle Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameCycleTime()
	 * @generated
	 * @ordered
	 */
	protected static final Duration FRAME_CYCLE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrameCycleTime() <em>Frame Cycle Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameCycleTime()
	 * @generated
	 * @ordered
	 */
	protected Duration frameCycleTime = FRAME_CYCLE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<TableEntryType> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableDrivenScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.TABLE_DRIVEN_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getFrameCycleTime() {
		return frameCycleTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameCycleTime(Duration newFrameCycleTime) {
		Duration oldFrameCycleTime = frameCycleTime;
		frameCycleTime = newFrameCycleTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.TABLE_DRIVEN_SCHEDULE__FRAME_CYCLE_TIME, oldFrameCycleTime, frameCycleTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableEntryType> getEntries() {
		if (entries == null) {
			entries = new EObjectWithInverseResolvingEList<TableEntryType>(TableEntryType.class, this, GrmPackage.TABLE_DRIVEN_SCHEDULE__ENTRIES, GrmPackage.TABLE_ENTRY_TYPE__SCHEDULE);
		}
		return entries;
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
			case GrmPackage.TABLE_DRIVEN_SCHEDULE__ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntries()).basicAdd(otherEnd, msgs);
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
			case GrmPackage.TABLE_DRIVEN_SCHEDULE__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
			case GrmPackage.TABLE_DRIVEN_SCHEDULE__FRAME_CYCLE_TIME:
				return getFrameCycleTime();
			case GrmPackage.TABLE_DRIVEN_SCHEDULE__ENTRIES:
				return getEntries();
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
			case GrmPackage.TABLE_DRIVEN_SCHEDULE__FRAME_CYCLE_TIME:
				setFrameCycleTime((Duration)newValue);
				return;
			case GrmPackage.TABLE_DRIVEN_SCHEDULE__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends TableEntryType>)newValue);
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
			case GrmPackage.TABLE_DRIVEN_SCHEDULE__FRAME_CYCLE_TIME:
				setFrameCycleTime(FRAME_CYCLE_TIME_EDEFAULT);
				return;
			case GrmPackage.TABLE_DRIVEN_SCHEDULE__ENTRIES:
				getEntries().clear();
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
			case GrmPackage.TABLE_DRIVEN_SCHEDULE__FRAME_CYCLE_TIME:
				return FRAME_CYCLE_TIME_EDEFAULT == null ? frameCycleTime != null : !FRAME_CYCLE_TIME_EDEFAULT.equals(frameCycleTime);
			case GrmPackage.TABLE_DRIVEN_SCHEDULE__ENTRIES:
				return entries != null && !entries.isEmpty();
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
		result.append(" (frameCycleTime: ");
		result.append(frameCycleTime);
		result.append(')');
		return result.toString();
	}

} //TableDrivenScheduleImpl
