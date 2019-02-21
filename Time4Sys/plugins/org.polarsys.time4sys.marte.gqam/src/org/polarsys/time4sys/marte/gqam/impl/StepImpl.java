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
package org.polarsys.time4sys.marte.gqam.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl#isIsAtomic <em>Is Atomic</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl#getBlockingTime <em>Blocking Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl#getRepetitions <em>Repetitions</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl#getServiceCount <em>Service Count</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl#getChildScenario <em>Child Scenario</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl#getInputRel <em>Input Rel</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl#getOutputRel <em>Output Rel</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl#getConcurRes <em>Concur Res</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl#getInputPin <em>Input Pin</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl#getOutputPin <em>Output Pin</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl#getOccurencePeriod <em>Occurence Period</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl#getOccurencePhase <em>Occurence Phase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends BehaviorScenarioImpl implements Step {
	/**
	 * The default value of the '{@link #isIsAtomic() <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAtomic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ATOMIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAtomic() <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAtomic()
	 * @generated
	 * @ordered
	 */
	protected boolean isAtomic = IS_ATOMIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockingTime() <em>Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected static final Duration BLOCKING_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockingTime() <em>Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected Duration blockingTime = BLOCKING_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepetitions() <em>Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitions()
	 * @generated
	 * @ordered
	 */
	protected static final double REPETITIONS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRepetitions() <em>Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitions()
	 * @generated
	 * @ordered
	 */
	protected double repetitions = REPETITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceCount() <em>Service Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCount()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVICE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServiceCount() <em>Service Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCount()
	 * @generated
	 * @ordered
	 */
	protected int serviceCount = SERVICE_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildScenario() <em>Child Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildScenario()
	 * @generated
	 * @ordered
	 */
	protected BehaviorScenario childScenario;

	/**
	 * The cached value of the '{@link #getInputRel() <em>Input Rel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputRel()
	 * @generated
	 * @ordered
	 */
	protected PrecedenceRelation inputRel;

	/**
	 * The cached value of the '{@link #getOutputRel() <em>Output Rel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputRel()
	 * @generated
	 * @ordered
	 */
	protected PrecedenceRelation outputRel;

	/**
	 * The cached value of the '{@link #getConcurRes() <em>Concur Res</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurRes()
	 * @generated
	 * @ordered
	 */
	protected SchedulableResource concurRes;

	/**
	 * The cached value of the '{@link #getInputPin() <em>Input Pin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPin()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> inputPin;

	/**
	 * The cached value of the '{@link #getOutputPin() <em>Output Pin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPin()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> outputPin;

	/**
	 * The default value of the '{@link #getOccurencePeriod() <em>Occurence Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurencePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int OCCURENCE_PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOccurencePeriod() <em>Occurence Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurencePeriod()
	 * @generated
	 * @ordered
	 */
	protected int occurencePeriod = OCCURENCE_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOccurencePhase() <em>Occurence Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurencePhase()
	 * @generated
	 * @ordered
	 */
	protected static final int OCCURENCE_PHASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOccurencePhase() <em>Occurence Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurencePhase()
	 * @generated
	 * @ordered
	 */
	protected int occurencePhase = OCCURENCE_PHASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatedModel getOwner() {
		if (eContainerFeatureID() != GqamPackage.STEP__OWNER) return null;
		return (AnnotatedModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(AnnotatedModel newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, GqamPackage.STEP__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(AnnotatedModel newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != GqamPackage.STEP__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, AnnotationPackage.ANNOTATED_MODEL__OWNS, AnnotatedModel.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorScenario getScenario() {
		if (eContainerFeatureID() != GqamPackage.STEP__SCENARIO) return null;
		return (BehaviorScenario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(BehaviorScenario newScenario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScenario, GqamPackage.STEP__SCENARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(BehaviorScenario newScenario) {
		if (newScenario != eInternalContainer() || (eContainerFeatureID() != GqamPackage.STEP__SCENARIO && newScenario != null)) {
			if (EcoreUtil.isAncestor(this, newScenario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScenario != null)
				msgs = ((InternalEObject)newScenario).eInverseAdd(this, GqamPackage.BEHAVIOR_SCENARIO__STEPS, BehaviorScenario.class, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__SCENARIO, newScenario, newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorScenario getChildScenario() {
		if (childScenario != null && childScenario.eIsProxy()) {
			InternalEObject oldChildScenario = (InternalEObject)childScenario;
			childScenario = (BehaviorScenario)eResolveProxy(oldChildScenario);
			if (childScenario != oldChildScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GqamPackage.STEP__CHILD_SCENARIO, oldChildScenario, childScenario));
			}
		}
		return childScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorScenario basicGetChildScenario() {
		return childScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildScenario(BehaviorScenario newChildScenario, NotificationChain msgs) {
		BehaviorScenario oldChildScenario = childScenario;
		childScenario = newChildScenario;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__CHILD_SCENARIO, oldChildScenario, newChildScenario);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildScenario(BehaviorScenario newChildScenario) {
		if (newChildScenario != childScenario) {
			NotificationChain msgs = null;
			if (childScenario != null)
				msgs = ((InternalEObject)childScenario).eInverseRemove(this, GqamPackage.BEHAVIOR_SCENARIO__PARENT_STEP, BehaviorScenario.class, msgs);
			if (newChildScenario != null)
				msgs = ((InternalEObject)newChildScenario).eInverseAdd(this, GqamPackage.BEHAVIOR_SCENARIO__PARENT_STEP, BehaviorScenario.class, msgs);
			msgs = basicSetChildScenario(newChildScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__CHILD_SCENARIO, newChildScenario, newChildScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceRelation getOutputRel() {
		if (outputRel != null && outputRel.eIsProxy()) {
			InternalEObject oldOutputRel = (InternalEObject)outputRel;
			outputRel = (PrecedenceRelation)eResolveProxy(oldOutputRel);
			if (outputRel != oldOutputRel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GqamPackage.STEP__OUTPUT_REL, oldOutputRel, outputRel));
			}
		}
		return outputRel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceRelation basicGetOutputRel() {
		return outputRel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputRel(PrecedenceRelation newOutputRel, NotificationChain msgs) {
		PrecedenceRelation oldOutputRel = outputRel;
		outputRel = newOutputRel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__OUTPUT_REL, oldOutputRel, newOutputRel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputRel(PrecedenceRelation newOutputRel) {
		if (newOutputRel != outputRel) {
			NotificationChain msgs = null;
			if (outputRel != null)
				msgs = ((InternalEObject)outputRel).eInverseRemove(this, GqamPackage.PRECEDENCE_RELATION__PREDEC, PrecedenceRelation.class, msgs);
			if (newOutputRel != null)
				msgs = ((InternalEObject)newOutputRel).eInverseAdd(this, GqamPackage.PRECEDENCE_RELATION__PREDEC, PrecedenceRelation.class, msgs);
			msgs = basicSetOutputRel(newOutputRel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__OUTPUT_REL, newOutputRel, newOutputRel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulableResource getConcurRes() {
		if (concurRes != null && concurRes.eIsProxy()) {
			InternalEObject oldConcurRes = (InternalEObject)concurRes;
			concurRes = (SchedulableResource)eResolveProxy(oldConcurRes);
			if (concurRes != oldConcurRes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GqamPackage.STEP__CONCUR_RES, oldConcurRes, concurRes));
			}
		}
		return concurRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulableResource basicGetConcurRes() {
		return concurRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurRes(SchedulableResource newConcurRes) {
		SchedulableResource oldConcurRes = concurRes;
		concurRes = newConcurRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__CONCUR_RES, oldConcurRes, concurRes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInputPin() {
		if (inputPin == null) {
			inputPin = new EObjectContainmentEList<InputPin>(InputPin.class, this, GqamPackage.STEP__INPUT_PIN);
		}
		return inputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getOutputPin() {
		if (outputPin == null) {
			outputPin = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, GqamPackage.STEP__OUTPUT_PIN);
		}
		return outputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOccurencePeriod() {
		return occurencePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurencePeriod(int newOccurencePeriod) {
		int oldOccurencePeriod = occurencePeriod;
		occurencePeriod = newOccurencePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__OCCURENCE_PERIOD, oldOccurencePeriod, occurencePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOccurencePhase() {
		return occurencePhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurencePhase(int newOccurencePhase) {
		int oldOccurencePhase = occurencePhase;
		occurencePhase = newOccurencePhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__OCCURENCE_PHASE, oldOccurencePhase, occurencePhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceRelation getInputRel() {
		if (inputRel != null && inputRel.eIsProxy()) {
			InternalEObject oldInputRel = (InternalEObject)inputRel;
			inputRel = (PrecedenceRelation)eResolveProxy(oldInputRel);
			if (inputRel != oldInputRel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GqamPackage.STEP__INPUT_REL, oldInputRel, inputRel));
			}
		}
		return inputRel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceRelation basicGetInputRel() {
		return inputRel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputRel(PrecedenceRelation newInputRel, NotificationChain msgs) {
		PrecedenceRelation oldInputRel = inputRel;
		inputRel = newInputRel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__INPUT_REL, oldInputRel, newInputRel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputRel(PrecedenceRelation newInputRel) {
		if (newInputRel != inputRel) {
			NotificationChain msgs = null;
			if (inputRel != null)
				msgs = ((InternalEObject)inputRel).eInverseRemove(this, GqamPackage.PRECEDENCE_RELATION__SUCCES, PrecedenceRelation.class, msgs);
			if (newInputRel != null)
				msgs = ((InternalEObject)newInputRel).eInverseAdd(this, GqamPackage.PRECEDENCE_RELATION__SUCCES, PrecedenceRelation.class, msgs);
			msgs = basicSetInputRel(newInputRel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__INPUT_REL, newInputRel, newInputRel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAtomic() {
		return isAtomic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAtomic(boolean newIsAtomic) {
		boolean oldIsAtomic = isAtomic;
		isAtomic = newIsAtomic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__IS_ATOMIC, oldIsAtomic, isAtomic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getBlockingTime() {
		return blockingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockingTime(Duration newBlockingTime) {
		Duration oldBlockingTime = blockingTime;
		blockingTime = newBlockingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__BLOCKING_TIME, oldBlockingTime, blockingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRepetitions() {
		return repetitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepetitions(double newRepetitions) {
		double oldRepetitions = repetitions;
		repetitions = newRepetitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__REPETITIONS, oldRepetitions, repetitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getServiceCount() {
		return serviceCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCount(int newServiceCount) {
		int oldServiceCount = serviceCount;
		serviceCount = newServiceCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.STEP__SERVICE_COUNT, oldServiceCount, serviceCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GqamPackage.STEP__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((AnnotatedModel)otherEnd, msgs);
			case GqamPackage.STEP__SCENARIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScenario((BehaviorScenario)otherEnd, msgs);
			case GqamPackage.STEP__CHILD_SCENARIO:
				if (childScenario != null)
					msgs = ((InternalEObject)childScenario).eInverseRemove(this, GqamPackage.BEHAVIOR_SCENARIO__PARENT_STEP, BehaviorScenario.class, msgs);
				return basicSetChildScenario((BehaviorScenario)otherEnd, msgs);
			case GqamPackage.STEP__INPUT_REL:
				if (inputRel != null)
					msgs = ((InternalEObject)inputRel).eInverseRemove(this, GqamPackage.PRECEDENCE_RELATION__SUCCES, PrecedenceRelation.class, msgs);
				return basicSetInputRel((PrecedenceRelation)otherEnd, msgs);
			case GqamPackage.STEP__OUTPUT_REL:
				if (outputRel != null)
					msgs = ((InternalEObject)outputRel).eInverseRemove(this, GqamPackage.PRECEDENCE_RELATION__PREDEC, PrecedenceRelation.class, msgs);
				return basicSetOutputRel((PrecedenceRelation)otherEnd, msgs);
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
			case GqamPackage.STEP__OWNER:
				return basicSetOwner(null, msgs);
			case GqamPackage.STEP__SCENARIO:
				return basicSetScenario(null, msgs);
			case GqamPackage.STEP__CHILD_SCENARIO:
				return basicSetChildScenario(null, msgs);
			case GqamPackage.STEP__INPUT_REL:
				return basicSetInputRel(null, msgs);
			case GqamPackage.STEP__OUTPUT_REL:
				return basicSetOutputRel(null, msgs);
			case GqamPackage.STEP__INPUT_PIN:
				return ((InternalEList<?>)getInputPin()).basicRemove(otherEnd, msgs);
			case GqamPackage.STEP__OUTPUT_PIN:
				return ((InternalEList<?>)getOutputPin()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GqamPackage.STEP__OWNER:
				return eInternalContainer().eInverseRemove(this, AnnotationPackage.ANNOTATED_MODEL__OWNS, AnnotatedModel.class, msgs);
			case GqamPackage.STEP__SCENARIO:
				return eInternalContainer().eInverseRemove(this, GqamPackage.BEHAVIOR_SCENARIO__STEPS, BehaviorScenario.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GqamPackage.STEP__OWNER:
				return getOwner();
			case GqamPackage.STEP__IS_ATOMIC:
				return isIsAtomic();
			case GqamPackage.STEP__BLOCKING_TIME:
				return getBlockingTime();
			case GqamPackage.STEP__REPETITIONS:
				return getRepetitions();
			case GqamPackage.STEP__PROBABILITY:
				return getProbability();
			case GqamPackage.STEP__PRIORITY:
				return getPriority();
			case GqamPackage.STEP__SERVICE_COUNT:
				return getServiceCount();
			case GqamPackage.STEP__SCENARIO:
				return getScenario();
			case GqamPackage.STEP__CHILD_SCENARIO:
				if (resolve) return getChildScenario();
				return basicGetChildScenario();
			case GqamPackage.STEP__INPUT_REL:
				if (resolve) return getInputRel();
				return basicGetInputRel();
			case GqamPackage.STEP__OUTPUT_REL:
				if (resolve) return getOutputRel();
				return basicGetOutputRel();
			case GqamPackage.STEP__CONCUR_RES:
				if (resolve) return getConcurRes();
				return basicGetConcurRes();
			case GqamPackage.STEP__INPUT_PIN:
				return getInputPin();
			case GqamPackage.STEP__OUTPUT_PIN:
				return getOutputPin();
			case GqamPackage.STEP__OCCURENCE_PERIOD:
				return getOccurencePeriod();
			case GqamPackage.STEP__OCCURENCE_PHASE:
				return getOccurencePhase();
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
			case GqamPackage.STEP__OWNER:
				setOwner((AnnotatedModel)newValue);
				return;
			case GqamPackage.STEP__IS_ATOMIC:
				setIsAtomic((Boolean)newValue);
				return;
			case GqamPackage.STEP__BLOCKING_TIME:
				setBlockingTime((Duration)newValue);
				return;
			case GqamPackage.STEP__REPETITIONS:
				setRepetitions((Double)newValue);
				return;
			case GqamPackage.STEP__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case GqamPackage.STEP__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case GqamPackage.STEP__SERVICE_COUNT:
				setServiceCount((Integer)newValue);
				return;
			case GqamPackage.STEP__SCENARIO:
				setScenario((BehaviorScenario)newValue);
				return;
			case GqamPackage.STEP__CHILD_SCENARIO:
				setChildScenario((BehaviorScenario)newValue);
				return;
			case GqamPackage.STEP__INPUT_REL:
				setInputRel((PrecedenceRelation)newValue);
				return;
			case GqamPackage.STEP__OUTPUT_REL:
				setOutputRel((PrecedenceRelation)newValue);
				return;
			case GqamPackage.STEP__CONCUR_RES:
				setConcurRes((SchedulableResource)newValue);
				return;
			case GqamPackage.STEP__INPUT_PIN:
				getInputPin().clear();
				getInputPin().addAll((Collection<? extends InputPin>)newValue);
				return;
			case GqamPackage.STEP__OUTPUT_PIN:
				getOutputPin().clear();
				getOutputPin().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case GqamPackage.STEP__OCCURENCE_PERIOD:
				setOccurencePeriod((Integer)newValue);
				return;
			case GqamPackage.STEP__OCCURENCE_PHASE:
				setOccurencePhase((Integer)newValue);
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
			case GqamPackage.STEP__OWNER:
				setOwner((AnnotatedModel)null);
				return;
			case GqamPackage.STEP__IS_ATOMIC:
				setIsAtomic(IS_ATOMIC_EDEFAULT);
				return;
			case GqamPackage.STEP__BLOCKING_TIME:
				setBlockingTime(BLOCKING_TIME_EDEFAULT);
				return;
			case GqamPackage.STEP__REPETITIONS:
				setRepetitions(REPETITIONS_EDEFAULT);
				return;
			case GqamPackage.STEP__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case GqamPackage.STEP__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case GqamPackage.STEP__SERVICE_COUNT:
				setServiceCount(SERVICE_COUNT_EDEFAULT);
				return;
			case GqamPackage.STEP__SCENARIO:
				setScenario((BehaviorScenario)null);
				return;
			case GqamPackage.STEP__CHILD_SCENARIO:
				setChildScenario((BehaviorScenario)null);
				return;
			case GqamPackage.STEP__INPUT_REL:
				setInputRel((PrecedenceRelation)null);
				return;
			case GqamPackage.STEP__OUTPUT_REL:
				setOutputRel((PrecedenceRelation)null);
				return;
			case GqamPackage.STEP__CONCUR_RES:
				setConcurRes((SchedulableResource)null);
				return;
			case GqamPackage.STEP__INPUT_PIN:
				getInputPin().clear();
				return;
			case GqamPackage.STEP__OUTPUT_PIN:
				getOutputPin().clear();
				return;
			case GqamPackage.STEP__OCCURENCE_PERIOD:
				setOccurencePeriod(OCCURENCE_PERIOD_EDEFAULT);
				return;
			case GqamPackage.STEP__OCCURENCE_PHASE:
				setOccurencePhase(OCCURENCE_PHASE_EDEFAULT);
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
			case GqamPackage.STEP__OWNER:
				return getOwner() != null;
			case GqamPackage.STEP__IS_ATOMIC:
				return isAtomic != IS_ATOMIC_EDEFAULT;
			case GqamPackage.STEP__BLOCKING_TIME:
				return BLOCKING_TIME_EDEFAULT == null ? blockingTime != null : !BLOCKING_TIME_EDEFAULT.equals(blockingTime);
			case GqamPackage.STEP__REPETITIONS:
				return repetitions != REPETITIONS_EDEFAULT;
			case GqamPackage.STEP__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case GqamPackage.STEP__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case GqamPackage.STEP__SERVICE_COUNT:
				return serviceCount != SERVICE_COUNT_EDEFAULT;
			case GqamPackage.STEP__SCENARIO:
				return getScenario() != null;
			case GqamPackage.STEP__CHILD_SCENARIO:
				return childScenario != null;
			case GqamPackage.STEP__INPUT_REL:
				return inputRel != null;
			case GqamPackage.STEP__OUTPUT_REL:
				return outputRel != null;
			case GqamPackage.STEP__CONCUR_RES:
				return concurRes != null;
			case GqamPackage.STEP__INPUT_PIN:
				return inputPin != null && !inputPin.isEmpty();
			case GqamPackage.STEP__OUTPUT_PIN:
				return outputPin != null && !outputPin.isEmpty();
			case GqamPackage.STEP__OCCURENCE_PERIOD:
				return occurencePeriod != OCCURENCE_PERIOD_EDEFAULT;
			case GqamPackage.STEP__OCCURENCE_PHASE:
				return occurencePhase != OCCURENCE_PHASE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AnnotatedElement.class) {
			switch (derivedFeatureID) {
				case GqamPackage.STEP__OWNER: return AnnotationPackage.ANNOTATED_ELEMENT__OWNER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AnnotatedElement.class) {
			switch (baseFeatureID) {
				case AnnotationPackage.ANNOTATED_ELEMENT__OWNER: return GqamPackage.STEP__OWNER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (isAtomic: ");
		result.append(isAtomic);
		result.append(", blockingTime: ");
		result.append(blockingTime);
		result.append(", repetitions: ");
		result.append(repetitions);
		result.append(", probability: ");
		result.append(probability);
		result.append(", priority: ");
		result.append(priority);
		result.append(", serviceCount: ");
		result.append(serviceCount);
		result.append(", occurencePeriod: ");
		result.append(occurencePeriod);
		result.append(", occurencePhase: ");
		result.append(occurencePhase);
		result.append(')');
		return result.toString();
	}

} //StepImpl
