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
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.Port#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends EventModelContainer {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.PortContainer#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(PortContainer)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getPort_Parent()
	 * @see org.polarsys.time4sys.analysis.PortContainer#getPorts
	 * @model opposite="ports" transient="false"
	 * @generated
	 */
	PortContainer getParent();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Port#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(PortContainer value);

} // Port
