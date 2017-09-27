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
package org.polarsys.time4sys.marte.gqam;

import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.WorkloadEvent#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.WorkloadEvent#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getWorkloadEvent()
 * @model
 * @generated
 */
public interface WorkloadEvent extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Effect</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' reference.
	 * @see #setEffect(BehaviorScenario)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getWorkloadEvent_Effect()
	 * @see org.polarsys.time4sys.marte.gqam.BehaviorScenario#getCause
	 * @model opposite="cause"
	 * @generated
	 */
	BehaviorScenario getEffect();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.WorkloadEvent#getEffect <em>Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(BehaviorScenario value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(ArrivalPattern)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getWorkloadEvent_Pattern()
	 * @see org.polarsys.time4sys.marte.gqam.ArrivalPattern#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ArrivalPattern getPattern();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.WorkloadEvent#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(ArrivalPattern value);

} // WorkloadEvent
