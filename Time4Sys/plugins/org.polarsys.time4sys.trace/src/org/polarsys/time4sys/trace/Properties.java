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

import org.eclipse.emf.ecore.EModelElement;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.trace.Properties#getRange <em>Range</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Properties#getBlockingTime <em>Blocking Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Properties#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Properties#getRemainingTime <em>Remaining Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Properties#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Properties#getAbsoluteDeadline <em>Absolute Deadline</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Properties#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.trace.TracePackage#getProperties()
 * @model
 * @generated
 */
public interface Properties extends EModelElement {
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
	 * @see org.polarsys.time4sys.trace.TracePackage#getProperties_Range()
	 * @model dataType="org.polarsys.time4sys.trace.NFP_TimeInterval"
	 * @generated
	 */
	TimeInterval getRange();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Properties#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(TimeInterval value);

	/**
	 * Returns the value of the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocking Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocking Time</em>' attribute.
	 * @see #setBlockingTime(Duration)
	 * @see org.polarsys.time4sys.trace.TracePackage#getProperties_BlockingTime()
	 * @model dataType="org.polarsys.time4sys.trace.NFP_Duration"
	 * @generated
	 */
	Duration getBlockingTime();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Properties#getBlockingTime <em>Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocking Time</em>' attribute.
	 * @see #getBlockingTime()
	 * @generated
	 */
	void setBlockingTime(Duration value);

	/**
	 * Returns the value of the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Time</em>' attribute.
	 * @see #setExecutionTime(Duration)
	 * @see org.polarsys.time4sys.trace.TracePackage#getProperties_ExecutionTime()
	 * @model dataType="org.polarsys.time4sys.trace.NFP_Duration"
	 * @generated
	 */
	Duration getExecutionTime();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Properties#getExecutionTime <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Time</em>' attribute.
	 * @see #getExecutionTime()
	 * @generated
	 */
	void setExecutionTime(Duration value);

	/**
	 * Returns the value of the '<em><b>Remaining Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Time</em>' attribute.
	 * @see #setRemainingTime(Duration)
	 * @see org.polarsys.time4sys.trace.TracePackage#getProperties_RemainingTime()
	 * @model dataType="org.polarsys.time4sys.trace.NFP_Duration"
	 * @generated
	 */
	Duration getRemainingTime();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Properties#getRemainingTime <em>Remaining Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Time</em>' attribute.
	 * @see #getRemainingTime()
	 * @generated
	 */
	void setRemainingTime(Duration value);

	/**
	 * Returns the value of the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Time</em>' attribute.
	 * @see #setResponseTime(Duration)
	 * @see org.polarsys.time4sys.trace.TracePackage#getProperties_ResponseTime()
	 * @model dataType="org.polarsys.time4sys.trace.NFP_Duration"
	 * @generated
	 */
	Duration getResponseTime();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Properties#getResponseTime <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Time</em>' attribute.
	 * @see #getResponseTime()
	 * @generated
	 */
	void setResponseTime(Duration value);

	/**
	 * Returns the value of the '<em><b>Absolute Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Deadline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Deadline</em>' attribute.
	 * @see #setAbsoluteDeadline(Duration)
	 * @see org.polarsys.time4sys.trace.TracePackage#getProperties_AbsoluteDeadline()
	 * @model dataType="org.polarsys.time4sys.trace.NFP_Duration"
	 * @generated
	 */
	Duration getAbsoluteDeadline();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Properties#getAbsoluteDeadline <em>Absolute Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Deadline</em>' attribute.
	 * @see #getAbsoluteDeadline()
	 * @generated
	 */
	void setAbsoluteDeadline(Duration value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(long)
	 * @see org.polarsys.time4sys.trace.TracePackage#getProperties_Index()
	 * @model
	 * @generated
	 */
	long getIndex();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Properties#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(long value);

} // Properties
