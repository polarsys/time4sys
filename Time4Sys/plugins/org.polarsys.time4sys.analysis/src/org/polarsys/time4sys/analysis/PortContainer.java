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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.PortContainer#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.PortContainer#getBehaviorKind <em>Behavior Kind</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getPortContainer()
 * @model abstract="true"
 * @generated
 */
public interface PortContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.Port}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.Port#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getPortContainer_Ports()
	 * @see org.polarsys.time4sys.analysis.Port#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Behavior Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.analysis.InputJoinBehaviorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Kind</em>' attribute.
	 * @see org.polarsys.time4sys.analysis.InputJoinBehaviorKind
	 * @see #setBehaviorKind(InputJoinBehaviorKind)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getPortContainer_BehaviorKind()
	 * @model
	 * @generated
	 */
	InputJoinBehaviorKind getBehaviorKind();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.PortContainer#getBehaviorKind <em>Behavior Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Kind</em>' attribute.
	 * @see org.polarsys.time4sys.analysis.InputJoinBehaviorKind
	 * @see #getBehaviorKind()
	 * @generated
	 */
	void setBehaviorKind(InputJoinBehaviorKind value);

} // PortContainer
