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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identification Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.IdentificationRuleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.IdentificationRuleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.IdentificationRuleImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.IdentificationRuleImpl#getRequiredRules <em>Required Rules</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.IdentificationRuleImpl#getEquivalentRules <em>Equivalent Rules</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.IdentificationRuleImpl#getConflictualRules <em>Conflictual Rules</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.IdentificationRuleImpl#getFormalExpression <em>Formal Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentificationRuleImpl extends MinimalEObjectImpl.Container implements IdentificationRule {
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
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredRules() <em>Required Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRules()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationRule> requiredRules;

	/**
	 * The cached value of the '{@link #getEquivalentRules() <em>Equivalent Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentRules()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationRule> equivalentRules;

	/**
	 * The cached value of the '{@link #getConflictualRules() <em>Conflictual Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflictualRules()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationRule> conflictualRules;

	/**
	 * The default value of the '{@link #getFormalExpression() <em>Formal Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormalExpression() <em>Formal Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalExpression()
	 * @generated
	 * @ordered
	 */
	protected String formalExpression = FORMAL_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentificationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyscoPackage.Literals.IDENTIFICATION_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.IDENTIFICATION_RULE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.IDENTIFICATION_RULE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.IDENTIFICATION_RULE__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationRule> getRequiredRules() {
		if (requiredRules == null) {
			requiredRules = new EObjectResolvingEList<IdentificationRule>(IdentificationRule.class, this, TyscoPackage.IDENTIFICATION_RULE__REQUIRED_RULES);
		}
		return requiredRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationRule> getEquivalentRules() {
		if (equivalentRules == null) {
			equivalentRules = new EObjectResolvingEList<IdentificationRule>(IdentificationRule.class, this, TyscoPackage.IDENTIFICATION_RULE__EQUIVALENT_RULES);
		}
		return equivalentRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationRule> getConflictualRules() {
		if (conflictualRules == null) {
			conflictualRules = new EObjectResolvingEList<IdentificationRule>(IdentificationRule.class, this, TyscoPackage.IDENTIFICATION_RULE__CONFLICTUAL_RULES);
		}
		return conflictualRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormalExpression() {
		return formalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormalExpression(String newFormalExpression) {
		String oldFormalExpression = formalExpression;
		formalExpression = newFormalExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.IDENTIFICATION_RULE__FORMAL_EXPRESSION, oldFormalExpression, formalExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyscoPackage.IDENTIFICATION_RULE__ID:
				return getId();
			case TyscoPackage.IDENTIFICATION_RULE__DESCRIPTION:
				return getDescription();
			case TyscoPackage.IDENTIFICATION_RULE__CONTENT:
				return getContent();
			case TyscoPackage.IDENTIFICATION_RULE__REQUIRED_RULES:
				return getRequiredRules();
			case TyscoPackage.IDENTIFICATION_RULE__EQUIVALENT_RULES:
				return getEquivalentRules();
			case TyscoPackage.IDENTIFICATION_RULE__CONFLICTUAL_RULES:
				return getConflictualRules();
			case TyscoPackage.IDENTIFICATION_RULE__FORMAL_EXPRESSION:
				return getFormalExpression();
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
			case TyscoPackage.IDENTIFICATION_RULE__ID:
				setId((Integer)newValue);
				return;
			case TyscoPackage.IDENTIFICATION_RULE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TyscoPackage.IDENTIFICATION_RULE__CONTENT:
				setContent((String)newValue);
				return;
			case TyscoPackage.IDENTIFICATION_RULE__REQUIRED_RULES:
				getRequiredRules().clear();
				getRequiredRules().addAll((Collection<? extends IdentificationRule>)newValue);
				return;
			case TyscoPackage.IDENTIFICATION_RULE__EQUIVALENT_RULES:
				getEquivalentRules().clear();
				getEquivalentRules().addAll((Collection<? extends IdentificationRule>)newValue);
				return;
			case TyscoPackage.IDENTIFICATION_RULE__CONFLICTUAL_RULES:
				getConflictualRules().clear();
				getConflictualRules().addAll((Collection<? extends IdentificationRule>)newValue);
				return;
			case TyscoPackage.IDENTIFICATION_RULE__FORMAL_EXPRESSION:
				setFormalExpression((String)newValue);
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
			case TyscoPackage.IDENTIFICATION_RULE__ID:
				setId(ID_EDEFAULT);
				return;
			case TyscoPackage.IDENTIFICATION_RULE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TyscoPackage.IDENTIFICATION_RULE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case TyscoPackage.IDENTIFICATION_RULE__REQUIRED_RULES:
				getRequiredRules().clear();
				return;
			case TyscoPackage.IDENTIFICATION_RULE__EQUIVALENT_RULES:
				getEquivalentRules().clear();
				return;
			case TyscoPackage.IDENTIFICATION_RULE__CONFLICTUAL_RULES:
				getConflictualRules().clear();
				return;
			case TyscoPackage.IDENTIFICATION_RULE__FORMAL_EXPRESSION:
				setFormalExpression(FORMAL_EXPRESSION_EDEFAULT);
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
			case TyscoPackage.IDENTIFICATION_RULE__ID:
				return id != ID_EDEFAULT;
			case TyscoPackage.IDENTIFICATION_RULE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TyscoPackage.IDENTIFICATION_RULE__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case TyscoPackage.IDENTIFICATION_RULE__REQUIRED_RULES:
				return requiredRules != null && !requiredRules.isEmpty();
			case TyscoPackage.IDENTIFICATION_RULE__EQUIVALENT_RULES:
				return equivalentRules != null && !equivalentRules.isEmpty();
			case TyscoPackage.IDENTIFICATION_RULE__CONFLICTUAL_RULES:
				return conflictualRules != null && !conflictualRules.isEmpty();
			case TyscoPackage.IDENTIFICATION_RULE__FORMAL_EXPRESSION:
				return FORMAL_EXPRESSION_EDEFAULT == null ? formalExpression != null : !FORMAL_EXPRESSION_EDEFAULT.equals(formalExpression);
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
		result.append(", description: ");
		result.append(description);
		result.append(", content: ");
		result.append(content);
		result.append(", formalExpression: ");
		result.append(formalExpression);
		result.append(')');
		return result.toString();
	}

} //IdentificationRuleImpl
