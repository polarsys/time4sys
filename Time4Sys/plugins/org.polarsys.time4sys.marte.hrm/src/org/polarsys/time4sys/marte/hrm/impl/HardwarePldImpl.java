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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.time4sys.marte.hrm.FirmwareArchitecture;
import org.polarsys.time4sys.marte.hrm.HardwareIpBlock;
import org.polarsys.time4sys.marte.hrm.HardwarePld;
import org.polarsys.time4sys.marte.hrm.HardwareRam;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.marte.hrm.PldClass;
import org.polarsys.time4sys.marte.hrm.PldTechnology;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Pld</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePldImpl#getPldTechnology <em>Pld Technology</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePldImpl#getNbRows <em>Nb Rows</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePldImpl#getNbColumns <em>Nb Columns</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePldImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePldImpl#getNbLuts <em>Nb Luts</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePldImpl#getNbLutInputs <em>Nb Lut Inputs</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePldImpl#getNbFlipFlops <em>Nb Flip Flops</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePldImpl#getBlocksRam <em>Blocks Ram</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePldImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwarePldImpl#getIpBlock <em>Ip Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwarePldImpl extends HardwareComputingResourceImpl implements HardwarePld {
	/**
	 * The default value of the '{@link #getPldTechnology() <em>Pld Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPldTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final PldTechnology PLD_TECHNOLOGY_EDEFAULT = PldTechnology.SRAM;

	/**
	 * The cached value of the '{@link #getPldTechnology() <em>Pld Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPldTechnology()
	 * @generated
	 * @ordered
	 */
	protected PldTechnology pldTechnology = PLD_TECHNOLOGY_EDEFAULT;

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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final PldClass KIND_EDEFAULT = PldClass.SYMETRICAL_ARRAY;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected PldClass kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbLuts() <em>Nb Luts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbLuts()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_LUTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbLuts() <em>Nb Luts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbLuts()
	 * @generated
	 * @ordered
	 */
	protected int nbLuts = NB_LUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbLutInputs() <em>Nb Lut Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbLutInputs()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_LUT_INPUTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbLutInputs() <em>Nb Lut Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbLutInputs()
	 * @generated
	 * @ordered
	 */
	protected int nbLutInputs = NB_LUT_INPUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbFlipFlops() <em>Nb Flip Flops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbFlipFlops()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_FLIP_FLOPS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbFlipFlops() <em>Nb Flip Flops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbFlipFlops()
	 * @generated
	 * @ordered
	 */
	protected int nbFlipFlops = NB_FLIP_FLOPS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBlocksRam() <em>Blocks Ram</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocksRam()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareRam> blocksRam;

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected FirmwareArchitecture architecture;

	/**
	 * The cached value of the '{@link #getIpBlock() <em>Ip Block</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareIpBlock> ipBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwarePldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HrmPackage.Literals.HARDWARE_PLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PldTechnology getPldTechnology() {
		return pldTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPldTechnology(PldTechnology newPldTechnology) {
		PldTechnology oldPldTechnology = pldTechnology;
		pldTechnology = newPldTechnology == null ? PLD_TECHNOLOGY_EDEFAULT : newPldTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_PLD__PLD_TECHNOLOGY, oldPldTechnology, pldTechnology));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_PLD__NB_ROWS, oldNbRows, nbRows));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_PLD__NB_COLUMNS, oldNbColumns, nbColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PldClass getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(PldClass newKind) {
		PldClass oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_PLD__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbLuts() {
		return nbLuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbLuts(int newNbLuts) {
		int oldNbLuts = nbLuts;
		nbLuts = newNbLuts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_PLD__NB_LUTS, oldNbLuts, nbLuts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbLutInputs() {
		return nbLutInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbLutInputs(int newNbLutInputs) {
		int oldNbLutInputs = nbLutInputs;
		nbLutInputs = newNbLutInputs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_PLD__NB_LUT_INPUTS, oldNbLutInputs, nbLutInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbFlipFlops() {
		return nbFlipFlops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbFlipFlops(int newNbFlipFlops) {
		int oldNbFlipFlops = nbFlipFlops;
		nbFlipFlops = newNbFlipFlops;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_PLD__NB_FLIP_FLOPS, oldNbFlipFlops, nbFlipFlops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareRam> getBlocksRam() {
		if (blocksRam == null) {
			blocksRam = new EObjectResolvingEList<HardwareRam>(HardwareRam.class, this, HrmPackage.HARDWARE_PLD__BLOCKS_RAM);
		}
		return blocksRam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmwareArchitecture getArchitecture() {
		if (architecture != null && architecture.eIsProxy()) {
			InternalEObject oldArchitecture = (InternalEObject)architecture;
			architecture = (FirmwareArchitecture)eResolveProxy(oldArchitecture);
			if (architecture != oldArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HrmPackage.HARDWARE_PLD__ARCHITECTURE, oldArchitecture, architecture));
			}
		}
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmwareArchitecture basicGetArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(FirmwareArchitecture newArchitecture) {
		FirmwareArchitecture oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_PLD__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareIpBlock> getIpBlock() {
		if (ipBlock == null) {
			ipBlock = new EObjectResolvingEList<HardwareIpBlock>(HardwareIpBlock.class, this, HrmPackage.HARDWARE_PLD__IP_BLOCK);
		}
		return ipBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HrmPackage.HARDWARE_PLD__PLD_TECHNOLOGY:
				return getPldTechnology();
			case HrmPackage.HARDWARE_PLD__NB_ROWS:
				return getNbRows();
			case HrmPackage.HARDWARE_PLD__NB_COLUMNS:
				return getNbColumns();
			case HrmPackage.HARDWARE_PLD__KIND:
				return getKind();
			case HrmPackage.HARDWARE_PLD__NB_LUTS:
				return getNbLuts();
			case HrmPackage.HARDWARE_PLD__NB_LUT_INPUTS:
				return getNbLutInputs();
			case HrmPackage.HARDWARE_PLD__NB_FLIP_FLOPS:
				return getNbFlipFlops();
			case HrmPackage.HARDWARE_PLD__BLOCKS_RAM:
				return getBlocksRam();
			case HrmPackage.HARDWARE_PLD__ARCHITECTURE:
				if (resolve) return getArchitecture();
				return basicGetArchitecture();
			case HrmPackage.HARDWARE_PLD__IP_BLOCK:
				return getIpBlock();
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
			case HrmPackage.HARDWARE_PLD__PLD_TECHNOLOGY:
				setPldTechnology((PldTechnology)newValue);
				return;
			case HrmPackage.HARDWARE_PLD__NB_ROWS:
				setNbRows((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_PLD__NB_COLUMNS:
				setNbColumns((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_PLD__KIND:
				setKind((PldClass)newValue);
				return;
			case HrmPackage.HARDWARE_PLD__NB_LUTS:
				setNbLuts((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_PLD__NB_LUT_INPUTS:
				setNbLutInputs((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_PLD__NB_FLIP_FLOPS:
				setNbFlipFlops((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_PLD__ARCHITECTURE:
				setArchitecture((FirmwareArchitecture)newValue);
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
			case HrmPackage.HARDWARE_PLD__PLD_TECHNOLOGY:
				setPldTechnology(PLD_TECHNOLOGY_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_PLD__NB_ROWS:
				setNbRows(NB_ROWS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_PLD__NB_COLUMNS:
				setNbColumns(NB_COLUMNS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_PLD__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_PLD__NB_LUTS:
				setNbLuts(NB_LUTS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_PLD__NB_LUT_INPUTS:
				setNbLutInputs(NB_LUT_INPUTS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_PLD__NB_FLIP_FLOPS:
				setNbFlipFlops(NB_FLIP_FLOPS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_PLD__ARCHITECTURE:
				setArchitecture((FirmwareArchitecture)null);
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
			case HrmPackage.HARDWARE_PLD__PLD_TECHNOLOGY:
				return pldTechnology != PLD_TECHNOLOGY_EDEFAULT;
			case HrmPackage.HARDWARE_PLD__NB_ROWS:
				return nbRows != NB_ROWS_EDEFAULT;
			case HrmPackage.HARDWARE_PLD__NB_COLUMNS:
				return nbColumns != NB_COLUMNS_EDEFAULT;
			case HrmPackage.HARDWARE_PLD__KIND:
				return kind != KIND_EDEFAULT;
			case HrmPackage.HARDWARE_PLD__NB_LUTS:
				return nbLuts != NB_LUTS_EDEFAULT;
			case HrmPackage.HARDWARE_PLD__NB_LUT_INPUTS:
				return nbLutInputs != NB_LUT_INPUTS_EDEFAULT;
			case HrmPackage.HARDWARE_PLD__NB_FLIP_FLOPS:
				return nbFlipFlops != NB_FLIP_FLOPS_EDEFAULT;
			case HrmPackage.HARDWARE_PLD__BLOCKS_RAM:
				return blocksRam != null && !blocksRam.isEmpty();
			case HrmPackage.HARDWARE_PLD__ARCHITECTURE:
				return architecture != null;
			case HrmPackage.HARDWARE_PLD__IP_BLOCK:
				return ipBlock != null && !ipBlock.isEmpty();
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
		result.append(" (pldTechnology: ");
		result.append(pldTechnology);
		result.append(", nbRows: ");
		result.append(nbRows);
		result.append(", nbColumns: ");
		result.append(nbColumns);
		result.append(", kind: ");
		result.append(kind);
		result.append(", nbLuts: ");
		result.append(nbLuts);
		result.append(", nbLutInputs: ");
		result.append(nbLutInputs);
		result.append(", nbFlipFlops: ");
		result.append(nbFlipFlops);
		result.append(')');
		return result.toString();
	}

} //HardwarePldImpl
