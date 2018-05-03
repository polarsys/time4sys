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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Artefact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.mapping.ResourceArtefact#getResource <em>Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.mapping.ResourceArtefact#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.mapping.MappingPackage#getResourceArtefact()
 * @model
 * @generated
 */
public interface ResourceArtefact extends MappableArtefact {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(Resource)
	 * @see org.polarsys.time4sys.mapping.MappingPackage#getResourceArtefact_Resource()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.mapping.ResourceArtefact#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(URI)
	 * @see org.polarsys.time4sys.mapping.MappingPackage#getResourceArtefact_Uri()
	 * @model dataType="org.polarsys.time4sys.mapping.URI" required="true"
	 * @generated
	 */
	URI getUri();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.mapping.ResourceArtefact#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(URI value);

} // ResourceArtefact
