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
package org.polarsys.time4sys.marte.srm;

import org.eclipse.emf.common.util.EList;

import org.polarsys.time4sys.marte.grm.Scheduler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareScheduler#getScheduledResource <em>Scheduled Resource</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareScheduler()
 * @model
 * @generated
 */
public interface SoftwareScheduler extends Scheduler {
	/**
	 * Returns the value of the '<em><b>Scheduled Resource</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Resource</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareScheduler_ScheduledResource()
	 * @see org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource#getScheduler
	 * @model opposite="scheduler"
	 * @generated
	 */
	EList<SoftwareSchedulableResource> getScheduledResource();

} // SoftwareScheduler
