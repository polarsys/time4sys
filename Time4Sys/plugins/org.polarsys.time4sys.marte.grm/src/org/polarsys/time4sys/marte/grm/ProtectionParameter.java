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
package org.polarsys.time4sys.marte.grm;

import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protection Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.ProtectionParameter#getPriorityCeiling <em>Priority Ceiling</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.ProtectionParameter#getPreemptionLevel <em>Preemption Level</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getProtectionParameter()
 * @model
 * @generated
 */
public interface ProtectionParameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Priority Ceiling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority Ceiling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Ceiling</em>' attribute.
	 * @see #setPriorityCeiling(int)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getProtectionParameter_PriorityCeiling()
	 * @model
	 * @generated
	 */
	int getPriorityCeiling();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.ProtectionParameter#getPriorityCeiling <em>Priority Ceiling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Ceiling</em>' attribute.
	 * @see #getPriorityCeiling()
	 * @generated
	 */
	void setPriorityCeiling(int value);

	/**
	 * Returns the value of the '<em><b>Preemption Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preemption Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preemption Level</em>' attribute.
	 * @see #setPreemptionLevel(int)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getProtectionParameter_PreemptionLevel()
	 * @model
	 * @generated
	 */
	int getPreemptionLevel();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.ProtectionParameter#getPreemptionLevel <em>Preemption Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preemption Level</em>' attribute.
	 * @see #getPreemptionLevel()
	 * @generated
	 */
	void setPreemptionLevel(int value);

} // ProtectionParameter
