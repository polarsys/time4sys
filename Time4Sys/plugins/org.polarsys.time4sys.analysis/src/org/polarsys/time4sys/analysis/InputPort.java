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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.InputPort#getReceiveFrom <em>Receive From</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends Port {
	/**
	 * Returns the value of the '<em><b>Receive From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.OutputPort#getSendTo <em>Send To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive From</em>' reference.
	 * @see #setReceiveFrom(OutputPort)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getInputPort_ReceiveFrom()
	 * @see org.polarsys.time4sys.analysis.OutputPort#getSendTo
	 * @model opposite="sendTo"
	 * @generated
	 */
	OutputPort getReceiveFrom();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.InputPort#getReceiveFrom <em>Receive From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive From</em>' reference.
	 * @see #getReceiveFrom()
	 * @generated
	 */
	void setReceiveFrom(OutputPort value);

} // InputPort
