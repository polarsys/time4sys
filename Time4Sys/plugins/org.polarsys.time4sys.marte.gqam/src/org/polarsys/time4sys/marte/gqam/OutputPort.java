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
 * A representation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.OutputPort#getOutgoingPrecedenceRelation <em>Outgoing Precedence Relation</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.OutputPort#getOwnedOutputs <em>Owned Outputs</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getOutputPort()
 * @model
 * @generated
 */
public interface OutputPort extends Port {
	/**
	 * Returns the value of the '<em><b>Outgoing Precedence Relation</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.PrecedenceRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Precedence Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Precedence Relation</em>' reference list.
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getOutputPort_OutgoingPrecedenceRelation()
	 * @model upper="2"
	 * @generated
	 */
	EList<PrecedenceRelation> getOutgoingPrecedenceRelation();

	/**
	 * Returns the value of the '<em><b>Owned Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.OutputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Outputs</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getOutputPort_OwnedOutputs()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<OutputPort> getOwnedOutputs();

} // OutputPort
