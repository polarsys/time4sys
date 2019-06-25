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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expected Evaluation Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue#getAssociatedRule <em>Associated Rule</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getExpectedEvaluationValue()
 * @model
 * @generated
 */
public interface ExpectedEvaluationValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.analysisrepository.tysco.TruthType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TruthType
	 * @see #setValue(TruthType)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getExpectedEvaluationValue_Value()
	 * @model
	 * @generated
	 */
	TruthType getValue();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TruthType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TruthType value);

	/**
	 * Returns the value of the '<em><b>Associated Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Rule</em>' reference.
	 * @see #setAssociatedRule(IdentificationRule)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getExpectedEvaluationValue_AssociatedRule()
	 * @model required="true"
	 * @generated
	 */
	IdentificationRule getAssociatedRule();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue#getAssociatedRule <em>Associated Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Rule</em>' reference.
	 * @see #getAssociatedRule()
	 * @generated
	 */
	void setAssociatedRule(IdentificationRule value);

} // ExpectedEvaluationValue
