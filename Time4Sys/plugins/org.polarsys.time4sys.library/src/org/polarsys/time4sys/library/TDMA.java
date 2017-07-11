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
package org.polarsys.time4sys.library;

import org.eclipse.emf.common.util.EList;
import org.polarsys.time4sys.marte.grm.SchedulingPolicy;
import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDMA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.library.TDMA#getSlot <em>Slot</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.library.LibraryPackage#getTDMA()
 * @model
 * @generated
 */
public interface TDMA extends SchedulingPolicy {
	/**
	 * Returns the value of the '<em><b>Slot</b></em>' attribute list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.nfp.Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' attribute list.
	 * @see org.polarsys.time4sys.library.LibraryPackage#getTDMA_Slot()
	 * @model unique="false" dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration"
	 * @generated
	 */
	EList<Duration> getSlot();

} // TDMA
