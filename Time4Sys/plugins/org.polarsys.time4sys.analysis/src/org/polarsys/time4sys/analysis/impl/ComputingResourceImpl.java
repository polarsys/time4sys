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
package org.polarsys.time4sys.analysis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.CommunicationResource;
import org.polarsys.time4sys.analysis.ComputingResource;
import org.polarsys.time4sys.analysis.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computing Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.ComputingResourceImpl#getTasksAffectedOn <em>Tasks Affected On</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.ComputingResourceImpl#getLinkedBy <em>Linked By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputingResourceImpl extends ResourceImpl implements ComputingResource {
	/**
	 * The cached value of the '{@link #getTasksAffectedOn() <em>Tasks Affected On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasksAffectedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasksAffectedOn;

	/**
	 * The cached value of the '{@link #getLinkedBy() <em>Linked By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationResource> linkedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputingResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.COMPUTING_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasksAffectedOn() {
		if (tasksAffectedOn == null) {
			tasksAffectedOn = new EObjectWithInverseResolvingEList<Task>(Task.class, this, AnalysisPackage.COMPUTING_RESOURCE__TASKS_AFFECTED_ON, AnalysisPackage.TASK__MAPPED_TO);
		}
		return tasksAffectedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationResource> getLinkedBy() {
		if (linkedBy == null) {
			linkedBy = new EObjectWithInverseResolvingEList.ManyInverse<CommunicationResource>(CommunicationResource.class, this, AnalysisPackage.COMPUTING_RESOURCE__LINKED_BY, AnalysisPackage.COMMUNICATION_RESOURCE__LINKS);
		}
		return linkedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.COMPUTING_RESOURCE__TASKS_AFFECTED_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasksAffectedOn()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.COMPUTING_RESOURCE__LINKED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinkedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.COMPUTING_RESOURCE__TASKS_AFFECTED_ON:
				return ((InternalEList<?>)getTasksAffectedOn()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.COMPUTING_RESOURCE__LINKED_BY:
				return ((InternalEList<?>)getLinkedBy()).basicRemove(otherEnd, msgs);
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
			case AnalysisPackage.COMPUTING_RESOURCE__TASKS_AFFECTED_ON:
				return getTasksAffectedOn();
			case AnalysisPackage.COMPUTING_RESOURCE__LINKED_BY:
				return getLinkedBy();
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
			case AnalysisPackage.COMPUTING_RESOURCE__TASKS_AFFECTED_ON:
				getTasksAffectedOn().clear();
				getTasksAffectedOn().addAll((Collection<? extends Task>)newValue);
				return;
			case AnalysisPackage.COMPUTING_RESOURCE__LINKED_BY:
				getLinkedBy().clear();
				getLinkedBy().addAll((Collection<? extends CommunicationResource>)newValue);
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
			case AnalysisPackage.COMPUTING_RESOURCE__TASKS_AFFECTED_ON:
				getTasksAffectedOn().clear();
				return;
			case AnalysisPackage.COMPUTING_RESOURCE__LINKED_BY:
				getLinkedBy().clear();
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
			case AnalysisPackage.COMPUTING_RESOURCE__TASKS_AFFECTED_ON:
				return tasksAffectedOn != null && !tasksAffectedOn.isEmpty();
			case AnalysisPackage.COMPUTING_RESOURCE__LINKED_BY:
				return linkedBy != null && !linkedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComputingResourceImpl
