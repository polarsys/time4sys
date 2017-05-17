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
package org.polarsys.time4sys.model.time4sys;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.analysis.AnalyzedSystem;

import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.trace.Trace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.Project#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.Project#getDesign <em>Design</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.Project#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.Project#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.Project#getTraces <em>Traces</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.Project#getDerivations <em>Derivations</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.Project#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.Project#getSimulations <em>Simulations</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis</em>' containment reference.
	 * @see #setAnalysis(AnalyzedSystem)
	 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getProject_Analysis()
	 * @model containment="true"
	 * @generated
	 */
	AnalyzedSystem getAnalysis();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.model.time4sys.Project#getAnalysis <em>Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis</em>' containment reference.
	 * @see #getAnalysis()
	 * @generated
	 */
	void setAnalysis(AnalyzedSystem value);

	/**
	 * Returns the value of the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' containment reference.
	 * @see #setDesign(DesignModel)
	 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getProject_Design()
	 * @model containment="true"
	 * @generated
	 */
	DesignModel getDesign();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.model.time4sys.Project#getDesign <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' containment reference.
	 * @see #getDesign()
	 * @generated
	 */
	void setDesign(DesignModel value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.model.time4sys.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.mapping.Mapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getProject_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.trace.Trace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getProject_Traces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trace> getTraces();

	/**
	 * Returns the value of the '<em><b>Derivations</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.design.DesignModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivations</em>' containment reference list.
	 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getProject_Derivations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DesignModel> getDerivations();

	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.model.time4sys.Transformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' containment reference list.
	 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getProject_Transformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformation> getTransformations();

	/**
	 * Returns the value of the '<em><b>Simulations</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.model.time4sys.Simulation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulations</em>' containment reference list.
	 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getProject_Simulations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Simulation> getSimulations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Deprecated
	 * <!-- end-model-doc -->
	 * @model required="true" overrideRequired="true"
	 * @generated
	 */
	AnalyzedSystem deriveAnalyzedSystem(boolean override);

} // Project
