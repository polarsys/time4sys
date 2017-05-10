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
 * A representation of the model object '<em><b>Twca Event Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.TwcaEventModel#getDeltamin_func <em>Deltamin func</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getTwcaEventModel()
 * @model
 * @generated
 */
public interface TwcaEventModel extends EventModel {
	/**
	 * Returns the value of the '<em><b>Deltamin func</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deltamin func</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deltamin func</em>' attribute.
	 * @see #setDeltamin_func(String)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getTwcaEventModel_Deltamin_func()
	 * @model
	 * @generated
	 */
	String getDeltamin_func();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.TwcaEventModel#getDeltamin_func <em>Deltamin func</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deltamin func</em>' attribute.
	 * @see #getDeltamin_func()
	 * @generated
	 */
	void setDeltamin_func(String value);

} // TwcaEventModel
