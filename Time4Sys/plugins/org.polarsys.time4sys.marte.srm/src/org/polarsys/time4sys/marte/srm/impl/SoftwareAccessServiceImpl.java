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
package org.polarsys.time4sys.marte.srm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.time4sys.marte.grm.impl.ResourceServiceImpl;
import org.polarsys.time4sys.marte.srm.SoftwareAccessService;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Access Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareAccessServiceImpl#isIsModifier <em>Is Modifier</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareAccessServiceImpl#getAccessedElement <em>Accessed Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareAccessServiceImpl extends ResourceServiceImpl implements SoftwareAccessService {
	/**
	 * The default value of the '{@link #isIsModifier() <em>Is Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsModifier()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MODIFIER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsModifier() <em>Is Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsModifier()
	 * @generated
	 * @ordered
	 */
	protected boolean isModifier = IS_MODIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessedElement() <em>Accessed Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessedElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESSED_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessedElement() <em>Accessed Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessedElement()
	 * @generated
	 * @ordered
	 */
	protected String accessedElement = ACCESSED_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareAccessServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.SOFTWARE_ACCESS_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsModifier() {
		return isModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsModifier(boolean newIsModifier) {
		boolean oldIsModifier = isModifier;
		isModifier = newIsModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_ACCESS_SERVICE__IS_MODIFIER, oldIsModifier, isModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessedElement() {
		return accessedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessedElement(String newAccessedElement) {
		String oldAccessedElement = accessedElement;
		accessedElement = newAccessedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_ACCESS_SERVICE__ACCESSED_ELEMENT, oldAccessedElement, accessedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SrmPackage.SOFTWARE_ACCESS_SERVICE__IS_MODIFIER:
				return isIsModifier();
			case SrmPackage.SOFTWARE_ACCESS_SERVICE__ACCESSED_ELEMENT:
				return getAccessedElement();
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
			case SrmPackage.SOFTWARE_ACCESS_SERVICE__IS_MODIFIER:
				setIsModifier((Boolean)newValue);
				return;
			case SrmPackage.SOFTWARE_ACCESS_SERVICE__ACCESSED_ELEMENT:
				setAccessedElement((String)newValue);
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
			case SrmPackage.SOFTWARE_ACCESS_SERVICE__IS_MODIFIER:
				setIsModifier(IS_MODIFIER_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_ACCESS_SERVICE__ACCESSED_ELEMENT:
				setAccessedElement(ACCESSED_ELEMENT_EDEFAULT);
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
			case SrmPackage.SOFTWARE_ACCESS_SERVICE__IS_MODIFIER:
				return isModifier != IS_MODIFIER_EDEFAULT;
			case SrmPackage.SOFTWARE_ACCESS_SERVICE__ACCESSED_ELEMENT:
				return ACCESSED_ELEMENT_EDEFAULT == null ? accessedElement != null : !ACCESSED_ELEMENT_EDEFAULT.equals(accessedElement);
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
		result.append(" (isModifier: ");
		result.append(isModifier);
		result.append(", accessedElement: ");
		result.append(accessedElement);
		result.append(')');
		return result.toString();
	}

} //SoftwareAccessServiceImpl
