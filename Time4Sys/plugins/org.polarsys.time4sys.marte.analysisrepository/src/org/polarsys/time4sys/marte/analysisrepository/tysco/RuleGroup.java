/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Yassine OUHAMMOU- initial API and implementation
 *
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getSubGroups <em>Sub Groups</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getExpectedRuleValues <em>Expected Rule Values</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getJunctionType <em>Junction Type</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getContextmodel <em>Contextmodel</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getRuleGroup()
 * @model
 * @generated
 */
public interface RuleGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Groups</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Groups</em>' reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getRuleGroup_SubGroups()
	 * @model
	 * @generated
	 */
	EList<RuleGroup> getSubGroups();

	/**
	 * Returns the value of the '<em><b>Expected Rule Values</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Rule Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Rule Values</em>' reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getRuleGroup_ExpectedRuleValues()
	 * @model
	 * @generated
	 */
	EList<ExpectedEvaluationValue> getExpectedRuleValues();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getRuleGroup_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Junction Type</b></em>' attribute.
	 * The default value is <code>"and"</code>.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.analysisrepository.tysco.JunctionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Junction Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Junction Type</em>' attribute.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.JunctionType
	 * @see #setJunctionType(JunctionType)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getRuleGroup_JunctionType()
	 * @model default="and"
	 * @generated
	 */
	JunctionType getJunctionType();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getJunctionType <em>Junction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Junction Type</em>' attribute.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.JunctionType
	 * @see #getJunctionType()
	 * @generated
	 */
	void setJunctionType(JunctionType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getRuleGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Contextmodel</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getRuleGroups <em>Rule Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contextmodel</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextmodel</em>' container reference.
	 * @see #setContextmodel(ContextModel)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getRuleGroup_Contextmodel()
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getRuleGroups
	 * @model opposite="ruleGroups" required="true" transient="false"
	 * @generated
	 */
	ContextModel getContextmodel();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getContextmodel <em>Contextmodel</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contextmodel</em>' container reference.
	 * @see #getContextmodel()
	 * @generated
	 */
	void setContextmodel(ContextModel value);

} // RuleGroup
