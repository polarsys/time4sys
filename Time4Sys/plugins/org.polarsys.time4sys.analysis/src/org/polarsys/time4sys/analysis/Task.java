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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.Task#getMappedTo <em>Mapped To</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.Task#getFragments <em>Fragments</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.Task#getFirst <em>First</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.Task#getBlockingTime <em>Blocking Time</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends SchedulableElement, SynchronizableElement {
	/**
	 * Returns the value of the '<em><b>Mapped To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.ComputingResource#getTasksAffectedOn <em>Tasks Affected On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped To</em>' reference.
	 * @see #setMappedTo(ComputingResource)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getTask_MappedTo()
	 * @see org.polarsys.time4sys.analysis.ComputingResource#getTasksAffectedOn
	 * @model opposite="tasksAffectedOn" required="true"
	 * @generated
	 */
	ComputingResource getMappedTo();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Task#getMappedTo <em>Mapped To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped To</em>' reference.
	 * @see #getMappedTo()
	 * @generated
	 */
	void setMappedTo(ComputingResource value);

	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.Fragment}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.Fragment#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getTask_Fragments()
	 * @see org.polarsys.time4sys.analysis.Fragment#getTask
	 * @model opposite="task" containment="true" required="true"
	 * @generated
	 */
	EList<Fragment> getFragments();

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(Fragment)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getTask_First()
	 * @model required="true"
	 * @generated
	 */
	Fragment getFirst();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Task#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(Fragment value);

	/**
	 * Returns the value of the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocking Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocking Time</em>' attribute.
	 * @see #setBlockingTime(long)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getTask_BlockingTime()
	 * @model
	 * @generated
	 */
	long getBlockingTime();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Task#getBlockingTime <em>Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocking Time</em>' attribute.
	 * @see #getBlockingTime()
	 * @generated
	 */
	void setBlockingTime(long value);

} // Task
