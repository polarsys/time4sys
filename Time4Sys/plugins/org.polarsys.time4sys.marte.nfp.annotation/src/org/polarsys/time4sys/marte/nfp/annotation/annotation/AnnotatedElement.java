/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.nfp.annotation.annotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotated Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage#getAnnotatedElement()
 * @model abstract="true"
 * @generated
 */
public interface AnnotatedElement extends org.polarsys.time4sys.marte.nfp.coreelements.ModelElement {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel#getOwns <em>Owns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(AnnotatedModel)
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage#getAnnotatedElement_Owner()
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel#getOwns
	 * @model opposite="owns" transient="false"
	 * @generated
	 */
	AnnotatedModel getOwner();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(AnnotatedModel value);

} // AnnotatedElement
