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
 * A representation of the model object '<em><b>Hardware Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getMips <em>Mips</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getIpc <em>Ipc</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbCores <em>Nb Cores</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbPipelines <em>Nb Pipelines</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbStages <em>Nb Stages</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbAlus <em>Nb Alus</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbFpus <em>Nb Fpus</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getOwnedIsas <em>Owned Isas</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getPredictors <em>Predictors</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getCaches <em>Caches</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getOwnedMmus <em>Owned Mmus</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareProcessor()
 * @model
 * @generated
 */
public interface HardwareProcessor extends HardwareComputingResource {
	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareProcessor_Architecture()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	int getArchitecture();

	/**
	 * Returns the value of the '<em><b>Mips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mips</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mips</em>' attribute.
	 * @see #setMips(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareProcessor_Mips()
	 * @model
	 * @generated
	 */
	int getMips();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getMips <em>Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mips</em>' attribute.
	 * @see #getMips()
	 * @generated
	 */
	void setMips(int value);

	/**
	 * Returns the value of the '<em><b>Ipc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ipc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ipc</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareProcessor_Ipc()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	float getIpc();

	/**
	 * Returns the value of the '<em><b>Nb Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Cores</em>' attribute.
	 * @see #setNbCores(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareProcessor_NbCores()
	 * @model
	 * @generated
	 */
	int getNbCores();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbCores <em>Nb Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Cores</em>' attribute.
	 * @see #getNbCores()
	 * @generated
	 */
	void setNbCores(int value);

	/**
	 * Returns the value of the '<em><b>Nb Pipelines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Pipelines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Pipelines</em>' attribute.
	 * @see #setNbPipelines(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareProcessor_NbPipelines()
	 * @model
	 * @generated
	 */
	int getNbPipelines();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbPipelines <em>Nb Pipelines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Pipelines</em>' attribute.
	 * @see #getNbPipelines()
	 * @generated
	 */
	void setNbPipelines(int value);

	/**
	 * Returns the value of the '<em><b>Nb Stages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Stages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Stages</em>' attribute.
	 * @see #setNbStages(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareProcessor_NbStages()
	 * @model
	 * @generated
	 */
	int getNbStages();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbStages <em>Nb Stages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Stages</em>' attribute.
	 * @see #getNbStages()
	 * @generated
	 */
	void setNbStages(int value);

	/**
	 * Returns the value of the '<em><b>Nb Alus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Alus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Alus</em>' attribute.
	 * @see #setNbAlus(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareProcessor_NbAlus()
	 * @model
	 * @generated
	 */
	int getNbAlus();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbAlus <em>Nb Alus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Alus</em>' attribute.
	 * @see #getNbAlus()
	 * @generated
	 */
	void setNbAlus(int value);

	/**
	 * Returns the value of the '<em><b>Nb Fpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Fpus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Fpus</em>' attribute.
	 * @see #setNbFpus(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareProcessor_NbFpus()
	 * @model
	 * @generated
	 */
	int getNbFpus();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareProcessor#getNbFpus <em>Nb Fpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Fpus</em>' attribute.
	 * @see #getNbFpus()
	 * @generated
	 */
	void setNbFpus(int value);

	/**
	 * Returns the value of the '<em><b>Owned Isas</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwareIsa}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Isas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Isas</em>' reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareProcessor_OwnedIsas()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<HardwareIsa> getOwnedIsas();

	/**
	 * Returns the value of the '<em><b>Predictors</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwareBranchPredictor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predictors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predictors</em>' reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareProcessor_Predictors()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<HardwareBranchPredictor> getPredictors();

	/**
	 * Returns the value of the '<em><b>Caches</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwareCache}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caches</em>' reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareProcessor_Caches()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<HardwareCache> getCaches();

	/**
	 * Returns the value of the '<em><b>Owned Mmus</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwareMmu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Mmus</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Mmus</em>' reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareProcessor_OwnedMmus()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<HardwareMmu> getOwnedMmus();

} // HardwareProcessor
