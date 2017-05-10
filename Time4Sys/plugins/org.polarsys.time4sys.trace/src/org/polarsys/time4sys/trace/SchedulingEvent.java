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
package org.polarsys.time4sys.trace;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.trace.SchedulingEvent#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.trace.TracePackage#getSchedulingEvent()
 * @model
 * @generated
 */
public interface SchedulingEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.trace.SchedulingEventKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.trace.SchedulingEventKind
	 * @see #setKind(SchedulingEventKind)
	 * @see org.polarsys.time4sys.trace.TracePackage#getSchedulingEvent_Kind()
	 * @model required="true"
	 * @generated
	 */
	SchedulingEventKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.SchedulingEvent#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.trace.SchedulingEventKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SchedulingEventKind value);

} // SchedulingEvent
