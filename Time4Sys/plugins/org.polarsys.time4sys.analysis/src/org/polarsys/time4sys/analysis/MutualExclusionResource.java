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
 * A representation of the model object '<em><b>Mutual Exclusion Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.MutualExclusionResource#getElements <em>Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.MutualExclusionResource#getProtectionParameters <em>Protection Parameters</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.MutualExclusionResource#getProtectedBy <em>Protected By</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.MutualExclusionResource#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getMutualExclusionResource()
 * @model
 * @generated
 */
public interface MutualExclusionResource extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.SynchronizableElement}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.SynchronizableElement#getLockedMutexes <em>Locked Mutexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getMutualExclusionResource_Elements()
	 * @see org.polarsys.time4sys.analysis.SynchronizableElement#getLockedMutexes
	 * @model opposite="lockedMutexes"
	 * @generated
	 */
	EList<SynchronizableElement> getElements();

	/**
	 * Returns the value of the '<em><b>Protection Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.ProtectionParameterValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Parameters</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getMutualExclusionResource_ProtectionParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProtectionParameterValue> getProtectionParameters();

	/**
	 * Returns the value of the '<em><b>Protected By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.ProtectionProtocol#getMutexes <em>Mutexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protected By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected By</em>' reference.
	 * @see #setProtectedBy(ProtectionProtocol)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getMutualExclusionResource_ProtectedBy()
	 * @see org.polarsys.time4sys.analysis.ProtectionProtocol#getMutexes
	 * @model opposite="mutexes" required="true"
	 * @generated
	 */
	ProtectionProtocol getProtectedBy();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.MutualExclusionResource#getProtectedBy <em>Protected By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected By</em>' reference.
	 * @see #getProtectedBy()
	 * @generated
	 */
	void setProtectedBy(ProtectionProtocol value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getMutexes <em>Mutexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AnalyzedSystem)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getMutualExclusionResource_Parent()
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getMutexes
	 * @model opposite="mutexes" required="true" transient="false"
	 * @generated
	 */
	AnalyzedSystem getParent();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.MutualExclusionResource#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AnalyzedSystem value);

} // MutualExclusionResource
