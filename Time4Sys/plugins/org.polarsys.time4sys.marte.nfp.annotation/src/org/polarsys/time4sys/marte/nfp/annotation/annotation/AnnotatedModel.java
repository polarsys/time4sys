/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.nfp.annotation.annotation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotated Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel#getOwns <em>Owns</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel#getAnnotationConcern <em>Annotation Concern</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel#getOwnedRule <em>Owned Rule</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage#getAnnotatedModel()
 * @model abstract="true"
 * @generated
 */
public interface AnnotatedModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owns</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage#getAnnotatedModel_Owns()
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<AnnotatedElement> getOwns();

	/**
	 * Returns the value of the '<em><b>Annotation Concern</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.nfp.annotation.annotation.ModelingConcern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Concern</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Concern</em>' reference list.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage#getAnnotatedModel_AnnotationConcern()
	 * @model
	 * @generated
	 */
	EList<ModelingConcern> getAnnotationConcern();

	/**
	 * Returns the value of the '<em><b>Owned Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Rule</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage#getAnnotatedModel_OwnedRule()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getOwnedRule();

} // AnnotatedModel
