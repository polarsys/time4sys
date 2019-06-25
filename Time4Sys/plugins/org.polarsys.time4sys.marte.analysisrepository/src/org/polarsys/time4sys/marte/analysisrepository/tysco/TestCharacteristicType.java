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
 * A representation of the model object '<em><b>Test Characteristic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestCharacteristicType#getComment <em>Comment</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestCharacteristicType#getReferencedContexts <em>Referenced Contexts</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTestCharacteristicType()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TestCharacteristicType_inv1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TestCharacteristicType_inv1='Tuple {\n\tmessage : String = \'Please re-check the related contexts\',\n\tstatus : Boolean = self.referencedContexts->forAll(ct:ContextModel|ct.analysisTests.characteristics->includes(self))\n}.status'"
 * @generated
 */
public interface TestCharacteristicType extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTestCharacteristicType_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestCharacteristicType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Contexts</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Contexts</em>' reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTestCharacteristicType_ReferencedContexts()
	 * @model required="true"
	 * @generated
	 */
	EList<ContextModel> getReferencedContexts();

} // TestCharacteristicType
