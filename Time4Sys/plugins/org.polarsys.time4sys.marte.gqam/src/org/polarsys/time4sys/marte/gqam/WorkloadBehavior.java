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
package org.polarsys.time4sys.marte.gqam;

import org.eclipse.emf.common.util.EList;
import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.WorkloadBehavior#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.WorkloadBehavior#getDemand <em>Demand</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.WorkloadBehavior#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getWorkloadBehavior()
 * @model
 * @generated
 */
public interface WorkloadBehavior extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.BehaviorScenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getWorkloadBehavior_Behavior()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BehaviorScenario> getBehavior();

	/**
	 * Returns the value of the '<em><b>Demand</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.WorkloadEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getWorkloadBehavior_Demand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WorkloadEvent> getDemand();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getWorkloadBehavior_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

} // WorkloadBehavior
