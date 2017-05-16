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

import org.polarsys.time4sys.marte.hrm.HardwareRom;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.marte.hrm.RomType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Rom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareRomImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareRomImpl#getNbRows <em>Nb Rows</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareRomImpl#getNbColumns <em>Nb Columns</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareRomImpl#getNbBanks <em>Nb Banks</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareRomImpl#getWordSize <em>Word Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareRomImpl extends HardwareStorageMemoryImpl implements HardwareRom {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RomType TYPE_EDEFAULT = RomType.MASKED_ROM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RomType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbRows() <em>Nb Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbRows()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_ROWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbRows() <em>Nb Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbRows()
	 * @generated
	 * @ordered
	 */
	protected int nbRows = NB_ROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbColumns() <em>Nb Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_COLUMNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbColumns() <em>Nb Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbColumns()
	 * @generated
	 * @ordered
	 */
	protected int nbColumns = NB_COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbBanks() <em>Nb Banks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBanks()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_BANKS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbBanks() <em>Nb Banks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBanks()
	 * @generated
	 * @ordered
	 */
	protected int nbBanks = NB_BANKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWordSize() <em>Word Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordSize()
	 * @generated
	 * @ordered
	 */
	protected static final int WORD_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWordSize() <em>Word Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordSize()
	 * @generated
	 * @ordered
	 */
	protected int wordSize = WORD_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareRomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HrmPackage.Literals.HARDWARE_ROM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RomType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RomType newType) {
		RomType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_ROM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbRows() {
		return nbRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbRows(int newNbRows) {
		int oldNbRows = nbRows;
		nbRows = newNbRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_ROM__NB_ROWS, oldNbRows, nbRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbColumns() {
		return nbColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbColumns(int newNbColumns) {
		int oldNbColumns = nbColumns;
		nbColumns = newNbColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_ROM__NB_COLUMNS, oldNbColumns, nbColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbBanks() {
		return nbBanks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbBanks(int newNbBanks) {
		int oldNbBanks = nbBanks;
		nbBanks = newNbBanks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_ROM__NB_BANKS, oldNbBanks, nbBanks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWordSize() {
		return wordSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordSize(int newWordSize) {
		int oldWordSize = wordSize;
		wordSize = newWordSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_ROM__WORD_SIZE, oldWordSize, wordSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HrmPackage.HARDWARE_ROM__TYPE:
				return getType();
			case HrmPackage.HARDWARE_ROM__NB_ROWS:
				return getNbRows();
			case HrmPackage.HARDWARE_ROM__NB_COLUMNS:
				return getNbColumns();
			case HrmPackage.HARDWARE_ROM__NB_BANKS:
				return getNbBanks();
			case HrmPackage.HARDWARE_ROM__WORD_SIZE:
				return getWordSize();
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
			case HrmPackage.HARDWARE_ROM__TYPE:
				setType((RomType)newValue);
				return;
			case HrmPackage.HARDWARE_ROM__NB_ROWS:
				setNbRows((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_ROM__NB_COLUMNS:
				setNbColumns((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_ROM__NB_BANKS:
				setNbBanks((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_ROM__WORD_SIZE:
				setWordSize((Integer)newValue);
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
			case HrmPackage.HARDWARE_ROM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_ROM__NB_ROWS:
				setNbRows(NB_ROWS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_ROM__NB_COLUMNS:
				setNbColumns(NB_COLUMNS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_ROM__NB_BANKS:
				setNbBanks(NB_BANKS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_ROM__WORD_SIZE:
				setWordSize(WORD_SIZE_EDEFAULT);
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
			case HrmPackage.HARDWARE_ROM__TYPE:
				return type != TYPE_EDEFAULT;
			case HrmPackage.HARDWARE_ROM__NB_ROWS:
				return nbRows != NB_ROWS_EDEFAULT;
			case HrmPackage.HARDWARE_ROM__NB_COLUMNS:
				return nbColumns != NB_COLUMNS_EDEFAULT;
			case HrmPackage.HARDWARE_ROM__NB_BANKS:
				return nbBanks != NB_BANKS_EDEFAULT;
			case HrmPackage.HARDWARE_ROM__WORD_SIZE:
				return wordSize != WORD_SIZE_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", nbRows: ");
		result.append(nbRows);
		result.append(", nbColumns: ");
		result.append(nbColumns);
		result.append(", nbBanks: ");
		result.append(nbBanks);
		result.append(", wordSize: ");
		result.append(wordSize);
		result.append(')');
		return result.toString();
	}

} //HardwareRomImpl
