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
import org.polarsys.time4sys.marte.grm.CommunicationEndPoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Interaction Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareInteractionResource#isIsIntraMemoryPartitionInteraction <em>Is Intra Memory Partition Interaction</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareInteractionResource#getWaitingQueuePolicy <em>Waiting Queue Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareInteractionResource#getWaitingQueueCapacity <em>Waiting Queue Capacity</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareInteractionResource#getWaitingPolicyElements <em>Waiting Policy Elements</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareInteractionResource()
 * @model abstract="true"
 * @generated
 */
public interface SoftwareInteractionResource extends CommunicationEndPoint, SoftwareResource {
	/**
	 * Returns the value of the '<em><b>Is Intra Memory Partition Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Intra Memory Partition Interaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Intra Memory Partition Interaction</em>' attribute.
	 * @see #setIsIntraMemoryPartitionInteraction(boolean)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareInteractionResource_IsIntraMemoryPartitionInteraction()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsIntraMemoryPartitionInteraction();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.SoftwareInteractionResource#isIsIntraMemoryPartitionInteraction <em>Is Intra Memory Partition Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Intra Memory Partition Interaction</em>' attribute.
	 * @see #isIsIntraMemoryPartitionInteraction()
	 * @generated
	 */
	void setIsIntraMemoryPartitionInteraction(boolean value);

	/**
	 * Returns the value of the '<em><b>Waiting Queue Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.srm.QueuePolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waiting Queue Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waiting Queue Policy</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.QueuePolicyKind
	 * @see #setWaitingQueuePolicy(QueuePolicyKind)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareInteractionResource_WaitingQueuePolicy()
	 * @model
	 * @generated
	 */
	QueuePolicyKind getWaitingQueuePolicy();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.SoftwareInteractionResource#getWaitingQueuePolicy <em>Waiting Queue Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waiting Queue Policy</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.QueuePolicyKind
	 * @see #getWaitingQueuePolicy()
	 * @generated
	 */
	void setWaitingQueuePolicy(QueuePolicyKind value);

	/**
	 * Returns the value of the '<em><b>Waiting Queue Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waiting Queue Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waiting Queue Capacity</em>' attribute.
	 * @see #setWaitingQueueCapacity(int)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareInteractionResource_WaitingQueueCapacity()
	 * @model
	 * @generated
	 */
	int getWaitingQueueCapacity();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.SoftwareInteractionResource#getWaitingQueueCapacity <em>Waiting Queue Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waiting Queue Capacity</em>' attribute.
	 * @see #getWaitingQueueCapacity()
	 * @generated
	 */
	void setWaitingQueueCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Waiting Policy Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waiting Policy Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waiting Policy Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareInteractionResource_WaitingPolicyElements()
	 * @model
	 * @generated
	 */
	EList<String> getWaitingPolicyElements();

} // SoftwareInteractionResource
