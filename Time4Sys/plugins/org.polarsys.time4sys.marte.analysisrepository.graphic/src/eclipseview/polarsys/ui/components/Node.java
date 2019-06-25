/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Yassine OUHAMMOU- initial API and implementation
 *
 *******************************************************************************/
/**
 */
package eclipseview.polarsys.ui.components;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipseview.polarsys.ui.components.Node#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link eclipseview.polarsys.ui.components.Node#getRefId <em>Ref Id</em>}</li>
 * </ul>
 *
 * @see eclipseview.polarsys.ui.components.GraphModelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends GraphComponent {

	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' attribute.
	 * The literals are from the enumeration {@link eclipseview.polarsys.ui.components.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' attribute.
	 * @see eclipseview.polarsys.ui.components.Color
	 * @see #setTextColor(Color)
	 * @see eclipseview.polarsys.ui.components.GraphModelPackage#getNode_TextColor()
	 * @model
	 * @generated
	 */
	Color getTextColor();

	/**
	 * Sets the value of the '{@link eclipseview.polarsys.ui.components.Node#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' attribute.
	 * @see eclipseview.polarsys.ui.components.Color
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(Color value);

	/**
	 * Returns the value of the '<em><b>Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Id</em>' attribute.
	 * @see #setRefId(int)
	 * @see eclipseview.polarsys.ui.components.GraphModelPackage#getNode_RefId()
	 * @model
	 * @generated
	 */
	int getRefId();

	/**
	 * Sets the value of the '{@link eclipseview.polarsys.ui.components.Node#getRefId <em>Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Id</em>' attribute.
	 * @see #getRefId()
	 * @generated
	 */
	void setRefId(int value);
} // Node
