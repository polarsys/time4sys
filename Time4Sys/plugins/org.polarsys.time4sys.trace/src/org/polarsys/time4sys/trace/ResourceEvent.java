/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.trace;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.trace.ResourceEvent#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.trace.TracePackage#getResourceEvent()
 * @model
 * @generated
 */
public interface ResourceEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.trace.ResourceEventKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.trace.ResourceEventKind
	 * @see #setKind(ResourceEventKind)
	 * @see org.polarsys.time4sys.trace.TracePackage#getResourceEvent_Kind()
	 * @model required="true"
	 * @generated
	 */
	ResourceEventKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.ResourceEvent#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.trace.ResourceEventKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ResourceEventKind value);

} // ResourceEvent
