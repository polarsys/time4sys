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
package org.polarsys.time4sys.marte.gqam;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrival Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern#getParent <em>Parent</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern#getJitter <em>Jitter</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern#getReference <em>Reference</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern#isIsControl <em>Is Control</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getArrivalPattern()
 * @model abstract="true"
 * @generated
 */
public interface ArrivalPattern extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.gqam.WorkloadEvent#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(WorkloadEvent)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getArrivalPattern_Parent()
	 * @see org.polarsys.time4sys.marte.gqam.WorkloadEvent#getPattern
	 * @model opposite="pattern" transient="false"
	 * @generated
	 */
	WorkloadEvent getParent();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(WorkloadEvent value);

	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitter</em>' attribute.
	 * @see #setJitter(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getArrivalPattern_Jitter()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration"
	 * @generated
	 */
	Duration getJitter();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern#getJitter <em>Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' attribute.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(Duration value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #setPhase(Duration)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getArrivalPattern_Phase()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration"
	 * @generated
	 */
	Duration getPhase();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(Duration value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Reference)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getArrivalPattern_Reference()
	 * @model
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Is Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Control</em>' attribute.
	 * @see #setIsControl(boolean)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getArrivalPattern_IsControl()
	 * @model
	 * @generated
	 */
	boolean isIsControl();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern#isIsControl <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Control</em>' attribute.
	 * @see #isIsControl()
	 * @generated
	 */
	void setIsControl(boolean value);

} // ArrivalPattern
