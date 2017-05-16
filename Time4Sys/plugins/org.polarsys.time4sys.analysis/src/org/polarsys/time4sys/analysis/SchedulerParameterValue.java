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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduler Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.SchedulerParameterValue#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.SchedulerParameterValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.SchedulerParameterValue#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getSchedulerParameterValue()
 * @model
 * @generated
 */
public interface SchedulerParameterValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(RequiredSchedulingParameter)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getSchedulerParameterValue_Type()
	 * @model required="true"
	 * @generated
	 */
	RequiredSchedulingParameter getType();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.SchedulerParameterValue#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(RequiredSchedulingParameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getSchedulerParameterValue_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.SchedulerParameterValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.SchedulableElement#getSchedulingParameters <em>Scheduling Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(SchedulableElement)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getSchedulerParameterValue_Parent()
	 * @see org.polarsys.time4sys.analysis.SchedulableElement#getSchedulingParameters
	 * @model opposite="schedulingParameters" required="true" transient="false"
	 * @generated
	 */
	SchedulableElement getParent();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.SchedulerParameterValue#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(SchedulableElement value);

} // SchedulerParameterValue
