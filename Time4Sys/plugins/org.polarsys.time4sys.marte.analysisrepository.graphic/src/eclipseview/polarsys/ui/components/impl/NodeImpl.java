/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Yassine OUHAMMOU- initial API and implementation
 *
 *******************************************************************************/
/**
 */
package eclipseview.polarsys.ui.components.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eclipseview.polarsys.ui.components.Color;
import eclipseview.polarsys.ui.components.GraphModelPackage;
import eclipseview.polarsys.ui.components.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclipseview.polarsys.ui.components.impl.NodeImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link eclipseview.polarsys.ui.components.impl.NodeImpl#getRefId <em>Ref Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends GraphComponentImpl implements Node {
	/**
	 * The default value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color TEXT_COLOR_EDEFAULT = Color.BLUE;
	/**
	 * The cached value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected Color textColor = TEXT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefId() <em>Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefId()
	 * @generated
	 * @ordered
	 */
	protected static final int REF_ID_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getRefId() <em>Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefId()
	 * @generated
	 * @ordered
	 */
	protected int refId = REF_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphModelPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getTextColor() {
		return textColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextColor(Color newTextColor) {
		Color oldTextColor = textColor;
		textColor = newTextColor == null ? TEXT_COLOR_EDEFAULT : newTextColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphModelPackage.NODE__TEXT_COLOR, oldTextColor, textColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRefId() {
		return refId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefId(int newRefId) {
		int oldRefId = refId;
		refId = newRefId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphModelPackage.NODE__REF_ID, oldRefId, refId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphModelPackage.NODE__TEXT_COLOR:
				return getTextColor();
			case GraphModelPackage.NODE__REF_ID:
				return getRefId();
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
			case GraphModelPackage.NODE__TEXT_COLOR:
				setTextColor((Color)newValue);
				return;
			case GraphModelPackage.NODE__REF_ID:
				setRefId((Integer)newValue);
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
			case GraphModelPackage.NODE__TEXT_COLOR:
				setTextColor(TEXT_COLOR_EDEFAULT);
				return;
			case GraphModelPackage.NODE__REF_ID:
				setRefId(REF_ID_EDEFAULT);
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
			case GraphModelPackage.NODE__TEXT_COLOR:
				return textColor != TEXT_COLOR_EDEFAULT;
			case GraphModelPackage.NODE__REF_ID:
				return refId != REF_ID_EDEFAULT;
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
		result.append(" (textColor: ");
		result.append(textColor);
		result.append(", refId: ");
		result.append(refId);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
