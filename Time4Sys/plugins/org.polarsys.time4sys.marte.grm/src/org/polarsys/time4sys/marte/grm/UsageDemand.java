/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work and others.
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
package org.polarsys.time4sys.marte.grm;

import org.eclipse.emf.common.util.EList;
import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Demand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.UsageDemand#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.UsageDemand#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getUsageDemand()
 * @model
 * @generated
 */
public interface UsageDemand extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Usage</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceUsage}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.grm.ResourceUsage#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getUsageDemand_Usage()
	 * @see org.polarsys.time4sys.marte.grm.ResourceUsage#getWorkload
	 * @model opposite="workload"
	 * @generated
	 */
	EList<ResourceUsage> getUsage();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getUsageDemand_Event()
	 * @model
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.UsageDemand#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

} // UsageDemand
