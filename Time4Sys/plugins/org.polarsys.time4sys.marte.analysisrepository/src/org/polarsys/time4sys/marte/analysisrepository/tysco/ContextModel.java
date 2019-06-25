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
 * A representation of the model object '<em><b>Context Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getReferences <em>References</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getRefinedContexts <em>Refined Contexts</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getAnalysisTests <em>Analysis Tests</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getRootGroup <em>Root Group</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getTruthValues <em>Truth Values</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getRuleGroups <em>Rule Groups</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getContextModel()
 * @model
 * @generated
 */
public interface ContextModel extends EObject {
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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getContextModel_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getContextModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getContextModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getContextModel_References()
	 * @model
	 * @generated
	 */
	EList<String> getReferences();

	/**
	 * Returns the value of the '<em><b>Refined Contexts</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Contexts</em>' reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getContextModel_RefinedContexts()
	 * @model transient="true"
	 * @generated
	 */
	EList<ContextModel> getRefinedContexts();

	/**
	 * Returns the value of the '<em><b>Analysis Tests</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Tests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Tests</em>' reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getContextModel_AnalysisTests()
	 * @model
	 * @generated
	 */
	EList<Test> getAnalysisTests();

	/**
	 * Returns the value of the '<em><b>Rule Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getContextmodel <em>Contextmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Groups</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getContextModel_RuleGroups()
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup#getContextmodel
	 * @model opposite="contextmodel" containment="true"
	 * @generated
	 */
	EList<RuleGroup> getRuleGroups();

	/**
	 * Returns the value of the '<em><b>Root Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Group</em>' reference.
	 * @see #setRootGroup(RuleGroup)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getContextModel_RootGroup()
	 * @model required="true"
	 * @generated
	 */
	RuleGroup getRootGroup();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel#getRootGroup <em>Root Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Group</em>' reference.
	 * @see #getRootGroup()
	 * @generated
	 */
	void setRootGroup(RuleGroup value);

	/**
	 * Returns the value of the '<em><b>Truth Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Truth Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Truth Values</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getContextModel_TruthValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpectedEvaluationValue> getTruthValues();

} // ContextModel
