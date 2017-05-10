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
 * A representation of the model object '<em><b>Computing Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.ComputingResource#getTasksAffectedOn <em>Tasks Affected On</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.ComputingResource#getLinkedBy <em>Linked By</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getComputingResource()
 * @model
 * @generated
 */
public interface ComputingResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Tasks Affected On</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.Task}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.Task#getMappedTo <em>Mapped To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks Affected On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks Affected On</em>' reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getComputingResource_TasksAffectedOn()
	 * @see org.polarsys.time4sys.analysis.Task#getMappedTo
	 * @model opposite="mappedTo"
	 * @generated
	 */
	EList<Task> getTasksAffectedOn();

	/**
	 * Returns the value of the '<em><b>Linked By</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.CommunicationResource}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.CommunicationResource#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked By</em>' reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getComputingResource_LinkedBy()
	 * @see org.polarsys.time4sys.analysis.CommunicationResource#getLinks
	 * @model opposite="links"
	 * @generated
	 */
	EList<CommunicationResource> getLinkedBy();

} // ComputingResource
