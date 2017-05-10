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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.CommunicationResource#getLinks <em>Links</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.CommunicationResource#getCommunicationsAffectedOn <em>Communications Affected On</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.CommunicationResource#getProtocolName <em>Protocol Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.CommunicationResource#getBandwidth <em>Bandwidth</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getCommunicationResource()
 * @model
 * @generated
 */
public interface CommunicationResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.ComputingResource}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.ComputingResource#getLinkedBy <em>Linked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getCommunicationResource_Links()
	 * @see org.polarsys.time4sys.analysis.ComputingResource#getLinkedBy
	 * @model opposite="linkedBy"
	 * @generated
	 */
	EList<ComputingResource> getLinks();

	/**
	 * Returns the value of the '<em><b>Communications Affected On</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.Communication}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.Communication#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communications Affected On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communications Affected On</em>' reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getCommunicationResource_CommunicationsAffectedOn()
	 * @see org.polarsys.time4sys.analysis.Communication#getBus
	 * @model opposite="bus"
	 * @generated
	 */
	EList<Communication> getCommunicationsAffectedOn();

	/**
	 * Returns the value of the '<em><b>Protocol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Name</em>' attribute.
	 * @see #setProtocolName(String)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getCommunicationResource_ProtocolName()
	 * @model required="true"
	 * @generated
	 */
	String getProtocolName();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.CommunicationResource#getProtocolName <em>Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Name</em>' attribute.
	 * @see #getProtocolName()
	 * @generated
	 */
	void setProtocolName(String value);

	/**
	 * Returns the value of the '<em><b>Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bandwidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bandwidth</em>' attribute.
	 * @see #setBandwidth(double)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getCommunicationResource_Bandwidth()
	 * @model
	 * @generated
	 */
	double getBandwidth();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.CommunicationResource#getBandwidth <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' attribute.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(double value);

} // CommunicationResource
