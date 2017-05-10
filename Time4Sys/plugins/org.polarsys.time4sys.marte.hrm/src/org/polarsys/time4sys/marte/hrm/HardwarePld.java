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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Pld</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getPldTechnology <em>Pld Technology</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getNbRows <em>Nb Rows</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getNbColumns <em>Nb Columns</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getNbLuts <em>Nb Luts</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getNbLutInputs <em>Nb Lut Inputs</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getNbFlipFlops <em>Nb Flip Flops</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getBlocksRam <em>Blocks Ram</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getIpBlock <em>Ip Block</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwarePld()
 * @model
 * @generated
 */
public interface HardwarePld extends HardwareComputingResource {
	/**
	 * Returns the value of the '<em><b>Pld Technology</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.hrm.PldTechnology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pld Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pld Technology</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.PldTechnology
	 * @see #setPldTechnology(PldTechnology)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwarePld_PldTechnology()
	 * @model
	 * @generated
	 */
	PldTechnology getPldTechnology();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getPldTechnology <em>Pld Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pld Technology</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.PldTechnology
	 * @see #getPldTechnology()
	 * @generated
	 */
	void setPldTechnology(PldTechnology value);

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
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwarePld_NbRows()
	 * @model
	 * @generated
	 */
	int getNbRows();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getNbRows <em>Nb Rows</em>}' attribute.
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
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwarePld_NbColumns()
	 * @model
	 * @generated
	 */
	int getNbColumns();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getNbColumns <em>Nb Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Columns</em>' attribute.
	 * @see #getNbColumns()
	 * @generated
	 */
	void setNbColumns(int value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.hrm.PldClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.PldClass
	 * @see #setKind(PldClass)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwarePld_Kind()
	 * @model
	 * @generated
	 */
	PldClass getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.PldClass
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PldClass value);

	/**
	 * Returns the value of the '<em><b>Nb Luts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Luts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Luts</em>' attribute.
	 * @see #setNbLuts(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwarePld_NbLuts()
	 * @model
	 * @generated
	 */
	int getNbLuts();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getNbLuts <em>Nb Luts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Luts</em>' attribute.
	 * @see #getNbLuts()
	 * @generated
	 */
	void setNbLuts(int value);

	/**
	 * Returns the value of the '<em><b>Nb Lut Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Lut Inputs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Lut Inputs</em>' attribute.
	 * @see #setNbLutInputs(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwarePld_NbLutInputs()
	 * @model
	 * @generated
	 */
	int getNbLutInputs();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getNbLutInputs <em>Nb Lut Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Lut Inputs</em>' attribute.
	 * @see #getNbLutInputs()
	 * @generated
	 */
	void setNbLutInputs(int value);

	/**
	 * Returns the value of the '<em><b>Nb Flip Flops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Flip Flops</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Flip Flops</em>' attribute.
	 * @see #setNbFlipFlops(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwarePld_NbFlipFlops()
	 * @model
	 * @generated
	 */
	int getNbFlipFlops();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getNbFlipFlops <em>Nb Flip Flops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Flip Flops</em>' attribute.
	 * @see #getNbFlipFlops()
	 * @generated
	 */
	void setNbFlipFlops(int value);

	/**
	 * Returns the value of the '<em><b>Blocks Ram</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwareRam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks Ram</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks Ram</em>' reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwarePld_BlocksRam()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<HardwareRam> getBlocksRam();

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' reference.
	 * @see #setArchitecture(FirmwareArchitecture)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwarePld_Architecture()
	 * @model
	 * @generated
	 */
	FirmwareArchitecture getArchitecture();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwarePld#getArchitecture <em>Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' reference.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(FirmwareArchitecture value);

	/**
	 * Returns the value of the '<em><b>Ip Block</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwareIpBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip Block</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Block</em>' reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwarePld_IpBlock()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<HardwareIpBlock> getIpBlock();

} // HardwarePld
