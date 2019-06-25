/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Yassine OUHAMMOU- initial API and implementation
 *
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco.impl;

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
import org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel;
import org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule;
import org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.Test;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.AnalysisRepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.AnalysisRepositoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.AnalysisRepositoryImpl#getAllContextModels <em>All Context Models</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.AnalysisRepositoryImpl#getAllRules <em>All Rules</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.AnalysisRepositoryImpl#getAllTests <em>All Tests</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.AnalysisRepositoryImpl#getAllInnerTransfos <em>All Inner Transfos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisRepositoryImpl extends MinimalEObjectImpl.Container implements AnalysisRepository {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllContextModels() <em>All Context Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllContextModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextModel> allContextModels;

	/**
	 * The cached value of the '{@link #getAllRules() <em>All Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllRules()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationRule> allRules;

	/**
	 * The cached value of the '{@link #getAllTests() <em>All Tests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllTests()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> allTests;

	/**
	 * The cached value of the '{@link #getAllInnerTransfos() <em>All Inner Transfos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllInnerTransfos()
	 * @generated
	 * @ordered
	 */
	protected EList<InnerTransformation> allInnerTransfos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyscoPackage.Literals.ANALYSIS_REPOSITORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.ANALYSIS_REPOSITORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.ANALYSIS_REPOSITORY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextModel> getAllContextModels() {
		if (allContextModels == null) {
			allContextModels = new EObjectContainmentEList<ContextModel>(ContextModel.class, this, TyscoPackage.ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS);
		}
		return allContextModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationRule> getAllRules() {
		if (allRules == null) {
			allRules = new EObjectContainmentEList<IdentificationRule>(IdentificationRule.class, this, TyscoPackage.ANALYSIS_REPOSITORY__ALL_RULES);
		}
		return allRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Test> getAllTests() {
		if (allTests == null) {
			allTests = new EObjectContainmentEList<Test>(Test.class, this, TyscoPackage.ANALYSIS_REPOSITORY__ALL_TESTS);
		}
		return allTests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InnerTransformation> getAllInnerTransfos() {
		if (allInnerTransfos == null) {
			allInnerTransfos = new EObjectContainmentEList<InnerTransformation>(InnerTransformation.class, this, TyscoPackage.ANALYSIS_REPOSITORY__ALL_INNER_TRANSFOS);
		}
		return allInnerTransfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS:
				return ((InternalEList<?>)getAllContextModels()).basicRemove(otherEnd, msgs);
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_RULES:
				return ((InternalEList<?>)getAllRules()).basicRemove(otherEnd, msgs);
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_TESTS:
				return ((InternalEList<?>)getAllTests()).basicRemove(otherEnd, msgs);
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_INNER_TRANSFOS:
				return ((InternalEList<?>)getAllInnerTransfos()).basicRemove(otherEnd, msgs);
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
			case TyscoPackage.ANALYSIS_REPOSITORY__NAME:
				return getName();
			case TyscoPackage.ANALYSIS_REPOSITORY__DESCRIPTION:
				return getDescription();
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS:
				return getAllContextModels();
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_RULES:
				return getAllRules();
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_TESTS:
				return getAllTests();
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_INNER_TRANSFOS:
				return getAllInnerTransfos();
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
			case TyscoPackage.ANALYSIS_REPOSITORY__NAME:
				setName((String)newValue);
				return;
			case TyscoPackage.ANALYSIS_REPOSITORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS:
				getAllContextModels().clear();
				getAllContextModels().addAll((Collection<? extends ContextModel>)newValue);
				return;
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_RULES:
				getAllRules().clear();
				getAllRules().addAll((Collection<? extends IdentificationRule>)newValue);
				return;
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_TESTS:
				getAllTests().clear();
				getAllTests().addAll((Collection<? extends Test>)newValue);
				return;
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_INNER_TRANSFOS:
				getAllInnerTransfos().clear();
				getAllInnerTransfos().addAll((Collection<? extends InnerTransformation>)newValue);
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
			case TyscoPackage.ANALYSIS_REPOSITORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TyscoPackage.ANALYSIS_REPOSITORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS:
				getAllContextModels().clear();
				return;
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_RULES:
				getAllRules().clear();
				return;
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_TESTS:
				getAllTests().clear();
				return;
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_INNER_TRANSFOS:
				getAllInnerTransfos().clear();
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
			case TyscoPackage.ANALYSIS_REPOSITORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TyscoPackage.ANALYSIS_REPOSITORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS:
				return allContextModels != null && !allContextModels.isEmpty();
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_RULES:
				return allRules != null && !allRules.isEmpty();
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_TESTS:
				return allTests != null && !allTests.isEmpty();
			case TyscoPackage.ANALYSIS_REPOSITORY__ALL_INNER_TRANSFOS:
				return allInnerTransfos != null && !allInnerTransfos.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AnalysisRepositoryImpl
