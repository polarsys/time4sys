/**
 */
package org.polarsys.time4sys.results.results.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.results.results.ResultsPackage;
import org.polarsys.time4sys.results.results.SimpleSporadicEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Sporadic Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.SimpleSporadicEventImpl#getDMin <em>DMin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleSporadicEventImpl extends EventImpl implements SimpleSporadicEvent {
	/**
	 * The default value of the '{@link #getDMin() <em>DMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMin()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DMIN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDMin() <em>DMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMin()
	 * @generated
	 * @ordered
	 */
	protected Duration dMin = DMIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleSporadicEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.SIMPLE_SPORADIC_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDMin() {
		return dMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDMin(Duration newDMin) {
		Duration oldDMin = dMin;
		dMin = newDMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.SIMPLE_SPORADIC_EVENT__DMIN, oldDMin, dMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultsPackage.SIMPLE_SPORADIC_EVENT__DMIN:
				return getDMin();
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
			case ResultsPackage.SIMPLE_SPORADIC_EVENT__DMIN:
				setDMin((Duration)newValue);
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
			case ResultsPackage.SIMPLE_SPORADIC_EVENT__DMIN:
				setDMin(DMIN_EDEFAULT);
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
			case ResultsPackage.SIMPLE_SPORADIC_EVENT__DMIN:
				return DMIN_EDEFAULT == null ? dMin != null : !DMIN_EDEFAULT.equals(dMin);
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
		result.append(" (dMin: ");
		result.append(dMin);
		result.append(')');
		return result.toString();
	}

} //SimpleSporadicEventImpl
