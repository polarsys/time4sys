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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The concept is from UML 2.5 Pin, where isControlPin=true.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.ControlPin#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getControlPin()
 * @model abstract="true"
 * @generated
 */
public interface ControlPin extends MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(ArrivalPattern)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getControlPin_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	ArrivalPattern getPattern();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.ControlPin#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(ArrivalPattern value);

} // ControlPin
