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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.CommunicationMedia#getElementSize <em>Element Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.CommunicationMedia#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.CommunicationMedia#getPacketTime <em>Packet Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.CommunicationMedia#getBlockingTime <em>Blocking Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.CommunicationMedia#getTransmMode <em>Transm Mode</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getCommunicationMedia()
 * @model
 * @generated
 */
public interface CommunicationMedia extends CommunicationResource, ProcessingResource {
	/**
	 * Returns the value of the '<em><b>Element Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Size</em>' attribute.
	 * @see #setElementSize(int)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getCommunicationMedia_ElementSize()
	 * @model
	 * @generated
	 */
	int getElementSize();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.CommunicationMedia#getElementSize <em>Element Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Size</em>' attribute.
	 * @see #getElementSize()
	 * @generated
	 */
	void setElementSize(int value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(float)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getCommunicationMedia_Capacity()
	 * @model
	 * @generated
	 */
	float getCapacity();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.CommunicationMedia#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(float value);

	/**
	 * Returns the value of the '<em><b>Packet Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Time</em>' attribute.
	 * @see #setPacketTime(float)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getCommunicationMedia_PacketTime()
	 * @model
	 * @generated
	 */
	float getPacketTime();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.CommunicationMedia#getPacketTime <em>Packet Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Time</em>' attribute.
	 * @see #getPacketTime()
	 * @generated
	 */
	void setPacketTime(float value);

	/**
	 * Returns the value of the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocking Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocking Time</em>' attribute.
	 * @see #setBlockingTime(float)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getCommunicationMedia_BlockingTime()
	 * @model
	 * @generated
	 */
	float getBlockingTime();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.CommunicationMedia#getBlockingTime <em>Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocking Time</em>' attribute.
	 * @see #getBlockingTime()
	 * @generated
	 */
	void setBlockingTime(float value);

	/**
	 * Returns the value of the '<em><b>Transm Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.grm.TransmModeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transm Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transm Mode</em>' attribute.
	 * @see org.polarsys.time4sys.marte.grm.TransmModeKind
	 * @see #setTransmMode(TransmModeKind)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getCommunicationMedia_TransmMode()
	 * @model
	 * @generated
	 */
	TransmModeKind getTransmMode();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.CommunicationMedia#getTransmMode <em>Transm Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transm Mode</em>' attribute.
	 * @see org.polarsys.time4sys.marte.grm.TransmModeKind
	 * @see #getTransmMode()
	 * @generated
	 */
	void setTransmMode(TransmModeKind value);

} // CommunicationMedia
