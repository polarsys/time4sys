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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue;
import org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup;
import org.polarsys.time4sys.marte.analysisrepository.tysco.Test;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ContextModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ContextModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ContextModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ContextModelImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ContextModelImpl#getRefinedContexts <em>Refined Contexts</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ContextModelImpl#getAnalysisTests <em>Analysis Tests</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ContextModelImpl#getRootGroup <em>Root Group</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ContextModelImpl#getTruthValues <em>Truth Values</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ContextModelImpl#getRuleGroups <em>Rule Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextModelImpl extends MinimalEObjectImpl.Container implements ContextModel {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getReferences() <em>References</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> references;

	/**
	 * The cached value of the '{@link #getRefinedContexts() <em>Refined Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextModel> refinedContexts;

	/**
	 * The cached value of the '{@link #getAnalysisTests() <em>Analysis Tests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisTests()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> analysisTests;

	/**
	 * The cached value of the '{@link #getRootGroup() <em>Root Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootGroup()
	 * @generated
	 * @ordered
	 */
	protected RuleGroup rootGroup;

	/**
	 * The cached value of the '{@link #getTruthValues() <em>Truth Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruthValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpectedEvaluationValue> truthValues;

	/**
	 * The cached value of the '{@link #getRuleGroups() <em>Rule Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleGroup> ruleGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyscoPackage.Literals.CONTEXT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.CONTEXT_MODEL__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.CONTEXT_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.CONTEXT_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReferences() {
		if (references == null) {
			references = new EDataTypeUniqueEList<String>(String.class, this, TyscoPackage.CONTEXT_MODEL__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextModel> getRefinedContexts() {
		if (refinedContexts == null) {
			refinedContexts = new EObjectResolvingEList<ContextModel>(ContextModel.class, this, TyscoPackage.CONTEXT_MODEL__REFINED_CONTEXTS);
		}
		return refinedContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Test> getAnalysisTests() {
		if (analysisTests == null) {
			analysisTests = new EObjectResolvingEList<Test>(Test.class, this, TyscoPackage.CONTEXT_MODEL__ANALYSIS_TESTS);
		}
		return analysisTests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleGroup> getRuleGroups() {
		if (ruleGroups == null) {
			ruleGroups = new EObjectContainmentWithInverseEList<RuleGroup>(RuleGroup.class, this, TyscoPackage.CONTEXT_MODEL__RULE_GROUPS, TyscoPackage.RULE_GROUP__CONTEXTMODEL);
		}
		return ruleGroups;
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
			case TyscoPackage.CONTEXT_MODEL__RULE_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRuleGroups()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleGroup getRootGroup() {
		if (rootGroup != null && rootGroup.eIsProxy()) {
			InternalEObject oldRootGroup = (InternalEObject)rootGroup;
			rootGroup = (RuleGroup)eResolveProxy(oldRootGroup);
			if (rootGroup != oldRootGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyscoPackage.CONTEXT_MODEL__ROOT_GROUP, oldRootGroup, rootGroup));
			}
		}
		return rootGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleGroup basicGetRootGroup() {
		return rootGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootGroup(RuleGroup newRootGroup) {
		RuleGroup oldRootGroup = rootGroup;
		rootGroup = newRootGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.CONTEXT_MODEL__ROOT_GROUP, oldRootGroup, rootGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpectedEvaluationValue> getTruthValues() {
		if (truthValues == null) {
			truthValues = new EObjectContainmentEList<ExpectedEvaluationValue>(ExpectedEvaluationValue.class, this, TyscoPackage.CONTEXT_MODEL__TRUTH_VALUES);
		}
		return truthValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyscoPackage.CONTEXT_MODEL__TRUTH_VALUES:
				return ((InternalEList<?>)getTruthValues()).basicRemove(otherEnd, msgs);
			case TyscoPackage.CONTEXT_MODEL__RULE_GROUPS:
				return ((InternalEList<?>)getRuleGroups()).basicRemove(otherEnd, msgs);
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
			case TyscoPackage.CONTEXT_MODEL__ID:
				return getId();
			case TyscoPackage.CONTEXT_MODEL__NAME:
				return getName();
			case TyscoPackage.CONTEXT_MODEL__DESCRIPTION:
				return getDescription();
			case TyscoPackage.CONTEXT_MODEL__REFERENCES:
				return getReferences();
			case TyscoPackage.CONTEXT_MODEL__REFINED_CONTEXTS:
				return getRefinedContexts();
			case TyscoPackage.CONTEXT_MODEL__ANALYSIS_TESTS:
				return getAnalysisTests();
			case TyscoPackage.CONTEXT_MODEL__ROOT_GROUP:
				if (resolve) return getRootGroup();
				return basicGetRootGroup();
			case TyscoPackage.CONTEXT_MODEL__TRUTH_VALUES:
				return getTruthValues();
			case TyscoPackage.CONTEXT_MODEL__RULE_GROUPS:
				return getRuleGroups();
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
			case TyscoPackage.CONTEXT_MODEL__ID:
				setId((Integer)newValue);
				return;
			case TyscoPackage.CONTEXT_MODEL__NAME:
				setName((String)newValue);
				return;
			case TyscoPackage.CONTEXT_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TyscoPackage.CONTEXT_MODEL__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends String>)newValue);
				return;
			case TyscoPackage.CONTEXT_MODEL__REFINED_CONTEXTS:
				getRefinedContexts().clear();
				getRefinedContexts().addAll((Collection<? extends ContextModel>)newValue);
				return;
			case TyscoPackage.CONTEXT_MODEL__ANALYSIS_TESTS:
				getAnalysisTests().clear();
				getAnalysisTests().addAll((Collection<? extends Test>)newValue);
				return;
			case TyscoPackage.CONTEXT_MODEL__ROOT_GROUP:
				setRootGroup((RuleGroup)newValue);
				return;
			case TyscoPackage.CONTEXT_MODEL__TRUTH_VALUES:
				getTruthValues().clear();
				getTruthValues().addAll((Collection<? extends ExpectedEvaluationValue>)newValue);
				return;
			case TyscoPackage.CONTEXT_MODEL__RULE_GROUPS:
				getRuleGroups().clear();
				getRuleGroups().addAll((Collection<? extends RuleGroup>)newValue);
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
			case TyscoPackage.CONTEXT_MODEL__ID:
				setId(ID_EDEFAULT);
				return;
			case TyscoPackage.CONTEXT_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TyscoPackage.CONTEXT_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TyscoPackage.CONTEXT_MODEL__REFERENCES:
				getReferences().clear();
				return;
			case TyscoPackage.CONTEXT_MODEL__REFINED_CONTEXTS:
				getRefinedContexts().clear();
				return;
			case TyscoPackage.CONTEXT_MODEL__ANALYSIS_TESTS:
				getAnalysisTests().clear();
				return;
			case TyscoPackage.CONTEXT_MODEL__ROOT_GROUP:
				setRootGroup((RuleGroup)null);
				return;
			case TyscoPackage.CONTEXT_MODEL__TRUTH_VALUES:
				getTruthValues().clear();
				return;
			case TyscoPackage.CONTEXT_MODEL__RULE_GROUPS:
				getRuleGroups().clear();
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
			case TyscoPackage.CONTEXT_MODEL__ID:
				return id != ID_EDEFAULT;
			case TyscoPackage.CONTEXT_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TyscoPackage.CONTEXT_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TyscoPackage.CONTEXT_MODEL__REFERENCES:
				return references != null && !references.isEmpty();
			case TyscoPackage.CONTEXT_MODEL__REFINED_CONTEXTS:
				return refinedContexts != null && !refinedContexts.isEmpty();
			case TyscoPackage.CONTEXT_MODEL__ANALYSIS_TESTS:
				return analysisTests != null && !analysisTests.isEmpty();
			case TyscoPackage.CONTEXT_MODEL__ROOT_GROUP:
				return rootGroup != null;
			case TyscoPackage.CONTEXT_MODEL__TRUTH_VALUES:
				return truthValues != null && !truthValues.isEmpty();
			case TyscoPackage.CONTEXT_MODEL__RULE_GROUPS:
				return ruleGroups != null && !ruleGroups.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", references: ");
		result.append(references);
		result.append(')');
		return result.toString();
	}

} //ContextModelImpl
