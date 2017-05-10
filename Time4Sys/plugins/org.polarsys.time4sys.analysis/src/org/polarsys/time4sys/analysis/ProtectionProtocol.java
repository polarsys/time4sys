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
 * A representation of the model object '<em><b>Protection Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.ProtectionProtocol#getProtocolName <em>Protocol Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.ProtectionProtocol#getMutexes <em>Mutexes</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.ProtectionProtocol#getRequiredParameters <em>Required Parameters</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.ProtectionProtocol#getResourceParameterValue <em>Resource Parameter Value</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.ProtectionProtocol#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getProtectionProtocol()
 * @model
 * @generated
 */
public interface ProtectionProtocol extends EObject {
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
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getProtectionProtocol_ProtocolName()
	 * @model required="true"
	 * @generated
	 */
	String getProtocolName();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.ProtectionProtocol#getProtocolName <em>Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Name</em>' attribute.
	 * @see #getProtocolName()
	 * @generated
	 */
	void setProtocolName(String value);

	/**
	 * Returns the value of the '<em><b>Mutexes</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.MutualExclusionResource}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.MutualExclusionResource#getProtectedBy <em>Protected By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutexes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutexes</em>' reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getProtectionProtocol_Mutexes()
	 * @see org.polarsys.time4sys.analysis.MutualExclusionResource#getProtectedBy
	 * @model opposite="protectedBy"
	 * @generated
	 */
	EList<MutualExclusionResource> getMutexes();

	/**
	 * Returns the value of the '<em><b>Required Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.RequiredProtectionParameter}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.RequiredProtectionParameter#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Parameters</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getProtectionProtocol_RequiredParameters()
	 * @see org.polarsys.time4sys.analysis.RequiredProtectionParameter#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<RequiredProtectionParameter> getRequiredParameters();

	/**
	 * Returns the value of the '<em><b>Resource Parameter Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.ResourceProtectionParameterValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Parameter Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Parameter Value</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getProtectionProtocol_ResourceParameterValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceProtectionParameterValue> getResourceParameterValue();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getProtectionProtocols <em>Protection Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AnalyzedSystem)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getProtectionProtocol_Parent()
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getProtectionProtocols
	 * @model opposite="protectionProtocols" required="true" transient="false"
	 * @generated
	 */
	AnalyzedSystem getParent();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.ProtectionProtocol#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AnalyzedSystem value);

} // ProtectionProtocol
