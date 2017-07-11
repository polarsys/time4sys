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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.grm.TimerResource;
import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.TimerResourceImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.TimerResourceImpl#isIsPeriodic <em>Is Periodic</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.TimerResourceImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.TimerResourceImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.TimerResourceImpl#getGet <em>Get</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.TimerResourceImpl#getReset <em>Reset</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.TimerResourceImpl#getPause <em>Pause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimerResourceImpl extends TimingResourceImpl implements TimerResource {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPeriodic() <em>Is Periodic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPeriodic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PERIODIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPeriodic() <em>Is Periodic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPeriodic()
	 * @generated
	 * @ordered
	 */
	protected boolean isPeriodic = IS_PERIODIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected ResourceService start;

	/**
	 * The cached value of the '{@link #getSet() <em>Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected ResourceService set;

	/**
	 * The cached value of the '{@link #getGet() <em>Get</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGet()
	 * @generated
	 * @ordered
	 */
	protected ResourceService get;

	/**
	 * The cached value of the '{@link #getReset() <em>Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReset()
	 * @generated
	 * @ordered
	 */
	protected ResourceService reset;

	/**
	 * The cached value of the '{@link #getPause() <em>Pause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPause()
	 * @generated
	 * @ordered
	 */
	protected ResourceService pause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.TIMER_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Duration newDuration) {
		Duration oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.TIMER_RESOURCE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPeriodic() {
		return isPeriodic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPeriodic(boolean newIsPeriodic) {
		boolean oldIsPeriodic = isPeriodic;
		isPeriodic = newIsPeriodic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.TIMER_RESOURCE__IS_PERIODIC, oldIsPeriodic, isPeriodic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceService getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (ResourceService)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrmPackage.TIMER_RESOURCE__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceService basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(ResourceService newStart) {
		ResourceService oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.TIMER_RESOURCE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceService getSet() {
		if (set != null && set.eIsProxy()) {
			InternalEObject oldSet = (InternalEObject)set;
			set = (ResourceService)eResolveProxy(oldSet);
			if (set != oldSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrmPackage.TIMER_RESOURCE__SET, oldSet, set));
			}
		}
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceService basicGetSet() {
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(ResourceService newSet) {
		ResourceService oldSet = set;
		set = newSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.TIMER_RESOURCE__SET, oldSet, set));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceService getGet() {
		if (get != null && get.eIsProxy()) {
			InternalEObject oldGet = (InternalEObject)get;
			get = (ResourceService)eResolveProxy(oldGet);
			if (get != oldGet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrmPackage.TIMER_RESOURCE__GET, oldGet, get));
			}
		}
		return get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceService basicGetGet() {
		return get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGet(ResourceService newGet) {
		ResourceService oldGet = get;
		get = newGet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.TIMER_RESOURCE__GET, oldGet, get));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceService getReset() {
		if (reset != null && reset.eIsProxy()) {
			InternalEObject oldReset = (InternalEObject)reset;
			reset = (ResourceService)eResolveProxy(oldReset);
			if (reset != oldReset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrmPackage.TIMER_RESOURCE__RESET, oldReset, reset));
			}
		}
		return reset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceService basicGetReset() {
		return reset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReset(ResourceService newReset) {
		ResourceService oldReset = reset;
		reset = newReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.TIMER_RESOURCE__RESET, oldReset, reset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceService getPause() {
		if (pause != null && pause.eIsProxy()) {
			InternalEObject oldPause = (InternalEObject)pause;
			pause = (ResourceService)eResolveProxy(oldPause);
			if (pause != oldPause) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrmPackage.TIMER_RESOURCE__PAUSE, oldPause, pause));
			}
		}
		return pause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceService basicGetPause() {
		return pause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPause(ResourceService newPause) {
		ResourceService oldPause = pause;
		pause = newPause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.TIMER_RESOURCE__PAUSE, oldPause, pause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrmPackage.TIMER_RESOURCE__DURATION:
				return getDuration();
			case GrmPackage.TIMER_RESOURCE__IS_PERIODIC:
				return isIsPeriodic();
			case GrmPackage.TIMER_RESOURCE__START:
				if (resolve) return getStart();
				return basicGetStart();
			case GrmPackage.TIMER_RESOURCE__SET:
				if (resolve) return getSet();
				return basicGetSet();
			case GrmPackage.TIMER_RESOURCE__GET:
				if (resolve) return getGet();
				return basicGetGet();
			case GrmPackage.TIMER_RESOURCE__RESET:
				if (resolve) return getReset();
				return basicGetReset();
			case GrmPackage.TIMER_RESOURCE__PAUSE:
				if (resolve) return getPause();
				return basicGetPause();
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
			case GrmPackage.TIMER_RESOURCE__DURATION:
				setDuration((Duration)newValue);
				return;
			case GrmPackage.TIMER_RESOURCE__IS_PERIODIC:
				setIsPeriodic((Boolean)newValue);
				return;
			case GrmPackage.TIMER_RESOURCE__START:
				setStart((ResourceService)newValue);
				return;
			case GrmPackage.TIMER_RESOURCE__SET:
				setSet((ResourceService)newValue);
				return;
			case GrmPackage.TIMER_RESOURCE__GET:
				setGet((ResourceService)newValue);
				return;
			case GrmPackage.TIMER_RESOURCE__RESET:
				setReset((ResourceService)newValue);
				return;
			case GrmPackage.TIMER_RESOURCE__PAUSE:
				setPause((ResourceService)newValue);
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
			case GrmPackage.TIMER_RESOURCE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case GrmPackage.TIMER_RESOURCE__IS_PERIODIC:
				setIsPeriodic(IS_PERIODIC_EDEFAULT);
				return;
			case GrmPackage.TIMER_RESOURCE__START:
				setStart((ResourceService)null);
				return;
			case GrmPackage.TIMER_RESOURCE__SET:
				setSet((ResourceService)null);
				return;
			case GrmPackage.TIMER_RESOURCE__GET:
				setGet((ResourceService)null);
				return;
			case GrmPackage.TIMER_RESOURCE__RESET:
				setReset((ResourceService)null);
				return;
			case GrmPackage.TIMER_RESOURCE__PAUSE:
				setPause((ResourceService)null);
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
			case GrmPackage.TIMER_RESOURCE__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case GrmPackage.TIMER_RESOURCE__IS_PERIODIC:
				return isPeriodic != IS_PERIODIC_EDEFAULT;
			case GrmPackage.TIMER_RESOURCE__START:
				return start != null;
			case GrmPackage.TIMER_RESOURCE__SET:
				return set != null;
			case GrmPackage.TIMER_RESOURCE__GET:
				return get != null;
			case GrmPackage.TIMER_RESOURCE__RESET:
				return reset != null;
			case GrmPackage.TIMER_RESOURCE__PAUSE:
				return pause != null;
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(", isPeriodic: ");
		result.append(isPeriodic);
		result.append(')');
		return result.toString();
	}

} //TimerResourceImpl
