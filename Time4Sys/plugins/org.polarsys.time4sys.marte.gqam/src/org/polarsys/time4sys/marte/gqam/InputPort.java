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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.InputPort#getIncomingPrecedenceRelation <em>Incoming Precedence Relation</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.InputPort#getOwnedInputs <em>Owned Inputs</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends Port {
	/**
	 * Returns the value of the '<em><b>Incoming Precedence Relation</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.OutputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Precedence Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Precedence Relation</em>' reference list.
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getInputPort_IncomingPrecedenceRelation()
	 * @model upper="2"
	 * @generated
	 */
	EList<OutputPort> getIncomingPrecedenceRelation();

	/**
	 * Returns the value of the '<em><b>Owned Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.InputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Inputs</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getInputPort_OwnedInputs()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<InputPort> getOwnedInputs();

} // InputPort
