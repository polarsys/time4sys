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
package org.polarsys.time4sys.marte.grm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.SchedulingPolicy#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.SchedulingPolicy#getOtherSchedPolicy <em>Other Sched Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.SchedulingPolicy#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getSchedulingPolicy()
 * @model
 * @generated
 */
public interface SchedulingPolicy extends AccessControlPolicy {
	/**
	 * Returns the value of the '<em><b>Policy</b></em>' attribute.
	 * The default value is <code>"Undef"</code>.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.grm.SchedPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' attribute.
	 * @see org.polarsys.time4sys.marte.grm.SchedPolicyKind
	 * @see #setPolicy(SchedPolicyKind)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getSchedulingPolicy_Policy()
	 * @model default="Undef"
	 * @generated
	 */
	SchedPolicyKind getPolicy();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.SchedulingPolicy#getPolicy <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' attribute.
	 * @see org.polarsys.time4sys.marte.grm.SchedPolicyKind
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(SchedPolicyKind value);

	/**
	 * Returns the value of the '<em><b>Other Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Sched Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Sched Policy</em>' attribute.
	 * @see #setOtherSchedPolicy(String)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getSchedulingPolicy_OtherSchedPolicy()
	 * @model
	 * @generated
	 */
	String getOtherSchedPolicy();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.SchedulingPolicy#getOtherSchedPolicy <em>Other Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Sched Policy</em>' attribute.
	 * @see #getOtherSchedPolicy()
	 * @generated
	 */
	void setOtherSchedPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(ScheduleSpecification)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getSchedulingPolicy_Schedule()
	 * @model containment="true"
	 * @generated
	 */
	ScheduleSpecification getSchedule();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.SchedulingPolicy#getSchedule <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' containment reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(ScheduleSpecification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model diagnosticsRequired="true" contextRequired="true"
	 * @generated
	 */
	boolean hasValidPolicy(DiagnosticChain diagnostics, Map<?, ?> context);

} // SchedulingPolicy
