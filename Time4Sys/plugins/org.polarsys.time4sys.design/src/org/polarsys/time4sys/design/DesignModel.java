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
package org.polarsys.time4sys.design;

import org.eclipse.emf.common.util.EList;
import org.polarsys.time4sys.marte.gqam.WorkloadBehavior;
import org.polarsys.time4sys.marte.grm.ResourcePackage;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.design.DesignModel#getWorkloadBehavior <em>Workload Behavior</em>}</li>
 *   <li>{@link org.polarsys.time4sys.design.DesignModel#getResourcePackage <em>Resource Package</em>}</li>
 *   <li>{@link org.polarsys.time4sys.design.DesignModel#getEndToEndFlows <em>End To End Flows</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.design.DesignPackage#getDesignModel()
 * @model
 * @generated
 */
public interface DesignModel extends org.polarsys.time4sys.marte.nfp.coreelements.Package, AnnotatedModel {
	/**
	 * Returns the value of the '<em><b>Workload Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload Behavior</em>' containment reference.
	 * @see #setWorkloadBehavior(WorkloadBehavior)
	 * @see org.polarsys.time4sys.design.DesignPackage#getDesignModel_WorkloadBehavior()
	 * @model containment="true"
	 * @generated
	 */
	WorkloadBehavior getWorkloadBehavior();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.design.DesignModel#getWorkloadBehavior <em>Workload Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workload Behavior</em>' containment reference.
	 * @see #getWorkloadBehavior()
	 * @generated
	 */
	void setWorkloadBehavior(WorkloadBehavior value);

	/**
	 * Returns the value of the '<em><b>Resource Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Package</em>' containment reference.
	 * @see #setResourcePackage(ResourcePackage)
	 * @see org.polarsys.time4sys.design.DesignPackage#getDesignModel_ResourcePackage()
	 * @model containment="true"
	 * @generated
	 */
	ResourcePackage getResourcePackage();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.design.DesignModel#getResourcePackage <em>Resource Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Package</em>' containment reference.
	 * @see #getResourcePackage()
	 * @generated
	 */
	void setResourcePackage(ResourcePackage value);

	/**
	 * Returns the value of the '<em><b>End To End Flows</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.sam.EndToEndFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End To End Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End To End Flows</em>' containment reference list.
	 * @see org.polarsys.time4sys.design.DesignPackage#getDesignModel_EndToEndFlows()
	 * @model containment="true"
	 * @generated
	 */
	EList<EndToEndFlow> getEndToEndFlows();

} // DesignModel
