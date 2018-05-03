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
package org.polarsys.time4sys.mapping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.mapping.Mapping#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.mapping.MappingPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends Link {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.mapping.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.polarsys.time4sys.mapping.MappingPackage#getMapping_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getRules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return all sublinks where source appears as value in a sources MappableArtefact
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Link> getLinksForSource(EObject source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return all sublinks where source appears as value in a sources MappableArtefact
	 * <!-- end-model-doc -->
	 * @model
	 * @generated NOT
	 */
	EList<Link> getLinksForSlice(EObject target);

} // Mapping
