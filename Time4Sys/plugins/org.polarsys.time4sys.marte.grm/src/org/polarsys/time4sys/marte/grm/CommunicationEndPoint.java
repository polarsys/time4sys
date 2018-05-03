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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication End Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.CommunicationEndPoint#getPacketSize <em>Packet Size</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getCommunicationEndPoint()
 * @model abstract="true"
 * @generated
 */
public interface CommunicationEndPoint extends CommunicationResource {
	/**
	 * Returns the value of the '<em><b>Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Size</em>' attribute.
	 * @see #setPacketSize(int)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getCommunicationEndPoint_PacketSize()
	 * @model
	 * @generated
	 */
	int getPacketSize();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.CommunicationEndPoint#getPacketSize <em>Packet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Size</em>' attribute.
	 * @see #getPacketSize()
	 * @generated
	 */
	void setPacketSize(int value);

} // CommunicationEndPoint
