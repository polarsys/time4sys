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
import org.polarsys.time4sys.marte.grm.ResourceService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interrupt Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.InterruptResource#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.InterruptResource#isIsMaskable <em>Is Maskable</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.InterruptResource#getRoutineConnectServices <em>Routine Connect Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.InterruptResource#getRoutineDisconnectServices <em>Routine Disconnect Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.InterruptResource#getMaskElements <em>Mask Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.InterruptResource#getVectorElements <em>Vector Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.InterruptResource#getIsrEntryPoints <em>Isr Entry Points</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getInterruptResource()
 * @model
 * @generated
 */
public interface InterruptResource extends SoftwareConcurrentResource {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.srm.InterruptKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.InterruptKind
	 * @see #setKind(InterruptKind)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getInterruptResource_Kind()
	 * @model required="true"
	 * @generated
	 */
	InterruptKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.InterruptResource#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.InterruptKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(InterruptKind value);

	/**
	 * Returns the value of the '<em><b>Is Maskable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Maskable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Maskable</em>' attribute.
	 * @see #setIsMaskable(boolean)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getInterruptResource_IsMaskable()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMaskable();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.InterruptResource#isIsMaskable <em>Is Maskable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Maskable</em>' attribute.
	 * @see #isIsMaskable()
	 * @generated
	 */
	void setIsMaskable(boolean value);

	/**
	 * Returns the value of the '<em><b>Routine Connect Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routine Connect Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routine Connect Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getInterruptResource_RoutineConnectServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getRoutineConnectServices();

	/**
	 * Returns the value of the '<em><b>Routine Disconnect Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routine Disconnect Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routine Disconnect Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getInterruptResource_RoutineDisconnectServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getRoutineDisconnectServices();

	/**
	 * Returns the value of the '<em><b>Mask Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getInterruptResource_MaskElements()
	 * @model
	 * @generated
	 */
	EList<String> getMaskElements();

	/**
	 * Returns the value of the '<em><b>Vector Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Elements</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getInterruptResource_VectorElements()
	 * @model
	 * @generated
	 */
	EList<String> getVectorElements();

	/**
	 * Returns the value of the '<em><b>Isr Entry Points</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isr Entry Points</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isr Entry Points</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getInterruptResource_IsrEntryPoints()
	 * @model
	 * @generated
	 */
	EList<String> getIsrEntryPoints();

} // InterruptResource
