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
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getReferences <em>References</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getImplementations <em>Implementations</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTest()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IdCompliance_inv4 Characteristic_inv1 Characteristic_inv2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IdCompliance_inv4='Tuple {\n\tmessage : String = \'Error: Ids conflicts: there are at least 2 test implementations whose id is the same\',\n\tstatus : Boolean = self.implementations->forAll(impl1,impl2|impl1<>impl2 implies impl1.id<>impl2.id)\n}.status' Characteristic_inv1='Tuple {\n\tmessage : String = \'Error: There are at least 1 sufficient conditions in a test\',\n\tstatus : Boolean = self.characteristics->selectByKind(SufficientCondition)->size()<2\n}.status' Characteristic_inv2='Tuple {\n\tmessage : String = \'Error: There are at least 1 necessary conditions in a test\',\n\tstatus : Boolean = self.characteristics->selectByKind(NecessaryCondition)->size()<2\n}.status'"
 * @generated
 */
public interface Test extends EObject {
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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTest_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getId <em>Id</em>}' attribute.
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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTest_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTest_References()
	 * @model
	 * @generated
	 */
	EList<String> getReferences();

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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTest_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestCharacteristicType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristics</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTest_Characteristics()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestCharacteristicType> getCharacteristics();

	/**
	 * Returns the value of the '<em><b>Implementations</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementations</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTest_Implementations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestImplementation> getImplementations();

} // Test
