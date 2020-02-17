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
 * A representation of the model object '<em><b>Identification Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getContent <em>Content</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getRequiredRules <em>Required Rules</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getEquivalentRules <em>Equivalent Rules</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getConflictualRules <em>Conflictual Rules</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getFormalExpression <em>Formal Expression</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getAppliedClass <em>Applied Class</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getOneOrAll <em>One Or All</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getIdentificationRule()
 * @model
 * @generated
 */
public interface IdentificationRule extends EObject {
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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getIdentificationRule_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getIdentificationRule_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getIdentificationRule_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Required Rules</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Rules</em>' reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getIdentificationRule_RequiredRules()
	 * @model
	 * @generated
	 */
	EList<IdentificationRule> getRequiredRules();

	/**
	 * Returns the value of the '<em><b>Equivalent Rules</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Rules</em>' reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getIdentificationRule_EquivalentRules()
	 * @model
	 * @generated
	 */
	EList<IdentificationRule> getEquivalentRules();

	/**
	 * Returns the value of the '<em><b>Conflictual Rules</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflictual Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflictual Rules</em>' reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getIdentificationRule_ConflictualRules()
	 * @model
	 * @generated
	 */
	EList<IdentificationRule> getConflictualRules();

	/**
	 * Returns the value of the '<em><b>Formal Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Expression</em>' attribute.
	 * @see #setFormalExpression(String)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getIdentificationRule_FormalExpression()
	 * @model
	 * @generated
	 */
	String getFormalExpression();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getFormalExpression <em>Formal Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal Expression</em>' attribute.
	 * @see #getFormalExpression()
	 * @generated
	 */
	void setFormalExpression(String value);

	/**
	 * Returns the value of the '<em><b>Applied Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Class</em>' attribute.
	 * @see #setAppliedClass(String)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getIdentificationRule_AppliedClass()
	 * @model
	 * @generated
	 */
	String getAppliedClass();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getAppliedClass <em>Applied Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Class</em>' attribute.
	 * @see #getAppliedClass()
	 * @generated
	 */
	void setAppliedClass(String value);

	/**
	 * Returns the value of the '<em><b>One Or All</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.analysisrepository.tysco.AllOrOne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One Or All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Or All</em>' attribute.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.AllOrOne
	 * @see #setOneOrAll(AllOrOne)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getIdentificationRule_OneOrAll()
	 * @model
	 * @generated
	 */
	AllOrOne getOneOrAll();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule#getOneOrAll <em>One Or All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One Or All</em>' attribute.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.AllOrOne
	 * @see #getOneOrAll()
	 * @generated
	 */
	void setOneOrAll(AllOrOne value);

} // IdentificationRule
