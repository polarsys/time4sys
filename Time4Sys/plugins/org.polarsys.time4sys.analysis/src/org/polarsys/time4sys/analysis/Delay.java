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

import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.Delay#getParent <em>Parent</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.Delay#getReferencedEvent <em>Referenced Event</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.Delay#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getDelay()
 * @model
 * @generated
 */
public interface Delay extends EventModelContainer, PortContainer {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getDelays <em>Delays</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AnalyzedSystem)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getDelay_Parent()
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getDelays
	 * @model opposite="delays" required="true" transient="false"
	 * @generated
	 */
	AnalyzedSystem getParent();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Delay#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AnalyzedSystem value);

	/**
	 * Returns the value of the '<em><b>Referenced Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Event</em>' reference.
	 * @see #setReferencedEvent(EventModelContainer)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getDelay_ReferencedEvent()
	 * @model
	 * @generated
	 */
	EventModelContainer getReferencedEvent();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Delay#getReferencedEvent <em>Referenced Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Event</em>' reference.
	 * @see #getReferencedEvent()
	 * @generated
	 */
	void setReferencedEvent(EventModelContainer value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Duration)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getDelay_Duration()
	 * @model dataType="org.polarsys.time4sys.analysis.NFP_Duration"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Delay#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

} // Delay
