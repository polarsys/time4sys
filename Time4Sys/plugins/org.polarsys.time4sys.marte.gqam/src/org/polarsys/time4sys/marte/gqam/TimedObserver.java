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
package org.polarsys.time4sys.marte.gqam;

import org.eclipse.emf.common.util.EList;

import org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Observer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.TimedObserver#getLaxity <em>Laxity</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getTimedObserver()
 * @model
 * @generated
 */
public interface TimedObserver extends Constraint {
	/**
	 * Returns the value of the '<em><b>Laxity</b></em>' attribute list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.LaxityKind}.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.gqam.LaxityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Laxity</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Laxity</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.gqam.LaxityKind
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getTimedObserver_Laxity()
	 * @model
	 * @generated
	 */
	EList<LaxityKind> getLaxity();

} // TimedObserver
