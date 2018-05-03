/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work and others.
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
import org.polarsys.time4sys.marte.grm.MutualExclusionResource;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Mutual Exclusion Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getConcurrentAccessProtocol <em>Concurrent Access Protocol</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getAcquireServices <em>Acquire Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getReleaseServices <em>Release Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getAccessTokenElements <em>Access Token Elements</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareMutualExclusionResource()
 * @model
 * @generated
 */
public interface SoftwareMutualExclusionResource extends SoftwareSynchronizationResource, MutualExclusionResource {
	/**
	 * Returns the value of the '<em><b>Concurrent Access Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.srm.ConcurrentAccesProtocolKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrent Access Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrent Access Protocol</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.ConcurrentAccesProtocolKind
	 * @see #setConcurrentAccessProtocol(ConcurrentAccesProtocolKind)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareMutualExclusionResource_ConcurrentAccessProtocol()
	 * @model
	 * @generated
	 */
	ConcurrentAccesProtocolKind getConcurrentAccessProtocol();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getConcurrentAccessProtocol <em>Concurrent Access Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrent Access Protocol</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.ConcurrentAccesProtocolKind
	 * @see #getConcurrentAccessProtocol()
	 * @generated
	 */
	void setConcurrentAccessProtocol(ConcurrentAccesProtocolKind value);

	/**
	 * Returns the value of the '<em><b>Mechanism</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.srm.MutualExclusionResourceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mechanism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanism</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.MutualExclusionResourceKind
	 * @see #setMechanism(MutualExclusionResourceKind)
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareMutualExclusionResource_Mechanism()
	 * @model
	 * @generated
	 */
	MutualExclusionResourceKind getMechanism();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource#getMechanism <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanism</em>' attribute.
	 * @see org.polarsys.time4sys.marte.srm.MutualExclusionResourceKind
	 * @see #getMechanism()
	 * @generated
	 */
	void setMechanism(MutualExclusionResourceKind value);

	/**
	 * Returns the value of the '<em><b>Acquire Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acquire Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acquire Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareMutualExclusionResource_AcquireServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getAcquireServices();

	/**
	 * Returns the value of the '<em><b>Release Services</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Services</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareMutualExclusionResource_ReleaseServices()
	 * @model
	 * @generated
	 */
	EList<ResourceService> getReleaseServices();

	/**
	 * Returns the value of the '<em><b>Access Token Elements</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.nfp.coreelements.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Token Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Token Elements</em>' reference list.
	 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getSoftwareMutualExclusionResource_AccessTokenElements()
	 * @model
	 * @generated
	 */
	EList<ModelElement> getAccessTokenElements();

} // SoftwareMutualExclusionResource
