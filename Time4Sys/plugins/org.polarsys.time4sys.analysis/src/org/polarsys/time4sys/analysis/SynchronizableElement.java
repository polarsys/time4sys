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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronizable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.SynchronizableElement#getLockedMutexes <em>Locked Mutexes</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getSynchronizableElement()
 * @model abstract="true"
 * @generated
 */
public interface SynchronizableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Locked Mutexes</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.MutualExclusionResource}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.MutualExclusionResource#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locked Mutexes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked Mutexes</em>' reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getSynchronizableElement_LockedMutexes()
	 * @see org.polarsys.time4sys.analysis.MutualExclusionResource#getElements
	 * @model opposite="elements"
	 * @generated
	 */
	EList<MutualExclusionResource> getLockedMutexes();

} // SynchronizableElement
