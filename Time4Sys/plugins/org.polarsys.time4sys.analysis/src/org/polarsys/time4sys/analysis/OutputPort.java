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
 * A representation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.OutputPort#getSendTo <em>Send To</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getOutputPort()
 * @model
 * @generated
 */
public interface OutputPort extends Port {
	/**
	 * Returns the value of the '<em><b>Send To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.InputPort#getReceiveFrom <em>Receive From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send To</em>' reference.
	 * @see #setSendTo(InputPort)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getOutputPort_SendTo()
	 * @see org.polarsys.time4sys.analysis.InputPort#getReceiveFrom
	 * @model opposite="receiveFrom"
	 * @generated
	 */
	InputPort getSendTo();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.OutputPort#getSendTo <em>Send To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send To</em>' reference.
	 * @see #getSendTo()
	 * @generated
	 */
	void setSendTo(InputPort value);

} // OutputPort
