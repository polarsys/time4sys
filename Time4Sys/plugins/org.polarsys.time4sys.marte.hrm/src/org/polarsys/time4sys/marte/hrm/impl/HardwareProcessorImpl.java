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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.time4sys.marte.hrm.HardwareBranchPredictor;
import org.polarsys.time4sys.marte.hrm.HardwareCache;
import org.polarsys.time4sys.marte.hrm.HardwareIsa;
import org.polarsys.time4sys.marte.hrm.HardwareMmu;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessorImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessorImpl#getMips <em>Mips</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessorImpl#getIpc <em>Ipc</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessorImpl#getNbCores <em>Nb Cores</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessorImpl#getNbPipelines <em>Nb Pipelines</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessorImpl#getNbStages <em>Nb Stages</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessorImpl#getNbAlus <em>Nb Alus</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessorImpl#getNbFpus <em>Nb Fpus</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessorImpl#getOwnedIsas <em>Owned Isas</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessorImpl#getPredictors <em>Predictors</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessorImpl#getCaches <em>Caches</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.impl.HardwareProcessorImpl#getOwnedMmus <em>Owned Mmus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareProcessorImpl extends HardwareComputingResourceImpl implements HardwareProcessor {
	/**
	 * The default value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final int ARCHITECTURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected int architecture = ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMips() <em>Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMips()
	 * @generated
	 * @ordered
	 */
	protected static final int MIPS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMips() <em>Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMips()
	 * @generated
	 * @ordered
	 */
	protected int mips = MIPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpc() <em>Ipc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpc()
	 * @generated
	 * @ordered
	 */
	protected static final float IPC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getIpc() <em>Ipc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpc()
	 * @generated
	 * @ordered
	 */
	protected float ipc = IPC_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbCores() <em>Nb Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCores()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_CORES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbCores() <em>Nb Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCores()
	 * @generated
	 * @ordered
	 */
	protected int nbCores = NB_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbPipelines() <em>Nb Pipelines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPipelines()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_PIPELINES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbPipelines() <em>Nb Pipelines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPipelines()
	 * @generated
	 * @ordered
	 */
	protected int nbPipelines = NB_PIPELINES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbStages() <em>Nb Stages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbStages()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_STAGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbStages() <em>Nb Stages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbStages()
	 * @generated
	 * @ordered
	 */
	protected int nbStages = NB_STAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbAlus() <em>Nb Alus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAlus()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_ALUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbAlus() <em>Nb Alus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAlus()
	 * @generated
	 * @ordered
	 */
	protected int nbAlus = NB_ALUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbFpus() <em>Nb Fpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbFpus()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_FPUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbFpus() <em>Nb Fpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbFpus()
	 * @generated
	 * @ordered
	 */
	protected int nbFpus = NB_FPUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedIsas() <em>Owned Isas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedIsas()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareIsa> ownedIsas;

	/**
	 * The cached value of the '{@link #getPredictors() <em>Predictors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictors()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareBranchPredictor> predictors;

	/**
	 * The cached value of the '{@link #getCaches() <em>Caches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaches()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareCache> caches;

	/**
	 * The cached value of the '{@link #getOwnedMmus() <em>Owned Mmus</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMmus()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareMmu> ownedMmus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HrmPackage.Literals.HARDWARE_PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMips() {
		return mips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMips(int newMips) {
		int oldMips = mips;
		mips = newMips;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_PROCESSOR__MIPS, oldMips, mips));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getIpc() {
		return ipc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbCores() {
		return nbCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbCores(int newNbCores) {
		int oldNbCores = nbCores;
		nbCores = newNbCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_PROCESSOR__NB_CORES, oldNbCores, nbCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbPipelines() {
		return nbPipelines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbPipelines(int newNbPipelines) {
		int oldNbPipelines = nbPipelines;
		nbPipelines = newNbPipelines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_PROCESSOR__NB_PIPELINES, oldNbPipelines, nbPipelines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbStages() {
		return nbStages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbStages(int newNbStages) {
		int oldNbStages = nbStages;
		nbStages = newNbStages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_PROCESSOR__NB_STAGES, oldNbStages, nbStages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbAlus() {
		return nbAlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbAlus(int newNbAlus) {
		int oldNbAlus = nbAlus;
		nbAlus = newNbAlus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_PROCESSOR__NB_ALUS, oldNbAlus, nbAlus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbFpus() {
		return nbFpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbFpus(int newNbFpus) {
		int oldNbFpus = nbFpus;
		nbFpus = newNbFpus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HrmPackage.HARDWARE_PROCESSOR__NB_FPUS, oldNbFpus, nbFpus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareIsa> getOwnedIsas() {
		if (ownedIsas == null) {
			ownedIsas = new EObjectResolvingEList<HardwareIsa>(HardwareIsa.class, this, HrmPackage.HARDWARE_PROCESSOR__OWNED_ISAS);
		}
		return ownedIsas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareBranchPredictor> getPredictors() {
		if (predictors == null) {
			predictors = new EObjectResolvingEList<HardwareBranchPredictor>(HardwareBranchPredictor.class, this, HrmPackage.HARDWARE_PROCESSOR__PREDICTORS);
		}
		return predictors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareCache> getCaches() {
		if (caches == null) {
			caches = new EObjectResolvingEList<HardwareCache>(HardwareCache.class, this, HrmPackage.HARDWARE_PROCESSOR__CACHES);
		}
		return caches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareMmu> getOwnedMmus() {
		if (ownedMmus == null) {
			ownedMmus = new EObjectResolvingEList<HardwareMmu>(HardwareMmu.class, this, HrmPackage.HARDWARE_PROCESSOR__OWNED_MMUS);
		}
		return ownedMmus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HrmPackage.HARDWARE_PROCESSOR__ARCHITECTURE:
				return getArchitecture();
			case HrmPackage.HARDWARE_PROCESSOR__MIPS:
				return getMips();
			case HrmPackage.HARDWARE_PROCESSOR__IPC:
				return getIpc();
			case HrmPackage.HARDWARE_PROCESSOR__NB_CORES:
				return getNbCores();
			case HrmPackage.HARDWARE_PROCESSOR__NB_PIPELINES:
				return getNbPipelines();
			case HrmPackage.HARDWARE_PROCESSOR__NB_STAGES:
				return getNbStages();
			case HrmPackage.HARDWARE_PROCESSOR__NB_ALUS:
				return getNbAlus();
			case HrmPackage.HARDWARE_PROCESSOR__NB_FPUS:
				return getNbFpus();
			case HrmPackage.HARDWARE_PROCESSOR__OWNED_ISAS:
				return getOwnedIsas();
			case HrmPackage.HARDWARE_PROCESSOR__PREDICTORS:
				return getPredictors();
			case HrmPackage.HARDWARE_PROCESSOR__CACHES:
				return getCaches();
			case HrmPackage.HARDWARE_PROCESSOR__OWNED_MMUS:
				return getOwnedMmus();
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
			case HrmPackage.HARDWARE_PROCESSOR__MIPS:
				setMips((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_PROCESSOR__NB_CORES:
				setNbCores((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_PROCESSOR__NB_PIPELINES:
				setNbPipelines((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_PROCESSOR__NB_STAGES:
				setNbStages((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_PROCESSOR__NB_ALUS:
				setNbAlus((Integer)newValue);
				return;
			case HrmPackage.HARDWARE_PROCESSOR__NB_FPUS:
				setNbFpus((Integer)newValue);
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
			case HrmPackage.HARDWARE_PROCESSOR__MIPS:
				setMips(MIPS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_PROCESSOR__NB_CORES:
				setNbCores(NB_CORES_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_PROCESSOR__NB_PIPELINES:
				setNbPipelines(NB_PIPELINES_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_PROCESSOR__NB_STAGES:
				setNbStages(NB_STAGES_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_PROCESSOR__NB_ALUS:
				setNbAlus(NB_ALUS_EDEFAULT);
				return;
			case HrmPackage.HARDWARE_PROCESSOR__NB_FPUS:
				setNbFpus(NB_FPUS_EDEFAULT);
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
			case HrmPackage.HARDWARE_PROCESSOR__ARCHITECTURE:
				return architecture != ARCHITECTURE_EDEFAULT;
			case HrmPackage.HARDWARE_PROCESSOR__MIPS:
				return mips != MIPS_EDEFAULT;
			case HrmPackage.HARDWARE_PROCESSOR__IPC:
				return ipc != IPC_EDEFAULT;
			case HrmPackage.HARDWARE_PROCESSOR__NB_CORES:
				return nbCores != NB_CORES_EDEFAULT;
			case HrmPackage.HARDWARE_PROCESSOR__NB_PIPELINES:
				return nbPipelines != NB_PIPELINES_EDEFAULT;
			case HrmPackage.HARDWARE_PROCESSOR__NB_STAGES:
				return nbStages != NB_STAGES_EDEFAULT;
			case HrmPackage.HARDWARE_PROCESSOR__NB_ALUS:
				return nbAlus != NB_ALUS_EDEFAULT;
			case HrmPackage.HARDWARE_PROCESSOR__NB_FPUS:
				return nbFpus != NB_FPUS_EDEFAULT;
			case HrmPackage.HARDWARE_PROCESSOR__OWNED_ISAS:
				return ownedIsas != null && !ownedIsas.isEmpty();
			case HrmPackage.HARDWARE_PROCESSOR__PREDICTORS:
				return predictors != null && !predictors.isEmpty();
			case HrmPackage.HARDWARE_PROCESSOR__CACHES:
				return caches != null && !caches.isEmpty();
			case HrmPackage.HARDWARE_PROCESSOR__OWNED_MMUS:
				return ownedMmus != null && !ownedMmus.isEmpty();
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
		result.append(" (architecture: ");
		result.append(architecture);
		result.append(", mips: ");
		result.append(mips);
		result.append(", ipc: ");
		result.append(ipc);
		result.append(", nbCores: ");
		result.append(nbCores);
		result.append(", nbPipelines: ");
		result.append(nbPipelines);
		result.append(", nbStages: ");
		result.append(nbStages);
		result.append(", nbAlus: ");
		result.append(nbAlus);
		result.append(", nbFpus: ");
		result.append(nbFpus);
		result.append(')');
		return result.toString();
	}

} //HardwareProcessorImpl
