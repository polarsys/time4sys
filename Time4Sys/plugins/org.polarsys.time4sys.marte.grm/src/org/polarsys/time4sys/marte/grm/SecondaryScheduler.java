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
package org.polarsys.time4sys.marte.grm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secondary Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.SecondaryScheduler#getVirtualProcessingUnit <em>Virtual Processing Unit</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getSecondaryScheduler()
 * @model
 * @generated
 */
public interface SecondaryScheduler extends Scheduler {
	/**
	 * Returns the value of the '<em><b>Virtual Processing Unit</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.SchedulableResource}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.grm.SchedulableResource#getDependentScheduler <em>Dependent Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Processing Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Processing Unit</em>' reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getSecondaryScheduler_VirtualProcessingUnit()
	 * @see org.polarsys.time4sys.marte.grm.SchedulableResource#getDependentScheduler
	 * @model opposite="dependentScheduler" required="true"
	 * @generated
	 */
	EList<SchedulableResource> getVirtualProcessingUnit();

} // SecondaryScheduler
