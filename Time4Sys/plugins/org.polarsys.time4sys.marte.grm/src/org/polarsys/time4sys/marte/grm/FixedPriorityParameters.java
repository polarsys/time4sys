/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.grm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Priority Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.FixedPriorityParameters#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getFixedPriorityParameters()
 * @model
 * @generated
 */
public interface FixedPriorityParameters extends SchedulingParameter {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * priority is the urgency of the SchedulableResource, ie the higher the priority, the higher the urgency (higher numerical value).
	 * NB:  This is the opposite of the posix priority where highest priority have lowest numerical value. In Time4Sys, the highest priority have the highest numerical value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getFixedPriorityParameters_Priority()
	 * @model required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.FixedPriorityParameters#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

} // FixedPriorityParameters
