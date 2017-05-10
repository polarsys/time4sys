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
 * A representation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.Scheduler#getPolicyKind <em>Policy Kind</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.Scheduler#getScheduledElements <em>Scheduled Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.Scheduler#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.Scheduler#getRequiredParameters <em>Required Parameters</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.Scheduler#getParent <em>Parent</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.Scheduler#getResourceParameterValue <em>Resource Parameter Value</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.Scheduler#getPreferredPolicy <em>Preferred Policy</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getScheduler()
 * @model
 * @generated
 */
public interface Scheduler extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Policy Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.analysis.SchedulerPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Kind</em>' attribute.
	 * @see org.polarsys.time4sys.analysis.SchedulerPolicyKind
	 * @see #setPolicyKind(SchedulerPolicyKind)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getScheduler_PolicyKind()
	 * @model required="true"
	 * @generated
	 */
	SchedulerPolicyKind getPolicyKind();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Scheduler#getPolicyKind <em>Policy Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Kind</em>' attribute.
	 * @see org.polarsys.time4sys.analysis.SchedulerPolicyKind
	 * @see #getPolicyKind()
	 * @generated
	 */
	void setPolicyKind(SchedulerPolicyKind value);

	/**
	 * Returns the value of the '<em><b>Scheduled Elements</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.SchedulableElement}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.SchedulableElement#getScheduledBy <em>Scheduled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Elements</em>' reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getScheduler_ScheduledElements()
	 * @see org.polarsys.time4sys.analysis.SchedulableElement#getScheduledBy
	 * @model opposite="scheduledBy"
	 * @generated
	 */
	EList<SchedulableElement> getScheduledElements();

	/**
	 * Returns the value of the '<em><b>Used By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.Resource#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By</em>' reference.
	 * @see #setUsedBy(Resource)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getScheduler_UsedBy()
	 * @see org.polarsys.time4sys.analysis.Resource#getScheduler
	 * @model opposite="scheduler"
	 * @generated
	 */
	Resource getUsedBy();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Scheduler#getUsedBy <em>Used By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used By</em>' reference.
	 * @see #getUsedBy()
	 * @generated
	 */
	void setUsedBy(Resource value);

	/**
	 * Returns the value of the '<em><b>Required Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.RequiredSchedulingParameter}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.RequiredSchedulingParameter#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Parameters</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getScheduler_RequiredParameters()
	 * @see org.polarsys.time4sys.analysis.RequiredSchedulingParameter#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<RequiredSchedulingParameter> getRequiredParameters();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getSchedulers <em>Schedulers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AnalyzedSystem)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getScheduler_Parent()
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getSchedulers
	 * @model opposite="schedulers" transient="false"
	 * @generated
	 */
	AnalyzedSystem getParent();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Scheduler#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AnalyzedSystem value);

	/**
	 * Returns the value of the '<em><b>Resource Parameter Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.ResourceSchedulingParameterValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Parameter Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Parameter Value</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getScheduler_ResourceParameterValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceSchedulingParameterValue> getResourceParameterValue();

	/**
	 * Returns the value of the '<em><b>Preferred Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Policy</em>' attribute.
	 * @see #setPreferredPolicy(String)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getScheduler_PreferredPolicy()
	 * @model
	 * @generated
	 */
	String getPreferredPolicy();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Scheduler#getPreferredPolicy <em>Preferred Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Policy</em>' attribute.
	 * @see #getPreferredPolicy()
	 * @generated
	 */
	void setPreferredPolicy(String value);

} // Scheduler
