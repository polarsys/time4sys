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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue;
import org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TruthType;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expected Evaluation Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ExpectedEvaluationValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.ExpectedEvaluationValueImpl#getAssociatedRule <em>Associated Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpectedEvaluationValueImpl extends MinimalEObjectImpl.Container implements ExpectedEvaluationValue {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final TruthType VALUE_EDEFAULT = TruthType.TRUE;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected TruthType value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociatedRule() <em>Associated Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedRule()
	 * @generated
	 * @ordered
	 */
	protected IdentificationRule associatedRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpectedEvaluationValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyscoPackage.Literals.EXPECTED_EVALUATION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TruthType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(TruthType newValue) {
		TruthType oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.EXPECTED_EVALUATION_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentificationRule getAssociatedRule() {
		if (associatedRule != null && associatedRule.eIsProxy()) {
			InternalEObject oldAssociatedRule = (InternalEObject)associatedRule;
			associatedRule = (IdentificationRule)eResolveProxy(oldAssociatedRule);
			if (associatedRule != oldAssociatedRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyscoPackage.EXPECTED_EVALUATION_VALUE__ASSOCIATED_RULE, oldAssociatedRule, associatedRule));
			}
		}
		return associatedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentificationRule basicGetAssociatedRule() {
		return associatedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedRule(IdentificationRule newAssociatedRule) {
		IdentificationRule oldAssociatedRule = associatedRule;
		associatedRule = newAssociatedRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.EXPECTED_EVALUATION_VALUE__ASSOCIATED_RULE, oldAssociatedRule, associatedRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyscoPackage.EXPECTED_EVALUATION_VALUE__VALUE:
				return getValue();
			case TyscoPackage.EXPECTED_EVALUATION_VALUE__ASSOCIATED_RULE:
				if (resolve) return getAssociatedRule();
				return basicGetAssociatedRule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TyscoPackage.EXPECTED_EVALUATION_VALUE__VALUE:
				setValue((TruthType)newValue);
				return;
			case TyscoPackage.EXPECTED_EVALUATION_VALUE__ASSOCIATED_RULE:
				setAssociatedRule((IdentificationRule)newValue);
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
			case TyscoPackage.EXPECTED_EVALUATION_VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case TyscoPackage.EXPECTED_EVALUATION_VALUE__ASSOCIATED_RULE:
				setAssociatedRule((IdentificationRule)null);
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
			case TyscoPackage.EXPECTED_EVALUATION_VALUE__VALUE:
				return value != VALUE_EDEFAULT;
			case TyscoPackage.EXPECTED_EVALUATION_VALUE__ASSOCIATED_RULE:
				return associatedRule != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ExpectedEvaluationValueImpl
