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
package org.polarsys.time4sys.marte.gqam.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.Reference;
import org.polarsys.time4sys.marte.gqam.WorkloadBehavior;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.grm.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.WorkloadBehaviorImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.WorkloadBehaviorImpl#getDemand <em>Demand</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.WorkloadBehaviorImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkloadBehaviorImpl extends NamedElementImpl implements WorkloadBehavior {
	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorScenario> behavior;

	/**
	 * The cached value of the '{@link #getDemand() <em>Demand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemand()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkloadEvent> demand;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> references;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.WORKLOAD_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorScenario> getBehavior() {
		if (behavior == null) {
			behavior = new EObjectContainmentEList<BehaviorScenario>(BehaviorScenario.class, this, GqamPackage.WORKLOAD_BEHAVIOR__BEHAVIOR);
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkloadEvent> getDemand() {
		if (demand == null) {
			demand = new EObjectContainmentEList<WorkloadEvent>(WorkloadEvent.class, this, GqamPackage.WORKLOAD_BEHAVIOR__DEMAND);
		}
		return demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<Reference>(Reference.class, this, GqamPackage.WORKLOAD_BEHAVIOR__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GqamPackage.WORKLOAD_BEHAVIOR__BEHAVIOR:
				return ((InternalEList<?>)getBehavior()).basicRemove(otherEnd, msgs);
			case GqamPackage.WORKLOAD_BEHAVIOR__DEMAND:
				return ((InternalEList<?>)getDemand()).basicRemove(otherEnd, msgs);
			case GqamPackage.WORKLOAD_BEHAVIOR__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GqamPackage.WORKLOAD_BEHAVIOR__BEHAVIOR:
				return getBehavior();
			case GqamPackage.WORKLOAD_BEHAVIOR__DEMAND:
				return getDemand();
			case GqamPackage.WORKLOAD_BEHAVIOR__REFERENCES:
				return getReferences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GqamPackage.WORKLOAD_BEHAVIOR__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends BehaviorScenario>)newValue);
				return;
			case GqamPackage.WORKLOAD_BEHAVIOR__DEMAND:
				getDemand().clear();
				getDemand().addAll((Collection<? extends WorkloadEvent>)newValue);
				return;
			case GqamPackage.WORKLOAD_BEHAVIOR__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GqamPackage.WORKLOAD_BEHAVIOR__BEHAVIOR:
				getBehavior().clear();
				return;
			case GqamPackage.WORKLOAD_BEHAVIOR__DEMAND:
				getDemand().clear();
				return;
			case GqamPackage.WORKLOAD_BEHAVIOR__REFERENCES:
				getReferences().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GqamPackage.WORKLOAD_BEHAVIOR__BEHAVIOR:
				return behavior != null && !behavior.isEmpty();
			case GqamPackage.WORKLOAD_BEHAVIOR__DEMAND:
				return demand != null && !demand.isEmpty();
			case GqamPackage.WORKLOAD_BEHAVIOR__REFERENCES:
				return references != null && !references.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkloadBehaviorImpl
