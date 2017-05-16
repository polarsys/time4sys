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

import org.polarsys.time4sys.marte.nfp.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.Fragment#getNext <em>Next</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.Fragment#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.Fragment#getTask <em>Task</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.Fragment#getCET <em>CET</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getFragment()
 * @model
 * @generated
 */
public interface Fragment extends NamedElement, SynchronizableElement {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.Fragment#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Fragment)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getFragment_Next()
	 * @see org.polarsys.time4sys.analysis.Fragment#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	Fragment getNext();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Fragment#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Fragment value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.Fragment#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(Fragment)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getFragment_Previous()
	 * @see org.polarsys.time4sys.analysis.Fragment#getNext
	 * @model opposite="next"
	 * @generated
	 */
	Fragment getPrevious();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Fragment#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Fragment value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.Task#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' container reference.
	 * @see #setTask(Task)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getFragment_Task()
	 * @see org.polarsys.time4sys.analysis.Task#getFragments
	 * @model opposite="fragments" required="true" transient="false"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Fragment#getTask <em>Task</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' container reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CET</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CET</em>' attribute.
	 * @see #setCET(TimeInterval)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getFragment_CET()
	 * @model dataType="org.polarsys.time4sys.analysis.NFP_TimeInterval"
	 * @generated
	 */
	TimeInterval getCET();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Fragment#getCET <em>CET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CET</em>' attribute.
	 * @see #getCET()
	 * @generated
	 */
	void setCET(TimeInterval value);

} // Fragment
