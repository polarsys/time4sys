/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is to be deprecated by ports usage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.PrecedenceRelation#getPredec <em>Predec</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.PrecedenceRelation#getSucces <em>Succes</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.PrecedenceRelation#getConnectorKind <em>Connector Kind</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getPrecedenceRelation()
 * @model
 * @generated
 */
public interface PrecedenceRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Predec</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.Step}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.gqam.Step#getOutputRel <em>Output Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predec</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predec</em>' reference list.
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getPrecedenceRelation_Predec()
	 * @see org.polarsys.time4sys.marte.gqam.Step#getOutputRel
	 * @model opposite="outputRel"
	 * @generated
	 */
	EList<Step> getPredec();

	/**
	 * Returns the value of the '<em><b>Succes</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.Step}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.gqam.Step#getInputRel <em>Input Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Succes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succes</em>' reference list.
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getPrecedenceRelation_Succes()
	 * @see org.polarsys.time4sys.marte.gqam.Step#getInputRel
	 * @model opposite="inputRel"
	 * @generated
	 */
	EList<Step> getSucces();

	/**
	 * Returns the value of the '<em><b>Connector Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.gqam.ConnectorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Kind</em>' attribute.
	 * @see org.polarsys.time4sys.marte.gqam.ConnectorKind
	 * @see #setConnectorKind(ConnectorKind)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getPrecedenceRelation_ConnectorKind()
	 * @model
	 * @generated
	 */
	ConnectorKind getConnectorKind();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.PrecedenceRelation#getConnectorKind <em>Connector Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Kind</em>' attribute.
	 * @see org.polarsys.time4sys.marte.gqam.ConnectorKind
	 * @see #getConnectorKind()
	 * @generated
	 */
	void setConnectorKind(ConnectorKind value);

} // PrecedenceRelation
