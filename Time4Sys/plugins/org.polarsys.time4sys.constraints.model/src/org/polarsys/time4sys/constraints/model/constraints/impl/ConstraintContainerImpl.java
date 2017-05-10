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
package org.polarsys.time4sys.constraints.model.constraints.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.constraints.model.constraints.AnalysisParameter;
import org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer;
import org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage;
import org.polarsys.time4sys.constraints.model.constraints.JitterConstraint;
import org.polarsys.time4sys.constraints.model.constraints.LatencyConstraint;
import org.polarsys.time4sys.constraints.model.constraints.LoadConstraint;
import org.polarsys.time4sys.constraints.model.constraints.TwcaConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintContainerImpl#getTwcaConstraints <em>Twca Constraints</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintContainerImpl#getLatencyConstraints <em>Latency Constraints</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintContainerImpl#getJitterConstraints <em>Jitter Constraints</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintContainerImpl#getLoadConstraints <em>Load Constraints</em>}</li>
 *   <li>{@link org.polarsys.time4sys.constraints.model.constraints.impl.ConstraintContainerImpl#getAnalysisParameters <em>Analysis Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintContainerImpl extends org.polarsys.time4sys.analysis.impl.ConstraintContainerImpl implements ConstraintContainer {
	/**
	 * The cached value of the '{@link #getTwcaConstraints() <em>Twca Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwcaConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<TwcaConstraint> twcaConstraints;

	/**
	 * The cached value of the '{@link #getLatencyConstraints() <em>Latency Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<LatencyConstraint> latencyConstraints;

	/**
	 * The cached value of the '{@link #getJitterConstraints() <em>Jitter Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitterConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<JitterConstraint> jitterConstraints;

	/**
	 * The cached value of the '{@link #getLoadConstraints() <em>Load Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadConstraint> loadConstraints;

	/**
	 * The cached value of the '{@link #getAnalysisParameters() <em>Analysis Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalysisParameter> analysisParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.CONSTRAINT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TwcaConstraint> getTwcaConstraints() {
		if (twcaConstraints == null) {
			twcaConstraints = new EObjectContainmentEList<TwcaConstraint>(TwcaConstraint.class, this, ConstraintsPackage.CONSTRAINT_CONTAINER__TWCA_CONSTRAINTS);
		}
		return twcaConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LatencyConstraint> getLatencyConstraints() {
		if (latencyConstraints == null) {
			latencyConstraints = new EObjectContainmentEList<LatencyConstraint>(LatencyConstraint.class, this, ConstraintsPackage.CONSTRAINT_CONTAINER__LATENCY_CONSTRAINTS);
		}
		return latencyConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JitterConstraint> getJitterConstraints() {
		if (jitterConstraints == null) {
			jitterConstraints = new EObjectContainmentEList<JitterConstraint>(JitterConstraint.class, this, ConstraintsPackage.CONSTRAINT_CONTAINER__JITTER_CONSTRAINTS);
		}
		return jitterConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadConstraint> getLoadConstraints() {
		if (loadConstraints == null) {
			loadConstraints = new EObjectContainmentEList<LoadConstraint>(LoadConstraint.class, this, ConstraintsPackage.CONSTRAINT_CONTAINER__LOAD_CONSTRAINTS);
		}
		return loadConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalysisParameter> getAnalysisParameters() {
		if (analysisParameters == null) {
			analysisParameters = new EObjectContainmentEList<AnalysisParameter>(AnalysisParameter.class, this, ConstraintsPackage.CONSTRAINT_CONTAINER__ANALYSIS_PARAMETERS);
		}
		return analysisParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConstraintsPackage.CONSTRAINT_CONTAINER__TWCA_CONSTRAINTS:
				return ((InternalEList<?>)getTwcaConstraints()).basicRemove(otherEnd, msgs);
			case ConstraintsPackage.CONSTRAINT_CONTAINER__LATENCY_CONSTRAINTS:
				return ((InternalEList<?>)getLatencyConstraints()).basicRemove(otherEnd, msgs);
			case ConstraintsPackage.CONSTRAINT_CONTAINER__JITTER_CONSTRAINTS:
				return ((InternalEList<?>)getJitterConstraints()).basicRemove(otherEnd, msgs);
			case ConstraintsPackage.CONSTRAINT_CONTAINER__LOAD_CONSTRAINTS:
				return ((InternalEList<?>)getLoadConstraints()).basicRemove(otherEnd, msgs);
			case ConstraintsPackage.CONSTRAINT_CONTAINER__ANALYSIS_PARAMETERS:
				return ((InternalEList<?>)getAnalysisParameters()).basicRemove(otherEnd, msgs);
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
			case ConstraintsPackage.CONSTRAINT_CONTAINER__TWCA_CONSTRAINTS:
				return getTwcaConstraints();
			case ConstraintsPackage.CONSTRAINT_CONTAINER__LATENCY_CONSTRAINTS:
				return getLatencyConstraints();
			case ConstraintsPackage.CONSTRAINT_CONTAINER__JITTER_CONSTRAINTS:
				return getJitterConstraints();
			case ConstraintsPackage.CONSTRAINT_CONTAINER__LOAD_CONSTRAINTS:
				return getLoadConstraints();
			case ConstraintsPackage.CONSTRAINT_CONTAINER__ANALYSIS_PARAMETERS:
				return getAnalysisParameters();
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
			case ConstraintsPackage.CONSTRAINT_CONTAINER__TWCA_CONSTRAINTS:
				getTwcaConstraints().clear();
				getTwcaConstraints().addAll((Collection<? extends TwcaConstraint>)newValue);
				return;
			case ConstraintsPackage.CONSTRAINT_CONTAINER__LATENCY_CONSTRAINTS:
				getLatencyConstraints().clear();
				getLatencyConstraints().addAll((Collection<? extends LatencyConstraint>)newValue);
				return;
			case ConstraintsPackage.CONSTRAINT_CONTAINER__JITTER_CONSTRAINTS:
				getJitterConstraints().clear();
				getJitterConstraints().addAll((Collection<? extends JitterConstraint>)newValue);
				return;
			case ConstraintsPackage.CONSTRAINT_CONTAINER__LOAD_CONSTRAINTS:
				getLoadConstraints().clear();
				getLoadConstraints().addAll((Collection<? extends LoadConstraint>)newValue);
				return;
			case ConstraintsPackage.CONSTRAINT_CONTAINER__ANALYSIS_PARAMETERS:
				getAnalysisParameters().clear();
				getAnalysisParameters().addAll((Collection<? extends AnalysisParameter>)newValue);
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
			case ConstraintsPackage.CONSTRAINT_CONTAINER__TWCA_CONSTRAINTS:
				getTwcaConstraints().clear();
				return;
			case ConstraintsPackage.CONSTRAINT_CONTAINER__LATENCY_CONSTRAINTS:
				getLatencyConstraints().clear();
				return;
			case ConstraintsPackage.CONSTRAINT_CONTAINER__JITTER_CONSTRAINTS:
				getJitterConstraints().clear();
				return;
			case ConstraintsPackage.CONSTRAINT_CONTAINER__LOAD_CONSTRAINTS:
				getLoadConstraints().clear();
				return;
			case ConstraintsPackage.CONSTRAINT_CONTAINER__ANALYSIS_PARAMETERS:
				getAnalysisParameters().clear();
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
			case ConstraintsPackage.CONSTRAINT_CONTAINER__TWCA_CONSTRAINTS:
				return twcaConstraints != null && !twcaConstraints.isEmpty();
			case ConstraintsPackage.CONSTRAINT_CONTAINER__LATENCY_CONSTRAINTS:
				return latencyConstraints != null && !latencyConstraints.isEmpty();
			case ConstraintsPackage.CONSTRAINT_CONTAINER__JITTER_CONSTRAINTS:
				return jitterConstraints != null && !jitterConstraints.isEmpty();
			case ConstraintsPackage.CONSTRAINT_CONTAINER__LOAD_CONSTRAINTS:
				return loadConstraints != null && !loadConstraints.isEmpty();
			case ConstraintsPackage.CONSTRAINT_CONTAINER__ANALYSIS_PARAMETERS:
				return analysisParameters != null && !analysisParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstraintContainerImpl
