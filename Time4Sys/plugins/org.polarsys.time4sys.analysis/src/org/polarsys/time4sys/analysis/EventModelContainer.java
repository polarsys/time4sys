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
 * A representation of the model object '<em><b>Event Model Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.EventModelContainer#getEventModel <em>Event Model</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getEventModelContainer()
 * @model abstract="true"
 * @generated
 */
public interface EventModelContainer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Event Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.EventModel#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Model</em>' containment reference.
	 * @see #setEventModel(EventModel)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getEventModelContainer_EventModel()
	 * @see org.polarsys.time4sys.analysis.EventModel#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EventModel getEventModel();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.EventModelContainer#getEventModel <em>Event Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Model</em>' containment reference.
	 * @see #getEventModel()
	 * @generated
	 */
	void setEventModel(EventModel value);

} // EventModelContainer
