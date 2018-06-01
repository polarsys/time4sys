/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *      Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.odesign;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utilization Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.odesign.UtilizationStat#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link org.polarsys.time4sys.odesign.UtilizationStat#isNotSchedulable <em>Not Schedulable</em>}</li>
 *   <li>{@link org.polarsys.time4sys.odesign.UtilizationStat#isMaybeSchedulable <em>Maybe Schedulable</em>}</li>
 *   <li>{@link org.polarsys.time4sys.odesign.UtilizationStat#isIsSchedulable <em>Is Schedulable</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.odesign.OdesignPackage#getUtilizationStat()
 * @model
 * @generated
 */
public interface UtilizationStat extends EObject {
	/**
	 * Returns the value of the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilization</em>' attribute.
	 * @see #setUtilization(double)
	 * @see org.polarsys.time4sys.odesign.OdesignPackage#getUtilizationStat_Utilization()
	 * @model required="true"
	 * @generated
	 */
	double getUtilization();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.odesign.UtilizationStat#getUtilization <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization</em>' attribute.
	 * @see #getUtilization()
	 * @generated
	 */
	void setUtilization(double value);

	/**
	 * Returns the value of the '<em><b>Not Schedulable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Schedulable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Schedulable</em>' attribute.
	 * @see #setNotSchedulable(boolean)
	 * @see org.polarsys.time4sys.odesign.OdesignPackage#getUtilizationStat_NotSchedulable()
	 * @model required="true"
	 * @generated
	 */
	boolean isNotSchedulable();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.odesign.UtilizationStat#isNotSchedulable <em>Not Schedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Schedulable</em>' attribute.
	 * @see #isNotSchedulable()
	 * @generated
	 */
	void setNotSchedulable(boolean value);

	/**
	 * Returns the value of the '<em><b>Maybe Schedulable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maybe Schedulable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maybe Schedulable</em>' attribute.
	 * @see #setMaybeSchedulable(boolean)
	 * @see org.polarsys.time4sys.odesign.OdesignPackage#getUtilizationStat_MaybeSchedulable()
	 * @model required="true"
	 * @generated
	 */
	boolean isMaybeSchedulable();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.odesign.UtilizationStat#isMaybeSchedulable <em>Maybe Schedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maybe Schedulable</em>' attribute.
	 * @see #isMaybeSchedulable()
	 * @generated
	 */
	void setMaybeSchedulable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Schedulable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Schedulable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Schedulable</em>' attribute.
	 * @see #setIsSchedulable(boolean)
	 * @see org.polarsys.time4sys.odesign.OdesignPackage#getUtilizationStat_IsSchedulable()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsSchedulable();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.odesign.UtilizationStat#isIsSchedulable <em>Is Schedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Schedulable</em>' attribute.
	 * @see #isIsSchedulable()
	 * @generated
	 */
	void setIsSchedulable(boolean value);

} // UtilizationStat
