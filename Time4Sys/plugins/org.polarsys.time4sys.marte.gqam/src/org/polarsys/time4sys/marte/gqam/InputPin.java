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
 * A representation of the model object '<em><b>Input Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * from UML 2.5
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.InputPin#getPredecessors <em>Predecessors</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getInputPin()
 * @model
 * @generated
 */
public interface InputPin extends Pin {
	/**
	 * Returns the value of the '<em><b>Predecessors</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.OutputPin}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.gqam.OutputPin#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In UML 2.5, this would be an ActivityEdge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predecessors</em>' reference list.
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getInputPin_Predecessors()
	 * @see org.polarsys.time4sys.marte.gqam.OutputPin#getSuccessors
	 * @model opposite="successors"
	 * @generated
	 */
	EList<OutputPin> getPredecessors();

} // InputPin
