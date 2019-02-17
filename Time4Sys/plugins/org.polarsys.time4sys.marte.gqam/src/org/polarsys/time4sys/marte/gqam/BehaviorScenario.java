/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work and others.
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
package org.polarsys.time4sys.marte.gqam;

import org.eclipse.emf.common.util.EList;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getRoot <em>Root</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getCause <em>Cause</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getParentStep <em>Parent Step</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getRespTime <em>Resp Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getBestCET <em>Best CET</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getWorstCET <em>Worst CET</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getBehaviorScenario()
 * @model
 * @generated
 */
public interface BehaviorScenario extends NamedElement, FlowInvolvedElement {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.Step}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.gqam.Step#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getBehaviorScenario_Steps()
	 * @see org.polarsys.time4sys.marte.gqam.Step#getScenario
	 * @model opposite="scenario" containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(Step)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getBehaviorScenario_Root()
	 * @model
	 * @generated
	 */
	Step getRoot();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Step value);

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.WorkloadEvent}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.gqam.WorkloadEvent#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' reference list.
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getBehaviorScenario_Cause()
	 * @see org.polarsys.time4sys.marte.gqam.WorkloadEvent#getEffect
	 * @model opposite="effect"
	 * @generated
	 */
	EList<WorkloadEvent> getCause();

	/**
	 * Returns the value of the '<em><b>Parent Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.gqam.Step#getChildScenario <em>Child Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Step</em>' reference.
	 * @see #setParentStep(Step)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getBehaviorScenario_ParentStep()
	 * @see org.polarsys.time4sys.marte.gqam.Step#getChildScenario
	 * @model opposite="childScenario"
	 * @generated
	 */
	Step getParentStep();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getParentStep <em>Parent Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Step</em>' reference.
	 * @see #getParentStep()
	 * @generated
	 */
	void setParentStep(Step value);

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.PrecedenceRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getBehaviorScenario_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrecedenceRelation> getConnectors();

	/**
	 * Returns the value of the '<em><b>Resp Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resp Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resp Time</em>' attribute.
	 * @see #setRespTime(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getBehaviorScenario_RespTime()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration"
	 * @generated
	 */
	Duration getRespTime();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getRespTime <em>Resp Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resp Time</em>' attribute.
	 * @see #getRespTime()
	 * @generated
	 */
	void setRespTime(Duration value);

	/**
	 * Returns the value of the '<em><b>Best CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Best CET</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Best CET</em>' attribute.
	 * @see #setBestCET(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getBehaviorScenario_BestCET()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration"
	 * @generated
	 */
	Duration getBestCET();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getBestCET <em>Best CET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best CET</em>' attribute.
	 * @see #getBestCET()
	 * @generated
	 */
	void setBestCET(Duration value);

	/**
	 * Returns the value of the '<em><b>Worst CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worst CET</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worst CET</em>' attribute.
	 * @see #setWorstCET(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getBehaviorScenario_WorstCET()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration"
	 * @generated
	 */
	Duration getWorstCET();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getWorstCET <em>Worst CET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst CET</em>' attribute.
	 * @see #getWorstCET()
	 * @generated
	 */
	void setWorstCET(Duration value);

} // BehaviorScenario
