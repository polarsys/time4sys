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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.time4sys.marte.grm.impl.ComputingResourceImpl;

import org.polarsys.time4sys.marte.hrm.EnvCondition;
import org.polarsys.time4sys.marte.hrm.HardwareChip;
import org.polarsys.time4sys.marte.hrm.HardwareClock;
import org.polarsys.time4sys.marte.hrm.HardwareComponent;
import org.polarsys.time4sys.marte.hrm.HardwareComputingResource;
import org.polarsys.time4sys.marte.hrm.HardwarePin;
import org.polarsys.time4sys.marte.hrm.HardwareResource;
import org.polarsys.time4sys.marte.hrm.HardwareWire;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Computing Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl#getArea <em>Area</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl#getPosX <em>Pos X</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl#getNbPins <em>Nb Pins</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl#getRConditions <em>RConditions</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl#getOwnedPin <em>Owned Pin</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl#getOwnedWire <em>Owned Wire</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareComputingResourceImpl#getOpFrequencies <em>Op Frequencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareComputingResourceImpl extends ComputingResourceImpl implements HardwareComputingResource {
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
	 * The default value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected static final int DIMENSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected int dimension = DIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected static final int AREA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected int area = AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosX()
	 * @generated
	 * @ordered
	 */
	protected static final int POS_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosX()
	 * @generated
	 * @ordered
	 */
	protected int posX = POS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosY()
	 * @generated
	 * @ordered
	 */
	protected static final int POS_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosY()
	 * @generated
	 * @ordered
	 */
	protected int posY = POS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrid() <em>Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected static final int GRID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected int grid = GRID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbPins() <em>Nb Pins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPins()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_PINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbPins() <em>Nb Pins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPins()
	 * @generated
	 * @ordered
	 */
	protected int nbPins = NB_PINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRConditions() <em>RConditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvCondition> rConditions;

	/**
	 * The cached value of the '{@link #getOwnedPin() <em>Owned Pin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPin()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePin> ownedPin;

	/**
	 * The cached value of the '{@link #getOwnedWire() <em>Owned Wire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedWire()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareWire> ownedWire;

	/**
	 * The default value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final int TECHNOLOGY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected int technology = TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpFrequencies() <em>Op Frequencies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpFrequencies()
	 * @generated
	 * @ordered
	 */
	protected static final int OP_FREQUENCIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOpFrequencies() <em>Op Frequencies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpFrequencies()
	 * @generated
	 * @ordered
	 */
	protected int opFrequencies = OP_FREQUENCIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareComputingResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HrmPackage.Literals.HARDWARE_COMPUTING_RESOURCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HrmPackage.HARDWARE_COMPUTING_RESOURCE__CLOCK, oldClock, clock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_COMPUTING_RESOURCE__CLOCK, oldClock, clock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(int newDimension) {
		int oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_COMPUTING_RESOURCE__DIMENSION, oldDimension, dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosX(int newPosX) {
		int oldPosX = posX;
		posX = newPosX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_COMPUTING_RESOURCE__POS_X, oldPosX, posX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosY() {
		return posY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosY(int newPosY) {
		int oldPosY = posY;
		posY = newPosY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_COMPUTING_RESOURCE__POS_Y, oldPosY, posY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGrid() {
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid(int newGrid) {
		int oldGrid = grid;
		grid = newGrid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_COMPUTING_RESOURCE__GRID, oldGrid, grid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbPins() {
		return nbPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbPins(int newNbPins) {
		int oldNbPins = nbPins;
		nbPins = newNbPins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_COMPUTING_RESOURCE__NB_PINS, oldNbPins, nbPins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_COMPUTING_RESOURCE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_COMPUTING_RESOURCE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvCondition> getRConditions() {
		if (rConditions == null) {
			rConditions = new EObjectContainmentEList<EnvCondition>(EnvCondition.class, this, HrmPackage.HARDWARE_COMPUTING_RESOURCE__RCONDITIONS);
		}
		return rConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwarePin> getOwnedPin() {
		if (ownedPin == null) {
			ownedPin = new EObjectContainmentEList<HardwarePin>(HardwarePin.class, this, HrmPackage.HARDWARE_COMPUTING_RESOURCE__OWNED_PIN);
		}
		return ownedPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareWire> getOwnedWire() {
		if (ownedWire == null) {
			ownedWire = new EObjectContainmentEList<HardwareWire>(HardwareWire.class, this, HrmPackage.HARDWARE_COMPUTING_RESOURCE__OWNED_WIRE);
		}
		return ownedWire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnology(int newTechnology) {
		int oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_COMPUTING_RESOURCE__TECHNOLOGY, oldTechnology, technology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOpFrequencies() {
		return opFrequencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpFrequencies(int newOpFrequencies) {
		int oldOpFrequencies = opFrequencies;
		opFrequencies = newOpFrequencies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_COMPUTING_RESOURCE__OP_FREQUENCIES, oldOpFrequencies, opFrequencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__RCONDITIONS:
				return ((InternalEList<?>)getRConditions()).basicRemove(otherEnd, msgs);
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__OWNED_PIN:
				return ((InternalEList<?>)getOwnedPin()).basicRemove(otherEnd, msgs);
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__OWNED_WIRE:
				return ((InternalEList<?>)getOwnedWire()).basicRemove(otherEnd, msgs);
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
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__CLOCK:
				if (resolve) return getClock();
				return basicGetClock();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__DIMENSION:
				return getDimension();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__AREA:
				return getArea();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__POS_X:
				return getPosX();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__POS_Y:
				return getPosY();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__GRID:
				return getGrid();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__NB_PINS:
				return getNbPins();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__WEIGHT:
				return getWeight();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__PRICE:
				return getPrice();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__RCONDITIONS:
				return getRConditions();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__OWNED_PIN:
				return getOwnedPin();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__OWNED_WIRE:
				return getOwnedWire();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__TECHNOLOGY:
				return getTechnology();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__OP_FREQUENCIES:
				return getOpFrequencies();
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
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__CLOCK:
				setClock((HardwareClock)newValue);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__DIMENSION:
				setDimension((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__POS_X:
				setPosX((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__POS_Y:
				setPosY((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__GRID:
				setGrid((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__NB_PINS:
				setNbPins((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__WEIGHT:
				setWeight((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__PRICE:
				setPrice((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__RCONDITIONS:
				getRConditions().clear();
				getRConditions().addAll((Collection<? extends EnvCondition>)newValue);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__OWNED_PIN:
				getOwnedPin().clear();
				getOwnedPin().addAll((Collection<? extends HardwarePin>)newValue);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__OWNED_WIRE:
				getOwnedWire().clear();
				getOwnedWire().addAll((Collection<? extends HardwareWire>)newValue);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__TECHNOLOGY:
				setTechnology((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__OP_FREQUENCIES:
				setOpFrequencies((Integer)newValue);
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
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__CLOCK:
				setClock((HardwareClock)null);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__DIMENSION:
				setDimension(DIMENSION_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__POS_X:
				setPosX(POS_X_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__POS_Y:
				setPosY(POS_Y_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__GRID:
				setGrid(GRID_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__NB_PINS:
				setNbPins(NB_PINS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__RCONDITIONS:
				getRConditions().clear();
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__OWNED_PIN:
				getOwnedPin().clear();
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__OWNED_WIRE:
				getOwnedWire().clear();
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__TECHNOLOGY:
				setTechnology(TECHNOLOGY_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__OP_FREQUENCIES:
				setOpFrequencies(OP_FREQUENCIES_EDEFAULT);
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
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__CLOCK:
				return clock != null;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__DIMENSION:
				return dimension != DIMENSION_EDEFAULT;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__AREA:
				return area != AREA_EDEFAULT;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__POS_X:
				return posX != POS_X_EDEFAULT;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__POS_Y:
				return posY != POS_Y_EDEFAULT;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__GRID:
				return grid != GRID_EDEFAULT;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__NB_PINS:
				return nbPins != NB_PINS_EDEFAULT;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__PRICE:
				return price != PRICE_EDEFAULT;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__RCONDITIONS:
				return rConditions != null && !rConditions.isEmpty();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__OWNED_PIN:
				return ownedPin != null && !ownedPin.isEmpty();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__OWNED_WIRE:
				return ownedWire != null && !ownedWire.isEmpty();
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__TECHNOLOGY:
				return technology != TECHNOLOGY_EDEFAULT;
			case HrmPackage.HARDWARE_COMPUTING_RESOURCE__OP_FREQUENCIES:
				return opFrequencies != OP_FREQUENCIES_EDEFAULT;
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
		if (baseClass == HardwareResource.class) {
			switch (derivedFeatureID) {
				case HrmPackage.HARDWARE_COMPUTING_RESOURCE__CLOCK: return HrmPackage.HARDWARE_RESOURCE__CLOCK;
				default: return -1;
			}
		}
		if (baseClass == HardwareComponent.class) {
			switch (derivedFeatureID) {
				case HrmPackage.HARDWARE_COMPUTING_RESOURCE__DIMENSION: return HrmPackage.HARDWARE_COMPONENT__DIMENSION;
				case HrmPackage.HARDWARE_COMPUTING_RESOURCE__AREA: return HrmPackage.HARDWARE_COMPONENT__AREA;
				case HrmPackage.HARDWARE_COMPUTING_RESOURCE__POS_X: return HrmPackage.HARDWARE_COMPONENT__POS_X;
				case HrmPackage.HARDWARE_COMPUTING_RESOURCE__POS_Y: return HrmPackage.HARDWARE_COMPONENT__POS_Y;
				case HrmPackage.HARDWARE_COMPUTING_RESOURCE__GRID: return HrmPackage.HARDWARE_COMPONENT__GRID;
				case HrmPackage.HARDWARE_COMPUTING_RESOURCE__NB_PINS: return HrmPackage.HARDWARE_COMPONENT__NB_PINS;
				case HrmPackage.HARDWARE_COMPUTING_RESOURCE__WEIGHT: return HrmPackage.HARDWARE_COMPONENT__WEIGHT;
				case HrmPackage.HARDWARE_COMPUTING_RESOURCE__PRICE: return HrmPackage.HARDWARE_COMPONENT__PRICE;
				case HrmPackage.HARDWARE_COMPUTING_RESOURCE__RCONDITIONS: return HrmPackage.HARDWARE_COMPONENT__RCONDITIONS;
				case HrmPackage.HARDWARE_COMPUTING_RESOURCE__OWNED_PIN: return HrmPackage.HARDWARE_COMPONENT__OWNED_PIN;
				case HrmPackage.HARDWARE_COMPUTING_RESOURCE__OWNED_WIRE: return HrmPackage.HARDWARE_COMPONENT__OWNED_WIRE;
				default: return -1;
			}
		}
		if (baseClass == HardwareChip.class) {
			switch (derivedFeatureID) {
				case HrmPackage.HARDWARE_COMPUTING_RESOURCE__TECHNOLOGY: return HrmPackage.HARDWARE_CHIP__TECHNOLOGY;
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
		if (baseClass == HardwareResource.class) {
			switch (baseFeatureID) {
				case HrmPackage.HARDWARE_RESOURCE__CLOCK: return HrmPackage.HARDWARE_COMPUTING_RESOURCE__CLOCK;
				default: return -1;
			}
		}
		if (baseClass == HardwareComponent.class) {
			switch (baseFeatureID) {
				case HrmPackage.HARDWARE_COMPONENT__DIMENSION: return HrmPackage.HARDWARE_COMPUTING_RESOURCE__DIMENSION;
				case HrmPackage.HARDWARE_COMPONENT__AREA: return HrmPackage.HARDWARE_COMPUTING_RESOURCE__AREA;
				case HrmPackage.HARDWARE_COMPONENT__POS_X: return HrmPackage.HARDWARE_COMPUTING_RESOURCE__POS_X;
				case HrmPackage.HARDWARE_COMPONENT__POS_Y: return HrmPackage.HARDWARE_COMPUTING_RESOURCE__POS_Y;
				case HrmPackage.HARDWARE_COMPONENT__GRID: return HrmPackage.HARDWARE_COMPUTING_RESOURCE__GRID;
				case HrmPackage.HARDWARE_COMPONENT__NB_PINS: return HrmPackage.HARDWARE_COMPUTING_RESOURCE__NB_PINS;
				case HrmPackage.HARDWARE_COMPONENT__WEIGHT: return HrmPackage.HARDWARE_COMPUTING_RESOURCE__WEIGHT;
				case HrmPackage.HARDWARE_COMPONENT__PRICE: return HrmPackage.HARDWARE_COMPUTING_RESOURCE__PRICE;
				case HrmPackage.HARDWARE_COMPONENT__RCONDITIONS: return HrmPackage.HARDWARE_COMPUTING_RESOURCE__RCONDITIONS;
				case HrmPackage.HARDWARE_COMPONENT__OWNED_PIN: return HrmPackage.HARDWARE_COMPUTING_RESOURCE__OWNED_PIN;
				case HrmPackage.HARDWARE_COMPONENT__OWNED_WIRE: return HrmPackage.HARDWARE_COMPUTING_RESOURCE__OWNED_WIRE;
				default: return -1;
			}
		}
		if (baseClass == HardwareChip.class) {
			switch (baseFeatureID) {
				case HrmPackage.HARDWARE_CHIP__TECHNOLOGY: return HrmPackage.HARDWARE_COMPUTING_RESOURCE__TECHNOLOGY;
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
		result.append(" (dimension: ");
		result.append(dimension);
		result.append(", area: ");
		result.append(area);
		result.append(", posX: ");
		result.append(posX);
		result.append(", posY: ");
		result.append(posY);
		result.append(", grid: ");
		result.append(grid);
		result.append(", nbPins: ");
		result.append(nbPins);
		result.append(", weight: ");
		result.append(weight);
		result.append(", price: ");
		result.append(price);
		result.append(", technology: ");
		result.append(technology);
		result.append(", opFrequencies: ");
		result.append(opFrequencies);
		result.append(')');
		return result.toString();
	}

} //HardwareComputingResourceImpl
