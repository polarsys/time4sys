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
package org.polarsys.time4sys.analysis;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analyzed System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getSchedulableElements <em>Schedulable Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getSchedulers <em>Schedulers</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getResources <em>Resources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getConstraintContainer <em>Constraint Container</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getStimuli <em>Stimuli</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getDelays <em>Delays</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getProtectionProtocols <em>Protection Protocols</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getMutexes <em>Mutexes</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getStatus <em>Status</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getResultContainers <em>Result Containers</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getAnalyzedSystem()
 * @model
 * @generated
 */
public interface AnalyzedSystem extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Schedulable Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.SchedulableElement}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.SchedulableElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedulable Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedulable Elements</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getAnalyzedSystem_SchedulableElements()
	 * @see org.polarsys.time4sys.analysis.SchedulableElement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<SchedulableElement> getSchedulableElements();

	/**
	 * Returns the value of the '<em><b>Schedulers</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.Scheduler}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.Scheduler#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedulers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedulers</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getAnalyzedSystem_Schedulers()
	 * @see org.polarsys.time4sys.analysis.Scheduler#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Scheduler> getSchedulers();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.Resource}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.Resource#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getAnalyzedSystem_Resources()
	 * @see org.polarsys.time4sys.analysis.Resource#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Constraint Container</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.ConstraintContainer#getAnalyzedSystem <em>Analyzed System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Container</em>' containment reference.
	 * @see #setConstraintContainer(ConstraintContainer)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getAnalyzedSystem_ConstraintContainer()
	 * @see org.polarsys.time4sys.analysis.ConstraintContainer#getAnalyzedSystem
	 * @model opposite="analyzedSystem" containment="true"
	 * @generated
	 */
	ConstraintContainer getConstraintContainer();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getConstraintContainer <em>Constraint Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Container</em>' containment reference.
	 * @see #getConstraintContainer()
	 * @generated
	 */
	void setConstraintContainer(ConstraintContainer value);

	/**
	 * Returns the value of the '<em><b>Stimuli</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.Stimulus}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.Stimulus#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimuli</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimuli</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getAnalyzedSystem_Stimuli()
	 * @see org.polarsys.time4sys.analysis.Stimulus#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Stimulus> getStimuli();

	/**
	 * Returns the value of the '<em><b>Delays</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.Delay}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.Delay#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delays</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delays</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getAnalyzedSystem_Delays()
	 * @see org.polarsys.time4sys.analysis.Delay#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Delay> getDelays();

	/**
	 * Returns the value of the '<em><b>Protection Protocols</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.ProtectionProtocol}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.ProtectionProtocol#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Protocols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Protocols</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getAnalyzedSystem_ProtectionProtocols()
	 * @see org.polarsys.time4sys.analysis.ProtectionProtocol#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ProtectionProtocol> getProtectionProtocols();

	/**
	 * Returns the value of the '<em><b>Mutexes</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.MutualExclusionResource}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.MutualExclusionResource#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutexes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutexes</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getAnalyzedSystem_Mutexes()
	 * @see org.polarsys.time4sys.analysis.MutualExclusionResource#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<MutualExclusionResource> getMutexes();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getAnalyzedSystem_Status()
	 * @model required="true"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Result Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.ResultContainer}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.ResultContainer#getAnalyzedSystem <em>Analyzed System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Containers</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getAnalyzedSystem_ResultContainers()
	 * @see org.polarsys.time4sys.analysis.ResultContainer#getAnalyzedSystem
	 * @model opposite="analyzedSystem" containment="true"
	 * @generated
	 */
	EList<ResultContainer> getResultContainers();

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.Mapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getAnalyzedSystem_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see #setTimeUnit(String)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getAnalyzedSystem_TimeUnit()
	 * @model
	 * @generated
	 */
	String getTimeUnit();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(String value);

} // AnalyzedSystem
