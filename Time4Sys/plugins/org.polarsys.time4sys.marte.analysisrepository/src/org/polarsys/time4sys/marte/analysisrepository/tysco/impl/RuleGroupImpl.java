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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue;
import org.polarsys.time4sys.marte.analysisrepository.tysco.JunctionType;
import org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.RuleGroupImpl#getSubGroups <em>Sub Groups</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.RuleGroupImpl#getExpectedRuleValues <em>Expected Rule Values</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.RuleGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.RuleGroupImpl#getJunctionType <em>Junction Type</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.RuleGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.RuleGroupImpl#getContextmodel <em>Contextmodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleGroupImpl extends MinimalEObjectImpl.Container implements RuleGroup {
	/**
	 * The cached value of the '{@link #getSubGroups() <em>Sub Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleGroup> subGroups;

	/**
	 * The cached value of the '{@link #getExpectedRuleValues() <em>Expected Rule Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedRuleValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpectedEvaluationValue> expectedRuleValues;

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
	 * The default value of the '{@link #getJunctionType() <em>Junction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJunctionType()
	 * @generated
	 * @ordered
	 */
	protected static final JunctionType JUNCTION_TYPE_EDEFAULT = JunctionType.AND;

	/**
	 * The cached value of the '{@link #getJunctionType() <em>Junction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJunctionType()
	 * @generated
	 * @ordered
	 */
	protected JunctionType junctionType = JUNCTION_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyscoPackage.Literals.RULE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleGroup> getSubGroups() {
		if (subGroups == null) {
			subGroups = new EObjectResolvingEList<RuleGroup>(RuleGroup.class, this, TyscoPackage.RULE_GROUP__SUB_GROUPS);
		}
		return subGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpectedEvaluationValue> getExpectedRuleValues() {
		if (expectedRuleValues == null) {
			expectedRuleValues = new EObjectResolvingEList<ExpectedEvaluationValue>(ExpectedEvaluationValue.class, this, TyscoPackage.RULE_GROUP__EXPECTED_RULE_VALUES);
		}
		return expectedRuleValues;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.RULE_GROUP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JunctionType getJunctionType() {
		return junctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJunctionType(JunctionType newJunctionType) {
		JunctionType oldJunctionType = junctionType;
		junctionType = newJunctionType == null ? JUNCTION_TYPE_EDEFAULT : newJunctionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.RULE_GROUP__JUNCTION_TYPE, oldJunctionType, junctionType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.RULE_GROUP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel getContextmodel() {
		if (eContainerFeatureID() != TyscoPackage.RULE_GROUP__CONTEXTMODEL) return null;
		return (ContextModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextmodel(ContextModel newContextmodel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContextmodel, TyscoPackage.RULE_GROUP__CONTEXTMODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextmodel(ContextModel newContextmodel) {
		if (newContextmodel != eInternalContainer() || (eContainerFeatureID() != TyscoPackage.RULE_GROUP__CONTEXTMODEL && newContextmodel != null)) {
			if (EcoreUtil.isAncestor(this, newContextmodel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContextmodel != null)
				msgs = ((InternalEObject)newContextmodel).eInverseAdd(this, TyscoPackage.CONTEXT_MODEL__RULE_GROUPS, ContextModel.class, msgs);
			msgs = basicSetContextmodel(newContextmodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.RULE_GROUP__CONTEXTMODEL, newContextmodel, newContextmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyscoPackage.RULE_GROUP__CONTEXTMODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContextmodel((ContextModel)otherEnd, msgs);
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
			case TyscoPackage.RULE_GROUP__CONTEXTMODEL:
				return basicSetContextmodel(null, msgs);
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
			case TyscoPackage.RULE_GROUP__CONTEXTMODEL:
				return eInternalContainer().eInverseRemove(this, TyscoPackage.CONTEXT_MODEL__RULE_GROUPS, ContextModel.class, msgs);
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
			case TyscoPackage.RULE_GROUP__SUB_GROUPS:
				return getSubGroups();
			case TyscoPackage.RULE_GROUP__EXPECTED_RULE_VALUES:
				return getExpectedRuleValues();
			case TyscoPackage.RULE_GROUP__ID:
				return getId();
			case TyscoPackage.RULE_GROUP__JUNCTION_TYPE:
				return getJunctionType();
			case TyscoPackage.RULE_GROUP__DESCRIPTION:
				return getDescription();
			case TyscoPackage.RULE_GROUP__CONTEXTMODEL:
				return getContextmodel();
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
			case TyscoPackage.RULE_GROUP__SUB_GROUPS:
				getSubGroups().clear();
				getSubGroups().addAll((Collection<? extends RuleGroup>)newValue);
				return;
			case TyscoPackage.RULE_GROUP__EXPECTED_RULE_VALUES:
				getExpectedRuleValues().clear();
				getExpectedRuleValues().addAll((Collection<? extends ExpectedEvaluationValue>)newValue);
				return;
			case TyscoPackage.RULE_GROUP__ID:
				setId((Integer)newValue);
				return;
			case TyscoPackage.RULE_GROUP__JUNCTION_TYPE:
				setJunctionType((JunctionType)newValue);
				return;
			case TyscoPackage.RULE_GROUP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TyscoPackage.RULE_GROUP__CONTEXTMODEL:
				setContextmodel((ContextModel)newValue);
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
			case TyscoPackage.RULE_GROUP__SUB_GROUPS:
				getSubGroups().clear();
				return;
			case TyscoPackage.RULE_GROUP__EXPECTED_RULE_VALUES:
				getExpectedRuleValues().clear();
				return;
			case TyscoPackage.RULE_GROUP__ID:
				setId(ID_EDEFAULT);
				return;
			case TyscoPackage.RULE_GROUP__JUNCTION_TYPE:
				setJunctionType(JUNCTION_TYPE_EDEFAULT);
				return;
			case TyscoPackage.RULE_GROUP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TyscoPackage.RULE_GROUP__CONTEXTMODEL:
				setContextmodel((ContextModel)null);
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
			case TyscoPackage.RULE_GROUP__SUB_GROUPS:
				return subGroups != null && !subGroups.isEmpty();
			case TyscoPackage.RULE_GROUP__EXPECTED_RULE_VALUES:
				return expectedRuleValues != null && !expectedRuleValues.isEmpty();
			case TyscoPackage.RULE_GROUP__ID:
				return id != ID_EDEFAULT;
			case TyscoPackage.RULE_GROUP__JUNCTION_TYPE:
				return junctionType != JUNCTION_TYPE_EDEFAULT;
			case TyscoPackage.RULE_GROUP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TyscoPackage.RULE_GROUP__CONTEXTMODEL:
				return getContextmodel() != null;
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
		result.append(", junctionType: ");
		result.append(junctionType);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RuleGroupImpl
