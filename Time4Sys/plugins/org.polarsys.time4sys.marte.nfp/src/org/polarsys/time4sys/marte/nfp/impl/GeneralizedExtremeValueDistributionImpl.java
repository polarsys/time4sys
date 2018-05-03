/*******************************************************************************
 * Copyright (c) 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.nfp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.GeneralizedExtremeValueDistribution;
import org.polarsys.time4sys.marte.nfp.NfpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalized Extreme Value Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.GeneralizedExtremeValueDistributionImpl#getMu <em>Mu</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.GeneralizedExtremeValueDistributionImpl#getSigma <em>Sigma</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.GeneralizedExtremeValueDistributionImpl#getXi <em>Xi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizedExtremeValueDistributionImpl extends ProbabilisticDurationImpl implements GeneralizedExtremeValueDistribution {
	/**
	 * The default value of the '{@link #getMu() <em>Mu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu()
	 * @generated
	 * @ordered
	 */
	protected static final Duration MU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMu() <em>Mu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu()
	 * @generated
	 * @ordered
	 */
	protected Duration mu = MU_EDEFAULT;

	/**
	 * The default value of the '{@link #getSigma() <em>Sigma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigma()
	 * @generated
	 * @ordered
	 */
	protected static final Duration SIGMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSigma() <em>Sigma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigma()
	 * @generated
	 * @ordered
	 */
	protected Duration sigma = SIGMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getXi() <em>Xi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXi()
	 * @generated
	 * @ordered
	 */
	protected static final Duration XI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXi() <em>Xi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXi()
	 * @generated
	 * @ordered
	 */
	protected Duration xi = XI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizedExtremeValueDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NfpPackage.Literals.GENERALIZED_EXTREME_VALUE_DISTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getMu() {
		return mu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMu(Duration newMu) {
		Duration oldMu = mu;
		mu = newMu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__MU, oldMu, mu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getSigma() {
		return sigma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSigma(Duration newSigma) {
		Duration oldSigma = sigma;
		sigma = newSigma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__SIGMA, oldSigma, sigma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getXi() {
		return xi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXi(Duration newXi) {
		Duration oldXi = xi;
		xi = newXi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__XI, oldXi, xi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__MU:
				return getMu();
			case NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__SIGMA:
				return getSigma();
			case NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__XI:
				return getXi();
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
			case NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__MU:
				setMu((Duration)newValue);
				return;
			case NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__SIGMA:
				setSigma((Duration)newValue);
				return;
			case NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__XI:
				setXi((Duration)newValue);
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
			case NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__MU:
				setMu(MU_EDEFAULT);
				return;
			case NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__SIGMA:
				setSigma(SIGMA_EDEFAULT);
				return;
			case NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__XI:
				setXi(XI_EDEFAULT);
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
			case NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__MU:
				return MU_EDEFAULT == null ? mu != null : !MU_EDEFAULT.equals(mu);
			case NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__SIGMA:
				return SIGMA_EDEFAULT == null ? sigma != null : !SIGMA_EDEFAULT.equals(sigma);
			case NfpPackage.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__XI:
				return XI_EDEFAULT == null ? xi != null : !XI_EDEFAULT.equals(xi);
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
		result.append(" (mu: ");
		result.append(mu);
		result.append(", sigma: ");
		result.append(sigma);
		result.append(", xi: ");
		result.append(xi);
		result.append(')');
		return result.toString();
	}

} //GeneralizedExtremeValueDistributionImpl
