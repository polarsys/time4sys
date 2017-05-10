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
package org.polarsys.time4sys.marte.hrm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Ram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareRam#getNbRows <em>Nb Rows</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareRam#getNbColumns <em>Nb Columns</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareRam#getNbBanks <em>Nb Banks</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareRam#getWordSize <em>Word Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareRam#isIsSynchronous <em>Is Synchronous</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareRam#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareRam#isIsNonVolatile <em>Is Non Volatile</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareRam()
 * @model
 * @generated
 */
public interface HardwareRam extends HardwareProcessingMemory {
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
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareRam_NbRows()
	 * @model
	 * @generated
	 */
	int getNbRows();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareRam#getNbRows <em>Nb Rows</em>}' attribute.
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
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareRam_NbColumns()
	 * @model
	 * @generated
	 */
	int getNbColumns();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareRam#getNbColumns <em>Nb Columns</em>}' attribute.
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
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareRam_NbBanks()
	 * @model
	 * @generated
	 */
	int getNbBanks();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareRam#getNbBanks <em>Nb Banks</em>}' attribute.
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
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareRam_WordSize()
	 * @model
	 * @generated
	 */
	int getWordSize();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareRam#getWordSize <em>Word Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word Size</em>' attribute.
	 * @see #getWordSize()
	 * @generated
	 */
	void setWordSize(int value);

	/**
	 * Returns the value of the '<em><b>Is Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Synchronous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Synchronous</em>' attribute.
	 * @see #setIsSynchronous(boolean)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareRam_IsSynchronous()
	 * @model
	 * @generated
	 */
	boolean isIsSynchronous();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareRam#isIsSynchronous <em>Is Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Synchronous</em>' attribute.
	 * @see #isIsSynchronous()
	 * @generated
	 */
	void setIsSynchronous(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareRam_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareRam#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Non Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Non Volatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Non Volatile</em>' attribute.
	 * @see #setIsNonVolatile(boolean)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareRam_IsNonVolatile()
	 * @model
	 * @generated
	 */
	boolean isIsNonVolatile();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareRam#isIsNonVolatile <em>Is Non Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Non Volatile</em>' attribute.
	 * @see #isIsNonVolatile()
	 * @generated
	 */
	void setIsNonVolatile(boolean value);

} // HardwareRam
