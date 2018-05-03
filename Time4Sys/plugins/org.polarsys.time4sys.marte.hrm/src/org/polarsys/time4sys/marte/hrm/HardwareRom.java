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
package org.polarsys.time4sys.marte.hrm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Rom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareRom#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareRom#getNbRows <em>Nb Rows</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareRom#getNbColumns <em>Nb Columns</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareRom#getNbBanks <em>Nb Banks</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareRom#getWordSize <em>Word Size</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareRom()
 * @model
 * @generated
 */
public interface HardwareRom extends HardwareStorageMemory {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.hrm.RomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.RomType
	 * @see #setType(RomType)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareRom_Type()
	 * @model
	 * @generated
	 */
	RomType getType();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareRom#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.RomType
	 * @see #getType()
	 * @generated
	 */
	void setType(RomType value);

	/**
	 * Returns the value of the '<em><b>Nb Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Rows</em>' attribute.
	 * @see #setNbRows(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareRom_NbRows()
	 * @model
	 * @generated
	 */
	int getNbRows();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareRom#getNbRows <em>Nb Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Rows</em>' attribute.
	 * @see #getNbRows()
	 * @generated
	 */
	void setNbRows(int value);

	/**
	 * Returns the value of the '<em><b>Nb Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Columns</em>' attribute.
	 * @see #setNbColumns(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareRom_NbColumns()
	 * @model
	 * @generated
	 */
	int getNbColumns();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareRom#getNbColumns <em>Nb Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Columns</em>' attribute.
	 * @see #getNbColumns()
	 * @generated
	 */
	void setNbColumns(int value);

	/**
	 * Returns the value of the '<em><b>Nb Banks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Banks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Banks</em>' attribute.
	 * @see #setNbBanks(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareRom_NbBanks()
	 * @model
	 * @generated
	 */
	int getNbBanks();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareRom#getNbBanks <em>Nb Banks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Banks</em>' attribute.
	 * @see #getNbBanks()
	 * @generated
	 */
	void setNbBanks(int value);

	/**
	 * Returns the value of the '<em><b>Word Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Word Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Word Size</em>' attribute.
	 * @see #setWordSize(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareRom_WordSize()
	 * @model
	 * @generated
	 */
	int getWordSize();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareRom#getWordSize <em>Word Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word Size</em>' attribute.
	 * @see #getWordSize()
	 * @generated
	 */
	void setWordSize(int value);

} // HardwareRom
