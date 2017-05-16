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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.ResultContainer#getAnalyzedSystem <em>Analyzed System</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getResultContainer()
 * @model
 * @generated
 */
public interface ResultContainer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Analyzed System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.AnalyzedSystem#getResultContainers <em>Result Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analyzed System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analyzed System</em>' container reference.
	 * @see #setAnalyzedSystem(AnalyzedSystem)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getResultContainer_AnalyzedSystem()
	 * @see org.polarsys.time4sys.analysis.AnalyzedSystem#getResultContainers
	 * @model opposite="resultContainers" transient="false"
	 * @generated
	 */
	AnalyzedSystem getAnalyzedSystem();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.ResultContainer#getAnalyzedSystem <em>Analyzed System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analyzed System</em>' container reference.
	 * @see #getAnalyzedSystem()
	 * @generated
	 */
	void setAnalyzedSystem(AnalyzedSystem value);

} // ResultContainer
