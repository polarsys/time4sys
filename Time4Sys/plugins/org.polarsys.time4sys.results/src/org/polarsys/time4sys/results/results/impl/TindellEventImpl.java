/**
 */
package org.polarsys.time4sys.results.results.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.time4sys.results.results.ResultsPackage;
import org.polarsys.time4sys.results.results.TindellEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tindell Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TindellEventImpl#getBurstSize <em>Burst Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TindellEventImpl#getInnerPeriod <em>Inner Period</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TindellEventImpl#getOuterPeriod <em>Outer Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TindellEventImpl extends EventImpl implements TindellEvent {
	/**
	 * The default value of the '{@link #getBurstSize() <em>Burst Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurstSize()
	 * @generated
	 * @ordered
	 */
	protected static final int BURST_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBurstSize() <em>Burst Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurstSize()
	 * @generated
	 * @ordered
	 */
	protected int burstSize = BURST_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInnerPeriod() <em>Inner Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int INNER_PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInnerPeriod() <em>Inner Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerPeriod()
	 * @generated
	 * @ordered
	 */
	protected int innerPeriod = INNER_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOuterPeriod() <em>Outer Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int OUTER_PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOuterPeriod() <em>Outer Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterPeriod()
	 * @generated
	 * @ordered
	 */
	protected int outerPeriod = OUTER_PERIOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TindellEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.TINDELL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBurstSize() {
		return burstSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBurstSize(int newBurstSize) {
		int oldBurstSize = burstSize;
		burstSize = newBurstSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TINDELL_EVENT__BURST_SIZE, oldBurstSize, burstSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInnerPeriod() {
		return innerPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerPeriod(int newInnerPeriod) {
		int oldInnerPeriod = innerPeriod;
		innerPeriod = newInnerPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TINDELL_EVENT__INNER_PERIOD, oldInnerPeriod, innerPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOuterPeriod() {
		return outerPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterPeriod(int newOuterPeriod) {
		int oldOuterPeriod = outerPeriod;
		outerPeriod = newOuterPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TINDELL_EVENT__OUTER_PERIOD, oldOuterPeriod, outerPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultsPackage.TINDELL_EVENT__BURST_SIZE:
				return getBurstSize();
			case ResultsPackage.TINDELL_EVENT__INNER_PERIOD:
				return getInnerPeriod();
			case ResultsPackage.TINDELL_EVENT__OUTER_PERIOD:
				return getOuterPeriod();
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
			case ResultsPackage.TINDELL_EVENT__BURST_SIZE:
				setBurstSize((Integer)newValue);
				return;
			case ResultsPackage.TINDELL_EVENT__INNER_PERIOD:
				setInnerPeriod((Integer)newValue);
				return;
			case ResultsPackage.TINDELL_EVENT__OUTER_PERIOD:
				setOuterPeriod((Integer)newValue);
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
			case ResultsPackage.TINDELL_EVENT__BURST_SIZE:
				setBurstSize(BURST_SIZE_EDEFAULT);
				return;
			case ResultsPackage.TINDELL_EVENT__INNER_PERIOD:
				setInnerPeriod(INNER_PERIOD_EDEFAULT);
				return;
			case ResultsPackage.TINDELL_EVENT__OUTER_PERIOD:
				setOuterPeriod(OUTER_PERIOD_EDEFAULT);
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
			case ResultsPackage.TINDELL_EVENT__BURST_SIZE:
				return burstSize != BURST_SIZE_EDEFAULT;
			case ResultsPackage.TINDELL_EVENT__INNER_PERIOD:
				return innerPeriod != INNER_PERIOD_EDEFAULT;
			case ResultsPackage.TINDELL_EVENT__OUTER_PERIOD:
				return outerPeriod != OUTER_PERIOD_EDEFAULT;
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
		result.append(" (burstSize: ");
		result.append(burstSize);
		result.append(", innerPeriod: ");
		result.append(innerPeriod);
		result.append(", outerPeriod: ");
		result.append(outerPeriod);
		result.append(')');
		return result.toString();
	}

} //TindellEventImpl
