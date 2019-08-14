/**
 */
package org.polarsys.time4sys.results.results.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.time4sys.results.results.ResultsPackage;
import org.polarsys.time4sys.results.results.SlidingWindowEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sliding Window Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.SlidingWindowEventImpl#getNbEvents <em>Nb Events</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.SlidingWindowEventImpl#getWindowSize <em>Window Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlidingWindowEventImpl extends EventImpl implements SlidingWindowEvent {
	/**
	 * The default value of the '{@link #getNbEvents() <em>Nb Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbEvents()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_EVENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbEvents() <em>Nb Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbEvents()
	 * @generated
	 * @ordered
	 */
	protected int nbEvents = NB_EVENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindowSize() <em>Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowSize()
	 * @generated
	 * @ordered
	 */
	protected static final int WINDOW_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWindowSize() <em>Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowSize()
	 * @generated
	 * @ordered
	 */
	protected int windowSize = WINDOW_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlidingWindowEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.SLIDING_WINDOW_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbEvents() {
		return nbEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbEvents(int newNbEvents) {
		int oldNbEvents = nbEvents;
		nbEvents = newNbEvents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.SLIDING_WINDOW_EVENT__NB_EVENTS, oldNbEvents, nbEvents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWindowSize() {
		return windowSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindowSize(int newWindowSize) {
		int oldWindowSize = windowSize;
		windowSize = newWindowSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.SLIDING_WINDOW_EVENT__WINDOW_SIZE, oldWindowSize, windowSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultsPackage.SLIDING_WINDOW_EVENT__NB_EVENTS:
				return getNbEvents();
			case ResultsPackage.SLIDING_WINDOW_EVENT__WINDOW_SIZE:
				return getWindowSize();
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
			case ResultsPackage.SLIDING_WINDOW_EVENT__NB_EVENTS:
				setNbEvents((Integer)newValue);
				return;
			case ResultsPackage.SLIDING_WINDOW_EVENT__WINDOW_SIZE:
				setWindowSize((Integer)newValue);
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
			case ResultsPackage.SLIDING_WINDOW_EVENT__NB_EVENTS:
				setNbEvents(NB_EVENTS_EDEFAULT);
				return;
			case ResultsPackage.SLIDING_WINDOW_EVENT__WINDOW_SIZE:
				setWindowSize(WINDOW_SIZE_EDEFAULT);
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
			case ResultsPackage.SLIDING_WINDOW_EVENT__NB_EVENTS:
				return nbEvents != NB_EVENTS_EDEFAULT;
			case ResultsPackage.SLIDING_WINDOW_EVENT__WINDOW_SIZE:
				return windowSize != WINDOW_SIZE_EDEFAULT;
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
		result.append(" (nbEvents: ");
		result.append(nbEvents);
		result.append(", windowSize: ");
		result.append(windowSize);
		result.append(')');
		return result.toString();
	}

} //SlidingWindowEventImpl
