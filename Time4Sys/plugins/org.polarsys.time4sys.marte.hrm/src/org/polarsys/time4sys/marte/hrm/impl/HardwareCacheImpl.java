/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
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
import org.polarsys.time4sys.marte.hrm.CacheType;
import org.polarsys.time4sys.marte.hrm.HardwareCache;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareCacheImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareCacheImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareCacheImpl#getNbSets <em>Nb Sets</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareCacheImpl#getBlockSize <em>Block Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareCacheImpl#getAssociativity <em>Associativity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareCacheImpl extends HardwareProcessingMemoryImpl implements HardwareCache {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CacheType TYPE_EDEFAULT = CacheType.DATA;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CacheType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbSets() <em>Nb Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbSets()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_SETS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbSets() <em>Nb Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbSets()
	 * @generated
	 * @ordered
	 */
	protected int nbSets = NB_SETS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockSize() <em>Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final int BLOCK_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBlockSize() <em>Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockSize()
	 * @generated
	 * @ordered
	 */
	protected int blockSize = BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociativity() <em>Associativity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociativity()
	 * @generated
	 * @ordered
	 */
	protected static final int ASSOCIATIVITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAssociativity() <em>Associativity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociativity()
	 * @generated
	 * @ordered
	 */
	protected int associativity = ASSOCIATIVITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareCacheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HrmPackage.Literals.HARDWARE_CACHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_CACHE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CacheType newType) {
		CacheType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_CACHE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbSets() {
		return nbSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbSets(int newNbSets) {
		int oldNbSets = nbSets;
		nbSets = newNbSets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_CACHE__NB_SETS, oldNbSets, nbSets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBlockSize() {
		return blockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockSize(int newBlockSize) {
		int oldBlockSize = blockSize;
		blockSize = newBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_CACHE__BLOCK_SIZE, oldBlockSize, blockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAssociativity() {
		return associativity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociativity(int newAssociativity) {
		int oldAssociativity = associativity;
		associativity = newAssociativity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_CACHE__ASSOCIATIVITY, oldAssociativity, associativity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HrmPackage.HARDWARE_CACHE__LEVEL:
				return getLevel();
			case HrmPackage.HARDWARE_CACHE__TYPE:
				return getType();
			case HrmPackage.HARDWARE_CACHE__NB_SETS:
				return getNbSets();
			case HrmPackage.HARDWARE_CACHE__BLOCK_SIZE:
				return getBlockSize();
			case HrmPackage.HARDWARE_CACHE__ASSOCIATIVITY:
				return getAssociativity();
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
			case HrmPackage.HARDWARE_CACHE__LEVEL:
				setLevel((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_CACHE__TYPE:
				setType((CacheType)newValue);
				return;
			case HrmPackage.HARDWARE_CACHE__NB_SETS:
				setNbSets((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_CACHE__BLOCK_SIZE:
				setBlockSize((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_CACHE__ASSOCIATIVITY:
				setAssociativity((Integer)newValue);
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
			case HrmPackage.HARDWARE_CACHE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_CACHE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_CACHE__NB_SETS:
				setNbSets(NB_SETS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_CACHE__BLOCK_SIZE:
				setBlockSize(BLOCK_SIZE_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_CACHE__ASSOCIATIVITY:
				setAssociativity(ASSOCIATIVITY_EDEFAULT);
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
			case HrmPackage.HARDWARE_CACHE__LEVEL:
				return level != LEVEL_EDEFAULT;
			case HrmPackage.HARDWARE_CACHE__TYPE:
				return type != TYPE_EDEFAULT;
			case HrmPackage.HARDWARE_CACHE__NB_SETS:
				return nbSets != NB_SETS_EDEFAULT;
			case HrmPackage.HARDWARE_CACHE__BLOCK_SIZE:
				return blockSize != BLOCK_SIZE_EDEFAULT;
			case HrmPackage.HARDWARE_CACHE__ASSOCIATIVITY:
				return associativity != ASSOCIATIVITY_EDEFAULT;
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
		result.append(" (level: ");
		result.append(level);
		result.append(", type: ");
		result.append(type);
		result.append(", nbSets: ");
		result.append(nbSets);
		result.append(", blockSize: ");
		result.append(blockSize);
		result.append(", associativity: ");
		result.append(associativity);
		result.append(')');
		return result.toString();
	}

} //HardwareCacheImpl
