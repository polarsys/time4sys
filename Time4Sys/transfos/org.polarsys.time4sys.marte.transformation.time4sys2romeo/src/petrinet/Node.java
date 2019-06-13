/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Thanh Dat NGUYEN- initial API and implementation
 *
 *******************************************************************************/
/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.zest.core.widgets.GraphNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Node#getOutputRel <em>Output Rel</em>}</li>
 *   <li>{@link petrinet.Node#getInputRel <em>Input Rel</em>}</li>
 *   <li>{@link petrinet.Node#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.Node#getId <em>Id</em>}</li>
 *   <li>{@link petrinet.Node#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Rel</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Connection}.
	 * It is bidirectional and its opposite is '{@link petrinet.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Rel</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Rel</em>' reference list.
	 * @see petrinet.PetrinetPackage#getNode_OutputRel()
	 * @see petrinet.Connection#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Connection> getOutputRel();

	/**
	 * Returns the value of the '<em><b>Input Rel</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Connection}.
	 * It is bidirectional and its opposite is '{@link petrinet.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Rel</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Rel</em>' reference list.
	 * @see petrinet.PetrinetPackage#getNode_InputRel()
	 * @see petrinet.Connection#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Connection> getInputRel();

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
	 * @see petrinet.PetrinetPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see petrinet.PetrinetPackage#getNode_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link petrinet.Node#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(GraphNode)
	 * @see petrinet.PetrinetPackage#getNode_Image()
	 * @model dataType="petrinet.GraphNode" required="true"
	 * @generated
	 */
	GraphNode getImage();

	/**
	 * Sets the value of the '{@link petrinet.Node#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(GraphNode value);

} // Node
