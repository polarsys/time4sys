/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.gqam;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Involved Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Flow Involved Element is a model element that is part of a functional chain, data-flow, or control-flow of interest.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.FlowInvolvedElement#getCause <em>Cause</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getFlowInvolvedElement()
 * @model abstract="true"
 * @generated
 */
public interface FlowInvolvedElement extends EObject {

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.WorkloadEvent}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.gqam.WorkloadEvent#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' reference list.
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getFlowInvolvedElement_Cause()
	 * @see org.polarsys.time4sys.marte.gqam.WorkloadEvent#getEffect
	 * @model opposite="effect"
	 * @generated
	 */
	EList<WorkloadEvent> getCause();
} // FlowInvolvedElement
