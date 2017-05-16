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
 * A representation of the model object '<em><b>Hardware Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareCache#getLevel <em>Level</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareCache#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareCache#getNbSets <em>Nb Sets</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareCache#getBlockSize <em>Block Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareCache#getAssociativity <em>Associativity</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareCache()
 * @model
 * @generated
 */
public interface HardwareCache extends HardwareProcessingMemory {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareCache_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareCache#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.hrm.CacheType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.CacheType
	 * @see #setType(CacheType)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareCache_Type()
	 * @model
	 * @generated
	 */
	CacheType getType();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareCache#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.CacheType
	 * @see #getType()
	 * @generated
	 */
	void setType(CacheType value);

	/**
	 * Returns the value of the '<em><b>Nb Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Sets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Sets</em>' attribute.
	 * @see #setNbSets(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareCache_NbSets()
	 * @model
	 * @generated
	 */
	int getNbSets();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareCache#getNbSets <em>Nb Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Sets</em>' attribute.
	 * @see #getNbSets()
	 * @generated
	 */
	void setNbSets(int value);

	/**
	 * Returns the value of the '<em><b>Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Size</em>' attribute.
	 * @see #setBlockSize(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareCache_BlockSize()
	 * @model
	 * @generated
	 */
	int getBlockSize();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareCache#getBlockSize <em>Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Size</em>' attribute.
	 * @see #getBlockSize()
	 * @generated
	 */
	void setBlockSize(int value);

	/**
	 * Returns the value of the '<em><b>Associativity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associativity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associativity</em>' attribute.
	 * @see #setAssociativity(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareCache_Associativity()
	 * @model
	 * @generated
	 */
	int getAssociativity();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareCache#getAssociativity <em>Associativity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associativity</em>' attribute.
	 * @see #getAssociativity()
	 * @generated
	 */
	void setAssociativity(int value);

} // HardwareCache
