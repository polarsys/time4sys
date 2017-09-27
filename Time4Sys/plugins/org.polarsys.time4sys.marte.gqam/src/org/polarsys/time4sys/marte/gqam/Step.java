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

import org.eclipse.emf.common.util.EList;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.Step#isIsAtomic <em>Is Atomic</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.Step#getBlockingTime <em>Blocking Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.Step#getRepetitions <em>Repetitions</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.Step#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.Step#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.Step#getServiceCount <em>Service Count</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.Step#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.Step#getChildScenario <em>Child Scenario</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.Step#getInputRel <em>Input Rel</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.Step#getOutputRel <em>Output Rel</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.Step#getConcurRes <em>Concur Res</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.Step#getInputPin <em>Input Pin</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.Step#getOutputPin <em>Output Pin</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends BehaviorScenario, AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' container reference.
	 * @see #setScenario(BehaviorScenario)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getStep_Scenario()
	 * @see org.polarsys.time4sys.marte.gqam.BehaviorScenario#getSteps
	 * @model opposite="steps" transient="false"
	 * @generated
	 */
	BehaviorScenario getScenario();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.Step#getScenario <em>Scenario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' container reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(BehaviorScenario value);

	/**
	 * Returns the value of the '<em><b>Child Scenario</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getParentStep <em>Parent Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Scenario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Scenario</em>' reference.
	 * @see #setChildScenario(BehaviorScenario)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getStep_ChildScenario()
	 * @see org.polarsys.time4sys.marte.gqam.BehaviorScenario#getParentStep
	 * @model opposite="parentStep"
	 * @generated
	 */
	BehaviorScenario getChildScenario();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.Step#getChildScenario <em>Child Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Scenario</em>' reference.
	 * @see #getChildScenario()
	 * @generated
	 */
	void setChildScenario(BehaviorScenario value);

	/**
	 * Returns the value of the '<em><b>Output Rel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.gqam.PrecedenceRelation#getPredec <em>Predec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Rel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Rel</em>' reference.
	 * @see #setOutputRel(PrecedenceRelation)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getStep_OutputRel()
	 * @see org.polarsys.time4sys.marte.gqam.PrecedenceRelation#getPredec
	 * @model opposite="predec"
	 * @generated
	 */
	PrecedenceRelation getOutputRel();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.Step#getOutputRel <em>Output Rel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Rel</em>' reference.
	 * @see #getOutputRel()
	 * @generated
	 */
	void setOutputRel(PrecedenceRelation value);

	/**
	 * Returns the value of the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concur Res</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concur Res</em>' reference.
	 * @see #setConcurRes(SchedulableResource)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getStep_ConcurRes()
	 * @model
	 * @generated
	 */
	SchedulableResource getConcurRes();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.Step#getConcurRes <em>Concur Res</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concur Res</em>' reference.
	 * @see #getConcurRes()
	 * @generated
	 */
	void setConcurRes(SchedulableResource value);

	/**
	 * Returns the value of the '<em><b>Input Pin</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Pin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Pin</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getStep_InputPin()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPin> getInputPin();

	/**
	 * Returns the value of the '<em><b>Output Pin</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Pin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Pin</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getStep_OutputPin()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getOutputPin();

	/**
	 * Returns the value of the '<em><b>Input Rel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.gqam.PrecedenceRelation#getSucces <em>Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Rel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Rel</em>' reference.
	 * @see #setInputRel(PrecedenceRelation)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getStep_InputRel()
	 * @see org.polarsys.time4sys.marte.gqam.PrecedenceRelation#getSucces
	 * @model opposite="succes"
	 * @generated
	 */
	PrecedenceRelation getInputRel();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.Step#getInputRel <em>Input Rel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Rel</em>' reference.
	 * @see #getInputRel()
	 * @generated
	 */
	void setInputRel(PrecedenceRelation value);

	/**
	 * Returns the value of the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Atomic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Atomic</em>' attribute.
	 * @see #setIsAtomic(boolean)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getStep_IsAtomic()
	 * @model
	 * @generated
	 */
	boolean isIsAtomic();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.Step#isIsAtomic <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Atomic</em>' attribute.
	 * @see #isIsAtomic()
	 * @generated
	 */
	void setIsAtomic(boolean value);

	/**
	 * Returns the value of the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocking Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocking Time</em>' attribute.
	 * @see #setBlockingTime(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getStep_BlockingTime()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration"
	 * @generated
	 */
	Duration getBlockingTime();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.Step#getBlockingTime <em>Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocking Time</em>' attribute.
	 * @see #getBlockingTime()
	 * @generated
	 */
	void setBlockingTime(Duration value);

	/**
	 * Returns the value of the '<em><b>Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetitions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetitions</em>' attribute.
	 * @see #setRepetitions(double)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getStep_Repetitions()
	 * @model
	 * @generated
	 */
	double getRepetitions();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.Step#getRepetitions <em>Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetitions</em>' attribute.
	 * @see #getRepetitions()
	 * @generated
	 */
	void setRepetitions(double value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getStep_Probability()
	 * @model
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.Step#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The higher the value of the priority, the higher the urgency of the step.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getStep_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.Step#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Service Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Count</em>' attribute.
	 * @see #setServiceCount(int)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getStep_ServiceCount()
	 * @model
	 * @generated
	 */
	int getServiceCount();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.Step#getServiceCount <em>Service Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Count</em>' attribute.
	 * @see #getServiceCount()
	 * @generated
	 */
	void setServiceCount(int value);

} // Step
