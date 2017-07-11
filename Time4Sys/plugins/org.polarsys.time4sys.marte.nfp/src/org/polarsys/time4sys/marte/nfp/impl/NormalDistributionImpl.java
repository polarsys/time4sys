/**
 */
package org.polarsys.time4sys.marte.nfp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.nfp.NormalDistribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.NormalDistributionImpl#getMu <em>Mu</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.NormalDistributionImpl#getSigma <em>Sigma</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalDistributionImpl extends ProbabilisticDurationImpl implements NormalDistribution {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NfpPackage.Literals.NORMAL_DISTRIBUTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.NORMAL_DISTRIBUTION__MU, oldMu, mu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.NORMAL_DISTRIBUTION__SIGMA, oldSigma, sigma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NfpPackage.NORMAL_DISTRIBUTION__MU:
				return getMu();
			case NfpPackage.NORMAL_DISTRIBUTION__SIGMA:
				return getSigma();
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
			case NfpPackage.NORMAL_DISTRIBUTION__MU:
				setMu((Duration)newValue);
				return;
			case NfpPackage.NORMAL_DISTRIBUTION__SIGMA:
				setSigma((Duration)newValue);
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
			case NfpPackage.NORMAL_DISTRIBUTION__MU:
				setMu(MU_EDEFAULT);
				return;
			case NfpPackage.NORMAL_DISTRIBUTION__SIGMA:
				setSigma(SIGMA_EDEFAULT);
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
			case NfpPackage.NORMAL_DISTRIBUTION__MU:
				return MU_EDEFAULT == null ? mu != null : !MU_EDEFAULT.equals(mu);
			case NfpPackage.NORMAL_DISTRIBUTION__SIGMA:
				return SIGMA_EDEFAULT == null ? sigma != null : !SIGMA_EDEFAULT.equals(sigma);
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
		result.append(')');
		return result.toString();
	}

} //NormalDistributionImpl
