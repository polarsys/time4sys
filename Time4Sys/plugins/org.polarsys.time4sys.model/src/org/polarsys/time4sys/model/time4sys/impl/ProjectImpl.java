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
package org.polarsys.time4sys.model.time4sys.impl;

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
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Simulation;
import org.polarsys.time4sys.model.time4sys.Time4sysPackage;
import org.polarsys.time4sys.model.time4sys.Transformation;
import org.polarsys.time4sys.trace.Trace;
import org.polarsys.time4sys.transformations.IdentityDerivation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.impl.ProjectImpl#getDesign <em>Design</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.impl.ProjectImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.impl.ProjectImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.impl.ProjectImpl#getDerivations <em>Derivations</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.impl.ProjectImpl#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.impl.ProjectImpl#getSimulations <em>Simulations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {

	/**
	 * The cached value of the '{@link #getDesign() <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected DesignModel design;

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
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

	/**
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> traces;

	/**
	 * The cached value of the '{@link #getDerivations() <em>Derivations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivations()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignModel> derivations;

	/**
	 * The cached value of the '{@link #getTransformations() <em>Transformations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> transformations;

	/**
	 * The cached value of the '{@link #getSimulations() <em>Simulations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulations()
	 * @generated
	 * @ordered
	 */
	protected EList<Simulation> simulations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Time4sysPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignModel getDesign() {
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesign(DesignModel newDesign, NotificationChain msgs) {
		DesignModel oldDesign = design;
		design = newDesign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Time4sysPackage.PROJECT__DESIGN, oldDesign, newDesign);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign(DesignModel newDesign) {
		if (newDesign != design) {
			NotificationChain msgs = null;
			if (design != null)
				msgs = ((InternalEObject)design).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Time4sysPackage.PROJECT__DESIGN, null, msgs);
			if (newDesign != null)
				msgs = ((InternalEObject)newDesign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Time4sysPackage.PROJECT__DESIGN, null, msgs);
			msgs = basicSetDesign(newDesign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Time4sysPackage.PROJECT__DESIGN, newDesign, newDesign));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Time4sysPackage.PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<Mapping>(Mapping.class, this, Time4sysPackage.PROJECT__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getTraces() {
		if (traces == null) {
			traces = new EObjectContainmentEList<Trace>(Trace.class, this, Time4sysPackage.PROJECT__TRACES);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignModel> getDerivations() {
		if (derivations == null) {
			derivations = new EObjectContainmentEList<DesignModel>(DesignModel.class, this, Time4sysPackage.PROJECT__DERIVATIONS);
		}
		return derivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation> getTransformations() {
		if (transformations == null) {
			transformations = new EObjectContainmentEList<Transformation>(Transformation.class, this, Time4sysPackage.PROJECT__TRANSFORMATIONS);
		}
		return transformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Simulation> getSimulations() {
		if (simulations == null) {
			simulations = new EObjectContainmentEList<Simulation>(Simulation.class, this, Time4sysPackage.PROJECT__SIMULATIONS);
		}
		return simulations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Transformation derive(final DesignModel source) {
		return IdentityDerivation.duplicate(this, source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Time4sysPackage.PROJECT__DESIGN:
				return basicSetDesign(null, msgs);
			case Time4sysPackage.PROJECT__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
			case Time4sysPackage.PROJECT__TRACES:
				return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
			case Time4sysPackage.PROJECT__DERIVATIONS:
				return ((InternalEList<?>)getDerivations()).basicRemove(otherEnd, msgs);
			case Time4sysPackage.PROJECT__TRANSFORMATIONS:
				return ((InternalEList<?>)getTransformations()).basicRemove(otherEnd, msgs);
			case Time4sysPackage.PROJECT__SIMULATIONS:
				return ((InternalEList<?>)getSimulations()).basicRemove(otherEnd, msgs);
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
			case Time4sysPackage.PROJECT__DESIGN:
				return getDesign();
			case Time4sysPackage.PROJECT__NAME:
				return getName();
			case Time4sysPackage.PROJECT__MAPPINGS:
				return getMappings();
			case Time4sysPackage.PROJECT__TRACES:
				return getTraces();
			case Time4sysPackage.PROJECT__DERIVATIONS:
				return getDerivations();
			case Time4sysPackage.PROJECT__TRANSFORMATIONS:
				return getTransformations();
			case Time4sysPackage.PROJECT__SIMULATIONS:
				return getSimulations();
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
			case Time4sysPackage.PROJECT__DESIGN:
				setDesign((DesignModel)newValue);
				return;
			case Time4sysPackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case Time4sysPackage.PROJECT__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends Mapping>)newValue);
				return;
			case Time4sysPackage.PROJECT__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case Time4sysPackage.PROJECT__DERIVATIONS:
				getDerivations().clear();
				getDerivations().addAll((Collection<? extends DesignModel>)newValue);
				return;
			case Time4sysPackage.PROJECT__TRANSFORMATIONS:
				getTransformations().clear();
				getTransformations().addAll((Collection<? extends Transformation>)newValue);
				return;
			case Time4sysPackage.PROJECT__SIMULATIONS:
				getSimulations().clear();
				getSimulations().addAll((Collection<? extends Simulation>)newValue);
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
			case Time4sysPackage.PROJECT__DESIGN:
				setDesign((DesignModel)null);
				return;
			case Time4sysPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Time4sysPackage.PROJECT__MAPPINGS:
				getMappings().clear();
				return;
			case Time4sysPackage.PROJECT__TRACES:
				getTraces().clear();
				return;
			case Time4sysPackage.PROJECT__DERIVATIONS:
				getDerivations().clear();
				return;
			case Time4sysPackage.PROJECT__TRANSFORMATIONS:
				getTransformations().clear();
				return;
			case Time4sysPackage.PROJECT__SIMULATIONS:
				getSimulations().clear();
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
			case Time4sysPackage.PROJECT__DESIGN:
				return design != null;
			case Time4sysPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Time4sysPackage.PROJECT__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
			case Time4sysPackage.PROJECT__TRACES:
				return traces != null && !traces.isEmpty();
			case Time4sysPackage.PROJECT__DERIVATIONS:
				return derivations != null && !derivations.isEmpty();
			case Time4sysPackage.PROJECT__TRANSFORMATIONS:
				return transformations != null && !transformations.isEmpty();
			case Time4sysPackage.PROJECT__SIMULATIONS:
				return simulations != null && !simulations.isEmpty();
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

} //ProjectImpl
