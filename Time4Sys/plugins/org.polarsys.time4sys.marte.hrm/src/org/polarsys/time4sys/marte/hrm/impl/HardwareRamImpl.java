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
import org.polarsys.time4sys.marte.hrm.HardwareRam;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Ram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareRamImpl#getNbRows <em>Nb Rows</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareRamImpl#getNbColumns <em>Nb Columns</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareRamImpl#getNbBanks <em>Nb Banks</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareRamImpl#getWordSize <em>Word Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareRamImpl#isIsSynchronous <em>Is Synchronous</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareRamImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareRamImpl#isIsNonVolatile <em>Is Non Volatile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareRamImpl extends HardwareProcessingMemoryImpl implements HardwareRam {
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
	 * The default value of the '{@link #isIsSynchronous() <em>Is Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSynchronous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SYNCHRONOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSynchronous() <em>Is Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSynchronous()
	 * @generated
	 * @ordered
	 */
	protected boolean isSynchronous = IS_SYNCHRONOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNonVolatile() <em>Is Non Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNonVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NON_VOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNonVolatile() <em>Is Non Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNonVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean isNonVolatile = IS_NON_VOLATILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareRamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HrmPackage.Literals.HARDWARE_RAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_RAM__NB_ROWS, oldNbRows, nbRows));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_RAM__NB_COLUMNS, oldNbColumns, nbColumns));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_RAM__NB_BANKS, oldNbBanks, nbBanks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_RAM__WORD_SIZE, oldWordSize, wordSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSynchronous() {
		return isSynchronous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSynchronous(boolean newIsSynchronous) {
		boolean oldIsSynchronous = isSynchronous;
		isSynchronous = newIsSynchronous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_RAM__IS_SYNCHRONOUS, oldIsSynchronous, isSynchronous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_RAM__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNonVolatile() {
		return isNonVolatile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNonVolatile(boolean newIsNonVolatile) {
		boolean oldIsNonVolatile = isNonVolatile;
		isNonVolatile = newIsNonVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_RAM__IS_NON_VOLATILE, oldIsNonVolatile, isNonVolatile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HrmPackage.HARDWARE_RAM__NB_ROWS:
				return getNbRows();
			case HrmPackage.HARDWARE_RAM__NB_COLUMNS:
				return getNbColumns();
			case HrmPackage.HARDWARE_RAM__NB_BANKS:
				return getNbBanks();
			case HrmPackage.HARDWARE_RAM__WORD_SIZE:
				return getWordSize();
			case HrmPackage.HARDWARE_RAM__IS_SYNCHRONOUS:
				return isIsSynchronous();
			case HrmPackage.HARDWARE_RAM__IS_STATIC:
				return isIsStatic();
			case HrmPackage.HARDWARE_RAM__IS_NON_VOLATILE:
				return isIsNonVolatile();
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
			case HrmPackage.HARDWARE_RAM__NB_ROWS:
				setNbRows((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_RAM__NB_COLUMNS:
				setNbColumns((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_RAM__NB_BANKS:
				setNbBanks((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_RAM__WORD_SIZE:
				setWordSize((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_RAM__IS_SYNCHRONOUS:
				setIsSynchronous((Boolean)newValue);
				return;
			case HrmPackage.HARDWARE_RAM__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case HrmPackage.HARDWARE_RAM__IS_NON_VOLATILE:
				setIsNonVolatile((Boolean)newValue);
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
			case HrmPackage.HARDWARE_RAM__NB_ROWS:
				setNbRows(NB_ROWS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_RAM__NB_COLUMNS:
				setNbColumns(NB_COLUMNS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_RAM__NB_BANKS:
				setNbBanks(NB_BANKS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_RAM__WORD_SIZE:
				setWordSize(WORD_SIZE_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_RAM__IS_SYNCHRONOUS:
				setIsSynchronous(IS_SYNCHRONOUS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_RAM__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_RAM__IS_NON_VOLATILE:
				setIsNonVolatile(IS_NON_VOLATILE_EDEFAULT);
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
			case HrmPackage.HARDWARE_RAM__NB_ROWS:
				return nbRows != NB_ROWS_EDEFAULT;
			case HrmPackage.HARDWARE_RAM__NB_COLUMNS:
				return nbColumns != NB_COLUMNS_EDEFAULT;
			case HrmPackage.HARDWARE_RAM__NB_BANKS:
				return nbBanks != NB_BANKS_EDEFAULT;
			case HrmPackage.HARDWARE_RAM__WORD_SIZE:
				return wordSize != WORD_SIZE_EDEFAULT;
			case HrmPackage.HARDWARE_RAM__IS_SYNCHRONOUS:
				return isSynchronous != IS_SYNCHRONOUS_EDEFAULT;
			case HrmPackage.HARDWARE_RAM__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case HrmPackage.HARDWARE_RAM__IS_NON_VOLATILE:
				return isNonVolatile != IS_NON_VOLATILE_EDEFAULT;
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
		result.append(" (nbRows: ");
		result.append(nbRows);
		result.append(", nbColumns: ");
		result.append(nbColumns);
		result.append(", nbBanks: ");
		result.append(nbBanks);
		result.append(", wordSize: ");
		result.append(wordSize);
		result.append(", isSynchronous: ");
		result.append(isSynchronous);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(", isNonVolatile: ");
		result.append(isNonVolatile);
		result.append(')');
		return result.toString();
	}

} //HardwareRamImpl
