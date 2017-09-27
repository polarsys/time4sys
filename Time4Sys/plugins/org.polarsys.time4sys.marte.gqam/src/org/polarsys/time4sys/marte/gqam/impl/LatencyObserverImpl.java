/**
 */
package org.polarsys.time4sys.marte.gqam.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.LatencyObserver;

import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Latency Observer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.LatencyObserverImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.LatencyObserverImpl#getMissRatio <em>Miss Ratio</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.LatencyObserverImpl#getMaxJitter <em>Max Jitter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LatencyObserverImpl extends TimedObserverImpl implements LatencyObserver {
	/**
	 * The default value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected static final Duration LATENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected Duration latency = LATENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMissRatio() <em>Miss Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissRatio()
	 * @generated
	 * @ordered
	 */
	protected static final double MISS_RATIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMissRatio() <em>Miss Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissRatio()
	 * @generated
	 * @ordered
	 */
	protected double missRatio = MISS_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxJitter() <em>Max Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxJitter()
	 * @generated
	 * @ordered
	 */
	protected static final Duration MAX_JITTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxJitter() <em>Max Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxJitter()
	 * @generated
	 * @ordered
	 */
	protected Duration maxJitter = MAX_JITTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatencyObserverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.LATENCY_OBSERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(Duration newLatency) {
		Duration oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.LATENCY_OBSERVER__LATENCY, oldLatency, latency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMissRatio() {
		return missRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissRatio(double newMissRatio) {
		double oldMissRatio = missRatio;
		missRatio = newMissRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.LATENCY_OBSERVER__MISS_RATIO, oldMissRatio, missRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getMaxJitter() {
		return maxJitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxJitter(Duration newMaxJitter) {
		Duration oldMaxJitter = maxJitter;
		maxJitter = newMaxJitter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.LATENCY_OBSERVER__MAX_JITTER, oldMaxJitter, maxJitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GqamPackage.LATENCY_OBSERVER__LATENCY:
				return getLatency();
			case GqamPackage.LATENCY_OBSERVER__MISS_RATIO:
				return getMissRatio();
			case GqamPackage.LATENCY_OBSERVER__MAX_JITTER:
				return getMaxJitter();
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
			case GqamPackage.LATENCY_OBSERVER__LATENCY:
				setLatency((Duration)newValue);
				return;
			case GqamPackage.LATENCY_OBSERVER__MISS_RATIO:
				setMissRatio((Double)newValue);
				return;
			case GqamPackage.LATENCY_OBSERVER__MAX_JITTER:
				setMaxJitter((Duration)newValue);
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
			case GqamPackage.LATENCY_OBSERVER__LATENCY:
				setLatency(LATENCY_EDEFAULT);
				return;
			case GqamPackage.LATENCY_OBSERVER__MISS_RATIO:
				setMissRatio(MISS_RATIO_EDEFAULT);
				return;
			case GqamPackage.LATENCY_OBSERVER__MAX_JITTER:
				setMaxJitter(MAX_JITTER_EDEFAULT);
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
			case GqamPackage.LATENCY_OBSERVER__LATENCY:
				return LATENCY_EDEFAULT == null ? latency != null : !LATENCY_EDEFAULT.equals(latency);
			case GqamPackage.LATENCY_OBSERVER__MISS_RATIO:
				return missRatio != MISS_RATIO_EDEFAULT;
			case GqamPackage.LATENCY_OBSERVER__MAX_JITTER:
				return MAX_JITTER_EDEFAULT == null ? maxJitter != null : !MAX_JITTER_EDEFAULT.equals(maxJitter);
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
		result.append(" (latency: ");
		result.append(latency);
		result.append(", missRatio: ");
		result.append(missRatio);
		result.append(", maxJitter: ");
		result.append(maxJitter);
		result.append(')');
		return result.toString();
	}

} //LatencyObserverImpl
