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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.time4sys.marte.hrm.HardwareChannel;
import org.polarsys.time4sys.marte.hrm.HardwareWire;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareChannelImpl#getNbWires <em>Nb Wires</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareChannelImpl#getRealizedBy <em>Realized By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HardwareChannelImpl extends HardwareComponentImpl implements HardwareChannel {
	/**
	 * The default value of the '{@link #getNbWires() <em>Nb Wires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbWires()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_WIRES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbWires() <em>Nb Wires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbWires()
	 * @generated
	 * @ordered
	 */
	protected int nbWires = NB_WIRES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRealizedBy() <em>Realized By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareWire> realizedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HrmPackage.Literals.HARDWARE_CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbWires() {
		return nbWires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbWires(int newNbWires) {
		int oldNbWires = nbWires;
		nbWires = newNbWires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_CHANNEL__NB_WIRES, oldNbWires, nbWires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareWire> getRealizedBy() {
		if (realizedBy == null) {
			realizedBy = new EObjectResolvingEList<HardwareWire>(HardwareWire.class, this, HrmPackage.HARDWARE_CHANNEL__REALIZED_BY);
		}
		return realizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HrmPackage.HARDWARE_CHANNEL__NB_WIRES:
				return getNbWires();
			case HrmPackage.HARDWARE_CHANNEL__REALIZED_BY:
				return getRealizedBy();
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
			case HrmPackage.HARDWARE_CHANNEL__NB_WIRES:
				setNbWires((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_CHANNEL__REALIZED_BY:
				getRealizedBy().clear();
				getRealizedBy().addAll((Collection<? extends HardwareWire>)newValue);
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
			case HrmPackage.HARDWARE_CHANNEL__NB_WIRES:
				setNbWires(NB_WIRES_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_CHANNEL__REALIZED_BY:
				getRealizedBy().clear();
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
			case HrmPackage.HARDWARE_CHANNEL__NB_WIRES:
				return nbWires != NB_WIRES_EDEFAULT;
			case HrmPackage.HARDWARE_CHANNEL__REALIZED_BY:
				return realizedBy != null && !realizedBy.isEmpty();
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
		result.append(" (nbWires: ");
		result.append(nbWires);
		result.append(')');
		return result.toString();
	}

} //HardwareChannelImpl
