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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.EndToEndFlow;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End To End Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.EndToEndFlowImpl#getEndToEndStimuli <em>End To End Stimuli</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.EndToEndFlowImpl#getEndToEndScenario <em>End To End Scenario</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.EndToEndFlowImpl#isIsSchedulable <em>Is Schedulable</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.EndToEndFlowImpl#getSchedulabilitySlack <em>Schedulability Slack</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.EndToEndFlowImpl#getEndToEndTime <em>End To End Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.EndToEndFlowImpl#getEndToEndDeadline <em>End To End Deadline</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndToEndFlowImpl extends MinimalEObjectImpl.Container implements EndToEndFlow {
	/**
	 * The cached value of the '{@link #getEndToEndStimuli() <em>End To End Stimuli</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndToEndStimuli()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkloadEvent> endToEndStimuli;

	/**
	 * The cached value of the '{@link #getEndToEndScenario() <em>End To End Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndToEndScenario()
	 * @generated
	 * @ordered
	 */
	protected BehaviorScenario endToEndScenario;

	/**
	 * The default value of the '{@link #isIsSchedulable() <em>Is Schedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSchedulable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SCHEDULABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSchedulable() <em>Is Schedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSchedulable()
	 * @generated
	 * @ordered
	 */
	protected boolean isSchedulable = IS_SCHEDULABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchedulabilitySlack() <em>Schedulability Slack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulabilitySlack()
	 * @generated
	 * @ordered
	 */
	protected static final double SCHEDULABILITY_SLACK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSchedulabilitySlack() <em>Schedulability Slack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulabilitySlack()
	 * @generated
	 * @ordered
	 */
	protected double schedulabilitySlack = SCHEDULABILITY_SLACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndToEndTime() <em>End To End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndToEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Duration END_TO_END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndToEndTime() <em>End To End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndToEndTime()
	 * @generated
	 * @ordered
	 */
	protected Duration endToEndTime = END_TO_END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndToEndDeadline() <em>End To End Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndToEndDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final Duration END_TO_END_DEADLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndToEndDeadline() <em>End To End Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndToEndDeadline()
	 * @generated
	 * @ordered
	 */
	protected Duration endToEndDeadline = END_TO_END_DEADLINE_EDEFAULT;

	private BasicEList<BehaviorScenario> stepsOnPath = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndToEndFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.END_TO_END_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkloadEvent> getEndToEndStimuli() {
		if (endToEndStimuli == null) {
			endToEndStimuli = new EObjectResolvingEList<WorkloadEvent>(WorkloadEvent.class, this, GqamPackage.END_TO_END_FLOW__END_TO_END_STIMULI);
		}
		return endToEndStimuli;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorScenario getEndToEndScenario() {
		if (endToEndScenario != null && endToEndScenario.eIsProxy()) {
			InternalEObject oldEndToEndScenario = (InternalEObject)endToEndScenario;
			endToEndScenario = (BehaviorScenario)eResolveProxy(oldEndToEndScenario);
			if (endToEndScenario != oldEndToEndScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GqamPackage.END_TO_END_FLOW__END_TO_END_SCENARIO, oldEndToEndScenario, endToEndScenario));
			}
		}
		return endToEndScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorScenario basicGetEndToEndScenario() {
		return endToEndScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndToEndScenario(BehaviorScenario newEndToEndScenario) {
		BehaviorScenario oldEndToEndScenario = endToEndScenario;
		endToEndScenario = newEndToEndScenario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.END_TO_END_FLOW__END_TO_END_SCENARIO, oldEndToEndScenario, endToEndScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSchedulable() {
		return isSchedulable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSchedulable(boolean newIsSchedulable) {
		boolean oldIsSchedulable = isSchedulable;
		isSchedulable = newIsSchedulable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.END_TO_END_FLOW__IS_SCHEDULABLE, oldIsSchedulable, isSchedulable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSchedulabilitySlack() {
		return schedulabilitySlack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulabilitySlack(double newSchedulabilitySlack) {
		double oldSchedulabilitySlack = schedulabilitySlack;
		schedulabilitySlack = newSchedulabilitySlack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.END_TO_END_FLOW__SCHEDULABILITY_SLACK, oldSchedulabilitySlack, schedulabilitySlack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getEndToEndTime() {
		return endToEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndToEndTime(Duration newEndToEndTime) {
		Duration oldEndToEndTime = endToEndTime;
		endToEndTime = newEndToEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.END_TO_END_FLOW__END_TO_END_TIME, oldEndToEndTime, endToEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getEndToEndDeadline() {
		return endToEndDeadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndToEndDeadline(Duration newEndToEndDeadline) {
		Duration oldEndToEndDeadline = endToEndDeadline;
		endToEndDeadline = newEndToEndDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.END_TO_END_FLOW__END_TO_END_DEADLINE, oldEndToEndDeadline, endToEndDeadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * The result is memoized.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<BehaviorScenario> findStepsOnPath() {
		if (stepsOnPath != null) {
			return stepsOnPath;
		}
		final Set<BehaviorScenario> forwardMarked = new HashSet<>(); 
		forwardMarking(forwardMarked);
		final Set<BehaviorScenario> backwardMarked = new HashSet<>(); 
		backwardMarking(backwardMarked);
		forwardMarked.retainAll(backwardMarked);
		stepsOnPath = new BasicEList<BehaviorScenario>(forwardMarked);
		return stepsOnPath;
	}

	private void forwardMarking(final Set<BehaviorScenario> accumulator) {
		final Queue<BehaviorScenario> toExplore = new ConcurrentLinkedQueue<>();
		for(WorkloadEvent evt: getEndToEndStimuli()) {
			toExplore.add(evt.getEffect());			
		}
		while(!toExplore.isEmpty()) {
			final BehaviorScenario current = toExplore.poll();
			accumulator.add(current);
			if (current instanceof Step) {
				final Step curStep = (Step)current;
				for(OutputPin opin: curStep.getOutputPin()) {
					for(InputPin ipin: opin.getSuccessors()) {
						if (ipin.eContainer() instanceof BehaviorScenario) {
							toExplore.add((BehaviorScenario)ipin.eContainer());
						}
					}
				}
			}
			toExplore.addAll(current.getSteps());
		}
	}
	
	private void backwardMarking(final Set<BehaviorScenario> accumulator) {
		final Queue<BehaviorScenario> toExplore = new ConcurrentLinkedQueue<>();
		toExplore.add(basicGetEndToEndScenario());
		while(!toExplore.isEmpty()) {
			final BehaviorScenario current = toExplore.poll();
			accumulator.add(current);
			if (current instanceof Step) {
				final Step curStep = (Step)current;
				for(InputPin ipin: curStep.getInputPin()) {
					for(OutputPin opin: ipin.getPredecessors()) {
						if (opin.eContainer() instanceof BehaviorScenario) {
							toExplore.add((BehaviorScenario)opin.eContainer());
						}
					}
				}
			}
			toExplore.addAll(current.getSteps());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GqamPackage.END_TO_END_FLOW__END_TO_END_STIMULI:
				return getEndToEndStimuli();
			case GqamPackage.END_TO_END_FLOW__END_TO_END_SCENARIO:
				if (resolve) return getEndToEndScenario();
				return basicGetEndToEndScenario();
			case GqamPackage.END_TO_END_FLOW__IS_SCHEDULABLE:
				return isIsSchedulable();
			case GqamPackage.END_TO_END_FLOW__SCHEDULABILITY_SLACK:
				return getSchedulabilitySlack();
			case GqamPackage.END_TO_END_FLOW__END_TO_END_TIME:
				return getEndToEndTime();
			case GqamPackage.END_TO_END_FLOW__END_TO_END_DEADLINE:
				return getEndToEndDeadline();
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
			case GqamPackage.END_TO_END_FLOW__END_TO_END_STIMULI:
				getEndToEndStimuli().clear();
				getEndToEndStimuli().addAll((Collection<? extends WorkloadEvent>)newValue);
				return;
			case GqamPackage.END_TO_END_FLOW__END_TO_END_SCENARIO:
				setEndToEndScenario((BehaviorScenario)newValue);
				return;
			case GqamPackage.END_TO_END_FLOW__IS_SCHEDULABLE:
				setIsSchedulable((Boolean)newValue);
				return;
			case GqamPackage.END_TO_END_FLOW__SCHEDULABILITY_SLACK:
				setSchedulabilitySlack((Double)newValue);
				return;
			case GqamPackage.END_TO_END_FLOW__END_TO_END_TIME:
				setEndToEndTime((Duration)newValue);
				return;
			case GqamPackage.END_TO_END_FLOW__END_TO_END_DEADLINE:
				setEndToEndDeadline((Duration)newValue);
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
			case GqamPackage.END_TO_END_FLOW__END_TO_END_STIMULI:
				getEndToEndStimuli().clear();
				return;
			case GqamPackage.END_TO_END_FLOW__END_TO_END_SCENARIO:
				setEndToEndScenario((BehaviorScenario)null);
				return;
			case GqamPackage.END_TO_END_FLOW__IS_SCHEDULABLE:
				setIsSchedulable(IS_SCHEDULABLE_EDEFAULT);
				return;
			case GqamPackage.END_TO_END_FLOW__SCHEDULABILITY_SLACK:
				setSchedulabilitySlack(SCHEDULABILITY_SLACK_EDEFAULT);
				return;
			case GqamPackage.END_TO_END_FLOW__END_TO_END_TIME:
				setEndToEndTime(END_TO_END_TIME_EDEFAULT);
				return;
			case GqamPackage.END_TO_END_FLOW__END_TO_END_DEADLINE:
				setEndToEndDeadline(END_TO_END_DEADLINE_EDEFAULT);
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
			case GqamPackage.END_TO_END_FLOW__END_TO_END_STIMULI:
				return endToEndStimuli != null && !endToEndStimuli.isEmpty();
			case GqamPackage.END_TO_END_FLOW__END_TO_END_SCENARIO:
				return endToEndScenario != null;
			case GqamPackage.END_TO_END_FLOW__IS_SCHEDULABLE:
				return isSchedulable != IS_SCHEDULABLE_EDEFAULT;
			case GqamPackage.END_TO_END_FLOW__SCHEDULABILITY_SLACK:
				return schedulabilitySlack != SCHEDULABILITY_SLACK_EDEFAULT;
			case GqamPackage.END_TO_END_FLOW__END_TO_END_TIME:
				return END_TO_END_TIME_EDEFAULT == null ? endToEndTime != null : !END_TO_END_TIME_EDEFAULT.equals(endToEndTime);
			case GqamPackage.END_TO_END_FLOW__END_TO_END_DEADLINE:
				return END_TO_END_DEADLINE_EDEFAULT == null ? endToEndDeadline != null : !END_TO_END_DEADLINE_EDEFAULT.equals(endToEndDeadline);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GqamPackage.END_TO_END_FLOW___FIND_STEPS_ON_PATH:
				return findStepsOnPath();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (isSchedulable: ");
		result.append(isSchedulable);
		result.append(", schedulabilitySlack: ");
		result.append(schedulabilitySlack);
		result.append(", endToEndTime: ");
		result.append(endToEndTime);
		result.append(", endToEndDeadline: ");
		result.append(endToEndDeadline);
		result.append(')');
		return result.toString();
	}

} //EndToEndFlowImpl
