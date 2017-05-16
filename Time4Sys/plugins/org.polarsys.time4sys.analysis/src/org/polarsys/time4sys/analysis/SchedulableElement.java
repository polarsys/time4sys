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

import org.polarsys.time4sys.marte.nfp.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedulable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.SchedulableElement#getParent <em>Parent</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.SchedulableElement#getScheduledBy <em>Scheduled By</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.SchedulableElement#getCET <em>CET</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.SchedulableElement#getSchedulingParameters <em>Scheduling Parameters</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.SchedulableElement#getOriginalName <em>Original Name</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getSchedulableElement()
 * @model abstract="true"
 * @generated
 */
public interface SchedulableElement extends EventModelContainer, PortContainer {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getSchedulableElements <em>Schedulable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AnalyzedSystem)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getSchedulableElement_Parent()
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getSchedulableElements
	 * @model opposite="schedulableElements" required="true" transient="false"
	 * @generated
	 */
	AnalyzedSystem getParent();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.SchedulableElement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AnalyzedSystem value);

	/**
	 * Returns the value of the '<em><b>Scheduled By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.Scheduler#getScheduledElements <em>Scheduled Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled By</em>' reference.
	 * @see #setScheduledBy(Scheduler)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getSchedulableElement_ScheduledBy()
	 * @see org.polarsys.time4sys.analysis.Scheduler#getScheduledElements
	 * @model opposite="scheduledElements"
	 * @generated
	 */
	Scheduler getScheduledBy();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.SchedulableElement#getScheduledBy <em>Scheduled By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled By</em>' reference.
	 * @see #getScheduledBy()
	 * @generated
	 */
	void setScheduledBy(Scheduler value);

	/**
	 * Returns the value of the '<em><b>CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CET</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CET</em>' attribute.
	 * @see #setCET(TimeInterval)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getSchedulableElement_CET()
	 * @model dataType="org.polarsys.time4sys.analysis.NFP_TimeInterval" required="true"
	 * @generated
	 */
	TimeInterval getCET();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.SchedulableElement#getCET <em>CET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CET</em>' attribute.
	 * @see #getCET()
	 * @generated
	 */
	void setCET(TimeInterval value);

	/**
	 * Returns the value of the '<em><b>Scheduling Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.SchedulerParameterValue}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.SchedulerParameterValue#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Parameters</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getSchedulableElement_SchedulingParameters()
	 * @see org.polarsys.time4sys.analysis.SchedulerParameterValue#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<SchedulerParameterValue> getSchedulingParameters();

	/**
	 * Returns the value of the '<em><b>Original Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Name</em>' attribute.
	 * @see #setOriginalName(String)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getSchedulableElement_OriginalName()
	 * @model
	 * @generated
	 */
	String getOriginalName();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.SchedulableElement#getOriginalName <em>Original Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Name</em>' attribute.
	 * @see #getOriginalName()
	 * @generated
	 */
	void setOriginalName(String value);

} // SchedulableElement
