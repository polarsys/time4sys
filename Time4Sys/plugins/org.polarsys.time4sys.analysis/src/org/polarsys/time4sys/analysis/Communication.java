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
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.Communication#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getCommunication()
 * @model
 * @generated
 */
public interface Communication extends SchedulableElement {
	/**
	 * Returns the value of the '<em><b>Bus</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.CommunicationResource#getCommunicationsAffectedOn <em>Communications Affected On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' reference.
	 * @see #setBus(CommunicationResource)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getCommunication_Bus()
	 * @see org.polarsys.time4sys.analysis.CommunicationResource#getCommunicationsAffectedOn
	 * @model opposite="communicationsAffectedOn" required="true"
	 * @generated
	 */
	CommunicationResource getBus();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Communication#getBus <em>Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus</em>' reference.
	 * @see #getBus()
	 * @generated
	 */
	void setBus(CommunicationResource value);

} // Communication
