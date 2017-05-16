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
package org.polarsys.time4sys.design.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.design.DesignPackage;
import org.polarsys.time4sys.marte.gqam.EndToEndFlow;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.WorkloadBehavior;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.ResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.design.impl.DesignModelImpl#getWorkloadBehavior <em>Workload Behavior</em>}</li>
 *   <li>{@link org.polarsys.time4sys.design.impl.DesignModelImpl#getResourcePackage <em>Resource Package</em>}</li>
 *   <li>{@link org.polarsys.time4sys.design.impl.DesignModelImpl#getEndToEndFlows <em>End To End Flows</em>}</li>
 *   <li>{@link org.polarsys.time4sys.design.impl.DesignModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignModelImpl extends MinimalEObjectImpl.Container implements DesignModel {
	/**
	 * The cached value of the '{@link #getWorkloadBehavior() <em>Workload Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkloadBehavior()
	 * @generated
	 * @ordered
	 */
	protected WorkloadBehavior workloadBehavior;

	/**
	 * The cached value of the '{@link #getResourcePackage() <em>Resource Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcePackage()
	 * @generated
	 * @ordered
	 */
	protected ResourcePackage resourcePackage;

	/**
	 * The cached value of the '{@link #getEndToEndFlows() <em>End To End Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndToEndFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<EndToEndFlow> endToEndFlows;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DesignModelImpl() {
		super();
		setResourcePackage(GrmFactory.eINSTANCE.createResourcePackage());
		setWorkloadBehavior(GqamFactory.eINSTANCE.createWorkloadBehavior());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DesignPackage.Literals.DESIGN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadBehavior getWorkloadBehavior() {
		return workloadBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkloadBehavior(WorkloadBehavior newWorkloadBehavior, NotificationChain msgs) {
		WorkloadBehavior oldWorkloadBehavior = workloadBehavior;
		workloadBehavior = newWorkloadBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR, oldWorkloadBehavior, newWorkloadBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkloadBehavior(WorkloadBehavior newWorkloadBehavior) {
		if (newWorkloadBehavior != workloadBehavior) {
			NotificationChain msgs = null;
			if (workloadBehavior != null)
				msgs = ((InternalEObject)workloadBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR, null, msgs);
			if (newWorkloadBehavior != null)
				msgs = ((InternalEObject)newWorkloadBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR, null, msgs);
			msgs = basicSetWorkloadBehavior(newWorkloadBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR, newWorkloadBehavior, newWorkloadBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePackage getResourcePackage() {
		return resourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourcePackage(ResourcePackage newResourcePackage, NotificationChain msgs) {
		ResourcePackage oldResourcePackage = resourcePackage;
		resourcePackage = newResourcePackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE, oldResourcePackage, newResourcePackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourcePackage(ResourcePackage newResourcePackage) {
		if (newResourcePackage != resourcePackage) {
			NotificationChain msgs = null;
			if (resourcePackage != null)
				msgs = ((InternalEObject)resourcePackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE, null, msgs);
			if (newResourcePackage != null)
				msgs = ((InternalEObject)newResourcePackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE, null, msgs);
			msgs = basicSetResourcePackage(newResourcePackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE, newResourcePackage, newResourcePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndToEndFlow> getEndToEndFlows() {
		if (endToEndFlows == null) {
			endToEndFlows = new EObjectContainmentEList<EndToEndFlow>(EndToEndFlow.class, this, DesignPackage.DESIGN_MODEL__END_TO_END_FLOWS);
		}
		return endToEndFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPackage.DESIGN_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR:
				return basicSetWorkloadBehavior(null, msgs);
			case DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE:
				return basicSetResourcePackage(null, msgs);
			case DesignPackage.DESIGN_MODEL__END_TO_END_FLOWS:
				return ((InternalEList<?>)getEndToEndFlows()).basicRemove(otherEnd, msgs);
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
			case DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR:
				return getWorkloadBehavior();
			case DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE:
				return getResourcePackage();
			case DesignPackage.DESIGN_MODEL__END_TO_END_FLOWS:
				return getEndToEndFlows();
			case DesignPackage.DESIGN_MODEL__NAME:
				return getName();
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
			case DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR:
				setWorkloadBehavior((WorkloadBehavior)newValue);
				return;
			case DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE:
				setResourcePackage((ResourcePackage)newValue);
				return;
			case DesignPackage.DESIGN_MODEL__END_TO_END_FLOWS:
				getEndToEndFlows().clear();
				getEndToEndFlows().addAll((Collection<? extends EndToEndFlow>)newValue);
				return;
			case DesignPackage.DESIGN_MODEL__NAME:
				setName((String)newValue);
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
			case DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR:
				setWorkloadBehavior((WorkloadBehavior)null);
				return;
			case DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE:
				setResourcePackage((ResourcePackage)null);
				return;
			case DesignPackage.DESIGN_MODEL__END_TO_END_FLOWS:
				getEndToEndFlows().clear();
				return;
			case DesignPackage.DESIGN_MODEL__NAME:
				setName(NAME_EDEFAULT);
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
			case DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR:
				return workloadBehavior != null;
			case DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE:
				return resourcePackage != null;
			case DesignPackage.DESIGN_MODEL__END_TO_END_FLOWS:
				return endToEndFlows != null && !endToEndFlows.isEmpty();
			case DesignPackage.DESIGN_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DesignModelImpl
