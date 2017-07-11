/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lo�c Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.model.time4sys;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.trace.Trace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.Simulation#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.Simulation#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.Simulation#getTrace <em>Trace</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getSimulation()
 * @model
 * @generated
 */
public interface Simulation extends EObject {
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
	 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getSimulation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.model.time4sys.Simulation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(Mapping)
	 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getSimulation_Mapping()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Mapping getMapping();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.model.time4sys.Simulation#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(Mapping value);

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' containment reference.
	 * @see #setTrace(Trace)
	 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getSimulation_Trace()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Trace getTrace();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.model.time4sys.Simulation#getTrace <em>Trace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' containment reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(Trace value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	DesignModel getDesignModel();

} // Simulation
