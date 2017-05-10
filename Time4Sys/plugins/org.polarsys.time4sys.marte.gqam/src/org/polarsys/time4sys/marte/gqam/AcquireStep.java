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
package org.polarsys.time4sys.marte.gqam;

import org.polarsys.time4sys.marte.grm.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acquire Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.AcquireStep#getAcqRes <em>Acq Res</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.AcquireStep#getResUnits <em>Res Units</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getAcquireStep()
 * @model
 * @generated
 */
public interface AcquireStep extends Step {
	/**
	 * Returns the value of the '<em><b>Acq Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acq Res</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acq Res</em>' reference.
	 * @see #setAcqRes(Resource)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getAcquireStep_AcqRes()
	 * @model
	 * @generated
	 */
	Resource getAcqRes();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.AcquireStep#getAcqRes <em>Acq Res</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acq Res</em>' reference.
	 * @see #getAcqRes()
	 * @generated
	 */
	void setAcqRes(Resource value);

	/**
	 * Returns the value of the '<em><b>Res Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Units</em>' attribute.
	 * @see #setResUnits(int)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getAcquireStep_ResUnits()
	 * @model
	 * @generated
	 */
	int getResUnits();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.AcquireStep#getResUnits <em>Res Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Units</em>' attribute.
	 * @see #getResUnits()
	 * @generated
	 */
	void setResUnits(int value);

} // AcquireStep
