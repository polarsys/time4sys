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
package org.polarsys.time4sys.marte.hrm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.marte.hrm.HardwareProcessingMemory;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.marte.hrm.ReplPolicy;
import org.polarsys.time4sys.marte.hrm.WritePolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Processing Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessingMemoryImpl#getReplPolicy <em>Repl Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessingMemoryImpl#getWritePolicy <em>Write Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HardwareProcessingMemoryImpl extends HardwareMemoryImpl implements HardwareProcessingMemory {
	/**
	 * The default value of the '{@link #getReplPolicy() <em>Repl Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final ReplPolicy REPL_POLICY_EDEFAULT = ReplPolicy.LRU;

	/**
	 * The cached value of the '{@link #getReplPolicy() <em>Repl Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplPolicy()
	 * @generated
	 * @ordered
	 */
	protected ReplPolicy replPolicy = REPL_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWritePolicy() <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final WritePolicy WRITE_POLICY_EDEFAULT = WritePolicy.WRITE_BACK;

	/**
	 * The cached value of the '{@link #getWritePolicy() <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritePolicy()
	 * @generated
	 * @ordered
	 */
	protected WritePolicy writePolicy = WRITE_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareProcessingMemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HrmPackage.Literals.HARDWARE_PROCESSING_MEMORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplPolicy getReplPolicy() {
		return replPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplPolicy(ReplPolicy newReplPolicy) {
		ReplPolicy oldReplPolicy = replPolicy;
		replPolicy = newReplPolicy == null ? REPL_POLICY_EDEFAULT : newReplPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_PROCESSING_MEMORY__REPL_POLICY, oldReplPolicy, replPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritePolicy getWritePolicy() {
		return writePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWritePolicy(WritePolicy newWritePolicy) {
		WritePolicy oldWritePolicy = writePolicy;
		writePolicy = newWritePolicy == null ? WRITE_POLICY_EDEFAULT : newWritePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_PROCESSING_MEMORY__WRITE_POLICY, oldWritePolicy, writePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HrmPackage.HARDWARE_PROCESSING_MEMORY__REPL_POLICY:
				return getReplPolicy();
			case HrmPackage.HARDWARE_PROCESSING_MEMORY__WRITE_POLICY:
				return getWritePolicy();
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
			case HrmPackage.HARDWARE_PROCESSING_MEMORY__REPL_POLICY:
				setReplPolicy((ReplPolicy)newValue);
				return;
			case HrmPackage.HARDWARE_PROCESSING_MEMORY__WRITE_POLICY:
				setWritePolicy((WritePolicy)newValue);
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
			case HrmPackage.HARDWARE_PROCESSING_MEMORY__REPL_POLICY:
				setReplPolicy(REPL_POLICY_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_PROCESSING_MEMORY__WRITE_POLICY:
				setWritePolicy(WRITE_POLICY_EDEFAULT);
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
			case HrmPackage.HARDWARE_PROCESSING_MEMORY__REPL_POLICY:
				return replPolicy != REPL_POLICY_EDEFAULT;
			case HrmPackage.HARDWARE_PROCESSING_MEMORY__WRITE_POLICY:
				return writePolicy != WRITE_POLICY_EDEFAULT;
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
		result.append(" (replPolicy: ");
		result.append(replPolicy);
		result.append(", writePolicy: ");
		result.append(writePolicy);
		result.append(')');
		return result.toString();
	}

} //HardwareProcessingMemoryImpl
