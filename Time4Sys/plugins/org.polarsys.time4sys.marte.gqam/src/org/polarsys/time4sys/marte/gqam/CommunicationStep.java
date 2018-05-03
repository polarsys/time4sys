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
package org.polarsys.time4sys.marte.gqam;

import org.polarsys.time4sys.marte.grm.CommunicationResource;
import org.polarsys.time4sys.marte.nfp.DataSize;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.CommunicationStep#getMsgSize <em>Msg Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.CommunicationStep#getComRes <em>Com Res</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getCommunicationStep()
 * @model
 * @generated
 */
public interface CommunicationStep extends Step {
	/**
	 * Returns the value of the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Size</em>' attribute.
	 * @see #setMsgSize(DataSize)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getCommunicationStep_MsgSize()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_DataSize"
	 * @generated
	 */
	DataSize getMsgSize();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.CommunicationStep#getMsgSize <em>Msg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg Size</em>' attribute.
	 * @see #getMsgSize()
	 * @generated
	 */
	void setMsgSize(DataSize value);

	/**
	 * Returns the value of the '<em><b>Com Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Res</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Res</em>' reference.
	 * @see #setComRes(CommunicationResource)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getCommunicationStep_ComRes()
	 * @model
	 * @generated
	 */
	CommunicationResource getComRes();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.CommunicationStep#getComRes <em>Com Res</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Res</em>' reference.
	 * @see #getComRes()
	 * @generated
	 */
	void setComRes(CommunicationResource value);

} // CommunicationStep
