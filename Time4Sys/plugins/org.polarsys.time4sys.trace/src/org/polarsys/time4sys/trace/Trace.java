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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.trace.Trace#getEvents <em>Events</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Trace#getRange <em>Range</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Trace#getSlices <em>Slices</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Trace#getHostId <em>Host Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Trace#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.trace.TracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.trace.Event}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.trace.Event#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see org.polarsys.time4sys.trace.TracePackage#getTrace_Events()
	 * @see org.polarsys.time4sys.trace.Event#getTrace
	 * @model opposite="trace" containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(TimeInterval)
	 * @see org.polarsys.time4sys.trace.TracePackage#getTrace_Range()
	 * @model dataType="org.polarsys.time4sys.trace.NFP_TimeInterval" required="true"
	 * @generated
	 */
	TimeInterval getRange();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Trace#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(TimeInterval value);

	/**
	 * Returns the value of the '<em><b>Slices</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.trace.Slice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slices</em>' containment reference list.
	 * @see org.polarsys.time4sys.trace.TracePackage#getTrace_Slices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Slice> getSlices();

	/**
	 * Returns the value of the '<em><b>Host Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   See TraceCompass hostId.
	 * [quote,TraceCompass]
	 * ------------
	 * The host ID is not necessarily the hostname, but should be a unique identifier for the machine on which the trace was taken.
	 * It can be used to determine if two traces were taken on the exact same machine (timestamp already synchronized, resources with same id are the same if taken at the same time, etc).
	 * ------------
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Id</em>' attribute.
	 * @see #setHostId(String)
	 * @see org.polarsys.time4sys.trace.TracePackage#getTrace_HostId()
	 * @model required="true"
	 * @generated
	 */
	String getHostId();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Trace#getHostId <em>Host Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Id</em>' attribute.
	 * @see #getHostId()
	 * @generated
	 */
	void setHostId(String value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(Duration)
	 * @see org.polarsys.time4sys.trace.TracePackage#getTrace_Precision()
	 * @model dataType="org.polarsys.time4sys.trace.NFP_Duration"
	 * @generated
	 */
	Duration getPrecision();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Trace#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Duration value);

} // Trace
