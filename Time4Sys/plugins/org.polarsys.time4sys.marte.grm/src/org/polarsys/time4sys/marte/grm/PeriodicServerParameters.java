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
package org.polarsys.time4sys.marte.grm;

import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic Server Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.PeriodicServerParameters#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.PeriodicServerParameters#getBackgroundPriority <em>Background Priority</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.PeriodicServerParameters#getInitialBudget <em>Initial Budget</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.PeriodicServerParameters#getReplenishPeriod <em>Replenish Period</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.PeriodicServerParameters#getMaxPendingReplenish <em>Max Pending Replenish</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getPeriodicServerParameters()
 * @model
 * @generated
 */
public interface PeriodicServerParameters extends FixedPriorityParameters {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"Undef"</code>.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.grm.PeriodicServerKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * indicates the type of periodic server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.marte.grm.PeriodicServerKind
	 * @see #setKind(PeriodicServerKind)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getPeriodicServerParameters_Kind()
	 * @model default="Undef"
	 * @generated
	 */
	PeriodicServerKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.PeriodicServerParameters#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.marte.grm.PeriodicServerKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PeriodicServerKind value);

	/**
	 * Returns the value of the '<em><b>Background Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * is the priority used to run the server when it is in the background.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Background Priority</em>' attribute.
	 * @see #setBackgroundPriority(int)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getPeriodicServerParameters_BackgroundPriority()
	 * @model
	 * @generated
	 */
	int getBackgroundPriority();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.PeriodicServerParameters#getBackgroundPriority <em>Background Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Priority</em>' attribute.
	 * @see #getBackgroundPriority()
	 * @generated
	 */
	void setBackgroundPriority(int value);

	/**
	 * Returns the value of the '<em><b>Initial Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * is the full ammount of execution time available for a cycle of the server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Budget</em>' attribute.
	 * @see #setInitialBudget(Duration)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getPeriodicServerParameters_InitialBudget()
	 * @model dataType="org.polarsys.time4sys.marte.grm.NFP_Duration"
	 * @generated
	 */
	Duration getInitialBudget();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.PeriodicServerParameters#getInitialBudget <em>Initial Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Budget</em>' attribute.
	 * @see #getInitialBudget()
	 * @generated
	 */
	void setInitialBudget(Duration value);

	/**
	 * Returns the value of the '<em><b>Replenish Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * is the replenishment period defined for the server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replenish Period</em>' attribute.
	 * @see #setReplenishPeriod(Duration)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getPeriodicServerParameters_ReplenishPeriod()
	 * @model dataType="org.polarsys.time4sys.marte.grm.NFP_Duration"
	 * @generated
	 */
	Duration getReplenishPeriod();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.PeriodicServerParameters#getReplenishPeriod <em>Replenish Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replenish Period</em>' attribute.
	 * @see #getReplenishPeriod()
	 * @generated
	 */
	void setReplenishPeriod(Duration value);

	/**
	 * Returns the value of the '<em><b>Max Pending Replenish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * is the maximum number of replenishments that can be stored in the queue of pending replenishments, it limits the number of times a schedulable resource may block itself in the time frame of a cycle period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Pending Replenish</em>' attribute.
	 * @see #setMaxPendingReplenish(int)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getPeriodicServerParameters_MaxPendingReplenish()
	 * @model
	 * @generated
	 */
	int getMaxPendingReplenish();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.PeriodicServerParameters#getMaxPendingReplenish <em>Max Pending Replenish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Pending Replenish</em>' attribute.
	 * @see #getMaxPendingReplenish()
	 * @generated
	 */
	void setMaxPendingReplenish(int value);

} // PeriodicServerParameters
