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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.marte.grm.CommunicationResource;
import org.polarsys.time4sys.marte.hrm.HardwareArbiter;
import org.polarsys.time4sys.marte.hrm.HardwareChannel;
import org.polarsys.time4sys.marte.hrm.HardwareClock;
import org.polarsys.time4sys.marte.hrm.HardwareCommunicationResource;
import org.polarsys.time4sys.marte.hrm.HardwareDma;
import org.polarsys.time4sys.marte.hrm.HardwareMedia;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;
import org.polarsys.time4sys.marte.hrm.HardwareResource;
import org.polarsys.time4sys.marte.hrm.HardwareWire;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Dma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareDmaImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareDmaImpl#getNbWires <em>Nb Wires</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareDmaImpl#getRealizedBy <em>Realized By</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareDmaImpl#getControlledMedia <em>Controlled Media</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareDmaImpl#getNbChannels <em>Nb Channels</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareDmaImpl#getTransferWidth <em>Transfer Width</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareDmaImpl#getDrivenBy <em>Driven By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareDmaImpl extends HardwareStorageManagerImpl implements HardwareDma {
	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected HardwareClock clock;

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
	 * The cached value of the '{@link #getControlledMedia() <em>Controlled Media</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledMedia()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareMedia> controlledMedia;

	/**
	 * The default value of the '{@link #getNbChannels() <em>Nb Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbChannels()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_CHANNELS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbChannels() <em>Nb Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbChannels()
	 * @generated
	 * @ordered
	 */
	protected int nbChannels = NB_CHANNELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransferWidth() <em>Transfer Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSFER_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransferWidth() <em>Transfer Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferWidth()
	 * @generated
	 * @ordered
	 */
	protected int transferWidth = TRANSFER_WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDrivenBy() <em>Driven By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivenBy()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareProcessor> drivenBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareDmaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HrmPackage.Literals.HARDWARE_DMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareClock getClock() {
		if (clock != null && clock.eIsProxy()) {
			InternalEObject oldClock = (InternalEObject)clock;
			clock = (HardwareClock)eResolveProxy(oldClock);
			if (clock != oldClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HrmPackage.HARDWARE_DMA__CLOCK, oldClock, clock));
			}
		}
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareClock basicGetClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(HardwareClock newClock) {
		HardwareClock oldClock = clock;
		clock = newClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_DMA__CLOCK, oldClock, clock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_DMA__NB_WIRES, oldNbWires, nbWires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareWire> getRealizedBy() {
		if (realizedBy == null) {
			realizedBy = new EObjectResolvingEList<HardwareWire>(HardwareWire.class, this, HrmPackage.HARDWARE_DMA__REALIZED_BY);
		}
		return realizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareMedia> getControlledMedia() {
		if (controlledMedia == null) {
			controlledMedia = new EObjectWithInverseResolvingEList.ManyInverse<HardwareMedia>(HardwareMedia.class, this, HrmPackage.HARDWARE_DMA__CONTROLLED_MEDIA, HrmPackage.HARDWARE_MEDIA__ARBITERS);
		}
		return controlledMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbChannels() {
		return nbChannels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbChannels(int newNbChannels) {
		int oldNbChannels = nbChannels;
		nbChannels = newNbChannels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_DMA__NB_CHANNELS, oldNbChannels, nbChannels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTransferWidth() {
		return transferWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferWidth(int newTransferWidth) {
		int oldTransferWidth = transferWidth;
		transferWidth = newTransferWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_DMA__TRANSFER_WIDTH, oldTransferWidth, transferWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareProcessor> getDrivenBy() {
		if (drivenBy == null) {
			drivenBy = new EObjectResolvingEList<HardwareProcessor>(HardwareProcessor.class, this, HrmPackage.HARDWARE_DMA__DRIVEN_BY);
		}
		return drivenBy;
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
			case HrmPackage.HARDWARE_DMA__CONTROLLED_MEDIA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlledMedia()).basicAdd(otherEnd, msgs);
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
			case HrmPackage.HARDWARE_DMA__CONTROLLED_MEDIA:
				return ((InternalEList<?>)getControlledMedia()).basicRemove(otherEnd, msgs);
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
			case HrmPackage.HARDWARE_DMA__CLOCK:
				if (resolve) return getClock();
				return basicGetClock();
			case HrmPackage.HARDWARE_DMA__NB_WIRES:
				return getNbWires();
			case HrmPackage.HARDWARE_DMA__REALIZED_BY:
				return getRealizedBy();
			case HrmPackage.HARDWARE_DMA__CONTROLLED_MEDIA:
				return getControlledMedia();
			case HrmPackage.HARDWARE_DMA__NB_CHANNELS:
				return getNbChannels();
			case HrmPackage.HARDWARE_DMA__TRANSFER_WIDTH:
				return getTransferWidth();
			case HrmPackage.HARDWARE_DMA__DRIVEN_BY:
				return getDrivenBy();
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
			case HrmPackage.HARDWARE_DMA__CLOCK:
				setClock((HardwareClock)newValue);
				return;
			case HrmPackage.HARDWARE_DMA__NB_WIRES:
				setNbWires((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_DMA__REALIZED_BY:
				getRealizedBy().clear();
				getRealizedBy().addAll((Collection<? extends HardwareWire>)newValue);
				return;
			case HrmPackage.HARDWARE_DMA__CONTROLLED_MEDIA:
				getControlledMedia().clear();
				getControlledMedia().addAll((Collection<? extends HardwareMedia>)newValue);
				return;
			case HrmPackage.HARDWARE_DMA__NB_CHANNELS:
				setNbChannels((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_DMA__TRANSFER_WIDTH:
				setTransferWidth((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_DMA__DRIVEN_BY:
				getDrivenBy().clear();
				getDrivenBy().addAll((Collection<? extends HardwareProcessor>)newValue);
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
			case HrmPackage.HARDWARE_DMA__CLOCK:
				setClock((HardwareClock)null);
				return;
			case HrmPackage.HARDWARE_DMA__NB_WIRES:
				setNbWires(NB_WIRES_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_DMA__REALIZED_BY:
				getRealizedBy().clear();
				return;
			case HrmPackage.HARDWARE_DMA__CONTROLLED_MEDIA:
				getControlledMedia().clear();
				return;
			case HrmPackage.HARDWARE_DMA__NB_CHANNELS:
				setNbChannels(NB_CHANNELS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_DMA__TRANSFER_WIDTH:
				setTransferWidth(TRANSFER_WIDTH_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_DMA__DRIVEN_BY:
				getDrivenBy().clear();
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
			case HrmPackage.HARDWARE_DMA__CLOCK:
				return clock != null;
			case HrmPackage.HARDWARE_DMA__NB_WIRES:
				return nbWires != NB_WIRES_EDEFAULT;
			case HrmPackage.HARDWARE_DMA__REALIZED_BY:
				return realizedBy != null && !realizedBy.isEmpty();
			case HrmPackage.HARDWARE_DMA__CONTROLLED_MEDIA:
				return controlledMedia != null && !controlledMedia.isEmpty();
			case HrmPackage.HARDWARE_DMA__NB_CHANNELS:
				return nbChannels != NB_CHANNELS_EDEFAULT;
			case HrmPackage.HARDWARE_DMA__TRANSFER_WIDTH:
				return transferWidth != TRANSFER_WIDTH_EDEFAULT;
			case HrmPackage.HARDWARE_DMA__DRIVEN_BY:
				return drivenBy != null && !drivenBy.isEmpty();
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
		if (baseClass == HardwareResource.class) {
			switch (derivedFeatureID) {
				case HrmPackage.HARDWARE_DMA__CLOCK: return HrmPackage.HARDWARE_RESOURCE__CLOCK;
				default: return -1;
			}
		}
		if (baseClass == HardwareChannel.class) {
			switch (derivedFeatureID) {
				case HrmPackage.HARDWARE_DMA__NB_WIRES: return HrmPackage.HARDWARE_CHANNEL__NB_WIRES;
				case HrmPackage.HARDWARE_DMA__REALIZED_BY: return HrmPackage.HARDWARE_CHANNEL__REALIZED_BY;
				default: return -1;
			}
		}
		if (baseClass == HardwareCommunicationResource.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == HardwareArbiter.class) {
			switch (derivedFeatureID) {
				case HrmPackage.HARDWARE_DMA__CONTROLLED_MEDIA: return HrmPackage.HARDWARE_ARBITER__CONTROLLED_MEDIA;
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
		if (baseClass == HardwareResource.class) {
			switch (baseFeatureID) {
				case HrmPackage.HARDWARE_RESOURCE__CLOCK: return HrmPackage.HARDWARE_DMA__CLOCK;
				default: return -1;
			}
		}
		if (baseClass == HardwareChannel.class) {
			switch (baseFeatureID) {
				case HrmPackage.HARDWARE_CHANNEL__NB_WIRES: return HrmPackage.HARDWARE_DMA__NB_WIRES;
				case HrmPackage.HARDWARE_CHANNEL__REALIZED_BY: return HrmPackage.HARDWARE_DMA__REALIZED_BY;
				default: return -1;
			}
		}
		if (baseClass == HardwareCommunicationResource.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == HardwareArbiter.class) {
			switch (baseFeatureID) {
				case HrmPackage.HARDWARE_ARBITER__CONTROLLED_MEDIA: return HrmPackage.HARDWARE_DMA__CONTROLLED_MEDIA;
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
		result.append(" (nbWires: ");
		result.append(nbWires);
		result.append(", nbChannels: ");
		result.append(nbChannels);
		result.append(", transferWidth: ");
		result.append(transferWidth);
		result.append(')');
		return result.toString();
	}

} //HardwareDmaImpl
