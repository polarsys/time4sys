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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EModelElement;
import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.trace.Event#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Event#getTrace <em>Trace</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Event#getAbout <em>About</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.trace.TracePackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EModelElement {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Duration)
	 * @see org.polarsys.time4sys.trace.TracePackage#getEvent_Timestamp()
	 * @model dataType="org.polarsys.time4sys.trace.NFP_Duration" required="true"
	 * @generated
	 */
	Duration getTimestamp();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Event#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Duration value);

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.trace.Trace#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' container reference.
	 * @see #setTrace(Trace)
	 * @see org.polarsys.time4sys.trace.TracePackage#getEvent_Trace()
	 * @see org.polarsys.time4sys.trace.Trace#getEvents
	 * @model opposite="events" required="true" transient="false"
	 * @generated
	 */
	Trace getTrace();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Event#getTrace <em>Trace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' container reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(Trace value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.trace.Slice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>About</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' reference list.
	 * @see org.polarsys.time4sys.trace.TracePackage#getEvent_About()
	 * @model
	 * @generated
	 */
	EList<Slice> getAbout();

} // Event
