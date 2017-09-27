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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.coreelements.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.BehaviorScenarioImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.BehaviorScenarioImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.BehaviorScenarioImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.BehaviorScenarioImpl#getParentStep <em>Parent Step</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.BehaviorScenarioImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.BehaviorScenarioImpl#getRespTime <em>Resp Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.BehaviorScenarioImpl#getBestCET <em>Best CET</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.BehaviorScenarioImpl#getWorstCET <em>Worst CET</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorScenarioImpl extends NamedElementImpl implements BehaviorScenario {
	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkloadEvent> cause;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Step root;

	/**
	 * The cached value of the '{@link #getParentStep() <em>Parent Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentStep()
	 * @generated
	 * @ordered
	 */
	protected Step parentStep;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<PrecedenceRelation> connectors;

	/**
	 * The default value of the '{@link #getRespTime() <em>Resp Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespTime()
	 * @generated
	 * @ordered
	 */
	protected static final Duration RESP_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRespTime() <em>Resp Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespTime()
	 * @generated
	 * @ordered
	 */
	protected Duration respTime = RESP_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBestCET() <em>Best CET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestCET()
	 * @generated
	 * @ordered
	 */
	protected static final Duration BEST_CET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBestCET() <em>Best CET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestCET()
	 * @generated
	 * @ordered
	 */
	protected Duration bestCET = BEST_CET_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorstCET() <em>Worst CET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstCET()
	 * @generated
	 * @ordered
	 */
	protected static final Duration WORST_CET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorstCET() <em>Worst CET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstCET()
	 * @generated
	 * @ordered
	 */
	protected Duration worstCET = WORST_CET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.BEHAVIOR_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentWithInverseEList<Step>(Step.class, this, GqamPackage.BEHAVIOR_SCENARIO__STEPS, GqamPackage.STEP__SCENARIO);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkloadEvent> getCause() {
		if (cause == null) {
			cause = new EObjectWithInverseResolvingEList<WorkloadEvent>(WorkloadEvent.class, this, GqamPackage.BEHAVIOR_SCENARIO__CAUSE, GqamPackage.WORKLOAD_EVENT__EFFECT);
		}
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getRoot() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject)root;
			root = (Step)eResolveProxy(oldRoot);
			if (root != oldRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GqamPackage.BEHAVIOR_SCENARIO__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Step newRoot) {
		Step oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.BEHAVIOR_SCENARIO__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getParentStep() {
		if (parentStep != null && parentStep.eIsProxy()) {
			InternalEObject oldParentStep = (InternalEObject)parentStep;
			parentStep = (Step)eResolveProxy(oldParentStep);
			if (parentStep != oldParentStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GqamPackage.BEHAVIOR_SCENARIO__PARENT_STEP, oldParentStep, parentStep));
			}
		}
		return parentStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetParentStep() {
		return parentStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStep(Step newParentStep, NotificationChain msgs) {
		Step oldParentStep = parentStep;
		parentStep = newParentStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GqamPackage.BEHAVIOR_SCENARIO__PARENT_STEP, oldParentStep, newParentStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStep(Step newParentStep) {
		if (newParentStep != parentStep) {
			NotificationChain msgs = null;
			if (parentStep != null)
				msgs = ((InternalEObject)parentStep).eInverseRemove(this, GqamPackage.STEP__CHILD_SCENARIO, Step.class, msgs);
			if (newParentStep != null)
				msgs = ((InternalEObject)newParentStep).eInverseAdd(this, GqamPackage.STEP__CHILD_SCENARIO, Step.class, msgs);
			msgs = basicSetParentStep(newParentStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.BEHAVIOR_SCENARIO__PARENT_STEP, newParentStep, newParentStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrecedenceRelation> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<PrecedenceRelation>(PrecedenceRelation.class, this, GqamPackage.BEHAVIOR_SCENARIO__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getRespTime() {
		return respTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRespTime(Duration newRespTime) {
		Duration oldRespTime = respTime;
		respTime = newRespTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.BEHAVIOR_SCENARIO__RESP_TIME, oldRespTime, respTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getBestCET() {
		return bestCET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBestCET(Duration newBestCET) {
		Duration oldBestCET = bestCET;
		bestCET = newBestCET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.BEHAVIOR_SCENARIO__BEST_CET, oldBestCET, bestCET));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getWorstCET() {
		return worstCET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorstCET(Duration newWorstCET) {
		Duration oldWorstCET = worstCET;
		worstCET = newWorstCET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.BEHAVIOR_SCENARIO__WORST_CET, oldWorstCET, worstCET));
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
			case GqamPackage.BEHAVIOR_SCENARIO__STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteps()).basicAdd(otherEnd, msgs);
			case GqamPackage.BEHAVIOR_SCENARIO__CAUSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCause()).basicAdd(otherEnd, msgs);
			case GqamPackage.BEHAVIOR_SCENARIO__PARENT_STEP:
				if (parentStep != null)
					msgs = ((InternalEObject)parentStep).eInverseRemove(this, GqamPackage.STEP__CHILD_SCENARIO, Step.class, msgs);
				return basicSetParentStep((Step)otherEnd, msgs);
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
			case GqamPackage.BEHAVIOR_SCENARIO__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
			case GqamPackage.BEHAVIOR_SCENARIO__CAUSE:
				return ((InternalEList<?>)getCause()).basicRemove(otherEnd, msgs);
			case GqamPackage.BEHAVIOR_SCENARIO__PARENT_STEP:
				return basicSetParentStep(null, msgs);
			case GqamPackage.BEHAVIOR_SCENARIO__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
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
			case GqamPackage.BEHAVIOR_SCENARIO__STEPS:
				return getSteps();
			case GqamPackage.BEHAVIOR_SCENARIO__CAUSE:
				return getCause();
			case GqamPackage.BEHAVIOR_SCENARIO__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
			case GqamPackage.BEHAVIOR_SCENARIO__PARENT_STEP:
				if (resolve) return getParentStep();
				return basicGetParentStep();
			case GqamPackage.BEHAVIOR_SCENARIO__CONNECTORS:
				return getConnectors();
			case GqamPackage.BEHAVIOR_SCENARIO__RESP_TIME:
				return getRespTime();
			case GqamPackage.BEHAVIOR_SCENARIO__BEST_CET:
				return getBestCET();
			case GqamPackage.BEHAVIOR_SCENARIO__WORST_CET:
				return getWorstCET();
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
			case GqamPackage.BEHAVIOR_SCENARIO__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case GqamPackage.BEHAVIOR_SCENARIO__CAUSE:
				getCause().clear();
				getCause().addAll((Collection<? extends WorkloadEvent>)newValue);
				return;
			case GqamPackage.BEHAVIOR_SCENARIO__ROOT:
				setRoot((Step)newValue);
				return;
			case GqamPackage.BEHAVIOR_SCENARIO__PARENT_STEP:
				setParentStep((Step)newValue);
				return;
			case GqamPackage.BEHAVIOR_SCENARIO__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends PrecedenceRelation>)newValue);
				return;
			case GqamPackage.BEHAVIOR_SCENARIO__RESP_TIME:
				setRespTime((Duration)newValue);
				return;
			case GqamPackage.BEHAVIOR_SCENARIO__BEST_CET:
				setBestCET((Duration)newValue);
				return;
			case GqamPackage.BEHAVIOR_SCENARIO__WORST_CET:
				setWorstCET((Duration)newValue);
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
			case GqamPackage.BEHAVIOR_SCENARIO__STEPS:
				getSteps().clear();
				return;
			case GqamPackage.BEHAVIOR_SCENARIO__CAUSE:
				getCause().clear();
				return;
			case GqamPackage.BEHAVIOR_SCENARIO__ROOT:
				setRoot((Step)null);
				return;
			case GqamPackage.BEHAVIOR_SCENARIO__PARENT_STEP:
				setParentStep((Step)null);
				return;
			case GqamPackage.BEHAVIOR_SCENARIO__CONNECTORS:
				getConnectors().clear();
				return;
			case GqamPackage.BEHAVIOR_SCENARIO__RESP_TIME:
				setRespTime(RESP_TIME_EDEFAULT);
				return;
			case GqamPackage.BEHAVIOR_SCENARIO__BEST_CET:
				setBestCET(BEST_CET_EDEFAULT);
				return;
			case GqamPackage.BEHAVIOR_SCENARIO__WORST_CET:
				setWorstCET(WORST_CET_EDEFAULT);
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
			case GqamPackage.BEHAVIOR_SCENARIO__STEPS:
				return steps != null && !steps.isEmpty();
			case GqamPackage.BEHAVIOR_SCENARIO__CAUSE:
				return cause != null && !cause.isEmpty();
			case GqamPackage.BEHAVIOR_SCENARIO__ROOT:
				return root != null;
			case GqamPackage.BEHAVIOR_SCENARIO__PARENT_STEP:
				return parentStep != null;
			case GqamPackage.BEHAVIOR_SCENARIO__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case GqamPackage.BEHAVIOR_SCENARIO__RESP_TIME:
				return RESP_TIME_EDEFAULT == null ? respTime != null : !RESP_TIME_EDEFAULT.equals(respTime);
			case GqamPackage.BEHAVIOR_SCENARIO__BEST_CET:
				return BEST_CET_EDEFAULT == null ? bestCET != null : !BEST_CET_EDEFAULT.equals(bestCET);
			case GqamPackage.BEHAVIOR_SCENARIO__WORST_CET:
				return WORST_CET_EDEFAULT == null ? worstCET != null : !WORST_CET_EDEFAULT.equals(worstCET);
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
		result.append(" (respTime: ");
		result.append(respTime);
		result.append(", bestCET: ");
		result.append(bestCET);
		result.append(", worstCET: ");
		result.append(worstCET);
		result.append(')');
		return result.toString();
	}

} //BehaviorScenarioImpl
