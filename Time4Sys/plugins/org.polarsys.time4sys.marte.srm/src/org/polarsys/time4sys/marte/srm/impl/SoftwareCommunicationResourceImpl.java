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
package org.polarsys.time4sys.marte.srm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.marte.grm.CommunicationMedia;
import org.polarsys.time4sys.marte.grm.CommunicationResource;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.ProcessingResource;
import org.polarsys.time4sys.marte.grm.Scheduler;
import org.polarsys.time4sys.marte.grm.TransmModeKind;
import org.polarsys.time4sys.marte.srm.SoftwareCommunicationResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Communication Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareCommunicationResourceImpl#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareCommunicationResourceImpl#getMainScheduler <em>Main Scheduler</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareCommunicationResourceImpl#getElementSize <em>Element Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareCommunicationResourceImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareCommunicationResourceImpl#getPacketTime <em>Packet Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareCommunicationResourceImpl#getBlockingTime <em>Blocking Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareCommunicationResourceImpl#getTransmMode <em>Transm Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SoftwareCommunicationResourceImpl extends SoftwareInteractionResourceImpl implements SoftwareCommunicationResource {
	/**
	 * The default value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float SPEED_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected float speedFactor = SPEED_FACTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMainScheduler() <em>Main Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainScheduler()
	 * @generated
	 * @ordered
	 */
	protected Scheduler mainScheduler;

	/**
	 * The default value of the '{@link #getElementSize() <em>Element Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSize()
	 * @generated
	 * @ordered
	 */
	protected static final int ELEMENT_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElementSize() <em>Element Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSize()
	 * @generated
	 * @ordered
	 */
	protected int elementSize = ELEMENT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected float capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketTime() <em>Packet Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketTime()
	 * @generated
	 * @ordered
	 */
	protected static final float PACKET_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPacketTime() <em>Packet Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketTime()
	 * @generated
	 * @ordered
	 */
	protected float packetTime = PACKET_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockingTime() <em>Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected static final float BLOCKING_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBlockingTime() <em>Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected float blockingTime = BLOCKING_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransmMode() <em>Transm Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmMode()
	 * @generated
	 * @ordered
	 */
	protected static final TransmModeKind TRANSM_MODE_EDEFAULT = TransmModeKind.SIMPLEX;

	/**
	 * The cached value of the '{@link #getTransmMode() <em>Transm Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmMode()
	 * @generated
	 * @ordered
	 */
	protected TransmModeKind transmMode = TRANSM_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareCommunicationResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.SOFTWARE_COMMUNICATION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpeedFactor() {
		return speedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedFactor(float newSpeedFactor) {
		float oldSpeedFactor = speedFactor;
		speedFactor = newSpeedFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__SPEED_FACTOR, oldSpeedFactor, speedFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getMainScheduler() {
		if (mainScheduler != null && mainScheduler.eIsProxy()) {
			InternalEObject oldMainScheduler = (InternalEObject)mainScheduler;
			mainScheduler = (Scheduler)eResolveProxy(oldMainScheduler);
			if (mainScheduler != oldMainScheduler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__MAIN_SCHEDULER, oldMainScheduler, mainScheduler));
			}
		}
		return mainScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler basicGetMainScheduler() {
		return mainScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainScheduler(Scheduler newMainScheduler) {
		Scheduler oldMainScheduler = mainScheduler;
		mainScheduler = newMainScheduler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__MAIN_SCHEDULER, oldMainScheduler, mainScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getElementSize() {
		return elementSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementSize(int newElementSize) {
		int oldElementSize = elementSize;
		elementSize = newElementSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__ELEMENT_SIZE, oldElementSize, elementSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(float newCapacity) {
		float oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPacketTime() {
		return packetTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketTime(float newPacketTime) {
		float oldPacketTime = packetTime;
		packetTime = newPacketTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__PACKET_TIME, oldPacketTime, packetTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBlockingTime() {
		return blockingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockingTime(float newBlockingTime) {
		float oldBlockingTime = blockingTime;
		blockingTime = newBlockingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__BLOCKING_TIME, oldBlockingTime, blockingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmModeKind getTransmMode() {
		return transmMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmMode(TransmModeKind newTransmMode) {
		TransmModeKind oldTransmMode = transmMode;
		transmMode = newTransmMode == null ? TRANSM_MODE_EDEFAULT : newTransmMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__TRANSM_MODE, oldTransmMode, transmMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__SPEED_FACTOR:
				return getSpeedFactor();
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__MAIN_SCHEDULER:
				if (resolve) return getMainScheduler();
				return basicGetMainScheduler();
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__ELEMENT_SIZE:
				return getElementSize();
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__CAPACITY:
				return getCapacity();
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__PACKET_TIME:
				return getPacketTime();
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__BLOCKING_TIME:
				return getBlockingTime();
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__TRANSM_MODE:
				return getTransmMode();
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
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__SPEED_FACTOR:
				setSpeedFactor((Float)newValue);
				return;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__MAIN_SCHEDULER:
				setMainScheduler((Scheduler)newValue);
				return;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__ELEMENT_SIZE:
				setElementSize((Integer)newValue);
				return;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__CAPACITY:
				setCapacity((Float)newValue);
				return;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__PACKET_TIME:
				setPacketTime((Float)newValue);
				return;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__BLOCKING_TIME:
				setBlockingTime((Float)newValue);
				return;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__TRANSM_MODE:
				setTransmMode((TransmModeKind)newValue);
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
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__SPEED_FACTOR:
				setSpeedFactor(SPEED_FACTOR_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__MAIN_SCHEDULER:
				setMainScheduler((Scheduler)null);
				return;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__ELEMENT_SIZE:
				setElementSize(ELEMENT_SIZE_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__PACKET_TIME:
				setPacketTime(PACKET_TIME_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__BLOCKING_TIME:
				setBlockingTime(BLOCKING_TIME_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__TRANSM_MODE:
				setTransmMode(TRANSM_MODE_EDEFAULT);
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
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__SPEED_FACTOR:
				return speedFactor != SPEED_FACTOR_EDEFAULT;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__MAIN_SCHEDULER:
				return mainScheduler != null;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__ELEMENT_SIZE:
				return elementSize != ELEMENT_SIZE_EDEFAULT;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__PACKET_TIME:
				return packetTime != PACKET_TIME_EDEFAULT;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__BLOCKING_TIME:
				return blockingTime != BLOCKING_TIME_EDEFAULT;
			case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__TRANSM_MODE:
				return transmMode != TRANSM_MODE_EDEFAULT;
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
		if (baseClass == CommunicationResource.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ProcessingResource.class) {
			switch (derivedFeatureID) {
				case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__SPEED_FACTOR: return GrmPackage.PROCESSING_RESOURCE__SPEED_FACTOR;
				case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__MAIN_SCHEDULER: return GrmPackage.PROCESSING_RESOURCE__MAIN_SCHEDULER;
				default: return -1;
			}
		}
		if (baseClass == CommunicationMedia.class) {
			switch (derivedFeatureID) {
				case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__ELEMENT_SIZE: return GrmPackage.COMMUNICATION_MEDIA__ELEMENT_SIZE;
				case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__CAPACITY: return GrmPackage.COMMUNICATION_MEDIA__CAPACITY;
				case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__PACKET_TIME: return GrmPackage.COMMUNICATION_MEDIA__PACKET_TIME;
				case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__BLOCKING_TIME: return GrmPackage.COMMUNICATION_MEDIA__BLOCKING_TIME;
				case SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__TRANSM_MODE: return GrmPackage.COMMUNICATION_MEDIA__TRANSM_MODE;
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
		if (baseClass == CommunicationResource.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ProcessingResource.class) {
			switch (baseFeatureID) {
				case GrmPackage.PROCESSING_RESOURCE__SPEED_FACTOR: return SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__SPEED_FACTOR;
				case GrmPackage.PROCESSING_RESOURCE__MAIN_SCHEDULER: return SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__MAIN_SCHEDULER;
				default: return -1;
			}
		}
		if (baseClass == CommunicationMedia.class) {
			switch (baseFeatureID) {
				case GrmPackage.COMMUNICATION_MEDIA__ELEMENT_SIZE: return SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__ELEMENT_SIZE;
				case GrmPackage.COMMUNICATION_MEDIA__CAPACITY: return SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__CAPACITY;
				case GrmPackage.COMMUNICATION_MEDIA__PACKET_TIME: return SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__PACKET_TIME;
				case GrmPackage.COMMUNICATION_MEDIA__BLOCKING_TIME: return SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__BLOCKING_TIME;
				case GrmPackage.COMMUNICATION_MEDIA__TRANSM_MODE: return SrmPackage.SOFTWARE_COMMUNICATION_RESOURCE__TRANSM_MODE;
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
		result.append(" (speedFactor: ");
		result.append(speedFactor);
		result.append(", elementSize: ");
		result.append(elementSize);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", packetTime: ");
		result.append(packetTime);
		result.append(", blockingTime: ");
		result.append(blockingTime);
		result.append(", transmMode: ");
		result.append(transmMode);
		result.append(')');
		return result.toString();
	}

} //SoftwareCommunicationResourceImpl
