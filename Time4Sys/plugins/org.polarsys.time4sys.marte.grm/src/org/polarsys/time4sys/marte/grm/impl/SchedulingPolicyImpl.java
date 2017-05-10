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
package org.polarsys.time4sys.marte.grm.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.grm.SchedulingPolicy;
import org.polarsys.time4sys.marte.grm.util.GrmValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Scheduling Policy</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.SchedulingPolicyImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.SchedulingPolicyImpl#getOtherSchedPolicy <em>Other Sched Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulingPolicyImpl extends AccessControlPolicyImpl implements SchedulingPolicy {
	/**
	 * The default value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final SchedPolicyKind POLICY_EDEFAULT = SchedPolicyKind.UNDEF;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected SchedPolicyKind policy = POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherSchedPolicy() <em>Other Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOtherSchedPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SCHED_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSchedPolicy() <em>Other Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOtherSchedPolicy()
	 * @generated
	 * @ordered
	 */
	protected String otherSchedPolicy = OTHER_SCHED_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public SchedulingPolicyImpl() {
		this(SchedPolicyKind.UNDEF);
	}

	/**
	 * @generated NOT
	 */
	protected SchedulingPolicyImpl(final String name) {
		super(name);
		this.policy = SchedPolicyKind.OTHER;
		assert (name != null);
		this.otherSchedPolicy = name;
	}

	/**
	 * @generated NOT
	 */
	protected SchedulingPolicyImpl(final SchedPolicyKind p) {
		super(p.getLiteral());
		this.policy = p;
		assert (name != null);
		this.otherSchedPolicy = null;
	}

	/**
	 * @generated NOT
	 */

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.SCHEDULING_POLICY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SchedPolicyKind getPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy(SchedPolicyKind newPolicy) {
		SchedPolicyKind oldPolicy = policy;
		policy = newPolicy == null ? POLICY_EDEFAULT : newPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.SCHEDULING_POLICY__POLICY, oldPolicy, policy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherSchedPolicy() {
		return otherSchedPolicy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherSchedPolicy(String newOtherSchedPolicy) {
		String oldOtherSchedPolicy = otherSchedPolicy;
		otherSchedPolicy = newOtherSchedPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.SCHEDULING_POLICY__OTHER_SCHED_POLICY, oldOtherSchedPolicy, otherSchedPolicy));
	}

	/**
	 * @generated NOT
	 */
	public boolean hasValidPolicy(DiagnosticChain diagnostics, Map<?, ?> context) {
		if (policy != null && policy == SchedPolicyKind.OTHER
				&& (otherSchedPolicy == null || otherSchedPolicy.isEmpty())) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, GrmValidator.DIAGNOSTIC_SOURCE,
						GrmValidator.SCHEDULING_POLICY__HAS_VALID_POLICY,

						GrmValidator.INSTANCE.getResourceLocator().getString("_UI_SchedPolicyInvariant_diagnostic",
								new Object[] { "hasValidPolicy",
										EObjectValidator.getObjectLabel(this, (Map<Object, Object>) context) }),

						new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrmPackage.SCHEDULING_POLICY__POLICY:
				return getPolicy();
			case GrmPackage.SCHEDULING_POLICY__OTHER_SCHED_POLICY:
				return getOtherSchedPolicy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GrmPackage.SCHEDULING_POLICY__POLICY:
				setPolicy((SchedPolicyKind)newValue);
				return;
			case GrmPackage.SCHEDULING_POLICY__OTHER_SCHED_POLICY:
				setOtherSchedPolicy((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GrmPackage.SCHEDULING_POLICY__POLICY:
				setPolicy(POLICY_EDEFAULT);
				return;
			case GrmPackage.SCHEDULING_POLICY__OTHER_SCHED_POLICY:
				setOtherSchedPolicy(OTHER_SCHED_POLICY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GrmPackage.SCHEDULING_POLICY__POLICY:
				return policy != POLICY_EDEFAULT;
			case GrmPackage.SCHEDULING_POLICY__OTHER_SCHED_POLICY:
				return OTHER_SCHED_POLICY_EDEFAULT == null ? otherSchedPolicy != null : !OTHER_SCHED_POLICY_EDEFAULT.equals(otherSchedPolicy);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GrmPackage.SCHEDULING_POLICY___HAS_VALID_POLICY__DIAGNOSTICCHAIN_MAP:
				return hasValidPolicy((DiagnosticChain)arguments.get(0), (Map<?, ?>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (policy: ");
		result.append(policy);
		result.append(", otherSchedPolicy: ");
		result.append(otherSchedPolicy);
		result.append(')');
		return result.toString();
	}

} // SchedulingPolicyImpl
