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
package org.polarsys.time4sys.marte.srm;

import org.eclipse.emf.common.util.EList;
import org.polarsys.time4sys.marte.grm.TimerResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Timer Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareTimerResource#getDurationElements <em>Duration Elements</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareTimerResource()
 * @model
 * @generated
 */
public interface SoftwareTimerResource extends TimerResource {
	/**
	 * Returns the value of the '<em><b>Duration Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareTimerResource_DurationElements()
	 * @model
	 * @generated
	 */
	EList<String> getDurationElements();

} // SoftwareTimerResource
