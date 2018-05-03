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
package org.polarsys.time4sys.marte.grm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.ResourceUsage#getWorkload <em>Workload</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.ResourceUsage#getRequiredAmount <em>Required Amount</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.ResourceUsage#getUsedResource <em>Used Resource</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourceUsage()
 * @model
 * @generated
 */
public interface ResourceUsage extends EObject {
	/**
	 * Returns the value of the '<em><b>Workload</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.UsageDemand}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.grm.UsageDemand#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload</em>' reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourceUsage_Workload()
	 * @see org.polarsys.time4sys.marte.grm.UsageDemand#getUsage
	 * @model opposite="usage"
	 * @generated
	 */
	EList<UsageDemand> getWorkload();

	/**
	 * Returns the value of the '<em><b>Required Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.UsageTypedAmount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Amount</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Amount</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourceUsage_RequiredAmount()
	 * @model containment="true"
	 * @generated
	 */
	EList<UsageTypedAmount> getRequiredAmount();

	/**
	 * Returns the value of the '<em><b>Used Resource</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.Resource}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.grm.Resource#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Resource</em>' reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getResourceUsage_UsedResource()
	 * @see org.polarsys.time4sys.marte.grm.Resource#getUsedBy
	 * @model opposite="usedBy"
	 * @generated
	 */
	EList<Resource> getUsedResource();

} // ResourceUsage
