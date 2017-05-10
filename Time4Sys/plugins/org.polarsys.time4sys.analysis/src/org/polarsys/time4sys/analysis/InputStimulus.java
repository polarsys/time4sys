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
package org.polarsys.time4sys.analysis;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Stimulus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.InputStimulus#getOutputPorts <em>Output Ports</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getInputStimulus()
 * @model
 * @generated
 */
public interface InputStimulus extends Stimulus {
	/**
	 * Returns the value of the '<em><b>Output Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.OutputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Ports</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getInputStimulus_OutputPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPort> getOutputPorts();

} // InputStimulus
