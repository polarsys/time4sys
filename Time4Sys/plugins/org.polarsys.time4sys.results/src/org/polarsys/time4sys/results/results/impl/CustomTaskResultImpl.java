/**
 */
package org.polarsys.time4sys.results.results.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.time4sys.results.results.CustomTaskResult;
import org.polarsys.time4sys.results.results.ResultsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Task Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.CustomTaskResultImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.CustomTaskResultImpl#getBusyWindowLength <em>Busy Window Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomTaskResultImpl extends TaskResultImpl implements CustomTaskResult {
	/**
	 * The default value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final int BUFFER_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected int bufferSize = BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusyWindowLength() <em>Busy Window Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusyWindowLength()
	 * @generated
	 * @ordered
	 */
	protected static final int BUSY_WINDOW_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBusyWindowLength() <em>Busy Window Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusyWindowLength()
	 * @generated
	 * @ordered
	 */
	protected int busyWindowLength = BUSY_WINDOW_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomTaskResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.CUSTOM_TASK_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBufferSize() {
		return bufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferSize(int newBufferSize) {
		int oldBufferSize = bufferSize;
		bufferSize = newBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.CUSTOM_TASK_RESULT__BUFFER_SIZE, oldBufferSize, bufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBusyWindowLength() {
		return busyWindowLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusyWindowLength(int newBusyWindowLength) {
		int oldBusyWindowLength = busyWindowLength;
		busyWindowLength = newBusyWindowLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.CUSTOM_TASK_RESULT__BUSY_WINDOW_LENGTH, oldBusyWindowLength, busyWindowLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultsPackage.CUSTOM_TASK_RESULT__BUFFER_SIZE:
				return getBufferSize();
			case ResultsPackage.CUSTOM_TASK_RESULT__BUSY_WINDOW_LENGTH:
				return getBusyWindowLength();
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
			case ResultsPackage.CUSTOM_TASK_RESULT__BUFFER_SIZE:
				setBufferSize((Integer)newValue);
				return;
			case ResultsPackage.CUSTOM_TASK_RESULT__BUSY_WINDOW_LENGTH:
				setBusyWindowLength((Integer)newValue);
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
			case ResultsPackage.CUSTOM_TASK_RESULT__BUFFER_SIZE:
				setBufferSize(BUFFER_SIZE_EDEFAULT);
				return;
			case ResultsPackage.CUSTOM_TASK_RESULT__BUSY_WINDOW_LENGTH:
				setBusyWindowLength(BUSY_WINDOW_LENGTH_EDEFAULT);
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
			case ResultsPackage.CUSTOM_TASK_RESULT__BUFFER_SIZE:
				return bufferSize != BUFFER_SIZE_EDEFAULT;
			case ResultsPackage.CUSTOM_TASK_RESULT__BUSY_WINDOW_LENGTH:
				return busyWindowLength != BUSY_WINDOW_LENGTH_EDEFAULT;
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
		result.append(" (bufferSize: ");
		result.append(bufferSize);
		result.append(", busyWindowLength: ");
		result.append(busyWindowLength);
		result.append(')');
		return result.toString();
	}

} //CustomTaskResultImpl
